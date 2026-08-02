package org.spongycastle.crypto.params;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public class s extends p {

    /* renamed from: c, reason: collision with root package name */
    public BigInteger f62676c;

    public s(BigInteger bigInteger, q qVar) {
        super(false, qVar);
        this.f62676c = bigInteger;
    }

    public BigInteger c() {
        return this.f62676c;
    }

    @Override // org.spongycastle.crypto.params.p
    public boolean equals(Object obj) {
        return (obj instanceof s) && ((s) obj).c().equals(this.f62676c) && super.equals(obj);
    }

    @Override // org.spongycastle.crypto.params.p
    public int hashCode() {
        return this.f62676c.hashCode() ^ super.hashCode();
    }
}
