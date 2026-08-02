package ru.ozon.app.android.storefront.widgets.financeHeaderWidget.presentation;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.J;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.financeHeaderWidget.presentation.FinanceHeaderVO;
import ru.ozon.app.android.storefront.widgets.financeHeaderWidget.presentation.FinanceTooltipPopup;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\"\u0010\u001f\u001a\u0010\u0012\f\u0012\n \u001e*\u0004\u0018\u00010\u00020\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001c\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00120\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010 ¨\u0006#"}, d2 = {"Lru/ozon/app/android/storefront/widgets/financeHeaderWidget/presentation/FinanceTooltipHelper;", "", "Landroidx/fragment/app/m;", "fragment", "<init>", "(Landroidx/fragment/app/m;)V", "Lru/ozon/app/android/storefront/widgets/financeHeaderWidget/presentation/FinanceHeaderVO$TooltipVO;", "tooltipVO", "", "onShowTooltipInternal", "(Lru/ozon/app/android/storefront/widgets/financeHeaderWidget/presentation/FinanceHeaderVO$TooltipVO;)V", "Landroid/content/Context;", "context", "", "anchorWidth", "Lru/ozon/app/android/storefront/widgets/financeHeaderWidget/presentation/FinanceTooltipPopup;", "buildTooltip", "(Landroid/content/Context;Lru/ozon/app/android/storefront/widgets/financeHeaderWidget/presentation/FinanceHeaderVO$TooltipVO;I)Lru/ozon/app/android/storefront/widgets/financeHeaderWidget/presentation/FinanceTooltipPopup;", "Landroid/view/View;", "anchor", "onShowTooltip", "(Lru/ozon/app/android/storefront/widgets/financeHeaderWidget/presentation/FinanceHeaderVO$TooltipVO;Landroid/view/View;)V", "onDestroy", "()V", "tooltip", "Lru/ozon/app/android/storefront/widgets/financeHeaderWidget/presentation/FinanceTooltipPopup;", "Ljava/lang/Runnable;", "showTooltipRunnable", "Ljava/lang/Runnable;", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "fragmentRef", "Ljava/lang/ref/WeakReference;", "anchorRef", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FinanceTooltipHelper {

    @NotNull
    private WeakReference<View> anchorRef;

    @NotNull
    private final WeakReference<ComponentCallbacksC5392m> fragmentRef;
    private Runnable showTooltipRunnable;
    private FinanceTooltipPopup tooltip;
    public static final int $stable = 8;
    private static final int horizontalMargin = ResourceExtKt.toPx(16);
    private static final float radius = UiExtKt.toPxF(16);
    private static final int verticalBeakMargin = ResourceExtKt.toPx(4);
    private static final int horizontalPadding = ResourceExtKt.toPx(12);

    public FinanceTooltipHelper(@NotNull ComponentCallbacksC5392m fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.fragmentRef = new WeakReference<>(fragment);
        this.anchorRef = new WeakReference<>(null);
    }

    private final FinanceTooltipPopup buildTooltip(Context context, FinanceHeaderVO.TooltipVO tooltipVO, int anchorWidth) {
        return new FinanceTooltipPopup.Builder(context).setTooltip(tooltipVO).setPaddings(horizontalPadding).setHorizontalMargin(horizontalMargin).setMarginFromAnchor(verticalBeakMargin).setRadius(radius).setAnchorWidth(anchorWidth).build();
    }

    private final void onShowTooltipInternal(FinanceHeaderVO.TooltipVO tooltipVO) {
        J viewLifecycleOwner;
        AbstractC5434v lifecycle;
        View view = this.anchorRef.get();
        if (view == null) {
            return;
        }
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        FinanceTooltipPopup buildTooltip = buildTooltip(context, tooltipVO, view.getMeasuredWidth());
        ComponentCallbacksC5392m componentCallbacksC5392m = this.fragmentRef.get();
        if (componentCallbacksC5392m != null && (viewLifecycleOwner = componentCallbacksC5392m.getViewLifecycleOwner()) != null && (lifecycle = viewLifecycleOwner.getLifecycle()) != null) {
            lifecycle.a(buildTooltip);
        }
        this.tooltip = buildTooltip;
        if (buildTooltip != null) {
            buildTooltip.showForAWhile(view, tooltipVO.getDurationMillis());
        }
    }

    public final void onDestroy() {
        View view = this.anchorRef.get();
        if (view != null) {
            view.removeCallbacks(this.showTooltipRunnable);
        }
    }

    public final void onShowTooltip(@NotNull FinanceHeaderVO.TooltipVO tooltipVO, @NotNull View anchor) {
        Intrinsics.checkNotNullParameter(tooltipVO, "tooltipVO");
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        this.anchorRef = new WeakReference<>(anchor);
        onShowTooltipInternal(tooltipVO);
    }
}
