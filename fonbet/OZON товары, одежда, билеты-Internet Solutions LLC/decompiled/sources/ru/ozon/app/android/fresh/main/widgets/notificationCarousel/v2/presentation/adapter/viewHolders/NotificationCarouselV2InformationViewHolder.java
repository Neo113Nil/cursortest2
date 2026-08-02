package ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.presentation.adapter.viewHolders;

import WZ.t;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.main.databinding.ItemNotificationCarouselV2InformationBinding;
import ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.domain.NotificationCarouselV2VO;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013BK\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\"\u0010\n\u001a\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\f\u0012\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b\u0012\u0004\u0012\u00020\t0\u0005\u0012\u0016\u0010\f\u001a\u0012\u0012\b\u0012\u00060\u0007j\u0002`\b\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0012¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/presentation/adapter/viewHolders/NotificationCarouselV2InformationViewHolder;", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/presentation/adapter/viewHolders/NotificationCarouselV2BaseItemViewHolder;", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2VO$NotificationCarouselItemVO$InformationNotification;", "Lru/ozon/app/android/fresh/main/databinding/ItemNotificationCarouselV2InformationBinding;", "binding", "Lkotlin/Function2;", "Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "", "clickEventsHandler", "Lkotlin/Function1;", "viewEventsHandler", "<init>", "(Lru/ozon/app/android/fresh/main/databinding/ItemNotificationCarouselV2InformationBinding;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V", "item", "bind", "(Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2VO$NotificationCarouselItemVO$InformationNotification;)V", "Lru/ozon/app/android/fresh/main/databinding/ItemNotificationCarouselV2InformationBinding;", "Companion", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class NotificationCarouselV2InformationViewHolder extends NotificationCarouselV2BaseItemViewHolder<NotificationCarouselV2VO.NotificationCarouselItemVO.InformationNotification> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final ItemNotificationCarouselV2InformationBinding binding;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/presentation/adapter/viewHolders/NotificationCarouselV2InformationViewHolder$Companion;", "", "<init>", "()V", "NOTIFICATION_CAROUSEL_TITLE", "", "NOTIFICATION_CAROUSEL_SUBTITLE", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
    public NotificationCarouselV2InformationViewHolder(@NotNull ItemNotificationCarouselV2InformationBinding binding, @NotNull Function2<? super AtomAction, ? super t, Unit> clickEventsHandler, @NotNull Function1<? super t, Unit> viewEventsHandler) {
        super(r0, clickEventsHandler, viewEventsHandler);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(clickEventsHandler, "clickEventsHandler");
        Intrinsics.checkNotNullParameter(viewEventsHandler, "viewEventsHandler");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        binding.title.setLocatorTag("notificationCarouselV2InformationViewTitle");
        binding.subtitle.setLocatorTag("notificationCarouselV2InformationViewSubtitle");
        binding.title.setTextIsSelectable(false);
        binding.subtitle.setTextIsSelectable(false);
    }

    @Override // ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.presentation.adapter.viewHolders.NotificationCarouselV2BaseItemViewHolder
    public void bind(@NotNull NotificationCarouselV2VO.NotificationCarouselItemVO.InformationNotification item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.bind((NotificationCarouselV2InformationViewHolder) item);
        ItemNotificationCarouselV2InformationBinding itemNotificationCarouselV2InformationBinding = this.binding;
        IconView leftIcon = itemNotificationCarouselV2InformationBinding.leftIcon;
        Intrinsics.checkNotNullExpressionValue(leftIcon, "leftIcon");
        IconHolderKt.bindOrGone$default(leftIcon, item.getLeftIcon(), null, 2, null);
        IconView rightIcon = itemNotificationCarouselV2InformationBinding.rightIcon;
        Intrinsics.checkNotNullExpressionValue(rightIcon, "rightIcon");
        IconHolderKt.bindOrGone$default(rightIcon, item.getRightIcon(), null, 2, null);
        TextAtomV2View title = itemNotificationCarouselV2InformationBinding.title;
        Intrinsics.checkNotNullExpressionValue(title, "title");
        TextHolderKt.bindOrGone$default(title, item.getTitle(), null, 2, null);
        TextAtomV2View subtitle = itemNotificationCarouselV2InformationBinding.subtitle;
        Intrinsics.checkNotNullExpressionValue(subtitle, "subtitle");
        TextHolderKt.bindOrGone$default(subtitle, item.getSubtitle(), null, 2, null);
    }
}
