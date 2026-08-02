package wg0;

import S0.InterfaceC3967k;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.a0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.ozi.theme.OziTheme;

/* renamed from: wg0.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C10559f extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ g f104532b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10559f(g gVar) {
        super(2);
        this.f104532b = gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        long activeGraphicNegativePrimary;
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            if (this.f104532b.d()) {
                interfaceC3967k2.o(-136214081);
                activeGraphicNegativePrimary = OziTheme.INSTANCE.getColors(interfaceC3967k2, OziTheme.$stable).getActiveGraphicPositivePrimary();
                interfaceC3967k2.k();
            } else {
                interfaceC3967k2.o(-136116865);
                activeGraphicNegativePrimary = OziTheme.INSTANCE.getColors(interfaceC3967k2, OziTheme.$stable).getActiveGraphicNegativePrimary();
                interfaceC3967k2.k();
            }
            C5185h.a(androidx.compose.foundation.e.b(a0.n(androidx.compose.ui.e.f40358c0, 16), activeGraphicNegativePrimary, A0.h.e()), interfaceC3967k2, 0);
        }
        return Unit.f71690a;
    }
}
