package org.spongycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.spongycastle.math.ec.d;

/* renamed from: org.spongycastle.math.ec.custom.sec.s, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C6016s extends d.b {

    /* renamed from: j, reason: collision with root package name */
    public static final BigInteger f62807j = new BigInteger(1, org.spongycastle.util.encoders.f.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFF"));

    /* renamed from: i, reason: collision with root package name */
    public C6022v f62808i;

    public C6016s() {
        super(f62807j);
        this.f62808i = new C6022v(this, null, null);
        this.f62822b = m(new BigInteger(1, org.spongycastle.util.encoders.f.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFC")));
        this.f62823c = m(new BigInteger(1, org.spongycastle.util.encoders.f.a("64210519E59C80E70FA7E9AB72243049FEB8DEECC146B9B1")));
        this.f62824d = new BigInteger(1, org.spongycastle.util.encoders.f.a("FFFFFFFFFFFFFFFFFFFFFFFF99DEF836146BC9B1B4D22831"));
        this.f62825e = BigInteger.valueOf(1L);
        this.f62826f = 2;
    }

    @Override // org.spongycastle.math.ec.d
    public boolean C(int i10) {
        return i10 == 2;
    }

    @Override // org.spongycastle.math.ec.d
    public org.spongycastle.math.ec.d c() {
        return new C6016s();
    }

    @Override // org.spongycastle.math.ec.d
    public org.spongycastle.math.ec.g h(org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2, boolean z10) {
        return new C6022v(this, eVar, eVar2, z10);
    }

    @Override // org.spongycastle.math.ec.d
    public org.spongycastle.math.ec.g i(org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2, org.spongycastle.math.ec.e[] eVarArr, boolean z10) {
        return new C6022v(this, eVar, eVar2, eVarArr, z10);
    }

    @Override // org.spongycastle.math.ec.d
    public org.spongycastle.math.ec.e m(BigInteger bigInteger) {
        return new C6020u(bigInteger);
    }

    @Override // org.spongycastle.math.ec.d
    public int t() {
        return f62807j.bitLength();
    }

    @Override // org.spongycastle.math.ec.d
    public org.spongycastle.math.ec.g u() {
        return this.f62808i;
    }
}
