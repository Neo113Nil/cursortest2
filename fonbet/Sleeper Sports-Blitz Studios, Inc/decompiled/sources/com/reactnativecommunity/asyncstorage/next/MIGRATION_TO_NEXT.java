package com.reactnativecommunity.asyncstorage.next;

import android.util.Log;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: StorageSupplier.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/reactnativecommunity/asyncstorage/next/MIGRATION_TO_NEXT;", "Landroidx/room/migration/Migration;", "<init>", "()V", "migrate", "", "database", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "react-native-async-storage_async-storage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
final class MIGRATION_TO_NEXT extends Migration {
    public static final MIGRATION_TO_NEXT INSTANCE = new MIGRATION_TO_NEXT();

    private MIGRATION_TO_NEXT() {
        super(1, 2);
    }

    @Override // androidx.room.migration.Migration
    public void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("CREATE TABLE IF NOT EXISTS `Storage` (`key` TEXT NOT NULL, `value` TEXT, PRIMARY KEY(`key`));");
        database.execSQL("DELETE FROM catalystLocalStorage WHERE `key` IS NULL");
        database.execSQL(StringsKt.trimIndent("\n            INSERT INTO Storage (`key`, `value`)\n            SELECT `key`, `value`\n            FROM catalystLocalStorage;\n        "));
        Log.e("AsyncStorage_Next", "Migration to Next storage completed.");
    }
}
