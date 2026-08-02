package ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.badge;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import jk0.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.StaticCouponListVO;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.adapter.StaticCouponListContentAdapterDelegate;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.badge.StaticCouponListTimerFormatter;
import ru.ozon.app.android.travel.utils.timerFlow.TimerFlow;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/badge/StaticCouponListBadgeDelegate;", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/adapter/StaticCouponListContentAdapterDelegate;", "Lru/ozon/app/android/travel/utils/timerFlow/TimerFlow;", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/badge/StaticCouponListTimerFormatter$Time;", DynamicElementDTO.TIMER, "<init>", "(Lru/ozon/app/android/travel/utils/timerFlow/TimerFlow;)V", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO$ContentItem;", "item", "", "canHandle", "(Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO$ContentItem;)Z", "Landroid/view/ViewGroup;", "parent", "Ljk0/j;", "onCreateViewHolder", "(Landroid/view/ViewGroup;)Ljk0/j;", "Lru/ozon/app/android/travel/utils/timerFlow/TimerFlow;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class StaticCouponListBadgeDelegate extends StaticCouponListContentAdapterDelegate {
    public static final int $stable = TimerFlow.$stable;

    @NotNull
    private final TimerFlow<StaticCouponListTimerFormatter.Time> timer;

    public StaticCouponListBadgeDelegate(@NotNull TimerFlow<StaticCouponListTimerFormatter.Time> timer) {
        Intrinsics.checkNotNullParameter(timer, "timer");
        this.timer = timer;
    }

    @Override // ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.adapter.StaticCouponListContentAdapterDelegate
    public boolean canHandle(@NotNull StaticCouponListVO.ContentItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return item instanceof StaticCouponListVO.ContentItem.Badge;
    }

    @Override // ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.adapter.StaticCouponListContentAdapterDelegate
    @NotNull
    public j onCreateViewHolder(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int px = ResourceExtKt.toPx(6, context);
        Context context2 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int px2 = ResourceExtKt.toPx(2, context2);
        Context context3 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        int px3 = ResourceExtKt.toPx(12, context3);
        Context context4 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        StaticCouponListBadgeView staticCouponListBadgeView = new StaticCouponListBadgeView(context4);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(px3, px3, px3, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        staticCouponListBadgeView.setLayoutParams(layoutParams);
        staticCouponListBadgeView.setPadding(px, px2, px, px2);
        return new StaticCouponListBadgeViewHolder(staticCouponListBadgeView, this.timer);
    }
}
