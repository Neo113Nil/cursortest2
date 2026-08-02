package ru.ozon.app.android.regulardraw.widgets.lotteryInformation.presentation;

import Tg.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.regulardraw.widgets.lotteryInformation.presentation.LotteryInformationVI;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class LotteryTicketsPurchaseTimerKt$TicketsPurchaseTimer$3$1$1$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ Function1<b, Unit> $actionHandler;
    final /* synthetic */ LotteryInformationVI.ActiveMainInfo.TicketsPurchaseTimerData $data;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    LotteryTicketsPurchaseTimerKt$TicketsPurchaseTimer$3$1$1$1(LotteryInformationVI.ActiveMainInfo.TicketsPurchaseTimerData ticketsPurchaseTimerData, Function1<? super b, Unit> function1) {
        super(0);
        this.$data = ticketsPurchaseTimerData;
        this.$actionHandler = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        b action = this.$data.getAction();
        if (action != null) {
            this.$actionHandler.invoke(action);
        }
    }
}
