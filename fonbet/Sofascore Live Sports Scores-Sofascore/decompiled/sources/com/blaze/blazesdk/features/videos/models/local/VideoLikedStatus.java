package com.blaze.blazesdk.features.videos.models.local;

import androidx.annotation.Keep;
import defpackage.lnb;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/blaze/blazesdk/features/videos/models/local/VideoLikedStatus;", "", "videoId", "", "isLiked", "", "<init>", "(Ljava/lang/String;Z)V", "getVideoId", "()Ljava/lang/String;", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class VideoLikedStatus {
    public static final int $stable = 0;
    private final boolean isLiked;

    @NotNull
    private final String videoId;

    public VideoLikedStatus(@NotNull String str, boolean z) {
        str.getClass();
        this.videoId = str;
        this.isLiked = z;
    }

    public static /* synthetic */ VideoLikedStatus copy$default(VideoLikedStatus videoLikedStatus, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = videoLikedStatus.videoId;
        }
        if ((i & 2) != 0) {
            z = videoLikedStatus.isLiked;
        }
        return videoLikedStatus.copy(str, z);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getVideoId() {
        return this.videoId;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsLiked() {
        return this.isLiked;
    }

    @NotNull
    public final VideoLikedStatus copy(@NotNull String videoId, boolean isLiked) {
        videoId.getClass();
        return new VideoLikedStatus(videoId, isLiked);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoLikedStatus)) {
            return false;
        }
        VideoLikedStatus videoLikedStatus = (VideoLikedStatus) other;
        return Intrinsics.c(this.videoId, videoLikedStatus.videoId) && this.isLiked == videoLikedStatus.isLiked;
    }

    @NotNull
    public final String getVideoId() {
        return this.videoId;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isLiked) + (this.videoId.hashCode() * 31);
    }

    public final boolean isLiked() {
        return this.isLiked;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("VideoLikedStatus(videoId=");
        sb.append(this.videoId);
        sb.append(", isLiked=");
        return lnb.r(sb, this.isLiked, ')');
    }
}
