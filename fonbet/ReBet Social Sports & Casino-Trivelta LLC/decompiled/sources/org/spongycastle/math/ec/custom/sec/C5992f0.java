package org.spongycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.spongycastle.math.ec.d;

/* renamed from: org.spongycastle.math.ec.custom.sec.f0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C5992f0 extends d.a {

    /* renamed from: i, reason: collision with root package name */
    public C5994g0 f62785i;

    public C5992f0() {
        super(131, 2, 3, 8);
        this.f62785i = new C5994g0(this, null, null);
        this.f62822b = m(new BigInteger(1, org.spongycastle.util.encoders.f.a("03E5A88919D7CAFCBF415F07C2176573B2")));
        this.f62823c = m(new BigInteger(1, org.spongycastle.util.encoders.f.a("04B8266A46C55657AC734CE38F018F2192")));
        this.f62824d = new BigInteger(1, org.spongycastle.util.encoders.f.a("0400000000000000016954A233049BA98F"));
        this.f62825e = BigInteger.valueOf(2L);
        this.f62826f = 6;
    }

    @Override // org.spongycastle.math.ec.d
    public boolean C(int i10) {
        return i10 == 6;
    }

    @Override // org.spongycastle.math.ec.d.a
    public boolean H() {
        return false;
    }

    @Override // org.spongycastle.math.ec.d
    public org.spongycastle.math.ec.d c() {
        return new C5992f0();
    }

    @Override // org.spongycastle.math.ec.d
    public org.spongycastle.math.ec.g h(org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2, boolean z10) {
        return new C5994g0(this, eVar, eVar2, z10);
    }

    @Override // org.spongycastle.math.ec.d
    public org.spongycastle.math.ec.g i(org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2, org.spongycastle.math.ec.e[] eVarArr, boolean z10) {
        return new C5994g0(this, eVar, eVar2, eVarArr, z10);
    }

    @Override // org.spongycastle.math.ec.d
    public org.spongycastle.math.ec.e m(BigInteger bigInteger) {
        return new C5986c0(bigInteger);
    }

    @Override // org.spongycastle.math.ec.d
    public int t() {
        return 131;
    }

    @Override // org.spongycastle.math.ec.d
    public org.spongycastle.math.ec.g u() {
        return this.f62785i;
    }
}
