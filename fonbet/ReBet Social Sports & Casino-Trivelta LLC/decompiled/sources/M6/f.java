package M6;

import D6.n;
import java.util.List;

/* loaded from: classes2.dex */
public class f implements n {

    /* renamed from: a, reason: collision with root package name */
    public final List f7525a;

    public class a extends M6.a {

        /* renamed from: h, reason: collision with root package name */
        public int f7526h = 0;

        /* renamed from: i, reason: collision with root package name */
        public c f7527i = null;

        /* renamed from: j, reason: collision with root package name */
        public c f7528j = null;

        /* renamed from: M6.f$a$a, reason: collision with other inner class name */
        public class C0152a implements e {
            @Override // M6.e
            public void onFailure(c cVar) {
                a.this.D(cVar);
            }

            @Override // M6.e
            public void onNewResult(c cVar) {
                if (cVar.e()) {
                    a.this.E(cVar);
                } else if (cVar.d()) {
                    a.this.D(cVar);
                }
            }

            @Override // M6.e
            public void onProgressUpdate(c cVar) {
                a.this.r(Math.max(a.this.h(), cVar.h()));
            }

            public C0152a() {
            }

            @Override // M6.e
            public void onCancellation(c cVar) {
            }
        }

        public a() {
            if (G()) {
                return;
            }
            o(new RuntimeException("No data source supplier or supplier returned null."));
        }

        public final synchronized c A() {
            return this.f7528j;
        }

        public final synchronized n B() {
            if (j() || this.f7526h >= f.this.f7525a.size()) {
                return null;
            }
            List list = f.this.f7525a;
            int i10 = this.f7526h;
            this.f7526h = i10 + 1;
            return (n) list.get(i10);
        }

        public final void C(c cVar, boolean z10) {
            c cVar2;
            synchronized (this) {
                if (cVar == this.f7527i && cVar != (cVar2 = this.f7528j)) {
                    if (cVar2 != null && !z10) {
                        cVar2 = null;
                        z(cVar2);
                    }
                    this.f7528j = cVar;
                    z(cVar2);
                }
            }
        }

        public final void D(c cVar) {
            if (y(cVar)) {
                if (cVar != A()) {
                    z(cVar);
                }
                if (G()) {
                    return;
                }
                p(cVar.f(), cVar.getExtras());
            }
        }

        public final void E(c cVar) {
            C(cVar, cVar.d());
            if (cVar == A()) {
                t(null, cVar.d(), cVar.getExtras());
            }
        }

        public final synchronized boolean F(c cVar) {
            if (j()) {
                return false;
            }
            this.f7527i = cVar;
            return true;
        }

        public final boolean G() {
            n B10 = B();
            c cVar = B10 != null ? (c) B10.get() : null;
            if (!F(cVar) || cVar == null) {
                z(cVar);
                return false;
            }
            cVar.g(new C0152a(), B6.a.d());
            return true;
        }

        @Override // M6.a, M6.c
        public boolean close() {
            synchronized (this) {
                try {
                    if (!super.close()) {
                        return false;
                    }
                    c cVar = this.f7527i;
                    this.f7527i = null;
                    c cVar2 = this.f7528j;
                    this.f7528j = null;
                    z(cVar2);
                    z(cVar);
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // M6.a, M6.c
        public synchronized boolean e() {
            boolean z10;
            c A10 = A();
            if (A10 != null) {
                z10 = A10.e();
            }
            return z10;
        }

        @Override // M6.a, M6.c
        public synchronized Object getResult() {
            c A10;
            A10 = A();
            return A10 != null ? A10.getResult() : null;
        }

        public final synchronized boolean y(c cVar) {
            if (!j() && cVar == this.f7527i) {
                this.f7527i = null;
                return true;
            }
            return false;
        }

        public final void z(c cVar) {
            if (cVar != null) {
                cVar.close();
            }
        }
    }

    public f(List list) {
        D6.k.c(!list.isEmpty(), "List of suppliers is empty!");
        this.f7525a = list;
    }

    public static f b(List list) {
        return new f(list);
    }

    @Override // D6.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public c get() {
        return new a();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            return D6.i.a(this.f7525a, ((f) obj).f7525a);
        }
        return false;
    }

    public int hashCode() {
        return this.f7525a.hashCode();
    }

    public String toString() {
        return D6.i.b(this).b("list", this.f7525a).toString();
    }
}
