package com.blaze.blazesdk.features.videos.models.local;

import androidx.annotation.Keep;
import defpackage.g7a;
import defpackage.lnb;
import defpackage.u0a;
import defpackage.utl;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJ8\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\"\u0010\u0005\u001a\u00020\u00048\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u0005\u0010\u000e\"\u0004\b\u001f\u0010 R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\b\u0010\u000e¨\u0006#"}, d2 = {"Lcom/blaze/blazesdk/features/videos/models/local/VideoViewed;", "Lutl;", "", "videoId", "", "isSynced", "", "lastViewedMs", "isRead", "<init>", "(Ljava/lang/String;ZFZ)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "()F", "component4", "copy", "(Ljava/lang/String;ZFZ)Lcom/blaze/blazesdk/features/videos/models/local/VideoViewed;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getVideoId", "Z", "setSynced", "(Z)V", "F", "getLastViewedMs", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class VideoViewed implements utl {
    public static final int $stable = 8;
    private final boolean isRead;
    private boolean isSynced;
    private final float lastViewedMs;

    @NotNull
    private final String videoId;

    public VideoViewed(@NotNull String str, boolean z, float f, boolean z2) {
        str.getClass();
        this.videoId = str;
        this.isSynced = z;
        this.lastViewedMs = f;
        this.isRead = z2;
    }

    public static /* synthetic */ VideoViewed copy$default(VideoViewed videoViewed, String str, boolean z, float f, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = videoViewed.videoId;
        }
        if ((i & 2) != 0) {
            z = videoViewed.isSynced;
        }
        if ((i & 4) != 0) {
            f = videoViewed.lastViewedMs;
        }
        if ((i & 8) != 0) {
            z2 = videoViewed.isRead;
        }
        return videoViewed.copy(str, z, f, z2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getVideoId() {
        return this.videoId;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsSynced() {
        return this.isSynced;
    }

    /* renamed from: component3, reason: from getter */
    public final float getLastViewedMs() {
        return this.lastViewedMs;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsRead() {
        return this.isRead;
    }

    @NotNull
    public final VideoViewed copy(@NotNull String videoId, boolean isSynced, float lastViewedMs, boolean isRead) {
        videoId.getClass();
        return new VideoViewed(videoId, isSynced, lastViewedMs, isRead);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoViewed)) {
            return false;
        }
        VideoViewed videoViewed = (VideoViewed) other;
        return Intrinsics.c(this.videoId, videoViewed.videoId) && this.isSynced == videoViewed.isSynced && Float.compare(this.lastViewedMs, videoViewed.lastViewedMs) == 0 && this.isRead == videoViewed.isRead;
    }

    public final float getLastViewedMs() {
        return this.lastViewedMs;
    }

    @NotNull
    public final String getVideoId() {
        return this.videoId;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isRead) + g7a.o(this.lastViewedMs, u0a.t(this.videoId.hashCode() * 31, this.isSynced));
    }

    public final boolean isRead() {
        return this.isRead;
    }

    public boolean isSynced() {
        return this.isSynced;
    }

    @Override // defpackage.utl
    public void setSynced(boolean z) {
        this.isSynced = z;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("VideoViewed(videoId=");
        sb.append(this.videoId);
        sb.append(", isSynced=");
        sb.append(this.isSynced);
        sb.append(", lastViewedMs=");
        sb.append(this.lastViewedMs);
        sb.append(", isRead=");
        return lnb.r(sb, this.isRead, ')');
    }
}
