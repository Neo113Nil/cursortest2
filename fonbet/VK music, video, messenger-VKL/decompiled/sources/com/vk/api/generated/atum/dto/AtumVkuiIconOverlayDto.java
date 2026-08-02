package com.vk.api.generated.atum.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: AtumVkuiIconOverlayDto.kt */
/* loaded from: classes14.dex */
public final class AtumVkuiIconOverlayDto implements Parcelable {
    public static final Parcelable.Creator<AtumVkuiIconOverlayDto> CREATOR = new a();

    @pmi0("image")
    private final AtumVkuiLocalImageDto image;

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AtumVkuiIconOverlayDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("1")
        public static final TypeDto DARK;

        @pmi0("0")
        public static final TypeDto LIGHT;
        private final int value;

        /* compiled from: AtumVkuiIconOverlayDto.kt */
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
            TypeDto typeDto = new TypeDto("LIGHT", 0, 0);
            LIGHT = typeDto;
            TypeDto typeDto2 = new TypeDto("DARK", 1, 1);
            DARK = typeDto2;
            TypeDto[] typeDtoArr = {typeDto, typeDto2};
            $VALUES = typeDtoArr;
            $ENTRIES = new asp(typeDtoArr);
            CREATOR = new a();
        }

        private TypeDto(String str, int i, int i2) {
            this.value = i2;
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

    /* compiled from: AtumVkuiIconOverlayDto.kt */
    public static final class a implements Parcelable.Creator<AtumVkuiIconOverlayDto> {
        @Override // android.os.Parcelable.Creator
        public final AtumVkuiIconOverlayDto createFromParcel(Parcel parcel) {
            return new AtumVkuiIconOverlayDto(AtumVkuiLocalImageDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : TypeDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AtumVkuiIconOverlayDto[] newArray(int i) {
            return new AtumVkuiIconOverlayDto[i];
        }
    }

    public AtumVkuiIconOverlayDto(AtumVkuiLocalImageDto atumVkuiLocalImageDto, TypeDto typeDto) {
        this.image = atumVkuiLocalImageDto;
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
        if (!(obj instanceof AtumVkuiIconOverlayDto)) {
            return false;
        }
        AtumVkuiIconOverlayDto atumVkuiIconOverlayDto = (AtumVkuiIconOverlayDto) obj;
        return this.image == atumVkuiIconOverlayDto.image && this.type == atumVkuiIconOverlayDto.type;
    }

    public final int hashCode() {
        int hashCode = this.image.hashCode() * 31;
        TypeDto typeDto = this.type;
        return hashCode + (typeDto == null ? 0 : typeDto.hashCode());
    }

    public final String toString() {
        return "AtumVkuiIconOverlayDto(image=" + this.image + ", type=" + this.type + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.image.writeToParcel(parcel, i);
        TypeDto typeDto = this.type;
        if (typeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            typeDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ AtumVkuiIconOverlayDto(AtumVkuiLocalImageDto atumVkuiLocalImageDto, TypeDto typeDto, int i, zcl zclVar) {
        this(atumVkuiLocalImageDto, (i & 2) != 0 ? null : typeDto);
    }
}
