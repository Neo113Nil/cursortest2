package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.video.dto.VideoVideoFullDto;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ShortVideoRecomRebuildReplaceDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoRecomRebuildReplaceDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoRecomRebuildReplaceDto> CREATOR = new a();

    @pmi0("from_video_id")
    private final String fromVideoId;

    @pmi0("to_video")
    private final VideoVideoFullDto toVideo;

    /* compiled from: ShortVideoRecomRebuildReplaceDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoRecomRebuildReplaceDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoRecomRebuildReplaceDto createFromParcel(Parcel parcel) {
            return new ShortVideoRecomRebuildReplaceDto(parcel.readString(), (VideoVideoFullDto) parcel.readParcelable(ShortVideoRecomRebuildReplaceDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoRecomRebuildReplaceDto[] newArray(int i) {
            return new ShortVideoRecomRebuildReplaceDto[i];
        }
    }

    public ShortVideoRecomRebuildReplaceDto(String str, VideoVideoFullDto videoVideoFullDto) {
        this.fromVideoId = str;
        this.toVideo = videoVideoFullDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoRecomRebuildReplaceDto)) {
            return false;
        }
        ShortVideoRecomRebuildReplaceDto shortVideoRecomRebuildReplaceDto = (ShortVideoRecomRebuildReplaceDto) obj;
        return epx.f(this.fromVideoId, shortVideoRecomRebuildReplaceDto.fromVideoId) && epx.f(this.toVideo, shortVideoRecomRebuildReplaceDto.toVideo);
    }

    public final int hashCode() {
        int hashCode = this.fromVideoId.hashCode() * 31;
        VideoVideoFullDto videoVideoFullDto = this.toVideo;
        return hashCode + (videoVideoFullDto == null ? 0 : videoVideoFullDto.hashCode());
    }

    public final String toString() {
        return "ShortVideoRecomRebuildReplaceDto(fromVideoId=" + this.fromVideoId + ", toVideo=" + this.toVideo + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.fromVideoId);
        parcel.writeParcelable(this.toVideo, i);
    }

    public /* synthetic */ ShortVideoRecomRebuildReplaceDto(String str, VideoVideoFullDto videoVideoFullDto, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : videoVideoFullDto);
    }
}
