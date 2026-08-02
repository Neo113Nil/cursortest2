package ru.ozon.app.android.ads.widgets.advRefreshWithDelay.presentation;

import Ae.InterfaceC2395h;
import Ae.O0;
import Ae.x0;
import Xc.b;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0002\u001a\u001bB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0015\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0012R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\f0\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/ads/widgets/advRefreshWithDelay/presentation/HomeScreenStatePublisher;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lkotlin/Function0;", "", "onStartCallback", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "Landroidx/lifecycle/J;", "owner", "onStart", "(Landroidx/lifecycle/J;)V", "onStop", "Lru/ozon/app/android/ads/widgets/advRefreshWithDelay/presentation/HomeScreenStatePublisher$PreviousAndCurrentHomeState;", "newState", "setState", "(Lru/ozon/app/android/ads/widgets/advRefreshWithDelay/presentation/HomeScreenStatePublisher$PreviousAndCurrentHomeState;)V", "resetHomeState", "()V", "Lkotlin/jvm/functions/Function0;", "LAe/x0;", "_statePublisher", "LAe/x0;", "LAe/h;", "getStatePublisher", "()LAe/h;", "statePublisher", "HomeScreenState", "PreviousAndCurrentHomeState", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HomeScreenStatePublisher implements DefaultLifecycleObserver {

    @NotNull
    private final x0<PreviousAndCurrentHomeState> _statePublisher;

    @NotNull
    private final Function0<Unit> onStartCallback;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/ads/widgets/advRefreshWithDelay/presentation/HomeScreenStatePublisher$HomeScreenState;", "", "<init>", "(Ljava/lang/String;I)V", "NOT_INITIATED", "STARTED", "STOPPED", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class HomeScreenState {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ HomeScreenState[] $VALUES;
        public static final HomeScreenState NOT_INITIATED = new HomeScreenState("NOT_INITIATED", 0);
        public static final HomeScreenState STARTED = new HomeScreenState("STARTED", 1);
        public static final HomeScreenState STOPPED = new HomeScreenState("STOPPED", 2);

        private static final /* synthetic */ HomeScreenState[] $values() {
            return new HomeScreenState[]{NOT_INITIATED, STARTED, STOPPED};
        }

        static {
            HomeScreenState[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private HomeScreenState(String str, int i11) {
        }

        public static HomeScreenState valueOf(String str) {
            return (HomeScreenState) Enum.valueOf(HomeScreenState.class, str);
        }

        public static HomeScreenState[] values() {
            return (HomeScreenState[]) $VALUES.clone();
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/ads/widgets/advRefreshWithDelay/presentation/HomeScreenStatePublisher$PreviousAndCurrentHomeState;", "", "Lru/ozon/app/android/ads/widgets/advRefreshWithDelay/presentation/HomeScreenStatePublisher$HomeScreenState;", "previousState", "currentState", "<init>", "(Lru/ozon/app/android/ads/widgets/advRefreshWithDelay/presentation/HomeScreenStatePublisher$HomeScreenState;Lru/ozon/app/android/ads/widgets/advRefreshWithDelay/presentation/HomeScreenStatePublisher$HomeScreenState;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/ads/widgets/advRefreshWithDelay/presentation/HomeScreenStatePublisher$HomeScreenState;", "getPreviousState", "()Lru/ozon/app/android/ads/widgets/advRefreshWithDelay/presentation/HomeScreenStatePublisher$HomeScreenState;", "getCurrentState", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PreviousAndCurrentHomeState {

        @NotNull
        private final HomeScreenState currentState;

        @NotNull
        private final HomeScreenState previousState;

        public PreviousAndCurrentHomeState(@NotNull HomeScreenState previousState, @NotNull HomeScreenState currentState) {
            Intrinsics.checkNotNullParameter(previousState, "previousState");
            Intrinsics.checkNotNullParameter(currentState, "currentState");
            this.previousState = previousState;
            this.currentState = currentState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PreviousAndCurrentHomeState)) {
                return false;
            }
            PreviousAndCurrentHomeState previousAndCurrentHomeState = (PreviousAndCurrentHomeState) other;
            return this.previousState == previousAndCurrentHomeState.previousState && this.currentState == previousAndCurrentHomeState.currentState;
        }

        @NotNull
        public final HomeScreenState getCurrentState() {
            return this.currentState;
        }

        @NotNull
        public final HomeScreenState getPreviousState() {
            return this.previousState;
        }

        public int hashCode() {
            return this.currentState.hashCode() + (this.previousState.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "PreviousAndCurrentHomeState(previousState=" + this.previousState + ", currentState=" + this.currentState + ")";
        }
    }

    public HomeScreenStatePublisher(@NotNull Function0<Unit> onStartCallback) {
        Intrinsics.checkNotNullParameter(onStartCallback, "onStartCallback");
        this.onStartCallback = onStartCallback;
        this._statePublisher = O0.a(new PreviousAndCurrentHomeState(HomeScreenState.NOT_INITIATED, HomeScreenState.STARTED));
    }

    @NotNull
    public final InterfaceC2395h<PreviousAndCurrentHomeState> getStatePublisher() {
        return this._statePublisher;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        setState(new PreviousAndCurrentHomeState(this._statePublisher.getValue().getCurrentState(), HomeScreenState.STARTED));
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        setState(new PreviousAndCurrentHomeState(this._statePublisher.getValue().getCurrentState(), HomeScreenState.STOPPED));
        this.onStartCallback.invoke();
    }

    public final void resetHomeState() {
        this._statePublisher.setValue(new PreviousAndCurrentHomeState(HomeScreenState.NOT_INITIATED, HomeScreenState.STARTED));
    }

    public final void setState(@NotNull PreviousAndCurrentHomeState newState) {
        Intrinsics.checkNotNullParameter(newState, "newState");
        this._statePublisher.setValue(newState);
    }
}
