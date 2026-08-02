package ru.ozon.app.android.pdp.ui.configurators.ugc.reviewGallery;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
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
import ru.ozon.uni.core.R$color;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewGallery/FullScreenController;", "", "<init>", "()V", "Landroidx/fragment/app/m;", "fragment", "", "regardFitsSystemWindows", "isBgColorDark", "", "clearWindow", "(Landroidx/fragment/app/m;ZZ)V", "restoreWindow", "(Landroidx/fragment/app/m;)V", "", "originalStatusBarColor", "Ljava/lang/Integer;", "originalNavBarColor", "originalIsAppearanceLight", "Ljava/lang/Boolean;", "Landroid/graphics/drawable/Drawable;", "originalBackgroundDrawable", "Landroid/graphics/drawable/Drawable;", "defaultBackgroundColor", "I", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FullScreenController {
    private int defaultBackgroundColor = R$color.black;
    private Drawable originalBackgroundDrawable;
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
        Drawable background;
        Drawable.ConstantState constantState;
        Window window;
        Window window2;
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Window window3 = fragment.requireActivity().getWindow();
        View view = fragment.getView();
        if (!regardFitsSystemWindows || view == null || view.getFitsSystemWindows()) {
            View decorView = window3.getDecorView();
            Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
            r activity = fragment.getActivity();
            Drawable drawable = null;
            this.originalStatusBarColor = (activity == null || (window2 = activity.getWindow()) == null) ? null : Integer.valueOf(window2.getStatusBarColor());
            r activity2 = fragment.getActivity();
            this.originalNavBarColor = (activity2 == null || (window = activity2.getWindow()) == null) ? null : Integer.valueOf(window.getNavigationBarColor());
            Drawable background2 = decorView.getBackground();
            if (background2 != null && (constantState = background2.getConstantState()) != null) {
                drawable = constantState.newDrawable();
            }
            this.originalBackgroundDrawable = drawable;
            if (view != null) {
                view.setFitsSystemWindows(false);
            }
            StatusBarController statusBarController = StatusBarController.INSTANCE;
            StatusBarController.UpdateReason.NewState newState = StatusBarController.UpdateReason.NewState.INSTANCE;
            statusBarController.setStatusBarBackgroundColor(fragment, newState, 0);
            this.originalIsAppearanceLight = Boolean.valueOf(new Q0(decorView, window3).c());
            StatusBarController.setStatusBarContentColor$default(statusBarController, fragment, newState, isBgColorDark, false, 8, null);
            C5334o0.a(window3, false);
            window3.setNavigationBarColor(0);
            decorView.setBackgroundColor((view == null || (background = view.getBackground()) == null) ? this.defaultBackgroundColor : background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : this.defaultBackgroundColor);
        }
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
            StatusBarController.setStatusBarContentColor$default(StatusBarController.INSTANCE, fragment, StatusBarController.UpdateReason.NewState.INSTANCE, bool.booleanValue(), false, 8, null);
        }
        C5334o0.a(window, true);
        Integer num2 = this.originalNavBarColor;
        if (num2 != null) {
            window.setNavigationBarColor(num2.intValue());
        }
        window.getDecorView().setBackground(this.originalBackgroundDrawable);
    }
}
