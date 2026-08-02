package com.vungle.ads.internal.network;

import android.os.Build;
import com.vungle.ads.BuildConfig;
import defpackage.mz1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class d0 {
    public static String a = a();
    public static String b;
    public static String c;

    public static String a() {
        return mz1.o(new StringBuilder(), "Amazon".equals(Build.MANUFACTURER) ? "VungleAmazon/" : "VungleDroid/", BuildConfig.VERSION_NAME);
    }

    public static String b() {
        return b;
    }

    public static void c(String str) {
        str.getClass();
        a = str;
    }

    public static String d() {
        return a;
    }

    public static void b(String str) {
        c = str;
    }

    public static String c() {
        return c;
    }

    public static void a(String str) {
        b = str;
    }
}
