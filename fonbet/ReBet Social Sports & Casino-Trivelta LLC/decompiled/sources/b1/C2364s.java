package b1;

import android.util.SparseBooleanArray;
import e1.AbstractC4134a;

/* renamed from: b1.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2364s {

    /* renamed from: a, reason: collision with root package name */
    public final SparseBooleanArray f24629a;

    /* renamed from: b1.s$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final SparseBooleanArray f24630a = new SparseBooleanArray();

        /* renamed from: b, reason: collision with root package name */
        public boolean f24631b;

        public b a(int i10) {
            AbstractC4134a.g(!this.f24631b);
            this.f24630a.append(i10, true);
            return this;
        }

        public b b(C2364s c2364s) {
            for (int i10 = 0; i10 < c2364s.d(); i10++) {
                a(c2364s.c(i10));
            }
            return this;
        }

        public b c(int... iArr) {
            for (int i10 : iArr) {
                a(i10);
            }
            return this;
        }

        public b d(int i10, boolean z10) {
            return z10 ? a(i10) : this;
        }

        public C2364s e() {
            AbstractC4134a.g(!this.f24631b);
            this.f24631b = true;
            return new C2364s(this.f24630a);
        }
    }

    public boolean a(int i10) {
        return this.f24629a.get(i10);
    }

    public boolean b(int... iArr) {
        for (int i10 : iArr) {
            if (a(i10)) {
                return true;
            }
        }
        return false;
    }

    public int c(int i10) {
        AbstractC4134a.c(i10, 0, d());
        return this.f24629a.keyAt(i10);
    }

    public int d() {
        return this.f24629a.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2364s) {
            return this.f24629a.equals(((C2364s) obj).f24629a);
        }
        return false;
    }

    public int hashCode() {
        return this.f24629a.hashCode();
    }

    public C2364s(SparseBooleanArray sparseBooleanArray) {
        this.f24629a = sparseBooleanArray;
    }
}
