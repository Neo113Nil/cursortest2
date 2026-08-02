package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class jak implements w8l {
    public final w8l a;
    public final w8l b;

    public jak(w8l w8lVar, w8l w8lVar2) {
        this.a = w8lVar;
        this.b = w8lVar2;
    }

    @Override // defpackage.w8l
    public final int a(kx4 kx4Var) {
        return Math.max(this.a.a(kx4Var), this.b.a(kx4Var));
    }

    @Override // defpackage.w8l
    public final int b(kx4 kx4Var, ema emaVar) {
        return Math.max(this.a.b(kx4Var, emaVar), this.b.b(kx4Var, emaVar));
    }

    @Override // defpackage.w8l
    public final int c(kx4 kx4Var) {
        return Math.max(this.a.c(kx4Var), this.b.c(kx4Var));
    }

    @Override // defpackage.w8l
    public final int d(kx4 kx4Var, ema emaVar) {
        return Math.max(this.a.d(kx4Var, emaVar), this.b.d(kx4Var, emaVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jak)) {
            return false;
        }
        jak jakVar = (jak) obj;
        return Intrinsics.c(jakVar.a, this.a) && Intrinsics.c(jakVar.b, this.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "(" + this.a + " ∪ " + this.b + ')';
    }
}
