package org.spongycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.spongycastle.math.ec.d;

/* loaded from: classes5.dex */
public class I extends d.b {

    /* renamed from: j, reason: collision with root package name */
    public static final BigInteger f62749j = new BigInteger(1, org.spongycastle.util.encoders.f.a("FFFFFFFF00000001000000000000000000000000FFFFFFFFFFFFFFFFFFFFFFFF"));

    /* renamed from: i, reason: collision with root package name */
    public L f62750i;

    public I() {
        super(f62749j);
        this.f62750i = new L(this, null, null);
        this.f62822b = m(new BigInteger(1, org.spongycastle.util.encoders.f.a("FFFFFFFF00000001000000000000000000000000FFFFFFFFFFFFFFFFFFFFFFFC")));
        this.f62823c = m(new BigInteger(1, org.spongycastle.util.encoders.f.a("5AC635D8AA3A93E7B3EBBD55769886BC651D06B0CC53B0F63BCE3C3E27D2604B")));
        this.f62824d = new BigInteger(1, org.spongycastle.util.encoders.f.a("FFFFFFFF00000000FFFFFFFFFFFFFFFFBCE6FAADA7179E84F3B9CAC2FC632551"));
        this.f62825e = BigInteger.valueOf(1L);
        this.f62826f = 2;
    }

    @Override // org.spongycastle.math.ec.d
    public boolean C(int i10) {
        return i10 == 2;
    }

    @Override // org.spongycastle.math.ec.d
    public org.spongycastle.math.ec.d c() {
        return new I();
    }

    @Override // org.spongycastle.math.ec.d
    public org.spongycastle.math.ec.g h(org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2, boolean z10) {
        return new L(this, eVar, eVar2, z10);
    }

    @Override // org.spongycastle.math.ec.d
    public org.spongycastle.math.ec.g i(org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2, org.spongycastle.math.ec.e[] eVarArr, boolean z10) {
        return new L(this, eVar, eVar2, eVarArr, z10);
    }

    @Override // org.spongycastle.math.ec.d
    public org.spongycastle.math.ec.e m(BigInteger bigInteger) {
        return new K(bigInteger);
    }

    @Override // org.spongycastle.math.ec.d
    public int t() {
        return f62749j.bitLength();
    }

    @Override // org.spongycastle.math.ec.d
    public org.spongycastle.math.ec.g u() {
        return this.f62750i;
    }
}
