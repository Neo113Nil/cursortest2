package org.spongycastle.math.ec.custom.sec;

import com.plaid.internal.EnumC3631g;
import java.math.BigInteger;
import org.spongycastle.math.ec.d;

/* loaded from: classes5.dex */
public class H0 extends d.a {

    /* renamed from: i, reason: collision with root package name */
    public I0 f62748i;

    public H0() {
        super(EnumC3631g.SDK_ASSET_ILLUSTRATION_CARD_VALUE, 5, 7, 12);
        this.f62748i = new I0(this, null, null);
        this.f62822b = m(BigInteger.valueOf(0L));
        this.f62823c = m(BigInteger.valueOf(1L));
        this.f62824d = new BigInteger(1, org.spongycastle.util.encoders.f.a("01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFE9AE2ED07577265DFF7F94451E061E163C61"));
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
        return new H0();
    }

    @Override // org.spongycastle.math.ec.d
    public org.spongycastle.math.ec.f e() {
        return new org.spongycastle.math.ec.u();
    }

    @Override // org.spongycastle.math.ec.d
    public org.spongycastle.math.ec.g h(org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2, boolean z10) {
        return new I0(this, eVar, eVar2, z10);
    }

    @Override // org.spongycastle.math.ec.d
    public org.spongycastle.math.ec.g i(org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2, org.spongycastle.math.ec.e[] eVarArr, boolean z10) {
        return new I0(this, eVar, eVar2, eVarArr, z10);
    }

    @Override // org.spongycastle.math.ec.d
    public org.spongycastle.math.ec.e m(BigInteger bigInteger) {
        return new G0(bigInteger);
    }

    @Override // org.spongycastle.math.ec.d
    public int t() {
        return EnumC3631g.SDK_ASSET_ILLUSTRATION_CARD_VALUE;
    }

    @Override // org.spongycastle.math.ec.d
    public org.spongycastle.math.ec.g u() {
        return this.f62748i;
    }
}
