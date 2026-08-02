package ru.ozon.app.android.fresh.main.widgets.curtainGoals.v2.presentation;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class CurtainGoalsV2ViewHolder$actionHandler$2 extends AbstractC7737t implements Function1<AtomAction.Click, Unit> {
    final /* synthetic */ CurtainGoalsV2ViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CurtainGoalsV2ViewHolder$actionHandler$2(CurtainGoalsV2ViewHolder curtainGoalsV2ViewHolder) {
        super(1);
        this.this$0 = curtainGoalsV2ViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction.Click click) {
        invoke2(click);
        return Unit.f71690a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
    
        r0 = r1.this$0.getViewModel();
     */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke2(AtomAction.Click it) {
        CurtainGoalsV2VO boundedData;
        ButtonV3DTO largeButton;
        CommonControlSettings common;
        AtomActionDTO action;
        Map<String, String> params;
        CurtainGoalsViewModel viewModel;
        Intrinsics.checkNotNullParameter(it, "it");
        if (!Intrinsics.d(it.getLink(), "applyGoalsCoupon") || (boundedData = this.this$0.getBoundedData()) == null || (largeButton = boundedData.getLargeButton()) == null || (common = largeButton.getCommon()) == null || (action = common.getAction()) == null || (params = action.getParams()) == null || viewModel == null) {
            return;
        }
        viewModel.onApplyCouponAction(params);
    }
}
