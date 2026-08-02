package com.vk.api.generated.ads.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.urd0;
import xsna.zcl;

/* compiled from: AdsStatisticsPixelDto.kt */
/* loaded from: classes14.dex */
public final class AdsStatisticsPixelDto implements Parcelable {
    public static final Parcelable.Creator<AdsStatisticsPixelDto> CREATOR = new a();

    @pmi0("duration")
    private final Integer duration;

    @pmi0("ovv")
    private final Boolean ovv;

    @pmi0("pvalue")
    private final Integer pvalue;

    @pmi0("target")
    private final String target;

    @pmi0("type")
    private final String type;

    @pmi0("url")
    private final String url;

    @pmi0("value")
    private final Integer value;

    @pmi0("viewable_percent")
    private final Integer viewablePercent;

    /* compiled from: AdsStatisticsPixelDto.kt */
    public static final class a implements Parcelable.Creator<AdsStatisticsPixelDto> {
        @Override // android.os.Parcelable.Creator
        public final AdsStatisticsPixelDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AdsStatisticsPixelDto(readString, readString2, valueOf2, valueOf3, valueOf, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AdsStatisticsPixelDto[] newArray(int i) {
            return new AdsStatisticsPixelDto[i];
        }
    }

    public AdsStatisticsPixelDto(String str, String str2, Integer num, Integer num2, Boolean bool, Integer num3, Integer num4, String str3) {
        this.type = str;
        this.url = str2;
        this.value = num;
        this.pvalue = num2;
        this.ovv = bool;
        this.duration = num3;
        this.viewablePercent = num4;
        this.target = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsStatisticsPixelDto)) {
            return false;
        }
        AdsStatisticsPixelDto adsStatisticsPixelDto = (AdsStatisticsPixelDto) obj;
        return epx.f(this.type, adsStatisticsPixelDto.type) && epx.f(this.url, adsStatisticsPixelDto.url) && epx.f(this.value, adsStatisticsPixelDto.value) && epx.f(this.pvalue, adsStatisticsPixelDto.pvalue) && epx.f(this.ovv, adsStatisticsPixelDto.ovv) && epx.f(this.duration, adsStatisticsPixelDto.duration) && epx.f(this.viewablePercent, adsStatisticsPixelDto.viewablePercent) && epx.f(this.target, adsStatisticsPixelDto.target);
    }

    public final String getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        int a2 = urd0.a(this.type.hashCode() * 31, 31, this.url);
        Integer num = this.value;
        int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.pvalue;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.ovv;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num3 = this.duration;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.viewablePercent;
        int hashCode5 = (hashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str = this.target;
        return hashCode5 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdsStatisticsPixelDto(type=");
        sb.append(this.type);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", value=");
        sb.append(this.value);
        sb.append(", pvalue=");
        sb.append(this.pvalue);
        sb.append(", ovv=");
        sb.append(this.ovv);
        sb.append(", duration=");
        sb.append(this.duration);
        sb.append(", viewablePercent=");
        sb.append(this.viewablePercent);
        sb.append(", target=");
        return ho8.a(sb, this.target, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.type);
        parcel.writeString(this.url);
        Integer num = this.value;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.pvalue;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Boolean bool = this.ovv;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Integer num3 = this.duration;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        Integer num4 = this.viewablePercent;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num4);
        }
        parcel.writeString(this.target);
    }

    public /* synthetic */ AdsStatisticsPixelDto(String str, String str2, Integer num, Integer num2, Boolean bool, Integer num3, Integer num4, String str3, int i, zcl zclVar) {
        this(str, str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : num3, (i & 64) != 0 ? null : num4, (i & 128) != 0 ? null : str3);
    }
}
