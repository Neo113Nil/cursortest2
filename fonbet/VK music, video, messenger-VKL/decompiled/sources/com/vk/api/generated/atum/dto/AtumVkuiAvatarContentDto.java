package com.vk.api.generated.atum.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.mbridge.msdk.foundation.entity.CampaignEx;
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

/* compiled from: AtumVkuiAvatarContentDto.kt */
/* loaded from: classes.dex */
public abstract class AtumVkuiAvatarContentDto implements Parcelable {

    /* compiled from: AtumVkuiAvatarContentDto.kt */
    /* loaded from: classes14.dex */
    public static final class AtumVkuiAvatarTypeIconDto extends AtumVkuiAvatarContentDto implements Parcelable {
        public static final Parcelable.Creator<AtumVkuiAvatarTypeIconDto> CREATOR = new a();

        @pmi0("background_color")
        private final AtumVkuiColorNameDto backgroundColor;

        @pmi0("icon")
        private final AtumVkuiLocalImageDto icon;

        @pmi0("sys_tint_color")
        private final AtumImageTintDto sysTintColor;

        @pmi0("tint_color")
        private final AtumVkuiColorNameDto tintColor;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AtumVkuiAvatarContentDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("icon")
            public static final TypeDto ICON;
            private final String value;

            /* compiled from: AtumVkuiAvatarContentDto.kt */
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

        /* compiled from: AtumVkuiAvatarContentDto.kt */
        public static final class a implements Parcelable.Creator<AtumVkuiAvatarTypeIconDto> {
            @Override // android.os.Parcelable.Creator
            public final AtumVkuiAvatarTypeIconDto createFromParcel(Parcel parcel) {
                return new AtumVkuiAvatarTypeIconDto(TypeDto.CREATOR.createFromParcel(parcel), AtumVkuiLocalImageDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AtumImageTintDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AtumVkuiColorNameDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AtumVkuiColorNameDto.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final AtumVkuiAvatarTypeIconDto[] newArray(int i) {
                return new AtumVkuiAvatarTypeIconDto[i];
            }
        }

        public /* synthetic */ AtumVkuiAvatarTypeIconDto(TypeDto typeDto, AtumVkuiLocalImageDto atumVkuiLocalImageDto, AtumImageTintDto atumImageTintDto, AtumVkuiColorNameDto atumVkuiColorNameDto, AtumVkuiColorNameDto atumVkuiColorNameDto2, int i, zcl zclVar) {
            this(typeDto, atumVkuiLocalImageDto, (i & 4) != 0 ? null : atumImageTintDto, (i & 8) != 0 ? null : atumVkuiColorNameDto, (i & 16) != 0 ? null : atumVkuiColorNameDto2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AtumVkuiAvatarTypeIconDto)) {
                return false;
            }
            AtumVkuiAvatarTypeIconDto atumVkuiAvatarTypeIconDto = (AtumVkuiAvatarTypeIconDto) obj;
            return this.type == atumVkuiAvatarTypeIconDto.type && this.icon == atumVkuiAvatarTypeIconDto.icon && this.sysTintColor == atumVkuiAvatarTypeIconDto.sysTintColor && this.tintColor == atumVkuiAvatarTypeIconDto.tintColor && this.backgroundColor == atumVkuiAvatarTypeIconDto.backgroundColor;
        }

        public final int hashCode() {
            int hashCode = (this.icon.hashCode() + (this.type.hashCode() * 31)) * 31;
            AtumImageTintDto atumImageTintDto = this.sysTintColor;
            int hashCode2 = (hashCode + (atumImageTintDto == null ? 0 : atumImageTintDto.hashCode())) * 31;
            AtumVkuiColorNameDto atumVkuiColorNameDto = this.tintColor;
            int hashCode3 = (hashCode2 + (atumVkuiColorNameDto == null ? 0 : atumVkuiColorNameDto.hashCode())) * 31;
            AtumVkuiColorNameDto atumVkuiColorNameDto2 = this.backgroundColor;
            return hashCode3 + (atumVkuiColorNameDto2 != null ? atumVkuiColorNameDto2.hashCode() : 0);
        }

        public final String toString() {
            return "AtumVkuiAvatarTypeIconDto(type=" + this.type + ", icon=" + this.icon + ", sysTintColor=" + this.sysTintColor + ", tintColor=" + this.tintColor + ", backgroundColor=" + this.backgroundColor + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            this.icon.writeToParcel(parcel, i);
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
            AtumVkuiColorNameDto atumVkuiColorNameDto2 = this.backgroundColor;
            if (atumVkuiColorNameDto2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                atumVkuiColorNameDto2.writeToParcel(parcel, i);
            }
        }

        public AtumVkuiAvatarTypeIconDto(TypeDto typeDto, AtumVkuiLocalImageDto atumVkuiLocalImageDto, AtumImageTintDto atumImageTintDto, AtumVkuiColorNameDto atumVkuiColorNameDto, AtumVkuiColorNameDto atumVkuiColorNameDto2) {
            super(null);
            this.type = typeDto;
            this.icon = atumVkuiLocalImageDto;
            this.sysTintColor = atumImageTintDto;
            this.tintColor = atumVkuiColorNameDto;
            this.backgroundColor = atumVkuiColorNameDto2;
        }
    }

