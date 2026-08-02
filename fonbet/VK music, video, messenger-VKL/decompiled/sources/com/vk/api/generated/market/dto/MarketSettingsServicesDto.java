package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.pmi0;

/* compiled from: MarketSettingsServicesDto.kt */
/* loaded from: classes15.dex */
public final class MarketSettingsServicesDto implements Parcelable {
    public static final Parcelable.Creator<MarketSettingsServicesDto> CREATOR = new a();

    @pmi0("enabled")
    private final boolean enabled;

    /* compiled from: MarketSettingsServicesDto.kt */
    public static final class a implements Parcelable.Creator<MarketSettingsServicesDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketSettingsServicesDto createFromParcel(Parcel parcel) {
            return new MarketSettingsServicesDto(parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketSettingsServicesDto[] newArray(int i) {
            return new MarketSettingsServicesDto[i];
        }
    }

    public MarketSettingsServicesDto(boolean z) {
        this.enabled = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MarketSettingsServicesDto) && this.enabled == ((MarketSettingsServicesDto) obj).enabled;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.enabled);
    }

    public final String toString() {
        return q0.a(new StringBuilder("MarketSettingsServicesDto(enabled="), this.enabled, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.enabled ? 1 : 0);
    }
}
