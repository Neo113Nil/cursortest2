package com.vk.api.generated.superAppShowcase.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.epx;
import xsna.go9;
import xsna.pmi0;
import xsna.up;
import xsna.urd0;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SuperAppShowcaseMarketTileForegroundDto.kt */
/* loaded from: classes.dex */
public abstract class SuperAppShowcaseMarketTileForegroundDto implements Parcelable {

    /* compiled from: SuperAppShowcaseMarketTileForegroundDto.kt */
    public static final class Deserializer implements a9y<SuperAppShowcaseMarketTileForegroundDto> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            String f = up.f(b9yVar, "type");
            if (epx.f(f, "text")) {
                return (SuperAppShowcaseMarketTileForegroundDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppShowcaseTileForegroundTextDto.class);
            }
            if (epx.f(f, "price")) {
                return (SuperAppShowcaseMarketTileForegroundDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppShowcaseTileForegroundPriceDto.class);
            }
            throw new IllegalStateException(go9.b("no mapping for the type:", f));
        }
    }

    /* compiled from: SuperAppShowcaseMarketTileForegroundDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppShowcaseTileForegroundPriceDto extends SuperAppShowcaseMarketTileForegroundDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppShowcaseTileForegroundPriceDto> CREATOR = new a();

        @pmi0("price_type")
        private final PriceTypeDto priceType;

        @pmi0("text")
        private final String text;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppShowcaseMarketTileForegroundDto.kt */
        public static final class PriceTypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ PriceTypeDto[] $VALUES;
            public static final Parcelable.Creator<PriceTypeDto> CREATOR;

            @pmi0("discount")
            public static final PriceTypeDto DISCOUNT;

            @pmi0(X3.i.Z)
            public static final PriceTypeDto MAIN;
            private final String value;

            /* compiled from: SuperAppShowcaseMarketTileForegroundDto.kt */
            public static final class a implements Parcelable.Creator<PriceTypeDto> {
                @Override // android.os.Parcelable.Creator
                public final PriceTypeDto createFromParcel(Parcel parcel) {
                    return PriceTypeDto.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final PriceTypeDto[] newArray(int i) {
                    return new PriceTypeDto[i];
                }
            }

            static {
                PriceTypeDto priceTypeDto = new PriceTypeDto("MAIN", 0, X3.i.Z);
                MAIN = priceTypeDto;
                PriceTypeDto priceTypeDto2 = new PriceTypeDto("DISCOUNT", 1, "discount");
                DISCOUNT = priceTypeDto2;
                PriceTypeDto[] priceTypeDtoArr = {priceTypeDto, priceTypeDto2};
                $VALUES = priceTypeDtoArr;
                $ENTRIES = new asp(priceTypeDtoArr);
                CREATOR = new a();
            }

            private PriceTypeDto(String str, int i, String str2) {
                this.value = str2;
            }

            public static PriceTypeDto valueOf(String str) {
                return (PriceTypeDto) Enum.valueOf(PriceTypeDto.class, str);
            }

            public static PriceTypeDto[] values() {
                return (PriceTypeDto[]) $VALUES.clone();
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

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppShowcaseMarketTileForegroundDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("price")
            public static final TypeDto PRICE;
            private final String value;

            /* compiled from: SuperAppShowcaseMarketTileForegroundDto.kt */
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
                TypeDto typeDto = new TypeDto("PRICE", 0, "price");
                PRICE = typeDto;
                TypeDto[] typeDtoArr = {typeDto};
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

        /* compiled from: SuperAppShowcaseMarketTileForegroundDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppShowcaseTileForegroundPriceDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseTileForegroundPriceDto createFromParcel(Parcel parcel) {
                return new SuperAppShowcaseTileForegroundPriceDto(TypeDto.CREATOR.createFromParcel(parcel), parcel.readString(), PriceTypeDto.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseTileForegroundPriceDto[] newArray(int i) {
                return new SuperAppShowcaseTileForegroundPriceDto[i];
            }
        }

        public SuperAppShowcaseTileForegroundPriceDto(TypeDto typeDto, String str, PriceTypeDto priceTypeDto) {
            super(null);
            this.type = typeDto;
            this.text = str;
            this.priceType = priceTypeDto;
        }

        public final PriceTypeDto d() {
            return this.priceType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String e() {
            return this.text;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppShowcaseTileForegroundPriceDto)) {
                return false;
            }
            SuperAppShowcaseTileForegroundPriceDto superAppShowcaseTileForegroundPriceDto = (SuperAppShowcaseTileForegroundPriceDto) obj;
            return this.type == superAppShowcaseTileForegroundPriceDto.type && epx.f(this.text, superAppShowcaseTileForegroundPriceDto.text) && this.priceType == superAppShowcaseTileForegroundPriceDto.priceType;
        }

        public final int hashCode() {
            return this.priceType.hashCode() + urd0.a(this.type.hashCode() * 31, 31, this.text);
        }

        public final String toString() {
            return "SuperAppShowcaseTileForegroundPriceDto(type=" + this.type + ", text=" + this.text + ", priceType=" + this.priceType + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeString(this.text);
            this.priceType.writeToParcel(parcel, i);
        }
    }

    /* compiled from: SuperAppShowcaseMarketTileForegroundDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppShowcaseTileForegroundTextDto extends SuperAppShowcaseMarketTileForegroundDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppShowcaseTileForegroundTextDto> CREATOR = new a();

        @pmi0(TtmlNode.TAG_STYLE)
        private final StyleDto style;

        @pmi0("text")
        private final String text;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppShowcaseMarketTileForegroundDto.kt */
        public static final class StyleDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ StyleDto[] $VALUES;
            public static final Parcelable.Creator<StyleDto> CREATOR;

            @pmi0("primary")
            public static final StyleDto PRIMARY;

            @pmi0(X3.i.Y)
            public static final StyleDto SECONDARY;
            private final String value;

            /* compiled from: SuperAppShowcaseMarketTileForegroundDto.kt */
            public static final class a implements Parcelable.Creator<StyleDto> {
                @Override // android.os.Parcelable.Creator
                public final StyleDto createFromParcel(Parcel parcel) {
                    return StyleDto.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final StyleDto[] newArray(int i) {
                    return new StyleDto[i];
                }
            }

            static {
                StyleDto styleDto = new StyleDto("PRIMARY", 0, "primary");
                PRIMARY = styleDto;
                StyleDto styleDto2 = new StyleDto("SECONDARY", 1, X3.i.Y);
                SECONDARY = styleDto2;
                StyleDto[] styleDtoArr = {styleDto, styleDto2};
                $VALUES = styleDtoArr;
                $ENTRIES = new asp(styleDtoArr);
                CREATOR = new a();
            }

            private StyleDto(String str, int i, String str2) {
                this.value = str2;
            }

            public static StyleDto valueOf(String str) {
                return (StyleDto) Enum.valueOf(StyleDto.class, str);
            }

            public static StyleDto[] values() {
                return (StyleDto[]) $VALUES.clone();
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

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppShowcaseMarketTileForegroundDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("text")
            public static final TypeDto TEXT;
            private final String value;

            /* compiled from: SuperAppShowcaseMarketTileForegroundDto.kt */
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
                TypeDto[] typeDtoArr = {typeDto};
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

        /* compiled from: SuperAppShowcaseMarketTileForegroundDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppShowcaseTileForegroundTextDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseTileForegroundTextDto createFromParcel(Parcel parcel) {
                return new SuperAppShowcaseTileForegroundTextDto(TypeDto.CREATOR.createFromParcel(parcel), parcel.readString(), StyleDto.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseTileForegroundTextDto[] newArray(int i) {
                return new SuperAppShowcaseTileForegroundTextDto[i];
            }
        }

        public SuperAppShowcaseTileForegroundTextDto(TypeDto typeDto, String str, StyleDto styleDto) {
            super(null);
            this.type = typeDto;
            this.text = str;
            this.style = styleDto;
        }

        public final String d() {
            return this.text;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppShowcaseTileForegroundTextDto)) {
                return false;
            }
            SuperAppShowcaseTileForegroundTextDto superAppShowcaseTileForegroundTextDto = (SuperAppShowcaseTileForegroundTextDto) obj;
            return this.type == superAppShowcaseTileForegroundTextDto.type && epx.f(this.text, superAppShowcaseTileForegroundTextDto.text) && this.style == superAppShowcaseTileForegroundTextDto.style;
        }

        public final int hashCode() {
            return this.style.hashCode() + urd0.a(this.type.hashCode() * 31, 31, this.text);
        }

        public final String toString() {
            return "SuperAppShowcaseTileForegroundTextDto(type=" + this.type + ", text=" + this.text + ", style=" + this.style + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeString(this.text);
            this.style.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ SuperAppShowcaseMarketTileForegroundDto(zcl zclVar) {
        this();
    }

    private SuperAppShowcaseMarketTileForegroundDto() {
    }
}
