package ru.ozon.app.android.regulardraw.widgets.daily.presentation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class DailyViewHolder$bindTimer$1 extends C7735q implements Function1<Long, DailyTickVO> {
    public static final DailyViewHolder$bindTimer$1 INSTANCE = new DailyViewHolder$bindTimer$1();

    DailyViewHolder$bindTimer$1() {
        super(1, DailyTickVO.class, "<init>", "<init>(J)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ DailyTickVO invoke(Long l11) {
        return invoke(l11.longValue());
    }

    public final DailyTickVO invoke(long j11) {
        return new DailyTickVO(j11);
    }
}
