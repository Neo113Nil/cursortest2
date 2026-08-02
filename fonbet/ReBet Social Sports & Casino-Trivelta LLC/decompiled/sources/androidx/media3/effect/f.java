package androidx.media3.effect;

import ai.verisoul.sdk.helpers.webview.VerisoulWebViewImplKt;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import androidx.media3.effect.r;
import b1.C2366u;
import b1.C2368w;
import b1.InterfaceC2367v;
import b1.V;
import e1.AbstractC4134a;
import e1.AbstractC4151s;
import e1.AbstractC4156x;
import e1.Z;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import l1.AbstractC5366l;
import l1.Q;

/* loaded from: classes.dex */
public final class f extends p {

    /* renamed from: v, reason: collision with root package name */
    public static final long f20730v;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC2367v f20731d;

    /* renamed from: e, reason: collision with root package name */
    public Q f20732e;

    /* renamed from: f, reason: collision with root package name */
    public final int f20733f;

    /* renamed from: g, reason: collision with root package name */
    public final Surface f20734g;

    /* renamed from: h, reason: collision with root package name */
    public final SurfaceTexture f20735h;

    /* renamed from: i, reason: collision with root package name */
    public final Queue f20736i;

    /* renamed from: j, reason: collision with root package name */
    public final ScheduledExecutorService f20737j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f20738k;

    /* renamed from: l, reason: collision with root package name */
    public int f20739l;

    /* renamed from: m, reason: collision with root package name */
    public int f20740m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f20741n;

    /* renamed from: o, reason: collision with root package name */
    public C2366u f20742o;

    /* renamed from: p, reason: collision with root package name */
    public C2366u f20743p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f20744q;

    /* renamed from: r, reason: collision with root package name */
    public Future f20745r;

    /* renamed from: s, reason: collision with root package name */
    public CountDownLatch f20746s;

    /* renamed from: t, reason: collision with root package name */
    public volatile boolean f20747t;
    private final float[] textureTransformMatrix;

    /* renamed from: u, reason: collision with root package name */
    public volatile RuntimeException f20748u;
    private static final int[] TRANSFORMATION_MATRIX_EXPECTED_ZERO_INDICES = {2, 3, 6, 7, 8, 9, 11, 14};
    private static final int[] ADDITIONAL_CANDIDATE_BUFFER_SIZE_GUESSES = {1920, 1088};

    static {
        f20730v = Z.S0() ? VerisoulWebViewImplKt.WEBVIEW_TIMEOUT : 500L;
    }

