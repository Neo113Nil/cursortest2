package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class o0 {
    public final r9k a;
    public final r9k b;
    public final int c;
    public final int d;
    public final boolean e;

    public o0(int i, int i2, r9k r9kVar, r9k r9kVar2, boolean z) {
        r9kVar.getClass();
        this.a = r9kVar;
        this.b = r9kVar2;
        this.c = i;
        this.d = i2;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return Intrinsics.c(this.a, o0Var.a) && Intrinsics.c(this.b, o0Var.b) && this.c == o0Var.c && this.d == o0Var.d && this.e == o0Var.e;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        r9k r9kVar = this.b;
        return Boolean.hashCode(this.e) + wv8.a(this.d, wv8.a(this.c, (hashCode + (r9kVar == null ? 0 : r9kVar.hashCode())) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AbsenceDisplayData(statusText=");
        sb.append(this.a);
        sb.append(", extraText=");
        sb.append(this.b);
        sb.append(", iconResId=");
        me4.q(sb, this.c, ", tintColorResId=", this.d, ", shouldTintIcon=");
        return wt3.p(sb, this.e, ")");
    }
}
