package ru.ozon.app.android.geo.splitShortInfoWidgetKey.images;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.geo.databinding.SplitShortImageItemBinding;
import ru.ozon.app.android.geo.splitShortInfoWidgetKey.data.SplitShortInfoVO;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0019\u001aB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0015\u001a\u00020\r2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/geo/splitShortInfoWidgetKey/images/ImagesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$g;", "Lru/ozon/app/android/geo/splitShortInfoWidgetKey/images/ImagesAdapter$ImageViewHolder;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/geo/splitShortInfoWidgetKey/images/ImagesAdapter$ImageViewHolder;", "holder", "position", "", "onBindViewHolder", "(Lru/ozon/app/android/geo/splitShortInfoWidgetKey/images/ImagesAdapter$ImageViewHolder;I)V", "getItemCount", "()I", "", "Lru/ozon/app/android/geo/splitShortInfoWidgetKey/data/SplitShortInfoVO$Item;", "newItems", "setItems", "(Ljava/util/List;)V", "items", "Ljava/util/List;", "ImageViewHolder", "ItemsDiffUtilCallback", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ImagesAdapter extends RecyclerView.g<ImageViewHolder> {

    @NotNull
    private List<SplitShortInfoVO.Item> items = K.f71697a;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/geo/splitShortInfoWidgetKey/images/ImagesAdapter$ImageViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/geo/databinding/SplitShortImageItemBinding;", "binding", "<init>", "(Lru/ozon/app/android/geo/databinding/SplitShortImageItemBinding;)V", "Lru/ozon/app/android/geo/splitShortInfoWidgetKey/data/SplitShortInfoVO$Item;", "image", "", "bind", "(Lru/ozon/app/android/geo/splitShortInfoWidgetKey/data/SplitShortInfoVO$Item;)V", "Lru/ozon/app/android/geo/databinding/SplitShortImageItemBinding;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ImageViewHolder extends RecyclerView.C {

        @NotNull
        private final SplitShortImageItemBinding binding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ImageViewHolder(@NotNull SplitShortImageItemBinding binding) {
            super(binding.getConstraintLayout());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.binding = binding;
        }

        public final void bind(@NotNull SplitShortInfoVO.Item image) {
            Intrinsics.checkNotNullParameter(image, "image");
            ImageView splitShortIV = this.binding.splitShortIV;
            Intrinsics.checkNotNullExpressionValue(splitShortIV, "splitShortIV");
            ImageViewExtKt.load$default(splitShortIV, image.getImage(), null, null, null, null, false, null, 126, null);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0010R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0012R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/geo/splitShortInfoWidgetKey/images/ImagesAdapter$ItemsDiffUtilCallback;", "Landroidx/recyclerview/widget/i$b;", "", "Lru/ozon/app/android/geo/splitShortInfoWidgetKey/data/SplitShortInfoVO$Item;", "oldItems", "newItems", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "getOldListSize", "()I", "getNewListSize", "oldItemPosition", "newItemPosition", "", "areItemsTheSame", "(II)Z", "areContentsTheSame", "Ljava/util/List;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ItemsDiffUtilCallback extends i.b {

        @NotNull
        private final List<SplitShortInfoVO.Item> newItems;

        @NotNull
        private final List<SplitShortInfoVO.Item> oldItems;

        public ItemsDiffUtilCallback(@NotNull List<SplitShortInfoVO.Item> oldItems, @NotNull List<SplitShortInfoVO.Item> newItems) {
            Intrinsics.checkNotNullParameter(oldItems, "oldItems");
            Intrinsics.checkNotNullParameter(newItems, "newItems");
            this.oldItems = oldItems;
            this.newItems = newItems;
        }

        @Override // androidx.recyclerview.widget.i.b
        public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
            return Intrinsics.d(this.oldItems.get(oldItemPosition), this.newItems.get(newItemPosition));
        }

        @Override // androidx.recyclerview.widget.i.b
        public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
            return Intrinsics.d(this.oldItems.get(oldItemPosition).getImage(), this.newItems.get(newItemPosition).getImage());
        }

        @Override // androidx.recyclerview.widget.i.b
        public int getNewListSize() {
            return this.newItems.size();
        }

        @Override // androidx.recyclerview.widget.i.b
        public int getOldListSize() {
            return this.oldItems.size();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: getItemCount */
    public int getCardsCount() {
        return this.items.size();
    }

    public final void setItems(@NotNull List<SplitShortInfoVO.Item> newItems) {
        Intrinsics.checkNotNullParameter(newItems, "newItems");
        i.c a11 = i.a(new ItemsDiffUtilCallback(this.items, newItems), true);
        Intrinsics.checkNotNullExpressionValue(a11, "calculateDiff(...)");
        this.items = newItems;
        a11.c(this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull ImageViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.items.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public ImageViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        SplitShortImageItemBinding inflate = SplitShortImageItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return new ImageViewHolder(inflate);
    }
}
