package t2;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseArray;
import b1.AbstractC2332A;
import b1.AbstractC2335D;
import b1.InterfaceC2360n;
import b1.W;
import b1.z;
import com.google.common.collect.AbstractC3445z;
import e1.AbstractC4134a;
import e1.C4146m;
import e1.InterfaceC4143j;
import e1.InterfaceC4148o;
import e1.InterfaceC4152t;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import l1.AbstractC5366l;
import r2.C6200c;
import t2.InterfaceC6383a;
import t2.InterfaceC6391e;
import t2.InterfaceC6399i;
import t2.g1;

/* loaded from: classes.dex */
public final class g1 {

    /* renamed from: A, reason: collision with root package name */
    public RuntimeException f65330A;

    /* renamed from: B, reason: collision with root package name */
    public int f65331B;

    /* renamed from: C, reason: collision with root package name */
    public int f65332C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f65333D;

    /* renamed from: a, reason: collision with root package name */
    public final Context f65334a;

    /* renamed from: b, reason: collision with root package name */
    public final C6407m f65335b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f65336c;

    /* renamed from: d, reason: collision with root package name */
    public final C6397h f65337d;

    /* renamed from: e, reason: collision with root package name */
    public final b f65338e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC4152t f65339f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC4143j f65340g;

    /* renamed from: h, reason: collision with root package name */
    public final long f65341h;

    /* renamed from: i, reason: collision with root package name */
    public final HandlerThread f65342i;

    /* renamed from: j, reason: collision with root package name */
    public final InterfaceC4152t f65343j;

    /* renamed from: k, reason: collision with root package name */
    public final List f65344k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f65345l;

    /* renamed from: m, reason: collision with root package name */
    public final a f65346m;

    /* renamed from: n, reason: collision with root package name */
    public final List f65347n;

    /* renamed from: o, reason: collision with root package name */
    public final I0 f65348o;

    /* renamed from: p, reason: collision with root package name */
    public final C4146m f65349p;

    /* renamed from: q, reason: collision with root package name */
    public final Object f65350q;

    /* renamed from: r, reason: collision with root package name */
    public final Object f65351r;

    /* renamed from: s, reason: collision with root package name */
    public final K0 f65352s;

    /* renamed from: t, reason: collision with root package name */
    public final Object f65353t;

    /* renamed from: u, reason: collision with root package name */
    public final AbstractC3445z f65354u;

    /* renamed from: v, reason: collision with root package name */
    public final int f65355v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f65356w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f65357x;

    /* renamed from: y, reason: collision with root package name */
    public long f65358y;

    /* renamed from: z, reason: collision with root package name */
    public int f65359z;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final List f65360a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        public final SparseArray f65361b;

        /* renamed from: c, reason: collision with root package name */
        public final SparseArray f65362c;

        /* renamed from: d, reason: collision with root package name */
        public final SparseArray f65363d;

        /* renamed from: t2.g1$a$a, reason: collision with other inner class name */
        public static final class C0910a {

            /* renamed from: a, reason: collision with root package name */
            public final SparseArray f65364a = new SparseArray();

            /* renamed from: b, reason: collision with root package name */
            public int f65365b = -1;
        }

        public a(C6407m c6407m) {
            for (int i10 = 0; i10 < c6407m.f65405a.size(); i10++) {
                this.f65360a.add(new C0910a());
            }
            this.f65361b = new SparseArray();
            this.f65362c = new SparseArray();
            this.f65363d = new SparseArray();
        }

        public androidx.media3.common.a a(int i10, int i11) {
            SparseArray sparseArray = ((C0910a) this.f65360a.get(i10)).f65364a;
            AbstractC4134a.g(e1.Z.q(sparseArray, i11));
            return (androidx.media3.common.a) sparseArray.get(i11);
        }

        public int b(int i10) {
            AbstractC4134a.h(h(), "Primary track can only be queried after all tracks are added.");
            for (int i11 = 0; i11 < this.f65360a.size(); i11++) {
                if (e1.Z.q(((C0910a) this.f65360a.get(i11)).f65364a, i10)) {
                    return i11;
                }
            }
            return -1;
        }

        public int c() {
            int i10 = 0;
            int i11 = 0;
            for (int i12 = 0; i12 < this.f65360a.size(); i12++) {
                SparseArray sparseArray = ((C0910a) this.f65360a.get(i12)).f65364a;
                if (e1.Z.q(sparseArray, 1)) {
                    i10 = 1;
                }
                if (e1.Z.q(sparseArray, 2)) {
                    i11 = 1;
                }
            }
            return i10 + i11;
        }

