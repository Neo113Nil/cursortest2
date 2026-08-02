package ru.ozon.app.android.travel.feature.b2b.widgets.travelPersonalAccountReplenishment.v3.presentation;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.atoms.data.disclaimer.DisclaimerDTO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class TravelPersonalAccountReplenishmentV3ContentKt$Disclaimer$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ DisclaimerDTO $disclaimer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TravelPersonalAccountReplenishmentV3ContentKt$Disclaimer$2(DisclaimerDTO disclaimerDTO, int i11) {
        super(2);
        this.$disclaimer = disclaimerDTO;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        TravelPersonalAccountReplenishmentV3ContentKt.Disclaimer(this.$disclaimer, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
