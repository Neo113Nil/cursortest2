package y20;

import S0.InterfaceC3967k;
import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class d extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C4912a f105968b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(C4912a c4912a) {
        super(2);
        this.f105968b = c4912a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            f.d(C10833a.b().b(), a1.c.c(-1231259542, new c(this.f105968b), interfaceC3967k2), interfaceC3967k2, 54);
        }
        return Unit.f71690a;
    }
}
