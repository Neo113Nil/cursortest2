package com.my.tracker.obfuscated;

import android.content.Context;
import android.content.SharedPreferences;
import com.ironsource.Y3;
import com.vk.core.preference.Preference;

/* loaded from: classes.dex */
public final class p1 {
    private static volatile p1 b;
    private final SharedPreferences a;

    private p1(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    public static p1 a(Context context) {
        p1 p1Var;
        p1 p1Var2 = b;
        if (p1Var2 != null) {
            return p1Var2;
        }
        synchronized (p1.class) {
            try {
                p1Var = b;
                if (p1Var == null) {
                    p1Var = new p1(Preference.h(context, 0, "mytracker_prefs"));
                    b = p1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return p1Var;
    }

    public void b(long j) {
        a("installTimestamp", j);
    }

    public String c() {
        return c("appId");
    }

    public void d(String str) {
        a("appVersion", str);
    }

    public void e(String str) {
        a("appId", str);
    }

    public String f() {
        return c("appVersionName");
    }

    public void g(String str) {
        a("appVersionName", str);
    }

    public void h(String str) {
        a("appsHash", str);
    }

    public void i(String str) {
        a(Y3.c, str);
    }

    public long j() {
        return b("installTimestamp");
    }

    public String k() {
        return c("instanceId");
    }

    public void l(String str) {
        a("referrer", str);
    }

    public String m() {
        return c("referrer");
    }

    public long n() {
        long b2 = b("lastStopTimeStampSec");
        a("lastStopTimeStampSec", 0L);
        return b2;
    }

    public boolean o() {
        return a("apiReferrerSent");
    }

    public boolean p() {
        return a("huaweiApiReferrerSent");
    }

    public boolean q() {
        return a("preinstallRead");
    }

    public boolean r() {
        return a("referrerSent");
    }

    public void s() {
        a("apiReferrerSent", true);
    }

    public void t() {
        a("huaweiApiReferrerSent", true);
    }

    public void u() {
        a("preinstallRead", true);
    }

    public void v() {
        a("referrerSent", true);
    }

    public long b() {
        return b("appGalleryTrackedTime");
    }

    public void c(long j) {
        a("lastUpdateTimestamp", j);
    }

    public String d() {
        return c("appSetId");
    }

    public int e() {
        return (int) b("appSetIdScope");
    }

    public void f(String str) {
        a("appSetId", str);
    }

    public String g() {
        return c("appsHash");
    }

    public String h() {
        return c(Y3.c);
    }

    public String i() {
        return c("firebaseAppInstanceId");
    }

    public void j(String str) {
        a("firebaseAppInstanceId", str);
    }

    public void k(String str) {
        a("instanceId", str);
    }

    public long l() {
        return b("lastUpdateTimestamp");
    }

    public long b(String str) {
        try {
            return this.a.getLong(str, 0L);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public String c(String str) {
        try {
            return this.a.getString(str, "");
        } catch (Throwable unused) {
            return "";
        }
    }

    public void d(long j) {
        a("lastStopTimeStampSec", j);
    }

    public String a() {
        return c("appVersion");
    }

    public void a(int i) {
        a("appSetIdScope", i);
    }

    public void a(long j) {
        a("appGalleryTrackedTime", j);
    }

    public boolean a(String str) {
        try {
            return this.a.getBoolean(str, false);
        } catch (Throwable unused) {
            return false;
        }
    }

    public void a(String str, long j) {
        try {
            this.a.edit().putLong(str, j).commit();
        } catch (Throwable th) {
            x2.a("PrefsCache error: ", th);
        }
    }

    public void a(String str, String str2) {
        try {
            this.a.edit().putString(str, str2).commit();
        } catch (Throwable th) {
            x2.a("PrefsCache error: ", th);
        }
    }

    public void a(String str, boolean z) {
        try {
            this.a.edit().putBoolean(str, z).commit();
        } catch (Throwable th) {
            x2.a("PrefsCache error: ", th);
        }
    }
}
