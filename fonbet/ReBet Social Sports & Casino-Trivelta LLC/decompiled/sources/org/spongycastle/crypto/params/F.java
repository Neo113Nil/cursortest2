package org.spongycastle.crypto.params;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public class F extends E {

    /* renamed from: e, reason: collision with root package name */
    public BigInteger f62638e;

    /* renamed from: f, reason: collision with root package name */
    public BigInteger f62639f;

    /* renamed from: g, reason: collision with root package name */
    public BigInteger f62640g;

    /* renamed from: h, reason: collision with root package name */
    public BigInteger f62641h;

    /* renamed from: i, reason: collision with root package name */
    public BigInteger f62642i;

    /* renamed from: j, reason: collision with root package name */
    public BigInteger f62643j;

    public F(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5, BigInteger bigInteger6, BigInteger bigInteger7, BigInteger bigInteger8) {
        super(true, bigInteger, bigInteger3);
        this.f62638e = bigInteger2;
        this.f62639f = bigInteger4;
        this.f62640g = bigInteger5;
        this.f62641h = bigInteger6;
        this.f62642i = bigInteger7;
        this.f62643j = bigInteger8;
    }

    public BigInteger e() {
        return this.f62641h;
    }

    public BigInteger f() {
        return this.f62642i;
    }

    public BigInteger g() {
        return this.f62639f;
    }

    public BigInteger h() {
        return this.f62638e;
    }

    public BigInteger i() {
        return this.f62640g;
    }

    public BigInteger j() {
        return this.f62643j;
    }
}
