package ri0;

import Ga0.e;
import Hj0.C3144a;
import Jb.f;
import android.app.Application;
import android.content.Context;
import lj0.C7967a;
import pi0.g;
import qi0.o;
import ri0.InterfaceC9285d;
import ti0.C9878a;
import zi0.C11145a;

/* renamed from: ri0.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C9283b {

    /* renamed from: ri0.b$a */
    private static final class a implements InterfaceC9285d.a {
        @Override // ri0.InterfaceC9285d.a
        public final InterfaceC9285d create(Application application) {
            application.getClass();
            return new C1428b(new S8.d(2), application);
        }
    }

    /* renamed from: ri0.b$b, reason: collision with other inner class name */
    private static final class C1428b implements InterfaceC9285d {

        /* renamed from: a, reason: collision with root package name */
        private Pc.a<Context> f83573a;

        /* renamed from: b, reason: collision with root package name */
        private Pc.a<C7967a> f83574b;

        /* renamed from: c, reason: collision with root package name */
        private Pc.a<ij0.d> f83575c;

        /* renamed from: d, reason: collision with root package name */
        private Pc.a<g> f83576d;

        /* renamed from: e, reason: collision with root package name */
        private Pc.a<C11145a> f83577e;

        C1428b(S8.d dVar, Application application) {
            Pc.a<Context> b11 = Jb.d.b(new C9878a(dVar, f.a(application)));
            this.f83573a = b11;
            Pc.a<C7967a> b12 = Jb.d.b(new C3144a(b11, 1));
            this.f83574b = b12;
            Pc.a<ij0.d> b13 = Jb.d.b(new e(b12, 1));
            this.f83575c = b13;
            this.f83576d = Jb.d.b(new o(b13));
            this.f83577e = Jb.d.b(new o00.d(this.f83575c));
        }

        @Override // ri0.InterfaceC9285d
        public final g a() {
            return this.f83576d.get();
        }

        @Override // ri0.InterfaceC9285d
        public final C7967a b() {
            return this.f83574b.get();
        }
    }

    public static InterfaceC9285d.a a() {
        return new a();
    }
}
