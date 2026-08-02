package ru.ozon.app.android.video.player;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0005\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/video/player/PlayerState;", "", "", "duration", "", "isPortraitOrientationWithRatio", "<init>", "(JLjava/lang/Boolean;)V", "copy", "(JLjava/lang/Boolean;)Lru/ozon/app/android/video/player/PlayerState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getDuration", "()J", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class PlayerState {
    private final long duration;
    private final Boolean isPortraitOrientationWithRatio;

    public PlayerState(long j11, Boolean bool) {
        this.duration = j11;
        this.isPortraitOrientationWithRatio = bool;
    }

    public static /* synthetic */ PlayerState copy$default(PlayerState playerState, long j11, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = playerState.duration;
        }
        if ((i11 & 2) != 0) {
            bool = playerState.isPortraitOrientationWithRatio;
        }
        return playerState.copy(j11, bool);
    }

    @NotNull
    public final PlayerState copy(long duration, Boolean isPortraitOrientationWithRatio) {
        return new PlayerState(duration, isPortraitOrientationWithRatio);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlayerState)) {
            return false;
        }
        PlayerState playerState = (PlayerState) other;
        return this.duration == playerState.duration && Intrinsics.d(this.isPortraitOrientationWithRatio, playerState.isPortraitOrientationWithRatio);
    }

    public final long getDuration() {
        return this.duration;
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.duration) * 31;
        Boolean bool = this.isPortraitOrientationWithRatio;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    @NotNull
    public String toString() {
        return "PlayerState(duration=" + this.duration + ", isPortraitOrientationWithRatio=" + this.isPortraitOrientationWithRatio + ")";
    }

    public /* synthetic */ PlayerState(long j11, Boolean bool, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, (i11 & 2) != 0 ? null : bool);
    }
}
