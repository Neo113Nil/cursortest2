package og;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: og.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC5889a {
    public static final void a(Activity activity, boolean z10) {
        View decorView;
        WindowInsetsController insetsController;
        int navigationBars;
        int statusBars;
        int statusBars2;
        int navigationBars2;
        try {
            Result.Companion companion = Result.INSTANCE;
            if (activity == null) {
                activity = null;
            } else if (Build.VERSION.SDK_INT >= 30) {
                insetsController = activity.getWindow().getInsetsController();
                if (insetsController != null) {
                    if (z10) {
                        statusBars2 = WindowInsets.Type.statusBars();
                        insetsController.show(statusBars2);
                        navigationBars2 = WindowInsets.Type.navigationBars();
                        insetsController.show(navigationBars2);
                    } else {
                        navigationBars = WindowInsets.Type.navigationBars();
                        insetsController.hide(navigationBars);
                        statusBars = WindowInsets.Type.statusBars();
                        insetsController.hide(statusBars);
                        insetsController.setSystemBarsBehavior(2);
                    }
                }
            } else if (z10) {
                Window window = activity.getWindow();
                decorView = window != null ? window.getDecorView() : null;
                if (decorView != null) {
                    decorView.setSystemUiVisibility(256);
                }
            } else {
                Window window2 = activity.getWindow();
                decorView = window2 != null ? window2.getDecorView() : null;
                if (decorView != null) {
                    decorView.setSystemUiVisibility(1798);
                }
            }
            Result.m147constructorimpl(activity);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m147constructorimpl(ResultKt.createFailure(th2));
        }
    }

    public static final void b(Activity activity, boolean z10) {
        Window window;
        if (activity == null || (window = activity.getWindow()) == null) {
            return;
        }
        Intrinsics.checkNotNull(window);
        if (z10) {
            if (Build.VERSION.SDK_INT >= 30) {
                window.setDecorFitsSystemWindows(false);
                return;
            } else {
                window.getDecorView().setSystemUiVisibility(1792);
                return;
            }
        }
        if (Build.VERSION.SDK_INT >= 30) {
            window.setDecorFitsSystemWindows(true);
        } else {
            window.getDecorView().setSystemUiVisibility(256);
        }
    }
}
