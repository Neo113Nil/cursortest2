package ru.ozon.app.android.csma.tips.widgets.tipcourierproductphotos.presentation;

import Sc.o;
import android.view.ViewGroup;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.csma.tips.R$layout;
import ru.ozon.app.android.csma.tips.widgets.tipcourierproductphotos.presentation.ProductPhotoItem;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/csma/tips/widgets/tipcourierproductphotos/presentation/TipProductPhotosAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/csma/tips/widgets/tipcourierproductphotos/presentation/ProductPhotoItem;", "Lru/ozon/app/android/csma/tips/widgets/tipcourierproductphotos/presentation/ItemVH;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/csma/tips/widgets/tipcourierproductphotos/presentation/ItemVH;", "position", "getItemViewType", "(I)I", "holder", "", "onBindViewHolder", "(Lru/ozon/app/android/csma/tips/widgets/tipcourierproductphotos/presentation/ItemVH;I)V", "Companion", "tips_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TipProductPhotosAdapter extends t<ProductPhotoItem, ItemVH> {
    public TipProductPhotosAdapter() {
        super(new i.d<ProductPhotoItem>() { // from class: ru.ozon.app.android.csma.tips.widgets.tipcourierproductphotos.presentation.TipProductPhotosAdapter.1
            @Override // androidx.recyclerview.widget.i.d
            public boolean areContentsTheSame(ProductPhotoItem oldItem, ProductPhotoItem newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.i.d
            public boolean areItemsTheSame(ProductPhotoItem oldItem, ProductPhotoItem newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return oldItem.hashCode() == newItem.hashCode();
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        ProductPhotoItem productPhotoItem = getCurrentList().get(position);
        if (productPhotoItem instanceof ProductPhotoItem.PhotoItem) {
            return 10;
        }
        if (productPhotoItem instanceof ProductPhotoItem.MoreCountItem) {
            return 20;
        }
        throw new o();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull ItemVH holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ProductPhotoItem productPhotoItem = getCurrentList().get(position);
        Intrinsics.checkNotNullExpressionValue(productPhotoItem, "get(...)");
        holder.bindItem(productPhotoItem);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public ItemVH onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == 10) {
            return new PhotoItemVH(ViewGroupExtKt.inflate(parent, R$layout.widget_tip_courier_product_photos_item_image));
        }
        if (viewType == 20) {
            return new MoreItemVH(ViewGroupExtKt.inflate(parent, R$layout.widget_tip_courier_product_photos_item_more));
        }
        throw new IllegalArgumentException();
    }
}
