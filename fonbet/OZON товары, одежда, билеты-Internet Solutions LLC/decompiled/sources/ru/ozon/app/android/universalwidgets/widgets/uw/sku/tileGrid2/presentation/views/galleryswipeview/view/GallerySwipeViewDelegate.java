package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.views.galleryswipeview.view;

import android.view.MotionEvent;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.a;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.platform.rv.looped.LoopedRecyclerView;
import ru.ozon.app.android.product.common.TileThemeConfigVO;
import ru.ozon.app.android.product.molecules.blur.presentation.BlurMoleculeDelegate;
import ru.ozon.app.android.product.molecules.blur.presentation.BlurMoleculeDelegateKt;
import ru.ozon.app.android.product.molecules.blur.presentation.BlurMoleculeVO;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.views.galleryswipeview.data.AdultImagesModel;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.views.galleryswipeview.data.TileGrid2GalleryModel;
import ru.ozon.app.android.universalwidgets.R$drawable;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.cache.image.TileGrid2ImageCache;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.prefetch.TileGrid2ImageSizeCalculator;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.views.galleryswipeview.adapter.GalleryAdapter;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.views.galleryswipeview.builder.GallerySwipeViewBuilder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.views.galleryswipeview.indicator.IndicatorAdapter;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.views.galleryswipeview.view.GallerySwipeViewDelegate;
import ru.ozon.app.android.videocover.VideoTileDelegate;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000»\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001P\b\u0000\u0018\u0000 \\2\u00020\u0001:\u0002\\]B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010!\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\fH\u0016¢\u0006\u0004\b&\u0010\u0010J\u0015\u0010)\u001a\u00020\u00042\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\u0015\u0010-\u001a\u00020\f2\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.Jc\u0010?\u001a\u00020\f2\u0006\u00100\u001a\u00020/2\u0012\u00103\u001a\u000e\u0012\u0002\b\u000301j\u0006\u0012\u0002\b\u0003`22\b\u00105\u001a\u0004\u0018\u0001042\u0006\u00106\u001a\u00020\u00042\f\u00108\u001a\b\u0012\u0004\u0012\u00020\f072\u0006\u0010:\u001a\u0002092\u0006\u0010<\u001a\u00020;2\b\u0010>\u001a\u0004\u0018\u00010=¢\u0006\u0004\b?\u0010@R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010AR\u0017\u0010C\u001a\u00020B8\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0014\u0010H\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u001a\u0010J\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u001a\u0010N\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bN\u0010K\u001a\u0004\bO\u0010MR\u0014\u0010Q\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u001a\u0010T\u001a\b\u0012\u0004\u0012\u00020+0S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0018\u0010V\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u0018\u0010Y\u001a\u0004\u0018\u00010X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010[\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010K¨\u0006^"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/views/galleryswipeview/view/GallerySwipeViewDelegate;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/views/galleryswipeview/view/GalleryBaseViewDelegate;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "root", "", "isGalleryOverdrawEnabled", "isIndicatorInflateEnabled", "<init>", "(Landroidx/constraintlayout/widget/ConstraintLayout;ZZ)V", "", "newPosition", "isScrolling", "", "onGalleryScrollStateChanged", "(IZ)V", "initPagerIndicatorLocator", "()V", "isSmooth", "swipeToFirstImage", "(Z)Z", "", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/views/galleryswipeview/data/TileGrid2GalleryModel$GalleryItem;", "getItems", "()Ljava/util/List;", "Landroidx/recyclerview/widget/RecyclerView$u;", "recycledViewPool", "setRecycledViewPool", "(Landroidx/recyclerview/widget/RecyclerView$u;)V", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/views/galleryswipeview/data/AdultImagesModel;", "model", "adultConfirmed", "Lru/ozon/app/android/product/common/TileThemeConfigVO;", "theme", "bind", "(Lru/ozon/app/android/product/tiles/tilegrid2/presentation/views/galleryswipeview/data/AdultImagesModel;ZLru/ozon/app/android/product/common/TileThemeConfigVO;)V", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/views/galleryswipeview/data/TileGrid2GalleryModel;", "bindRatio", "(Lru/ozon/app/android/product/tiles/tilegrid2/presentation/views/galleryswipeview/data/TileGrid2GalleryModel;)V", "swipeToFirstVideo", "Landroid/view/MotionEvent;", "event", "onTouchViewEvent", "(Landroid/view/MotionEvent;)Z", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/views/galleryswipeview/view/GallerySwipeViewDelegate$OnPositionChangedListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addOnPositionChangedListener", "(Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/views/galleryswipeview/view/GallerySwipeViewDelegate$OnPositionChangedListener;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "widgetViewHolder", "Lru/ozon/app/android/videocover/VideoTileDelegate;", "videoTileDelegate", "shouldPreCreate", "Lkotlin/Function0;", "onItemClickListener", "Lru/ozon/app/android/product/molecules/blur/presentation/BlurMoleculeDelegate;", "blurMoleculeDelegate", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/cache/image/TileGrid2ImageCache;", "imageCache", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/prefetch/TileGrid2ImageSizeCalculator;", "imageSizeCalculator", "init", "(Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/composer/ui/widget/k;Lru/ozon/app/android/videocover/VideoTileDelegate;ZLkotlin/jvm/functions/Function0;Lru/ozon/app/android/product/molecules/blur/presentation/BlurMoleculeDelegate;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/cache/image/TileGrid2ImageCache;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/prefetch/TileGrid2ImageSizeCalculator;)V", "Z", "Lru/ozon/app/android/platform/rv/looped/LoopedRecyclerView;", "itemsRv", "Lru/ozon/app/android/platform/rv/looped/LoopedRecyclerView;", "getItemsRv", "()Lru/ozon/app/android/platform/rv/looped/LoopedRecyclerView;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/views/galleryswipeview/indicator/IndicatorAdapter;", "pagerIndicatorAdapter", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/views/galleryswipeview/indicator/IndicatorAdapter;", "bottomViewId", "I", "getBottomViewId", "()I", "containerId", "getContainerId", "ru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/views/galleryswipeview/view/GallerySwipeViewDelegate$onScrollListener$1", "onScrollListener", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/views/galleryswipeview/view/GallerySwipeViewDelegate$onScrollListener$1;", "", "positionChangedListeners", "Ljava/util/List;", "localVideoTileDelegate", "Lru/ozon/app/android/videocover/VideoTileDelegate;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/views/galleryswipeview/adapter/GalleryAdapter;", "adapter", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/views/galleryswipeview/adapter/GalleryAdapter;", "currentPosition", "Companion", "OnPositionChangedListener", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GallerySwipeViewDelegate extends GalleryBaseViewDelegate {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private GalleryAdapter adapter;
    private final int bottomViewId;
    private final int containerId;
    private int currentPosition;
    private final boolean isGalleryOverdrawEnabled;

    @NotNull
    private final LoopedRecyclerView itemsRv;
    private VideoTileDelegate localVideoTileDelegate;

    @NotNull
    private final GallerySwipeViewDelegate$onScrollListener$1 onScrollListener;

    @NotNull
    private final IndicatorAdapter pagerIndicatorAdapter;

    @NotNull
    private final List<OnPositionChangedListener> positionChangedListeners;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/views/galleryswipeview/view/GallerySwipeViewDelegate$Companion;", "", "<init>", "()V", "PAGER_INDICATOR_LOCATOR_PREFIX", "", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/views/galleryswipeview/view/GallerySwipeViewDelegate$OnPositionChangedListener;", "", "onPositionChanged", "", "oldPosition", "", "newPosition", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnPositionChangedListener {
        void onPositionChanged(int oldPosition, int newPosition);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [androidx.recyclerview.widget.RecyclerView$t, ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.views.galleryswipeview.view.GallerySwipeViewDelegate$onScrollListener$1] */
    public GallerySwipeViewDelegate(@NotNull ConstraintLayout root, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(root, "root");
        this.isGalleryOverdrawEnabled = z11;
        GallerySwipeViewBuilder gallerySwipeViewBuilder = GallerySwipeViewBuilder.INSTANCE;
        LoopedRecyclerView appendItemsRv = gallerySwipeViewBuilder.appendItemsRv(root);
        this.itemsRv = appendItemsRv;
        IndicatorAdapter appendIndicator = gallerySwipeViewBuilder.appendIndicator(root, z12);
        this.pagerIndicatorAdapter = appendIndicator;
        this.bottomViewId = appendIndicator.getIndicator().getId();
        this.containerId = appendItemsRv.getId();
        ?? r32 = new RecyclerView.t() { // from class: ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.views.galleryswipeview.view.GallerySwipeViewDelegate$onScrollListener$1
            private boolean isGalleryScrolling;

            @Override // androidx.recyclerview.widget.RecyclerView.t
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                int i11;
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                boolean z13 = newState != 0;
                if (z13 != this.isGalleryScrolling) {
                    this.isGalleryScrolling = z13;
                    GallerySwipeViewDelegate gallerySwipeViewDelegate = GallerySwipeViewDelegate.this;
                    i11 = gallerySwipeViewDelegate.currentPosition;
                    gallerySwipeViewDelegate.onGalleryScrollStateChanged(i11, z13);
                }
            }
        };
        this.onScrollListener = r32;
        this.positionChangedListeners = new ArrayList();
        this.currentPosition = -1;
        new x().attachToRecyclerView(appendItemsRv);
        initPagerIndicatorLocator();
        if (!z11) {
            appendItemsRv.setBackground(a.getDrawable(appendItemsRv.getContext(), R$drawable.bg_white_color));
        }
        appendItemsRv.setOutlineProvider(getGalleryOutlineProvider());
        appendItemsRv.setClipToOutline(true);
        appendItemsRv.addOnPositionChangeListener(new GallerySwipeViewDelegate$1$1(this));
        appendItemsRv.addOnScrollListener(r32);
        appendItemsRv.initListeners();
    }

    private final void initPagerIndicatorLocator() {
        this.pagerIndicatorAdapter.getIndicator().setContentDescription("PagerIndicatorPosition.0");
        this.itemsRv.addOnPositionChangeListener(new GallerySwipeViewDelegate$initPagerIndicatorLocator$1(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onGalleryScrollStateChanged(int newPosition, boolean isScrolling) {
        RecyclerView.C findCorrectViewHolderForAdapterPosition = this.itemsRv.findCorrectViewHolderForAdapterPosition(newPosition);
        if (isScrolling) {
            VideoTileDelegate videoTileDelegate = this.localVideoTileDelegate;
            if (videoTileDelegate != null) {
                videoTileDelegate.onGalleryItemSwipeStart(findCorrectViewHolderForAdapterPosition);
                return;
            }
            return;
        }
        VideoTileDelegate videoTileDelegate2 = this.localVideoTileDelegate;
        if (videoTileDelegate2 != null) {
            videoTileDelegate2.onGalleryItemSwipeEnd(findCorrectViewHolderForAdapterPosition);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean swipeToFirstImage(final boolean isSmooth) {
        List<TileGrid2GalleryModel.GalleryItem> items;
        GalleryAdapter galleryAdapter = this.adapter;
        if (galleryAdapter != null && (items = galleryAdapter.getItems()) != null) {
            Iterator<TileGrid2GalleryModel.GalleryItem> it = items.iterator();
            int i11 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i11 = -1;
                    break;
                }
                if (it.next() instanceof TileGrid2GalleryModel.GalleryItem.ImageItem) {
                    break;
                }
                i11++;
            }
            Integer valueOf = Integer.valueOf(i11);
            if (i11 < 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                final int intValue = valueOf.intValue();
                this.itemsRv.post(new Runnable() { // from class: lY.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        GallerySwipeViewDelegate.swipeToFirstImage$lambda$10$lambda$9(GallerySwipeViewDelegate.this, isSmooth, intValue);
                    }
                });
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void swipeToFirstImage$lambda$10$lambda$9(GallerySwipeViewDelegate gallerySwipeViewDelegate, boolean z11, int i11) {
        if (gallerySwipeViewDelegate.currentPosition != 0) {
            return;
        }
        if (z11) {
            gallerySwipeViewDelegate.itemsRv.smoothScrollToCorrectPosition(i11);
        } else {
            gallerySwipeViewDelegate.itemsRv.scrollToCorrectPosition(i11);
        }
    }

    public final void addOnPositionChangedListener(@NotNull OnPositionChangedListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.positionChangedListeners.add(listener);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
    
        if (r6 != null) goto L16;
     */
    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.views.galleryswipeview.view.GalleryBaseViewDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void bind(@NotNull AdultImagesModel model, boolean adultConfirmed, @NotNull TileThemeConfigVO theme) {
        List<TileGrid2GalleryModel.GalleryItem> imageItems;
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(theme, "theme");
        boolean isEmpty = model.getImageItems().isEmpty();
        TileGrid2GalleryModel localModel = getLocalModel();
        Integer valueOf = localModel != null ? Integer.valueOf(localModel.getGalleryPosition()) : null;
        if (!isEmpty) {
            BlurMoleculeVO blurMolecule = model.getBlurMolecule();
            if (blurMolecule != null) {
                BlurMoleculeVO blurMoleculeVO = BlurMoleculeDelegateKt.needShowBlur(blurMolecule, adultConfirmed) ? blurMolecule : null;
                if (blurMoleculeVO != null) {
                    imageItems = C7714v.a0(new TileGrid2GalleryModel.GalleryItem.BlurItem(blurMoleculeVO));
                }
            }
            imageItems = model.getImageItems();
            GalleryAdapter galleryAdapter = this.adapter;
            if (galleryAdapter != null) {
                galleryAdapter.setItems(imageItems);
            }
            if (valueOf != null) {
                this.itemsRv.scrollToCorrectPosition(valueOf.intValue());
            }
        }
        this.itemsRv.setVisibility(!isEmpty ? 0 : 8);
        ViewExtKt.showOrGone(this.pagerIndicatorAdapter.getIndicator(), Boolean.valueOf(!model.getIsPagerIndicatorHidden()));
        setGalleryRadius(theme.getContainerCornerRadius());
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.views.galleryswipeview.view.GalleryBaseViewDelegate
    public void bindRatio(@NotNull TileGrid2GalleryModel model) {
        Intrinsics.checkNotNullParameter(model, "model");
        if (model.getAdultImagesModel().getImageItems().isEmpty()) {
            ViewExtKt.gone(this.itemsRv);
            return;
        }
        ViewExtKt.show(this.itemsRv);
        ViewGroup.LayoutParams layoutParams = this.itemsRv.getLayoutParams();
        ConstraintLayout.b bVar = layoutParams instanceof ConstraintLayout.b ? (ConstraintLayout.b) layoutParams : null;
        if (bVar == null || Intrinsics.d(bVar.f41600G, model.getRatio())) {
            return;
        }
        bVar.f41600G = model.getRatio();
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.views.galleryswipeview.view.GalleryBaseViewDelegate
    public int getBottomViewId() {
        return this.bottomViewId;
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.views.galleryswipeview.view.GalleryBaseViewDelegate
    public int getContainerId() {
        return this.containerId;
    }

    public List<TileGrid2GalleryModel.GalleryItem> getItems() {
        GalleryAdapter galleryAdapter = this.adapter;
        if (galleryAdapter != null) {
            return galleryAdapter.getItems();
        }
        return null;
    }

    public final void init(@NotNull ComposerReferences references, @NotNull k<?> widgetViewHolder, VideoTileDelegate videoTileDelegate, boolean shouldPreCreate, @NotNull Function0<Unit> onItemClickListener, @NotNull BlurMoleculeDelegate blurMoleculeDelegate, @NotNull TileGrid2ImageCache imageCache, TileGrid2ImageSizeCalculator imageSizeCalculator) {
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(widgetViewHolder, "widgetViewHolder");
        Intrinsics.checkNotNullParameter(onItemClickListener, "onItemClickListener");
        Intrinsics.checkNotNullParameter(blurMoleculeDelegate, "blurMoleculeDelegate");
        Intrinsics.checkNotNullParameter(imageCache, "imageCache");
        GalleryAdapter galleryAdapter = new GalleryAdapter(references, widgetViewHolder, videoTileDelegate, shouldPreCreate, new GallerySwipeViewDelegate$init$1(this), onItemClickListener, blurMoleculeDelegate, imageCache, this.isGalleryOverdrawEnabled, imageSizeCalculator);
        this.adapter = galleryAdapter;
        this.localVideoTileDelegate = videoTileDelegate;
        this.itemsRv.setAdapter(galleryAdapter);
        this.itemsRv.setHasFixedSize(true);
        this.pagerIndicatorAdapter.attachToPager(this.itemsRv);
    }

    public final boolean onTouchViewEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return this.itemsRv.onTouchEvent(event);
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.views.galleryswipeview.view.GalleryBaseViewDelegate
    public void setRecycledViewPool(RecyclerView.u recycledViewPool) {
        this.itemsRv.setRecycledViewPool(recycledViewPool);
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.views.galleryswipeview.view.GalleryBaseViewDelegate
    public void swipeToFirstVideo() {
        List<TileGrid2GalleryModel.GalleryItem> items;
        GalleryAdapter galleryAdapter = this.adapter;
        if (galleryAdapter == null || (items = galleryAdapter.getItems()) == null) {
            return;
        }
        Iterator<TileGrid2GalleryModel.GalleryItem> it = items.iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            } else if (it.next() instanceof TileGrid2GalleryModel.GalleryItem.VideoItem) {
                break;
            } else {
                i11++;
            }
        }
        Integer valueOf = Integer.valueOf(i11);
        if (valueOf.intValue() < 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            this.itemsRv.scrollToCorrectPosition(valueOf.intValue());
            this.currentPosition = 0;
            TileGrid2GalleryModel localModel = getLocalModel();
            if (localModel != null) {
                localModel.setGalleryPosition(0);
            }
        }
    }
}
