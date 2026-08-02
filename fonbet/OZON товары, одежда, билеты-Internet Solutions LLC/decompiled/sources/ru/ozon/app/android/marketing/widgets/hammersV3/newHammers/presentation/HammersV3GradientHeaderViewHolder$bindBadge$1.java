package ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.presentation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.presentation.model.HammersV3BadgeTickVO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class HammersV3GradientHeaderViewHolder$bindBadge$1 extends C7735q implements Function1<Long, HammersV3BadgeTickVO> {
    public static final HammersV3GradientHeaderViewHolder$bindBadge$1 INSTANCE = new HammersV3GradientHeaderViewHolder$bindBadge$1();

    HammersV3GradientHeaderViewHolder$bindBadge$1() {
        super(1, HammersV3BadgeTickVO.class, "<init>", "<init>(J)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ HammersV3BadgeTickVO invoke(Long l11) {
        return invoke(l11.longValue());
    }

    public final HammersV3BadgeTickVO invoke(long j11) {
        return new HammersV3BadgeTickVO(j11);
    }
}
