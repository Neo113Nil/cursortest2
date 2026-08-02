package com.vk.api.generated.atum.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;
import xsna.zrp;

/* compiled from: AtumVkuiPicturePropsDto.kt */
/* loaded from: classes14.dex */
public final class AtumVkuiPicturePropsDto implements Parcelable {
    public static final Parcelable.Creator<AtumVkuiPicturePropsDto> CREATOR = new a();

    @pmi0("background_color")
    private final AtumVkuiColorNameDto backgroundColor;

    @pmi0("border_radius")
    private final BorderRadiusDto borderRadius;

    @pmi0("is_border_hidden")
    private final Boolean isBorderHidden;

    @pmi0("overlay")
    private final AtumVkuiIconOverlayDto overlay;

    @pmi0("picture_content")
    private final AtumVkuiPictureContentDto pictureContent;

    @pmi0("size")
    private final AtumVkuiPictureSizeDto size;

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AtumVkuiPicturePropsDto.kt */
    public static final class BorderRadiusDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ BorderRadiusDto[] $VALUES;
        public static final Parcelable.Creator<BorderRadiusDto> CREATOR;

        @pmi0("2")
        public static final BorderRadiusDto LARGE;

        @pmi0("1")
        public static final BorderRadiusDto MEDIUM;

        @pmi0("0")
        public static final BorderRadiusDto SMALL;
        private final int value;

        /* compiled from: AtumVkuiPicturePropsDto.kt */
        public static final class a implements Parcelable.Creator<BorderRadiusDto> {
            @Override // android.os.Parcelable.Creator
            public final BorderRadiusDto createFromParcel(Parcel parcel) {
                return BorderRadiusDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final BorderRadiusDto[] newArray(int i) {
                return new BorderRadiusDto[i];
            }
        }

        static {
            BorderRadiusDto borderRadiusDto = new BorderRadiusDto("SMALL", 0, 0);
            SMALL = borderRadiusDto;
            BorderRadiusDto borderRadiusDto2 = new BorderRadiusDto("MEDIUM", 1, 1);
            MEDIUM = borderRadiusDto2;
            BorderRadiusDto borderRadiusDto3 = new BorderRadiusDto("LARGE", 2, 2);
            LARGE = borderRadiusDto3;
            BorderRadiusDto[] borderRadiusDtoArr = {borderRadiusDto, borderRadiusDto2, borderRadiusDto3};
            $VALUES = borderRadiusDtoArr;
            $ENTRIES = new asp(borderRadiusDtoArr);
            CREATOR = new a();
        }

        private BorderRadiusDto(String str, int i, int i2) {
            this.value = i2;
        }

        public static BorderRadiusDto valueOf(String str) {
            return (BorderRadiusDto) Enum.valueOf(BorderRadiusDto.class, str);
        }

        public static BorderRadiusDto[] values() {
            return (BorderRadiusDto[]) $VALUES.clone();
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
    /* compiled from: AtumVkuiPicturePropsDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("picture")
        public static final TypeDto PICTURE;
        private final String value;

        /* compiled from: AtumVkuiPicturePropsDto.kt */
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
            TypeDto typeDto = new TypeDto("PICTURE", 0, "picture");
            PICTURE = typeDto;
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

    /* compiled from: AtumVkuiPicturePropsDto.kt */
    public static final class a implements Parcelable.Creator<AtumVkuiPicturePropsDto> {
        @Override // android.os.Parcelable.Creator
        public final AtumVkuiPicturePropsDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
            AtumVkuiPictureContentDto atumVkuiPictureContentDto = (AtumVkuiPictureContentDto) parcel.readParcelable(AtumVkuiPicturePropsDto.class.getClassLoader());
            AtumVkuiIconOverlayDto createFromParcel2 = parcel.readInt() == 0 ? null : AtumVkuiIconOverlayDto.CREATOR.createFromParcel(parcel);
            AtumVkuiPictureSizeDto createFromParcel3 = parcel.readInt() == 0 ? null : AtumVkuiPictureSizeDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AtumVkuiPicturePropsDto(createFromParcel, atumVkuiPictureContentDto, createFromParcel2, createFromParcel3, valueOf, parcel.readInt() == 0 ? null : BorderRadiusDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AtumVkuiColorNameDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final AtumVkuiPicturePropsDto[] newArray(int i) {
            return new AtumVkuiPicturePropsDto[i];
        }
    }

    public AtumVkuiPicturePropsDto(TypeDto typeDto, AtumVkuiPictureContentDto atumVkuiPictureContentDto, AtumVkuiIconOverlayDto atumVkuiIconOverlayDto, AtumVkuiPictureSizeDto atumVkuiPictureSizeDto, Boolean bool, BorderRadiusDto borderRadiusDto, AtumVkuiColorNameDto atumVkuiColorNameDto) {
        this.type = typeDto;
        this.pictureContent = atumVkuiPictureContentDto;
        this.overlay = atumVkuiIconOverlayDto;
        this.size = atumVkuiPictureSizeDto;
        this.isBorderHidden = bool;
        this.borderRadius = borderRadiusDto;
        this.backgroundColor = atumVkuiColorNameDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AtumVkuiPicturePropsDto)) {
            return false;
        }
        AtumVkuiPicturePropsDto atumVkuiPicturePropsDto = (AtumVkuiPicturePropsDto) obj;
        return this.type == atumVkuiPicturePropsDto.type && epx.f(this.pictureContent, atumVkuiPicturePropsDto.pictureContent) && epx.f(this.overlay, atumVkuiPicturePropsDto.overlay) && this.size == atumVkuiPicturePropsDto.size && epx.f(this.isBorderHidden, atumVkuiPicturePropsDto.isBorderHidden) && this.borderRadius == atumVkuiPicturePropsDto.borderRadius && this.backgroundColor == atumVkuiPicturePropsDto.backgroundColor;
    }

