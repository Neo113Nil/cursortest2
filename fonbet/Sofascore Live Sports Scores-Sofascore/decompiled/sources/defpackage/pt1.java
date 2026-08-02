package defpackage;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
/* loaded from: classes5.dex */
public final class pt1 implements Serializable, zi5 {

    @NotNull
    public static final ot1 Companion = new ot1();
    public final int a;
    public final int b;
    public final double c;
    public boolean d;

    public /* synthetic */ pt1(int i, int i2, int i3, double d, boolean z) {
        if (7 != (i & 7)) {
            oea.z(i, 7, nt1.a.getDescriptor());
            throw null;
        }
        this.a = i2;
        this.b = i3;
        this.c = d;
        if ((i & 8) == 0) {
            this.d = false;
        } else {
            this.d = z;
        }
    }

    @Override // defpackage.zi5
    public final void d() {
        this.d = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pt1)) {
            return false;
        }
        pt1 pt1Var = (pt1) obj;
        return this.a == pt1Var.a && this.b == pt1Var.b && Double.compare(this.c, pt1Var.c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.c) + wv8.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder s = lnb.s(this.a, this.b, "BatsmanTotalRow(score=", ", wickets=", ", overs=");
        s.append(this.c);
        s.append(")");
        return s.toString();
    }

    public pt1(int i, int i2, double d) {
        this.a = i;
        this.b = i2;
        this.c = d;
    }
}
