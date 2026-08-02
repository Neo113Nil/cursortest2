package xc;

import tc.InterfaceCallableC9806h;

/* loaded from: classes9.dex */
public final class e extends io.reactivex.k<Object> implements InterfaceCallableC9806h<Object> {

    /* renamed from: a, reason: collision with root package name */
    public static final e f105275a = new e();

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return null;
    }

    @Override // io.reactivex.k
    protected final void d(io.reactivex.m<? super Object> mVar) {
        mVar.onSubscribe(rc.e.INSTANCE);
        mVar.onComplete();
    }
}
