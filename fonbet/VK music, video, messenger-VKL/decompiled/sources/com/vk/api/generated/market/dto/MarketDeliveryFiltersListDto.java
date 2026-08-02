package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.unity3d.ads.BuildConfig;
import defpackage.q0;
import xsna.epx;
import xsna.pmi0;
import xsna.qoy;
import xsna.shy;

/* compiled from: MarketDeliveryFiltersListDto.kt */
/* loaded from: classes15.dex */
public final class MarketDeliveryFiltersListDto implements Parcelable {
    public static final Parcelable.Creator<MarketDeliveryFiltersListDto> CREATOR = new a();

    /* renamed from: default, reason: not valid java name */
    @pmi0(BuildConfig.FLAVOR)
    private final boolean f9default;

    @pmi0("is_enabled")
    private final boolean isEnabled;

    @pmi0("name")
    private final String name;

    @pmi0("value")
    private final int value;

    /* compiled from: MarketDeliveryFiltersListDto.kt */
    public static final class a implements Parcelable.Creator<MarketDeliveryFiltersListDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketDeliveryFiltersListDto createFromParcel(Parcel parcel) {
            return new MarketDeliveryFiltersListDto(parcel.readString(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketDeliveryFiltersListDto[] newArray(int i) {
            return new MarketDeliveryFiltersListDto[i];
        }
    }

    public MarketDeliveryFiltersListDto(String str, int i, boolean z, boolean z2) {
        this.name = str;
        this.value = i;
        this.isEnabled = z;
        this.f9default = z2;
    }

    public final boolean d() {
        return this.f9default;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketDeliveryFiltersListDto)) {
            return false;
        }
        MarketDeliveryFiltersListDto marketDeliveryFiltersListDto = (MarketDeliveryFiltersListDto) obj;
        return epx.f(this.name, marketDeliveryFiltersListDto.name) && this.value == marketDeliveryFiltersListDto.value && this.isEnabled == marketDeliveryFiltersListDto.isEnabled && this.f9default == marketDeliveryFiltersListDto.f9default;
    }

    public final int f() {
        return this.value;
    }

    public final boolean g() {
        return this.isEnabled;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f9default) + qoy.b(shy.a(this.value, this.name.hashCode() * 31, 31), 31, this.isEnabled);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketDeliveryFiltersListDto(name=");
        sb.append(this.name);
        sb.append(", value=");
        sb.append(this.value);
        sb.append(", isEnabled=");
        sb.append(this.isEnabled);
        sb.append(", default=");
        return q0.a(sb, this.f9default, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeInt(this.value);
        parcel.writeInt(this.isEnabled ? 1 : 0);
        parcel.writeInt(this.f9default ? 1 : 0);
    }
}
