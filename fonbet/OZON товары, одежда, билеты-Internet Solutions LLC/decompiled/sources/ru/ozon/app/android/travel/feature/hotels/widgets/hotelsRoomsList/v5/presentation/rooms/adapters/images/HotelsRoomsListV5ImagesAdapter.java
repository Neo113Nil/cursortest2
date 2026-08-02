package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.presentation.rooms.adapters.images;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.t;
import com.google.android.material.imageview.ShapeableImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.R$id;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.presentation.rooms.ImageVO;
import ru.ozon.app.android.travel.molecules.view.indicator.IndicatorInfoProvider;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import y7.k;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001!B#\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001c\u0010\u001bR \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/rooms/adapters/images/HotelsRoomsListV5ImagesAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/rooms/ImageVO;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/rooms/adapters/images/HotelsRoomsListV5ImagesViewHolder;", "Lru/ozon/app/android/travel/molecules/view/indicator/IndicatorInfoProvider;", "Landroid/content/Context;", "context", "Lkotlin/Function1;", "", "", "imageItemClickListener", "<init>", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/rooms/adapters/images/HotelsRoomsListV5ImagesViewHolder;I)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/rooms/adapters/images/HotelsRoomsListV5ImagesViewHolder;", "getItemViewType", "(I)I", "actualItemCount", "()I", "onViewAttachedToWindow", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/rooms/adapters/images/HotelsRoomsListV5ImagesViewHolder;)V", "onViewDetachedFromWindow", "Lkotlin/jvm/functions/Function1;", "", "cornersSize", "F", "ImagesDiffUtil", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsRoomsListV5ImagesAdapter extends t<ImageVO, HotelsRoomsListV5ImagesViewHolder> implements IndicatorInfoProvider {
    private final float cornersSize;

    @NotNull
    private final Function1<Integer, Unit> imageItemClickListener;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/rooms/adapters/images/HotelsRoomsListV5ImagesAdapter$ImagesDiffUtil;", "Landroidx/recyclerview/widget/i$d;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/rooms/ImageVO;", "<init>", "()V", "oldItem", "newItem", "", "areItemsTheSame", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/rooms/ImageVO;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/rooms/ImageVO;)Z", "areContentsTheSame", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class ImagesDiffUtil extends i.d<ImageVO> {
        @Override // androidx.recyclerview.widget.i.d
        public boolean areContentsTheSame(@NotNull ImageVO oldItem, @NotNull ImageVO newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.d(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.i.d
        public boolean areItemsTheSame(@NotNull ImageVO oldItem, @NotNull ImageVO newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return oldItem.getId() == newItem.getId();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HotelsRoomsListV5ImagesAdapter(@NotNull Context context, @NotNull Function1<? super Integer, Unit> imageItemClickListener) {
        super(new ImagesDiffUtil());
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imageItemClickListener, "imageItemClickListener");
        this.imageItemClickListener = imageItemClickListener;
        this.cornersSize = ResourceExtKt.toPxF(20, context);
    }

    @Override // ru.ozon.app.android.travel.molecules.view.indicator.IndicatorInfoProvider
    public int actualItemCount() {
        return getShimmersCount();
    }

    @Override // ru.ozon.app.android.travel.molecules.view.indicator.IndicatorInfoProvider
    public int calculateIndicatorPosition(int i11) {
        return IndicatorInfoProvider.DefaultImpls.calculateIndicatorPosition(this, i11);
    }

    @Override // ru.ozon.app.android.travel.molecules.view.indicator.IndicatorInfoProvider
    public Integer calculateScrollToPosition(int i11) {
        return IndicatorInfoProvider.DefaultImpls.calculateScrollToPosition(this, i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        return R$id.hotelsRoomsListV5ImagesRv;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull HotelsRoomsListV5ImagesViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(getItem(position).getUrl());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public HotelsRoomsListV5ImagesViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ShapeableImageView shapeableImageView = new ShapeableImageView(parent.getContext());
        shapeableImageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        shapeableImageView.setClickable(true);
        shapeableImageView.setFocusable(true);
        shapeableImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        shapeableImageView.setShapeAppearanceModel(new k().o(this.cornersSize));
        return new HotelsRoomsListV5ImagesViewHolder(shapeableImageView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onViewAttachedToWindow(@NotNull HotelsRoomsListV5ImagesViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewAttachedToWindow((HotelsRoomsListV5ImagesAdapter) holder);
        holder.setupCallbacks(this.imageItemClickListener);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onViewDetachedFromWindow(@NotNull HotelsRoomsListV5ImagesViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.removeCallbacks();
        super.onViewDetachedFromWindow((HotelsRoomsListV5ImagesAdapter) holder);
    }
}
