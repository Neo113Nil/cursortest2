package io.intercom.android.sdk.utilities;

import android.text.TextUtils;

/* loaded from: classes9.dex */
public class ImageUtils {
    public static int getAspectHeight(int i, double d) {
        return (int) (i * d);
    }

    public static int getAspectWidth(int i, double d) {
        return (int) (i / d);
    }

    public static double getAspectRatio(int i, int i2) {
        if (i2 == 0 || i == 0) {
            return 1.0d;
        }
        double d = (i2 * 1.0d) / i;
        if (Double.isNaN(d)) {
            return 0.0d;
        }
        return d;
    }

    public static boolean isGif(String str) {
        return !TextUtils.isEmpty(str) && str.endsWith(".gif");
    }
}
