package ru.ozon.app.android.cml.delivery.widgets.order.presentation.button;

import Vg.d;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import d20.AbstractC6064a;
import d20.InterfaceC6068e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.cml.delivery.widgets.stickyButton.presentation.StickyButtonVO;
import ru.ozon.app.android.cml.delivery.widgets.stickyButton.presentation.view.StickyButtonContainerView;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00100\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/order/presentation/button/StickyButtonSubwidgetViewHolder;", "Ld20/a;", "Lru/ozon/app/android/cml/delivery/widgets/stickyButton/presentation/StickyButtonVO;", "Ll10/i;", "container", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "inhibitor", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "<init>", "(Ll10/i;LVg/d;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;Ld20/e;)V", "item", "", "bindContainer", "(Lru/ozon/app/android/cml/delivery/widgets/stickyButton/presentation/StickyButtonVO;)V", "bind", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "button", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/cml/delivery/widgets/stickyButton/presentation/view/StickyButtonContainerView;", "getContainerView", "()Lru/ozon/app/android/cml/delivery/widgets/stickyButton/presentation/view/StickyButtonContainerView;", "containerView", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class StickyButtonSubwidgetViewHolder extends AbstractC6064a<StickyButtonVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ButtonV3View button;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StickyButtonSubwidgetViewHolder(@NotNull i container, @NotNull d customActionHandlersStoreFactory, @NotNull HandlersInhibitor inhibitor, @NotNull InterfaceC6068e<LinearLayout> viewFactory) {
        super(container, viewFactory);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(inhibitor, "inhibitor");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        Context context = getView().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ButtonV3View buttonV3View = new ButtonV3View(context, null, 0, 0, 14, null);
        buttonV3View.setId(View.generateViewId());
        buttonV3View.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        getContainerView().addView(buttonV3View);
        this.button = buttonV3View;
        this.actionHandler = new ActionHandler.Builder(container, this).enableClickThrottling(inhibitor).customActionHandlers(new StickyButtonSubwidgetViewHolder$actionHandler$1(customActionHandlersStoreFactory)).buildHandler();
    }

    private final void bindContainer(StickyButtonVO item) {
        StickyButtonContainerView containerView = getContainerView();
        int px = item.getTopPadding().getPx();
        Context context = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int px2 = ResourceExtKt.toPx(px, context);
        int px3 = item.getRightPadding().getPx();
        Context context2 = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int px4 = ResourceExtKt.toPx(px3, context2);
        int px5 = item.getBottomPadding().getPx();
        Context context3 = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        int px6 = ResourceExtKt.toPx(px5, context3);
        int px7 = item.getLeftPadding().getPx();
        Context context4 = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        ViewExtKt.updatePadding(containerView, ResourceExtKt.toPx(px7, context4), px2, px4, px6);
        containerView.bind(item);
    }

    private final StickyButtonContainerView getContainerView() {
        View view = getView();
        Intrinsics.g(view, "null cannot be cast to non-null type ru.ozon.app.android.cml.delivery.widgets.stickyButton.presentation.view.StickyButtonContainerView");
        return (StickyButtonContainerView) view;
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull StickyButtonVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        bindContainer(item);
        ButtonV3HolderKt.bind(this.button, item.getButton(), this.actionHandler);
    }
}
