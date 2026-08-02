package org.spongycastle.math.field;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public class d implements f {

    /* renamed from: a, reason: collision with root package name */
    public final a f62869a;

    /* renamed from: b, reason: collision with root package name */
    public final e f62870b;

    public d(a aVar, e eVar) {
        this.f62869a = aVar;
        this.f62870b = eVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f62869a.equals(dVar.f62869a) && this.f62870b.equals(dVar.f62870b);
    }

    @Override // org.spongycastle.math.field.a
    public BigInteger getCharacteristic() {
        return this.f62869a.getCharacteristic();
    }

    @Override // org.spongycastle.math.field.a
    public int getDimension() {
        return this.f62869a.getDimension() * this.f62870b.getDegree();
    }

    @Override // org.spongycastle.math.field.f
    public e getMinimalPolynomial() {
        return this.f62870b;
    }

    public int hashCode() {
        return this.f62869a.hashCode() ^ Aj.c.a(this.f62870b.hashCode(), 16);
    }
}
