package wc;

import Kc.C3493a;
import hg.InterfaceC6950c;
import java.util.NoSuchElementException;

/* loaded from: classes9.dex */
public final class O<T> extends AbstractC10480a<T, T> {

    /* renamed from: d, reason: collision with root package name */
    final boolean f103859d;

    static final class a<T> extends Fc.c<T> implements io.reactivex.j<T> {

        /* renamed from: c, reason: collision with root package name */
        final boolean f103860c;

        /* renamed from: d, reason: collision with root package name */
        InterfaceC6950c f103861d;

        /* renamed from: e, reason: collision with root package name */
        boolean f103862e;

        a(io.reactivex.j jVar, boolean z11) {
            super(jVar);
            this.f103860c = z11;
        }

        @Override // Fc.c, hg.InterfaceC6950c
        public final void cancel() {
            super.cancel();
            this.f103861d.cancel();
        }

        @Override // hg.InterfaceC6949b
        public final void d(InterfaceC6950c interfaceC6950c) {
            if (Fc.g.g(this.f103861d, interfaceC6950c)) {
                this.f103861d = interfaceC6950c;
                this.f9317a.d(this);
                interfaceC6950c.n(Long.MAX_VALUE);
            }
        }

        @Override // hg.InterfaceC6949b
        public final void onComplete() {
            if (this.f103862e) {
                return;
            }
            this.f103862e = true;
            T t2 = this.f9318b;
            this.f9318b = null;
            if (t2 == null) {
                t2 = null;
            }
            if (t2 != null) {
                b(t2);
                return;
            }
            boolean z11 = this.f103860c;
            io.reactivex.j jVar = this.f9317a;
            if (z11) {
                jVar.onError(new NoSuchElementException());
            } else {
                jVar.onComplete();
            }
        }

        @Override // hg.InterfaceC6949b
        public final void onError(Throwable th2) {
            if (this.f103862e) {
                C3493a.f(th2);
            } else {
                this.f103862e = true;
                this.f9317a.onError(th2);
            }
        }

        @Override // hg.InterfaceC6949b
        public final void onNext(T t2) {
            if (this.f103862e) {
                return;
            }
            if (this.f9318b == null) {
                this.f9318b = t2;
                return;
            }
            this.f103862e = true;
            this.f103861d.cancel();
            this.f9317a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
        }
    }

    public O(K k11) {
        super(k11);
        this.f103859d = true;
    }

    @Override // io.reactivex.h
    protected final void j(io.reactivex.j jVar) {
        this.f103914c.i(new a(jVar, this.f103859d));
    }
}