    /* compiled from: AtumVkuiAvatarContentDto.kt */
    /* loaded from: classes14.dex */
    public static final class AtumVkuiAvatarTypeImageDto extends AtumVkuiAvatarContentDto implements Parcelable {
        public static final Parcelable.Creator<AtumVkuiAvatarTypeImageDto> CREATOR = new a();

        @pmi0("local_image")
        private final AtumVkuiLocalImageDto localImage;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AtumVkuiAvatarContentDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("image")
            public static final TypeDto IMAGE;
            private final String value;

            /* compiled from: AtumVkuiAvatarContentDto.kt */
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

        /* compiled from: AtumVkuiAvatarContentDto.kt */
        public static final class a implements Parcelable.Creator<AtumVkuiAvatarTypeImageDto> {
            @Override // android.os.Parcelable.Creator
            public final AtumVkuiAvatarTypeImageDto createFromParcel(Parcel parcel) {
                return new AtumVkuiAvatarTypeImageDto(TypeDto.CREATOR.createFromParcel(parcel), AtumVkuiLocalImageDto.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final AtumVkuiAvatarTypeImageDto[] newArray(int i) {
                return new AtumVkuiAvatarTypeImageDto[i];
            }
        }

        public AtumVkuiAvatarTypeImageDto(TypeDto typeDto, AtumVkuiLocalImageDto atumVkuiLocalImageDto) {
            super(null);
            this.type = typeDto;
            this.localImage = atumVkuiLocalImageDto;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AtumVkuiAvatarTypeImageDto)) {
                return false;
            }
            AtumVkuiAvatarTypeImageDto atumVkuiAvatarTypeImageDto = (AtumVkuiAvatarTypeImageDto) obj;
            return this.type == atumVkuiAvatarTypeImageDto.type && this.localImage == atumVkuiAvatarTypeImageDto.localImage;
        }

        public final int hashCode() {
            return this.localImage.hashCode() + (this.type.hashCode() * 31);
        }

        public final String toString() {
            return "AtumVkuiAvatarTypeImageDto(type=" + this.type + ", localImage=" + this.localImage + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            this.localImage.writeToParcel(parcel, i);
        }
    }

    /* compiled from: AtumVkuiAvatarContentDto.kt */
    /* loaded from: classes14.dex */
    public static final class AtumVkuiAvatarTypeRemoteDto extends AtumVkuiAvatarContentDto implements Parcelable {
        public static final Parcelable.Creator<AtumVkuiAvatarTypeRemoteDto> CREATOR = new a();

        @pmi0(CampaignEx.JSON_KEY_IMAGE_URL)
        private final String imageUrl;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AtumVkuiAvatarContentDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("remote")
            public static final TypeDto REMOTE;
            private final String value;

            /* compiled from: AtumVkuiAvatarContentDto.kt */
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
                TypeDto typeDto = new TypeDto("REMOTE", 0, "remote");
                REMOTE = typeDto;
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

        /* compiled from: AtumVkuiAvatarContentDto.kt */
        public static final class a implements Parcelable.Creator<AtumVkuiAvatarTypeRemoteDto> {
            @Override // android.os.Parcelable.Creator
            public final AtumVkuiAvatarTypeRemoteDto createFromParcel(Parcel parcel) {
                return new AtumVkuiAvatarTypeRemoteDto(TypeDto.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final AtumVkuiAvatarTypeRemoteDto[] newArray(int i) {
                return new AtumVkuiAvatarTypeRemoteDto[i];
            }
        }

        public AtumVkuiAvatarTypeRemoteDto(TypeDto typeDto, String str) {
            super(null);
            this.type = typeDto;
            this.imageUrl = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AtumVkuiAvatarTypeRemoteDto)) {
                return false;
            }
            AtumVkuiAvatarTypeRemoteDto atumVkuiAvatarTypeRemoteDto = (AtumVkuiAvatarTypeRemoteDto) obj;
            return this.type == atumVkuiAvatarTypeRemoteDto.type && epx.f(this.imageUrl, atumVkuiAvatarTypeRemoteDto.imageUrl);
        }

        public final int hashCode() {
            return this.imageUrl.hashCode() + (this.type.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AtumVkuiAvatarTypeRemoteDto(type=");
            sb.append(this.type);
            sb.append(", imageUrl=");
            return ho8.a(sb, this.imageUrl, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeString(this.imageUrl);
        }
    }

    /* compiled from: AtumVkuiAvatarContentDto.kt */
    public static final class Deserializer implements a9y<AtumVkuiAvatarContentDto> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            String f = up.f(b9yVar, "type");
            if (f != null) {
                int hashCode = f.hashCode();
                if (hashCode != -934610874) {
                    if (hashCode != 3226745) {
                        if (hashCode == 100313435 && f.equals("image")) {
                            return (AtumVkuiAvatarContentDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AtumVkuiAvatarTypeImageDto.class);
                        }
                    } else if (f.equals("icon")) {
                        return (AtumVkuiAvatarContentDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AtumVkuiAvatarTypeIconDto.class);
                    }
                } else if (f.equals("remote")) {
                    return (AtumVkuiAvatarContentDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AtumVkuiAvatarTypeRemoteDto.class);
                }
            }
            throw new IllegalStateException(go9.b("no mapping for the type:", f));
        }
    }

    public /* synthetic */ AtumVkuiAvatarContentDto(zcl zclVar) {
        this();
    }

    private AtumVkuiAvatarContentDto() {
    }
}
