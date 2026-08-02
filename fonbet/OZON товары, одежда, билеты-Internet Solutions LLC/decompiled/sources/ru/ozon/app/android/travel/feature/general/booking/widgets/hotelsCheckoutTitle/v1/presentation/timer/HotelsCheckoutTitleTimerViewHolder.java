package ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsCheckoutTitle.v1.presentation.timer;

import android.view.View;
import d20.AbstractC6065b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.travel.utils.utils.TimerHelper;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\"\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\b0\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsCheckoutTitle/v1/presentation/timer/HotelsCheckoutTitleTimerViewHolder;", "Ld20/b;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsCheckoutTitle/v1/presentation/timer/HotelsCheckoutTitleTimerVO;", "Ll10/i;", "container", "<init>", "(Ll10/i;)V", "item", "", "bind", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsCheckoutTitle/v1/presentation/timer/HotelsCheckoutTitleTimerVO;)V", "onWidgetDestroyed", "()V", "Landroid/view/View;", "metricView", "Landroid/view/View;", "getMetricView", "()Landroid/view/View;", "Lru/ozon/app/android/travel/utils/utils/TimerHelper;", "timerHelper", "Lru/ozon/app/android/travel/utils/utils/TimerHelper;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HotelsCheckoutTitleTimerViewHolder extends AbstractC6065b<HotelsCheckoutTitleTimerVO> {

    @NotNull
    private Function1<? super AtomAction, Unit> actionHandler;
    private final View metricView;
    private TimerHelper timerHelper;

    public HotelsCheckoutTitleTimerViewHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.actionHandler = new ActionHandler.Builder(container, this).buildHandler();
    }

    @Override // d20.AbstractC6065b
    public View getMetricView() {
        return this.metricView;
    }

    @Override // d20.AbstractC6065b
    public void onWidgetDestroyed() {
        TimerHelper timerHelper = this.timerHelper;
        if (timerHelper != null) {
            timerHelper.stopTimer();
        }
        this.timerHelper = null;
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull HotelsCheckoutTitleTimerVO item) {
        TimerHelper timerHelper;
        Intrinsics.checkNotNullParameter(item, "item");
        TimerHelper timerHelper2 = this.timerHelper;
        if (timerHelper2 != null) {
            timerHelper2.stopTimer();
        }
        this.timerHelper = new TimerHelper(getLifecycle());
        if (item.getDeadline() != null) {
            TimerHelper timerHelper3 = this.timerHelper;
            if (timerHelper3 != null) {
                TimerHelper.startTimer$default(timerHelper3, item.getDeadline(), new HotelsCheckoutTitleTimerViewHolder$bind$1(this, item), (Function1) null, 4, (Object) null);
                return;
            }
            return;
        }
        if (item.getEndTime() == null || (timerHelper = this.timerHelper) == null) {
            return;
        }
        TimerHelper.startTimer$default(timerHelper, item.getEndTime(), new HotelsCheckoutTitleTimerViewHolder$bind$2(this, item), (Function1) null, 4, (Object) null);
    }
}
