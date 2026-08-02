package mi;

import li.AbstractC5469c;

/* loaded from: classes5.dex */
public abstract class h {

    public static class a extends h {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f56634a;

        public a(int i10) {
            this.f56634a = i10;
        }

        @Override // mi.h
        public int d() {
            return AbstractC5469c.e(this.f56634a, 2636);
        }
    }

    public static h a(int i10) {
        if (i10 >= 1) {
            return b(AbstractC5469c.e(i10, -2333));
        }
        throw new IllegalArgumentException("Dangi year must not be smaller than 1: " + i10);
    }

    public static h b(int i10) {
        return new a(i10);
    }

    public final int c() {
        return AbstractC5469c.a(d(), 60) + 1;
    }

    public abstract int d();

    public final C5591b e() {
        int c10 = AbstractC5469c.c(d() + 1, 60);
        return C5591b.n(c10 != 0 ? c10 : 60);
    }
}
