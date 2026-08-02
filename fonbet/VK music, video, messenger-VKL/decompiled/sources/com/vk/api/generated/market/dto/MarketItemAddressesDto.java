package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.groups.dto.GroupsAddressDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.asp;
import xsna.bo;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.shy;
import xsna.zrp;

/* compiled from: MarketItemAddressesDto.kt */
/* loaded from: classes15.dex */
public final class MarketItemAddressesDto implements Parcelable {
    public static final Parcelable.Creator<MarketItemAddressesDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<GroupsAddressDto> items;

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MarketItemAddressesDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @pmi0("all")
        public static final TypeDto ALL;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("ids")
        public static final TypeDto IDS;
        private final String value;

        /* compiled from: MarketItemAddressesDto.kt */
        public static final class a implements Parcelable.Creator<TypeDto> {
            @Override // android.os.Parcelable.Creator
            public final TypeDto createFromParcel(Parcel parcel) {
                return TypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final TypeDto[] newArray(int i) {
                return new TypeDto[i];
            }
        }

        static {
            TypeDto typeDto = new TypeDto("ALL", 0, "all");
            ALL = typeDto;
            TypeDto typeDto2 = new TypeDto("IDS", 1, "ids");
            IDS = typeDto2;
            TypeDto[] typeDtoArr = {typeDto, typeDto2};
            $VALUES = typeDtoArr;
            $ENTRIES = new asp(typeDtoArr);
            CREATOR = new a();
        }

        private TypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static TypeDto valueOf(String str) {
            return (TypeDto) Enum.valueOf(TypeDto.class, str);
        }

        public static TypeDto[] values() {
            return (TypeDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: MarketItemAddressesDto.kt */
    public static final class a implements Parcelable.Creator<MarketItemAddressesDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketItemAddressesDto createFromParcel(Parcel parcel) {
            TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = bo.b(MarketItemAddressesDto.class, parcel, arrayList, i, 1);
            }
            return new MarketItemAddressesDto(createFromParcel, readInt, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketItemAddressesDto[] newArray(int i) {
            return new MarketItemAddressesDto[i];
        }
    }

    public MarketItemAddressesDto(TypeDto typeDto, int i, List<GroupsAddressDto> list) {
        this.type = typeDto;
        this.count = i;
        this.items = list;
    }

    public final List<GroupsAddressDto> d() {
        return this.items;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketItemAddressesDto)) {
            return false;
        }
        MarketItemAddressesDto marketItemAddressesDto = (MarketItemAddressesDto) obj;
        return this.type == marketItemAddressesDto.type && this.count == marketItemAddressesDto.count && epx.f(this.items, marketItemAddressesDto.items);
    }

    public final int getCount() {
        return this.count;
    }

    public final int hashCode() {
        return this.items.hashCode() + shy.a(this.count, this.type.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketItemAddressesDto(type=");
        sb.append(this.type);
        sb.append(", count=");
        sb.append(this.count);
        sb.append(", items=");
        return ms9.a(')', sb, this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
    }
}
