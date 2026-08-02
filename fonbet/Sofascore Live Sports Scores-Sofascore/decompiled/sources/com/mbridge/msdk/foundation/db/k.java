package com.mbridge.msdk.foundation.db;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class k extends a {
    private static String a = "ReplaceTempDao";
    private static k b;

    private k(f fVar) {
        super(fVar);
    }

    public void a(String str, JSONObject jSONObject) {
        try {
            if (getWritableDatabase() == null) {
                return;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("d_key", str);
            contentValues.put("d_value", jSONObject.toString());
            contentValues.put("time", Long.valueOf(System.currentTimeMillis()));
            if (!a(str)) {
                getWritableDatabase().insert("c_replace_temp", null, contentValues);
            } else {
                getWritableDatabase().update("c_replace_temp", contentValues, "d_key = ? ", new String[]{str});
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0058, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004c, code lost:
    
        if (r2 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0056, code lost:
    
        if (r2 != null) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public JSONObject b(String str) {
        JSONObject jSONObject = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Cursor rawQuery = getReadableDatabase().rawQuery("SELECT * FROM c_replace_temp WHERE d_key = ? ", new String[]{str});
        if (rawQuery != null) {
            try {
                if (rawQuery.getCount() > 0) {
                    jSONObject = new JSONObject();
                    while (rawQuery.moveToNext()) {
                        jSONObject = new JSONObject(rawQuery.getString(rawQuery.getColumnIndex("d_value")));
                    }
                }
            } catch (Throwable th) {
                try {
                    q0.b(a, th.getMessage());
                } catch (Throwable th2) {
                    if (rawQuery != null) {
                        try {
                            rawQuery.close();
                        } catch (Exception unused) {
                        }
                    }
                    throw th2;
                }
            }
        }
        if (rawQuery != null) {
            try {
                rawQuery.close();
            } catch (Exception unused2) {
            }
        }
        return jSONObject;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0057, code lost:
    
        if (r5 == null) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public JSONObject d() {
        JSONObject jSONObject;
        a(7);
        JSONObject jSONObject2 = null;
        Cursor rawQuery = getReadableDatabase().rawQuery("SELECT * FROM c_replace_temp", null);
        if (rawQuery != null) {
            try {
            } catch (Throwable th) {
                JSONObject jSONObject3 = jSONObject2;
                th = th;
                jSONObject = jSONObject3;
            }
            if (rawQuery.getCount() > 0) {
                jSONObject = new JSONObject();
                while (rawQuery.moveToNext()) {
                    try {
                        jSONObject.put(rawQuery.getString(rawQuery.getColumnIndex("d_key")), new JSONObject(rawQuery.getString(rawQuery.getColumnIndex("d_value"))));
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            q0.b(a, th.getMessage());
                        } catch (Throwable th3) {
                            if (rawQuery != null) {
                                try {
                                    rawQuery.close();
                                } catch (Exception unused) {
                                }
                            }
                            throw th3;
                        }
                    }
                }
                jSONObject2 = jSONObject;
                if (rawQuery != null) {
                    return jSONObject2;
                }
                jSONObject = jSONObject2;
                try {
                    rawQuery.close();
                } catch (Exception unused2) {
                }
                return jSONObject;
            }
        }
        if (rawQuery != null) {
            rawQuery.close();
        }
        if (rawQuery != null) {
        }
    }

    public static k a(f fVar) {
        k kVar;
        k kVar2 = b;
        if (kVar2 != null) {
            return kVar2;
        }
        synchronized (e.class) {
            try {
                kVar = b;
                if (kVar == null) {
                    kVar = new k(fVar);
                    b = kVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return kVar;
    }

    public boolean a(String str) {
        Cursor rawQuery = getReadableDatabase().rawQuery("SELECT d_value FROM c_replace_temp WHERE d_key= ? ", new String[]{str});
        if (rawQuery != null && rawQuery.getCount() > 0) {
            try {
                rawQuery.close();
                return true;
            } catch (Exception unused) {
                return true;
            }
        }
        if (rawQuery == null) {
            return false;
        }
        try {
            rawQuery.close();
            return false;
        } catch (Exception unused2) {
            return false;
        }
    }

    public void a(int i) {
        long currentTimeMillis = System.currentTimeMillis() - (i * 86400000);
        try {
            if (getWritableDatabase() == null) {
                return;
            }
            getWritableDatabase().delete("c_replace_temp", "time<?", new String[]{String.valueOf(currentTimeMillis)});
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
