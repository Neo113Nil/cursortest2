package org.spongycastle.crypto.params;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public class q implements org.spongycastle.crypto.j {

    /* renamed from: a, reason: collision with root package name */
    public BigInteger f62672a;

    /* renamed from: b, reason: collision with root package name */
    public BigInteger f62673b;

    /* renamed from: c, reason: collision with root package name */
    public int f62674c;

    public q(BigInteger bigInteger, BigInteger bigInteger2) {
        this(bigInteger, bigInteger2, 0);
    }

    public BigInteger a() {
        return this.f62672a;
    }

    public int b() {
        return this.f62674c;
    }

    public BigInteger c() {
        return this.f62673b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return qVar.c().equals(this.f62673b) && qVar.a().equals(this.f62672a) && qVar.b() == this.f62674c;
    }

    public int hashCode() {
        return (c().hashCode() ^ a().hashCode()) + this.f62674c;
    }

    public q(BigInteger bigInteger, BigInteger bigInteger2, int i10) {
        this.f62672a = bigInteger2;
        this.f62673b = bigInteger;
        this.f62674c = i10;
    }
}
