package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.views.galleryswipeview.holder;

import Go.e;
import android.view.View;
import androidx.media3.ui.PlayerView;
import jk0.j;
import jk0.l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.views.galleryswipeview.data.TileGrid2GalleryModel;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.cache.image.TileGrid2ImageCache;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.prefetch.TileGrid2ImageSizeCalculator;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.views.galleryswipeview.view.VideoTileView;
import ru.ozon.app.android.videocover.VideoTile;
import ru.ozon.app.android.videocover.VideoTileDelegate;
import ru.ozon.app.android.videocover.VideoTileHolder;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u00032\u00020\u0004B+\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fH\u0096\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\"\u0010\u0011J\u0010\u0010#\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b#\u0010\u0011J\u0010\u0010$\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b$\u0010\u0011J\u0010\u0010%\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b%\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010&R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010'R$\u0010(\u001a\u0004\u0018\u00010\u00178\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010\u001aR\u001a\u0010.\u001a\u00020-8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\"\u00103\u001a\u0002028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R$\u0010:\u001a\u0004\u0018\u0001098\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u001a\u0010@\u001a\u00020\u00138\u0016X\u0096D¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\b@\u0010BR0\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0013\u0018\u00010C8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR*\u0010J\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010I8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010PR\u0014\u0010R\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0016\u0010V\u001a\u0004\u0018\u00010\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0014\u0010X\u001a\u0002028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bW\u00106¨\u0006Y"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/views/galleryswipeview/holder/VideoTileViewHolder;", "Ljk0/j;", "Lru/ozon/app/android/uikit/view/recycler/adapter/lifecycle/LifecycleViewHolder;", "Lru/ozon/app/android/videocover/VideoTileHolder;", "Lru/ozon/app/android/videocover/VideoTile;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/views/galleryswipeview/view/VideoTileView;", "videoTileView", "Lru/ozon/app/android/videocover/VideoTileDelegate;", "videoTileDelegate", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/cache/image/TileGrid2ImageCache;", "imageCache", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/prefetch/TileGrid2ImageSizeCalculator;", "imageSizeCalculator", "<init>", "(Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/views/galleryswipeview/view/VideoTileView;Lru/ozon/app/android/videocover/VideoTileDelegate;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/cache/image/TileGrid2ImageCache;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/prefetch/TileGrid2ImageSizeCalculator;)V", "", "onViewInVisibleBounds", "()V", "onViewOutOfVisibleBounds", "", "isSmooth", "swipeGalleryToFirstImage", "(Z)Z", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/views/galleryswipeview/data/TileGrid2GalleryModel$GalleryItem$VideoItem;", "item", "bind", "(Lru/ozon/app/android/product/tiles/tilegrid2/presentation/views/galleryswipeview/data/TileGrid2GalleryModel$GalleryItem$VideoItem;)V", "Ljk0/l;", "overlapContainersPositionInfo", "setOverlapContainerPositionInfo", "(Ljk0/l;)V", "Landroidx/media3/ui/PlayerView;", "getPlayerView", "()Landroidx/media3/ui/PlayerView;", "showPreview", "hidePreview", "onVideoStop", "onVideoStart", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/views/galleryswipeview/view/VideoTileView;", "Lru/ozon/app/android/videocover/VideoTileDelegate;", "videoItem", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/views/galleryswipeview/data/TileGrid2GalleryModel$GalleryItem$VideoItem;", "getVideoItem", "()Lru/ozon/app/android/product/tiles/tilegrid2/presentation/views/galleryswipeview/data/TileGrid2GalleryModel$GalleryItem$VideoItem;", "setVideoItem", "Landroid/view/View;", "galleryItemView", "Landroid/view/View;", "getGalleryItemView", "()Landroid/view/View;", "", "widgetHolderPosition", "I", "getWidgetHolderPosition", "()I", "setWidgetHolderPosition", "(I)V", "Lru/ozon/app/android/composer/ComposerReferences;", "videoTileComposerReferences", "Lru/ozon/app/android/composer/ComposerReferences;", "getVideoTileComposerReferences", "()Lru/ozon/app/android/composer/ComposerReferences;", "setVideoTileComposerReferences", "(Lru/ozon/app/android/composer/ComposerReferences;)V", "isHorizontalItem", "Z", "()Z", "Lkotlin/Function1;", "Lkotlin/jvm/functions/Function1;", "getSwipeGalleryToFirstImage", "()Lkotlin/jvm/functions/Function1;", "setSwipeGalleryToFirstImage", "(Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function0;", "onItemClicked", "Lkotlin/jvm/functions/Function0;", "getOnItemClicked", "()Lkotlin/jvm/functions/Function0;", "setOnItemClicked", "(Lkotlin/jvm/functions/Function0;)V", "Ljk0/l;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/views/galleryswipeview/holder/TileGrid2ImageBinder;", "imageBinder", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/views/galleryswipeview/holder/TileGrid2ImageBinder;", "getOverlayPositions", "()Ljk0/l;", "overlayPositions", "getPositionInGallery", "positionInGallery", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VideoTileViewHolder extends j implements VideoTileHolder, VideoTile {

    @NotNull
    private final View galleryItemView;

    @NotNull
    private final TileGrid2ImageBinder imageBinder;
    private final boolean isHorizontalItem;
    private Function0<Unit> onItemClicked;
    private l overlapContainersPositionInfo;
    private Function1<? super Boolean, Boolean> swipeGalleryToFirstImage;
    private TileGrid2GalleryModel.GalleryItem.VideoItem videoItem;
    private ComposerReferences videoTileComposerReferences;
    private final VideoTileDelegate videoTileDelegate;

    @NotNull
    private final VideoTileView videoTileView;
    private int widgetHolderPosition;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoTileViewHolder(@NotNull VideoTileView videoTileView, VideoTileDelegate videoTileDelegate, @NotNull TileGrid2ImageCache imageCache, TileGrid2ImageSizeCalculator tileGrid2ImageSizeCalculator) {
        super(videoTileView);
        Intrinsics.checkNotNullParameter(videoTileView, "videoTileView");
        Intrinsics.checkNotNullParameter(imageCache, "imageCache");
        this.videoTileView = videoTileView;
        this.videoTileDelegate = videoTileDelegate;
        this.galleryItemView = videoTileView;
        this.widgetHolderPosition = -1;
        this.imageBinder = new TileGrid2ImageBinder(videoTileView.getImageView().getImageIv(), imageCache, false, tileGrid2ImageSizeCalculator, 4, null);
        videoTileView.setOnClickListener(new e(this, 11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(VideoTileViewHolder videoTileViewHolder, View view) {
        Function0<Unit> function0 = videoTileViewHolder.onItemClicked;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void bind(@NotNull TileGrid2GalleryModel.GalleryItem.VideoItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        setVideoItem(item);
        this.imageBinder.bind(item.getImage());
    }

    @Override // ru.ozon.app.android.videocover.VideoTileHolder
    @NotNull
    public View getGalleryItemView() {
        return this.galleryItemView;
    }

    @Override // ru.ozon.app.android.videocover.VideoTileHolder
    /* renamed from: getOverlayPositions, reason: from getter */
    public l getOverlapContainersPositionInfo() {
        return this.overlapContainersPositionInfo;
    }

    @Override // ru.ozon.app.android.videocover.VideoTile
    @NotNull
    public PlayerView getPlayerView() {
        return this.videoTileView.getPlayerView();
    }

    @Override // ru.ozon.app.android.videocover.VideoTileHolder
    public int getPositionInGallery() {
        return getAdapterPosition();
    }

    @Override // ru.ozon.app.android.videocover.VideoTileHolder
    public boolean getShouldReplay() {
        return VideoTileHolder.DefaultImpls.getShouldReplay(this);
    }

    @Override // ru.ozon.app.android.videocover.VideoTileHolder
    /* renamed from: getVideoTileComposerReferences, reason: from getter */
    public ComposerReferences getComposerReferences() {
        return this.videoTileComposerReferences;
    }

    @Override // ru.ozon.app.android.videocover.VideoTileHolder
    public int getWidgetHolderPosition() {
        return this.widgetHolderPosition;
    }

    @Override // ru.ozon.app.android.videocover.VideoTile
    public void hidePreview() {
        this.videoTileView.hidePreview();
    }

    @Override // ru.ozon.app.android.videocover.VideoTileHolder
    /* renamed from: isHorizontalItem, reason: from getter */
    public boolean getIsHorizontalItem() {
        return this.isHorizontalItem;
    }

    @Override // ru.ozon.app.android.videocover.VideoTile
    public void onVideoStart() {
        this.videoTileView.onVideoStart();
    }

    @Override // ru.ozon.app.android.videocover.VideoTile
    public void onVideoStop() {
        this.videoTileView.onVideoStop();
    }

    @Override // jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        super.onViewInVisibleBounds();
        VideoTileDelegate videoTileDelegate = this.videoTileDelegate;
        if (videoTileDelegate != null) {
            videoTileDelegate.onVideoTileInVisibleBounds(this);
        }
    }

    @Override // jk0.j, lk0.b
    public void onViewOutOfVisibleBounds() {
        super.onViewOutOfVisibleBounds();
        VideoTileDelegate videoTileDelegate = this.videoTileDelegate;
        if (videoTileDelegate != null) {
            VideoTileDelegate.onVideoTileOutOfVisibleBounds$default(videoTileDelegate, this, false, 2, null);
        }
    }

    public final void setOnItemClicked(Function0<Unit> function0) {
        this.onItemClicked = function0;
    }

    public final void setOverlapContainerPositionInfo(@NotNull l overlapContainersPositionInfo) {
        Intrinsics.checkNotNullParameter(overlapContainersPositionInfo, "overlapContainersPositionInfo");
        this.overlapContainersPositionInfo = overlapContainersPositionInfo;
    }

    public final void setSwipeGalleryToFirstImage(Function1<? super Boolean, Boolean> function1) {
        this.swipeGalleryToFirstImage = function1;
    }

    public void setVideoItem(TileGrid2GalleryModel.GalleryItem.VideoItem videoItem) {
        this.videoItem = videoItem;
    }

    public void setVideoTileComposerReferences(ComposerReferences composerReferences) {
        this.videoTileComposerReferences = composerReferences;
    }

    public void setWidgetHolderPosition(int i11) {
        this.widgetHolderPosition = i11;
    }

    @Override // ru.ozon.app.android.videocover.VideoTile
    public void showPreview() {
        this.videoTileView.showPreview();
    }

    @Override // ru.ozon.app.android.videocover.VideoTileHolder
    public boolean swipeGalleryToFirstImage(boolean isSmooth) {
        Function1<? super Boolean, Boolean> function1 = this.swipeGalleryToFirstImage;
        if (function1 != null) {
            return function1.invoke(Boolean.valueOf(isSmooth)).booleanValue();
        }
        return false;
    }

    @Override // ru.ozon.app.android.videocover.VideoTileHolder
    public TileGrid2GalleryModel.GalleryItem.VideoItem getVideoItem() {
        return this.videoItem;
    }
}
