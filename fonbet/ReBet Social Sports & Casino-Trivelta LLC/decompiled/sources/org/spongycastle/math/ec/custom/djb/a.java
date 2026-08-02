package org.spongycastle.math.ec.custom.djb;

import java.math.BigInteger;
import org.spongycastle.math.ec.d;
import org.spongycastle.math.ec.e;
import org.spongycastle.util.encoders.f;
import pj.g;

/* loaded from: classes5.dex */
public class a extends d.b {

    /* renamed from: j, reason: collision with root package name */
    public static final BigInteger f62730j = g.H(b.f62732P);

    /* renamed from: i, reason: collision with root package name */
    public d f62731i;

    public a() {
        super(f62730j);
        this.f62731i = new d(this, null, null);
        this.f62822b = m(new BigInteger(1, f.a("2AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA984914A144")));
        this.f62823c = m(new BigInteger(1, f.a("7B425ED097B425ED097B425ED097B425ED097B425ED097B4260B5E9C7710C864")));
        this.f62824d = new BigInteger(1, f.a("1000000000000000000000000000000014DEF9DEA2F79CD65812631A5CF5D3ED"));
        this.f62825e = BigInteger.valueOf(8L);
        this.f62826f = 4;
    }

    @Override // org.spongycastle.math.ec.d
    public boolean C(int i10) {
        return i10 == 4;
    }

    @Override // org.spongycastle.math.ec.d
    public org.spongycastle.math.ec.d c() {
        return new a();
    }

    @Override // org.spongycastle.math.ec.d
    public org.spongycastle.math.ec.g h(e eVar, e eVar2, boolean z10) {
        return new d(this, eVar, eVar2, z10);
    }

    @Override // org.spongycastle.math.ec.d
    public org.spongycastle.math.ec.g i(e eVar, e eVar2, e[] eVarArr, boolean z10) {
        return new d(this, eVar, eVar2, eVarArr, z10);
    }

    @Override // org.spongycastle.math.ec.d
    public e m(BigInteger bigInteger) {
        return new c(bigInteger);
    }

    @Override // org.spongycastle.math.ec.d
    public int t() {
        return f62730j.bitLength();
    }

    @Override // org.spongycastle.math.ec.d
    public org.spongycastle.math.ec.g u() {
        return this.f62731i;
    }
}
