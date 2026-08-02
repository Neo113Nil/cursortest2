package org.spongycastle.asn1;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.asn1.ASN1Encoding;

/* loaded from: classes5.dex */
public class Q extends AbstractC5940s {

    /* renamed from: a, reason: collision with root package name */
    public C5936n f62236a;

    /* renamed from: b, reason: collision with root package name */
    public C5933k f62237b;

    /* renamed from: c, reason: collision with root package name */
    public AbstractC5940s f62238c;

    /* renamed from: d, reason: collision with root package name */
    public int f62239d;

    /* renamed from: e, reason: collision with root package name */
    public AbstractC5940s f62240e;

    public Q(C5928f c5928f) {
        int i10 = 0;
        AbstractC5940s k10 = k(c5928f, 0);
        if (k10 instanceof C5936n) {
            this.f62236a = (C5936n) k10;
            k10 = k(c5928f, 1);
            i10 = 1;
        }
        if (k10 instanceof C5933k) {
            this.f62237b = (C5933k) k10;
            i10++;
            k10 = k(c5928f, i10);
        }
        if (!(k10 instanceof AbstractC5947z)) {
            this.f62238c = k10;
            i10++;
            k10 = k(c5928f, i10);
        }
        if (c5928f.c() != i10 + 1) {
            throw new IllegalArgumentException("input vector too large");
        }
        if (!(k10 instanceof AbstractC5947z)) {
            throw new IllegalArgumentException("No tagged object found in vector. Structure doesn't seem to be of type External");
        }
        AbstractC5947z abstractC5947z = (AbstractC5947z) k10;
        l(abstractC5947z.n());
        this.f62240e = abstractC5947z.m();
    }

    @Override // org.spongycastle.asn1.AbstractC5940s
    public boolean c(AbstractC5940s abstractC5940s) {
        AbstractC5940s abstractC5940s2;
        C5933k c5933k;
        C5936n c5936n;
        if (!(abstractC5940s instanceof Q)) {
            return false;
        }
        if (this == abstractC5940s) {
            return true;
        }
        Q q10 = (Q) abstractC5940s;
        C5936n c5936n2 = this.f62236a;
        if (c5936n2 != null && ((c5936n = q10.f62236a) == null || !c5936n.equals(c5936n2))) {
            return false;
        }
        C5933k c5933k2 = this.f62237b;
        if (c5933k2 != null && ((c5933k = q10.f62237b) == null || !c5933k.equals(c5933k2))) {
            return false;
        }
        AbstractC5940s abstractC5940s3 = this.f62238c;
        if (abstractC5940s3 == null || ((abstractC5940s2 = q10.f62238c) != null && abstractC5940s2.equals(abstractC5940s3))) {
            return this.f62240e.equals(q10.f62240e);
        }
        return false;
    }

    @Override // org.spongycastle.asn1.AbstractC5940s
    public void e(C5939q c5939q) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C5936n c5936n = this.f62236a;
        if (c5936n != null) {
            byteArrayOutputStream.write(c5936n.b(ASN1Encoding.DER));
        }
        C5933k c5933k = this.f62237b;
        if (c5933k != null) {
            byteArrayOutputStream.write(c5933k.b(ASN1Encoding.DER));
        }
        AbstractC5940s abstractC5940s = this.f62238c;
        if (abstractC5940s != null) {
            byteArrayOutputStream.write(abstractC5940s.b(ASN1Encoding.DER));
        }
        byteArrayOutputStream.write(new i0(true, this.f62239d, this.f62240e).b(ASN1Encoding.DER));
        c5939q.f(32, 8, byteArrayOutputStream.toByteArray());
    }

    @Override // org.spongycastle.asn1.AbstractC5940s
    public int f() {
        return a().length;
    }

    @Override // org.spongycastle.asn1.AbstractC5940s
    public boolean h() {
        return true;
    }

    @Override // org.spongycastle.asn1.AbstractC5940s, org.spongycastle.asn1.AbstractC5935m
    public int hashCode() {
        C5936n c5936n = this.f62236a;
        int hashCode = c5936n != null ? c5936n.hashCode() : 0;
        C5933k c5933k = this.f62237b;
        if (c5933k != null) {
            hashCode ^= c5933k.hashCode();
        }
        AbstractC5940s abstractC5940s = this.f62238c;
        if (abstractC5940s != null) {
            hashCode ^= abstractC5940s.hashCode();
        }
        return hashCode ^ this.f62240e.hashCode();
    }

    public final AbstractC5940s k(C5928f c5928f, int i10) {
        if (c5928f.c() > i10) {
            return c5928f.b(i10).toASN1Primitive();
        }
        throw new IllegalArgumentException("too few objects in input vector");
    }

    public final void l(int i10) {
        if (i10 >= 0 && i10 <= 2) {
            this.f62239d = i10;
            return;
        }
        throw new IllegalArgumentException("invalid encoding value: " + i10);
    }
}
