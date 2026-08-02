package org.spongycastle.asn1;

import java.util.Enumeration;

/* loaded from: classes5.dex */
public class I extends AbstractC5943v {
    public I() {
    }

    @Override // org.spongycastle.asn1.AbstractC5940s
    public void e(C5939q c5939q) {
        c5939q.c(49);
        c5939q.c(128);
        Enumeration p10 = p();
        while (p10.hasMoreElements()) {
            c5939q.j((InterfaceC5927e) p10.nextElement());
        }
        c5939q.c(0);
        c5939q.c(0);
    }

    @Override // org.spongycastle.asn1.AbstractC5940s
    public int f() {
        Enumeration p10 = p();
        int i10 = 0;
        while (p10.hasMoreElements()) {
            i10 += ((InterfaceC5927e) p10.nextElement()).toASN1Primitive().f();
        }
        return i10 + 4;
    }

    public I(InterfaceC5927e interfaceC5927e) {
        super(interfaceC5927e);
    }

    public I(C5928f c5928f) {
        super(c5928f, false);
    }

    public I(InterfaceC5927e[] interfaceC5927eArr) {
        super(interfaceC5927eArr, false);
    }
}
