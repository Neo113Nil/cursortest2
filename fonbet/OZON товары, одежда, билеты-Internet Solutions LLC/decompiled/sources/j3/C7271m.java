package j3;

import android.util.SparseBooleanArray;

/* renamed from: j3.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7271m {

    /* renamed from: a, reason: collision with root package name */
    private final SparseBooleanArray f69093a;

    /* renamed from: j3.m$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final SparseBooleanArray f69094a = new SparseBooleanArray();

        /* renamed from: b, reason: collision with root package name */
        private boolean f69095b;

        public final void a(int i11) {
            G10.a.h(!this.f69095b);
            this.f69094a.append(i11, true);
        }

        public final C7271m b() {
            G10.a.h(!this.f69095b);
            this.f69095b = true;
            return new C7271m(this.f69094a);
        }
    }

    C7271m(SparseBooleanArray sparseBooleanArray) {
        this.f69093a = sparseBooleanArray;
    }

    public final boolean a(int i11) {
        return this.f69093a.get(i11);
    }

    public final boolean b(int... iArr) {
        for (int i11 : iArr) {
            if (this.f69093a.get(i11)) {
                return true;
            }
        }
        return false;
    }

    public final int c(int i11) {
        SparseBooleanArray sparseBooleanArray = this.f69093a;
        G10.a.d(i11, sparseBooleanArray.size());
        return sparseBooleanArray.keyAt(i11);
    }

    public final int d() {
        return this.f69093a.size();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7271m) {
            return this.f69093a.equals(((C7271m) obj).f69093a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f69093a.hashCode();
    }
}
