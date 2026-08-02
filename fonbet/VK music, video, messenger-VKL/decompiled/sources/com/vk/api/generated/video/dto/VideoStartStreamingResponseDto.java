package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.shy;
import xsna.uqi;
import xsna.urd0;
import xsna.zcl;

/* compiled from: VideoStartStreamingResponseDto.kt */
/* loaded from: classes15.dex */
public final class VideoStartStreamingResponseDto implements Parcelable {
    public static final Parcelable.Creator<VideoStartStreamingResponseDto> CREATOR = new a();

    @pmi0("access_key")
    private final String accessKey;

    @pmi0("description")
    private final String description;

    @pmi0("name")
    private final String name;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("post_id")
    private final Integer postId;

    @pmi0("stream")
    private final VideoStreamInputParamsDto stream;

    @pmi0("video_id")
    private final int videoId;

    /* compiled from: VideoStartStreamingResponseDto.kt */
    public static final class a implements Parcelable.Creator<VideoStartStreamingResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoStartStreamingResponseDto createFromParcel(Parcel parcel) {
            return new VideoStartStreamingResponseDto((UserId) parcel.readParcelable(VideoStartStreamingResponseDto.class.getClassLoader()), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), VideoStreamInputParamsDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final VideoStartStreamingResponseDto[] newArray(int i) {
            return new VideoStartStreamingResponseDto[i];
        }
    }

    public VideoStartStreamingResponseDto(UserId userId, int i, String str, String str2, String str3, VideoStreamInputParamsDto videoStreamInputParamsDto, Integer num) {
        this.ownerId = userId;
        this.videoId = i;
        this.name = str;
        this.description = str2;
        this.accessKey = str3;
        this.stream = videoStreamInputParamsDto;
        this.postId = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoStartStreamingResponseDto)) {
            return false;
        }
        VideoStartStreamingResponseDto videoStartStreamingResponseDto = (VideoStartStreamingResponseDto) obj;
        return epx.f(this.ownerId, videoStartStreamingResponseDto.ownerId) && this.videoId == videoStartStreamingResponseDto.videoId && epx.f(this.name, videoStartStreamingResponseDto.name) && epx.f(this.description, videoStartStreamingResponseDto.description) && epx.f(this.accessKey, videoStartStreamingResponseDto.accessKey) && epx.f(this.stream, videoStartStreamingResponseDto.stream) && epx.f(this.postId, videoStartStreamingResponseDto.postId);
    }

    public final int hashCode() {
        int hashCode = (this.stream.hashCode() + urd0.a(urd0.a(urd0.a(shy.a(this.videoId, Long.hashCode(this.ownerId.b) * 31, 31), 31, this.name), 31, this.description), 31, this.accessKey)) * 31;
        Integer num = this.postId;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoStartStreamingResponseDto(ownerId=");
        sb.append(this.ownerId);
        sb.append(", videoId=");
        sb.append(this.videoId);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", accessKey=");
        sb.append(this.accessKey);
        sb.append(", stream=");
        sb.append(this.stream);
        sb.append(", postId=");
        return uqi.b(sb, this.postId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.ownerId, i);
        parcel.writeInt(this.videoId);
        parcel.writeString(this.name);
        parcel.writeString(this.description);
        parcel.writeString(this.accessKey);
        this.stream.writeToParcel(parcel, i);
        Integer num = this.postId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ VideoStartStreamingResponseDto(UserId userId, int i, String str, String str2, String str3, VideoStreamInputParamsDto videoStreamInputParamsDto, Integer num, int i2, zcl zclVar) {
        this(userId, i, str, str2, str3, videoStreamInputParamsDto, (i2 & 64) != 0 ? null : num);
    }
}
