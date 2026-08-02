package zc;

/* renamed from: zc.h0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C11041h0<T> extends io.reactivex.p<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.u<T> f108266a;

    public C11041h0(io.reactivex.u<T> uVar) {
        this.f108266a = uVar;
    }

    @Override // io.reactivex.p
    protected final void subscribeActual(io.reactivex.w<? super T> wVar) {
        this.f108266a.subscribe(wVar);
    }
}
