package ru.ozon.app.android.fresh.geo.widgets.orderInfo.presentation;

import FK.a;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.fresh.geo.databinding.WidgetOrderInfoBinding;
import ru.ozon.app.android.fresh.geo.widgets.orderInfo.presentation.OrderInfoVO;
import ru.ozon.app.android.fresh.geo.widgets.orderInfo.presentation.items.OrderInfoItemsAdapter;
import ru.ozon.app.android.fresh.geo.widgets.orderInfo.presentation.items.OrderProductsDecorator;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintLayoutExtKt;
import ru.ozon.uni.android.uikitsdk.ext.TextViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u001e2\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0001\u001eB\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000e0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/fresh/geo/widgets/orderInfo/presentation/OrderInfoViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/fresh/geo/widgets/orderInfo/presentation/OrderInfoVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/fresh/geo/databinding/WidgetOrderInfoBinding;", "binding", "Lru/ozon/app/android/fresh/geo/widgets/orderInfo/presentation/items/OrderProductsDecorator;", "itemsDecorator", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "<init>", "(Lru/ozon/app/android/fresh/geo/databinding/WidgetOrderInfoBinding;Lru/ozon/app/android/fresh/geo/widgets/orderInfo/presentation/items/OrderProductsDecorator;Lru/ozon/app/android/composer/ComposerReferences;)V", "Lru/ozon/app/android/fresh/geo/widgets/orderInfo/presentation/OrderInfoVO$AlignmentType;", "alignmentType", "", "setupAlignment", "(Lru/ozon/app/android/fresh/geo/widgets/orderInfo/presentation/OrderInfoVO$AlignmentType;)V", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/fresh/geo/widgets/orderInfo/presentation/OrderInfoVO;Ll20/d;)V", "Lru/ozon/app/android/fresh/geo/databinding/WidgetOrderInfoBinding;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/fresh/geo/widgets/orderInfo/presentation/items/OrderInfoItemsAdapter;", "orderInfoItemsAdapter", "Lru/ozon/app/android/fresh/geo/widgets/orderInfo/presentation/items/OrderInfoItemsAdapter;", "Companion", "widgets-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class OrderInfoViewHolder extends k<OrderInfoVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetOrderInfoBinding binding;

    @NotNull
    private final OrderInfoItemsAdapter orderInfoItemsAdapter;

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int onlySubtitleTopRvMargin = UiExtKt.toPx(4);
    private static final int defaultTopRvMargin = UiExtKt.toPx(12);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/fresh/geo/widgets/orderInfo/presentation/OrderInfoViewHolder$Companion;", "", "<init>", "()V", "widgets-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
    public OrderInfoViewHolder(@NotNull WidgetOrderInfoBinding binding, @NotNull OrderProductsDecorator itemsDecorator, @NotNull ComposerReferences references) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(itemsDecorator, "itemsDecorator");
        Intrinsics.checkNotNullParameter(references, "references");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.actionHandler = new ActionHandler.Builder(references, this).buildHandler();
        OrderInfoItemsAdapter orderInfoItemsAdapter = new OrderInfoItemsAdapter(new OrderInfoViewHolder$orderInfoItemsAdapter$1(this), references.getContainer().g());
        this.orderInfoItemsAdapter = orderInfoItemsAdapter;
        final RecyclerView recyclerView = binding.orderProducts;
        recyclerView.setAdapter(orderInfoItemsAdapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(binding.getConstraintLayout().getContext());
        linearLayoutManager.setOrientation(0);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setRecycledViewPool(references.getComposerViewPoolProvider().getViewPool());
        recyclerView.addItemDecoration(itemsDecorator);
        final GestureDetector gestureDetector = new GestureDetector(recyclerView.getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: ru.ozon.app.android.fresh.geo.widgets.orderInfo.presentation.OrderInfoViewHolder$1$gestureDetector$1
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onSingleTapUp(MotionEvent event) {
                Function1 function1;
                Intrinsics.checkNotNullParameter(event, "event");
                OrderInfoVO boundData = OrderInfoViewHolder.this.getBoundData();
                if (boundData == null || recyclerView.findChildViewUnder(event.getX(), event.getY()) != null) {
                    return false;
                }
                AtomAction productsListAction = boundData.getProductsListAction();
                if (productsListAction != null) {
                    function1 = OrderInfoViewHolder.this.actionHandler;
                    function1.invoke(productsListAction);
                }
                return productsListAction != null;
            }
        });
        recyclerView.addOnItemTouchListener(new RecyclerView.y() { // from class: ru.ozon.app.android.fresh.geo.widgets.orderInfo.presentation.OrderInfoViewHolder$1$2
            @Override // androidx.recyclerview.widget.RecyclerView.s
            public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent event) {
                Intrinsics.checkNotNullParameter(rv, "rv");
                Intrinsics.checkNotNullParameter(event, "event");
                gestureDetector.onTouchEvent(event);
                return false;
            }
        });
        int i11 = 2;
        Iterator it = C7714v.b0(binding.title, binding.subtitle, binding.orderInfoWidgetId).iterator();
        while (it.hasNext()) {
            ((View) it.next()).setOnClickListener(new a(this, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$7$lambda$6$lambda$5(OrderInfoViewHolder orderInfoViewHolder, AtomAction atomAction, View view) {
        orderInfoViewHolder.actionHandler.invoke(atomAction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$4$lambda$3$lambda$2(OrderInfoViewHolder orderInfoViewHolder, View view) {
        AtomAction orderInfoAction;
        OrderInfoVO boundData = orderInfoViewHolder.getBoundData();
        if (boundData == null || (orderInfoAction = boundData.getOrderInfoAction()) == null) {
            return;
        }
        orderInfoViewHolder.actionHandler.invoke(orderInfoAction);
    }

    private final void setupAlignment(OrderInfoVO.AlignmentType alignmentType) {
        int id2;
        WidgetOrderInfoBinding widgetOrderInfoBinding = this.binding;
        if (alignmentType == OrderInfoVO.AlignmentType.ONLY_SUBTITLE) {
            RecyclerView orderProducts = widgetOrderInfoBinding.orderProducts;
            Intrinsics.checkNotNullExpressionValue(orderProducts, "orderProducts");
            ViewGroup.LayoutParams layoutParams = orderProducts.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = onlySubtitleTopRvMargin;
            orderProducts.setLayoutParams(marginLayoutParams);
            id2 = widgetOrderInfoBinding.subtitle.getId();
        } else {
            RecyclerView orderProducts2 = widgetOrderInfoBinding.orderProducts;
            Intrinsics.checkNotNullExpressionValue(orderProducts2, "orderProducts");
            ViewGroup.LayoutParams layoutParams2 = orderProducts2.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams2.topMargin = defaultTopRvMargin;
            orderProducts2.setLayoutParams(marginLayoutParams2);
            id2 = widgetOrderInfoBinding.title.getId();
        }
        ConstraintLayout constraintLayout = widgetOrderInfoBinding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        ConstraintLayoutExtKt.updateConstraints(constraintLayout, new OrderInfoViewHolder$setupAlignment$1$1(widgetOrderInfoBinding, id2));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull OrderInfoVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetOrderInfoBinding widgetOrderInfoBinding = this.binding;
        TextAtomV2View subtitle = widgetOrderInfoBinding.subtitle;
        Intrinsics.checkNotNullExpressionValue(subtitle, "subtitle");
        TextHolderKt.bindOrGone$default(subtitle, item.getSubtitle(), null, 2, null);
        TextAtomV2View subtitle2 = widgetOrderInfoBinding.subtitle;
        Intrinsics.checkNotNullExpressionValue(subtitle2, "subtitle");
        TextViewExtKt.setTextCopyable(subtitle2, false);
        TextAtomV2View title = widgetOrderInfoBinding.title;
        Intrinsics.checkNotNullExpressionValue(title, "title");
        TextHolderKt.bindOrGone$default(title, item.getTitle(), null, 2, null);
        TextAtomV2View title2 = widgetOrderInfoBinding.title;
        Intrinsics.checkNotNullExpressionValue(title2, "title");
        TextViewExtKt.setTextCopyable(title2, false);
        BadgeView headerButton = widgetOrderInfoBinding.headerButton;
        Intrinsics.checkNotNullExpressionValue(headerButton, "headerButton");
        BadgeHolderKt.bindOrGone(headerButton, item.getHeaderButton(), this.actionHandler);
        TextAtomV2View rightHeaderText = widgetOrderInfoBinding.rightHeaderText;
        Intrinsics.checkNotNullExpressionValue(rightHeaderText, "rightHeaderText");
        TextHolderKt.bindOrGone$default(rightHeaderText, item.getRightHeaderText(), null, 2, null);
        AtomAction rightHeaderTextAction = item.getRightHeaderTextAction();
        if (rightHeaderTextAction != null) {
            widgetOrderInfoBinding.rightHeaderText.setOnClickListener(new Hv.a(0, this, rightHeaderTextAction));
        } else {
            widgetOrderInfoBinding.rightHeaderText.setOnClickListener(null);
        }
        if (item.getRightHeaderText() != null && item.getHeaderButton() != null) {
            TextAtomV2View rightHeaderText2 = widgetOrderInfoBinding.rightHeaderText;
            Intrinsics.checkNotNullExpressionValue(rightHeaderText2, "rightHeaderText");
            ViewExtKt.gone(rightHeaderText2);
        }
        setupAlignment(item.getAlignmentType());
        this.orderInfoItemsAdapter.submitList(item.getItems());
    }
}
