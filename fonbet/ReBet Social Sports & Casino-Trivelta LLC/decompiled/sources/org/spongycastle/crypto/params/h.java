package org.spongycastle.crypto.params;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public class h extends AbstractC5979f {

    /* renamed from: c, reason: collision with root package name */
    public BigInteger f62658c;

    public h(BigInteger bigInteger, C5980g c5980g) {
        super(true, c5980g);
        this.f62658c = bigInteger;
    }

    public BigInteger c() {
        return this.f62658c;
    }

    @Override // org.spongycastle.crypto.params.AbstractC5979f
    public boolean equals(Object obj) {
        return (obj instanceof h) && ((h) obj).c().equals(this.f62658c) && super.equals(obj);
    }

    @Override // org.spongycastle.crypto.params.AbstractC5979f
    public int hashCode() {
        return this.f62658c.hashCode() ^ super.hashCode();
    }
}
