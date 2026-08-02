package ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.presentation.customViews;

import IC.a;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.common.widgets.molecules.imageSkuClick.presentation.ImageSkuClickView;
import ru.ozon.app.android.fresh.main.R$id;
import ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.domain.NotificationCarouselV2VO;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\"\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000f0\u0013R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/presentation/customViews/ClickDeliveryNotificationView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "skuImageView", "Lru/ozon/app/android/fresh/common/widgets/molecules/imageSkuClick/presentation/ImageSkuClickView;", "cellView", "Lru/ozon/uni/android/cell/CellView;", "bind", "", "data", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2VO$NotificationCarouselItemVO$ClickDeliveryNotification;", "onClick", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "Companion", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ClickDeliveryNotificationView extends LinearLayout {

    @NotNull
    private final CellView cellView;

    @NotNull
    private final ImageSkuClickView skuImageView;

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int containerHeight = UiExtKt.toPx(70);
    private static final int skuImageWidth = UiExtKt.toPx(46);
    private static final int skuImageHeight = UiExtKt.toPx(62);
    private static final int skuImageMargin = UiExtKt.toPx(4);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/presentation/customViews/ClickDeliveryNotificationView$Companion;", "", "<init>", "()V", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ ClickDeliveryNotificationView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    public final void bind(@NotNull NotificationCarouselV2VO.NotificationCarouselItemVO.ClickDeliveryNotification data, @NotNull Function1<? super AtomAction, Unit> onClick) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.skuImageView.bind(data.getSkuImage(), new ClickDeliveryNotificationView$bind$1(data, onClick));
        CellHolderKt.bind(this.cellView, data.getCell(), onClick);
        AtomAction clickAction = data.getClickAction();
        if (clickAction != null) {
            this.cellView.getCenterBlock().setOnClickListener(new a(onClick, clickAction, 1));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ClickDeliveryNotificationView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        int i12 = 0;
        ImageSkuClickView imageSkuClickView = new ImageSkuClickView(context, null, i12, 6, null);
        imageSkuClickView.setId(R$id.notifCarouselClickSkuImage);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(skuImageWidth, skuImageHeight);
        layoutParams.setMargins(skuImageMargin, 0, 0, 0);
        imageSkuClickView.setLayoutParams(layoutParams);
        this.skuImageView = imageSkuClickView;
        CellView cellView = new CellView(context, null, i12, 0, 0 == true ? 1 : 0, 30, null);
        cellView.setId(R$id.notifCarouselClickCell);
        cellView.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        this.cellView = cellView;
        setLayoutParams(new LinearLayout.LayoutParams(-1, containerHeight));
        setOrientation(0);
        setGravity(16);
        addView(imageSkuClickView);
        addView(cellView);
        setId(R$id.notifCarouselClick);
    }
}
