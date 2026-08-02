package com.applovin.impl;

import android.content.Context;
import android.content.SharedPreferences;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class a5 {
    protected final com.applovin.impl.sdk.l a;
    protected final Context b;
    protected final SharedPreferences c;
    private final Map d = new HashMap();
    private final Object e = new Object();

    public a5(com.applovin.impl.sdk.l lVar) {
        this.a = lVar;
        Context p = com.applovin.impl.sdk.l.p();
        this.b = p;
        this.c = p.getSharedPreferences("com.applovin.sdk.1", 0);
        try {
            Class.forName(z4.class.getName());
            Class.forName(t3.class.getName());
        } catch (Throwable unused) {
        }
        d();
    }

    private void d() {
        String b = ((Boolean) c5.a(b5.j, Boolean.FALSE, com.applovin.impl.sdk.l.p())).booleanValue() ? "" : b();
        synchronized (this.e) {
            for (z4 z4Var : z4.c()) {
                try {
                    Object a = this.a.a(b + z4Var.b(), null, z4Var.a().getClass(), this.c);
                    if (a != null) {
                        this.d.put(z4Var.b(), a);
                    }
                } catch (Throwable th) {
                    com.applovin.impl.sdk.p.c("SettingsManager", "Unable to load \"" + z4Var.b() + "\"", th);
                    this.a.E().a("SettingsManager", "initSettings", th);
                }
            }
        }
    }

    public Object a(z4 z4Var) {
        if (z4Var == null) {
            throw new IllegalArgumentException("No setting type specified");
        }
        synchronized (this.e) {
            Object obj = this.d.get(z4Var.b());
            if (obj == null) {
                return z4Var.a();
            }
            return z4Var.a(obj);
        }
    }

    public List b(z4 z4Var) {
        ArrayList arrayList = new ArrayList(6);
        Iterator it = c(z4Var).iterator();
        while (it.hasNext()) {
            arrayList.add(MaxAdFormat.formatFromString((String) it.next()));
        }
        return arrayList;
    }

    public List c(z4 z4Var) {
        return CollectionUtils.explode((String) a(z4Var));
    }

    public void e() {
        Boolean bool = (Boolean) c5.a(b5.j, Boolean.FALSE, com.applovin.impl.sdk.l.p());
        String b = b();
        synchronized (this.e) {
            SharedPreferences.Editor edit = this.c.edit();
            for (z4 z4Var : z4.c()) {
                Object obj = this.d.get(z4Var.b());
                if (obj != null) {
                    String b2 = z4Var.b();
                    this.a.a(b + z4Var.b(), obj, edit);
                    if (bool.booleanValue()) {
                        this.a.a(b2, obj, edit);
                    }
                }
            }
            if (((Boolean) this.a.a(z4.J6)).booleanValue()) {
                c5.a(edit);
            } else {
                edit.apply();
            }
        }
    }

    public boolean c() {
        return this.a.p0().isVerboseLoggingEnabled() || ((Boolean) a(z4.k)).booleanValue();
    }

    private String b() {
        return "com.applovin.sdk." + q7.f(this.a.k0()) + ".";
    }

    public void a(z4 z4Var, Object obj) {
        if (z4Var == null) {
            throw new IllegalArgumentException("No setting type specified");
        }
        if (obj != null) {
            synchronized (this.e) {
                this.d.put(z4Var.b(), obj);
            }
            return;
        }
        throw new IllegalArgumentException("No new value specified");
    }

    public void a(JSONObject jSONObject) {
        synchronized (this.e) {
            boolean booleanValue = JsonUtils.getBoolean(jSONObject, z4.u.b(), Boolean.FALSE).booleanValue();
            HashMap hashMap = booleanValue ? new HashMap() : null;
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (next != null && next.length() > 0) {
                    try {
                        z4 a = z4.a(next);
                        if (a != null) {
                            Object a2 = booleanValue ? a(a) : null;
                            Object a3 = a(next, jSONObject, a.a());
                            this.d.put(a.b(), a3);
                            if (a == z4.M5) {
                                this.d.put(z4.N5.b(), Long.valueOf(System.currentTimeMillis()));
                            }
                            if (booleanValue && !a3.equals(a2)) {
                                hashMap.put(a, a2);
                            }
                        }
                    } catch (JSONException e) {
                        com.applovin.impl.sdk.p.c("SettingsManager", "Unable to parse JSON settingsValues array", e);
                        this.a.E().a("SettingsManager", "loadSettingsException", e);
                    } catch (Throwable th) {
                        com.applovin.impl.sdk.p.c("SettingsManager", "Unable to convert setting object ", th);
                        this.a.E().a("SettingsManager", "loadSettingsThrowable", th);
                    }
                }
            }
            if (booleanValue && hashMap.size() > 0) {
                x2 x2Var = new x2();
                x2Var.a("========== UPDATED SETTINGS ==========");
                for (z4 z4Var : hashMap.keySet()) {
                    x2Var.a(z4Var.b(), a(z4Var) + " (" + hashMap.get(z4Var) + ")");
                }
                x2Var.a("========== END ==========");
                this.a.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    this.a.Q().a("SettingsManager", x2Var.toString());
                }
            }
            c5.b(b5.j, (Boolean) a(z4.X6), com.applovin.impl.sdk.l.p());
        }
    }

    public void a() {
        synchronized (this.e) {
            this.d.clear();
        }
        this.a.a(this.c);
    }

    private static Object a(String str, JSONObject jSONObject, Object obj) {
        if (obj instanceof Boolean) {
            return Boolean.valueOf(jSONObject.getBoolean(str));
        }
        if (obj instanceof Float) {
            return Float.valueOf((float) jSONObject.getDouble(str));
        }
        if (obj instanceof Double) {
            return Double.valueOf(jSONObject.getDouble(str));
        }
        if (obj instanceof Integer) {
            return Integer.valueOf(jSONObject.getInt(str));
        }
        if (obj instanceof Long) {
            return Long.valueOf(jSONObject.getLong(str));
        }
        if (obj instanceof String) {
            return jSONObject.getString(str);
        }
        throw new RuntimeException("SDK Error: unknown value type: " + obj.getClass());
    }
}
