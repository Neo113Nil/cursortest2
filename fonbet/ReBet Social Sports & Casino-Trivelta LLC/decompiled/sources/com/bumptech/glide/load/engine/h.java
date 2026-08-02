package com.bumptech.glide.load.engine;

import P4.a;
import android.os.Build;
import android.util.Log;
import com.bumptech.glide.j;
import com.bumptech.glide.load.engine.f;
import com.bumptech.glide.load.engine.i;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import x0.InterfaceC6775d;
import z4.InterfaceC6925a;

/* loaded from: classes2.dex */
public class h implements f.a, Runnable, Comparable, a.f {

    /* renamed from: A, reason: collision with root package name */
    public com.bumptech.glide.load.a f29769A;

    /* renamed from: B, reason: collision with root package name */
    public com.bumptech.glide.load.data.d f29770B;

    /* renamed from: C, reason: collision with root package name */
    public volatile com.bumptech.glide.load.engine.f f29771C;

    /* renamed from: D, reason: collision with root package name */
    public volatile boolean f29772D;

    /* renamed from: E, reason: collision with root package name */
    public volatile boolean f29773E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f29774F;

    /* renamed from: d, reason: collision with root package name */
    public final e f29778d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC6775d f29779e;

    /* renamed from: h, reason: collision with root package name */
    public com.bumptech.glide.e f29782h;

    /* renamed from: i, reason: collision with root package name */
    public com.bumptech.glide.load.g f29783i;

    /* renamed from: j, reason: collision with root package name */
    public com.bumptech.glide.h f29784j;

    /* renamed from: k, reason: collision with root package name */
    public n f29785k;

    /* renamed from: l, reason: collision with root package name */
    public int f29786l;

    /* renamed from: m, reason: collision with root package name */
    public int f29787m;

    /* renamed from: n, reason: collision with root package name */
    public j f29788n;

    /* renamed from: o, reason: collision with root package name */
    public com.bumptech.glide.load.j f29789o;

    /* renamed from: p, reason: collision with root package name */
    public b f29790p;

    /* renamed from: q, reason: collision with root package name */
    public int f29791q;

    /* renamed from: r, reason: collision with root package name */
    public EnumC0470h f29792r;

    /* renamed from: s, reason: collision with root package name */
    public g f29793s;

    /* renamed from: t, reason: collision with root package name */
    public long f29794t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f29795u;

    /* renamed from: v, reason: collision with root package name */
    public Object f29796v;

    /* renamed from: w, reason: collision with root package name */
    public Thread f29797w;

    /* renamed from: x, reason: collision with root package name */
    public com.bumptech.glide.load.g f29798x;

    /* renamed from: y, reason: collision with root package name */
    public com.bumptech.glide.load.g f29799y;

    /* renamed from: z, reason: collision with root package name */
    public Object f29800z;

    /* renamed from: a, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.g f29775a = new com.bumptech.glide.load.engine.g();

    /* renamed from: b, reason: collision with root package name */
    public final List f29776b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final P4.c f29777c = P4.c.a();

    /* renamed from: f, reason: collision with root package name */
    public final d f29780f = new d();

    /* renamed from: g, reason: collision with root package name */
    public final f f29781g = new f();

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$bumptech$glide$load$EncodeStrategy;
        static final /* synthetic */ int[] $SwitchMap$com$bumptech$glide$load$engine$DecodeJob$RunReason;
        static final /* synthetic */ int[] $SwitchMap$com$bumptech$glide$load$engine$DecodeJob$Stage;

