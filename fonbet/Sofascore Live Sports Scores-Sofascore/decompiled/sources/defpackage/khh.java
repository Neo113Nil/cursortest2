package defpackage;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class khh implements cm4 {
    public final jhh a;
    public final im4[] e;
    public final jm4[] f;
    public int g;
    public int h;
    public im4 i;
    public dy3 j;
    public boolean k;
    public boolean l;
    public final Object b = new Object();
    public long m = C.TIME_UNSET;
    public final ArrayDeque c = new ArrayDeque();
    public final ArrayDeque d = new ArrayDeque();

    public khh(im4[] im4VarArr, jm4[] jm4VarArr) {
        this.e = im4VarArr;
        this.g = im4VarArr.length;
        for (int i = 0; i < this.g; i++) {
            this.e[i] = c();
        }
        this.f = jm4VarArr;
        this.h = jm4VarArr.length;
        for (int i2 = 0; i2 < this.h; i2++) {
            this.f[i2] = d();
        }
        jhh jhhVar = new jhh(this, 1);
        this.a = jhhVar;
        jhhVar.start();
    }

    @Override // defpackage.cm4
    public final void b(long j) {
        boolean z;
        synchronized (this.b) {
            try {
                if (this.g != this.e.length && !this.k) {
                    z = false;
                    z1a.E(z);
                    this.m = j;
                }
                z = true;
                z1a.E(z);
                this.m = j;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract im4 c();

    public abstract jm4 d();

    @Override // defpackage.cm4
    public final Object dequeueInputBuffer() {
        im4 im4Var;
        synchronized (this.b) {
            try {
                dy3 dy3Var = this.j;
                if (dy3Var != null) {
                    throw dy3Var;
                }
                z1a.E(this.i == null);
                int i = this.g;
                if (i == 0) {
                    im4Var = null;
                } else {
                    im4[] im4VarArr = this.e;
                    int i2 = i - 1;
                    this.g = i2;
                    im4Var = im4VarArr[i2];
                }
                this.i = im4Var;
            } catch (Throwable th) {
                throw th;
            }
        }
        return im4Var;
    }

    public abstract dy3 e(Throwable th);

    public abstract dy3 f(im4 im4Var, jm4 jm4Var, boolean z);

    @Override // defpackage.cm4
    public final void flush() {
        synchronized (this.b) {
            try {
                this.k = true;
                im4 im4Var = this.i;
                if (im4Var != null) {
                    im4Var.A();
                    im4[] im4VarArr = this.e;
                    int i = this.g;
                    this.g = i + 1;
                    im4VarArr[i] = im4Var;
                    this.i = null;
                }
                while (!this.c.isEmpty()) {
                    im4 im4Var2 = (im4) this.c.removeFirst();
                    im4Var2.A();
                    im4[] im4VarArr2 = this.e;
                    int i2 = this.g;
                    this.g = i2 + 1;
                    im4VarArr2[i2] = im4Var2;
                }
                while (!this.d.isEmpty()) {
                    ((jm4) this.d.removeFirst()).B();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean g() {
        boolean z;
        dy3 e;
        synchronized (this.b) {
            while (!this.l) {
                try {
                    if (!this.c.isEmpty() && this.h > 0) {
                        break;
                    }
                    this.b.wait();
                } finally {
                }
            }
            if (this.l) {
                return false;
            }
            im4 im4Var = (im4) this.c.removeFirst();
            jm4[] jm4VarArr = this.f;
            int i = this.h - 1;
            this.h = i;
            jm4 jm4Var = jm4VarArr[i];
            boolean z2 = this.k;
            this.k = false;
            if (im4Var.i(4)) {
                jm4Var.b(4);
            } else {
                jm4Var.g = im4Var.k;
                if (im4Var.i(134217728)) {
                    jm4Var.b(134217728);
                }
                long j = im4Var.k;
                synchronized (this.b) {
                    long j2 = this.m;
                    if (j2 != C.TIME_UNSET && j < j2) {
                        z = false;
                    }
                    z = true;
                }
                if (!z) {
                    jm4Var.h = true;
                }
                try {
                    e = f(im4Var, jm4Var, z2);
                } catch (OutOfMemoryError e2) {
                    e = e(e2);
                } catch (RuntimeException e3) {
                    e = e(e3);
                }
                if (e != null) {
                    synchronized (this.b) {
                        this.j = e;
                    }
                    return false;
                }
            }
            synchronized (this.b) {
                try {
                    if (this.k) {
                        jm4Var.B();
                    } else if (jm4Var.h) {
                        jm4Var.B();
                    } else {
                        this.d.addLast(jm4Var);
                    }
                    im4Var.A();
                    im4[] im4VarArr = this.e;
                    int i2 = this.g;
                    this.g = i2 + 1;
                    im4VarArr[i2] = im4Var;
                } finally {
                }
            }
            return true;
        }
    }

    @Override // defpackage.cm4
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final jm4 dequeueOutputBuffer() {
        synchronized (this.b) {
            try {
                dy3 dy3Var = this.j;
                if (dy3Var != null) {
                    throw dy3Var;
                }
                if (this.d.isEmpty()) {
                    return null;
                }
                return (jm4) this.d.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.cm4
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final void a(im4 im4Var) {
        synchronized (this.b) {
            try {
                dy3 dy3Var = this.j;
                if (dy3Var != null) {
                    throw dy3Var;
                }
                z1a.s(im4Var == this.i);
                this.c.addLast(im4Var);
                if (!this.c.isEmpty() && this.h > 0) {
                    this.b.notify();
                }
                this.i = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j(jm4 jm4Var) {
        synchronized (this.b) {
            jm4Var.A();
            jm4[] jm4VarArr = this.f;
            int i = this.h;
            this.h = i + 1;
            jm4VarArr[i] = jm4Var;
            if (!this.c.isEmpty() && this.h > 0) {
                this.b.notify();
            }
        }
    }

    @Override // defpackage.cm4
    public final void release() {
        synchronized (this.b) {
            this.l = true;
            this.b.notify();
        }
        try {
            this.a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
