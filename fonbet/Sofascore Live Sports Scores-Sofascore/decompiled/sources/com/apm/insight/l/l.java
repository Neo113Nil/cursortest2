package com.apm.insight.l;

import android.os.Build;
import android.text.TextUtils;
import defpackage.bf3;
import defpackage.mz1;
import defpackage.wt3;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.InputStreamReader;
import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class l {
    private static final CharSequence a = "amigo";
    private static final CharSequence b = "funtouch";

    public static String a() {
        String str;
        if (d.b()) {
            if (!d.b()) {
                return "";
            }
            return "miui_" + a("ro.miui.ui.version.name") + "_" + Build.VERSION.INCREMENTAL;
        }
        if (d.c()) {
            String str2 = Build.DISPLAY;
            return (str2 == null || !str2.toLowerCase(Locale.getDefault()).contains("flyme")) ? "" : str2;
        }
        if (b()) {
            if (!b()) {
                return "";
            }
            return "coloros_" + a("ro.build.version.opporom") + "_" + Build.DISPLAY;
        }
        String a2 = d.a();
        if (a2 == null || !a2.toLowerCase(Locale.getDefault()).contains("emotionui")) {
            str = "";
        } else {
            StringBuilder r = mz1.r(a2, "_");
            r.append(Build.DISPLAY);
            str = r.toString();
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String a3 = a("ro.vivo.os.build.display.id");
        if (!TextUtils.isEmpty(a3) && a3.toLowerCase(Locale.getDefault()).contains(b)) {
            return a("ro.vivo.os.build.display.id") + "_" + a("ro.vivo.product.version");
        }
        String str3 = Build.DISPLAY;
        if (!TextUtils.isEmpty(str3) && str3.toLowerCase(Locale.getDefault()).contains(a)) {
            StringBuilder p = bf3.p(str3, "_");
            p.append(a("ro.gn.sv.version"));
            return p.toString();
        }
        String str4 = Build.MANUFACTURER + Build.BRAND;
        if (!TextUtils.isEmpty(str4)) {
            String lowerCase = str4.toLowerCase(Locale.getDefault());
            if (lowerCase.contains("360") || lowerCase.contains("qiku")) {
                return wt3.m(a("ro.build.uiversion"), "_", new StringBuilder(), str3);
            }
        }
        String m = TextUtils.isEmpty(a("ro.letv.release.version")) ? "" : wt3.m(a("ro.letv.release.version"), "_", new StringBuilder("eui_"), str3);
        return !TextUtils.isEmpty(m) ? m : str3;
    }

    private static boolean b() {
        String str = Build.MANUFACTURER;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.toLowerCase(Locale.getDefault()).contains("oppo");
    }

    private static String a(String str) {
        BufferedReader bufferedReader;
        String str2 = "";
        try {
            Process exec = Runtime.getRuntime().exec("getprop ".concat(String.valueOf(str)));
            bufferedReader = new BufferedReader(new InputStreamReader(exec.getInputStream()), 1024);
            try {
                str2 = bufferedReader.readLine();
                exec.destroy();
                com.apm.insight.a.a((Closeable) bufferedReader);
                return str2;
            } catch (Throwable unused) {
                com.apm.insight.a.a((Closeable) bufferedReader);
                return str2;
            }
        } catch (Throwable unused2) {
            bufferedReader = null;
        }
    }
}