        public M0 d(int i10) {
            return (M0) this.f65361b.get(i10);
        }

        public boolean e() {
            for (int i10 = 0; i10 < this.f65360a.size(); i10++) {
                if (((C0910a) this.f65360a.get(i10)).f65365b == -1) {
                    return false;
                }
            }
            return true;
        }

        public boolean f(int i10) {
            int i11 = 0;
            for (int i12 = 0; i12 < this.f65360a.size(); i12++) {
                if (e1.Z.q(((C0910a) this.f65360a.get(i12)).f65364a, i10)) {
                    i11++;
                }
            }
            return ((Integer) this.f65363d.get(i10)).intValue() == i11;
        }

        public boolean g() {
            if (this.f65360a.size() < 2) {
                return false;
            }
            int i10 = 0;
            for (int i11 = 0; i11 < this.f65360a.size(); i11++) {
                if (e1.Z.q(((C0910a) this.f65360a.get(i11)).f65364a, 2)) {
                    i10++;
                }
            }
            return i10 > 1;
        }

        public boolean h() {
            if (!e()) {
                return false;
            }
            for (int i10 = 0; i10 < this.f65360a.size(); i10++) {
                C0910a c0910a = (C0910a) this.f65360a.get(i10);
                if (c0910a.f65365b != c0910a.f65364a.size()) {
                    return false;
                }
            }
            return true;
        }

        public void i(int i10) {
            this.f65363d.put(i10, Integer.valueOf(e1.Z.q(this.f65363d, i10) ? 1 + ((Integer) this.f65363d.get(i10)).intValue() : 1));
        }

        public void j(int i10, M0 m02) {
            AbstractC4134a.h(!e1.Z.q(this.f65361b, i10), "Exactly one SampleExporter can be added for each track type.");
            this.f65361b.put(i10, m02);
        }

        public void k(int i10, androidx.media3.common.a aVar) {
            int g10 = k1.g(aVar.f20543o);
            SparseArray sparseArray = ((C0910a) this.f65360a.get(i10)).f65364a;
            AbstractC4134a.g(!e1.Z.q(sparseArray, g10));
            sparseArray.put(g10, aVar);
        }

        public boolean l(int i10) {
            return ((C0910a) this.f65360a.get(i10)).f65364a.size() > 1;
        }

        public void m(int i10, boolean z10) {
            if (e1.Z.q(this.f65362c, i10)) {
                AbstractC4134a.g(z10 == ((Boolean) this.f65362c.get(i10)).booleanValue());
            } else {
                this.f65362c.put(i10, Boolean.valueOf(z10));
            }
        }

        public void n(int i10, int i11) {
            ((C0910a) this.f65360a.get(i10)).f65365b = i11;
        }

