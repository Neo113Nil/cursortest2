package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsDetailsFull.v3.presentation.images;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.material.imageview.ShapeableImageView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.view.indicator.IndicatorInfoProvider;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import y7.k;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u001b\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0014R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R6\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0006@GX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsDetailsFull/v3/presentation/images/ImagesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$g;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsDetailsFull/v3/presentation/images/ImagesViewHolder;", "Lru/ozon/app/android/travel/molecules/view/indicator/IndicatorInfoProvider;", "Lkotlin/Function1;", "", "", "imageClickListener", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsDetailsFull/v3/presentation/images/ImagesViewHolder;", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsDetailsFull/v3/presentation/images/ImagesViewHolder;I)V", "getItemCount", "()I", "actualItemCount", "Lkotlin/jvm/functions/Function1;", "", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "items", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ImagesAdapter extends RecyclerView.g<ImagesViewHolder> implements IndicatorInfoProvider {

    @NotNull
    private final Function1<Integer, Unit> imageClickListener;

    @NotNull
    private List<String> items;

    /* JADX WARN: Multi-variable type inference failed */
    public ImagesAdapter(@NotNull Function1<? super Integer, Unit> imageClickListener) {
        Intrinsics.checkNotNullParameter(imageClickListener, "imageClickListener");
        this.imageClickListener = imageClickListener;
        this.items = K.f71697a;
    }

    @Override // ru.ozon.app.android.travel.molecules.view.indicator.IndicatorInfoProvider
    public int actualItemCount() {
        return getCardsCount();
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
    /* renamed from: getItemCount */
    public int getCardsCount() {
        return this.items.size();
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void setItems(@NotNull List<String> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (Intrinsics.d(this.items, value)) {
            return;
        }
        this.items = value;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull ImagesViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.items.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public ImagesViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        ShapeableImageView shapeableImageView = new ShapeableImageView(context);
        Intrinsics.f(context);
        shapeableImageView.setLayoutParams(new ViewGroup.LayoutParams(-1, ResourceExtKt.toPx(206, context)));
        shapeableImageView.setClickable(true);
        shapeableImageView.setFocusable(true);
        shapeableImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        shapeableImageView.setShapeAppearanceModel(new k().o(ResourceExtKt.toPxF(20, context)));
        return new ImagesViewHolder(shapeableImageView, this.imageClickListener);
    }
}
