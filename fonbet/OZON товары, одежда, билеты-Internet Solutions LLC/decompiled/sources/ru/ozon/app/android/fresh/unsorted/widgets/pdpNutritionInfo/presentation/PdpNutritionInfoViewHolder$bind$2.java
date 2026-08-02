package ru.ozon.app.android.fresh.unsorted.widgets.pdpNutritionInfo.presentation;

import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.fresh.unsorted.widgets.pdpNutritionInfo.presentation.PdpNutritionInfoVO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class PdpNutritionInfoViewHolder$bind$2 extends C7735q implements Function2<PdpNutritionInfoVO.PdpNutritionInfoState, t, Unit> {
    PdpNutritionInfoViewHolder$bind$2(Object obj) {
        super(2, obj, PdpNutritionInfoViewHolder.class, "onSauceClick", "onSauceClick(Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/presentation/PdpNutritionInfoVO$PdpNutritionInfoState;Lru/ozon/composer/analytics/tokenized/TokenizedEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(PdpNutritionInfoVO.PdpNutritionInfoState pdpNutritionInfoState, t tVar) {
        invoke2(pdpNutritionInfoState, tVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PdpNutritionInfoVO.PdpNutritionInfoState p02, t tVar) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((PdpNutritionInfoViewHolder) this.receiver).onSauceClick(p02, tVar);
    }
}
