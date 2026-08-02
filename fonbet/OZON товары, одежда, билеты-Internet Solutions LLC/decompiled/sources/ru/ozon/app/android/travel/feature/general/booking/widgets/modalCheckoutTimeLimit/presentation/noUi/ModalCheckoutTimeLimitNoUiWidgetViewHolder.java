package ru.ozon.app.android.travel.feature.general.booking.widgets.modalCheckoutTimeLimit.presentation.noUi;

import Vg.d;
import android.view.View;
import d20.AbstractC6065b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.travel.feature.general.booking.widgets.modalCheckoutTimeLimit.presentation.ModalCheckoutTimeLimitViewModel;
import ru.ozon.app.android.travel.utils.utils.TimerHelper;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0019R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR \u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00100\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/modalCheckoutTimeLimit/presentation/noUi/ModalCheckoutTimeLimitNoUiWidgetViewHolder;", "Ld20/b;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/modalCheckoutTimeLimit/presentation/noUi/ModalCheckoutTimeLimitTimerVO;", "Ll10/i;", "container", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/travel/feature/general/booking/widgets/modalCheckoutTimeLimit/presentation/ModalCheckoutTimeLimitViewModel;", "viewModel", "<init>", "(Ll10/i;LVg/d;Lru/ozon/app/android/travel/feature/general/booking/widgets/modalCheckoutTimeLimit/presentation/ModalCheckoutTimeLimitViewModel;)V", "", "deadline", "Lru/ozon/uni/atoms/af/AtomAction;", "finishAction", "", "startTimer", "(JLru/ozon/uni/atoms/af/AtomAction;)V", "stopTimer", "()V", "onWidgetDestroyed", "item", "bind", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/modalCheckoutTimeLimit/presentation/noUi/ModalCheckoutTimeLimitTimerVO;)V", "Lru/ozon/app/android/travel/feature/general/booking/widgets/modalCheckoutTimeLimit/presentation/ModalCheckoutTimeLimitViewModel;", "Landroid/view/View;", "metricView", "Landroid/view/View;", "getMetricView", "()Landroid/view/View;", "Lkotlin/Function1;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/travel/utils/utils/TimerHelper;", "timerHelper", "Lru/ozon/app/android/travel/utils/utils/TimerHelper;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ModalCheckoutTimeLimitNoUiWidgetViewHolder extends AbstractC6065b<ModalCheckoutTimeLimitTimerVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private final View metricView;
    private TimerHelper timerHelper;

    @NotNull
    private final ModalCheckoutTimeLimitViewModel viewModel;

    public ModalCheckoutTimeLimitNoUiWidgetViewHolder(@NotNull i container, @NotNull d customActionHandlersStoreFactory, @NotNull ModalCheckoutTimeLimitViewModel viewModel) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.viewModel = viewModel;
        this.actionHandler = new ActionHandler.Builder(container, this).customActionHandlers(new ModalCheckoutTimeLimitNoUiWidgetViewHolder$actionHandler$1(customActionHandlersStoreFactory)).buildHandler();
    }

    private final void startTimer(long deadline, AtomAction finishAction) {
        stopTimer();
        TimerHelper timerHelper = new TimerHelper(getLifecycle());
        this.timerHelper = timerHelper;
        timerHelper.startTimer(Long.valueOf(deadline), new ModalCheckoutTimeLimitNoUiWidgetViewHolder$startTimer$1(this, finishAction), new ModalCheckoutTimeLimitNoUiWidgetViewHolder$startTimer$2(this.viewModel));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopTimer() {
        TimerHelper timerHelper = this.timerHelper;
        if (timerHelper != null) {
            timerHelper.stopTimer();
        }
        this.timerHelper = null;
    }

    @Override // d20.AbstractC6065b
    public View getMetricView() {
        return this.metricView;
    }

    @Override // d20.AbstractC6065b
    public void onWidgetDestroyed() {
        stopTimer();
        super.onWidgetDestroyed();
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull ModalCheckoutTimeLimitTimerVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        startTimer(item.getDeadline(), item.getTimeOutAction());
    }
}
