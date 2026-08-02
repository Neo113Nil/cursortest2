package com.vungle.ads.internal.util;

import android.util.Log;
import kotlin.jvm.functions.Function0;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class t {
    public static int a(String str, String str2) {
        boolean z;
        Regex regex;
        str.getClass();
        str2.getClass();
        z = u.a;
        if (!z) {
            return -1;
        }
        str2.getClass();
        regex = u.b;
        return Log.d(str, regex.replace(str2, "xxx.xxx.xxx.xxx"));
    }

    public static void b(String str, String str2) {
        boolean z;
        Regex regex;
        str.getClass();
        str2.getClass();
        z = u.a;
        if (z) {
            str2.getClass();
            regex = u.b;
            regex.replace(str2, "xxx.xxx.xxx.xxx");
        }
    }

    public static void c(String str, String str2) {
        boolean z;
        Regex regex;
        str.getClass();
        str2.getClass();
        z = u.a;
        if (z) {
            str2.getClass();
            regex = u.b;
            regex.replace(str2, "xxx.xxx.xxx.xxx");
        }
    }

    public static void a(String str) {
        boolean z;
        Regex regex;
        str.getClass();
        z = u.a;
        if (z) {
            str.getClass();
            regex = u.b;
            regex.replace(str, "xxx.xxx.xxx.xxx");
        }
    }

    public static void a(String str, String str2, Throwable th) {
        boolean z;
        Regex regex;
        str.getClass();
        str2.getClass();
        th.getClass();
        z = u.a;
        if (z) {
            str2.getClass();
            regex = u.b;
            regex.replace(str2, "xxx.xxx.xxx.xxx");
            th.getLocalizedMessage();
        }
    }

    public static void a(String str, Function0 function0) {
        boolean z;
        Regex regex;
        str.getClass();
        function0.getClass();
        z = u.a;
        if (z) {
            String str2 = (String) function0.invoke();
            str2.getClass();
            regex = u.b;
            regex.replace(str2, "xxx.xxx.xxx.xxx");
        }
    }
}
