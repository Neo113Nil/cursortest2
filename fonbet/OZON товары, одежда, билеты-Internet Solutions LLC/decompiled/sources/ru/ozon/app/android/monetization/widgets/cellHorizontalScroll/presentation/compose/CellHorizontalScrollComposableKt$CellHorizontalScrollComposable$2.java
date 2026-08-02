package ru.ozon.app.android.monetization.widgets.cellHorizontalScroll.presentation.compose;

import S0.InterfaceC3967k;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.T;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.Q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import l1.y0;
import ru.ozon.app.android.monetization.widgets.cellHorizontalScroll.presentation.multiCell.CellHorizontalScrollVI;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.core.repository.UniTheme;
import u0.C9915y;
import v0.C10164d;
import v0.I;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
final class CellHorizontalScrollComposableKt$CellHorizontalScrollComposable$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;
    final /* synthetic */ CellHorizontalScrollVI $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CellHorizontalScrollComposableKt$CellHorizontalScrollComposable$2(CellHorizontalScrollVI cellHorizontalScrollVI, Function1<? super AtomAction, Unit> function1) {
        super(2);
        this.$state = cellHorizontalScrollVI;
        this.$actionHandler = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        e b11;
        if ((i11 & 3) == 2 && interfaceC3967k.b()) {
            interfaceC3967k.j();
            return;
        }
        I scrollState = this.$state.getScrollState();
        e.a aVar = e.f40358c0;
        TestInfo testInfo = this.$state.getTestInfo();
        String automatizationId = testInfo != null ? testInfo.getAutomatizationId() : null;
        if (automatizationId == null) {
            automatizationId = "";
        }
        b11 = androidx.compose.foundation.e.b(Q1.a(aVar, automatizationId), UniTheme.INSTANCE.getColors(interfaceC3967k, UniTheme.$stable).getLayerFloor1(), y0.a());
        C5179b.i n11 = C5179b.n(8);
        C9915y a11 = T.a(16, 2, 0.0f);
        interfaceC3967k.o(165921029);
        boolean F11 = interfaceC3967k.F(this.$state) | interfaceC3967k.n(this.$actionHandler);
        CellHorizontalScrollVI cellHorizontalScrollVI = this.$state;
        Function1<AtomAction, Unit> function1 = this.$actionHandler;
        Object C11 = interfaceC3967k.C();
        if (F11 || C11 == InterfaceC3967k.a.a()) {
            C11 = new CellHorizontalScrollComposableKt$CellHorizontalScrollComposable$2$1$1(cellHorizontalScrollVI, function1);
            interfaceC3967k.x(C11);
        }
        interfaceC3967k.k();
        C10164d.b(b11, scrollState, a11, n11, null, null, false, (Function1) C11, interfaceC3967k, 24960, 232);
    }
}
