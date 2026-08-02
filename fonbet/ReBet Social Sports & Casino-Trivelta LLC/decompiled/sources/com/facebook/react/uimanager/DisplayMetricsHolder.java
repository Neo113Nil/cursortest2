package com.facebook.react.uimanager;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.core.view.AbstractC2082d0;
import androidx.core.view.F0;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u000b\u001a\u00020\u0007H\u0007J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0007J\b\u0010\u000f\u001a\u00020\u0007H\u0007J\u0012\u0010\u0010\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0007J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0007J\u0018\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0017\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0000¢\u0006\u0002\b\u001eJ\u0012\u0010\u001f\u001a\u00020 2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0001J\u001d\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#H\u0000¢\u0006\u0002\b%R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0003R\u001a\u0010\t\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0000\u0012\u0004\b\n\u0010\u0003¨\u0006&"}, d2 = {"Lcom/facebook/react/uimanager/DisplayMetricsHolder;", "", "<init>", "()V", "INITIALIZATION_MISSING_MESSAGE", "", "windowDisplayMetrics", "Landroid/util/DisplayMetrics;", "getWindowDisplayMetrics$annotations", "screenDisplayMetrics", "getScreenDisplayMetrics$annotations", "getWindowDisplayMetrics", "setWindowDisplayMetrics", "", "displayMetrics", "getScreenDisplayMetrics", "setScreenDisplayMetrics", "initDisplayMetricsIfNotInitialized", "context", "Landroid/content/Context;", "initDisplayMetrics", "getDisplayMetricsWritableMap", "Lcom/facebook/react/bridge/WritableMap;", "fontScale", "", "getPhysicalPixelsWritableMap", "getStatusBarHeightPx", "", "activity", "Landroid/app/Activity;", "getStatusBarHeightPx$ReactAndroid_release", "getEncodedScreenSizeWithoutVerticalInsets", "", "encodeFloatsToLong", "width", "", "height", "encodeFloatsToLong$ReactAndroid_release", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDisplayMetricsHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DisplayMetricsHolder.kt\ncom/facebook/react/uimanager/DisplayMetricsHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,155:1\n1#2:156\n*E\n"})
/* loaded from: classes2.dex */
public final class DisplayMetricsHolder {

    @NotNull
    private static final String INITIALIZATION_MISSING_MESSAGE = "DisplayMetricsHolder must be initialized with initDisplayMetricsIfNotInitialized or initDisplayMetrics";

    @NotNull
    public static final DisplayMetricsHolder INSTANCE = new DisplayMetricsHolder();

    @Nullable
    private static DisplayMetrics screenDisplayMetrics;

    @Nullable
    private static DisplayMetrics windowDisplayMetrics;

    private DisplayMetricsHolder() {
    }

    @JvmStatic
    @NotNull
    public static final WritableMap getDisplayMetricsWritableMap(double fontScale) {
        if (windowDisplayMetrics == null) {
            throw new IllegalStateException(INITIALIZATION_MISSING_MESSAGE);
        }
        if (screenDisplayMetrics == null) {
            throw new IllegalStateException(INITIALIZATION_MISSING_MESSAGE);
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        DisplayMetricsHolder displayMetricsHolder = INSTANCE;
        DisplayMetrics displayMetrics = windowDisplayMetrics;
        Intrinsics.checkNotNull(displayMetrics, "null cannot be cast to non-null type android.util.DisplayMetrics");
        writableNativeMap.putMap("windowPhysicalPixels", displayMetricsHolder.getPhysicalPixelsWritableMap(displayMetrics, fontScale));
        DisplayMetrics displayMetrics2 = screenDisplayMetrics;
        Intrinsics.checkNotNull(displayMetrics2, "null cannot be cast to non-null type android.util.DisplayMetrics");
        writableNativeMap.putMap("screenPhysicalPixels", displayMetricsHolder.getPhysicalPixelsWritableMap(displayMetrics2, fontScale));
        return writableNativeMap;
    }

    @JvmStatic
    @JvmName(name = "getEncodedScreenSizeWithoutVerticalInsets")
    public static final long getEncodedScreenSizeWithoutVerticalInsets(@Nullable Activity activity) {
        Window window;
        View decorView;
        F0 G10;
        if (activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null || (G10 = AbstractC2082d0.G(decorView)) == null) {
            return 0L;
        }
        androidx.core.graphics.e f10 = G10.f(F0.p.f() | F0.p.e() | F0.p.a());
        Intrinsics.checkNotNullExpressionValue(f10, "getInsets(...)");
        int i10 = f10.f19099b + f10.f19101d;
        DisplayMetricsHolder displayMetricsHolder = INSTANCE;
        PixelUtil pixelUtil = PixelUtil.INSTANCE;
        if (screenDisplayMetrics == null) {
            throw new IllegalStateException("Required value was null.");
        }
        float pxToDp = pixelUtil.pxToDp(r2.widthPixels);
        if (screenDisplayMetrics != null) {
            return displayMetricsHolder.encodeFloatsToLong$ReactAndroid_release(pxToDp, pixelUtil.pxToDp(r4.heightPixels - i10));
        }
        throw new IllegalStateException("Required value was null.");
    }

    private final WritableMap getPhysicalPixelsWritableMap(DisplayMetrics displayMetrics, double fontScale) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putInt("width", displayMetrics.widthPixels);
        writableNativeMap.putInt("height", displayMetrics.heightPixels);
        writableNativeMap.putDouble("scale", displayMetrics.density);
        writableNativeMap.putDouble("fontScale", fontScale);
        writableNativeMap.putDouble("densityDpi", displayMetrics.densityDpi);
        return writableNativeMap;
    }

