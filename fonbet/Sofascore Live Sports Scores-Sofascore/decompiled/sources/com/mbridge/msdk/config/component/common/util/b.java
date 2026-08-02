package com.mbridge.msdk.config.component.common.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import defpackage.a70;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class b {
    private static b c;
    private SharedPreferences a;
    private final Map<String, Object> b = new ConcurrentHashMap();

    private b(Context context, String str) {
        if (context != null) {
            this.a = context.getSharedPreferences(TextUtils.isEmpty(str) ? "mbridge_component_sp" : str, 0);
        } else {
            a70.p("Context cannot be null");
            throw null;
        }
    }

    public int a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        Object a = a(str);
        if (a instanceof Integer) {
            return ((Integer) a).intValue();
        }
        int i2 = this.a.getInt(str, i);
        a(str, Integer.valueOf(i2));
        return i2;
    }

    public void b(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        SharedPreferences.Editor edit = this.a.edit();
        edit.putInt(str, i);
        edit.apply();
        a(str, Integer.valueOf(i));
    }

    public void b(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        SharedPreferences.Editor edit = this.a.edit();
        edit.putString(str, str2);
        edit.apply();
        a(str, (Object) str2);
    }

    public String a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        Object a = a(str);
        if (a instanceof String) {
            return (String) a;
        }
        String string = this.a.getString(str, str2);
        a(str, (Object) string);
        return string;
    }

    public static b a(Context context) {
        b bVar;
        b bVar2 = c;
        if (bVar2 != null) {
            return bVar2;
        }
        synchronized (b.class) {
            try {
                bVar = c;
                if (bVar == null) {
                    bVar = new b(context, "mbridge_component_sp");
                    c = bVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    public long a(String str, long j) {
        if (TextUtils.isEmpty(str)) {
            return j;
        }
        Object a = a(str);
        if (a instanceof Long) {
            return ((Long) a).longValue();
        }
        long j2 = this.a.getLong(str, j);
        a(str, Long.valueOf(j2));
        return j2;
    }

    public float a(String str, float f) {
        if (TextUtils.isEmpty(str)) {
            return f;
        }
        Object a = a(str);
        if (a instanceof Float) {
            return ((Float) a).floatValue();
        }
        float f2 = this.a.getFloat(str, f);
        a(str, Float.valueOf(f2));
        return f2;
    }

    public boolean a(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return z;
        }
        Object a = a(str);
        if (a instanceof Boolean) {
            return ((Boolean) a).booleanValue();
        }
        boolean z2 = this.a.getBoolean(str, z);
        a(str, Boolean.valueOf(z2));
        return z2;
    }

    private Object a(String str) {
        return this.b.get(str);
    }

    private void a(String str, Object obj) {
        if (TextUtils.isEmpty(str) || obj == null) {
            return;
        }
        this.b.put(str, obj);
    }
}
