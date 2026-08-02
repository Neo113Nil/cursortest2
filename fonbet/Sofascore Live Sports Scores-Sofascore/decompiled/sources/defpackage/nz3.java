package defpackage;

import com.sofascore.model.mvvm.model.Point2D;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class nz3 {
    public final boolean a;
    public final Point2D b;

    public nz3(boolean z, Point2D point2D) {
        this.a = z;
        this.b = point2D;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nz3)) {
            return false;
        }
        nz3 nz3Var = (nz3) obj;
        return this.a == nz3Var.a && this.b.equals(nz3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "CricketBowlerGraphBallData(wicketHit=" + this.a + ", pitchHitPoint=" + this.b + ")";
    }
}
