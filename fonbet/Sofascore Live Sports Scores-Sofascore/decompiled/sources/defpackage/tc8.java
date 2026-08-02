package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class tc8 extends ao1 implements ed8, Runnable {
    public final fsg a;
    public final int b;
    public final int c;
    public final AtomicLong d = new AtomicLong();
    public iki e;
    public ohh f;
    public volatile boolean g;
    public volatile boolean h;
    public Throwable i;
    public int j;
    public long k;
    public boolean l;

    public tc8(fsg fsgVar, int i) {
        this.a = fsgVar;
        this.b = i;
        this.c = i - (i >> 2);
    }

    @Override // defpackage.zif
    public final int c(int i) {
        this.l = true;
        return 2;
    }

    @Override // defpackage.iki
    public final void cancel() {
        if (this.g) {
            return;
        }
        this.g = true;
        this.e.cancel();
        this.a.d();
        if (this.l || getAndIncrement() != 0) {
            return;
        }
        this.f.clear();
    }

    @Override // defpackage.ohh
    public final void clear() {
        this.f.clear();
    }

    public final boolean d(boolean z, boolean z2, ed8 ed8Var) {
        if (this.g) {
            clear();
            return true;
        }
        if (!z) {
            return false;
        }
        Throwable th = this.i;
        if (th != null) {
            this.g = true;
            clear();
            ed8Var.onError(th);
            this.a.d();
            return true;
        }
        if (!z2) {
            return false;
        }
        this.g = true;
        ed8Var.onComplete();
        this.a.d();
        return true;
    }

    public abstract void g();

    public abstract void h();

    public abstract void i();

    @Override // defpackage.ohh
    public final boolean isEmpty() {
        return this.f.isEmpty();
    }

    public final void j() {
        if (getAndIncrement() != 0) {
            return;
        }
        this.a.b(this);
    }

    @Override // defpackage.ed8
    public final void onComplete() {
        if (this.h) {
            return;
        }
        this.h = true;
        j();
    }

    @Override // defpackage.ed8
    public final void onError(Throwable th) {
        if (this.h) {
            hda.L(th);
            return;
        }
        this.i = th;
        this.h = true;
        j();
    }

    @Override // defpackage.ed8
    public final void onNext(Object obj) {
        if (this.h) {
            return;
        }
        if (this.j == 2) {
            j();
            return;
        }
        if (!this.f.offer(obj)) {
            this.e.cancel();
            this.i = new qkc("Queue is full?!");
            this.h = true;
        }
        j();
    }

    @Override // defpackage.iki
    public final void request(long j) {
        if (pki.c(j)) {
            wkn.n(this.d, j);
            j();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.l) {
            h();
        } else if (this.j == 1) {
            i();
        } else {
            g();
        }
    }
}
