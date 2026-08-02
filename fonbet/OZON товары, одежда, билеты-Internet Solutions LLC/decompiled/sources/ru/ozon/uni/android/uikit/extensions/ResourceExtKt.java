package ru.ozon.uni.android.uikit.extensions;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Insets;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.TypedValue;
import android.view.Display;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\b\u001a\u0011\u0010\u0003\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0003\u0010\t\u001a\u0011\u0010\u0003\u001a\u00020\u0000*\u00020\n¢\u0006\u0004\b\u0003\u0010\u000b\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\f\u001a\u0011\u0010\r\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\r\u0010\t\u001a\u0011\u0010\u000e\u001a\u00020\u0005*\u00020\u0000¢\u0006\u0004\b\u000e\u0010\b\u001a\u0011\u0010\u000f\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u000f\u0010\t\u001a\u001b\u0010\u0011\u001a\u00020\u0000*\u00020\u00012\b\b\u0001\u0010\u0010\u001a\u00020\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001b\u0010\u0013\u001a\u00020\u0000*\u00020\u00012\b\b\u0001\u0010\u0010\u001a\u00020\u0000¢\u0006\u0004\b\u0013\u0010\u0012\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0015\u001a\u0019\u0010\u0017\u001a\u00020\u0005*\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u0005¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0019\u0010\u0019\u001a\u00020\u0005*\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0005¢\u0006\u0004\b\u0019\u0010\u0018\u001a\u001d\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u001a*\u00020\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0011\u0010\u001d\u001a\u00020\u0000*\u00020\u0001¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0011\u0010\u001f\u001a\u00020\u0000*\u00020\u0001¢\u0006\u0004\b\u001f\u0010\u001e\u001a\u001b\u0010\"\u001a\u00020\u0000*\u00020\u00012\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#\u001a#\u0010&\u001a\u00020\u0000*\u00020\u00002\u0006\u0010%\u001a\u00020$2\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b&\u0010'¨\u0006("}, d2 = {"", "Landroid/content/Context;", "context", "toPx", "(ILandroid/content/Context;)I", "", "toPxF", "(ILandroid/content/Context;)F", "(I)F", "(I)I", "", "(D)I", "(DLandroid/content/Context;)I", "toDp", "toSpF", "toSp", "resId", "dim", "(Landroid/content/Context;I)I", "color", "dp", "(Landroid/content/Context;F)I", "sp", "spToPx", "(Landroid/content/Context;F)F", "convertDpToPixel", "Lkotlin/Pair;", "getDisplaySizePx", "(Landroid/content/Context;)Lkotlin/Pair;", "getStatusBarHeight", "(Landroid/content/Context;)I", "getNavigationBarHeight", "", "systemElementName", "getSystemElementHeight", "(Landroid/content/Context;Ljava/lang/String;)I", "Landroid/view/Display;", "display", "removeStatusBarHeightIfNeeded", "(ILandroid/view/Display;Landroid/content/Context;)I", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ResourceExtKt {
    public static final int color(@NotNull Context context, int i11) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return a.getColor(context, i11);
    }

    public static final float convertDpToPixel(@NotNull Context context, float f7) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return TypedValue.applyDimension(1, f7, context.getResources().getDisplayMetrics());
    }

    public static final int dim(@NotNull Context context, int i11) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return context.getResources().getDimensionPixelSize(i11);
    }

    @NotNull
    public static final Pair<Integer, Integer> getDisplaySizePx(@NotNull Context context) {
        WindowMetrics currentWindowMetrics;
        WindowInsets windowInsets;
        int navigationBars;
        int statusBars;
        Insets insetsIgnoringVisibility;
        WindowMetrics currentWindowMetrics2;
        Rect bounds;
        int i11;
        int i12;
        int i13;
        int i14;
        Intrinsics.checkNotNullParameter(context, "<this>");
        WindowManager windowManager = (WindowManager) a.getSystemService(context, WindowManager.class);
        if (windowManager == null) {
            return new Pair<>(0, 0);
        }
        if (Build.VERSION.SDK_INT < 30) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            return new Pair<>(Integer.valueOf(point.x), Integer.valueOf(removeStatusBarHeightIfNeeded(point.y, defaultDisplay, context)));
        }
        currentWindowMetrics = windowManager.getCurrentWindowMetrics();
        windowInsets = currentWindowMetrics.getWindowInsets();
        navigationBars = WindowInsets.Type.navigationBars();
        statusBars = WindowInsets.Type.statusBars();
        insetsIgnoringVisibility = windowInsets.getInsetsIgnoringVisibility(navigationBars | statusBars);
        Intrinsics.checkNotNullExpressionValue(insetsIgnoringVisibility, "getInsetsIgnoringVisibility(...)");
        currentWindowMetrics2 = windowManager.getCurrentWindowMetrics();
        bounds = currentWindowMetrics2.getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "getBounds(...)");
        i11 = insetsIgnoringVisibility.left;
        i12 = insetsIgnoringVisibility.right;
        int i15 = i12 + i11;
        i13 = insetsIgnoringVisibility.top;
        i14 = insetsIgnoringVisibility.bottom;
        int i16 = i14 + i13;
        return new Pair<>(Integer.valueOf((bounds.right - bounds.left) - i15), Integer.valueOf((bounds.bottom - bounds.top) - i16));
    }

    public static final int getNavigationBarHeight(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return getSystemElementHeight(context, "navigation_bar_height");
    }

    public static final int getStatusBarHeight(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return getSystemElementHeight(context, "status_bar_height");
    }

    private static final int getSystemElementHeight(Context context, String str) {
        int identifier = context.getResources().getIdentifier(str, "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private static final int removeStatusBarHeightIfNeeded(int i11, Display display, Context context) {
        Point point = new Point();
        display.getRealSize(point);
        return (point.y - getNavigationBarHeight(context) == i11 || point.y == i11) ? i11 - getStatusBarHeight(context) : i11;
    }

    public static final float spToPx(@NotNull Context context, float f7) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return TypedValue.applyDimension(2, f7, context.getResources().getDisplayMetrics());
    }

    public static final int toDp(int i11) {
        return (int) Math.ceil(i11 / Resources.getSystem().getDisplayMetrics().density);
    }

    public static final int toPx(int i11, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (int) toPxF(i11, context);
    }

    public static final float toPxF(int i11, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return TypedValue.applyDimension(1, i11, context.getResources().getDisplayMetrics());
    }

    public static final int toSp(int i11) {
        return (int) toSpF(i11);
    }

    public static final float toSpF(int i11) {
        return TypedValue.applyDimension(2, i11, Resources.getSystem().getDisplayMetrics());
    }

    public static final int toPx(int i11) {
        return (int) toPxF(i11);
    }

    public static final float toPxF(int i11) {
        return TypedValue.applyDimension(1, i11, Resources.getSystem().getDisplayMetrics());
    }

    public static final int toPx(double d11) {
        return (int) TypedValue.applyDimension(1, (float) d11, Resources.getSystem().getDisplayMetrics());
    }

    public static final int toPx(double d11, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (int) TypedValue.applyDimension(1, (float) d11, context.getResources().getDisplayMetrics());
    }

    public static final int toPx(@NotNull Context context, float f7) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return (int) TypedValue.applyDimension(1, f7, context.getResources().getDisplayMetrics());
    }
}
