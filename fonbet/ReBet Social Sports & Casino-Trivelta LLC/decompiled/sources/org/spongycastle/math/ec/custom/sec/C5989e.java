package org.spongycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.spongycastle.math.ec.d;

/* renamed from: org.spongycastle.math.ec.custom.sec.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C5989e extends d.b {

    /* renamed from: j, reason: collision with root package name */
    public static final BigInteger f62783j = C6001k.f62793j;

    /* renamed from: i, reason: collision with root package name */
    public C5991f f62784i;

    public C5989e() {
        super(f62783j);
        this.f62784i = new C5991f(this, null, null);
        this.f62822b = m(org.spongycastle.math.ec.c.f62724a);
        this.f62823c = m(BigInteger.valueOf(7L));
        this.f62824d = new BigInteger(1, org.spongycastle.util.encoders.f.a("0100000000000000000001B8FA16DFAB9ACA16B6B3"));
        this.f62825e = BigInteger.valueOf(1L);
        this.f62826f = 2;
    }

    @Override // org.spongycastle.math.ec.d
    public boolean C(int i10) {
        return i10 == 2;
    }

    @Override // org.spongycastle.math.ec.d
    public org.spongycastle.math.ec.d c() {
        return new C5989e();
    }

    @Override // org.spongycastle.math.ec.d
    public org.spongycastle.math.ec.g h(org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2, boolean z10) {
        return new C5991f(this, eVar, eVar2, z10);
    }

    @Override // org.spongycastle.math.ec.d
    public org.spongycastle.math.ec.g i(org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2, org.spongycastle.math.ec.e[] eVarArr, boolean z10) {
        return new C5991f(this, eVar, eVar2, eVarArr, z10);
    }

    @Override // org.spongycastle.math.ec.d
    public org.spongycastle.math.ec.e m(BigInteger bigInteger) {
        return new C6005m(bigInteger);
    }

    @Override // org.spongycastle.math.ec.d
    public int t() {
        return f62783j.bitLength();
    }

    @Override // org.spongycastle.math.ec.d
    public org.spongycastle.math.ec.g u() {
        return this.f62784i;
    }
}
