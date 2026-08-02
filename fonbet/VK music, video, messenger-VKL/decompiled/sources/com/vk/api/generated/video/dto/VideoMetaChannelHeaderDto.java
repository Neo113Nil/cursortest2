package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseOwnerCoverDto;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: VideoMetaChannelHeaderDto.kt */
/* loaded from: classes15.dex */
public final class VideoMetaChannelHeaderDto implements Parcelable {
    public static final Parcelable.Creator<VideoMetaChannelHeaderDto> CREATOR = new a();

    @pmi0("counters")
    private final VideoMetaChannelCountersDto counters;

    @pmi0("description")
    private final String description;

    @pmi0("id")
    private final long id;

    @pmi0("name")
    private final String name;

    @pmi0("photo_base")
    private final String photoBase;

    @pmi0("short_description")
    private final String shortDescription;

    @pmi0("ucp_id")
    private final String ucpId;

    @pmi0("video_cover")
    private final BaseOwnerCoverDto videoCover;

    /* compiled from: VideoMetaChannelHeaderDto.kt */
    public static final class a implements Parcelable.Creator<VideoMetaChannelHeaderDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoMetaChannelHeaderDto createFromParcel(Parcel parcel) {
            return new VideoMetaChannelHeaderDto(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : VideoMetaChannelCountersDto.CREATOR.createFromParcel(parcel), parcel.readString(), (BaseOwnerCoverDto) parcel.readParcelable(VideoMetaChannelHeaderDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final VideoMetaChannelHeaderDto[] newArray(int i) {
            return new VideoMetaChannelHeaderDto[i];
        }
    }

    public VideoMetaChannelHeaderDto(long j, String str, String str2, String str3, String str4, VideoMetaChannelCountersDto videoMetaChannelCountersDto, String str5, BaseOwnerCoverDto baseOwnerCoverDto) {
        this.id = j;
        this.ucpId = str;
        this.name = str2;
        this.description = str3;
        this.shortDescription = str4;
        this.counters = videoMetaChannelCountersDto;
        this.photoBase = str5;
        this.videoCover = baseOwnerCoverDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoMetaChannelHeaderDto)) {
            return false;
        }
        VideoMetaChannelHeaderDto videoMetaChannelHeaderDto = (VideoMetaChannelHeaderDto) obj;
        return this.id == videoMetaChannelHeaderDto.id && epx.f(this.ucpId, videoMetaChannelHeaderDto.ucpId) && epx.f(this.name, videoMetaChannelHeaderDto.name) && epx.f(this.description, videoMetaChannelHeaderDto.description) && epx.f(this.shortDescription, videoMetaChannelHeaderDto.shortDescription) && epx.f(this.counters, videoMetaChannelHeaderDto.counters) && epx.f(this.photoBase, videoMetaChannelHeaderDto.photoBase) && epx.f(this.videoCover, videoMetaChannelHeaderDto.videoCover);
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(Long.hashCode(this.id) * 31, 31, this.ucpId), 31, this.name);
        String str = this.description;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.shortDescription;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        VideoMetaChannelCountersDto videoMetaChannelCountersDto = this.counters;
        int hashCode3 = (hashCode2 + (videoMetaChannelCountersDto == null ? 0 : videoMetaChannelCountersDto.hashCode())) * 31;
        String str3 = this.photoBase;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        BaseOwnerCoverDto baseOwnerCoverDto = this.videoCover;
        return hashCode4 + (baseOwnerCoverDto != null ? baseOwnerCoverDto.hashCode() : 0);
    }

    public final String toString() {
        return "VideoMetaChannelHeaderDto(id=" + this.id + ", ucpId=" + this.ucpId + ", name=" + this.name + ", description=" + this.description + ", shortDescription=" + this.shortDescription + ", counters=" + this.counters + ", photoBase=" + this.photoBase + ", videoCover=" + this.videoCover + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.id);
        parcel.writeString(this.ucpId);
        parcel.writeString(this.name);
        parcel.writeString(this.description);
        parcel.writeString(this.shortDescription);
        VideoMetaChannelCountersDto videoMetaChannelCountersDto = this.counters;
        if (videoMetaChannelCountersDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoMetaChannelCountersDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.photoBase);
        parcel.writeParcelable(this.videoCover, i);
    }

    public /* synthetic */ VideoMetaChannelHeaderDto(long j, String str, String str2, String str3, String str4, VideoMetaChannelCountersDto videoMetaChannelCountersDto, String str5, BaseOwnerCoverDto baseOwnerCoverDto, int i, zcl zclVar) {
        this(j, str, str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : videoMetaChannelCountersDto, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : baseOwnerCoverDto);
    }
}
