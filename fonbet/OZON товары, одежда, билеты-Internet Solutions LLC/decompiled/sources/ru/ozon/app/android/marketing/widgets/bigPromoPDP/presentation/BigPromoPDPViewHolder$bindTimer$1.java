package ru.ozon.app.android.marketing.widgets.bigPromoPDP.presentation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class BigPromoPDPViewHolder$bindTimer$1 extends C7735q implements Function1<Long, BigPromoPDPTickVO> {
    public static final BigPromoPDPViewHolder$bindTimer$1 INSTANCE = new BigPromoPDPViewHolder$bindTimer$1();

    BigPromoPDPViewHolder$bindTimer$1() {
        super(1, BigPromoPDPTickVO.class, "<init>", "<init>(J)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ BigPromoPDPTickVO invoke(Long l11) {
        return invoke(l11.longValue());
    }

    public final BigPromoPDPTickVO invoke(long j11) {
        return new BigPromoPDPTickVO(j11);
    }
}
