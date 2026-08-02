package com.vk.api.generated.superAppShowcase.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.superApp.dto.SuperAppUniversalWidgetImageBlockDto;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: SuperAppShowcaseHalfTileUniversalIconDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppShowcaseHalfTileUniversalIconDto implements Parcelable {
    public static final Parcelable.Creator<SuperAppShowcaseHalfTileUniversalIconDto> CREATOR = new a();

    @pmi0("icon")
    private final SuperAppUniversalWidgetImageBlockDto icon;

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SuperAppShowcaseHalfTileUniversalIconDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("universal_icon")
        public static final TypeDto UNIVERSAL_ICON;
        private final String value;

        /* compiled from: SuperAppShowcaseHalfTileUniversalIconDto.kt */
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
            TypeDto typeDto = new TypeDto("UNIVERSAL_ICON", 0, "universal_icon");
            UNIVERSAL_ICON = typeDto;
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

    /* compiled from: SuperAppShowcaseHalfTileUniversalIconDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppShowcaseHalfTileUniversalIconDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppShowcaseHalfTileUniversalIconDto createFromParcel(Parcel parcel) {
            return new SuperAppShowcaseHalfTileUniversalIconDto(TypeDto.CREATOR.createFromParcel(parcel), (SuperAppUniversalWidgetImageBlockDto) parcel.readParcelable(SuperAppShowcaseHalfTileUniversalIconDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppShowcaseHalfTileUniversalIconDto[] newArray(int i) {
            return new SuperAppShowcaseHalfTileUniversalIconDto[i];
        }
    }

    public SuperAppShowcaseHalfTileUniversalIconDto(TypeDto typeDto, SuperAppUniversalWidgetImageBlockDto superAppUniversalWidgetImageBlockDto) {
        this.type = typeDto;
        this.icon = superAppUniversalWidgetImageBlockDto;
    }

    public final SuperAppUniversalWidgetImageBlockDto d() {
        return this.icon;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperAppShowcaseHalfTileUniversalIconDto)) {
            return false;
        }
        SuperAppShowcaseHalfTileUniversalIconDto superAppShowcaseHalfTileUniversalIconDto = (SuperAppShowcaseHalfTileUniversalIconDto) obj;
        return this.type == superAppShowcaseHalfTileUniversalIconDto.type && epx.f(this.icon, superAppShowcaseHalfTileUniversalIconDto.icon);
    }

    public final int hashCode() {
        return this.icon.hashCode() + (this.type.hashCode() * 31);
    }

    public final String toString() {
        return "SuperAppShowcaseHalfTileUniversalIconDto(type=" + this.type + ", icon=" + this.icon + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        parcel.writeParcelable(this.icon, i);
    }
}
