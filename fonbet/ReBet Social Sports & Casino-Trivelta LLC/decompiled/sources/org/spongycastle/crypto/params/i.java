package org.spongycastle.crypto.params;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public class i extends AbstractC5979f {

    /* renamed from: d, reason: collision with root package name */
    public static final BigInteger f62659d = BigInteger.valueOf(1);

    /* renamed from: e, reason: collision with root package name */
    public static final BigInteger f62660e = BigInteger.valueOf(2);

    /* renamed from: c, reason: collision with root package name */
    public BigInteger f62661c;

    public i(BigInteger bigInteger, C5980g c5980g) {
        super(false, c5980g);
        this.f62661c = d(bigInteger, c5980g);
    }

    public BigInteger c() {
        return this.f62661c;
    }

    public final BigInteger d(BigInteger bigInteger, C5980g c5980g) {
        if (bigInteger == null) {
            throw new NullPointerException("y value cannot be null");
        }
        BigInteger bigInteger2 = f62660e;
        if (bigInteger.compareTo(bigInteger2) < 0 || bigInteger.compareTo(c5980g.e().subtract(bigInteger2)) > 0) {
            throw new IllegalArgumentException("invalid DH public key");
        }
        if (c5980g.f() == null || f62659d.equals(bigInteger.modPow(c5980g.f(), c5980g.e()))) {
            return bigInteger;
        }
        throw new IllegalArgumentException("Y value does not appear to be in correct group");
    }

    @Override // org.spongycastle.crypto.params.AbstractC5979f
    public boolean equals(Object obj) {
        return (obj instanceof i) && ((i) obj).c().equals(this.f62661c) && super.equals(obj);
    }

    @Override // org.spongycastle.crypto.params.AbstractC5979f
    public int hashCode() {
        return this.f62661c.hashCode() ^ super.hashCode();
    }
}
