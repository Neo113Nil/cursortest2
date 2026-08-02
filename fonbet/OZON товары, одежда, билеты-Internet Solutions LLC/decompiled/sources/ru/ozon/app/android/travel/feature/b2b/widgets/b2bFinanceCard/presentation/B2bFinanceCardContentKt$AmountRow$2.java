package ru.ozon.app.android.travel.feature.b2b.widgets.b2bFinanceCard.presentation;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class B2bFinanceCardContentKt$AmountRow$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ TextDTO $additionalAmount;
    final /* synthetic */ TextDTO $amount;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    B2bFinanceCardContentKt$AmountRow$2(TextDTO textDTO, TextDTO textDTO2, int i11) {
        super(2);
        this.$amount = textDTO;
        this.$additionalAmount = textDTO2;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        B2bFinanceCardContentKt.AmountRow(this.$amount, this.$additionalAmount, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
