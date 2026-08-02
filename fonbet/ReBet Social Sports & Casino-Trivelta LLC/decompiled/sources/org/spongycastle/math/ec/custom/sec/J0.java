package org.spongycastle.math.ec.custom.sec;

import com.plaid.internal.EnumC3631g;
import java.math.BigInteger;
import org.spongycastle.math.ec.d;

/* loaded from: classes5.dex */
public class J0 extends d.a {

    /* renamed from: i, reason: collision with root package name */
    public K0 f62752i;

    public J0() {
        super(EnumC3631g.SDK_ASSET_ILLUSTRATION_CARD_VALUE, 5, 7, 12);
        this.f62752i = new K0(this, null, null);
        this.f62822b = m(BigInteger.valueOf(1L));
        this.f62823c = m(new BigInteger(1, org.spongycastle.util.encoders.f.a("027B680AC8B8596DA5A4AF8A19A0303FCA97FD7645309FA2A581485AF6263E313B79A2F5")));
        this.f62824d = new BigInteger(1, org.spongycastle.util.encoders.f.a("03FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEF90399660FC938A90165B042A7CEFADB307"));
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
        return new J0();
    }

    @Override // org.spongycastle.math.ec.d
    public org.spongycastle.math.ec.g h(org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2, boolean z10) {
        return new K0(this, eVar, eVar2, z10);
    }

    @Override // org.spongycastle.math.ec.d
    public org.spongycastle.math.ec.g i(org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2, org.spongycastle.math.ec.e[] eVarArr, boolean z10) {
        return new K0(this, eVar, eVar2, eVarArr, z10);
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
        return this.f62752i;
    }
}
