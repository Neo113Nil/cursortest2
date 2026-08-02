package org.spongycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.spongycastle.math.ec.d;

/* renamed from: org.spongycastle.math.ec.custom.sec.w, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C6024w extends d.b {

    /* renamed from: j, reason: collision with root package name */
    public static final BigInteger f62813j = new BigInteger(1, org.spongycastle.util.encoders.f.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFE56D"));

    /* renamed from: i, reason: collision with root package name */
    public C6028z f62814i;

    public C6024w() {
        super(f62813j);
        this.f62814i = new C6028z(this, null, null);
        this.f62822b = m(org.spongycastle.math.ec.c.f62724a);
        this.f62823c = m(BigInteger.valueOf(5L));
        this.f62824d = new BigInteger(1, org.spongycastle.util.encoders.f.a("010000000000000000000000000001DCE8D2EC6184CAF0A971769FB1F7"));
        this.f62825e = BigInteger.valueOf(1L);
        this.f62826f = 2;
    }

    @Override // org.spongycastle.math.ec.d
    public boolean C(int i10) {
        return i10 == 2;
    }

    @Override // org.spongycastle.math.ec.d
    public org.spongycastle.math.ec.d c() {
        return new C6024w();
    }

    @Override // org.spongycastle.math.ec.d
    public org.spongycastle.math.ec.g h(org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2, boolean z10) {
        return new C6028z(this, eVar, eVar2, z10);
    }

    @Override // org.spongycastle.math.ec.d
    public org.spongycastle.math.ec.g i(org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2, org.spongycastle.math.ec.e[] eVarArr, boolean z10) {
        return new C6028z(this, eVar, eVar2, eVarArr, z10);
    }

    @Override // org.spongycastle.math.ec.d
    public org.spongycastle.math.ec.e m(BigInteger bigInteger) {
        return new C6027y(bigInteger);
    }

    @Override // org.spongycastle.math.ec.d
    public int t() {
        return f62813j.bitLength();
    }

    @Override // org.spongycastle.math.ec.d
    public org.spongycastle.math.ec.g u() {
        return this.f62814i;
    }
}
