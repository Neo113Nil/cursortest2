package org.spongycastle.asn1;

import java.io.IOException;

/* loaded from: classes5.dex */
public class C implements InterfaceC5927e, t0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f62221a;

    /* renamed from: b, reason: collision with root package name */
    public final C5945x f62222b;

    public C(int i10, C5945x c5945x) {
        this.f62221a = i10;
        this.f62222b = c5945x;
    }

    @Override // org.spongycastle.asn1.t0
    public AbstractC5940s getLoadedObject() {
        return new B(this.f62221a, this.f62222b.d());
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
