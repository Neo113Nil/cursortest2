package defpackage;

import java.io.IOException;
import java.net.Socket;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class tk0 implements ejh {
    public final k6h c;
    public final ood d;
    public wk0 h;
    public Socket i;
    public boolean j;
    public int k;
    public int l;
    public final Object a = new Object();
    public final x52 b = new x52();
    public boolean e = false;
    public boolean f = false;
    public boolean g = false;

    public tk0(k6h k6hVar, ood oodVar) {
        z1a.y(k6hVar, "executor");
        this.c = k6hVar;
        this.d = oodVar;
    }

    @Override // defpackage.ejh
    public final void W(x52 x52Var, long j) {
        z1a.y(x52Var, "source");
        if (this.g) {
            is8.e("closed");
            return;
        }
        jde.c();
        try {
            synchronized (this.a) {
                try {
                    this.b.W(x52Var, j);
                    int i = this.l + this.k;
                    this.l = i;
                    this.k = 0;
                    boolean z = true;
                    if (this.j || i <= 10000) {
                        if (!this.e && !this.f && this.b.m() > 0) {
                            this.e = true;
                            z = false;
                        }
                        jde.a.getClass();
                        return;
                    }
                    this.j = true;
                    if (!z) {
                        this.c.execute(new qk0(this, 0));
                        jde.a.getClass();
                    } else {
                        try {
                            this.i.close();
                        } catch (IOException e) {
                            this.d.m(e);
                        }
                        jde.a.getClass();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            try {
                jde.a.getClass();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // defpackage.ejh, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.g) {
            return;
        }
        this.g = true;
        this.c.execute(new b8(this, 4));
    }

    public final void e(wk0 wk0Var, Socket socket) {
        z1a.D("AsyncSink's becomeConnected should only be called once.", this.h == null);
        this.h = wk0Var;
        this.i = socket;
    }

    @Override // defpackage.ejh, java.io.Flushable
    public final void flush() {
        if (this.g) {
            is8.e("closed");
            return;
        }
        jde.c();
        try {
            synchronized (this.a) {
                if (this.f) {
                    jde.a.getClass();
                    return;
                }
                this.f = true;
                this.c.execute(new qk0(this, 1));
                jde.a.getClass();
            }
        } catch (Throwable th) {
            try {
                jde.a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ejh
    public final pij timeout() {
        return pij.d;
    }
}
