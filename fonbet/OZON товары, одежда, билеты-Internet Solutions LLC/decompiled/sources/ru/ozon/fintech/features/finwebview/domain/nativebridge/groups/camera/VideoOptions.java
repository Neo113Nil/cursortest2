package ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.camera;

import Pk0.c;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import g.C6594f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lru/ozon/fintech/features/finwebview/domain/nativebridge/groups/camera/VideoOptions;", "", "enabled", "", "chunkDurationMs", "", "videoQuality", "", "<init>", "(ZJLjava/lang/String;)V", "getEnabled", "()Z", "getChunkDurationMs", "()J", "getVideoQuality", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "finwebview_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class VideoOptions {
    private final long chunkDurationMs;
    private final boolean enabled;

    @NotNull
    private final String videoQuality;

    public VideoOptions(@i(name = "enabled") boolean z11, @i(name = "chunkDurationMs") long j11, @i(name = "videoQuality") @NotNull String videoQuality) {
        Intrinsics.checkNotNullParameter(videoQuality, "videoQuality");
        this.enabled = z11;
        this.chunkDurationMs = j11;
        this.videoQuality = videoQuality;
    }

    public static /* synthetic */ VideoOptions copy$default(VideoOptions videoOptions, boolean z11, long j11, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = videoOptions.enabled;
        }
        if ((i11 & 2) != 0) {
            j11 = videoOptions.chunkDurationMs;
        }
        if ((i11 & 4) != 0) {
            str = videoOptions.videoQuality;
        }
        return videoOptions.copy(z11, j11, str);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* renamed from: component2, reason: from getter */
    public final long getChunkDurationMs() {
        return this.chunkDurationMs;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getVideoQuality() {
        return this.videoQuality;
    }

    @NotNull
    public final VideoOptions copy(@i(name = "enabled") boolean enabled, @i(name = "chunkDurationMs") long chunkDurationMs, @i(name = "videoQuality") @NotNull String videoQuality) {
        Intrinsics.checkNotNullParameter(videoQuality, "videoQuality");
        return new VideoOptions(enabled, chunkDurationMs, videoQuality);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoOptions)) {
            return false;
        }
        VideoOptions videoOptions = (VideoOptions) other;
        return this.enabled == videoOptions.enabled && this.chunkDurationMs == videoOptions.chunkDurationMs && Intrinsics.d(this.videoQuality, videoOptions.videoQuality);
    }

    public final long getChunkDurationMs() {
        return this.chunkDurationMs;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    @NotNull
    public final String getVideoQuality() {
        return this.videoQuality;
    }

    public int hashCode() {
        return this.videoQuality.hashCode() + c.a(Boolean.hashCode(this.enabled) * 31, 31, this.chunkDurationMs);
    }

    @NotNull
    public String toString() {
        boolean z11 = this.enabled;
        long j11 = this.chunkDurationMs;
        String str = this.videoQuality;
        StringBuilder sb2 = new StringBuilder("VideoOptions(enabled=");
        sb2.append(z11);
        sb2.append(", chunkDurationMs=");
        sb2.append(j11);
        return C6594f.a(", videoQuality=", str, ")", sb2);
    }
}
