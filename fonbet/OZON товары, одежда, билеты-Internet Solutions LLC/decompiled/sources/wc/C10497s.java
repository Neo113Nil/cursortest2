package wc;

import sc.C9656b;
import tc.InterfaceC9799a;

/* renamed from: wc.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10497s<T> extends io.reactivex.h<T> {

    /* renamed from: c, reason: collision with root package name */
    final T[] f104054c;

    /* renamed from: wc.s$a */
    /* loaded from: classes9.dex */
    static final class a<T> extends c<T> {

        /* renamed from: d, reason: collision with root package name */
        final InterfaceC9799a<? super T> f104055d;

        a(InterfaceC9799a<? super T> interfaceC9799a, T[] tArr) {
            super(tArr);
            this.f104055d = interfaceC9799a;
        }

        @Override // wc.C10497s.c
        final void b() {
            T[] tArr = this.f104057a;
            int length = tArr.length;
            InterfaceC9799a<? super T> interfaceC9799a = this.f104055d;
            for (int i11 = this.f104058b; i11 != length; i11++) {
                if (this.f104059c) {
                    return;
                }
                T t2 = tArr[i11];
                if (t2 == null) {
                    interfaceC9799a.onError(new NullPointerException(T7.E.a(i11, "The element at index ", " is null")));
                    return;
                }
                interfaceC9799a.g(t2);
            }
            if (this.f104059c) {
                return;
            }
            interfaceC9799a.onComplete();
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0048, code lost:
        
            r10.f104058b = r2;
            r11 = addAndGet(-r6);
         */
        @Override // wc.C10497s.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        final void d(long j11) {
            T[] tArr = this.f104057a;
            int length = tArr.length;
            int i11 = this.f104058b;
            InterfaceC9799a<? super T> interfaceC9799a = this.f104055d;
            do {
                long j12 = 0;
                while (true) {
                    if (j12 == j11 || i11 == length) {
                        if (i11 == length) {
                            if (this.f104059c) {
                                return;
                            }
                            interfaceC9799a.onComplete();
                            return;
                        } else {
                            j11 = get();
                            if (j12 == j11) {
                                break;
                            }
                        }
                    } else {
                        if (this.f104059c) {
                            return;
                        }
                        T t2 = tArr[i11];
                        if (t2 == null) {
                            interfaceC9799a.onError(new NullPointerException(T7.E.a(i11, "The element at index ", " is null")));
                            return;
                        } else {
                            if (interfaceC9799a.g(t2)) {
                                j12++;
                            }
                            i11++;
                        }
                    }
                }
            } while (j11 != 0);
        }
    }

    /* renamed from: wc.s$b */
    static final class b<T> extends c<T> {

        /* renamed from: d, reason: collision with root package name */
        final io.reactivex.j f104056d;

        b(io.reactivex.j jVar, Object[] objArr) {
            super(objArr);
            this.f104056d = jVar;
        }

        @Override // wc.C10497s.c
        final void b() {
            T[] tArr = this.f104057a;
            int length = tArr.length;
            io.reactivex.j jVar = this.f104056d;
            for (int i11 = this.f104058b; i11 != length; i11++) {
                if (this.f104059c) {
                    return;
                }
                T t2 = tArr[i11];
                if (t2 == null) {
                    jVar.onError(new NullPointerException(T7.E.a(i11, "The element at index ", " is null")));
                    return;
                }
                jVar.onNext(t2);
            }
            if (this.f104059c) {
                return;
            }
            jVar.onComplete();
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0045, code lost:
        
            r10.f104058b = r2;
            r11 = addAndGet(-r6);
         */
        @Override // wc.C10497s.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        final void d(long j11) {
            T[] tArr = this.f104057a;
            int length = tArr.length;
            int i11 = this.f104058b;
            io.reactivex.j jVar = this.f104056d;
            do {
                long j12 = 0;
                while (true) {
                    if (j12 == j11 || i11 == length) {
                        if (i11 == length) {
                            if (this.f104059c) {
                                return;
                            }
                            jVar.onComplete();
                            return;
                        } else {
                            j11 = get();
                            if (j12 == j11) {
                                break;
                            }
                        }
                    } else {
                        if (this.f104059c) {
                            return;
                        }
                        T t2 = tArr[i11];
                        if (t2 == null) {
                            jVar.onError(new NullPointerException(T7.E.a(i11, "The element at index ", " is null")));
                            return;
                        } else {
                            jVar.onNext(t2);
                            j12++;
                            i11++;
                        }
                    }
                }
            } while (j11 != 0);
        }
    }

    /* renamed from: wc.s$c */
    static abstract class c<T> extends Fc.b<T> {

        /* renamed from: a, reason: collision with root package name */
        final T[] f104057a;

        /* renamed from: b, reason: collision with root package name */
        int f104058b;

        /* renamed from: c, reason: collision with root package name */
        volatile boolean f104059c;

        c(T[] tArr) {
            this.f104057a = tArr;
        }

        @Override // tc.InterfaceC9804f
        public final int a(int i11) {
            return 1;
        }

        abstract void b();

        @Override // hg.InterfaceC6950c
        public final void cancel() {
            this.f104059c = true;
        }

        @Override // tc.InterfaceC9808j
        public final void clear() {
            this.f104058b = this.f104057a.length;
        }

        abstract void d(long j11);

        @Override // tc.InterfaceC9808j
        public final boolean isEmpty() {
            return this.f104058b == this.f104057a.length;
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
            int i11 = this.f104058b;
            T[] tArr = this.f104057a;
            if (i11 == tArr.length) {
                return null;
            }
            this.f104058b = i11 + 1;
            T t2 = tArr[i11];
            C9656b.c(t2, "array element is null");
            return t2;
        }
    }

    public C10497s(T[] tArr) {
        this.f104054c = tArr;
    }

    @Override // io.reactivex.h
    public final void j(io.reactivex.j jVar) {
        boolean z11 = jVar instanceof InterfaceC9799a;
        T[] tArr = this.f104054c;
        if (z11) {
            jVar.d(new a((InterfaceC9799a) jVar, tArr));
        } else {
            jVar.d(new b(jVar, tArr));
        }
    }
}
