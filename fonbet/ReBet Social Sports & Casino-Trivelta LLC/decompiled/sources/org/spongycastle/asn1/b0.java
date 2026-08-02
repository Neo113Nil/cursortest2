package org.spongycastle.asn1;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes5.dex */
public class b0 extends C5939q {
    public b0(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // org.spongycastle.asn1.C5939q
    public C5939q a() {
        return this;
    }

    @Override // org.spongycastle.asn1.C5939q
    public C5939q b() {
        return this;
    }

    @Override // org.spongycastle.asn1.C5939q
    public void j(InterfaceC5927e interfaceC5927e) {
        if (interfaceC5927e == null) {
            throw new IOException("null object detected");
        }
        interfaceC5927e.toASN1Primitive().i().e(this);
    }
}
