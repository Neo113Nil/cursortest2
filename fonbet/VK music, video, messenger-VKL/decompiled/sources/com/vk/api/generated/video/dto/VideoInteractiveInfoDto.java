package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;

/* compiled from: VideoInteractiveInfoDto.kt */
/* loaded from: classes15.dex */
public final class VideoInteractiveInfoDto implements Parcelable {
    public static final Parcelable.Creator<VideoInteractiveInfoDto> CREATOR = new a();

    @pmi0("current_video")
    private final VideoInteractiveCurrentVideoDto currentVideo;

    @pmi0("manifests")
    private final VideoInteractiveInfoManifestsDto manifests;

    /* compiled from: VideoInteractiveInfoDto.kt */
    public static final class a implements Parcelable.Creator<VideoInteractiveInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoInteractiveInfoDto createFromParcel(Parcel parcel) {
            return new VideoInteractiveInfoDto(VideoInteractiveInfoManifestsDto.CREATOR.createFromParcel(parcel), VideoInteractiveCurrentVideoDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final VideoInteractiveInfoDto[] newArray(int i) {
            return new VideoInteractiveInfoDto[i];
        }
    }

    public VideoInteractiveInfoDto(VideoInteractiveInfoManifestsDto videoInteractiveInfoManifestsDto, VideoInteractiveCurrentVideoDto videoInteractiveCurrentVideoDto) {
        this.manifests = videoInteractiveInfoManifestsDto;
        this.currentVideo = videoInteractiveCurrentVideoDto;
    }

    public final VideoInteractiveCurrentVideoDto d() {
        return this.currentVideo;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final VideoInteractiveInfoManifestsDto e() {
        return this.manifests;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoInteractiveInfoDto)) {
            return false;
        }
        VideoInteractiveInfoDto videoInteractiveInfoDto = (VideoInteractiveInfoDto) obj;
        return epx.f(this.manifests, videoInteractiveInfoDto.manifests) && epx.f(this.currentVideo, videoInteractiveInfoDto.currentVideo);
    }

    public final int hashCode() {
        return this.currentVideo.hashCode() + (this.manifests.hashCode() * 31);
    }

    public final String toString() {
        return "VideoInteractiveInfoDto(manifests=" + this.manifests + ", currentVideo=" + this.currentVideo + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.manifests.writeToParcel(parcel, i);
        this.currentVideo.writeToParcel(parcel, i);
    }
}
