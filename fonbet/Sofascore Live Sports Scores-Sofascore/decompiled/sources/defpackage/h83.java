package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class h83 implements l83 {
    public final tee a;
    public final gvh b;
    public final String c;
    public final boolean d;
    public final boolean e;

    public h83(tee teeVar, gvh gvhVar, String str, boolean z, boolean z2) {
        teeVar.getClass();
        str.getClass();
        this.a = teeVar;
        this.b = gvhVar;
        this.c = str;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h83)) {
            return false;
        }
        h83 h83Var = (h83) obj;
        return Intrinsics.c(this.a, h83Var.a) && this.b == h83Var.b && Intrinsics.c(this.c, h83Var.c) && this.d == h83Var.d && this.e == h83Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + dmi.e(dmi.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RatingRow(ratings=");
        sb.append(this.a);
        sb.append(", ratingType=");
        sb.append(this.b);
        sb.append(", sport=");
        dmi.w(sb, this.c, ", hasMixedRatingVersions=", this.d, ", hasAllTimeSeason=");
        return wt3.p(sb, this.e, ")");
    }
}
