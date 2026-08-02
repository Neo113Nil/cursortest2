package com.vk.api.generated.atum.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.google.gson.internal.bind.TreeTypeAdapter;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.go9;
import xsna.pmi0;
import xsna.up;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: AtumVkuiRemoteImageViewPlaceholderDto.kt */
/* loaded from: classes.dex */
public abstract class AtumVkuiRemoteImageViewPlaceholderDto implements Parcelable {

    /* compiled from: AtumVkuiRemoteImageViewPlaceholderDto.kt */
    /* loaded from: classes14.dex */
    public static final class AtumVkuiRemoteImageViewPlaceholderColorDto extends AtumVkuiRemoteImageViewPlaceholderDto implements Parcelable {
        public static final Parcelable.Creator<AtumVkuiRemoteImageViewPlaceholderColorDto> CREATOR = new a();

        @pmi0("color")
        private final AtumVkuiColorNameDto color;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AtumVkuiRemoteImageViewPlaceholderDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;

            @pmi0("color")
            public static final TypeDto COLOR;
            public static final Parcelable.Creator<TypeDto> CREATOR;
            private final String value;

            /* compiled from: AtumVkuiRemoteImageViewPlaceholderDto.kt */
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
                TypeDto typeDto = new TypeDto("COLOR", 0, "color");
                COLOR = typeDto;
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

        /* compiled from: AtumVkuiRemoteImageViewPlaceholderDto.kt */
        public static final class a implements Parcelable.Creator<AtumVkuiRemoteImageViewPlaceholderColorDto> {
            @Override // android.os.Parcelable.Creator
            public final AtumVkuiRemoteImageViewPlaceholderColorDto createFromParcel(Parcel parcel) {
                return new AtumVkuiRemoteImageViewPlaceholderColorDto(TypeDto.CREATOR.createFromParcel(parcel), AtumVkuiColorNameDto.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final AtumVkuiRemoteImageViewPlaceholderColorDto[] newArray(int i) {
                return new AtumVkuiRemoteImageViewPlaceholderColorDto[i];
            }
        }

        public AtumVkuiRemoteImageViewPlaceholderColorDto(TypeDto typeDto, AtumVkuiColorNameDto atumVkuiColorNameDto) {
            super(null);
            this.type = typeDto;
            this.color = atumVkuiColorNameDto;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AtumVkuiRemoteImageViewPlaceholderColorDto)) {
                return false;
            }
            AtumVkuiRemoteImageViewPlaceholderColorDto atumVkuiRemoteImageViewPlaceholderColorDto = (AtumVkuiRemoteImageViewPlaceholderColorDto) obj;
            return this.type == atumVkuiRemoteImageViewPlaceholderColorDto.type && this.color == atumVkuiRemoteImageViewPlaceholderColorDto.color;
        }

        public final int hashCode() {
            return this.color.hashCode() + (this.type.hashCode() * 31);
        }

        public final String toString() {
            return "AtumVkuiRemoteImageViewPlaceholderColorDto(type=" + this.type + ", color=" + this.color + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            this.color.writeToParcel(parcel, i);
        }
    }

    /* compiled from: AtumVkuiRemoteImageViewPlaceholderDto.kt */
    /* loaded from: classes14.dex */
    public static final class AtumVkuiRemoteImageViewPlaceholderIconDto extends AtumVkuiRemoteImageViewPlaceholderDto implements Parcelable {
        public static final Parcelable.Creator<AtumVkuiRemoteImageViewPlaceholderIconDto> CREATOR = new a();

        @pmi0("background_color")
        private final AtumVkuiColorNameDto backgroundColor;

        @pmi0("image")
        private final AtumVkuiLocalImageDto image;

        @pmi0("tint_color")
        private final AtumVkuiColorNameDto tintColor;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AtumVkuiRemoteImageViewPlaceholderDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("icon")
            public static final TypeDto ICON;
            private final String value;

