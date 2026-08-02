package org.spongycastle.math.field;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public class g implements a {

    /* renamed from: a, reason: collision with root package name */
    public final BigInteger f62871a;

    public g(BigInteger bigInteger) {
        this.f62871a = bigInteger;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            return this.f62871a.equals(((g) obj).f62871a);
        }
        return false;
    }

    @Override // org.spongycastle.math.field.a
    public BigInteger getCharacteristic() {
        return this.f62871a;
    }

    @Override // org.spongycastle.math.field.a
    public int getDimension() {
        return 1;
    }

    public int hashCode() {
        return this.f62871a.hashCode();
    }
}
