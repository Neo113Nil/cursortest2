package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.Y3;
import xsna.asp;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: WallGeoDto.kt */
/* loaded from: classes15.dex */
public final class WallGeoDto implements Parcelable {
    public static final Parcelable.Creator<WallGeoDto> CREATOR = new a();

    @pmi0(Y3.f)
    private final String coordinates;

    @pmi0("place")
    private final WallPlaceOneOfDto place;

    @pmi0("showmap")
    private final Integer showmap;

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WallGeoDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("place")
        public static final TypeDto PLACE;

        @pmi0("point")
        public static final TypeDto POINT;
        private final String value;

        /* compiled from: WallGeoDto.kt */
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
            TypeDto typeDto = new TypeDto("PLACE", 0, "place");
            PLACE = typeDto;
            TypeDto typeDto2 = new TypeDto("POINT", 1, "point");
            POINT = typeDto2;
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

    /* compiled from: WallGeoDto.kt */
    public static final class a implements Parcelable.Creator<WallGeoDto> {
        @Override // android.os.Parcelable.Creator
        public final WallGeoDto createFromParcel(Parcel parcel) {
            return new WallGeoDto(parcel.readString(), (WallPlaceOneOfDto) parcel.readParcelable(WallGeoDto.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? TypeDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final WallGeoDto[] newArray(int i) {
            return new WallGeoDto[i];
        }
    }

    public WallGeoDto() {
        this(null, null, null, null, 15, null);
    }

    public final String d() {
        return this.coordinates;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final WallPlaceOneOfDto e() {
        return this.place;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallGeoDto)) {
            return false;
        }
        WallGeoDto wallGeoDto = (WallGeoDto) obj;
        return epx.f(this.coordinates, wallGeoDto.coordinates) && epx.f(this.place, wallGeoDto.place) && epx.f(this.showmap, wallGeoDto.showmap) && this.type == wallGeoDto.type;
    }

    public final Integer f() {
        return this.showmap;
    }

    public final TypeDto g() {
        return this.type;
    }

    public final int hashCode() {
        String str = this.coordinates;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        WallPlaceOneOfDto wallPlaceOneOfDto = this.place;
        int hashCode2 = (hashCode + (wallPlaceOneOfDto == null ? 0 : wallPlaceOneOfDto.hashCode())) * 31;
        Integer num = this.showmap;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        TypeDto typeDto = this.type;
        return hashCode3 + (typeDto != null ? typeDto.hashCode() : 0);
    }

    public final String toString() {
        return "WallGeoDto(coordinates=" + this.coordinates + ", place=" + this.place + ", showmap=" + this.showmap + ", type=" + this.type + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.coordinates);
        parcel.writeParcelable(this.place, i);
        Integer num = this.showmap;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        TypeDto typeDto = this.type;
        if (typeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            typeDto.writeToParcel(parcel, i);
        }
    }

    public WallGeoDto(String str, WallPlaceOneOfDto wallPlaceOneOfDto, Integer num, TypeDto typeDto) {
        this.coordinates = str;
        this.place = wallPlaceOneOfDto;
        this.showmap = num;
        this.type = typeDto;
    }

    public /* synthetic */ WallGeoDto(String str, WallPlaceOneOfDto wallPlaceOneOfDto, Integer num, TypeDto typeDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : wallPlaceOneOfDto, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : typeDto);
    }
}
