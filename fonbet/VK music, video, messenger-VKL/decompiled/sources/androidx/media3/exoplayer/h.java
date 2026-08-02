package androidx.media3.exoplayer;

import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.source.i;
import androidx.media3.exoplayer.source.r;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import xsna.bpz;
import xsna.ewo0;
import xsna.jeb0;
import xsna.mjp0;
import xsna.mxz;
import xsna.otu;
import xsna.pr10;
import xsna.ty10;
import xsna.ud;
import xsna.uy10;
import xsna.vy10;
import xsna.x1b0;
import xsna.y2r0;
import xsna.z7s;
import xsna.zw1;

/* compiled from: MediaSourceList.java */
/* loaded from: classes12.dex */
public final class h {
    public final x1b0 a;
    public final d e;
    public final zw1 h;
    public final otu i;
    public boolean k;

    @Nullable
    public mjp0 l;
    public r j = new r.a();
    public final IdentityHashMap<androidx.media3.exoplayer.source.h, c> c = new IdentityHashMap<>();
    public final HashMap d = new HashMap();
    public final ArrayList b = new ArrayList();
    public final HashMap<c, b> f = new HashMap<>();
    public final HashSet g = new HashSet();

    /* compiled from: MediaSourceList.java */
    public final class a implements androidx.media3.exoplayer.source.j, androidx.media3.exoplayer.drm.a {
        public final c b;

        public a(c cVar) {
            this.b = cVar;
        }

