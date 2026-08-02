package j3;

import com.google.common.collect.AbstractC5880y;
import java.util.Arrays;
import java.util.List;

/* renamed from: j3.L, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7256L {

    /* renamed from: b, reason: collision with root package name */
    public static final C7256L f69033b = new C7256L(AbstractC5880y.v());

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC5880y<a> f69034a;

    /* renamed from: j3.L$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f69035a;

        /* renamed from: b, reason: collision with root package name */
        private final C7253I f69036b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f69037c;

        /* renamed from: d, reason: collision with root package name */
        private final int[] f69038d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean[] f69039e;

        static {
            m3.N.L(0);
            m3.N.L(1);
            m3.N.L(3);
            m3.N.L(4);
        }

        public a(C7253I c7253i, boolean z11, int[] iArr, boolean[] zArr) {
            int i11 = c7253i.f68962a;
            this.f69035a = i11;
            boolean z12 = false;
            G10.a.c(i11 == iArr.length && i11 == zArr.length);
            this.f69036b = c7253i;
            if (z11 && i11 > 1) {
                z12 = true;
            }
            this.f69037c = z12;
            this.f69038d = (int[]) iArr.clone();
            this.f69039e = (boolean[]) zArr.clone();
        }

        public final C7253I a() {
            return this.f69036b;
        }

        public final C7272n b(int i11) {
            return this.f69036b.a(i11);
        }

        public final int c() {
            return this.f69036b.f68964c;
        }

        public final boolean d() {
            for (boolean z11 : this.f69039e) {
                if (z11) {
                    return true;
                }
            }
            return false;
        }

        public final boolean e() {
            for (int i11 = 0; i11 < this.f69038d.length; i11++) {
                if (g(i11)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f69037c == aVar.f69037c && this.f69036b.equals(aVar.f69036b) && Arrays.equals(this.f69038d, aVar.f69038d) && Arrays.equals(this.f69039e, aVar.f69039e)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean f(int i11) {
            return this.f69039e[i11];
        }

        public final boolean g(int i11) {
            return this.f69038d[i11] == 4;
        }

        public final int hashCode() {
            return Arrays.hashCode(this.f69039e) + ((Arrays.hashCode(this.f69038d) + (((this.f69036b.hashCode() * 31) + (this.f69037c ? 1 : 0)) * 31)) * 31);
        }
    }

    static {
        m3.N.L(0);
    }

    public C7256L(List<a> list) {
        this.f69034a = AbstractC5880y.n(list);
    }

    public final AbstractC5880y<a> a() {
        return this.f69034a;
    }

    public final boolean b() {
        return this.f69034a.isEmpty();
    }

    public final boolean c(int i11) {
        int i12 = 0;
        while (true) {
            AbstractC5880y<a> abstractC5880y = this.f69034a;
            if (i12 >= abstractC5880y.size()) {
                return false;
            }
            a aVar = abstractC5880y.get(i12);
            if (aVar.d() && aVar.c() == i11) {
                return true;
            }
            i12++;
        }
    }

    public final boolean d() {
        int i11 = 0;
        while (true) {
            AbstractC5880y<a> abstractC5880y = this.f69034a;
            if (i11 >= abstractC5880y.size()) {
                return false;
            }
            if (abstractC5880y.get(i11).c() == 2 && abstractC5880y.get(i11).e()) {
                return true;
            }
            i11++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7256L.class != obj.getClass()) {
            return false;
        }
        return this.f69034a.equals(((C7256L) obj).f69034a);
    }

    public final int hashCode() {
        return this.f69034a.hashCode();
    }
}
