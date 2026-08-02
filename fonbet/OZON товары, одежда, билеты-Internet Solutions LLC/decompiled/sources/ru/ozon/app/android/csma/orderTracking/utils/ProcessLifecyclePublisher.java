package ru.ozon.app.android.csma.orderTracking.utils;

import Ae.InterfaceC2395h;
import Xc.a;
import Xc.b;
import androidx.lifecycle.DefaultLifecycleObserver;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0002\n\u000bJ\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/csma/orderTracking/utils/ProcessLifecyclePublisher;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "", "clearListeners", "()V", "LAe/h;", "Lru/ozon/app/android/csma/orderTracking/utils/ProcessLifecyclePublisher$PreviousAndCurrentProcessState;", "getProcessPublisher", "()LAe/h;", "processPublisher", "ProcessState", "PreviousAndCurrentProcessState", "csma_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ProcessLifecyclePublisher extends DefaultLifecycleObserver {

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/csma/orderTracking/utils/ProcessLifecyclePublisher$PreviousAndCurrentProcessState;", "", "Lru/ozon/app/android/csma/orderTracking/utils/ProcessLifecyclePublisher$ProcessState;", "previousState", "currentState", "<init>", "(Lru/ozon/app/android/csma/orderTracking/utils/ProcessLifecyclePublisher$ProcessState;Lru/ozon/app/android/csma/orderTracking/utils/ProcessLifecyclePublisher$ProcessState;)V", "", "isFromBackground", "()Z", "isFromForeground", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/csma/orderTracking/utils/ProcessLifecyclePublisher$ProcessState;", "getPreviousState", "()Lru/ozon/app/android/csma/orderTracking/utils/ProcessLifecyclePublisher$ProcessState;", "getCurrentState", "csma_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

        public int hashCode() {
            return this.currentState.hashCode() + (this.previousState.hashCode() * 31);
        }

        public final boolean isFromBackground() {
            return this.previousState == ProcessState.BACKGROUND && this.currentState == ProcessState.FOREGROUND;
        }

        public final boolean isFromForeground() {
            return this.previousState == ProcessState.FOREGROUND && this.currentState == ProcessState.BACKGROUND;
        }

        @NotNull
        public String toString() {
            return "PreviousAndCurrentProcessState(previousState=" + this.previousState + ", currentState=" + this.currentState + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/csma/orderTracking/utils/ProcessLifecyclePublisher$ProcessState;", "", "<init>", "(Ljava/lang/String;I)V", "NOT_INITIATED", "FOREGROUND", "BACKGROUND", "csma_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ProcessState {
        private static final /* synthetic */ a $ENTRIES;
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

    void clearListeners();

    @NotNull
    InterfaceC2395h<PreviousAndCurrentProcessState> getProcessPublisher();
}
