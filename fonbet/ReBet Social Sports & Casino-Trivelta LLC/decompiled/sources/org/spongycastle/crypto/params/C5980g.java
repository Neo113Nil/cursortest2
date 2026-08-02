package org.spongycastle.crypto.params;

import com.plaid.internal.EnumC3631g;
import java.math.BigInteger;

/* renamed from: org.spongycastle.crypto.params.g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C5980g implements org.spongycastle.crypto.j {

    /* renamed from: a, reason: collision with root package name */
    public BigInteger f62651a;

    /* renamed from: b, reason: collision with root package name */
    public BigInteger f62652b;

    /* renamed from: c, reason: collision with root package name */
    public BigInteger f62653c;

    /* renamed from: d, reason: collision with root package name */
    public BigInteger f62654d;

    /* renamed from: e, reason: collision with root package name */
    public int f62655e;

    /* renamed from: f, reason: collision with root package name */
    public int f62656f;

    /* renamed from: g, reason: collision with root package name */
    public j f62657g;

    public C5980g(BigInteger bigInteger, BigInteger bigInteger2) {
        this(bigInteger, bigInteger2, null, 0);
    }

    public static int a(int i10) {
        return (i10 != 0 && i10 < 160) ? i10 : EnumC3631g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE;
    }

    public BigInteger b() {
        return this.f62651a;
    }

    public int c() {
        return this.f62656f;
    }

    public int d() {
        return this.f62655e;
    }

    public BigInteger e() {
        return this.f62652b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5980g)) {
            return false;
        }
        C5980g c5980g = (C5980g) obj;
        if (f() != null) {
            if (!f().equals(c5980g.f())) {
                return false;
            }
        } else if (c5980g.f() != null) {
            return false;
        }
        return c5980g.e().equals(this.f62652b) && c5980g.b().equals(this.f62651a);
    }

    public BigInteger f() {
        return this.f62653c;
    }

    public int hashCode() {
        return (e().hashCode() ^ b().hashCode()) ^ (f() != null ? f().hashCode() : 0);
    }

    public C5980g(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i10) {
        this(bigInteger, bigInteger2, bigInteger3, a(i10), i10, null, null);
    }

    public C5980g(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, j jVar) {
        this(bigInteger, bigInteger2, bigInteger3, EnumC3631g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE, 0, bigInteger4, jVar);
    }

    public C5980g(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i10, int i11, BigInteger bigInteger4, j jVar) {
        if (i11 != 0) {
            if (i11 > bigInteger.bitLength()) {
                throw new IllegalArgumentException("when l value specified, it must satisfy 2^(l-1) <= p");
            }
            if (i11 < i10) {
                throw new IllegalArgumentException("when l value specified, it may not be less than m value");
            }
        }
        this.f62651a = bigInteger2;
        this.f62652b = bigInteger;
        this.f62653c = bigInteger3;
        this.f62655e = i10;
        this.f62656f = i11;
        this.f62654d = bigInteger4;
        this.f62657g = jVar;
    }
}