    @JvmStatic
    @NotNull
    public static final DisplayMetrics getScreenDisplayMetrics() {
        DisplayMetrics displayMetrics = screenDisplayMetrics;
        if (displayMetrics == null) {
            throw new IllegalStateException(INITIALIZATION_MISSING_MESSAGE);
        }
        Intrinsics.checkNotNull(displayMetrics, "null cannot be cast to non-null type android.util.DisplayMetrics");
        return displayMetrics;
    }

    @JvmStatic
    private static /* synthetic */ void getScreenDisplayMetrics$annotations() {
    }

    @JvmStatic
    @NotNull
    public static final DisplayMetrics getWindowDisplayMetrics() {
        DisplayMetrics displayMetrics = windowDisplayMetrics;
        if (displayMetrics == null) {
            throw new IllegalStateException(INITIALIZATION_MISSING_MESSAGE);
        }
        Intrinsics.checkNotNull(displayMetrics, "null cannot be cast to non-null type android.util.DisplayMetrics");
        return displayMetrics;
    }

    @JvmStatic
    private static /* synthetic */ void getWindowDisplayMetrics$annotations() {
    }

    @JvmStatic
    public static final void initDisplayMetrics(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        windowDisplayMetrics = displayMetrics;
        DisplayMetrics displayMetrics2 = new DisplayMetrics();
        displayMetrics2.setTo(displayMetrics);
        Object systemService = context.getSystemService("window");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        ((WindowManager) systemService).getDefaultDisplay().getRealMetrics(displayMetrics2);
        displayMetrics2.scaledDensity = displayMetrics.scaledDensity;
        screenDisplayMetrics = displayMetrics2;
    }

    @JvmStatic
    public static final void initDisplayMetricsIfNotInitialized(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (screenDisplayMetrics != null) {
            return;
        }
        initDisplayMetrics(context);
    }

    @JvmStatic
    public static final void setScreenDisplayMetrics(@Nullable DisplayMetrics displayMetrics) {
        screenDisplayMetrics = displayMetrics;
    }

    @JvmStatic
    public static final void setWindowDisplayMetrics(@Nullable DisplayMetrics displayMetrics) {
        windowDisplayMetrics = displayMetrics;
    }

    public final long encodeFloatsToLong$ReactAndroid_release(float width, float height) {
        return Float.floatToRawIntBits(height) | (Float.floatToRawIntBits(width) << 32);
    }

    public final int getStatusBarHeightPx$ReactAndroid_release(@Nullable Activity activity) {
        Window window;
        View decorView;
        F0 G10;
        if (activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null || (G10 = AbstractC2082d0.G(decorView)) == null) {
            return 0;
        }
        return G10.f(F0.p.f() | F0.p.e() | F0.p.a()).f19099b;
    }
}
