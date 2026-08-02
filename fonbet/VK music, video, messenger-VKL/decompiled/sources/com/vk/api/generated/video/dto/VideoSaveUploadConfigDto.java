package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import io.reactivex.rxjava3.subjects.b;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.so;
import xsna.zcl;

/* compiled from: VideoSaveUploadConfigDto.kt */
/* loaded from: classes15.dex */
public final class VideoSaveUploadConfigDto implements Parcelable {
    public static final Parcelable.Creator<VideoSaveUploadConfigDto> CREATOR = new a();

    @pmi0("background_upload_enabled")
    private final Boolean backgroundUploadEnabled;

    @pmi0("factor")
    private final Float factor;

    @pmi0("max_delay")
    private final Integer maxDelay;

    @pmi0("min_delay")
    private final Integer minDelay;

    @pmi0("retry_count")
    private final Integer retryCount;

    @pmi0("upload_channels_count")
    private final Integer uploadChannelsCount;

    /* compiled from: VideoSaveUploadConfigDto.kt */
    public static final class a implements Parcelable.Creator<VideoSaveUploadConfigDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoSaveUploadConfigDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new VideoSaveUploadConfigDto(valueOf2, valueOf3, valueOf, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Float.valueOf(parcel.readFloat()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoSaveUploadConfigDto[] newArray(int i) {
            return new VideoSaveUploadConfigDto[i];
        }
    }

    public VideoSaveUploadConfigDto() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoSaveUploadConfigDto)) {
            return false;
        }
        VideoSaveUploadConfigDto videoSaveUploadConfigDto = (VideoSaveUploadConfigDto) obj;
        return epx.f(this.retryCount, videoSaveUploadConfigDto.retryCount) && epx.f(this.uploadChannelsCount, videoSaveUploadConfigDto.uploadChannelsCount) && epx.f(this.backgroundUploadEnabled, videoSaveUploadConfigDto.backgroundUploadEnabled) && epx.f(this.minDelay, videoSaveUploadConfigDto.minDelay) && epx.f(this.maxDelay, videoSaveUploadConfigDto.maxDelay) && epx.f(this.factor, videoSaveUploadConfigDto.factor);
    }

    public final int hashCode() {
        Integer num = this.retryCount;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.uploadChannelsCount;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.backgroundUploadEnabled;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num3 = this.minDelay;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.maxDelay;
        int hashCode5 = (hashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Float f = this.factor;
        return hashCode5 + (f != null ? f.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoSaveUploadConfigDto(retryCount=");
        sb.append(this.retryCount);
        sb.append(", uploadChannelsCount=");
        sb.append(this.uploadChannelsCount);
        sb.append(", backgroundUploadEnabled=");
        sb.append(this.backgroundUploadEnabled);
        sb.append(", minDelay=");
        sb.append(this.minDelay);
        sb.append(", maxDelay=");
        sb.append(this.maxDelay);
        sb.append(", factor=");
        return so.b(sb, this.factor, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.retryCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.uploadChannelsCount;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Boolean bool = this.backgroundUploadEnabled;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Integer num3 = this.minDelay;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        Integer num4 = this.maxDelay;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num4);
        }
        Float f = this.factor;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f);
        }
    }

    public VideoSaveUploadConfigDto(Integer num, Integer num2, Boolean bool, Integer num3, Integer num4, Float f) {
        this.retryCount = num;
        this.uploadChannelsCount = num2;
        this.backgroundUploadEnabled = bool;
        this.minDelay = num3;
        this.maxDelay = num4;
        this.factor = f;
    }

    public /* synthetic */ VideoSaveUploadConfigDto(Integer num, Integer num2, Boolean bool, Integer num3, Integer num4, Float f, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : num3, (i & 16) != 0 ? null : num4, (i & 32) != 0 ? null : f);
    }
}
