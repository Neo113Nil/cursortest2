package ru.ozon.app.android.account.orders.productsPackage.presentation;

import android.content.Context;
import android.view.View;
import androidx.core.content.a;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cs_orders.R$drawable;
import ru.ozon.app.android.uikit.view.recycler.decoration.CustomDividerDecoration;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Lru/ozon/app/android/account/orders/productsPackage/presentation/ProductsPackageProductDecorator;", "Lru/ozon/app/android/uikit/view/recycler/decoration/CustomDividerDecoration;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "drawFor", "", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "child", "Landroid/view/View;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ProductsPackageProductDecorator extends CustomDividerDecoration {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductsPackageProductDecorator(@NotNull Context context) {
        super(context, 1, 0, true, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
        setDivider(a.getDrawable(context, R$drawable.list_divider_with_paddings));
    }

    @Override // ru.ozon.app.android.uikit.view.recycler.decoration.CustomDividerDecoration
    public boolean drawFor(@NotNull RecyclerView parent, @NotNull View child) {
        int childAdapterPosition;
        int childAdapterPosition2;
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        RecyclerView.g adapter = parent.getAdapter();
        ProductsPackageAdapter productsPackageAdapter = adapter instanceof ProductsPackageAdapter ? (ProductsPackageAdapter) adapter : null;
        if (productsPackageAdapter != null && (childAdapterPosition2 = (childAdapterPosition = parent.getChildAdapterPosition(child)) + 1) < productsPackageAdapter.getCardsCount()) {
            return (productsPackageAdapter.getItemViewType(childAdapterPosition) == 20) && (productsPackageAdapter.getItemViewType(childAdapterPosition2) == 20);
        }
        return false;
    }
}
