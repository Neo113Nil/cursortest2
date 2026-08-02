package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;

/* compiled from: MarketCheckoutSettingsDto.kt */
/* loaded from: classes15.dex */
public final class MarketCheckoutSettingsDto implements Parcelable {
    public static final Parcelable.Creator<MarketCheckoutSettingsDto> CREATOR = new a();

    @pmi0("sections")
    private final MarketCheckoutSettingsSectionsListDto sections;

    /* compiled from: MarketCheckoutSettingsDto.kt */
    public static final class a implements Parcelable.Creator<MarketCheckoutSettingsDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketCheckoutSettingsDto createFromParcel(Parcel parcel) {
            return new MarketCheckoutSettingsDto(MarketCheckoutSettingsSectionsListDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final MarketCheckoutSettingsDto[] newArray(int i) {
            return new MarketCheckoutSettingsDto[i];
        }
    }

    public MarketCheckoutSettingsDto(MarketCheckoutSettingsSectionsListDto marketCheckoutSettingsSectionsListDto) {
        this.sections = marketCheckoutSettingsSectionsListDto;
    }

    public final MarketCheckoutSettingsSectionsListDto d() {
        return this.sections;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MarketCheckoutSettingsDto) && epx.f(this.sections, ((MarketCheckoutSettingsDto) obj).sections);
    }

    public final int hashCode() {
        return this.sections.hashCode();
    }

    public final String toString() {
        return "MarketCheckoutSettingsDto(sections=" + this.sections + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.sections.writeToParcel(parcel, i);
    }
}
