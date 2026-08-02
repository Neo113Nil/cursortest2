package com.vk.video.ui.discovery.minimizable.player;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.zcl;

/* compiled from: VideoPlayerState.kt */
/* loaded from: classes7.dex */
public final class VideoPlayerState implements Parcelable {
    public static final Parcelable.Creator<VideoPlayerState> CREATOR = new a();
    public final VideoPlayerStatus b;
    public final VideoPlayerProgress c;
    public final VideoPlayerStatInfo d;
    public final AdProgressState e;

    /* compiled from: VideoPlayerState.kt */
    public static final class a implements Parcelable.Creator<VideoPlayerState> {
        @Override // android.os.Parcelable.Creator
        public final VideoPlayerState createFromParcel(Parcel parcel) {
            return new VideoPlayerState((VideoPlayerStatus) parcel.readParcelable(VideoPlayerState.class.getClassLoader()), (VideoPlayerProgress) parcel.readParcelable(VideoPlayerState.class.getClassLoader()), parcel.readInt() == 0 ? null : VideoPlayerStatInfo.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AdProgressState.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoPlayerState[] newArray(int i) {
            return new VideoPlayerState[i];
        }
    }

    public VideoPlayerState(VideoPlayerStatus videoPlayerStatus, VideoPlayerProgress videoPlayerProgress, VideoPlayerStatInfo videoPlayerStatInfo, AdProgressState adProgressState) {
        this.b = videoPlayerStatus;
        this.c = videoPlayerProgress;
        this.d = videoPlayerStatInfo;
        this.e = adProgressState;
    }

    public static VideoPlayerState a(VideoPlayerState videoPlayerState, VideoPlayerStatus videoPlayerStatus, VideoPlayerProgress videoPlayerProgress, VideoPlayerStatInfo videoPlayerStatInfo, AdProgressState adProgressState, int i) {
        if ((i & 1) != 0) {
            videoPlayerStatus = videoPlayerState.b;
        }
        if ((i & 2) != 0) {
            videoPlayerProgress = videoPlayerState.c;
        }
        if ((i & 4) != 0) {
            videoPlayerStatInfo = videoPlayerState.d;
        }
        if ((i & 8) != 0) {
            adProgressState = videoPlayerState.e;
        }
        videoPlayerState.getClass();
        return new VideoPlayerState(videoPlayerStatus, videoPlayerProgress, videoPlayerStatInfo, adProgressState);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoPlayerState)) {
            return false;
        }
        VideoPlayerState videoPlayerState = (VideoPlayerState) obj;
        return epx.f(this.b, videoPlayerState.b) && epx.f(this.c, videoPlayerState.c) && epx.f(this.d, videoPlayerState.d) && epx.f(this.e, videoPlayerState.e);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + (this.b.hashCode() * 31)) * 31;
        VideoPlayerStatInfo videoPlayerStatInfo = this.d;
        int hashCode2 = (hashCode + (videoPlayerStatInfo == null ? 0 : videoPlayerStatInfo.hashCode())) * 31;
        AdProgressState adProgressState = this.e;
        return hashCode2 + (adProgressState != null ? adProgressState.hashCode() : 0);
    }

    public final String toString() {
        return "VideoPlayerState(status=" + this.b + ", progress=" + this.c + ", statInfo=" + this.d + ", adProgress=" + this.e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
        VideoPlayerStatInfo videoPlayerStatInfo = this.d;
        if (videoPlayerStatInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoPlayerStatInfo.writeToParcel(parcel, i);
        }
        AdProgressState adProgressState = this.e;
        if (adProgressState == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            adProgressState.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ VideoPlayerState(VideoPlayerStatus videoPlayerStatus, VideoPlayerProgress videoPlayerProgress, VideoPlayerStatInfo videoPlayerStatInfo, AdProgressState adProgressState, int i, zcl zclVar) {
        this(videoPlayerStatus, videoPlayerProgress, (i & 4) != 0 ? null : videoPlayerStatInfo, (i & 8) != 0 ? null : adProgressState);
    }
}
