package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AppsAdsPauseAdsSettingsDto.kt */
/* loaded from: classes14.dex */
public final class AppsAdsPauseAdsSettingsDto implements Parcelable {
    public static final Parcelable.Creator<AppsAdsPauseAdsSettingsDto> CREATOR = new a();

    @pmi0("interstitial")
    private final AppsAdsSlotsSettingsDto interstitial;

    /* compiled from: AppsAdsPauseAdsSettingsDto.kt */
    public static final class a implements Parcelable.Creator<AppsAdsPauseAdsSettingsDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsAdsPauseAdsSettingsDto createFromParcel(Parcel parcel) {
            return new AppsAdsPauseAdsSettingsDto(parcel.readInt() == 0 ? null : AppsAdsSlotsSettingsDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AppsAdsPauseAdsSettingsDto[] newArray(int i) {
            return new AppsAdsPauseAdsSettingsDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AppsAdsPauseAdsSettingsDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AppsAdsPauseAdsSettingsDto) && epx.f(this.interstitial, ((AppsAdsPauseAdsSettingsDto) obj).interstitial);
    }

    public final int hashCode() {
        AppsAdsSlotsSettingsDto appsAdsSlotsSettingsDto = this.interstitial;
        if (appsAdsSlotsSettingsDto == null) {
            return 0;
        }
        return appsAdsSlotsSettingsDto.hashCode();
    }

    public final String toString() {
        return "AppsAdsPauseAdsSettingsDto(interstitial=" + this.interstitial + ')';
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
    }

    public AppsAdsPauseAdsSettingsDto(AppsAdsSlotsSettingsDto appsAdsSlotsSettingsDto) {
        this.interstitial = appsAdsSlotsSettingsDto;
    }

    public /* synthetic */ AppsAdsPauseAdsSettingsDto(AppsAdsSlotsSettingsDto appsAdsSlotsSettingsDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : appsAdsSlotsSettingsDto);
    }
}
