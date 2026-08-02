package M6;

import D6.n;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public class i implements n {

    /* renamed from: a, reason: collision with root package name */
    public final Set f7542a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b, reason: collision with root package name */
    public n f7543b = null;

    public static class a extends M6.a {

        /* renamed from: h, reason: collision with root package name */
        public c f7544h;

        /* renamed from: M6.i$a$a, reason: collision with other inner class name */
        public class C0154a implements e {
            @Override // M6.e
            public void onFailure(c cVar) {
                a.this.A();
            }

            @Override // M6.e
            public void onNewResult(c cVar) {
                if (cVar.e()) {
                    a.this.B(cVar);
                } else if (cVar.d()) {
                    a.this.A();
                }
            }

            @Override // M6.e
            public void onProgressUpdate(c cVar) {
                a.this.C(cVar);
            }

            public C0154a() {
            }

            @Override // M6.e
            public void onCancellation(c cVar) {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void B(c cVar) {
            if (cVar == this.f7544h) {
                t(null, false, cVar.getExtras());
            }
        }

        private static void z(c cVar) {
            if (cVar != null) {
                cVar.close();
            }
        }

        public final void C(c cVar) {
            if (cVar == this.f7544h) {
                r(cVar.h());
            }
        }

        public void D(n nVar) {
            if (j()) {
                return;
            }
            c cVar = nVar != null ? (c) nVar.get() : null;
            synchronized (this) {
                try {
                    if (j()) {
                        z(cVar);
                        return;
                    }
                    c cVar2 = this.f7544h;
                    this.f7544h = cVar;
                    if (cVar != null) {
                        cVar.g(new C0154a(), B6.a.d());
                    }
                    z(cVar2);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // M6.a, M6.c
        public boolean close() {
            synchronized (this) {
                try {
                    if (!super.close()) {
                        return false;
                    }
                    c cVar = this.f7544h;
                    this.f7544h = null;
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
            c cVar = this.f7544h;
            if (cVar != null) {
                z10 = cVar.e();
            }
            return z10;
        }

        @Override // M6.a, M6.c
        public synchronized Object getResult() {
            c cVar;
            cVar = this.f7544h;
            return cVar != null ? cVar.getResult() : null;
        }

        @Override // M6.a, M6.c
        public boolean i() {
            return true;
        }

        public a() {
            this.f7544h = null;
        }

        public final void A() {
        }
    }

    @Override // D6.n
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public c get() {
        a aVar = new a();
        aVar.D(this.f7543b);
        this.f7542a.add(aVar);
        return aVar;
    }

    public void b(n nVar) {
        this.f7543b = nVar;
        for (a aVar : this.f7542a) {
            if (!aVar.j()) {
                aVar.D(nVar);
            }
        }
    }
}
