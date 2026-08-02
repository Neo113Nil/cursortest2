package ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.presentation.adapter;

import Sc.o;
import Ve.C4636t5;
import Xc.a;
import Xc.b;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.common.widgets.GenericDiffUtil;
import ru.ozon.app.android.fresh.main.databinding.ItemNotificationCarouselV2InformationBinding;
import ru.ozon.app.android.fresh.main.databinding.ItemNotificationCarouselV2OrderTrackingBinding;
import ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.domain.NotificationCarouselV2VO;
import ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.presentation.adapter.viewHolders.NotificationCarouselV2ActionButtonViewHolder;
import ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.presentation.adapter.viewHolders.NotificationCarouselV2BaseItemViewHolder;
import ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.presentation.adapter.viewHolders.NotificationCarouselV2ClickDeliveryViewHolder;
import ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.presentation.adapter.viewHolders.NotificationCarouselV2InformationViewHolder;
import ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.presentation.adapter.viewHolders.NotificationCarouselV2OrderTrackingViewHolder;
import ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.presentation.customViews.ActionButtonNotificationView;
import ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.presentation.customViews.ClickDeliveryNotificationView;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u0018\u0012\u0004\u0012\u00020\u0002\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00020\u0003j\u0002`\u00040\u0001:\u0001\u001fBC\u0012\"\u0010\n\u001a\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\f\u0012\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b\u0012\u0004\u0012\u00020\t0\u0005\u0012\u0016\u0010\f\u001a\u0012\u0012\b\u0012\u00060\u0007j\u0002`\b\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0018\u001a\f\u0012\u0004\u0012\u00020\u00020\u0003j\u0002`\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J)\u0010\u001b\u001a\u00020\t2\u0010\u0010\u001a\u001a\f\u0012\u0004\u0012\u00020\u00020\u0003j\u0002`\u00042\u0006\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR0\u0010\n\u001a\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\f\u0012\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b\u0012\u0004\u0012\u00020\t0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001dR$\u0010\f\u001a\u0012\u0012\b\u0012\u00060\u0007j\u0002`\b\u0012\u0004\u0012\u00020\t0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001e¨\u0006 "}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/presentation/adapter/NotificationCarouselV2Adapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2VO$NotificationCarouselItemVO;", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/presentation/adapter/viewHolders/NotificationCarouselV2BaseItemViewHolder;", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/presentation/adapter/ItemViewHolder;", "Lkotlin/Function2;", "Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "", "clickEventsHandler", "Lkotlin/Function1;", "viewEventsHandler", "<init>", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V", "", "getViewType", "(Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2VO$NotificationCarouselItemVO;)I", "position", "getItemViewType", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/presentation/adapter/viewHolders/NotificationCarouselV2BaseItemViewHolder;", "holder", "onBindViewHolder", "(Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/presentation/adapter/viewHolders/NotificationCarouselV2BaseItemViewHolder;I)V", "Lkotlin/jvm/functions/Function2;", "Lkotlin/jvm/functions/Function1;", "NotificationType", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class NotificationCarouselV2Adapter extends t<NotificationCarouselV2VO.NotificationCarouselItemVO, NotificationCarouselV2BaseItemViewHolder<? super NotificationCarouselV2VO.NotificationCarouselItemVO>> {

    @NotNull
    private final Function2<AtomAction, WZ.t, Unit> clickEventsHandler;

    @NotNull
    private final Function1<WZ.t, Unit> viewEventsHandler;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/presentation/adapter/NotificationCarouselV2Adapter$NotificationType;", "", "<init>", "(Ljava/lang/String;I)V", "ORDER_TRACKING", "INFORMATION", "CLICK_DELIVERY", "ACTION_BUTTON", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class NotificationType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ NotificationType[] $VALUES;
        public static final NotificationType ORDER_TRACKING = new NotificationType("ORDER_TRACKING", 0);
        public static final NotificationType INFORMATION = new NotificationType("INFORMATION", 1);
        public static final NotificationType CLICK_DELIVERY = new NotificationType("CLICK_DELIVERY", 2);
        public static final NotificationType ACTION_BUTTON = new NotificationType("ACTION_BUTTON", 3);

        private static final /* synthetic */ NotificationType[] $values() {
            return new NotificationType[]{ORDER_TRACKING, INFORMATION, CLICK_DELIVERY, ACTION_BUTTON};
        }

        static {
            NotificationType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private NotificationType(String str, int i11) {
        }

        public static NotificationType valueOf(String str) {
            return (NotificationType) Enum.valueOf(NotificationType.class, str);
        }

        public static NotificationType[] values() {
            return (NotificationType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NotificationCarouselV2Adapter(@NotNull Function2<? super AtomAction, ? super WZ.t, Unit> clickEventsHandler, @NotNull Function1<? super WZ.t, Unit> viewEventsHandler) {
        super(new GenericDiffUtil());
        Intrinsics.checkNotNullParameter(clickEventsHandler, "clickEventsHandler");
        Intrinsics.checkNotNullParameter(viewEventsHandler, "viewEventsHandler");
        this.clickEventsHandler = clickEventsHandler;
        this.viewEventsHandler = viewEventsHandler;
    }

    private final int getViewType(NotificationCarouselV2VO.NotificationCarouselItemVO notificationCarouselItemVO) {
        if (notificationCarouselItemVO instanceof NotificationCarouselV2VO.NotificationCarouselItemVO.OrderTrackingNotification) {
            return NotificationType.ORDER_TRACKING.ordinal();
        }
        if (notificationCarouselItemVO instanceof NotificationCarouselV2VO.NotificationCarouselItemVO.InformationNotification) {
            return NotificationType.INFORMATION.ordinal();
        }
        if (notificationCarouselItemVO instanceof NotificationCarouselV2VO.NotificationCarouselItemVO.ClickDeliveryNotification) {
            return NotificationType.CLICK_DELIVERY.ordinal();
        }
        if (notificationCarouselItemVO instanceof NotificationCarouselV2VO.NotificationCarouselItemVO.ActionButtonNotification) {
            return NotificationType.ACTION_BUTTON.ordinal();
        }
        throw new o();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        NotificationCarouselV2VO.NotificationCarouselItemVO item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        return getViewType(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public NotificationCarouselV2BaseItemViewHolder<NotificationCarouselV2VO.NotificationCarouselItemVO> onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        LayoutInflater a11 = C4636t5.a(parent, "parent");
        if (viewType == NotificationType.INFORMATION.ordinal()) {
            ItemNotificationCarouselV2InformationBinding inflate = ItemNotificationCarouselV2InformationBinding.inflate(a11);
            Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
            return new NotificationCarouselV2InformationViewHolder(inflate, this.clickEventsHandler, this.viewEventsHandler);
        }
        if (viewType == NotificationType.ORDER_TRACKING.ordinal()) {
            ItemNotificationCarouselV2OrderTrackingBinding inflate2 = ItemNotificationCarouselV2OrderTrackingBinding.inflate(a11);
            Intrinsics.checkNotNullExpressionValue(inflate2, "inflate(...)");
            return new NotificationCarouselV2OrderTrackingViewHolder(inflate2, this.clickEventsHandler, this.viewEventsHandler);
        }
        if (viewType == NotificationType.CLICK_DELIVERY.ordinal()) {
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            return new NotificationCarouselV2ClickDeliveryViewHolder(new ClickDeliveryNotificationView(context, null, 0, 6, null), this.clickEventsHandler, this.viewEventsHandler);
        }
        if (viewType != NotificationType.ACTION_BUTTON.ordinal()) {
            throw new IllegalStateException("No such view type!");
        }
        Context context2 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        return new NotificationCarouselV2ActionButtonViewHolder(new ActionButtonNotificationView(context2, null, 0, 6, null), this.clickEventsHandler, this.viewEventsHandler);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull NotificationCarouselV2BaseItemViewHolder<? super NotificationCarouselV2VO.NotificationCarouselItemVO> holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        NotificationCarouselV2VO.NotificationCarouselItemVO item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item);
    }
}
