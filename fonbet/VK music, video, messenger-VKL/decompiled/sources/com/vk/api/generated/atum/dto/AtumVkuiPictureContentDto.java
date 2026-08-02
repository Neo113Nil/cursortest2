package com.vk.api.generated.atum.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.google.gson.internal.bind.TreeTypeAdapter;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.epx;
import xsna.go9;
import xsna.pmi0;
import xsna.up;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: AtumVkuiPictureContentDto.kt */
/* loaded from: classes.dex */
public abstract class AtumVkuiPictureContentDto implements Parcelable {

    /* compiled from: AtumVkuiPictureContentDto.kt */
    /* loaded from: classes14.dex */
    public static final class AtumVkuiPictureContentIconDto extends AtumVkuiPictureContentDto implements Parcelable {
        public static final Parcelable.Creator<AtumVkuiPictureContentIconDto> CREATOR = new a();

        @pmi0("image")
        private final AtumVkuiAnyImageDto image;

        @pmi0("sys_tint_color")
        private final AtumImageTintDto sysTintColor;

        @pmi0("tint_color")
        private final AtumVkuiColorNameDto tintColor;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AtumVkuiPictureContentDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("icon")
            public static final TypeDto ICON;
            private final String value;

            /* compiled from: AtumVkuiPictureContentDto.kt */
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
                TypeDto typeDto = new TypeDto(NativeAdContent.ViewTag.AD_ICON, 0, "icon");
                ICON = typeDto;
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

        /* compiled from: AtumVkuiPictureContentDto.kt */
        public static final class a implements Parcelable.Creator<AtumVkuiPictureContentIconDto> {
            @Override // android.os.Parcelable.Creator
            public final AtumVkuiPictureContentIconDto createFromParcel(Parcel parcel) {
                return new AtumVkuiPictureContentIconDto(TypeDto.CREATOR.createFromParcel(parcel), (AtumVkuiAnyImageDto) parcel.readParcelable(AtumVkuiPictureContentIconDto.class.getClassLoader()), parcel.readInt() == 0 ? null : AtumImageTintDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AtumVkuiColorNameDto.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final AtumVkuiPictureContentIconDto[] newArray(int i) {
                return new AtumVkuiPictureContentIconDto[i];
            }
        }

        public /* synthetic */ AtumVkuiPictureContentIconDto(TypeDto typeDto, AtumVkuiAnyImageDto atumVkuiAnyImageDto, AtumImageTintDto atumImageTintDto, AtumVkuiColorNameDto atumVkuiColorNameDto, int i, zcl zclVar) {
            this(typeDto, atumVkuiAnyImageDto, (i & 4) != 0 ? null : atumImageTintDto, (i & 8) != 0 ? null : atumVkuiColorNameDto);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AtumVkuiPictureContentIconDto)) {
                return false;
            }
            AtumVkuiPictureContentIconDto atumVkuiPictureContentIconDto = (AtumVkuiPictureContentIconDto) obj;
            return this.type == atumVkuiPictureContentIconDto.type && epx.f(this.image, atumVkuiPictureContentIconDto.image) && this.sysTintColor == atumVkuiPictureContentIconDto.sysTintColor && this.tintColor == atumVkuiPictureContentIconDto.tintColor;
        }

        public final int hashCode() {
            int hashCode = (this.image.hashCode() + (this.type.hashCode() * 31)) * 31;
            AtumImageTintDto atumImageTintDto = this.sysTintColor;
            int hashCode2 = (hashCode + (atumImageTintDto == null ? 0 : atumImageTintDto.hashCode())) * 31;
            AtumVkuiColorNameDto atumVkuiColorNameDto = this.tintColor;
            return hashCode2 + (atumVkuiColorNameDto != null ? atumVkuiColorNameDto.hashCode() : 0);
        }

