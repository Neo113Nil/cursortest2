package w3;

import android.annotation.SuppressLint;
import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.common.collect.A;
import com.google.common.collect.AbstractC5880y;
import com.google.common.collect.g0;
import j3.C7266h;
import j3.C7270l;
import j3.C7272n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import m3.N;
import u3.P;
import w3.C10424a;
import w3.C10425b;
import w3.g;
import w3.i;
import w3.j;
import w3.o;

/* renamed from: w3.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C10425b implements j {

    /* renamed from: b, reason: collision with root package name */
    private final UUID f103425b;

    /* renamed from: c, reason: collision with root package name */
    private final Ej.b f103426c;

    /* renamed from: d, reason: collision with root package name */
    private final s f103427d;

    /* renamed from: e, reason: collision with root package name */
    private final HashMap<String, String> f103428e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f103429f;

    /* renamed from: g, reason: collision with root package name */
    private final int[] f103430g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f103431h;

    /* renamed from: i, reason: collision with root package name */
    private final f f103432i;

    /* renamed from: j, reason: collision with root package name */
    private final J3.h f103433j;

    /* renamed from: k, reason: collision with root package name */
    private final g f103434k;

    /* renamed from: l, reason: collision with root package name */
    private final long f103435l;

    /* renamed from: m, reason: collision with root package name */
    private final ArrayList f103436m;

    /* renamed from: n, reason: collision with root package name */
    private final Set<e> f103437n;

    /* renamed from: o, reason: collision with root package name */
    private final Set<C10424a> f103438o;

    /* renamed from: p, reason: collision with root package name */
    private int f103439p;

    /* renamed from: q, reason: collision with root package name */
    private o f103440q;

    /* renamed from: r, reason: collision with root package name */
    private C10424a f103441r;

    /* renamed from: s, reason: collision with root package name */
    private C10424a f103442s;

    /* renamed from: t, reason: collision with root package name */
    private Looper f103443t;

    /* renamed from: u, reason: collision with root package name */
    private Handler f103444u;

    /* renamed from: v, reason: collision with root package name */
    private byte[] f103445v;

    /* renamed from: w, reason: collision with root package name */
    private P f103446w;

    /* renamed from: x, reason: collision with root package name */
    volatile c f103447x;

    /* renamed from: w3.b$a */
    public static final class a {

        /* renamed from: d, reason: collision with root package name */
        private boolean f103451d;

        /* renamed from: a, reason: collision with root package name */
        private final HashMap<String, String> f103448a = new HashMap<>();

        /* renamed from: b, reason: collision with root package name */
        private UUID f103449b = C7266h.f69064d;

        /* renamed from: c, reason: collision with root package name */
        private Ej.b f103450c = r.f103493d;

        /* renamed from: e, reason: collision with root package name */
        private int[] f103452e = new int[0];

        /* renamed from: f, reason: collision with root package name */
        private boolean f103453f = true;

        /* renamed from: g, reason: collision with root package name */
        private J3.h f103454g = new J3.h();

        /* renamed from: h, reason: collision with root package name */
        private long f103455h = 300000;

        public final C10425b a(s sVar) {
            return new C10425b(this.f103449b, this.f103450c, sVar, this.f103448a, this.f103451d, this.f103452e, this.f103453f, this.f103454g, this.f103455h);
        }

        public final void b(boolean z11) {
            this.f103451d = z11;
        }

        public final void c(boolean z11) {
            this.f103453f = z11;
        }

        public final void d(int... iArr) {
            for (int i11 : iArr) {
                boolean z11 = true;
                if (i11 != 2 && i11 != 1) {
                    z11 = false;
                }
                G10.a.c(z11);
            }
            this.f103452e = (int[]) iArr.clone();
        }

        public final void e(UUID uuid) {
            Ej.b bVar = r.f103493d;
            uuid.getClass();
            this.f103449b = uuid;
            this.f103450c = bVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w3.b$b, reason: collision with other inner class name */
    class C2243b implements o.b {
        C2243b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"HandlerLeak"})
    /* renamed from: w3.b$c */
    class c extends Handler {
        public c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr == null) {
                return;
            }
            Iterator it = C10425b.this.f103436m.iterator();
            while (it.hasNext()) {
                C10424a c10424a = (C10424a) it.next();
                if (c10424a.n(bArr)) {
                    c10424a.r(message.what);
                    return;
                }
            }
        }
    }

    /* renamed from: w3.b$d */
    public static final class d extends Exception {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w3.b$e */
    class e implements j.b {

        /* renamed from: a, reason: collision with root package name */
        private final i.a f103458a;

        /* renamed from: b, reason: collision with root package name */
        private w3.g f103459b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f103460c;

        public e(i.a aVar) {
            this.f103458a = aVar;
        }

        public static void a(e eVar, C7272n c7272n) {
            C10425b c10425b = C10425b.this;
            if (c10425b.f103439p == 0 || eVar.f103460c) {
                return;
            }
            Looper looper = c10425b.f103443t;
            looper.getClass();
            eVar.f103459b = C10425b.k(c10425b, looper, eVar.f103458a, c7272n);
            c10425b.f103437n.add(eVar);
        }

        public static /* synthetic */ void b(e eVar) {
            if (eVar.f103460c) {
                return;
            }
            w3.g gVar = eVar.f103459b;
            if (gVar != null) {
                gVar.a(eVar.f103458a);
            }
            C10425b.this.f103437n.remove(eVar);
            eVar.f103460c = true;
        }

        @Override // w3.j.b
        public final void release() {
            Handler handler = C10425b.this.f103444u;
            handler.getClass();
            N.V(handler, new Runnable() { // from class: w3.d
                @Override // java.lang.Runnable
                public final void run() {
                    C10425b.e.b(C10425b.e.this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w3.b$f */
    class f implements C10424a.InterfaceC2242a {

        /* renamed from: a, reason: collision with root package name */
        private final HashSet f103462a = new HashSet();

        /* renamed from: b, reason: collision with root package name */
        private C10424a f103463b;

        /* JADX WARN: Multi-variable type inference failed */
        public final void a() {
            this.f103463b = null;
            HashSet hashSet = this.f103462a;
            AbstractC5880y n11 = AbstractC5880y.n(hashSet);
            hashSet.clear();
            g0 listIterator = n11.listIterator(0);
            while (listIterator.hasNext()) {
                ((C10424a) listIterator.next()).s();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void b(Exception exc, boolean z11) {
            this.f103463b = null;
            HashSet hashSet = this.f103462a;
            AbstractC5880y n11 = AbstractC5880y.n(hashSet);
            hashSet.clear();
            g0 listIterator = n11.listIterator(0);
            while (listIterator.hasNext()) {
                ((C10424a) listIterator.next()).t(exc, z11);
            }
        }

        public final void c(C10424a c10424a) {
            HashSet hashSet = this.f103462a;
            hashSet.remove(c10424a);
            if (this.f103463b == c10424a) {
                this.f103463b = null;
                if (hashSet.isEmpty()) {
                    return;
                }
                C10424a c10424a2 = (C10424a) hashSet.iterator().next();
                this.f103463b = c10424a2;
                c10424a2.w();
            }
        }

        public final void d(C10424a c10424a) {
            this.f103462a.add(c10424a);
            if (this.f103463b != null) {
                return;
            }
            this.f103463b = c10424a;
            c10424a.w();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w3.b$g */
    class g implements C10424a.b {
        g() {
        }
    }

    C10425b(UUID uuid, Ej.b bVar, s sVar, HashMap hashMap, boolean z11, int[] iArr, boolean z12, J3.h hVar, long j11) {
        uuid.getClass();
        G10.a.b("Use C.CLEARKEY_UUID instead", !C7266h.f69062b.equals(uuid));
        this.f103425b = uuid;
        this.f103426c = bVar;
        this.f103427d = sVar;
        this.f103428e = hashMap;
        this.f103429f = z11;
        this.f103430g = iArr;
        this.f103431h = z12;
        this.f103433j = hVar;
        this.f103432i = new f();
        this.f103434k = new g();
        this.f103436m = new ArrayList();
        this.f103437n = Collections.newSetFromMap(new IdentityHashMap());
        this.f103438o = Collections.newSetFromMap(new IdentityHashMap());
        this.f103435l = j11;
    }

    static /* synthetic */ w3.g k(C10425b c10425b, Looper looper, i.a aVar, C7272n c7272n) {
        return c10425b.s(looper, aVar, c7272n, false);
    }

    private w3.g s(Looper looper, i.a aVar, C7272n c7272n, boolean z11) {
        ArrayList arrayList;
        if (this.f103447x == null) {
            this.f103447x = new c(looper);
        }
        C7270l c7270l = c7272n.f69131s;
        int i11 = 0;
        C10424a c10424a = null;
        if (c7270l == null) {
            int h11 = j3.u.h(c7272n.f69127o);
            o oVar = this.f103440q;
            oVar.getClass();
            if (oVar.i() != 2 || !p.f103488c) {
                int[] iArr = this.f103430g;
                while (true) {
                    if (i11 >= iArr.length) {
                        i11 = -1;
                        break;
                    }
                    if (iArr[i11] == h11) {
                        break;
                    }
                    i11++;
                }
                if (i11 != -1 && oVar.i() != 1) {
                    C10424a c10424a2 = this.f103441r;
                    if (c10424a2 == null) {
                        C10424a v11 = v(AbstractC5880y.v(), true, null, z11);
                        this.f103436m.add(v11);
                        this.f103441r = v11;
                    } else {
                        c10424a2.e(null);
                    }
                    return this.f103441r;
                }
            }
            return null;
        }
        if (this.f103445v == null) {
            arrayList = w(c7270l, this.f103425b, false);
            if (arrayList.isEmpty()) {
                d dVar = new d("Media does not support uuid: " + this.f103425b);
                m3.s.d("DefaultDrmSessionMgr", "DRM error", dVar);
                if (aVar != null) {
                    aVar.e(dVar);
                }
                return new n(new g.a(6003, dVar));
            }
        } else {
            arrayList = null;
        }
        if (this.f103429f) {
            Iterator it = this.f103436m.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C10424a c10424a3 = (C10424a) it.next();
                if (Objects.equals(c10424a3.f103394a, arrayList)) {
                    c10424a = c10424a3;
                    break;
                }
            }
        } else {
            c10424a = this.f103442s;
        }
        if (c10424a != null) {
            c10424a.e(aVar);
            return c10424a;
        }
        C10424a v12 = v(arrayList, false, aVar, z11);
        if (!this.f103429f) {
            this.f103442s = v12;
        }
        this.f103436m.add(v12);
        return v12;
    }

    private static boolean t(w3.g gVar) {
        C10424a c10424a = (C10424a) gVar;
        if (c10424a.getState() != 1) {
            return false;
        }
        g.a error = c10424a.getError();
        error.getClass();
        Throwable cause = error.getCause();
        return (cause instanceof ResourceBusyException) || l.c(cause);
    }

    private C10424a u(List<C7270l.b> list, boolean z11, i.a aVar) {
        this.f103440q.getClass();
        boolean z12 = this.f103431h | z11;
        o oVar = this.f103440q;
        byte[] bArr = this.f103445v;
        Looper looper = this.f103443t;
        looper.getClass();
        P p11 = this.f103446w;
        p11.getClass();
        C10424a c10424a = new C10424a(this.f103425b, oVar, this.f103432i, this.f103434k, list, z12, z11, bArr, this.f103428e, this.f103427d, looper, this.f103433j, p11);
        c10424a.e(aVar);
        if (this.f103435l != -9223372036854775807L) {
            c10424a.e(null);
        }
        return c10424a;
    }

    private C10424a v(List<C7270l.b> list, boolean z11, i.a aVar, boolean z12) {
        C10424a u11 = u(list, z11, aVar);
        boolean t2 = t(u11);
        long j11 = this.f103435l;
        Set<C10424a> set = this.f103438o;
        if (t2 && !set.isEmpty()) {
            Iterator it = A.u(set).iterator();
            while (it.hasNext()) {
                ((w3.g) it.next()).a(null);
            }
            u11.a(aVar);
            if (j11 != -9223372036854775807L) {
                u11.a(null);
            }
            u11 = u(list, z11, aVar);
        }
        if (t(u11) && z12) {
            Set<e> set2 = this.f103437n;
            if (!set2.isEmpty()) {
                Iterator it2 = A.u(set2).iterator();
                while (it2.hasNext()) {
                    ((e) it2.next()).release();
                }
                if (!set.isEmpty()) {
                    Iterator it3 = A.u(set).iterator();
                    while (it3.hasNext()) {
                        ((w3.g) it3.next()).a(null);
                    }
                }
                u11.a(aVar);
                if (j11 != -9223372036854775807L) {
                    u11.a(null);
                }
                return u(list, z11, aVar);
            }
        }
        return u11;
    }

    private static ArrayList w(C7270l c7270l, UUID uuid, boolean z11) {
        ArrayList arrayList = new ArrayList(c7270l.f69087d);
        for (int i11 = 0; i11 < c7270l.f69087d; i11++) {
            C7270l.b c11 = c7270l.c(i11);
            if ((c11.a(uuid) || (C7266h.f69063c.equals(uuid) && c11.a(C7266h.f69062b))) && (c11.f69092e != null || z11)) {
                arrayList.add(c11);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        if (this.f103440q != null && this.f103439p == 0 && this.f103436m.isEmpty() && this.f103437n.isEmpty()) {
            o oVar = this.f103440q;
            oVar.getClass();
            oVar.release();
            this.f103440q = null;
        }
    }

    private void z(boolean z11) {
        if (z11 && this.f103443t == null) {
            m3.s.g("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        Thread currentThread = Thread.currentThread();
        Looper looper = this.f103443t;
        looper.getClass();
        if (currentThread != looper.getThread()) {
            m3.s.g("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.f103443t.getThread().getName(), new IllegalStateException());
        }
    }

    @Override // w3.j
    public final w3.g a(i.a aVar, C7272n c7272n) {
        z(false);
        G10.a.h(this.f103439p > 0);
        G10.a.i(this.f103443t);
        return s(this.f103443t, aVar, c7272n, true);
    }

    @Override // w3.j
    public final int b(C7272n c7272n) {
        z(false);
        o oVar = this.f103440q;
        oVar.getClass();
        int i11 = oVar.i();
        C7270l c7270l = c7272n.f69131s;
        if (c7270l == null) {
            int h11 = j3.u.h(c7272n.f69127o);
            int i12 = 0;
            while (true) {
                int[] iArr = this.f103430g;
                if (i12 >= iArr.length) {
                    i12 = -1;
                    break;
                }
                if (iArr[i12] == h11) {
                    break;
                }
                i12++;
            }
            if (i12 == -1) {
                return 0;
            }
        } else if (this.f103445v == null) {
            UUID uuid = this.f103425b;
            if (w(c7270l, uuid, true).isEmpty()) {
                if (c7270l.f69087d == 1 && c7270l.c(0).a(C7266h.f69062b)) {
                    m3.s.f("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + uuid);
                }
                return 1;
            }
            String str = c7270l.f69086c;
            if (str != null && !"cenc".equals(str) && !"cbcs".equals(str) && ("cbc1".equals(str) || "cens".equals(str))) {
                return 1;
            }
        }
        return i11;
    }

    @Override // w3.j
    public final void c(Looper looper, P p11) {
        synchronized (this) {
            try {
                Looper looper2 = this.f103443t;
                if (looper2 == null) {
                    this.f103443t = looper;
                    this.f103444u = new Handler(looper);
                } else {
                    G10.a.h(looper2 == looper);
                    this.f103444u.getClass();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f103446w = p11;
    }

    @Override // w3.j
    public final j.b d(i.a aVar, final C7272n c7272n) {
        G10.a.h(this.f103439p > 0);
        G10.a.i(this.f103443t);
        final e eVar = new e(aVar);
        Handler handler = this.f103444u;
        handler.getClass();
        handler.post(new Runnable() { // from class: w3.c
            @Override // java.lang.Runnable
            public final void run() {
                C10425b.e.a(C10425b.e.this, c7272n);
            }
        });
        return eVar;
    }

    @Override // w3.j
    public final void prepare() {
        z(true);
        int i11 = this.f103439p;
        this.f103439p = i11 + 1;
        if (i11 != 0) {
            return;
        }
        if (this.f103440q == null) {
            this.f103426c.getClass();
            o n11 = r.n(this.f103425b);
            this.f103440q = n11;
            n11.g(new C2243b());
            return;
        }
        if (this.f103435l == -9223372036854775807L) {
            return;
        }
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.f103436m;
            if (i12 >= arrayList.size()) {
                return;
            }
            ((C10424a) arrayList.get(i12)).e(null);
            i12++;
        }
    }

    @Override // w3.j
    public final void release() {
        z(true);
        int i11 = this.f103439p - 1;
        this.f103439p = i11;
        if (i11 != 0) {
            return;
        }
        if (this.f103435l != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.f103436m);
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                ((C10424a) arrayList.get(i12)).a(null);
            }
        }
        Iterator it = A.u(this.f103437n).iterator();
        while (it.hasNext()) {
            ((e) it.next()).release();
        }
        x();
    }

    public final void y(byte[] bArr) {
        G10.a.h(this.f103436m.isEmpty());
        this.f103445v = bArr;
    }
}
