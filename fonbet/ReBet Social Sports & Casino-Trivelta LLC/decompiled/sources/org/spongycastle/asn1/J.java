package org.spongycastle.asn1;

import java.io.IOException;

/* loaded from: classes5.dex */
public class J implements InterfaceC5944w {

    /* renamed from: a, reason: collision with root package name */
    public C5945x f62229a;

    public J(C5945x c5945x) {
        this.f62229a = c5945x;
    }

    @Override // org.spongycastle.asn1.t0
    public AbstractC5940s getLoadedObject() {
        return new I(this.f62229a.d());
    }

    @Override // org.spongycastle.asn1.InterfaceC5927e
    public AbstractC5940s toASN1Primitive() {
        try {
            return getLoadedObject();
        } catch (IOException e10) {
            throw new r(e10.getMessage(), e10);
        }
    }
}
