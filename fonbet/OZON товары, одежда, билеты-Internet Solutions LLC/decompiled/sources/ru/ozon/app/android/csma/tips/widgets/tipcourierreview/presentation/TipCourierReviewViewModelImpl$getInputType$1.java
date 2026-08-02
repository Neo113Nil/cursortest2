package ru.ozon.app.android.csma.tips.widgets.tipcourierreview.presentation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.csma.tips.widgets.tipcourierreview.data.TipCourierReviewInitState;
import ru.ozon.app.android.csma.tips.widgets.tipcourierreview.presentation.TipCourierReviewVO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
/* synthetic */ class TipCourierReviewViewModelImpl$getInputType$1 extends C7735q implements Function1<TipCourierReviewInitState, TipCourierReviewVO.CourierTipInput> {
    TipCourierReviewViewModelImpl$getInputType$1(Object obj) {
        super(1, obj, TipCourierReviewMapper.class, "stateToTipInput", "stateToTipInput(Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/data/TipCourierReviewInitState;)Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/presentation/TipCourierReviewVO$CourierTipInput;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final TipCourierReviewVO.CourierTipInput invoke(TipCourierReviewInitState p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return ((TipCourierReviewMapper) this.receiver).stateToTipInput(p02);
    }
}
