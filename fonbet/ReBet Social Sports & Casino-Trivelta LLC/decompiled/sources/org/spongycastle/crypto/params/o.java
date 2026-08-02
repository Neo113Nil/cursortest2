package org.spongycastle.crypto.params;

/* loaded from: classes5.dex */
public class o extends m {

    /* renamed from: c, reason: collision with root package name */
    public final org.spongycastle.math.ec.g f62670c;

    public o(org.spongycastle.math.ec.g gVar, k kVar) {
        super(false, kVar);
        this.f62670c = d(gVar);
    }

    public org.spongycastle.math.ec.g c() {
        return this.f62670c;
    }

    public final org.spongycastle.math.ec.g d(org.spongycastle.math.ec.g gVar) {
        if (gVar == null) {
            throw new IllegalArgumentException("point has null value");
        }
        if (gVar.r()) {
            throw new IllegalArgumentException("point at infinity");
        }
        org.spongycastle.math.ec.g v10 = gVar.v();
        if (v10.isValid()) {
            return v10;
        }
        throw new IllegalArgumentException("point not on curve");
    }
}
