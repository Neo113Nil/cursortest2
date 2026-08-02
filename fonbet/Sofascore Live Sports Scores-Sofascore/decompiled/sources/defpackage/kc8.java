package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class kc8 extends AtomicInteger implements ed8, iki {
    public static final jc8[] o = new jc8[0];
    public static final jc8[] p = new jc8[0];
    public final ed8 a;
    public final int b;
    public volatile mhh c;
    public volatile boolean d;
    public final fm0 e = new fm0();
    public volatile boolean f;
    public final AtomicReference g;
    public final AtomicLong h;
    public iki i;
    public long j;
    public long k;
    public int l;
    public int m;
    public final int n;

    public kc8(ed8 ed8Var, int i) {
        AtomicReference atomicReference = new AtomicReference();
        this.g = atomicReference;
        this.h = new AtomicLong();
        this.a = ed8Var;
        this.b = i;
        this.n = Math.max(1, 1);
        atomicReference.lazySet(o);
    }

    @Override // defpackage.ed8
    public final void b(iki ikiVar) {
        if (pki.d(this.i, ikiVar)) {
            this.i = ikiVar;
            this.a.b(this);
            if (this.f) {
                return;
            }
            ikiVar.request(3L);
        }
    }

    @Override // defpackage.iki
    public final void cancel() {
        mhh mhhVar;
        jc8[] jc8VarArr;
        if (this.f) {
            return;
        }
        this.f = true;
        this.i.cancel();
        AtomicReference atomicReference = this.g;
        jc8[] jc8VarArr2 = (jc8[]) atomicReference.get();
        jc8[] jc8VarArr3 = p;
        if (jc8VarArr2 != jc8VarArr3 && (jc8VarArr = (jc8[]) atomicReference.getAndSet(jc8VarArr3)) != jc8VarArr3) {
            for (jc8 jc8Var : jc8VarArr) {
                jc8Var.getClass();
                pki.a(jc8Var);
            }
            Throwable b = be6.b(this.e);
            if (b != null && b != be6.a) {
                hda.L(b);
            }
        }
        if (getAndIncrement() != 0 || (mhhVar = this.c) == null) {
            return;
        }
        mhhVar.clear();
    }

    public final boolean d() {
        if (this.f) {
            mhh mhhVar = this.c;
            if (mhhVar != null) {
                mhhVar.clear();
                return true;
            }
        } else {
            if (this.e.get() == null) {
                return false;
            }
            mhh mhhVar2 = this.c;
            if (mhhVar2 != null) {
                mhhVar2.clear();
            }
            Throwable b = be6.b(this.e);
            if (b != be6.a) {
                this.a.onError(b);
            }
        }
        return true;
    }

    public final void g() {
        if (getAndIncrement() == 0) {
            h();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b2, code lost:
    
        if (r7[r0].a != r10) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h() {
        boolean z;
        long j;
        long j2;
        boolean z2;
        long j3;
        jc8[] jc8VarArr;
        Object obj;
        ed8 ed8Var = this.a;
        int i = 1;
        while (!d()) {
            mhh mhhVar = this.c;
            long j4 = this.h.get();
            boolean z3 = j4 == Long.MAX_VALUE;
            long j5 = 0;
            if (mhhVar != null) {
                j = 0;
                do {
                    long j6 = 0;
                    obj = null;
                    while (true) {
                        if (j4 == 0) {
                            z = true;
                            break;
                        }
                        z = true;
                        Object poll = mhhVar.poll();
                        if (d()) {
                            return;
                        }
                        if (poll == null) {
                            obj = poll;
                            break;
                        }
                        ed8Var.onNext(poll);
                        j++;
                        j6++;
                        j4--;
                        obj = poll;
                    }
                    if (j6 != 0) {
                        j4 = z3 ? Long.MAX_VALUE : this.h.addAndGet(-j6);
                    }
                    if (j4 == 0) {
                        break;
                    }
                } while (obj != null);
            } else {
                z = true;
                j = 0;
            }
            boolean z4 = this.d;
            mhh mhhVar2 = this.c;
            jc8[] jc8VarArr2 = (jc8[]) this.g.get();
            int length = jc8VarArr2.length;
            if (z4 && ((mhhVar2 == null || mhhVar2.isEmpty()) && length == 0)) {
                Throwable b = be6.b(this.e);
                if (b != be6.a) {
                    if (b == null) {
                        ed8Var.onComplete();
                        return;
                    } else {
                        ed8Var.onError(b);
                        return;
                    }
                }
                return;
            }
            if (length != 0) {
                long j7 = this.k;
                int i2 = this.l;
                if (length > i2) {
                    j3 = 1;
                } else {
                    j3 = 1;
                }
                if (length <= i2) {
                    i2 = 0;
                }
                for (int i3 = 0; i3 < length && jc8VarArr2[i2].a != j7; i3++) {
                    i2++;
                    if (i2 == length) {
                        i2 = 0;
                    }
                }
                this.l = i2;
                this.k = jc8VarArr2[i2].a;
                int i4 = i2;
                boolean z5 = false;
                int i5 = 0;
                while (true) {
                    if (i5 >= length) {
                        jc8VarArr = jc8VarArr2;
                        j2 = j5;
                        break;
                    }
                    if (d()) {
                        return;
                    }
                    jc8 jc8Var = jc8VarArr2[i4];
                    Object obj2 = null;
                    while (!d()) {
                        ohh ohhVar = jc8Var.f;
                        if (ohhVar == null) {
                            jc8VarArr = jc8VarArr2;
                            j2 = j5;
                        } else {
                            j2 = j5;
                            while (j4 != j2) {
                                try {
                                    obj2 = ohhVar.poll();
                                    if (obj2 == null) {
                                        break;
                                    }
                                    ed8Var.onNext(obj2);
                                    if (d()) {
                                        return;
                                    }
                                    j4 -= j3;
                                    j5 += j3;
                                } catch (Throwable th) {
                                    td4.w0(th);
                                    pki.a(jc8Var);
                                    be6.a(this.e, th);
                                    this.i.cancel();
                                    if (d()) {
                                        return;
                                    }
                                    j(jc8Var);
                                    i5++;
                                    jc8VarArr = jc8VarArr2;
                                    z5 = z;
                                }
                            }
                            if (j5 != j2) {
                                if (z3) {
                                    jc8VarArr = jc8VarArr2;
                                    j4 = Long.MAX_VALUE;
                                } else {
                                    jc8VarArr = jc8VarArr2;
                                    j4 = this.h.addAndGet(-j5);
                                }
                                jc8Var.a(j5);
                            } else {
                                jc8VarArr = jc8VarArr2;
                            }
                            if (j4 != j2 && obj2 != null) {
                                jc8VarArr2 = jc8VarArr;
                                j5 = j2;
                            }
                        }
                        boolean z6 = jc8Var.e;
                        ohh ohhVar2 = jc8Var.f;
                        if (z6 && (ohhVar2 == null || ohhVar2.isEmpty())) {
                            j(jc8Var);
                            if (d()) {
                                return;
                            }
                            j += j3;
                            z5 = z;
                        }
                        if (j4 == j2) {
                            break;
                        }
                        i4++;
                        if (i4 == length) {
                            i4 = 0;
                        }
                        i5++;
                        jc8VarArr2 = jc8VarArr;
                        j5 = j2;
                    }
                    return;
                }
                z2 = z5;
                this.l = i4;
                this.k = jc8VarArr[i4].a;
            } else {
                j2 = 0;
                z2 = false;
            }
            long j8 = j;
            if (j8 != j2 && !this.f) {
                this.i.request(j8);
            }
            if (!z2 && (i = addAndGet(-i)) == 0) {
                return;
            }
        }
    }

    public final mhh i() {
        mhh mhhVar = this.c;
        if (mhhVar != null) {
            return mhhVar;
        }
        h0i h0iVar = new h0i(3);
        this.c = h0iVar;
        return h0iVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(jc8 jc8Var) {
        jc8[] jc8VarArr;
        while (true) {
            AtomicReference atomicReference = this.g;
            jc8[] jc8VarArr2 = (jc8[]) atomicReference.get();
            int length = jc8VarArr2.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (jc8VarArr2[i] == jc8Var) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                jc8VarArr = o;
            } else {
                jc8[] jc8VarArr3 = new jc8[length - 1];
                System.arraycopy(jc8VarArr2, 0, jc8VarArr3, 0, i);
                System.arraycopy(jc8VarArr2, i + 1, jc8VarArr3, i, (length - i) - 1);
                jc8VarArr = jc8VarArr3;
            }
            while (!atomicReference.compareAndSet(jc8VarArr2, jc8VarArr)) {
                if (atomicReference.get() != jc8VarArr2) {
                    break;
                }
            }
            return;
        }
    }

    @Override // defpackage.ed8
    public final void onComplete() {
        if (this.d) {
            return;
        }
        this.d = true;
        g();
    }

    @Override // defpackage.ed8
    public final void onError(Throwable th) {
        if (this.d) {
            hda.L(th);
            return;
        }
        if (!be6.a(this.e, th)) {
            hda.L(th);
            return;
        }
        this.d = true;
        for (jc8 jc8Var : (jc8[]) this.g.getAndSet(p)) {
            jc8Var.getClass();
            pki.a(jc8Var);
        }
        g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ed8
    public final void onNext(Object obj) {
        if (this.d) {
            return;
        }
        try {
            rha.x(obj, "The mapper returned a null Publisher");
            xgf xgfVar = (xgf) obj;
            if (!(xgfVar instanceof Callable)) {
                long j = this.j;
                this.j = 1 + j;
                jc8 jc8Var = new jc8(this, j);
                AtomicReference atomicReference = this.g;
                while (true) {
                    jc8[] jc8VarArr = (jc8[]) atomicReference.get();
                    if (jc8VarArr == p) {
                        pki.a(jc8Var);
                        return;
                    }
                    int length = jc8VarArr.length;
                    jc8[] jc8VarArr2 = new jc8[length + 1];
                    System.arraycopy(jc8VarArr, 0, jc8VarArr2, 0, length);
                    jc8VarArr2[length] = jc8Var;
                    while (!atomicReference.compareAndSet(jc8VarArr, jc8VarArr2)) {
                        if (atomicReference.get() != jc8VarArr) {
                            break;
                        }
                    }
                    xgfVar.a(jc8Var);
                    return;
                }
            }
            try {
                Object call = ((Callable) xgfVar).call();
                if (call == null) {
                    if (this.f) {
                        return;
                    }
                    int i = this.m + 1;
                    this.m = i;
                    int i2 = this.n;
                    if (i == i2) {
                        this.m = 0;
                        this.i.request(i2);
                        return;
                    }
                    return;
                }
                if (get() == 0 && compareAndSet(0, 1)) {
                    long j2 = this.h.get();
                    mhh mhhVar = this.c;
                    if (j2 == 0 || !(mhhVar == null || mhhVar.isEmpty())) {
                        if (mhhVar == null) {
                            mhhVar = i();
                        }
                        if (!mhhVar.offer(call)) {
                            onError(new IllegalStateException("Scalar queue full?!"));
                            return;
                        }
                    } else {
                        this.a.onNext(call);
                        if (j2 != Long.MAX_VALUE) {
                            this.h.decrementAndGet();
                        }
                        if (!this.f) {
                            int i3 = this.m + 1;
                            this.m = i3;
                            int i4 = this.n;
                            if (i3 == i4) {
                                this.m = 0;
                                this.i.request(i4);
                            }
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                } else if (!i().offer(call)) {
                    onError(new IllegalStateException("Scalar queue full?!"));
                    return;
                } else if (getAndIncrement() != 0) {
                    return;
                }
                h();
            } catch (Throwable th) {
                td4.w0(th);
                be6.a(this.e, th);
                g();
            }
        } catch (Throwable th2) {
            td4.w0(th2);
            this.i.cancel();
            onError(th2);
        }
    }

    @Override // defpackage.iki
    public final void request(long j) {
        if (pki.c(j)) {
            wkn.n(this.h, j);
            g();
        }
    }
}
