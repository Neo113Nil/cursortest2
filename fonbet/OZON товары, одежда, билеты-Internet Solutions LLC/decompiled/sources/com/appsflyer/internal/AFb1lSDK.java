package com.appsflyer.internal;

import com.appsflyer.AFLogger;

/* loaded from: classes.dex */
public final class AFb1lSDK {
    private static String valueOf;
    private static String values;

    static void valueOf(String str) {
        valueOf = str;
        if (str == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < str.length(); i11++) {
            if (i11 == 0 || i11 == str.length() - 1) {
                sb2.append(str.charAt(i11));
            } else {
                sb2.append("*");
            }
        }
        values = sb2.toString();
    }

    public static void values(String str) {
        if (valueOf == null) {
            valueOf(AFb1tSDK.valueOf().values().force().registerClient);
        }
        String str2 = valueOf;
        if (str2 != null) {
            AFLogger.afInfoLog(str.replace(str2, values));
        }
    }
}
