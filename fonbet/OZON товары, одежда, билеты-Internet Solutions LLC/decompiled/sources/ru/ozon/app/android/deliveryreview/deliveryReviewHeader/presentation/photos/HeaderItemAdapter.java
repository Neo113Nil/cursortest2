package ru.ozon.app.android.deliveryreview.deliveryReviewHeader.presentation.photos;

import Sc.o;
import Ve.C4636t5;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.deliveryreview.databinding.ItemDeliveryReviewHeaderImageBinding;
import ru.ozon.app.android.deliveryreview.databinding.ItemDeliveryReviewHeaderMoreBinding;
import ru.ozon.app.android.deliveryreview.deliveryReviewHeader.presentation.photos.HeaderItem;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0013\u0014\u0015\u0016B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewHeader/presentation/photos/HeaderItemAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/deliveryreview/deliveryReviewHeader/presentation/photos/HeaderItem;", "Lru/ozon/app/android/deliveryreview/deliveryReviewHeader/presentation/photos/HeaderItemAdapter$ItemVH;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/deliveryreview/deliveryReviewHeader/presentation/photos/HeaderItemAdapter$ItemVH;", "position", "getItemViewType", "(I)I", "holder", "", "onBindViewHolder", "(Lru/ozon/app/android/deliveryreview/deliveryReviewHeader/presentation/photos/HeaderItemAdapter$ItemVH;I)V", "Companion", "ItemVH", "PhotoItemVH", "MoreItemVH", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class HeaderItemAdapter extends t<HeaderItem, ItemVH> {

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewHeader/presentation/photos/HeaderItemAdapter$ItemVH;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Landroid/view/View;", "containerView", "<init>", "(Landroid/view/View;)V", "Lru/ozon/app/android/deliveryreview/deliveryReviewHeader/presentation/photos/HeaderItem;", "item", "", "bindItem", "(Lru/ozon/app/android/deliveryreview/deliveryReviewHeader/presentation/photos/HeaderItem;)V", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class ItemVH extends RecyclerView.C {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ItemVH(@NotNull View containerView) {
            super(containerView);
            Intrinsics.checkNotNullParameter(containerView, "containerView");
        }

        public abstract void bindItem(@NotNull HeaderItem item);
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewHeader/presentation/photos/HeaderItemAdapter$MoreItemVH;", "Lru/ozon/app/android/deliveryreview/deliveryReviewHeader/presentation/photos/HeaderItemAdapter$ItemVH;", "binding", "Lru/ozon/app/android/deliveryreview/databinding/ItemDeliveryReviewHeaderMoreBinding;", "<init>", "(Lru/ozon/app/android/deliveryreview/databinding/ItemDeliveryReviewHeaderMoreBinding;)V", "bindItem", "", "item", "Lru/ozon/app/android/deliveryreview/deliveryReviewHeader/presentation/photos/HeaderItem;", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MoreItemVH extends ItemVH {

        @NotNull
        private final ItemDeliveryReviewHeaderMoreBinding binding;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public MoreItemVH(@NotNull ItemDeliveryReviewHeaderMoreBinding binding) {
            super(r0);
            Intrinsics.checkNotNullParameter(binding, "binding");
            FrameLayout constraintLayout = binding.getConstraintLayout();
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
            this.binding = binding;
        }

        @Override // ru.ozon.app.android.deliveryreview.deliveryReviewHeader.presentation.photos.HeaderItemAdapter.ItemVH
        public void bindItem(@NotNull HeaderItem item) {
            Intrinsics.checkNotNullParameter(item, "item");
            this.binding.moreCountTv.setText(((HeaderItem.MoreCountItem) item).getCountText());
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewHeader/presentation/photos/HeaderItemAdapter$PhotoItemVH;", "Lru/ozon/app/android/deliveryreview/deliveryReviewHeader/presentation/photos/HeaderItemAdapter$ItemVH;", "binding", "Lru/ozon/app/android/deliveryreview/databinding/ItemDeliveryReviewHeaderImageBinding;", "<init>", "(Lru/ozon/app/android/deliveryreview/databinding/ItemDeliveryReviewHeaderImageBinding;)V", "bindItem", "", "item", "Lru/ozon/app/android/deliveryreview/deliveryReviewHeader/presentation/photos/HeaderItem;", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PhotoItemVH extends ItemVH {

        @NotNull
        private final ItemDeliveryReviewHeaderImageBinding binding;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public PhotoItemVH(@NotNull ItemDeliveryReviewHeaderImageBinding binding) {
            super(r0);
            Intrinsics.checkNotNullParameter(binding, "binding");
            ImageView constraintLayout = binding.getConstraintLayout();
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
            this.binding = binding;
        }

        @Override // ru.ozon.app.android.deliveryreview.deliveryReviewHeader.presentation.photos.HeaderItemAdapter.ItemVH
        public void bindItem(@NotNull HeaderItem item) {
            Intrinsics.checkNotNullParameter(item, "item");
            ImageView photoIv = this.binding.photoIv;
            Intrinsics.checkNotNullExpressionValue(photoIv, "photoIv");
            ImageViewExtKt.load$default(photoIv, ((HeaderItem.PhotoItem) item).getPhotoUrl(), null, null, null, null, false, null, 126, null);
        }
    }

    public HeaderItemAdapter() {
        super(new i.d<HeaderItem>() { // from class: ru.ozon.app.android.deliveryreview.deliveryReviewHeader.presentation.photos.HeaderItemAdapter.1
            @Override // androidx.recyclerview.widget.i.d
            public boolean areContentsTheSame(HeaderItem oldItem, HeaderItem newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.i.d
            public boolean areItemsTheSame(HeaderItem oldItem, HeaderItem newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        HeaderItem headerItem = getCurrentList().get(position);
        if (headerItem instanceof HeaderItem.PhotoItem) {
            return 1;
        }
        if (headerItem instanceof HeaderItem.MoreCountItem) {
            return 2;
        }
        throw new o();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public ItemVH onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        LayoutInflater a11 = C4636t5.a(parent, "parent");
        if (viewType == 1) {
            ItemDeliveryReviewHeaderImageBinding inflate = ItemDeliveryReviewHeaderImageBinding.inflate(a11, parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
            return new PhotoItemVH(inflate);
        }
        if (viewType != 2) {
            throw new IllegalArgumentException();
        }
        ItemDeliveryReviewHeaderMoreBinding inflate2 = ItemDeliveryReviewHeaderMoreBinding.inflate(a11, parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate2, "inflate(...)");
        return new MoreItemVH(inflate2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull ItemVH holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        HeaderItem headerItem = getCurrentList().get(position);
        Intrinsics.checkNotNullExpressionValue(headerItem, "get(...)");
        holder.bindItem(headerItem);
    }
}
