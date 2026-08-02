package ru.ozon.app.android.travel.feature.b2b.widgets.travelPersonalAccountReplenishment.v3.presentation;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import WZ.l;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import l20.d;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class TravelPersonalAccountReplenishmentV3ContentKt$InputVariants$3 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;
    final /* synthetic */ String $currentAmount;
    final /* synthetic */ Function1<String, Unit> $onAmountSelected;
    final /* synthetic */ l $tokenizedAnalytics;
    final /* synthetic */ List<TagButtonDTO> $variants;
    final /* synthetic */ d $widgetInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TravelPersonalAccountReplenishmentV3ContentKt$InputVariants$3(List<TagButtonDTO> list, String str, Function1<? super String, Unit> function1, Function1<? super AtomAction, Unit> function12, l lVar, d dVar, int i11) {
        super(2);
        this.$variants = list;
        this.$currentAmount = str;
        this.$onAmountSelected = function1;
        this.$actionHandler = function12;
        this.$tokenizedAnalytics = lVar;
        this.$widgetInfo = dVar;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        TravelPersonalAccountReplenishmentV3ContentKt.InputVariants(this.$variants, this.$currentAmount, this.$onAmountSelected, this.$actionHandler, this.$tokenizedAnalytics, this.$widgetInfo, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
