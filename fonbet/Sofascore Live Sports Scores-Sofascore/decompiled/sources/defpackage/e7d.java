package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class e7d {
    public final Object a;
    public final Object b;
    public final Map c;
    public final tc3 d;

    public e7d(Object obj, Object obj2, Map map, tc3 tc3Var) {
        this.a = obj;
        this.b = obj2;
        this.c = map;
        this.d = tc3Var;
    }

    public final void a(int i, of3 of3Var) {
        int i2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(295512821);
        if ((i & 6) == 0) {
            i2 = (av8Var.g(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (av8Var.T(i2 & 1, (i2 & 3) != 2)) {
            this.d.invoke(this.a, av8Var, 0);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new n61(this, i, 9);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e7d.class != obj.getClass()) {
            return false;
        }
        e7d e7dVar = (e7d) obj;
        return Intrinsics.c(this.a, e7dVar.a) && Intrinsics.c(this.b, e7dVar.b) && Intrinsics.c(this.c, e7dVar.c) && this.d == e7dVar.d;
    }

    public final int hashCode() {
        return (this.d.hashCode() * 31) + (this.c.hashCode() * 31) + (this.b.hashCode() * 31) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "NavEntry(key=" + this.a + ", contentKey=" + this.b + ", metadata=" + this.c + ", content=" + this.d + ')';
    }

    public e7d(e7d e7dVar, tc3 tc3Var) {
        this(e7dVar.a, e7dVar.b, e7dVar.c, tc3Var);
    }
}
