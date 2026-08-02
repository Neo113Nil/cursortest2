package androidx.media3.exoplayer.source;

import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.source.c;
import androidx.media3.exoplayer.source.d;
import androidx.media3.exoplayer.source.g;
import androidx.media3.exoplayer.source.i;
import androidx.media3.exoplayer.source.r;
import com.google.common.collect.ImmutableList;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import xsna.ewo0;
import xsna.fxc0;
import xsna.kr10;
import xsna.mjp0;
import xsna.ud;
import xsna.vr10;
import xsna.xu1;
import xsna.y2r0;

/* compiled from: ConcatenatingMediaSource.java */
@Deprecated
/* loaded from: classes12.dex */
public final class d extends androidx.media3.exoplayer.source.c<C0062d> {
    public static final kr10 u;
    public final ArrayList k;
    public final HashSet l;

    @Nullable
    public Handler m;
    public final ArrayList n;
    public final IdentityHashMap<h, C0062d> o;
    public final HashMap p;
    public final HashSet q;
    public boolean r;
    public HashSet s;
    public r t;

    /* compiled from: ConcatenatingMediaSource.java */
    public static final class a extends ud {
        public final int e;
        public final int f;
        public final int[] g;
        public final int[] h;
        public final ewo0[] i;
        public final Object[] j;
        public final HashMap<Object, Integer> k;

        public a(ArrayList arrayList, r rVar) {
            super(rVar);
            int size = arrayList.size();
            this.g = new int[size];
            this.h = new int[size];
            this.i = new ewo0[size];
            this.j = new Object[size];
            this.k = new HashMap<>();
            Iterator it = arrayList.iterator();
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (it.hasNext()) {
                C0062d c0062d = (C0062d) it.next();
                ewo0[] ewo0VarArr = this.i;
                g.a aVar = c0062d.a.o;
                ewo0VarArr[i3] = aVar;
                this.h[i3] = i;
                this.g[i3] = i2;
                i += aVar.b.o();
                i2 += this.i[i3].h();
                Object[] objArr = this.j;
                Object obj = c0062d.b;
                objArr[i3] = obj;
                this.k.put(obj, Integer.valueOf(i3));
                i3++;
            }
            this.e = i;
            this.f = i2;
        }

        @Override // xsna.ewo0
        public final int h() {
            return this.f;
        }

        @Override // xsna.ewo0
        public final int o() {
            return this.e;
        }

        @Override // xsna.ud
        public final int q(Object obj) {
            Integer num = this.k.get(obj);
            if (num == null) {
                return -1;
            }
            return num.intValue();
        }

        @Override // xsna.ud
        public final int r(int i) {
            return y2r0.e(this.g, i + 1, false, false);
        }

        @Override // xsna.ud
        public final int s(int i) {
            return y2r0.e(this.h, i + 1, false, false);
        }

        @Override // xsna.ud
        public final Object t(int i) {
            return this.j[i];
        }

        @Override // xsna.ud
        public final int u(int i) {
            return this.g[i];
        }

        @Override // xsna.ud
        public final int v(int i) {
            return this.h[i];
        }

        @Override // xsna.ud
        public final ewo0 x(int i) {
            return this.i[i];
        }
    }

    /* compiled from: ConcatenatingMediaSource.java */
    public static final class c {
        public final Handler a;
        public final Runnable b;

        public c(Handler handler, Runnable runnable) {
            this.a = handler;
            this.b = runnable;
        }
    }

    /* compiled from: ConcatenatingMediaSource.java */
    /* renamed from: androidx.media3.exoplayer.source.d$d, reason: collision with other inner class name */
    public static final class C0062d {
        public final g a;
        public int d;
        public int e;
        public boolean f;
        public final ArrayList c = new ArrayList();
        public final Object b = new Object();

        public C0062d(i iVar) {
            this.a = new g(iVar, false);
        }
    }

    /* compiled from: ConcatenatingMediaSource.java */
    public static final class e<T> {
        public final int a;
        public final Serializable b;

        @Nullable
        public final c c;

        public e(int i, Serializable serializable, @Nullable c cVar) {
            this.a = i;
            this.b = serializable;
            this.c = cVar;
        }
    }

    static {
        kr10.b.a aVar = new kr10.b.a();
        com.google.common.collect.h hVar = com.google.common.collect.h.h;
        ImmutableList.b bVar = ImmutableList.c;
        com.google.common.collect.g gVar = com.google.common.collect.g.f;
        List list = Collections.EMPTY_LIST;
        com.google.common.collect.g gVar2 = com.google.common.collect.g.f;
        kr10.e.a aVar2 = new kr10.e.a();
        kr10.g gVar3 = kr10.g.a;
        Uri uri = Uri.EMPTY;
        u = new kr10("", new kr10.c(aVar), uri != null ? new kr10.f(uri, null, null, list, null, gVar2, C.TIME_UNSET) : null, new kr10.e(aVar2), vr10.B, gVar3);
    }

