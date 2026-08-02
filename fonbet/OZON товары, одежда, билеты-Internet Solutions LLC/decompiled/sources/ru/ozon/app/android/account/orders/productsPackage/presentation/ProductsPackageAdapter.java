package ru.ozon.app.android.account.orders.productsPackage.presentation;

import JE.a;
import Sc.o;
import Ve.C4636t5;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.productsPackage.presentation.ProductsPackageItemVO;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.cs_orders.databinding.ItemProductsPackageGiftTitleBinding;
import ru.ozon.app.android.cs_orders.databinding.ItemProductsPackageProductBinding;
import ru.ozon.app.android.cs_orders.databinding.ItemProductsPackageSellerTitleBinding;
import ru.ozon.app.android.cs_orders.databinding.ItemProductsPackageTitleBinding;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0006 !\"#$%B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0019\u001a\u00020\u00132\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001bR(\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010\u001a¨\u0006&"}, d2 = {"Lru/ozon/app/android/account/orders/productsPackage/presentation/ProductsPackageAdapter;", "Landroidx/recyclerview/widget/RecyclerView$g;", "Lru/ozon/app/android/account/orders/productsPackage/presentation/ProductsPackageAdapter$ItemViewHolder;", "Lru/ozon/app/android/composer/ComposerNavigator;", "navigator", "<init>", "(Lru/ozon/app/android/composer/ComposerNavigator;)V", "", "position", "getItemViewType", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/account/orders/productsPackage/presentation/ProductsPackageAdapter$ItemViewHolder;", "getItemCount", "()I", "holder", "", "onBindViewHolder", "(Lru/ozon/app/android/account/orders/productsPackage/presentation/ProductsPackageAdapter$ItemViewHolder;I)V", "", "Lru/ozon/app/android/account/orders/productsPackage/presentation/ProductsPackageItemVO;", "productsPackageItems", "setItems", "(Ljava/util/List;)V", "Lru/ozon/app/android/composer/ComposerNavigator;", "Ljava/util/List;", "getProductsPackageItems", "()Ljava/util/List;", "setProductsPackageItems", "Companion", "ItemViewHolder", "TitleItemVH", "ProductItemVH", "SellerTitleVH", "GiftTitleVH", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ProductsPackageAdapter extends RecyclerView.g<ItemViewHolder> {

    @NotNull
    private final ComposerNavigator navigator;

    @NotNull
    private List<? extends ProductsPackageItemVO> productsPackageItems;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u001f\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/account/orders/productsPackage/presentation/ProductsPackageAdapter$GiftTitleVH;", "Lru/ozon/app/android/account/orders/productsPackage/presentation/ProductsPackageAdapter$ItemViewHolder;", "binding", "Lru/ozon/app/android/cs_orders/databinding/ItemProductsPackageGiftTitleBinding;", "<init>", "(Lru/ozon/app/android/cs_orders/databinding/ItemProductsPackageGiftTitleBinding;)V", "bindItem", "", "item", "Lru/ozon/app/android/account/orders/productsPackage/presentation/ProductsPackageItemVO;", "getResourceIdByName", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "context", "Landroid/content/Context;", "(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/Integer;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class GiftTitleVH extends ItemViewHolder {

        @NotNull
        private final ItemProductsPackageGiftTitleBinding binding;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public GiftTitleVH(@NotNull ItemProductsPackageGiftTitleBinding binding) {
            super(r0);
            Intrinsics.checkNotNullParameter(binding, "binding");
            LinearLayout constraintLayout = binding.getConstraintLayout();
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
            this.binding = binding;
        }

        private final Integer getResourceIdByName(String name, Context context) {
            Resources resources = context.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            return Integer.valueOf(resources.getIdentifier(name, "drawable", context.getPackageName()));
        }

        @Override // ru.ozon.app.android.account.orders.productsPackage.presentation.ProductsPackageAdapter.ItemViewHolder
        public void bindItem(@NotNull ProductsPackageItemVO item) {
            Intrinsics.checkNotNullParameter(item, "item");
            ProductsPackageItemVO.GiftTitleVO giftTitleVO = (ProductsPackageItemVO.GiftTitleVO) item;
            ItemProductsPackageGiftTitleBinding itemProductsPackageGiftTitleBinding = this.binding;
            String icon = giftTitleVO.getIcon();
            Context context = itemProductsPackageGiftTitleBinding.giftIv.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Integer resourceIdByName = getResourceIdByName(icon, context);
            if (resourceIdByName != null) {
                itemProductsPackageGiftTitleBinding.giftIv.setImageResource(resourceIdByName.intValue());
            }
            itemProductsPackageGiftTitleBinding.giftTv.setText(giftTitleVO.getTitle());
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/account/orders/productsPackage/presentation/ProductsPackageAdapter$ItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Landroid/view/View;", "imageView", "<init>", "(Landroid/view/View;)V", "Lru/ozon/app/android/account/orders/productsPackage/presentation/ProductsPackageItemVO;", "item", "", "bindItem", "(Lru/ozon/app/android/account/orders/productsPackage/presentation/ProductsPackageItemVO;)V", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class ItemViewHolder extends RecyclerView.C {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ItemViewHolder(@NotNull View imageView) {
            super(imageView);
            Intrinsics.checkNotNullParameter(imageView, "imageView");
        }

        public abstract void bindItem(@NotNull ProductsPackageItemVO item);
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/account/orders/productsPackage/presentation/ProductsPackageAdapter$ProductItemVH;", "Lru/ozon/app/android/account/orders/productsPackage/presentation/ProductsPackageAdapter$ItemViewHolder;", "Lru/ozon/app/android/cs_orders/databinding/ItemProductsPackageProductBinding;", "binding", "Lru/ozon/app/android/composer/ComposerNavigator;", "navigator", "<init>", "(Lru/ozon/app/android/cs_orders/databinding/ItemProductsPackageProductBinding;Lru/ozon/app/android/composer/ComposerNavigator;)V", "Lru/ozon/app/android/account/orders/productsPackage/presentation/ProductsPackageItemVO;", "item", "", "bindItem", "(Lru/ozon/app/android/account/orders/productsPackage/presentation/ProductsPackageItemVO;)V", "Lru/ozon/app/android/cs_orders/databinding/ItemProductsPackageProductBinding;", "", "deeplink", "Ljava/lang/String;", "getDeeplink", "()Ljava/lang/String;", "setDeeplink", "(Ljava/lang/String;)V", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ProductItemVH extends ItemViewHolder {

        @NotNull
        private final ItemProductsPackageProductBinding binding;
        private String deeplink;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public ProductItemVH(@NotNull ItemProductsPackageProductBinding binding, @NotNull ComposerNavigator navigator) {
            super(r0);
            Intrinsics.checkNotNullParameter(binding, "binding");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            ConstraintLayout constraintLayout = binding.getConstraintLayout();
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
            this.binding = binding;
            binding.getConstraintLayout().setOnClickListener(new a(3, this, navigator));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void _init_$lambda$1(ProductItemVH productItemVH, ComposerNavigator composerNavigator, View view) {
            String str = productItemVH.deeplink;
            if (str != null) {
                ComposerNavigator.DefaultImpls.openDeeplink$default(composerNavigator, str, null, 2, null);
            }
        }

        @Override // ru.ozon.app.android.account.orders.productsPackage.presentation.ProductsPackageAdapter.ItemViewHolder
        public void bindItem(@NotNull ProductsPackageItemVO item) {
            Intrinsics.checkNotNullParameter(item, "item");
            ProductsPackageItemVO.ProductVO productVO = (ProductsPackageItemVO.ProductVO) item;
            this.deeplink = productVO.getDeeplink();
            ItemProductsPackageProductBinding itemProductsPackageProductBinding = this.binding;
            ImageView itemIv = itemProductsPackageProductBinding.itemIv;
            Intrinsics.checkNotNullExpressionValue(itemIv, "itemIv");
            ImageViewExtKt.load$default(itemIv, productVO.getImage(), null, null, null, null, false, null, 126, null);
            TextView priceTv = itemProductsPackageProductBinding.priceTv;
            Intrinsics.checkNotNullExpressionValue(priceTv, "priceTv");
            TextViewExtKt.setTextOrGone(priceTv, productVO.getPrice());
            itemProductsPackageProductBinding.nameTv.setText(productVO.getTitle());
            itemProductsPackageProductBinding.pricePerItemTv.setText(productVO.getPricePerItem());
            itemProductsPackageProductBinding.quantityTv.setText(productVO.getQuantity());
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/account/orders/productsPackage/presentation/ProductsPackageAdapter$SellerTitleVH;", "Lru/ozon/app/android/account/orders/productsPackage/presentation/ProductsPackageAdapter$ItemViewHolder;", "binding", "Lru/ozon/app/android/cs_orders/databinding/ItemProductsPackageSellerTitleBinding;", "<init>", "(Lru/ozon/app/android/cs_orders/databinding/ItemProductsPackageSellerTitleBinding;)V", "bindItem", "", "item", "Lru/ozon/app/android/account/orders/productsPackage/presentation/ProductsPackageItemVO;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SellerTitleVH extends ItemViewHolder {

        @NotNull
        private final ItemProductsPackageSellerTitleBinding binding;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public SellerTitleVH(@NotNull ItemProductsPackageSellerTitleBinding binding) {
            super(r0);
            Intrinsics.checkNotNullParameter(binding, "binding");
            TextView constraintLayout = binding.getConstraintLayout();
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
            this.binding = binding;
        }

        @Override // ru.ozon.app.android.account.orders.productsPackage.presentation.ProductsPackageAdapter.ItemViewHolder
        public void bindItem(@NotNull ProductsPackageItemVO item) {
            Intrinsics.checkNotNullParameter(item, "item");
            this.binding.sellerNameTv.setText(((ProductsPackageItemVO.SellerTitleVO) item).getTitle());
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/account/orders/productsPackage/presentation/ProductsPackageAdapter$TitleItemVH;", "Lru/ozon/app/android/account/orders/productsPackage/presentation/ProductsPackageAdapter$ItemViewHolder;", "binding", "Lru/ozon/app/android/cs_orders/databinding/ItemProductsPackageTitleBinding;", "<init>", "(Lru/ozon/app/android/cs_orders/databinding/ItemProductsPackageTitleBinding;)V", "bindItem", "", "item", "Lru/ozon/app/android/account/orders/productsPackage/presentation/ProductsPackageItemVO;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TitleItemVH extends ItemViewHolder {

        @NotNull
        private final ItemProductsPackageTitleBinding binding;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public TitleItemVH(@NotNull ItemProductsPackageTitleBinding binding) {
            super(r0);
            Intrinsics.checkNotNullParameter(binding, "binding");
            LinearLayout constraintLayout = binding.getConstraintLayout();
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
            this.binding = binding;
        }

        @Override // ru.ozon.app.android.account.orders.productsPackage.presentation.ProductsPackageAdapter.ItemViewHolder
        public void bindItem(@NotNull ProductsPackageItemVO item) {
            Intrinsics.checkNotNullParameter(item, "item");
            ProductsPackageItemVO.TitleVO titleVO = (ProductsPackageItemVO.TitleVO) item;
            ItemProductsPackageTitleBinding itemProductsPackageTitleBinding = this.binding;
            itemProductsPackageTitleBinding.titleTv.setText(titleVO.getTitle());
            TextView sellerNameTv = itemProductsPackageTitleBinding.sellerNameTv;
            Intrinsics.checkNotNullExpressionValue(sellerNameTv, "sellerNameTv");
            TextViewExtKt.setTextOrGone(sellerNameTv, titleVO.getSellerName());
        }
    }

    public ProductsPackageAdapter(@NotNull ComposerNavigator navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.navigator = navigator;
        this.productsPackageItems = K.f71697a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: getItemCount */
    public int getCardsCount() {
        return this.productsPackageItems.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        ProductsPackageItemVO productsPackageItemVO = this.productsPackageItems.get(position);
        if (productsPackageItemVO instanceof ProductsPackageItemVO.TitleVO) {
            return 10;
        }
        if (productsPackageItemVO instanceof ProductsPackageItemVO.ProductVO) {
            return 20;
        }
        if (productsPackageItemVO instanceof ProductsPackageItemVO.SellerTitleVO) {
            return 30;
        }
        if (productsPackageItemVO instanceof ProductsPackageItemVO.GiftTitleVO) {
            return 40;
        }
        throw new o();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public ItemViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        LayoutInflater a11 = C4636t5.a(parent, "parent");
        if (viewType == 10) {
            ItemProductsPackageTitleBinding inflate = ItemProductsPackageTitleBinding.inflate(a11, parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
            return new TitleItemVH(inflate);
        }
        if (viewType == 20) {
            ItemProductsPackageProductBinding inflate2 = ItemProductsPackageProductBinding.inflate(a11, parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate2, "inflate(...)");
            return new ProductItemVH(inflate2, this.navigator);
        }
        if (viewType == 30) {
            ItemProductsPackageSellerTitleBinding inflate3 = ItemProductsPackageSellerTitleBinding.inflate(a11, parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate3, "inflate(...)");
            return new SellerTitleVH(inflate3);
        }
        if (viewType != 40) {
            throw new IllegalArgumentException();
        }
        ItemProductsPackageGiftTitleBinding inflate4 = ItemProductsPackageGiftTitleBinding.inflate(a11, parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate4, "inflate(...)");
        return new GiftTitleVH(inflate4);
    }

    public final void setItems(@NotNull List<? extends ProductsPackageItemVO> productsPackageItems) {
        Intrinsics.checkNotNullParameter(productsPackageItems, "productsPackageItems");
        this.productsPackageItems = productsPackageItems;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull ItemViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bindItem(this.productsPackageItems.get(position));
    }
}
