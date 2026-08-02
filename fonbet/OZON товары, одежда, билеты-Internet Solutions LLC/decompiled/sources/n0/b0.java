package n0;

import kd.InterfaceC7663b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class b0 extends AbstractC7737t implements Function1<I1.D, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ float f76148b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC7663b<Float> f76149c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b0(InterfaceC7663b interfaceC7663b, float f7) {
        super(1);
        this.f76148b = f7;
        this.f76149c = interfaceC7663b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(I1.D d11) {
        Float valueOf = Float.valueOf(this.f76148b);
        InterfaceC7663b<Float> interfaceC7663b = this.f76149c;
        I1.z.p(d11, new I1.h(interfaceC7663b, ((Number) kotlin.ranges.h.i(valueOf, interfaceC7663b)).floatValue()));
        return Unit.f71690a;
    }
}
