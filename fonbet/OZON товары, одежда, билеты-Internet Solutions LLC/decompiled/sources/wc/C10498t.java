package wc;

import Bl0.C2645f;
import java.util.Iterator;
import java.util.List;
import sc.C9656b;
import tc.InterfaceC9799a;

/* renamed from: wc.t, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C10498t<T> extends io.reactivex.h<T> {

    /* renamed from: c, reason: collision with root package name */
    final List f104060c;

    /* renamed from: wc.t$a */
    static abstract class a<T> extends Fc.b<T> {

        /* renamed from: a, reason: collision with root package name */
        Iterator<? extends T> f104061a;

        /* renamed from: b, reason: collision with root package name */
        volatile boolean f104062b;

        /* renamed from: c, reason: collision with root package name */
        boolean f104063c;

        a(Iterator<? extends T> it) {
            this.f104061a = it;
        }

        @Override // tc.InterfaceC9804f
        public final int a(int i11) {
            return 1;
        }

        abstract void b();

        @Override // hg.InterfaceC6950c
        public final void cancel() {
            this.f104062b = true;
        }

        @Override // tc.InterfaceC9808j
        public final void clear() {
            this.f104061a = null;
        }

        abstract void d(long j11);

        @Override // tc.InterfaceC9808j
        public final boolean isEmpty() {
            Iterator<? extends T> it = this.f104061a;
            return it == null || !it.hasNext();
        }

        @Override // hg.InterfaceC6950c
        public final void n(long j11) {
            if (Fc.g.f(j11) && Gc.d.a(this, j11) == 0) {
                if (j11 == Long.MAX_VALUE) {
                    b();
                } else {
                    d(j11);
                }
            }
        }

        @Override // tc.InterfaceC9808j
        public final T poll() {
            Iterator<? extends T> it = this.f104061a;
            if (it == null) {
                return null;
            }
            if (!this.f104063c) {
                this.f104063c = true;
            } else if (!it.hasNext()) {
                return null;
            }
            T next = this.f104061a.next();
            C9656b.c(next, "Iterator.next() returned a null value");
            return next;
        }
    }

    /* renamed from: wc.t$b */
    static final class b<T> extends a<T> {

        /* renamed from: d, reason: collision with root package name */
        final InterfaceC9799a<? super T> f104064d;

        b(InterfaceC9799a<? super T> interfaceC9799a, Iterator<? extends T> it) {
            super(it);
            this.f104064d = interfaceC9799a;
        }

        @Override // wc.C10498t.a
        final void b() {
            Iterator<? extends T> it = this.f104061a;
            InterfaceC9799a<? super T> interfaceC9799a = this.f104064d;
            while (!this.f104062b) {
                try {
                    T next = it.next();
                    if (this.f104062b) {
                        return;
                    }
                    if (next == null) {
                        interfaceC9799a.onError(new NullPointerException("Iterator.next() returned a null value"));
                        return;
                    }
                    interfaceC9799a.g(next);
                    if (this.f104062b) {
                        return;
                    }
                    try {
                        if (!it.hasNext()) {
                            if (this.f104062b) {
                                return;
                            }
                            interfaceC9799a.onComplete();
                            return;
                        }
                    } catch (Throwable th2) {
                        C2645f.c(th2);
                        interfaceC9799a.onError(th2);
                        return;
                    }
                } catch (Throwable th3) {
                    C2645f.c(th3);
                    interfaceC9799a.onError(th3);
                    return;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x005b, code lost:
        
            r9 = addAndGet(-r4);
         */
        @Override // wc.C10498t.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        final void d(long j11) {
            Iterator<? extends T> it = this.f104061a;
            InterfaceC9799a<? super T> interfaceC9799a = this.f104064d;
            do {
                long j12 = 0;
                while (true) {
                    if (j12 == j11) {
                        j11 = get();
                        if (j12 == j11) {
                            break;
                        }
                    } else {
                        if (this.f104062b) {
                            return;
                        }
                        try {
                            T next = it.next();
                            if (this.f104062b) {
                                return;
                            }
                            if (next == null) {
                                interfaceC9799a.onError(new NullPointerException("Iterator.next() returned a null value"));
                                return;
                            }
                            boolean g10 = interfaceC9799a.g(next);
                            if (this.f104062b) {
                                return;
                            }
                            try {
                                if (!it.hasNext()) {
                                    if (this.f104062b) {
                                        return;
                                    }
                                    interfaceC9799a.onComplete();
                                    return;
                                } else if (g10) {
                                    j12++;
                                }
                            } catch (Throwable th2) {
                                C2645f.c(th2);
                                interfaceC9799a.onError(th2);
                                return;
                            }
                        } catch (Throwable th3) {
                            C2645f.c(th3);
                            interfaceC9799a.onError(th3);
                            return;
                        }
                    }
                }
            } while (j11 != 0);
        }
    }

    /* renamed from: wc.t$c */
    static final class c<T> extends a<T> {

        /* renamed from: d, reason: collision with root package name */
        final io.reactivex.j f104065d;

        c(io.reactivex.j jVar, Iterator it) {
            super(it);
            this.f104065d = jVar;
        }

        @Override // wc.C10498t.a
        final void b() {
            Iterator<? extends T> it = this.f104061a;
            io.reactivex.j jVar = this.f104065d;
            while (!this.f104062b) {
                try {
                    T next = it.next();
                    if (this.f104062b) {
                        return;
                    }
                    if (next == null) {
                        jVar.onError(new NullPointerException("Iterator.next() returned a null value"));
                        return;
                    }
                    jVar.onNext(next);
                    if (this.f104062b) {
                        return;
                    }
                    try {
                        if (!it.hasNext()) {
                            if (this.f104062b) {
                                return;
                            }
                            jVar.onComplete();
                            return;
                        }
                    } catch (Throwable th2) {
                        C2645f.c(th2);
                        jVar.onError(th2);
                        return;
                    }
                } catch (Throwable th3) {
                    C2645f.c(th3);
                    jVar.onError(th3);
                    return;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x0058, code lost:
        
            r9 = addAndGet(-r4);
         */
        @Override // wc.C10498t.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        final void d(long j11) {
            Iterator<? extends T> it = this.f104061a;
            io.reactivex.j jVar = this.f104065d;
            do {
                long j12 = 0;
                while (true) {
                    if (j12 == j11) {
                        j11 = get();
                        if (j12 == j11) {
                            break;
                        }
                    } else {
                        if (this.f104062b) {
                            return;
                        }
                        try {
                            T next = it.next();
                            if (this.f104062b) {
                                return;
                            }
                            if (next == null) {
                                jVar.onError(new NullPointerException("Iterator.next() returned a null value"));
                                return;
                            }
                            jVar.onNext(next);
                            if (this.f104062b) {
                                return;
                            }
                            try {
                                if (!it.hasNext()) {
                                    if (this.f104062b) {
                                        return;
                                    }
                                    jVar.onComplete();
                                    return;
                                }
                                j12++;
                            } catch (Throwable th2) {
                                C2645f.c(th2);
                                jVar.onError(th2);
                                return;
                            }
                        } catch (Throwable th3) {
                            C2645f.c(th3);
                            jVar.onError(th3);
                            return;
                        }
                    }
                }
            } while (j11 != 0);
        }
    }

    public C10498t(List list) {
        this.f104060c = list;
    }

    @Override // io.reactivex.h
    public final void j(io.reactivex.j jVar) {
        try {
            Iterator<T> it = this.f104060c.iterator();
            try {
                if (!it.hasNext()) {
                    Fc.d.b(jVar);
                } else if (jVar instanceof InterfaceC9799a) {
                    jVar.d(new b((InterfaceC9799a) jVar, it));
                } else {
                    jVar.d(new c(jVar, it));
                }
            } catch (Throwable th2) {
                C2645f.c(th2);
                Fc.d.d(th2, jVar);
            }
        } catch (Throwable th3) {
            C2645f.c(th3);
            Fc.d.d(th3, jVar);
        }
    }
}
