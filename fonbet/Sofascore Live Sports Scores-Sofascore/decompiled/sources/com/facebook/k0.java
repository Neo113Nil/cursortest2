package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.ironsource.U3;
import defpackage.cw3;
import defpackage.lkh;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class k0 {
    public static final k0 a = new k0();
    public static final AtomicBoolean b = new AtomicBoolean(false);
    public static final AtomicBoolean c = new AtomicBoolean(false);
    public static final j0 d = new j0(true, "com.facebook.sdk.AutoInitEnabled");
    public static final j0 e = new j0(true, "com.facebook.sdk.AutoLogAppEventsEnabled");
    public static final j0 f = new j0(true, "com.facebook.sdk.AdvertiserIDCollectionEnabled");
    public static final j0 g = new j0(false, "auto_event_setup_enabled");
    public static final j0 h = new j0(true, "com.facebook.sdk.MonitorEnabled");
    public static SharedPreferences i;

    public static final boolean b() {
        if (cw3.a.contains(k0.class)) {
            return false;
        }
        try {
            a.e();
            return f.a();
        } catch (Throwable th) {
            cw3.a(k0.class, th);
            return false;
        }
    }

    public static final boolean c() {
        if (cw3.a.contains(k0.class)) {
            return false;
        }
        try {
            k0 k0Var = a;
            k0Var.e();
            return k0Var.a();
        } catch (Throwable th) {
            cw3.a(k0.class, th);
            return false;
        }
    }

    public static final Boolean i() {
        String str = "";
        if (!cw3.a.contains(k0.class)) {
            try {
                a.l();
                try {
                    SharedPreferences sharedPreferences = i;
                    if (sharedPreferences == null) {
                        Intrinsics.i("userSettingPref");
                        throw null;
                    }
                    String string = sharedPreferences.getString(e.b, "");
                    if (string != null) {
                        str = string;
                    }
                    if (str.length() > 0) {
                        return Boolean.valueOf(new JSONObject(str).getBoolean(U3.i.X));
                    }
                } catch (JSONException unused) {
                    w wVar = w.a;
                }
            } catch (Throwable th) {
                cw3.a(k0.class, th);
                return null;
            }
        }
        return null;
    }

    public static final void k() {
        if (cw3.a.contains(k0.class)) {
            return;
        }
        try {
            j0 j0Var = f;
            j0Var.c = Boolean.FALSE;
            j0Var.d = System.currentTimeMillis();
            boolean z = b.get();
            k0 k0Var = a;
            if (z) {
                k0Var.m(j0Var);
            } else {
                k0Var.e();
            }
        } catch (Throwable th) {
            cw3.a(k0.class, th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0044, code lost:
    
        if (r0 != null) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a() {
        Set set = cw3.a;
        if (set.contains(this)) {
            return false;
        }
        try {
            HashMap c2 = com.facebook.internal.x.c();
            if (c2 != null && !c2.isEmpty()) {
                Boolean bool = (Boolean) c2.get("auto_log_app_events_enabled");
                Boolean bool2 = (Boolean) c2.get("auto_log_app_events_default");
                if (bool != null) {
                    return bool.booleanValue();
                }
                Boolean bool3 = null;
                if (!set.contains(this)) {
                    try {
                        Boolean i2 = i();
                        if (i2 == null) {
                            i2 = f();
                        }
                        bool3 = i2;
                    } catch (Throwable th) {
                        cw3.a(this, th);
                    }
                }
                if (bool3 != null) {
                    return bool3.booleanValue();
                }
                if (bool2 != null) {
                    return bool2.booleanValue();
                }
                return true;
            }
            return e.a();
        } catch (Throwable th2) {
            cw3.a(this, th2);
            return false;
        }
    }

    public final void d() {
        if (cw3.a.contains(this)) {
            return;
        }
        try {
            j0 j0Var = g;
            j(j0Var);
            long currentTimeMillis = System.currentTimeMillis();
            if (j0Var.c == null || currentTimeMillis - j0Var.d >= 604800000) {
                j0Var.c = null;
                j0Var.d = 0L;
                int i2 = 1;
                if (c.compareAndSet(false, true)) {
                    w.c().execute(new lkh(currentTimeMillis, i2));
                }
            }
        } catch (Throwable th) {
            cw3.a(this, th);
        }
    }

    public final void e() {
        Set set = cw3.a;
        if (set.contains(this)) {
            return;
        }
        try {
            if (w.q.get()) {
                if (b.compareAndSet(false, true)) {
                    SharedPreferences sharedPreferences = w.a().getSharedPreferences("com.facebook.sdk.USER_SETTINGS", 0);
                    sharedPreferences.getClass();
                    i = sharedPreferences;
                    j0[] j0VarArr = {e, f, d};
                    if (!set.contains(this)) {
                        for (int i2 = 0; i2 < 3; i2++) {
                            try {
                                j0 j0Var = j0VarArr[i2];
                                if (j0Var == g) {
                                    d();
                                } else if (j0Var.c == null) {
                                    j(j0Var);
                                    if (j0Var.c == null) {
                                        g(j0Var);
                                    }
                                } else {
                                    m(j0Var);
                                }
                            } catch (Throwable th) {
                                cw3.a(this, th);
                            }
                        }
                    }
                    d();
                    if (!cw3.a.contains(this)) {
                        try {
                            Context a2 = w.a();
                            ApplicationInfo applicationInfo = a2.getPackageManager().getApplicationInfo(a2.getPackageName(), 128);
                            applicationInfo.getClass();
                            Bundle bundle = applicationInfo.metaData;
                            if (bundle != null) {
                                bundle.containsKey("com.facebook.sdk.AdvertiserIDCollectionEnabled");
                                b();
                            }
                        } catch (PackageManager.NameNotFoundException unused) {
                        } catch (Throwable th2) {
                            cw3.a(this, th2);
                        }
                    }
                    h();
                }
            }
        } catch (Throwable th3) {
            cw3.a(this, th3);
        }
    }

    public final Boolean f() {
        if (!cw3.a.contains(this)) {
            try {
                l();
                try {
                    Context a2 = w.a();
                    ApplicationInfo applicationInfo = a2.getPackageManager().getApplicationInfo(a2.getPackageName(), 128);
                    applicationInfo.getClass();
                    Bundle bundle = applicationInfo.metaData;
                    if (bundle != null) {
                        j0 j0Var = e;
                        if (bundle.containsKey(j0Var.b)) {
                            return Boolean.valueOf(applicationInfo.metaData.getBoolean(j0Var.b));
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    w wVar = w.a;
                }
            } catch (Throwable th) {
                cw3.a(this, th);
                return null;
            }
        }
        return null;
    }

    public final void g(j0 j0Var) {
        String str = j0Var.b;
        if (cw3.a.contains(this)) {
            return;
        }
        try {
            l();
            try {
                Context a2 = w.a();
                ApplicationInfo applicationInfo = a2.getPackageManager().getApplicationInfo(a2.getPackageName(), 128);
                applicationInfo.getClass();
                Bundle bundle = applicationInfo.metaData;
                if (bundle == null || !bundle.containsKey(str)) {
                    return;
                }
                j0Var.c = Boolean.valueOf(applicationInfo.metaData.getBoolean(str, j0Var.a));
            } catch (PackageManager.NameNotFoundException unused) {
                w wVar = w.a;
            }
        } catch (Throwable th) {
            cw3.a(this, th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00dc A[Catch: all -> 0x00ad, TryCatch #2 {all -> 0x00ad, blocks: (B:4:0x0010, B:9:0x001a, B:13:0x0024, B:17:0x0051, B:19:0x0057, B:21:0x005b, B:23:0x0066, B:25:0x007b, B:29:0x0092, B:33:0x00b1, B:38:0x00dc, B:41:0x00e4, B:48:0x00e8, B:49:0x00eb, B:51:0x00ed, B:52:0x00f0), top: B:3:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h() {
        int i2;
        int i3;
        Bundle bundle;
        ApplicationInfo applicationInfo;
        if (cw3.a.contains(this)) {
            return;
        }
        try {
            if (b.get() && w.q.get()) {
                Context a2 = w.a();
                int i4 = (d.a() ? 1 : 0) | ((e.a() ? 1 : 0) << 1) | ((f.a() ? 1 : 0) << 2) | ((h.a() ? 1 : 0) << 3);
                SharedPreferences sharedPreferences = i;
                if (sharedPreferences == null) {
                    Intrinsics.i("userSettingPref");
                    throw null;
                }
                int i5 = sharedPreferences.getInt("com.facebook.sdk.USER_SETTINGS_BITMASK", 0);
                if (i5 != i4) {
                    SharedPreferences sharedPreferences2 = i;
                    if (sharedPreferences2 == null) {
                        Intrinsics.i("userSettingPref");
                        throw null;
                    }
                    sharedPreferences2.edit().putInt("com.facebook.sdk.USER_SETTINGS_BITMASK", i4).apply();
                    try {
                        applicationInfo = a2.getPackageManager().getApplicationInfo(a2.getPackageName(), 128);
                        applicationInfo.getClass();
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                    if (applicationInfo.metaData != null) {
                        String[] strArr = {"com.facebook.sdk.AutoInitEnabled", "com.facebook.sdk.AutoLogAppEventsEnabled", "com.facebook.sdk.AdvertiserIDCollectionEnabled", "com.facebook.sdk.MonitorEnabled"};
                        boolean[] zArr = {true, true, true, true};
                        i2 = 0;
                        i3 = 0;
                        for (int i6 = 0; i6 < 4; i6++) {
                            try {
                                i3 |= (applicationInfo.metaData.containsKey(strArr[i6]) ? 1 : 0) << i6;
                                i2 |= (applicationInfo.metaData.getBoolean(strArr[i6], zArr[i6]) ? 1 : 0) << i6;
                            } catch (PackageManager.NameNotFoundException unused2) {
                            }
                        }
                        com.facebook.appevents.l lVar = new com.facebook.appevents.l(a2, (String) null);
                        bundle = new Bundle();
                        bundle.putInt("usage", i3);
                        bundle.putInt("initial", i2);
                        bundle.putInt("previous", i5);
                        bundle.putInt("current", i4);
                        if (!((bundle.getInt("previous") & 2) == 0)) {
                            w wVar = w.a;
                            if (!c()) {
                                return;
                            }
                        }
                        lVar.g(bundle, "fb_sdk_settings_changed");
                    }
                    i2 = 0;
                    i3 = 0;
                    com.facebook.appevents.l lVar2 = new com.facebook.appevents.l(a2, (String) null);
                    bundle = new Bundle();
                    bundle.putInt("usage", i3);
                    bundle.putInt("initial", i2);
                    bundle.putInt("previous", i5);
                    bundle.putInt("current", i4);
                    if (!((bundle.getInt("previous") & 2) == 0)) {
                    }
                    lVar2.g(bundle, "fb_sdk_settings_changed");
                }
            }
        } catch (Throwable th) {
            cw3.a(this, th);
        }
    }

    public final void j(j0 j0Var) {
        String str = "";
        if (cw3.a.contains(this)) {
            return;
        }
        try {
            l();
            try {
                SharedPreferences sharedPreferences = i;
                if (sharedPreferences == null) {
                    Intrinsics.i("userSettingPref");
                    throw null;
                }
                String string = sharedPreferences.getString(j0Var.b, "");
                if (string != null) {
                    str = string;
                }
                if (str.length() > 0) {
                    JSONObject jSONObject = new JSONObject(str);
                    j0Var.c = Boolean.valueOf(jSONObject.getBoolean(U3.i.X));
                    j0Var.d = jSONObject.getLong("last_timestamp");
                }
            } catch (JSONException unused) {
                w wVar = w.a;
            }
        } catch (Throwable th) {
            cw3.a(this, th);
        }
    }

    public final void l() {
        if (cw3.a.contains(this)) {
            return;
        }
        try {
            if (b.get()) {
            } else {
                throw new n("The UserSettingManager has not been initialized successfully");
            }
        } catch (Throwable th) {
            cw3.a(this, th);
        }
    }

    public final void m(j0 j0Var) {
        if (cw3.a.contains(this)) {
            return;
        }
        try {
            l();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(U3.i.X, j0Var.c);
                jSONObject.put("last_timestamp", j0Var.d);
                SharedPreferences sharedPreferences = i;
                if (sharedPreferences == null) {
                    Intrinsics.i("userSettingPref");
                    throw null;
                }
                sharedPreferences.edit().putString(j0Var.b, jSONObject.toString()).apply();
                h();
            } catch (Exception unused) {
                w wVar = w.a;
            }
        } catch (Throwable th) {
            cw3.a(this, th);
        }
    }
}
