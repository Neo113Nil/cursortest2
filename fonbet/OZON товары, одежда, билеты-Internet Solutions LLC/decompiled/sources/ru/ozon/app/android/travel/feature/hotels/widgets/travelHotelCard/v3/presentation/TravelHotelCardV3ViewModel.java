package ru.ozon.app.android.travel.feature.hotels.widgets.travelHotelCard.v3.presentation;

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

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000fR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/travelHotelCard/v3/presentation/TravelHotelCardV3ViewModel;", "Landroidx/lifecycle/w0;", "<init>", "()V", "Landroidx/lifecycle/P;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionLiveData", "()Landroidx/lifecycle/P;", "", "timeLeft", "action", "", "startTimer", "(ILru/ozon/uni/atoms/af/AtomAction;)V", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lxe/B0;", "timerJob", "Lxe/B0;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelHotelCardV3ViewModel extends w0 {

    @NotNull
    private final SingleLiveEvent<AtomAction> actionLiveData = new SingleLiveEvent<>();
    private B0 timerJob;

    @NotNull
    public final P<AtomAction> actionLiveData() {
        return this.actionLiveData;
    }

    public final void startTimer(int timeLeft, @NotNull AtomAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        B0 b02 = this.timerJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.timerJob = C10727i.c(x0.a(this), null, null, new TravelHotelCardV3ViewModel$startTimer$1(timeLeft, this, action, null), 3);
    }
}
