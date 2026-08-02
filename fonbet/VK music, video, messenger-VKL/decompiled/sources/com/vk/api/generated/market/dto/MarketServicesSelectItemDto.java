package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.urd0;
import xsna.zcl;

/* compiled from: MarketServicesSelectItemDto.kt */
/* loaded from: classes15.dex */
public final class MarketServicesSelectItemDto implements Parcelable {
    public static final Parcelable.Creator<MarketServicesSelectItemDto> CREATOR = new a();

    @pmi0("id")
    private final int id;

    @pmi0("is_disabled")
    private final Boolean isDisabled;

    @pmi0("name")
    private final String name;

    /* compiled from: MarketServicesSelectItemDto.kt */
    public static final class a implements Parcelable.Creator<MarketServicesSelectItemDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketServicesSelectItemDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MarketServicesSelectItemDto(readInt, readString, valueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketServicesSelectItemDto[] newArray(int i) {
            return new MarketServicesSelectItemDto[i];
        }
    }

    public MarketServicesSelectItemDto(int i, String str, Boolean bool) {
        this.id = i;
        this.name = str;
        this.isDisabled = bool;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketServicesSelectItemDto)) {
            return false;
        }
        MarketServicesSelectItemDto marketServicesSelectItemDto = (MarketServicesSelectItemDto) obj;
        return this.id == marketServicesSelectItemDto.id && epx.f(this.name, marketServicesSelectItemDto.name) && epx.f(this.isDisabled, marketServicesSelectItemDto.isDisabled);
    }

    public final int hashCode() {
        int a2 = urd0.a(Integer.hashCode(this.id) * 31, 31, this.name);
        Boolean bool = this.isDisabled;
        return a2 + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketServicesSelectItemDto(id=");
        sb.append(this.id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", isDisabled=");
        return tn.a(sb, this.isDisabled, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.name);
        Boolean bool = this.isDisabled;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public /* synthetic */ MarketServicesSelectItemDto(int i, String str, Boolean bool, int i2, zcl zclVar) {
        this(i, str, (i2 & 4) != 0 ? null : bool);
    }
}
