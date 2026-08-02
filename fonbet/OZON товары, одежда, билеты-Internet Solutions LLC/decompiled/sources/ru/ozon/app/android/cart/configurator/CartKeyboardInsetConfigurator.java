package ru.ozon.app.android.cart.configurator;

import An.b;
import Ql.c;
import Sc.InterfaceC4008j;
import Sc.k;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.core.view.C5353y0;
import androidx.core.view.D;
import androidx.core.view.Y;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import androidx.lifecycle.J;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import v10.C10183a;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u000eR\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0014¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/cart/configurator/CartKeyboardInsetConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "<init>", "()V", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "getSwipeRefreshContainer", "()Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "Landroid/view/Window;", "getActivityWindow", "()Landroid/view/Window;", "Landroidx/lifecycle/J;", "owner", "", "onStart", "(Landroidx/lifecycle/J;)V", "onStop", "", "containerBottomOffset$delegate", "LSc/j;", "getContainerBottomOffset", "()I", "containerBottomOffset", "Landroidx/core/view/D;", "insetsListener", "Landroidx/core/view/D;", "getBottomBorderYPosition", "bottomBorderYPosition", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CartKeyboardInsetConfigurator extends ComposerScreenConfig.PageConfigurator {

    /* renamed from: containerBottomOffset$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j containerBottomOffset = k.b(new CartKeyboardInsetConfigurator$containerBottomOffset$2(this));

    @NotNull
    private final D insetsListener = new b(this);

    private final Window getActivityWindow() {
        r a11 = getContainer().a();
        if (a11 != null) {
            return a11.getWindow();
        }
        return null;
    }

    private final int getBottomBorderYPosition() {
        View view;
        View b11;
        ComponentCallbacksC5392m c11 = getContainer().c();
        if (c11 == null || (view = c11.getView()) == null || (b11 = C10183a.b(view)) == null) {
            return 0;
        }
        return (int) b11.getY();
    }

    private final int getContainerBottomOffset() {
        return ((Number) this.containerBottomOffset.getValue()).intValue();
    }

    private final SwipeRefreshLayout getSwipeRefreshContainer() {
        View view;
        ComponentCallbacksC5392m c11 = getContainer().c();
        if (c11 == null || (view = c11.getView()) == null) {
            return null;
        }
        return ComposerViewExtensionKt.composerSwipeRefresh(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5353y0 insetsListener$lambda$2(CartKeyboardInsetConfigurator cartKeyboardInsetConfigurator, View view, C5353y0 c5353y0) {
        View decorView;
        int i11 = c.a(view, "view", c5353y0, "windowInsetsCompat", 8).f42129d;
        int i12 = c5353y0.f(2).f42129d;
        if (cartKeyboardInsetConfigurator.getContainerBottomOffset() == 0) {
            Window activityWindow = cartKeyboardInsetConfigurator.getActivityWindow();
            i12 = ((activityWindow == null || (decorView = activityWindow.getDecorView()) == null) ? 0 : decorView.getBottom()) - cartKeyboardInsetConfigurator.getBottomBorderYPosition();
        }
        int i13 = i11 - i12;
        SwipeRefreshLayout swipeRefreshContainer = cartKeyboardInsetConfigurator.getSwipeRefreshContainer();
        if (swipeRefreshContainer != null) {
            ViewGroup.LayoutParams layoutParams = swipeRefreshContainer.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = i13 >= 0 ? i13 : 0;
            swipeRefreshContainer.setLayoutParams(marginLayoutParams);
        }
        return Y.u(view, c5353y0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Window activityWindow = getActivityWindow();
        if (activityWindow != null) {
            Y.J(activityWindow.getDecorView(), this.insetsListener);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Window activityWindow = getActivityWindow();
        if (activityWindow != null) {
            Y.J(activityWindow.getDecorView(), null);
        }
    }
}
