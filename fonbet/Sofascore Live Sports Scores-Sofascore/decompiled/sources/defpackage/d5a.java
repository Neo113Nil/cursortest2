package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class d5a implements p3e {
    public final w8l a;
    public final kx4 b;

    public d5a(w8l w8lVar, kx4 kx4Var) {
        this.a = w8lVar;
        this.b = kx4Var;
    }

    @Override // defpackage.p3e
    public final float a() {
        w8l w8lVar = this.a;
        kx4 kx4Var = this.b;
        return kx4Var.C0(w8lVar.c(kx4Var));
    }

    @Override // defpackage.p3e
    public final float b(ema emaVar) {
        w8l w8lVar = this.a;
        kx4 kx4Var = this.b;
        return kx4Var.C0(w8lVar.d(kx4Var, emaVar));
    }

    @Override // defpackage.p3e
    public final float c(ema emaVar) {
        w8l w8lVar = this.a;
        kx4 kx4Var = this.b;
        return kx4Var.C0(w8lVar.b(kx4Var, emaVar));
    }

    @Override // defpackage.p3e
    public final float d() {
        w8l w8lVar = this.a;
        kx4 kx4Var = this.b;
        return kx4Var.C0(w8lVar.a(kx4Var));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d5a)) {
            return false;
        }
        d5a d5aVar = (d5a) obj;
        return Intrinsics.c(this.a, d5aVar.a) && Intrinsics.c(this.b, d5aVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "InsetsPaddingValues(insets=" + this.a + ", density=" + this.b + ')';
    }
}
