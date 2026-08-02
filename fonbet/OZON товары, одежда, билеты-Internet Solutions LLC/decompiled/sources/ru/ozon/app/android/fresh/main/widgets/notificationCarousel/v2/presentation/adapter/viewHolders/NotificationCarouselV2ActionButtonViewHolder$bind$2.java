package ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.presentation.adapter.viewHolders;

import WZ.t;
import WZ.x;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.domain.NotificationCarouselV2VO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class NotificationCarouselV2ActionButtonViewHolder$bind$2 extends AbstractC7737t implements Function1<AtomAction, Unit> {
    final /* synthetic */ NotificationCarouselV2VO.NotificationCarouselItemVO.ActionButtonNotification $item;
    final /* synthetic */ NotificationCarouselV2ActionButtonViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationCarouselV2ActionButtonViewHolder$bind$2(NotificationCarouselV2VO.NotificationCarouselItemVO.ActionButtonNotification actionButtonNotification, NotificationCarouselV2ActionButtonViewHolder notificationCarouselV2ActionButtonViewHolder) {
        super(1);
        this.$item = actionButtonNotification;
        this.this$0 = notificationCarouselV2ActionButtonViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction) {
        invoke2(atomAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction action) {
        t tokenizedEvent;
        Function2 function2;
        AtomActionDTO action2;
        AtomAction atomAction;
        Intrinsics.checkNotNullParameter(action, "action");
        Map<String, TokenizedTrackingInfo> trackingInfo = this.$item.getButton().getTrackingInfo();
        if (trackingInfo == null || (tokenizedEvent = x.c(trackingInfo)) == null) {
            tokenizedEvent = this.$item.getTokenizedEvent();
        }
        CommonControlSettings common = this.$item.getButton().getCommon();
        if (common != null && (action2 = common.getAction()) != null && (atomAction = AtomActionMapperKt.toAtomAction(action2, this.$item.getButton().getTrackingInfo())) != null) {
            action = atomAction;
        }
        function2 = this.this$0.clickEventsHandler;
        function2.invoke(action, tokenizedEvent);
    }
}
