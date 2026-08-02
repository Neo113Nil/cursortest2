package v0;

import S0.InterfaceC3967k;
import a1.C4912a;
import fd.InterfaceC6512o;
import kotlin.Unit;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: v0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C10172l extends AbstractC7737t implements InterfaceC6512o<InterfaceC10165e, Integer, InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C4912a f101550b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10172l(C4912a c4912a) {
        super(4);
        this.f101550b = c4912a;
    }

    @Override // fd.InterfaceC6512o
    public final Unit invoke(InterfaceC10165e interfaceC10165e, Integer num, InterfaceC3967k interfaceC3967k, Integer num2) {
        InterfaceC10165e interfaceC10165e2 = interfaceC10165e;
        num.intValue();
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        int intValue = num2.intValue();
        if ((intValue & 6) == 0) {
            intValue |= interfaceC3967k2.n(interfaceC10165e2) ? 4 : 2;
        }
        if ((intValue & 131) == 130 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            this.f101550b.invoke(interfaceC10165e2, interfaceC3967k2, Integer.valueOf(intValue & 14));
        }
        return Unit.f71690a;
    }
}
