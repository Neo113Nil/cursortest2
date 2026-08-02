package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: VideoTvChannelAdvertisementDto.kt */
/* loaded from: classes15.dex */
public final class VideoTvChannelAdvertisementDto implements Parcelable {
    public static final Parcelable.Creator<VideoTvChannelAdvertisementDto> CREATOR = new a();

    @pmi0("ad_position")
    private final String adPosition;

    @pmi0("ad_sdk_data")
    private final List<VideoTvChannelAdvertisementSdkDataDto> adSdkData;

    @pmi0("ad_urls")
    private final List<VideoTvChannelAdvertisementUrlDto> adUrls;

    @pmi0("platform")
    private final String platform;

    @pmi0("programme_id")
    private final int programmeId;

    /* compiled from: VideoTvChannelAdvertisementDto.kt */
    public static final class a implements Parcelable.Creator<VideoTvChannelAdvertisementDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoTvChannelAdvertisementDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int i = 0;
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList = new ArrayList(readInt2);
                int i2 = 0;
                while (i2 != readInt2) {
                    i2 = en.a(VideoTvChannelAdvertisementSdkDataDto.CREATOR, parcel, arrayList, i2, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt3 = parcel.readInt();
                arrayList2 = new ArrayList(readInt3);
                while (i != readInt3) {
                    i = en.a(VideoTvChannelAdvertisementUrlDto.CREATOR, parcel, arrayList2, i, 1);
                }
            }
            return new VideoTvChannelAdvertisementDto(readInt, readString, readString2, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoTvChannelAdvertisementDto[] newArray(int i) {
            return new VideoTvChannelAdvertisementDto[i];
        }
    }

    public VideoTvChannelAdvertisementDto(int i, String str, String str2, List<VideoTvChannelAdvertisementSdkDataDto> list, List<VideoTvChannelAdvertisementUrlDto> list2) {
        this.programmeId = i;
        this.adPosition = str;
        this.platform = str2;
        this.adSdkData = list;
        this.adUrls = list2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoTvChannelAdvertisementDto)) {
            return false;
        }
        VideoTvChannelAdvertisementDto videoTvChannelAdvertisementDto = (VideoTvChannelAdvertisementDto) obj;
        return this.programmeId == videoTvChannelAdvertisementDto.programmeId && epx.f(this.adPosition, videoTvChannelAdvertisementDto.adPosition) && epx.f(this.platform, videoTvChannelAdvertisementDto.platform) && epx.f(this.adSdkData, videoTvChannelAdvertisementDto.adSdkData) && epx.f(this.adUrls, videoTvChannelAdvertisementDto.adUrls);
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(Integer.hashCode(this.programmeId) * 31, 31, this.adPosition), 31, this.platform);
        List<VideoTvChannelAdvertisementSdkDataDto> list = this.adSdkData;
        int hashCode = (a2 + (list == null ? 0 : list.hashCode())) * 31;
        List<VideoTvChannelAdvertisementUrlDto> list2 = this.adUrls;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoTvChannelAdvertisementDto(programmeId=");
        sb.append(this.programmeId);
        sb.append(", adPosition=");
        sb.append(this.adPosition);
        sb.append(", platform=");
        sb.append(this.platform);
        sb.append(", adSdkData=");
        sb.append(this.adSdkData);
        sb.append(", adUrls=");
        return ms9.a(')', sb, this.adUrls);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.programmeId);
        parcel.writeString(this.adPosition);
        parcel.writeString(this.platform);
        List<VideoTvChannelAdvertisementSdkDataDto> list = this.adSdkData;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((VideoTvChannelAdvertisementSdkDataDto) f.next()).writeToParcel(parcel, i);
            }
        }
        List<VideoTvChannelAdvertisementUrlDto> list2 = this.adUrls;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f2 = dn.f(parcel, list2, 1);
        while (f2.hasNext()) {
            ((VideoTvChannelAdvertisementUrlDto) f2.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ VideoTvChannelAdvertisementDto(int i, String str, String str2, List list, List list2, int i2, zcl zclVar) {
        this(i, str, str2, (i2 & 8) != 0 ? null : list, (i2 & 16) != 0 ? null : list2);
    }
}
