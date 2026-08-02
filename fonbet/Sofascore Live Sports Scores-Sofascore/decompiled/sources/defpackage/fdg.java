package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Insets;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class fdg {
    public static final fdg a = new fdg();

    public static int[] a(View view) {
        int[] iArr = {0, 0, 0, 0};
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            Rect rect = new Rect();
            view.getWindowVisibleDisplayFrame(rect);
            iArr[0] = rect.left;
            iArr[1] = rect.top;
            iArr[2] = Math.max(0, view.getWidth() - rect.right);
            iArr[3] = Math.max(0, view.getHeight() - rect.bottom);
            return iArr;
        }
        Rect rect2 = new Rect();
        view.getWindowVisibleDisplayFrame(rect2);
        if (Build.VERSION.SDK_INT >= 30) {
            Insets insets = rootWindowInsets.getInsets(WindowInsets.Type.navigationBars() | WindowInsets.Type.displayCutout() | WindowInsets.Type.systemBars() | WindowInsets.Type.statusBars());
            insets.getClass();
            if (rect2.left > 0) {
                iArr[0] = insets.left;
            }
            if (rect2.top > 0) {
                iArr[1] = insets.top;
            }
            if (rect2.right != view.getWidth()) {
                iArr[2] = insets.right;
            }
            if (rect2.bottom != view.getHeight()) {
                iArr[3] = insets.bottom;
                return iArr;
            }
        } else {
            if (rect2.left > 0) {
                iArr[0] = rootWindowInsets.getSystemWindowInsetLeft();
            }
            if (rect2.top > 0) {
                iArr[1] = rootWindowInsets.getSystemWindowInsetTop();
            }
            if (rect2.right != view.getWidth()) {
                iArr[2] = rootWindowInsets.getSystemWindowInsetRight();
            }
            if (rect2.bottom != view.getHeight()) {
                iArr[3] = rootWindowInsets.getSystemWindowInsetBottom();
            }
        }
        return iArr;
    }

    public static Rect b(Context context, boolean z, boolean z2) {
        WindowManager windowManager;
        WindowInsets rootWindowInsets;
        context.getClass();
        Rect rect = new Rect(0, 0, 0, 0);
        boolean z3 = context instanceof Activity;
        if (z3) {
            windowManager = ((Activity) context).getWindowManager();
        } else {
            Object systemService = context.getSystemService("window");
            systemService.getClass();
            windowManager = (WindowManager) systemService;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            WindowMetrics currentWindowMetrics = windowManager.getCurrentWindowMetrics();
            currentWindowMetrics.getClass();
            WindowInsets windowInsets = currentWindowMetrics.getWindowInsets();
            windowInsets.getClass();
            rect.set(currentWindowMetrics.getBounds());
            if (!z) {
                Insets insetsIgnoringVisibility = windowInsets.getInsetsIgnoringVisibility(WindowInsets.Type.navigationBars() | WindowInsets.Type.displayCutout() | WindowInsets.Type.systemBars() | WindowInsets.Type.statusBars());
                insetsIgnoringVisibility.getClass();
                rect.left += insetsIgnoringVisibility.left;
                rect.right -= insetsIgnoringVisibility.right;
                rect.top += insetsIgnoringVisibility.top;
                rect.bottom -= insetsIgnoringVisibility.bottom;
            }
        } else {
            Point point = new Point();
            Display defaultDisplay = windowManager.getDefaultDisplay();
            if (defaultDisplay != null) {
                defaultDisplay.getRealSize(point);
            }
            rect.set(0, 0, point.x, point.y);
            if (!z && z3 && (rootWindowInsets = ((Activity) context).getWindow().getDecorView().getRootWindowInsets()) != null) {
                rect.left = rootWindowInsets.getSystemWindowInsetLeft() + rect.left;
                rect.right -= rootWindowInsets.getSystemWindowInsetRight();
                rect.top = rootWindowInsets.getSystemWindowInsetTop() + rect.top;
                rect.bottom -= rootWindowInsets.getSystemWindowInsetBottom();
            }
        }
        if (z2) {
            rect.left = (int) (rect.left / context.getResources().getDisplayMetrics().density);
            rect.right = (int) (rect.right / context.getResources().getDisplayMetrics().density);
            rect.top = (int) (rect.top / context.getResources().getDisplayMetrics().density);
            rect.bottom = (int) (rect.bottom / context.getResources().getDisplayMetrics().density);
        }
        return rect;
    }
}
