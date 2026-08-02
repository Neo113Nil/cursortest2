package zc;

/* renamed from: zc.e1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C11033e1<T> extends AbstractC11019a<T, T> {
    public C11033e1(io.reactivex.p<T> pVar) {
        super(pVar);
    }

    @Override // io.reactivex.p
    protected final void subscribeActual(io.reactivex.w<? super T> wVar) {
        this.f108122a.subscribe(new Ic.e(wVar));
    }
}
