package ru.ozon.app.android.timerMolecule.presentation;

import Ae.C2399j;
import Ae.C2408n0;
import Ae.O0;
import Ae.w0;
import Ae.x0;
import He.b;
import Sc.s;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.Hours;
import org.joda.time.Interval;
import org.joda.time.Period;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.pdp.ui.molecules.R$plurals;
import ru.ozon.app.android.pdp.ui.molecules.R$string;
import ru.ozon.app.android.pdp.utils.CoroutinesKt;
import ru.ozon.app.android.timerMolecule.presentation.TimerTickData;
import ru.ozon.app.android.timerMolecule.presentation.TimerViewModel;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.utils.DateUtilsKt;
import xe.B0;
import xe.C10720e0;
import xe.E0;
import xe.H0;
import xe.J;
import xe.L;
import xe.M;
import xe.N;
import xe.X0;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0002H\u0082@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0017\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0016\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0007J\u000f\u0010\u0018\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR \u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\"\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lru/ozon/app/android/timerMolecule/presentation/TimerViewModelImpl;", "Lru/ozon/app/android/timerMolecule/presentation/TimerViewModel;", "Lru/ozon/app/android/timerMolecule/presentation/TimerVO;", "initialTimer", "", "useCompactStyle", "<init>", "(Lru/ozon/app/android/timerMolecule/presentation/TimerVO;Z)V", "Lru/ozon/app/android/timerMolecule/presentation/TimerTickData;", "state", "", "setTimerState", "(Lru/ozon/app/android/timerMolecule/presentation/TimerTickData;)V", DynamicElementDTO.TIMER, "updateTimeRemain", "(Lru/ozon/app/android/timerMolecule/presentation/TimerVO;Lkotlin/coroutines/d;)Ljava/lang/Object;", "calculateCurrentTimerState", "(Lru/ozon/app/android/timerMolecule/presentation/TimerVO;)Lru/ozon/app/android/timerMolecule/presentation/TimerTickData;", "Lorg/joda/time/Interval;", "interval", "getTimerText", "(Lorg/joda/time/Interval;)Lru/ozon/app/android/timerMolecule/presentation/TimerTickData;", "withoutStart", "bindTimer", "onCleared", "()V", "Z", "Lxe/B0;", "timerJob", "Lxe/B0;", "isFinished", "LAe/w0;", "Lru/ozon/app/android/timerMolecule/presentation/TimerViewModel$Action;", "action", "LAe/w0;", "getAction", "()LAe/w0;", "LAe/x0;", "timerState", "LAe/x0;", "getTimerState", "()LAe/x0;", "Lxe/M;", "scope", "Lxe/M;", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TimerViewModelImpl implements TimerViewModel {

    @NotNull
    private final w0<TimerViewModel.Action> action;
    private boolean isFinished;

    @NotNull
    private final M scope;
    private B0 timerJob;

    @NotNull
    private final x0<TimerTickData> timerState;
    private final boolean useCompactStyle;

    /* JADX WARN: Multi-variable type inference failed */
    public TimerViewModelImpl() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    private final TimerTickData calculateCurrentTimerState(TimerVO timer) {
        DateTime j11 = new DateTime().j(timer.getTimeDelta());
        if (j11.compareTo(timer.getEndTimestamp()) > 0) {
            return null;
        }
        return getTimerText(new Interval(j11, timer.getEndTimestamp()));
    }

    private final TimerTickData getTimerText(Interval interval) {
        interval.getClass();
        Period period = new Period(interval.a(), interval.b(), interval.getChronology());
        int n11 = Days.C(interval).n();
        if (n11 >= 1) {
            int i11 = n11 + 1;
            return new TimerTickData(StringProvider.getQuantityString(R$plurals.reviews_remain_days_without_left, i11, Integer.valueOf(i11)), TimerTickData.TimerTextType.DAYS);
        }
        int s11 = Hours.A(interval).s();
        if (s11 < 1) {
            return new TimerTickData(StringProvider.getString(this.useCompactStyle ? R$string.promo_review_time_remaining_minutes_compact : R$string.promo_review_time_remaining_minutes, DateUtilsKt.toTwoDigitString(period.y()), DateUtilsKt.toTwoDigitString(period.B())), TimerTickData.TimerTextType.MINUTES);
        }
        return new TimerTickData(StringProvider.getString(this.useCompactStyle ? R$string.promo_review_time_remaining_hours_compact : R$string.promo_review_time_remaining_hours, DateUtilsKt.toTwoDigitString(s11), DateUtilsKt.toTwoDigitString(period.y()), DateUtilsKt.toTwoDigitString(period.B())), TimerTickData.TimerTextType.HOURS);
    }

    private final void setTimerState(TimerTickData state) {
        x0<TimerTickData> timerState = getTimerState();
        if (state == null) {
            state = getTimerText(new Interval());
        }
        timerState.setValue(state);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object updateTimeRemain(TimerVO timerVO, d<? super Unit> dVar) {
        TimerViewModelImpl$updateTimeRemain$1 timerViewModelImpl$updateTimeRemain$1;
        int i11;
        TimerViewModelImpl timerViewModelImpl;
        B0 b02;
        if (dVar instanceof TimerViewModelImpl$updateTimeRemain$1) {
            timerViewModelImpl$updateTimeRemain$1 = (TimerViewModelImpl$updateTimeRemain$1) dVar;
            int i12 = timerViewModelImpl$updateTimeRemain$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                timerViewModelImpl$updateTimeRemain$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = timerViewModelImpl$updateTimeRemain$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = timerViewModelImpl$updateTimeRemain$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    if (this.isFinished) {
                        return Unit.f71690a;
                    }
                    TimerTickData calculateCurrentTimerState = calculateCurrentTimerState(timerVO);
                    if (calculateCurrentTimerState != null) {
                        setTimerState(calculateCurrentTimerState);
                        return Unit.f71690a;
                    }
                    this.isFinished = true;
                    w0<TimerViewModel.Action> action = getAction();
                    TimerViewModel.Action.OnTimerFinished onTimerFinished = TimerViewModel.Action.OnTimerFinished.INSTANCE;
                    timerViewModelImpl$updateTimeRemain$1.L$0 = this;
                    timerViewModelImpl$updateTimeRemain$1.label = 1;
                    if (action.emit(onTimerFinished, timerViewModelImpl$updateTimeRemain$1) == aVar) {
                        return aVar;
                    }
                    timerViewModelImpl = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    timerViewModelImpl = (TimerViewModelImpl) timerViewModelImpl$updateTimeRemain$1.L$0;
                    s.b(obj);
                }
                b02 = timerViewModelImpl.timerJob;
                if (b02 != null) {
                    b02.j(null);
                }
                timerViewModelImpl.timerJob = null;
                return Unit.f71690a;
            }
        }
        timerViewModelImpl$updateTimeRemain$1 = new TimerViewModelImpl$updateTimeRemain$1(this, dVar);
        Object obj2 = timerViewModelImpl$updateTimeRemain$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = timerViewModelImpl$updateTimeRemain$1.label;
        if (i11 != 0) {
        }
        b02 = timerViewModelImpl.timerJob;
        if (b02 != null) {
        }
        timerViewModelImpl.timerJob = null;
        return Unit.f71690a;
    }

    @Override // ru.ozon.app.android.timerMolecule.presentation.TimerViewModel
    public void bindTimer(TimerVO timer, boolean withoutStart) {
        this.isFinished = false;
        B0 b02 = this.timerJob;
        if (b02 != null) {
            b02.j(null);
        }
        if (timer != null) {
            setTimerState(calculateCurrentTimerState(timer));
            if (withoutStart) {
                return;
            }
            this.timerJob = C2399j.C(new C2408n0(CoroutinesKt.interval(1L, TimeUnit.SECONDS), new TimerViewModelImpl$bindTimer$1$1(this, timer, null)), this.scope);
        }
    }

    @Override // ru.ozon.app.android.timerMolecule.presentation.TimerViewModel
    public void onCleared() {
        this.isFinished = false;
        B0 b02 = this.timerJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.timerJob = null;
        E0.d(this.scope.getCoroutineContext());
    }

    public TimerViewModelImpl(TimerVO timerVO, boolean z11) {
        this.useCompactStyle = z11;
        TimerTickData timerTickData = null;
        this.action = Ae.E0.b(1, 0, null, 6);
        if (timerVO != null) {
            TimerTickData calculateCurrentTimerState = calculateCurrentTimerState(timerVO);
            timerTickData = calculateCurrentTimerState == null ? getTimerText(new Interval()) : calculateCurrentTimerState;
        }
        this.timerState = O0.a(timerTickData);
        B0 b11 = X0.b();
        C10720e0 c10720e0 = C10720e0.f105451a;
        CoroutineContext d11 = CoroutineContext.Element.a.d(b.f10879b, (H0) b11);
        Intrinsics.checkNotNullExpressionValue("TimerViewModelImpl", "getSimpleName(...)");
        this.scope = N.a(d11.plus(new L("TimerViewModelImpl")).plus(new TimerViewModelImpl$special$$inlined$CoroutineExceptionHandler$1(J.f105405n0)));
    }

    @Override // ru.ozon.app.android.timerMolecule.presentation.TimerViewModel
    @NotNull
    public w0<TimerViewModel.Action> getAction() {
        return this.action;
    }

    @Override // ru.ozon.app.android.timerMolecule.presentation.TimerViewModel
    @NotNull
    public x0<TimerTickData> getTimerState() {
        return this.timerState;
    }

    public /* synthetic */ TimerViewModelImpl(TimerVO timerVO, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : timerVO, (i11 & 2) != 0 ? false : z11);
    }
}
