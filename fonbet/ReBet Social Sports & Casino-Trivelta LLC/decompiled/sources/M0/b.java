package M0;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import androidx.core.content.res.e;

/* loaded from: classes.dex */
public abstract class b {
    public static void a(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                e.a(autoCloseable);
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }

    public static boolean b(Context context, Uri uri) {
        Cursor cursor = null;
        try {
            try {
                cursor = context.getContentResolver().query(uri, new String[]{"document_id"}, null, null, null);
                return cursor.getCount() > 0;
            } catch (Exception e10) {
                Log.w("DocumentFile", "Failed query: " + e10);
                a(cursor);
                return false;
            }
        } finally {
            a(cursor);
        }
    }

    public static String c(Context context, Uri uri) {
        return g(context, uri, "mime_type", null);
    }

    public static boolean d(Context context, Uri uri) {
        return "vnd.android.document/directory".equals(c(context, uri));
    }

    public static long e(Context context, Uri uri) {
        return f(context, uri, "_size", 0L);
    }

    public static long f(Context context, Uri uri, String str, long j10) {
        ContentResolver contentResolver = context.getContentResolver();
        Cursor cursor = null;
        try {
            try {
                cursor = contentResolver.query(uri, new String[]{str}, null, null, null);
                if (!cursor.moveToFirst() || cursor.isNull(0)) {
                    a(cursor);
                    return j10;
                }
                long j11 = cursor.getLong(0);
                a(cursor);
                return j11;
            } catch (Exception e10) {
                Log.w("DocumentFile", "Failed query: " + e10);
                a(cursor);
                return j10;
            }
        } catch (Throwable th2) {
            a(cursor);
            throw th2;
        }
    }

    public static String g(Context context, Uri uri, String str, String str2) {
        ContentResolver contentResolver = context.getContentResolver();
        Cursor cursor = null;
        try {
            try {
                cursor = contentResolver.query(uri, new String[]{str}, null, null, null);
                if (!cursor.moveToFirst() || cursor.isNull(0)) {
                    a(cursor);
                    return str2;
                }
                String string = cursor.getString(0);
                a(cursor);
                return string;
            } catch (Exception e10) {
                Log.w("DocumentFile", "Failed query: " + e10);
                a(cursor);
                return str2;
            }
        } catch (Throwable th2) {
            a(cursor);
            throw th2;
        }
    }
}
