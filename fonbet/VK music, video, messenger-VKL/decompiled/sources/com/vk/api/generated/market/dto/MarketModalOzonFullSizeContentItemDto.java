package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.C4572u;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;
import xsna.zrp;

/* compiled from: MarketModalOzonFullSizeContentItemDto.kt */
/* loaded from: classes15.dex */
public final class MarketModalOzonFullSizeContentItemDto implements Parcelable {
    public static final Parcelable.Creator<MarketModalOzonFullSizeContentItemDto> CREATOR = new a();

    @pmi0("text")
    private final String text;

    @pmi0("title")
    private final String title;

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MarketModalOzonFullSizeContentItemDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @pmi0("application")
        public static final TypeDto APPLICATION;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0(C4572u.g)
        public static final TypeDto DELIVERY;

        @pmi0("payment")
        public static final TypeDto PAYMENT;
        private final String value;

        /* compiled from: MarketModalOzonFullSizeContentItemDto.kt */
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
            TypeDto typeDto = new TypeDto("APPLICATION", 0, "application");
            APPLICATION = typeDto;
            TypeDto typeDto2 = new TypeDto("PAYMENT", 1, "payment");
            PAYMENT = typeDto2;
            TypeDto typeDto3 = new TypeDto("DELIVERY", 2, C4572u.g);
            DELIVERY = typeDto3;
            TypeDto[] typeDtoArr = {typeDto, typeDto2, typeDto3};
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

    /* compiled from: MarketModalOzonFullSizeContentItemDto.kt */
    public static final class a implements Parcelable.Creator<MarketModalOzonFullSizeContentItemDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketModalOzonFullSizeContentItemDto createFromParcel(Parcel parcel) {
            return new MarketModalOzonFullSizeContentItemDto(TypeDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketModalOzonFullSizeContentItemDto[] newArray(int i) {
            return new MarketModalOzonFullSizeContentItemDto[i];
        }
    }

    public MarketModalOzonFullSizeContentItemDto(TypeDto typeDto, String str, String str2) {
        this.type = typeDto;
        this.title = str;
        this.text = str2;
    }

    public final String d() {
        return this.text;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final TypeDto e() {
        return this.type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketModalOzonFullSizeContentItemDto)) {
            return false;
        }
        MarketModalOzonFullSizeContentItemDto marketModalOzonFullSizeContentItemDto = (MarketModalOzonFullSizeContentItemDto) obj;
        return this.type == marketModalOzonFullSizeContentItemDto.type && epx.f(this.title, marketModalOzonFullSizeContentItemDto.title) && epx.f(this.text, marketModalOzonFullSizeContentItemDto.text);
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        return this.text.hashCode() + urd0.a(this.type.hashCode() * 31, 31, this.title);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketModalOzonFullSizeContentItemDto(type=");
        sb.append(this.type);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", text=");
        return ho8.a(sb, this.text, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        parcel.writeString(this.title);
        parcel.writeString(this.text);
    }
}
