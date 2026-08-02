package ru.ozon.app.android.storefront.core.socialAtoms.productList.items.allProducts;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.core.atoms.R$id;
import ru.ozon.app.android.storefront.core.socialAtoms.productList.items.ProductListItemViewHolder;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b \u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0004J\f\u0010\u0012\u001a\u00020\f*\u00020\u0013H\u0004J\u001e\u0010\u0014\u001a\u00020\b*\u00020\u00132\u0006\u0010\u0015\u001a\u00020\f2\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0004R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/storefront/core/socialAtoms/productList/items/allProducts/AllProductsViewHolder;", "Lru/ozon/app/android/storefront/core/socialAtoms/productList/items/ProductListItemViewHolder;", "Lru/ozon/app/android/storefront/core/socialAtoms/productList/items/allProducts/AllProductsVO;", "view", "Landroid/view/View;", "onAction", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "<init>", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "horizontalProductCountBigMargin", "", "horizontalProductCountSmallMargin", "verticalTextViewMargin", "coerceAtMostMaxCount", "", "productCount", "getMaxSquareSize", "Landroid/widget/TextView;", "setSquareSize", "size", "requestLayout", "", "Companion", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class AllProductsViewHolder extends ProductListItemViewHolder<AllProductsVO> {
    private final int horizontalProductCountBigMargin;
    private final int horizontalProductCountSmallMargin;
    private final int verticalTextViewMargin;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AllProductsViewHolder(@NotNull View view, @NotNull Function1<? super AtomAction, Unit> onAction) {
        super(view, R$id.allProductsListItem, onAction);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        this.horizontalProductCountBigMargin = ResourceExtKt.toPx(11);
        this.horizontalProductCountSmallMargin = ResourceExtKt.toPx(5);
        this.verticalTextViewMargin = ResourceExtKt.toPx(2);
    }

    public static /* synthetic */ void setSquareSize$default(AllProductsViewHolder allProductsViewHolder, TextView textView, int i11, boolean z11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setSquareSize");
        }
        if ((i12 & 2) != 0) {
            z11 = true;
        }
        allProductsViewHolder.setSquareSize(textView, i11, z11);
    }

    @NotNull
    protected final String coerceAtMostMaxCount(@NotNull String productCount) {
        Intrinsics.checkNotNullParameter(productCount, "productCount");
        Integer w02 = h.w0(productCount);
        return (w02 == null || w02.intValue() <= 99) ? productCount : "99";
    }

    protected final int getMaxSquareSize(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        return Math.max(textView.getMeasuredWidth() + (textView.getText().length() == 1 ? this.horizontalProductCountBigMargin : this.horizontalProductCountSmallMargin), textView.getMeasuredHeight() + this.verticalTextViewMargin);
    }

    protected final void setSquareSize(@NotNull TextView textView, int i11, boolean z11) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        if (!z11) {
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            layoutParams.width = i11;
            layoutParams.height = i11;
        } else {
            ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
            layoutParams2.width = i11;
            layoutParams2.height = i11;
            textView.setLayoutParams(layoutParams2);
        }
    }
}
