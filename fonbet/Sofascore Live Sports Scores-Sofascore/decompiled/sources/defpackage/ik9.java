package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ik9 {
    public final h5k a;
    public final Object b;

    public ik9(h5k h5kVar, Object obj) {
        h5kVar.getClass();
        obj.getClass();
        this.a = h5kVar;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ik9)) {
            return false;
        }
        ik9 ik9Var = (ik9) obj;
        return Intrinsics.c(this.a, ik9Var.a) && Intrinsics.c(this.b, ik9Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HttpResponseContainer(expectedType=");
        sb.append(this.a);
        sb.append(", response=");
        return lnb.p(sb, this.b, ')');
    }
}
