package ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.presentation.model.HammersV3BadgeTickVO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class HammersV3GradientHeaderViewHolder$bindBadge$2 extends C7735q implements Function1<HammersV3BadgeTickVO, Unit> {
    HammersV3GradientHeaderViewHolder$bindBadge$2(Object obj) {
        super(1, obj, HammersV3GradientHeaderViewHolder.class, "onTick", "onTick(Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/model/HammersV3BadgeTickVO;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(HammersV3BadgeTickVO hammersV3BadgeTickVO) {
        invoke2(hammersV3BadgeTickVO);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HammersV3BadgeTickVO p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((HammersV3GradientHeaderViewHolder) this.receiver).onTick(p02);
    }
}
