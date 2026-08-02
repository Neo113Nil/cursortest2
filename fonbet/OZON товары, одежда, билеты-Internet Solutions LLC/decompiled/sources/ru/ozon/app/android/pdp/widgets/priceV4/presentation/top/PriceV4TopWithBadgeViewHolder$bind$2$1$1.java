package ru.ozon.app.android.pdp.widgets.priceV4.presentation.top;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdp.widgets.priceV4.presentation.vo.PriceStarsBadgeVO;
import ru.ozon.app.android.pdp.widgets.priceV4.presentation.vo.PriceV4VoWrapper;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class PriceV4TopWithBadgeViewHolder$bind$2$1$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ PriceV4VoWrapper.TopWithFinBadge $item;
    final /* synthetic */ PriceV4TopWithBadgeViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PriceV4TopWithBadgeViewHolder$bind$2$1$1(PriceV4VoWrapper.TopWithFinBadge topWithFinBadge, PriceV4TopWithBadgeViewHolder priceV4TopWithBadgeViewHolder) {
        super(0);
        this.$item = topWithFinBadge;
        this.this$0 = priceV4TopWithBadgeViewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        CommonControlSettings common;
        AtomActionDTO action;
        AtomAction atomAction;
        Function1 function1;
        BadgeDTO topFinBadge = this.$item.getTopFinBadge();
        if (topFinBadge == null || (common = topFinBadge.getCommon()) == null) {
            PriceStarsBadgeVO topStarBadge = this.$item.getTopStarBadge();
            common = topStarBadge != null ? topStarBadge.getCommon() : null;
        }
        if (common == null || (action = common.getAction()) == null || (atomAction = AtomActionMapperKt.toAtomAction(action, common.getTrackingInfo())) == null) {
            return;
        }
        function1 = this.this$0.actionHandler;
        function1.invoke(atomAction);
    }
}
