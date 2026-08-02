package defpackage;

import com.sofascore.model.mvvm.model.Point2D;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class el8 {
    public final Point2D a;
    public final Point2D b;
    public final Point2D c;

    public el8(Point2D point2D, Point2D point2D2) {
        Point2D copy$default = Point2D.copy$default(point2D2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3, null);
        copy$default.getClass();
        this.a = point2D;
        this.b = point2D2;
        this.c = copy$default;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof el8)) {
            return false;
        }
        el8 el8Var = (el8) obj;
        return this.a.equals(el8Var.a) && this.b.equals(el8Var.b) && this.c.equals(el8Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TrajectoryState(originPoint=" + this.a + ", endPoint=" + this.b + ", animatedPoint=" + this.c + ")";
    }
}
