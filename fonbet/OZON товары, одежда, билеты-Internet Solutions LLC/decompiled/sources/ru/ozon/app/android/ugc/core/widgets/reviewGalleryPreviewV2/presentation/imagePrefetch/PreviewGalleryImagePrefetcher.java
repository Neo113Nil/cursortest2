package ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation.imagePrefetch;

import Sc.InterfaceC4008j;
import android.content.Context;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ContextExtKt;
import ru.ozon.app.android.pikazon.glide.loadPriority.LoadPriority;
import ru.ozon.app.android.pikazon.processors.InscribedUrlProcessor;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation.ReviewGalleryPreviewV2VO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation.ReviewGalleryPreviewView;
import ru.ozon.app.android.utils.LazyUtilsKt;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0016\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\u000e\u001a\u00020\r2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u001a\u001a\u00020\u00132\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\u0018\u001a\u00020\u000b2\b\b\u0002\u0010\u0019\u001a\u00020\r¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001d\u001a\u00020\u00132\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u001c\u001a\u00020\u000b¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u001b\u0010$\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0017R\u0016\u0010%\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010'\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010&R\u0016\u0010(\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010&¨\u0006)"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/imagePrefetch/PreviewGalleryImagePrefetcher;", "", "Landroid/content/Context;", "context", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/imagePrefetch/PreviewItemSizeProvider;", "previewItemSizeProvider", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/imagePrefetch/PreviewItemSizeProvider;)V", "", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/ReviewGalleryPreviewV2VO$ItemVO;", "list", "", "lastVisibleTimePosition", "", "isNeedPrefetchImage", "(Ljava/util/List;I)Z", "item", "Lru/ozon/app/android/pikazon/glide/loadPriority/LoadPriority;", "priority", "", "prefetchItem", "(Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/ReviewGalleryPreviewV2VO$ItemVO;Lru/ozon/app/android/pikazon/glide/loadPriority/LoadPriority;)V", "calcVisibleItemsCount", "()I", "lastVisiblePosition", "isDynamicPrefetch", "prefetchItems", "(Ljava/util/List;IZ)V", "fromIndex", "prefetchItemsFromIndex", "(Ljava/util/List;I)V", "Landroid/content/Context;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/imagePrefetch/PreviewItemSizeProvider;", "visibleItemsCount$delegate", "LSc/j;", "getVisibleItemsCount", "visibleItemsCount", "lastPrefetchedItemPosition", "I", "lastVisibleItem", "lastListSize", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PreviewGalleryImagePrefetcher {

    @NotNull
    private final Context context;
    private int lastListSize;
    private int lastPrefetchedItemPosition;
    private int lastVisibleItem;

    @NotNull
    private final PreviewItemSizeProvider previewItemSizeProvider;

    /* renamed from: visibleItemsCount$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j visibleItemsCount;

    public PreviewGalleryImagePrefetcher(@NotNull Context context, @NotNull PreviewItemSizeProvider previewItemSizeProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(previewItemSizeProvider, "previewItemSizeProvider");
        this.context = context;
        this.previewItemSizeProvider = previewItemSizeProvider;
        this.visibleItemsCount = LazyUtilsKt.unsafeLazy(new PreviewGalleryImagePrefetcher$visibleItemsCount$2(this));
        this.lastPrefetchedItemPosition = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int calcVisibleItemsCount() {
        int i11 = this.context.getResources().getDisplayMetrics().widthPixels;
        int itemWidth = this.previewItemSizeProvider.getItemWidth();
        ReviewGalleryPreviewView.Companion companion = ReviewGalleryPreviewView.INSTANCE;
        return (int) Math.ceil((i11 - companion.getITEMS_RECYCLER_EDGES_SIZE()) / (companion.getITEMS_RECYCLER_SEPARATOR_SIZE() + itemWidth));
    }

    private final int getVisibleItemsCount() {
        return ((Number) this.visibleItemsCount.getValue()).intValue();
    }

    private final boolean isNeedPrefetchImage(List<ReviewGalleryPreviewV2VO.ItemVO> list, int lastVisibleTimePosition) {
        return lastVisibleTimePosition > this.lastVisibleItem || list.size() > this.lastListSize;
    }

    private final void prefetchItem(ReviewGalleryPreviewV2VO.ItemVO item, LoadPriority priority) {
        ContextExtKt.loadInscribedSize(this.context, item.getImage().getImage(), (r17 & 2) != 0 ? K.f71697a : null, (r17 & 4) != 0 ? null : null, (r17 & 8) != 0 ? null : null, (r17 & 16) != 0 ? LoadPriority.NORMAL : priority, (r17 & 32) != 0 ? false : false, (r17 & 64) == 0 ? this.previewItemSizeProvider.getImageSize() : null, (r17 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? InscribedUrlProcessor.InscribedNormal.INSTANCE : null);
    }

    public static /* synthetic */ void prefetchItems$default(PreviewGalleryImagePrefetcher previewGalleryImagePrefetcher, List list, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = previewGalleryImagePrefetcher.lastVisibleItem;
        }
        if ((i12 & 4) != 0) {
            z11 = true;
        }
        previewGalleryImagePrefetcher.prefetchItems(list, i11, z11);
    }

    public final void prefetchItems(@NotNull List<ReviewGalleryPreviewV2VO.ItemVO> list, int lastVisiblePosition, boolean isDynamicPrefetch) {
        Intrinsics.checkNotNullParameter(list, "list");
        if (isNeedPrefetchImage(list, lastVisiblePosition)) {
            int i11 = isDynamicPrefetch ? 2 : 1;
            LoadPriority loadPriority = isDynamicPrefetch ? LoadPriority.NORMAL : LoadPriority.HIGH;
            int min = Math.min((getVisibleItemsCount() * i11) + lastVisiblePosition, C7714v.P(list));
            int i12 = this.lastPrefetchedItemPosition + 1;
            if (i12 <= min) {
                while (true) {
                    prefetchItem(list.get(i12), loadPriority);
                    if (i12 == min) {
                        break;
                    } else {
                        i12++;
                    }
                }
            }
            this.lastListSize = list.size();
            this.lastPrefetchedItemPosition = min;
            this.lastVisibleItem = lastVisiblePosition;
        }
    }

    public final void prefetchItemsFromIndex(@NotNull List<ReviewGalleryPreviewV2VO.ItemVO> list, int fromIndex) {
        Intrinsics.checkNotNullParameter(list, "list");
        if (list.isEmpty() || fromIndex > C7714v.P(list)) {
            return;
        }
        int i11 = fromIndex - 1;
        this.lastPrefetchedItemPosition = i11;
        this.lastVisibleItem = i11;
        this.lastListSize = list.size();
        int min = Math.min((getVisibleItemsCount() + fromIndex) - 1, C7714v.P(list));
        if (fromIndex <= min) {
            while (true) {
                prefetchItem(list.get(fromIndex), LoadPriority.HIGH);
                if (fromIndex == min) {
                    break;
                } else {
                    fromIndex++;
                }
            }
        }
        this.lastPrefetchedItemPosition = min;
    }
}
