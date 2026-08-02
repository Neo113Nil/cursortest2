package org.spongycastle.asn1;

import java.util.Enumeration;

/* loaded from: classes5.dex */
public class G extends AbstractC5941t {
    public G() {
    }

    @Override // org.spongycastle.asn1.AbstractC5940s
    public void e(C5939q c5939q) {
        c5939q.c(48);
        c5939q.c(128);
        Enumeration o10 = o();
        while (o10.hasMoreElements()) {
            c5939q.j((InterfaceC5927e) o10.nextElement());
        }
        c5939q.c(0);
        c5939q.c(0);
    }

    @Override // org.spongycastle.asn1.AbstractC5940s
    public int f() {
        Enumeration o10 = o();
        int i10 = 0;
        while (o10.hasMoreElements()) {
            i10 += ((InterfaceC5927e) o10.nextElement()).toASN1Primitive().f();
        }
        return i10 + 4;
    }

    public G(InterfaceC5927e interfaceC5927e) {
        super(interfaceC5927e);
    }

    public G(C5928f c5928f) {
        super(c5928f);
    }
}