        public final String toString() {
            return "AtumVkuiPictureContentIconDto(type=" + this.type + ", image=" + this.image + ", sysTintColor=" + this.sysTintColor + ", tintColor=" + this.tintColor + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeParcelable(this.image, i);
            AtumImageTintDto atumImageTintDto = this.sysTintColor;
            if (atumImageTintDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                atumImageTintDto.writeToParcel(parcel, i);
            }
            AtumVkuiColorNameDto atumVkuiColorNameDto = this.tintColor;
            if (atumVkuiColorNameDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                atumVkuiColorNameDto.writeToParcel(parcel, i);
            }
        }

        public AtumVkuiPictureContentIconDto(TypeDto typeDto, AtumVkuiAnyImageDto atumVkuiAnyImageDto, AtumImageTintDto atumImageTintDto, AtumVkuiColorNameDto atumVkuiColorNameDto) {
            super(null);
            this.type = typeDto;
            this.image = atumVkuiAnyImageDto;
            this.sysTintColor = atumImageTintDto;
            this.tintColor = atumVkuiColorNameDto;
        }
    }

    /* compiled from: AtumVkuiPictureContentDto.kt */
    /* loaded from: classes14.dex */
    public static final class AtumVkuiPictureContentImageDto extends AtumVkuiPictureContentDto implements Parcelable {
        public static final Parcelable.Creator<AtumVkuiPictureContentImageDto> CREATOR = new a();

        @pmi0("image")
        private final AtumVkuiAnyImageDto image;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AtumVkuiPictureContentDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("image")
            public static final TypeDto IMAGE;
            private final String value;

            /* compiled from: AtumVkuiPictureContentDto.kt */
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
                TypeDto typeDto = new TypeDto("IMAGE", 0, "image");
                IMAGE = typeDto;
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

        /* compiled from: AtumVkuiPictureContentDto.kt */
        public static final class a implements Parcelable.Creator<AtumVkuiPictureContentImageDto> {
            @Override // android.os.Parcelable.Creator
            public final AtumVkuiPictureContentImageDto createFromParcel(Parcel parcel) {
                return new AtumVkuiPictureContentImageDto(TypeDto.CREATOR.createFromParcel(parcel), (AtumVkuiAnyImageDto) parcel.readParcelable(AtumVkuiPictureContentImageDto.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final AtumVkuiPictureContentImageDto[] newArray(int i) {
                return new AtumVkuiPictureContentImageDto[i];
            }
        }

        public AtumVkuiPictureContentImageDto(TypeDto typeDto, AtumVkuiAnyImageDto atumVkuiAnyImageDto) {
            super(null);
            this.type = typeDto;
            this.image = atumVkuiAnyImageDto;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AtumVkuiPictureContentImageDto)) {
                return false;
            }
            AtumVkuiPictureContentImageDto atumVkuiPictureContentImageDto = (AtumVkuiPictureContentImageDto) obj;
            return this.type == atumVkuiPictureContentImageDto.type && epx.f(this.image, atumVkuiPictureContentImageDto.image);
        }

        public final int hashCode() {
            return this.image.hashCode() + (this.type.hashCode() * 31);
        }

        public final String toString() {
            return "AtumVkuiPictureContentImageDto(type=" + this.type + ", image=" + this.image + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeParcelable(this.image, i);
        }
    }

    /* compiled from: AtumVkuiPictureContentDto.kt */
    public static final class Deserializer implements a9y<AtumVkuiPictureContentDto> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            String f = up.f(b9yVar, "type");
            if (epx.f(f, "image")) {
                return (AtumVkuiPictureContentDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AtumVkuiPictureContentImageDto.class);
            }
            if (epx.f(f, "icon")) {
                return (AtumVkuiPictureContentDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AtumVkuiPictureContentIconDto.class);
            }
            throw new IllegalStateException(go9.b("no mapping for the type:", f));
        }
    }

    public /* synthetic */ AtumVkuiPictureContentDto(zcl zclVar) {
        this();
    }

    private AtumVkuiPictureContentDto() {
    }
}
