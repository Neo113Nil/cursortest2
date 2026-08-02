package ff0;

import S0.InterfaceC3967k;
import df0.C6195b;
import ed.C6345a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: ff0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C6555b extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C6195b f63395b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6555b(C6195b c6195b) {
        super(2);
        this.f63395b = c6195b;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            interfaceC3967k2.B(740407924);
            Object C11 = interfaceC3967k2.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = (Ze0.a) C6345a.b(this.f63395b.a()).getConstructor(new Class[0]).newInstance(new Object[0]);
                interfaceC3967k2.x(C11);
            }
            interfaceC3967k2.K();
            ((Ze0.a) C11).a(interfaceC3967k2);
        }
        return Unit.f71690a;
    }
}