            /* compiled from: AtumVkuiRemoteImageViewPlaceholderDto.kt */
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

        /* compiled from: AtumVkuiRemoteImageViewPlaceholderDto.kt */
        public static final class a implements Parcelable.Creator<AtumVkuiRemoteImageViewPlaceholderIconDto> {
            @Override // android.os.Parcelable.Creator
            public final AtumVkuiRemoteImageViewPlaceholderIconDto createFromParcel(Parcel parcel) {
                return new AtumVkuiRemoteImageViewPlaceholderIconDto(TypeDto.CREATOR.createFromParcel(parcel), AtumVkuiLocalImageDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AtumVkuiColorNameDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AtumVkuiColorNameDto.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final AtumVkuiRemoteImageViewPlaceholderIconDto[] newArray(int i) {
                return new AtumVkuiRemoteImageViewPlaceholderIconDto[i];
            }
        }

        public /* synthetic */ AtumVkuiRemoteImageViewPlaceholderIconDto(TypeDto typeDto, AtumVkuiLocalImageDto atumVkuiLocalImageDto, AtumVkuiColorNameDto atumVkuiColorNameDto, AtumVkuiColorNameDto atumVkuiColorNameDto2, int i, zcl zclVar) {
            this(typeDto, atumVkuiLocalImageDto, (i & 4) != 0 ? null : atumVkuiColorNameDto, (i & 8) != 0 ? null : atumVkuiColorNameDto2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AtumVkuiRemoteImageViewPlaceholderIconDto)) {
                return false;
            }
            AtumVkuiRemoteImageViewPlaceholderIconDto atumVkuiRemoteImageViewPlaceholderIconDto = (AtumVkuiRemoteImageViewPlaceholderIconDto) obj;
            return this.type == atumVkuiRemoteImageViewPlaceholderIconDto.type && this.image == atumVkuiRemoteImageViewPlaceholderIconDto.image && this.tintColor == atumVkuiRemoteImageViewPlaceholderIconDto.tintColor && this.backgroundColor == atumVkuiRemoteImageViewPlaceholderIconDto.backgroundColor;
        }

        public final int hashCode() {
            int hashCode = (this.image.hashCode() + (this.type.hashCode() * 31)) * 31;
            AtumVkuiColorNameDto atumVkuiColorNameDto = this.tintColor;
            int hashCode2 = (hashCode + (atumVkuiColorNameDto == null ? 0 : atumVkuiColorNameDto.hashCode())) * 31;
            AtumVkuiColorNameDto atumVkuiColorNameDto2 = this.backgroundColor;
            return hashCode2 + (atumVkuiColorNameDto2 != null ? atumVkuiColorNameDto2.hashCode() : 0);
        }

        public final String toString() {
            return "AtumVkuiRemoteImageViewPlaceholderIconDto(type=" + this.type + ", image=" + this.image + ", tintColor=" + this.tintColor + ", backgroundColor=" + this.backgroundColor + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            this.image.writeToParcel(parcel, i);
            AtumVkuiColorNameDto atumVkuiColorNameDto = this.tintColor;
            if (atumVkuiColorNameDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                atumVkuiColorNameDto.writeToParcel(parcel, i);
            }
            AtumVkuiColorNameDto atumVkuiColorNameDto2 = this.backgroundColor;
            if (atumVkuiColorNameDto2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                atumVkuiColorNameDto2.writeToParcel(parcel, i);
            }
        }

        public AtumVkuiRemoteImageViewPlaceholderIconDto(TypeDto typeDto, AtumVkuiLocalImageDto atumVkuiLocalImageDto, AtumVkuiColorNameDto atumVkuiColorNameDto, AtumVkuiColorNameDto atumVkuiColorNameDto2) {
            super(null);
            this.type = typeDto;
            this.image = atumVkuiLocalImageDto;
            this.tintColor = atumVkuiColorNameDto;
            this.backgroundColor = atumVkuiColorNameDto2;
        }
    }

