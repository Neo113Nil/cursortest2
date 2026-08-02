package H1;

import e1.AbstractC4134a;

/* loaded from: classes.dex */
public interface J {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final K f4334a;

        /* renamed from: b, reason: collision with root package name */
        public final K f4335b;

        public a(K k10) {
            this(k10, k10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f4334a.equals(aVar.f4334a) && this.f4335b.equals(aVar.f4335b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.f4334a.hashCode() * 31) + this.f4335b.hashCode();
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[");
            sb2.append(this.f4334a);
            if (this.f4334a.equals(this.f4335b)) {
                str = "";
            } else {
                str = ", " + this.f4335b;
            }
            sb2.append(str);
            sb2.append("]");
            return sb2.toString();
        }

        public a(K k10, K k11) {
            this.f4334a = (K) AbstractC4134a.e(k10);
            this.f4335b = (K) AbstractC4134a.e(k11);
        }
    }

    public static class b implements J {

        /* renamed from: a, reason: collision with root package name */
        public final long f4336a;

        /* renamed from: b, reason: collision with root package name */
        public final a f4337b;

        public b(long j10) {
            this(j10, 0L);
        }

        @Override // H1.J
        public a e(long j10) {
            return this.f4337b;
        }

        @Override // H1.J
        public boolean i() {
            return false;
        }

        @Override // H1.J
        public long m() {
            return this.f4336a;
        }

        public b(long j10, long j11) {
            this.f4336a = j10;
            this.f4337b = new a(j11 == 0 ? K.f4338c : new K(0L, j11));
        }
    }

    a e(long j10);

    boolean i();

    long m();
}
