package wc;

import tc.InterfaceCallableC9806h;

/* loaded from: classes9.dex */
public final class w<T> extends io.reactivex.h<T> implements InterfaceCallableC9806h<T> {

    /* renamed from: c, reason: collision with root package name */
    private final T f104069c;

    public w(T t2) {
        this.f104069c = t2;
    }

    @Override // java.util.concurrent.Callable
    public final T call() {
        return this.f104069c;
    }

    @Override // io.reactivex.h
    protected final void j(io.reactivex.j jVar) {
        jVar.d(new Fc.e(jVar, this.f104069c));
    }
}
