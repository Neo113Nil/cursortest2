package com.bykv.vk.openvk.preload.geckox.utils;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import java.io.Closeable;
import java.io.IOException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class CloseableUtils {
    public static boolean close(Closeable closeable) {
        if (closeable == null) {
            return true;
        }
        try {
            closeable.close();
            return true;
        } catch (IOException e) {
            GeckoLogger.e("gecko-debug-tag", "close:", e);
            return false;
        }
    }

    public static boolean close(Cursor cursor) {
        if (cursor == null) {
            return true;
        }
        try {
            cursor.close();
            return true;
        } catch (Exception e) {
            GeckoLogger.e("gecko-debug-tag", "close:", e);
            return false;
        }
    }

    public static boolean close(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase == null) {
            return true;
        }
        try {
            sQLiteDatabase.close();
            return true;
        } catch (Exception e) {
            GeckoLogger.e("gecko-debug-tag", "close:", e);
            return false;
        }
    }
}
