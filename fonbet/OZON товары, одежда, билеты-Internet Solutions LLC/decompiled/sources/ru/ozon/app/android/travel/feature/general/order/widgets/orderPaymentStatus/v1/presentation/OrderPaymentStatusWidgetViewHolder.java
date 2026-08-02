package ru.ozon.app.android.travel.feature.general.order.widgets.orderPaymentStatus.v1.presentation;

import Vg.d;
import W10.c;
import WZ.l;
import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.travel.feature.general.order.widgets.orderPaymentStatus.v1.view.OrderPaymentStatusView;
import ru.ozon.app.android.travel.utils.utils.TimerHelper;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0015J\u001f\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ)\u0010!\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010#R\u0018\u0010\u0007\u001a\u00060\u0005j\u0002`\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010$R\u0018\u0010\n\u001a\u00060\bj\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010%R \u0010(\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00110&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/orderPaymentStatus/v1/presentation/OrderPaymentStatusWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/general/order/widgets/orderPaymentStatus/v1/presentation/OrderPaymentStatusVO;", "Lru/ozon/app/android/travel/feature/general/order/widgets/orderPaymentStatus/v1/view/OrderPaymentStatusView;", "view", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "<init>", "(Lru/ozon/app/android/travel/feature/general/order/widgets/orderPaymentStatus/v1/view/OrderPaymentStatusView;LWZ/l;LVg/d;Lru/ozon/app/android/composer/ComposerReferences;)V", "", "leftTimer", "", "updateTimer", "(J)V", "startTimer", "()V", "onViewInVisibleBounds", "onViewOutOfVisibleBounds", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/travel/feature/general/order/widgets/orderPaymentStatus/v1/presentation/OrderPaymentStatusVO;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/travel/feature/general/order/widgets/orderPaymentStatus/v1/presentation/OrderPaymentStatusVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/travel/feature/general/order/widgets/orderPaymentStatus/v1/view/OrderPaymentStatusView;", "LWZ/l;", "LVg/d;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/travel/utils/utils/TimerHelper;", DynamicElementDTO.TIMER, "Lru/ozon/app/android/travel/utils/utils/TimerHelper;", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OrderPaymentStatusWidgetViewHolder extends k<OrderPaymentStatusVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final d customActionHandlersStoreFactory;
    private TimerHelper timer;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final OrderPaymentStatusView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderPaymentStatusWidgetViewHolder(@NotNull OrderPaymentStatusView view, @NotNull l tokenizedAnalytics, @NotNull d customActionHandlersStoreFactory, @NotNull ComposerReferences references) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(references, "references");
        this.view = view;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        this.actionHandler = new ActionHandler.Builder(references, this).customActionHandlers(new OrderPaymentStatusWidgetViewHolder$actionHandler$1(this)).buildHandler();
    }

    private final void startTimer() {
        TimerHelper timerHelper;
        TimerHelper timerHelper2 = this.timer;
        if (timerHelper2 != null) {
            timerHelper2.stopTimer();
        }
        this.timer = new TimerHelper(getLifecycle());
        OrderPaymentStatusVO boundData = getBoundData();
        if ((boundData != null ? boundData.getDeadline() : null) != null) {
            TimerHelper timerHelper3 = this.timer;
            if (timerHelper3 != null) {
                OrderPaymentStatusVO boundData2 = getBoundData();
                timerHelper3.startTimer(boundData2 != null ? boundData2.getDeadline() : null, OrderPaymentStatusWidgetViewHolder$startTimer$1.INSTANCE, new OrderPaymentStatusWidgetViewHolder$startTimer$2(this));
                return;
            }
            return;
        }
        OrderPaymentStatusVO boundData3 = getBoundData();
        if ((boundData3 != null ? boundData3.getEndTime() : null) == null || (timerHelper = this.timer) == null) {
            return;
        }
        OrderPaymentStatusVO boundData4 = getBoundData();
        timerHelper.startTimer(boundData4 != null ? boundData4.getEndTime() : null, OrderPaymentStatusWidgetViewHolder$startTimer$3.INSTANCE, new OrderPaymentStatusWidgetViewHolder$startTimer$4(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateTimer(long leftTimer) {
        this.view.updateTimerTitle(leftTimer);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        super.onViewInVisibleBounds();
        startTimer();
    }

    @Override // jk0.j, lk0.b
    public void onViewOutOfVisibleBounds() {
        TimerHelper timerHelper = this.timer;
        if (timerHelper != null) {
            timerHelper.stopTimer();
        }
        this.timer = null;
        super.onViewOutOfVisibleBounds();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull OrderPaymentStatusVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.view.bind(item, this.actionHandler);
        if (isInVisibleBounds()) {
            startTimer();
        }
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull OrderPaymentStatusVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        t viewEvent = item.getViewEvent();
        if (viewEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, viewEvent, null, 2, null);
        }
    }
}
