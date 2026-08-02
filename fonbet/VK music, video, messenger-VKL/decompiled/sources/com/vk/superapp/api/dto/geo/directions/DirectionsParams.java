package com.vk.superapp.api.dto.geo.directions;

import java.util.Arrays;
import xsna.epx;
import xsna.pmi0;

/* compiled from: DirectionsParams.kt */
/* loaded from: classes6.dex */
public final class DirectionsParams {

    @pmi0("api_key")
    private final String apiKey;

    @pmi0("locations")
    private final Location[] locations;

    public DirectionsParams(String str, Location[] locationArr) {
        this.apiKey = str;
        this.locations = locationArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DirectionsParams)) {
            return false;
        }
        DirectionsParams directionsParams = (DirectionsParams) obj;
        return epx.f(this.apiKey, directionsParams.apiKey) && epx.f(this.locations, directionsParams.locations);
    }

    public final int hashCode() {
        String str = this.apiKey;
        return Arrays.hashCode(this.locations) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "DirectionsParams(apiKey=" + this.apiKey + ", locations=" + Arrays.toString(this.locations) + ')';
    }

    public DirectionsParams(Location[] locationArr) {
        this("", locationArr);
    }
}
