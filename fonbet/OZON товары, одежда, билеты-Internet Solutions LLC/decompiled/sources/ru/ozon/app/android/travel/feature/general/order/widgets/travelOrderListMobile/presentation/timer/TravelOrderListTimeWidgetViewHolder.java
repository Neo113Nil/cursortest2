package ru.ozon.app.android.travel.feature.general.order.widgets.travelOrderListMobile.presentation.timer;

import android.view.View;
import d20.AbstractC6065b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000fR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\t0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderListMobile/presentation/timer/TravelOrderListTimeWidgetViewHolder;", "Ld20/b;", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderListMobile/presentation/timer/TravelOrderListTimerVO;", "Ll10/i;", "container", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderListMobile/presentation/timer/TravelOrderListTimerViewModel;", "viewModel", "<init>", "(Ll10/i;Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderListMobile/presentation/timer/TravelOrderListTimerViewModel;)V", "", "onWidgetCreated", "()V", "item", "bind", "(Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderListMobile/presentation/timer/TravelOrderListTimerVO;)V", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderListMobile/presentation/timer/TravelOrderListTimerViewModel;", "Landroid/view/View;", "metricView", "Landroid/view/View;", "getMetricView", "()Landroid/view/View;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelOrderListTimeWidgetViewHolder extends AbstractC6065b<TravelOrderListTimerVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private final View metricView;

    @NotNull
    private final TravelOrderListTimerViewModel viewModel;

    public TravelOrderListTimeWidgetViewHolder(@NotNull i container, @NotNull TravelOrderListTimerViewModel viewModel) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.viewModel = viewModel;
        this.actionHandler = new ActionHandler.Builder(container, this).buildHandler();
    }

    @Override // d20.AbstractC6065b
    public View getMetricView() {
        return this.metricView;
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        super.onWidgetCreated();
        this.viewModel.actionLiveData().observe(this, new TravelOrderListTimeWidgetViewHolder$sam$androidx_lifecycle_Observer$0(this.actionHandler));
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull TravelOrderListTimerVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.viewModel.startTimer(item);
    }
}
