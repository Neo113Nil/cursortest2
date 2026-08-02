package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class sh implements w8l {
    public final w8l a;
    public final u3e b;

    public sh(w8l w8lVar, u3e u3eVar) {
        this.a = w8lVar;
        this.b = u3eVar;
    }

    @Override // defpackage.w8l
    public final int a(kx4 kx4Var) {
        return this.b.a(kx4Var) + this.a.a(kx4Var);
    }

    @Override // defpackage.w8l
    public final int b(kx4 kx4Var, ema emaVar) {
        return this.b.b(kx4Var, emaVar) + this.a.b(kx4Var, emaVar);
    }

    @Override // defpackage.w8l
    public final int c(kx4 kx4Var) {
        return this.b.c(kx4Var) + this.a.c(kx4Var);
    }

    @Override // defpackage.w8l
    public final int d(kx4 kx4Var, ema emaVar) {
        return this.b.d(kx4Var, emaVar) + this.a.d(kx4Var, emaVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sh)) {
            return false;
        }
        sh shVar = (sh) obj;
        return Intrinsics.c(shVar.a, this.a) && shVar.b.equals(this.b);
    }

    public final int hashCode() {
        return (this.b.a.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "(" + this.a + " + " + this.b + ')';
    }
}
