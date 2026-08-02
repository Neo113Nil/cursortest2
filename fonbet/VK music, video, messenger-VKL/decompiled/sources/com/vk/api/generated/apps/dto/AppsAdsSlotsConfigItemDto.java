package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AppsAdsSlotsConfigItemDto.kt */
/* loaded from: classes14.dex */
public final class AppsAdsSlotsConfigItemDto implements Parcelable {
    public static final Parcelable.Creator<AppsAdsSlotsConfigItemDto> CREATOR = new a();

    @pmi0("banner")
    private final AppsAdsBannerSettingsDto banner;

    @pmi0("banner_portlet")
    private final AppsAdsBannerSettingsDto bannerPortlet;

    @pmi0("closing_ads")
    private final AppsAdsClosingAdsSettingsDto closingAds;

    @pmi0("id")
    private final int id;

    @pmi0("interstitial")
    private final AppsAdsSlotsSettingsDto interstitial;

    @pmi0("mobweb_interstitial")
    private final AppsAdsSlotsMobwebInterstitialSettingsDto mobwebInterstitial;

    @pmi0("multi_interstitial")
    private final AppsAdsSlotsSettingsDto multiInterstitial;

    @pmi0("pause_ads")
    private final AppsAdsPauseAdsSettingsDto pauseAds;

    @pmi0("rewarded")
    private final AppsAdsSlotsSettingsDto rewarded;

    @pmi0("splash_ads")
    private final AppsAdsSplashAdsSettingsDto splashAds;

