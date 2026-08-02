package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class q0 extends r0 {

    /* renamed from: c, reason: collision with root package name */
    public static final q0 f5550c = new q0(v.f5603c, v.f5602b);

    /* renamed from: a, reason: collision with root package name */
    public final w f5551a;

    /* renamed from: b, reason: collision with root package name */
    public final w f5552b;

    public q0(w wVar, w wVar2) {
        this.f5551a = wVar;
        this.f5552b = wVar2;
        if (wVar.a(wVar2) > 0 || wVar == v.f5602b || wVar2 == v.f5603c) {
            StringBuilder sb2 = new StringBuilder(16);
            wVar.b(sb2);
            sb2.append("..");
            wVar2.c(sb2);
            throw new IllegalArgumentException("Invalid range: ".concat(sb2.toString()));
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return this.f5551a.equals(q0Var.f5551a) && this.f5552b.equals(q0Var.f5552b);
    }

    public final int hashCode() {
        return this.f5552b.hashCode() + (this.f5551a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(16);
        this.f5551a.b(sb2);
        sb2.append("..");
        this.f5552b.c(sb2);
        return sb2.toString();
    }
}
