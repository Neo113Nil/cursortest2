package m0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes.dex */
final class M0 extends AbstractC7737t implements Function1<S0.N, S0.M> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ D0<Object> f73557b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ D0<Object>.d<Object, Object> f73558c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    M0(D0<Object> d02, D0<Object>.d<Object, Object> dVar) {
        super(1);
        this.f73557b = d02;
        this.f73558c = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final S0.M invoke(S0.N n11) {
        D0<Object> d02 = this.f73557b;
        D0<Object>.d<Object, Object> dVar = this.f73558c;
        d02.c(dVar);
        return new L0(d02, dVar);
    }
}
