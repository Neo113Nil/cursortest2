package defpackage;

import java.security.MessageDigest;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class ko5 implements pia {
    public final Object b;
    public final int c;
    public final int d;
    public final Class e;
    public final Class f;
    public final pia g;
    public final pf2 h;
    public final uvd i;
    public int j;

    public ko5(Object obj, pia piaVar, int i, int i2, pf2 pf2Var, Class cls, Class cls2, uvd uvdVar) {
        w1a.m(obj, "Argument must not be null");
        this.b = obj;
        this.g = piaVar;
        this.c = i;
        this.d = i2;
        this.h = pf2Var;
        this.e = cls;
        w1a.m(cls2, "Transcode class must not be null");
        this.f = cls2;
        this.i = uvdVar;
    }

    @Override // defpackage.pia
    public final void b(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.pia
    public final boolean equals(Object obj) {
        if (!(obj instanceof ko5)) {
            return false;
        }
        ko5 ko5Var = (ko5) obj;
        return this.b.equals(ko5Var.b) && this.g.equals(ko5Var.g) && this.d == ko5Var.d && this.c == ko5Var.c && this.h.equals(ko5Var.h) && this.e.equals(ko5Var.e) && this.f.equals(ko5Var.f) && this.i.equals(ko5Var.i);
    }

    @Override // defpackage.pia
    public final int hashCode() {
        int i = this.j;
        if (i != 0) {
            return i;
        }
        int hashCode = this.b.hashCode();
        this.j = hashCode;
        int hashCode2 = ((((this.g.hashCode() + (hashCode * 31)) * 31) + this.c) * 31) + this.d;
        this.j = hashCode2;
        int hashCode3 = this.h.hashCode() + (hashCode2 * 31);
        this.j = hashCode3;
        int hashCode4 = this.e.hashCode() + (hashCode3 * 31);
        this.j = hashCode4;
        int hashCode5 = this.f.hashCode() + (hashCode4 * 31);
        this.j = hashCode5;
        int hashCode6 = this.i.b.hashCode() + (hashCode5 * 31);
        this.j = hashCode6;
        return hashCode6;
    }

    public final String toString() {
        return "EngineKey{model=" + this.b + ", width=" + this.c + ", height=" + this.d + ", resourceClass=" + this.e + ", transcodeClass=" + this.f + ", signature=" + this.g + ", hashCode=" + this.j + ", transformations=" + this.h + ", options=" + this.i + '}';
    }
}
