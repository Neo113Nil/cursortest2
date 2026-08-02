package androidx.media3.effect;

import android.content.Context;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.util.SparseArray;
import androidx.media3.effect.e;
import androidx.media3.effect.j;
import androidx.media3.effect.q;
import androidx.media3.effect.r;
import b1.C2357k;
import b1.C2368w;
import b1.InterfaceC2337F;
import b1.InterfaceC2367v;
import b1.U;
import b1.V;
import com.google.common.collect.AbstractC3445z;
import com.google.common.collect.I;
import e1.AbstractC4134a;
import e1.AbstractC4151s;
import e1.AbstractC4156x;
import e1.C4158z;
import e1.L;
import e1.Z;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.LongCompanionObject;
import l1.C5385v;
import l1.K0;
import l1.Y0;
import l1.Z0;

/* loaded from: classes.dex */
public final class e implements q {

    /* renamed from: a, reason: collision with root package name */
    public final q.a f20707a;

    /* renamed from: b, reason: collision with root package name */
    public final j.a f20708b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2367v f20709c;

    /* renamed from: d, reason: collision with root package name */
    public final a f20710d;

    /* renamed from: e, reason: collision with root package name */
    public final r f20711e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f20713g;

    /* renamed from: h, reason: collision with root package name */
    public final Y0 f20714h;

    /* renamed from: i, reason: collision with root package name */
    public final C4158z f20715i;

    /* renamed from: j, reason: collision with root package name */
    public final C4158z f20716j;

    /* renamed from: l, reason: collision with root package name */
    public C2357k f20718l;

    /* renamed from: m, reason: collision with root package name */
    public EGLDisplay f20719m;

    /* renamed from: n, reason: collision with root package name */
    public EGLSurface f20720n;

    /* renamed from: o, reason: collision with root package name */
    public int f20721o = -1;

    /* renamed from: f, reason: collision with root package name */
    public final SparseArray f20712f = new SparseArray();

    /* renamed from: k, reason: collision with root package name */
    public U f20717k = U.f24521a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Context f20722a;

        /* renamed from: b, reason: collision with root package name */
        public final K0 f20723b = new K0();

        /* renamed from: c, reason: collision with root package name */
        public e1.r f20724c;

        public a(Context context) {
            this.f20722a = context;
        }

        public final void a(b bVar) {
            e1.r rVar = (e1.r) AbstractC4134a.e(this.f20724c);
            C2368w c2368w = bVar.f20726b.f55483a;
            rVar.s("uTexSampler", c2368w.f24635a, 0);
            rVar.p("uTransformationMatrix", this.f20723b.b(new L(c2368w.f24638d, c2368w.f24639e), bVar.f20727c));
            rVar.o("uAlphaScale", bVar.f20727c.a());
            rVar.e();
            GLES20.glDrawArrays(5, 0, 4);
            AbstractC4151s.d();
        }

        public void b(List list, C2368w c2368w) {
            c();
            AbstractC4151s.D(c2368w.f24636b, c2368w.f24638d, c2368w.f24639e);
            this.f20723b.a(new L(c2368w.f24638d, c2368w.f24639e));
            AbstractC4151s.f();
            ((e1.r) AbstractC4134a.e(this.f20724c)).u();
            GLES20.glEnable(3042);
            GLES20.glBlendFuncSeparate(770, 771, 1, 771);
            AbstractC4151s.d();
            for (int size = list.size() - 1; size >= 0; size--) {
                a((b) list.get(size));
            }
            GLES20.glDisable(3042);
            AbstractC4151s.d();
        }

        public final void c() {
            if (this.f20724c != null) {
                return;
            }
            try {
                e1.r rVar = new e1.r(this.f20722a, "shaders/vertex_shader_transformation_es2.glsl", "shaders/fragment_shader_alpha_scale_es2.glsl");
                this.f20724c = rVar;
                rVar.m("aFramePosition", AbstractC4151s.K(), 4);
                this.f20724c.p("uTexTransformationMatrix", AbstractC4151s.g());
            } catch (IOException e10) {
                throw new V(e10);
            }
        }

