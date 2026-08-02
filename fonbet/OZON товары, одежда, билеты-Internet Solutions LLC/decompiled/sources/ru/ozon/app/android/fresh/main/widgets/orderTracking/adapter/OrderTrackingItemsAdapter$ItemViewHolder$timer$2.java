package ru.ozon.app.android.fresh.main.widgets.orderTracking.adapter;

import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.fresh.main.R$string;
import ru.ozon.app.android.fresh.main.databinding.WidgetFreshOrderTrackingItemBinding;
import ru.ozon.app.android.fresh.main.utils.OrderLifecycleTimer;
import ru.ozon.app.android.fresh.main.widgets.orderTracking.adapter.OrderTrackingItemsAdapter;
import ru.ozon.app.android.fresh.main.widgets.orderTracking.presentation.OrderTrackingVO;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/fresh/main/utils/OrderLifecycleTimer;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class OrderTrackingItemsAdapter$ItemViewHolder$timer$2 extends AbstractC7737t implements Function0<OrderLifecycleTimer> {
    final /* synthetic */ OrderTrackingItemsAdapter this$0;
    final /* synthetic */ OrderTrackingItemsAdapter.ItemViewHolder this$1;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "formattedTimeLeft", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.fresh.main.widgets.orderTracking.adapter.OrderTrackingItemsAdapter$ItemViewHolder$timer$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<String, Unit> {
        final /* synthetic */ OrderTrackingItemsAdapter.ItemViewHolder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(OrderTrackingItemsAdapter.ItemViewHolder itemViewHolder) {
            super(1);
            this.this$0 = itemViewHolder;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String formattedTimeLeft) {
            WidgetFreshOrderTrackingItemBinding widgetFreshOrderTrackingItemBinding;
            OrderTrackingVO.Item item;
            Badge badge;
            Intrinsics.checkNotNullParameter(formattedTimeLeft, "formattedTimeLeft");
            widgetFreshOrderTrackingItemBinding = this.this$0.binding;
            BadgeView badgeView = widgetFreshOrderTrackingItemBinding.orderTrackingBadgeView;
            item = this.this$0._item;
            badgeView.setText(((item == null || (badge = item.getBadge()) == null) ? null : badge.getText()) + " " + formattedTimeLeft);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.fresh.main.widgets.orderTracking.adapter.OrderTrackingItemsAdapter$ItemViewHolder$timer$2$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function0<Unit> {
        final /* synthetic */ OrderTrackingItemsAdapter.ItemViewHolder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(OrderTrackingItemsAdapter.ItemViewHolder itemViewHolder) {
            super(0);
            this.this$0 = itemViewHolder;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            OrderTrackingVO.Item item;
            WidgetFreshOrderTrackingItemBinding widgetFreshOrderTrackingItemBinding;
            WidgetFreshOrderTrackingItemBinding widgetFreshOrderTrackingItemBinding2;
            item = this.this$0._item;
            if (item != null) {
                widgetFreshOrderTrackingItemBinding2 = this.this$0.binding;
                BadgeView orderTrackingBadgeView = widgetFreshOrderTrackingItemBinding2.orderTrackingBadgeView;
                Intrinsics.checkNotNullExpressionValue(orderTrackingBadgeView, "orderTrackingBadgeView");
                BadgeHolderKt.bind$default(orderTrackingBadgeView, item.getBadge(), (Function1) null, 2, (Object) null);
            }
            widgetFreshOrderTrackingItemBinding = this.this$0.binding;
            widgetFreshOrderTrackingItemBinding.orderTrackingTitleTA.setText(StringProvider.getString(R$string.order_tracking_pay_deadline_is_over_text));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OrderTrackingItemsAdapter$ItemViewHolder$timer$2(OrderTrackingItemsAdapter orderTrackingItemsAdapter, OrderTrackingItemsAdapter.ItemViewHolder itemViewHolder) {
        super(0);
        this.this$0 = orderTrackingItemsAdapter;
        this.this$1 = itemViewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final OrderLifecycleTimer invoke() {
        J j11;
        j11 = this.this$0.lifecycleOwner;
        return new OrderLifecycleTimer(j11, new AnonymousClass1(this.this$1), new AnonymousClass2(this.this$1));
    }
}
