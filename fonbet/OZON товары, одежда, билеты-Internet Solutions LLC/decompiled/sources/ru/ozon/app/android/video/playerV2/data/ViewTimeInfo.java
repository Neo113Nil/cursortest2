package ru.ozon.app.android.video.playerV2.data;

import C.C2702w;
import Pk0.c;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/video/playerV2/data/ViewTimeInfo;", "", "", "totalViewTimeMs", "currentPositionMs", "videoDurationMs", "<init>", "(JJJ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getTotalViewTimeMs", "()J", "getCurrentPositionMs", "getVideoDurationMs", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ViewTimeInfo {
    private final long currentPositionMs;
    private final long totalViewTimeMs;
    private final long videoDurationMs;

    public ViewTimeInfo(long j11, long j12, long j13) {
        this.totalViewTimeMs = j11;
        this.currentPositionMs = j12;
        this.videoDurationMs = j13;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ViewTimeInfo)) {
            return false;
        }
        ViewTimeInfo viewTimeInfo = (ViewTimeInfo) other;
        return this.totalViewTimeMs == viewTimeInfo.totalViewTimeMs && this.currentPositionMs == viewTimeInfo.currentPositionMs && this.videoDurationMs == viewTimeInfo.videoDurationMs;
    }

    public final long getTotalViewTimeMs() {
        return this.totalViewTimeMs;
    }

    public int hashCode() {
        return Long.hashCode(this.videoDurationMs) + c.a(Long.hashCode(this.totalViewTimeMs) * 31, 31, this.currentPositionMs);
    }

    @NotNull
    public String toString() {
        long j11 = this.totalViewTimeMs;
        long j12 = this.currentPositionMs;
        long j13 = this.videoDurationMs;
        StringBuilder d11 = C2702w.d(j11, "ViewTimeInfo(totalViewTimeMs=", ", currentPositionMs=");
        d11.append(j12);
        d11.append(", videoDurationMs=");
        d11.append(j13);
        d11.append(")");
        return d11.toString();
    }
}
