package ru.ozon.app.android.marketing.widgets.bigPromoNavbar.presentation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
/* synthetic */ class BigPromoNavbarViewHolder$timerTicker$1 extends C7735q implements Function1<Long, BigPromoTickVO> {
    public static final BigPromoNavbarViewHolder$timerTicker$1 INSTANCE = new BigPromoNavbarViewHolder$timerTicker$1();

    BigPromoNavbarViewHolder$timerTicker$1() {
        super(1, BigPromoTickVO.class, "<init>", "<init>(J)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ BigPromoTickVO invoke(Long l11) {
        return invoke(l11.longValue());
    }

    public final BigPromoTickVO invoke(long j11) {
        return new BigPromoTickVO(j11);
    }
}
