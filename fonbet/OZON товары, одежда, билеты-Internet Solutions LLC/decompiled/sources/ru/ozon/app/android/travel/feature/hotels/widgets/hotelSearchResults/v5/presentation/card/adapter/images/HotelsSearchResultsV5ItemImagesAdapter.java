package ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.card.adapter.images;

import Ez.ViewOnClickListenerC2978b;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.J;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.platform.rv.looped.LoopedAdapter;
import ru.ozon.app.android.travel.molecules.view.indicator.IndicatorInfoProvider;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010!R6\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020\"2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020\"8\u0016@WX\u0096\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/card/adapter/images/HotelsSearchResultsV5ItemImagesAdapter;", "Lru/ozon/app/android/platform/rv/looped/LoopedAdapter;", "", "Lru/ozon/app/android/travel/molecules/view/indicator/IndicatorInfoProvider;", "Landroidx/lifecycle/J;", "lifecycleOwner", "Lkotlin/Function0;", "", "imageItemClickListener", "<init>", "(Landroidx/lifecycle/J;Lkotlin/jvm/functions/Function0;)V", "Landroid/content/Context;", "context", "Landroidx/appcompat/widget/AppCompatImageView;", "getAppCompatImageView", "(Landroid/content/Context;)Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/card/adapter/images/HotelsSearchResultsV5ItemImageViewHolder;", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/card/adapter/images/HotelsSearchResultsV5ItemImageViewHolder;", "Ljk0/j;", "holder", "item", "position", "onBind", "(Ljk0/j;Ljava/lang/String;I)V", "actualItemCount", "()I", "calculateIndicatorPosition", "(I)I", "Lkotlin/jvm/functions/Function0;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "items", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsSearchResultsV5ItemImagesAdapter extends LoopedAdapter<String> implements IndicatorInfoProvider {

    @NotNull
    private final Function0<Unit> imageItemClickListener;

    @NotNull
    private List<String> items;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelsSearchResultsV5ItemImagesAdapter(@NotNull J lifecycleOwner, @NotNull Function0<Unit> imageItemClickListener) {
        super(lifecycleOwner, 0, 2, null);
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(imageItemClickListener, "imageItemClickListener");
        this.imageItemClickListener = imageItemClickListener;
        this.items = K.f71697a;
    }

    private final AppCompatImageView getAppCompatImageView(Context context) {
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        appCompatImageView.setClickable(true);
        appCompatImageView.setFocusable(true);
        appCompatImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        appCompatImageView.setOnClickListener(new ViewOnClickListenerC2978b(this, 9));
        return appCompatImageView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getAppCompatImageView$lambda$2$lambda$1(HotelsSearchResultsV5ItemImagesAdapter hotelsSearchResultsV5ItemImagesAdapter, View view) {
        hotelsSearchResultsV5ItemImagesAdapter.imageItemClickListener.invoke();
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
        HotelsSearchResultsV5ItemImageViewHolder hotelsSearchResultsV5ItemImageViewHolder = holder instanceof HotelsSearchResultsV5ItemImageViewHolder ? (HotelsSearchResultsV5ItemImageViewHolder) holder : null;
        if (hotelsSearchResultsV5ItemImageViewHolder != null) {
            hotelsSearchResultsV5ItemImageViewHolder.bind(item);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public HotelsSearchResultsV5ItemImageViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new HotelsSearchResultsV5ItemImageViewHolder(getAppCompatImageView(context));
    }
}
