package com.vk.superapp.api.dto.geo.matrix;

import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: Feature.kt */
/* loaded from: classes6.dex */
public final class Feature {

    @pmi0("geometry")
    private final Geometry geometry;

    @pmi0("properties")
    private final Properties properties;

    @pmi0("type")
    private final String type;

    public Feature(Geometry geometry, Properties properties, String str) {
        this.geometry = geometry;
        this.properties = properties;
        this.type = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Feature)) {
            return false;
        }
        Feature feature = (Feature) obj;
        return epx.f(this.geometry, feature.geometry) && epx.f(this.properties, feature.properties) && epx.f(this.type, feature.type);
    }

    public final int hashCode() {
        return this.type.hashCode() + ((this.properties.hashCode() + (this.geometry.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Feature(geometry=");
        sb.append(this.geometry);
        sb.append(", properties=");
        sb.append(this.properties);
        sb.append(", type=");
        return ho8.a(sb, this.type, ')');
    }
}
