package defpackage;

import com.sofascore.model.mvvm.model.Point2D;
import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class bl8 {
    public final Point2D a;
    public final Point2D b;
    public final Point2D c;
    public final Point2D d;
    public final Point2D e;

    public bl8(Point2D point2D, Point2D point2D2, Point2D point2D3) {
        Point2D copy$default = Point2D.copy$default(point2D2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3, null);
        Point2D copy$default2 = Point2D.copy$default(point2D3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3, null);
        point2D2.getClass();
        point2D3.getClass();
        copy$default.getClass();
        copy$default2.getClass();
        this.a = point2D;
        this.b = point2D2;
        this.c = point2D3;
        this.d = copy$default;
        this.e = copy$default2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bl8)) {
            return false;
        }
        bl8 bl8Var = (bl8) obj;
        return this.a.equals(bl8Var.a) && Intrinsics.c(this.b, bl8Var.b) && Intrinsics.c(this.c, bl8Var.c) && this.d.equals(bl8Var.d) && this.e.equals(bl8Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "BlockLineState(blockPoint=" + this.a + ", firstEdgePoint=" + this.b + ", secondEdgePoint=" + this.c + ", animatedFirstEdgePoint=" + this.d + ", animatedSecondEdgePoint=" + this.e + ")";
    }
}
