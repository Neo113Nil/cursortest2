package defpackage;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class bd8 extends AtomicInteger implements ed8, k55 {
    public static final ad8[] i = new ad8[0];
    public static final ad8[] j = new ad8[0];
    public final AtomicReference a;
    public final int b;
    public volatile Serializable f;
    public int g;
    public volatile ohh h;
    public final AtomicReference e = new AtomicReference();
    public final AtomicReference c = new AtomicReference(i);
    public final AtomicBoolean d = new AtomicBoolean();

    public bd8(AtomicReference atomicReference, int i2) {
        this.a = atomicReference;
        this.b = i2;
    }

    public final boolean a(Object obj, boolean z) {
        int i2 = 0;
        if (obj != null) {
            agd agdVar = agd.a;
            ad8[] ad8VarArr = j;
            AtomicReference atomicReference = this.c;
            AtomicReference atomicReference2 = this.a;
            if (obj != agdVar) {
                Throwable th = ((zfd) obj).a;
                while (!atomicReference2.compareAndSet(this, null) && atomicReference2.get() == this) {
                }
                ad8[] ad8VarArr2 = (ad8[]) atomicReference.getAndSet(ad8VarArr);
                if (ad8VarArr2.length == 0) {
                    hda.L(th);
                    return true;
                }
                int length = ad8VarArr2.length;
                while (i2 < length) {
                    ad8VarArr2[i2].a.onError(th);
                    i2++;
                }
            } else if (z) {
                while (!atomicReference2.compareAndSet(this, null) && atomicReference2.get() == this) {
                }
                ad8[] ad8VarArr3 = (ad8[]) atomicReference.getAndSet(ad8VarArr);
                int length2 = ad8VarArr3.length;
                while (i2 < length2) {
                    ad8VarArr3[i2].a.onComplete();
                    i2++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.ed8
    public final void b(iki ikiVar) {
        if (pki.b(this.e, ikiVar)) {
            if (ikiVar instanceof ajf) {
                ajf ajfVar = (ajf) ikiVar;
                int c = ajfVar.c(7);
                if (c == 1) {
                    this.g = c;
                    this.h = ajfVar;
                    this.f = agd.a;
                    g();
                    return;
                }
                if (c == 2) {
                    this.g = c;
                    this.h = ajfVar;
                    ikiVar.request(this.b);
                    return;
                }
            }
            this.h = new h0i(this.b);
            ikiVar.request(this.b);
        }
    }

    @Override // defpackage.k55
    public final void d() {
        AtomicReference atomicReference;
        AtomicReference atomicReference2 = this.c;
        Object obj = atomicReference2.get();
        Object obj2 = j;
        if (obj == obj2 || ((ad8[]) atomicReference2.getAndSet(obj2)) == obj2) {
            return;
        }
        do {
            atomicReference = this.a;
            if (atomicReference.compareAndSet(this, null)) {
                break;
            }
        } while (atomicReference.get() == this);
        pki.a(this.e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0125, code lost:
    
        if (r11 == 0) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x012a, code lost:
    
        if (r26.g == 1) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x012c, code lost:
    
        ((defpackage.iki) r26.e.get()).request(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0138, code lost:
    
        r4 = r0;
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0156, code lost:
    
        if (r8 == false) goto L88;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g() {
        boolean z;
        Object obj;
        ad8[] ad8VarArr;
        long j2;
        Object obj2;
        ad8[] ad8VarArr2;
        if (getAndIncrement() != 0) {
            return;
        }
        AtomicReference atomicReference = this.c;
        boolean z2 = true;
        ad8[] ad8VarArr3 = (ad8[]) atomicReference.get();
        int i2 = 1;
        while (true) {
            Serializable serializable = this.f;
            ohh ohhVar = this.h;
            boolean z3 = (ohhVar == null || ohhVar.isEmpty()) ? z2 : false;
            if (a(serializable, z3)) {
                return;
            }
            if (z3) {
                z = z2;
            } else {
                int length = ad8VarArr3.length;
                int i3 = 0;
                long j3 = Long.MAX_VALUE;
                for (ad8 ad8Var : ad8VarArr3) {
                    long j4 = ad8Var.get();
                    if (j4 != Long.MIN_VALUE) {
                        j3 = Math.min(j3, j4 - ad8Var.c);
                    } else {
                        i3++;
                    }
                }
                long j5 = 1;
                if (length == i3) {
                    Serializable serializable2 = this.f;
                    try {
                        obj = ohhVar.poll();
                    } catch (Throwable th) {
                        td4.w0(th);
                        ((iki) this.e.get()).cancel();
                        zfd zfdVar = new zfd(th);
                        this.f = zfdVar;
                        serializable2 = zfdVar;
                        obj = null;
                    }
                    if (a(serializable2, obj == null ? z2 : false)) {
                        return;
                    }
                    if (this.g != z2) {
                        ((iki) this.e.get()).request(1L);
                    }
                    z = z2;
                    ad8VarArr = ad8VarArr3;
                } else {
                    int i4 = 0;
                    while (true) {
                        j2 = i4;
                        if (j2 >= j3) {
                            break;
                        }
                        Serializable serializable3 = this.f;
                        try {
                            obj2 = ohhVar.poll();
                        } catch (Throwable th2) {
                            td4.w0(th2);
                            ((iki) this.e.get()).cancel();
                            zfd zfdVar2 = new zfd(th2);
                            this.f = zfdVar2;
                            serializable3 = zfdVar2;
                            obj2 = null;
                        }
                        boolean z4 = obj2 == null ? z2 : false;
                        if (a(serializable3, z4)) {
                            return;
                        }
                        if (z4) {
                            z3 = z4;
                            break;
                        }
                        int length2 = ad8VarArr3.length;
                        int i5 = 0;
                        boolean z5 = false;
                        while (i5 < length2) {
                            long j6 = j5;
                            ad8 ad8Var2 = ad8VarArr3[i5];
                            long j7 = ad8Var2.get();
                            if (j7 != Long.MIN_VALUE) {
                                ad8VarArr2 = ad8VarArr3;
                                if (j7 != Long.MAX_VALUE) {
                                    ad8Var2.c += j6;
                                }
                                ad8Var2.a.onNext(obj2);
                            } else {
                                ad8VarArr2 = ad8VarArr3;
                                z5 = true;
                            }
                            i5++;
                            ad8VarArr3 = ad8VarArr2;
                            j5 = j6;
                        }
                        ad8[] ad8VarArr4 = ad8VarArr3;
                        long j8 = j5;
                        i4++;
                        ad8[] ad8VarArr5 = (ad8[]) atomicReference.get();
                        if (z5 || ad8VarArr5 != ad8VarArr4) {
                            break;
                        }
                        ad8VarArr3 = ad8VarArr4;
                        z3 = z4;
                        j5 = j8;
                        z2 = true;
                    }
                    ad8VarArr = ad8VarArr3;
                    if (i4 != 0) {
                        z = true;
                        if (this.g != 1) {
                            ((iki) this.e.get()).request(j2);
                        }
                    } else {
                        z = true;
                    }
                    if (j3 != 0) {
                    }
                }
                ad8VarArr3 = ad8VarArr;
                z2 = z;
            }
            i2 = addAndGet(-i2);
            if (i2 == 0) {
                return;
            }
            ad8VarArr3 = (ad8[]) atomicReference.get();
            z2 = z;
        }
    }

    public final boolean h() {
        return this.c.get() == j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i(ad8 ad8Var) {
        ad8[] ad8VarArr;
        while (true) {
            AtomicReference atomicReference = this.c;
            ad8[] ad8VarArr2 = (ad8[]) atomicReference.get();
            int length = ad8VarArr2.length;
            if (length == 0) {
                return;
            }
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    i2 = -1;
                    break;
                } else if (ad8VarArr2[i2].equals(ad8Var)) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 < 0) {
                return;
            }
            if (length == 1) {
                ad8VarArr = i;
            } else {
                ad8[] ad8VarArr3 = new ad8[length - 1];
                System.arraycopy(ad8VarArr2, 0, ad8VarArr3, 0, i2);
                System.arraycopy(ad8VarArr2, i2 + 1, ad8VarArr3, i2, (length - i2) - 1);
                ad8VarArr = ad8VarArr3;
            }
            while (!atomicReference.compareAndSet(ad8VarArr2, ad8VarArr)) {
                if (atomicReference.get() != ad8VarArr2) {
                    break;
                }
            }
            return;
        }
    }

    @Override // defpackage.ed8
    public final void onComplete() {
        if (this.f == null) {
            this.f = agd.a;
            g();
        }
    }

    @Override // defpackage.ed8
    public final void onError(Throwable th) {
        if (this.f != null) {
            hda.L(th);
        } else {
            this.f = new zfd(th);
            g();
        }
    }

    @Override // defpackage.ed8
    public final void onNext(Object obj) {
        if (this.g != 0 || this.h.offer(obj)) {
            g();
        } else {
            onError(new qkc("Prefetch queue is full?!"));
        }
    }
}
