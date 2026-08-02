package com.mbridge.msdk.foundation.tools;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import defpackage.dmi;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class q0 {
    public static boolean a = true;
    public static boolean b = true;
    public static boolean c = true;
    public static boolean d = false;
    public static boolean e = true;
    public static boolean f = false;
    public static boolean g = true;
    public static boolean h = true;

    static {
        if (MBridgeConstans.DEBUG) {
            return;
        }
        g = false;
        a = false;
        c = false;
        h = false;
        b = false;
        f = false;
        e = false;
        d = false;
    }

    public static void a(String str, String str2) {
        if (!a || TextUtils.isEmpty(str2)) {
            return;
        }
        a(str);
    }

    public static void b(String str, String str2, Throwable th) {
        if (!b || str2 == null || th == null) {
            return;
        }
        a(str);
    }

    public static void c(String str, String str2) {
        if (!c || TextUtils.isEmpty(str2)) {
            return;
        }
        a(str);
    }

    public static void d(String str, String str2) {
        if (!h || TextUtils.isEmpty(str2)) {
            return;
        }
        a(str);
    }

    public static void b(String str, String str2) {
        if (!b || str2 == null) {
            return;
        }
        a(str);
    }

    private static String a(String str) {
        return !TextUtils.isEmpty(str) ? dmi.q("MBRIDGE_", str) : str;
    }

    public static void c(String str, String str2, Throwable th) {
        if (!h || TextUtils.isEmpty(str2)) {
            return;
        }
        a(str);
    }

    public static void a(String str, String str2, Throwable th) {
        if (!a || TextUtils.isEmpty(str2)) {
            return;
        }
        a(str);
    }

    public static void a(String str, Throwable th) {
        if (!h || th == null) {
            return;
        }
        a(str);
    }
}
