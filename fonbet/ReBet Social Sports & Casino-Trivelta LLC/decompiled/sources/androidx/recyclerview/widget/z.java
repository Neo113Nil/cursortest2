package androidx.recyclerview.widget;

import androidx.core.util.Pools$SimplePool;
import androidx.recyclerview.widget.RecyclerView;
import x0.InterfaceC6775d;
import z.C6907h;

/* loaded from: classes.dex */
public class z {

    /* renamed from: a, reason: collision with root package name */
    public final z.r f23236a = new z.r();

    /* renamed from: b, reason: collision with root package name */
    public final C6907h f23237b = new C6907h();

    public static class a {

        /* renamed from: d, reason: collision with root package name */
        public static InterfaceC6775d f23238d = new Pools$SimplePool(20);

        /* renamed from: a, reason: collision with root package name */
        public int f23239a;

        /* renamed from: b, reason: collision with root package name */
        public RecyclerView.n.c f23240b;

        /* renamed from: c, reason: collision with root package name */
        public RecyclerView.n.c f23241c;

        public static void a() {
            while (f23238d.acquire() != null) {
            }
        }

        public static a b() {
            a aVar = (a) f23238d.acquire();
            return aVar == null ? new a() : aVar;
        }

        public static void c(a aVar) {
            aVar.f23239a = 0;
            aVar.f23240b = null;
            aVar.f23241c = null;
            f23238d.release(aVar);
        }
    }

    public interface b {
        void a(RecyclerView.F f10, RecyclerView.n.c cVar, RecyclerView.n.c cVar2);

        void b(RecyclerView.F f10);

        void c(RecyclerView.F f10, RecyclerView.n.c cVar, RecyclerView.n.c cVar2);

        void d(RecyclerView.F f10, RecyclerView.n.c cVar, RecyclerView.n.c cVar2);
    }

    public void a(RecyclerView.F f10, RecyclerView.n.c cVar) {
        a aVar = (a) this.f23236a.get(f10);
        if (aVar == null) {
            aVar = a.b();
            this.f23236a.put(f10, aVar);
        }
        aVar.f23239a |= 2;
        aVar.f23240b = cVar;
    }

    public void b(RecyclerView.F f10) {
        a aVar = (a) this.f23236a.get(f10);
        if (aVar == null) {
            aVar = a.b();
            this.f23236a.put(f10, aVar);
        }
        aVar.f23239a |= 1;
    }

    public void c(long j10, RecyclerView.F f10) {
        this.f23237b.g(j10, f10);
    }

    public void d(RecyclerView.F f10, RecyclerView.n.c cVar) {
        a aVar = (a) this.f23236a.get(f10);
        if (aVar == null) {
            aVar = a.b();
            this.f23236a.put(f10, aVar);
        }
        aVar.f23241c = cVar;
        aVar.f23239a |= 8;
    }

    public void e(RecyclerView.F f10, RecyclerView.n.c cVar) {
        a aVar = (a) this.f23236a.get(f10);
        if (aVar == null) {
            aVar = a.b();
            this.f23236a.put(f10, aVar);
        }
        aVar.f23240b = cVar;
        aVar.f23239a |= 4;
    }

    public void f() {
        this.f23236a.clear();
        this.f23237b.a();
    }

    public RecyclerView.F g(long j10) {
        return (RecyclerView.F) this.f23237b.d(j10);
    }

    public boolean h(RecyclerView.F f10) {
        a aVar = (a) this.f23236a.get(f10);
        return (aVar == null || (aVar.f23239a & 1) == 0) ? false : true;
    }

    public boolean i(RecyclerView.F f10) {
        a aVar = (a) this.f23236a.get(f10);
        return (aVar == null || (aVar.f23239a & 4) == 0) ? false : true;
    }

    public void j() {
        a.a();
    }

    public void k(RecyclerView.F f10) {
        p(f10);
    }

    public final RecyclerView.n.c l(RecyclerView.F f10, int i10) {
        a aVar;
        RecyclerView.n.c cVar;
        int d10 = this.f23236a.d(f10);
        if (d10 >= 0 && (aVar = (a) this.f23236a.j(d10)) != null) {
            int i11 = aVar.f23239a;
            if ((i11 & i10) != 0) {
                int i12 = (~i10) & i11;
                aVar.f23239a = i12;
                if (i10 == 4) {
                    cVar = aVar.f23240b;
                } else {
                    if (i10 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    cVar = aVar.f23241c;
                }
                if ((i12 & 12) == 0) {
                    this.f23236a.h(d10);
                    a.c(aVar);
                }
                return cVar;
            }
        }
        return null;
    }

    public RecyclerView.n.c m(RecyclerView.F f10) {
        return l(f10, 8);
    }

    public RecyclerView.n.c n(RecyclerView.F f10) {
        return l(f10, 4);
    }

    public void o(b bVar) {
        for (int size = this.f23236a.size() - 1; size >= 0; size--) {
            RecyclerView.F f10 = (RecyclerView.F) this.f23236a.f(size);
            a aVar = (a) this.f23236a.h(size);
            int i10 = aVar.f23239a;
            if ((i10 & 3) == 3) {
                bVar.b(f10);
            } else if ((i10 & 1) != 0) {
                RecyclerView.n.c cVar = aVar.f23240b;
                if (cVar == null) {
                    bVar.b(f10);
                } else {
                    bVar.c(f10, cVar, aVar.f23241c);
                }
            } else if ((i10 & 14) == 14) {
                bVar.a(f10, aVar.f23240b, aVar.f23241c);
            } else if ((i10 & 12) == 12) {
                bVar.d(f10, aVar.f23240b, aVar.f23241c);
            } else if ((i10 & 4) != 0) {
                bVar.c(f10, aVar.f23240b, null);
            } else if ((i10 & 8) != 0) {
                bVar.a(f10, aVar.f23240b, aVar.f23241c);
            }
            a.c(aVar);
        }
    }

    public void p(RecyclerView.F f10) {
        a aVar = (a) this.f23236a.get(f10);
        if (aVar == null) {
            return;
        }
        aVar.f23239a &= -2;
    }

    public void q(RecyclerView.F f10) {
        int j10 = this.f23237b.j() - 1;
        while (true) {
            if (j10 < 0) {
                break;
            }
            if (f10 == this.f23237b.k(j10)) {
                this.f23237b.i(j10);
                break;
            }
            j10--;
        }
        a aVar = (a) this.f23236a.remove(f10);
        if (aVar != null) {
            a.c(aVar);
        }
    }
}
