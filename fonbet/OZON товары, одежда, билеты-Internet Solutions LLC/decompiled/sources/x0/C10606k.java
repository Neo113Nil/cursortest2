package x0;

import org.jetbrains.annotations.NotNull;

/* renamed from: x0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10606k {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final U0.b<a> f104772a = new U0.b<>(new a[16]);

    /* renamed from: x0.k$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f104773a;

        /* renamed from: b, reason: collision with root package name */
        private final int f104774b;

        public a(int i11, int i12) {
            this.f104773a = i11;
            this.f104774b = i12;
            if (i11 < 0) {
                throw new IllegalArgumentException("negative start index");
            }
            if (i12 < i11) {
                throw new IllegalArgumentException("end index greater than start");
            }
        }

        public final int a() {
            return this.f104774b;
        }

        public final int b() {
            return this.f104773a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f104773a == aVar.f104773a && this.f104774b == aVar.f104774b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f104774b) + (Integer.hashCode(this.f104773a) * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Interval(start=");
            sb2.append(this.f104773a);
            sb2.append(", end=");
            return Ek.a.d(sb2, this.f104774b, ')');
        }
    }

    @NotNull
    public final a a(int i11, int i12) {
        a aVar = new a(i11, i12);
        this.f104772a.b(aVar);
        return aVar;
    }

    public final int b() {
        U0.b<a> bVar = this.f104772a;
        int a11 = bVar.k().a();
        int m11 = bVar.m();
        if (m11 > 0) {
            a[] l11 = bVar.l();
            int i11 = 0;
            do {
                a aVar = l11[i11];
                if (aVar.a() > a11) {
                    a11 = aVar.a();
                }
                i11++;
            } while (i11 < m11);
        }
        return a11;
    }

    public final int c() {
        U0.b<a> bVar = this.f104772a;
        int b11 = bVar.k().b();
        int m11 = bVar.m();
        if (m11 > 0) {
            a[] l11 = bVar.l();
            int i11 = 0;
            do {
                a aVar = l11[i11];
                if (aVar.b() < b11) {
                    b11 = aVar.b();
                }
                i11++;
            } while (i11 < m11);
        }
        if (b11 >= 0) {
            return b11;
        }
        throw new IllegalArgumentException("negative minIndex");
    }

    public final boolean d() {
        return this.f104772a.p();
    }

    public final void e(@NotNull a aVar) {
        this.f104772a.s(aVar);
    }
}
