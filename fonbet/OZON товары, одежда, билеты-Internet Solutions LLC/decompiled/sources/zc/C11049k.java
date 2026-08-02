package zc;

import Hc.AbstractC3137a;
import java.util.concurrent.atomic.AtomicInteger;
import nc.InterfaceC8487b;

/* renamed from: zc.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11049k<T> extends io.reactivex.p<T> {

    /* renamed from: a, reason: collision with root package name */
    final AbstractC3137a<? extends T> f108333a;

    /* renamed from: c, reason: collision with root package name */
    final qc.g<? super InterfaceC8487b> f108335c;

    /* renamed from: b, reason: collision with root package name */
    final int f108334b = 1;

    /* renamed from: d, reason: collision with root package name */
    final AtomicInteger f108336d = new AtomicInteger();

    public C11049k(AbstractC3137a abstractC3137a, qc.g gVar) {
        this.f108333a = abstractC3137a;
        this.f108335c = gVar;
    }

    @Override // io.reactivex.p
    public final void subscribeActual(io.reactivex.w<? super T> wVar) {
        AbstractC3137a<? extends T> abstractC3137a = this.f108333a;
        abstractC3137a.subscribe((io.reactivex.w<? super Object>) wVar);
        if (this.f108336d.incrementAndGet() == this.f108334b) {
            abstractC3137a.c(this.f108335c);
        }
    }
}
