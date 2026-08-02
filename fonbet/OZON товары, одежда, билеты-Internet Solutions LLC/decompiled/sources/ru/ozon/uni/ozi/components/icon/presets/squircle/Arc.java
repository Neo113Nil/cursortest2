package ru.ozon.uni.ozi.components.icon.presets.squircle;

import B4.V;
import Pk0.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, d2 = {"Lru/ozon/uni/ozi/components/icon/presets/squircle/Arc;", "", "", "radius", "arcStartAngle", "arcSweepAngle", "<init>", "(FFF)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getRadius", "()F", "getArcStartAngle", "getArcSweepAngle", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class Arc {
    private final float arcStartAngle;
    private final float arcSweepAngle;
    private final float radius;

    public Arc(float f7, float f11, float f12) {
        this.radius = f7;
        this.arcStartAngle = f11;
        this.arcSweepAngle = f12;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Arc)) {
            return false;
        }
        Arc arc = (Arc) other;
        return Float.compare(this.radius, arc.radius) == 0 && Float.compare(this.arcStartAngle, arc.arcStartAngle) == 0 && Float.compare(this.arcSweepAngle, arc.arcSweepAngle) == 0;
    }

    public final float getArcStartAngle() {
        return this.arcStartAngle;
    }

    public final float getArcSweepAngle() {
        return this.arcSweepAngle;
    }

    public final float getRadius() {
        return this.radius;
    }

    public int hashCode() {
        return Float.hashCode(this.arcSweepAngle) + b.a(this.arcStartAngle, Float.hashCode(this.radius) * 31, 31);
    }

    @NotNull
    public String toString() {
        float f7 = this.radius;
        float f11 = this.arcStartAngle;
        float f12 = this.arcSweepAngle;
        StringBuilder sb2 = new StringBuilder("Arc(radius=");
        sb2.append(f7);
        sb2.append(", arcStartAngle=");
        sb2.append(f11);
        sb2.append(", arcSweepAngle=");
        return V.b(f12, ")", sb2);
    }
}
