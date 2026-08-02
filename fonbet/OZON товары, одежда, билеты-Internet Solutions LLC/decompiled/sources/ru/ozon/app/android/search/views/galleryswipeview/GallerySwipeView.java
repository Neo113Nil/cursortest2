package ru.ozon.app.android.search.views.galleryswipeview;

import WZ.t;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.platform.rv.looped.LoopedRecyclerView;
import ru.ozon.app.android.platform.rv.looped.LoopedRecyclerViewAttacher;
import ru.ozon.app.android.product.common.overlaytitle.OverlayTitleView;
import ru.ozon.app.android.product.common.wave.WaveModel;
import ru.ozon.app.android.product.common.wave.WaveView;
import ru.ozon.app.android.search.R$id;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.presentation.image.SearchResultsGalleryModel;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.AdultImagesModel;
import ru.ozon.app.android.search.views.galleryswipeview.GallerySwipeView;
import ru.ozon.app.android.videocover.VideoTileDelegate;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator;

@Metadata(d1 = {"\u0000Á\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001L\b\u0007\u0018\u0000 d2\u00020\u0001:\u0001dB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J?\u0010!\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00182\u0012\u0010\u001c\u001a\u000e\u0012\u0002\b\u00030\u001aj\u0006\u0012\u0002\b\u0003`\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\r0\u001f¢\u0006\u0004\b!\u0010\"J\u0015\u0010%\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\r2\b\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0004\b)\u0010*J+\u0010/\u001a\u00020\r2\u001c\u0010.\u001a\u0018\u0012\f\u0012\n\u0018\u00010,j\u0004\u0018\u0001`-\u0012\u0004\u0012\u00020\r\u0018\u00010+¢\u0006\u0004\b/\u00100J\u0015\u00103\u001a\u00020\r2\u0006\u00102\u001a\u000201¢\u0006\u0004\b3\u00104J\u001f\u00109\u001a\u00020\r2\b\u00106\u001a\u0004\u0018\u0001052\u0006\u00108\u001a\u000207¢\u0006\u0004\b9\u0010:J\u0017\u0010<\u001a\u00020\r2\b\u00102\u001a\u0004\u0018\u00010;¢\u0006\u0004\b<\u0010=J\u0015\u0010?\u001a\u00020\r2\u0006\u00102\u001a\u00020>¢\u0006\u0004\b?\u0010@J\r\u0010A\u001a\u00020\r¢\u0006\u0004\bA\u0010\u0011J\r\u0010B\u001a\u00020\r¢\u0006\u0004\bB\u0010\u0011R\u0014\u0010D\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010G\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010J\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010M\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0017\u0010O\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR$\u0010S\u001a\u0004\u0018\u00010>8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010@R$\u0010X\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\u0018\u0010_\u001a\u0004\u0018\u00010^8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u0018\u0010a\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u0016\u0010c\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010P¨\u0006e"}, d2 = {"Lru/ozon/app/android/search/views/galleryswipeview/GallerySwipeView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "newPosition", "", "isScrolling", "", "onGalleryScrollStateChanged", "(IZ)V", "initPagerIndicatorLocator", "()V", "isSmooth", "swipeToFirstImage", "(Z)Z", "Lru/ozon/app/android/product/common/overlaytitle/OverlayTitleView;", "buildOverlayTitleView", "()Lru/ozon/app/android/product/common/overlaytitle/OverlayTitleView;", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "widgetViewHolder", "Lru/ozon/app/android/videocover/VideoTileDelegate;", "videoTileDelegate", "Lkotlin/Function0;", "onItemClickListener", "init", "(Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/composer/ui/widget/k;Lru/ozon/app/android/videocover/VideoTileDelegate;Lkotlin/jvm/functions/Function0;)V", "", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/image/SearchResultsGalleryModel$GalleryItem;", "getItems", "()Ljava/util/List;", "Landroidx/recyclerview/widget/RecyclerView$u;", "recycledViewPool", "setRecycledViewPool", "(Landroidx/recyclerview/widget/RecyclerView$u;)V", "Lkotlin/Function1;", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "onPinchToZoomStarted", "setOnPinchToZoomStartedCallback", "(Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/AdultImagesModel;", "model", "bind", "(Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/AdultImagesModel;)V", "", "overlayTitle", "Lru/ozon/app/android/product/common/overlaytitle/OverlayTitleView$SizeMode;", "sizeMode", "bindOverlayTitle", "(Ljava/lang/String;Lru/ozon/app/android/product/common/overlaytitle/OverlayTitleView$SizeMode;)V", "Lru/ozon/app/android/product/common/wave/WaveModel;", "bindWaveOrGone", "(Lru/ozon/app/android/product/common/wave/WaveModel;)V", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/image/SearchResultsGalleryModel;", "bindRatio", "(Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/image/SearchResultsGalleryModel;)V", "swipeToFirstVideo", "show", "Lru/ozon/app/android/platform/rv/looped/LoopedRecyclerView;", "itemsRv", "Lru/ozon/app/android/platform/rv/looped/LoopedRecyclerView;", "Lru/ozon/app/android/product/common/wave/WaveView;", "waveView", "Lru/ozon/app/android/product/common/wave/WaveView;", "Lru/tinkoff/scrollingpagerindicator/ScrollingPagerIndicator;", "pagerIndicator", "Lru/tinkoff/scrollingpagerindicator/ScrollingPagerIndicator;", "ru/ozon/app/android/search/views/galleryswipeview/GallerySwipeView$onScrollListener$1", "onScrollListener", "Lru/ozon/app/android/search/views/galleryswipeview/GallerySwipeView$onScrollListener$1;", "galleryId", "I", "getGalleryId", "()I", "localModel", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/image/SearchResultsGalleryModel;", "getLocalModel", "()Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/image/SearchResultsGalleryModel;", "setLocalModel", "localVideoTileDelegate", "Lru/ozon/app/android/videocover/VideoTileDelegate;", "getLocalVideoTileDelegate", "()Lru/ozon/app/android/videocover/VideoTileDelegate;", "setLocalVideoTileDelegate", "(Lru/ozon/app/android/videocover/VideoTileDelegate;)V", "Lru/ozon/app/android/search/views/galleryswipeview/GalleryAdapter;", "adapter", "Lru/ozon/app/android/search/views/galleryswipeview/GalleryAdapter;", "overlayTitleView", "Lru/ozon/app/android/product/common/overlaytitle/OverlayTitleView;", "currentPosition", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GallerySwipeView extends ConstraintLayout {
    private GalleryAdapter adapter;
    private int currentPosition;
    private final int galleryId;

    @NotNull
    private final LoopedRecyclerView itemsRv;
    private SearchResultsGalleryModel localModel;
    private VideoTileDelegate localVideoTileDelegate;

    @NotNull
    private final GallerySwipeView$onScrollListener$1 onScrollListener;
    private OverlayTitleView overlayTitleView;

    @NotNull
    private final ScrollingPagerIndicator pagerIndicator;

    @NotNull
    private final WaveView waveView;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "newPosition", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.search.views.galleryswipeview.GallerySwipeView$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<Integer, Unit> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            invoke(num.intValue());
            return Unit.f71690a;
        }

        public final void invoke(int i11) {
            GallerySwipeView.this.currentPosition = i11;
            SearchResultsGalleryModel localModel = GallerySwipeView.this.getLocalModel();
            if (localModel != null) {
                localModel.setGalleryPosition(i11);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/search/views/galleryswipeview/GallerySwipeView$Companion;", "", "<init>", "()V", "PAGER_INDICATOR_LOCATOR_PREFIX", "", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GallerySwipeView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final OverlayTitleView buildOverlayTitleView() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        OverlayTitleView overlayTitleView = new OverlayTitleView(context, null, 0, 6, null);
        overlayTitleView.setId(View.generateViewId());
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, -2);
        bVar.f41656t = 0;
        bVar.f41658v = 0;
        bVar.f41642l = this.waveView.getId();
        overlayTitleView.setLayoutParams(bVar);
        return overlayTitleView;
    }

    private final void initPagerIndicatorLocator() {
        this.pagerIndicator.setContentDescription("PagerIndicatorPosition.0");
        this.itemsRv.addOnPositionChangeListener(new GallerySwipeView$initPagerIndicatorLocator$1(this));
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
        List<SearchResultsGalleryModel.GalleryItem> items;
        GalleryAdapter galleryAdapter = this.adapter;
        if (galleryAdapter != null && (items = galleryAdapter.getItems()) != null) {
            Iterator<SearchResultsGalleryModel.GalleryItem> it = items.iterator();
            int i11 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i11 = -1;
                    break;
                }
                if (it.next() instanceof SearchResultsGalleryModel.GalleryItem.ImageItem) {
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
                post(new Runnable() { // from class: lI.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        GallerySwipeView.swipeToFirstImage$lambda$8$lambda$7(GallerySwipeView.this, isSmooth, intValue);
                    }
                });
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void swipeToFirstImage$lambda$8$lambda$7(GallerySwipeView gallerySwipeView, boolean z11, int i11) {
        if (gallerySwipeView.currentPosition != 0) {
            return;
        }
        if (z11) {
            gallerySwipeView.itemsRv.smoothScrollToCorrectPosition(i11);
        } else {
            gallerySwipeView.itemsRv.scrollToCorrectPosition(i11);
        }
    }

    public final void bind(@NotNull AdultImagesModel model) {
        List<SearchResultsGalleryModel.GalleryItem> imageItems;
        Intrinsics.checkNotNullParameter(model, "model");
        boolean isEmpty = model.getImageItems().isEmpty();
        SearchResultsGalleryModel searchResultsGalleryModel = this.localModel;
        Integer valueOf = searchResultsGalleryModel != null ? Integer.valueOf(searchResultsGalleryModel.getGalleryPosition()) : null;
        if (!isEmpty) {
            if (model.getShouldBlur()) {
                SearchResultsGalleryModel.GalleryItem blurPlaceholderImage = model.getBlurPlaceholderImage();
                if (blurPlaceholderImage == null || (imageItems = C7714v.a0(blurPlaceholderImage)) == null) {
                    imageItems = K.f71697a;
                }
            } else {
                imageItems = model.getImageItems();
            }
            GalleryAdapter galleryAdapter = this.adapter;
            if (galleryAdapter != null) {
                galleryAdapter.setItems(imageItems);
            }
            if (valueOf != null) {
                this.itemsRv.scrollToCorrectPosition(valueOf.intValue());
            }
        }
        this.itemsRv.setVisibility(!isEmpty ? 0 : 8);
    }

    public final void bindOverlayTitle(String overlayTitle, @NotNull OverlayTitleView.SizeMode sizeMode) {
        Intrinsics.checkNotNullParameter(sizeMode, "sizeMode");
        if (overlayTitle == null) {
            OverlayTitleView overlayTitleView = this.overlayTitleView;
            if (overlayTitleView != null) {
                ViewExtKt.gone(overlayTitleView);
                return;
            }
            return;
        }
        if (this.overlayTitleView == null) {
            OverlayTitleView buildOverlayTitleView = buildOverlayTitleView();
            this.overlayTitleView = buildOverlayTitleView;
            addView(buildOverlayTitleView, indexOfChild(this.waveView));
        }
        OverlayTitleView overlayTitleView2 = this.overlayTitleView;
        if (overlayTitleView2 != null) {
            overlayTitleView2.bind(overlayTitle, sizeMode);
        }
        OverlayTitleView overlayTitleView3 = this.overlayTitleView;
        if (overlayTitleView3 != null) {
            ViewExtKt.show(overlayTitleView3);
        }
    }

    public final void bindRatio(@NotNull SearchResultsGalleryModel model) {
        Intrinsics.checkNotNullParameter(model, "model");
        if (model.getAdultImagesModel().getImageItems().isEmpty()) {
            ViewExtKt.gone(this.itemsRv);
            return;
        }
        ViewExtKt.show(this);
        ViewGroup.LayoutParams layoutParams = this.itemsRv.getLayoutParams();
        ConstraintLayout.b bVar = layoutParams instanceof ConstraintLayout.b ? (ConstraintLayout.b) layoutParams : null;
        if (Intrinsics.d(bVar != null ? bVar.f41600G : null, model.getRatio())) {
            return;
        }
        d dVar = new d();
        dVar.p(this);
        dVar.X(R$id.itemsRv, model.getRatio());
        dVar.f(this);
    }

    public final void bindWaveOrGone(WaveModel model) {
        if (model == null) {
            ViewExtKt.gone(this.waveView);
        } else {
            this.waveView.bind(model);
            ViewExtKt.show(this.waveView);
        }
    }

    public final int getGalleryId() {
        return this.galleryId;
    }

    public final List<SearchResultsGalleryModel.GalleryItem> getItems() {
        GalleryAdapter galleryAdapter = this.adapter;
        if (galleryAdapter != null) {
            return galleryAdapter.getItems();
        }
        return null;
    }

    public final SearchResultsGalleryModel getLocalModel() {
        return this.localModel;
    }

    public final void init(@NotNull ComposerReferences references, @NotNull k<?> widgetViewHolder, @NotNull VideoTileDelegate videoTileDelegate, @NotNull Function0<Unit> onItemClickListener) {
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(widgetViewHolder, "widgetViewHolder");
        Intrinsics.checkNotNullParameter(videoTileDelegate, "videoTileDelegate");
        Intrinsics.checkNotNullParameter(onItemClickListener, "onItemClickListener");
        GalleryAdapter galleryAdapter = new GalleryAdapter(references, widgetViewHolder, videoTileDelegate, new GallerySwipeView$init$1(this), onItemClickListener);
        this.adapter = galleryAdapter;
        this.localVideoTileDelegate = videoTileDelegate;
        this.itemsRv.setAdapter(galleryAdapter);
        this.pagerIndicator.c(this.itemsRv, new LoopedRecyclerViewAttacher());
    }

    public final void setLocalModel(SearchResultsGalleryModel searchResultsGalleryModel) {
        this.localModel = searchResultsGalleryModel;
    }

    public final void setOnPinchToZoomStartedCallback(Function1<? super t, Unit> onPinchToZoomStarted) {
        GalleryAdapter galleryAdapter = this.adapter;
        if (galleryAdapter != null) {
            galleryAdapter.setOnPinchToZoomStarted(onPinchToZoomStarted);
        }
    }

    public final void setRecycledViewPool(RecyclerView.u recycledViewPool) {
        this.itemsRv.setRecycledViewPool(recycledViewPool);
    }

    public final void show() {
        ViewExtKt.show(this);
    }

    public final void swipeToFirstVideo() {
        List<SearchResultsGalleryModel.GalleryItem> items;
        GalleryAdapter galleryAdapter = this.adapter;
        if (galleryAdapter == null || (items = galleryAdapter.getItems()) == null) {
            return;
        }
        Iterator<SearchResultsGalleryModel.GalleryItem> it = items.iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            } else if (it.next() instanceof SearchResultsGalleryModel.GalleryItem.VideoItem) {
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
            SearchResultsGalleryModel searchResultsGalleryModel = this.localModel;
            if (searchResultsGalleryModel != null) {
                searchResultsGalleryModel.setGalleryPosition(0);
            }
        }
    }

    public /* synthetic */ GallerySwipeView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.recyclerview.widget.RecyclerView$t, ru.ozon.app.android.search.views.galleryswipeview.GallerySwipeView$onScrollListener$1] */
    public GallerySwipeView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        GallerySwipeViewBuilder gallerySwipeViewBuilder = GallerySwipeViewBuilder.INSTANCE;
        LoopedRecyclerView appendItemsRv = gallerySwipeViewBuilder.appendItemsRv(this);
        this.itemsRv = appendItemsRv;
        this.waveView = gallerySwipeViewBuilder.appendWaveView(this);
        this.pagerIndicator = gallerySwipeViewBuilder.appendIndicator(this);
        ?? r22 = new RecyclerView.t() { // from class: ru.ozon.app.android.search.views.galleryswipeview.GallerySwipeView$onScrollListener$1
            private boolean isGalleryScrolling;

            @Override // androidx.recyclerview.widget.RecyclerView.t
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                int i12;
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                boolean z11 = newState != 0;
                if (z11 != this.isGalleryScrolling) {
                    this.isGalleryScrolling = z11;
                    GallerySwipeView gallerySwipeView = GallerySwipeView.this;
                    i12 = gallerySwipeView.currentPosition;
                    gallerySwipeView.onGalleryScrollStateChanged(i12, z11);
                }
            }
        };
        this.onScrollListener = r22;
        this.galleryId = getId();
        this.currentPosition = -1;
        new x().attachToRecyclerView(appendItemsRv);
        initPagerIndicatorLocator();
        appendItemsRv.addOnPositionChangeListener(new AnonymousClass1());
        appendItemsRv.addOnScrollListener(r22);
        appendItemsRv.initListeners();
    }
}
