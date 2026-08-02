package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.sn;
import xsna.urd0;
import xsna.zcl;

/* compiled from: AppsAdsSlotsWebConfigItemDto.kt */
/* loaded from: classes14.dex */
public final class AppsAdsSlotsWebConfigItemDto implements Parcelable {
    public static final Parcelable.Creator<AppsAdsSlotsWebConfigItemDto> CREATOR = new a();

    @pmi0("ads_external")
    private final AppsAdsSlotsExternalConfigItemDto adsExternal;

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

    @pmi0("sign")
    private final String sign;

    @pmi0("sign_timestamp")
    private final int signTimestamp;

    @pmi0("splash_ads")
    private final AppsAdsSplashAdsSettingsDto splashAds;

    @pmi0("test_mode")
    private final Boolean testMode;

    @pmi0("vast")
    private final AppsAdsSlotsVastDto vast;

    /* compiled from: AppsAdsSlotsWebConfigItemDto.kt */
    public static final class a implements Parcelable.Creator<AppsAdsSlotsWebConfigItemDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsAdsSlotsWebConfigItemDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            int readInt2 = parcel.readInt();
            AppsAdsSlotsSettingsDto createFromParcel = parcel.readInt() == 0 ? null : AppsAdsSlotsSettingsDto.CREATOR.createFromParcel(parcel);
            AppsAdsSlotsSettingsDto createFromParcel2 = parcel.readInt() == 0 ? null : AppsAdsSlotsSettingsDto.CREATOR.createFromParcel(parcel);
            AppsAdsBannerSettingsDto createFromParcel3 = parcel.readInt() == 0 ? null : AppsAdsBannerSettingsDto.CREATOR.createFromParcel(parcel);
            AppsAdsBannerSettingsDto createFromParcel4 = parcel.readInt() == 0 ? null : AppsAdsBannerSettingsDto.CREATOR.createFromParcel(parcel);
            AppsAdsSlotsMobwebInterstitialSettingsDto createFromParcel5 = parcel.readInt() == 0 ? null : AppsAdsSlotsMobwebInterstitialSettingsDto.CREATOR.createFromParcel(parcel);
            AppsAdsSplashAdsSettingsDto createFromParcel6 = parcel.readInt() == 0 ? null : AppsAdsSplashAdsSettingsDto.CREATOR.createFromParcel(parcel);
            AppsAdsClosingAdsSettingsDto createFromParcel7 = parcel.readInt() == 0 ? null : AppsAdsClosingAdsSettingsDto.CREATOR.createFromParcel(parcel);
            AppsAdsSlotsVastDto createFromParcel8 = parcel.readInt() == 0 ? null : AppsAdsSlotsVastDto.CREATOR.createFromParcel(parcel);
            AppsAdsSlotsSettingsDto createFromParcel9 = parcel.readInt() == 0 ? null : AppsAdsSlotsSettingsDto.CREATOR.createFromParcel(parcel);
            AppsAdsPauseAdsSettingsDto createFromParcel10 = parcel.readInt() == 0 ? null : AppsAdsPauseAdsSettingsDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AppsAdsSlotsWebConfigItemDto(readInt, readString, readInt2, createFromParcel, createFromParcel2, createFromParcel3, createFromParcel4, createFromParcel5, createFromParcel6, createFromParcel7, createFromParcel8, createFromParcel9, createFromParcel10, valueOf, parcel.readInt() != 0 ? AppsAdsSlotsExternalConfigItemDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final AppsAdsSlotsWebConfigItemDto[] newArray(int i) {
            return new AppsAdsSlotsWebConfigItemDto[i];
        }
    }

