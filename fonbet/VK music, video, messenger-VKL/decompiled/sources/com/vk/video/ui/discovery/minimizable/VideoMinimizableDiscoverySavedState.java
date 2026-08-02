package com.vk.video.ui.discovery.minimizable;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.libvideo.api.minimizable.VideoMinimizableState;
import com.vk.video.ui.discovery.catalog.VideoDiscoveryCatalogSourceArgs;
import com.vk.video.ui.discovery.minimizable.fullscreen_lock.FullscreenLockState;
import com.vk.video.ui.discovery.minimizable.player.controllers.MiniPlayerControllersWrapper;
import com.vk.video.ui.discovery.minimizable.related_videos.VideoDiscoveryRelatedVideosSourceArgs;
import com.vk.video.ui.discovery.recommendations.VideoDiscoveryRecommendationsSourceArgs;
import xsna.epx;
import xsna.km50;

/* compiled from: VideoMinimizableDiscoverySavedState.kt */
/* loaded from: classes7.dex */
public final class VideoMinimizableDiscoverySavedState implements km50, Parcelable {
    public static final Parcelable.Creator<VideoMinimizableDiscoverySavedState> CREATOR = new a();
    public final MiniPlayerControllersWrapper.VideoInfo b;
    public final VideoMiniPlayerState c;
    public final VideoMinimizableState d;
    public final VideoDiscoveryRecommendationsSourceArgs e;
    public final VideoDiscoveryCatalogSourceArgs f;
    public final VideoDiscoveryRelatedVideosSourceArgs g;
    public final FullscreenLockState h;

    /* compiled from: VideoMinimizableDiscoverySavedState.kt */
    public static final class a implements Parcelable.Creator<VideoMinimizableDiscoverySavedState> {
        @Override // android.os.Parcelable.Creator
        public final VideoMinimizableDiscoverySavedState createFromParcel(Parcel parcel) {
            return new VideoMinimizableDiscoverySavedState(parcel.readInt() == 0 ? null : MiniPlayerControllersWrapper.VideoInfo.CREATOR.createFromParcel(parcel), VideoMiniPlayerState.CREATOR.createFromParcel(parcel), (VideoMinimizableState) parcel.readParcelable(VideoMinimizableDiscoverySavedState.class.getClassLoader()), (VideoDiscoveryRecommendationsSourceArgs) parcel.readParcelable(VideoMinimizableDiscoverySavedState.class.getClassLoader()), (VideoDiscoveryCatalogSourceArgs) parcel.readParcelable(VideoMinimizableDiscoverySavedState.class.getClassLoader()), (VideoDiscoveryRelatedVideosSourceArgs) parcel.readParcelable(VideoMinimizableDiscoverySavedState.class.getClassLoader()), (FullscreenLockState) parcel.readParcelable(VideoMinimizableDiscoverySavedState.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final VideoMinimizableDiscoverySavedState[] newArray(int i) {
            return new VideoMinimizableDiscoverySavedState[i];
        }
    }

    public VideoMinimizableDiscoverySavedState(MiniPlayerControllersWrapper.VideoInfo videoInfo, VideoMiniPlayerState videoMiniPlayerState, VideoMinimizableState videoMinimizableState, VideoDiscoveryRecommendationsSourceArgs videoDiscoveryRecommendationsSourceArgs, VideoDiscoveryCatalogSourceArgs videoDiscoveryCatalogSourceArgs, VideoDiscoveryRelatedVideosSourceArgs videoDiscoveryRelatedVideosSourceArgs, FullscreenLockState fullscreenLockState) {
        this.b = videoInfo;
        this.c = videoMiniPlayerState;
        this.d = videoMinimizableState;
        this.e = videoDiscoveryRecommendationsSourceArgs;
        this.f = videoDiscoveryCatalogSourceArgs;
        this.g = videoDiscoveryRelatedVideosSourceArgs;
        this.h = fullscreenLockState;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoMinimizableDiscoverySavedState)) {
            return false;
        }
        VideoMinimizableDiscoverySavedState videoMinimizableDiscoverySavedState = (VideoMinimizableDiscoverySavedState) obj;
        return epx.f(this.b, videoMinimizableDiscoverySavedState.b) && epx.f(this.c, videoMinimizableDiscoverySavedState.c) && epx.f(this.d, videoMinimizableDiscoverySavedState.d) && epx.f(this.e, videoMinimizableDiscoverySavedState.e) && epx.f(this.f, videoMinimizableDiscoverySavedState.f) && epx.f(this.g, videoMinimizableDiscoverySavedState.g) && epx.f(this.h, videoMinimizableDiscoverySavedState.h);
    }

    public final int hashCode() {
        MiniPlayerControllersWrapper.VideoInfo videoInfo = this.b;
        int hashCode = (this.d.hashCode() + ((this.c.hashCode() + ((videoInfo == null ? 0 : videoInfo.hashCode()) * 31)) * 31)) * 31;
        VideoDiscoveryRecommendationsSourceArgs videoDiscoveryRecommendationsSourceArgs = this.e;
        int hashCode2 = (hashCode + (videoDiscoveryRecommendationsSourceArgs == null ? 0 : videoDiscoveryRecommendationsSourceArgs.hashCode())) * 31;
        VideoDiscoveryCatalogSourceArgs videoDiscoveryCatalogSourceArgs = this.f;
        int hashCode3 = (hashCode2 + (videoDiscoveryCatalogSourceArgs == null ? 0 : videoDiscoveryCatalogSourceArgs.hashCode())) * 31;
        VideoDiscoveryRelatedVideosSourceArgs videoDiscoveryRelatedVideosSourceArgs = this.g;
        return this.h.hashCode() + ((hashCode3 + (videoDiscoveryRelatedVideosSourceArgs != null ? videoDiscoveryRelatedVideosSourceArgs.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "VideoMinimizableDiscoverySavedState(controllerArgs=" + this.b + ", miniPlayerState=" + this.c + ", minimizableState=" + this.d + ", recommendationsSourceArgs=" + this.e + ", catalogSourceArgs=" + this.f + ", relatedVideosSourceArgs=" + this.g + ", fullscreenLockState=" + this.h + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        MiniPlayerControllersWrapper.VideoInfo videoInfo = this.b;
        if (videoInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoInfo.writeToParcel(parcel, i);
        }
        this.c.writeToParcel(parcel, i);
        parcel.writeParcelable(this.d, i);
        parcel.writeParcelable(this.e, i);
        parcel.writeParcelable(this.f, i);
        parcel.writeParcelable(this.g, i);
        parcel.writeParcelable(this.h, i);
    }
}
