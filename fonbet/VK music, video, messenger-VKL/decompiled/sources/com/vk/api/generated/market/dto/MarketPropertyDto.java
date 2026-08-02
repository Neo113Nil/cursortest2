package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.asp;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MarketPropertyDto.kt */
/* loaded from: classes15.dex */
public final class MarketPropertyDto implements Parcelable {
    public static final Parcelable.Creator<MarketPropertyDto> CREATOR = new a();

    @pmi0("id")
    private final int id;

    @pmi0("title")
    private final String title;

    @pmi0("type")
    private final TypeDto type;

    @pmi0("variants")
    private final List<MarketPropertyVariantDto> variants;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MarketPropertyDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @pmi0("color")
        public static final TypeDto COLOR;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("text")
        public static final TypeDto TEXT;
        private final String value;

        /* compiled from: MarketPropertyDto.kt */
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
            TypeDto typeDto = new TypeDto("TEXT", 0, "text");
            TEXT = typeDto;
            TypeDto typeDto2 = new TypeDto("COLOR", 1, "color");
            COLOR = typeDto2;
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

    /* compiled from: MarketPropertyDto.kt */
    public static final class a implements Parcelable.Creator<MarketPropertyDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketPropertyDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = en.a(MarketPropertyVariantDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new MarketPropertyDto(readInt, readString, arrayList, parcel.readInt() == 0 ? null : TypeDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final MarketPropertyDto[] newArray(int i) {
            return new MarketPropertyDto[i];
        }
    }

    public MarketPropertyDto(int i, String str, List<MarketPropertyVariantDto> list, TypeDto typeDto) {
        this.id = i;
        this.title = str;
        this.variants = list;
        this.type = typeDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketPropertyDto)) {
            return false;
        }
        MarketPropertyDto marketPropertyDto = (MarketPropertyDto) obj;
        return this.id == marketPropertyDto.id && epx.f(this.title, marketPropertyDto.title) && epx.f(this.variants, marketPropertyDto.variants) && this.type == marketPropertyDto.type;
    }

    public final int hashCode() {
        int a2 = fw3.a(urd0.a(Integer.hashCode(this.id) * 31, 31, this.title), 31, this.variants);
        TypeDto typeDto = this.type;
        return a2 + (typeDto == null ? 0 : typeDto.hashCode());
    }

    public final String toString() {
        return "MarketPropertyDto(id=" + this.id + ", title=" + this.title + ", variants=" + this.variants + ", type=" + this.type + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.title);
        Iterator a2 = ao.a(parcel, this.variants);
        while (a2.hasNext()) {
            ((MarketPropertyVariantDto) a2.next()).writeToParcel(parcel, i);
        }
        TypeDto typeDto = this.type;
        if (typeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            typeDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ MarketPropertyDto(int i, String str, List list, TypeDto typeDto, int i2, zcl zclVar) {
        this(i, str, list, (i2 & 8) != 0 ? null : typeDto);
    }
}
