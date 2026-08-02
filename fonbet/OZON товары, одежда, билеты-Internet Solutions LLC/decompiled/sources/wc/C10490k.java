package wc;

import Bl0.C2645f;
import Kc.C3493a;
import T7.Z;
import hg.InterfaceC6950c;
import io.reactivex.EnumC7093a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import rc.C9243b;

/* renamed from: wc.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10490k<T> extends io.reactivex.h<T> {

    /* renamed from: c, reason: collision with root package name */
    final BZ.g f103957c;

    /* renamed from: d, reason: collision with root package name */
    final EnumC7093a f103958d;

    /* renamed from: wc.k$a */
    /* loaded from: classes9.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f103959a;

        static {
            int[] iArr = new int[EnumC7093a.values().length];
            f103959a = iArr;
            try {
                iArr[EnumC7093a.MISSING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f103959a[EnumC7093a.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f103959a[EnumC7093a.DROP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f103959a[EnumC7093a.LATEST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: wc.k$b */
    /* loaded from: classes9.dex */
    static abstract class b<T> extends AtomicLong implements io.reactivex.i<T>, InterfaceC6950c {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.j f103960a;

        /* renamed from: b, reason: collision with root package name */
        final rc.h f103961b = new rc.h();

        b(io.reactivex.j jVar) {
            this.f103960a = jVar;
        }

        @Override // io.reactivex.i
        public final void a(qc.f fVar) {
            C9243b c9243b = new C9243b(fVar);
            rc.h hVar = this.f103961b;
            hVar.getClass();
            rc.d.e(hVar, c9243b);
        }

        public boolean b(Throwable th2) {
            return e(th2);
        }

        @Override // hg.InterfaceC6950c
        public final void cancel() {
            rc.h hVar = this.f103961b;
            hVar.getClass();
            rc.d.a(hVar);
            h();
        }

        protected final void d() {
            rc.h hVar = this.f103961b;
            if (hVar.isDisposed()) {
                return;
            }
            try {
                this.f103960a.onComplete();
            } finally {
                rc.d.a(hVar);
            }
        }

        protected final boolean e(Throwable th2) {
            if (th2 == null) {
                th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            rc.h hVar = this.f103961b;
            if (hVar.isDisposed()) {
                return false;
            }
            try {
                this.f103960a.onError(th2);
                rc.d.a(hVar);
                return true;
            } catch (Throwable th3) {
                rc.d.a(hVar);
                throw th3;
            }
        }

        public final void f(Throwable th2) {
            if (b(th2)) {
                return;
            }
            C3493a.f(th2);
        }

        void g() {
        }

        void h() {
        }

        @Override // io.reactivex.i
        public final boolean isCancelled() {
            return this.f103961b.isDisposed();
        }

        @Override // hg.InterfaceC6950c
        public final void n(long j11) {
            if (Fc.g.f(j11)) {
                Gc.d.a(this, j11);
                g();
            }
        }

        @Override // java.util.concurrent.atomic.AtomicLong
        public final String toString() {
            return Z.a(getClass().getSimpleName(), "{", super.toString(), "}");
        }
    }

    /* renamed from: wc.k$c */
    /* loaded from: classes9.dex */
    static final class c<T> extends b<T> {

        /* renamed from: c, reason: collision with root package name */
        final Cc.c<T> f103962c;

        /* renamed from: d, reason: collision with root package name */
        Throwable f103963d;

        /* renamed from: e, reason: collision with root package name */
        volatile boolean f103964e;

        /* renamed from: f, reason: collision with root package name */
        final AtomicInteger f103965f;

        c(io.reactivex.j jVar, int i11) {
            super(jVar);
            this.f103962c = new Cc.c<>(i11);
            this.f103965f = new AtomicInteger();
        }

        @Override // wc.C10490k.b
        public final boolean b(Throwable th2) {
            if (this.f103964e || this.f103961b.isDisposed()) {
                return false;
            }
            this.f103963d = th2;
            this.f103964e = true;
            i();
            return true;
        }

        @Override // wc.C10490k.b
        final void g() {
            i();
        }

        @Override // wc.C10490k.b
        final void h() {
            if (this.f103965f.getAndIncrement() == 0) {
                this.f103962c.clear();
            }
        }

        final void i() {
            if (this.f103965f.getAndIncrement() != 0) {
                return;
            }
            io.reactivex.j jVar = this.f103960a;
            Cc.c<T> cVar = this.f103962c;
            int i11 = 1;
            do {
                long j11 = get();
                long j12 = 0;
                while (j12 != j11) {
                    if (this.f103961b.isDisposed()) {
                        cVar.clear();
                        return;
                    }
                    boolean z11 = this.f103964e;
                    T poll = cVar.poll();
                    boolean z12 = poll == null;
                    if (z11 && z12) {
                        Throwable th2 = this.f103963d;
                        if (th2 != null) {
                            e(th2);
                            return;
                        } else {
                            d();
                            return;
                        }
                    }
                    if (z12) {
                        break;
                    }
                    jVar.onNext(poll);
                    j12++;
                }
                if (j12 == j11) {
                    if (this.f103961b.isDisposed()) {
                        cVar.clear();
                        return;
                    }
                    boolean z13 = this.f103964e;
                    boolean isEmpty = cVar.isEmpty();
                    if (z13 && isEmpty) {
                        Throwable th3 = this.f103963d;
                        if (th3 != null) {
                            e(th3);
                            return;
                        } else {
                            d();
                            return;
                        }
                    }
                }
                if (j12 != 0) {
                    Gc.d.c(this, j12);
                }
                i11 = this.f103965f.addAndGet(-i11);
            } while (i11 != 0);
        }

        @Override // io.reactivex.g
        public final void onNext(T t2) {
            if (this.f103964e || this.f103961b.isDisposed()) {
                return;
            }
            if (t2 == null) {
                f(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else {
                this.f103962c.offer(t2);
                i();
            }
        }
    }

    /* renamed from: wc.k$d */
    /* loaded from: classes9.dex */
    static final class d<T> extends h<T> {
        d(io.reactivex.j jVar) {
            super(jVar);
        }

        @Override // wc.C10490k.h
        final void i() {
        }
    }

    /* renamed from: wc.k$e */
    /* loaded from: classes9.dex */
    static final class e<T> extends h<T> {
        e(io.reactivex.j jVar) {
            super(jVar);
        }

        @Override // wc.C10490k.h
        final void i() {
            f(new oc.b("create: could not emit value due to lack of requests"));
        }
    }

    /* renamed from: wc.k$f */
    /* loaded from: classes9.dex */
    static final class f<T> extends b<T> {

        /* renamed from: c, reason: collision with root package name */
        final AtomicReference<T> f103966c;

        /* renamed from: d, reason: collision with root package name */
        Throwable f103967d;

        /* renamed from: e, reason: collision with root package name */
        volatile boolean f103968e;

        /* renamed from: f, reason: collision with root package name */
        final AtomicInteger f103969f;

        f(io.reactivex.j jVar) {
            super(jVar);
            this.f103966c = new AtomicReference<>();
            this.f103969f = new AtomicInteger();
        }

        @Override // wc.C10490k.b
        public final boolean b(Throwable th2) {
            if (this.f103968e || this.f103961b.isDisposed()) {
                return false;
            }
            this.f103967d = th2;
            this.f103968e = true;
            i();
            return true;
        }

        @Override // wc.C10490k.b
        final void g() {
            i();
        }

        @Override // wc.C10490k.b
        final void h() {
            if (this.f103969f.getAndIncrement() == 0) {
                this.f103966c.lazySet(null);
            }
        }

        final void i() {
            if (this.f103969f.getAndIncrement() != 0) {
                return;
            }
            io.reactivex.j jVar = this.f103960a;
            AtomicReference<T> atomicReference = this.f103966c;
            int i11 = 1;
            do {
                long j11 = get();
                long j12 = 0;
                while (true) {
                    if (j12 == j11) {
                        break;
                    }
                    if (this.f103961b.isDisposed()) {
                        atomicReference.lazySet(null);
                        return;
                    }
                    boolean z11 = this.f103968e;
                    T andSet = atomicReference.getAndSet(null);
                    boolean z12 = andSet == null;
                    if (z11 && z12) {
                        Throwable th2 = this.f103967d;
                        if (th2 != null) {
                            e(th2);
                            return;
                        } else {
                            d();
                            return;
                        }
                    }
                    if (z12) {
                        break;
                    }
                    jVar.onNext(andSet);
                    j12++;
                }
                if (j12 == j11) {
                    if (this.f103961b.isDisposed()) {
                        atomicReference.lazySet(null);
                        return;
                    }
                    boolean z13 = this.f103968e;
                    boolean z14 = atomicReference.get() == null;
                    if (z13 && z14) {
                        Throwable th3 = this.f103967d;
                        if (th3 != null) {
                            e(th3);
                            return;
                        } else {
                            d();
                            return;
                        }
                    }
                }
                if (j12 != 0) {
                    Gc.d.c(this, j12);
                }
                i11 = this.f103969f.addAndGet(-i11);
            } while (i11 != 0);
        }

        @Override // io.reactivex.g
        public final void onNext(T t2) {
            if (this.f103968e || this.f103961b.isDisposed()) {
                return;
            }
            if (t2 == null) {
                f(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else {
                this.f103966c.set(t2);
                i();
            }
        }
    }

    /* renamed from: wc.k$g */
    /* loaded from: classes9.dex */
    static final class g<T> extends b<T> {
        g(io.reactivex.j jVar) {
            super(jVar);
        }

        @Override // io.reactivex.g
        public final void onNext(T t2) {
            long j11;
            if (this.f103961b.isDisposed()) {
                return;
            }
            if (t2 == null) {
                f(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                return;
            }
            this.f103960a.onNext(t2);
            do {
                j11 = get();
                if (j11 == 0) {
                    return;
                }
            } while (!compareAndSet(j11, j11 - 1));
        }
    }

    /* renamed from: wc.k$h */
    /* loaded from: classes9.dex */
    static abstract class h<T> extends b<T> {
        abstract void i();

        @Override // io.reactivex.g
        public final void onNext(T t2) {
            if (this.f103961b.isDisposed()) {
                return;
            }
            if (t2 == null) {
                f(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else if (get() == 0) {
                i();
            } else {
                this.f103960a.onNext(t2);
                Gc.d.c(this, 1L);
            }
        }
    }

    public C10490k(BZ.g gVar, EnumC7093a enumC7093a) {
        this.f103957c = gVar;
        this.f103958d = enumC7093a;
    }

    @Override // io.reactivex.h
    public final void j(io.reactivex.j jVar) {
        int i11 = a.f103959a[this.f103958d.ordinal()];
        b cVar = i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? new c(jVar, io.reactivex.h.c()) : new f(jVar) : new d(jVar) : new e(jVar) : new g(jVar);
        jVar.d(cVar);
        try {
            this.f103957c.a(cVar);
        } catch (Throwable th2) {
            C2645f.c(th2);
            cVar.f(th2);
        }
    }
}
