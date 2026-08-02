package com.vk.superapp.api.dto.geo.directions;

import com.vk.superapp.api.dto.geo.common.Language;
import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.ms9;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;

/* compiled from: Trip.kt */
/* loaded from: classes6.dex */
public final class Trip {

    @pmi0("language")
    private final Language language;

    @pmi0("legs")
    private final List<Leg> legs;

    @pmi0("locations")
    private final List<Location> locations;

    @pmi0("status")
    private final int status;

    @pmi0("status_message")
    private final String statusMessage;

    @pmi0("summary")
    private final Summary summary;

    @pmi0("units")
    private final Units units;

    public Trip(Language language, int i, String str, Units units, Summary summary, List<Location> list, List<Leg> list2) {
        this.language = language;
        this.status = i;
        this.statusMessage = str;
        this.units = units;
        this.summary = summary;
        this.locations = list;
        this.legs = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Trip)) {
            return false;
        }
        Trip trip = (Trip) obj;
        return this.language == trip.language && this.status == trip.status && epx.f(this.statusMessage, trip.statusMessage) && this.units == trip.units && epx.f(this.summary, trip.summary) && epx.f(this.locations, trip.locations) && epx.f(this.legs, trip.legs);
    }

    public final int hashCode() {
        return this.legs.hashCode() + fw3.a((this.summary.hashCode() + ((this.units.hashCode() + urd0.a(shy.a(this.status, this.language.hashCode() * 31, 31), 31, this.statusMessage)) * 31)) * 31, 31, this.locations);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Trip(language=");
        sb.append(this.language);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", statusMessage=");
        sb.append(this.statusMessage);
        sb.append(", units=");
        sb.append(this.units);
        sb.append(", summary=");
        sb.append(this.summary);
        sb.append(", locations=");
        sb.append(this.locations);
        sb.append(", legs=");
        return ms9.a(')', sb, this.legs);
    }
}
