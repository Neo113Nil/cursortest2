package ru.ozon.app.android.video.playerV2.utils;

import Kk.C3532b;
import Lh.a;
import Pk0.f;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0003\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0004\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0005\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0006\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0007\u0010\u0016R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/video/playerV2/utils/PlayerStatusSnapshot;", "", "", "isPlaying", "isBuffering", "isFinished", "isReady", "isIdle", "", "durationMs", "<init>", "(ZZZZZJ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "J", "getDurationMs", "()J", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class PlayerStatusSnapshot {
    private final long durationMs;
    private final boolean isBuffering;
    private final boolean isFinished;
    private final boolean isIdle;
    private final boolean isPlaying;
    private final boolean isReady;

    public PlayerStatusSnapshot(boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, long j11) {
        this.isPlaying = z11;
        this.isBuffering = z12;
        this.isFinished = z13;
        this.isReady = z14;
        this.isIdle = z15;
        this.durationMs = j11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlayerStatusSnapshot)) {
            return false;
        }
        PlayerStatusSnapshot playerStatusSnapshot = (PlayerStatusSnapshot) other;
        return this.isPlaying == playerStatusSnapshot.isPlaying && this.isBuffering == playerStatusSnapshot.isBuffering && this.isFinished == playerStatusSnapshot.isFinished && this.isReady == playerStatusSnapshot.isReady && this.isIdle == playerStatusSnapshot.isIdle && this.durationMs == playerStatusSnapshot.durationMs;
    }

    public final long getDurationMs() {
        return this.durationMs;
    }

    public int hashCode() {
        return Long.hashCode(this.durationMs) + C3532b.a(C3532b.a(C3532b.a(C3532b.a(Boolean.hashCode(this.isPlaying) * 31, 31, this.isBuffering), 31, this.isFinished), 31, this.isReady), 31, this.isIdle);
    }

    /* renamed from: isBuffering, reason: from getter */
    public final boolean getIsBuffering() {
        return this.isBuffering;
    }

    /* renamed from: isFinished, reason: from getter */
    public final boolean getIsFinished() {
        return this.isFinished;
    }

    /* renamed from: isIdle, reason: from getter */
    public final boolean getIsIdle() {
        return this.isIdle;
    }

    /* renamed from: isPlaying, reason: from getter */
    public final boolean getIsPlaying() {
        return this.isPlaying;
    }

    /* renamed from: isReady, reason: from getter */
    public final boolean getIsReady() {
        return this.isReady;
    }

    @NotNull
    public String toString() {
        boolean z11 = this.isPlaying;
        boolean z12 = this.isBuffering;
        boolean z13 = this.isFinished;
        boolean z14 = this.isReady;
        boolean z15 = this.isIdle;
        long j11 = this.durationMs;
        StringBuilder d11 = a.d("PlayerStatusSnapshot(isPlaying=", ", isBuffering=", ", isFinished=", z11, z12);
        f.c(", isReady=", ", isIdle=", d11, z13, z14);
        d11.append(z15);
        d11.append(", durationMs=");
        d11.append(j11);
        d11.append(")");
        return d11.toString();
    }
}
