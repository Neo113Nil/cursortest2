package kh;

import android.content.Context;
import gh.n0;
import gh.o0;
import java.io.IOException;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okio.Okio;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public boolean f19118a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f19119b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f19120c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f19121d;

    /* renamed from: e, reason: collision with root package name */
    public Object f19122e;

    public h(c4.v vVar) {
        this.f19119b = new WeakReference(vVar);
        this.f19120c = new v4.a(this, vVar);
        this.f19121d = new v4.b(this);
    }

    public static IOException a(h hVar, long j, boolean z5, IOException iOException, int i5) {
        boolean z7;
        boolean z10;
        h hVar2;
        IOException iOException2;
        p pVar = (p) hVar.f19119b;
        boolean z11 = false;
        boolean z12 = (i5 & 4) == 0;
        boolean z13 = (i5 & 8) == 0;
        gh.r rVar = (gh.r) hVar.f19120c;
        if (iOException != null) {
            hVar.f(iOException);
        }
        if (z13) {
            if (iOException != null) {
                rVar.r(pVar, iOException);
            } else {
                rVar.p(pVar, j);
            }
        }
        if (z12) {
            if (iOException != null) {
                rVar.w(pVar, iOException);
            } else {
                rVar.u(pVar, j);
            }
        }
        if (!z13 || z5) {
            z7 = false;
        } else {
            z7 = false;
            z11 = true;
        }
        boolean z14 = (!z12 || z5) ? z7 : true;
        boolean z15 = (z13 && z5) ? true : z7;
        if (z12 && z5) {
            z10 = true;
            iOException2 = iOException;
            hVar2 = hVar;
        } else {
            z10 = z7;
            hVar2 = hVar;
            iOException2 = iOException;
        }
        return pVar.i(hVar2, z11, z14, z10, z15, iOException2);
    }

    public q b() {
        lh.e g10 = ((lh.f) this.f19122e).g();
        q qVar = g10 instanceof q ? (q) g10 : null;
        if (qVar != null) {
            return qVar;
        }
        throw new IllegalStateException("no connection for CONNECT tunnels");
    }

    public lh.i c(o0 response) {
        h hVar;
        lh.f fVar = (lh.f) this.f19122e;
        Intrinsics.checkNotNullParameter(response, "response");
        try {
            String c2 = o0.c(response, "Content-Type");
            long i5 = fVar.i(response);
            hVar = this;
            try {
                return new lh.i(c2, i5, Okio.buffer(new f(hVar, fVar.h(response), i5, false)));
            } catch (IOException e7) {
                e = e7;
                IOException iOException = e;
                ((gh.r) hVar.f19120c).w((p) hVar.f19119b, iOException);
                f(iOException);
                throw iOException;
            }
        } catch (IOException e9) {
            e = e9;
            hVar = this;
        }
    }

    public n0 d(boolean z5) {
        try {
            n0 d10 = ((lh.f) this.f19122e).d(z5);
            if (d10 != null) {
                Intrinsics.checkNotNullParameter(this, "exchange");
                d10.f10269n = this;
            }
            return d10;
        } catch (IOException e7) {
            ((gh.r) this.f19120c).w((p) this.f19119b, e7);
            f(e7);
            throw e7;
        }
    }

    public synchronized void e() {
        try {
            if (this.f19118a) {
                return;
            }
            this.f19118a = true;
            Context context = (Context) this.f19122e;
            if (context != null) {
                ((v4.a) this.f19120c).b(context);
                context.unregisterComponentCallbacks((v4.b) this.f19121d);
            }
            ((WeakReference) this.f19119b).clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void f(IOException iOException) {
        this.f19118a = true;
        ((lh.f) this.f19122e).g().g((p) this.f19119b, iOException);
    }

    public g g() {
        p pVar = (p) this.f19119b;
        if (pVar.j) {
            throw new IllegalStateException("Check failed.");
        }
        pVar.j = true;
        pVar.f19142e.exit();
        synchronized (pVar) {
            if (pVar.f19153r == null) {
                throw new IllegalStateException("Check failed.");
            }
            if (pVar.f19150n || pVar.f19151o) {
                throw new IllegalStateException("Check failed.");
            }
            if (pVar.f19148l) {
                throw new IllegalStateException("Check failed.");
            }
            if (!pVar.f19149m) {
                throw new IllegalStateException("Check failed.");
            }
            pVar.f19149m = false;
            pVar.f19150n = true;
            pVar.f19151o = true;
            Unit unit = Unit.f19194a;
        }
        lh.e g10 = ((lh.f) this.f19122e).g();
        Intrinsics.checkNotNull(g10, "null cannot be cast to non-null type okhttp3.internal.connection.RealConnection");
        q qVar = (q) g10;
        qVar.f19158e.setSoTimeout(0);
        qVar.e();
        return new g(this);
    }

    public h(p call, gh.r eventListener, i finder, lh.f codec) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        Intrinsics.checkNotNullParameter(finder, "finder");
        Intrinsics.checkNotNullParameter(codec, "codec");
        this.f19119b = call;
        this.f19120c = eventListener;
        this.f19121d = finder;
        this.f19122e = codec;
    }
}
