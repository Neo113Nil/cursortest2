package ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.presentation.customViews;

import Sc.o;
import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.main.R$layout;
import ru.ozon.app.android.fresh.main.databinding.ViewOrderTrackingProgressBinding;
import ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.domain.NotificationCarouselV2VO;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0013H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/presentation/customViews/OrderProgressView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lru/ozon/app/android/fresh/main/databinding/ViewOrderTrackingProgressBinding;", "bind", "", "item", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2VO$OrderProgressVO;", "bindText", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2VO$OrderProgressVO$OrderProgressType$Text;", "bindIcon", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2VO$OrderProgressVO$OrderProgressType$Icon;", "Companion", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class OrderProgressView extends ConstraintLayout {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final ViewOrderTrackingProgressBinding binding;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/presentation/customViews/OrderProgressView$Companion;", "", "<init>", "()V", "NOTIFICATION_CAROUSEL_TITLE", "", "NOTIFICATION_CAROUSEL_SUBTITLE", "NOTIFICATION_CAROUSEL_ICON", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OrderProgressView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void bindIcon(NotificationCarouselV2VO.OrderProgressVO.OrderProgressType.Icon item) {
        TextAtomV2View title = this.binding.title;
        Intrinsics.checkNotNullExpressionValue(title, "title");
        ViewExtKt.gone(title);
        TextAtomV2View subtitle = this.binding.subtitle;
        Intrinsics.checkNotNullExpressionValue(subtitle, "subtitle");
        ViewExtKt.gone(subtitle);
        IconView icon = this.binding.icon;
        Intrinsics.checkNotNullExpressionValue(icon, "icon");
        IconHolderKt.bindOrGone$default(icon, item.getIcon(), null, 2, null);
    }

    private final void bindText(NotificationCarouselV2VO.OrderProgressVO.OrderProgressType.Text item) {
        IconView icon = this.binding.icon;
        Intrinsics.checkNotNullExpressionValue(icon, "icon");
        ViewExtKt.gone(icon);
        TextAtomV2View title = this.binding.title;
        Intrinsics.checkNotNullExpressionValue(title, "title");
        TextHolderKt.bindOrGone$default(title, item.getTitle(), null, 2, null);
        TextAtomV2View subtitle = this.binding.subtitle;
        Intrinsics.checkNotNullExpressionValue(subtitle, "subtitle");
        TextHolderKt.bindOrGone$default(subtitle, item.getSubtitle(), null, 2, null);
    }

    public final void bind(@NotNull NotificationCarouselV2VO.OrderProgressVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.binding.circleProgressIndicator.setProgressValue(item.getProgress());
        this.binding.circleProgressIndicator.setContentDescription(String.valueOf(item.getProgress()));
        SegmentedCircleProgressView segmentedCircleProgressView = this.binding.circleProgressIndicator;
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        segmentedCircleProgressView.setProgressColor(styleParser.parseColor(context, item.getRingProgressColor(), UniColors.GRAPHIC_FRESH.getResId()));
        NotificationCarouselV2VO.OrderProgressVO.OrderProgressType type = item.getType();
        if (type instanceof NotificationCarouselV2VO.OrderProgressVO.OrderProgressType.Text) {
            bindText((NotificationCarouselV2VO.OrderProgressVO.OrderProgressType.Text) item.getType());
        } else {
            if (!(type instanceof NotificationCarouselV2VO.OrderProgressVO.OrderProgressType.Icon)) {
                throw new o();
            }
            bindIcon((NotificationCarouselV2VO.OrderProgressVO.OrderProgressType.Icon) item.getType());
        }
    }

    public /* synthetic */ OrderProgressView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderProgressView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewOrderTrackingProgressBinding bind = ViewOrderTrackingProgressBinding.bind(ViewGroupExtKt.inflate(this, R$layout.view_order_tracking_progress, true));
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        bind.title.setLocatorTag("notificationCarouselV2OrderViewTimer");
        bind.subtitle.setLocatorTag("notificationCarouselV2OrderViewMin");
        bind.icon.setLocatorTag("notificationCarouselV2OrderViewIcon");
        bind.title.setTextIsSelectable(false);
        bind.subtitle.setTextIsSelectable(false);
    }
}
