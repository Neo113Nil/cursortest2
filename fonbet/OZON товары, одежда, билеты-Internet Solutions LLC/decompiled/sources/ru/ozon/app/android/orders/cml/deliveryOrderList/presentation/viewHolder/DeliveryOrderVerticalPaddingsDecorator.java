package ru.ozon.app.android.orders.cml.deliveryOrderList.presentation.viewHolder;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import m10.l;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.orders.cml.common.data.VerticalPadding;
import ru.ozon.app.android.orders.cml.deliveryOrderList.presentation.viewItem.DeliveryOrderVO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ/\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/orders/cml/deliveryOrderList/presentation/viewHolder/DeliveryOrderVerticalPaddingsDecorator;", "Landroidx/recyclerview/widget/RecyclerView$n;", "<init>", "()V", "Lm10/l;", "adapter", "", "position", "", "isFirstVO", "(Lm10/l;I)Z", "isLastVO", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "Companion", "orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DeliveryOrderVerticalPaddingsDecorator extends RecyclerView.n {
    private static final int BETWEEN_MARGIN = UiExtKt.toPx(8);

    private final boolean isFirstVO(l adapter, int position) {
        if (position == 0) {
            return true;
        }
        return !(adapter.b(position - 1) instanceof DeliveryOrderVO);
    }

    private final boolean isLastVO(l adapter, int position) {
        if (position == adapter.getItemCount() - 1) {
            return true;
        }
        return !(adapter.b(position + 1) instanceof DeliveryOrderVO);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        CommonCellSettings.LayoutPadding bottom;
        CommonCellSettings.LayoutPadding top;
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
        DeliveryOrderVO deliveryOrderVO = b11 instanceof DeliveryOrderVO ? (DeliveryOrderVO) b11 : null;
        if (deliveryOrderVO == null) {
            return;
        }
        boolean isFirstVO = isFirstVO(lVar, childAdapterPosition);
        boolean isLastVO = isLastVO(lVar, childAdapterPosition);
        if (isFirstVO) {
            VerticalPadding verticalPadding = deliveryOrderVO.getVerticalPadding();
            if (verticalPadding == null || (top = verticalPadding.getTop()) == null) {
                return;
            }
            int cellLayoutPadding = top.getCellLayoutPadding();
            Intrinsics.f(context);
            outRect.top = ResourceExtKt.dim(context, cellLayoutPadding);
            return;
        }
        if (!isLastVO) {
            outRect.top = BETWEEN_MARGIN;
            return;
        }
        VerticalPadding verticalPadding2 = deliveryOrderVO.getVerticalPadding();
        if (verticalPadding2 != null && (bottom = verticalPadding2.getBottom()) != null) {
            int cellLayoutPadding2 = bottom.getCellLayoutPadding();
            Intrinsics.f(context);
            outRect.bottom = ResourceExtKt.dim(context, cellLayoutPadding2);
        }
        outRect.top = BETWEEN_MARGIN;
    }
}
