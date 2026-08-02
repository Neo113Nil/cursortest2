package ru.ozon.uni.ozi.components.icon.presets.squircle;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/uni/ozi/components/icon/presets/squircle/PointRelativeToVertex;", "", "", "distanceToFurthestSide", "distanceToClosestSide", "<init>", "(FF)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getDistanceToFurthestSide", "()F", "getDistanceToClosestSide", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PointRelativeToVertex {
    private final float distanceToClosestSide;
    private final float distanceToFurthestSide;

    public PointRelativeToVertex(float f7, float f11) {
        this.distanceToFurthestSide = f7;
        this.distanceToClosestSide = f11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PointRelativeToVertex)) {
            return false;
        }
        PointRelativeToVertex pointRelativeToVertex = (PointRelativeToVertex) other;
        return Float.compare(this.distanceToFurthestSide, pointRelativeToVertex.distanceToFurthestSide) == 0 && Float.compare(this.distanceToClosestSide, pointRelativeToVertex.distanceToClosestSide) == 0;
    }

    public final float getDistanceToClosestSide() {
        return this.distanceToClosestSide;
    }

    public final float getDistanceToFurthestSide() {
        return this.distanceToFurthestSide;
    }

    public int hashCode() {
        return Float.hashCode(this.distanceToClosestSide) + (Float.hashCode(this.distanceToFurthestSide) * 31);
    }

    @NotNull
    public String toString() {
        return "PointRelativeToVertex(distanceToFurthestSide=" + this.distanceToFurthestSide + ", distanceToClosestSide=" + this.distanceToClosestSide + ")";
    }
}