        public void d() {
            try {
                e1.r rVar = this.f20724c;
                if (rVar != null) {
                    rVar.f();
                }
            } catch (AbstractC4151s.a e10) {
                AbstractC4156x.e("CompositorGlProgram", "Error releasing GL Program", e10);
            }
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final j f20725a;

        /* renamed from: b, reason: collision with root package name */
        public final Z0 f20726b;

        /* renamed from: c, reason: collision with root package name */
        public final InterfaceC2337F f20727c;

        public b(j jVar, Z0 z02, InterfaceC2337F interfaceC2337F) {
            this.f20725a = jVar;
            this.f20726b = z02;
            this.f20727c = interfaceC2337F;
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final Queue f20728a = new ArrayDeque();

        /* renamed from: b, reason: collision with root package name */
        public boolean f20729b;
    }

    public e(Context context, InterfaceC2367v interfaceC2367v, ExecutorService executorService, final q.a aVar, j.a aVar2, int i10) {
        this.f20707a = aVar;
        this.f20708b = aVar2;
        this.f20709c = interfaceC2367v;
        this.f20710d = new a(context);
        this.f20714h = new Y0(false, i10);
        this.f20715i = new C4158z(i10);
        this.f20716j = new C4158z(i10);
        Objects.requireNonNull(aVar);
        r rVar = new r(executorService, false, new r.a() { // from class: l1.y
            @Override // androidx.media3.effect.r.a
            public final void a(b1.V v10) {
                q.a.this.a(v10);
            }
        });
        this.f20711e = rVar;
        rVar.j(new r.b() { // from class: l1.z
            @Override // androidx.media3.effect.r.b
            public final void run() {
                androidx.media3.effect.e.this.r();
            }
        });
    }

    public static /* synthetic */ boolean c(long j10, b bVar) {
        return bVar.f20726b.f55484b <= j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void q(long j10) {
        while (this.f20714h.h() < this.f20714h.a() && this.f20715i.d() <= j10) {
            try {
                this.f20714h.f();
                this.f20715i.f();
                AbstractC4151s.x(this.f20716j.f());
            } catch (Throwable th2) {
                throw th2;
            }
        }
        l();
    }

    @Override // androidx.media3.effect.q
    public synchronized void b(int i10) {
        AbstractC4134a.g(!Z.q(this.f20712f, i10));
        this.f20712f.put(i10, new c());
        if (this.f20721o == -1) {
            this.f20721o = i10;
        }
    }

    @Override // androidx.media3.effect.q
    public void d(U u10) {
        this.f20717k = u10;
    }

    @Override // androidx.media3.effect.q
    public synchronized void e(int i10) {
        try {
            AbstractC4134a.g(Z.q(this.f20712f, i10));
            boolean z10 = false;
            AbstractC4134a.g(this.f20721o != -1);
            ((c) this.f20712f.get(i10)).f20729b = true;
            int i11 = 0;
            while (true) {
                if (i11 >= this.f20712f.size()) {
                    z10 = true;
                    break;
                } else if (!((c) this.f20712f.valueAt(i11)).f20729b) {
                    break;
                } else {
                    i11++;
                }
            }
            this.f20713g = z10;
            if (((c) this.f20712f.get(this.f20721o)).f20728a.isEmpty()) {
                if (i10 == this.f20721o) {
                    m();
                }
                if (z10) {
                    this.f20707a.c();
                    return;
                }
            }
            if (i10 != this.f20721o && ((c) this.f20712f.get(i10)).f20728a.size() == 1) {
                this.f20711e.j(new C5385v(this));
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // androidx.media3.effect.q
    public synchronized void i(int i10, j jVar, C2368w c2368w, C2357k c2357k, long j10) {
        try {
            AbstractC4134a.g(Z.q(this.f20712f, i10));
            c cVar = (c) this.f20712f.get(i10);
            AbstractC4134a.g(!cVar.f20729b);
            AbstractC4134a.j(Boolean.valueOf(!C2357k.i(c2357k)), "HDR input is not supported.");
            if (this.f20718l == null) {
                this.f20718l = c2357k;
            }
            AbstractC4134a.h(this.f20718l.equals(c2357k), "Mixing different ColorInfos is not supported.");
            cVar.f20728a.add(new b(jVar, new Z0(c2368w, j10), this.f20717k.a(i10, j10)));
            if (i10 == this.f20721o) {
                m();
            } else {
                n(cVar);
            }
            this.f20711e.j(new C5385v(this));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized AbstractC3445z j() {
        if (this.f20714h.h() == 0) {
            return AbstractC3445z.t();
        }
        for (int i10 = 0; i10 < this.f20712f.size(); i10++) {
            if (((c) this.f20712f.valueAt(i10)).f20728a.isEmpty()) {
                return AbstractC3445z.t();
            }
        }
        AbstractC3445z.a aVar = new AbstractC3445z.a();
        b bVar = (b) ((c) this.f20712f.get(this.f20721o)).f20728a.element();
        aVar.a(bVar);
        for (int i11 = 0; i11 < this.f20712f.size(); i11++) {
            if (this.f20712f.keyAt(i11) != this.f20721o) {
                c cVar = (c) this.f20712f.valueAt(i11);
                if (cVar.f20728a.size() == 1 && !cVar.f20729b) {
                    return AbstractC3445z.t();
                }
                Iterator it = cVar.f20728a.iterator();
                long j10 = LongCompanionObject.MAX_VALUE;
                b bVar2 = null;
                while (it.hasNext()) {
                    b bVar3 = (b) it.next();
                    long j11 = bVar3.f20726b.f55484b;
                    long abs = Math.abs(j11 - bVar.f20726b.f55484b);
                    if (abs < j10) {
                        bVar2 = bVar3;
                        j10 = abs;
                    }
                    if (j11 > bVar.f20726b.f55484b || (!it.hasNext() && cVar.f20729b)) {
                        aVar.a((b) AbstractC4134a.e(bVar2));
                        break;
                    }
                }
            }
        }
        AbstractC3445z m10 = aVar.m();
        if (m10.size() == this.f20712f.size()) {
            return m10;
        }
        return AbstractC3445z.t();
    }

    @Override // androidx.media3.effect.j
    public void k(final long j10) {
        this.f20711e.j(new r.b() { // from class: l1.u
            @Override // androidx.media3.effect.r.b
            public final void run() {
                androidx.media3.effect.e.this.q(j10);
            }
        });
    }

    public final synchronized void l() {
        try {
            try {
                AbstractC3445z j10 = j();
                if (j10.isEmpty()) {
                    return;
                }
                b bVar = (b) j10.get(this.f20721o);
                AbstractC3445z.a aVar = new AbstractC3445z.a();
                for (int i10 = 0; i10 < j10.size(); i10++) {
                    C2368w c2368w = ((b) j10.get(i10)).f20726b.f55483a;
                    aVar.a(new L(c2368w.f24638d, c2368w.f24639e));
                }
                L b10 = this.f20717k.b(aVar.m());
                this.f20714h.d(this.f20709c, b10.b(), b10.a());
                C2368w m10 = this.f20714h.m();
                long j11 = bVar.f20726b.f55484b;
                this.f20715i.a(j11);
                this.f20710d.b(j10, m10);
                long p10 = AbstractC4151s.p();
                this.f20716j.a(p10);
                this.f20708b.a(this, m10, j11, p10);
                c cVar = (c) this.f20712f.get(this.f20721o);
                o(cVar, 1);
                m();
                if (this.f20713g && cVar.f20728a.isEmpty()) {
                    this.f20707a.c();
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final synchronized void m() {
        for (int i10 = 0; i10 < this.f20712f.size(); i10++) {
            if (this.f20712f.keyAt(i10) != this.f20721o) {
                n((c) this.f20712f.valueAt(i10));
            }
        }
    }

    public final synchronized void n(c cVar) {
        c cVar2 = (c) this.f20712f.get(this.f20721o);
        if (cVar2.f20728a.isEmpty() && cVar2.f20729b) {
            o(cVar, cVar.f20728a.size());
            return;
        }
        b bVar = (b) cVar2.f20728a.peek();
        final long j10 = bVar != null ? bVar.f20726b.f55484b : -9223372036854775807L;
        o(cVar, Math.max(I.l(I.d(cVar.f20728a, new Ra.o() { // from class: l1.w
            @Override // Ra.o
            public final boolean apply(Object obj) {
                return androidx.media3.effect.e.c(j10, (e.b) obj);
            }
        })) - 1, 0));
    }

    public final synchronized void o(c cVar, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            b bVar = (b) cVar.f20728a.remove();
            bVar.f20725a.k(bVar.f20726b.f55484b);
        }
    }

    public final void p() {
        try {
            this.f20710d.d();
            this.f20714h.c();
            AbstractC4151s.B(this.f20719m, this.f20720n);
        } catch (AbstractC4151s.a e10) {
            AbstractC4156x.e("DefaultVideoCompositor", "Error releasing GL resources", e10);
        }
    }

    public final void r() {
        EGLDisplay I10 = AbstractC4151s.I();
        this.f20719m = I10;
        this.f20720n = this.f20709c.c(this.f20709c.d(I10, 2, AbstractC4151s.EGL_CONFIG_ATTRIBUTES_RGBA_8888), this.f20719m);
    }

    @Override // androidx.media3.effect.q
    public synchronized void release() {
        try {
            this.f20711e.i(new r.b() { // from class: l1.x
                @Override // androidx.media3.effect.r.b
                public final void run() {
                    androidx.media3.effect.e.this.p();
                }
            });
        } catch (InterruptedException e10) {
            Thread.currentThread().interrupt();
            throw new IllegalStateException(e10);
        }
    }
}
