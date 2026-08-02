package ru.ozon.app.android.regulardraw.widgets.lotteryInformation.presentation;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdp.ui.compose.time.StableDateTime;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class LotteryTicketsPurchaseTimerKt$DateTimer$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ StableDateTime $date;
    final /* synthetic */ Function0<Unit> $onExpired;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LotteryTicketsPurchaseTimerKt$DateTimer$2(StableDateTime stableDateTime, Function0<Unit> function0, int i11) {
        super(2);
        this.$date = stableDateTime;
        this.$onExpired = function0;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        LotteryTicketsPurchaseTimerKt.DateTimer(this.$date, this.$onExpired, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
