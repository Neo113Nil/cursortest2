package ru.ozon.app.android.pdpvideomolecule.data;

import Ak.C2436a;
import Kk.C3532b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\rJ\u0015\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\fJ\r\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\rJ:\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b\u0005\u0010 \"\u0004\b!\u0010\"R\u0016\u0010\u0006\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010#R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/pdpvideomolecule/data/PlayerState;", "", "", "currentPlayerTime", "", "isMuted", "shouldRepeat", "isPlaying", "<init>", "(JLjava/lang/Boolean;ZZ)V", "", "setIsPlaying", "(Z)V", "()Z", "setShouldRepeat", "copy", "(JLjava/lang/Boolean;ZZ)Lru/ozon/app/android/pdpvideomolecule/data/PlayerState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getCurrentPlayerTime", "()J", "setCurrentPlayerTime", "(J)V", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "setMuted", "(Ljava/lang/Boolean;)V", "Z", "pdpvideomolecule_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PlayerState {
    private long currentPlayerTime;
    private Boolean isMuted;
    private boolean isPlaying;
    private boolean shouldRepeat;

    public PlayerState() {
        this(0L, null, false, false, 15, null);
    }

    public static /* synthetic */ PlayerState copy$default(PlayerState playerState, long j11, Boolean bool, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = playerState.currentPlayerTime;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            bool = playerState.isMuted;
        }
        Boolean bool2 = bool;
        if ((i11 & 4) != 0) {
            z11 = playerState.shouldRepeat;
        }
        boolean z13 = z11;
        if ((i11 & 8) != 0) {
            z12 = playerState.isPlaying;
        }
        return playerState.copy(j12, bool2, z13, z12);
    }

    @NotNull
    public final PlayerState copy(long currentPlayerTime, Boolean isMuted, boolean shouldRepeat, boolean isPlaying) {
        return new PlayerState(currentPlayerTime, isMuted, shouldRepeat, isPlaying);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlayerState)) {
            return false;
        }
        PlayerState playerState = (PlayerState) other;
        return this.currentPlayerTime == playerState.currentPlayerTime && Intrinsics.d(this.isMuted, playerState.isMuted) && this.shouldRepeat == playerState.shouldRepeat && this.isPlaying == playerState.isPlaying;
    }

    public final long getCurrentPlayerTime() {
        return this.currentPlayerTime;
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.currentPlayerTime) * 31;
        Boolean bool = this.isMuted;
        return Boolean.hashCode(this.isPlaying) + C3532b.a((hashCode + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.shouldRepeat);
    }

    /* renamed from: isMuted, reason: from getter */
    public final Boolean getIsMuted() {
        return this.isMuted;
    }

    /* renamed from: isPlaying, reason: from getter */
    public final boolean getIsPlaying() {
        return this.isPlaying;
    }

    public final void setCurrentPlayerTime(long j11) {
        this.currentPlayerTime = j11;
    }

    public final void setIsPlaying(boolean isPlaying) {
        this.isPlaying = isPlaying;
    }

    public final void setShouldRepeat(boolean shouldRepeat) {
        this.shouldRepeat = shouldRepeat;
    }

    /* renamed from: shouldRepeat, reason: from getter */
    public final boolean getShouldRepeat() {
        return this.shouldRepeat;
    }

    @NotNull
    public String toString() {
        long j11 = this.currentPlayerTime;
        Boolean bool = this.isMuted;
        boolean z11 = this.shouldRepeat;
        boolean z12 = this.isPlaying;
        StringBuilder sb2 = new StringBuilder("PlayerState(currentPlayerTime=");
        sb2.append(j11);
        sb2.append(", isMuted=");
        sb2.append(bool);
        C2436a.e(", shouldRepeat=", ", isPlaying=", sb2, z11, z12);
        sb2.append(")");
        return sb2.toString();
    }

    public PlayerState(long j11, Boolean bool, boolean z11, boolean z12) {
        this.currentPlayerTime = j11;
        this.isMuted = bool;
        this.shouldRepeat = z11;
        this.isPlaying = z12;
    }

    public /* synthetic */ PlayerState(long j11, Boolean bool, boolean z11, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0L : j11, (i11 & 2) != 0 ? null : bool, (i11 & 4) != 0 ? false : z11, (i11 & 8) != 0 ? true : z12);
    }
}
