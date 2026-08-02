package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class mc8 extends AtomicInteger implements ed8, iki {
    public final ed8 a;
    public final bt8 f;
    public iki h;
    public volatile boolean i;
    public final AtomicLong b = new AtomicLong();
    public final vf3 c = new vf3(0);
    public final fm0 e = new fm0();
    public final AtomicInteger d = new AtomicInteger(1);
    public final AtomicReference g = new AtomicReference();

    public mc8(ed8 ed8Var, bt8 bt8Var) {
        this.a = ed8Var;
        this.f = bt8Var;
    }

    @Override // defpackage.ed8
    public final void b(iki ikiVar) {
        if (pki.d(this.h, ikiVar)) {
            this.h = ikiVar;
            this.a.b(this);
            ikiVar.request(Long.MAX_VALUE);
        }
    }

    @Override // defpackage.iki
    public final void cancel() {
        this.i = true;
        this.h.cancel();
        this.c.d();
    }

    public final void d() {
        i0i i0iVar = (i0i) this.g.get();
        if (i0iVar != null) {
            i0iVar.clear();
        }
    }

    public final void g() {
        if (getAndIncrement() == 0) {
            h();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0073, code lost:
    
        if (r10 != r6) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0077, code lost:
    
        if (r17.i == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0085, code lost:
    
        if (((java.lang.Throwable) r17.e.get()) == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0098, code lost:
    
        if (r2.get() != 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009a, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009d, code lost:
    
        r7 = (defpackage.i0i) r3.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a3, code lost:
    
        if (r7 == null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a9, code lost:
    
        if (r7.isEmpty() == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ac, code lost:
    
        if (r6 == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ae, code lost:
    
        if (r13 == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b0, code lost:
    
        r0 = defpackage.be6.b(r17.e);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b6, code lost:
    
        if (r0 == null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b8, code lost:
    
        r1.onError(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00bb, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00bc, code lost:
    
        r1.onComplete();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00bf, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ab, code lost:
    
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x009c, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0087, code lost:
    
        r2 = defpackage.be6.b(r17.e);
        d();
        r1.onError(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0093, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0079, code lost:
    
        d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x007c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00c2, code lost:
    
        if (r10 == 0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00c4, code lost:
    
        defpackage.wkn.J(r17.b, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00c9, code lost:
    
        r5 = addAndGet(-r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h() {
        ed8 ed8Var = this.a;
        AtomicInteger atomicInteger = this.d;
        AtomicReference atomicReference = this.g;
        int i = 1;
        do {
            long j = this.b.get();
            long j2 = 0;
            while (true) {
                boolean z = false;
                if (j2 == j) {
                    break;
                }
                if (this.i) {
                    d();
                    return;
                }
                if (((Throwable) this.e.get()) != null) {
                    Throwable b = be6.b(this.e);
                    d();
                    ed8Var.onError(b);
                    return;
                }
                boolean z2 = atomicInteger.get() == 0;
                i0i i0iVar = (i0i) atomicReference.get();
                Object poll = i0iVar != null ? i0iVar.poll() : null;
                boolean z3 = poll == null;
                if (z2 && z3) {
                    Throwable b2 = be6.b(this.e);
                    if (b2 != null) {
                        ed8Var.onError(b2);
                        return;
                    } else {
                        ed8Var.onComplete();
                        return;
                    }
                }
                if (z3) {
                    break;
                }
                ed8Var.onNext(poll);
                j2++;
            }
        } while (i != 0);
    }

    public final i0i i() {
        while (true) {
            AtomicReference atomicReference = this.g;
            i0i i0iVar = (i0i) atomicReference.get();
            if (i0iVar != null) {
                return i0iVar;
            }
            i0i i0iVar2 = new i0i(ob8.a);
            while (!atomicReference.compareAndSet(null, i0iVar2)) {
                if (atomicReference.get() != null) {
                    break;
                }
            }
            return i0iVar2;
        }
    }

    @Override // defpackage.ed8
    public final void onComplete() {
        this.d.decrementAndGet();
        g();
    }

    @Override // defpackage.ed8
    public final void onError(Throwable th) {
        this.d.decrementAndGet();
        if (!be6.a(this.e, th)) {
            hda.L(th);
        } else {
            this.c.d();
            g();
        }
    }

    @Override // defpackage.ed8
    public final void onNext(Object obj) {
        try {
            Object apply = this.f.apply(obj);
            rha.x(apply, "The mapper returned a null MaybeSource");
            g0c g0cVar = (g0c) apply;
            this.d.getAndIncrement();
            h0c h0cVar = new h0c(this, 1);
            if (this.i || !this.c.a(h0cVar)) {
                return;
            }
            g0cVar.b(h0cVar);
        } catch (Throwable th) {
            td4.w0(th);
            this.h.cancel();
            onError(th);
        }
    }

    @Override // defpackage.iki
    public final void request(long j) {
        if (pki.c(j)) {
            wkn.n(this.b, j);
            g();
        }
    }
}
