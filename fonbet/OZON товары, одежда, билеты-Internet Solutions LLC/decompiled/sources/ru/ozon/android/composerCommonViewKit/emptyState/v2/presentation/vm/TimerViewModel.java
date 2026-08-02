package ru.ozon.android.composerCommonViewKit.emptyState.v2.presentation.vm;

import Ae.C2399j;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import Tc.d;
import androidx.lifecycle.w0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.collections.e0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.B0;
import xe.C10727i;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 !2\u00020\u0001:\u0003\"#!B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\u00042\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0010\u001a\u00020\u00042\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\u0010\u0010\u000eR \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R&\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00160\t0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R)\u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00160\t0\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Lru/ozon/android/composerCommonViewKit/emptyState/v2/presentation/vm/TimerViewModel;", "Landroidx/lifecycle/w0;", "<init>", "()V", "", "startTickerIfNeeded", "", "getActiveTimerAndUpdateStates", "()Z", "", "", "", "newTimers", "syncTimers", "(Ljava/util/Map;)V", "timersToRestart", "restartTimers", "", "Lru/ozon/android/composerCommonViewKit/emptyState/v2/presentation/vm/TimerViewModel$TimerData;", "timers", "Ljava/util/Map;", "LAe/x0;", "Lru/ozon/android/composerCommonViewKit/emptyState/v2/presentation/vm/TimerViewModel$TimerState;", "_timerStates", "LAe/x0;", "LAe/M0;", "timerStates", "LAe/M0;", "getTimerStates", "()LAe/M0;", "Lxe/B0;", "tickerJob", "Lxe/B0;", "Companion", "TimerState", "TimerData", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TimerViewModel extends w0 {

    @NotNull
    private final x0<Map<String, TimerState>> _timerStates;
    private B0 tickerJob;

    @NotNull
    private final M0<Map<String, TimerState>> timerStates;

    @NotNull
    private final Map<String, TimerData> timers = new LinkedHashMap();

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/android/composerCommonViewKit/emptyState/v2/presentation/vm/TimerViewModel$Companion;", "", "<init>", "()V", "MILLIS_IN_SECOND", "", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/android/composerCommonViewKit/emptyState/v2/presentation/vm/TimerViewModel$TimerData;", "", "", "totalSeconds", "", "deadlineMs", "<init>", "(IJ)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getTotalSeconds", "J", "getDeadlineMs", "()J", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final /* data */ class TimerData {
        private final long deadlineMs;
        private final int totalSeconds;

        public TimerData(int i11, long j11) {
            this.totalSeconds = i11;
            this.deadlineMs = j11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TimerData)) {
                return false;
            }
            TimerData timerData = (TimerData) other;
            return this.totalSeconds == timerData.totalSeconds && this.deadlineMs == timerData.deadlineMs;
        }

        public final long getDeadlineMs() {
            return this.deadlineMs;
        }

        public final int getTotalSeconds() {
            return this.totalSeconds;
        }

        public int hashCode() {
            return Long.hashCode(this.deadlineMs) + (Integer.hashCode(this.totalSeconds) * 31);
        }

        @NotNull
        public String toString() {
            return "TimerData(totalSeconds=" + this.totalSeconds + ", deadlineMs=" + this.deadlineMs + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0005\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/android/composerCommonViewKit/emptyState/v2/presentation/vm/TimerViewModel$TimerState;", "", "", "remainingSeconds", "", "isActive", "<init>", "(IZ)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getRemainingSeconds", "Z", "()Z", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TimerState {
        private final boolean isActive;
        private final int remainingSeconds;

        public TimerState(int i11, boolean z11) {
            this.remainingSeconds = i11;
            this.isActive = z11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TimerState)) {
                return false;
            }
            TimerState timerState = (TimerState) other;
            return this.remainingSeconds == timerState.remainingSeconds && this.isActive == timerState.isActive;
        }

        public final int getRemainingSeconds() {
            return this.remainingSeconds;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isActive) + (Integer.hashCode(this.remainingSeconds) * 31);
        }

        /* renamed from: isActive, reason: from getter */
        public final boolean getIsActive() {
            return this.isActive;
        }

        @NotNull
        public String toString() {
            return "TimerState(remainingSeconds=" + this.remainingSeconds + ", isActive=" + this.isActive + ")";
        }
    }

    public TimerViewModel() {
        x0<Map<String, TimerState>> a11 = O0.a(U.c());
        this._timerStates = a11;
        this.timerStates = C2399j.b(a11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getActiveTimerAndUpdateStates() {
        long currentTimeMillis = System.currentTimeMillis();
        d builder = new d();
        boolean z11 = false;
        for (Map.Entry<String, TimerData> entry : this.timers.entrySet()) {
            String key = entry.getKey();
            long deadlineMs = entry.getValue().getDeadlineMs() - currentTimeMillis;
            if (deadlineMs < 0) {
                deadlineMs = 0;
            }
            int i11 = (int) ((deadlineMs + 999) / 1000);
            boolean z12 = i11 > 0;
            if (z12) {
                z11 = true;
            }
            builder.put(key, new TimerState(i11, z12));
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        this._timerStates.setValue(builder.u());
        return z11;
    }

    private final void startTickerIfNeeded() {
        B0 b02 = this.tickerJob;
        if ((b02 == null || !b02.isActive()) && !this.timers.isEmpty()) {
            this.tickerJob = C10727i.c(androidx.lifecycle.x0.a(this), null, null, new TimerViewModel$startTickerIfNeeded$1(this, null), 3);
        }
    }

    @NotNull
    public final M0<Map<String, TimerState>> getTimerStates() {
        return this.timerStates;
    }

    public final void restartTimers(@NotNull Map<String, Integer> timersToRestart) {
        Intrinsics.checkNotNullParameter(timersToRestart, "timersToRestart");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Integer> entry : timersToRestart.entrySet()) {
            if (entry.getValue().intValue() >= 0) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (linkedHashMap.isEmpty()) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            String str = (String) entry2.getKey();
            int intValue = ((Number) entry2.getValue()).intValue();
            this.timers.put(str, new TimerData(intValue, (intValue * 1000) + currentTimeMillis));
        }
        getActiveTimerAndUpdateStates();
        startTickerIfNeeded();
    }

    public final void syncTimers(@NotNull Map<String, Integer> newTimers) {
        Intrinsics.checkNotNullParameter(newTimers, "newTimers");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Integer> entry : newTimers.entrySet()) {
            if (entry.getValue().intValue() >= 0) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = e0.d(C7714v.Y0(this.timers.keySet()), linkedHashMap.keySet()).iterator();
        while (it.hasNext()) {
            this.timers.remove((String) it.next());
        }
        long currentTimeMillis = System.currentTimeMillis();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            String str = (String) entry2.getKey();
            int intValue = ((Number) entry2.getValue()).intValue();
            TimerData timerData = this.timers.get(str);
            if (timerData == null || timerData.getTotalSeconds() != intValue) {
                this.timers.put(str, new TimerData(intValue, (intValue * 1000) + currentTimeMillis));
            }
        }
        getActiveTimerAndUpdateStates();
        startTickerIfNeeded();
    }
}
