package ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.presentation.customViews;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.domain.NotificationCarouselV2VO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class ClickDeliveryNotificationView$bind$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ NotificationCarouselV2VO.NotificationCarouselItemVO.ClickDeliveryNotification $data;
    final /* synthetic */ Function1<AtomAction, Unit> $onClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ClickDeliveryNotificationView$bind$1(NotificationCarouselV2VO.NotificationCarouselItemVO.ClickDeliveryNotification clickDeliveryNotification, Function1<? super AtomAction, Unit> function1) {
        super(0);
        this.$data = clickDeliveryNotification;
        this.$onClick = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AtomAction action = this.$data.getSkuImage().getAction();
        if (action == null) {
            action = this.$data.getClickAction();
        }
        if (action != null) {
            this.$onClick.invoke(action);
        }
    }
}
