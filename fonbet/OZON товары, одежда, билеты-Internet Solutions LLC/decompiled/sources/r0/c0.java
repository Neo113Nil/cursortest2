package r0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class c0 extends AbstractC7737t implements Function1<Long, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Z f82555b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function1<Float, Unit> f82556c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    c0(Z z11, Function1<? super Float, Unit> function1) {
        super(1);
        this.f82555b = z11;
        this.f82556c = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Long l11) {
        l11.longValue();
        Z z11 = this.f82555b;
        float h11 = z11.h();
        z11.i(0.0f);
        this.f82556c.invoke(Float.valueOf(h11));
        return Unit.f71690a;
    }
}
