package org.spongycastle.asn1;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes5.dex */
public class F implements InterfaceC5938p {

    /* renamed from: a, reason: collision with root package name */
    public C5945x f62227a;

    public F(C5945x c5945x) {
        this.f62227a = c5945x;
    }

    @Override // org.spongycastle.asn1.t0
    public AbstractC5940s getLoadedObject() {
        return new E(Bj.a.b(getOctetStream()));
    }

    @Override // org.spongycastle.asn1.InterfaceC5938p
    public InputStream getOctetStream() {
        return new M(this.f62227a);
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
