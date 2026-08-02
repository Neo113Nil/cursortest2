package d2;

import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: d2.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C6049g extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0 f61048b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6049g(InterfaceC3978p0 interfaceC3978p0) {
        super(2);
        this.f61048b = interfaceC3978p0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            C6053k.b(I1.o.c(androidx.compose.ui.e.f40358c0, false, C6047e.f61046b), a1.c.c(-533674951, new C6048f(this.f61048b), interfaceC3967k2), interfaceC3967k2, 48);
        }
        return Unit.f71690a;
    }
}
