package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.time.AbstractDoubleTimeSource;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class g3 implements y53 {
    public final double a;
    public final AbstractDoubleTimeSource b;
    public final long c;

    public g3(double d, AbstractDoubleTimeSource abstractDoubleTimeSource, long j, DefaultConstructorMarker defaultConstructorMarker) {
        abstractDoubleTimeSource.getClass();
        this.a = d;
        this.b = abstractDoubleTimeSource;
        this.c = j;
    }

    @Override // defpackage.y53
    public final long H(y53 y53Var) {
        y53Var.getClass();
        if (y53Var instanceof g3) {
            g3 g3Var = (g3) y53Var;
            long j = g3Var.c;
            if (this.b.equals(g3Var.b)) {
                long j2 = this.c;
                if (xd5.d(j2, j) && xd5.g(j2)) {
                    xd5.b.getClass();
                    return 0L;
                }
                xd5.h(j2, j);
                wkn.Q(this.a - g3Var.a, null);
                throw null;
            }
        }
        yhk.m("Subtracting or comparing time marks from different time sources is not possible: ", this, " and ", y53Var);
        return 0L;
    }

    @Override // kotlin.time.TimeMark
    public final long a() {
        wkn.Q(this.b.b() - this.a, null);
        throw null;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ int compareTo(Object obj) {
        return t62.z(this, (y53) obj);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g3)) {
            return false;
        }
        if (!this.b.equals(((g3) obj).b)) {
            return false;
        }
        H((y53) obj);
        xd5.b.getClass();
        return xd5.d(0L, 0L);
    }

    public final int hashCode() {
        wkn.Q(this.a, null);
        throw null;
    }

    public final String toString() {
        throw null;
    }
}
