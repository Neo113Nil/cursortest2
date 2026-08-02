package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.prefetch;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.preload.ImagePrefetcher;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.data.TileGrid2VO;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.views.galleryswipeview.data.TileGrid2GalleryModel;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.utils.JobGroupManager;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.utils.MultipleDebounceHandler;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0000\u0018\u0000 -2\u00020\u0001:\u0001-B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000fJ\u0016\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u0003J&\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020$J\u0006\u0010&\u001a\u00020\u001bJ\u0018\u0010'\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020$H\u0002J\u001c\u0010*\u001a\u00020\u001b2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u0019H\u0002J\u0018\u0010,\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010!\u001a\u00020\"H\u0002R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\u0014\u001a\u001e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b0\u0015j\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b`\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u00190\u0018X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/prefetch/TileGrid2GalleryImagePrefetchHelper;", "", "prefetchDelay", "", "dispatcherProvider", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "imagePrefetcher", "Lru/ozon/app/android/pikazon/preload/ImagePrefetcher;", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/data/TileGrid2VO;", "<init>", "(FLru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;Lru/ozon/app/android/pikazon/preload/ImagePrefetcher;)V", "onScrollStateChangedHasCalled", "", "recyclerRef", "Ljava/lang/ref/WeakReference;", "Landroidx/recyclerview/widget/RecyclerView;", "prefetchDelayInMillis", "", "jobGroupManager", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/utils/JobGroupManager;", "itemsToPrefetch", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "multipleDebounceHandler", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/utils/MultipleDebounceHandler;", "Lkotlin/Pair;", "prepare", "", "recycler", "onWidgetVisibleAreaChanged", "item", "visiblePercent", "onGalleryItemPositionChanged", "context", "Landroid/content/Context;", "oldPosition", "", "newPosition", "onClear", "onScrollStateChanged", "recyclerView", "newState", "onVisibleAreaChanged", "info", "prefetchItemIfNeeded", "Companion", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TileGrid2GalleryImagePrefetchHelper {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final ImagePrefetcher<TileGrid2VO> imagePrefetcher;

    @NotNull
    private final HashMap<Long, TileGrid2VO> itemsToPrefetch;

    @NotNull
    private final JobGroupManager jobGroupManager;

    @NotNull
    private final MultipleDebounceHandler<Pair<TileGrid2VO, Float>> multipleDebounceHandler;
    private boolean onScrollStateChangedHasCalled;
    private final long prefetchDelayInMillis;

    @NotNull
    private WeakReference<RecyclerView> recyclerRef;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/prefetch/TileGrid2GalleryImagePrefetchHelper$Companion;", "", "<init>", "()V", "NO_PREFETCH_POSITION", "", "VISIBLE_PERCENT_TO_PREFETCH", "", "VISIBLE_AREA_CHANGED_DEBOUNCE", "", "ONE_SECOND", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public TileGrid2GalleryImagePrefetchHelper(float f7, @NotNull CoroutineDispatcherProvider dispatcherProvider, @NotNull ImagePrefetcher<TileGrid2VO> imagePrefetcher) {
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(imagePrefetcher, "imagePrefetcher");
        this.imagePrefetcher = imagePrefetcher;
        this.recyclerRef = new WeakReference<>(null);
        this.prefetchDelayInMillis = (long) (f7 * 1000);
        this.jobGroupManager = new JobGroupManager(dispatcherProvider);
        this.itemsToPrefetch = new HashMap<>();
        this.multipleDebounceHandler = new MultipleDebounceHandler<>(dispatcherProvider, 100L, new TileGrid2GalleryImagePrefetchHelper$multipleDebounceHandler$1(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onScrollStateChanged(RecyclerView recyclerView, int newState) {
        this.onScrollStateChangedHasCalled = true;
        this.jobGroupManager.cancelJobGroup();
        if (newState == 0) {
            this.jobGroupManager.restartJobGroup();
            this.jobGroupManager.startAction(this.prefetchDelayInMillis, new TileGrid2GalleryImagePrefetchHelper$onScrollStateChanged$1(this, recyclerView, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onVisibleAreaChanged(Pair<TileGrid2VO, Float> info) {
        RecyclerView recyclerView;
        TileGrid2VO a11 = info.a();
        if (info.b().floatValue() <= 0.5f) {
            this.itemsToPrefetch.remove(Long.valueOf(a11.getId()));
            return;
        }
        this.itemsToPrefetch.put(Long.valueOf(a11.getId()), a11);
        if (this.onScrollStateChangedHasCalled || (recyclerView = this.recyclerRef.get()) == null) {
            return;
        }
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        prefetchItemIfNeeded(a11, context);
    }

    private final void prefetchItemIfNeeded(TileGrid2VO item, Context context) {
        if (this.itemsToPrefetch.get(Long.valueOf(item.getId())) == null) {
            return;
        }
        this.imagePrefetcher.prefetch(context, C7714v.a0(item));
    }

    public final void onClear() {
        this.onScrollStateChangedHasCalled = false;
        this.jobGroupManager.cancelJobGroup();
        this.multipleDebounceHandler.clear();
    }

    public final void onGalleryItemPositionChanged(@NotNull Context context, @NotNull TileGrid2VO item, int oldPosition, int newPosition) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(item, "item");
        int P11 = C7714v.P(item.getGalleryModel().getAdultImagesModel().getImageItems());
        boolean z11 = newPosition >= oldPosition;
        boolean z12 = newPosition == P11;
        if (!z11 || z12) {
            item.getGalleryModel().setGalleryPrefetchPosition(-1);
            return;
        }
        TileGrid2GalleryModel galleryModel = item.getGalleryModel();
        int i11 = newPosition + 1;
        if (i11 <= P11) {
            P11 = i11;
        }
        galleryModel.setGalleryPrefetchPosition(P11);
        prefetchItemIfNeeded(item, context);
    }

    public final void onWidgetVisibleAreaChanged(@NotNull TileGrid2VO item, float visiblePercent) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.multipleDebounceHandler.handle(item.getId(), new Pair<>(item, Float.valueOf(visiblePercent)));
    }

    public final void prepare(@NotNull RecyclerView recycler) {
        Intrinsics.checkNotNullParameter(recycler, "recycler");
        this.recyclerRef = new WeakReference<>(recycler);
        recycler.addOnScrollListener(new RecyclerView.t() { // from class: ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.prefetch.TileGrid2GalleryImagePrefetchHelper$prepare$$inlined$doOnScrollStateChanged$1
            @Override // androidx.recyclerview.widget.RecyclerView.t
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                TileGrid2GalleryImagePrefetchHelper.this.onScrollStateChanged(recyclerView, newState);
            }
        });
    }
}
