package org.bouncycastle.crypto.ec;

import org.bouncycastle.math.ec.ECPoint;

/* loaded from: classes5.dex */
public class ECPair {

    /* renamed from: x, reason: collision with root package name */
    private final ECPoint f61562x;

    /* renamed from: y, reason: collision with root package name */
    private final ECPoint f61563y;

    public ECPair(ECPoint eCPoint, ECPoint eCPoint2) {
        this.f61562x = eCPoint;
        this.f61563y = eCPoint2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ECPair) {
            return equals((ECPair) obj);
        }
        return false;
    }

    public ECPoint getX() {
        return this.f61562x;
    }

    public ECPoint getY() {
        return this.f61563y;
    }

    public int hashCode() {
        return this.f61562x.hashCode() + (this.f61563y.hashCode() * 37);
    }

    public boolean equals(ECPair eCPair) {
        return eCPair.getX().equals(getX()) && eCPair.getY().equals(getY());
    }
}