    public d(i... iVarArr) {
        r.a aVar = new r.a();
        for (i iVar : iVarArr) {
            iVar.getClass();
        }
        this.t = aVar.b.length > 0 ? aVar.cloneAndClear() : aVar;
        this.o = new IdentityHashMap<>();
        this.p = new HashMap();
        ArrayList arrayList = new ArrayList();
        this.k = arrayList;
        this.n = new ArrayList();
        this.s = new HashSet();
        this.l = new HashSet();
        this.q = new HashSet();
        List asList = Arrays.asList(iVarArr);
        synchronized (this) {
            A(arrayList.size(), asList, null, null);
        }
    }

    public final void A(int i, List list, @Nullable Handler handler, @Nullable Runnable runnable) {
        c cVar;
        fxc0.p((handler == null) == (runnable == null));
        Handler handler2 = this.m;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((i) it.next()).getClass();
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(new C0062d((i) it2.next()));
        }
        this.k.addAll(i, arrayList);
        if (handler2 == null || list.isEmpty()) {
            if (runnable == null || handler == null) {
                return;
            }
            handler.post(runnable);
            return;
        }
        if (handler == null || runnable == null) {
            cVar = null;
        } else {
            cVar = new c(handler, runnable);
            this.l.add(cVar);
        }
        handler2.obtainMessage(1, new e(i, arrayList, cVar)).sendToTarget();
    }

    public final void B(int i, int i2, int i3) {
        while (true) {
            ArrayList arrayList = this.n;
            if (i >= arrayList.size()) {
                return;
            }
            C0062d c0062d = (C0062d) arrayList.get(i);
            c0062d.d += i2;
            c0062d.e += i3;
            i++;
        }
    }

    public final void C() {
        Iterator it = this.q.iterator();
        while (it.hasNext()) {
            C0062d c0062d = (C0062d) it.next();
            if (c0062d.c.isEmpty()) {
                c.b bVar = (c.b) this.h.get(c0062d);
                bVar.getClass();
                bVar.a.d(bVar.b);
                it.remove();
            }
        }
    }

    public final synchronized void D(Set<c> set) {
        try {
            for (c cVar : set) {
                cVar.a.post(cVar.b);
            }
            this.l.removeAll(set);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized g E(int i, Handler handler, Runnable runnable) {
        g gVar;
        synchronized (this) {
            gVar = ((C0062d) this.k.get(i)).a;
        }
        return gVar;
        F(i, i + 1, handler, runnable);
        return gVar;
    }

    public final void F(int i, int i2, @Nullable Handler handler, @Nullable Runnable runnable) {
        c cVar;
        fxc0.p(handler != null);
        Handler handler2 = this.m;
        y2r0.a0(this.k, i, i2);
        if (handler2 == null) {
            if (handler != null) {
                handler.post(runnable);
            }
        } else {
            if (handler != null) {
                cVar = new c(handler, runnable);
                this.l.add(cVar);
            } else {
                cVar = null;
            }
            handler2.obtainMessage(2, new e(i, Integer.valueOf(i2), cVar)).sendToTarget();
        }
    }

    public final void G(@Nullable c cVar) {
        if (!this.r) {
            Handler handler = this.m;
            handler.getClass();
            handler.obtainMessage(5).sendToTarget();
            this.r = true;
        }
        if (cVar != null) {
            this.s.add(cVar);
        }
    }

    public final void H() {
        this.r = false;
        HashSet hashSet = this.s;
        this.s = new HashSet();
        s(new a(this.n, this.t));
        Handler handler = this.m;
        handler.getClass();
        handler.obtainMessage(6, hashSet).sendToTarget();
    }

    @Override // androidx.media3.exoplayer.source.i
    public final kr10 f() {
        return u;
    }

    @Override // androidx.media3.exoplayer.source.i
    public final void h(h hVar) {
        IdentityHashMap<h, C0062d> identityHashMap = this.o;
        C0062d remove = identityHashMap.remove(hVar);
        remove.getClass();
        remove.a.h(hVar);
        ArrayList arrayList = remove.c;
        arrayList.remove(((f) hVar).b);
        if (!identityHashMap.isEmpty()) {
            C();
        }
        if (remove.f && arrayList.isEmpty()) {
            this.q.remove(remove);
            c.b bVar = (c.b) this.h.remove(remove);
            bVar.getClass();
            i iVar = bVar.a;
            iVar.b(bVar.b);
            androidx.media3.exoplayer.source.c<T>.a aVar = bVar.c;
            iVar.j(aVar);
            iVar.k(aVar);
        }
    }

    @Override // androidx.media3.exoplayer.source.i
    public final synchronized ewo0 i() {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return new a(this.k, this.t.getLength() != this.k.size() ? this.t.cloneAndClear().cloneAndInsert(0, this.k.size()) : this.t);
    }

    @Override // androidx.media3.exoplayer.source.i
    public final h m(i.b bVar, xu1 xu1Var, long j) {
        Object obj = bVar.a;
        int i = ud.d;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        i.b a2 = bVar.a(pair.second);
        C0062d c0062d = (C0062d) this.p.get(obj2);
        if (c0062d == null) {
            c0062d = new C0062d(new b());
            c0062d.f = true;
            y(c0062d, c0062d.a);
        }
        this.q.add(c0062d);
        c.b bVar2 = (c.b) this.h.get(c0062d);
        bVar2.getClass();
        bVar2.a.c(bVar2.b);
        c0062d.c.add(a2);
        f m = c0062d.a.m(a2, xu1Var, j);
        this.o.put(m, c0062d);
        C();
        return m;
    }

    @Override // androidx.media3.exoplayer.source.c, androidx.media3.exoplayer.source.a
    public final void p() {
        super.p();
        this.q.clear();
    }

    @Override // androidx.media3.exoplayer.source.a
    public final synchronized void r(@Nullable mjp0 mjp0Var) {
        try {
            this.j = mjp0Var;
            this.i = y2r0.o(null);
            this.m = new Handler(new Handler.Callback() { // from class: xsna.hwi
                @Override // android.os.Handler.Callback
                public final boolean handleMessage(Message message) {
                    androidx.media3.exoplayer.source.d dVar = androidx.media3.exoplayer.source.d.this;
                    ArrayList arrayList = dVar.n;
                    switch (message.what) {
                        case 1:
                            Object obj = message.obj;
                            String str = y2r0.a;
                            d.e eVar = (d.e) obj;
                            androidx.media3.exoplayer.source.r rVar = dVar.t;
                            int i = eVar.a;
                            Collection<d.C0062d> collection = (Collection) eVar.b;
                            dVar.t = rVar.cloneAndInsert(i, collection.size());
                            dVar.z(eVar.a, collection);
                            dVar.G(eVar.c);
                            return true;
                        case 2:
                            Object obj2 = message.obj;
                            String str2 = y2r0.a;
                            d.e eVar2 = (d.e) obj2;
                            int i2 = eVar2.a;
                            int intValue = ((Integer) eVar2.b).intValue();
                            if (i2 == 0 && intValue == dVar.t.getLength()) {
                                dVar.t = dVar.t.cloneAndClear();
                            } else {
                                dVar.t = dVar.t.a(i2, intValue);
                            }
                            for (int i3 = intValue - 1; i3 >= i2; i3--) {
                                d.C0062d c0062d = (d.C0062d) arrayList.remove(i3);
                                dVar.p.remove(c0062d.b);
                                dVar.B(i3, -1, -c0062d.a.o.b.o());
                                c0062d.f = true;
                                if (c0062d.c.isEmpty()) {
                                    dVar.q.remove(c0062d);
                                    c.b bVar = (c.b) dVar.h.remove(c0062d);
                                    bVar.getClass();
                                    androidx.media3.exoplayer.source.i iVar = bVar.a;
                                    iVar.b(bVar.b);
                                    androidx.media3.exoplayer.source.c<T>.a aVar = bVar.c;
                                    iVar.j(aVar);
                                    iVar.k(aVar);
                                }
                            }
                            dVar.G(eVar2.c);
                            return true;
                        case 3:
                            Object obj3 = message.obj;
                            String str3 = y2r0.a;
                            d.e eVar3 = (d.e) obj3;
                            androidx.media3.exoplayer.source.r rVar2 = dVar.t;
                            int i4 = eVar3.a;
                            Serializable serializable = eVar3.b;
                            r.a a2 = rVar2.a(i4, i4 + 1);
                            dVar.t = a2;
                            Integer num = (Integer) serializable;
                            dVar.t = a2.cloneAndInsert(num.intValue(), 1);
                            int i5 = eVar3.a;
                            int intValue2 = num.intValue();
                            int min = Math.min(i5, intValue2);
                            int max = Math.max(i5, intValue2);
                            int i6 = ((d.C0062d) arrayList.get(min)).e;
                            arrayList.add(intValue2, (d.C0062d) arrayList.remove(i5));
                            while (min <= max) {
                                d.C0062d c0062d2 = (d.C0062d) arrayList.get(min);
                                c0062d2.d = min;
                                c0062d2.e = i6;
                                i6 += c0062d2.a.o.b.o();
                                min++;
                            }
                            dVar.G(eVar3.c);
                            return true;
                        case 4:
                            Object obj4 = message.obj;
                            String str4 = y2r0.a;
                            d.e eVar4 = (d.e) obj4;
                            dVar.t = (androidx.media3.exoplayer.source.r) eVar4.b;
                            dVar.G(eVar4.c);
                            return true;
                        case 5:
                            dVar.H();
                            return true;
                        case 6:
                            Object obj5 = message.obj;
                            String str5 = y2r0.a;
                            dVar.D((Set) obj5);
                            return true;
                        default:
                            throw new IllegalStateException();
                    }
                }
            });
            if (this.k.isEmpty()) {
                H();
            } else {
                this.t = this.t.cloneAndInsert(0, this.k.size());
                z(0, this.k);
                G(null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // androidx.media3.exoplayer.source.c, androidx.media3.exoplayer.source.a
    public final synchronized void t() {
        try {
            super.t();
            this.n.clear();
            this.q.clear();
            this.p.clear();
            this.t = this.t.cloneAndClear();
            Handler handler = this.m;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                this.m = null;
            }
            this.r = false;
            this.s.clear();
            D(this.l);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // androidx.media3.exoplayer.source.c
    @Nullable
    public final i.b u(C0062d c0062d, i.b bVar) {
        C0062d c0062d2 = c0062d;
        for (int i = 0; i < c0062d2.c.size(); i++) {
            if (((i.b) c0062d2.c.get(i)).d == bVar.d) {
                Object obj = bVar.a;
                Object obj2 = c0062d2.b;
                int i2 = ud.d;
                return bVar.a(Pair.create(obj2, obj));
            }
        }
        return null;
    }

    @Override // androidx.media3.exoplayer.source.c
    public final int w(C0062d c0062d, int i) {
        return i + c0062d.e;
    }

    @Override // androidx.media3.exoplayer.source.c
    public final void x(Object obj, androidx.media3.exoplayer.source.a aVar, ewo0 ewo0Var) {
        C0062d c0062d = (C0062d) obj;
        int i = c0062d.d + 1;
        ArrayList arrayList = this.n;
        if (i < arrayList.size()) {
            int o = ewo0Var.o() - (((C0062d) arrayList.get(c0062d.d + 1)).e - c0062d.e);
            if (o != 0) {
                B(c0062d.d + 1, 0, o);
            }
        }
        G(null);
    }

    public final void z(int i, Collection<C0062d> collection) {
        for (C0062d c0062d : collection) {
            int i2 = i + 1;
            ArrayList arrayList = this.n;
            if (i > 0) {
                C0062d c0062d2 = (C0062d) arrayList.get(i - 1);
                int o = c0062d2.a.o.b.o() + c0062d2.e;
                c0062d.d = i;
                c0062d.e = o;
                c0062d.f = false;
                c0062d.c.clear();
            } else {
                c0062d.d = i;
                c0062d.e = 0;
                c0062d.f = false;
                c0062d.c.clear();
            }
            B(i, 1, c0062d.a.o.b.o());
            arrayList.add(i, c0062d);
            this.p.put(c0062d.b, c0062d);
            y(c0062d, c0062d.a);
            if (this.b.isEmpty() || !this.o.isEmpty()) {
                c.b bVar = (c.b) this.h.get(c0062d);
                bVar.getClass();
                bVar.a.d(bVar.b);
            } else {
                this.q.add(c0062d);
            }
            i = i2;
        }
    }

    /* compiled from: ConcatenatingMediaSource.java */
    public static final class b extends androidx.media3.exoplayer.source.a {
        @Override // androidx.media3.exoplayer.source.i
        public final kr10 f() {
            return d.u;
        }

        @Override // androidx.media3.exoplayer.source.i
        public final h m(i.b bVar, xu1 xu1Var, long j) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.media3.exoplayer.source.i
        public final void maybeThrowSourceInfoRefreshError() {
        }

        @Override // androidx.media3.exoplayer.source.a
        public final void t() {
        }

        @Override // androidx.media3.exoplayer.source.i
        public final void h(h hVar) {
        }

        @Override // androidx.media3.exoplayer.source.a
        public final void r(@Nullable mjp0 mjp0Var) {
        }
    }

    @Override // androidx.media3.exoplayer.source.c, androidx.media3.exoplayer.source.a
    public final void q() {
    }
}
