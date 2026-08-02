package ru.ozon.app.android.checkoutcomposer.deliveryQuantity.presentation;

import W10.c;
import WZ.t;
import android.R;
import android.graphics.drawable.PaintDrawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.checkout.databinding.WidgetDeliveryQuantityBinding;
import ru.ozon.app.android.checkoutcomposer.deliveryQuantity.DeliveryQuantityVO;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.utils.ContainerExtKt;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0007\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ#\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u00022\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0018R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/deliveryQuantity/presentation/DeliveryQuantityWidgetVH;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/checkoutcomposer/deliveryQuantity/DeliveryQuantityVO;", "Lru/ozon/app/android/checkout/databinding/WidgetDeliveryQuantityBinding;", "binding", "Lru/ozon/app/android/utils/AppType;", "appType", "Lru/ozon/app/android/composer/ComposerReferences;", "ref", "<init>", "(Lru/ozon/app/android/checkout/databinding/WidgetDeliveryQuantityBinding;Lru/ozon/app/android/utils/AppType;Lru/ozon/app/android/composer/ComposerReferences;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "bind", "(Lru/ozon/app/android/checkoutcomposer/deliveryQuantity/DeliveryQuantityVO;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/checkoutcomposer/deliveryQuantity/DeliveryQuantityVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/checkout/databinding/WidgetDeliveryQuantityBinding;", "Lru/ozon/app/android/utils/AppType;", "Lru/ozon/app/android/composer/ComposerReferences;", "getRef", "()Lru/ozon/app/android/composer/ComposerReferences;", "", "cornerRadius", "F", "Companion", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DeliveryQuantityWidgetVH extends k<DeliveryQuantityVO> {

    @NotNull
    private final AppType appType;

    @NotNull
    private final WidgetDeliveryQuantityBinding binding;
    private final float cornerRadius;

    @NotNull
    private final ComposerReferences ref;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final float DELIVERY_SELECTOR_CORNER_RADIUS = UiExtKt.toPxF(CornerRadius.RADIUS_400.getPx());
    private static final float DELIVERY_SELECTOR_CORNER_RADIUS_SELECT = UiExtKt.toPxF(CornerRadius.RADIUS_600.getPx());
    private static final int DELIVERY_SELECTOR_PADDING = UiExtKt.toPx(16);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/deliveryQuantity/presentation/DeliveryQuantityWidgetVH$Companion;", "", "<init>", "()V", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
    public DeliveryQuantityWidgetVH(@NotNull WidgetDeliveryQuantityBinding binding, @NotNull AppType appType, @NotNull ComposerReferences ref) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(ref, "ref");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.appType = appType;
        this.ref = ref;
        this.cornerRadius = appType == AppType.SELECT ? DELIVERY_SELECTOR_CORNER_RADIUS_SELECT : DELIVERY_SELECTOR_CORNER_RADIUS;
        binding.deliveryIconSAL.setOnAction(new ActionHandler.Builder(ref, this).buildHandler());
    }

    @NotNull
    public final ComposerReferences getRef() {
        return this.ref;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull DeliveryQuantityVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetDeliveryQuantityBinding widgetDeliveryQuantityBinding = this.binding;
        SingleAtom deliveryTitleSAL = widgetDeliveryQuantityBinding.deliveryTitleSAL;
        Intrinsics.checkNotNullExpressionValue(deliveryTitleSAL, "deliveryTitleSAL");
        DeliveryQuantityVO.Header header = item.getHeader();
        ContainerExtKt.bindOrGone$default(deliveryTitleSAL, header != null ? header.getTitle() : null, false, 2, null);
        SingleAtom deliveryIconSAL = widgetDeliveryQuantityBinding.deliveryIconSAL;
        Intrinsics.checkNotNullExpressionValue(deliveryIconSAL, "deliveryIconSAL");
        DeliveryQuantityVO.Header header2 = item.getHeader();
        ContainerExtKt.bindOrGone$default(deliveryIconSAL, header2 != null ? header2.getButton() : null, false, 2, null);
        widgetDeliveryQuantityBinding.deliverySelectorLL.createItems(item.getSelector().getElements(), new DeliveryQuantityWidgetVH$bind$1$1(this), item.getSelector().getSelectedColor(), this.appType);
        LinearLayout deliveryMessageLL = widgetDeliveryQuantityBinding.deliveryMessageLL;
        Intrinsics.checkNotNullExpressionValue(deliveryMessageLL, "deliveryMessageLL");
        ViewExtKt.showOrGoneByPresence(deliveryMessageLL, item.getBottomMessage());
        DeliveryQuantityVO.BottomMessage bottomMessage = item.getBottomMessage();
        if (bottomMessage != null) {
            LinearLayout deliveryMessageLL2 = widgetDeliveryQuantityBinding.deliveryMessageLL;
            Intrinsics.checkNotNullExpressionValue(deliveryMessageLL2, "deliveryMessageLL");
            ViewExtKt.show(deliveryMessageLL2);
            ImageView deliveryMessageIconIv = widgetDeliveryQuantityBinding.deliveryMessageIconIv;
            Intrinsics.checkNotNullExpressionValue(deliveryMessageIconIv, "deliveryMessageIconIv");
            ImageViewExtKt.loadImageOrGone(deliveryMessageIconIv, bottomMessage.getIcon());
            SingleAtom.bind$default(widgetDeliveryQuantityBinding.deliveryMessageSAL, bottomMessage.getMessage(), false, 2, null);
        } else {
            LinearLayout deliveryMessageLL3 = widgetDeliveryQuantityBinding.deliveryMessageLL;
            Intrinsics.checkNotNullExpressionValue(deliveryMessageLL3, "deliveryMessageLL");
            ViewExtKt.gone(deliveryMessageLL3);
        }
        if (item.getHeader() != null) {
            ConstraintLayout constraintLayout = widgetDeliveryQuantityBinding.getConstraintLayout();
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
            int i11 = DELIVERY_SELECTOR_PADDING;
            ViewExtKt.updatePadding$default(constraintLayout, 0, 0, 0, i11, 7, null);
            ViewGroup.LayoutParams layoutParams = widgetDeliveryQuantityBinding.deliverySelectorLL.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.setMargins(marginLayoutParams.leftMargin, i11, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            }
        }
        DeliverySwitchButtonsLayout deliverySwitchButtonsLayout = widgetDeliveryQuantityBinding.deliverySelectorLL;
        PaintDrawable paintDrawable = new PaintDrawable();
        paintDrawable.getPaint().setColor(StyleParser.INSTANCE.parseColor(getContext(), item.getSelector().getBackgroundColor(), R.color.transparent));
        paintDrawable.setCornerRadius(this.cornerRadius);
        deliverySwitchButtonsLayout.setBackground(paintDrawable);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull DeliveryQuantityVO item, @NotNull c trackingData, f viewedPond) {
        t tokenizedEvent$default;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        Map<String, TokenizedTrackingInfo> trackingInfo = item.getTrackingInfo();
        if (trackingInfo == null || (tokenizedEvent$default = TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(item.getId()), null, 2, null)) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.ref.getTokenizedAnalytics(), tokenizedEvent$default, null, 2, null);
    }
}
