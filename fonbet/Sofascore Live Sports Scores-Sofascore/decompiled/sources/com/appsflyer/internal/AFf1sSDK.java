package com.appsflyer.internal;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.LogTag;
import com.ironsource.C4324ta;
import com.ironsource.U3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import defpackage.ogj;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFf1sSDK {
    private static AFf1sSDK d;
    private final Map<String, String> AFLogger = new HashMap<String, String>() { // from class: com.appsflyer.internal.AFf1sSDK.5
        {
            put("aa", "ro.arch");
            put("ab", "ro.chipname");
            put(CampaignEx.KEY_ACTIVITY_PATH_AND_NAME, "ro.dalvik.vm.native.bridge");
            put("ad", "persist.sys.nativebridge");
            put("ae", "ro.enable.native.bridge.exec");
            put("af", "dalvik.vm.isa.x86.features");
            put("ag", "dalvik.vm.isa.x86.variant");
            put("ah", "ro.zygote");
            put("ai", "ro.allow.mock.location");
            put("aj", "ro.dalvik.vm.isa.arm");
            put("ak", "dalvik.vm.isa.arm.features");
            put(CampaignEx.JSON_KEY_AD_AL, "dalvik.vm.isa.arm.variant");
            put("am", "dalvik.vm.isa.arm64.features");
            put("an", "dalvik.vm.isa.arm64.variant");
            put("ao", "vzw.os.rooted");
            put(C4324ta.c, "ro.build.user");
            put("aq", "ro.kernel.qemu");
            put("ar", "ro.hardware");
            put("as", "ro.product.cpu.abi");
            put("at", "ro.product.cpu.abilist");
            put("au", "ro.product.cpu.abilist32");
            put("av", "ro.product.cpu.abilist64");
        }
    };

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public enum AFa1tSDK {
        HOOKING("hk"),
        DEBUGGABLE("dbg");

        String AFKeystoreWrapper;

        AFa1tSDK(String str) {
            this.AFKeystoreWrapper = str;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public enum AFa1zSDK {
        XPOSED("xps"),
        FRIDA("frd");

        String AFKeystoreWrapper;

        AFa1zSDK(String str) {
            this.AFKeystoreWrapper = str;
        }
    }

    private AFf1sSDK() {
    }

    private AFg1rSDK AFLogger() {
        AFg1rSDK aFg1rSDK = new AFg1rSDK();
        try {
            for (Map.Entry<String, String> entry : this.AFLogger.entrySet()) {
                String d2 = d(entry.getValue());
                if (d2 != null && !d2.equals("")) {
                    aFg1rSDK.unregisterClient(entry.getKey(), d2);
                }
            }
            return aFg1rSDK;
        } catch (Exception e) {
            AFLogger.INSTANCE.e(LogTag.ANTI_FRAUD, "failed to create props", e, false, false);
            return aFg1rSDK;
        }
    }

    private static String d(String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
        } catch (Exception e) {
            AFLogger.INSTANCE.e(LogTag.ANTI_FRAUD, "error in props rfl", e, false, false);
            return null;
        }
    }

    public static AFf1sSDK registerClient() {
        AFf1sSDK aFf1sSDK = d;
        if (aFf1sSDK != null) {
            return aFf1sSDK;
        }
        AFf1sSDK aFf1sSDK2 = new AFf1sSDK();
        d = aFf1sSDK2;
        return aFf1sSDK2;
    }

    private static String unregisterClient() {
        StringBuilder sb = new StringBuilder();
        try {
            Iterator<Map.Entry<Thread, StackTraceElement[]>> it = Thread.getAllStackTraces().entrySet().iterator();
            int i = 0;
            int i2 = 0;
            while (it.hasNext()) {
                for (StackTraceElement stackTraceElement : it.next().getValue()) {
                    if (stackTraceElement.toString().contains("de.robv.android.xposed") && i2 <= 2) {
                        i2++;
                        sb.append(AFa1zSDK.XPOSED.AFKeystoreWrapper);
                        if (stackTraceElement.getMethodName().equals(U3.i.Z)) {
                            sb.append("+a");
                        }
                        if (stackTraceElement.getMethodName().equals("handleHookedMethod")) {
                            sb.append("+h");
                        }
                        sb.append(";");
                    }
                    if (stackTraceElement.getClassName().equals("com.android.internal.os.ZygoteInit")) {
                        i++;
                    }
                }
            }
            if (i > 1) {
                sb.append("mz;");
            }
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(LogTag.ANTI_FRAUD, "hooking check error", th, false, false);
        }
        try {
            StringBuilder sb2 = new StringBuilder("/proc/");
            sb2.append(Process.myPid());
            sb2.append("/maps");
            if (unregisterClient(sb2.toString(), "frida")) {
                sb.append(AFa1zSDK.FRIDA.AFKeystoreWrapper);
                if (Build.VERSION.SDK_INT < 29 && unregisterClient("/proc/net/tcp", "69A2")) {
                    sb.append("+prt");
                }
            }
        } catch (Exception e) {
            AFLogger.INSTANCE.e(LogTag.ANTI_FRAUD, "frida detection error", e, false, false);
            sb.append(e.getMessage().toLowerCase(Locale.ROOT));
        }
        sb.append(";");
        return sb.toString();
    }

    public final Object AFLogger(Context context, String str) {
        String str2 = null;
        if (str != null) {
            try {
                if (!str.matches("\\d+")) {
                }
                AFg1rSDK aFg1rSDK = new AFg1rSDK();
                aFg1rSDK.unregisterClient("pr", AFLogger());
                aFg1rSDK.unregisterClient("an", unregisterClient(context));
                return aFg1rSDK;
            } catch (Exception e) {
                AFLogger.INSTANCE.e(LogTag.ANTI_FRAUD, "Failed to collect anti-fraud data", e, false, false);
                return str2;
            }
        }
        str2 = "invalid timestamp";
        AFg1rSDK aFg1rSDK2 = new AFg1rSDK();
        aFg1rSDK2.unregisterClient("pr", AFLogger());
        aFg1rSDK2.unregisterClient("an", unregisterClient(context));
        return aFg1rSDK2;
    }

    private AFg1rSDK unregisterClient(Context context) {
        AFg1rSDK aFg1rSDK = new AFg1rSDK();
        try {
            aFg1rSDK.unregisterClient(AFa1tSDK.HOOKING.AFKeystoreWrapper, unregisterClient());
            aFg1rSDK.unregisterClient(AFa1tSDK.DEBUGGABLE.AFKeystoreWrapper, Boolean.valueOf((context.getApplicationInfo().flags & 2) != 0));
            return aFg1rSDK;
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(LogTag.ANTI_FRAUD, "failed to perform analysis checks", th, false, false);
            return aFg1rSDK;
        }
    }

    private static boolean unregisterClient(String str, String str2) throws Exception {
        String readLine;
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(str));
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream, Charset.defaultCharset()));
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            do {
                readLine = bufferedReader.readLine();
                if (readLine == null) {
                    bufferedReader.close();
                    fileInputStream.close();
                    return false;
                }
            } while (!new HashSet(Arrays.asList(readLine.toLowerCase(Locale.ROOT).split("[\\s.,\\]\\-:/_\\[]"))).contains(lowerCase));
            bufferedReader.close();
            fileInputStream.close();
            return true;
        } catch (FileNotFoundException e) {
            AFLogger.INSTANCE.e(LogTag.ANTI_FRAUD, "FNF", e, false, false);
            ogj.k("FNF");
            return false;
        } catch (IOException e2) {
            AFLogger.INSTANCE.e(LogTag.ANTI_FRAUD, "IOF", e2, false, false);
            ogj.k("IOF");
            return false;
        } catch (Exception e3) {
            AFLogger.INSTANCE.e(LogTag.ANTI_FRAUD, "GF", e3, false, false);
            ogj.k("GF");
            return false;
        }
    }
}
