package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;
import xsna.shy;
import xsna.vu5;

/* compiled from: MarketSettingsGoodsPropertiesDto.kt */
/* loaded from: classes15.dex */
public final class MarketSettingsGoodsPropertiesDto implements Parcelable {
    public static final Parcelable.Creator<MarketSettingsGoodsPropertiesDto> CREATOR = new a();

    @pmi0("max_properties_per_owner")
    private final int maxPropertiesPerOwner;

    @pmi0("max_property_name_length")
    private final int maxPropertyNameLength;

    @pmi0("max_variant_name_length")
    private final int maxVariantNameLength;

    @pmi0("max_variants_per_property")
    private final int maxVariantsPerProperty;

    /* compiled from: MarketSettingsGoodsPropertiesDto.kt */
    public static final class a implements Parcelable.Creator<MarketSettingsGoodsPropertiesDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketSettingsGoodsPropertiesDto createFromParcel(Parcel parcel) {
            return new MarketSettingsGoodsPropertiesDto(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketSettingsGoodsPropertiesDto[] newArray(int i) {
            return new MarketSettingsGoodsPropertiesDto[i];
        }
    }

    public MarketSettingsGoodsPropertiesDto(int i, int i2, int i3, int i4) {
        this.maxPropertiesPerOwner = i;
        this.maxPropertyNameLength = i2;
        this.maxVariantsPerProperty = i3;
        this.maxVariantNameLength = i4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketSettingsGoodsPropertiesDto)) {
            return false;
        }
        MarketSettingsGoodsPropertiesDto marketSettingsGoodsPropertiesDto = (MarketSettingsGoodsPropertiesDto) obj;
        return this.maxPropertiesPerOwner == marketSettingsGoodsPropertiesDto.maxPropertiesPerOwner && this.maxPropertyNameLength == marketSettingsGoodsPropertiesDto.maxPropertyNameLength && this.maxVariantsPerProperty == marketSettingsGoodsPropertiesDto.maxVariantsPerProperty && this.maxVariantNameLength == marketSettingsGoodsPropertiesDto.maxVariantNameLength;
    }

    public final int hashCode() {
        return Integer.hashCode(this.maxVariantNameLength) + shy.a(this.maxVariantsPerProperty, shy.a(this.maxPropertyNameLength, Integer.hashCode(this.maxPropertiesPerOwner) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketSettingsGoodsPropertiesDto(maxPropertiesPerOwner=");
        sb.append(this.maxPropertiesPerOwner);
        sb.append(", maxPropertyNameLength=");
        sb.append(this.maxPropertyNameLength);
        sb.append(", maxVariantsPerProperty=");
        sb.append(this.maxVariantsPerProperty);
        sb.append(", maxVariantNameLength=");
        return vu5.b(sb, this.maxVariantNameLength, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.maxPropertiesPerOwner);
        parcel.writeInt(this.maxPropertyNameLength);
        parcel.writeInt(this.maxVariantsPerProperty);
        parcel.writeInt(this.maxVariantNameLength);
    }
}
