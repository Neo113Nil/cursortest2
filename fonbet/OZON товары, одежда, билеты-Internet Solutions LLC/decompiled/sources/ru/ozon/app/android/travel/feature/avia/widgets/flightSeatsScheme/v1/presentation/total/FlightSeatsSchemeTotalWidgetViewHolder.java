package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.total;

import Bi.a;
import Sc.o;
import Vg.d;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.LinearLayout;
import androidx.lifecycle.J;
import d20.AbstractC6064a;
import d20.InterfaceC6068e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.travel.feature.avia.shared.orderTotal.OrderTotalVO;
import ru.ozon.app.android.travel.feature.avia.shared.orderTotal.OrderTotalView;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.FlightSeatsSchemeViewModel;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.total.FlightSeatsSchemeTotalWidgetViewHolder;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\u0010\t\u001a\u00060\u0007j\u0002`\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001e\u0010\u001dJ3\u0010%\u001a\u00020$2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001f2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00110\"H\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0011H\u0016¢\u0006\u0004\b'\u0010\u001dJ\u0017\u0010)\u001a\u00020\u00112\u0006\u0010(\u001a\u00020\u0002H\u0016¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010+R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R \u00101\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u00110\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00106\u001a\u0004\u0018\u0001038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b4\u00105¨\u00067"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/total/FlightSeatsSchemeTotalWidgetViewHolder;", "Ld20/a;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/total/FlightSeatsSchemeTotalVO;", "Ll10/i;", "container", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/FlightSeatsSchemeViewModel;", "flightSeatsSchemeViewModel", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "<init>", "(Ll10/i;Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/FlightSeatsSchemeViewModel;LVg/d;Ld20/e;)V", "Landroidx/lifecycle/J;", "lifecycle", "", "observeLiveData", "(Landroidx/lifecycle/J;)V", "Lru/ozon/app/android/travel/feature/avia/shared/orderTotal/OrderTotalVO;", "orderTotalVO", "updateOrderDetails", "(Lru/ozon/app/android/travel/feature/avia/shared/orderTotal/OrderTotalVO;)V", "", "isVisible", "changeVisibility", "(Z)V", "hideOrderTotalView", "()V", "showOrderTotalView", "", "from", "to", "Lkotlin/Function1;", "update", "Landroid/animation/ValueAnimator;", "translateYAnimator", "(FFLkotlin/jvm/functions/Function1;)Landroid/animation/ValueAnimator;", "onWidgetCreated", "item", "bind", "(Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/total/FlightSeatsSchemeTotalVO;)V", "Ll10/i;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/FlightSeatsSchemeViewModel;", "Landroid/view/animation/AccelerateDecelerateInterpolator;", "orderDetailsInterpolator", "Landroid/view/animation/AccelerateDecelerateInterpolator;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/travel/feature/avia/shared/orderTotal/OrderTotalView;", "getOrderTotalView", "()Lru/ozon/app/android/travel/feature/avia/shared/orderTotal/OrderTotalView;", "orderTotalView", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlightSeatsSchemeTotalWidgetViewHolder extends AbstractC6064a<FlightSeatsSchemeTotalVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final i container;

    @NotNull
    private final FlightSeatsSchemeViewModel flightSeatsSchemeViewModel;

    @NotNull
    private final AccelerateDecelerateInterpolator orderDetailsInterpolator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlightSeatsSchemeTotalWidgetViewHolder(@NotNull i container, @NotNull FlightSeatsSchemeViewModel flightSeatsSchemeViewModel, @NotNull d customActionHandlersStoreFactory, @NotNull InterfaceC6068e<LinearLayout> viewFactory) {
        super(container, viewFactory);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(flightSeatsSchemeViewModel, "flightSeatsSchemeViewModel");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        this.container = container;
        this.flightSeatsSchemeViewModel = flightSeatsSchemeViewModel;
        this.orderDetailsInterpolator = new AccelerateDecelerateInterpolator();
        this.actionHandler = new ActionHandler.Builder(container, this).customActionHandlers(new FlightSeatsSchemeTotalWidgetViewHolder$actionHandler$1(customActionHandlersStoreFactory)).buildHandler();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void changeVisibility(boolean isVisible) {
        if (isVisible) {
            showOrderTotalView();
        } else {
            if (isVisible) {
                throw new o();
            }
            hideOrderTotalView();
        }
    }

    private final OrderTotalView getOrderTotalView() {
        View view = getView();
        if (view instanceof OrderTotalView) {
            return (OrderTotalView) view;
        }
        return null;
    }

    private final void hideOrderTotalView() {
        translateYAnimator(0.0f, getView().getHeight(), new FlightSeatsSchemeTotalWidgetViewHolder$hideOrderTotalView$1(getView())).start();
    }

    private final void observeLiveData(J lifecycle) {
        FlightSeatsSchemeViewModel flightSeatsSchemeViewModel = this.flightSeatsSchemeViewModel;
        flightSeatsSchemeViewModel.updateOrderTotalLiveData().observe(lifecycle, new FlightSeatsSchemeTotalWidgetViewHolder$sam$androidx_lifecycle_Observer$0(new FlightSeatsSchemeTotalWidgetViewHolder$observeLiveData$1$1(this)));
        flightSeatsSchemeViewModel.changeOrderTotalVisibilityLiveData().observe(lifecycle, new FlightSeatsSchemeTotalWidgetViewHolder$sam$androidx_lifecycle_Observer$0(new FlightSeatsSchemeTotalWidgetViewHolder$observeLiveData$1$2(this)));
    }

    private final void showOrderTotalView() {
        translateYAnimator(getView().getTranslationY(), 0.0f, new FlightSeatsSchemeTotalWidgetViewHolder$showOrderTotalView$1(getView())).start();
    }

    private final ValueAnimator translateYAnimator(float from, float to, final Function1<? super Float, Unit> update) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(from, to);
        ofFloat.setInterpolator(this.orderDetailsInterpolator);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: QM.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                FlightSeatsSchemeTotalWidgetViewHolder.translateYAnimator$lambda$2$lambda$1(Function1.this, valueAnimator);
            }
        });
        Intrinsics.checkNotNullExpressionValue(ofFloat, "apply(...)");
        return ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void translateYAnimator$lambda$2$lambda$1(Function1 function1, ValueAnimator valueAnimator) {
        function1.invoke((Float) a.b(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void updateOrderDetails(OrderTotalVO orderTotalVO) {
        FlightSeatsSchemeTotalVO flightSeatsSchemeTotalVO;
        FlightSeatsSchemeTotalVO copy$default;
        if (orderTotalVO == null || (flightSeatsSchemeTotalVO = (FlightSeatsSchemeTotalVO) getBoundData()) == null || (copy$default = FlightSeatsSchemeTotalVO.copy$default(flightSeatsSchemeTotalVO, 0L, orderTotalVO, 1, null)) == null) {
            return;
        }
        this.container.M().update(copy$default);
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        observeLiveData(this);
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull FlightSeatsSchemeTotalVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        OrderTotalView orderTotalView = getOrderTotalView();
        if (orderTotalView != null) {
            orderTotalView.bind(item.getTotal(), this.actionHandler);
        }
    }
}
