package net.time4j.history;

/* loaded from: classes5.dex */
public final class h implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final j f58196a;

    /* renamed from: b, reason: collision with root package name */
    public final int f58197b;

    /* renamed from: c, reason: collision with root package name */
    public final int f58198c;

    /* renamed from: d, reason: collision with root package name */
    public final int f58199d;

    public h(j jVar, int i10, int i11, int i12) {
        this.f58196a = jVar;
        this.f58197b = i10;
        this.f58198c = i11;
        this.f58199d = i12;
    }

    public static h g(j jVar, int i10, int i11, int i12) {
        return h(jVar, i10, i11, i12, p.DUAL_DATING, o.f58233d);
    }

    public static h h(j jVar, int i10, int i11, int i12, p pVar, o oVar) {
        j jVar2;
        int i13;
        int i14;
        if (jVar == null) {
            throw new NullPointerException("Missing historic era.");
        }
        if (i12 < 1 || i12 > 31) {
            throw new IllegalArgumentException("Day of month out of range: " + i(jVar, i10, i11, i12));
        }
        if (i11 < 1 || i11 > 12) {
            throw new IllegalArgumentException("Month out of range: " + i(jVar, i10, i11, i12));
        }
        if (jVar == j.BYZANTINE) {
            if (i10 < 0 || (i10 == 0 && i11 < 9)) {
                throw new IllegalArgumentException("Before creation of the world: " + i(jVar, i10, i11, i12));
            }
        } else if (i10 < 1) {
            throw new IllegalArgumentException("Year of era must be positive: " + i(jVar, i10, i11, i12));
        }
        if (pVar.equals(p.DUAL_DATING)) {
            jVar2 = jVar;
            i13 = i11;
            i14 = i12;
        } else {
            jVar2 = jVar;
            i13 = i11;
            i14 = i12;
            i10 = oVar.f(jVar, i10).c(pVar == p.AFTER_NEW_YEAR, oVar, jVar2, i10, i13, i14);
        }
        return new h(jVar2, i10, i13, i14);
    }

    public static String i(j jVar, int i10, int i11, int i12) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(jVar);
        sb2.append('-');
        String valueOf = String.valueOf(i10);
        for (int length = 4 - valueOf.length(); length > 0; length--) {
            sb2.append('0');
        }
        sb2.append(valueOf);
        sb2.append('-');
        if (i11 < 10) {
            sb2.append('0');
        }
        sb2.append(i11);
        sb2.append('-');
        if (i12 < 10) {
            sb2.append('0');
        }
        sb2.append(i12);
        return sb2.toString();
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(h hVar) {
        int a10 = this.f58196a.a(this.f58197b);
        int a11 = hVar.f58196a.a(hVar.f58197b);
        if (a10 < a11) {
            return -1;
        }
        if (a10 > a11) {
            return 1;
        }
        int d10 = d() - hVar.d();
        if (d10 == 0) {
            d10 = b() - hVar.b();
        }
        if (d10 < 0) {
            return -1;
        }
        return d10 > 0 ? 1 : 0;
    }

    public int b() {
        return this.f58199d;
    }

    public j c() {
        return this.f58196a;
    }

    public int d() {
        return this.f58198c;
    }

    public int e() {
        return this.f58197b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f58196a == hVar.f58196a && this.f58197b == hVar.f58197b && this.f58198c == hVar.f58198c && this.f58199d == hVar.f58199d) {
                return true;
            }
        }
        return false;
    }

    public int f(o oVar) {
        return oVar.c(this);
    }

    public int hashCode() {
        int i10 = (this.f58197b * 1000) + (this.f58198c * 32) + this.f58199d;
        return this.f58196a == j.AD ? i10 : -i10;
    }

    public String toString() {
        return i(this.f58196a, this.f58197b, this.f58198c, this.f58199d);
    }
}
