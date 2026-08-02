package defpackage;

import java.security.MessageDigest;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class qd4 implements pia {
    public final pia b;
    public final pia c;

    public qd4(pia piaVar, pia piaVar2) {
        this.b = piaVar;
        this.c = piaVar2;
    }

    @Override // defpackage.pia
    public final void b(MessageDigest messageDigest) {
        this.b.b(messageDigest);
        this.c.b(messageDigest);
    }

    @Override // defpackage.pia
    public final boolean equals(Object obj) {
        if (!(obj instanceof qd4)) {
            return false;
        }
        qd4 qd4Var = (qd4) obj;
        return this.b.equals(qd4Var.b) && this.c.equals(qd4Var.c);
    }

    @Override // defpackage.pia
    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "DataCacheKey{sourceKey=" + this.b + ", signature=" + this.c + '}';
    }
}
