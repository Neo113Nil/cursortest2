package org.spongycastle.asn1;

import java.util.Enumeration;

/* loaded from: classes5.dex */
public class d0 extends AbstractC5941t {

    /* renamed from: b, reason: collision with root package name */
    public int f62251b;

    public d0() {
        this.f62251b = -1;
    }

    @Override // org.spongycastle.asn1.AbstractC5940s
    public void e(C5939q c5939q) {
        C5939q a10 = c5939q.a();
        int q10 = q();
        c5939q.c(48);
        c5939q.i(q10);
        Enumeration o10 = o();
        while (o10.hasMoreElements()) {
            a10.j((InterfaceC5927e) o10.nextElement());
        }
    }

    @Override // org.spongycastle.asn1.AbstractC5940s
    public int f() {
        int q10 = q();
        return z0.a(q10) + 1 + q10;
    }

    public final int q() {
        if (this.f62251b < 0) {
            Enumeration o10 = o();
            int i10 = 0;
            while (o10.hasMoreElements()) {
                i10 += ((InterfaceC5927e) o10.nextElement()).toASN1Primitive().i().f();
            }
            this.f62251b = i10;
        }
        return this.f62251b;
    }

    public d0(C5928f c5928f) {
        super(c5928f);
        this.f62251b = -1;
    }

    public d0(InterfaceC5927e[] interfaceC5927eArr) {
        super(interfaceC5927eArr);
        this.f62251b = -1;
    }
}
