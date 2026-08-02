package androidx.media3.effect;

import android.content.Context;
import android.util.SparseArray;
import android.view.Surface;
import androidx.media3.effect.i;
import b1.C2357k;
import b1.C2366u;
import b1.C2368w;
import b1.InterfaceC2336E;
import b1.InterfaceC2367v;
import b1.V;
import e1.AbstractC4134a;
import e1.Z;
import java.util.concurrent.Executor;
import l1.C5381t;
import l1.Q;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final Context f20784a;

    /* renamed from: b, reason: collision with root package name */
    public final C2357k f20785b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2367v f20786c;

    /* renamed from: d, reason: collision with root package name */
    public final r f20787d;

    /* renamed from: e, reason: collision with root package name */
    public final i.a f20788e;

    /* renamed from: f, reason: collision with root package name */
    public final Executor f20789f;

    /* renamed from: g, reason: collision with root package name */
    public final SparseArray f20790g;

    /* renamed from: h, reason: collision with root package name */
    public final int f20791h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f20792i;

    /* renamed from: j, reason: collision with root package name */
    public i f20793j;

    /* renamed from: k, reason: collision with root package name */
    public p f20794k;

    public static final class a implements i.c, i.b {

        /* renamed from: a, reason: collision with root package name */
        public final c f20795a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f20796b;

        public a(InterfaceC2367v interfaceC2367v, i iVar, i iVar2, r rVar) {
            this.f20795a = new c(interfaceC2367v, iVar, iVar2, rVar);
        }

        @Override // androidx.media3.effect.i.b
        public synchronized void a() {
            if (this.f20796b) {
                this.f20795a.a();
            }
        }

        @Override // androidx.media3.effect.i.b
        public void b(C2368w c2368w) {
            if (this.f20796b) {
                this.f20795a.b(c2368w);
            }
        }

        @Override // androidx.media3.effect.i.c
        public synchronized void c() {
            if (this.f20796b) {
                this.f20795a.c();
            }
        }

        @Override // androidx.media3.effect.i.c
        public synchronized void d(C2368w c2368w, long j10) {
            if (this.f20796b) {
                this.f20795a.d(c2368w, j10);
            }
        }

        @Override // androidx.media3.effect.i.b
        public void e() {
            if (this.f20796b) {
                this.f20795a.e();
            }
        }

        public void f(boolean z10) {
            this.f20796b = z10;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final p f20797a;

        /* renamed from: b, reason: collision with root package name */
        public Q f20798b;

        /* renamed from: c, reason: collision with root package name */
        public a f20799c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f20800d;

        public b(p pVar) {
            this.f20797a = pVar;
        }

        public Q b() {
            return this.f20798b;
        }

        public void c() {
            if (this.f20800d) {
                return;
            }
            this.f20800d = true;
            this.f20797a.k();
            Q q10 = this.f20798b;
            if (q10 != null) {
                q10.release();
            }
        }

        public void d(boolean z10) {
            a aVar = this.f20799c;
            if (aVar == null) {
                return;
            }
            aVar.f(z10);
        }

        public void e(a aVar) {
            this.f20799c = aVar;
            ((Q) AbstractC4134a.e(this.f20798b)).l(aVar);
        }

        public void f(Q q10) {
            Q q11 = this.f20798b;
            if (q11 != null) {
                q11.release();
            }
            this.f20798b = q10;
            this.f20797a.p(q10);
            q10.n(this.f20797a);
        }
    }

    public k(Context context, C2357k c2357k, InterfaceC2367v interfaceC2367v, r rVar, Executor executor, i.a aVar, int i10, boolean z10, boolean z11, boolean z12) {
        this.f20784a = context;
        this.f20785b = c2357k;
        this.f20786c = interfaceC2367v;
        this.f20787d = rVar;
        this.f20789f = executor;
        this.f20788e = aVar;
        SparseArray sparseArray = new SparseArray();
        this.f20790g = sparseArray;
        this.f20791h = i10;
        this.f20792i = z11;
        b bVar = new b(new f(interfaceC2367v, rVar, z10, z11));
        sparseArray.put(1, bVar);
        sparseArray.put(4, bVar);
        sparseArray.put(2, new b(new androidx.media3.effect.b(interfaceC2367v, rVar, z12)));
        sparseArray.put(3, new b(new o(interfaceC2367v, rVar)));
    }

    public p a() {
        return (p) AbstractC4134a.i(this.f20794k);
    }

    public final C5381t b(C2357k c2357k, int i10) {
        C5381t t10;
        if (i10 != 1) {
            if (i10 == 2 || i10 == 3) {
                t10 = C5381t.u(this.f20784a, c2357k, this.f20785b, this.f20791h, i10);
                t10.f(this.f20789f, this.f20788e);
                return t10;
            }
            if (i10 != 4) {
                throw new V("Unsupported input type " + i10);
            }
        }
        t10 = C5381t.t(this.f20784a, c2357k, this.f20785b, this.f20791h, this.f20792i);
        t10.f(this.f20789f, this.f20788e);
        return t10;
    }

    public Surface c() {
        AbstractC4134a.g(Z.q(this.f20790g, 1));
        return ((b) this.f20790g.get(1)).f20797a.f();
    }

    public boolean d() {
        return this.f20794k != null;
    }

    public void e() {
        for (int i10 = 0; i10 < this.f20790g.size(); i10++) {
            SparseArray sparseArray = this.f20790g;
            ((b) sparseArray.get(sparseArray.keyAt(i10))).c();
        }
    }

    public void f(i iVar) {
        this.f20793j = iVar;
    }

    public void g(InterfaceC2336E interfaceC2336E) {
        AbstractC4134a.g(Z.q(this.f20790g, 3));
        ((b) this.f20790g.get(3)).f20797a.o(interfaceC2336E);
    }

    public void h() {
        ((p) AbstractC4134a.e(this.f20794k)).q();
    }

    public void i(int i10, C2366u c2366u) {
        AbstractC4134a.i(this.f20793j);
        AbstractC4134a.h(Z.q(this.f20790g, i10), "Input type not registered: " + i10);
        for (int i11 = 0; i11 < this.f20790g.size(); i11++) {
            SparseArray sparseArray = this.f20790g;
            ((b) sparseArray.get(sparseArray.keyAt(i11))).d(false);
        }
        b bVar = (b) this.f20790g.get(i10);
        bVar.f(b((C2357k) AbstractC4134a.e(c2366u.f24632a.f20516D), i10));
        bVar.e(new a(this.f20786c, (i) AbstractC4134a.e(bVar.b()), this.f20793j, this.f20787d));
        bVar.d(true);
        this.f20793j.n((i.b) AbstractC4134a.e(bVar.f20799c));
        p pVar = bVar.f20797a;
        this.f20794k = pVar;
        ((p) AbstractC4134a.e(pVar)).m(c2366u, i10 == 4);
    }
}
