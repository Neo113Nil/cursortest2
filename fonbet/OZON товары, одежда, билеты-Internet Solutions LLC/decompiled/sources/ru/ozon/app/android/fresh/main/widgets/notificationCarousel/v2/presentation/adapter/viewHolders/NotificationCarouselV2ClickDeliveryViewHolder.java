package ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.presentation.adapter.viewHolders;

import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.domain.NotificationCarouselV2VO;
import ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.presentation.customViews.ClickDeliveryNotificationView;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BK\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\"\u0010\n\u001a\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\f\u0012\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b\u0012\u0004\u0012\u00020\t0\u0005\u0012\u0016\u0010\f\u001a\u0012\u0012\b\u0012\u00060\u0007j\u0002`\b\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0012R0\u0010\n\u001a\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\f\u0012\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b\u0012\u0004\u0012\u00020\t0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/presentation/adapter/viewHolders/NotificationCarouselV2ClickDeliveryViewHolder;", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/presentation/adapter/viewHolders/NotificationCarouselV2BaseItemViewHolder;", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2VO$NotificationCarouselItemVO$ClickDeliveryNotification;", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/presentation/customViews/ClickDeliveryNotificationView;", "view", "Lkotlin/Function2;", "Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "", "clickEventsHandler", "Lkotlin/Function1;", "viewEventsHandler", "<init>", "(Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/presentation/customViews/ClickDeliveryNotificationView;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V", "item", "bind", "(Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2VO$NotificationCarouselItemVO$ClickDeliveryNotification;)V", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/presentation/customViews/ClickDeliveryNotificationView;", "Lkotlin/jvm/functions/Function2;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class NotificationCarouselV2ClickDeliveryViewHolder extends NotificationCarouselV2BaseItemViewHolder<NotificationCarouselV2VO.NotificationCarouselItemVO.ClickDeliveryNotification> {

    @NotNull
    private final Function2<AtomAction, t, Unit> clickEventsHandler;

    @NotNull
    private final ClickDeliveryNotificationView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NotificationCarouselV2ClickDeliveryViewHolder(@NotNull ClickDeliveryNotificationView view, @NotNull Function2<? super AtomAction, ? super t, Unit> clickEventsHandler, @NotNull Function1<? super t, Unit> viewEventsHandler) {
        super(view, clickEventsHandler, viewEventsHandler);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(clickEventsHandler, "clickEventsHandler");
        Intrinsics.checkNotNullParameter(viewEventsHandler, "viewEventsHandler");
        this.view = view;
        this.clickEventsHandler = clickEventsHandler;
    }

    @Override // ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.presentation.adapter.viewHolders.NotificationCarouselV2BaseItemViewHolder
    public void bind(@NotNull NotificationCarouselV2VO.NotificationCarouselItemVO.ClickDeliveryNotification item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.bind((NotificationCarouselV2ClickDeliveryViewHolder) item);
        this.view.bind(item, new NotificationCarouselV2ClickDeliveryViewHolder$bind$1(this, item));
    }
}
