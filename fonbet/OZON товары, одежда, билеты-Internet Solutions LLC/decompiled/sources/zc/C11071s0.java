package zc;

import tc.InterfaceCallableC9806h;
import zc.Z0;

/* renamed from: zc.s0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C11071s0<T> extends io.reactivex.p<T> implements InterfaceCallableC9806h<T> {

    /* renamed from: a, reason: collision with root package name */
    private final T f108602a;

    public C11071s0(T t2) {
        this.f108602a = t2;
    }

    @Override // java.util.concurrent.Callable
    public final T call() {
        return this.f108602a;
    }

    @Override // io.reactivex.p
    protected final void subscribeActual(io.reactivex.w<? super T> wVar) {
        Z0.a aVar = new Z0.a(wVar, this.f108602a);
        wVar.onSubscribe(aVar);
        aVar.run();
    }
}
