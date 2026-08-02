package ru.ozon.app.android.regulardraw.widgets.lotteryResult.presentation;

import G1.b;
import J0.u3;
import S0.InterfaceC3967k;
import V1.h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.regulardraw.R$color;
import ru.ozon.app.android.regulardraw.ui.styles.RegularDrawTypographyKt;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes13.dex */
final class LotteryValuesKt$SingleValue$1$1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ String $value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LotteryValuesKt$SingleValue$1$1(String str) {
        super(2);
        this.$value = str;
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
        u3.b(this.$value, null, b.a(interfaceC3967k, R$color.lottery_result_values_text_color), 0L, null, 0L, h.a(3), 0L, 0, false, 0, 0, null, RegularDrawTypographyKt.getText_12_14_W500(), interfaceC3967k, 0, 0, 65018);
    }
}
