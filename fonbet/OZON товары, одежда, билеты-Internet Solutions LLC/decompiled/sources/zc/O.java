package zc;

import nc.InterfaceC8487b;
import qc.InterfaceC9019a;

/* loaded from: classes9.dex */
public final class O<T> extends AbstractC11019a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    private final qc.g<? super InterfaceC8487b> f107903b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC9019a f107904c;

    public O(io.reactivex.p<T> pVar, qc.g<? super InterfaceC8487b> gVar, InterfaceC9019a interfaceC9019a) {
        super(pVar);
        this.f107903b = gVar;
        this.f107904c = interfaceC9019a;
    }

    @Override // io.reactivex.p
    protected final void subscribeActual(io.reactivex.w<? super T> wVar) {
        this.f108122a.subscribe(new uc.l(wVar, this.f107903b, this.f107904c));
    }
}
