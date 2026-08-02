package io.appmetrica.analytics.coreutils.internal.db;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreutils.internal.io.CloseableUtilsKt;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class DBUtils {
    public static void cursorRowToContentValues(Cursor cursor, ContentValues contentValues) {
        try {
            enhancedCursorRowToContentValues(cursor, contentValues);
        } catch (Throwable unused) {
        }
    }

    public static void enhancedCursorRowToContentValues(Cursor cursor, ContentValues contentValues) {
        String[] columnNames = cursor.getColumnNames();
        int length = columnNames.length;
        for (int i5 = 0; i5 < length; i5++) {
            int type = cursor.getType(i5);
            if (type == 0) {
                contentValues.put(columnNames[i5], cursor.getString(i5));
            } else if (type == 1) {
                contentValues.put(columnNames[i5], Long.valueOf(cursor.getLong(i5)));
            } else if (type == 2) {
                contentValues.put(columnNames[i5], Double.valueOf(cursor.getDouble(i5)));
            } else if (type == 3) {
                contentValues.put(columnNames[i5], cursor.getString(i5));
            } else if (type != 4) {
                contentValues.put(columnNames[i5], cursor.getString(i5));
            } else {
                contentValues.put(columnNames[i5], cursor.getBlob(i5));
            }
        }
    }

    public static long queryRowsCount(SQLiteDatabase sQLiteDatabase, String str) {
        Cursor cursor = null;
        try {
            cursor = sQLiteDatabase.rawQuery("SELECT count() FROM " + str, null);
            return cursor.moveToFirst() ? cursor.getLong(0) : 0L;
        } finally {
            CloseableUtilsKt.closeSafely(cursor);
        }
    }
}
