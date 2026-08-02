package org.spongycastle.asn1;

import java.io.IOException;

/* loaded from: classes5.dex */
public class S implements InterfaceC5927e, t0 {

    /* renamed from: a, reason: collision with root package name */
    public C5945x f62241a;

    public S(C5945x c5945x) {
        this.f62241a = c5945x;
    }

    @Override // org.spongycastle.asn1.t0
    public AbstractC5940s getLoadedObject() {
        try {
            return new Q(this.f62241a.d());
        } catch (IllegalArgumentException e10) {
            throw new C5930h(e10.getMessage(), e10);
        }
    }

    @Override // org.spongycastle.asn1.InterfaceC5927e
    public AbstractC5940s toASN1Primitive() {
        try {
            return getLoadedObject();
        } catch (IOException e10) {
            throw new r("unable to get DER object", e10);
        } catch (IllegalArgumentException e11) {
            throw new r("unable to get DER object", e11);
        }
    }
}
