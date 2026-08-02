package ru.ozon.app.android.fresh.unsorted.widgets.courierTips.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.fresh.unsorted.widgets.courierTips.presentation.CourierTipsVO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "variant", "Lru/ozon/app/android/fresh/unsorted/widgets/courierTips/presentation/CourierTipsVO$CourierTipsVariant;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class CourierTipsViewHolder$variantsAdapter$1 extends AbstractC7737t implements Function1<CourierTipsVO.CourierTipsVariant, Unit> {
    final /* synthetic */ CourierTipsViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CourierTipsViewHolder$variantsAdapter$1(CourierTipsViewHolder courierTipsViewHolder) {
        super(1);
        this.this$0 = courierTipsViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CourierTipsVO.CourierTipsVariant courierTipsVariant) {
        invoke2(courierTipsVariant);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CourierTipsVO.CourierTipsVariant variant) {
        Function1 actionHandler;
        Intrinsics.checkNotNullParameter(variant, "variant");
        AtomAction action = variant.getAction();
        if (action != null) {
            actionHandler = this.this$0.getActionHandler();
            actionHandler.invoke(action);
        }
    }
}
