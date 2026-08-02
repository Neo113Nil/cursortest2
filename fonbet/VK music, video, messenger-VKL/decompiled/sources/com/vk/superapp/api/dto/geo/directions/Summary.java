package com.vk.superapp.api.dto.geo.directions;

import io.reactivex.rxjava3.subjects.b;
import xsna.pmi0;
import xsna.xq;

/* compiled from: Summary.kt */
/* loaded from: classes6.dex */
public final class Summary {

    @pmi0("cost")
    private final float cost;

    @pmi0("length")
    private final float length;

    @pmi0("max_lat")
    private final float maximumLatitude;

    @pmi0("max_lon")
    private final float maximumLongitude;

    @pmi0("min_lat")
    private final float minimumLatitude;

    @pmi0("min_lon")
    private final float minimumLongitude;

    @pmi0("time")
    private final float time;

    public Summary(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.minimumLatitude = f;
        this.minimumLongitude = f2;
        this.maximumLatitude = f3;
        this.maximumLongitude = f4;
        this.time = f5;
        this.length = f6;
        this.cost = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Summary)) {
            return false;
        }
        Summary summary = (Summary) obj;
        return Float.compare(this.minimumLatitude, summary.minimumLatitude) == 0 && Float.compare(this.minimumLongitude, summary.minimumLongitude) == 0 && Float.compare(this.maximumLatitude, summary.maximumLatitude) == 0 && Float.compare(this.maximumLongitude, summary.maximumLongitude) == 0 && Float.compare(this.time, summary.time) == 0 && Float.compare(this.length, summary.length) == 0 && Float.compare(this.cost, summary.cost) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.cost) + b.a(this.length, b.a(this.time, b.a(this.maximumLongitude, b.a(this.maximumLatitude, b.a(this.minimumLongitude, Float.hashCode(this.minimumLatitude) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Summary(minimumLatitude=");
        sb.append(this.minimumLatitude);
        sb.append(", minimumLongitude=");
        sb.append(this.minimumLongitude);
        sb.append(", maximumLatitude=");
        sb.append(this.maximumLatitude);
        sb.append(", maximumLongitude=");
        sb.append(this.maximumLongitude);
        sb.append(", time=");
        sb.append(this.time);
        sb.append(", length=");
        sb.append(this.length);
        sb.append(", cost=");
        return xq.c(')', this.cost, sb);
    }
}
