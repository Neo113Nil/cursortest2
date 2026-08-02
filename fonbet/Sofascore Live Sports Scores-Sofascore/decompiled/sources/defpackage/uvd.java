package defpackage;

import java.security.MessageDigest;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class uvd implements pia {
    public final pf2 b = new pf2(0);

    @Override // defpackage.pia
    public final void b(MessageDigest messageDigest) {
        int i = 0;
        while (true) {
            pf2 pf2Var = this.b;
            if (i >= pf2Var.c) {
                return;
            }
            ivd ivdVar = (ivd) pf2Var.g(i);
            Object k = this.b.k(i);
            hvd hvdVar = ivdVar.b;
            if (ivdVar.d == null) {
                ivdVar.d = ivdVar.c.getBytes(pia.a);
            }
            hvdVar.g(ivdVar.d, k, messageDigest);
            i++;
        }
    }

    public final Object c(ivd ivdVar) {
        pf2 pf2Var = this.b;
        return pf2Var.containsKey(ivdVar) ? pf2Var.get(ivdVar) : ivdVar.a;
    }

    @Override // defpackage.pia
    public final boolean equals(Object obj) {
        if (obj instanceof uvd) {
            return this.b.equals(((uvd) obj).b);
        }
        return false;
    }

    @Override // defpackage.pia
    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.b + '}';
    }
}
