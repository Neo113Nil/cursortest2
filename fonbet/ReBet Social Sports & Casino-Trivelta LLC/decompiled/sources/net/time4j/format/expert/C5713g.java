package net.time4j.format.expert;

/* renamed from: net.time4j.format.expert.g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5713g {

    /* renamed from: a, reason: collision with root package name */
    public final oi.p f57957a;

    /* renamed from: b, reason: collision with root package name */
    public final int f57958b;

    /* renamed from: c, reason: collision with root package name */
    public final int f57959c;

    public C5713g(oi.p pVar, int i10, int i11) {
        if (pVar == null) {
            throw new NullPointerException("Missing chronological element.");
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("Negative start index: " + i10 + " (" + pVar.name() + ")");
        }
        if (i11 > i10) {
            this.f57957a = pVar;
            this.f57958b = i10;
            this.f57959c = i11;
            return;
        }
        throw new IllegalArgumentException("End index " + i11 + " must be greater than start index " + i10 + " (" + pVar.name() + ")");
    }

    public oi.p a() {
        return this.f57957a;
    }

    public int b() {
        return this.f57959c;
    }

    public int c() {
        return this.f57958b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5713g) {
            C5713g c5713g = (C5713g) obj;
            if (this.f57957a.equals(c5713g.f57957a) && this.f57958b == c5713g.f57958b && this.f57959c == c5713g.f57959c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f57957a.hashCode() + ((this.f57958b | (this.f57959c << 16)) * 37);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(80);
        sb2.append(C5713g.class.getName());
        sb2.append("[element=");
        sb2.append(this.f57957a.name());
        sb2.append(",start-index=");
        sb2.append(this.f57958b);
        sb2.append(",end-index=");
        sb2.append(this.f57959c);
        sb2.append(']');
        return sb2.toString();
    }
}
