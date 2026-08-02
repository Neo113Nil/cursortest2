package defpackage;

import com.sofascore.model.mvvm.model.Point2D;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class cl8 {
    public final Point2D a;
    public final Point2D b;

    public cl8(Point2D point2D) {
        Point2D copy$default = Point2D.copy$default(point2D, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3, null);
        copy$default.getClass();
        this.a = point2D;
        this.b = copy$default;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cl8)) {
            return false;
        }
        cl8 cl8Var = (cl8) obj;
        return this.a.equals(cl8Var.a) && this.b.equals(cl8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SelectorState(targetPoint=" + this.a + ", animatedPoint=" + this.b + ")";
    }
}
