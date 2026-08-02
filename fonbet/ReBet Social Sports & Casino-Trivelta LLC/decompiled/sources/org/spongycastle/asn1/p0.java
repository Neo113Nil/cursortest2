package org.spongycastle.asn1;

import java.util.Enumeration;

/* loaded from: classes5.dex */
public class p0 extends AbstractC5941t {

    /* renamed from: b, reason: collision with root package name */
    public int f62263b;

    public p0() {
        this.f62263b = -1;
    }

    private int q() {
        if (this.f62263b < 0) {
            Enumeration o10 = o();
            int i10 = 0;
            while (o10.hasMoreElements()) {
                i10 += ((InterfaceC5927e) o10.nextElement()).toASN1Primitive().j().f();
            }
            this.f62263b = i10;
        }
        return this.f62263b;
    }

    @Override // org.spongycastle.asn1.AbstractC5940s
    public void e(C5939q c5939q) {
        C5939q b10 = c5939q.b();
        int q10 = q();
        c5939q.c(48);
        c5939q.i(q10);
        Enumeration o10 = o();
        while (o10.hasMoreElements()) {
            b10.j((InterfaceC5927e) o10.nextElement());
        }
    }

    @Override // org.spongycastle.asn1.AbstractC5940s
    public int f() {
        int q10 = q();
        return z0.a(q10) + 1 + q10;
    }

    public p0(InterfaceC5927e interfaceC5927e) {
        super(interfaceC5927e);
        this.f62263b = -1;
    }

    public p0(C5928f c5928f) {
        super(c5928f);
        this.f62263b = -1;
    }
}
