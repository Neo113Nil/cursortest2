package ru.ozon.app.android.orderdetails.ordershipment.orderShipment.presentation.posting;

import Dc0.m;
import Ve.C4636t5;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cscore.adultimage.DeliveryAdultImageView;
import ru.ozon.app.android.orderdetails.databinding.ItemOrderShipmentLayoutPostingMoreBinding;
import ru.ozon.app.android.orderdetails.databinding.ItemOrderShipmentLayoutPostingProductBinding;
import ru.ozon.app.android.orderdetails.ordershipment.orderShipment.presentation.OrderShipmentItemVO;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004$%&'B\u001d\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u0013R*\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006("}, d2 = {"Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/posting/OrderShipmentProductAdapter;", "Landroidx/recyclerview/widget/RecyclerView$g;", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/posting/OrderShipmentProductAdapter$ItemViewHolder;", "", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/OrderShipmentItemVO$PostingItemVO;", "items", "", "itemPreviewSize", "<init>", "(Ljava/util/List;I)V", "position", "getItemViewType", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/posting/OrderShipmentProductAdapter$ItemViewHolder;", "getItemCount", "()I", "holder", "", "onBindViewHolder", "(Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/posting/OrderShipmentProductAdapter$ItemViewHolder;I)V", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "I", "getItemPreviewSize", "Lkotlin/Function0;", "onItemClick", "Lkotlin/jvm/functions/Function0;", "getOnItemClick", "()Lkotlin/jvm/functions/Function0;", "setOnItemClick", "(Lkotlin/jvm/functions/Function0;)V", "Companion", "ItemViewHolder", "ProductItemVH", "MoreItemVH", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OrderShipmentProductAdapter extends RecyclerView.g<ItemViewHolder> {
    private final int itemPreviewSize;

    @NotNull
    private final List<OrderShipmentItemVO.PostingItemVO> items;
    private Function0<Unit> onItemClick;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/posting/OrderShipmentProductAdapter$ItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Landroid/view/View;", "imageView", "<init>", "(Landroid/view/View;)V", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/OrderShipmentItemVO$PostingItemVO;", "item", "", "bindItem", "(Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/OrderShipmentItemVO$PostingItemVO;)V", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class ItemViewHolder extends RecyclerView.C {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ItemViewHolder(@NotNull View imageView) {
            super(imageView);
            Intrinsics.checkNotNullParameter(imageView, "imageView");
        }

        public abstract void bindItem(@NotNull OrderShipmentItemVO.PostingItemVO item);
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/posting/OrderShipmentProductAdapter$MoreItemVH;", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/posting/OrderShipmentProductAdapter$ItemViewHolder;", "binding", "Lru/ozon/app/android/orderdetails/databinding/ItemOrderShipmentLayoutPostingMoreBinding;", "itemPreviewSize", "", "<init>", "(Lru/ozon/app/android/orderdetails/databinding/ItemOrderShipmentLayoutPostingMoreBinding;I)V", "bindItem", "", "item", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/OrderShipmentItemVO$PostingItemVO;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MoreItemVH extends ItemViewHolder {

        @NotNull
        private final ItemOrderShipmentLayoutPostingMoreBinding binding;
        private final int itemPreviewSize;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public MoreItemVH(@NotNull ItemOrderShipmentLayoutPostingMoreBinding binding, int i11) {
            super(r0);
            Intrinsics.checkNotNullParameter(binding, "binding");
            FrameLayout constraintLayout = binding.getConstraintLayout();
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
            this.binding = binding;
            this.itemPreviewSize = i11;
        }

        @Override // ru.ozon.app.android.orderdetails.ordershipment.orderShipment.presentation.posting.OrderShipmentProductAdapter.ItemViewHolder
        public void bindItem(@NotNull OrderShipmentItemVO.PostingItemVO item) {
            Intrinsics.checkNotNullParameter(item, "item");
            this.binding.countMoreTv.setText(((OrderShipmentItemVO.PostingItemVO.PostingMoreProductVO) item).getCount());
            FrameLayout constraintLayout = this.binding.getConstraintLayout();
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
            ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            int i11 = this.itemPreviewSize;
            layoutParams.height = i11;
            layoutParams.width = i11;
            constraintLayout.setLayoutParams(layoutParams);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/posting/OrderShipmentProductAdapter$ProductItemVH;", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/posting/OrderShipmentProductAdapter$ItemViewHolder;", "binding", "Lru/ozon/app/android/orderdetails/databinding/ItemOrderShipmentLayoutPostingProductBinding;", "itemPreviewSize", "", "onItemClick", "Lkotlin/Function0;", "", "<init>", "(Lru/ozon/app/android/orderdetails/databinding/ItemOrderShipmentLayoutPostingProductBinding;ILkotlin/jvm/functions/Function0;)V", "bindItem", "item", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/OrderShipmentItemVO$PostingItemVO;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ProductItemVH extends ItemViewHolder {

        @NotNull
        private final ItemOrderShipmentLayoutPostingProductBinding binding;
        private final int itemPreviewSize;
        private final Function0<Unit> onItemClick;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public ProductItemVH(@NotNull ItemOrderShipmentLayoutPostingProductBinding binding, int i11, Function0<Unit> function0) {
            super(r0);
            Intrinsics.checkNotNullParameter(binding, "binding");
            FrameLayout constraintLayout = binding.getConstraintLayout();
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
            this.binding = binding;
            this.itemPreviewSize = i11;
            this.onItemClick = function0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bindItem$lambda$2$lambda$0(ProductItemVH productItemVH, View view) {
            Function0<Unit> function0 = productItemVH.onItemClick;
            if (function0 != null) {
                function0.invoke();
            }
        }

        @Override // ru.ozon.app.android.orderdetails.ordershipment.orderShipment.presentation.posting.OrderShipmentProductAdapter.ItemViewHolder
        public void bindItem(@NotNull OrderShipmentItemVO.PostingItemVO item) {
            Intrinsics.checkNotNullParameter(item, "item");
            OrderShipmentItemVO.PostingItemVO.PostingProductVO postingProductVO = (OrderShipmentItemVO.PostingItemVO.PostingProductVO) item;
            ItemOrderShipmentLayoutPostingProductBinding itemOrderShipmentLayoutPostingProductBinding = this.binding;
            itemOrderShipmentLayoutPostingProductBinding.getConstraintLayout().setOnClickListener(new m(this, 20));
            FrameLayout constraintLayout = itemOrderShipmentLayoutPostingProductBinding.getConstraintLayout();
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
            ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            int i11 = this.itemPreviewSize;
            layoutParams.height = i11;
            layoutParams.width = i11;
            constraintLayout.setLayoutParams(layoutParams);
            DeliveryAdultImageView.bind$default(itemOrderShipmentLayoutPostingProductBinding.productIv, postingProductVO.getImage(), postingProductVO.getIsAdult(), null, 4, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OrderShipmentProductAdapter(@NotNull List<? extends OrderShipmentItemVO.PostingItemVO> items, int i11) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.items = items;
        this.itemPreviewSize = i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: getItemCount */
    public int getCardsCount() {
        return this.items.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        return this.items.get(position) instanceof OrderShipmentItemVO.PostingItemVO.PostingProductVO ? 10 : 20;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public ItemViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        LayoutInflater a11 = C4636t5.a(parent, "parent");
        if (viewType == 10) {
            ItemOrderShipmentLayoutPostingProductBinding inflate = ItemOrderShipmentLayoutPostingProductBinding.inflate(a11, parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
            return new ProductItemVH(inflate, this.itemPreviewSize, this.onItemClick);
        }
        if (viewType != 20) {
            throw new IllegalArgumentException();
        }
        ItemOrderShipmentLayoutPostingMoreBinding inflate2 = ItemOrderShipmentLayoutPostingMoreBinding.inflate(a11, parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate2, "inflate(...)");
        return new MoreItemVH(inflate2, this.itemPreviewSize);
    }

    public final void setOnItemClick(Function0<Unit> function0) {
        this.onItemClick = function0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull ItemViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bindItem(this.items.get(position));
    }
}
