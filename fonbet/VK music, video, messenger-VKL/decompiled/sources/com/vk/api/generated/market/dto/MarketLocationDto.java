package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import io.reactivex.rxjava3.subjects.b;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: MarketLocationDto.kt */
/* loaded from: classes15.dex */
public final class MarketLocationDto implements Parcelable {
    public static final Parcelable.Creator<MarketLocationDto> CREATOR = new a();

    @pmi0("city_id")
    private final String cityId;

    @pmi0("is_client")
    private final Boolean isClient;

    @pmi0("latitude")
    private final float latitude;

    @pmi0("longitude")
    private final float longitude;

    /* compiled from: MarketLocationDto.kt */
    public static final class a implements Parcelable.Creator<MarketLocationDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketLocationDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            float readFloat = parcel.readFloat();
            float readFloat2 = parcel.readFloat();
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MarketLocationDto(readFloat, readFloat2, readString, valueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketLocationDto[] newArray(int i) {
            return new MarketLocationDto[i];
        }
    }

    public MarketLocationDto(float f, float f2, String str, Boolean bool) {
        this.latitude = f;
        this.longitude = f2;
        this.cityId = str;
        this.isClient = bool;
    }

    public final String d() {
        return this.cityId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final float e() {
        return this.latitude;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketLocationDto)) {
            return false;
        }
        MarketLocationDto marketLocationDto = (MarketLocationDto) obj;
        return Float.compare(this.latitude, marketLocationDto.latitude) == 0 && Float.compare(this.longitude, marketLocationDto.longitude) == 0 && epx.f(this.cityId, marketLocationDto.cityId) && epx.f(this.isClient, marketLocationDto.isClient);
    }

    public final float f() {
        return this.longitude;
    }

    public final int hashCode() {
        int a2 = b.a(this.longitude, Float.hashCode(this.latitude) * 31, 31);
        String str = this.cityId;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.isClient;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketLocationDto(latitude=");
        sb.append(this.latitude);
        sb.append(", longitude=");
        sb.append(this.longitude);
        sb.append(", cityId=");
        sb.append(this.cityId);
        sb.append(", isClient=");
        return tn.a(sb, this.isClient, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.latitude);
        parcel.writeFloat(this.longitude);
        parcel.writeString(this.cityId);
        Boolean bool = this.isClient;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public /* synthetic */ MarketLocationDto(float f, float f2, String str, Boolean bool, int i, zcl zclVar) {
        this(f, f2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : bool);
    }
}