        public boolean o(int i10) {
            AbstractC4134a.g(e1.Z.q(this.f65362c, i10));
            return ((Boolean) this.f65362c.get(i10)).booleanValue();
        }
    }

    public interface b {
        void b(AbstractC3445z abstractC3445z, String str, String str2, C6427w0 c6427w0);

        void d(AbstractC3445z abstractC3445z, String str, String str2);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, t2.g1] */
    public g1(Context context, C6407m c6407m, V0 v02, InterfaceC6383a.b bVar, InterfaceC6391e.a aVar, W.b bVar2, InterfaceC6399i.b bVar3, AbstractC3445z abstractC3445z, int i10, I0 i02, b bVar4, A0 a02, InterfaceC4152t interfaceC4152t, InterfaceC2360n interfaceC2360n, InterfaceC4143j interfaceC4143j, long j10, LogSessionId logSessionId, boolean z10) {
        C6407m c6407m2 = c6407m;
        InterfaceC4143j interfaceC4143j2 = interfaceC4143j;
        ?? obj = new Object();
        obj.f65334a = context;
        obj.f65335b = c6407m2;
        obj.f65337d = new C6397h(bVar3);
        obj.f65354u = abstractC3445z;
        obj.f65355v = i10;
        obj.f65338e = bVar4;
        obj.f65339f = interfaceC4152t;
        obj.f65340g = interfaceC4143j2;
        obj.f65341h = j10;
        obj.f65348o = i02;
        obj.f65356w = z10;
        Log.i("TransformerInternal", "Init " + Integer.toHexString(System.identityHashCode(obj)) + " [AndroidXMedia3/1.8.0] [" + e1.Z.f45507e + "]");
        HandlerThread handlerThread = new HandlerThread("Transformer:Internal");
        obj.f65342i = handlerThread;
        handlerThread.start();
        obj.f65344k = new ArrayList();
        Looper looper = handlerThread.getLooper();
        obj.f65345l = new Object();
        obj.f65346m = new a(c6407m2);
        int i11 = 0;
        g1 g1Var = obj;
        while (i11 < c6407m2.f65405a.size()) {
            c cVar = g1Var.new c(i11, c6407m2, v02, aVar, bVar2, a02, interfaceC2360n, logSessionId);
            g1 g1Var2 = g1Var;
            int i12 = i11;
            C6407m c6407m3 = c6407m2;
            F f10 = (F) c6407m3.f65405a.get(i12);
            InterfaceC4143j interfaceC4143j3 = interfaceC4143j2;
            Looper looper2 = looper;
            g1Var2.f65344k.add(new R0(f10, bVar, new InterfaceC6383a.C0908a(v02.f65181d, c6407m3.f65412h), cVar, interfaceC4143j3, looper2));
            if (!f10.f65032b) {
                g1Var2.f65359z++;
            }
            i11 = i12 + 1;
            interfaceC4143j2 = interfaceC4143j3;
            looper = looper2;
            g1Var = g1Var2;
            c6407m2 = c6407m3;
        }
        final g1 g1Var3 = g1Var;
        InterfaceC4143j interfaceC4143j4 = interfaceC4143j2;
        Looper looper3 = looper;
        g1Var3.f65336c = g1Var3.f65359z != c6407m2.f65405a.size();
        g1Var3.f65350q = new Object();
        g1Var3.f65349p = new C4146m();
        g1Var3.f65351r = new Object();
        g1Var3.f65352s = new K0();
        g1Var3.f65353t = new Object();
        g1Var3.f65347n = new ArrayList();
        g1Var3.f65343j = interfaceC4143j4.d(looper3, new Handler.Callback() { // from class: t2.c1
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                boolean E10;
                E10 = g1.this.E(message);
                return E10;
            }
        });
    }

    public static /* synthetic */ int j(g1 g1Var) {
        int i10 = g1Var.f65359z;
        g1Var.f65359z = i10 - 1;
        return i10;
    }

    public void A() {
        J();
        this.f65343j.e(4, 0, 0, null).a();
    }

    public void B(C6427w0 c6427w0) {
        synchronized (this.f65353t) {
            try {
                if (this.f65333D) {
                    Log.w("TransformerInternal", "Export error after export ended", c6427w0);
                } else {
                    J();
                    this.f65343j.e(4, 2, 0, c6427w0).a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final int C(int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2) {
            return 2;
        }
        throw new IllegalStateException("Unexpected end reason " + i10);
    }

    public int D(K0 k02) {
        int i10;
        synchronized (this.f65351r) {
            try {
                i10 = this.f65331B;
                if (i10 == 2) {
                    k02.f65093a = this.f65332C;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i10;
    }

    public final boolean E(Message message) {
        if (this.f65333D && message.what != 4) {
            return true;
        }
        try {
            int i10 = message.what;
            if (i10 == 1) {
                H();
            } else if (i10 == 2) {
                F((M0) message.obj);
            } else if (i10 == 3) {
                y();
            } else {
                if (i10 != 4) {
                    return false;
                }
                z(message.arg1, (C6427w0) message.obj);
            }
        } catch (RuntimeException e10) {
            z(2, C6427w0.e(e10));
        } catch (C6427w0 e11) {
            z(2, e11);
        }
        return true;
    }

    public final void F(M0 m02) {
        this.f65347n.add(m02);
        if (this.f65357x) {
            return;
        }
        this.f65343j.l(3);
        this.f65357x = true;
    }

    public void G() {
        J();
        this.f65343j.l(1);
        synchronized (this.f65351r) {
            this.f65331B = 1;
            this.f65332C = 0;
        }
        AbstractC5366l.f("TransformerInternal", "Start", -9223372036854775807L, "%s", e1.Z.f45507e);
    }

    public final void H() {
        for (int i10 = 0; i10 < this.f65344k.size(); i10++) {
            ((R0) this.f65344k.get(i10)).start();
        }
    }

    public final void I() {
        if (this.f65333D) {
            return;
        }
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f65344k.size(); i12++) {
            if (!((F) this.f65335b.f65405a.get(i12)).f65032b) {
                this.f65352s.f65093a = 0;
                int e10 = ((R0) this.f65344k.get(i12)).e(this.f65352s);
                if (e10 != 2) {
                    synchronized (this.f65351r) {
                        this.f65331B = e10;
                        this.f65332C = 0;
                    }
                    return;
                }
                i10 += this.f65352s.f65093a;
                i11++;
            }
        }
        synchronized (this.f65351r) {
            this.f65331B = 2;
            this.f65332C = i10 / i11;
        }
    }

    public final void J() {
        AbstractC4134a.h(this.f65342i.isAlive(), "Internal thread is dead.");
    }

    public void w() {
        synchronized (this.f65353t) {
            try {
                if (this.f65333D) {
                    return;
                }
                J();
                this.f65343j.e(4, 1, 0, null).a();
                this.f65340g.e();
                this.f65349p.b();
                this.f65349p.d();
                RuntimeException runtimeException = this.f65330A;
                if (runtimeException != null) {
                    throw runtimeException;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean x(b1.z zVar) {
        if (this.f65356w) {
            return false;
        }
        z.d dVar = zVar.f24659f;
        return dVar.f24685a > 0 && !dVar.f24691g;
    }

    public final void y() {
        for (int i10 = 0; i10 < this.f65347n.size(); i10++) {
            while (((M0) this.f65347n.get(i10)).o()) {
            }
        }
        I();
        if (this.f65348o.k()) {
            return;
        }
        this.f65343j.a(3, 10);
    }

    public final void z(int i10, final C6427w0 c6427w0) {
        final AbstractC3445z.a aVar = new AbstractC3445z.a();
        for (int i11 = 0; i11 < this.f65344k.size(); i11++) {
            aVar.k(((R0) this.f65344k.get(i11)).N());
        }
        boolean z10 = i10 == 1;
        boolean z11 = this.f65333D;
        C6427w0 c6427w02 = null;
        if (!z11) {
            synchronized (this.f65353t) {
                this.f65333D = true;
            }
            Log.i("TransformerInternal", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.8.0] [" + e1.Z.f45507e + "] [" + AbstractC2332A.b() + "]");
            for (int i12 = 0; i12 < this.f65347n.size(); i12++) {
                try {
                    ((M0) this.f65347n.get(i12)).q();
                } catch (RuntimeException e10) {
                    if (c6427w02 == null) {
                        c6427w02 = C6427w0.e(e10);
                        this.f65330A = e10;
                    }
                }
            }
            for (int i13 = 0; i13 < this.f65344k.size(); i13++) {
                try {
                    ((R0) this.f65344k.get(i13)).release();
                } catch (RuntimeException e11) {
                    if (c6427w02 == null) {
                        c6427w02 = C6427w0.e(e11);
                        this.f65330A = e11;
                    }
                }
            }
            try {
                this.f65348o.f(C(i10));
            } catch (RuntimeException e12) {
                if (c6427w02 == null) {
                    C6427w0 e13 = C6427w0.e(e12);
                    this.f65330A = e12;
                    c6427w02 = e13;
                }
            } catch (C6200c e14) {
                if (c6427w02 == null) {
                    c6427w02 = C6427w0.d(e14, 7001);
                }
            }
            InterfaceC4152t interfaceC4152t = this.f65343j;
            final HandlerThread handlerThread = this.f65342i;
            Objects.requireNonNull(handlerThread);
            interfaceC4152t.j(new Runnable() { // from class: t2.d1
                @Override // java.lang.Runnable
                public final void run() {
                    handlerThread.quitSafely();
                }
            });
        }
        if (z10) {
            this.f65349p.f();
            return;
        }
        if (c6427w0 == null) {
            c6427w0 = c6427w02;
        }
        if (c6427w0 == null) {
            if (z11) {
                return;
            }
            AbstractC4134a.g(this.f65339f.j(new Runnable() { // from class: t2.f1
                @Override // java.lang.Runnable
                public final void run() {
                    r0.f65338e.d(aVar.m(), r0.f65337d.e(), g1.this.f65337d.f());
                }
            }));
        } else if (z11) {
            Log.w("TransformerInternal", "Export error after export ended", c6427w0);
        } else {
            AbstractC4134a.g(this.f65339f.j(new Runnable() { // from class: t2.e1
                @Override // java.lang.Runnable
                public final void run() {
                    r0.f65338e.b(aVar.m(), r0.f65337d.e(), g1.this.f65337d.f(), c6427w0);
                }
            }));
        }
    }

    public final class c implements InterfaceC6383a.c {

        /* renamed from: a, reason: collision with root package name */
        public final int f65366a;

        /* renamed from: b, reason: collision with root package name */
        public final E f65367b;

        /* renamed from: c, reason: collision with root package name */
        public final C6407m f65368c;

        /* renamed from: d, reason: collision with root package name */
        public final V0 f65369d;

        /* renamed from: e, reason: collision with root package name */
        public final InterfaceC6391e.a f65370e;

        /* renamed from: f, reason: collision with root package name */
        public final W.b f65371f;

        /* renamed from: g, reason: collision with root package name */
        public final A0 f65372g;

        /* renamed from: h, reason: collision with root package name */
        public final InterfaceC2360n f65373h;

        /* renamed from: i, reason: collision with root package name */
        public final LogSessionId f65374i;

        /* renamed from: j, reason: collision with root package name */
        public long f65375j;

        public c(int i10, C6407m c6407m, V0 v02, InterfaceC6391e.a aVar, W.b bVar, A0 a02, InterfaceC2360n interfaceC2360n, LogSessionId logSessionId) {
            this.f65366a = i10;
            this.f65367b = (E) ((F) c6407m.f65405a.get(i10)).f65031a.get(0);
            this.f65368c = c6407m;
            this.f65369d = v02;
            this.f65370e = aVar;
            this.f65371f = bVar;
            this.f65372g = a02;
            this.f65373h = interfaceC2360n;
            this.f65374i = logSessionId;
        }

        public static /* synthetic */ void e(c cVar, int i10, C0 c02, E e10, long j10, androidx.media3.common.a aVar, boolean z10) {
            cVar.i(i10, j10, z10);
            c02.c(e10, j10, aVar, z10);
        }

        @Override // t2.InterfaceC6383a.c
        public L0 a(androidx.media3.common.a aVar) {
            synchronized (g1.this.f65345l) {
                try {
                    if (!g1.this.f65346m.h()) {
                        return null;
                    }
                    final int g10 = k1.g(aVar.f20543o);
                    if (!g1.this.f65346m.o(g10)) {
                        h(g10);
                    } else if (g1.this.f65346m.b(g10) == this.f65366a) {
                        g(aVar);
                    }
                    M0 d10 = g1.this.f65346m.d(g10);
                    if (d10 == null) {
                        return null;
                    }
                    final C0 k10 = d10.k(this.f65367b, aVar, this.f65366a);
                    ((R0) g1.this.f65344k.get(this.f65366a)).L(new J0() { // from class: t2.h1
                        @Override // t2.J0
                        public final void c(E e10, long j10, androidx.media3.common.a aVar2, boolean z10) {
                            g1.c.e(g1.c.this, g10, k10, e10, j10, aVar2, z10);
                        }
                    }, g10);
                    g1.this.f65346m.i(g10);
                    if (g1.this.f65346m.f(g10)) {
                        g1.this.J();
                        g1.this.f65343j.f(2, d10).a();
                    }
                    return k10;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // t2.InterfaceC6383a.c
        public boolean b(androidx.media3.common.a aVar, int i10) {
            boolean j10;
            int g10 = k1.g(aVar.f20543o);
            synchronized (g1.this.f65345l) {
                try {
                    g1.this.f65346m.k(this.f65366a, aVar);
                    if (g1.this.f65346m.h()) {
                        int c10 = g1.this.f65346m.c();
                        g1.this.f65348o.m(c10);
                        this.f65372g.d(c10);
                    }
                    j10 = j(aVar, i10);
                    if (!j10 && k1.g(aVar.f20543o) == 2) {
                        k1.k(g1.this.f65348o, this.f65367b.f65019g.f65397b, aVar);
                    }
                    g1.this.f65346m.m(g10, j10);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return j10;
        }

        @Override // t2.InterfaceC6383a.c
        public void c(int i10) {
            if (i10 <= 0) {
                d(C6427w0.a(new IllegalStateException("AssetLoader instances must provide at least 1 track."), 1001));
                return;
            }
            synchronized (g1.this.f65345l) {
                g1.this.f65346m.n(this.f65366a, i10);
            }
        }

        @Override // t2.InterfaceC6383a.c
        public void d(C6427w0 c6427w0) {
            g1.this.B(c6427w0);
        }

        public final void g(androidx.media3.common.a aVar) {
            androidx.media3.common.a P10;
            int g10 = k1.g(aVar.f20543o);
            AbstractC4134a.g(g1.this.f65346m.d(g10) == null);
            androidx.media3.common.a a10 = g1.this.f65346m.a(this.f65366a, g10);
            if (AbstractC2335D.o(aVar.f20543o)) {
                g1.this.f65346m.j(1, new C6393f(a10, aVar, this.f65369d, this.f65367b, this.f65368c.f65407c.f65396a, this.f65370e, g1.this.f65337d, g1.this.f65348o, this.f65372g, this.f65374i));
                return;
            }
            if (AbstractC2335D.t(aVar.f20543o)) {
                P10 = a10.b().V(k1.c(k1.h(a10.f20516D), this.f65369d.f65181d == 1)).P();
            } else {
                if (!AbstractC2335D.q(aVar.f20543o)) {
                    throw C6427w0.e(new IllegalArgumentException("assetLoaderOutputFormat has to have a audio, video or image mimetype."));
                }
                P10 = aVar.b().V(k1.h(aVar.f20516D)).P();
            }
            androidx.media3.common.a aVar2 = P10;
            a aVar3 = g1.this.f65346m;
            Context context = g1.this.f65334a;
            V0 v02 = this.f65369d;
            C6407m c6407m = this.f65368c;
            aVar3.j(2, new n1(context, aVar2, v02, c6407m.f65406b, c6407m.f65407c.f65397b, this.f65371f, g1.this.f65337d, g1.this.f65348o, new InterfaceC4148o() { // from class: t2.i1
                @Override // e1.InterfaceC4148o
                public final void accept(Object obj) {
                    g1.c.this.d((C6427w0) obj);
                }
            }, this.f65372g, this.f65373h, g1.this.f65341h, g1.this.f65346m.g(), g1.this.f65354u, g1.this.f65355v, this.f65374i));
        }

        public final void h(int i10) {
            AbstractC4134a.g(g1.this.f65346m.d(i10) == null);
            AbstractC4134a.b(!((F) this.f65368c.f65405a.get(this.f65366a)).b(), "Gaps can not be transmuxed.");
            g1.this.f65346m.j(i10, new C6408m0(g1.this.f65346m.a(this.f65366a, i10), this.f65369d, g1.this.f65348o, this.f65372g, g1.this.f65341h));
        }

        public final void i(int i10, long j10, boolean z10) {
            if (g1.this.f65336c) {
                synchronized (g1.this.f65345l) {
                    try {
                        if (g1.this.f65346m.l(this.f65366a) && i10 == 2) {
                            return;
                        }
                        if (((F) this.f65368c.f65405a.get(this.f65366a)).f65032b) {
                            return;
                        }
                        boolean z11 = true;
                        AbstractC4134a.h(j10 != -9223372036854775807L, "MediaItem duration required for sequence looping could not be extracted.");
                        this.f65375j += j10;
                        synchronized (g1.this.f65350q) {
                            if (z10) {
                                try {
                                    g1.j(g1.this);
                                } finally {
                                }
                            }
                            if (g1.this.f65359z != 0) {
                                z11 = false;
                            }
                            if (this.f65375j > g1.this.f65358y || z11) {
                                g1 g1Var = g1.this;
                                g1Var.f65358y = Math.max(this.f65375j, g1Var.f65358y);
                                for (int i11 = 0; i11 < g1.this.f65344k.size(); i11++) {
                                    ((R0) g1.this.f65344k.get(i11)).S(g1.this.f65358y, z11);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        }

        public final boolean j(androidx.media3.common.a aVar, int i10) {
            boolean z10;
            boolean z11 = (i10 & 2) != 0;
            boolean z12 = (i10 & 1) != 0;
            AbstractC4134a.a(z11 || z12);
            int g10 = k1.g(aVar.f20543o);
            if (!z12) {
                z10 = true;
            } else if (g10 == 1) {
                z10 = k1.l(aVar, this.f65368c, this.f65366a, this.f65369d, g1.this.f65337d, g1.this.f65348o);
            } else if (g10 == 2) {
                z10 = k1.m(aVar, this.f65368c, this.f65366a, this.f65369d, g1.this.f65337d, g1.this.f65348o) || g1.this.x(this.f65367b.f65013a);
                AbstractC4134a.h((g1.this.f65356w && z10) ? false : true, String.format("Transcoding is required for track %s but MP4 edit list trimming is enabled. Disable mp4EditListTrimEnabled or ensure this track does not require transcoding.", aVar));
            } else {
                z10 = false;
            }
            AbstractC4134a.g(!z10 || z11);
            return z10;
        }

        @Override // t2.InterfaceC6383a.c
        public void f(long j10) {
        }
    }
}
