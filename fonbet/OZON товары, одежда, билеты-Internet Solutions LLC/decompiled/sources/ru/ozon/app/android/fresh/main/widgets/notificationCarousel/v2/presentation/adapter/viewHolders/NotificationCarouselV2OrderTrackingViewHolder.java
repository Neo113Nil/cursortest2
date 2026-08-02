package ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.presentation.adapter.viewHolders;

import WZ.t;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.main.databinding.ItemNotificationCarouselV2OrderTrackingBinding;
import ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.domain.NotificationCarouselV2VO;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018BK\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\"\u0010\n\u001a\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\f\u0012\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b\u0012\u0004\u0012\u00020\t0\u0005\u0012\u0016\u0010\f\u001a\u0012\u0012\b\u0012\u00060\u0007j\u0002`\b\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0012\u001a\u00020\t*\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0017¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/presentation/adapter/viewHolders/NotificationCarouselV2OrderTrackingViewHolder;", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/presentation/adapter/viewHolders/NotificationCarouselV2BaseItemViewHolder;", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2VO$NotificationCarouselItemVO$OrderTrackingNotification;", "Lru/ozon/app/android/fresh/main/databinding/ItemNotificationCarouselV2OrderTrackingBinding;", "binding", "Lkotlin/Function2;", "Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "", "clickEventsHandler", "Lkotlin/Function1;", "viewEventsHandler", "<init>", "(Lru/ozon/app/android/fresh/main/databinding/ItemNotificationCarouselV2OrderTrackingBinding;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V", "Landroidx/constraintlayout/widget/Group;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icon", "bindOrGone", "(Landroidx/constraintlayout/widget/Group;Lru/ozon/uni/atoms/data/icon/IconDTO;)V", "item", "bind", "(Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2VO$NotificationCarouselItemVO$OrderTrackingNotification;)V", "Lru/ozon/app/android/fresh/main/databinding/ItemNotificationCarouselV2OrderTrackingBinding;", "Companion", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class NotificationCarouselV2OrderTrackingViewHolder extends NotificationCarouselV2BaseItemViewHolder<NotificationCarouselV2VO.NotificationCarouselItemVO.OrderTrackingNotification> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final ItemNotificationCarouselV2OrderTrackingBinding binding;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/presentation/adapter/viewHolders/NotificationCarouselV2OrderTrackingViewHolder$Companion;", "", "<init>", "()V", "NOTIFICATION_CAROUSEL_TITLE", "", "NOTIFICATION_CAROUSEL_SUBTITLE", "NOTIFICATION_CAROUSEL_ICON", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public NotificationCarouselV2OrderTrackingViewHolder(@NotNull ItemNotificationCarouselV2OrderTrackingBinding binding, @NotNull Function2<? super AtomAction, ? super t, Unit> clickEventsHandler, @NotNull Function1<? super t, Unit> viewEventsHandler) {
        super(r0, clickEventsHandler, viewEventsHandler);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(clickEventsHandler, "clickEventsHandler");
        Intrinsics.checkNotNullParameter(viewEventsHandler, "viewEventsHandler");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        binding.title.setLocatorTag("notificationCarouselV2OrderTrackingTitle");
        binding.subtitle.setLocatorTag("notificationCarouselV2OrderTrackingSubtitle");
        binding.titleIcon.setLocatorTag("notificationCarouselV2OrderTrackingChevron");
        binding.title.setTextIsSelectable(false);
        binding.subtitle.setTextIsSelectable(false);
    }

    private final void bindOrGone(Group group, IconDTO iconDTO) {
        if (iconDTO == null) {
            ViewExtKt.gone(group);
            return;
        }
        ViewExtKt.show(group);
        ItemNotificationCarouselV2OrderTrackingBinding itemNotificationCarouselV2OrderTrackingBinding = this.binding;
        IconView star1 = itemNotificationCarouselV2OrderTrackingBinding.star1;
        Intrinsics.checkNotNullExpressionValue(star1, "star1");
        IconHolderKt.bindOrGone$default(star1, iconDTO, null, 2, null);
        IconView star2 = itemNotificationCarouselV2OrderTrackingBinding.star2;
        Intrinsics.checkNotNullExpressionValue(star2, "star2");
        IconHolderKt.bindOrGone$default(star2, iconDTO, null, 2, null);
        IconView star3 = itemNotificationCarouselV2OrderTrackingBinding.star3;
        Intrinsics.checkNotNullExpressionValue(star3, "star3");
        IconHolderKt.bindOrGone$default(star3, iconDTO, null, 2, null);
        IconView star4 = itemNotificationCarouselV2OrderTrackingBinding.star4;
        Intrinsics.checkNotNullExpressionValue(star4, "star4");
        IconHolderKt.bindOrGone$default(star4, iconDTO, null, 2, null);
        IconView star5 = itemNotificationCarouselV2OrderTrackingBinding.star5;
        Intrinsics.checkNotNullExpressionValue(star5, "star5");
        IconHolderKt.bindOrGone$default(star5, iconDTO, null, 2, null);
    }

    @Override // ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.presentation.adapter.viewHolders.NotificationCarouselV2BaseItemViewHolder
    public void bind(@NotNull NotificationCarouselV2VO.NotificationCarouselItemVO.OrderTrackingNotification item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.bind((NotificationCarouselV2OrderTrackingViewHolder) item);
        ItemNotificationCarouselV2OrderTrackingBinding itemNotificationCarouselV2OrderTrackingBinding = this.binding;
        TextAtomV2View title = itemNotificationCarouselV2OrderTrackingBinding.title;
        Intrinsics.checkNotNullExpressionValue(title, "title");
        TextHolderKt.bindOrGone$default(title, item.getTitle(), null, 2, null);
        TextAtomV2View subtitle = itemNotificationCarouselV2OrderTrackingBinding.subtitle;
        Intrinsics.checkNotNullExpressionValue(subtitle, "subtitle");
        TextHolderKt.bindOrGone$default(subtitle, item.getSubtitle(), null, 2, null);
        itemNotificationCarouselV2OrderTrackingBinding.orderProgress.bind(item.getProgress());
        IconView titleIcon = itemNotificationCarouselV2OrderTrackingBinding.titleIcon;
        Intrinsics.checkNotNullExpressionValue(titleIcon, "titleIcon");
        IconHolderKt.bindOrGone$default(titleIcon, item.getTitleIcon(), null, 2, null);
        Group stars = itemNotificationCarouselV2OrderTrackingBinding.stars;
        Intrinsics.checkNotNullExpressionValue(stars, "stars");
        bindOrGone(stars, item.getStarIcon());
    }
}
