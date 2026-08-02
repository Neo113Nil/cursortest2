package androidx.media3.exoplayer.source;

import D1.e;
import android.os.Handler;
import b1.AbstractC2346O;
import e2.s;
import h1.InterfaceC4403F;
import n1.G1;

/* loaded from: classes.dex */
public interface D {

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final Object f21516a;

        /* renamed from: b, reason: collision with root package name */
        public final int f21517b;

        /* renamed from: c, reason: collision with root package name */
        public final int f21518c;

        /* renamed from: d, reason: collision with root package name */
        public final long f21519d;

        /* renamed from: e, reason: collision with root package name */
        public final int f21520e;

        public b(Object obj) {
            this(obj, -1L);
        }

        public b a(Object obj) {
            return this.f21516a.equals(obj) ? this : new b(obj, this.f21517b, this.f21518c, this.f21519d, this.f21520e);
        }

        public boolean b() {
            return this.f21517b != -1;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f21516a.equals(bVar.f21516a) && this.f21517b == bVar.f21517b && this.f21518c == bVar.f21518c && this.f21519d == bVar.f21519d && this.f21520e == bVar.f21520e;
        }

        public int hashCode() {
            return ((((((((527 + this.f21516a.hashCode()) * 31) + this.f21517b) * 31) + this.f21518c) * 31) + ((int) this.f21519d)) * 31) + this.f21520e;
        }

        public b(Object obj, long j10) {
            this(obj, -1, -1, j10, -1);
        }

        public b(Object obj, long j10, int i10) {
            this(obj, -1, -1, j10, i10);
        }

        public b(Object obj, int i10, int i11, long j10) {
            this(obj, i10, i11, j10, -1);
        }

        public b(Object obj, int i10, int i11, long j10, int i12) {
            this.f21516a = obj;
            this.f21517b = i10;
            this.f21518c = i11;
            this.f21519d = j10;
            this.f21520e = i12;
        }
    }

    public interface c {
        void a(D d10, AbstractC2346O abstractC2346O);
    }

    void a(Handler handler, L l10);

    void b(L l10);

    C c(b bVar, D1.b bVar2, long j10);

    b1.z d();

    void f(C c10);

    void g(c cVar);

    void k(c cVar);

    void m(c cVar);

    void p(c cVar, InterfaceC4403F interfaceC4403F, G1 g12);

    void q();

    default boolean r() {
        return true;
    }

    default AbstractC2346O s() {
        return null;
    }

    void t(q1.t tVar);

    void u(Handler handler, q1.t tVar);

    public interface a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f21515a = M.f21548b;

        default a b(boolean z10) {
            return this;
        }

        default a c(int i10) {
            return this;
        }

        a d(q1.w wVar);

        D e(b1.z zVar);

        a g(D1.k kVar);

        default a a(s.a aVar) {
            return this;
        }

        default a f(e.a aVar) {
            return this;
        }
    }

    default void n(b1.z zVar) {
    }
}
