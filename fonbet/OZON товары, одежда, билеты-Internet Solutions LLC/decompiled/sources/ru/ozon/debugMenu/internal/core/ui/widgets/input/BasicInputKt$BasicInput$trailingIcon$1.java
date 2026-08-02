package ru.ozon.debugMenu.internal.core.ui.widgets.input;

import Q1.K;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import q1.AbstractC8972b;
import ru.ozon.app.android.R;
import ru.ozon.debugMenu.internal.core.ui.utils.b;
import ru.ozon.debugMenu.internal.core.ui.widgets.button.DebugMenuIconButtonKt;
import ru.ozon.debugMenu.internal.core.ui.widgets.button.presets.style.DebugMenuIconButtonStyle;
import y20.C10833a;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes3.dex */
final class BasicInputKt$BasicInput$trailingIcon$1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ Function0<Unit> $onClearClick;
    final /* synthetic */ Function1<K, Unit> $onValueChange;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    BasicInputKt$BasicInput$trailingIcon$1(Function1<? super K, Unit> function1, Function0<Unit> function0) {
        super(2);
        this.$onValueChange = function1;
        this.$onClearClick = function0;
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
        e a11 = b.a(e.f40358c0, DebugMenuInputTestTags.ClearButton);
        int i12 = C10833a.f105964b;
        interfaceC3967k.o(-1745112686);
        AbstractC8972b a12 = G1.e.a(R.drawable.ozon_debug_menu_ic_m_cross_filled, interfaceC3967k, 0);
        interfaceC3967k.k();
        DebugMenuIconButtonStyle.NeutralTransparent neutralTransparent = DebugMenuIconButtonStyle.NeutralTransparent.INSTANCE;
        interfaceC3967k.o(-1098668770);
        boolean n11 = interfaceC3967k.n(this.$onValueChange) | interfaceC3967k.n(this.$onClearClick);
        Function1<K, Unit> function1 = this.$onValueChange;
        Function0<Unit> function0 = this.$onClearClick;
        Object C11 = interfaceC3967k.C();
        if (n11 || C11 == InterfaceC3967k.a.a()) {
            C11 = new BasicInputKt$BasicInput$trailingIcon$1$1$1(function1, function0);
            interfaceC3967k.x(C11);
        }
        interfaceC3967k.k();
        DebugMenuIconButtonKt.DebugMenuIconButton(a12, (Function0) C11, a11, false, null, neutralTransparent, null, null, interfaceC3967k, 196608, 216);
    }
}
