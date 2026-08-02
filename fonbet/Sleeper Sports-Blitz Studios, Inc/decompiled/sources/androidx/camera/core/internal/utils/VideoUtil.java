package androidx.camera.core.internal.utils;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import androidx.camera.core.Logger;
import androidx.core.util.Preconditions;

/* loaded from: classes.dex */
public final class VideoUtil {
    private static final String TAG = "VideoUtil";

    private VideoUtil() {
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String getAbsolutePathFromUri(ContentResolver contentResolver, Uri uri) {
        Uri uri2;
        Throwable th;
        RuntimeException runtimeException;
        Cursor cursor;
        Cursor cursor2 = null;
        try {
            try {
                uri2 = uri;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (RuntimeException e) {
            e = e;
            uri2 = uri;
        }
        try {
            cursor2 = contentResolver.query(uri2, new String[]{"_data"}, null, null, null);
            cursor = (Cursor) Preconditions.checkNotNull(cursor2);
        } catch (RuntimeException e2) {
            e = e2;
            runtimeException = e;
            Logger.e(TAG, String.format("Failed in getting absolute path for Uri %s with Exception %s", uri2.toString(), runtimeException.toString()));
            if (cursor2 != null) {
                cursor2.close();
            }
            return "";
        }
        try {
            int columnIndexOrThrow = cursor.getColumnIndexOrThrow("_data");
            cursor.moveToFirst();
            String string = cursor.getString(columnIndexOrThrow);
            if (cursor != null) {
                cursor.close();
            }
            return string;
        } catch (RuntimeException e3) {
            runtimeException = e3;
            cursor2 = cursor;
            Logger.e(TAG, String.format("Failed in getting absolute path for Uri %s with Exception %s", uri2.toString(), runtimeException.toString()));
            if (cursor2 != null) {
            }
            return "";
        } catch (Throwable th3) {
            th = th3;
            cursor2 = cursor;
            if (cursor2 != null) {
                cursor2.close();
                throw th;
            }
            throw th;
        }
    }
}
