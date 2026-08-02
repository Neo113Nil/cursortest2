package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class wt1 extends tz9 implements rkd {
    public static final Object[] n = new Object[0];
    public static final vt1[] o = new vt1[0];
    public static final vt1[] p = new vt1[0];
    public final AtomicReference h;
    public final AtomicReference i;
    public final Lock j;
    public final Lock k;
    public final AtomicReference l;
    public long m;

    public wt1() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.j = reentrantReadWriteLock.readLock();
        this.k = reentrantReadWriteLock.writeLock();
        this.i = new AtomicReference(o);
        this.h = new AtomicReference();
        this.l = new AtomicReference();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.tz9
    public final void O(rkd rkdVar) {
        b10 b10Var;
        Object obj;
        vt1 vt1Var = new vt1(rkdVar, this);
        rkdVar.a(vt1Var);
        AtomicReference atomicReference = this.i;
        while (true) {
            vt1[] vt1VarArr = (vt1[]) atomicReference.get();
            if (vt1VarArr == p) {
                Throwable th = (Throwable) this.l.get();
                if (th == be6.a) {
                    rkdVar.onComplete();
                    return;
                } else {
                    rkdVar.onError(th);
                    return;
                }
            }
            int length = vt1VarArr.length;
            vt1[] vt1VarArr2 = new vt1[length + 1];
            System.arraycopy(vt1VarArr, 0, vt1VarArr2, 0, length);
            vt1VarArr2[length] = vt1Var;
            while (!atomicReference.compareAndSet(vt1VarArr, vt1VarArr2)) {
                if (atomicReference.get() != vt1VarArr) {
                    break;
                }
            }
            if (vt1Var.g) {
                o0(vt1Var);
                return;
            }
            if (vt1Var.g) {
                return;
            }
            synchronized (vt1Var) {
                try {
                    if (vt1Var.g) {
                        return;
                    }
                    if (vt1Var.c) {
                        return;
                    }
                    wt1 wt1Var = vt1Var.b;
                    Lock lock = wt1Var.j;
                    lock.lock();
                    vt1Var.h = wt1Var.m;
                    Object obj2 = wt1Var.h.get();
                    lock.unlock();
                    vt1Var.d = obj2 != null;
                    vt1Var.c = true;
                    if (obj2 == null || vt1Var.test(obj2)) {
                        return;
                    }
                    while (!vt1Var.g) {
                        synchronized (vt1Var) {
                            try {
                                b10Var = vt1Var.e;
                                if (b10Var == null) {
                                    vt1Var.d = false;
                                    return;
                                }
                                vt1Var.e = null;
                            } finally {
                            }
                        }
                        for (Object[] objArr = (Object[]) b10Var.c; objArr != null; objArr = objArr[4]) {
                            for (int i = 0; i < 4 && (obj = objArr[i]) != null; i++) {
                                if (vt1Var.test(obj)) {
                                    break;
                                }
                            }
                        }
                    }
                    return;
                } finally {
                }
            }
        }
    }

    @Override // defpackage.rkd
    public final void a(k55 k55Var) {
        if (this.l.get() != null) {
            k55Var.d();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o0(vt1 vt1Var) {
        vt1[] vt1VarArr;
        while (true) {
            AtomicReference atomicReference = this.i;
            vt1[] vt1VarArr2 = (vt1[]) atomicReference.get();
            int length = vt1VarArr2.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (vt1VarArr2[i] == vt1Var) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                vt1VarArr = o;
            } else {
                vt1[] vt1VarArr3 = new vt1[length - 1];
                System.arraycopy(vt1VarArr2, 0, vt1VarArr3, 0, i);
                System.arraycopy(vt1VarArr2, i + 1, vt1VarArr3, i, (length - i) - 1);
                vt1VarArr = vt1VarArr3;
            }
            while (!atomicReference.compareAndSet(vt1VarArr2, vt1VarArr)) {
                if (atomicReference.get() != vt1VarArr2) {
                    break;
                }
            }
            return;
        }
    }

    @Override // defpackage.rkd
    public final void onComplete() {
        AtomicReference atomicReference;
        ae6 ae6Var = be6.a;
        do {
            atomicReference = this.l;
            if (atomicReference.compareAndSet(null, ae6Var)) {
                AtomicReference atomicReference2 = this.i;
                vt1[] vt1VarArr = p;
                vt1[] vt1VarArr2 = (vt1[]) atomicReference2.getAndSet(vt1VarArr);
                agd agdVar = agd.a;
                if (vt1VarArr2 != vt1VarArr) {
                    Lock lock = this.k;
                    lock.lock();
                    this.m++;
                    this.h.lazySet(agdVar);
                    lock.unlock();
                }
                for (vt1 vt1Var : vt1VarArr2) {
                    vt1Var.a(agdVar, this.m);
                }
                return;
            }
        } while (atomicReference.get() == null);
    }

    @Override // defpackage.rkd
    public final void onError(Throwable th) {
        AtomicReference atomicReference;
        rha.x(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        do {
            atomicReference = this.l;
            if (atomicReference.compareAndSet(null, th)) {
                zfd zfdVar = new zfd(th);
                AtomicReference atomicReference2 = this.i;
                vt1[] vt1VarArr = p;
                vt1[] vt1VarArr2 = (vt1[]) atomicReference2.getAndSet(vt1VarArr);
                if (vt1VarArr2 != vt1VarArr) {
                    Lock lock = this.k;
                    lock.lock();
                    this.m++;
                    this.h.lazySet(zfdVar);
                    lock.unlock();
                }
                for (vt1 vt1Var : vt1VarArr2) {
                    vt1Var.a(zfdVar, this.m);
                }
                return;
            }
        } while (atomicReference.get() == null);
        hda.L(th);
    }

    @Override // defpackage.rkd
    public final void onNext(Object obj) {
        rha.x(obj, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.l.get() != null) {
            return;
        }
        Lock lock = this.k;
        lock.lock();
        this.m++;
        this.h.lazySet(obj);
        lock.unlock();
        for (vt1 vt1Var : (vt1[]) this.i.get()) {
            vt1Var.a(obj, this.m);
        }
    }
}
