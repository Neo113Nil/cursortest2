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

/* compiled from: AtumVkuiButtonAccessoryDto.kt */
/* loaded from: classes.dex */
public abstract class AtumVkuiButtonAccessoryDto implements Parcelable {

    /* compiled from: AtumVkuiButtonAccessoryDto.kt */
    /* loaded from: classes14.dex */
    public static final class AtumVkuiAvatarDto extends AtumVkuiButtonAccessoryDto implements Parcelable {
        public static final Parcelable.Creator<AtumVkuiAvatarDto> CREATOR = new a();

        @pmi0("props")
        private final AtumVkuiAvatarPropsDto props;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AtumVkuiButtonAccessoryDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;

            @pmi0("avatar")
            public static final TypeDto AVATAR;
            public static final Parcelable.Creator<TypeDto> CREATOR;
            private final String value;

            /* compiled from: AtumVkuiButtonAccessoryDto.kt */
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
                TypeDto typeDto = new TypeDto("AVATAR", 0, "avatar");
                AVATAR = typeDto;
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

        /* compiled from: AtumVkuiButtonAccessoryDto.kt */
        public static final class a implements Parcelable.Creator<AtumVkuiAvatarDto> {
            @Override // android.os.Parcelable.Creator
            public final AtumVkuiAvatarDto createFromParcel(Parcel parcel) {
                return new AtumVkuiAvatarDto(TypeDto.CREATOR.createFromParcel(parcel), AtumVkuiAvatarPropsDto.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final AtumVkuiAvatarDto[] newArray(int i) {
                return new AtumVkuiAvatarDto[i];
            }
        }

        public AtumVkuiAvatarDto(TypeDto typeDto, AtumVkuiAvatarPropsDto atumVkuiAvatarPropsDto) {
            super(null);
            this.type = typeDto;
            this.props = atumVkuiAvatarPropsDto;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AtumVkuiAvatarDto)) {
                return false;
            }
            AtumVkuiAvatarDto atumVkuiAvatarDto = (AtumVkuiAvatarDto) obj;
            return this.type == atumVkuiAvatarDto.type && epx.f(this.props, atumVkuiAvatarDto.props);
        }

        public final int hashCode() {
            return this.props.hashCode() + (this.type.hashCode() * 31);
        }

        public final String toString() {
            return "AtumVkuiAvatarDto(type=" + this.type + ", props=" + this.props + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            this.props.writeToParcel(parcel, i);
        }
    }

    /* compiled from: AtumVkuiButtonAccessoryDto.kt */
    /* loaded from: classes14.dex */
    public static final class AtumVkuiButtonAccessoryIconDto extends AtumVkuiButtonAccessoryDto implements Parcelable {
        public static final Parcelable.Creator<AtumVkuiButtonAccessoryIconDto> CREATOR = new a();

        @pmi0("image")
        private final AtumVkuiLocalImageDto image;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AtumVkuiButtonAccessoryDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("icon")
            public static final TypeDto ICON;
            private final String value;

            /* compiled from: AtumVkuiButtonAccessoryDto.kt */
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

        /* compiled from: AtumVkuiButtonAccessoryDto.kt */
        public static final class a implements Parcelable.Creator<AtumVkuiButtonAccessoryIconDto> {
            @Override // android.os.Parcelable.Creator
            public final AtumVkuiButtonAccessoryIconDto createFromParcel(Parcel parcel) {
                return new AtumVkuiButtonAccessoryIconDto(TypeDto.CREATOR.createFromParcel(parcel), AtumVkuiLocalImageDto.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final AtumVkuiButtonAccessoryIconDto[] newArray(int i) {
                return new AtumVkuiButtonAccessoryIconDto[i];
            }
        }

        public AtumVkuiButtonAccessoryIconDto(TypeDto typeDto, AtumVkuiLocalImageDto atumVkuiLocalImageDto) {
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
            if (!(obj instanceof AtumVkuiButtonAccessoryIconDto)) {
                return false;
            }
            AtumVkuiButtonAccessoryIconDto atumVkuiButtonAccessoryIconDto = (AtumVkuiButtonAccessoryIconDto) obj;
            return this.type == atumVkuiButtonAccessoryIconDto.type && this.image == atumVkuiButtonAccessoryIconDto.image;
        }

        public final int hashCode() {
            return this.image.hashCode() + (this.type.hashCode() * 31);
        }

        public final String toString() {
            return "AtumVkuiButtonAccessoryIconDto(type=" + this.type + ", image=" + this.image + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            this.image.writeToParcel(parcel, i);
        }
    }

    /* compiled from: AtumVkuiButtonAccessoryDto.kt */
    /* loaded from: classes14.dex */
    public static final class AtumVkuiPictureDto extends AtumVkuiButtonAccessoryDto implements Parcelable {
        public static final Parcelable.Creator<AtumVkuiPictureDto> CREATOR = new a();

        @pmi0("props")
        private final AtumVkuiPicturePropsDto props;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AtumVkuiButtonAccessoryDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("picture")
            public static final TypeDto PICTURE;
            private final String value;

            /* compiled from: AtumVkuiButtonAccessoryDto.kt */
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

        /* compiled from: AtumVkuiButtonAccessoryDto.kt */
        public static final class a implements Parcelable.Creator<AtumVkuiPictureDto> {
            @Override // android.os.Parcelable.Creator
            public final AtumVkuiPictureDto createFromParcel(Parcel parcel) {
                return new AtumVkuiPictureDto(TypeDto.CREATOR.createFromParcel(parcel), AtumVkuiPicturePropsDto.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final AtumVkuiPictureDto[] newArray(int i) {
                return new AtumVkuiPictureDto[i];
            }
        }

        public AtumVkuiPictureDto(TypeDto typeDto, AtumVkuiPicturePropsDto atumVkuiPicturePropsDto) {
            super(null);
            this.type = typeDto;
            this.props = atumVkuiPicturePropsDto;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AtumVkuiPictureDto)) {
                return false;
            }
            AtumVkuiPictureDto atumVkuiPictureDto = (AtumVkuiPictureDto) obj;
            return this.type == atumVkuiPictureDto.type && epx.f(this.props, atumVkuiPictureDto.props);
        }

        public final int hashCode() {
            return this.props.hashCode() + (this.type.hashCode() * 31);
        }

        public final String toString() {
            return "AtumVkuiPictureDto(type=" + this.type + ", props=" + this.props + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            this.props.writeToParcel(parcel, i);
        }
    }

    /* compiled from: AtumVkuiButtonAccessoryDto.kt */
    public static final class Deserializer implements a9y<AtumVkuiButtonAccessoryDto> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            String f = up.f(b9yVar, "type");
            if (f != null) {
                int hashCode = f.hashCode();
                if (hashCode != -1405959847) {
                    if (hashCode != -577741570) {
                        if (hashCode == 3226745 && f.equals("icon")) {
                            return (AtumVkuiButtonAccessoryDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AtumVkuiButtonAccessoryIconDto.class);
                        }
                    } else if (f.equals("picture")) {
                        return (AtumVkuiButtonAccessoryDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AtumVkuiPictureDto.class);
                    }
                } else if (f.equals("avatar")) {
                    return (AtumVkuiButtonAccessoryDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AtumVkuiAvatarDto.class);
                }
            }
            throw new IllegalStateException(go9.b("no mapping for the type:", f));
        }
    }

    public /* synthetic */ AtumVkuiButtonAccessoryDto(zcl zclVar) {
        this();
    }

    private AtumVkuiButtonAccessoryDto() {
    }
}
