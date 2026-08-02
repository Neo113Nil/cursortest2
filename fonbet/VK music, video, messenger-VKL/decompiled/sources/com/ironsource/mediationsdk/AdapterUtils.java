package com.ironsource.mediationsdk;

import android.content.Context;
import android.util.DisplayMetrics;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import xsna.tj0;
import xsna.z23;

/* loaded from: classes13.dex */
public class AdapterUtils {
    public static final int MIN_TABLET_DP_SIZE = 600;

    public static int dpToPixels(Context context, int i) {
        if (context != null) {
            return (int) tj0.a(1, i, context);
        }
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "AdapterUtils dpToPixels - context is null, returning dpSize", 3);
        return i;
    }

    public static String getScreenSizeParams(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        float f = displayMetrics.heightPixels;
        float f2 = displayMetrics.density;
        float min = Math.min(displayMetrics.widthPixels / f2, f / f2);
        float f3 = displayMetrics.xdpi;
        float f4 = displayMetrics.widthPixels / f3;
        float f5 = displayMetrics.heightPixels / displayMetrics.ydpi;
        double sqrt = Math.sqrt((f5 * f5) + (f4 * f4));
        int i = context.getResources().getConfiguration().smallestScreenWidthDp;
        StringBuilder sb = new StringBuilder("smallestWidth = ");
        sb.append(min);
        sb.append(" diagonalInches = ");
        sb.append(sqrt);
        return z23.b(i, " smallScreenDpApi =  ", sb);
    }

    public static boolean isLargeScreen(Context context) {
        if (context != null) {
            return context.getResources().getConfiguration().smallestScreenWidthDp >= 600;
        }
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "AdapterUtils isLargeScreen - context is null", 3);
        return false;
    }
}
