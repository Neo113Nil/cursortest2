package m0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import m0.O;

/* loaded from: classes.dex */
final class S extends AbstractC7737t implements Function1<S0.N, S0.M> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ O f73602b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ O.a<Object, Object> f73603c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    S(O o11, O.a<Object, Object> aVar) {
        super(1);
        this.f73602b = o11;
        this.f73603c = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final S0.M invoke(S0.N n11) {
        O o11 = this.f73602b;
        O.a<?, ?> aVar = this.f73603c;
        o11.f(aVar);
        return new Q(o11, aVar);
    }
}
