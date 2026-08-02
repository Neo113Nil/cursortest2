package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;

/* compiled from: MarketCheckoutOrderSettingsDto.kt */
/* loaded from: classes15.dex */
public final class MarketCheckoutOrderSettingsDto implements Parcelable {
    public static final Parcelable.Creator<MarketCheckoutOrderSettingsDto> CREATOR = new a();

    @pmi0("sections")
    private final MarketCheckoutOrderSettingsSectionsListDto sections;

    /* compiled from: MarketCheckoutOrderSettingsDto.kt */
    public static final class a implements Parcelable.Creator<MarketCheckoutOrderSettingsDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketCheckoutOrderSettingsDto createFromParcel(Parcel parcel) {
            return new MarketCheckoutOrderSettingsDto(MarketCheckoutOrderSettingsSectionsListDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final MarketCheckoutOrderSettingsDto[] newArray(int i) {
            return new MarketCheckoutOrderSettingsDto[i];
        }
    }

    public MarketCheckoutOrderSettingsDto(MarketCheckoutOrderSettingsSectionsListDto marketCheckoutOrderSettingsSectionsListDto) {
        this.sections = marketCheckoutOrderSettingsSectionsListDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MarketCheckoutOrderSettingsDto) && epx.f(this.sections, ((MarketCheckoutOrderSettingsDto) obj).sections);
    }

    public final int hashCode() {
        return this.sections.hashCode();
    }

    public final String toString() {
        return "MarketCheckoutOrderSettingsDto(sections=" + this.sections + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.sections.writeToParcel(parcel, i);
    }
}
