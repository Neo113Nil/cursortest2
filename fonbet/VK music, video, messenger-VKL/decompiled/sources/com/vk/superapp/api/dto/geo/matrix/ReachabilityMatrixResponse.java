package com.vk.superapp.api.dto.geo.matrix;

import java.util.List;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: ReachabilityMatrixResponse.kt */
/* loaded from: classes6.dex */
public final class ReachabilityMatrixResponse {

    @pmi0("features")
    private final List<Feature> features;

    @pmi0("id")
    private final String id;

    @pmi0("type")
    private final String type;

    public ReachabilityMatrixResponse(List<Feature> list, String str, String str2) {
        this.features = list;
        this.id = str;
        this.type = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReachabilityMatrixResponse)) {
            return false;
        }
        ReachabilityMatrixResponse reachabilityMatrixResponse = (ReachabilityMatrixResponse) obj;
        return epx.f(this.features, reachabilityMatrixResponse.features) && epx.f(this.id, reachabilityMatrixResponse.id) && epx.f(this.type, reachabilityMatrixResponse.type);
    }

    public final int hashCode() {
        return this.type.hashCode() + urd0.a(this.features.hashCode() * 31, 31, this.id);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReachabilityMatrixResponse(features=");
        sb.append(this.features);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", type=");
        return ho8.a(sb, this.type, ')');
    }
}
