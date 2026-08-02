package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.C4217a2;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import ru.ok.android.webrtc.connection.BadConnectionSignaling;
import xsna.pmi0;
import xsna.shy;
import xsna.wp;
import xsna.zcl;

/* compiled from: VideoGetStreamOptionsResponseDto.kt */
/* loaded from: classes15.dex */
public final class VideoGetStreamOptionsResponseDto implements Parcelable {
    public static final Parcelable.Creator<VideoGetStreamOptionsResponseDto> CREATOR = new a();

    @pmi0("adaptive_bitrate")
    private final BaseBoolIntDto adaptiveBitrate;

    @pmi0(BadConnectionSignaling.KEY_BAD_NET_BITRATE)
    private final int bitrate;

    @pmi0(C4217a2.e)
    private final BaseBoolIntDto disabled;

    @pmi0("height")
    private final int height;

    @pmi0("music")
    private final BaseBoolIntDto music;

    @pmi0("rotation")
    private final int rotation;

    @pmi0("width")
    private final int width;

    /* compiled from: VideoGetStreamOptionsResponseDto.kt */
    public static final class a implements Parcelable.Creator<VideoGetStreamOptionsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoGetStreamOptionsResponseDto createFromParcel(Parcel parcel) {
            return new VideoGetStreamOptionsResponseDto((BaseBoolIntDto) parcel.readParcelable(VideoGetStreamOptionsResponseDto.class.getClassLoader()), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), (BaseBoolIntDto) parcel.readParcelable(VideoGetStreamOptionsResponseDto.class.getClassLoader()), (BaseBoolIntDto) parcel.readParcelable(VideoGetStreamOptionsResponseDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final VideoGetStreamOptionsResponseDto[] newArray(int i) {
            return new VideoGetStreamOptionsResponseDto[i];
        }
    }

    public VideoGetStreamOptionsResponseDto(BaseBoolIntDto baseBoolIntDto, int i, int i2, int i3, int i4, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3) {
        this.disabled = baseBoolIntDto;
        this.bitrate = i;
        this.height = i2;
        this.width = i3;
        this.rotation = i4;
        this.music = baseBoolIntDto2;
        this.adaptiveBitrate = baseBoolIntDto3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoGetStreamOptionsResponseDto)) {
            return false;
        }
        VideoGetStreamOptionsResponseDto videoGetStreamOptionsResponseDto = (VideoGetStreamOptionsResponseDto) obj;
        return this.disabled == videoGetStreamOptionsResponseDto.disabled && this.bitrate == videoGetStreamOptionsResponseDto.bitrate && this.height == videoGetStreamOptionsResponseDto.height && this.width == videoGetStreamOptionsResponseDto.width && this.rotation == videoGetStreamOptionsResponseDto.rotation && this.music == videoGetStreamOptionsResponseDto.music && this.adaptiveBitrate == videoGetStreamOptionsResponseDto.adaptiveBitrate;
    }

    public final int hashCode() {
        int b = wp.b(this.music, shy.a(this.rotation, shy.a(this.width, shy.a(this.height, shy.a(this.bitrate, this.disabled.hashCode() * 31, 31), 31), 31), 31), 31);
        BaseBoolIntDto baseBoolIntDto = this.adaptiveBitrate;
        return b + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode());
    }

    public final String toString() {
        return "VideoGetStreamOptionsResponseDto(disabled=" + this.disabled + ", bitrate=" + this.bitrate + ", height=" + this.height + ", width=" + this.width + ", rotation=" + this.rotation + ", music=" + this.music + ", adaptiveBitrate=" + this.adaptiveBitrate + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.disabled, i);
        parcel.writeInt(this.bitrate);
        parcel.writeInt(this.height);
        parcel.writeInt(this.width);
        parcel.writeInt(this.rotation);
        parcel.writeParcelable(this.music, i);
        parcel.writeParcelable(this.adaptiveBitrate, i);
    }

    public /* synthetic */ VideoGetStreamOptionsResponseDto(BaseBoolIntDto baseBoolIntDto, int i, int i2, int i3, int i4, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, int i5, zcl zclVar) {
        this(baseBoolIntDto, i, i2, i3, i4, baseBoolIntDto2, (i5 & 64) != 0 ? null : baseBoolIntDto3);
    }
}
