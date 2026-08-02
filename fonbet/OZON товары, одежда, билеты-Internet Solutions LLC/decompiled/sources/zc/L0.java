package zc;

import uc.AbstractC10018b;

/* loaded from: classes9.dex */
public final class L0 extends io.reactivex.p<Long> {

    /* renamed from: a, reason: collision with root package name */
    private final long f107829a;

    /* renamed from: b, reason: collision with root package name */
    private final long f107830b;

    static final class a extends AbstractC10018b<Long> {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super Long> f107831a;

        /* renamed from: b, reason: collision with root package name */
        final long f107832b;

        /* renamed from: c, reason: collision with root package name */
        long f107833c;

        /* renamed from: d, reason: collision with root package name */
        boolean f107834d;

        a(io.reactivex.w<? super Long> wVar, long j11, long j12) {
            this.f107831a = wVar;
            this.f107833c = j11;
            this.f107832b = j12;
        }

        @Override // tc.InterfaceC9804f
        public final int a(int i11) {
            this.f107834d = true;
            return 1;
        }

        @Override // tc.InterfaceC9808j
        public final void clear() {
            this.f107833c = this.f107832b;
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
            return this.f107833c == this.f107832b;
        }

        @Override // tc.InterfaceC9808j
        public final Object poll() throws Exception {
            long j11 = this.f107833c;
            if (j11 != this.f107832b) {
                this.f107833c = 1 + j11;
                return Long.valueOf(j11);
            }
            lazySet(1);
            return null;
        }
    }

    public L0(long j11, long j12) {
        this.f107829a = j11;
        this.f107830b = j12;
    }

    @Override // io.reactivex.p
    protected final void subscribeActual(io.reactivex.w<? super Long> wVar) {
        io.reactivex.w<? super Long> wVar2;
        long j11 = this.f107829a;
        a aVar = new a(wVar, j11, this.f107830b + j11);
        wVar.onSubscribe(aVar);
        if (aVar.f107834d) {
            return;
        }
        long j12 = aVar.f107833c;
        while (true) {
            long j13 = aVar.f107832b;
            wVar2 = aVar.f107831a;
            if (j12 == j13 || aVar.get() != 0) {
                break;
            }
            wVar2.onNext(Long.valueOf(j12));
            j12++;
        }
        if (aVar.get() == 0) {
            aVar.lazySet(1);
            wVar2.onComplete();
        }
    }
}
