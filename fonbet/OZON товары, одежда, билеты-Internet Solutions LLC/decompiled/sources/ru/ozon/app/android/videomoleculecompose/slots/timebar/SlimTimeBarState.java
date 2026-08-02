package ru.ozon.app.android.videomoleculecompose.slots.timebar;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/videomoleculecompose/slots/timebar/SlimTimeBarState;", "", "", "durationMs", "Lkotlin/Function0;", "positionMsProvider", "bufferedPositionMsProvider", "", "enabled", "<init>", "(JLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getDurationMs", "()J", "Lkotlin/jvm/functions/Function0;", "getPositionMsProvider", "()Lkotlin/jvm/functions/Function0;", "getBufferedPositionMsProvider", "Z", "getEnabled", "()Z", "videomoleculecompose_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SlimTimeBarState {

    @NotNull
    private final Function0<Long> bufferedPositionMsProvider;
    private final long durationMs;
    private final boolean enabled;

    @NotNull
    private final Function0<Long> positionMsProvider;

    public SlimTimeBarState(long j11, @NotNull Function0<Long> positionMsProvider, @NotNull Function0<Long> bufferedPositionMsProvider, boolean z11) {
        Intrinsics.checkNotNullParameter(positionMsProvider, "positionMsProvider");
        Intrinsics.checkNotNullParameter(bufferedPositionMsProvider, "bufferedPositionMsProvider");
        this.durationMs = j11;
        this.positionMsProvider = positionMsProvider;
        this.bufferedPositionMsProvider = bufferedPositionMsProvider;
        this.enabled = z11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SlimTimeBarState)) {
            return false;
        }
        SlimTimeBarState slimTimeBarState = (SlimTimeBarState) other;
        return this.durationMs == slimTimeBarState.durationMs && Intrinsics.d(this.positionMsProvider, slimTimeBarState.positionMsProvider) && Intrinsics.d(this.bufferedPositionMsProvider, slimTimeBarState.bufferedPositionMsProvider) && this.enabled == slimTimeBarState.enabled;
    }

    @NotNull
    public final Function0<Long> getBufferedPositionMsProvider() {
        return this.bufferedPositionMsProvider;
    }

    public final long getDurationMs() {
        return this.durationMs;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    @NotNull
    public final Function0<Long> getPositionMsProvider() {
        return this.positionMsProvider;
    }

    public int hashCode() {
        return Boolean.hashCode(this.enabled) + ((this.bufferedPositionMsProvider.hashCode() + ((this.positionMsProvider.hashCode() + (Long.hashCode(this.durationMs) * 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "SlimTimeBarState(durationMs=" + this.durationMs + ", positionMsProvider=" + this.positionMsProvider + ", bufferedPositionMsProvider=" + this.bufferedPositionMsProvider + ", enabled=" + this.enabled + ")";
    }
}
