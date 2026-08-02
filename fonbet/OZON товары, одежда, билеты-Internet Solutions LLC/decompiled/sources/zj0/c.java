package zj0;

import P0.p2;
import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class c extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f109315b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(String str) {
        super(2);
        this.f109315b = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            p2.b(this.f109315b, null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, interfaceC3967k2, 0, 0, 131070);
        }
        return Unit.f71690a;
    }
}
