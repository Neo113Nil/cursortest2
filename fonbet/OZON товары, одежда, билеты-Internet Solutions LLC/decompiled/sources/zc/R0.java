package zc;

import Bl0.C2645f;
import java.util.concurrent.atomic.AtomicInteger;
import nc.InterfaceC8487b;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.viewModel.AviaSearchResultViewModel;

/* loaded from: classes9.dex */
public final class R0<T> extends AbstractC11019a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final qc.e f107951b;

    static final class a<T> extends AtomicInteger implements io.reactivex.w<T> {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super T> f107952a;

        /* renamed from: b, reason: collision with root package name */
        final rc.h f107953b;

        /* renamed from: c, reason: collision with root package name */
        final io.reactivex.u<? extends T> f107954c;

        /* renamed from: d, reason: collision with root package name */
        final qc.e f107955d;

        a(io.reactivex.w<? super T> wVar, qc.e eVar, rc.h hVar, io.reactivex.u<? extends T> uVar) {
            this.f107952a = wVar;
            this.f107953b = hVar;
            this.f107954c = uVar;
            this.f107955d = eVar;
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            boolean pollFlights$lambda$12;
            io.reactivex.w<? super T> wVar = this.f107952a;
            try {
                pollFlights$lambda$12 = AviaSearchResultViewModel.pollFlights$lambda$12((AviaSearchResultViewModel) ((AW.d) this.f107955d).f674a);
                if (pollFlights$lambda$12) {
                    wVar.onComplete();
                } else if (getAndIncrement() == 0) {
                    int i11 = 1;
                    do {
                        this.f107954c.subscribe(this);
                        i11 = addAndGet(-i11);
                    } while (i11 != 0);
                }
            } catch (Throwable th2) {
                C2645f.c(th2);
                wVar.onError(th2);
            }
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            this.f107952a.onError(th2);
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            this.f107952a.onNext(t2);
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            rc.h hVar = this.f107953b;
            hVar.getClass();
            rc.d.d(hVar, interfaceC8487b);
        }
    }

    public R0(io.reactivex.p<T> pVar, qc.e eVar) {
        super(pVar);
        this.f107951b = eVar;
    }

    @Override // io.reactivex.p
    public final void subscribeActual(io.reactivex.w<? super T> wVar) {
        rc.h hVar = new rc.h();
        wVar.onSubscribe(hVar);
        a aVar = new a(wVar, this.f107951b, hVar, this.f108122a);
        if (aVar.getAndIncrement() == 0) {
            int i11 = 1;
            do {
                aVar.f107954c.subscribe(aVar);
                i11 = aVar.addAndGet(-i11);
            } while (i11 != 0);
        }
    }
}
