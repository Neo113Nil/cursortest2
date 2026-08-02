package org.spongycastle.math.ec.custom.sec;

import com.plaid.internal.EnumC3631g;
import java.math.BigInteger;
import org.spongycastle.math.ec.d;

/* loaded from: classes5.dex */
public class D0 extends d.a {

    /* renamed from: i, reason: collision with root package name */
    public E0 f62741i;

    public D0() {
        super(EnumC3631g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_03_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE, 0, 0);
        this.f62741i = new E0(this, null, null);
        this.f62822b = m(BigInteger.valueOf(0L));
        this.f62823c = m(BigInteger.valueOf(1L));
        this.f62824d = new BigInteger(1, org.spongycastle.util.encoders.f.a("2000000000000000000000000000005A79FEC67CB6E91F1C1DA800E478A5"));
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
        return new D0();
    }

    @Override // org.spongycastle.math.ec.d
    public org.spongycastle.math.ec.f e() {
        return new org.spongycastle.math.ec.u();
    }

    @Override // org.spongycastle.math.ec.d
    public org.spongycastle.math.ec.g h(org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2, boolean z10) {
        return new E0(this, eVar, eVar2, z10);
    }

    @Override // org.spongycastle.math.ec.d
    public org.spongycastle.math.ec.g i(org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2, org.spongycastle.math.ec.e[] eVarArr, boolean z10) {
        return new E0(this, eVar, eVar2, eVarArr, z10);
    }

    @Override // org.spongycastle.math.ec.d
    public org.spongycastle.math.ec.e m(BigInteger bigInteger) {
        return new C0(bigInteger);
    }

    @Override // org.spongycastle.math.ec.d
    public int t() {
        return EnumC3631g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_03_VALUE;
    }

    @Override // org.spongycastle.math.ec.d
    public org.spongycastle.math.ec.g u() {
        return this.f62741i;
    }
}
