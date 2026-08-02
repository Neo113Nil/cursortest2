package b1;

import com.google.common.collect.AbstractC3445z;
import e1.AbstractC4134a;
import e1.Z;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class T {

    /* renamed from: b, reason: collision with root package name */
    public static final T f24511b = new T(AbstractC3445z.t());

    /* renamed from: c, reason: collision with root package name */
    public static final String f24512c = Z.K0(0);

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC3445z f24513a;

    public static final class a {

        /* renamed from: d, reason: collision with root package name */
        public static final String f24514d = Z.K0(0);

        /* renamed from: e, reason: collision with root package name */
        public static final String f24515e = Z.K0(1);

        /* renamed from: f, reason: collision with root package name */
        public static final String f24516f = Z.K0(3);

        /* renamed from: g, reason: collision with root package name */
        public static final String f24517g = Z.K0(4);

        /* renamed from: a, reason: collision with root package name */
        public final int f24518a;

        /* renamed from: b, reason: collision with root package name */
        public final P f24519b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f24520c;
        private final boolean[] trackSelected;
        private final int[] trackSupport;

        public a(P p10, boolean z10, int[] iArr, boolean[] zArr) {
            int i10 = p10.f24395a;
            this.f24518a = i10;
            boolean z11 = false;
            AbstractC4134a.a(i10 == iArr.length && i10 == zArr.length);
            this.f24519b = p10;
            if (z10 && i10 > 1) {
                z11 = true;
            }
            this.f24520c = z11;
            this.trackSupport = (int[]) iArr.clone();
            this.trackSelected = (boolean[]) zArr.clone();
        }

        public P a() {
            return this.f24519b;
        }

        public androidx.media3.common.a b(int i10) {
            return this.f24519b.a(i10);
        }

        public int c(int i10) {
            return this.trackSupport[i10];
        }

        public int d() {
            return this.f24519b.f24397c;
        }

        public boolean e() {
            return this.f24520c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f24520c == aVar.f24520c && this.f24519b.equals(aVar.f24519b) && Arrays.equals(this.trackSupport, aVar.trackSupport) && Arrays.equals(this.trackSelected, aVar.trackSelected)) {
                    return true;
                }
            }
            return false;
        }

        public boolean f() {
            return com.google.common.primitives.a.a(this.trackSelected, true);
        }

        public boolean g(boolean z10) {
            for (int i10 = 0; i10 < this.trackSupport.length; i10++) {
                if (j(i10, z10)) {
                    return true;
                }
            }
            return false;
        }

        public boolean h(int i10) {
            return this.trackSelected[i10];
        }

        public int hashCode() {
            return (((((this.f24519b.hashCode() * 31) + (this.f24520c ? 1 : 0)) * 31) + Arrays.hashCode(this.trackSupport)) * 31) + Arrays.hashCode(this.trackSelected);
        }

        public boolean i(int i10) {
            return j(i10, false);
        }

        public boolean j(int i10, boolean z10) {
            int i11 = this.trackSupport[i10];
            if (i11 != 4) {
                return z10 && i11 == 3;
            }
            return true;
        }
    }

    public T(List list) {
        this.f24513a = AbstractC3445z.o(list);
    }

    public AbstractC3445z a() {
        return this.f24513a;
    }

    public boolean b() {
        return this.f24513a.isEmpty();
    }

    public boolean c(int i10) {
        for (int i11 = 0; i11 < this.f24513a.size(); i11++) {
            a aVar = (a) this.f24513a.get(i11);
            if (aVar.f() && aVar.d() == i10) {
                return true;
            }
        }
        return false;
    }

    public boolean d(int i10) {
        return e(i10, false);
    }

    public boolean e(int i10, boolean z10) {
        for (int i11 = 0; i11 < this.f24513a.size(); i11++) {
            if (((a) this.f24513a.get(i11)).d() == i10 && ((a) this.f24513a.get(i11)).g(z10)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || T.class != obj.getClass()) {
            return false;
        }
        return this.f24513a.equals(((T) obj).f24513a);
    }

    public int hashCode() {
        return this.f24513a.hashCode();
    }
}
