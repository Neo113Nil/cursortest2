package ru.ozon.app.android.travel.feature.tours.widgets.toursRoomsList.v2.presentation.room.images;

import android.annotation.SuppressLint;
import android.content.Context;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.platform.rv.looped.LoopedAdapter;
import ru.ozon.app.android.travel.molecules.view.indicator.IndicatorInfoProvider;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import y7.k;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010 \n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B#\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001f\u0010\u001eJ\u000f\u0010 \u001a\u00020\u0007H\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\"\u0010#R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010$R6\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00020%2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00020%8\u0016@WX\u0096\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursRoomsList/v2/presentation/room/images/ToursRoomsListV2ImagesAdapter;", "Lru/ozon/app/android/platform/rv/looped/LoopedAdapter;", "", "Lru/ozon/app/android/travel/molecules/view/indicator/IndicatorInfoProvider;", "Landroidx/lifecycle/J;", "lifecycleOwner", "Lkotlin/Function1;", "", "", "imageItemClickListener", "<init>", "(Landroidx/lifecycle/J;Lkotlin/jvm/functions/Function1;)V", "Landroid/content/Context;", "context", "Lcom/google/android/material/imageview/ShapeableImageView;", "getShapeableImageView", "(Landroid/content/Context;)Lcom/google/android/material/imageview/ShapeableImageView;", "Landroid/view/ViewGroup;", "parent", "viewType", "Lru/ozon/app/android/travel/feature/tours/widgets/toursRoomsList/v2/presentation/room/images/ToursRoomsListV2ImagesViewHolder;", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/travel/feature/tours/widgets/toursRoomsList/v2/presentation/room/images/ToursRoomsListV2ImagesViewHolder;", "Ljk0/j;", "holder", "item", "position", "onBind", "(Ljk0/j;Ljava/lang/String;I)V", "onViewAttachedToWindow", "(Ljk0/j;)V", "onViewDetachedFromWindow", "actualItemCount", "()I", "calculateIndicatorPosition", "(I)I", "Lkotlin/jvm/functions/Function1;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "items", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ToursRoomsListV2ImagesAdapter extends LoopedAdapter<String> implements IndicatorInfoProvider {

    @NotNull
    private final Function1<Integer, Unit> imageItemClickListener;

    @NotNull
    private List<String> items;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ToursRoomsListV2ImagesAdapter(@NotNull J lifecycleOwner, @NotNull Function1<? super Integer, Unit> imageItemClickListener) {
        super(lifecycleOwner, 0, 2, null);
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(imageItemClickListener, "imageItemClickListener");
        this.imageItemClickListener = imageItemClickListener;
        this.items = K.f71697a;
    }

    private final ShapeableImageView getShapeableImageView(Context context) {
        ShapeableImageView shapeableImageView = new ShapeableImageView(context);
        shapeableImageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        shapeableImageView.setClickable(true);
        shapeableImageView.setFocusable(true);
        shapeableImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        shapeableImageView.setShapeAppearanceModel(new k().o(ResourceExtKt.toPxF(24, context)));
        return shapeableImageView;
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
    public List<String> getItems() {
        return this.items;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public void setItems(@NotNull List<String> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.items = value;
        notifyDataSetChanged();
    }

    @Override // ru.ozon.app.android.platform.rv.looped.LoopedAdapter
    public void onBind(@NotNull j holder, @NotNull String item, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        ToursRoomsListV2ImagesViewHolder toursRoomsListV2ImagesViewHolder = holder instanceof ToursRoomsListV2ImagesViewHolder ? (ToursRoomsListV2ImagesViewHolder) holder : null;
        if (toursRoomsListV2ImagesViewHolder != null) {
            toursRoomsListV2ImagesViewHolder.bind(item);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public ToursRoomsListV2ImagesViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new ToursRoomsListV2ImagesViewHolder(getShapeableImageView(context));
    }

    @Override // jk0.d, androidx.recyclerview.widget.RecyclerView.g
    public void onViewAttachedToWindow(@NotNull j holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewAttachedToWindow((ToursRoomsListV2ImagesAdapter) holder);
        ToursRoomsListV2ImagesViewHolder toursRoomsListV2ImagesViewHolder = holder instanceof ToursRoomsListV2ImagesViewHolder ? (ToursRoomsListV2ImagesViewHolder) holder : null;
        if (toursRoomsListV2ImagesViewHolder != null) {
            toursRoomsListV2ImagesViewHolder.setupCallback(new ToursRoomsListV2ImagesAdapter$onViewAttachedToWindow$1(this, holder));
        }
    }

    @Override // jk0.d, androidx.recyclerview.widget.RecyclerView.g
    public void onViewDetachedFromWindow(@NotNull j holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewDetachedFromWindow((ToursRoomsListV2ImagesAdapter) holder);
        ToursRoomsListV2ImagesViewHolder toursRoomsListV2ImagesViewHolder = holder instanceof ToursRoomsListV2ImagesViewHolder ? (ToursRoomsListV2ImagesViewHolder) holder : null;
        if (toursRoomsListV2ImagesViewHolder != null) {
            toursRoomsListV2ImagesViewHolder.removeCallback();
        }
    }
}