    public f(InterfaceC2367v interfaceC2367v, final r rVar, boolean z10, boolean z11) {
        super(rVar);
        this.f20731d = interfaceC2367v;
        this.f20744q = z10;
        this.f20738k = z11;
        try {
            int m10 = AbstractC4151s.m();
            this.f20733f = m10;
            SurfaceTexture surfaceTexture = new SurfaceTexture(m10);
            this.f20735h = surfaceTexture;
            this.textureTransformMatrix = new float[16];
            this.f20736i = new ConcurrentLinkedQueue();
            this.f20737j = Z.c1("ExtTexMgr:Timer");
            surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: l1.U
                @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
                public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                    androidx.media3.effect.f.u(androidx.media3.effect.f.this, rVar, surfaceTexture2);
                }
            });
            this.f20734g = new Surface(surfaceTexture);
        } catch (AbstractC4151s.a e10) {
            throw new V(e10);
        }
    }

    public static /* synthetic */ void A(f fVar) {
        fVar.getClass();
        AbstractC5366l.e("VideoFrameProcessor", "SurfaceTextureInput", -9223372036854775807L);
        if (fVar.f20744q) {
            fVar.f20736i.add((C2366u) AbstractC4134a.e(fVar.f20743p));
        }
        if (!fVar.f20747t) {
            if (fVar.f20741n) {
                fVar.H();
            }
            fVar.f20740m++;
            fVar.E();
            return;
        }
        fVar.f20735h.updateTexImage();
        fVar.f20736i.poll();
        if (fVar.f20746s == null || !fVar.f20736i.isEmpty()) {
            return;
        }
        fVar.f20746s.countDown();
    }

    public static float D(float f10, int i10) {
        int i11 = i10;
        for (int i12 = 2; i12 <= 256; i12 *= 2) {
            int i13 = (((i10 + i12) - 1) / i12) * i12;
            if (I(i13, f10, i10) < I(i11, f10, i10)) {
                i11 = i13;
            }
        }
        for (int i14 : ADDITIONAL_CANDIDATE_BUFFER_SIZE_GUESSES) {
            if (i14 >= i10 && I(i14, f10, i10) < I(i11, f10, i10)) {
                i11 = i14;
            }
        }
        return I(i11, f10, i10) > 1.0E-9f ? f10 : i10 / i11;
    }

    public static void G(float[] fArr, long j10, int i10, int i11) {
        char c10;
        char c11;
        boolean z10 = fArr.length != 16;
        for (int i12 : TRANSFORMATION_MATRIX_EXPECTED_ZERO_INDICES) {
            z10 |= Math.abs(fArr[i12]) > 1.0E-9f;
        }
        boolean z11 = z10 | (Math.abs(fArr[10] - 1.0f) > 1.0E-9f) | (Math.abs(fArr[15] - 1.0f) > 1.0E-9f);
        char c12 = '\f';
        char c13 = 4;
        if (Math.abs(fArr[0]) > 1.0E-9f && Math.abs(fArr[5]) > 1.0E-9f) {
            r3 = (Math.abs(fArr[4]) > 1.0E-9f) | z11 | (Math.abs(fArr[1]) > 1.0E-9f);
            c11 = '\r';
            c13 = 5;
            c10 = 0;
        } else if (Math.abs(fArr[1]) <= 1.0E-9f || Math.abs(fArr[4]) <= 1.0E-9f) {
            c10 = 65535;
            c11 = 65535;
            c12 = 65535;
            c13 = 65535;
        } else {
            r3 = z11 | (Math.abs(fArr[0]) > 1.0E-9f) | (Math.abs(fArr[5]) > 1.0E-9f);
            c11 = '\f';
            c12 = '\r';
            c10 = 1;
        }
        if (r3) {
            AbstractC5366l.f("ExternalTextureManager", "SurfaceTextureTransformFix", j10, "Unable to apply SurfaceTexture fix", new Object[0]);
            return;
        }
        float f10 = fArr[c10];
        float f11 = fArr[c12];
        if (Math.abs(f10) + 1.0E-9f < 1.0f) {
            float copySign = Math.copySign(D(Math.abs(f10), i10), f10);
            AbstractC5366l.f("ExternalTextureManager", "SurfaceTextureTransformFix", j10, "Width scale adjusted.", new Object[0]);
            fArr[c10] = copySign;
            fArr[c12] = ((f10 - copySign) * 0.5f) + f11;
        }
        float f12 = fArr[c13];
        float f13 = fArr[c11];
        if (Math.abs(f12) + 1.0E-9f < 1.0f) {
            float copySign2 = Math.copySign(D(Math.abs(f12), i11), f12);
            AbstractC5366l.f("ExternalTextureManager", "SurfaceTextureTransformFix", j10, "Height scale adjusted.", new Object[0]);
            fArr[c13] = copySign2;
            fArr[c11] = ((f12 - copySign2) * 0.5f) + f13;
        }
    }

    public static float I(int i10, float f10, int i11) {
        float f11 = 1.0f;
        for (int i12 = 0; i12 <= 2; i12++) {
            float f12 = ((i11 - i12) / i10) - f10;
            if (Math.abs(f12) < f11) {
                f11 = Math.abs(f12);
            }
        }
        return f11;
    }

    public static /* synthetic */ void r(f fVar) {
        fVar.f20742o = null;
        if (!fVar.f20741n || !fVar.f20736i.isEmpty()) {
            fVar.E();
            return;
        }
        fVar.f20741n = false;
        ((Q) AbstractC4134a.e(fVar.f20732e)).g();
        AbstractC5366l.e("ExternalTextureManager", "SignalEOS", Long.MIN_VALUE);
        fVar.B();
    }

    public static /* synthetic */ void t(f fVar) {
        if (fVar.f20744q) {
            fVar.f20747t = true;
        }
        if (!fVar.f20736i.isEmpty() || fVar.f20742o != null) {
            fVar.f20741n = true;
            fVar.H();
        } else {
            ((Q) AbstractC4134a.e(fVar.f20732e)).g();
            AbstractC5366l.e("ExternalTextureManager", "SignalEOS", Long.MIN_VALUE);
            fVar.B();
        }
    }

    public static /* synthetic */ void u(final f fVar, r rVar, SurfaceTexture surfaceTexture) {
        fVar.getClass();
        rVar.k(new r.b() { // from class: l1.Y
            @Override // androidx.media3.effect.r.b
            public final void run() {
                androidx.media3.effect.f.A(androidx.media3.effect.f.this);
            }
        }, false);
    }

    public static /* synthetic */ void v(f fVar) {
        fVar.f20739l++;
        fVar.E();
    }

    public static /* synthetic */ void w(f fVar, i iVar) {
        fVar.f20739l = 0;
        fVar.f20732e = (Q) iVar;
    }

    public static /* synthetic */ void y(f fVar) {
        fVar.getClass();
        try {
            fVar.F();
        } catch (RuntimeException e10) {
            fVar.f20748u = e10;
            AbstractC4156x.e("ExtTexMgr", "Failed to remove texture frames", e10);
            if (fVar.f20746s != null) {
                fVar.f20746s.countDown();
            }
        }
    }

    public final void B() {
        Future future = this.f20745r;
        if (future != null) {
            future.cancel(false);
        }
        this.f20745r = null;
    }

    public final void C() {
        if (this.f20740m == this.f20736i.size()) {
            return;
        }
        AbstractC4156x.i("ExtTexMgr", Z.G("Forcing EOS after missing %d frames for %d ms, with available frame count: %d", Integer.valueOf(this.f20736i.size()), Long.valueOf(f20730v), Integer.valueOf(this.f20740m)));
        this.f20741n = false;
        this.f20742o = null;
        this.f20747t = true;
        F();
        this.f20736i.clear();
        q();
    }

    public final void E() {
        if (this.f20739l == 0 || this.f20740m == 0 || this.f20742o != null) {
            return;
        }
        this.f20735h.updateTexImage();
        this.f20740m--;
        C2366u c2366u = (C2366u) this.f20736i.element();
        this.f20742o = c2366u;
        this.f20739l--;
        this.f20735h.getTransformMatrix(this.textureTransformMatrix);
        long timestamp = (this.f20735h.getTimestamp() / 1000) + c2366u.f24633b;
        if (this.f20738k) {
            float[] fArr = this.textureTransformMatrix;
            androidx.media3.common.a aVar = c2366u.f24632a;
            G(fArr, timestamp, aVar.f20550v, aVar.f20551w);
        }
        ((Q) AbstractC4134a.e(this.f20732e)).j(this.textureTransformMatrix);
        Q q10 = (Q) AbstractC4134a.e(this.f20732e);
        InterfaceC2367v interfaceC2367v = this.f20731d;
        int i10 = this.f20733f;
        androidx.media3.common.a aVar2 = c2366u.f24632a;
        q10.c(interfaceC2367v, new C2368w(i10, -1, -1, aVar2.f20550v, aVar2.f20551w), timestamp);
        AbstractC4134a.i((C2366u) this.f20736i.remove());
        AbstractC5366l.e("VideoFrameProcessor", "QueueFrame", timestamp);
    }

    public final void F() {
        while (true) {
            int i10 = this.f20740m;
            if (i10 <= 0) {
                break;
            }
            this.f20740m = i10 - 1;
            this.f20735h.updateTexImage();
            this.f20736i.remove();
        }
        if (this.f20746s == null || !this.f20736i.isEmpty()) {
            return;
        }
        this.f20746s.countDown();
    }

    public final void H() {
        B();
        this.f20745r = this.f20737j.schedule(new Runnable() { // from class: l1.V
            @Override // java.lang.Runnable
            public final void run() {
                r0.f20844a.j(new r.b() { // from class: l1.b0
                    @Override // androidx.media3.effect.r.b
                    public final void run() {
                        androidx.media3.effect.f.this.C();
                    }
                });
            }
        }, f20730v, TimeUnit.MILLISECONDS);
    }

    @Override // androidx.media3.effect.i.b
    public void b(C2368w c2368w) {
        this.f20844a.j(new r.b() { // from class: l1.X
            @Override // androidx.media3.effect.r.b
            public final void run() {
                androidx.media3.effect.f.r(androidx.media3.effect.f.this);
            }
        });
    }

    @Override // androidx.media3.effect.p
    public void c() {
        this.f20747t = true;
    }

    @Override // androidx.media3.effect.p
    public void d() {
        this.f20739l = 0;
        this.f20742o = null;
        this.f20736i.clear();
        this.f20743p = null;
        super.d();
    }

    @Override // androidx.media3.effect.i.b
    public void e() {
        this.f20844a.j(new r.b() { // from class: l1.Z
            @Override // androidx.media3.effect.r.b
            public final void run() {
                androidx.media3.effect.f.v(androidx.media3.effect.f.this);
            }
        });
    }

    @Override // androidx.media3.effect.p
    public Surface f() {
        return this.f20734g;
    }

    @Override // androidx.media3.effect.p
    public int g() {
        return this.f20736i.size();
    }

    @Override // androidx.media3.effect.p
    public void j(C2366u c2366u) {
        this.f20743p = c2366u;
        if (!this.f20744q) {
            this.f20736i.add(c2366u);
        }
        this.f20844a.j(new r.b() { // from class: l1.T
            @Override // androidx.media3.effect.r.b
            public final void run() {
                androidx.media3.effect.f.this.f20747t = false;
            }
        });
    }

    @Override // androidx.media3.effect.p
    public void k() {
        this.f20735h.release();
        this.f20734g.release();
        this.f20737j.shutdownNow();
    }

    @Override // androidx.media3.effect.p
    public void l() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.f20746s = countDownLatch;
        this.f20844a.j(new r.b() { // from class: l1.W
            @Override // androidx.media3.effect.r.b
            public final void run() {
                androidx.media3.effect.f.y(androidx.media3.effect.f.this);
            }
        });
        try {
            if (!countDownLatch.await(f20730v, TimeUnit.MILLISECONDS)) {
                AbstractC4156x.i("ExtTexMgr", "Timeout reached while waiting for latch to be unblocked.");
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            AbstractC4156x.i("ExtTexMgr", "Interrupted when waiting for MediaCodec frames to arrive.");
        }
        this.f20746s = null;
        if (this.f20748u != null) {
            throw this.f20748u;
        }
    }

    @Override // androidx.media3.effect.p
    public void m(C2366u c2366u, boolean z10) {
        this.f20744q = z10;
        if (z10) {
            this.f20743p = c2366u;
            SurfaceTexture surfaceTexture = this.f20735h;
            androidx.media3.common.a aVar = c2366u.f24632a;
            surfaceTexture.setDefaultBufferSize(aVar.f20550v, aVar.f20551w);
        }
    }

    @Override // androidx.media3.effect.p
    public void p(final i iVar) {
        AbstractC4134a.g(iVar instanceof Q);
        this.f20844a.j(new r.b() { // from class: l1.a0
            @Override // androidx.media3.effect.r.b
            public final void run() {
                androidx.media3.effect.f.w(androidx.media3.effect.f.this, iVar);
            }
        });
    }

    @Override // androidx.media3.effect.p
    public void q() {
        this.f20844a.j(new r.b() { // from class: l1.S
            @Override // androidx.media3.effect.r.b
            public final void run() {
                androidx.media3.effect.f.t(androidx.media3.effect.f.this);
            }
        });
    }
}
