package ru.ozon.app.android.travel.feature.b2b.widgets.travelPersonalAccountReplenishment.v3.presentation;

import Bl0.C2652m;
import Q1.K;
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
/* loaded from: classes3.dex */
final class TravelPersonalAccountReplenishmentV3ContentKt$AmountInput$4 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ CommonInputV2VO.TextInputV2 $input;
    final /* synthetic */ Function0<Unit> $onHideKeyboard;
    final /* synthetic */ Function1<K, Unit> $onValueChange;
    final /* synthetic */ K $textFieldValue;
    final /* synthetic */ l $tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TravelPersonalAccountReplenishmentV3ContentKt$AmountInput$4(CommonInputV2VO.TextInputV2 textInputV2, K k11, Function1<? super K, Unit> function1, Function0<Unit> function0, l lVar, int i11) {
        super(2);
        this.$input = textInputV2;
        this.$textFieldValue = k11;
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
        TravelPersonalAccountReplenishmentV3ContentKt.AmountInput(this.$input, this.$textFieldValue, this.$onValueChange, this.$onHideKeyboard, this.$tokenizedAnalytics, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
