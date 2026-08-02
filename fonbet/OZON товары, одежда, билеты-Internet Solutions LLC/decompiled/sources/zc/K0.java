package zc;

import uc.AbstractC10018b;

/* loaded from: classes9.dex */
public final class K0 extends io.reactivex.p<Integer> {

    /* renamed from: a, reason: collision with root package name */
    private final int f107778a;

    /* renamed from: b, reason: collision with root package name */
    private final long f107779b;

    static final class a extends AbstractC10018b<Integer> {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super Integer> f107780a;

        /* renamed from: b, reason: collision with root package name */
        final long f107781b;

        /* renamed from: c, reason: collision with root package name */
        long f107782c;

        /* renamed from: d, reason: collision with root package name */
        boolean f107783d;

        a(io.reactivex.w<? super Integer> wVar, long j11, long j12) {
            this.f107780a = wVar;
            this.f107782c = j11;
            this.f107781b = j12;
        }

        @Override // tc.InterfaceC9804f
        public final int a(int i11) {
            this.f107783d = true;
            return 1;
        }

        @Override // tc.InterfaceC9808j
        public final void clear() {
            this.f107782c = this.f107781b;
            lazySet(1);
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            set(1);
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return get() != 0;
        }

        @Override // tc.InterfaceC9808j
        public final boolean isEmpty() {
            return this.f107782c == this.f107781b;
        }

        @Override // tc.InterfaceC9808j
        public final Object poll() throws Exception {
            long j11 = this.f107782c;
            if (j11 != this.f107781b) {
                this.f107782c = 1 + j11;
                return Integer.valueOf((int) j11);
            }
            lazySet(1);
            return null;
        }
    }

    public K0(int i11, int i12) {
        this.f107778a = i11;
        this.f107779b = i11 + i12;
    }

    @Override // io.reactivex.p
    protected final void subscribeActual(io.reactivex.w<? super Integer> wVar) {
        io.reactivex.w<? super Integer> wVar2;
        a aVar = new a(wVar, this.f107778a, this.f107779b);
        wVar.onSubscribe(aVar);
        if (aVar.f107783d) {
            return;
        }
        long j11 = aVar.f107782c;
        while (true) {
            long j12 = aVar.f107781b;
            wVar2 = aVar.f107780a;
            if (j11 == j12 || aVar.get() != 0) {
                break;
            }
            wVar2.onNext(Integer.valueOf((int) j11));
            j11++;
        }
        if (aVar.get() == 0) {
            aVar.lazySet(1);
            wVar2.onComplete();
        }
    }
}
