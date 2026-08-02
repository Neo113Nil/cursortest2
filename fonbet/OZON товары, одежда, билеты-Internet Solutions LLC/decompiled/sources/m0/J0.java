package m0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class J0 extends AbstractC7737t implements Function1<S0.N, S0.M> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ D0<Object> f73544b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ D0<Object> f73545c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    J0(D0<Object> d02, D0<Object> d03) {
        super(1);
        this.f73544b = d02;
        this.f73545c = d03;
    }

    @Override // kotlin.jvm.functions.Function1
    public final S0.M invoke(S0.N n11) {
        D0<Object> d02 = this.f73544b;
        D0<Object> d03 = this.f73545c;
        d02.d(d03);
        return new I0(d02, d03);
    }
}
