package com.vk.superapp.api.dto.geo.directions;

import xsna.epx;
import xsna.pmi0;

/* compiled from: DirectionsResponse.kt */
/* loaded from: classes6.dex */
public final class DirectionsResponse {

    @pmi0("id")
    private final String routeIdentifier;

    @pmi0("trip")
    private final Trip trip;

    public DirectionsResponse(String str, Trip trip) {
        this.routeIdentifier = str;
        this.trip = trip;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DirectionsResponse)) {
            return false;
        }
        DirectionsResponse directionsResponse = (DirectionsResponse) obj;
        return epx.f(this.routeIdentifier, directionsResponse.routeIdentifier) && epx.f(this.trip, directionsResponse.trip);
    }

    public final int hashCode() {
        return this.trip.hashCode() + (this.routeIdentifier.hashCode() * 31);
    }

    public final String toString() {
        return "DirectionsResponse(routeIdentifier=" + this.routeIdentifier + ", trip=" + this.trip + ')';
    }
}
