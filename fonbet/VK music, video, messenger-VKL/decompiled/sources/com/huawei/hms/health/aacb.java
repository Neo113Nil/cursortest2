package com.huawei.hms.health;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.hms.hihealth.HiHealthKitClient;
import com.huawei.hms.hihealth.HiHealthStatusCodes;
import com.huawei.hms.utils.Util;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes13.dex */
public class aacb {
    private static final boolean aab;
    private static final String aaba;
    private static final String aabb;
    private static final String aabc;

    /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
    static {
        int i;
        boolean aaba2 = aaba("com.huawei.android.os.BuildEx");
        aab = aaba2;
        String aab2 = !aaba2 ? "" : aab("ro.build.version.emui", "");
        aaba = aab2;
        aab(aab2);
        if (aaba2) {
            String aab3 = aab("ro.build.hw_emui_api_level", "");
            if (!TextUtils.isEmpty(aab3)) {
                try {
                    i = Integer.parseInt(aab3);
                } catch (NumberFormatException unused) {
                    aabz.aab("EnvironmentInfo", "getEmuiVersionCodeExImpl: catch a NumberFormatException");
                }
                StringBuilder aab4 = aab.aab("initEmuiVersionCodeEx, isEmuiBuildEx=");
                boolean z = aab;
                aab4.append(z);
                aab4.append(", emuiVersionCode=");
                aab4.append(i);
                aabz.aabb("EnvironmentInfo", aab4.toString());
                aabb = aab("hw_sc.build.platform.version", "");
                aabc = z ? aab("ro.build.version.magic", "") : "";
            }
        }
        i = 0;
        StringBuilder aab42 = aab.aab("initEmuiVersionCodeEx, isEmuiBuildEx=");
        boolean z2 = aab;
        aab42.append(z2);
        aab42.append(", emuiVersionCode=");
        aab42.append(i);
        aabz.aabb("EnvironmentInfo", aab42.toString());
        aabb = aab("hw_sc.build.platform.version", "");
        aabc = z2 ? aab("ro.build.version.magic", "") : "";
    }

    public static String aab(String str, String str2) {
        String str3;
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        try {
            Object invoke = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class, String.class).invoke(null, str, str2);
            return invoke instanceof String ? (String) invoke : str2;
        } catch (ClassNotFoundException unused) {
            str3 = "getSystemProperties ClassNotFoundException";
            aabz.aab("EnvironmentInfo", str3);
            return str2;
        } catch (IllegalAccessException unused2) {
            str3 = "getSystemProperties IllegalAccessException";
            aabz.aab("EnvironmentInfo", str3);
            return str2;
        } catch (NoSuchMethodException unused3) {
            str3 = "getSystemProperties NoSuchMethodException";
            aabz.aab("EnvironmentInfo", str3);
            return str2;
        } catch (InvocationTargetException unused4) {
            str3 = "getSystemProperties InvocationTargetException";
            aabz.aab("EnvironmentInfo", str3);
            return str2;
        }
    }

    private static boolean aaba(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            aabz.aab("EnvironmentInfo", "isSupportEmuiBuildEx ClassNotFoundException");
            return false;
        }
    }

    private static boolean aab(String str) {
        boolean z = !TextUtils.isEmpty(str) && str.contains("EmotionUI");
        StringBuilder aab2 = aab.aab("checkEmuiSystem, isEmuiBuildEx=");
        aab2.append(aab);
        aab2.append(", isEmui=");
        aab2.append(z);
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x008a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void aab() throws SecurityException {
        String sb;
        Context context = HiHealthKitClient.getInstance().getContext();
        if (context == null) {
            return;
        }
        String appId = Util.getAppId(context);
        if ("10414141".equals(appId) || "102162151".equals(appId)) {
            aabz.aabb("EnvironmentInfo", "skip checkSystemVersion");
            return;
        }
        String str = aabb;
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split("\\.");
            if (split.length > 0 && TextUtils.isDigitsOnly(split[0]) && Integer.parseInt(split[0]) >= 2) {
                aabz.aabb("EnvironmentInfo", "System OS is Harmony.");
                if (!aaca.aaba(context)) {
                    throw new SecurityException(String.valueOf(HiHealthStatusCodes.DEVICE_NOT_SUPPORT));
                }
                return;
            }
        }
        String str2 = aabc;
        if (!TextUtils.isEmpty(str2)) {
            String[] split2 = str2.split("\\.");
            if (split2.length > 0 && TextUtils.isDigitsOnly(split2[0]) && Integer.parseInt(split2[0]) >= 2) {
                sb = "System OS is Magic New Ui.";
                aabz.aabb("EnvironmentInfo", sb);
                if (!aaca.aaba(context)) {
                }
            }
        }
        StringBuilder aab2 = aab.aab("Android SDK Version is ");
        aab2.append(Build.VERSION.SDK_INT);
        sb = aab2.toString();
        aabz.aabb("EnvironmentInfo", sb);
        if (!aaca.aaba(context)) {
        }
    }
}
