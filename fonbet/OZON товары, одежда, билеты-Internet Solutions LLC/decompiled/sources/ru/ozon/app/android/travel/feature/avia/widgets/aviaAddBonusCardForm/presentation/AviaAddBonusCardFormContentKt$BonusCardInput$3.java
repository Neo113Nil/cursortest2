package ru.ozon.app.android.travel.feature.avia.widgets.aviaAddBonusCardForm.presentation;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import WZ.l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.travel.molecules.input.v2.CommonInputV2VO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class AviaAddBonusCardFormContentKt$BonusCardInput$3 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ CommonInputV2VO.TextInputV2 $bonusCardNumber;
    final /* synthetic */ Function0<Unit> $onHideKeyboard;
    final /* synthetic */ Function1<String, Unit> $onValueChange;
    final /* synthetic */ l $tokenizedAnalytics;
    final /* synthetic */ String $value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AviaAddBonusCardFormContentKt$BonusCardInput$3(CommonInputV2VO.TextInputV2 textInputV2, String str, Function1<? super String, Unit> function1, Function0<Unit> function0, l lVar, int i11) {
        super(2);
        this.$bonusCardNumber = textInputV2;
        this.$value = str;
        this.$onValueChange = function1;
        this.$onHideKeyboard = function0;
        this.$tokenizedAnalytics = lVar;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        AviaAddBonusCardFormContentKt.BonusCardInput(this.$bonusCardNumber, this.$value, this.$onValueChange, this.$onHideKeyboard, this.$tokenizedAnalytics, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
