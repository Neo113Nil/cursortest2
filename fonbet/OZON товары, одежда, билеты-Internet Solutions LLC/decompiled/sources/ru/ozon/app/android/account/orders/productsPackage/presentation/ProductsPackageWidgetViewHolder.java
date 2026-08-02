package ru.ozon.app.android.account.orders.productsPackage.presentation;

import android.content.Context;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.cs_orders.databinding.WidgetProductsPackageBinding;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/account/orders/productsPackage/presentation/ProductsPackageWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/account/orders/productsPackage/presentation/ProductsPackageVO;", "Lru/ozon/app/android/cs_orders/databinding/WidgetProductsPackageBinding;", "binding", "Lru/ozon/app/android/composer/ComposerNavigator;", "navigator", "<init>", "(Lru/ozon/app/android/cs_orders/databinding/WidgetProductsPackageBinding;Lru/ozon/app/android/composer/ComposerNavigator;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/account/orders/productsPackage/presentation/ProductsPackageVO;Ll20/d;)V", "Lru/ozon/app/android/account/orders/productsPackage/presentation/ProductsPackageAdapter;", "adapter", "Lru/ozon/app/android/account/orders/productsPackage/presentation/ProductsPackageAdapter;", "getAdapter", "()Lru/ozon/app/android/account/orders/productsPackage/presentation/ProductsPackageAdapter;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ProductsPackageWidgetViewHolder extends k<ProductsPackageVO> {

    @NotNull
    private final ProductsPackageAdapter adapter;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ProductsPackageWidgetViewHolder(@NotNull WidgetProductsPackageBinding binding, @NotNull ComposerNavigator navigator) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        CardView constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        ProductsPackageAdapter productsPackageAdapter = new ProductsPackageAdapter(navigator);
        this.adapter = productsPackageAdapter;
        RecyclerView recyclerView = binding.productsPackageRv;
        recyclerView.setAdapter(productsPackageAdapter);
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        recyclerView.addItemDecoration(new ProductsPackageSellerDecorator(context));
        Context context2 = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        recyclerView.addItemDecoration(new ProductsPackageProductDecorator(context2));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ProductsPackageVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.adapter.setItems(item.getProductsPackageItems());
    }
}
