package k5;

import B90.C2618u;
import android.content.Context;

/* loaded from: classes8.dex */
public final class N0 implements Rm0.a {

    /* renamed from: a, reason: collision with root package name */
    private final Y1 f70609a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private Y1 f70610a;

        /* renamed from: b, reason: collision with root package name */
        private M8.b f70611b;

        /* renamed from: c, reason: collision with root package name */
        private C2618u f70612c;

        public final N0 a() {
            Jb.j.a(Y1.class, this.f70610a);
            Jb.j.a(Rm0.e.class, this.f70611b);
            Jb.j.a(Rm0.d.class, this.f70612c);
            return new N0(this.f70610a);
        }

        public final void b(C2618u c2618u) {
            c2618u.getClass();
            this.f70612c = c2618u;
        }

        public final void c(M8.b bVar) {
            bVar.getClass();
            this.f70611b = bVar;
        }

        public final void d(Y1 y12) {
            y12.getClass();
            this.f70610a = y12;
        }
    }

    N0(Y1 y12) {
        this.f70609a = y12;
    }

    @Override // Rm0.a
    public final R1 a() {
        Context b11 = this.f70609a.b();
        Jb.j.b(b11, "Cannot return null from a non-@Nullable component method");
        return new R1(b11);
    }
}