        static {
            int[] iArr = new int[com.bumptech.glide.load.c.values().length];
            $SwitchMap$com$bumptech$glide$load$EncodeStrategy = iArr;
            try {
                iArr[com.bumptech.glide.load.c.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$bumptech$glide$load$EncodeStrategy[com.bumptech.glide.load.c.TRANSFORMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[EnumC0470h.values().length];
            $SwitchMap$com$bumptech$glide$load$engine$DecodeJob$Stage = iArr2;
            try {
                iArr2[EnumC0470h.RESOURCE_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$bumptech$glide$load$engine$DecodeJob$Stage[EnumC0470h.DATA_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$bumptech$glide$load$engine$DecodeJob$Stage[EnumC0470h.SOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$bumptech$glide$load$engine$DecodeJob$Stage[EnumC0470h.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$bumptech$glide$load$engine$DecodeJob$Stage[EnumC0470h.INITIALIZE.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[g.values().length];
            $SwitchMap$com$bumptech$glide$load$engine$DecodeJob$RunReason = iArr3;
            try {
                iArr3[g.INITIALIZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$bumptech$glide$load$engine$DecodeJob$RunReason[g.SWITCH_TO_SOURCE_SERVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$bumptech$glide$load$engine$DecodeJob$RunReason[g.DECODE_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public interface b {
        void a(h hVar);

        void b(v vVar, com.bumptech.glide.load.a aVar, boolean z10);

        void c(q qVar);
    }

    public final class c implements i.a {

        /* renamed from: a, reason: collision with root package name */
        public final com.bumptech.glide.load.a f29801a;

        public c(com.bumptech.glide.load.a aVar) {
            this.f29801a = aVar;
        }

        @Override // com.bumptech.glide.load.engine.i.a
        public v a(v vVar) {
            return h.this.v(this.f29801a, vVar);
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public com.bumptech.glide.load.g f29803a;

        /* renamed from: b, reason: collision with root package name */
        public com.bumptech.glide.load.m f29804b;

        /* renamed from: c, reason: collision with root package name */
        public u f29805c;

        public void a() {
            this.f29803a = null;
            this.f29804b = null;
            this.f29805c = null;
        }

        public void b(e eVar, com.bumptech.glide.load.j jVar) {
            P4.b.a("DecodeJob.encode");
            try {
                eVar.a().b(this.f29803a, new com.bumptech.glide.load.engine.e(this.f29804b, this.f29805c, jVar));
            } finally {
                this.f29805c.f();
                P4.b.e();
            }
        }

        public boolean c() {
            return this.f29805c != null;
        }

        public void d(com.bumptech.glide.load.g gVar, com.bumptech.glide.load.m mVar, u uVar) {
            this.f29803a = gVar;
            this.f29804b = mVar;
            this.f29805c = uVar;
        }
    }

    public interface e {
        InterfaceC6925a a();
    }

    public static class f {

        /* renamed from: a, reason: collision with root package name */
        public boolean f29806a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f29807b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f29808c;

        public final boolean a(boolean z10) {
            return (this.f29808c || z10 || this.f29807b) && this.f29806a;
        }

        public synchronized boolean b() {
            this.f29807b = true;
            return a(false);
        }

        public synchronized boolean c() {
            this.f29808c = true;
            return a(false);
        }

        public synchronized boolean d(boolean z10) {
            this.f29806a = true;
            return a(z10);
        }

        public synchronized void e() {
            this.f29807b = false;
            this.f29806a = false;
            this.f29808c = false;
        }
    }

    public enum g {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    /* renamed from: com.bumptech.glide.load.engine.h$h, reason: collision with other inner class name */
    public enum EnumC0470h {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    public h(e eVar, InterfaceC6775d interfaceC6775d) {
        this.f29778d = eVar;
        this.f29779e = interfaceC6775d;
    }

    public final v A(Object obj, com.bumptech.glide.load.a aVar, t tVar) {
        com.bumptech.glide.load.j l10 = l(aVar);
        com.bumptech.glide.load.data.e l11 = this.f29782h.i().l(obj);
        try {
            return tVar.a(l11, l10, this.f29786l, this.f29787m, new c(aVar));
        } finally {
            l11.b();
        }
    }

    public final void B() {
        int i10 = a.$SwitchMap$com$bumptech$glide$load$engine$DecodeJob$RunReason[this.f29793s.ordinal()];
        if (i10 == 1) {
            this.f29792r = k(EnumC0470h.INITIALIZE);
            this.f29771C = j();
            z();
        } else if (i10 == 2) {
            z();
        } else {
            if (i10 == 3) {
                i();
                return;
            }
            throw new IllegalStateException("Unrecognized run reason: " + this.f29793s);
        }
    }

    public final void C() {
        Throwable th2;
        this.f29777c.c();
        if (!this.f29772D) {
            this.f29772D = true;
            return;
        }
        if (this.f29776b.isEmpty()) {
            th2 = null;
        } else {
            List list = this.f29776b;
            th2 = (Throwable) list.get(list.size() - 1);
        }
        throw new IllegalStateException("Already notified", th2);
    }

    public boolean D() {
        EnumC0470h k10 = k(EnumC0470h.INITIALIZE);
        return k10 == EnumC0470h.RESOURCE_CACHE || k10 == EnumC0470h.DATA_CACHE;
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void a(com.bumptech.glide.load.g gVar, Exception exc, com.bumptech.glide.load.data.d dVar, com.bumptech.glide.load.a aVar) {
        dVar.b();
        q qVar = new q("Fetching data failed", exc);
        qVar.j(gVar, aVar, dVar.a());
        this.f29776b.add(qVar);
        if (Thread.currentThread() != this.f29797w) {
            y(g.SWITCH_TO_SOURCE_SERVICE);
        } else {
            z();
        }
    }

    public void b() {
        this.f29773E = true;
        com.bumptech.glide.load.engine.f fVar = this.f29771C;
        if (fVar != null) {
            fVar.cancel();
        }
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void c() {
        y(g.SWITCH_TO_SOURCE_SERVICE);
    }

    @Override // P4.a.f
    public P4.c d() {
        return this.f29777c;
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void e(com.bumptech.glide.load.g gVar, Object obj, com.bumptech.glide.load.data.d dVar, com.bumptech.glide.load.a aVar, com.bumptech.glide.load.g gVar2) {
        this.f29798x = gVar;
        this.f29800z = obj;
        this.f29770B = dVar;
        this.f29769A = aVar;
        this.f29799y = gVar2;
        this.f29774F = gVar != this.f29775a.c().get(0);
        if (Thread.currentThread() != this.f29797w) {
            y(g.DECODE_DATA);
            return;
        }
        P4.b.a("DecodeJob.decodeFromRetrievedData");
        try {
            i();
        } finally {
            P4.b.e();
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public int compareTo(h hVar) {
        int m10 = m() - hVar.m();
        return m10 == 0 ? this.f29791q - hVar.f29791q : m10;
    }

    public final v g(com.bumptech.glide.load.data.d dVar, Object obj, com.bumptech.glide.load.a aVar) {
        if (obj == null) {
            dVar.b();
            return null;
        }
        try {
            long b10 = com.bumptech.glide.util.g.b();
            v h10 = h(obj, aVar);
            if (Log.isLoggable("DecodeJob", 2)) {
                o("Decoded result " + h10, b10);
            }
            return h10;
        } finally {
            dVar.b();
        }
    }

    public final v h(Object obj, com.bumptech.glide.load.a aVar) {
        return A(obj, aVar, this.f29775a.h(obj.getClass()));
    }

    public final void i() {
        v vVar;
        if (Log.isLoggable("DecodeJob", 2)) {
            p("Retrieved data", this.f29794t, "data: " + this.f29800z + ", cache key: " + this.f29798x + ", fetcher: " + this.f29770B);
        }
        try {
            vVar = g(this.f29770B, this.f29800z, this.f29769A);
        } catch (q e10) {
            e10.i(this.f29799y, this.f29769A);
            this.f29776b.add(e10);
            vVar = null;
        }
        if (vVar != null) {
            r(vVar, this.f29769A, this.f29774F);
        } else {
            z();
        }
    }

    public final com.bumptech.glide.load.engine.f j() {
        int i10 = a.$SwitchMap$com$bumptech$glide$load$engine$DecodeJob$Stage[this.f29792r.ordinal()];
        if (i10 == 1) {
            return new w(this.f29775a, this);
        }
        if (i10 == 2) {
            return new com.bumptech.glide.load.engine.c(this.f29775a, this);
        }
        if (i10 == 3) {
            return new z(this.f29775a, this);
        }
        if (i10 == 4) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: " + this.f29792r);
    }

    public final EnumC0470h k(EnumC0470h enumC0470h) {
        int i10 = a.$SwitchMap$com$bumptech$glide$load$engine$DecodeJob$Stage[enumC0470h.ordinal()];
        if (i10 == 1) {
            return this.f29788n.a() ? EnumC0470h.DATA_CACHE : k(EnumC0470h.DATA_CACHE);
        }
        if (i10 == 2) {
            return this.f29795u ? EnumC0470h.FINISHED : EnumC0470h.SOURCE;
        }
        if (i10 == 3 || i10 == 4) {
            return EnumC0470h.FINISHED;
        }
        if (i10 == 5) {
            return this.f29788n.b() ? EnumC0470h.RESOURCE_CACHE : k(EnumC0470h.RESOURCE_CACHE);
        }
        throw new IllegalArgumentException("Unrecognized stage: " + enumC0470h);
    }

    public final com.bumptech.glide.load.j l(com.bumptech.glide.load.a aVar) {
        com.bumptech.glide.load.j jVar = this.f29789o;
        if (Build.VERSION.SDK_INT < 26) {
            return jVar;
        }
        boolean z10 = aVar == com.bumptech.glide.load.a.RESOURCE_DISK_CACHE || this.f29775a.x();
        com.bumptech.glide.load.i iVar = com.bumptech.glide.load.resource.bitmap.u.f30056j;
        Boolean bool = (Boolean) jVar.c(iVar);
        if (bool != null && (!bool.booleanValue() || z10)) {
            return jVar;
        }
        com.bumptech.glide.load.j jVar2 = new com.bumptech.glide.load.j();
        jVar2.d(this.f29789o);
        jVar2.e(iVar, Boolean.valueOf(z10));
        return jVar2;
    }

    public final int m() {
        return this.f29784j.ordinal();
    }

    public h n(com.bumptech.glide.e eVar, Object obj, n nVar, com.bumptech.glide.load.g gVar, int i10, int i11, Class cls, Class cls2, com.bumptech.glide.h hVar, j jVar, Map map, boolean z10, boolean z11, boolean z12, com.bumptech.glide.load.j jVar2, b bVar, int i12) {
        this.f29775a.v(eVar, obj, gVar, i10, i11, jVar, cls, cls2, hVar, jVar2, map, z10, z11, this.f29778d);
        this.f29782h = eVar;
        this.f29783i = gVar;
        this.f29784j = hVar;
        this.f29785k = nVar;
        this.f29786l = i10;
        this.f29787m = i11;
        this.f29788n = jVar;
        this.f29795u = z12;
        this.f29789o = jVar2;
        this.f29790p = bVar;
        this.f29791q = i12;
        this.f29793s = g.INITIALIZE;
        this.f29796v = obj;
        return this;
    }

    public final void o(String str, long j10) {
        p(str, j10, null);
    }

    public final void p(String str, long j10, String str2) {
        com.bumptech.glide.util.g.a(j10);
        Objects.toString(this.f29785k);
        if (str2 != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(", ");
            sb2.append(str2);
        }
        Thread.currentThread().getName();
    }

    public final void q(v vVar, com.bumptech.glide.load.a aVar, boolean z10) {
        C();
        this.f29790p.b(vVar, aVar, z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void r(v vVar, com.bumptech.glide.load.a aVar, boolean z10) {
        u uVar;
        P4.b.a("DecodeJob.notifyEncodeAndRelease");
        try {
            if (vVar instanceof r) {
                ((r) vVar).initialize();
            }
            if (this.f29780f.c()) {
                vVar = u.c(vVar);
                uVar = vVar;
            } else {
                uVar = 0;
            }
            q(vVar, aVar, z10);
            this.f29792r = EnumC0470h.ENCODE;
            try {
                if (this.f29780f.c()) {
                    this.f29780f.b(this.f29778d, this.f29789o);
                }
                t();
                P4.b.e();
            } finally {
                if (uVar != 0) {
                    uVar.f();
                }
            }
        } catch (Throwable th2) {
            P4.b.e();
            throw th2;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        P4.b.c("DecodeJob#run(reason=%s, model=%s)", this.f29793s, this.f29796v);
        com.bumptech.glide.load.data.d dVar = this.f29770B;
        try {
            try {
                try {
                    if (this.f29773E) {
                        s();
                        if (dVar != null) {
                            dVar.b();
                        }
                        P4.b.e();
                        return;
                    }
                    B();
                    if (dVar != null) {
                        dVar.b();
                    }
                    P4.b.e();
                } catch (Throwable th2) {
                    if (Log.isLoggable("DecodeJob", 3)) {
                        Objects.toString(this.f29792r);
                    }
                    if (this.f29792r != EnumC0470h.ENCODE) {
                        this.f29776b.add(th2);
                        s();
                    }
                    if (!this.f29773E) {
                        throw th2;
                    }
                    throw th2;
                }
            } catch (com.bumptech.glide.load.engine.b e10) {
                throw e10;
            }
        } catch (Throwable th3) {
            if (dVar != null) {
                dVar.b();
            }
            P4.b.e();
            throw th3;
        }
    }

    public final void s() {
        C();
        this.f29790p.c(new q("Failed to load resource", new ArrayList(this.f29776b)));
        u();
    }

    public final void t() {
        if (this.f29781g.b()) {
            x();
        }
    }

    public final void u() {
        if (this.f29781g.c()) {
            x();
        }
    }

    public v v(com.bumptech.glide.load.a aVar, v vVar) {
        v vVar2;
        com.bumptech.glide.load.n nVar;
        com.bumptech.glide.load.c cVar;
        com.bumptech.glide.load.g dVar;
        Class<?> cls = vVar.get().getClass();
        com.bumptech.glide.load.m mVar = null;
        if (aVar != com.bumptech.glide.load.a.RESOURCE_DISK_CACHE) {
            com.bumptech.glide.load.n s10 = this.f29775a.s(cls);
            nVar = s10;
            vVar2 = s10.a(this.f29782h, vVar, this.f29786l, this.f29787m);
        } else {
            vVar2 = vVar;
            nVar = null;
        }
        if (!vVar.equals(vVar2)) {
            vVar.recycle();
        }
        if (this.f29775a.w(vVar2)) {
            mVar = this.f29775a.n(vVar2);
            cVar = mVar.b(this.f29789o);
        } else {
            cVar = com.bumptech.glide.load.c.NONE;
        }
        com.bumptech.glide.load.m mVar2 = mVar;
        if (!this.f29788n.d(!this.f29775a.y(this.f29798x), aVar, cVar)) {
            return vVar2;
        }
        if (mVar2 == null) {
            throw new j.d(vVar2.get().getClass());
        }
        int i10 = a.$SwitchMap$com$bumptech$glide$load$EncodeStrategy[cVar.ordinal()];
        if (i10 == 1) {
            dVar = new com.bumptech.glide.load.engine.d(this.f29798x, this.f29783i);
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException("Unknown strategy: " + cVar);
            }
            dVar = new x(this.f29775a.b(), this.f29798x, this.f29783i, this.f29786l, this.f29787m, nVar, cls, this.f29789o);
        }
        u c10 = u.c(vVar2);
        this.f29780f.d(dVar, mVar2, c10);
        return c10;
    }

    public void w(boolean z10) {
        if (this.f29781g.d(z10)) {
            x();
        }
    }

    public final void x() {
        this.f29781g.e();
        this.f29780f.a();
        this.f29775a.a();
        this.f29772D = false;
        this.f29782h = null;
        this.f29783i = null;
        this.f29789o = null;
        this.f29784j = null;
        this.f29785k = null;
        this.f29790p = null;
        this.f29792r = null;
        this.f29771C = null;
        this.f29797w = null;
        this.f29798x = null;
        this.f29800z = null;
        this.f29769A = null;
        this.f29770B = null;
        this.f29794t = 0L;
        this.f29773E = false;
        this.f29796v = null;
        this.f29776b.clear();
        this.f29779e.release(this);
    }

    public final void y(g gVar) {
        this.f29793s = gVar;
        this.f29790p.a(this);
    }

    public final void z() {
        this.f29797w = Thread.currentThread();
        this.f29794t = com.bumptech.glide.util.g.b();
        boolean z10 = false;
        while (!this.f29773E && this.f29771C != null && !(z10 = this.f29771C.b())) {
            this.f29792r = k(this.f29792r);
            this.f29771C = j();
            if (this.f29792r == EnumC0470h.SOURCE) {
                y(g.SWITCH_TO_SOURCE_SERVICE);
                return;
            }
        }
        if ((this.f29792r == EnumC0470h.FINISHED || this.f29773E) && !z10) {
            s();
        }
    }
}
