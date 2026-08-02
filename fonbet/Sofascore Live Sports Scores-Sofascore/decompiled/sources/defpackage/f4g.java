package defpackage;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class f4g implements kx4 {
    public int a;
    public float b = 1.0f;
    public float c = 1.0f;
    public float d = 1.0f;
    public float e;
    public float f;
    public float g;
    public long h;
    public long i;
    public float j;
    public float k;
    public float l;
    public float m;
    public long n;
    public uah o;
    public boolean p;
    public int q;
    public long r;
    public kx4 s;
    public ema t;
    public qy1 u;
    public int v;
    public pea w;

    public f4g() {
        long j = r29.a;
        this.h = j;
        this.i = j;
        this.m = 8.0f;
        this.n = xvj.b;
        this.o = oyn.e;
        this.q = 0;
        this.r = 9205357640488583168L;
        this.s = yqo.c();
        this.t = ema.a;
        this.v = 3;
    }

    public final void a() {
        k(1.0f);
        l(1.0f);
        b(1.0f);
        w(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        y(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        m(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        long j = r29.a;
        c(j);
        p(j);
        g(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        h(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        i(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (this.m != 8.0f) {
            this.a |= a.o;
            this.m = 8.0f;
        }
        s(xvj.b);
        o(oyn.e);
        d(false);
        f(null);
        if (this.v != 3) {
            this.a |= 524288;
            this.v = 3;
        }
        e(0);
        this.r = 9205357640488583168L;
        this.w = null;
        this.a = 0;
    }

    public final void b(float f) {
        if (this.d == f) {
            return;
        }
        this.a |= 4;
        this.d = f;
    }

    public final void c(long j) {
        long j2 = this.h;
        int i = r13.j;
        if (e8k.a(j2, j)) {
            return;
        }
        this.a |= 64;
        this.h = j;
    }

    public final void d(boolean z) {
        if (this.p != z) {
            this.a |= 16384;
            this.p = z;
        }
    }

    public final void e(int i) {
        if (this.q == i) {
            return;
        }
        this.a |= 32768;
        this.q = i;
    }

    public final void f(qy1 qy1Var) {
        if (Intrinsics.c(this.u, qy1Var)) {
            return;
        }
        this.a |= 131072;
        this.u = qy1Var;
    }

    public final void g(float f) {
        if (this.j == f) {
            return;
        }
        this.a |= NotificationCompat.FLAG_LOCAL_ONLY;
        this.j = f;
    }

    @Override // defpackage.kx4
    public final float getFontScale() {
        return this.s.getFontScale();
    }

    public final void h(float f) {
        if (this.k == f) {
            return;
        }
        this.a |= 512;
        this.k = f;
    }

    public final void i(float f) {
        if (this.l == f) {
            return;
        }
        this.a |= 1024;
        this.l = f;
    }

    @Override // defpackage.kx4
    public final float j() {
        return this.s.j();
    }

    public final void k(float f) {
        if (this.b == f) {
            return;
        }
        this.a |= 1;
        this.b = f;
    }

    public final void l(float f) {
        if (this.c == f) {
            return;
        }
        this.a |= 2;
        this.c = f;
    }

    public final void m(float f) {
        if (this.g == f) {
            return;
        }
        this.a |= 32;
        this.g = f;
    }

    public final void o(uah uahVar) {
        if (Intrinsics.c(this.o, uahVar)) {
            return;
        }
        this.a |= 8192;
        this.o = uahVar;
    }

    public final void p(long j) {
        long j2 = this.i;
        int i = r13.j;
        if (e8k.a(j2, j)) {
            return;
        }
        this.a |= 128;
        this.i = j;
    }

    public final void s(long j) {
        if (xvj.a(this.n, j)) {
            return;
        }
        this.a |= 4096;
        this.n = j;
    }

    public final void w(float f) {
        if (this.e == f) {
            return;
        }
        this.a |= 8;
        this.e = f;
    }

    public final void y(float f) {
        if (this.f == f) {
            return;
        }
        this.a |= 16;
        this.f = f;
    }
}