    /* compiled from: AtumVkuiRemoteImageViewPlaceholderDto.kt */
    /* loaded from: classes14.dex */
    public static final class AtumVkuiRemoteImageViewPlaceholderImageDto extends AtumVkuiRemoteImageViewPlaceholderDto implements Parcelable {
        public static final Parcelable.Creator<AtumVkuiRemoteImageViewPlaceholderImageDto> CREATOR = new a();

        @pmi0("image")
        private final AtumVkuiLocalImageDto image;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AtumVkuiRemoteImageViewPlaceholderDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("image")
            public static final TypeDto IMAGE;
            private final String value;

            /* compiled from: AtumVkuiRemoteImageViewPlaceholderDto.kt */
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

        /* compiled from: AtumVkuiRemoteImageViewPlaceholderDto.kt */
        public static final class a implements Parcelable.Creator<AtumVkuiRemoteImageViewPlaceholderImageDto> {
            @Override // android.os.Parcelable.Creator
            public final AtumVkuiRemoteImageViewPlaceholderImageDto createFromParcel(Parcel parcel) {
                return new AtumVkuiRemoteImageViewPlaceholderImageDto(TypeDto.CREATOR.createFromParcel(parcel), AtumVkuiLocalImageDto.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final AtumVkuiRemoteImageViewPlaceholderImageDto[] newArray(int i) {
                return new AtumVkuiRemoteImageViewPlaceholderImageDto[i];
            }
        }

        public AtumVkuiRemoteImageViewPlaceholderImageDto(TypeDto typeDto, AtumVkuiLocalImageDto atumVkuiLocalImageDto) {
            super(null);
            this.type = typeDto;
            this.image = atumVkuiLocalImageDto;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AtumVkuiRemoteImageViewPlaceholderImageDto)) {
                return false;
            }
            AtumVkuiRemoteImageViewPlaceholderImageDto atumVkuiRemoteImageViewPlaceholderImageDto = (AtumVkuiRemoteImageViewPlaceholderImageDto) obj;
            return this.type == atumVkuiRemoteImageViewPlaceholderImageDto.type && this.image == atumVkuiRemoteImageViewPlaceholderImageDto.image;
        }

        public final int hashCode() {
            return this.image.hashCode() + (this.type.hashCode() * 31);
        }

        public final String toString() {
            return "AtumVkuiRemoteImageViewPlaceholderImageDto(type=" + this.type + ", image=" + this.image + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            this.image.writeToParcel(parcel, i);
        }
    }

    /* compiled from: AtumVkuiRemoteImageViewPlaceholderDto.kt */
    public static final class Deserializer implements a9y<AtumVkuiRemoteImageViewPlaceholderDto> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            String f = up.f(b9yVar, "type");
            if (f != null) {
                int hashCode = f.hashCode();
                if (hashCode != 3226745) {
                    if (hashCode != 94842723) {
                        if (hashCode == 100313435 && f.equals("image")) {
                            return (AtumVkuiRemoteImageViewPlaceholderDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AtumVkuiRemoteImageViewPlaceholderImageDto.class);
                        }
                    } else if (f.equals("color")) {
                        return (AtumVkuiRemoteImageViewPlaceholderDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AtumVkuiRemoteImageViewPlaceholderColorDto.class);
                    }
                } else if (f.equals("icon")) {
                    return (AtumVkuiRemoteImageViewPlaceholderDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AtumVkuiRemoteImageViewPlaceholderIconDto.class);
                }
            }
            throw new IllegalStateException(go9.b("no mapping for the type:", f));
        }
    }

    public /* synthetic */ AtumVkuiRemoteImageViewPlaceholderDto(zcl zclVar) {
        this();
    }

    private AtumVkuiRemoteImageViewPlaceholderDto() {
    }
}
