package com.vk.sdk.api.wall.dto;

import com.ironsource.Y3;
import xsna.asp;
import xsna.epx;
import xsna.jq;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: WallGeoDto.kt */
/* loaded from: classes5.dex */
public final class WallGeoDto {

    @pmi0(Y3.f)
    private final String coordinates;

    @pmi0("showmap")
    private final Integer showmap;

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WallGeoDto.kt */
    public static final class TypeDto {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @pmi0("place")
        public static final TypeDto PLACE;

        @pmi0("point")
        public static final TypeDto POINT;
        private final String value;

        static {
            TypeDto typeDto = new TypeDto("PLACE", 0, "place");
            PLACE = typeDto;
            TypeDto typeDto2 = new TypeDto("POINT", 1, "point");
            POINT = typeDto2;
            TypeDto[] typeDtoArr = {typeDto, typeDto2};
            $VALUES = typeDtoArr;
            $ENTRIES = new asp(typeDtoArr);
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
    }

    public WallGeoDto() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallGeoDto)) {
            return false;
        }
        WallGeoDto wallGeoDto = (WallGeoDto) obj;
        return epx.f(this.coordinates, wallGeoDto.coordinates) && epx.f(this.showmap, wallGeoDto.showmap) && this.type == wallGeoDto.type;
    }

    public final int hashCode() {
        String str = this.coordinates;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.showmap;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        TypeDto typeDto = this.type;
        return hashCode2 + (typeDto != null ? typeDto.hashCode() : 0);
    }

    public final String toString() {
        String str = this.coordinates;
        Integer num = this.showmap;
        TypeDto typeDto = this.type;
        StringBuilder d = jq.d(num, "WallGeoDto(coordinates=", str, ", showmap=", ", type=");
        d.append(typeDto);
        d.append(")");
        return d.toString();
    }

    public WallGeoDto(String str, Integer num, TypeDto typeDto) {
        this.coordinates = str;
        this.showmap = num;
        this.type = typeDto;
    }

    public /* synthetic */ WallGeoDto(String str, Integer num, TypeDto typeDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : typeDto);
    }
}
