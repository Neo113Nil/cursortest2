package ru.ozon.app.android.videomolecule.data;

import Bi.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u0005\u0010\u001e\"\u0004\b\u001f\u0010 R\u0016\u0010\u0006\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010!R\u0016\u0010\"\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010!¨\u0006#"}, d2 = {"Lru/ozon/app/android/videomolecule/data/PlayerState;", "", "", "currentPlayerTime", "", "isMuted", "isPlaying", "<init>", "(JLjava/lang/Boolean;Z)V", "", "ignoreNextPlaying", "()V", "setIsPlaying", "(Z)V", "()Z", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getCurrentPlayerTime", "()J", "setCurrentPlayerTime", "(J)V", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "setMuted", "(Ljava/lang/Boolean;)V", "Z", "ignoreNextIsPlayingChange", "videomolecule_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PlayerState {
    private long currentPlayerTime;
    private boolean ignoreNextIsPlayingChange;
    private Boolean isMuted;
    private boolean isPlaying;

    public PlayerState() {
        this(0L, null, false, 7, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlayerState)) {
            return false;
        }
        PlayerState playerState = (PlayerState) other;
        return this.currentPlayerTime == playerState.currentPlayerTime && Intrinsics.d(this.isMuted, playerState.isMuted) && this.isPlaying == playerState.isPlaying;
    }

    public final long getCurrentPlayerTime() {
        return this.currentPlayerTime;
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.currentPlayerTime) * 31;
        Boolean bool = this.isMuted;
        return Boolean.hashCode(this.isPlaying) + ((hashCode + (bool == null ? 0 : bool.hashCode())) * 31);
    }

    public final void ignoreNextPlaying() {
        this.ignoreNextIsPlayingChange = true;
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
        if (this.ignoreNextIsPlayingChange) {
            this.ignoreNextIsPlayingChange = false;
        } else {
            this.isPlaying = isPlaying;
        }
    }

    @NotNull
    public String toString() {
        long j11 = this.currentPlayerTime;
        Boolean bool = this.isMuted;
        boolean z11 = this.isPlaying;
        StringBuilder sb2 = new StringBuilder("PlayerState(currentPlayerTime=");
        sb2.append(j11);
        sb2.append(", isMuted=");
        sb2.append(bool);
        return b.f(sb2, ", isPlaying=", z11, ")");
    }

    public PlayerState(long j11, Boolean bool, boolean z11) {
        this.currentPlayerTime = j11;
        this.isMuted = bool;
        this.isPlaying = z11;
    }

    public /* synthetic */ PlayerState(long j11, Boolean bool, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0L : j11, (i11 & 2) != 0 ? null : bool, (i11 & 4) != 0 ? true : z11);
    }
}
