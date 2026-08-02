package ru.ozon.app.android.travel.feature.hotels.shared.shelfCard.images;

import android.annotation.SuppressLint;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.lifecycle.J;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.material.imageview.ShapeableImageView;
import java.util.List;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.platform.rv.looped.LoopedAdapter;
import ru.ozon.app.android.travel.feature.hotels.shared.shelfCard.ShelfCardVO;
import ru.ozon.app.android.travel.molecules.view.indicator.IndicatorInfoProvider;
import y7.k;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001cR6\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d8\u0016@WX\u0096\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/shared/shelfCard/images/ImagesAdapter;", "Lru/ozon/app/android/platform/rv/looped/LoopedAdapter;", "Lru/ozon/app/android/travel/feature/hotels/shared/shelfCard/ShelfCardVO$Image;", "Lru/ozon/app/android/travel/molecules/view/indicator/IndicatorInfoProvider;", "Landroidx/lifecycle/J;", "lifecycleOwner", "Lkotlin/Function0;", "", "onImageClick", "<init>", "(Landroidx/lifecycle/J;Lkotlin/jvm/functions/Function0;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lru/ozon/app/android/travel/feature/hotels/shared/shelfCard/images/ImageViewHolder;", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/travel/feature/hotels/shared/shelfCard/images/ImageViewHolder;", "Ljk0/j;", "holder", "item", "position", "onBind", "(Ljk0/j;Lru/ozon/app/android/travel/feature/hotels/shared/shelfCard/ShelfCardVO$Image;I)V", "actualItemCount", "()I", "calculateIndicatorPosition", "(I)I", "Lkotlin/jvm/functions/Function0;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "items", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ImagesAdapter extends LoopedAdapter<ShelfCardVO.Image> implements IndicatorInfoProvider {

    @NotNull
    private List<ShelfCardVO.Image> items;

    @NotNull
    private final Function0<Unit> onImageClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImagesAdapter(@NotNull J lifecycleOwner, @NotNull Function0<Unit> onImageClick) {
        super(lifecycleOwner, 0, 2, null);
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(onImageClick, "onImageClick");
        this.onImageClick = onImageClick;
        this.items = K.f71697a;
    }

    @Override // ru.ozon.app.android.travel.molecules.view.indicator.IndicatorInfoProvider
    public int actualItemCount() {
        return getCorrectItemsCount();
    }

    @Override // ru.ozon.app.android.travel.molecules.view.indicator.IndicatorInfoProvider
    public int calculateIndicatorPosition(int position) {
        return getFixedPosition(position);
    }

    @Override // ru.ozon.app.android.travel.molecules.view.indicator.IndicatorInfoProvider
    public Integer calculateScrollToPosition(int i11) {
        return IndicatorInfoProvider.DefaultImpls.calculateScrollToPosition(this, i11);
    }

    @Override // ru.ozon.app.android.platform.rv.looped.LoopedAdapter
    @NotNull
    public List<ShelfCardVO.Image> getItems() {
        return this.items;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public void setItems(@NotNull List<ShelfCardVO.Image> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.items = value;
        notifyDataSetChanged();
    }

    @Override // ru.ozon.app.android.platform.rv.looped.LoopedAdapter
    public void onBind(@NotNull j holder, @NotNull ShelfCardVO.Image item, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        ImageViewHolder imageViewHolder = holder instanceof ImageViewHolder ? (ImageViewHolder) holder : null;
        if (imageViewHolder != null) {
            imageViewHolder.bind(item);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public ImageViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ShapeableImageView shapeableImageView = new ShapeableImageView(parent.getContext());
        shapeableImageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        shapeableImageView.setShapeAppearanceModel(new k().o(0.0f));
        shapeableImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        return new ImageViewHolder(shapeableImageView, this.onImageClick);
    }
}
