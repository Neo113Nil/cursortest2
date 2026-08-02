package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AppsAdsClosingAdsSettingsDto.kt */
/* loaded from: classes14.dex */
public final class AppsAdsClosingAdsSettingsDto implements Parcelable {
    public static final Parcelable.Creator<AppsAdsClosingAdsSettingsDto> CREATOR = new a();

    @pmi0("banner")
    private final AppsAdsBannerSettingsDto banner;

    /* compiled from: AppsAdsClosingAdsSettingsDto.kt */
    public static final class a implements Parcelable.Creator<AppsAdsClosingAdsSettingsDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsAdsClosingAdsSettingsDto createFromParcel(Parcel parcel) {
            return new AppsAdsClosingAdsSettingsDto(parcel.readInt() == 0 ? null : AppsAdsBannerSettingsDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AppsAdsClosingAdsSettingsDto[] newArray(int i) {
            return new AppsAdsClosingAdsSettingsDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AppsAdsClosingAdsSettingsDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final AppsAdsBannerSettingsDto d() {
        return this.banner;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AppsAdsClosingAdsSettingsDto) && epx.f(this.banner, ((AppsAdsClosingAdsSettingsDto) obj).banner);
    }

    public final int hashCode() {
        AppsAdsBannerSettingsDto appsAdsBannerSettingsDto = this.banner;
        if (appsAdsBannerSettingsDto == null) {
            return 0;
        }
        return appsAdsBannerSettingsDto.hashCode();
    }

    public final String toString() {
        return "AppsAdsClosingAdsSettingsDto(banner=" + this.banner + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AppsAdsBannerSettingsDto appsAdsBannerSettingsDto = this.banner;
        if (appsAdsBannerSettingsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            appsAdsBannerSettingsDto.writeToParcel(parcel, i);
        }
    }

    public AppsAdsClosingAdsSettingsDto(AppsAdsBannerSettingsDto appsAdsBannerSettingsDto) {
        this.banner = appsAdsBannerSettingsDto;
    }

    public /* synthetic */ AppsAdsClosingAdsSettingsDto(AppsAdsBannerSettingsDto appsAdsBannerSettingsDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : appsAdsBannerSettingsDto);
    }
}
