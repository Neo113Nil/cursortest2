package org.spongycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.spongycastle.math.ec.d;

/* loaded from: classes5.dex */
public class Z extends d.a {

    /* renamed from: i, reason: collision with root package name */
    public C5982a0 f62775i;

    public Z() {
        super(113, 9, 0, 0);
        this.f62775i = new C5982a0(this, null, null);
        this.f62822b = m(new BigInteger(1, org.spongycastle.util.encoders.f.a("00689918DBEC7E5A0DD6DFC0AA55C7")));
        this.f62823c = m(new BigInteger(1, org.spongycastle.util.encoders.f.a("0095E9A9EC9B297BD4BF36E059184F")));
        this.f62824d = new BigInteger(1, org.spongycastle.util.encoders.f.a("010000000000000108789B2496AF93"));
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
        return new Z();
    }

    @Override // org.spongycastle.math.ec.d
    public org.spongycastle.math.ec.g h(org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2, boolean z10) {
        return new C5982a0(this, eVar, eVar2, z10);
    }

    @Override // org.spongycastle.math.ec.d
    public org.spongycastle.math.ec.g i(org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2, org.spongycastle.math.ec.e[] eVarArr, boolean z10) {
        return new C5982a0(this, eVar, eVar2, eVarArr, z10);
    }

    @Override // org.spongycastle.math.ec.d
    public org.spongycastle.math.ec.e m(BigInteger bigInteger) {
        return new W(bigInteger);
    }

    @Override // org.spongycastle.math.ec.d
    public int t() {
        return 113;
    }

    @Override // org.spongycastle.math.ec.d
    public org.spongycastle.math.ec.g u() {
        return this.f62775i;
    }
}
