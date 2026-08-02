package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class e0a implements g0a {
    public final gv9 a;
    public final gv9 b;
    public final gv9 c;
    public final boolean d;

    public e0a(gv9 gv9Var, gv9 gv9Var2, gv9 gv9Var3, boolean z) {
        gv9Var.getClass();
        gv9Var2.getClass();
        gv9Var3.getClass();
        this.a = gv9Var;
        this.b = gv9Var2;
        this.c = gv9Var3;
        this.d = z;
    }

    public static e0a b(e0a e0aVar, gv9 gv9Var, gv9 gv9Var2, boolean z, int i) {
        gv9 gv9Var3 = e0aVar.b;
        if ((i & 4) != 0) {
            gv9Var2 = e0aVar.c;
        }
        if ((i & 8) != 0) {
            z = e0aVar.d;
        }
        gv9Var.getClass();
        gv9Var3.getClass();
        gv9Var2.getClass();
        return new e0a(gv9Var, gv9Var3, gv9Var2, z);
    }

    @Override // defpackage.g0a
    public final gv9 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0a)) {
            return false;
        }
        e0a e0aVar = (e0a) obj;
        return Intrinsics.c(this.a, e0aVar.a) && Intrinsics.c(this.b, e0aVar.b) && Intrinsics.c(this.c, e0aVar.c) && this.d == e0aVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + dmi.e(ljg.d(ljg.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder l = wv8.l("PostMatchInput(reorderableIncidents=", this.a, ", submittedIncidents=", this.b, ", reorderableIncidentsWithError=");
        l.append(this.c);
        l.append(", isSubmitEnabled=");
        l.append(this.d);
        l.append(", isLoading=false)");
        return l.toString();
    }
}
