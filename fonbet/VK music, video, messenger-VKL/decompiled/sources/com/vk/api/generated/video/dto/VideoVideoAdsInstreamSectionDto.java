package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.uqi;
import xsna.urd0;
import xsna.zcl;

/* compiled from: VideoVideoAdsInstreamSectionDto.kt */
/* loaded from: classes15.dex */
public final class VideoVideoAdsInstreamSectionDto implements Parcelable {
    public static final Parcelable.Creator<VideoVideoAdsInstreamSectionDto> CREATOR = new a();

    @pmi0("doAfter")
    private final Boolean doAfter;

    @pmi0("isMidrollPoint")
    private final Boolean isMidrollPoint;

    @pmi0("point")
    private final Integer point;

    @pmi0("type")
    private final String type;

    @pmi0("url")
    private final String url;

    /* compiled from: VideoVideoAdsInstreamSectionDto.kt */
    public static final class a implements Parcelable.Creator<VideoVideoAdsInstreamSectionDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoVideoAdsInstreamSectionDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new VideoVideoAdsInstreamSectionDto(readString, readString2, valueOf, valueOf2, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoVideoAdsInstreamSectionDto[] newArray(int i) {
            return new VideoVideoAdsInstreamSectionDto[i];
        }
    }

    public VideoVideoAdsInstreamSectionDto(String str, String str2, Boolean bool, Boolean bool2, Integer num) {
        this.type = str;
        this.url = str2;
        this.isMidrollPoint = bool;
        this.doAfter = bool2;
        this.point = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoVideoAdsInstreamSectionDto)) {
            return false;
        }
        VideoVideoAdsInstreamSectionDto videoVideoAdsInstreamSectionDto = (VideoVideoAdsInstreamSectionDto) obj;
        return epx.f(this.type, videoVideoAdsInstreamSectionDto.type) && epx.f(this.url, videoVideoAdsInstreamSectionDto.url) && epx.f(this.isMidrollPoint, videoVideoAdsInstreamSectionDto.isMidrollPoint) && epx.f(this.doAfter, videoVideoAdsInstreamSectionDto.doAfter) && epx.f(this.point, videoVideoAdsInstreamSectionDto.point);
    }

    public final int hashCode() {
        int a2 = urd0.a(this.type.hashCode() * 31, 31, this.url);
        Boolean bool = this.isMidrollPoint;
        int hashCode = (a2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.doAfter;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.point;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoVideoAdsInstreamSectionDto(type=");
        sb.append(this.type);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", isMidrollPoint=");
        sb.append(this.isMidrollPoint);
        sb.append(", doAfter=");
        sb.append(this.doAfter);
        sb.append(", point=");
        return uqi.b(sb, this.point, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.type);
        parcel.writeString(this.url);
        Boolean bool = this.isMidrollPoint;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.doAfter;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Integer num = this.point;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ VideoVideoAdsInstreamSectionDto(String str, String str2, Boolean bool, Boolean bool2, Integer num, int i, zcl zclVar) {
        this(str, str2, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : bool2, (i & 16) != 0 ? null : num);
    }
}
