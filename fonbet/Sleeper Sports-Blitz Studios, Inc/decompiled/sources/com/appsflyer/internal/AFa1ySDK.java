package com.appsflyer.internal;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.appsflyer.AFLogger;
import com.braze.Constants;
import io.sentry.protocol.SentryThread;
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

/* loaded from: classes6.dex */
public final class AFa1ySDK {
    private static AFa1ySDK getRevenue;
    private final Map<String, String> getMediationNetwork = new HashMap<String, String>() { // from class: com.appsflyer.internal.AFa1ySDK.4
        {
            put("aa", "ro.arch");
            put("ab", "ro.chipname");
            put(Constants.BRAZE_PUSH_ACCENT_KEY, "ro.dalvik.vm.native.bridge");
            put("ad", "persist.sys.nativebridge");
            put("ae", "ro.enable.native.bridge.exec");
            put("af", "dalvik.vm.isa.x86.features");
            put("ag", "dalvik.vm.isa.x86.variant");
            put("ah", "ro.zygote");
            put("ai", "ro.allow.mock.location");
            put("aj", "ro.dalvik.vm.isa.arm");
            put("ak", "dalvik.vm.isa.arm.features");
            put("al", "dalvik.vm.isa.arm.variant");
            put("am", "dalvik.vm.isa.arm64.features");
            put("an", "dalvik.vm.isa.arm64.variant");
            put("ao", "vzw.os.rooted");
            put("ap", "ro.build.user");
            put("aq", "ro.kernel.qemu");
            put("ar", "ro.hardware");
            put("as", "ro.product.cpu.abi");
            put("at", "ro.product.cpu.abilist");
            put("au", "ro.product.cpu.abilist32");
            put(CmcdData.OBJECT_TYPE_MUXED_AUDIO_AND_VIDEO, "ro.product.cpu.abilist64");
        }
    };

    AFa1ySDK() {
    }

    public static AFa1ySDK AFAdRevenueData() {
        if (getRevenue == null) {
            getRevenue = new AFa1ySDK();
        }
        return getRevenue;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0007, code lost:
    
        if (getMediationNetwork(r5) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object AFAdRevenueData(Context context, String str) {
        String str2 = null;
        if (str != null) {
            try {
            } catch (Exception e) {
                AFLogger.afErrorLogForExcManagerOnly("could not get anti fraud data", e);
                return str2;
            }
        }
        str2 = "invalid timestamp";
        AFa1jSDK aFa1jSDK = new AFa1jSDK();
        aFa1jSDK.getMonetizationNetwork(CmcdConfiguration.KEY_PLAYBACK_RATE, getCurrencyIso4217Code());
        aFa1jSDK.getMonetizationNetwork("an", getMediationNetwork(context));
        return aFa1jSDK;
    }

    private static boolean getMediationNetwork(String str) {
        return str.matches("\\d+");
    }

    private static boolean getRevenue(Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    private static String getRevenue() {
        StringBuilder sb = new StringBuilder();
        try {
            Iterator<Map.Entry<Thread, StackTraceElement[]>> it = Thread.getAllStackTraces().entrySet().iterator();
            int i = 0;
            int i2 = 0;
            while (it.hasNext()) {
                for (StackTraceElement stackTraceElement : it.next().getValue()) {
                    if (stackTraceElement.toString().contains("de.robv.android.xposed") && i2 <= 2) {
                        i2++;
                        sb.append(EnumC0054AFa1ySDK.XPOSED.AFAdRevenueData);
                        if (stackTraceElement.getMethodName().equals(SentryThread.JsonKeys.MAIN)) {
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
        } catch (Exception e) {
            AFLogger.afErrorLogForExcManagerOnly("hooking check error", e);
        }
        try {
            StringBuilder sb2 = new StringBuilder("/proc/");
            sb2.append(Process.myPid());
            sb2.append("/maps");
            if (getMediationNetwork(sb2.toString(), "frida")) {
                sb.append(EnumC0054AFa1ySDK.FRIDA.AFAdRevenueData);
                if (Build.VERSION.SDK_INT < 29 && getMediationNetwork("/proc/net/tcp", "69A2")) {
                    sb.append("+prt");
                }
            }
        } catch (Exception e2) {
            AFLogger.afErrorLogForExcManagerOnly("frida detection error", e2);
            sb.append(e2.getMessage().toLowerCase(Locale.getDefault()));
        }
        sb.append(";");
        return sb.toString();
    }

    private AFa1jSDK getMediationNetwork(Context context) {
        AFa1jSDK aFa1jSDK = new AFa1jSDK();
        try {
            aFa1jSDK.getMonetizationNetwork(AFa1vSDK.HOOKING.getMonetizationNetwork, getRevenue());
            aFa1jSDK.getMediationNetwork.put(AFa1jSDK.getRevenue(AFa1vSDK.DEBUGGABLE.getMonetizationNetwork), Boolean.valueOf(getRevenue(context)));
            return aFa1jSDK;
        } catch (Exception e) {
            AFLogger.afErrorLogForExcManagerOnly("failed to perform analysis checks", e);
            return aFa1jSDK;
        }
    }

    private AFa1jSDK getCurrencyIso4217Code() {
        AFa1jSDK aFa1jSDK = new AFa1jSDK();
        try {
            for (Map.Entry<String, String> entry : this.getMediationNetwork.entrySet()) {
                String revenue = getRevenue(entry.getValue());
                if (revenue != null && !revenue.equals("")) {
                    aFa1jSDK.getMonetizationNetwork(entry.getKey(), revenue);
                }
            }
            return aFa1jSDK;
        } catch (Exception e) {
            AFLogger.afErrorLogForExcManagerOnly("failed to create props", e);
            return aFa1jSDK;
        }
    }

    private static String getRevenue(String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
        } catch (Exception e) {
            AFLogger.afErrorLogForExcManagerOnly("error in props rfl", e);
            return null;
        }
    }

    private static boolean getMediationNetwork(String str, String str2) throws Exception {
        String readLine;
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(str));
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream, Charset.defaultCharset()));
            String lowerCase = str2.toLowerCase(Locale.getDefault());
            do {
                readLine = bufferedReader.readLine();
                if (readLine == null) {
                    bufferedReader.close();
                    fileInputStream.close();
                    return false;
                }
            } while (!new HashSet(Arrays.asList(readLine.toLowerCase(Locale.getDefault()).split("[\\s.,\\]\\-:/_\\[]"))).contains(lowerCase));
            bufferedReader.close();
            fileInputStream.close();
            return true;
        } catch (FileNotFoundException e) {
            AFLogger.afErrorLogForExcManagerOnly("FNF", e);
            throw new Exception("FNF");
        } catch (IOException e2) {
            AFLogger.afErrorLogForExcManagerOnly("IOF", e2);
            throw new Exception("IOF");
        } catch (Exception e3) {
            AFLogger.afErrorLogForExcManagerOnly("GF", e3);
            throw new Exception("GF");
        }
    }

    enum AFa1vSDK {
        HOOKING("hk"),
        DEBUGGABLE("dbg");

        String getMonetizationNetwork;

        AFa1vSDK(String str) {
            this.getMonetizationNetwork = str;
        }
    }

    /* renamed from: com.appsflyer.internal.AFa1ySDK$AFa1ySDK, reason: collision with other inner class name */
    enum EnumC0054AFa1ySDK {
        XPOSED("xps"),
        FRIDA("frd");

        String AFAdRevenueData;

        EnumC0054AFa1ySDK(String str) {
            this.AFAdRevenueData = str;
        }
    }
}
