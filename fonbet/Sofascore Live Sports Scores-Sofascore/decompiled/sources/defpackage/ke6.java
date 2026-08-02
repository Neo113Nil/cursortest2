package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ke6 implements w8l {
    public final w8l a;
    public final w8l b;

    public ke6(w8l w8lVar, w8l w8lVar2) {
        this.a = w8lVar;
        this.b = w8lVar2;
    }

    @Override // defpackage.w8l
    public final int a(kx4 kx4Var) {
        int a = this.a.a(kx4Var) - this.b.a(kx4Var);
        if (a < 0) {
            return 0;
        }
        return a;
    }

    @Override // defpackage.w8l
    public final int b(kx4 kx4Var, ema emaVar) {
        int b = this.a.b(kx4Var, emaVar) - this.b.b(kx4Var, emaVar);
        if (b < 0) {
            return 0;
        }
        return b;
    }

    @Override // defpackage.w8l
    public final int c(kx4 kx4Var) {
        int c = this.a.c(kx4Var) - this.b.c(kx4Var);
        if (c < 0) {
            return 0;
        }
        return c;
    }

    @Override // defpackage.w8l
    public final int d(kx4 kx4Var, ema emaVar) {
        int d = this.a.d(kx4Var, emaVar) - this.b.d(kx4Var, emaVar);
        if (d < 0) {
            return 0;
        }
        return d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ke6)) {
            return false;
        }
        ke6 ke6Var = (ke6) obj;
        return Intrinsics.c(ke6Var.a, this.a) && Intrinsics.c(ke6Var.b, this.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "(" + this.a + " - " + this.b + ')';
    }
}
