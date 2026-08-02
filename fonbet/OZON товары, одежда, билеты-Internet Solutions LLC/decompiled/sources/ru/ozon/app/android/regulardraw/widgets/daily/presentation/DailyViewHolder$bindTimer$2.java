package ru.ozon.app.android.regulardraw.widgets.daily.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class DailyViewHolder$bindTimer$2 extends C7735q implements Function1<DailyTickVO, Unit> {
    DailyViewHolder$bindTimer$2(Object obj) {
        super(1, obj, DailyViewHolder.class, "onTick", "onTick(Lru/ozon/app/android/regulardraw/widgets/daily/presentation/DailyTickVO;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(DailyTickVO dailyTickVO) {
        invoke2(dailyTickVO);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(DailyTickVO p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((DailyViewHolder) this.receiver).onTick(p02);
    }
}
