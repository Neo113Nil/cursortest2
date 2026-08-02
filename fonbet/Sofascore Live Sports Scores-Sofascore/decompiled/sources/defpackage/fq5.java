package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class fq5 implements wt9 {
    public final nr9 a;
    public final nt9 b;
    public final Throwable c;

    public fq5(nr9 nr9Var, nt9 nt9Var, Throwable th) {
        this.a = nr9Var;
        this.b = nt9Var;
        this.c = th;
    }

    @Override // defpackage.wt9
    public final nt9 a() {
        return this.b;
    }

    @Override // defpackage.wt9
    public final nr9 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fq5)) {
            return false;
        }
        fq5 fq5Var = (fq5) obj;
        return Intrinsics.c(this.a, fq5Var.a) && Intrinsics.c(this.b, fq5Var.b) && this.c.equals(fq5Var.c);
    }

    public final int hashCode() {
        nr9 nr9Var = this.a;
        int hashCode = nr9Var == null ? 0 : nr9Var.hashCode();
        return this.c.hashCode() + ((this.b.hashCode() + (hashCode * 31)) * 31);
    }

    public final String toString() {
        return "ErrorResult(image=" + this.a + ", request=" + this.b + ", throwable=" + this.c + ")";
    }
}
