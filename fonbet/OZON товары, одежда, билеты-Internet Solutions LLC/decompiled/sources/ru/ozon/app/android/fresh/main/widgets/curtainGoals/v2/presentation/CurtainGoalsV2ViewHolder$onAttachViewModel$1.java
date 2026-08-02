package ru.ozon.app.android.fresh.main.widgets.curtainGoals.v2.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.fresh.main.widgets.curtainGoals.v2.api.CurtainGoalsResponse;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class CurtainGoalsV2ViewHolder$onAttachViewModel$1 extends C7735q implements Function1<CurtainGoalsResponse, Unit> {
    CurtainGoalsV2ViewHolder$onAttachViewModel$1(Object obj) {
        super(1, obj, CurtainGoalsV2ViewHolder.class, "onCouponApplyingEvent", "onCouponApplyingEvent(Lru/ozon/app/android/fresh/main/widgets/curtainGoals/v2/api/CurtainGoalsResponse;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CurtainGoalsResponse curtainGoalsResponse) {
        invoke2(curtainGoalsResponse);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CurtainGoalsResponse p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((CurtainGoalsV2ViewHolder) this.receiver).onCouponApplyingEvent(p02);
    }
}
