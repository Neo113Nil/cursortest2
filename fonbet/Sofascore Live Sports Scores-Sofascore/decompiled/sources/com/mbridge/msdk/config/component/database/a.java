package com.mbridge.msdk.config.component.database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class a {
    private static a b;
    private final b a;

    private a(Context context) {
        this.a = new b(context);
    }

    public Map<String, Object> a(String str) {
        HashMap hashMap = new HashMap();
        if (TextUtils.isEmpty(str)) {
            hashMap.put(com.mbridge.msdk.config.component.common.util.c.c("code"), 2);
            hashMap.put(com.mbridge.msdk.config.component.common.util.c.c("reason"), "SQL is null");
            return hashMap;
        }
        try {
            b(str);
            if (str.contains(c.TABLE_FILE_DB)) {
                new com.mbridge.msdk.config.component.database.file.a().a(str);
            }
            hashMap.put(com.mbridge.msdk.config.component.common.util.c.c("code"), 1);
            return hashMap;
        } catch (Throwable th) {
            q0.b("ComponentDatabase", th.getMessage());
            hashMap.put(com.mbridge.msdk.config.component.common.util.c.c("code"), 2);
            hashMap.put(com.mbridge.msdk.config.component.common.util.c.c("reason"), th.getMessage());
            return hashMap;
        }
    }

    public Map<String, Object> b(String str) {
        HashMap hashMap = new HashMap();
        if (TextUtils.isEmpty(str)) {
            hashMap.put(com.mbridge.msdk.config.component.common.util.c.c("code"), 2);
            hashMap.put(com.mbridge.msdk.config.component.common.util.c.c("reason"), "SQL is null");
            return hashMap;
        }
        try {
            a(true).execSQL(str);
            hashMap.put(com.mbridge.msdk.config.component.common.util.c.c("code"), 1);
            return hashMap;
        } catch (Throwable th) {
            q0.b("ComponentDatabase", th.getMessage());
            hashMap.put(com.mbridge.msdk.config.component.common.util.c.c("code"), 2);
            hashMap.put(com.mbridge.msdk.config.component.common.util.c.c("reason"), th.getMessage());
            return hashMap;
        }
    }

    public Map<String, Object> c(String str) {
        HashMap hashMap = new HashMap();
        if (TextUtils.isEmpty(str)) {
            hashMap.put(com.mbridge.msdk.config.component.common.util.c.c("code"), 2);
            hashMap.put(com.mbridge.msdk.config.component.common.util.c.c("reason"), "SQL is null");
            return hashMap;
        }
        try {
            return b(str);
        } catch (Throwable th) {
            q0.b("ComponentDatabase", th.getMessage());
            hashMap.put(com.mbridge.msdk.config.component.common.util.c.c("code"), 2);
            hashMap.put(com.mbridge.msdk.config.component.common.util.c.c("reason"), th.getMessage());
            return hashMap;
        }
    }

    public Map<String, Object> d(String str) {
        int i = 2;
        HashMap hashMap = new HashMap();
        if (TextUtils.isEmpty(str)) {
            hashMap.put(com.mbridge.msdk.config.component.common.util.c.c("code"), 2);
            hashMap.put(com.mbridge.msdk.config.component.common.util.c.c("reason"), "SQL is null");
            return hashMap;
        }
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        try {
            Cursor rawQuery = a(false).rawQuery(str, null);
            if (rawQuery != null) {
                try {
                    if (rawQuery.getCount() > 0) {
                        String[] columnNames = rawQuery.getColumnNames();
                        while (rawQuery.moveToNext()) {
                            HashMap hashMap2 = new HashMap();
                            int length = columnNames.length;
                            int i3 = i2;
                            while (i3 < length) {
                                String str2 = columnNames[i3];
                                int columnIndex = rawQuery.getColumnIndex(str2);
                                if (columnIndex != -1) {
                                    int type = rawQuery.getType(columnIndex);
                                    if (type == 0) {
                                        hashMap2.put(str2, null);
                                    } else if (type == 1) {
                                        hashMap2.put(str2, String.valueOf(rawQuery.getLong(columnIndex)));
                                    } else if (type == i) {
                                        hashMap2.put(str2, String.valueOf(rawQuery.getFloat(columnIndex)));
                                    } else if (type == 3) {
                                        hashMap2.put(str2, rawQuery.getString(columnIndex));
                                    } else if (type == 4) {
                                        hashMap2.put(str2, new String(rawQuery.getBlob(columnIndex)));
                                    }
                                }
                                i3++;
                                i = 2;
                            }
                            arrayList.add(hashMap2);
                            i = 2;
                            i2 = 0;
                        }
                    }
                } finally {
                }
            }
            hashMap.put(com.mbridge.msdk.config.component.common.util.c.c("code"), 1);
            hashMap.put(com.mbridge.msdk.config.component.common.util.c.c("data"), arrayList);
            if (rawQuery == null) {
                return hashMap;
            }
            rawQuery.close();
            return hashMap;
        } catch (Throwable th) {
            q0.b("ComponentDatabase", th.getMessage());
            hashMap.put(com.mbridge.msdk.config.component.common.util.c.c("code"), 2);
            hashMap.put(com.mbridge.msdk.config.component.common.util.c.c("reason"), th.getMessage());
            return hashMap;
        }
    }

    public SQLiteDatabase a(boolean z) {
        b bVar = this.a;
        try {
            return z ? bVar.getWritableDatabase() : bVar.getReadableDatabase();
        } catch (Throwable th) {
            q0.b("ComponentDatabase", th.getMessage());
            return null;
        }
    }

    public static synchronized a a() {
        a aVar;
        synchronized (a.class) {
            aVar = b;
            if (aVar == null) {
                aVar = new a(com.mbridge.msdk.foundation.controller.c.n().d());
                b = aVar;
            }
        }
        return aVar;
    }
}
