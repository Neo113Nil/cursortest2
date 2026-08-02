package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class lj0 implements rj0 {
    public final d7e a;
    public final fq5 b;

    public lj0(d7e d7eVar, fq5 fq5Var) {
        this.a = d7eVar;
        this.b = fq5Var;
    }

    @Override // defpackage.rj0
    public final d7e a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lj0)) {
            return false;
        }
        lj0 lj0Var = (lj0) obj;
        return Intrinsics.c(this.a, lj0Var.a) && this.b.equals(lj0Var.b);
    }

    public final int hashCode() {
        d7e d7eVar = this.a;
        return this.b.hashCode() + ((d7eVar == null ? 0 : d7eVar.hashCode()) * 31);
    }

    public final String toString() {
        return "Error(painter=" + this.a + ", result=" + this.b + ")";
    }
}
