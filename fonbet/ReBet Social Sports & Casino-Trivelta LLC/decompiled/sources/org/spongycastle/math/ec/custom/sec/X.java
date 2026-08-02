package org.spongycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.spongycastle.math.ec.d;

/* loaded from: classes5.dex */
public class X extends d.a {

    /* renamed from: i, reason: collision with root package name */
    public Y f62774i;

    public X() {
        super(113, 9, 0, 0);
        this.f62774i = new Y(this, null, null);
        this.f62822b = m(new BigInteger(1, org.spongycastle.util.encoders.f.a("003088250CA6E7C7FE649CE85820F7")));
        this.f62823c = m(new BigInteger(1, org.spongycastle.util.encoders.f.a("00E8BEE4D3E2260744188BE0E9C723")));
        this.f62824d = new BigInteger(1, org.spongycastle.util.encoders.f.a("0100000000000000D9CCEC8A39E56F"));
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
        return new X();
    }

    @Override // org.spongycastle.math.ec.d
    public org.spongycastle.math.ec.g h(org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2, boolean z10) {
        return new Y(this, eVar, eVar2, z10);
    }

    @Override // org.spongycastle.math.ec.d
    public org.spongycastle.math.ec.g i(org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2, org.spongycastle.math.ec.e[] eVarArr, boolean z10) {
        return new Y(this, eVar, eVar2, eVarArr, z10);
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
        return this.f62774i;
    }
}
