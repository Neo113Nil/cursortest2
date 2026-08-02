package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CatalogOnboardingInfoDto.kt */
/* loaded from: classes14.dex */
public final class CatalogOnboardingInfoDto implements Parcelable {
    public static final Parcelable.Creator<CatalogOnboardingInfoDto> CREATOR = new a();

    @pmi0("type")
    private final TypeDto type;

    @pmi0("url")
    private final String url;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CatalogOnboardingInfoDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @pmi0("CA1")
        public static final TypeDto CA1;

        @pmi0("CA2")
        public static final TypeDto CA2;

        @pmi0("CA3")
        public static final TypeDto CA3;

        @pmi0("CA4")
        public static final TypeDto CA4;
        public static final Parcelable.Creator<TypeDto> CREATOR;
        private final String value;

        /* compiled from: CatalogOnboardingInfoDto.kt */
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
            TypeDto typeDto = new TypeDto("CA1", 0, "CA1");
            CA1 = typeDto;
            TypeDto typeDto2 = new TypeDto("CA2", 1, "CA2");
            CA2 = typeDto2;
            TypeDto typeDto3 = new TypeDto("CA3", 2, "CA3");
            CA3 = typeDto3;
            TypeDto typeDto4 = new TypeDto("CA4", 3, "CA4");
            CA4 = typeDto4;
            TypeDto[] typeDtoArr = {typeDto, typeDto2, typeDto3, typeDto4};
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

        public final String i() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: CatalogOnboardingInfoDto.kt */
    public static final class a implements Parcelable.Creator<CatalogOnboardingInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogOnboardingInfoDto createFromParcel(Parcel parcel) {
            return new CatalogOnboardingInfoDto(parcel.readInt() == 0 ? null : TypeDto.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogOnboardingInfoDto[] newArray(int i) {
            return new CatalogOnboardingInfoDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CatalogOnboardingInfoDto() {
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
        if (!(obj instanceof CatalogOnboardingInfoDto)) {
            return false;
        }
        CatalogOnboardingInfoDto catalogOnboardingInfoDto = (CatalogOnboardingInfoDto) obj;
        return this.type == catalogOnboardingInfoDto.type && epx.f(this.url, catalogOnboardingInfoDto.url);
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
        StringBuilder sb = new StringBuilder("CatalogOnboardingInfoDto(type=");
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

    public CatalogOnboardingInfoDto(TypeDto typeDto, String str) {
        this.type = typeDto;
        this.url = str;
    }

    public /* synthetic */ CatalogOnboardingInfoDto(TypeDto typeDto, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : typeDto, (i & 2) != 0 ? null : str);
    }
}
