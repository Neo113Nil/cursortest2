package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class nc8 extends ao1 implements ed8 {
    public final ed8 a;
    public final int b;
    public final int c;
    public iki e;
    public ohh f;
    public volatile boolean g;
    public volatile boolean h;
    public Iterator j;
    public int k;
    public int l;
    public final AtomicReference i = new AtomicReference();
    public final AtomicLong d = new AtomicLong();

    public nc8(ed8 ed8Var, int i) {
        this.a = ed8Var;
        this.b = i;
        this.c = i - (i >> 2);
    }

    @Override // defpackage.ed8
    public final void b(iki ikiVar) {
        if (pki.d(this.e, ikiVar)) {
            this.e = ikiVar;
            if (ikiVar instanceof ajf) {
                ajf ajfVar = (ajf) ikiVar;
                int c = ajfVar.c(3);
                if (c == 1) {
                    this.l = c;
                    this.f = ajfVar;
                    this.g = true;
                    this.a.b(this);
                    return;
                }
                if (c == 2) {
                    this.l = c;
                    this.f = ajfVar;
                    this.a.b(this);
                    ikiVar.request(this.b);
                    return;
                }
            }
            this.f = new h0i(this.b);
            this.a.b(this);
            ikiVar.request(this.b);
        }
    }

    @Override // defpackage.zif
    public final int c(int i) {
        return this.l == 1 ? 1 : 0;
    }

    @Override // defpackage.iki
    public final void cancel() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.e.cancel();
        if (getAndIncrement() == 0) {
            this.f.clear();
        }
    }

    @Override // defpackage.ohh
    public final void clear() {
        this.j = null;
        this.f.clear();
    }

    public final boolean d(boolean z, boolean z2, ed8 ed8Var, ohh ohhVar) {
        if (this.h) {
            this.j = null;
            ohhVar.clear();
            return true;
        }
        if (!z) {
            return false;
        }
        if (((Throwable) this.i.get()) == null) {
            if (!z2) {
                return false;
            }
            ed8Var.onComplete();
            return true;
        }
        Throwable b = be6.b(this.i);
        this.j = null;
        ohhVar.clear();
        ed8Var.onError(b);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0145, code lost:
    
        if (r6 == null) goto L80;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [int] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g() {
        boolean z;
        if (getAndIncrement() != 0) {
            return;
        }
        ed8 ed8Var = this.a;
        ohh ohhVar = this.f;
        boolean z2 = false;
        ?? r5 = 1;
        boolean z3 = this.l != 1;
        Iterator it = this.j;
        int i = 1;
        while (true) {
            if (it == null) {
                boolean z4 = this.g;
                try {
                    Object poll = ohhVar.poll();
                    if (d(z4, poll == null ? r5 : z2 ? 1 : 0, ed8Var, ohhVar)) {
                        return;
                    }
                    if (poll != null) {
                        try {
                            it = ((Iterable) poll).iterator();
                            if (it.hasNext()) {
                                this.j = it;
                            } else {
                                if (z3) {
                                    int i2 = this.k + r5;
                                    if (i2 == this.c) {
                                        this.k = z2 ? 1 : 0;
                                        this.e.request(i2);
                                    } else {
                                        this.k = i2;
                                    }
                                }
                                it = null;
                            }
                        } catch (Throwable th) {
                            td4.w0(th);
                            this.e.cancel();
                            be6.a(this.i, th);
                            ed8Var.onError(be6.b(this.i));
                            return;
                        }
                    }
                } catch (Throwable th2) {
                    td4.w0(th2);
                    this.e.cancel();
                    be6.a(this.i, th2);
                    Throwable b = be6.b(this.i);
                    this.j = null;
                    ohhVar.clear();
                    ed8Var.onError(b);
                    return;
                }
            }
            if (it != null) {
                long j = this.d.get();
                long j2 = 0;
                boolean z5 = r5;
                while (true) {
                    if (j2 == j) {
                        z = z5;
                        break;
                    }
                    if (d(this.g, z2, ed8Var, ohhVar)) {
                        return;
                    }
                    try {
                        Object next = it.next();
                        z = z5;
                        rha.x(next, "The iterator returned a null value");
                        ed8Var.onNext(next);
                        if (d(this.g, z2, ed8Var, ohhVar)) {
                            return;
                        }
                        j2++;
                        try {
                            if (it.hasNext()) {
                                z5 = z;
                            } else {
                                if (z3) {
                                    int i3 = this.k + 1;
                                    if (i3 == this.c) {
                                        this.k = z2 ? 1 : 0;
                                        this.e.request(i3);
                                    } else {
                                        this.k = i3;
                                    }
                                }
                                this.j = null;
                                it = null;
                            }
                        } catch (Throwable th3) {
                            td4.w0(th3);
                            this.j = null;
                            this.e.cancel();
                            be6.a(this.i, th3);
                            ed8Var.onError(be6.b(this.i));
                            return;
                        }
                    } catch (Throwable th4) {
                        td4.w0(th4);
                        this.j = null;
                        this.e.cancel();
                        be6.a(this.i, th4);
                        ed8Var.onError(be6.b(this.i));
                        return;
                    }
                }
                if (j2 == j) {
                    if (d(this.g, (ohhVar.isEmpty() && it == null) ? z : false, ed8Var, ohhVar)) {
                        return;
                    }
                }
                if (j2 != 0 && j != Long.MAX_VALUE) {
                    this.d.addAndGet(-j2);
                }
            } else {
                z = r5;
            }
            i = addAndGet(-i);
            if (i == 0) {
                return;
            }
            r5 = z;
            z2 = false;
        }
    }

    @Override // defpackage.ohh
    public final boolean isEmpty() {
        return this.j == null && this.f.isEmpty();
    }

    @Override // defpackage.ed8
    public final void onComplete() {
        if (this.g) {
            return;
        }
        this.g = true;
        g();
    }

    @Override // defpackage.ed8
    public final void onError(Throwable th) {
        if (this.g || !be6.a(this.i, th)) {
            hda.L(th);
        } else {
            this.g = true;
            g();
        }
    }

    @Override // defpackage.ed8
    public final void onNext(Object obj) {
        if (this.g) {
            return;
        }
        if (this.l != 0 || this.f.offer(obj)) {
            g();
        } else {
            onError(new qkc("Queue is full?!"));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        r2 = r0.next();
        defpackage.rha.x(r2, "The iterator returned a null value");
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        if (r0.hasNext() != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        r4.j = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        return r2;
     */
    @Override // defpackage.ohh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object poll() {
        Iterator it = this.j;
        while (true) {
            if (it == null) {
                Object poll = this.f.poll();
                if (poll != null) {
                    it = ((Iterable) poll).iterator();
                    if (it.hasNext()) {
                        this.j = it;
                        break;
                    }
                    it = null;
                } else {
                    return null;
                }
            } else {
                break;
            }
        }
    }

    @Override // defpackage.iki
    public final void request(long j) {
        if (pki.c(j)) {
            wkn.n(this.d, j);
            g();
        }
    }
}
