package com.bytedance.sdk.openadsdk.gpj.sf;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.wh;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc {
    private static final ConcurrentHashMap<String, Object> pcc = new ConcurrentHashMap<>();

    public static Map<String, List<String>> pcc(Cursor cursor) {
        HashMap hashMap = new HashMap();
        if (cursor != null) {
            try {
                String[] columnNames = cursor.getColumnNames();
                while (cursor.getCount() > 0 && cursor.moveToNext()) {
                    for (String str : columnNames) {
                        if (!hashMap.containsKey(str)) {
                            hashMap.put(str, new LinkedList());
                        }
                        ((List) hashMap.get(str)).add(cursor.getString(cursor.getColumnIndex(str)));
                    }
                }
                cursor.close();
                return hashMap;
            } catch (Throwable unused) {
                cursor.close();
            }
        }
        return hashMap;
    }

    public static int pcc(Context context, String str, String str2, String[] strArr) {
        int pcc2;
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        synchronized (pcc(str)) {
            try {
                pcc2 = wh.pcc(context).pcc().pcc(str, str2, strArr);
            } catch (Throwable unused) {
                return 0;
            }
        }
        return pcc2;
    }

    public static int pcc(Context context, String str, ContentValues contentValues, String str2, String[] strArr) {
        int pcc2;
        if (contentValues != null && !TextUtils.isEmpty(str)) {
            synchronized (pcc(str)) {
                try {
                    pcc2 = wh.pcc(context).pcc().pcc(str, contentValues, str2, strArr);
                } catch (Throwable unused) {
                }
            }
            return pcc2;
        }
        return 0;
    }

    public static Map<String, List<String>> pcc(Context context, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
        Map<String, List<String>> pcc2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (pcc(str)) {
            try {
                pcc2 = pcc(wh.pcc(context).pcc().pcc(str, strArr, str2, strArr2, str3, str4, str5));
            } catch (Throwable unused) {
                return null;
            }
        }
        return pcc2;
    }

    public static void pcc(Context context, String str, ContentValues contentValues) {
        if (contentValues == null || TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (pcc(str)) {
            try {
                wh.pcc(context).pcc().pcc(str, (String) null, contentValues);
            } catch (Throwable unused) {
            }
        }
    }

    private static Object pcc(String str) {
        Object obj;
        ConcurrentHashMap<String, Object> concurrentHashMap = pcc;
        Object obj2 = concurrentHashMap.get(str);
        if (obj2 != null) {
            return obj2;
        }
        synchronized (pcc.class) {
            try {
                obj = concurrentHashMap.get(str);
                if (obj == null) {
                    obj = new Object();
                    concurrentHashMap.put(str, obj);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
