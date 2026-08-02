package com.vk.api.generated.atum.dto;

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

/* compiled from: AtumVkuiAnyImageDto.kt */
/* loaded from: classes.dex */
public abstract class AtumVkuiAnyImageDto implements Parcelable {

    /* compiled from: AtumVkuiAnyImageDto.kt */
    /* loaded from: classes14.dex */
    public static final class AtumVkuiLocalImageObjDto extends AtumVkuiAnyImageDto implements Parcelable {
        public static final Parcelable.Creator<AtumVkuiLocalImageObjDto> CREATOR = new a();

        @pmi0("name")
        private final AtumVkuiLocalImageDto name;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AtumVkuiAnyImageDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("local")
            public static final TypeDto LOCAL;
            private final String value;

            /* compiled from: AtumVkuiAnyImageDto.kt */
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
                TypeDto typeDto = new TypeDto("LOCAL", 0, "local");
                LOCAL = typeDto;
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

        /* compiled from: AtumVkuiAnyImageDto.kt */
        public static final class a implements Parcelable.Creator<AtumVkuiLocalImageObjDto> {
            @Override // android.os.Parcelable.Creator
            public final AtumVkuiLocalImageObjDto createFromParcel(Parcel parcel) {
                return new AtumVkuiLocalImageObjDto(TypeDto.CREATOR.createFromParcel(parcel), AtumVkuiLocalImageDto.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final AtumVkuiLocalImageObjDto[] newArray(int i) {
                return new AtumVkuiLocalImageObjDto[i];
            }
        }

        public AtumVkuiLocalImageObjDto(TypeDto typeDto, AtumVkuiLocalImageDto atumVkuiLocalImageDto) {
            super(null);
            this.type = typeDto;
            this.name = atumVkuiLocalImageDto;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AtumVkuiLocalImageObjDto)) {
                return false;
            }
            AtumVkuiLocalImageObjDto atumVkuiLocalImageObjDto = (AtumVkuiLocalImageObjDto) obj;
            return this.type == atumVkuiLocalImageObjDto.type && this.name == atumVkuiLocalImageObjDto.name;
        }

        public final int hashCode() {
            return this.name.hashCode() + (this.type.hashCode() * 31);
        }

        public final String toString() {
            return "AtumVkuiLocalImageObjDto(type=" + this.type + ", name=" + this.name + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            this.name.writeToParcel(parcel, i);
        }
    }

    /* compiled from: AtumVkuiAnyImageDto.kt */
    /* loaded from: classes14.dex */
    public static final class AtumVkuiRemoteImageDto extends AtumVkuiAnyImageDto implements Parcelable {
        public static final Parcelable.Creator<AtumVkuiRemoteImageDto> CREATOR = new a();

        @pmi0("type")
        private final TypeDto type;

        @pmi0("url")
        private final String url;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AtumVkuiAnyImageDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("remote")
            public static final TypeDto REMOTE;
            private final String value;

            /* compiled from: AtumVkuiAnyImageDto.kt */
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

        /* compiled from: AtumVkuiAnyImageDto.kt */
        public static final class a implements Parcelable.Creator<AtumVkuiRemoteImageDto> {
            @Override // android.os.Parcelable.Creator
            public final AtumVkuiRemoteImageDto createFromParcel(Parcel parcel) {
                return new AtumVkuiRemoteImageDto(TypeDto.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final AtumVkuiRemoteImageDto[] newArray(int i) {
                return new AtumVkuiRemoteImageDto[i];
            }
        }

        public AtumVkuiRemoteImageDto(TypeDto typeDto, String str) {
            super(null);
            this.type = typeDto;
            this.url = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AtumVkuiRemoteImageDto)) {
                return false;
            }
            AtumVkuiRemoteImageDto atumVkuiRemoteImageDto = (AtumVkuiRemoteImageDto) obj;
            return this.type == atumVkuiRemoteImageDto.type && epx.f(this.url, atumVkuiRemoteImageDto.url);
        }

        public final int hashCode() {
            return this.url.hashCode() + (this.type.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AtumVkuiRemoteImageDto(type=");
            sb.append(this.type);
            sb.append(", url=");
            return ho8.a(sb, this.url, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeString(this.url);
        }
    }

    /* compiled from: AtumVkuiAnyImageDto.kt */
    public static final class Deserializer implements a9y<AtumVkuiAnyImageDto> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            String f = up.f(b9yVar, "type");
            if (epx.f(f, "remote")) {
                return (AtumVkuiAnyImageDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AtumVkuiRemoteImageDto.class);
            }
            if (epx.f(f, "local")) {
                return (AtumVkuiAnyImageDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AtumVkuiLocalImageObjDto.class);
            }
            throw new IllegalStateException(go9.b("no mapping for the type:", f));
        }
    }

    public /* synthetic */ AtumVkuiAnyImageDto(zcl zclVar) {
        this();
    }

    private AtumVkuiAnyImageDto() {
    }
}
