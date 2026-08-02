package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Build;
import android.view.Window;
import androidx.annotation.NonNull;
import androidx.core.view.l2;
import androidx.core.view.m2;
import androidx.core.view.n2;
import androidx.core.view.p2;
import com.google.android.material.color.MaterialColors;
import g0.c;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class EdgeToEdgeUtils {
    private static final int EDGE_TO_EDGE_BAR_ALPHA = 128;

    private EdgeToEdgeUtils() {
    }

    public static void applyEdgeToEdge(@NonNull Window window, boolean z5) {
        applyEdgeToEdge(window, z5, null, null);
    }

    private static int getNavigationBarColor(Context context, boolean z5) {
        if (z5 && Build.VERSION.SDK_INT < 27) {
            return c.e(MaterialColors.getColor(context, R.attr.navigationBarColor, -16777216), EDGE_TO_EDGE_BAR_ALPHA);
        }
        if (z5) {
            return 0;
        }
        return MaterialColors.getColor(context, R.attr.navigationBarColor, -16777216);
    }

    private static int getStatusBarColor(Context context, boolean z5) {
        if (z5) {
            return 0;
        }
        return MaterialColors.getColor(context, R.attr.statusBarColor, -16777216);
    }

    private static boolean isUsingLightSystemBar(int i5, boolean z5) {
        if (MaterialColors.isColorLight(i5)) {
            return true;
        }
        return i5 == 0 && z5;
    }

    public static void setLightNavigationBar(@NonNull Window window, boolean z5) {
        h9.c cVar = new h9.c(window.getDecorView());
        int i5 = Build.VERSION.SDK_INT;
        (i5 >= 35 ? new p2(window, cVar) : i5 >= 30 ? new n2(window, cVar) : i5 >= 26 ? new m2(window, cVar) : new l2(window, cVar)).w(z5);
    }

    public static void setLightStatusBar(@NonNull Window window, boolean z5) {
        h9.c cVar = new h9.c(window.getDecorView());
        int i5 = Build.VERSION.SDK_INT;
        (i5 >= 35 ? new p2(window, cVar) : i5 >= 30 ? new n2(window, cVar) : i5 >= 26 ? new m2(window, cVar) : new l2(window, cVar)).x(z5);
    }

    public static void applyEdgeToEdge(@NonNull Window window, boolean z5, Integer num, Integer num2) {
        boolean z7 = num == null || num.intValue() == 0;
        boolean z10 = num2 == null || num2.intValue() == 0;
        if (z7 || z10) {
            int color = MaterialColors.getColor(window.getContext(), R.attr.colorBackground, -16777216);
            if (z7) {
                num = Integer.valueOf(color);
            }
            if (z10) {
                num2 = Integer.valueOf(color);
            }
        }
        a.a.y(window, !z5);
        int statusBarColor = getStatusBarColor(window.getContext(), z5);
        int navigationBarColor = getNavigationBarColor(window.getContext(), z5);
        window.setStatusBarColor(statusBarColor);
        window.setNavigationBarColor(navigationBarColor);
        setLightStatusBar(window, isUsingLightSystemBar(statusBarColor, MaterialColors.isColorLight(num.intValue())));
        setLightNavigationBar(window, isUsingLightSystemBar(navigationBarColor, MaterialColors.isColorLight(num2.intValue())));
    }
}
