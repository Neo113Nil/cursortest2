package ru.ozon.app.android.pdp.widgets.galleryV4.presentation.gallery;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.Q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000?\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u000e\b\u0001\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016J\u0016\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0007J\u000e\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0006R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\fR\u0010\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000f¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/gallery/GalleryVideoItemsVisibilityHandler;", "", "<init>", "()V", "videoItems", "", "", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/gallery/GallerySyncVideoItem;", "layoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "screenWidth", "curVisibleVideoPos", "Ljava/lang/Integer;", "scrollListener", "ru/ozon/app/android/pdp/widgets/galleryV4/presentation/gallery/GalleryVideoItemsVisibilityHandler$scrollListener$1", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/gallery/GalleryVideoItemsVisibilityHandler$scrollListener$1;", "updateItems", "", "isForcedAllPause", "", "onAttach", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "onDetach", "bind", "position", "item", "unBind", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GalleryVideoItemsVisibilityHandler {
    private Integer curVisibleVideoPos;
    private LinearLayoutManager layoutManager;
    private int screenWidth;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private Map<Integer, GallerySyncVideoItem> videoItems = new LinkedHashMap();

    @NotNull
    private GalleryVideoItemsVisibilityHandler$scrollListener$1 scrollListener = new RecyclerView.t() { // from class: ru.ozon.app.android.pdp.widgets.galleryV4.presentation.gallery.GalleryVideoItemsVisibilityHandler$scrollListener$1
        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            if (dx != 0) {
                GalleryVideoItemsVisibilityHandler.this.updateItems(false);
            }
        }
    };

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/gallery/GalleryVideoItemsVisibilityHandler$Companion;", "", "<init>", "()V", "SINGLE_ITEM_PERCENT", "", "ITEMS_PERCENT", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public final void bind(int position, @NotNull GallerySyncVideoItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.videoItems.put(Integer.valueOf(position), item);
    }

    public final void onAttach(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        this.layoutManager = linearLayoutManager;
        this.screenWidth = recyclerView.getResources().getDisplayMetrics().widthPixels;
        recyclerView.addOnScrollListener(this.scrollListener);
    }

    public final void onDetach(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        recyclerView.removeOnScrollListener(this.scrollListener);
        this.videoItems.clear();
    }

    public final void unBind(int position) {
        Function0<Unit> onPauseVideo;
        GallerySyncVideoItem gallerySyncVideoItem = this.videoItems.get(Integer.valueOf(position));
        if (gallerySyncVideoItem != null && (onPauseVideo = gallerySyncVideoItem.getOnPauseVideo()) != null) {
            onPauseVideo.invoke();
        }
        Integer num = this.curVisibleVideoPos;
        if (num != null && num.intValue() == position) {
            this.curVisibleVideoPos = null;
        }
        this.videoItems.remove(Integer.valueOf(position));
    }

    public final void updateItems(boolean isForcedAllPause) {
        int i11;
        LinearLayoutManager linearLayoutManager = this.layoutManager;
        if (linearLayoutManager == null) {
            return;
        }
        int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        LinearLayoutManager linearLayoutManager2 = this.layoutManager;
        if (linearLayoutManager2 == null) {
            return;
        }
        int findLastVisibleItemPosition = linearLayoutManager2.findLastVisibleItemPosition();
        Iterable intRange = new IntRange(findFirstVisibleItemPosition, findLastVisibleItemPosition, 1);
        if ((intRange instanceof Collection) && ((Collection) intRange).isEmpty()) {
            i11 = 0;
        } else {
            Iterator it = intRange.iterator();
            i11 = 0;
            while (it.hasNext()) {
                GallerySyncVideoItem gallerySyncVideoItem = this.videoItems.get(Integer.valueOf(((Q) it).b()));
                if ((gallerySyncVideoItem != null ? gallerySyncVideoItem.getView() : null) != null && (i11 = i11 + 1) < 0) {
                    C7714v.N0();
                    throw null;
                }
            }
        }
        if (i11 == 0 || findFirstVisibleItemPosition > findLastVisibleItemPosition) {
            return;
        }
        while (true) {
            GallerySyncVideoItem gallerySyncVideoItem2 = this.videoItems.get(Integer.valueOf(findFirstVisibleItemPosition));
            if (gallerySyncVideoItem2 != null) {
                if (isForcedAllPause) {
                    gallerySyncVideoItem2.getOnPauseVideo().invoke();
                } else {
                    (((double) (Integer.min(gallerySyncVideoItem2.getView().getRight(), this.screenWidth) - Integer.max(0, gallerySyncVideoItem2.getView().getLeft()))) > ((double) this.screenWidth) * (i11 == 1 ? 0.4d : 0.5d) ? gallerySyncVideoItem2.getOnPlayVideo() : gallerySyncVideoItem2.getOnPauseVideo()).invoke();
                }
            }
            if (findFirstVisibleItemPosition == findLastVisibleItemPosition) {
                return;
            } else {
                findFirstVisibleItemPosition++;
            }
        }
    }
}
