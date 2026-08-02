package ru.ozon.app.android.cart.cartSplitV2.v2.dynamicElementV2.decorations;

import E0.C2942q;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.cartSplitV2.v2.dynamicElementV2.SpacingDynamicElement;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/dynamicElementV2/decorations/VerticalSpacerDecoration;", "Landroidx/recyclerview/widget/RecyclerView$n;", "<init>", "()V", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class VerticalSpacerDecoration extends RecyclerView.n {
    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        RecyclerView.C findContainingViewHolder;
        int adapterPosition;
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        RecyclerView.g a11 = C2942q.a(parent, "parent", state, "state");
        t tVar = a11 instanceof t ? (t) a11 : null;
        if (tVar == null || (findContainingViewHolder = parent.findContainingViewHolder(view)) == null || (adapterPosition = findContainingViewHolder.getAdapterPosition()) < 0) {
            return;
        }
        List currentList = tVar.getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "getCurrentList(...)");
        if (adapterPosition > C7714v.P(currentList)) {
            return;
        }
        Object obj = tVar.getCurrentList().get(adapterPosition);
        SpacingDynamicElement spacingDynamicElement = obj instanceof SpacingDynamicElement ? (SpacingDynamicElement) obj : null;
        if (spacingDynamicElement == null) {
            return;
        }
        outRect.set(0, ResourceExtKt.toPx(spacingDynamicElement.getAboveSpace()), 0, ResourceExtKt.toPx(spacingDynamicElement.getBelowSpace()));
    }
}
