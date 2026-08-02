package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class f38 implements h38 {
    public final boolean a;
    public final int b;
    public final int c;
    public final scj d;
    public final scj e;
    public final Boolean f;

    public f38(boolean z, int i, int i2, scj scjVar, scj scjVar2, Boolean bool) {
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = scjVar;
        this.e = scjVar2;
        this.f = bool;
    }

    public static f38 a(f38 f38Var, boolean z, int i, int i2, Boolean bool, int i3) {
        if ((i3 & 1) != 0) {
            z = f38Var.a;
        }
        boolean z2 = z;
        if ((i3 & 2) != 0) {
            i = f38Var.b;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            i2 = f38Var.c;
        }
        int i5 = i2;
        scj scjVar = f38Var.d;
        scj scjVar2 = f38Var.e;
        if ((i3 & 32) != 0) {
            bool = f38Var.f;
        }
        return new f38(z2, i4, i5, scjVar, scjVar2, bool);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f38) {
            f38 f38Var = (f38) obj;
            if (this.a == f38Var.a && this.b == f38Var.b && this.c == f38Var.c && this.d == f38Var.d && this.e == f38Var.e && Intrinsics.c(this.f, f38Var.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + ((this.d.hashCode() + wv8.a(this.c, wv8.a(this.b, Boolean.hashCode(this.a) * 31, 31), 31)) * 31)) * 31;
        Boolean bool = this.f;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        return "Input(isToEndMatch=" + this.a + ", displayHomeScore=" + this.b + ", displayAwayScore=" + this.c + ", selectedHomeScore=" + this.d + ", selectedAwayScore=" + this.e + ", isExpanded=" + this.f + ")";
    }
}
