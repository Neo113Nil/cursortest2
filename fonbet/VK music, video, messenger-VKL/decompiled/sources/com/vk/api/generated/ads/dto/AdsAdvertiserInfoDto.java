package com.vk.api.generated.ads.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AdsAdvertiserInfoDto.kt */
/* loaded from: classes14.dex */
public final class AdsAdvertiserInfoDto implements Parcelable {
    public static final Parcelable.Creator<AdsAdvertiserInfoDto> CREATOR = new a();

    @pmi0("ad_marker")
    private final String adMarker;

    @pmi0("ad_url")
    private final String adUrl;

    @pmi0("advertiser_info_url")
    private final String advertiserInfoUrl;

    @pmi0("recommendation_info")
    private final String recommendationInfo;

    /* compiled from: AdsAdvertiserInfoDto.kt */
    public static final class a implements Parcelable.Creator<AdsAdvertiserInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final AdsAdvertiserInfoDto createFromParcel(Parcel parcel) {
            return new AdsAdvertiserInfoDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AdsAdvertiserInfoDto[] newArray(int i) {
            return new AdsAdvertiserInfoDto[i];
        }
    }

    public AdsAdvertiserInfoDto(String str, String str2, String str3, String str4) {
        this.advertiserInfoUrl = str;
        this.adMarker = str2;
        this.recommendationInfo = str3;
        this.adUrl = str4;
    }

    public final String d() {
        return this.adMarker;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.advertiserInfoUrl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsAdvertiserInfoDto)) {
            return false;
        }
        AdsAdvertiserInfoDto adsAdvertiserInfoDto = (AdsAdvertiserInfoDto) obj;
        return epx.f(this.advertiserInfoUrl, adsAdvertiserInfoDto.advertiserInfoUrl) && epx.f(this.adMarker, adsAdvertiserInfoDto.adMarker) && epx.f(this.recommendationInfo, adsAdvertiserInfoDto.recommendationInfo) && epx.f(this.adUrl, adsAdvertiserInfoDto.adUrl);
    }

    public final int hashCode() {
        int hashCode = this.advertiserInfoUrl.hashCode() * 31;
        String str = this.adMarker;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.recommendationInfo;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.adUrl;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdsAdvertiserInfoDto(advertiserInfoUrl=");
        sb.append(this.advertiserInfoUrl);
        sb.append(", adMarker=");
        sb.append(this.adMarker);
        sb.append(", recommendationInfo=");
        sb.append(this.recommendationInfo);
        sb.append(", adUrl=");
        return ho8.a(sb, this.adUrl, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.advertiserInfoUrl);
        parcel.writeString(this.adMarker);
        parcel.writeString(this.recommendationInfo);
        parcel.writeString(this.adUrl);
    }

    public /* synthetic */ AdsAdvertiserInfoDto(String str, String str2, String str3, String str4, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
