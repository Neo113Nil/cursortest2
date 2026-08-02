package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: VideoTvChannelAdvertisementSdkDataDto.kt */
/* loaded from: classes15.dex */
public final class VideoTvChannelAdvertisementSdkDataDto implements Parcelable {
    public static final Parcelable.Creator<VideoTvChannelAdvertisementSdkDataDto> CREATOR = new a();

    @pmi0("ad_params")
    private final String adParams;

    @pmi0("ad_sdk_vendor")
    private final String adSdkVendor;

    @pmi0("ad_vendor_client_id")
    private final Integer adVendorClientId;

    @pmi0("scte35_upid")
    private final Integer scte35Upid;

    /* compiled from: VideoTvChannelAdvertisementSdkDataDto.kt */
    public static final class a implements Parcelable.Creator<VideoTvChannelAdvertisementSdkDataDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoTvChannelAdvertisementSdkDataDto createFromParcel(Parcel parcel) {
            return new VideoTvChannelAdvertisementSdkDataDto(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoTvChannelAdvertisementSdkDataDto[] newArray(int i) {
            return new VideoTvChannelAdvertisementSdkDataDto[i];
        }
    }

    public VideoTvChannelAdvertisementSdkDataDto() {
        this(null, null, null, null, 15, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoTvChannelAdvertisementSdkDataDto)) {
            return false;
        }
        VideoTvChannelAdvertisementSdkDataDto videoTvChannelAdvertisementSdkDataDto = (VideoTvChannelAdvertisementSdkDataDto) obj;
        return epx.f(this.scte35Upid, videoTvChannelAdvertisementSdkDataDto.scte35Upid) && epx.f(this.adSdkVendor, videoTvChannelAdvertisementSdkDataDto.adSdkVendor) && epx.f(this.adParams, videoTvChannelAdvertisementSdkDataDto.adParams) && epx.f(this.adVendorClientId, videoTvChannelAdvertisementSdkDataDto.adVendorClientId);
    }

    public final int hashCode() {
        Integer num = this.scte35Upid;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.adSdkVendor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.adParams;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.adVendorClientId;
        return hashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoTvChannelAdvertisementSdkDataDto(scte35Upid=");
        sb.append(this.scte35Upid);
        sb.append(", adSdkVendor=");
        sb.append(this.adSdkVendor);
        sb.append(", adParams=");
        sb.append(this.adParams);
        sb.append(", adVendorClientId=");
        return uqi.b(sb, this.adVendorClientId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.scte35Upid;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.adSdkVendor);
        parcel.writeString(this.adParams);
        Integer num2 = this.adVendorClientId;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
    }

    public VideoTvChannelAdvertisementSdkDataDto(Integer num, String str, String str2, Integer num2) {
        this.scte35Upid = num;
        this.adSdkVendor = str;
        this.adParams = str2;
        this.adVendorClientId = num2;
    }

    public /* synthetic */ VideoTvChannelAdvertisementSdkDataDto(Integer num, String str, String str2, Integer num2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : num2);
    }
}
