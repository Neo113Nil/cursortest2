package com.vk.sdk.api.base.dto;

import com.ironsource.Y3;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: BaseGeoDto.kt */
/* loaded from: classes5.dex */
public final class BaseGeoDto {

    @pmi0(Y3.f)
    private final BaseGeoCoordinatesDto coordinates;

    @pmi0("place")
    private final BasePlaceDto place;

    @pmi0("showmap")
    private final Integer showmap;

    @pmi0("type")
    private final String type;

    public BaseGeoDto() {
        this(null, null, null, null, 15, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseGeoDto)) {
            return false;
        }
        BaseGeoDto baseGeoDto = (BaseGeoDto) obj;
        return epx.f(this.coordinates, baseGeoDto.coordinates) && epx.f(this.place, baseGeoDto.place) && epx.f(this.showmap, baseGeoDto.showmap) && epx.f(this.type, baseGeoDto.type);
    }

    public final int hashCode() {
        BaseGeoCoordinatesDto baseGeoCoordinatesDto = this.coordinates;
        int hashCode = (baseGeoCoordinatesDto == null ? 0 : baseGeoCoordinatesDto.hashCode()) * 31;
        BasePlaceDto basePlaceDto = this.place;
        int hashCode2 = (hashCode + (basePlaceDto == null ? 0 : basePlaceDto.hashCode())) * 31;
        Integer num = this.showmap;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.type;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "BaseGeoDto(coordinates=" + this.coordinates + ", place=" + this.place + ", showmap=" + this.showmap + ", type=" + this.type + ")";
    }

    public BaseGeoDto(BaseGeoCoordinatesDto baseGeoCoordinatesDto, BasePlaceDto basePlaceDto, Integer num, String str) {
        this.coordinates = baseGeoCoordinatesDto;
        this.place = basePlaceDto;
        this.showmap = num;
        this.type = str;
    }

    public /* synthetic */ BaseGeoDto(BaseGeoCoordinatesDto baseGeoCoordinatesDto, BasePlaceDto basePlaceDto, Integer num, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : baseGeoCoordinatesDto, (i & 2) != 0 ? null : basePlaceDto, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str);
    }
}
