package ru.ozon.debugMenu.internal.core.ui.widgets.navBar;

import K1.T;
import S0.InterfaceC3967k;
import V1.h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.debugMenu.internal.core.ui.widgets.text.TextKt;
import y20.C10833a;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes3.dex */
final class DebugMenuNavBarKt$DebugMenuNavBar$2$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ String $title;
    final /* synthetic */ int $titleLinesLimit;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DebugMenuNavBarKt$DebugMenuNavBar$2$2(String str, int i11) {
        super(2);
        this.$title = str;
        this.$titleLinesLimit = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        if ((i11 & 3) == 2 && interfaceC3967k.b()) {
            interfaceC3967k.j();
            return;
        }
        T e11 = C10833a.b().e();
        TextKt.m1643Text4IGK_g(this.$title, null, C10833a.a(interfaceC3967k).l(), 0L, null, null, null, 0L, null, h.a(3), 0L, 2, false, this.$titleLinesLimit, 0, null, e11, interfaceC3967k, 0, 1572912, 54778);
    }
}
