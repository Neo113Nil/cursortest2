package ru.ozon.app.android.fresh.main.widgets.orderTracking.adapter;

import Lt.c;
import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import WZ.t;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.content.a;
import androidx.lifecycle.I;
import androidx.lifecycle.J;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.fresh.main.R$layout;
import ru.ozon.app.android.fresh.main.databinding.WidgetFreshOrderTrackingItemBinding;
import ru.ozon.app.android.fresh.main.utils.OrderLifecycleTimer;
import ru.ozon.app.android.fresh.main.widgets.orderTracking.presentation.OrderTrackingVO;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.uikit.view.recycler.adapter.lifecycle.LifecycleListAdapter;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0000\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001!B7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0012\u001a\u00020\u000b2\n\u0010\u0011\u001a\u00060\u0003R\u00020\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0018\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001b\u001a\u00020\u000b2\n\u0010\u0011\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR\u0018\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001eR \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010 ¨\u0006\""}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/orderTracking/adapter/OrderTrackingItemsAdapter;", "Lru/ozon/app/android/uikit/view/recycler/adapter/lifecycle/LifecycleListAdapter;", "Lru/ozon/app/android/fresh/main/widgets/orderTracking/presentation/OrderTrackingVO$Item;", "Lru/ozon/app/android/fresh/main/widgets/orderTracking/adapter/OrderTrackingItemsAdapter$ItemViewHolder;", "Landroid/content/Context;", "context", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Landroidx/lifecycle/J;", "lifecycleOwner", "<init>", "(Landroid/content/Context;LWZ/l;Lkotlin/jvm/functions/Function1;Landroidx/lifecycle/J;)V", "holder", "onViewAttachedToWindow", "(Lru/ozon/app/android/fresh/main/widgets/orderTracking/adapter/OrderTrackingItemsAdapter$ItemViewHolder;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/fresh/main/widgets/orderTracking/adapter/OrderTrackingItemsAdapter$ItemViewHolder;", "position", "onBindViewHolder", "(Lru/ozon/app/android/fresh/main/widgets/orderTracking/adapter/OrderTrackingItemsAdapter$ItemViewHolder;I)V", "Landroid/content/Context;", "LWZ/l;", "Lkotlin/jvm/functions/Function1;", "Landroidx/lifecycle/J;", "ItemViewHolder", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class OrderTrackingItemsAdapter extends LifecycleListAdapter<OrderTrackingVO.Item, ItemViewHolder> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final Context context;

    @NotNull
    private final J lifecycleOwner;

    @NotNull
    private final l tokenizedAnalytics;

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003B#\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0012R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/orderTracking/adapter/OrderTrackingItemsAdapter$ItemViewHolder;", "Ljk0/j;", "Lru/ozon/app/android/uikit/view/recycler/adapter/lifecycle/LifecycleViewHolder;", "Landroidx/lifecycle/I;", "Landroid/view/View;", "containerView", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "<init>", "(Lru/ozon/app/android/fresh/main/widgets/orderTracking/adapter/OrderTrackingItemsAdapter;Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "action", "itemClickListener", "(Lru/ozon/uni/atoms/af/AtomAction;)V", "Lru/ozon/app/android/fresh/main/widgets/orderTracking/presentation/OrderTrackingVO$Item;", "item", "bindBadge", "(Lru/ozon/app/android/fresh/main/widgets/orderTracking/presentation/OrderTrackingVO$Item;)V", "onViewInVisibleBounds", "()V", "bind", "Lkotlin/jvm/functions/Function1;", "_item", "Lru/ozon/app/android/fresh/main/widgets/orderTracking/presentation/OrderTrackingVO$Item;", "Lru/ozon/app/android/fresh/main/databinding/WidgetFreshOrderTrackingItemBinding;", "binding", "Lru/ozon/app/android/fresh/main/databinding/WidgetFreshOrderTrackingItemBinding;", "Lru/ozon/app/android/fresh/main/utils/OrderLifecycleTimer;", "timer$delegate", "LSc/j;", "getTimer", "()Lru/ozon/app/android/fresh/main/utils/OrderLifecycleTimer;", DynamicElementDTO.TIMER, "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class ItemViewHolder extends j implements I {
        private OrderTrackingVO.Item _item;

        @NotNull
        private final Function1<AtomAction, Unit> actionHandler;

        @NotNull
        private final WidgetFreshOrderTrackingItemBinding binding;
        final /* synthetic */ OrderTrackingItemsAdapter this$0;

        /* renamed from: timer$delegate, reason: from kotlin metadata */
        @NotNull
        private final InterfaceC4008j timer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ItemViewHolder(@NotNull OrderTrackingItemsAdapter orderTrackingItemsAdapter, @NotNull View containerView, Function1<? super AtomAction, Unit> actionHandler) {
            super(containerView);
            Intrinsics.checkNotNullParameter(containerView, "containerView");
            Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
            this.this$0 = orderTrackingItemsAdapter;
            this.actionHandler = actionHandler;
            WidgetFreshOrderTrackingItemBinding bind = WidgetFreshOrderTrackingItemBinding.bind(containerView);
            Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
            this.binding = bind;
            this.timer = k.b(new OrderTrackingItemsAdapter$ItemViewHolder$timer$2(orderTrackingItemsAdapter, this));
        }

        private final void bindBadge(OrderTrackingVO.Item item) {
            BadgeView orderTrackingBadgeView = this.binding.orderTrackingBadgeView;
            Intrinsics.checkNotNullExpressionValue(orderTrackingBadgeView, "orderTrackingBadgeView");
            BadgeHolderKt.bind$default(orderTrackingBadgeView, item.getBadge(), (Function1) null, 2, (Object) null);
            if (item.getEndTimeStamp() != null) {
                OrderLifecycleTimer timer = getTimer();
                Long endTimeStamp = item.getEndTimeStamp();
                Intrinsics.f(endTimeStamp);
                timer.bind(endTimeStamp.longValue());
            }
        }

        private final OrderLifecycleTimer getTimer() {
            return (OrderLifecycleTimer) this.timer.getValue();
        }

        private final void itemClickListener(AtomAction action) {
            this.itemView.setOnClickListener(new c(6, action, this));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void itemClickListener$lambda$1(AtomAction atomAction, ItemViewHolder itemViewHolder, View view) {
            itemViewHolder.actionHandler.invoke(atomAction);
        }

        public final void bind(@NotNull OrderTrackingVO.Item item) {
            Intrinsics.checkNotNullParameter(item, "item");
            this._item = item;
            itemClickListener(item.getItemClickAction());
            bindBadge(item);
            ImageView orderTrackingIV = this.binding.orderTrackingIV;
            Intrinsics.checkNotNullExpressionValue(orderTrackingIV, "orderTrackingIV");
            ImageViewExtKt.load$default(orderTrackingIV, item.getImage(), null, null, null, null, false, null, 126, null);
            TextAtomView orderTrackingTitleTA = this.binding.orderTrackingTitleTA;
            Intrinsics.checkNotNullExpressionValue(orderTrackingTitleTA, "orderTrackingTitleTA");
            TextAtomHolderKt.bind$default(orderTrackingTitleTA, item.getTitle(), null, 2, null);
            TextAtomView orderTrackingSubtitleTA = this.binding.orderTrackingSubtitleTA;
            Intrinsics.checkNotNullExpressionValue(orderTrackingSubtitleTA, "orderTrackingSubtitleTA");
            TextAtomHolderKt.bind$default(orderTrackingSubtitleTA, item.getSubtitle(), null, 2, null);
            ImageView orderTrackingArrowIv = this.binding.orderTrackingArrowIv;
            Intrinsics.checkNotNullExpressionValue(orderTrackingArrowIv, "orderTrackingArrowIv");
            ThemeExtKt.tint(orderTrackingArrowIv, Integer.valueOf(a.getColor(this.this$0.context, R$color.oz_semantic_text_quaternary)));
        }

        @Override // jk0.j, lk0.b
        public void onViewInVisibleBounds() {
            t tokenizedEvent;
            super.onViewInVisibleBounds();
            OrderTrackingVO.Item item = this._item;
            if (item == null || (tokenizedEvent = item.getTokenizedEvent()) == null) {
                return;
            }
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.this$0.tokenizedAnalytics, tokenizedEvent, null, 2, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OrderTrackingItemsAdapter(@NotNull Context context, @NotNull l tokenizedAnalytics, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull J lifecycleOwner) {
        super(new OrderTrackingDiffUtil(), lifecycleOwner, null, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.context = context;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.actionHandler = actionHandler;
        this.lifecycleOwner = lifecycleOwner;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull ItemViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        OrderTrackingVO.Item item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public ItemViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ItemViewHolder(this, ViewGroupExtKt.inflate(parent, R$layout.widget_fresh_order_tracking_item), this.actionHandler);
    }

    @Override // jk0.i
    public void onViewAttachedToWindow(@NotNull ItemViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewAttachedToWindow((OrderTrackingItemsAdapter) holder);
        holder.onViewInVisibleBounds();
    }
}
