package ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.products;

import WZ.l;
import WZ.t;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;

@Metadata(d1 = {"\u0000O\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\b\u0004*\u0001$\b\u0001\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0014\u001a\u00020\b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001fR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000b0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/products/ReviewGalleryProductsViewTracker;", "", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "LWZ/l;", "analytics", "<init>", "(Landroidx/recyclerview/widget/RecyclerView;LWZ/l;)V", "", "sendViewEventsForVisibleItems", "()V", "", "position", "sendItemViewEvent", "(I)V", "", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ProductItemContentDTO;", "newItems", "", "widgetId", "onItemsChanged", "(Ljava/util/List;J)V", "", "isVisible", "onVisibilityChanged", "(Z)V", "reset", "Landroidx/recyclerview/widget/RecyclerView;", "LWZ/l;", "items", "Ljava/util/List;", "Ljava/lang/Long;", "", "sentViewedItemPositions", "Ljava/util/Set;", "Z", "ru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/products/ReviewGalleryProductsViewTracker$childAttachListener$1", "childAttachListener", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/products/ReviewGalleryProductsViewTracker$childAttachListener$1;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewGalleryProductsViewTracker {
    private final l analytics;

    @NotNull
    private final ReviewGalleryProductsViewTracker$childAttachListener$1 childAttachListener;
    private boolean isVisible;

    @NotNull
    private List<? extends ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductItemContentDTO> items;

    @NotNull
    private final RecyclerView recyclerView;

    @NotNull
    private final Set<Integer> sentViewedItemPositions;
    private Long widgetId;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.recyclerview.widget.RecyclerView$q, ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.products.ReviewGalleryProductsViewTracker$childAttachListener$1] */
    public ReviewGalleryProductsViewTracker(@NotNull RecyclerView recyclerView, l lVar) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.recyclerView = recyclerView;
        this.analytics = lVar;
        this.items = K.f71697a;
        this.sentViewedItemPositions = new LinkedHashSet();
        ?? r32 = new RecyclerView.q() { // from class: ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.products.ReviewGalleryProductsViewTracker$childAttachListener$1
            @Override // androidx.recyclerview.widget.RecyclerView.q
            public void onChildViewAttachedToWindow(View view) {
                boolean z11;
                RecyclerView recyclerView2;
                Intrinsics.checkNotNullParameter(view, "view");
                z11 = ReviewGalleryProductsViewTracker.this.isVisible;
                if (z11) {
                    ReviewGalleryProductsViewTracker reviewGalleryProductsViewTracker = ReviewGalleryProductsViewTracker.this;
                    recyclerView2 = reviewGalleryProductsViewTracker.recyclerView;
                    reviewGalleryProductsViewTracker.sendItemViewEvent(recyclerView2.getChildAdapterPosition(view));
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.q
            public void onChildViewDetachedFromWindow(View view) {
                Intrinsics.checkNotNullParameter(view, "view");
            }
        };
        this.childAttachListener = r32;
        recyclerView.addOnChildAttachStateChangeListener(r32);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendItemViewEvent(int position) {
        l lVar;
        Long l11;
        Map<String, TokenizedTrackingInfo> trackingInfo;
        t tokenizedEvent$default;
        if (position == -1 || this.sentViewedItemPositions.contains(Integer.valueOf(position))) {
            return;
        }
        Object Q11 = C7714v.Q(position, this.items);
        ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductItemContentDTO.ProductInfo productInfo = Q11 instanceof ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductItemContentDTO.ProductInfo ? (ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductItemContentDTO.ProductInfo) Q11 : null;
        if (productInfo == null || (lVar = this.analytics) == null || (l11 = this.widgetId) == null || (trackingInfo = productInfo.getTrackingInfo()) == null || (tokenizedEvent$default = TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, l11, null, 2, null)) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processViewEvents$default(lVar, tokenizedEvent$default, null, 2, null);
        this.sentViewedItemPositions.add(Integer.valueOf(position));
    }

    private final void sendViewEventsForVisibleItems() {
        int intValue;
        RecyclerView.o layoutManager = this.recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        Integer valueOf = Integer.valueOf(linearLayoutManager.findFirstVisibleItemPosition());
        if (valueOf.intValue() == -1) {
            valueOf = null;
        }
        if (valueOf == null) {
            return;
        }
        int intValue2 = valueOf.intValue();
        Integer valueOf2 = Integer.valueOf(linearLayoutManager.findLastVisibleItemPosition());
        Integer num = valueOf2.intValue() != -1 ? valueOf2 : null;
        if (num == null || intValue2 > (intValue = num.intValue())) {
            return;
        }
        while (true) {
            sendItemViewEvent(intValue2);
            if (intValue2 == intValue) {
                return;
            } else {
                intValue2++;
            }
        }
    }

    public final void onItemsChanged(@NotNull List<? extends ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductItemContentDTO> newItems, long widgetId) {
        Intrinsics.checkNotNullParameter(newItems, "newItems");
        this.items = newItems;
        this.widgetId = Long.valueOf(widgetId);
        this.sentViewedItemPositions.clear();
    }

    public final void onVisibilityChanged(boolean isVisible) {
        this.isVisible = isVisible;
        if (isVisible) {
            sendViewEventsForVisibleItems();
        }
    }

    public final void reset() {
        this.sentViewedItemPositions.clear();
        this.isVisible = false;
    }
}
