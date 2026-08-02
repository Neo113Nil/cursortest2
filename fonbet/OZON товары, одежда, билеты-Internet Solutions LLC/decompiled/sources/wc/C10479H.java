package wc;

import Bl0.C2645f;
import hg.InterfaceC6948a;
import hg.InterfaceC6950c;
import java.util.concurrent.atomic.AtomicInteger;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.viewModel.AviaSearchResultViewModel;

/* renamed from: wc.H, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C10479H<T> extends AbstractC10480a<T, T> {

    /* renamed from: d, reason: collision with root package name */
    final AW.d f103795d;

    /* renamed from: wc.H$a */
    static final class a<T> extends AtomicInteger implements io.reactivex.j<T> {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.j f103796a;

        /* renamed from: b, reason: collision with root package name */
        final Fc.f f103797b;

        /* renamed from: c, reason: collision with root package name */
        final InterfaceC6948a<? extends T> f103798c;

        /* renamed from: d, reason: collision with root package name */
        final AW.d f103799d;

        /* renamed from: e, reason: collision with root package name */
        long f103800e;

        a(io.reactivex.j jVar, AW.d dVar, Fc.f fVar, InterfaceC6948a interfaceC6948a) {
            this.f103796a = jVar;
            this.f103797b = fVar;
            this.f103798c = interfaceC6948a;
            this.f103799d = dVar;
        }

        final void a() {
            if (getAndIncrement() == 0) {
                int i11 = 1;
                do {
                    Fc.f fVar = this.f103797b;
                    if (fVar.b()) {
                        return;
                    }
                    long j11 = this.f103800e;
                    if (j11 != 0) {
                        this.f103800e = 0L;
                        fVar.f(j11);
                    }
                    this.f103798c.a(this);
                    i11 = addAndGet(-i11);
                } while (i11 != 0);
            }
        }

        @Override // hg.InterfaceC6949b
        public final void d(InterfaceC6950c interfaceC6950c) {
            this.f103797b.h(interfaceC6950c);
        }

        @Override // hg.InterfaceC6949b
        public final void onComplete() {
            boolean pollFlights$lambda$12;
            io.reactivex.j jVar = this.f103796a;
            try {
                pollFlights$lambda$12 = AviaSearchResultViewModel.pollFlights$lambda$12((AviaSearchResultViewModel) this.f103799d.f674a);
                if (pollFlights$lambda$12) {
                    jVar.onComplete();
                } else {
                    a();
                }
            } catch (Throwable th2) {
                C2645f.c(th2);
                jVar.onError(th2);
            }
        }

        @Override // hg.InterfaceC6949b
        public final void onError(Throwable th2) {
            this.f103796a.onError(th2);
        }

        @Override // hg.InterfaceC6949b
        public final void onNext(T t2) {
            this.f103800e++;
            this.f103796a.onNext(t2);
        }
    }

    public C10479H(io.reactivex.h hVar, AW.d dVar) {
        super(hVar);
        this.f103795d = dVar;
    }

    @Override // io.reactivex.h
    public final void j(io.reactivex.j jVar) {
        Fc.f fVar = new Fc.f(false);
        jVar.d(fVar);
        new a(jVar, this.f103795d, fVar, this.f103914c).a();
    }
}
