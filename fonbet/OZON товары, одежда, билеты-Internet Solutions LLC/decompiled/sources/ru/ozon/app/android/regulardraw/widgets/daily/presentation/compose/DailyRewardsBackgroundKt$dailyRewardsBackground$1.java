package ru.ozon.app.android.regulardraw.widgets.daily.presentation.compose;

import G1.b;
import S0.InterfaceC3967k;
import androidx.compose.ui.draw.c;
import androidx.compose.ui.e;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import ru.ozon.app.android.regulardraw.R$color;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/e;", "invoke", "(Landroidx/compose/ui/e;LS0/k;I)Landroidx/compose/ui/e;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes13.dex */
final class DailyRewardsBackgroundKt$dailyRewardsBackground$1 extends AbstractC7737t implements InterfaceC6511n<e, InterfaceC3967k, Integer, e> {
    public static final DailyRewardsBackgroundKt$dailyRewardsBackground$1 INSTANCE = new DailyRewardsBackgroundKt$dailyRewardsBackground$1();

    DailyRewardsBackgroundKt$dailyRewardsBackground$1() {
        super(3);
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ e invoke(e eVar, InterfaceC3967k interfaceC3967k, Integer num) {
        return invoke(eVar, interfaceC3967k, num.intValue());
    }

    public final e invoke(e composed, InterfaceC3967k interfaceC3967k, int i11) {
        long j11;
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        interfaceC3967k.o(1092377177);
        long a11 = b.a(interfaceC3967k, R$color.daily_rewards_dialog_bg_color);
        long a12 = b.a(interfaceC3967k, R$color.daily_rewards_bg_border_gradient_start);
        j11 = C7807Z.f72258l;
        long a13 = b.a(interfaceC3967k, R$color.daily_rewards_light_shadow_color);
        long a14 = b.a(interfaceC3967k, R$color.daily_rewards_dark_shadow_color);
        interfaceC3967k.o(1178523512);
        boolean s11 = interfaceC3967k.s(a12) | interfaceC3967k.s(a11) | interfaceC3967k.s(a13) | interfaceC3967k.s(a14);
        Object C11 = interfaceC3967k.C();
        if (s11 || C11 == InterfaceC3967k.a.a()) {
            C11 = new DailyRewardsBackgroundKt$dailyRewardsBackground$1$1$1(a12, j11, a11, a13, a14);
            interfaceC3967k.x(C11);
        }
        interfaceC3967k.k();
        e c11 = c.c(composed, (Function1) C11);
        interfaceC3967k.k();
        return c11;
    }
}