    public final int hashCode() {
        int hashCode = (this.pictureContent.hashCode() + (this.type.hashCode() * 31)) * 31;
        AtumVkuiIconOverlayDto atumVkuiIconOverlayDto = this.overlay;
        int hashCode2 = (hashCode + (atumVkuiIconOverlayDto == null ? 0 : atumVkuiIconOverlayDto.hashCode())) * 31;
        AtumVkuiPictureSizeDto atumVkuiPictureSizeDto = this.size;
        int hashCode3 = (hashCode2 + (atumVkuiPictureSizeDto == null ? 0 : atumVkuiPictureSizeDto.hashCode())) * 31;
        Boolean bool = this.isBorderHidden;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        BorderRadiusDto borderRadiusDto = this.borderRadius;
        int hashCode5 = (hashCode4 + (borderRadiusDto == null ? 0 : borderRadiusDto.hashCode())) * 31;
        AtumVkuiColorNameDto atumVkuiColorNameDto = this.backgroundColor;
        return hashCode5 + (atumVkuiColorNameDto != null ? atumVkuiColorNameDto.hashCode() : 0);
    }

    public final String toString() {
        return "AtumVkuiPicturePropsDto(type=" + this.type + ", pictureContent=" + this.pictureContent + ", overlay=" + this.overlay + ", size=" + this.size + ", isBorderHidden=" + this.isBorderHidden + ", borderRadius=" + this.borderRadius + ", backgroundColor=" + this.backgroundColor + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        parcel.writeParcelable(this.pictureContent, i);
        AtumVkuiIconOverlayDto atumVkuiIconOverlayDto = this.overlay;
        if (atumVkuiIconOverlayDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            atumVkuiIconOverlayDto.writeToParcel(parcel, i);
        }
        AtumVkuiPictureSizeDto atumVkuiPictureSizeDto = this.size;
        if (atumVkuiPictureSizeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            atumVkuiPictureSizeDto.writeToParcel(parcel, i);
        }
        Boolean bool = this.isBorderHidden;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        BorderRadiusDto borderRadiusDto = this.borderRadius;
        if (borderRadiusDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            borderRadiusDto.writeToParcel(parcel, i);
        }
        AtumVkuiColorNameDto atumVkuiColorNameDto = this.backgroundColor;
        if (atumVkuiColorNameDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            atumVkuiColorNameDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ AtumVkuiPicturePropsDto(TypeDto typeDto, AtumVkuiPictureContentDto atumVkuiPictureContentDto, AtumVkuiIconOverlayDto atumVkuiIconOverlayDto, AtumVkuiPictureSizeDto atumVkuiPictureSizeDto, Boolean bool, BorderRadiusDto borderRadiusDto, AtumVkuiColorNameDto atumVkuiColorNameDto, int i, zcl zclVar) {
        this(typeDto, atumVkuiPictureContentDto, (i & 4) != 0 ? null : atumVkuiIconOverlayDto, (i & 8) != 0 ? null : atumVkuiPictureSizeDto, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : borderRadiusDto, (i & 64) != 0 ? null : atumVkuiColorNameDto);
    }
}
