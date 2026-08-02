package k1;

import e1.AbstractC4134a;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public abstract class h implements d {

    /* renamed from: a, reason: collision with root package name */
    public final Thread f54119a;
    private final f[] availableInputBuffers;
    private final g[] availableOutputBuffers;

    /* renamed from: e, reason: collision with root package name */
    public int f54123e;

    /* renamed from: f, reason: collision with root package name */
    public int f54124f;

    /* renamed from: g, reason: collision with root package name */
    public f f54125g;

    /* renamed from: h, reason: collision with root package name */
    public e f54126h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f54127i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f54128j;

    /* renamed from: k, reason: collision with root package name */
    public int f54129k;

    /* renamed from: b, reason: collision with root package name */
    public final Object f54120b = new Object();

    /* renamed from: l, reason: collision with root package name */
    public long f54130l = -9223372036854775807L;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayDeque f54121c = new ArrayDeque();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque f54122d = new ArrayDeque();

    public class a extends Thread {
        public a(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            h.this.v();
        }
    }

    public h(f[] fVarArr, g[] gVarArr) {
        this.availableInputBuffers = fVarArr;
        this.f54123e = fVarArr.length;
        for (int i10 = 0; i10 < this.f54123e; i10++) {
            this.availableInputBuffers[i10] = i();
        }
        this.availableOutputBuffers = gVarArr;
        this.f54124f = gVarArr.length;
        for (int i11 = 0; i11 < this.f54124f; i11++) {
            this.availableOutputBuffers[i11] = j();
        }
        a aVar = new a("ExoPlayer:SimpleDecoder");
        this.f54119a = aVar;
        aVar.start();
    }

    @Override // k1.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void d(f fVar) {
        synchronized (this.f54120b) {
            r();
            AbstractC4134a.a(fVar == this.f54125g);
            this.f54121c.addLast(fVar);
            q();
            this.f54125g = null;
        }
    }

    @Override // k1.d
    public final void e(long j10) {
        boolean z10;
        synchronized (this.f54120b) {
            try {
                if (this.f54123e != this.availableInputBuffers.length && !this.f54127i) {
                    z10 = false;
                    AbstractC4134a.g(z10);
                    this.f54130l = j10;
                }
                z10 = true;
                AbstractC4134a.g(z10);
                this.f54130l = j10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // k1.d
    public final void flush() {
        synchronized (this.f54120b) {
            try {
                this.f54127i = true;
                this.f54129k = 0;
                f fVar = this.f54125g;
                if (fVar != null) {
                    s(fVar);
                    this.f54125g = null;
                }
                while (!this.f54121c.isEmpty()) {
                    s((f) this.f54121c.removeFirst());
                }
                while (!this.f54122d.isEmpty()) {
                    ((g) this.f54122d.removeFirst()).o();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean h() {
        return !this.f54121c.isEmpty() && this.f54124f > 0;
    }

    public abstract f i();

    public abstract g j();

    public abstract e k(Throwable th2);

    public abstract e l(f fVar, g gVar, boolean z10);

    public final boolean m() {
        e k10;
        synchronized (this.f54120b) {
            while (!this.f54128j && !h()) {
                try {
                    this.f54120b.wait();
                } finally {
                }
            }
            if (this.f54128j) {
                return false;
            }
            f fVar = (f) this.f54121c.removeFirst();
            g[] gVarArr = this.availableOutputBuffers;
            int i10 = this.f54124f - 1;
            this.f54124f = i10;
            g gVar = gVarArr[i10];
            boolean z10 = this.f54127i;
            this.f54127i = false;
            if (fVar.i()) {
                gVar.e(4);
            } else {
                gVar.f54116b = fVar.f54110f;
                if (fVar.j()) {
                    gVar.e(134217728);
                }
                if (!p(fVar.f54110f)) {
                    gVar.f54118d = true;
                }
                try {
                    k10 = l(fVar, gVar, z10);
                } catch (OutOfMemoryError e10) {
                    k10 = k(e10);
                } catch (RuntimeException e11) {
                    k10 = k(e11);
                }
                if (k10 != null) {
                    synchronized (this.f54120b) {
                        this.f54126h = k10;
                    }
                    return false;
                }
            }
            synchronized (this.f54120b) {
                try {
                    if (this.f54127i) {
                        gVar.o();
                    } else if (gVar.f54118d) {
                        this.f54129k++;
                        gVar.o();
                    } else {
                        gVar.f54117c = this.f54129k;
                        this.f54129k = 0;
                        this.f54122d.addLast(gVar);
                    }
                    s(fVar);
                } finally {
                }
            }
            return true;
        }
    }

    @Override // k1.d
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final f f() {
        f fVar;
        synchronized (this.f54120b) {
            r();
            AbstractC4134a.g(this.f54125g == null);
            int i10 = this.f54123e;
            if (i10 == 0) {
                fVar = null;
            } else {
                f[] fVarArr = this.availableInputBuffers;
                int i11 = i10 - 1;
                this.f54123e = i11;
                fVar = fVarArr[i11];
            }
            this.f54125g = fVar;
        }
        return fVar;
    }

    @Override // k1.d
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final g a() {
        synchronized (this.f54120b) {
            try {
                r();
                if (this.f54122d.isEmpty()) {
                    return null;
                }
                return (g) this.f54122d.removeFirst();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean p(long j10) {
        boolean z10;
        synchronized (this.f54120b) {
            long j11 = this.f54130l;
            z10 = j11 == -9223372036854775807L || j10 >= j11;
        }
        return z10;
    }

    public final void q() {
        if (h()) {
            this.f54120b.notify();
        }
    }

    public final void r() {
        e eVar = this.f54126h;
        if (eVar != null) {
            throw eVar;
        }
    }

    @Override // k1.d
    public void release() {
        synchronized (this.f54120b) {
            this.f54128j = true;
            this.f54120b.notify();
        }
        try {
            this.f54119a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    public final void s(f fVar) {
        fVar.f();
        f[] fVarArr = this.availableInputBuffers;
        int i10 = this.f54123e;
        this.f54123e = i10 + 1;
        fVarArr[i10] = fVar;
    }

    public void t(g gVar) {
        synchronized (this.f54120b) {
            u(gVar);
            q();
        }
    }

    public final void u(g gVar) {
        gVar.f();
        g[] gVarArr = this.availableOutputBuffers;
        int i10 = this.f54124f;
        this.f54124f = i10 + 1;
        gVarArr[i10] = gVar;
    }

    public final void v() {
        do {
            try {
            } catch (InterruptedException e10) {
                throw new IllegalStateException(e10);
            }
        } while (m());
    }

    public final void w(int i10) {
        AbstractC4134a.g(this.f54123e == this.availableInputBuffers.length);
        for (f fVar : this.availableInputBuffers) {
            fVar.p(i10);
        }
    }
}
