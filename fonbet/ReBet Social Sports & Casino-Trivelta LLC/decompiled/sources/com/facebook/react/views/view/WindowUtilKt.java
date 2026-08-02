package com.facebook.react.views.view;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import androidx.core.view.AbstractC2082d0;
import androidx.core.view.AbstractC2109r0;
import androidx.core.view.F0;
import androidx.core.view.h1;
import com.facebook.react.views.common.UiModeUtils;
import com.plaid.internal.EnumC3631g;
import com.twilio.voice.EventKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0006\u0010\n\u001a\u00020\u000b\u001a\u0014\u0010\f\u001a\u00020\u000b*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0007H\u0000\u001a\u0014\u0010\u000f\u001a\u00020\u000b*\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0007H\u0000\u001a\f\u0010\u0011\u001a\u00020\u000b*\u00020\rH\u0002\u001a\f\u0010\u0012\u001a\u00020\u000b*\u00020\rH\u0002\u001a\f\u0010\u0013\u001a\u00020\u000b*\u00020\rH\u0000\u001a\f\u0010\u0014\u001a\u00020\u000b*\u00020\rH\u0000\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0004\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0003\"\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0015"}, d2 = {"LightNavigationBarColor", "", "getLightNavigationBarColor", "()I", "DarkNavigationBarColor", "getDarkNavigationBarColor", EventKeys.VALUE_KEY, "", "isEdgeToEdgeFeatureFlagOn", "()Z", "setEdgeToEdgeFeatureFlagOn", "", "setStatusBarTranslucency", "Landroid/view/Window;", "isTranslucent", "setStatusBarVisibility", "isHidden", "statusBarHide", "statusBarShow", "enableEdgeToEdge", "disableEdgeToEdge", "ReactAndroid_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WindowUtilKt {
    private static boolean isEdgeToEdgeFeatureFlagOn;
    private static final int LightNavigationBarColor = Color.argb(EnumC3631g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE, 255, 255, 255);
    private static final int DarkNavigationBarColor = Color.argb(128, 27, 27, 27);

    public static final void disableEdgeToEdge(@NotNull Window window) {
        Intrinsics.checkNotNullParameter(window, "<this>");
        AbstractC2109r0.b(window, true);
    }

    public static final void enableEdgeToEdge(@NotNull Window window) {
        Intrinsics.checkNotNullParameter(window, "<this>");
        AbstractC2109r0.b(window, false);
        Context context = window.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        boolean isDarkMode = UiModeUtils.isDarkMode(context);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            window.setStatusBarContrastEnforced(false);
            window.setNavigationBarContrastEnforced(true);
        }
        window.setStatusBarColor(0);
        window.setNavigationBarColor(i10 < 29 ? (i10 < 26 || isDarkMode) ? DarkNavigationBarColor : LightNavigationBarColor : 0);
        new h1(window, window.getDecorView()).d(!isDarkMode);
        if (i10 >= 28) {
            window.getAttributes().layoutInDisplayCutoutMode = i10 >= 30 ? 3 : 1;
        }
    }

    public static final int getDarkNavigationBarColor() {
        return DarkNavigationBarColor;
    }

    public static final int getLightNavigationBarColor() {
        return LightNavigationBarColor;
    }

    public static final boolean isEdgeToEdgeFeatureFlagOn() {
        return isEdgeToEdgeFeatureFlagOn;
    }

    public static final void setEdgeToEdgeFeatureFlagOn() {
        isEdgeToEdgeFeatureFlagOn = true;
    }

    public static final void setStatusBarTranslucency(@NotNull Window window, boolean z10) {
        Intrinsics.checkNotNullParameter(window, "<this>");
        if (z10) {
            window.getDecorView().setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.facebook.react.views.view.g
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    WindowInsets statusBarTranslucency$lambda$0;
                    statusBarTranslucency$lambda$0 = WindowUtilKt.setStatusBarTranslucency$lambda$0(view, windowInsets);
                    return statusBarTranslucency$lambda$0;
                }
            });
        } else {
            window.getDecorView().setOnApplyWindowInsetsListener(null);
        }
        AbstractC2082d0.i0(window.getDecorView());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsets setStatusBarTranslucency$lambda$0(View v10, WindowInsets insets) {
        Intrinsics.checkNotNullParameter(v10, "v");
        Intrinsics.checkNotNullParameter(insets, "insets");
        WindowInsets onApplyWindowInsets = v10.onApplyWindowInsets(insets);
        return onApplyWindowInsets.replaceSystemWindowInsets(onApplyWindowInsets.getSystemWindowInsetLeft(), 0, onApplyWindowInsets.getSystemWindowInsetRight(), onApplyWindowInsets.getSystemWindowInsetBottom());
    }

    public static final void setStatusBarVisibility(@NotNull Window window, boolean z10) {
        Intrinsics.checkNotNullParameter(window, "<this>");
        if (z10) {
            statusBarHide(window);
        } else {
            statusBarShow(window);
        }
    }

    private static final void statusBarHide(Window window) {
        if (isEdgeToEdgeFeatureFlagOn) {
            h1 h1Var = new h1(window, window.getDecorView());
            h1Var.f(2);
            h1Var.b(F0.p.f());
        } else {
            if (Build.VERSION.SDK_INT >= 30) {
                window.getAttributes().layoutInDisplayCutoutMode = 1;
                window.setDecorFitsSystemWindows(false);
            }
            window.addFlags(1024);
            window.clearFlags(2048);
        }
    }

    private static final void statusBarShow(Window window) {
        if (isEdgeToEdgeFeatureFlagOn) {
            h1 h1Var = new h1(window, window.getDecorView());
            h1Var.f(2);
            h1Var.g(F0.p.f());
        } else {
            if (Build.VERSION.SDK_INT >= 30) {
                window.getAttributes().layoutInDisplayCutoutMode = 0;
                window.setDecorFitsSystemWindows(true);
            }
            window.addFlags(2048);
            window.clearFlags(1024);
        }
    }
}