    public AppsAdsSlotsWebConfigItemDto(int i, String str, int i2, AppsAdsSlotsSettingsDto appsAdsSlotsSettingsDto, AppsAdsSlotsSettingsDto appsAdsSlotsSettingsDto2, AppsAdsBannerSettingsDto appsAdsBannerSettingsDto, AppsAdsBannerSettingsDto appsAdsBannerSettingsDto2, AppsAdsSlotsMobwebInterstitialSettingsDto appsAdsSlotsMobwebInterstitialSettingsDto, AppsAdsSplashAdsSettingsDto appsAdsSplashAdsSettingsDto, AppsAdsClosingAdsSettingsDto appsAdsClosingAdsSettingsDto, AppsAdsSlotsVastDto appsAdsSlotsVastDto, AppsAdsSlotsSettingsDto appsAdsSlotsSettingsDto3, AppsAdsPauseAdsSettingsDto appsAdsPauseAdsSettingsDto, Boolean bool, AppsAdsSlotsExternalConfigItemDto appsAdsSlotsExternalConfigItemDto) {
        this.id = i;
        this.sign = str;
        this.signTimestamp = i2;
        this.rewarded = appsAdsSlotsSettingsDto;
        this.interstitial = appsAdsSlotsSettingsDto2;
        this.banner = appsAdsBannerSettingsDto;
        this.bannerPortlet = appsAdsBannerSettingsDto2;
        this.mobwebInterstitial = appsAdsSlotsMobwebInterstitialSettingsDto;
        this.splashAds = appsAdsSplashAdsSettingsDto;
        this.closingAds = appsAdsClosingAdsSettingsDto;
        this.vast = appsAdsSlotsVastDto;
        this.multiInterstitial = appsAdsSlotsSettingsDto3;
        this.pauseAds = appsAdsPauseAdsSettingsDto;
        this.testMode = bool;
        this.adsExternal = appsAdsSlotsExternalConfigItemDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsAdsSlotsWebConfigItemDto)) {
            return false;
        }
        AppsAdsSlotsWebConfigItemDto appsAdsSlotsWebConfigItemDto = (AppsAdsSlotsWebConfigItemDto) obj;
        return this.id == appsAdsSlotsWebConfigItemDto.id && epx.f(this.sign, appsAdsSlotsWebConfigItemDto.sign) && this.signTimestamp == appsAdsSlotsWebConfigItemDto.signTimestamp && epx.f(this.rewarded, appsAdsSlotsWebConfigItemDto.rewarded) && epx.f(this.interstitial, appsAdsSlotsWebConfigItemDto.interstitial) && epx.f(this.banner, appsAdsSlotsWebConfigItemDto.banner) && epx.f(this.bannerPortlet, appsAdsSlotsWebConfigItemDto.bannerPortlet) && epx.f(this.mobwebInterstitial, appsAdsSlotsWebConfigItemDto.mobwebInterstitial) && epx.f(this.splashAds, appsAdsSlotsWebConfigItemDto.splashAds) && epx.f(this.closingAds, appsAdsSlotsWebConfigItemDto.closingAds) && epx.f(this.vast, appsAdsSlotsWebConfigItemDto.vast) && epx.f(this.multiInterstitial, appsAdsSlotsWebConfigItemDto.multiInterstitial) && epx.f(this.pauseAds, appsAdsSlotsWebConfigItemDto.pauseAds) && epx.f(this.testMode, appsAdsSlotsWebConfigItemDto.testMode) && epx.f(this.adsExternal, appsAdsSlotsWebConfigItemDto.adsExternal);
    }

    public final int hashCode() {
        int a2 = shy.a(this.signTimestamp, urd0.a(Integer.hashCode(this.id) * 31, 31, this.sign), 31);
        AppsAdsSlotsSettingsDto appsAdsSlotsSettingsDto = this.rewarded;
        int hashCode = (a2 + (appsAdsSlotsSettingsDto == null ? 0 : appsAdsSlotsSettingsDto.hashCode())) * 31;
        AppsAdsSlotsSettingsDto appsAdsSlotsSettingsDto2 = this.interstitial;
        int hashCode2 = (hashCode + (appsAdsSlotsSettingsDto2 == null ? 0 : appsAdsSlotsSettingsDto2.hashCode())) * 31;
        AppsAdsBannerSettingsDto appsAdsBannerSettingsDto = this.banner;
        int hashCode3 = (hashCode2 + (appsAdsBannerSettingsDto == null ? 0 : appsAdsBannerSettingsDto.hashCode())) * 31;
        AppsAdsBannerSettingsDto appsAdsBannerSettingsDto2 = this.bannerPortlet;
        int hashCode4 = (hashCode3 + (appsAdsBannerSettingsDto2 == null ? 0 : appsAdsBannerSettingsDto2.hashCode())) * 31;
        AppsAdsSlotsMobwebInterstitialSettingsDto appsAdsSlotsMobwebInterstitialSettingsDto = this.mobwebInterstitial;
        int hashCode5 = (hashCode4 + (appsAdsSlotsMobwebInterstitialSettingsDto == null ? 0 : appsAdsSlotsMobwebInterstitialSettingsDto.hashCode())) * 31;
        AppsAdsSplashAdsSettingsDto appsAdsSplashAdsSettingsDto = this.splashAds;
        int hashCode6 = (hashCode5 + (appsAdsSplashAdsSettingsDto == null ? 0 : appsAdsSplashAdsSettingsDto.hashCode())) * 31;
        AppsAdsClosingAdsSettingsDto appsAdsClosingAdsSettingsDto = this.closingAds;
        int hashCode7 = (hashCode6 + (appsAdsClosingAdsSettingsDto == null ? 0 : appsAdsClosingAdsSettingsDto.hashCode())) * 31;
        AppsAdsSlotsVastDto appsAdsSlotsVastDto = this.vast;
        int hashCode8 = (hashCode7 + (appsAdsSlotsVastDto == null ? 0 : appsAdsSlotsVastDto.hashCode())) * 31;
        AppsAdsSlotsSettingsDto appsAdsSlotsSettingsDto3 = this.multiInterstitial;
        int hashCode9 = (hashCode8 + (appsAdsSlotsSettingsDto3 == null ? 0 : appsAdsSlotsSettingsDto3.hashCode())) * 31;
        AppsAdsPauseAdsSettingsDto appsAdsPauseAdsSettingsDto = this.pauseAds;
        int hashCode10 = (hashCode9 + (appsAdsPauseAdsSettingsDto == null ? 0 : appsAdsPauseAdsSettingsDto.hashCode())) * 31;
        Boolean bool = this.testMode;
        int hashCode11 = (hashCode10 + (bool == null ? 0 : bool.hashCode())) * 31;
        AppsAdsSlotsExternalConfigItemDto appsAdsSlotsExternalConfigItemDto = this.adsExternal;
        return hashCode11 + (appsAdsSlotsExternalConfigItemDto != null ? appsAdsSlotsExternalConfigItemDto.hashCode() : 0);
    }

    public final String toString() {
        return "AppsAdsSlotsWebConfigItemDto(id=" + this.id + ", sign=" + this.sign + ", signTimestamp=" + this.signTimestamp + ", rewarded=" + this.rewarded + ", interstitial=" + this.interstitial + ", banner=" + this.banner + ", bannerPortlet=" + this.bannerPortlet + ", mobwebInterstitial=" + this.mobwebInterstitial + ", splashAds=" + this.splashAds + ", closingAds=" + this.closingAds + ", vast=" + this.vast + ", multiInterstitial=" + this.multiInterstitial + ", pauseAds=" + this.pauseAds + ", testMode=" + this.testMode + ", adsExternal=" + this.adsExternal + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.sign);
        parcel.writeInt(this.signTimestamp);
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
        AppsAdsSlotsVastDto appsAdsSlotsVastDto = this.vast;
        if (appsAdsSlotsVastDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            appsAdsSlotsVastDto.writeToParcel(parcel, i);
        }
        AppsAdsSlotsSettingsDto appsAdsSlotsSettingsDto3 = this.multiInterstitial;
        if (appsAdsSlotsSettingsDto3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            appsAdsSlotsSettingsDto3.writeToParcel(parcel, i);
        }
        AppsAdsPauseAdsSettingsDto appsAdsPauseAdsSettingsDto = this.pauseAds;
        if (appsAdsPauseAdsSettingsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            appsAdsPauseAdsSettingsDto.writeToParcel(parcel, i);
        }
        Boolean bool = this.testMode;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        AppsAdsSlotsExternalConfigItemDto appsAdsSlotsExternalConfigItemDto = this.adsExternal;
        if (appsAdsSlotsExternalConfigItemDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            appsAdsSlotsExternalConfigItemDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ AppsAdsSlotsWebConfigItemDto(int i, String str, int i2, AppsAdsSlotsSettingsDto appsAdsSlotsSettingsDto, AppsAdsSlotsSettingsDto appsAdsSlotsSettingsDto2, AppsAdsBannerSettingsDto appsAdsBannerSettingsDto, AppsAdsBannerSettingsDto appsAdsBannerSettingsDto2, AppsAdsSlotsMobwebInterstitialSettingsDto appsAdsSlotsMobwebInterstitialSettingsDto, AppsAdsSplashAdsSettingsDto appsAdsSplashAdsSettingsDto, AppsAdsClosingAdsSettingsDto appsAdsClosingAdsSettingsDto, AppsAdsSlotsVastDto appsAdsSlotsVastDto, AppsAdsSlotsSettingsDto appsAdsSlotsSettingsDto3, AppsAdsPauseAdsSettingsDto appsAdsPauseAdsSettingsDto, Boolean bool, AppsAdsSlotsExternalConfigItemDto appsAdsSlotsExternalConfigItemDto, int i3, zcl zclVar) {
        this(i, str, i2, (i3 & 8) != 0 ? null : appsAdsSlotsSettingsDto, (i3 & 16) != 0 ? null : appsAdsSlotsSettingsDto2, (i3 & 32) != 0 ? null : appsAdsBannerSettingsDto, (i3 & 64) != 0 ? null : appsAdsBannerSettingsDto2, (i3 & 128) != 0 ? null : appsAdsSlotsMobwebInterstitialSettingsDto, (i3 & 256) != 0 ? null : appsAdsSplashAdsSettingsDto, (i3 & 512) != 0 ? null : appsAdsClosingAdsSettingsDto, (i3 & 1024) != 0 ? null : appsAdsSlotsVastDto, (i3 & 2048) != 0 ? null : appsAdsSlotsSettingsDto3, (i3 & 4096) != 0 ? null : appsAdsPauseAdsSettingsDto, (i3 & 8192) != 0 ? null : bool, (i3 & 16384) != 0 ? null : appsAdsSlotsExternalConfigItemDto);
    }
}
