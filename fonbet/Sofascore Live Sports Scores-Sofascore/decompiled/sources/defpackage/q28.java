package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class q28 {
    public final boolean a;
    public final boolean b;
    public final int c;
    public final boolean d;
    public final r9k e;
    public final uk4 f;

    public q28(boolean z, boolean z2, int i, boolean z3, r9k r9kVar, uk4 uk4Var) {
        this.a = z;
        this.b = z2;
        this.c = i;
        this.d = z3;
        this.e = r9kVar;
        this.f = uk4Var;
    }

    public static q28 a(q28 q28Var, boolean z, boolean z2, int i, boolean z3, r9k r9kVar, uk4 uk4Var, int i2) {
        if ((i2 & 1) != 0) {
            z = q28Var.a;
        }
        boolean z4 = z;
        if ((i2 & 2) != 0) {
            z2 = q28Var.b;
        }
        boolean z5 = z2;
        if ((i2 & 4) != 0) {
            i = q28Var.c;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            z3 = q28Var.d;
        }
        boolean z6 = z3;
        if ((i2 & 16) != 0) {
            r9kVar = q28Var.e;
        }
        r9k r9kVar2 = r9kVar;
        if ((i2 & 32) != 0) {
            uk4Var = q28Var.f;
        }
        q28Var.getClass();
        return new q28(z4, z5, i3, z6, r9kVar2, uk4Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q28)) {
            return false;
        }
        q28 q28Var = (q28) obj;
        return this.a == q28Var.a && this.b == q28Var.b && this.c == q28Var.c && this.d == q28Var.d && Intrinsics.c(this.e, q28Var.e) && this.f.equals(q28Var.f);
    }

    public final int hashCode() {
        int e = dmi.e(wv8.a(this.c, dmi.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31), 31, this.d);
        r9k r9kVar = this.e;
        return this.f.hashCode() + ((e + (r9kVar == null ? 0 : r9kVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder k = w1l.k("FilterBarUIModel(filterEnabled=", this.a, ", filterActive=", this.b, ", badgeCount=");
        k.append(this.c);
        k.append(", liveActive=");
        k.append(this.d);
        k.append(", liveCount=");
        k.append(this.e);
        k.append(", dateUiState=");
        k.append(this.f);
        k.append(")");
        return k.toString();
    }
}
