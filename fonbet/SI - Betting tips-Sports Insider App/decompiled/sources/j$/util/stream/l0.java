package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class l0 extends c {
    public final f0 j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f17962k;

    public l0(f0 f0Var, boolean z5, b bVar, Spliterator spliterator) {
        super(bVar, spliterator);
        this.f17962k = z5;
        this.j = f0Var;
    }

    public l0(l0 l0Var, Spliterator spliterator) {
        super(l0Var, spliterator);
        this.f17962k = l0Var.f17962k;
        this.j = l0Var.j;
    }

    @Override // j$.util.stream.e
    public final e c(Spliterator spliterator) {
        return new l0(this, spliterator);
    }

    @Override // j$.util.stream.c
    public final Object h() {
        return this.j.f17891b;
    }

    @Override // j$.util.stream.e
    public final Object a() {
        x3 x3Var = this.f17867a;
        j8 j8Var = (j8) this.j.f17893d.get();
        x3Var.D0(this.f17868b, j8Var);
        Object obj = j8Var.get();
        if (this.f17962k) {
            if (obj != null) {
                e eVar = this;
                while (eVar != null) {
                    e eVar2 = (e) eVar.getCompleter();
                    if (eVar2 != null && eVar2.f17870d != eVar) {
                        g();
                        return obj;
                    }
                    eVar = eVar2;
                }
                AtomicReference atomicReference = this.f17819h;
                while (!atomicReference.compareAndSet(null, obj) && atomicReference.get() == null) {
                }
                return obj;
            }
        } else if (obj != null) {
            AtomicReference atomicReference2 = this.f17819h;
            while (!atomicReference2.compareAndSet(null, obj) && atomicReference2.get() == null) {
            }
        }
        return null;
    }

    @Override // j$.util.stream.e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        if (this.f17962k) {
            l0 l0Var = (l0) this.f17870d;
            l0 l0Var2 = null;
            while (true) {
                if (l0Var != l0Var2) {
                    Object i5 = l0Var.i();
                    if (i5 != null && this.j.f17892c.test(i5)) {
                        d(i5);
                        e eVar = this;
                        while (true) {
                            if (eVar != null) {
                                e eVar2 = (e) eVar.getCompleter();
                                if (eVar2 != null && eVar2.f17870d != eVar) {
                                    g();
                                    break;
                                }
                                eVar = eVar2;
                            } else {
                                AtomicReference atomicReference = this.f17819h;
                                while (!atomicReference.compareAndSet(null, i5) && atomicReference.get() == null) {
                                }
                            }
                        }
                    } else {
                        l0Var2 = l0Var;
                        l0Var = (l0) this.f17871e;
                    }
                } else {
                    break;
                }
            }
        }
        super.onCompletion(countedCompleter);
    }
}
