package ru.ozon.app.android.travel.utils.fullScreenWidget;

import android.view.View;
import android.view.Window;
import androidx.core.view.C5334o0;
import androidx.core.view.Q0;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.uikit.utils.StatusBarController;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\fR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/utils/fullScreenWidget/FullScreenController;", "", "<init>", "()V", "Landroidx/fragment/app/m;", "fragment", "", "isBgColorDark", "", "enableFullscreenMode", "(Landroidx/fragment/app/m;Z)V", "disableFullscreenMode", "(Landroidx/fragment/app/m;)V", "regardFitsSystemWindows", "clearWindow", "(Landroidx/fragment/app/m;ZZ)V", "restoreWindow", "", "originalStatusBarColor", "Ljava/lang/Integer;", "originalNavBarColor", "originalIsAppearanceLight", "Ljava/lang/Boolean;", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FullScreenController {
    private Boolean originalIsAppearanceLight;
    private Integer originalNavBarColor;
    private Integer originalStatusBarColor;

    public static /* synthetic */ void clearWindow$default(FullScreenController fullScreenController, ComponentCallbacksC5392m componentCallbacksC5392m, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        if ((i11 & 4) != 0) {
            z12 = true;
        }
        fullScreenController.clearWindow(componentCallbacksC5392m, z11, z12);
    }

    public final void clearWindow(@NotNull ComponentCallbacksC5392m fragment, boolean regardFitsSystemWindows, boolean isBgColorDark) {
        Window window;
        Window window2;
        View view;
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Window window3 = fragment.requireActivity().getWindow();
        if (!regardFitsSystemWindows || (view = fragment.getView()) == null || view.getFitsSystemWindows()) {
            r activity = fragment.getActivity();
            Integer num = null;
            this.originalStatusBarColor = (activity == null || (window2 = activity.getWindow()) == null) ? null : Integer.valueOf(window2.getStatusBarColor());
            r activity2 = fragment.getActivity();
            if (activity2 != null && (window = activity2.getWindow()) != null) {
                num = Integer.valueOf(window.getNavigationBarColor());
            }
            this.originalNavBarColor = num;
            View view2 = fragment.getView();
            if (view2 != null) {
                view2.setFitsSystemWindows(false);
            }
            StatusBarController statusBarController = StatusBarController.INSTANCE;
            StatusBarController.UpdateReason.NewState newState = StatusBarController.UpdateReason.NewState.INSTANCE;
            statusBarController.setStatusBarBackgroundColor(fragment, newState, 0);
            this.originalIsAppearanceLight = Boolean.valueOf(new Q0(window3.getDecorView(), window3).c());
            StatusBarController.setStatusBarContentColor$default(statusBarController, fragment, newState, isBgColorDark, false, 8, null);
            C5334o0.a(window3, false);
            window3.setNavigationBarColor(0);
        }
    }

    public final void disableFullscreenMode(@NotNull ComponentCallbacksC5392m fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        restoreWindow(fragment);
    }

    public final void enableFullscreenMode(@NotNull ComponentCallbacksC5392m fragment, boolean isBgColorDark) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        clearWindow$default(this, fragment, false, isBgColorDark, 2, null);
    }

    public final void restoreWindow(@NotNull ComponentCallbacksC5392m fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Window window = fragment.requireActivity().getWindow();
        View view = fragment.getView();
        if (view == null) {
            return;
        }
        view.setFitsSystemWindows(true);
        Integer num = this.originalStatusBarColor;
        if (num != null) {
            StatusBarController.INSTANCE.setStatusBarBackgroundColor(fragment, StatusBarController.UpdateReason.Recovery.INSTANCE, num.intValue());
        }
        Boolean bool = this.originalIsAppearanceLight;
        if (bool != null) {
            StatusBarController.setStatusBarContentColor$default(StatusBarController.INSTANCE, fragment, StatusBarController.UpdateReason.Recovery.INSTANCE, bool.booleanValue(), false, 8, null);
        }
        C5334o0.a(window, true);
        Integer num2 = this.originalNavBarColor;
        if (num2 != null) {
            window.setNavigationBarColor(num2.intValue());
        }
    }
}
