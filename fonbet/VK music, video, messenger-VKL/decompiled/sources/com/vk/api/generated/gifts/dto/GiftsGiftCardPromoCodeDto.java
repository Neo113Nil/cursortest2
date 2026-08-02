package com.vk.api.generated.gifts.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.internal.bind.TreeTypeAdapter;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.epx;
import xsna.go9;
import xsna.ho8;
import xsna.pmi0;
import xsna.up;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: GiftsGiftCardPromoCodeDto.kt */
/* loaded from: classes14.dex */
public abstract class GiftsGiftCardPromoCodeDto implements Parcelable {

    /* compiled from: GiftsGiftCardPromoCodeDto.kt */
    public static final class Deserializer implements a9y<GiftsGiftCardPromoCodeDto> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            String f = up.f(b9yVar, "type");
            if (epx.f(f, "revealed")) {
                return (GiftsGiftCardPromoCodeDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, GiftsGiftCardPromoCodeRevealedDto.class);
            }
            if (epx.f(f, "placeholder")) {
                return (GiftsGiftCardPromoCodeDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, GiftsGiftCardPromoCodePlaceholderDto.class);
            }
            throw new IllegalStateException(go9.b("no mapping for the type:", f));
        }
    }

    /* compiled from: GiftsGiftCardPromoCodeDto.kt */
    public static final class GiftsGiftCardPromoCodePlaceholderDto extends GiftsGiftCardPromoCodeDto implements Parcelable {
        public static final Parcelable.Creator<GiftsGiftCardPromoCodePlaceholderDto> CREATOR = new a();

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: GiftsGiftCardPromoCodeDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("placeholder")
            public static final TypeDto PLACEHOLDER;
            private final String value;

            /* compiled from: GiftsGiftCardPromoCodeDto.kt */
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
                TypeDto typeDto = new TypeDto("PLACEHOLDER", 0, "placeholder");
                PLACEHOLDER = typeDto;
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

        /* compiled from: GiftsGiftCardPromoCodeDto.kt */
        public static final class a implements Parcelable.Creator<GiftsGiftCardPromoCodePlaceholderDto> {
            @Override // android.os.Parcelable.Creator
            public final GiftsGiftCardPromoCodePlaceholderDto createFromParcel(Parcel parcel) {
                return new GiftsGiftCardPromoCodePlaceholderDto(TypeDto.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final GiftsGiftCardPromoCodePlaceholderDto[] newArray(int i) {
                return new GiftsGiftCardPromoCodePlaceholderDto[i];
            }
        }

        public GiftsGiftCardPromoCodePlaceholderDto(TypeDto typeDto) {
            super(null);
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
            return (obj instanceof GiftsGiftCardPromoCodePlaceholderDto) && this.type == ((GiftsGiftCardPromoCodePlaceholderDto) obj).type;
        }

        public final int hashCode() {
            return this.type.hashCode();
        }

        public final String toString() {
            return "GiftsGiftCardPromoCodePlaceholderDto(type=" + this.type + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
        }
    }

    /* compiled from: GiftsGiftCardPromoCodeDto.kt */
    public static final class GiftsGiftCardPromoCodeRevealedDto extends GiftsGiftCardPromoCodeDto implements Parcelable {
        public static final Parcelable.Creator<GiftsGiftCardPromoCodeRevealedDto> CREATOR = new a();

        @pmi0("code")
        private final String code;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: GiftsGiftCardPromoCodeDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("revealed")
            public static final TypeDto REVEALED;
            private final String value;

            /* compiled from: GiftsGiftCardPromoCodeDto.kt */
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
                TypeDto typeDto = new TypeDto("REVEALED", 0, "revealed");
                REVEALED = typeDto;
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

        /* compiled from: GiftsGiftCardPromoCodeDto.kt */
        public static final class a implements Parcelable.Creator<GiftsGiftCardPromoCodeRevealedDto> {
            @Override // android.os.Parcelable.Creator
            public final GiftsGiftCardPromoCodeRevealedDto createFromParcel(Parcel parcel) {
                return new GiftsGiftCardPromoCodeRevealedDto(TypeDto.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final GiftsGiftCardPromoCodeRevealedDto[] newArray(int i) {
                return new GiftsGiftCardPromoCodeRevealedDto[i];
            }
        }

        public GiftsGiftCardPromoCodeRevealedDto(TypeDto typeDto, String str) {
            super(null);
            this.type = typeDto;
            this.code = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GiftsGiftCardPromoCodeRevealedDto)) {
                return false;
            }
            GiftsGiftCardPromoCodeRevealedDto giftsGiftCardPromoCodeRevealedDto = (GiftsGiftCardPromoCodeRevealedDto) obj;
            return this.type == giftsGiftCardPromoCodeRevealedDto.type && epx.f(this.code, giftsGiftCardPromoCodeRevealedDto.code);
        }

        public final int hashCode() {
            return this.code.hashCode() + (this.type.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("GiftsGiftCardPromoCodeRevealedDto(type=");
            sb.append(this.type);
            sb.append(", code=");
            return ho8.a(sb, this.code, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeString(this.code);
        }
    }

    public /* synthetic */ GiftsGiftCardPromoCodeDto(zcl zclVar) {
        this();
    }

    private GiftsGiftCardPromoCodeDto() {
    }
}
