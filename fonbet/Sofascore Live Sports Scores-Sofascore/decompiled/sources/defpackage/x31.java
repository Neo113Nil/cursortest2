package defpackage;

import com.sofascore.model.mvvm.model.Point2D;
import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class x31 {
    public final int a;
    public final String b;
    public final boolean c;
    public final Point2D d;
    public Point2D e;

    public x31(int i, String str, boolean z, Point2D point2D) {
        str.getClass();
        this.a = i;
        this.b = str;
        this.c = z;
        this.d = point2D;
        this.e = Point2D.copy$default(point2D, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x31)) {
            return false;
        }
        x31 x31Var = (x31) obj;
        return this.a == x31Var.a && Intrinsics.c(this.b, x31Var.b) && this.c == x31Var.c && this.d.equals(x31Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + dmi.e(dmi.c(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder t = dmi.t(this.a, "ShotDataWrapper(id=", ", shotType=", this.b, ", isOwnGoal=");
        t.append(this.c);
        t.append(", point=");
        t.append(this.d);
        t.append(")");
        return t.toString();
    }
}
