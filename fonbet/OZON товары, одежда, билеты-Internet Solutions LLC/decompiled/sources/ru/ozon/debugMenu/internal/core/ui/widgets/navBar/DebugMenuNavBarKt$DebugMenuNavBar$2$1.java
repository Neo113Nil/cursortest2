package ru.ozon.debugMenu.internal.core.ui.widgets.navBar;

import S0.InterfaceC3967k;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import q1.AbstractC8972b;
import ru.ozon.app.android.R;
import ru.ozon.debugMenu.internal.core.ui.widgets.button.DebugMenuIconButtonKt;
import ru.ozon.debugMenu.internal.core.ui.widgets.button.presets.size.DebugMenuIconButtonSize;
import ru.ozon.debugMenu.internal.core.ui.widgets.button.presets.style.DebugMenuIconButtonStyle;
import t0.q;
import u0.E;
import y20.C10833a;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes3.dex */
final class DebugMenuNavBarKt$DebugMenuNavBar$2$1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ boolean $backButtonEnabled;
    final /* synthetic */ q $backButtonInteractionSource;
    final /* synthetic */ e $modifier;
    final /* synthetic */ Function0<Unit> $onBackButtonClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DebugMenuNavBarKt$DebugMenuNavBar$2$1(Function0<Unit> function0, e eVar, boolean z11, q qVar) {
        super(2);
        this.$onBackButtonClick = function0;
        this.$modifier = eVar;
        this.$backButtonEnabled = z11;
        this.$backButtonInteractionSource = qVar;
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
        if (this.$onBackButtonClick == null) {
            interfaceC3967k.o(-1719823850);
            E.a(interfaceC3967k, a0.r(e.f40358c0, 8));
            interfaceC3967k.k();
            return;
        }
        interfaceC3967k.o(-1720360460);
        int i12 = C10833a.f105964b;
        interfaceC3967k.o(1324267204);
        AbstractC8972b a11 = G1.e.a(R.drawable.ozon_debug_menu_ic_m_disclosure_back_filled, interfaceC3967k, 0);
        interfaceC3967k.k();
        DebugMenuIconButtonKt.DebugMenuIconButton(a11, this.$onBackButtonClick, T.j(this.$modifier, 4, 0.0f, 0.0f, 0.0f, 14), this.$backButtonEnabled, null, DebugMenuIconButtonStyle.NeutralTransparent.INSTANCE, DebugMenuIconButtonSize.Size500, this.$backButtonInteractionSource, interfaceC3967k, 1769472, 16);
        interfaceC3967k.k();
    }
}
