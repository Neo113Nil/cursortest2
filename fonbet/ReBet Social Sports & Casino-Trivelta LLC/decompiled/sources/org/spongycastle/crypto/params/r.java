package org.spongycastle.crypto.params;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public class r extends p {

    /* renamed from: c, reason: collision with root package name */
    public BigInteger f62675c;

    public r(BigInteger bigInteger, q qVar) {
        super(true, qVar);
        this.f62675c = bigInteger;
    }

    public BigInteger c() {
        return this.f62675c;
    }

    @Override // org.spongycastle.crypto.params.p
    public boolean equals(Object obj) {
        if ((obj instanceof r) && ((r) obj).c().equals(this.f62675c)) {
            return super.equals(obj);
        }
        return false;
    }

    @Override // org.spongycastle.crypto.params.p
    public int hashCode() {
        return c().hashCode();
    }
}
