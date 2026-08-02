package com.vk.sdk.api.base.dto;

import xsna.pmi0;

/* compiled from: BaseGeoCoordinatesDto.kt */
/* loaded from: classes5.dex */
public final class BaseGeoCoordinatesDto {

    @pmi0("latitude")
    private final float latitude;

    @pmi0("longitude")
    private final float longitude;

    public BaseGeoCoordinatesDto(float f, float f2) {
        this.latitude = f;
        this.longitude = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseGeoCoordinatesDto)) {
            return false;
        }
        BaseGeoCoordinatesDto baseGeoCoordinatesDto = (BaseGeoCoordinatesDto) obj;
        return Float.compare(this.latitude, baseGeoCoordinatesDto.latitude) == 0 && Float.compare(this.longitude, baseGeoCoordinatesDto.longitude) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.longitude) + (Float.hashCode(this.latitude) * 31);
    }

    public final String toString() {
        return "BaseGeoCoordinatesDto(latitude=" + this.latitude + ", longitude=" + this.longitude + ")";
    }
}
