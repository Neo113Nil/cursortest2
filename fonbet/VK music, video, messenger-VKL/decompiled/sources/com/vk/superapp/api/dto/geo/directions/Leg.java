package com.vk.superapp.api.dto.geo.directions;

import java.util.List;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: Leg.kt */
/* loaded from: classes6.dex */
public final class Leg {

    @pmi0("maneuvers")
    private final List<Maneuver> maneuvers;

    @pmi0("shape")
    private final String shape;

    @pmi0("summary")
    private final Summary summary;

    public Leg(Summary summary, String str, List<Maneuver> list) {
        this.summary = summary;
        this.shape = str;
        this.maneuvers = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Leg)) {
            return false;
        }
        Leg leg = (Leg) obj;
        return epx.f(this.summary, leg.summary) && epx.f(this.shape, leg.shape) && epx.f(this.maneuvers, leg.maneuvers);
    }

    public final int hashCode() {
        return this.maneuvers.hashCode() + urd0.a(this.summary.hashCode() * 31, 31, this.shape);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Leg(summary=");
        sb.append(this.summary);
        sb.append(", shape=");
        sb.append(this.shape);
        sb.append(", maneuvers=");
        return ms9.a(')', sb, this.maneuvers);
    }
}
