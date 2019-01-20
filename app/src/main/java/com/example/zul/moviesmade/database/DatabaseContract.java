package com.example.zul.moviesmade.database;

import android.provider.BaseColumns;

public class DatabaseContract implements BaseColumns {

    public static final String TABLE_FAVORITE = "table_favorite";

    static final String COLUMN_PRIMARY_KEY = "column_primary_key";
    public static final String COLUMN_ID = "column_id";
    public static final String COLUMN_TITLE = "column_title";
    public static final String COLUMN_VOTE_AVERAGE = "column_vote_average";
    public static final String COLUMN_RELEASE_DATE = "column_release_date";
    public static final String COLUMN_OVERVIEW = "column_overview";
    public static final String COLUMN_POPULAR = "column_popular";
    public static final String COLUMN_VOTE_COUNT = "column_vote_count";
    public static final String COLUMN_POSTER_PATH = "column_poster_path";
    public static final String COLUMN_BACKDROP_PATH = "column_backdrop_path";

}
