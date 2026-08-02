package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.views.galleryswipeview.adapter;

import Sc.o;
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
import ru.ozon.app.android.product.R$id;
import ru.ozon.app.android.product.molecules.blur.presentation.BlurMoleculeDelegate;
import ru.ozon.app.android.product.molecules.blur.presentation.BlurMoleculeView;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.views.galleryswipeview.data.TileGrid2GalleryModel;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.cache.image.TileGrid2ImageCache;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.prefetch.TileGrid2ImageSizeCalculator;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.views.galleryswipeview.holder.BlurItemViewHolder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.views.galleryswipeview.holder.ImageViewHolder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.views.galleryswipeview.holder.VideoTileViewHolder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.views.galleryswipeview.view.VideoTileView;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.views.image.AspectRatioImageWithBgView;
import ru.ozon.app.android.utils.ThreadUtilsKt;
import ru.ozon.app.android.videocover.VideoTileDelegate;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010 \n\u0002\b\b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001By\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0002\b\u00030\u0005j\u0006\u0012\u0002\b\u0003`\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\n\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\"2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020%2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J#\u0010,\u001a\u00060*j\u0002`+2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020%H\u0016¢\u0006\u0004\b,\u0010-J+\u00100\u001a\u00020\u000f2\n\u0010.\u001a\u00060*j\u0002`+2\u0006\u0010/\u001a\u00020\u00022\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b0\u00101J\u001b\u00102\u001a\u00020\u000f2\n\u0010.\u001a\u00060*j\u0002`+H\u0016¢\u0006\u0004\b2\u00103J\u001b\u00104\u001a\u00020\u000f2\n\u0010.\u001a\u00060*j\u0002`+H\u0016¢\u0006\u0004\b4\u00103R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00105R \u0010\u0007\u001a\u000e\u0012\u0002\b\u00030\u0005j\u0006\u0012\u0002\b\u0003`\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00106R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00107R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00108R \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00109R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010:R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010;R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010<R\u0014\u0010\u0015\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u00108R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010=R6\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00020>2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00020>8\u0016@WX\u0096\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010E¨\u0006F"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/views/galleryswipeview/adapter/GalleryAdapter;", "Lru/ozon/app/android/platform/rv/looped/LoopedAdapter;", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/views/galleryswipeview/data/TileGrid2GalleryModel$GalleryItem;", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "widgetViewHolder", "Lru/ozon/app/android/videocover/VideoTileDelegate;", "videoTileDelegate", "", "shouldPreCreate", "Lkotlin/Function1;", "swipeGalleryToFirstImage", "Lkotlin/Function0;", "", "onItemClicked", "Lru/ozon/app/android/product/molecules/blur/presentation/BlurMoleculeDelegate;", "blurMoleculeDelegate", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/cache/image/TileGrid2ImageCache;", "imageCache", "isGalleryOverdrawEnabled", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/prefetch/TileGrid2ImageSizeCalculator;", "imageSizeCalculator", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/composer/ui/widget/k;Lru/ozon/app/android/videocover/VideoTileDelegate;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lru/ozon/app/android/product/molecules/blur/presentation/BlurMoleculeDelegate;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/cache/image/TileGrid2ImageCache;ZLru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/prefetch/TileGrid2ImageSizeCalculator;)V", "Landroid/view/ViewGroup;", "parent", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/views/image/AspectRatioImageWithBgView;", "buildImageView", "(Landroid/view/ViewGroup;)Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/views/image/AspectRatioImageWithBgView;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/views/galleryswipeview/view/VideoTileView;", "buildVideoView", "(Landroid/view/ViewGroup;)Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/views/galleryswipeview/view/VideoTileView;", "Lru/ozon/app/android/product/molecules/blur/presentation/BlurMoleculeView;", "createMoleculeView", "(Landroid/view/ViewGroup;)Lru/ozon/app/android/product/molecules/blur/presentation/BlurMoleculeView;", "", "position", "getViewType", "(I)I", "viewType", "Ljk0/j;", "Lru/ozon/app/android/uikit/view/recycler/adapter/lifecycle/LifecycleViewHolder;", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Ljk0/j;", "holder", "item", "onBind", "(Ljk0/j;Lru/ozon/app/android/product/tiles/tilegrid2/presentation/views/galleryswipeview/data/TileGrid2GalleryModel$GalleryItem;I)V", "onViewAttachedToWindow", "(Ljk0/j;)V", "onViewDetachedFromWindow", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/videocover/VideoTileDelegate;", "Z", "Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function0;", "Lru/ozon/app/android/product/molecules/blur/presentation/BlurMoleculeDelegate;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/cache/image/TileGrid2ImageCache;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/prefetch/TileGrid2ImageSizeCalculator;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "items", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GalleryAdapter extends LoopedAdapter<TileGrid2GalleryModel.GalleryItem> {

    @NotNull
    private final BlurMoleculeDelegate blurMoleculeDelegate;

    @NotNull
    private final TileGrid2ImageCache imageCache;
    private final TileGrid2ImageSizeCalculator imageSizeCalculator;
    private final boolean isGalleryOverdrawEnabled;

    @NotNull
    private List<? extends TileGrid2GalleryModel.GalleryItem> items;

    @NotNull
    private final Function0<Unit> onItemClicked;

    @NotNull
    private final ComposerReferences references;
    private final boolean shouldPreCreate;

    @NotNull
    private final Function1<Boolean, Boolean> swipeGalleryToFirstImage;
    private final VideoTileDelegate videoTileDelegate;

    @NotNull
    private final k<?> widgetViewHolder;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GalleryAdapter(@NotNull ComposerReferences references, @NotNull k<?> widgetViewHolder, VideoTileDelegate videoTileDelegate, boolean z11, @NotNull Function1<? super Boolean, Boolean> swipeGalleryToFirstImage, @NotNull Function0<Unit> onItemClicked, @NotNull BlurMoleculeDelegate blurMoleculeDelegate, @NotNull TileGrid2ImageCache imageCache, boolean z12, TileGrid2ImageSizeCalculator tileGrid2ImageSizeCalculator) {
        super(widgetViewHolder, 0, 2, null);
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(widgetViewHolder, "widgetViewHolder");
        Intrinsics.checkNotNullParameter(swipeGalleryToFirstImage, "swipeGalleryToFirstImage");
        Intrinsics.checkNotNullParameter(onItemClicked, "onItemClicked");
        Intrinsics.checkNotNullParameter(blurMoleculeDelegate, "blurMoleculeDelegate");
        Intrinsics.checkNotNullParameter(imageCache, "imageCache");
        this.references = references;
        this.widgetViewHolder = widgetViewHolder;
        this.videoTileDelegate = videoTileDelegate;
        this.shouldPreCreate = z11;
        this.swipeGalleryToFirstImage = swipeGalleryToFirstImage;
        this.onItemClicked = onItemClicked;
        this.blurMoleculeDelegate = blurMoleculeDelegate;
        this.imageCache = imageCache;
        this.isGalleryOverdrawEnabled = z12;
        this.imageSizeCalculator = tileGrid2ImageSizeCalculator;
        this.items = K.f71697a;
    }

    private final AspectRatioImageWithBgView buildImageView(ViewGroup parent) {
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        AspectRatioImageWithBgView aspectRatioImageWithBgView = new AspectRatioImageWithBgView(context, null, 0, 6, null);
        aspectRatioImageWithBgView.setAdjustViewBounds(true);
        aspectRatioImageWithBgView.setId(R$id.imageIv);
        aspectRatioImageWithBgView.setLayoutParams(new RecyclerView.p(-1, -1));
        return aspectRatioImageWithBgView;
    }

    private final VideoTileView buildVideoView(ViewGroup parent) {
        VideoTileView videoTileView;
        if (this.shouldPreCreate) {
            videoTileView = (VideoTileView) q.f64554a.i(N.b(VideoTileView.class), parent.getContext());
            if (videoTileView == null) {
                Context context = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                videoTileView = new VideoTileView(context, null, 0, 6, null);
            }
        } else {
            Context context2 = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            videoTileView = new VideoTileView(context2, null, 0, 6, null);
        }
        videoTileView.setLayoutParams(new RecyclerView.p(-1, -1));
        return videoTileView;
    }

    private final BlurMoleculeView createMoleculeView(ViewGroup parent) {
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        BlurMoleculeView blurMoleculeView = new BlurMoleculeView(context, null, 0, 6, null);
        blurMoleculeView.setLayoutParams(new RecyclerView.p(-1, -1));
        return blurMoleculeView;
    }

    @Override // ru.ozon.app.android.platform.rv.looped.LoopedAdapter
    @NotNull
    public List<TileGrid2GalleryModel.GalleryItem> getItems() {
        return this.items;
    }

    @Override // ru.ozon.app.android.platform.rv.looped.LoopedAdapter
    public int getViewType(int position) {
        TileGrid2GalleryModel.GalleryItem galleryItem = getItems().get(position);
        if (galleryItem instanceof TileGrid2GalleryModel.GalleryItem.ImageItem) {
            return ru.ozon.app.android.universalwidgets.R$id.imageItemViewType;
        }
        if (galleryItem instanceof TileGrid2GalleryModel.GalleryItem.VideoItem) {
            return ru.ozon.app.android.universalwidgets.R$id.videoItemViewType;
        }
        if (galleryItem instanceof TileGrid2GalleryModel.GalleryItem.BlurItem) {
            return ru.ozon.app.android.universalwidgets.R$id.blurItemViewType;
        }
        throw new o();
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public void setItems(@NotNull List<? extends TileGrid2GalleryModel.GalleryItem> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.items = value;
        notifyDataSetChanged();
    }

    @Override // ru.ozon.app.android.platform.rv.looped.LoopedAdapter
    public void onBind(@NotNull j holder, @NotNull TileGrid2GalleryModel.GalleryItem item, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        if ((item instanceof TileGrid2GalleryModel.GalleryItem.ImageItem) && (holder instanceof ImageViewHolder)) {
            ((ImageViewHolder) holder).bind((TileGrid2GalleryModel.GalleryItem.ImageItem) item);
            return;
        }
        if ((item instanceof TileGrid2GalleryModel.GalleryItem.VideoItem) && (holder instanceof VideoTileViewHolder)) {
            VideoTileViewHolder videoTileViewHolder = (VideoTileViewHolder) holder;
            videoTileViewHolder.bind((TileGrid2GalleryModel.GalleryItem.VideoItem) item);
            videoTileViewHolder.setOverlapContainerPositionInfo(this.widgetViewHolder.getViewHolderPositionInfo().a());
        } else if ((item instanceof TileGrid2GalleryModel.GalleryItem.BlurItem) && (holder instanceof BlurItemViewHolder)) {
            ((BlurItemViewHolder) holder).bind(((TileGrid2GalleryModel.GalleryItem.BlurItem) item).getMolecule(), this.onItemClicked);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public j onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == ru.ozon.app.android.universalwidgets.R$id.imageItemViewType) {
            return new ImageViewHolder(buildImageView(parent), this.imageCache, this.imageSizeCalculator, this.references, this.isGalleryOverdrawEnabled);
        }
        if (viewType == ru.ozon.app.android.universalwidgets.R$id.videoItemViewType) {
            VideoTileView buildVideoView = buildVideoView(parent);
            buildVideoView.getImageView();
            return new VideoTileViewHolder(buildVideoView, this.videoTileDelegate, this.imageCache, this.imageSizeCalculator);
        }
        if (viewType == ru.ozon.app.android.universalwidgets.R$id.blurItemViewType) {
            return new BlurItemViewHolder(createMoleculeView(parent), this.blurMoleculeDelegate);
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
