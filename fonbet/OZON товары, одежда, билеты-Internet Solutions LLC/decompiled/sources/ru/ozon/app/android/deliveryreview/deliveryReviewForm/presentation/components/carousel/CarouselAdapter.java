package ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.carousel;

import GD.b;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.content.res.g;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.deliveryreview.R$drawable;
import ru.ozon.app.android.deliveryreview.databinding.ItemDeliveryReviewComponentCarouselItemBinding;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.ElementVO;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001\u001bB\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0011\u001a\u00020\u00052\n\u0010\u000f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013R\"\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/carousel/CarouselAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/ElementVO$Carousel$Item;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/carousel/CarouselAdapter$CarouselItemVH;", "Lkotlin/Function1;", "", "onClickListener", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/carousel/CarouselAdapter$CarouselItemVH;", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/carousel/CarouselAdapter$CarouselItemVH;I)V", "Lkotlin/jvm/functions/Function1;", "", "disabled", "Z", "getDisabled", "()Z", "setDisabled", "(Z)V", "CarouselItemVH", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CarouselAdapter extends t<ElementVO.Carousel.Item, CarouselItemVH> {
    private boolean disabled;

    @NotNull
    private final Function1<ElementVO.Carousel.Item, Unit> onClickListener;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0080\u0004\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012R\u0016\u0010\u000e\u001a\u00020\u00058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/carousel/CarouselAdapter$CarouselItemVH;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/deliveryreview/databinding/ItemDeliveryReviewComponentCarouselItemBinding;", "binding", "Lkotlin/Function1;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/ElementVO$Carousel$Item;", "", "onClickListener", "<init>", "(Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/carousel/CarouselAdapter;Lru/ozon/app/android/deliveryreview/databinding/ItemDeliveryReviewComponentCarouselItemBinding;Lkotlin/jvm/functions/Function1;)V", "", "isSelected", "setSelected", "(Z)V", "item", "bind", "(Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/ElementVO$Carousel$Item;)V", "Lru/ozon/app/android/deliveryreview/databinding/ItemDeliveryReviewComponentCarouselItemBinding;", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/ElementVO$Carousel$Item;", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class CarouselItemVH extends RecyclerView.C {

        @NotNull
        private final ItemDeliveryReviewComponentCarouselItemBinding binding;
        private ElementVO.Carousel.Item item;

        @NotNull
        private final Function1<ElementVO.Carousel.Item, Unit> onClickListener;
        final /* synthetic */ CarouselAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public CarouselItemVH(@NotNull CarouselAdapter carouselAdapter, @NotNull ItemDeliveryReviewComponentCarouselItemBinding binding, Function1<? super ElementVO.Carousel.Item, Unit> onClickListener) {
            super(binding.getConstraintLayout());
            Intrinsics.checkNotNullParameter(binding, "binding");
            Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
            this.this$0 = carouselAdapter;
            this.binding = binding;
            this.onClickListener = onClickListener;
            binding.itemCl.setOnClickListener(new b(8, carouselAdapter, this));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void _init_$lambda$0(CarouselAdapter carouselAdapter, CarouselItemVH carouselItemVH, View view) {
            if (carouselAdapter.getDisabled()) {
                return;
            }
            Function1<ElementVO.Carousel.Item, Unit> function1 = carouselItemVH.onClickListener;
            ElementVO.Carousel.Item item = carouselItemVH.item;
            if (item != null) {
                function1.invoke(item);
            } else {
                Intrinsics.n("item");
                throw null;
            }
        }

        private final void setSelected(boolean isSelected) {
            ItemDeliveryReviewComponentCarouselItemBinding itemDeliveryReviewComponentCarouselItemBinding = this.binding;
            ImageView checkIv = itemDeliveryReviewComponentCarouselItemBinding.checkIv;
            Intrinsics.checkNotNullExpressionValue(checkIv, "checkIv");
            ViewExtKt.showOrGone(checkIv, Boolean.valueOf(isSelected));
            Context context = itemDeliveryReviewComponentCarouselItemBinding.borderV.getContext();
            itemDeliveryReviewComponentCarouselItemBinding.borderV.setBackground(g.d(context.getResources(), isSelected ? R$drawable.bg_delivery_review_component_carousel_item_selected : R$drawable.bg_delivery_review_component_carousel_item, context.getTheme()));
        }

        public final void bind(@NotNull ElementVO.Carousel.Item item) {
            Intrinsics.checkNotNullParameter(item, "item");
            ItemDeliveryReviewComponentCarouselItemBinding itemDeliveryReviewComponentCarouselItemBinding = this.binding;
            CarouselAdapter carouselAdapter = this.this$0;
            this.item = item;
            ImageView itemIv = itemDeliveryReviewComponentCarouselItemBinding.itemIv;
            Intrinsics.checkNotNullExpressionValue(itemIv, "itemIv");
            ImageViewExtKt.load$default(itemIv, item.getImage(), null, null, null, null, false, null, 126, null);
            itemDeliveryReviewComponentCarouselItemBinding.titleTv.setText(item.getText());
            setSelected(!carouselAdapter.getDisabled() && item.getIsSelected());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CarouselAdapter(@NotNull Function1<? super ElementVO.Carousel.Item, Unit> onClickListener) {
        super(new i.d<ElementVO.Carousel.Item>() { // from class: ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.carousel.CarouselAdapter.1
            @Override // androidx.recyclerview.widget.i.d
            public boolean areContentsTheSame(ElementVO.Carousel.Item oldItem, ElementVO.Carousel.Item newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.i.d
            public boolean areItemsTheSame(ElementVO.Carousel.Item oldItem, ElementVO.Carousel.Item newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem.getId(), newItem.getId());
            }
        });
        Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
        this.onClickListener = onClickListener;
    }

    public final boolean getDisabled() {
        return this.disabled;
    }

    public final void setDisabled(boolean z11) {
        this.disabled = z11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull CarouselItemVH holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ElementVO.Carousel.Item item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public CarouselItemVH onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ItemDeliveryReviewComponentCarouselItemBinding inflate = ItemDeliveryReviewComponentCarouselItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return new CarouselItemVH(this, inflate, this.onClickListener);
    }
}
