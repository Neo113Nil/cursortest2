package androidx.room.migration;

import androidx.sqlite.db.SupportSQLiteDatabase;

/* loaded from: classes6.dex */
public interface AutoMigrationSpec {
    default void onPostMigrate(SupportSQLiteDatabase supportSQLiteDatabase) {
    }
}
