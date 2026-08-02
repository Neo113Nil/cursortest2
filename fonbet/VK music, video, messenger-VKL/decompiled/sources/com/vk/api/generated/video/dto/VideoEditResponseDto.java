package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: VideoEditResponseDto.kt */
/* loaded from: classes15.dex */
public final class VideoEditResponseDto implements Parcelable {
    public static final Parcelable.Creator<VideoEditResponseDto> CREATOR = new a();

    @pmi0("access_key")
    private final String accessKey;

    @pmi0("success")
    private final BaseBoolIntDto success;

    /* compiled from: VideoEditResponseDto.kt */
    public static final class a implements Parcelable.Creator<VideoEditResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoEditResponseDto createFromParcel(Parcel parcel) {
            return new VideoEditResponseDto((BaseBoolIntDto) parcel.readParcelable(VideoEditResponseDto.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoEditResponseDto[] newArray(int i) {
            return new VideoEditResponseDto[i];
        }
    }

    public VideoEditResponseDto(BaseBoolIntDto baseBoolIntDto, String str) {
        this.success = baseBoolIntDto;
        this.accessKey = str;
    }

    public final String d() {
        return this.accessKey;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final BaseBoolIntDto e() {
        return this.success;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoEditResponseDto)) {
            return false;
        }
        VideoEditResponseDto videoEditResponseDto = (VideoEditResponseDto) obj;
        return this.success == videoEditResponseDto.success && epx.f(this.accessKey, videoEditResponseDto.accessKey);
    }

    public final int hashCode() {
        int hashCode = this.success.hashCode() * 31;
        String str = this.accessKey;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoEditResponseDto(success=");
        sb.append(this.success);
        sb.append(", accessKey=");
        return ho8.a(sb, this.accessKey, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.success, i);
        parcel.writeString(this.accessKey);
    }

    public /* synthetic */ VideoEditResponseDto(BaseBoolIntDto baseBoolIntDto, String str, int i, zcl zclVar) {
        this(baseBoolIntDto, (i & 2) != 0 ? null : str);
    }
}
