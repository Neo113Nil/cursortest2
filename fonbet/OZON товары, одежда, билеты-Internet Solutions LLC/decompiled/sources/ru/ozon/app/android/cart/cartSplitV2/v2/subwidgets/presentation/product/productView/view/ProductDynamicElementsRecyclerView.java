package ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.product.productView.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.cartSplitV2.v2.dynamicElementV2.DynamicElementVOV2;
import ru.ozon.app.android.cart.cartSplitV2.v2.dynamicElementV2.DynamicElementVOV2Kt;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\f\u0010\u000f\u001a\u00020\u000b*\u00020\rH\u0002¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/product/productView/view/ProductDynamicElementsRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "context", "Landroid/content/Context;", "attr", "Landroid/util/AttributeSet;", "defStileAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "onTouchEvent", "", "e", "Landroid/view/MotionEvent;", "onInterceptTouchEvent", "needProcessByViewHolder", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ProductDynamicElementsRecyclerView extends RecyclerView {
    public /* synthetic */ ProductDynamicElementsRecyclerView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final boolean needProcessByViewHolder(MotionEvent motionEvent) {
        RecyclerView.C findContainingViewHolder;
        View findChildViewUnder = findChildViewUnder(motionEvent.getX(), motionEvent.getY());
        if (findChildViewUnder != null && (findContainingViewHolder = findContainingViewHolder(findChildViewUnder)) != null) {
            Integer valueOf = Integer.valueOf(findContainingViewHolder.getAdapterPosition());
            if (valueOf.intValue() == -1) {
                valueOf = null;
            }
            if (valueOf != null) {
                int intValue = valueOf.intValue();
                RecyclerView.g adapter = getAdapter();
                t tVar = adapter instanceof t ? (t) adapter : null;
                if (tVar == null) {
                    return false;
                }
                Object obj = tVar.getCurrentList().get(intValue);
                DynamicElementVOV2 dynamicElementVOV2 = obj instanceof DynamicElementVOV2 ? (DynamicElementVOV2) obj : null;
                if (dynamicElementVOV2 != null) {
                    return DynamicElementVOV2Kt.getHasAction(dynamicElementVOV2);
                }
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull MotionEvent e11) {
        Intrinsics.checkNotNullParameter(e11, "e");
        return !needProcessByViewHolder(e11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(@NotNull MotionEvent e11) {
        Intrinsics.checkNotNullParameter(e11, "e");
        return needProcessByViewHolder(e11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductDynamicElementsRecyclerView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        setNestedScrollingEnabled(false);
    }
}
