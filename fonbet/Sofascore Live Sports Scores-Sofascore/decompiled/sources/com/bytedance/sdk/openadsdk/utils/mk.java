package com.bytedance.sdk.openadsdk.utils;

import android.os.Build;
import android.text.TextUtils;
import com.appsflyer.sdk_base.referrer.Payload;
import defpackage.mz1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class mk {
    public static boolean pcc = false;
    public static boolean sf = false;
    private static String vj = null;
    private static int wh = Integer.MAX_VALUE;
    private static final CharSequence gm = "amigo";
    private static final CharSequence oo = "funtouch";
    private static final ConcurrentHashMap<String, String> qf = new ConcurrentHashMap<>();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class pcc implements Callable<String> {
        private final String pcc;

        public pcc(String str) {
            this.pcc = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
        public String call() throws Exception {
            String str = (String) mk.qf.get(this.pcc);
            if (str != null) {
                return str;
            }
            System.currentTimeMillis();
            String gm = mk.gm(this.pcc);
            System.currentTimeMillis();
            if (gm != null) {
                mk.qf.put(this.pcc, gm);
            }
            return gm;
        }
    }

    public static boolean dax() {
        return "smartisan".equalsIgnoreCase(Build.MANUFACTURER) || "smartisan".equalsIgnoreCase(Build.BRAND);
    }

    public static boolean fum() {
        try {
            String str = Build.BRAND;
            if (TextUtils.isEmpty(str) || !str.toLowerCase().startsWith(Payload.SOURCE_HUAWEI)) {
                String str2 = Build.MANUFACTURER;
                if (TextUtils.isEmpty(str2)) {
                    return false;
                }
                if (!str2.toLowerCase().startsWith(Payload.SOURCE_HUAWEI)) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String gbb() {
        String jr = jr();
        if (jr == null || !jr.toLowerCase().contains("emotionui")) {
            return "";
        }
        StringBuilder r = mz1.r(jr, "_");
        r.append(Build.DISPLAY);
        return r.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006b, code lost:
    
        if (r5 == null) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String gm(String str) {
        BufferedReader bufferedReader;
        Throwable th;
        Process exec;
        String str2 = "";
        Process process = null;
        try {
            try {
                exec = Runtime.getRuntime().exec("getprop ".concat(String.valueOf(str)));
                try {
                    bufferedReader = new BufferedReader(new InputStreamReader(exec.getInputStream()), 1024);
                } catch (IllegalThreadStateException unused) {
                    bufferedReader = null;
                }
            } catch (Throwable th2) {
                bufferedReader = null;
                th = th2;
            }
        } catch (IllegalThreadStateException unused2) {
            bufferedReader = null;
        }
        try {
            str2 = bufferedReader.readLine();
            exec.exitValue();
        } catch (IllegalThreadStateException unused3) {
            process = exec;
            try {
                process.destroy();
            } catch (Throwable unused4) {
            }
        } catch (Throwable th3) {
            th = th3;
            try {
                com.bytedance.sdk.component.utils.lo.pcc("ToolUtils", "Unable to read sysprop ".concat(String.valueOf(str)), th);
                return str2;
            } finally {
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e) {
                        com.bytedance.sdk.component.utils.lo.pcc("ToolUtils", "Exception while closing InputStream", e);
                    }
                }
            }
        }
        try {
            bufferedReader.close();
        } catch (IOException e2) {
            com.bytedance.sdk.component.utils.lo.pcc("ToolUtils", "Exception while closing InputStream", e2);
        }
        return str2;
    }

    public static boolean gpj() {
        int i = wh;
        if (i == Integer.MAX_VALUE) {
            String str = Build.MANUFACTURER;
            String vy = kun.vy("kllk");
            if (TextUtils.isEmpty(str) || !str.toLowerCase().contains(vy)) {
                wh = 0;
                i = 0;
            } else {
                wh = 1;
                i = 1;
            }
        }
        return i == 1;
    }

    public static String hc() {
        if (!wh()) {
            return "";
        }
        return "miui_" + oo("ro.miui.ui.version.name") + "_" + Build.VERSION.INCREMENTAL;
    }

    public static String jr() {
        return oo("ro.build.version.emui");
    }

    public static boolean kj() {
        String oo2 = oo("ro.vivo.os.build.display.id");
        return !TextUtils.isEmpty(oo2) && oo2.toLowerCase().contains(oo);
    }

    public static String lo() {
        if (!gpj()) {
            return "";
        }
        return "coloros_" + oo(kun.vy("ro.build.version.kllkrom")) + "_" + Build.DISPLAY;
    }

    public static String lu() {
        String str = Build.DISPLAY;
        return (str == null || !str.toLowerCase().contains("flyme")) ? "" : str;
    }

    public static String nac() {
        if (dax()) {
            try {
                return "smartisan_".concat(String.valueOf(oo("ro.smartisan.version")));
            } catch (Throwable unused) {
            }
        }
        return Build.DISPLAY;
    }

    private static String of() {
        if (dax()) {
            return nac();
        }
        if (wh()) {
            return hc();
        }
        if (gm()) {
            return lu();
        }
        if (gpj()) {
            return lo();
        }
        String gbb = gbb();
        if (!TextUtils.isEmpty(gbb)) {
            return gbb;
        }
        if (kj()) {
            return qf();
        }
        if (vy()) {
            return ork();
        }
        if (vj()) {
            return oo();
        }
        String vh = vh();
        return !TextUtils.isEmpty(vh) ? vh : Build.DISPLAY;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String oo(String str) {
        String str2;
        String str3 = qf.get(str);
        if (str3 != null) {
            return str3;
        }
        if (TextUtils.isEmpty("")) {
            final com.bytedance.sdk.component.kj.sf.sf sfVar = new com.bytedance.sdk.component.kj.sf.sf(new pcc(str), 5, 2);
            rnn.gm((Runnable) new com.bytedance.sdk.component.kj.sf.gm("_getSystemPropertyTask") { // from class: com.bytedance.sdk.openadsdk.utils.mk.1
                @Override // java.lang.Runnable
                public void run() {
                    sfVar.run();
                }
            });
            str2 = (String) sfVar.get(1L, TimeUnit.SECONDS);
            return str2 != null ? "" : str2;
        }
        str2 = "";
        if (str2 != null) {
        }
    }

    public static String ork() {
        return Build.DISPLAY + "_" + oo("ro.gn.sv.version");
    }

    public static String pcc() {
        if (!TextUtils.isEmpty(vj)) {
            return vj;
        }
        String pcc2 = com.bytedance.sdk.openadsdk.core.ork.pcc("sdk_local_rom_info", 604800000L);
        vj = pcc2;
        if (TextUtils.isEmpty(pcc2)) {
            String of = of();
            vj = of;
            com.bytedance.sdk.openadsdk.core.ork.pcc("sdk_local_rom_info", of);
        }
        return vj;
    }

    public static String qf() {
        return oo("ro.vivo.os.build.display.id") + "_" + oo("ro.vivo.product.version");
    }

    public static boolean sf() {
        try {
            String pcc2 = pcc();
            if (TextUtils.isEmpty(pcc2) || !pcc2.startsWith("miui")) {
                return false;
            }
            String str = Build.VERSION.INCREMENTAL;
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return str.toLowerCase().startsWith("v12");
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean tmg() {
        return !TextUtils.isEmpty(oo("ro.letv.release.version"));
    }

    public static String vh() {
        if (!tmg()) {
            return "";
        }
        return "eui_" + oo("ro.letv.release.version") + "_" + Build.DISPLAY;
    }

    public static boolean vj() {
        String str = Build.MANUFACTURER + Build.BRAND;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        return lowerCase.contains("360") || lowerCase.contains("qiku");
    }

    public static boolean vy() {
        String str = Build.DISPLAY;
        return !TextUtils.isEmpty(str) && str.toLowerCase().contains(gm);
    }

    public static boolean wh() {
        if (!sf) {
            try {
                Class.forName("miui.os.Build");
                pcc = true;
                sf = true;
                return true;
            } catch (Exception unused) {
                sf = true;
            }
        }
        return pcc;
    }

    public static boolean pcc(String str) {
        if (TextUtils.isEmpty(str)) {
            str = jr();
        }
        return (!TextUtils.isEmpty(str) && str.toLowerCase().startsWith("emotionui")) || fum();
    }

    public static String oo() {
        return oo("ro.build.uiversion") + "_" + Build.DISPLAY;
    }

    public static boolean gm() {
        return Build.DISPLAY.contains("Flyme") || Build.USER.equals("flyme");
    }
}
