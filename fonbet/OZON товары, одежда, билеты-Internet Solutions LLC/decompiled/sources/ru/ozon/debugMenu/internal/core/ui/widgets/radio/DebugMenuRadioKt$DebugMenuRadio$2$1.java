package ru.ozon.debugMenu.internal.core.ui.widgets.radio;

import S0.InterfaceC3967k;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l0.H;
import q1.AbstractC8972b;
import ru.ozon.app.android.R;
import ru.ozon.debugMenu.internal.core.ui.utils.b;
import ru.ozon.debugMenu.internal.core.ui.widgets.icon.DebugMenuIconKt;
import y20.C10833a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ll0/H;", "", "invoke", "(Ll0/H;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes3.dex */
final class DebugMenuRadioKt$DebugMenuRadio$2$1 extends AbstractC7737t implements InterfaceC6511n<H, InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ long $iconColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DebugMenuRadioKt$DebugMenuRadio$2$1(long j11) {
        super(3);
        this.$iconColor = j11;
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ Unit invoke(H h11, InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(h11, interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(H AnimatedVisibility, InterfaceC3967k interfaceC3967k, int i11) {
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        e n11 = a0.n(b.a(e.f40358c0, DebugMenuRadioTestTags.Icon), 16);
        int i12 = C10833a.f105964b;
        interfaceC3967k.o(-1238798052);
        AbstractC8972b a11 = G1.e.a(R.drawable.ozon_debug_menu_ic_m_radio_dot_filled, interfaceC3967k, 0);
        interfaceC3967k.k();
        DebugMenuIconKt.m1619DebugMenuIconFNF3uiM(a11, n11, this.$iconColor, interfaceC3967k, 0, 0);
    }
}
