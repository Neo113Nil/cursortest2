package org.spongycastle.crypto.params;

/* loaded from: classes5.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public int f62662a;
    private byte[] seed;

    public j(byte[] bArr, int i10) {
        this.seed = bArr;
        this.f62662a = i10;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (jVar.f62662a != this.f62662a) {
            return false;
        }
        return Aj.a.a(this.seed, jVar.seed);
    }

    public int hashCode() {
        return this.f62662a ^ Aj.a.q(this.seed);
    }
}
