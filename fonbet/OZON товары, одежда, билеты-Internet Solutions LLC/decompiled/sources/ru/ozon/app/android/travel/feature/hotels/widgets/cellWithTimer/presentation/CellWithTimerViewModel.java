package ru.ozon.app.android.travel.feature.hotels.widgets.cellWithTimer.presentation;

import androidx.lifecycle.P;
import androidx.lifecycle.V;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.widgets.cellWithTimer.data.CellWithTimerMapper;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import xe.B0;
import xe.C10727i;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\r\u0010\fJ\u001d\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001aR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/cellWithTimer/presentation/CellWithTimerViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/travel/feature/hotels/widgets/cellWithTimer/data/CellWithTimerMapper;", "mapper", "<init>", "(Lru/ozon/app/android/travel/feature/hotels/widgets/cellWithTimer/data/CellWithTimerMapper;)V", "", "startTimer", "()V", "Landroidx/lifecycle/P;", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "timerTextLiveData", "()Landroidx/lifecycle/P;", "timerStoppedLiveData", "", "remainingSeconds", "", "isNotInitialVo", "setUp", "(JZ)V", "Lru/ozon/app/android/travel/feature/hotels/widgets/cellWithTimer/data/CellWithTimerMapper;", "J", "Lxe/B0;", "timerJob", "Lxe/B0;", "Landroidx/lifecycle/V;", "Landroidx/lifecycle/V;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CellWithTimerViewModel extends w0 {

    @NotNull
    private final CellWithTimerMapper mapper;
    private long remainingSeconds;
    private B0 timerJob;

    @NotNull
    private final SingleLiveEvent<Unit> timerStoppedLiveData;

    @NotNull
    private final V<OzonSpannableString> timerTextLiveData;

    public CellWithTimerViewModel(@NotNull CellWithTimerMapper mapper) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.mapper = mapper;
        this.timerTextLiveData = new V<>();
        this.timerStoppedLiveData = new SingleLiveEvent<>();
    }

    private final void startTimer() {
        B0 b02 = this.timerJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.timerJob = C10727i.c(x0.a(this), null, null, new CellWithTimerViewModel$startTimer$1(this, null), 3);
    }

    public final void setUp(long remainingSeconds, boolean isNotInitialVo) {
        if (isNotInitialVo) {
            return;
        }
        this.remainingSeconds = remainingSeconds;
        startTimer();
    }

    @NotNull
    public final P<Unit> timerStoppedLiveData() {
        return this.timerStoppedLiveData;
    }

    @NotNull
    public final P<OzonSpannableString> timerTextLiveData() {
        return this.timerTextLiveData;
    }
}
