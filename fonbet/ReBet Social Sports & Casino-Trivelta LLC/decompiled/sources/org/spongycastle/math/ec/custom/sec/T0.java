package org.spongycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.spongycastle.math.ec.d;

/* loaded from: classes5.dex */
public class T0 extends d.a {

    /* renamed from: i, reason: collision with root package name */
    public U0 f62769i;

    public T0() {
        super(571, 2, 5, 10);
        this.f62769i = new U0(this, null, null);
        this.f62822b = m(BigInteger.valueOf(0L));
        this.f62823c = m(BigInteger.valueOf(1L));
        this.f62824d = new BigInteger(1, org.spongycastle.util.encoders.f.a("020000000000000000000000000000000000000000000000000000000000000000000000131850E1F19A63E4B391A8DB917F4138B630D84BE5D639381E91DEB45CFE778F637C1001"));
        this.f62825e = BigInteger.valueOf(4L);
        this.f62826f = 6;
    }

    @Override // org.spongycastle.math.ec.d
    public boolean C(int i10) {
        return i10 == 6;
    }

    @Override // org.spongycastle.math.ec.d.a
    public boolean H() {
        return true;
    }

    @Override // org.spongycastle.math.ec.d
    public org.spongycastle.math.ec.d c() {
        return new T0();
    }

    @Override // org.spongycastle.math.ec.d
    public org.spongycastle.math.ec.f e() {
        return new org.spongycastle.math.ec.u();
    }

    @Override // org.spongycastle.math.ec.d
    public org.spongycastle.math.ec.g h(org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2, boolean z10) {
        return new U0(this, eVar, eVar2, z10);
    }

    @Override // org.spongycastle.math.ec.d
    public org.spongycastle.math.ec.g i(org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2, org.spongycastle.math.ec.e[] eVarArr, boolean z10) {
        return new U0(this, eVar, eVar2, eVarArr, z10);
    }

    @Override // org.spongycastle.math.ec.d
    public org.spongycastle.math.ec.e m(BigInteger bigInteger) {
        return new S0(bigInteger);
    }

    @Override // org.spongycastle.math.ec.d
    public int t() {
        return 571;
    }

    @Override // org.spongycastle.math.ec.d
    public org.spongycastle.math.ec.g u() {
        return this.f62769i;
    }
}
