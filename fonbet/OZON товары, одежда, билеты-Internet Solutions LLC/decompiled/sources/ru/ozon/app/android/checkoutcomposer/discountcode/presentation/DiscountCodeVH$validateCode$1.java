package ru.ozon.app.android.checkoutcomposer.discountcode.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.checkoutcomposer.discountcode.data.ValidateCodeResponse;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
/* synthetic */ class DiscountCodeVH$validateCode$1 extends C7735q implements Function1<ActionV2Response<ValidateCodeResponse>, Unit> {
    DiscountCodeVH$validateCode$1(Object obj) {
        super(1, obj, DiscountCodeVH.class, "processValidateResponse", "processValidateResponse(Lru/ozon/app/android/action/v2/models/ActionV2Response;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ActionV2Response<ValidateCodeResponse> actionV2Response) {
        invoke2(actionV2Response);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ActionV2Response<ValidateCodeResponse> p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((DiscountCodeVH) this.receiver).processValidateResponse(p02);
    }
}
