package com.vk.superapp.api.dto.geo.matrix;

import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: ReachabilityMatrixParams.kt */
/* loaded from: classes6.dex */
public final class ReachabilityMatrixParams {

    @pmi0("api_key")
    private final String apiKey;

    @pmi0("contours")
    private final List<Contour> contours;

    @pmi0("locations")
    private final List<Location> locations;

    public ReachabilityMatrixParams(String str, List<Location> list, List<Contour> list2) {
        this.apiKey = str;
        this.locations = list;
        this.contours = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReachabilityMatrixParams)) {
            return false;
        }
        ReachabilityMatrixParams reachabilityMatrixParams = (ReachabilityMatrixParams) obj;
        return epx.f(this.apiKey, reachabilityMatrixParams.apiKey) && epx.f(this.locations, reachabilityMatrixParams.locations) && epx.f(this.contours, reachabilityMatrixParams.contours);
    }

    public final int hashCode() {
        String str = this.apiKey;
        return this.contours.hashCode() + fw3.a((str == null ? 0 : str.hashCode()) * 31, 31, this.locations);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReachabilityMatrixParams(apiKey=");
        sb.append(this.apiKey);
        sb.append(", locations=");
        sb.append(this.locations);
        sb.append(", contours=");
        return ms9.a(')', sb, this.contours);
    }

    public ReachabilityMatrixParams(List<Location> list, List<Contour> list2) {
        this("", list, list2);
    }
}
