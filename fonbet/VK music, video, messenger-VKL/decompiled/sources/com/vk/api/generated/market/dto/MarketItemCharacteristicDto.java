package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: MarketItemCharacteristicDto.kt */
/* loaded from: classes15.dex */
public final class MarketItemCharacteristicDto implements Parcelable {
    public static final Parcelable.Creator<MarketItemCharacteristicDto> CREATOR = new a();

    @pmi0("id")
    private final int id;

    @pmi0("name")
    private final String name;

    @pmi0("values")
    private final List<MarketItemCharacteristicValueDto> values;

    /* compiled from: MarketItemCharacteristicDto.kt */
    public static final class a implements Parcelable.Creator<MarketItemCharacteristicDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketItemCharacteristicDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = en.a(MarketItemCharacteristicValueDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new MarketItemCharacteristicDto(readInt, readString, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketItemCharacteristicDto[] newArray(int i) {
            return new MarketItemCharacteristicDto[i];
        }
    }

    public MarketItemCharacteristicDto(int i, String str, List<MarketItemCharacteristicValueDto> list) {
        this.id = i;
        this.name = str;
        this.values = list;
    }

    public final String d() {
        return this.name;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<MarketItemCharacteristicValueDto> e() {
        return this.values;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketItemCharacteristicDto)) {
            return false;
        }
        MarketItemCharacteristicDto marketItemCharacteristicDto = (MarketItemCharacteristicDto) obj;
        return this.id == marketItemCharacteristicDto.id && epx.f(this.name, marketItemCharacteristicDto.name) && epx.f(this.values, marketItemCharacteristicDto.values);
    }

    public final int getId() {
        return this.id;
    }

    public final int hashCode() {
        return this.values.hashCode() + urd0.a(Integer.hashCode(this.id) * 31, 31, this.name);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketItemCharacteristicDto(id=");
        sb.append(this.id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", values=");
        return ms9.a(')', sb, this.values);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.name);
        Iterator a2 = ao.a(parcel, this.values);
        while (a2.hasNext()) {
            ((MarketItemCharacteristicValueDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