    /* compiled from: AppsAdsSlotsConfigItemDto.kt */
    public static final class a implements Parcelable.Creator<AppsAdsSlotsConfigItemDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsAdsSlotsConfigItemDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            Parcelable.Creator<AppsAdsSlotsSettingsDto> creator = AppsAdsSlotsSettingsDto.CREATOR;
            return new AppsAdsSlotsConfigItemDto(readInt, creator.createFromParcel(parcel), creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : AppsAdsBannerSettingsDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AppsAdsBannerSettingsDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AppsAdsSlotsMobwebInterstitialSettingsDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AppsAdsSplashAdsSettingsDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AppsAdsClosingAdsSettingsDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel), parcel.readInt() != 0 ? AppsAdsPauseAdsSettingsDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final AppsAdsSlotsConfigItemDto[] newArray(int i) {
            return new AppsAdsSlotsConfigItemDto[i];
        }
    }

    public AppsAdsSlotsConfigItemDto(int i, AppsAdsSlotsSettingsDto appsAdsSlotsSettingsDto, AppsAdsSlotsSettingsDto appsAdsSlotsSettingsDto2, AppsAdsBannerSettingsDto appsAdsBannerSettingsDto, AppsAdsBannerSettingsDto appsAdsBannerSettingsDto2, AppsAdsSlotsMobwebInterstitialSettingsDto appsAdsSlotsMobwebInterstitialSettingsDto, AppsAdsSplashAdsSettingsDto appsAdsSplashAdsSettingsDto, AppsAdsClosingAdsSettingsDto appsAdsClosingAdsSettingsDto, AppsAdsSlotsSettingsDto appsAdsSlotsSettingsDto3, AppsAdsPauseAdsSettingsDto appsAdsPauseAdsSettingsDto) {
        this.id = i;
        this.rewarded = appsAdsSlotsSettingsDto;
        this.interstitial = appsAdsSlotsSettingsDto2;
        this.banner = appsAdsBannerSettingsDto;
        this.bannerPortlet = appsAdsBannerSettingsDto2;
        this.mobwebInterstitial = appsAdsSlotsMobwebInterstitialSettingsDto;
        this.splashAds = appsAdsSplashAdsSettingsDto;
        this.closingAds = appsAdsClosingAdsSettingsDto;
        this.multiInterstitial = appsAdsSlotsSettingsDto3;
        this.pauseAds = appsAdsPauseAdsSettingsDto;
    }

    public final AppsAdsBannerSettingsDto d() {
        return this.banner;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final AppsAdsClosingAdsSettingsDto e() {
        return this.closingAds;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsAdsSlotsConfigItemDto)) {
            return false;
        }
        AppsAdsSlotsConfigItemDto appsAdsSlotsConfigItemDto = (AppsAdsSlotsConfigItemDto) obj;
        return this.id == appsAdsSlotsConfigItemDto.id && epx.f(this.rewarded, appsAdsSlotsConfigItemDto.rewarded) && epx.f(this.interstitial, appsAdsSlotsConfigItemDto.interstitial) && epx.f(this.banner, appsAdsSlotsConfigItemDto.banner) && epx.f(this.bannerPortlet, appsAdsSlotsConfigItemDto.bannerPortlet) && epx.f(this.mobwebInterstitial, appsAdsSlotsConfigItemDto.mobwebInterstitial) && epx.f(this.splashAds, appsAdsSlotsConfigItemDto.splashAds) && epx.f(this.closingAds, appsAdsSlotsConfigItemDto.closingAds) && epx.f(this.multiInterstitial, appsAdsSlotsConfigItemDto.multiInterstitial) && epx.f(this.pauseAds, appsAdsSlotsConfigItemDto.pauseAds);
    }

    public final AppsAdsSlotsSettingsDto f() {
        return this.interstitial;
    }

    public final AppsAdsSlotsMobwebInterstitialSettingsDto g() {
        return this.mobwebInterstitial;
    }

    public final int getId() {
        return this.id;
    }

    public final int hashCode() {
        int hashCode = (this.interstitial.hashCode() + ((this.rewarded.hashCode() + (Integer.hashCode(this.id) * 31)) * 31)) * 31;
        AppsAdsBannerSettingsDto appsAdsBannerSettingsDto = this.banner;
        int hashCode2 = (hashCode + (appsAdsBannerSettingsDto == null ? 0 : appsAdsBannerSettingsDto.hashCode())) * 31;
        AppsAdsBannerSettingsDto appsAdsBannerSettingsDto2 = this.bannerPortlet;
        int hashCode3 = (hashCode2 + (appsAdsBannerSettingsDto2 == null ? 0 : appsAdsBannerSettingsDto2.hashCode())) * 31;
        AppsAdsSlotsMobwebInterstitialSettingsDto appsAdsSlotsMobwebInterstitialSettingsDto = this.mobwebInterstitial;
        int hashCode4 = (hashCode3 + (appsAdsSlotsMobwebInterstitialSettingsDto == null ? 0 : appsAdsSlotsMobwebInterstitialSettingsDto.hashCode())) * 31;
        AppsAdsSplashAdsSettingsDto appsAdsSplashAdsSettingsDto = this.splashAds;
        int hashCode5 = (hashCode4 + (appsAdsSplashAdsSettingsDto == null ? 0 : appsAdsSplashAdsSettingsDto.hashCode())) * 31;
        AppsAdsClosingAdsSettingsDto appsAdsClosingAdsSettingsDto = this.closingAds;
        int hashCode6 = (hashCode5 + (appsAdsClosingAdsSettingsDto == null ? 0 : appsAdsClosingAdsSettingsDto.hashCode())) * 31;
        AppsAdsSlotsSettingsDto appsAdsSlotsSettingsDto = this.multiInterstitial;
        int hashCode7 = (hashCode6 + (appsAdsSlotsSettingsDto == null ? 0 : appsAdsSlotsSettingsDto.hashCode())) * 31;
        AppsAdsPauseAdsSettingsDto appsAdsPauseAdsSettingsDto = this.pauseAds;
        return hashCode7 + (appsAdsPauseAdsSettingsDto != null ? appsAdsPauseAdsSettingsDto.hashCode() : 0);
    }

    public final AppsAdsSlotsSettingsDto i() {
        return this.multiInterstitial;
    }

    public final AppsAdsSlotsSettingsDto j() {
        return this.rewarded;
    }

    public final AppsAdsSplashAdsSettingsDto k() {
        return this.splashAds;
    }

    public final String toString() {
        return "AppsAdsSlotsConfigItemDto(id=" + this.id + ", rewarded=" + this.rewarded + ", interstitial=" + this.interstitial + ", banner=" + this.banner + ", bannerPortlet=" + this.bannerPortlet + ", mobwebInterstitial=" + this.mobwebInterstitial + ", splashAds=" + this.splashAds + ", closingAds=" + this.closingAds + ", multiInterstitial=" + this.multiInterstitial + ", pauseAds=" + this.pauseAds + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        this.rewarded.writeToParcel(parcel, i);
        this.interstitial.writeToParcel(parcel, i);
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
        AppsAdsSplashAdsSettingsDto appsAdsSplashAdsSettingsDto = this.splashAds;
        if (appsAdsSplashAdsSettingsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            appsAdsSplashAdsSettingsDto.writeToParcel(parcel, i);
        }
        AppsAdsClosingAdsSettingsDto appsAdsClosingAdsSettingsDto = this.closingAds;
        if (appsAdsClosingAdsSettingsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            appsAdsClosingAdsSettingsDto.writeToParcel(parcel, i);
        }
        AppsAdsSlotsSettingsDto appsAdsSlotsSettingsDto = this.multiInterstitial;
        if (appsAdsSlotsSettingsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            appsAdsSlotsSettingsDto.writeToParcel(parcel, i);
        }
        AppsAdsPauseAdsSettingsDto appsAdsPauseAdsSettingsDto = this.pauseAds;
        if (appsAdsPauseAdsSettingsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            appsAdsPauseAdsSettingsDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ AppsAdsSlotsConfigItemDto(int i, AppsAdsSlotsSettingsDto appsAdsSlotsSettingsDto, AppsAdsSlotsSettingsDto appsAdsSlotsSettingsDto2, AppsAdsBannerSettingsDto appsAdsBannerSettingsDto, AppsAdsBannerSettingsDto appsAdsBannerSettingsDto2, AppsAdsSlotsMobwebInterstitialSettingsDto appsAdsSlotsMobwebInterstitialSettingsDto, AppsAdsSplashAdsSettingsDto appsAdsSplashAdsSettingsDto, AppsAdsClosingAdsSettingsDto appsAdsClosingAdsSettingsDto, AppsAdsSlotsSettingsDto appsAdsSlotsSettingsDto3, AppsAdsPauseAdsSettingsDto appsAdsPauseAdsSettingsDto, int i2, zcl zclVar) {
        this(i, appsAdsSlotsSettingsDto, appsAdsSlotsSettingsDto2, (i2 & 8) != 0 ? null : appsAdsBannerSettingsDto, (i2 & 16) != 0 ? null : appsAdsBannerSettingsDto2, (i2 & 32) != 0 ? null : appsAdsSlotsMobwebInterstitialSettingsDto, (i2 & 64) != 0 ? null : appsAdsSplashAdsSettingsDto, (i2 & 128) != 0 ? null : appsAdsClosingAdsSettingsDto, (i2 & 256) != 0 ? null : appsAdsSlotsSettingsDto3, (i2 & 512) != 0 ? null : appsAdsPauseAdsSettingsDto);
    }
}
