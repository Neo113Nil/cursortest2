package org.spongycastle.math.ec.custom.sec;

import com.plaid.internal.EnumC3631g;
import java.math.BigInteger;
import org.spongycastle.math.ec.d;

/* renamed from: org.spongycastle.math.ec.custom.sec.j0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C6000j0 extends d.a {

    /* renamed from: i, reason: collision with root package name */
    public C6002k0 f62792i;

    public C6000j0() {
        super(EnumC3631g.SDK_ASSET_ILLUSTRATION_PAYWITHPLAID_LOGO_VALUE, 3, 6, 7);
        this.f62792i = new C6002k0(this, null, null);
        org.spongycastle.math.ec.e m10 = m(BigInteger.valueOf(1L));
        this.f62822b = m10;
        this.f62823c = m10;
        this.f62824d = new BigInteger(1, org.spongycastle.util.encoders.f.a("04000000000000000000020108A2E0CC0D99F8A5EF"));
        this.f62825e = BigInteger.valueOf(2L);
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
        return new C6000j0();
    }

    @Override // org.spongycastle.math.ec.d
    public org.spongycastle.math.ec.f e() {
        return new org.spongycastle.math.ec.u();
    }

    @Override // org.spongycastle.math.ec.d
    public org.spongycastle.math.ec.g h(org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2, boolean z10) {
        return new C6002k0(this, eVar, eVar2, z10);
    }

    @Override // org.spongycastle.math.ec.d
    public org.spongycastle.math.ec.g i(org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2, org.spongycastle.math.ec.e[] eVarArr, boolean z10) {
        return new C6002k0(this, eVar, eVar2, eVarArr, z10);
    }

    @Override // org.spongycastle.math.ec.d
    public org.spongycastle.math.ec.e m(BigInteger bigInteger) {
        return new C5998i0(bigInteger);
    }

    @Override // org.spongycastle.math.ec.d
    public int t() {
        return EnumC3631g.SDK_ASSET_ILLUSTRATION_PAYWITHPLAID_LOGO_VALUE;
    }

    @Override // org.spongycastle.math.ec.d
    public org.spongycastle.math.ec.g u() {
        return this.f62792i;
    }
}
