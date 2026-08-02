package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class u3e implements w8l {
    public final p3e a;

    public u3e(p3e p3eVar) {
        this.a = p3eVar;
    }

    @Override // defpackage.w8l
    public final int a(kx4 kx4Var) {
        return kx4Var.e0(this.a.d());
    }

    @Override // defpackage.w8l
    public final int b(kx4 kx4Var, ema emaVar) {
        return kx4Var.e0(this.a.c(emaVar));
    }

    @Override // defpackage.w8l
    public final int c(kx4 kx4Var) {
        return kx4Var.e0(this.a.a());
    }

    @Override // defpackage.w8l
    public final int d(kx4 kx4Var, ema emaVar) {
        return kx4Var.e0(this.a.b(emaVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u3e) {
            return Intrinsics.c(((u3e) obj).a, this.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        ema emaVar = ema.a;
        p3e p3eVar = this.a;
        return "PaddingValues(" + ((Object) p75.c(p3eVar.b(emaVar))) + ", " + ((Object) p75.c(p3eVar.d())) + ", " + ((Object) p75.c(p3eVar.c(emaVar))) + ", " + ((Object) p75.c(p3eVar.a())) + ')';
    }
}
