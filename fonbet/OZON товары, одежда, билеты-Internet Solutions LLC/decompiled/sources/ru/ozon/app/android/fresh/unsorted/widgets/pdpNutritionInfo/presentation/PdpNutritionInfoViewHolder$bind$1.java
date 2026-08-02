package ru.ozon.app.android.fresh.unsorted.widgets.pdpNutritionInfo.presentation;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.fresh.unsorted.widgets.pdpNutritionInfo.presentation.PdpNutritionInfoVO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class PdpNutritionInfoViewHolder$bind$1 extends C7735q implements Function2<PdpNutritionInfoVO.PdpNutritionInfoState, Map<String, ? extends TokenizedTrackingInfo>, Unit> {
    PdpNutritionInfoViewHolder$bind$1(Object obj) {
        super(2, obj, PdpNutritionInfoViewHolder.class, "onSwitchClicked", "onSwitchClicked(Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/presentation/PdpNutritionInfoVO$PdpNutritionInfoState;Ljava/util/Map;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(PdpNutritionInfoVO.PdpNutritionInfoState pdpNutritionInfoState, Map<String, ? extends TokenizedTrackingInfo> map) {
        invoke2(pdpNutritionInfoState, (Map<String, TokenizedTrackingInfo>) map);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PdpNutritionInfoVO.PdpNutritionInfoState p02, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((PdpNutritionInfoViewHolder) this.receiver).onSwitchClicked(p02, map);
    }
}
