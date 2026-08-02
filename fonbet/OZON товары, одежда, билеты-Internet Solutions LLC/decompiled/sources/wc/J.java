package wc;

import Bl0.C2645f;
import I0.C3173b;
import Kc.C3493a;
import hg.InterfaceC6948a;
import hg.InterfaceC6949b;
import hg.InterfaceC6950c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;
import pc.AbstractC8896a;
import wc.C10478G;

/* loaded from: classes9.dex */
public final class J<T> extends AbstractC8896a<T> implements rc.g {

    /* renamed from: g, reason: collision with root package name */
    static final Callable f103810g = null;

    /* renamed from: c, reason: collision with root package name */
    final io.reactivex.h<T> f103811c;

    /* renamed from: d, reason: collision with root package name */
    final AtomicReference<h<T>> f103812d;

    /* renamed from: e, reason: collision with root package name */
    final Callable<? extends e<T>> f103813e;

    /* renamed from: f, reason: collision with root package name */
    final InterfaceC6948a<T> f103814f;

    static class a<T> extends AtomicReference<d> implements e<T> {

        /* renamed from: a, reason: collision with root package name */
        d f103815a;

        /* renamed from: b, reason: collision with root package name */
        int f103816b;

        /* renamed from: c, reason: collision with root package name */
        long f103817c;

        @Override // wc.J.e
        public final void a(Throwable th2) {
            Object f7 = Gc.k.f(th2);
            long j11 = this.f103817c + 1;
            this.f103817c = j11;
            d dVar = new d(j11, f7);
            this.f103815a.set(dVar);
            this.f103815a = dVar;
            this.f103816b++;
            d dVar2 = get();
            if (dVar2.f103824a != null) {
                d dVar3 = new d(0L, null);
                dVar3.lazySet(dVar2.get());
                set(dVar3);
            }
        }

        @Override // wc.J.e
        public final void b(T t2) {
            long j11 = this.f103817c + 1;
            this.f103817c = j11;
            d dVar = new d(j11, t2);
            this.f103815a.set(dVar);
            this.f103815a = dVar;
            this.f103816b++;
            i iVar = (i) this;
            if (iVar.f103816b > iVar.f103837d) {
                d dVar2 = iVar.get().get();
                if (dVar2 == null) {
                    throw new IllegalStateException("Empty list!");
                }
                iVar.f103816b--;
                iVar.set(dVar2);
            }
        }

        @Override // wc.J.e
        public final void e(c<T> cVar) {
            d dVar;
            synchronized (cVar) {
                try {
                    if (cVar.f103822e) {
                        cVar.f103823f = true;
                        return;
                    }
                    cVar.f103822e = true;
                    while (!cVar.isDisposed()) {
                        long j11 = cVar.get();
                        boolean z11 = j11 == Long.MAX_VALUE;
                        d dVar2 = (d) cVar.f103820c;
                        if (dVar2 == null) {
                            dVar2 = get();
                            cVar.f103820c = dVar2;
                            Gc.d.a(cVar.f103821d, dVar2.f103825b);
                        }
                        long j12 = 0;
                        while (j11 != 0 && (dVar = dVar2.get()) != null) {
                            Object obj = dVar.f103824a;
                            try {
                                if (Gc.k.b(obj, cVar.f103819b)) {
                                    cVar.f103820c = null;
                                    return;
                                }
                                j12++;
                                j11--;
                                if (cVar.isDisposed()) {
                                    cVar.f103820c = null;
                                    return;
                                }
                                dVar2 = dVar;
                            } catch (Throwable th2) {
                                C2645f.c(th2);
                                cVar.f103820c = null;
                                cVar.dispose();
                                if (Gc.k.i(obj) || Gc.k.h(obj)) {
                                    return;
                                }
                                cVar.f103819b.onError(th2);
                                return;
                            }
                        }
                        if (j12 != 0) {
                            cVar.f103820c = dVar2;
                            if (!z11) {
                                cVar.a(j12);
                            }
                        }
                        synchronized (cVar) {
                            try {
                                if (!cVar.f103823f) {
                                    cVar.f103822e = false;
                                    return;
                                }
                                cVar.f103823f = false;
                            } finally {
                            }
                        }
                    }
                    cVar.f103820c = null;
                } finally {
                }
            }
        }

