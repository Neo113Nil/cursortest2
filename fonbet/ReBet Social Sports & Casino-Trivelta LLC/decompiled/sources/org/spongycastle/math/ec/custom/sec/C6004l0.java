package org.spongycastle.math.ec.custom.sec;

import com.plaid.internal.EnumC3631g;
import java.math.BigInteger;
import org.spongycastle.math.ec.d;

/* renamed from: org.spongycastle.math.ec.custom.sec.l0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C6004l0 extends d.a {

    /* renamed from: i, reason: collision with root package name */
    public C6006m0 f62796i;

    public C6004l0() {
        super(EnumC3631g.SDK_ASSET_ILLUSTRATION_PAYWITHPLAID_LOGO_VALUE, 3, 6, 7);
        this.f62796i = new C6006m0(this, null, null);
        this.f62822b = m(new BigInteger(1, org.spongycastle.util.encoders.f.a("07B6882CAAEFA84F9554FF8428BD88E246D2782AE2")));
        this.f62823c = m(new BigInteger(1, org.spongycastle.util.encoders.f.a("0713612DCDDCB40AAB946BDA29CA91F73AF958AFD9")));
        this.f62824d = new BigInteger(1, org.spongycastle.util.encoders.f.a("03FFFFFFFFFFFFFFFFFFFF48AAB689C29CA710279B"));
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
        return new C6004l0();
    }

    @Override // org.spongycastle.math.ec.d
    public org.spongycastle.math.ec.g h(org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2, boolean z10) {
        return new C6006m0(this, eVar, eVar2, z10);
    }

    @Override // org.spongycastle.math.ec.d
    public org.spongycastle.math.ec.g i(org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2, org.spongycastle.math.ec.e[] eVarArr, boolean z10) {
        return new C6006m0(this, eVar, eVar2, eVarArr, z10);
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
        return this.f62796i;
    }
}
