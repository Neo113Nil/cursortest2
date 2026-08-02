package ru.ozon.app.android.regulardraw.widgets.lotteryInformation.presentation;

import S0.InterfaceC3967k;
import Tg.b;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import l1.C7807Z;
import ru.ozon.app.android.regulardraw.utils.PreviewKt;
import ru.ozon.app.android.regulardraw.widgets.lotteryInformation.presentation.LotteryInformationVI;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes13.dex */
final class LotteryActiveMainInfoKt$LotteryActiveMainInfo$4$1$1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ Function1<b, Unit> $actionHandler;
    final /* synthetic */ LotteryInformationVI.ActiveMainInfo $mainInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    LotteryActiveMainInfoKt$LotteryActiveMainInfo$4$1$1(LotteryInformationVI.ActiveMainInfo activeMainInfo, Function1<? super b, Unit> function1) {
        super(2);
        this.$mainInfo = activeMainInfo;
        this.$actionHandler = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        long j11;
        if ((i11 & 3) == 2 && interfaceC3967k.b()) {
            interfaceC3967k.j();
            return;
        }
        e.a aVar = e.f40358c0;
        int i12 = C7807Z.f72260n;
        j11 = C7807Z.f72256j;
        LotteryActiveMainInfoKt.LeftInfoBlock(this.$mainInfo.getItems(), this.$mainInfo.getBadge(), this.$actionHandler, PreviewKt.m942previewBackgroundRPmYEkk(aVar, j11, interfaceC3967k, 54), interfaceC3967k, 0, 0);
    }
}
