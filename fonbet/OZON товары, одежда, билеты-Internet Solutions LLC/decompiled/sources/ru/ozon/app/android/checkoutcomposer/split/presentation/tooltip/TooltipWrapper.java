package ru.ozon.app.android.checkoutcomposer.split.presentation.tooltip;

import WZ.l;
import WZ.t;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.checkoutcomposer.split.data.SplitElementDTO;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import xe.C10727i;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 22\u00020\u0001:\u00012B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0012¢\u0006\u0004\b\u001d\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u0018\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001fR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010.\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00100\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010/R\u0016\u00101\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010/¨\u00063"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/split/presentation/tooltip/TooltipWrapper;", "", "Landroid/content/Context;", "context", "Landroidx/lifecycle/J;", "lifecycleOwner", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "", "widgetId", "<init>", "(Landroid/content/Context;Landroidx/lifecycle/J;LWZ/l;Ljava/lang/Long;)V", "", "isShowing", "()Z", "Landroid/view/View;", "anchorView", "", "computePosition", "(Landroid/view/View;)V", "runDismissWithDelay", "()V", "Lru/ozon/app/android/checkoutcomposer/split/data/SplitElementDTO$SplitProductsBlockDTO$PromotedProduct$ProductTooltip;", "tooltip", "", "anchorX", "create", "(Lru/ozon/app/android/checkoutcomposer/split/data/SplitElementDTO$SplitProductsBlockDTO$PromotedProduct$ProductTooltip;Landroid/view/View;I)V", "dismiss", "Landroidx/lifecycle/J;", "LWZ/l;", "Ljava/lang/Long;", "Landroid/view/WindowManager;", "windowManager", "Landroid/view/WindowManager;", "Landroid/view/WindowManager$LayoutParams;", "tooltipLayoutParams", "Landroid/view/WindowManager$LayoutParams;", "Landroid/graphics/Rect;", "viewVisibleRect", "Landroid/graphics/Rect;", "Lru/ozon/app/android/checkoutcomposer/split/data/SplitElementDTO$SplitProductsBlockDTO$PromotedProduct$ProductTooltip;", "Lru/ozon/app/android/checkoutcomposer/split/presentation/tooltip/TooltipView;", "tooltipView", "Lru/ozon/app/android/checkoutcomposer/split/presentation/tooltip/TooltipView;", "isTooltipInVisibleBounds", "Z", "isDelayOver", "isDismissWithDelayStarted", "Companion", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TooltipWrapper {
    private boolean isDelayOver;
    private boolean isDismissWithDelayStarted;
    private boolean isTooltipInVisibleBounds;

    @NotNull
    private final J lifecycleOwner;

    @NotNull
    private final l tokenizedAnalytics;
    private SplitElementDTO.SplitProductsBlockDTO.PromotedProduct.ProductTooltip tooltip;

    @NotNull
    private final WindowManager.LayoutParams tooltipLayoutParams;

    @NotNull
    private final TooltipView tooltipView;

    @NotNull
    private final Rect viewVisibleRect;
    private final Long widgetId;

    @NotNull
    private final WindowManager windowManager;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int BOTTOM_MARGIN = ResourceExtKt.toPx(4);
    private static final int HORIZONTAL_MARGIN = ResourceExtKt.toPx(16);
    private static final int HORIZONTAL_MARGIN_SUM = ResourceExtKt.toPx(32);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/split/presentation/tooltip/TooltipWrapper$Companion;", "", "<init>", "()V", "", "LOCATOR_TOOLTIP", "Ljava/lang/String;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public TooltipWrapper(@NotNull Context context, @NotNull J lifecycleOwner, @NotNull l tokenizedAnalytics, Long l11) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.lifecycleOwner = lifecycleOwner;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.widgetId = l11;
        Object systemService = context.getSystemService("window");
        Intrinsics.g(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.windowManager = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.tooltipLayoutParams = layoutParams;
        this.viewVisibleRect = new Rect();
        TooltipView tooltipView = new TooltipView(context);
        tooltipView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        tooltipView.setContentDescription("tooltip");
        this.tooltipView = tooltipView;
        layoutParams.type = 1000;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.gravity = 8388661;
        layoutParams.flags = 262152;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void computePosition(View anchorView) {
        this.tooltipLayoutParams.token = anchorView.getApplicationWindowToken();
        int[] iArr = new int[2];
        anchorView.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        anchorView.getRootView().getWindowVisibleDisplayFrame(rect);
        int width = rect.width();
        this.tooltipView.measure(View.MeasureSpec.makeMeasureSpec(width, LinearLayoutManager.INVALID_OFFSET), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredWidth = this.tooltipView.getMeasuredWidth();
        int i11 = HORIZONTAL_MARGIN_SUM;
        this.tooltipLayoutParams.width = this.tooltipView.getMeasuredWidth() - (measuredWidth + i11 >= width ? i11 : 0);
        this.tooltipLayoutParams.height = this.tooltipView.getMeasuredHeight();
        WindowManager.LayoutParams layoutParams = this.tooltipLayoutParams;
        layoutParams.gravity = 8388661;
        layoutParams.x = HORIZONTAL_MARGIN;
        Integer J11 = C7705l.J(iArr, 1);
        if (J11 != null) {
            this.tooltipLayoutParams.y = J11.intValue() + ((-this.tooltipView.getMeasuredHeight()) - BOTTOM_MARGIN);
        }
    }

    private final boolean isShowing() {
        return this.tooltipView.getParent() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void runDismissWithDelay() {
        Integer displayTimeInSeconds;
        if (this.isDismissWithDelayStarted) {
            return;
        }
        this.isDismissWithDelayStarted = true;
        SplitElementDTO.SplitProductsBlockDTO.PromotedProduct.ProductTooltip productTooltip = this.tooltip;
        if (productTooltip == null || (displayTimeInSeconds = productTooltip.getDisplayTimeInSeconds()) == null) {
            return;
        }
        C10727i.c(K.a(this.lifecycleOwner), null, null, new TooltipWrapper$runDismissWithDelay$1$1(displayTimeInSeconds.intValue(), this, null), 3);
    }

    public final void create(@NotNull final SplitElementDTO.SplitProductsBlockDTO.PromotedProduct.ProductTooltip tooltip, @NotNull final View anchorView, final int anchorX) {
        t tokenizedEvent$default;
        Intrinsics.checkNotNullParameter(tooltip, "tooltip");
        Intrinsics.checkNotNullParameter(anchorView, "anchorView");
        this.tooltip = tooltip;
        if (!anchorView.isLaidOut() || anchorView.isLayoutRequested()) {
            anchorView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.checkoutcomposer.split.presentation.tooltip.TooltipWrapper$create$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    t tokenizedEvent$default2;
                    view.removeOnLayoutChangeListener(this);
                    Map<String, TokenizedTrackingInfo> trackingInfo = SplitElementDTO.SplitProductsBlockDTO.PromotedProduct.ProductTooltip.this.getTrackingInfo();
                    if (trackingInfo != null && (tokenizedEvent$default2 = TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, this.widgetId, null, 2, null)) != null) {
                        TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent$default2, null, 2, null);
                    }
                    this.tooltipView.bind(SplitElementDTO.SplitProductsBlockDTO.PromotedProduct.ProductTooltip.this, anchorX);
                    this.tooltipView.setOnClickListener(new TooltipWrapper$create$1$2(SplitElementDTO.SplitProductsBlockDTO.PromotedProduct.ProductTooltip.this, this));
                    this.computePosition(anchorView);
                    this.windowManager.addView(this.tooltipView, this.tooltipLayoutParams);
                    C10727i.c(K.a(this.lifecycleOwner), null, null, new TooltipWrapper$create$1$3(SplitElementDTO.SplitProductsBlockDTO.PromotedProduct.ProductTooltip.this, this, null), 3);
                }
            });
            return;
        }
        Map<String, TokenizedTrackingInfo> trackingInfo = tooltip.getTrackingInfo();
        if (trackingInfo != null && (tokenizedEvent$default = TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, this.widgetId, null, 2, null)) != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent$default, null, 2, null);
        }
        this.tooltipView.bind(tooltip, anchorX);
        this.tooltipView.setOnClickListener(new TooltipWrapper$create$1$2(tooltip, this));
        computePosition(anchorView);
        this.windowManager.addView(this.tooltipView, this.tooltipLayoutParams);
        C10727i.c(K.a(this.lifecycleOwner), null, null, new TooltipWrapper$create$1$3(tooltip, this, null), 3);
    }

    public final void dismiss() {
        if (isShowing()) {
            this.windowManager.removeView(this.tooltipView);
        }
    }
}
