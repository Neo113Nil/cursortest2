package M6;

import D6.n;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public class h implements n {

    /* renamed from: a, reason: collision with root package name */
    public final List f7531a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f7532b;

    public h(List list, boolean z10) {
        D6.k.c(!list.isEmpty(), "List of suppliers is empty!");
        this.f7531a = list;
        this.f7532b = z10;
    }

    public static h c(List list, boolean z10) {
        return new h(list, z10);
    }

    @Override // D6.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public c get() {
        return new a();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            return D6.i.a(this.f7531a, ((h) obj).f7531a);
        }
        return false;
    }

    public int hashCode() {
        return this.f7531a.hashCode();
    }

    public String toString() {
        return D6.i.b(this).b("list", this.f7531a).toString();
    }

    public class a extends M6.a {

        /* renamed from: h, reason: collision with root package name */
        public ArrayList f7533h;

        /* renamed from: i, reason: collision with root package name */
        public int f7534i;

        /* renamed from: j, reason: collision with root package name */
        public int f7535j;

        /* renamed from: k, reason: collision with root package name */
        public AtomicInteger f7536k;

        /* renamed from: l, reason: collision with root package name */
        public Throwable f7537l;

        /* renamed from: m, reason: collision with root package name */
        public Map f7538m;

        public a() {
            if (h.this.f7532b) {
                return;
            }
            z();
        }

        private synchronized c C() {
            return B(this.f7534i);
        }

        private void y(c cVar) {
            if (cVar != null) {
                cVar.close();
            }
        }

        public final synchronized c A(int i10) {
            c cVar;
            ArrayList arrayList = this.f7533h;
            cVar = null;
            if (arrayList != null && i10 < arrayList.size()) {
                cVar = (c) this.f7533h.set(i10, null);
            }
            return cVar;
        }

        public final synchronized c B(int i10) {
            ArrayList arrayList;
            arrayList = this.f7533h;
            return (arrayList == null || i10 >= arrayList.size()) ? null : (c) this.f7533h.get(i10);
        }

        public final void D() {
            Throwable th2;
            if (this.f7536k.incrementAndGet() != this.f7535j || (th2 = this.f7537l) == null) {
                return;
            }
            p(th2, this.f7538m);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0024 A[LOOP:0: B:16:0x0022->B:17:0x0024, LOOP_END] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void E(int i10, c cVar, boolean z10) {
            synchronized (this) {
                try {
                    int i11 = this.f7534i;
                    if (cVar == B(i10) && i10 != this.f7534i) {
                        if (C() != null && (!z10 || i10 >= this.f7534i)) {
                            i10 = i11;
                            while (i11 > i10) {
                                y(A(i11));
                                i11--;
                            }
                        }
                        this.f7534i = i10;
                        while (i11 > i10) {
                        }
                    }
                } finally {
                }
            }
        }

        public final void F(int i10, c cVar) {
            y(H(i10, cVar));
            if (i10 == 0) {
                this.f7537l = cVar.f();
                this.f7538m = cVar.getExtras();
            }
            D();
        }

        public final void G(int i10, c cVar) {
            E(i10, cVar, cVar.d());
            if (cVar == C()) {
                t(null, i10 == 0 && cVar.d(), cVar.getExtras());
            }
            D();
        }

        public final synchronized c H(int i10, c cVar) {
            if (cVar == C()) {
                return null;
            }
            if (cVar != B(i10)) {
                return cVar;
            }
            return A(i10);
        }

        @Override // M6.a, M6.c
        public boolean close() {
            if (h.this.f7532b) {
                z();
            }
            synchronized (this) {
                try {
                    if (!super.close()) {
                        return false;
                    }
                    ArrayList arrayList = this.f7533h;
                    this.f7533h = null;
                    if (arrayList == null) {
                        return true;
                    }
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        y((c) arrayList.get(i10));
                    }
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // M6.a, M6.c
        public synchronized boolean e() {
            boolean z10;
            try {
                if (h.this.f7532b) {
                    z();
                }
                c C10 = C();
                if (C10 != null) {
                    z10 = C10.e();
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return z10;
        }

        @Override // M6.a, M6.c
        public synchronized Object getResult() {
            c C10;
            try {
                if (h.this.f7532b) {
                    z();
                }
                C10 = C();
            } catch (Throwable th2) {
                throw th2;
            }
            return C10 != null ? C10.getResult() : null;
        }

        public final void z() {
            if (this.f7536k != null) {
                return;
            }
            synchronized (this) {
                try {
                    if (this.f7536k == null) {
                        this.f7536k = new AtomicInteger(0);
                        int size = h.this.f7531a.size();
                        this.f7535j = size;
                        this.f7534i = size;
                        this.f7533h = new ArrayList(size);
                        for (int i10 = 0; i10 < size; i10++) {
                            c cVar = (c) ((n) h.this.f7531a.get(i10)).get();
                            this.f7533h.add(cVar);
                            cVar.g(new C0153a(i10), B6.a.d());
                            if (!cVar.e()) {
                            }
                        }
                    }
                } finally {
                }
            }
        }

        /* renamed from: M6.h$a$a, reason: collision with other inner class name */
        public class C0153a implements e {

            /* renamed from: a, reason: collision with root package name */
            public int f7540a;

            public C0153a(int i10) {
                this.f7540a = i10;
            }

            @Override // M6.e
            public void onFailure(c cVar) {
                a.this.F(this.f7540a, cVar);
            }

            @Override // M6.e
            public void onNewResult(c cVar) {
                if (cVar.e()) {
                    a.this.G(this.f7540a, cVar);
                } else if (cVar.d()) {
                    a.this.F(this.f7540a, cVar);
                }
            }

            @Override // M6.e
            public void onProgressUpdate(c cVar) {
                if (this.f7540a == 0) {
                    a.this.r(cVar.h());
                }
            }

            @Override // M6.e
            public void onCancellation(c cVar) {
            }
        }
    }
}
