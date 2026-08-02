package ru.ozon.app.android.travel.feature.avia.widgets.aviaBookedTicketInfo.presentation;

import android.os.CountDownTimer;
import androidx.lifecycle.P;
import androidx.lifecycle.V;
import androidx.lifecycle.w0;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaBookedTicketInfo.data.AviaBookedTicketInfoMapper;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\t¢\u0006\u0004\b\u000e\u0010\fJ3\u0010\u0014\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0019R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001bR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaBookedTicketInfo/presentation/AviaBookedTicketInfoViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaBookedTicketInfo/data/AviaBookedTicketInfoMapper;", "mapper", "<init>", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaBookedTicketInfo/data/AviaBookedTicketInfoMapper;)V", "", "onCleared", "()V", "Landroidx/lifecycle/P;", "", "badgeLiveData", "()Landroidx/lifecycle/P;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionLiveData", "badgeText", "", "timeToPay", "mappingTime", "timeOutAction", "startTimers", "(Ljava/lang/String;Ljava/lang/Long;JLru/ozon/uni/atoms/af/AtomAction;)V", "stopTimer", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaBookedTicketInfo/data/AviaBookedTicketInfoMapper;", "Landroidx/lifecycle/V;", "Landroidx/lifecycle/V;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Landroid/os/CountDownTimer;", DynamicElementDTO.TIMER, "Landroid/os/CountDownTimer;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AviaBookedTicketInfoViewModel extends w0 {

    @NotNull
    private final SingleLiveEvent<AtomAction> actionLiveData;

    @NotNull
    private final V<String> badgeLiveData;

    @NotNull
    private final AviaBookedTicketInfoMapper mapper;
    private CountDownTimer timer;

    public AviaBookedTicketInfoViewModel(@NotNull AviaBookedTicketInfoMapper mapper) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.mapper = mapper;
        this.badgeLiveData = new V<>();
        this.actionLiveData = new SingleLiveEvent<>();
    }

    @NotNull
    public final P<AtomAction> actionLiveData() {
        return this.actionLiveData;
    }

    @NotNull
    public final P<String> badgeLiveData() {
        return this.badgeLiveData;
    }

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
        CountDownTimer countDownTimer = this.timer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    public final void startTimers(final String badgeText, Long timeToPay, long mappingTime, final AtomAction timeOutAction) {
        CountDownTimer countDownTimer = this.timer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        if (timeToPay == null || timeOutAction == null) {
            return;
        }
        final long longValue = timeToPay.longValue() - (System.currentTimeMillis() - mappingTime);
        if (longValue <= 0) {
            this.actionLiveData.setValue(timeOutAction);
            return;
        }
        final long millis = TimeUnit.SECONDS.toMillis(1L);
        CountDownTimer countDownTimer2 = new CountDownTimer(longValue, millis) { // from class: ru.ozon.app.android.travel.feature.avia.widgets.aviaBookedTicketInfo.presentation.AviaBookedTicketInfoViewModel$startTimers$1
            @Override // android.os.CountDownTimer
            public void onFinish() {
                SingleLiveEvent singleLiveEvent;
                singleLiveEvent = this.actionLiveData;
                singleLiveEvent.setValue(timeOutAction);
            }

            @Override // android.os.CountDownTimer
            public void onTick(long millisUntilFinished) {
                String str;
                V v11;
                AviaBookedTicketInfoMapper aviaBookedTicketInfoMapper;
                if (millisUntilFinished >= 0) {
                    aviaBookedTicketInfoMapper = this.mapper;
                    str = aviaBookedTicketInfoMapper.formattedTimerText(millisUntilFinished);
                } else {
                    str = "";
                }
                v11 = this.badgeLiveData;
                v11.setValue(badgeText + " " + str);
            }
        };
        this.timer = countDownTimer2;
        countDownTimer2.start();
    }

    public final void stopTimer() {
        CountDownTimer countDownTimer = this.timer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.timer = null;
    }
}
