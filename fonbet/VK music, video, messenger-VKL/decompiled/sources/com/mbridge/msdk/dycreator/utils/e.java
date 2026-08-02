package com.mbridge.msdk.dycreator.utils;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import xsna.tj0;

/* compiled from: DensityUtil.java */
/* loaded from: classes13.dex */
public class e {
    public static int a(Context context, int i) {
        return (int) tj0.a(1, i, context);
    }

    public static int b(Context context, float f) {
        return (int) tj0.a(4, f, context);
    }

    public static int c(Context context, float f) {
        return (int) tj0.a(5, f, context);
    }

    public static int d(Context context, float f) {
        return (int) tj0.a(3, f, context);
    }

    public static int e(Context context, float f) {
        return (int) ((f / a(context).density) + 0.5f);
    }

    public static int a(Context context, float f) {
        return (int) ((f * a(context).density) + 0.5f);
    }

    public static int b(Context context, int i) {
        return (int) tj0.a(2, i, context);
    }

    public static DisplayMetrics a(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return displayMetrics;
    }
}
