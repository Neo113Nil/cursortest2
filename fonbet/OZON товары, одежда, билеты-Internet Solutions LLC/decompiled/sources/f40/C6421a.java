package f40;

import Jb.d;
import d40.InterfaceC6083a;
import f40.c;
import h40.C6799a;

/* renamed from: f40.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6421a {

    /* renamed from: f40.a$a, reason: collision with other inner class name */
    private static final class C0990a implements c {

        /* renamed from: a, reason: collision with root package name */
        private Pc.a<InterfaceC6083a> f62731a = d.b(C6799a.a());

        C0990a() {
        }

        @Override // f40.InterfaceC6422b
        public final InterfaceC6083a G0() {
            return this.f62731a.get();
        }
    }

    /* renamed from: f40.a$b */
    private static final class b implements c.a {
        @Override // f40.c.a
        public final c a(P30.b bVar) {
            bVar.getClass();
            return new C0990a();
        }
    }

    public static c.a a() {
        return new b();
    }
}
