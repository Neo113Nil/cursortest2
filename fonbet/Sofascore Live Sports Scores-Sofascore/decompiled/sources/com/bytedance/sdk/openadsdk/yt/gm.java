package com.bytedance.sdk.openadsdk.yt;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.yt.sf;
import java.util.Iterator;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class gm {
    private final String gm;
    private SharedPreferences pcc;
    private final Context sf;

    public gm(Context context, String str) {
        this.sf = context;
        this.gm = str;
    }

    public void pcc(JSONObject jSONObject) {
        try {
            SharedPreferences pcc = pcc();
            if (pcc != null) {
                SharedPreferences.Editor edit = pcc.edit();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    try {
                        if (!TextUtils.isEmpty(next)) {
                            Object obj = jSONObject.get(next);
                            if (obj instanceof Integer) {
                                edit.putInt(next, ((Integer) obj).intValue());
                            } else if (obj instanceof Long) {
                                edit.putLong(next, ((Long) obj).longValue());
                            } else if (obj instanceof String) {
                                edit.putString(next, (String) obj);
                            } else if (obj instanceof Boolean) {
                                edit.putBoolean(next, ((Boolean) obj).booleanValue());
                            } else if (obj instanceof Float) {
                                edit.putFloat(next, ((Float) obj).floatValue());
                            } else if (obj instanceof Double) {
                                edit.putFloat(next, ((Double) obj).floatValue());
                            } else {
                                edit.putString(next, String.valueOf(obj));
                            }
                        }
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                }
                edit.apply();
            }
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    public long sf(String str, long j) {
        try {
            SharedPreferences pcc = pcc();
            if (pcc != null && pcc.contains(str)) {
                return pcc.getLong(str, j);
            }
            return j;
        } catch (Throwable th) {
            th.getMessage();
            return j;
        }
    }

    public void sf() {
        SharedPreferences pcc = pcc();
        if (pcc != null) {
            SharedPreferences.Editor edit = pcc.edit();
            edit.clear();
            edit.commit();
        }
    }

    public SharedPreferences pcc() {
        Context context;
        SharedPreferences sharedPreferences = this.pcc;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        if (TextUtils.isEmpty(this.gm) || (context = this.sf) == null) {
            return null;
        }
        try {
            this.pcc = context.getSharedPreferences(this.gm, 0);
        } catch (Throwable th) {
            th.getMessage();
        }
        return this.pcc;
    }

    public void pcc(String str, long j) {
        try {
            SharedPreferences pcc = pcc();
            if (pcc != null) {
                SharedPreferences.Editor edit = pcc.edit();
                edit.putLong(str, j);
                edit.apply();
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public int pcc(String str, int i) {
        try {
            SharedPreferences pcc = pcc();
            if (pcc != null && pcc.contains(str)) {
                return pcc.getInt(str, i);
            }
            return i;
        } catch (Throwable th) {
            th.getMessage();
            return i;
        }
    }

    public String pcc(String str, String str2) {
        try {
            SharedPreferences pcc = pcc();
            if (pcc != null && pcc.contains(str)) {
                return pcc.getString(str, str2);
            }
            return str2;
        } catch (Throwable th) {
            th.getMessage();
            return str2;
        }
    }

    public boolean pcc(String str, boolean z) {
        try {
            SharedPreferences pcc = pcc();
            if (pcc != null && pcc.contains(str)) {
                return pcc.getBoolean(str, z);
            }
            return z;
        } catch (Throwable th) {
            th.getMessage();
            return z;
        }
    }

    public <T> T pcc(String str, T t, sf.pcc<T> pccVar) {
        String string;
        if (str != null && !str.isEmpty()) {
            try {
                SharedPreferences pcc = pcc();
                if (pcc != null && pcc.contains(str) && (string = pcc.getString(str, null)) != null && pccVar != null) {
                    T sf = pccVar.sf(string);
                    if (sf != null) {
                        return sf;
                    }
                }
            } catch (Throwable th) {
                th.getMessage();
            }
        }
        return t;
    }
}
