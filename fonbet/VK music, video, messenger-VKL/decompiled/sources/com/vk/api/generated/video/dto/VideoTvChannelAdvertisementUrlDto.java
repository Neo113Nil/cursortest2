package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: VideoTvChannelAdvertisementUrlDto.kt */
/* loaded from: classes15.dex */
public final class VideoTvChannelAdvertisementUrlDto implements Parcelable {
    public static final Parcelable.Creator<VideoTvChannelAdvertisementUrlDto> CREATOR = new a();

    @pmi0("scte35_upid")
    private final Integer scte35Upid;

    @pmi0("url")
    private final String url;

    /* compiled from: VideoTvChannelAdvertisementUrlDto.kt */
    public static final class a implements Parcelable.Creator<VideoTvChannelAdvertisementUrlDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoTvChannelAdvertisementUrlDto createFromParcel(Parcel parcel) {
            return new VideoTvChannelAdvertisementUrlDto(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final VideoTvChannelAdvertisementUrlDto[] newArray(int i) {
            return new VideoTvChannelAdvertisementUrlDto[i];
        }
    }

    public VideoTvChannelAdvertisementUrlDto(String str, Integer num) {
        this.url = str;
        this.scte35Upid = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoTvChannelAdvertisementUrlDto)) {
            return false;
        }
        VideoTvChannelAdvertisementUrlDto videoTvChannelAdvertisementUrlDto = (VideoTvChannelAdvertisementUrlDto) obj;
        return epx.f(this.url, videoTvChannelAdvertisementUrlDto.url) && epx.f(this.scte35Upid, videoTvChannelAdvertisementUrlDto.scte35Upid);
    }

    public final int hashCode() {
        int hashCode = this.url.hashCode() * 31;
        Integer num = this.scte35Upid;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoTvChannelAdvertisementUrlDto(url=");
        sb.append(this.url);
        sb.append(", scte35Upid=");
        return uqi.b(sb, this.scte35Upid, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.url);
        Integer num = this.scte35Upid;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ VideoTvChannelAdvertisementUrlDto(String str, Integer num, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : num);
    }
}
