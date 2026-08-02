package org.spongycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.spongycastle.math.ec.d;

/* renamed from: org.spongycastle.math.ec.custom.sec.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C5981a extends d.b {

    /* renamed from: j, reason: collision with root package name */
    public static final BigInteger f62776j = new BigInteger(1, org.spongycastle.util.encoders.f.a("FFFFFFFDFFFFFFFFFFFFFFFFFFFFFFFF"));

    /* renamed from: i, reason: collision with root package name */
    public C5987d f62777i;

    public C5981a() {
        super(f62776j);
        this.f62777i = new C5987d(this, null, null);
        this.f62822b = m(new BigInteger(1, org.spongycastle.util.encoders.f.a("FFFFFFFDFFFFFFFFFFFFFFFFFFFFFFFC")));
        this.f62823c = m(new BigInteger(1, org.spongycastle.util.encoders.f.a("E87579C11079F43DD824993C2CEE5ED3")));
        this.f62824d = new BigInteger(1, org.spongycastle.util.encoders.f.a("FFFFFFFE0000000075A30D1B9038A115"));
        this.f62825e = BigInteger.valueOf(1L);
        this.f62826f = 2;
    }

    @Override // org.spongycastle.math.ec.d
    public boolean C(int i10) {
        return i10 == 2;
    }

    @Override // org.spongycastle.math.ec.d
    public org.spongycastle.math.ec.d c() {
        return new C5981a();
    }

    @Override // org.spongycastle.math.ec.d
    public org.spongycastle.math.ec.g h(org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2, boolean z10) {
        return new C5987d(this, eVar, eVar2, z10);
    }

    @Override // org.spongycastle.math.ec.d
    public org.spongycastle.math.ec.g i(org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2, org.spongycastle.math.ec.e[] eVarArr, boolean z10) {
        return new C5987d(this, eVar, eVar2, eVarArr, z10);
    }

    @Override // org.spongycastle.math.ec.d
    public org.spongycastle.math.ec.e m(BigInteger bigInteger) {
        return new C5985c(bigInteger);
    }

    @Override // org.spongycastle.math.ec.d
    public int t() {
        return f62776j.bitLength();
    }

    @Override // org.spongycastle.math.ec.d
    public org.spongycastle.math.ec.g u() {
        return this.f62777i;
    }
}
