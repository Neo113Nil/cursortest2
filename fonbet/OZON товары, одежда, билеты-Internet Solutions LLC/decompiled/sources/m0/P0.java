package m0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes.dex */
final class P0 extends AbstractC7737t implements Function1<S0.N, S0.M> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ D0<Object> f73597b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    P0(D0<Object> d02) {
        super(1);
        this.f73597b = d02;
    }

    @Override // kotlin.jvm.functions.Function1
    public final S0.M invoke(S0.N n11) {
        return new O0(this.f73597b);
    }
}
