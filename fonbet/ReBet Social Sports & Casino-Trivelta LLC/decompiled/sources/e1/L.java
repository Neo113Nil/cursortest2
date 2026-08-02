package e1;

import lb.C5444x;

/* loaded from: classes.dex */
public final class L {

    /* renamed from: c, reason: collision with root package name */
    public static final L f45487c = new L(-1, -1);

    /* renamed from: d, reason: collision with root package name */
    public static final L f45488d = new L(0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f45489a;

    /* renamed from: b, reason: collision with root package name */
    public final int f45490b;

    public L(int i10, int i11) {
        AbstractC4134a.a((i10 == -1 || i10 >= 0) && (i11 == -1 || i11 >= 0));
        this.f45489a = i10;
        this.f45490b = i11;
    }

    public int a() {
        return this.f45490b;
    }

    public int b() {
        return this.f45489a;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof L) {
            L l10 = (L) obj;
            if (this.f45489a == l10.f45489a && this.f45490b == l10.f45490b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = this.f45490b;
        int i11 = this.f45489a;
        return i10 ^ ((i11 >>> 16) | (i11 << 16));
    }

    public String toString() {
        return this.f45489a + C5444x.f55808b + this.f45490b;
    }
}
