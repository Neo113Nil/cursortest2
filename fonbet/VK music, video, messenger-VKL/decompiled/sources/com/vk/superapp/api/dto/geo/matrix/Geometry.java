package com.vk.superapp.api.dto.geo.matrix;

import com.ironsource.Y3;
import java.util.List;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: Geometry.kt */
/* loaded from: classes6.dex */
public final class Geometry {

    @pmi0(Y3.f)
    private final List<List<Double>> coordinates;

    @pmi0("type")
    private final String type;

    /* JADX WARN: Multi-variable type inference failed */
    public Geometry(List<? extends List<Double>> list, String str) {
        this.coordinates = list;
        this.type = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Geometry)) {
            return false;
        }
        Geometry geometry = (Geometry) obj;
        return epx.f(this.coordinates, geometry.coordinates) && epx.f(this.type, geometry.type);
    }

    public final int hashCode() {
        return this.type.hashCode() + (this.coordinates.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Geometry(coordinates=");
        sb.append(this.coordinates);
        sb.append(", type=");
        return ho8.a(sb, this.type, ')');
    }
}
