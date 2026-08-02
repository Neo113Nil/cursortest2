package ru.ozon.android.messenger.blocks.coupon;

import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class a implements Function2<CouponDTO, ru.ozon.android.messenger.framework.presentation.models.c, List<? extends b>> {
    @Override // kotlin.jvm.functions.Function2
    public final List<? extends b> invoke(CouponDTO couponDTO, ru.ozon.android.messenger.framework.presentation.models.c cVar) {
        CouponDTO state = couponDTO;
        ru.ozon.android.messenger.framework.presentation.models.c blockId = cVar;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        LeftPartDTO leftPart = state.getLeftPart();
        e eVar = new e(leftPart.getTitle(), leftPart.getSubtitle(), leftPart.getAction(), leftPart.getBackgroundColor(), leftPart.getBackgroundImage(), leftPart.getTrackingInfo());
        RightPartDTO rightPart = state.getRightPart();
        f fVar = new f(rightPart.getTitle(), rightPart.getAction(), rightPart.getBackgroundColor(), rightPart.getTrackingInfo());
        ImageDTO image = state.getImage();
        return C7714v.a0(new b(blockId, eVar, fVar, image != null ? new d(image.getUrl(), image.getWidth(), image.getHeight()) : null, state.getLexemes(), state.getTrackingInfo()));
    }
}
