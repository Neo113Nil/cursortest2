package ru.ozon.app.android.search.views.galleryswipeview;

import Sc.o;
import WZ.t;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import gk0.q;
import java.util.List;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.platform.rv.looped.LoopedAdapter;
import ru.ozon.app.android.product.imagesswipeview.AdultServerBlurImageView;
import ru.ozon.app.android.search.R$id;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.presentation.image.SearchResultsGalleryModel;
import ru.ozon.app.android.utils.ThreadUtilsKt;
import ru.ozon.app.android.videocover.VideoTileDelegate;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BM\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0002\b\u00030\u0005j\u0006\u0012\u0002\b\u0003`\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010!\u001a\u00060\u001fj\u0002` 2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u001aH\u0016¢\u0006\u0004\b!\u0010\"J+\u0010%\u001a\u00020\u000e2\n\u0010#\u001a\u00060\u001fj\u0002` 2\u0006\u0010$\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b%\u0010&J\u001b\u0010'\u001a\u00020\u000e2\n\u0010#\u001a\u00060\u001fj\u0002` H\u0016¢\u0006\u0004\b'\u0010(J\u001b\u0010)\u001a\u00020\u000e2\n\u0010#\u001a\u00060\u001fj\u0002` H\u0016¢\u0006\u0004\b)\u0010(R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010*R \u0010\u0007\u001a\u000e\u0012\u0002\b\u00030\u0005j\u0006\u0012\u0002\b\u0003`\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010+R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010,R \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010-R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010.R8\u00101\u001a\u0018\u0012\f\u0012\n\u0018\u00010/j\u0004\u0018\u0001`0\u0012\u0004\u0012\u00020\u000e\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010-\u001a\u0004\b2\u00103\"\u0004\b4\u00105R6\u00108\u001a\b\u0012\u0004\u0012\u00020\u0002062\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u0002068\u0016@WX\u0096\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=¨\u0006>"}, d2 = {"Lru/ozon/app/android/search/views/galleryswipeview/GalleryAdapter;", "Lru/ozon/app/android/platform/rv/looped/LoopedAdapter;", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/image/SearchResultsGalleryModel$GalleryItem;", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "widgetViewHolder", "Lru/ozon/app/android/videocover/VideoTileDelegate;", "videoTileDelegate", "Lkotlin/Function1;", "", "swipeGalleryToFirstImage", "Lkotlin/Function0;", "", "onItemClicked", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/composer/ui/widget/k;Lru/ozon/app/android/videocover/VideoTileDelegate;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "Landroid/view/ViewGroup;", "parent", "Lru/ozon/app/android/product/imagesswipeview/AdultServerBlurImageView;", "buildImageView", "(Landroid/view/ViewGroup;)Lru/ozon/app/android/product/imagesswipeview/AdultServerBlurImageView;", "Lru/ozon/app/android/search/views/galleryswipeview/VideoTileView;", "buildVideoView", "(Landroid/view/ViewGroup;)Lru/ozon/app/android/search/views/galleryswipeview/VideoTileView;", "", "position", "getViewType", "(I)I", "viewType", "Ljk0/j;", "Lru/ozon/app/android/uikit/view/recycler/adapter/lifecycle/LifecycleViewHolder;", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Ljk0/j;", "holder", "item", "onBind", "(Ljk0/j;Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/image/SearchResultsGalleryModel$GalleryItem;I)V", "onViewAttachedToWindow", "(Ljk0/j;)V", "onViewDetachedFromWindow", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/videocover/VideoTileDelegate;", "Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function0;", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "onPinchToZoomStarted", "getOnPinchToZoomStarted", "()Lkotlin/jvm/functions/Function1;", "setOnPinchToZoomStarted", "(Lkotlin/jvm/functions/Function1;)V", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "items", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GalleryAdapter extends LoopedAdapter<SearchResultsGalleryModel.GalleryItem> {

    @NotNull
    private List<? extends SearchResultsGalleryModel.GalleryItem> items;

    @NotNull
    private final Function0<Unit> onItemClicked;
    private Function1<? super t, Unit> onPinchToZoomStarted;

    @NotNull
    private final ComposerReferences references;

    @NotNull
    private final Function1<Boolean, Boolean> swipeGalleryToFirstImage;

    @NotNull
    private final VideoTileDelegate videoTileDelegate;

    @NotNull
    private final k<?> widgetViewHolder;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GalleryAdapter(@NotNull ComposerReferences references, @NotNull k<?> widgetViewHolder, @NotNull VideoTileDelegate videoTileDelegate, @NotNull Function1<? super Boolean, Boolean> swipeGalleryToFirstImage, @NotNull Function0<Unit> onItemClicked) {
        super(widgetViewHolder, 0, 2, null);
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(widgetViewHolder, "widgetViewHolder");
        Intrinsics.checkNotNullParameter(videoTileDelegate, "videoTileDelegate");
        Intrinsics.checkNotNullParameter(swipeGalleryToFirstImage, "swipeGalleryToFirstImage");
        Intrinsics.checkNotNullParameter(onItemClicked, "onItemClicked");
        this.references = references;
        this.widgetViewHolder = widgetViewHolder;
        this.videoTileDelegate = videoTileDelegate;
        this.swipeGalleryToFirstImage = swipeGalleryToFirstImage;
        this.onItemClicked = onItemClicked;
        this.items = K.f71697a;
    }

    private final AdultServerBlurImageView buildImageView(ViewGroup parent) {
        AdultServerBlurImageView adultServerBlurImageView = (AdultServerBlurImageView) q.f64554a.i(N.b(AdultServerBlurImageView.class), parent.getContext());
        if (adultServerBlurImageView == null) {
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            adultServerBlurImageView = new AdultServerBlurImageView(context, null, 0, 6, null);
        }
        adultServerBlurImageView.setOnPinchToZoomStarted(this.onPinchToZoomStarted);
        adultServerBlurImageView.setLayoutParams(new RecyclerView.p(-1, -1));
        return adultServerBlurImageView;
    }

    private final VideoTileView buildVideoView(ViewGroup parent) {
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        VideoTileView videoTileView = new VideoTileView(context, null, 0, 6, null);
        videoTileView.setLayoutParams(new RecyclerView.p(-1, -1));
        return videoTileView;
    }

    @Override // ru.ozon.app.android.platform.rv.looped.LoopedAdapter
    @NotNull
    public List<SearchResultsGalleryModel.GalleryItem> getItems() {
        return this.items;
    }

    @Override // ru.ozon.app.android.platform.rv.looped.LoopedAdapter
    public int getViewType(int position) {
        SearchResultsGalleryModel.GalleryItem galleryItem = getItems().get(position);
        if (galleryItem instanceof SearchResultsGalleryModel.GalleryItem.ImageItem) {
            return R$id.imageItemViewType;
        }
        if (galleryItem instanceof SearchResultsGalleryModel.GalleryItem.VideoItem) {
            return R$id.videoItemViewType;
        }
        throw new o();
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public void setItems(@NotNull List<? extends SearchResultsGalleryModel.GalleryItem> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.items = value;
        notifyDataSetChanged();
    }

    public final void setOnPinchToZoomStarted(Function1<? super t, Unit> function1) {
        this.onPinchToZoomStarted = function1;
    }

    @Override // ru.ozon.app.android.platform.rv.looped.LoopedAdapter
    public void onBind(@NotNull j holder, @NotNull SearchResultsGalleryModel.GalleryItem item, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        if ((item instanceof SearchResultsGalleryModel.GalleryItem.ImageItem) && (holder instanceof ImageViewHolder)) {
            ((ImageViewHolder) holder).bind((SearchResultsGalleryModel.GalleryItem.ImageItem) item);
        } else if ((item instanceof SearchResultsGalleryModel.GalleryItem.VideoItem) && (holder instanceof VideoTileViewHolder)) {
            VideoTileViewHolder videoTileViewHolder = (VideoTileViewHolder) holder;
            videoTileViewHolder.bind((SearchResultsGalleryModel.GalleryItem.VideoItem) item);
            videoTileViewHolder.setOverlapContainerPositionInfo(this.widgetViewHolder.getViewHolderPositionInfo().a());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public j onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == R$id.imageItemViewType) {
            return new ImageViewHolder(buildImageView(parent));
        }
        if (viewType == R$id.videoItemViewType) {
            return new VideoTileViewHolder(buildVideoView(parent), this.videoTileDelegate);
        }
        throw new IllegalStateException(("Неизвестный viewType = " + viewType).toString());
    }

    @Override // jk0.d, androidx.recyclerview.widget.RecyclerView.g
    public void onViewAttachedToWindow(@NotNull j holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof ImageViewHolder) {
            ((ImageViewHolder) holder).setOnItemClicked(this.onItemClicked);
        } else if (holder instanceof VideoTileViewHolder) {
            VideoTileViewHolder videoTileViewHolder = (VideoTileViewHolder) holder;
            videoTileViewHolder.setOnItemClicked(this.onItemClicked);
            videoTileViewHolder.setWidgetHolderPosition(this.widgetViewHolder.getAdapterPosition());
            videoTileViewHolder.setSwipeGalleryToFirstImage(this.swipeGalleryToFirstImage);
            videoTileViewHolder.setVideoTileComposerReferences(this.references);
        }
        if (ThreadUtilsKt.isCurrentThreadMain()) {
            super.onViewAttachedToWindow((GalleryAdapter) holder);
        }
    }

    @Override // jk0.d, androidx.recyclerview.widget.RecyclerView.g
    public void onViewDetachedFromWindow(@NotNull j holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (ThreadUtilsKt.isCurrentThreadMain()) {
            super.onViewDetachedFromWindow((GalleryAdapter) holder);
        }
        if (holder instanceof ImageViewHolder) {
            ((ImageViewHolder) holder).setOnItemClicked(null);
        } else if (holder instanceof VideoTileViewHolder) {
            VideoTileViewHolder videoTileViewHolder = (VideoTileViewHolder) holder;
            videoTileViewHolder.setWidgetHolderPosition(-1);
            videoTileViewHolder.setSwipeGalleryToFirstImage(null);
            videoTileViewHolder.setVideoTileComposerReferences(null);
        }
    }
}
