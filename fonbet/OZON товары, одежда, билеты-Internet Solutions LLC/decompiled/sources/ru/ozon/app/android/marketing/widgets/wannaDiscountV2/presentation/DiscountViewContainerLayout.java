package ru.ozon.app.android.marketing.widgets.wannaDiscountV2.presentation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.common.view.ViewContainerLayout;
import ru.ozon.app.android.marketing.common.view.ViewContainerLayoutHolder;
import ru.ozon.app.android.marketing.widgets.wannaDiscountV2.presentation.vo.WannaDiscountV2VO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.view.atoms.tags.TagAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.tags.TagHolderKt;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0002H\u0016J\u0018\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\bH\u0014J \u0010\u001a\u001a\u00020\u000f2\u0018\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rR\u000e\u0010\u000b\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/presentation/DiscountViewContainerLayout;", "Lru/ozon/app/android/marketing/common/view/ViewContainerLayout;", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/presentation/vo/WannaDiscountV2VO$Discount;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "horizontalMargin", "discountClickListener", "Lkotlin/Function2;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "createView", "Landroid/view/View;", "params", "Landroid/widget/LinearLayout$LayoutParams;", "createViewHolder", "Lru/ozon/app/android/marketing/common/view/ViewContainerLayoutHolder;", "view", "item", "applyMargin", "index", "setTagClickListener", "tagClickListener", "DiscountViewLayoutHolder", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DiscountViewContainerLayout extends ViewContainerLayout<WannaDiscountV2VO.Discount> {
    private Function2<? super Integer, ? super AtomAction, Unit> discountClickListener;
    private final int horizontalMargin;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/presentation/DiscountViewContainerLayout$DiscountViewLayoutHolder;", "Lru/ozon/app/android/marketing/common/view/ViewContainerLayoutHolder;", "view", "Landroid/view/View;", "<init>", "(Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/presentation/DiscountViewContainerLayout;Landroid/view/View;)V", "tagView", "Lru/ozon/uni/android/uikit/view/atoms/tags/TagAtomView;", "bind", "", "item", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/presentation/vo/WannaDiscountV2VO$Discount;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class DiscountViewLayoutHolder extends ViewContainerLayoutHolder {

        @NotNull
        private final TagAtomView tagView;
        final /* synthetic */ DiscountViewContainerLayout this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DiscountViewLayoutHolder(@NotNull DiscountViewContainerLayout discountViewContainerLayout, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.this$0 = discountViewContainerLayout;
            View itemView = getItemView();
            Intrinsics.g(itemView, "null cannot be cast to non-null type ru.ozon.uni.android.uikit.view.atoms.tags.TagAtomView");
            this.tagView = (TagAtomView) itemView;
        }

        public final void bind(@NotNull WannaDiscountV2VO.Discount item) {
            Intrinsics.checkNotNullParameter(item, "item");
            TagHolderKt.bind(this.tagView, item.getDiscount(), new DiscountViewContainerLayout$DiscountViewLayoutHolder$bind$1(item, this.this$0, this));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DiscountViewContainerLayout(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // ru.ozon.app.android.marketing.common.view.ViewContainerLayout
    protected void applyMargin(@NotNull LinearLayout.LayoutParams params, int index) {
        Intrinsics.checkNotNullParameter(params, "params");
        int itemCount = itemCount();
        if (itemCount == 1) {
            params.setMarginStart(0);
            params.setMarginEnd(0);
            return;
        }
        int i11 = this.horizontalMargin;
        if (index == 0) {
            params.setMarginStart(0);
            params.setMarginEnd(i11 / 2);
        } else if (index == itemCount - 1) {
            params.setMarginStart(i11 / 2);
            params.setMarginEnd(0);
        } else {
            int i12 = i11 / 2;
            params.setMarginStart(i12);
            params.setMarginEnd(i12);
        }
    }

    @Override // ru.ozon.app.android.marketing.common.view.ViewContainerLayout
    @NotNull
    public View createView(@NotNull LinearLayout.LayoutParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        q qVar = q.f64554a;
        d b11 = N.b(TagAtomView.class);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return qVar.g(b11, context);
    }

    public final void setTagClickListener(@NotNull Function2<? super Integer, ? super AtomAction, Unit> tagClickListener) {
        Intrinsics.checkNotNullParameter(tagClickListener, "tagClickListener");
        this.discountClickListener = tagClickListener;
    }

    public /* synthetic */ DiscountViewContainerLayout(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    @Override // ru.ozon.app.android.marketing.common.view.ViewContainerLayout
    @NotNull
    public ViewContainerLayoutHolder createViewHolder(@NotNull View view, @NotNull WannaDiscountV2VO.Discount item) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(item, "item");
        DiscountViewLayoutHolder discountViewLayoutHolder = new DiscountViewLayoutHolder(this, view);
        discountViewLayoutHolder.bind(item);
        return discountViewLayoutHolder;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiscountViewContainerLayout(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.horizontalMargin = ResourceExtKt.toPx(4);
    }
}
