package ru.ozon.app.android.video.playerV2.performance.playback.playbackData;

import B0.C2454a;
import P4.f;
import Ql.c;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ8\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001a\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/video/playerV2/performance/playback/playbackData/PlaybackStatsData;", "", "", "viewTime", "", "errorsCount", "stallCount", "stallDuration", "<init>", "(JIIJ)V", "copy", "(JIIJ)Lru/ozon/app/android/video/playerV2/performance/playback/playbackData/PlaybackStatsData;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getViewTime", "()J", "I", "getErrorsCount", "getStallCount", "getStallDuration", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class PlaybackStatsData {
    private final int errorsCount;
    private final int stallCount;
    private final long stallDuration;
    private final long viewTime;

    public PlaybackStatsData(long j11, int i11, int i12, long j12) {
        this.viewTime = j11;
        this.errorsCount = i11;
        this.stallCount = i12;
        this.stallDuration = j12;
    }

    public static /* synthetic */ PlaybackStatsData copy$default(PlaybackStatsData playbackStatsData, long j11, int i11, int i12, long j12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            j11 = playbackStatsData.viewTime;
        }
        long j13 = j11;
        if ((i13 & 2) != 0) {
            i11 = playbackStatsData.errorsCount;
        }
        int i14 = i11;
        if ((i13 & 4) != 0) {
            i12 = playbackStatsData.stallCount;
        }
        int i15 = i12;
        if ((i13 & 8) != 0) {
            j12 = playbackStatsData.stallDuration;
        }
        return playbackStatsData.copy(j13, i14, i15, j12);
    }

    @NotNull
    public final PlaybackStatsData copy(long viewTime, int errorsCount, int stallCount, long stallDuration) {
        return new PlaybackStatsData(viewTime, errorsCount, stallCount, stallDuration);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlaybackStatsData)) {
            return false;
        }
        PlaybackStatsData playbackStatsData = (PlaybackStatsData) other;
        return this.viewTime == playbackStatsData.viewTime && this.errorsCount == playbackStatsData.errorsCount && this.stallCount == playbackStatsData.stallCount && this.stallDuration == playbackStatsData.stallDuration;
    }

    public final int getErrorsCount() {
        return this.errorsCount;
    }

    public final int getStallCount() {
        return this.stallCount;
    }

    public final long getStallDuration() {
        return this.stallDuration;
    }

    public final long getViewTime() {
        return this.viewTime;
    }

    public int hashCode() {
        return Long.hashCode(this.stallDuration) + C2454a.a(this.stallCount, C2454a.a(this.errorsCount, Long.hashCode(this.viewTime) * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.viewTime;
        int i11 = this.errorsCount;
        int i12 = this.stallCount;
        long j12 = this.stallDuration;
        StringBuilder b11 = c.b(j11, "PlaybackStatsData(viewTime=", i11, ", errorsCount=");
        b11.append(", stallCount=");
        b11.append(i12);
        b11.append(", stallDuration=");
        return f.a(j12, ")", b11);
    }
}
