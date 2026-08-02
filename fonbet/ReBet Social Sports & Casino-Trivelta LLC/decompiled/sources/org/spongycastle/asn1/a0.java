package org.spongycastle.asn1;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes5.dex */
public class a0 implements InterfaceC5938p {

    /* renamed from: a, reason: collision with root package name */
    public s0 f62247a;

    public a0(s0 s0Var) {
        this.f62247a = s0Var;
    }

    @Override // org.spongycastle.asn1.t0
    public AbstractC5940s getLoadedObject() {
        return new Z(this.f62247a.r());
    }

    @Override // org.spongycastle.asn1.InterfaceC5938p
    public InputStream getOctetStream() {
        return this.f62247a;
    }

    @Override // org.spongycastle.asn1.InterfaceC5927e
    public AbstractC5940s toASN1Primitive() {
        try {
            return getLoadedObject();
        } catch (IOException e10) {
            throw new r("IOException converting stream to byte array: " + e10.getMessage(), e10);
        }
    }
}
