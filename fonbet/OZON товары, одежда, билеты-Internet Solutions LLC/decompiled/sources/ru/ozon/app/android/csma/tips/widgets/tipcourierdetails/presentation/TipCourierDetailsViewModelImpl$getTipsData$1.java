package ru.ozon.app.android.csma.tips.widgets.tipcourierdetails.presentation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.csma.tips.widgets.tipcourierdetails.presentation.button.TipCourierDetailInitState;
import ru.ozon.app.android.csma.tips.widgets.tipcourierdetails.presentation.tips.TipCourierDetailsMapper;
import ru.ozon.app.android.csma.tips.widgets.tipcourierdetails.presentation.tips.TipCourierDetailsTipsVI;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
/* synthetic */ class TipCourierDetailsViewModelImpl$getTipsData$1 extends C7735q implements Function1<TipCourierDetailInitState, TipCourierDetailsTipsVI> {
    TipCourierDetailsViewModelImpl$getTipsData$1(Object obj) {
        super(1, obj, TipCourierDetailsMapper.class, "stateToTips", "stateToTips(Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/button/TipCourierDetailInitState;)Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/tips/TipCourierDetailsTipsVI;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final TipCourierDetailsTipsVI invoke(TipCourierDetailInitState p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return ((TipCourierDetailsMapper) this.receiver).stateToTips(p02);
    }
}
