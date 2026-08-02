package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AppsAdsSplashAdsSettingsDto.kt */
/* loaded from: classes14.dex */
public final class AppsAdsSplashAdsSettingsDto implements Parcelable {
    public static final Parcelable.Creator<AppsAdsSplashAdsSettingsDto> CREATOR = new a();

    @pmi0("banner")
    private final AppsAdsBannerSettingsDto banner;

    @pmi0("interstitial")
    private final AppsAdsSlotsSettingsDto interstitial;

    /* compiled from: AppsAdsSplashAdsSettingsDto.kt */
    public static final class a implements Parcelable.Creator<AppsAdsSplashAdsSettingsDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsAdsSplashAdsSettingsDto createFromParcel(Parcel parcel) {
            return new AppsAdsSplashAdsSettingsDto(parcel.readInt() == 0 ? null : AppsAdsSlotsSettingsDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AppsAdsBannerSettingsDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final AppsAdsSplashAdsSettingsDto[] newArray(int i) {
            return new AppsAdsSplashAdsSettingsDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AppsAdsSplashAdsSettingsDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final AppsAdsSlotsSettingsDto d() {
        return this.interstitial;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsAdsSplashAdsSettingsDto)) {
            return false;
        }
        AppsAdsSplashAdsSettingsDto appsAdsSplashAdsSettingsDto = (AppsAdsSplashAdsSettingsDto) obj;
        return epx.f(this.interstitial, appsAdsSplashAdsSettingsDto.interstitial) && epx.f(this.banner, appsAdsSplashAdsSettingsDto.banner);
    }

    public final int hashCode() {
        AppsAdsSlotsSettingsDto appsAdsSlotsSettingsDto = this.interstitial;
        int hashCode = (appsAdsSlotsSettingsDto == null ? 0 : appsAdsSlotsSettingsDto.hashCode()) * 31;
        AppsAdsBannerSettingsDto appsAdsBannerSettingsDto = this.banner;
        return hashCode + (appsAdsBannerSettingsDto != null ? appsAdsBannerSettingsDto.hashCode() : 0);
    }

    public final String toString() {
        return "AppsAdsSplashAdsSettingsDto(interstitial=" + this.interstitial + ", banner=" + this.banner + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AppsAdsSlotsSettingsDto appsAdsSlotsSettingsDto = this.interstitial;
        if (appsAdsSlotsSettingsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            appsAdsSlotsSettingsDto.writeToParcel(parcel, i);
        }
        AppsAdsBannerSettingsDto appsAdsBannerSettingsDto = this.banner;
        if (appsAdsBannerSettingsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            appsAdsBannerSettingsDto.writeToParcel(parcel, i);
        }
    }

    public AppsAdsSplashAdsSettingsDto(AppsAdsSlotsSettingsDto appsAdsSlotsSettingsDto, AppsAdsBannerSettingsDto appsAdsBannerSettingsDto) {
        this.interstitial = appsAdsSlotsSettingsDto;
        this.banner = appsAdsBannerSettingsDto;
    }

    public /* synthetic */ AppsAdsSplashAdsSettingsDto(AppsAdsSlotsSettingsDto appsAdsSlotsSettingsDto, AppsAdsBannerSettingsDto appsAdsBannerSettingsDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : appsAdsSlotsSettingsDto, (i & 2) != 0 ? null : appsAdsBannerSettingsDto);
    }
}
