package com.playtika.plugins.googleplay.billingclient;

/* loaded from: classes7.dex */
public class ExternalContentLinksUtil {
    public static int fromIntToMode(int i) {
        if (i == 1) {
            return 1;
        }
        return i == 2 ? 2 : 0;
    }

    public static int fromIntToType(int i) {
        if (i == 1) {
            return 1;
        }
        return i == 2 ? 2 : 0;
    }
}
