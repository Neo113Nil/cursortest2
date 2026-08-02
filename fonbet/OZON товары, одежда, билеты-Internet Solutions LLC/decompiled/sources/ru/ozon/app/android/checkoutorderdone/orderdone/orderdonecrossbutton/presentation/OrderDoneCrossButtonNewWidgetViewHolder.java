package ru.ozon.app.android.checkoutorderdone.orderdone.orderdonecrossbutton.presentation;

import BZ.e;
import GZ.g;
import LZ.b;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C5353y0;
import androidx.core.view.Y;
import d20.AbstractC6065b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.tabbar.R$id;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001(B1\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001bR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001cR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001dR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001eR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001fR \u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00140 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010$\u001a\u00020#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonecrossbutton/presentation/OrderDoneCrossButtonNewWidgetViewHolder;", "Ld20/b;", "Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonecrossbutton/presentation/OrderDoneCrossButtonVO;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "root", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "view", "LGZ/g;", "router", "LBZ/e;", "miniAppConfigHolder", "Ll10/i;", "container", "<init>", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;LGZ/g;LBZ/e;Ll10/i;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "atomAction", "", "handleSellerMiniAppHomeNavigation", "(Lru/ozon/uni/atoms/af/AtomAction;)Z", "", "onWidgetCreated", "()V", "onWidgetDestroyed", "item", "bind", "(Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonecrossbutton/presentation/OrderDoneCrossButtonVO;)V", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "LGZ/g;", "LBZ/e;", "Ll10/i;", "Lkotlin/Function1;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Landroid/view/View;", "metricView", "Landroid/view/View;", "getMetricView", "()Landroid/view/View;", "Companion", "orderdone_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OrderDoneCrossButtonNewWidgetViewHolder extends AbstractC6065b<OrderDoneCrossButtonVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final i container;

    @NotNull
    private final View metricView;

    @NotNull
    private final e miniAppConfigHolder;
    private final CoordinatorLayout root;

    @NotNull
    private final g router;

    @NotNull
    private final IconButtonV3View view;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final float radius = UiExtKt.toPxF(16);
    private static final int margin = UiExtKt.toPx(16);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonecrossbutton/presentation/OrderDoneCrossButtonNewWidgetViewHolder$Companion;", "", "<init>", "()V", "orderdone_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public OrderDoneCrossButtonNewWidgetViewHolder(CoordinatorLayout coordinatorLayout, @NotNull IconButtonV3View view, @NotNull g router, @NotNull e miniAppConfigHolder, @NotNull i container) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(miniAppConfigHolder, "miniAppConfigHolder");
        Intrinsics.checkNotNullParameter(container, "container");
        this.root = coordinatorLayout;
        this.view = view;
        this.router = router;
        this.miniAppConfigHolder = miniAppConfigHolder;
        this.container = container;
        this.actionHandler = new ActionHandler.Builder(container, this).onPreProcess(new OrderDoneCrossButtonNewWidgetViewHolder$actionHandler$1(this)).buildHandler();
        this.metricView = view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean handleSellerMiniAppHomeNavigation(AtomAction atomAction) {
        if ((atomAction instanceof AtomAction.DismissRedirect) && h.t(this.miniAppConfigHolder.g().b(), "seller", false)) {
            return this.router.c(new b(new OZ.b(R$id.menu_main, null)), null);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5353y0 onWidgetCreated$lambda$1(View view, C5353y0 insets) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(insets, "insets");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, insets.f(1).f42127b + margin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        view.setLayoutParams(marginLayoutParams);
        return insets;
    }

    @Override // d20.AbstractC6065b
    @NotNull
    public View getMetricView() {
        return this.metricView;
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        CoordinatorLayout coordinatorLayout = this.root;
        if (coordinatorLayout != null) {
            coordinatorLayout.addView(this.view);
        }
        if (this.container.Y().getFitsSystemWindows()) {
            return;
        }
        Y.J(this.view, new Bi.b());
        this.view.requestApplyInsets();
    }

    @Override // d20.AbstractC6065b
    public void onWidgetDestroyed() {
        CoordinatorLayout coordinatorLayout = this.root;
        if (coordinatorLayout != null) {
            coordinatorLayout.removeView(this.view);
        }
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull OrderDoneCrossButtonVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        IconButtonV3View iconButtonV3View = this.view;
        IconButtonV3HolderKt.bind(iconButtonV3View, item.getIconButton(), this.actionHandler);
        Drawable background = iconButtonV3View.getBackground();
        GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
        if (gradientDrawable != null) {
            gradientDrawable.setCornerRadius(radius);
        }
    }
}
