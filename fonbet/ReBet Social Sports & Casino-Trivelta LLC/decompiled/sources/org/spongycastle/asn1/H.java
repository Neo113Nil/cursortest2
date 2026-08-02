package org.spongycastle.asn1;

import java.io.IOException;

/* loaded from: classes5.dex */
public class H implements InterfaceC5942u {

    /* renamed from: a, reason: collision with root package name */
    public C5945x f62228a;

    public H(C5945x c5945x) {
        this.f62228a = c5945x;
    }

    @Override // org.spongycastle.asn1.t0
    public AbstractC5940s getLoadedObject() {
        return new G(this.f62228a.d());
    }

    @Override // org.spongycastle.asn1.InterfaceC5927e
    public AbstractC5940s toASN1Primitive() {
        try {
            return getLoadedObject();
        } catch (IOException e10) {
            throw new IllegalStateException(e10.getMessage());
        }
    }
}
