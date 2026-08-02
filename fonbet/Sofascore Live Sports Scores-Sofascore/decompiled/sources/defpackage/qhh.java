package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class qhh implements mli, bm4 {
    public final jhh a;
    public final sm2[] f;
    public int h;
    public hm4 i;
    public oli j;
    public boolean k;
    public boolean l;
    public final Object b = new Object();
    public final ArrayDeque c = new ArrayDeque();
    public final ArrayDeque d = new ArrayDeque();
    public final hm4[] e = new tli[2];
    public int g = 2;

    public qhh() {
        int i = 2;
        sm2[] sm2VarArr = new sm2[2];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= this.g) {
                break;
            }
            this.e[i3] = new tli(1);
            i3++;
        }
        this.f = sm2VarArr;
        this.h = 2;
        for (int i4 = 0; i4 < this.h; i4++) {
            this.f[i4] = new sm2(this, i);
        }
        jhh jhhVar = new jhh(this, i2);
        this.a = jhhVar;
        jhhVar.start();
        int i5 = this.g;
        hm4[] hm4VarArr = this.e;
        qx9.t(i5 == hm4VarArr.length);
        int length = hm4VarArr.length;
        while (i2 < length) {
            hm4VarArr[i2].C(1024);
            i2++;
        }
    }

    @Override // defpackage.bm4
    public final void a(tli tliVar) {
        synchronized (this.b) {
            try {
                oli oliVar = this.j;
                if (oliVar != null) {
                    throw oliVar;
                }
                qx9.r(tliVar == this.i);
                this.c.addLast(tliVar);
                if (!this.c.isEmpty() && this.h > 0) {
                    this.b.notify();
                }
                this.i = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract kli b(byte[] bArr, int i, boolean z);

    public final oli c(hm4 hm4Var, sm2 sm2Var, boolean z) {
        tli tliVar = (tli) hm4Var;
        try {
            ByteBuffer byteBuffer = tliVar.h;
            byteBuffer.getClass();
            sm2Var.B(tliVar.j, b(byteBuffer.array(), byteBuffer.limit(), z), tliVar.m);
            sm2Var.b &= Integer.MAX_VALUE;
            return null;
        } catch (oli e) {
            return e;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0087 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d() {
        oli oliVar;
        oli oliVar2;
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
            hm4 hm4Var = (hm4) this.c.removeFirst();
            sm2[] sm2VarArr = this.f;
            int i = this.h - 1;
            this.h = i;
            sm2 sm2Var = sm2VarArr[i];
            boolean z = this.k;
            this.k = false;
            if (hm4Var.i(4)) {
                sm2Var.b(4);
            } else {
                if (hm4Var.i(Integer.MIN_VALUE)) {
                    sm2Var.b(Integer.MIN_VALUE);
                }
                if (hm4Var.i(134217728)) {
                    sm2Var.b(134217728);
                }
                try {
                    oliVar2 = c(hm4Var, sm2Var, z);
                } catch (OutOfMemoryError e) {
                    oliVar = new oli("Unexpected decode error", e);
                    oliVar2 = oliVar;
                    if (oliVar2 != null) {
                    }
                    synchronized (this.b) {
                    }
                } catch (RuntimeException e2) {
                    oliVar = new oli("Unexpected decode error", e2);
                    oliVar2 = oliVar;
                    if (oliVar2 != null) {
                    }
                    synchronized (this.b) {
                    }
                }
                if (oliVar2 != null) {
                    synchronized (this.b) {
                        this.j = oliVar2;
                    }
                    return false;
                }
            }
            synchronized (this.b) {
                try {
                    if (this.k) {
                        sm2Var.A();
                    } else if (sm2Var.i(Integer.MIN_VALUE)) {
                        sm2Var.A();
                    } else {
                        this.d.addLast(sm2Var);
                    }
                    hm4Var.A();
                    hm4[] hm4VarArr = this.e;
                    int i2 = this.g;
                    this.g = i2 + 1;
                    hm4VarArr[i2] = hm4Var;
                } finally {
                }
            }
            return true;
        }
    }

    @Override // defpackage.bm4
    public final Object dequeueInputBuffer() {
        hm4 hm4Var;
        synchronized (this.b) {
            try {
                oli oliVar = this.j;
                if (oliVar != null) {
                    throw oliVar;
                }
                qx9.t(this.i == null);
                int i = this.g;
                if (i == 0) {
                    hm4Var = null;
                } else {
                    hm4[] hm4VarArr = this.e;
                    int i2 = i - 1;
                    this.g = i2;
                    hm4Var = hm4VarArr[i2];
                }
                this.i = hm4Var;
            } catch (Throwable th) {
                throw th;
            }
        }
        return hm4Var;
    }

    @Override // defpackage.bm4
    public final Object dequeueOutputBuffer() {
        synchronized (this.b) {
            try {
                oli oliVar = this.j;
                if (oliVar != null) {
                    throw oliVar;
                }
                if (this.d.isEmpty()) {
                    return null;
                }
                return (sm2) this.d.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.bm4
    public final void flush() {
        synchronized (this.b) {
            try {
                this.k = true;
                hm4 hm4Var = this.i;
                if (hm4Var != null) {
                    hm4Var.A();
                    hm4[] hm4VarArr = this.e;
                    int i = this.g;
                    this.g = i + 1;
                    hm4VarArr[i] = hm4Var;
                    this.i = null;
                }
                while (!this.c.isEmpty()) {
                    hm4 hm4Var2 = (hm4) this.c.removeFirst();
                    hm4Var2.A();
                    hm4[] hm4VarArr2 = this.e;
                    int i2 = this.g;
                    this.g = i2 + 1;
                    hm4VarArr2[i2] = hm4Var2;
                }
                while (!this.d.isEmpty()) {
                    ((sm2) this.d.removeFirst()).A();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.bm4
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

    @Override // defpackage.mli
    public final void setPositionUs(long j) {
    }
}
