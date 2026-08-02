package org.spongycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.spongycastle.math.ec.d;

/* renamed from: org.spongycastle.math.ec.custom.sec.o, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C6009o extends d.b {

    /* renamed from: j, reason: collision with root package name */
    public static final BigInteger f62800j = new BigInteger(1, org.spongycastle.util.encoders.f.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFEE37"));

    /* renamed from: i, reason: collision with root package name */
    public r f62801i;

    public C6009o() {
        super(f62800j);
        this.f62801i = new r(this, null, null);
        this.f62822b = m(org.spongycastle.math.ec.c.f62724a);
        this.f62823c = m(BigInteger.valueOf(3L));
        this.f62824d = new BigInteger(1, org.spongycastle.util.encoders.f.a("FFFFFFFFFFFFFFFFFFFFFFFE26F2FC170F69466A74DEFD8D"));
        this.f62825e = BigInteger.valueOf(1L);
        this.f62826f = 2;
    }

    @Override // org.spongycastle.math.ec.d
    public boolean C(int i10) {
        return i10 == 2;
    }

    @Override // org.spongycastle.math.ec.d
    public org.spongycastle.math.ec.d c() {
        return new C6009o();
    }

    @Override // org.spongycastle.math.ec.d
    public org.spongycastle.math.ec.g h(org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2, boolean z10) {
        return new r(this, eVar, eVar2, z10);
    }

    @Override // org.spongycastle.math.ec.d
    public org.spongycastle.math.ec.g i(org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2, org.spongycastle.math.ec.e[] eVarArr, boolean z10) {
        return new r(this, eVar, eVar2, eVarArr, z10);
    }

    @Override // org.spongycastle.math.ec.d
    public org.spongycastle.math.ec.e m(BigInteger bigInteger) {
        return new C6013q(bigInteger);
    }

    @Override // org.spongycastle.math.ec.d
    public int t() {
        return f62800j.bitLength();
    }

    @Override // org.spongycastle.math.ec.d
    public org.spongycastle.math.ec.g u() {
        return this.f62801i;
    }
}