        @Override // androidx.media3.exoplayer.source.j
        public final void A(int i, @Nullable i.b bVar, final bpz bpzVar, final pr10 pr10Var, final IOException iOException, final boolean z) {
            final Pair<Integer, i.b> a = a(i, bVar);
            if (a != null) {
                h.this.i.post(new Runnable() { // from class: xsna.yy10
                    @Override // java.lang.Runnable
                    public final void run() {
                        zw1 zw1Var = androidx.media3.exoplayer.h.this.h;
                        Pair pair = a;
                        zw1Var.A(((Integer) pair.first).intValue(), (i.b) pair.second, bpzVar, pr10Var, iOException, z);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.source.j
        public final void B(int i, @Nullable i.b bVar, bpz bpzVar, pr10 pr10Var) {
            Pair<Integer, i.b> a = a(i, bVar);
            if (a != null) {
                h.this.i.post(new z7s(this, a, bpzVar, pr10Var, 1));
            }
        }

        @Override // androidx.media3.exoplayer.source.j
        public final void F(int i, @Nullable i.b bVar, final bpz bpzVar, final pr10 pr10Var, final int i2) {
            final Pair<Integer, i.b> a = a(i, bVar);
            if (a != null) {
                h.this.i.post(new Runnable() { // from class: xsna.xy10
                    @Override // java.lang.Runnable
                    public final void run() {
                        zw1 zw1Var = androidx.media3.exoplayer.h.this.h;
                        Pair pair = a;
                        zw1Var.F(((Integer) pair.first).intValue(), (i.b) pair.second, bpzVar, pr10Var, i2);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.source.j
        public final void H(int i, @Nullable i.b bVar, final bpz bpzVar, final pr10 pr10Var) {
            final Pair<Integer, i.b> a = a(i, bVar);
            if (a != null) {
                h.this.i.post(new Runnable() { // from class: xsna.wy10
                    @Override // java.lang.Runnable
                    public final void run() {
                        zw1 zw1Var = androidx.media3.exoplayer.h.this.h;
                        Pair pair = a;
                        zw1Var.H(((Integer) pair.first).intValue(), (i.b) pair.second, bpzVar, pr10Var);
                    }
                });
            }
        }

        @Nullable
        public final Pair<Integer, i.b> a(int i, @Nullable i.b bVar) {
            i.b bVar2;
            c cVar = this.b;
            i.b bVar3 = null;
            if (bVar != null) {
                int i2 = 0;
                while (true) {
                    if (i2 >= cVar.c.size()) {
                        bVar2 = null;
                        break;
                    }
                    if (((i.b) cVar.c.get(i2)).d == bVar.d) {
                        Object obj = bVar.a;
                        Object obj2 = cVar.b;
                        int i3 = ud.d;
                        bVar2 = bVar.a(Pair.create(obj2, obj));
                        break;
                    }
                    i2++;
                }
                if (bVar2 == null) {
                    return null;
                }
                bVar3 = bVar2;
            }
            return Pair.create(Integer.valueOf(i + cVar.d), bVar3);
        }

        @Override // androidx.media3.exoplayer.source.j
        public final void h(int i, @Nullable i.b bVar, pr10 pr10Var) {
            Pair<Integer, i.b> a = a(i, bVar);
            if (a != null) {
                h.this.i.post(new vy10(this, a, pr10Var, 0));
            }
        }

        @Override // androidx.media3.exoplayer.source.j
        public final void x(int i, @Nullable i.b bVar, pr10 pr10Var) {
            Pair<Integer, i.b> a = a(i, bVar);
            if (a != null) {
                h.this.i.post(new mxz(this, a, pr10Var, 1));
            }
        }
    }

    /* compiled from: MediaSourceList.java */
    public static final class b {
        public final androidx.media3.exoplayer.source.i a;
        public final uy10 b;
        public final a c;

        public b(androidx.media3.exoplayer.source.i iVar, uy10 uy10Var, a aVar) {
            this.a = iVar;
            this.b = uy10Var;
            this.c = aVar;
        }
    }

    /* compiled from: MediaSourceList.java */
    public static final class c implements ty10 {
        public final androidx.media3.exoplayer.source.g a;
        public int d;
        public boolean e;
        public final ArrayList c = new ArrayList();
        public final Object b = new Object();

        public c(androidx.media3.exoplayer.source.i iVar, boolean z) {
            this.a = new androidx.media3.exoplayer.source.g(iVar, z);
        }

        @Override // xsna.ty10
        public final ewo0 a() {
            return this.a.o;
        }

        @Override // xsna.ty10
        public final Object getUid() {
            return this.b;
        }
    }

    public h(d dVar, zw1 zw1Var, otu otuVar, x1b0 x1b0Var) {
        this.a = x1b0Var;
        this.e = dVar;
        this.h = zw1Var;
        this.i = otuVar;
    }

    public final ewo0 a(int i, ArrayList arrayList, r rVar) {
        if (!arrayList.isEmpty()) {
            this.j = rVar;
            for (int i2 = i; i2 < arrayList.size() + i; i2++) {
                c cVar = (c) arrayList.get(i2 - i);
                ArrayList arrayList2 = this.b;
                if (i2 > 0) {
                    c cVar2 = (c) arrayList2.get(i2 - 1);
                    cVar.d = cVar2.a.o.b.o() + cVar2.d;
                    cVar.e = false;
                    cVar.c.clear();
                } else {
                    cVar.d = 0;
                    cVar.e = false;
                    cVar.c.clear();
                }
                int o = cVar.a.o.b.o();
                for (int i3 = i2; i3 < arrayList2.size(); i3++) {
                    ((c) arrayList2.get(i3)).d += o;
                }
                arrayList2.add(i2, cVar);
                this.d.put(cVar.b, cVar);
                if (this.k) {
                    e(cVar);
                    if (this.c.isEmpty()) {
                        this.g.add(cVar);
                    } else {
                        b bVar = this.f.get(cVar);
                        if (bVar != null) {
                            bVar.a.d(bVar.b);
                        }
                    }
                }
            }
        }
        return b();
    }

    public final ewo0 b() {
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty()) {
            return ewo0.a;
        }
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            c cVar = (c) arrayList.get(i2);
            cVar.d = i;
            i += cVar.a.o.b.o();
        }
        return new jeb0(arrayList, this.j);
    }

    public final void c() {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar.c.isEmpty()) {
                b bVar = this.f.get(cVar);
                if (bVar != null) {
                    bVar.a.d(bVar.b);
                }
                it.remove();
            }
        }
    }

    public final void d(c cVar) {
        if (cVar.e && cVar.c.isEmpty()) {
            b remove = this.f.remove(cVar);
            remove.getClass();
            a aVar = remove.c;
            androidx.media3.exoplayer.source.i iVar = remove.a;
            iVar.b(remove.b);
            iVar.j(aVar);
            iVar.k(aVar);
            this.g.remove(cVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.media3.exoplayer.source.i$c, xsna.uy10] */
    public final void e(c cVar) {
        androidx.media3.exoplayer.source.g gVar = cVar.a;
        ?? r1 = new i.c() { // from class: xsna.uy10
            @Override // androidx.media3.exoplayer.source.i.c
            public final void a(androidx.media3.exoplayer.source.a aVar, ewo0 ewo0Var) {
                otu otuVar = androidx.media3.exoplayer.h.this.e.i;
                otuVar.removeMessages(2);
                otuVar.sendEmptyMessage(22);
            }
        };
        a aVar = new a(cVar);
        this.f.put(cVar, new b(gVar, r1, aVar));
        gVar.a(y2r0.p(null), aVar);
        gVar.g(y2r0.p(null), aVar);
        gVar.e(r1, this.l, this.a);
    }

    public final void f(androidx.media3.exoplayer.source.h hVar) {
        IdentityHashMap<androidx.media3.exoplayer.source.h, c> identityHashMap = this.c;
        c remove = identityHashMap.remove(hVar);
        remove.getClass();
        remove.a.h(hVar);
        remove.c.remove(((androidx.media3.exoplayer.source.f) hVar).b);
        if (!identityHashMap.isEmpty()) {
            c();
        }
        d(remove);
    }

    public final void g(int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            ArrayList arrayList = this.b;
            c cVar = (c) arrayList.remove(i3);
            this.d.remove(cVar.b);
            int i4 = -cVar.a.o.b.o();
            for (int i5 = i3; i5 < arrayList.size(); i5++) {
                ((c) arrayList.get(i5)).d += i4;
            }
            cVar.e = true;
            if (this.k) {
                d(cVar);
            }
        }
    }
}
