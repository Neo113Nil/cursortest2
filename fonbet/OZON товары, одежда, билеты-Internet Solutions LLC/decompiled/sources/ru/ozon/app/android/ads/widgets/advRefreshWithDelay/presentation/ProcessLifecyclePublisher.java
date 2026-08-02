package ru.ozon.app.android.ads.widgets.advRefreshWithDelay.presentation;

import Ae.InterfaceC2395h;
import Ae.O0;
import Ae.x0;
import Xc.b;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import androidx.lifecycle.ProcessLifecycleOwner;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0015\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u0003R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/ads/widgets/advRefreshWithDelay/presentation/ProcessLifecyclePublisher;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "<init>", "()V", "Landroidx/lifecycle/J;", "owner", "", "onStart", "(Landroidx/lifecycle/J;)V", "onStop", "resetProcessState", "LAe/x0;", "Lru/ozon/app/android/ads/widgets/advRefreshWithDelay/presentation/ProcessLifecyclePublisher$PreviousAndCurrentProcessState;", "_processPublisher", "LAe/x0;", "processLifecycleOwner", "Landroidx/lifecycle/J;", "LAe/h;", "getProcessPublisher", "()LAe/h;", "processPublisher", "ProcessState", "PreviousAndCurrentProcessState", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ProcessLifecyclePublisher implements DefaultLifecycleObserver {

    @NotNull
    private final x0<PreviousAndCurrentProcessState> _processPublisher = O0.a(new PreviousAndCurrentProcessState(ProcessState.NOT_INITIATED, ProcessState.FOREGROUND));

    @NotNull
    private final J processLifecycleOwner;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/ads/widgets/advRefreshWithDelay/presentation/ProcessLifecyclePublisher$PreviousAndCurrentProcessState;", "", "Lru/ozon/app/android/ads/widgets/advRefreshWithDelay/presentation/ProcessLifecyclePublisher$ProcessState;", "previousState", "currentState", "<init>", "(Lru/ozon/app/android/ads/widgets/advRefreshWithDelay/presentation/ProcessLifecyclePublisher$ProcessState;Lru/ozon/app/android/ads/widgets/advRefreshWithDelay/presentation/ProcessLifecyclePublisher$ProcessState;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/ads/widgets/advRefreshWithDelay/presentation/ProcessLifecyclePublisher$ProcessState;", "getPreviousState", "()Lru/ozon/app/android/ads/widgets/advRefreshWithDelay/presentation/ProcessLifecyclePublisher$ProcessState;", "getCurrentState", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PreviousAndCurrentProcessState {

        @NotNull
        private final ProcessState currentState;

        @NotNull
        private final ProcessState previousState;

        public PreviousAndCurrentProcessState(@NotNull ProcessState previousState, @NotNull ProcessState currentState) {
            Intrinsics.checkNotNullParameter(previousState, "previousState");
            Intrinsics.checkNotNullParameter(currentState, "currentState");
            this.previousState = previousState;
            this.currentState = currentState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PreviousAndCurrentProcessState)) {
                return false;
            }
            PreviousAndCurrentProcessState previousAndCurrentProcessState = (PreviousAndCurrentProcessState) other;
            return this.previousState == previousAndCurrentProcessState.previousState && this.currentState == previousAndCurrentProcessState.currentState;
        }

        @NotNull
        public final ProcessState getCurrentState() {
            return this.currentState;
        }

        @NotNull
        public final ProcessState getPreviousState() {
            return this.previousState;
        }

        public int hashCode() {
            return this.currentState.hashCode() + (this.previousState.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "PreviousAndCurrentProcessState(previousState=" + this.previousState + ", currentState=" + this.currentState + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/ads/widgets/advRefreshWithDelay/presentation/ProcessLifecyclePublisher$ProcessState;", "", "<init>", "(Ljava/lang/String;I)V", "NOT_INITIATED", "FOREGROUND", "BACKGROUND", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ProcessState {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ ProcessState[] $VALUES;
        public static final ProcessState NOT_INITIATED = new ProcessState("NOT_INITIATED", 0);
        public static final ProcessState FOREGROUND = new ProcessState("FOREGROUND", 1);
        public static final ProcessState BACKGROUND = new ProcessState("BACKGROUND", 2);

        private static final /* synthetic */ ProcessState[] $values() {
            return new ProcessState[]{NOT_INITIATED, FOREGROUND, BACKGROUND};
        }

        static {
            ProcessState[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private ProcessState(String str, int i11) {
        }

        public static ProcessState valueOf(String str) {
            return (ProcessState) Enum.valueOf(ProcessState.class, str);
        }

        public static ProcessState[] values() {
            return (ProcessState[]) $VALUES.clone();
        }
    }

    public ProcessLifecyclePublisher() {
        ProcessLifecycleOwner processLifecycleOwner;
        processLifecycleOwner = ProcessLifecycleOwner.f43230i;
        this.processLifecycleOwner = processLifecycleOwner;
        processLifecycleOwner.getLifecycle().a(this);
    }

    @NotNull
    public final InterfaceC2395h<PreviousAndCurrentProcessState> getProcessPublisher() {
        return this._processPublisher;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        x0<PreviousAndCurrentProcessState> x0Var = this._processPublisher;
        x0Var.setValue(new PreviousAndCurrentProcessState(x0Var.getValue().getCurrentState(), ProcessState.FOREGROUND));
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        x0<PreviousAndCurrentProcessState> x0Var = this._processPublisher;
        x0Var.setValue(new PreviousAndCurrentProcessState(x0Var.getValue().getCurrentState(), ProcessState.BACKGROUND));
    }

    public final void resetProcessState() {
        this._processPublisher.setValue(new PreviousAndCurrentProcessState(ProcessState.NOT_INITIATED, ProcessState.FOREGROUND));
    }
}