        @Override // wc.J.e
        public final void m() {
            Gc.k kVar = Gc.k.COMPLETE;
            long j11 = this.f103817c + 1;
            this.f103817c = j11;
            d dVar = new d(j11, kVar);
            this.f103815a.set(dVar);
            this.f103815a = dVar;
            this.f103816b++;
            d dVar2 = get();
            if (dVar2.f103824a != null) {
                d dVar3 = new d(0L, null);
                dVar3.lazySet(dVar2.get());
                set(dVar3);
            }
        }
    }

    static final class b implements Callable<Object> {
        @Override // java.util.concurrent.Callable
        public final Object call() {
            return new j(16);
        }
    }

    static final class c<T> extends AtomicLong implements InterfaceC6950c, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final h<T> f103818a;

        /* renamed from: b, reason: collision with root package name */
        final InterfaceC6949b<? super T> f103819b;

        /* renamed from: c, reason: collision with root package name */
        Serializable f103820c;

        /* renamed from: d, reason: collision with root package name */
        final AtomicLong f103821d = new AtomicLong();

        /* renamed from: e, reason: collision with root package name */
        boolean f103822e;

        /* renamed from: f, reason: collision with root package name */
        boolean f103823f;

        c(h<T> hVar, InterfaceC6949b<? super T> interfaceC6949b) {
            this.f103818a = hVar;
            this.f103819b = interfaceC6949b;
        }

        public final void a(long j11) {
            long j12;
            long j13;
            do {
                j12 = get();
                if (j12 == Long.MIN_VALUE || j12 == Long.MAX_VALUE) {
                    return;
                }
                j13 = j12 - j11;
                if (j13 < 0) {
                    C3493a.f(new IllegalStateException(C3173b.b(j13, "More produced than requested: ")));
                    j13 = 0;
                }
            } while (!compareAndSet(j12, j13));
        }

