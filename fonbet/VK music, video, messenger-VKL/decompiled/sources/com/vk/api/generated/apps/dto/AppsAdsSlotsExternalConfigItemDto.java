package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AppsAdsSlotsExternalConfigItemDto.kt */
/* loaded from: classes14.dex */
public final class AppsAdsSlotsExternalConfigItemDto implements Parcelable {
    public static final Parcelable.Creator<AppsAdsSlotsExternalConfigItemDto> CREATOR = new a();

    @pmi0("banner")
    private final AppsAdsBannerSettingsDto banner;

    @pmi0("banner_portlet")
    private final AppsAdsBannerSettingsDto bannerPortlet;

    @pmi0("id")
    private final int id;

    @pmi0("interstitial")
    private final AppsAdsSlotsSettingsDto interstitial;

    @pmi0("mobweb_interstitial")
    private final AppsAdsSlotsMobwebInterstitialSettingsDto mobwebInterstitial;

    @pmi0("rewarded")
    private final AppsAdsSlotsSettingsDto rewarded;

    /* compiled from: AppsAdsSlotsExternalConfigItemDto.kt */
    public static final class a implements Parcelable.Creator<AppsAdsSlotsExternalConfigItemDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsAdsSlotsExternalConfigItemDto createFromParcel(Parcel parcel) {
            return new AppsAdsSlotsExternalConfigItemDto(parcel.readInt(), parcel.readInt() == 0 ? null : AppsAdsSlotsSettingsDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AppsAdsSlotsSettingsDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AppsAdsBannerSettingsDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AppsAdsBannerSettingsDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AppsAdsSlotsMobwebInterstitialSettingsDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final AppsAdsSlotsExternalConfigItemDto[] newArray(int i) {
            return new AppsAdsSlotsExternalConfigItemDto[i];
        }
    }

    public AppsAdsSlotsExternalConfigItemDto(int i, AppsAdsSlotsSettingsDto appsAdsSlotsSettingsDto, AppsAdsSlotsSettingsDto appsAdsSlotsSettingsDto2, AppsAdsBannerSettingsDto appsAdsBannerSettingsDto, AppsAdsBannerSettingsDto appsAdsBannerSettingsDto2, AppsAdsSlotsMobwebInterstitialSettingsDto appsAdsSlotsMobwebInterstitialSettingsDto) {
        this.id = i;
        this.rewarded = appsAdsSlotsSettingsDto;
        this.interstitial = appsAdsSlotsSettingsDto2;
        this.banner = appsAdsBannerSettingsDto;
        this.bannerPortlet = appsAdsBannerSettingsDto2;
        this.mobwebInterstitial = appsAdsSlotsMobwebInterstitialSettingsDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsAdsSlotsExternalConfigItemDto)) {
            return false;
        }
        AppsAdsSlotsExternalConfigItemDto appsAdsSlotsExternalConfigItemDto = (AppsAdsSlotsExternalConfigItemDto) obj;
        return this.id == appsAdsSlotsExternalConfigItemDto.id && epx.f(this.rewarded, appsAdsSlotsExternalConfigItemDto.rewarded) && epx.f(this.interstitial, appsAdsSlotsExternalConfigItemDto.interstitial) && epx.f(this.banner, appsAdsSlotsExternalConfigItemDto.banner) && epx.f(this.bannerPortlet, appsAdsSlotsExternalConfigItemDto.bannerPortlet) && epx.f(this.mobwebInterstitial, appsAdsSlotsExternalConfigItemDto.mobwebInterstitial);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.id) * 31;
        AppsAdsSlotsSettingsDto appsAdsSlotsSettingsDto = this.rewarded;
        int hashCode2 = (hashCode + (appsAdsSlotsSettingsDto == null ? 0 : appsAdsSlotsSettingsDto.hashCode())) * 31;
        AppsAdsSlotsSettingsDto appsAdsSlotsSettingsDto2 = this.interstitial;
        int hashCode3 = (hashCode2 + (appsAdsSlotsSettingsDto2 == null ? 0 : appsAdsSlotsSettingsDto2.hashCode())) * 31;
        AppsAdsBannerSettingsDto appsAdsBannerSettingsDto = this.banner;
        int hashCode4 = (hashCode3 + (appsAdsBannerSettingsDto == null ? 0 : appsAdsBannerSettingsDto.hashCode())) * 31;
        AppsAdsBannerSettingsDto appsAdsBannerSettingsDto2 = this.bannerPortlet;
        int hashCode5 = (hashCode4 + (appsAdsBannerSettingsDto2 == null ? 0 : appsAdsBannerSettingsDto2.hashCode())) * 31;
        AppsAdsSlotsMobwebInterstitialSettingsDto appsAdsSlotsMobwebInterstitialSettingsDto = this.mobwebInterstitial;
        return hashCode5 + (appsAdsSlotsMobwebInterstitialSettingsDto != null ? appsAdsSlotsMobwebInterstitialSettingsDto.hashCode() : 0);
    }

    public final String toString() {
        return "AppsAdsSlotsExternalConfigItemDto(id=" + this.id + ", rewarded=" + this.rewarded + ", interstitial=" + this.interstitial + ", banner=" + this.banner + ", bannerPortlet=" + this.bannerPortlet + ", mobwebInterstitial=" + this.mobwebInterstitial + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        AppsAdsSlotsSettingsDto appsAdsSlotsSettingsDto = this.rewarded;
        if (appsAdsSlotsSettingsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            appsAdsSlotsSettingsDto.writeToParcel(parcel, i);
        }
        AppsAdsSlotsSettingsDto appsAdsSlotsSettingsDto2 = this.interstitial;
        if (appsAdsSlotsSettingsDto2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            appsAdsSlotsSettingsDto2.writeToParcel(parcel, i);
        }
        AppsAdsBannerSettingsDto appsAdsBannerSettingsDto = this.banner;
        if (appsAdsBannerSettingsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            appsAdsBannerSettingsDto.writeToParcel(parcel, i);
        }
        AppsAdsBannerSettingsDto appsAdsBannerSettingsDto2 = this.bannerPortlet;
        if (appsAdsBannerSettingsDto2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            appsAdsBannerSettingsDto2.writeToParcel(parcel, i);
        }
        AppsAdsSlotsMobwebInterstitialSettingsDto appsAdsSlotsMobwebInterstitialSettingsDto = this.mobwebInterstitial;
        if (appsAdsSlotsMobwebInterstitialSettingsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            appsAdsSlotsMobwebInterstitialSettingsDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ AppsAdsSlotsExternalConfigItemDto(int i, AppsAdsSlotsSettingsDto appsAdsSlotsSettingsDto, AppsAdsSlotsSettingsDto appsAdsSlotsSettingsDto2, AppsAdsBannerSettingsDto appsAdsBannerSettingsDto, AppsAdsBannerSettingsDto appsAdsBannerSettingsDto2, AppsAdsSlotsMobwebInterstitialSettingsDto appsAdsSlotsMobwebInterstitialSettingsDto, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? null : appsAdsSlotsSettingsDto, (i2 & 4) != 0 ? null : appsAdsSlotsSettingsDto2, (i2 & 8) != 0 ? null : appsAdsBannerSettingsDto, (i2 & 16) != 0 ? null : appsAdsBannerSettingsDto2, (i2 & 32) != 0 ? null : appsAdsSlotsMobwebInterstitialSettingsDto);
    }
}
