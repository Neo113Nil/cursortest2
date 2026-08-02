package ru.ozon.app.android.fresh.geo.widgets.orderInfo.presentation.items;

import Sc.InterfaceC4008j;
import Sc.k;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0017\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/fresh/geo/widgets/orderInfo/presentation/items/OrderProductsDecorator;", "Landroidx/recyclerview/widget/RecyclerView$n;", "<init>", "()V", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "", "betweenMargin$delegate", "LSc/j;", "getBetweenMargin", "()I", "betweenMargin", "edgeMargin$delegate", "getEdgeMargin", "edgeMargin", "widgets-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class OrderProductsDecorator extends RecyclerView.n {

    /* renamed from: betweenMargin$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j betweenMargin = k.b(OrderProductsDecorator$betweenMargin$2.INSTANCE);

    /* renamed from: edgeMargin$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j edgeMargin = k.b(OrderProductsDecorator$edgeMargin$2.INSTANCE);

    private final int getBetweenMargin() {
        return ((Number) this.betweenMargin.getValue()).intValue();
    }

    private final int getEdgeMargin() {
        return ((Number) this.edgeMargin.getValue()).intValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        int childAdapterPosition;
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        RecyclerView.o layoutManager = parent.getLayoutManager();
        if (layoutManager == null || (childAdapterPosition = parent.getChildAdapterPosition(view)) == -1) {
            return;
        }
        int itemCount = layoutManager.getItemCount();
        outRect.left = getBetweenMargin();
        outRect.right = getBetweenMargin();
        if (childAdapterPosition == 0) {
            outRect.left = getEdgeMargin();
        } else if (childAdapterPosition == itemCount - 1) {
            outRect.right = getEdgeMargin();
        }
    }
}
