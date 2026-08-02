package ru.ozon.app.android.orderdetails.productsToPay.presentation.productstopay.viewHolder;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import m10.l;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.orderdetails.productsToPay.presentation.productstopay.viewItem.ProductsToPayVO;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ/\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/orderdetails/productsToPay/presentation/productstopay/viewHolder/ProductsToPayVerticalPaddingsDecorator;", "Landroidx/recyclerview/widget/RecyclerView$n;", "<init>", "()V", "Lm10/l;", "adapter", "", "position", "", "isFirstProductsToPayVO", "(Lm10/l;I)Z", "isLastProductsToPayVO", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ProductsToPayVerticalPaddingsDecorator extends RecyclerView.n {
    private final boolean isFirstProductsToPayVO(l adapter, int position) {
        for (int i11 = 0; i11 < position; i11++) {
            if (adapter.b(i11) instanceof ProductsToPayVO) {
                return false;
            }
        }
        return true;
    }

    private final boolean isLastProductsToPayVO(l adapter, int position) {
        int itemCount = adapter.getItemCount();
        for (int i11 = position + 1; i11 < itemCount; i11++) {
            if (adapter.b(i11) instanceof ProductsToPayVO) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        Context context = parent.getContext();
        Object adapter = parent.getAdapter();
        l lVar = adapter instanceof l ? (l) adapter : null;
        if (lVar == null) {
            return;
        }
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        c b11 = lVar.b(childAdapterPosition);
        ProductsToPayVO productsToPayVO = b11 instanceof ProductsToPayVO ? (ProductsToPayVO) b11 : null;
        if (productsToPayVO == null) {
            return;
        }
        boolean isFirstProductsToPayVO = isFirstProductsToPayVO(lVar, childAdapterPosition);
        boolean isLastProductsToPayVO = isLastProductsToPayVO(lVar, childAdapterPosition);
        if (isFirstProductsToPayVO || isLastProductsToPayVO) {
            ProductsToPayVO.VerticalPadding verticalPadding = productsToPayVO.getVerticalPadding();
            int dimension = verticalPadding != null ? (int) context.getResources().getDimension(verticalPadding.getTopPaddingResId()) : 0;
            ProductsToPayVO.VerticalPadding verticalPadding2 = productsToPayVO.getVerticalPadding();
            int dimension2 = verticalPadding2 != null ? (int) context.getResources().getDimension(verticalPadding2.getBottomPaddingResId()) : 0;
            outRect.top = dimension;
            outRect.bottom = dimension2;
        }
    }
}
