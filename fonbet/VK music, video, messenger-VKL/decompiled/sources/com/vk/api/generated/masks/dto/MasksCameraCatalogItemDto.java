package com.vk.api.generated.masks.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MasksCameraCatalogItemDto.kt */
/* loaded from: classes15.dex */
public final class MasksCameraCatalogItemDto implements Parcelable {
    public static final Parcelable.Creator<MasksCameraCatalogItemDto> CREATOR = new a();

    @pmi0("effect")
    private final MasksEffectDto effect;

    @pmi0("mask")
    private final MasksMaskDto mask;

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MasksCameraCatalogItemDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("effect")
        public static final TypeDto EFFECT;

        @pmi0("mask")
        public static final TypeDto MASK;
        private final String value;

        /* compiled from: MasksCameraCatalogItemDto.kt */
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
            TypeDto typeDto = new TypeDto("MASK", 0, "mask");
            MASK = typeDto;
            TypeDto typeDto2 = new TypeDto("EFFECT", 1, "effect");
            EFFECT = typeDto2;
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

    /* compiled from: MasksCameraCatalogItemDto.kt */
    public static final class a implements Parcelable.Creator<MasksCameraCatalogItemDto> {
        @Override // android.os.Parcelable.Creator
        public final MasksCameraCatalogItemDto createFromParcel(Parcel parcel) {
            return new MasksCameraCatalogItemDto(TypeDto.CREATOR.createFromParcel(parcel), (MasksMaskDto) parcel.readParcelable(MasksCameraCatalogItemDto.class.getClassLoader()), (MasksEffectDto) parcel.readParcelable(MasksCameraCatalogItemDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final MasksCameraCatalogItemDto[] newArray(int i) {
            return new MasksCameraCatalogItemDto[i];
        }
    }

    public MasksCameraCatalogItemDto(TypeDto typeDto, MasksMaskDto masksMaskDto, MasksEffectDto masksEffectDto) {
        this.type = typeDto;
        this.mask = masksMaskDto;
        this.effect = masksEffectDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MasksCameraCatalogItemDto)) {
            return false;
        }
        MasksCameraCatalogItemDto masksCameraCatalogItemDto = (MasksCameraCatalogItemDto) obj;
        return this.type == masksCameraCatalogItemDto.type && epx.f(this.mask, masksCameraCatalogItemDto.mask) && epx.f(this.effect, masksCameraCatalogItemDto.effect);
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        MasksMaskDto masksMaskDto = this.mask;
        int hashCode2 = (hashCode + (masksMaskDto == null ? 0 : masksMaskDto.hashCode())) * 31;
        MasksEffectDto masksEffectDto = this.effect;
        return hashCode2 + (masksEffectDto != null ? masksEffectDto.hashCode() : 0);
    }

    public final String toString() {
        return "MasksCameraCatalogItemDto(type=" + this.type + ", mask=" + this.mask + ", effect=" + this.effect + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        parcel.writeParcelable(this.mask, i);
        parcel.writeParcelable(this.effect, i);
    }

    public /* synthetic */ MasksCameraCatalogItemDto(TypeDto typeDto, MasksMaskDto masksMaskDto, MasksEffectDto masksEffectDto, int i, zcl zclVar) {
        this(typeDto, (i & 2) != 0 ? null : masksMaskDto, (i & 4) != 0 ? null : masksEffectDto);
    }
}
