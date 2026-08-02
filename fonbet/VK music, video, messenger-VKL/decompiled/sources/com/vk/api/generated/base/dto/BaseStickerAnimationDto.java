package com.vk.api.generated.base.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: BaseStickerAnimationDto.kt */
/* loaded from: classes14.dex */
public final class BaseStickerAnimationDto implements Parcelable {
    public static final Parcelable.Creator<BaseStickerAnimationDto> CREATOR = new a();

    @pmi0("type")
    private final TypeDto type;

    @pmi0("url")
    private final String url;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BaseStickerAnimationDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("dark")
        public static final TypeDto DARK;

        @pmi0("light")
        public static final TypeDto LIGHT;
        private final String value;

        /* compiled from: BaseStickerAnimationDto.kt */
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
            TypeDto typeDto = new TypeDto("LIGHT", 0, "light");
            LIGHT = typeDto;
            TypeDto typeDto2 = new TypeDto("DARK", 1, "dark");
            DARK = typeDto2;
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

    /* compiled from: BaseStickerAnimationDto.kt */
    public static final class a implements Parcelable.Creator<BaseStickerAnimationDto> {
        @Override // android.os.Parcelable.Creator
        public final BaseStickerAnimationDto createFromParcel(Parcel parcel) {
            return new BaseStickerAnimationDto(parcel.readInt() == 0 ? null : TypeDto.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BaseStickerAnimationDto[] newArray(int i) {
            return new BaseStickerAnimationDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BaseStickerAnimationDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final TypeDto d() {
        return this.type;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseStickerAnimationDto)) {
            return false;
        }
        BaseStickerAnimationDto baseStickerAnimationDto = (BaseStickerAnimationDto) obj;
        return this.type == baseStickerAnimationDto.type && epx.f(this.url, baseStickerAnimationDto.url);
    }

    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        TypeDto typeDto = this.type;
        int hashCode = (typeDto == null ? 0 : typeDto.hashCode()) * 31;
        String str = this.url;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseStickerAnimationDto(type=");
        sb.append(this.type);
        sb.append(", url=");
        return ho8.a(sb, this.url, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        TypeDto typeDto = this.type;
        if (typeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            typeDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.url);
    }

    public BaseStickerAnimationDto(TypeDto typeDto, String str) {
        this.type = typeDto;
        this.url = str;
    }

    public /* synthetic */ BaseStickerAnimationDto(TypeDto typeDto, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : typeDto, (i & 2) != 0 ? null : str);
    }
}
