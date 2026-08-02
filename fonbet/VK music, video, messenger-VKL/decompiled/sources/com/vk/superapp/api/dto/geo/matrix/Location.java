package com.vk.superapp.api.dto.geo.matrix;

import com.ironsource.O6;
import xsna.pmi0;
import xsna.xq;

/* compiled from: Location.kt */
/* loaded from: classes6.dex */
public final class Location {

    @pmi0(O6.s)
    private final float latitude;

    @pmi0("lon")
    private final float longitude;

    public Location(float f, float f2) {
        this.latitude = f;
        this.longitude = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Location)) {
            return false;
        }
        Location location = (Location) obj;
        return Float.compare(this.latitude, location.latitude) == 0 && Float.compare(this.longitude, location.longitude) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.longitude) + (Float.hashCode(this.latitude) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Location(latitude=");
        sb.append(this.latitude);
        sb.append(", longitude=");
        return xq.c(')', this.longitude, sb);
    }
}
