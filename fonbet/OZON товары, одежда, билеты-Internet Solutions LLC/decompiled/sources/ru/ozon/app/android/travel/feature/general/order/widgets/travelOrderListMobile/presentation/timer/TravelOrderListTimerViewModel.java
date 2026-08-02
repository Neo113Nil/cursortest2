package ru.ozon.app.android.travel.feature.general.order.widgets.travelOrderListMobile.presentation.timer;

import androidx.lifecycle.P;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.B0;
import xe.C10727i;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000eR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderListMobile/presentation/timer/TravelOrderListTimerViewModel;", "Landroidx/lifecycle/w0;", "<init>", "()V", "Landroidx/lifecycle/P;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionLiveData", "()Landroidx/lifecycle/P;", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderListMobile/presentation/timer/TravelOrderListTimerVO;", "item", "", "startTimer", "(Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderListMobile/presentation/timer/TravelOrderListTimerVO;)V", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lxe/B0;", "timerJob", "Lxe/B0;", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelOrderListTimerViewModel extends w0 {

    @NotNull
    private final SingleLiveEvent<AtomAction> actionLiveData = new SingleLiveEvent<>();
    private B0 timerJob;

    @NotNull
    public final P<AtomAction> actionLiveData() {
        return this.actionLiveData;
    }

    public final void startTimer(@NotNull TravelOrderListTimerVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        B0 b02 = this.timerJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.timerJob = C10727i.c(x0.a(this), null, null, new TravelOrderListTimerViewModel$startTimer$1(item, this, null), 3);
    }
}
