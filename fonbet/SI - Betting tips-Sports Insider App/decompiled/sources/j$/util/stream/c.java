package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public abstract class c extends e {

    /* renamed from: h, reason: collision with root package name */
    public final AtomicReference f17819h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f17820i;

    public abstract Object h();

    public c(x3 x3Var, Spliterator spliterator) {
        super(x3Var, spliterator);
        this.f17819h = new AtomicReference(null);
    }

    public c(c cVar, Spliterator spliterator) {
        super(cVar, spliterator);
        this.f17819h = cVar.f17819h;
    }

    @Override // j$.util.stream.e, java.util.concurrent.CountedCompleter
    public final void compute() {
        Object obj;
        Spliterator trySplit;
        Spliterator spliterator = this.f17868b;
        long estimateSize = spliterator.estimateSize();
        long j = this.f17869c;
        if (j == 0) {
            j = e.e(estimateSize);
            this.f17869c = j;
        }
        AtomicReference atomicReference = this.f17819h;
        boolean z5 = false;
        c cVar = this;
        while (true) {
            obj = atomicReference.get();
            if (obj != null) {
                break;
            }
            boolean z7 = cVar.f17820i;
            if (!z7) {
                CountedCompleter<?> completer = cVar.getCompleter();
                while (true) {
                    c cVar2 = (c) ((e) completer);
                    if (z7 || cVar2 == null) {
                        break;
                    }
                    z7 = cVar2.f17820i;
                    completer = cVar2.getCompleter();
                }
            }
            if (z7) {
                obj = cVar.h();
                break;
            }
            if (estimateSize <= j || (trySplit = spliterator.trySplit()) == null) {
                break;
            }
            c cVar3 = (c) cVar.c(trySplit);
            cVar.f17870d = cVar3;
            c cVar4 = (c) cVar.c(spliterator);
            cVar.f17871e = cVar4;
            cVar.setPendingCount(1);
            if (z5) {
                spliterator = trySplit;
                cVar = cVar3;
                cVar3 = cVar4;
            } else {
                cVar = cVar4;
            }
            z5 = !z5;
            cVar3.fork();
            estimateSize = spliterator.estimateSize();
        }
        obj = cVar.a();
        cVar.d(obj);
        cVar.tryComplete();
    }

    @Override // j$.util.stream.e
    public final void d(Object obj) {
        if (!b()) {
            this.f17872f = obj;
        } else if (obj != null) {
            AtomicReference atomicReference = this.f17819h;
            while (!atomicReference.compareAndSet(null, obj) && atomicReference.get() == null) {
            }
        }
    }

    @Override // j$.util.stream.e, java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public final Object getRawResult() {
        return i();
    }

    public final Object i() {
        if (b()) {
            Object obj = this.f17819h.get();
            return obj == null ? h() : obj;
        }
        return this.f17872f;
    }

    public void f() {
        this.f17820i = true;
    }

    public final void g() {
        c cVar = this;
        for (c cVar2 = (c) ((e) getCompleter()); cVar2 != null; cVar2 = (c) ((e) cVar2.getCompleter())) {
            if (cVar2.f17870d == cVar) {
                c cVar3 = (c) cVar2.f17871e;
                if (!cVar3.f17820i) {
                    cVar3.f();
                }
            }
            cVar = cVar2;
        }
    }
}
