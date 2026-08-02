package ru.ozon.app.android.ads.widgets.advRefreshWithDelay.presentation;

import Ae.C2399j;
import Ae.E0;
import Ae.InterfaceC2395h;
import Sc.o;
import Xc.b;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.B0;
import xe.C10727i;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 /2\u00020\u0001:\u0003/01B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003J!\u0010\r\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0010\u0010\u0003J\u0015\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u0003R$\u0010\u001a\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u0014R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010&\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020 0+8F¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u00062"}, d2 = {"Lru/ozon/app/android/ads/widgets/advRefreshWithDelay/presentation/AdvRefreshWithDelayViewModel;", "Landroidx/lifecycle/w0;", "<init>", "()V", "", "fromAnotherPage", "", "refreshFromBackground", "(Z)V", "refreshFromAnotherPage", "", "delay", "isRefreshEnabled", "refreshIfPossible", "(Ljava/lang/Double;Z)V", "refresh", "onCleared", "Lru/ozon/app/android/ads/widgets/advRefreshWithDelay/presentation/AdvRefreshWithDelayVO;", "newVO", "updateVoData", "(Lru/ozon/app/android/ads/widgets/advRefreshWithDelay/presentation/AdvRefreshWithDelayVO;)V", "Lru/ozon/app/android/ads/widgets/advRefreshWithDelay/presentation/AdvRefreshWithDelayViewModel$Refresh;", "typeRefresh", "refreshData", "(Lru/ozon/app/android/ads/widgets/advRefreshWithDelay/presentation/AdvRefreshWithDelayViewModel$Refresh;)V", "startTimer", "viewObject", "Lru/ozon/app/android/ads/widgets/advRefreshWithDelay/presentation/AdvRefreshWithDelayVO;", "getViewObject", "()Lru/ozon/app/android/ads/widgets/advRefreshWithDelay/presentation/AdvRefreshWithDelayVO;", "setViewObject", "LAe/w0;", "", "_refreshEventFlow", "LAe/w0;", "refreshCounter", "I", "Lru/ozon/app/android/ads/widgets/advRefreshWithDelay/presentation/AdvRefreshWithDelayViewModel$TimerState;", "timerState", "Lru/ozon/app/android/ads/widgets/advRefreshWithDelay/presentation/AdvRefreshWithDelayViewModel$TimerState;", "Lxe/B0;", "timerJob", "Lxe/B0;", "LAe/h;", "getRefreshEventFlow", "()LAe/h;", "refreshEventFlow", "Companion", "TimerState", "Refresh", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AdvRefreshWithDelayViewModel extends w0 {
    private int refreshCounter;
    private B0 timerJob;
    private AdvRefreshWithDelayVO viewObject;

    @NotNull
    private final Ae.w0<Integer> _refreshEventFlow = E0.b(0, 0, null, 7);

    @NotNull
    private TimerState timerState = TimerState.NOT_INITIATED;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/ads/widgets/advRefreshWithDelay/presentation/AdvRefreshWithDelayViewModel$Refresh;", "", "<init>", "()V", "FromAnotherPage", "FromBackground", "Lru/ozon/app/android/ads/widgets/advRefreshWithDelay/presentation/AdvRefreshWithDelayViewModel$Refresh$FromAnotherPage;", "Lru/ozon/app/android/ads/widgets/advRefreshWithDelay/presentation/AdvRefreshWithDelayViewModel$Refresh$FromBackground;", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static abstract class Refresh {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/ads/widgets/advRefreshWithDelay/presentation/AdvRefreshWithDelayViewModel$Refresh$FromAnotherPage;", "Lru/ozon/app/android/ads/widgets/advRefreshWithDelay/presentation/AdvRefreshWithDelayViewModel$Refresh;", "<init>", "()V", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class FromAnotherPage extends Refresh {

            @NotNull
            public static final FromAnotherPage INSTANCE = new FromAnotherPage();

            private FromAnotherPage() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/ads/widgets/advRefreshWithDelay/presentation/AdvRefreshWithDelayViewModel$Refresh$FromBackground;", "Lru/ozon/app/android/ads/widgets/advRefreshWithDelay/presentation/AdvRefreshWithDelayViewModel$Refresh;", "fromAnotherPage", "", "<init>", "(Z)V", "getFromAnotherPage", "()Z", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class FromBackground extends Refresh {
            private final boolean fromAnotherPage;

            public FromBackground(boolean z11) {
                super(null);
                this.fromAnotherPage = z11;
            }

            public final boolean getFromAnotherPage() {
                return this.fromAnotherPage;
            }
        }

        public /* synthetic */ Refresh(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Refresh() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/ads/widgets/advRefreshWithDelay/presentation/AdvRefreshWithDelayViewModel$TimerState;", "", "<init>", "(Ljava/lang/String;I)V", "NOT_INITIATED", "STARTED", "STOPPED", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TimerState {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ TimerState[] $VALUES;
        public static final TimerState NOT_INITIATED = new TimerState("NOT_INITIATED", 0);
        public static final TimerState STARTED = new TimerState("STARTED", 1);
        public static final TimerState STOPPED = new TimerState("STOPPED", 2);

        private static final /* synthetic */ TimerState[] $values() {
            return new TimerState[]{NOT_INITIATED, STARTED, STOPPED};
        }

        static {
            TimerState[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private TimerState(String str, int i11) {
        }

        public static TimerState valueOf(String str) {
            return (TimerState) Enum.valueOf(TimerState.class, str);
        }

        public static TimerState[] values() {
            return (TimerState[]) $VALUES.clone();
        }
    }

    private final void refresh() {
        if (this.timerState == TimerState.STOPPED) {
            C10727i.c(x0.a(this), null, null, new AdvRefreshWithDelayViewModel$refresh$1(this, null), 3);
        }
    }

    private final void refreshFromAnotherPage() {
        AdvRefreshWithDelayVO advRefreshWithDelayVO = this.viewObject;
        if (advRefreshWithDelayVO != null) {
            refreshIfPossible(advRefreshWithDelayVO.getDelay(), advRefreshWithDelayVO.getRefreshFromAnotherPage());
        }
    }

    private final void refreshFromBackground(boolean fromAnotherPage) {
        AdvRefreshWithDelayVO advRefreshWithDelayVO = this.viewObject;
        if (advRefreshWithDelayVO != null) {
            boolean refreshFromBackground = advRefreshWithDelayVO.getRefreshFromBackground();
            boolean refreshFromAnotherPage = advRefreshWithDelayVO.getRefreshFromAnotherPage();
            if (!fromAnotherPage || refreshFromBackground || refreshFromAnotherPage) {
                refreshIfPossible(advRefreshWithDelayVO.getDelay(), refreshFromBackground);
            }
        }
    }

    private final void refreshIfPossible(Double delay, boolean isRefreshEnabled) {
        if (delay == null || !isRefreshEnabled) {
            return;
        }
        refresh();
    }

    @NotNull
    public final InterfaceC2395h<Integer> getRefreshEventFlow() {
        return C2399j.o(this._refreshEventFlow);
    }

    public final AdvRefreshWithDelayVO getViewObject() {
        return this.viewObject;
    }

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
        B0 b02 = this.timerJob;
        if (b02 != null) {
            b02.j(null);
        }
    }

    public final void refreshData(@NotNull Refresh typeRefresh) {
        Intrinsics.checkNotNullParameter(typeRefresh, "typeRefresh");
        if (typeRefresh instanceof Refresh.FromBackground) {
            refreshFromBackground(((Refresh.FromBackground) typeRefresh).getFromAnotherPage());
        } else {
            if (!Intrinsics.d(typeRefresh, Refresh.FromAnotherPage.INSTANCE)) {
                throw new o();
            }
            refreshFromAnotherPage();
        }
    }

    public final void startTimer() {
        Double delay;
        B0 b02 = this.timerJob;
        if (b02 != null) {
            b02.j(null);
        }
        AdvRefreshWithDelayVO advRefreshWithDelayVO = this.viewObject;
        if (advRefreshWithDelayVO == null || (delay = advRefreshWithDelayVO.getDelay()) == null) {
            return;
        }
        double doubleValue = delay.doubleValue();
        if (doubleValue <= 0.0d) {
            return;
        }
        this.timerJob = C10727i.c(x0.a(this), null, null, new AdvRefreshWithDelayViewModel$startTimer$1(this, doubleValue, null), 3);
    }

    public final void updateVoData(@NotNull AdvRefreshWithDelayVO newVO) {
        Intrinsics.checkNotNullParameter(newVO, "newVO");
        this.viewObject = newVO;
    }
}