        @Override // hg.InterfaceC6950c
        public final void cancel() {
            dispose();
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                h<T> hVar = this.f103818a;
                hVar.b(this);
                hVar.a();
                this.f103820c = null;
            }
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return get() == Long.MIN_VALUE;
        }

        @Override // hg.InterfaceC6950c
        public final void n(long j11) {
            long j12;
            if (Fc.g.f(j11)) {
                while (true) {
                    j12 = get();
                    if (j12 == Long.MIN_VALUE) {
                        j12 = Long.MIN_VALUE;
                        break;
                    } else if (j12 == Long.MAX_VALUE) {
                        j12 = Long.MAX_VALUE;
                        break;
                    } else if (compareAndSet(j12, Gc.d.b(j12, j11))) {
                        break;
                    }
                }
                if (j12 != Long.MIN_VALUE) {
                    Gc.d.a(this.f103821d, j11);
                    h<T> hVar = this.f103818a;
                    hVar.a();
                    hVar.f103830a.e(this);
                }
            }
        }
    }

    static final class d extends AtomicReference<d> {

        /* renamed from: a, reason: collision with root package name */
        final Object f103824a;

        /* renamed from: b, reason: collision with root package name */
        final long f103825b;

        d(long j11, Object obj) {
            this.f103824a = obj;
            this.f103825b = j11;
        }
    }

    interface e<T> {
        void a(Throwable th2);

        void b(T t2);

        void e(c<T> cVar);

        void m();
    }

    static final class f<T> implements Callable<e<T>> {
        @Override // java.util.concurrent.Callable
        public final Object call() throws Exception {
            return new i();
        }
    }

    static final class g<T> implements InterfaceC6948a<T> {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicReference<h<T>> f103826a;

        /* renamed from: b, reason: collision with root package name */
        private final Callable<? extends e<T>> f103827b;

        g(AtomicReference<h<T>> atomicReference, Callable<? extends e<T>> callable) {
            this.f103826a = atomicReference;
            this.f103827b = callable;
        }

        @Override // hg.InterfaceC6948a
        public final void a(InterfaceC6949b<? super T> interfaceC6949b) {
            h<T> hVar;
            loop0: while (true) {
                AtomicReference<h<T>> atomicReference = this.f103826a;
                hVar = atomicReference.get();
                if (hVar != null) {
                    break;
                }
                try {
                    h<T> hVar2 = new h<>(this.f103827b.call());
                    while (!atomicReference.compareAndSet(null, hVar2)) {
                        if (atomicReference.get() != null) {
                            break;
                        }
                    }
                    hVar = hVar2;
                    break loop0;
                } catch (Throwable th2) {
                    C2645f.c(th2);
                    Fc.d.d(th2, interfaceC6949b);
                    return;
                }
            }
            c<T> cVar = new c<>(hVar, interfaceC6949b);
            interfaceC6949b.d(cVar);
            loop2: while (true) {
                AtomicReference<c<T>[]> atomicReference2 = hVar.f103832c;
                c<T>[] cVarArr = atomicReference2.get();
                if (cVarArr != h.f103829i) {
                    int length = cVarArr.length;
                    c<T>[] cVarArr2 = new c[length + 1];
                    System.arraycopy(cVarArr, 0, cVarArr2, 0, length);
                    cVarArr2[length] = cVar;
                    while (!atomicReference2.compareAndSet(cVarArr, cVarArr2)) {
                        if (atomicReference2.get() != cVarArr) {
                            break;
                        }
                    }
                    break loop2;
                }
                break;
            }
            if (cVar.isDisposed()) {
                hVar.b(cVar);
            } else {
                hVar.a();
                hVar.f103830a.e(cVar);
            }
        }
    }

    static final class h<T> extends AtomicReference<InterfaceC6950c> implements io.reactivex.j<T>, InterfaceC8487b {

        /* renamed from: h, reason: collision with root package name */
        static final c[] f103828h = new c[0];

        /* renamed from: i, reason: collision with root package name */
        static final c[] f103829i = new c[0];

        /* renamed from: a, reason: collision with root package name */
        final e<T> f103830a;

        /* renamed from: b, reason: collision with root package name */
        boolean f103831b;

        /* renamed from: f, reason: collision with root package name */
        long f103835f;

        /* renamed from: g, reason: collision with root package name */
        long f103836g;

        /* renamed from: e, reason: collision with root package name */
        final AtomicInteger f103834e = new AtomicInteger();

        /* renamed from: c, reason: collision with root package name */
        final AtomicReference<c<T>[]> f103832c = new AtomicReference<>(f103828h);

        /* renamed from: d, reason: collision with root package name */
        final AtomicBoolean f103833d = new AtomicBoolean();

        h(e<T> eVar) {
            this.f103830a = eVar;
        }

        final void a() {
            AtomicInteger atomicInteger = this.f103834e;
            if (atomicInteger.getAndIncrement() != 0) {
                return;
            }
            int i11 = 1;
            while (!isDisposed()) {
                c<T>[] cVarArr = this.f103832c.get();
                long j11 = this.f103835f;
                long j12 = j11;
                for (c<T> cVar : cVarArr) {
                    j12 = Math.max(j12, cVar.f103821d.get());
                }
                long j13 = this.f103836g;
                InterfaceC6950c interfaceC6950c = get();
                long j14 = j12 - j11;
                if (j14 != 0) {
                    this.f103835f = j12;
                    if (interfaceC6950c == null) {
                        long j15 = j13 + j14;
                        if (j15 < 0) {
                            j15 = Long.MAX_VALUE;
                        }
                        this.f103836g = j15;
                    } else if (j13 != 0) {
                        this.f103836g = 0L;
                        interfaceC6950c.n(j13 + j14);
                    } else {
                        interfaceC6950c.n(j14);
                    }
                } else if (j13 != 0 && interfaceC6950c != null) {
                    this.f103836g = 0L;
                    interfaceC6950c.n(j13);
                }
                i11 = atomicInteger.addAndGet(-i11);
                if (i11 == 0) {
                    return;
                }
            }
        }

        final void b(c<T> cVar) {
            c<T>[] cVarArr;
            while (true) {
                AtomicReference<c<T>[]> atomicReference = this.f103832c;
                c<T>[] cVarArr2 = atomicReference.get();
                int length = cVarArr2.length;
                if (length == 0) {
                    return;
                }
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        i11 = -1;
                        break;
                    } else if (cVarArr2[i11].equals(cVar)) {
                        break;
                    } else {
                        i11++;
                    }
                }
                if (i11 < 0) {
                    return;
                }
                if (length == 1) {
                    cVarArr = f103828h;
                } else {
                    c<T>[] cVarArr3 = new c[length - 1];
                    System.arraycopy(cVarArr2, 0, cVarArr3, 0, i11);
                    System.arraycopy(cVarArr2, i11 + 1, cVarArr3, i11, (length - i11) - 1);
                    cVarArr = cVarArr3;
                }
                while (!atomicReference.compareAndSet(cVarArr2, cVarArr)) {
                    if (atomicReference.get() != cVarArr2) {
                        break;
                    }
                }
                return;
            }
        }

        @Override // hg.InterfaceC6949b
        public final void d(InterfaceC6950c interfaceC6950c) {
            if (Fc.g.e(this, interfaceC6950c)) {
                a();
                for (c<T> cVar : this.f103832c.get()) {
                    this.f103830a.e(cVar);
                }
            }
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            this.f103832c.set(f103829i);
            Fc.g.a(this);
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f103832c.get() == f103829i;
        }

        @Override // hg.InterfaceC6949b
        public final void onComplete() {
            if (this.f103831b) {
                return;
            }
            this.f103831b = true;
            e<T> eVar = this.f103830a;
            eVar.m();
            for (c<T> cVar : this.f103832c.getAndSet(f103829i)) {
                eVar.e(cVar);
            }
        }

        @Override // hg.InterfaceC6949b
        public final void onError(Throwable th2) {
            if (this.f103831b) {
                C3493a.f(th2);
                return;
            }
            this.f103831b = true;
            e<T> eVar = this.f103830a;
            eVar.a(th2);
            for (c<T> cVar : this.f103832c.getAndSet(f103829i)) {
                eVar.e(cVar);
            }
        }

        @Override // hg.InterfaceC6949b
        public final void onNext(T t2) {
            if (this.f103831b) {
                return;
            }
            e<T> eVar = this.f103830a;
            eVar.b(t2);
            for (c<T> cVar : this.f103832c.get()) {
                eVar.e(cVar);
            }
        }
    }

    static final class i<T> extends a<T> {

        /* renamed from: d, reason: collision with root package name */
        final int f103837d;

        i() {
            d dVar = new d(0L, null);
            this.f103815a = dVar;
            set(dVar);
            this.f103837d = 1;
        }
    }

    static final class j<T> extends ArrayList<Object> implements e<T> {

        /* renamed from: a, reason: collision with root package name */
        volatile int f103838a;

        @Override // wc.J.e
        public final void a(Throwable th2) {
            add(Gc.k.f(th2));
            this.f103838a++;
        }

        @Override // wc.J.e
        public final void b(T t2) {
            add(t2);
            this.f103838a++;
        }

        @Override // wc.J.e
        public final void e(c<T> cVar) {
            synchronized (cVar) {
                try {
                    if (cVar.f103822e) {
                        cVar.f103823f = true;
                        return;
                    }
                    cVar.f103822e = true;
                    InterfaceC6949b<? super T> interfaceC6949b = cVar.f103819b;
                    while (!cVar.isDisposed()) {
                        int i11 = this.f103838a;
                        Integer num = (Integer) cVar.f103820c;
                        int intValue = num != null ? num.intValue() : 0;
                        long j11 = cVar.get();
                        long j12 = j11;
                        long j13 = 0;
                        while (j12 != 0 && intValue < i11) {
                            Object obj = get(intValue);
                            try {
                                if (Gc.k.b(obj, interfaceC6949b) || cVar.isDisposed()) {
                                    return;
                                }
                                intValue++;
                                j12--;
                                j13++;
                            } catch (Throwable th2) {
                                C2645f.c(th2);
                                cVar.dispose();
                                if (Gc.k.i(obj) || Gc.k.h(obj)) {
                                    return;
                                }
                                interfaceC6949b.onError(th2);
                                return;
                            }
                        }
                        if (j13 != 0) {
                            cVar.f103820c = Integer.valueOf(intValue);
                            if (j11 != Long.MAX_VALUE) {
                                cVar.a(j13);
                            }
                        }
                        synchronized (cVar) {
                            try {
                                if (!cVar.f103823f) {
                                    cVar.f103822e = false;
                                    return;
                                }
                                cVar.f103823f = false;
                            } finally {
                            }
                        }
                    }
                } finally {
                }
            }
        }

        @Override // wc.J.e
        public final void m() {
            add(Gc.k.COMPLETE);
            this.f103838a++;
        }
    }

    private J(InterfaceC6948a<T> interfaceC6948a, io.reactivex.h<T> hVar, AtomicReference<h<T>> atomicReference, Callable<? extends e<T>> callable) {
        this.f103814f = interfaceC6948a;
        this.f103811c = hVar;
        this.f103812d = atomicReference;
        this.f103813e = callable;
    }

    public static J m(io.reactivex.h hVar) {
        f fVar = new f();
        AtomicReference atomicReference = new AtomicReference();
        return new J(new g(atomicReference, fVar), hVar, atomicReference, fVar);
    }

    @Override // rc.g
    public final void b(InterfaceC8487b interfaceC8487b) {
        AtomicReference<h<T>> atomicReference;
        h<T> hVar = (h) interfaceC8487b;
        do {
            atomicReference = this.f103812d;
            if (atomicReference.compareAndSet(hVar, null)) {
                return;
            }
        } while (atomicReference.get() == hVar);
    }

    @Override // io.reactivex.h
    protected final void j(io.reactivex.j jVar) {
        ((g) this.f103814f).a(jVar);
    }

    @Override // pc.AbstractC8896a
    public final void l(qc.g<? super InterfaceC8487b> gVar) {
        h<T> hVar;
        loop0: while (true) {
            AtomicReference<h<T>> atomicReference = this.f103812d;
            hVar = atomicReference.get();
            if (hVar != null && !hVar.isDisposed()) {
                break;
            }
            try {
                h<T> hVar2 = new h<>(this.f103813e.call());
                while (!atomicReference.compareAndSet(hVar, hVar2)) {
                    if (atomicReference.get() != hVar) {
                        break;
                    }
                }
                hVar = hVar2;
                break loop0;
            } finally {
                C2645f.c(th);
                RuntimeException d11 = Gc.i.d(th);
            }
        }
        AtomicBoolean atomicBoolean = hVar.f103833d;
        boolean z11 = !atomicBoolean.get() && atomicBoolean.compareAndSet(false, true);
        try {
            ((C10478G.a) gVar).accept(hVar);
            if (z11) {
                this.f103811c.i(hVar);
            }
        } catch (Throwable th2) {
            if (z11) {
                atomicBoolean.compareAndSet(true, false);
            }
            throw Gc.i.d(th2);
        }
    }
}
