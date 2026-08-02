package ej0;

import P0.D;
import S0.InterfaceC3967k;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import u0.E;

/* loaded from: classes3.dex */
final class b extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f62372b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(Function0<Unit> function0) {
        super(2);
        this.f62372b = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else if (this.f62372b != null) {
            interfaceC3967k2.o(-1149081237);
            D.a(this.f62372b, null, false, null, C6379a.f62366a, interfaceC3967k2, 196608, 30);
            interfaceC3967k2.k();
        } else {
            interfaceC3967k2.o(-1148745476);
            E.a(interfaceC3967k2, a0.r(e.f40358c0, 8));
            interfaceC3967k2.k();
        }
        return Unit.f71690a;
    }
}
