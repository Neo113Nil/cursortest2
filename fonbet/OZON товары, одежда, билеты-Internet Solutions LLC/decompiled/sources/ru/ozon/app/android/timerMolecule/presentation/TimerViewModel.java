package ru.ozon.app.android.timerMolecule.presentation;

import Ae.InterfaceC2395h;
import Ae.M0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0001\u0015J#\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/timerMolecule/presentation/TimerViewModel;", "", "Lru/ozon/app/android/timerMolecule/presentation/TimerVO;", DynamicElementDTO.TIMER, "", "withoutStart", "", "bindTimer", "(Lru/ozon/app/android/timerMolecule/presentation/TimerVO;Z)V", "onCleared", "()V", "LAe/M0;", "Lru/ozon/app/android/timerMolecule/presentation/TimerTickData;", "getTimerState", "()LAe/M0;", "timerState", "LAe/h;", "Lru/ozon/app/android/timerMolecule/presentation/TimerViewModel$Action;", "getAction", "()LAe/h;", "action", "Action", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface TimerViewModel {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/timerMolecule/presentation/TimerViewModel$Action;", "", "<init>", "()V", "OnTimerFinished", "Lru/ozon/app/android/timerMolecule/presentation/TimerViewModel$Action$OnTimerFinished;", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Action {

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/timerMolecule/presentation/TimerViewModel$Action$OnTimerFinished;", "Lru/ozon/app/android/timerMolecule/presentation/TimerViewModel$Action;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class OnTimerFinished extends Action {

            @NotNull
            public static final OnTimerFinished INSTANCE = new OnTimerFinished();

            private OnTimerFinished() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof OnTimerFinished);
            }

            public int hashCode() {
                return -1209673021;
            }

            @NotNull
            public String toString() {
                return "OnTimerFinished";
            }
        }

        public /* synthetic */ Action(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Action() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void bindTimer$default(TimerViewModel timerViewModel, TimerVO timerVO, boolean z11, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bindTimer");
            }
            if ((i11 & 2) != 0) {
                z11 = false;
            }
            timerViewModel.bindTimer(timerVO, z11);
        }
    }

    void bindTimer(TimerVO timer, boolean withoutStart);

    @NotNull
    InterfaceC2395h<Action> getAction();

    @NotNull
    M0<TimerTickData> getTimerState();

    void onCleared();
}
