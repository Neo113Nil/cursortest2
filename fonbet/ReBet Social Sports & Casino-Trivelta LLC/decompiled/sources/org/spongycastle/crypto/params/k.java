package org.spongycastle.crypto.params;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public class k implements org.spongycastle.math.ec.c {

    /* renamed from: g, reason: collision with root package name */
    public org.spongycastle.math.ec.d f62663g;

    /* renamed from: h, reason: collision with root package name */
    public org.spongycastle.math.ec.g f62664h;

    /* renamed from: i, reason: collision with root package name */
    public BigInteger f62665i;

    /* renamed from: j, reason: collision with root package name */
    public BigInteger f62666j;
    private byte[] seed;

    public k(org.spongycastle.math.ec.d dVar, org.spongycastle.math.ec.g gVar, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this.f62663g = dVar;
        this.f62664h = gVar.v();
        this.f62665i = bigInteger;
        this.f62666j = bigInteger2;
        this.seed = bArr;
    }

    public org.spongycastle.math.ec.d a() {
        return this.f62663g;
    }

    public org.spongycastle.math.ec.g b() {
        return this.f62664h;
    }

    public BigInteger c() {
        return this.f62666j;
    }

    public BigInteger d() {
        return this.f62665i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (this.f62663g.l(kVar.f62663g) && this.f62664h.d(kVar.f62664h) && this.f62665i.equals(kVar.f62665i) && this.f62666j.equals(kVar.f62666j)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f62663g.hashCode() * 37) ^ this.f62664h.hashCode()) * 37) ^ this.f62665i.hashCode()) * 37) ^ this.f62666j.hashCode();
    }
}
