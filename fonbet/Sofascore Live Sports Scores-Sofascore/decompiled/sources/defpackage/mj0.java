package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class mj0 extends sj0 {
    public final d7e a;
    public final gq5 b;

    public mj0(d7e d7eVar, gq5 gq5Var) {
        this.a = d7eVar;
        this.b = gq5Var;
    }

    @Override // defpackage.sj0
    public final d7e a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mj0)) {
            return false;
        }
        mj0 mj0Var = (mj0) obj;
        return Intrinsics.c(this.a, mj0Var.a) && this.b.equals(mj0Var.b);
    }

    public final int hashCode() {
        d7e d7eVar = this.a;
        return this.b.hashCode() + ((d7eVar == null ? 0 : d7eVar.hashCode()) * 31);
    }

    public final String toString() {
        return "Error(painter=" + this.a + ", result=" + this.b + ')';
    }
}
