package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v1.presentation.pager;

import WZ.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.analitycs.TokenizedAnalyticsExtKt;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v1.presentation.HotelsGalleryFullVI;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v1.view.HotelsGalleryFullPagerPhotoItemView;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/presentation/pager/HotelsGalleryFullPagerPhotoViewHolder;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/presentation/pager/HotelsGalleryFullPagerItemViewHolder;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/view/HotelsGalleryFullPagerPhotoItemView;", "view", "LWZ/l;", "tokenizedAnalytics", "<init>", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/view/HotelsGalleryFullPagerPhotoItemView;LWZ/l;)V", "", "onViewInVisibleBounds", "()V", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/presentation/HotelsGalleryFullVI$Photo;", "item", "bind", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/presentation/HotelsGalleryFullVI$Photo;)V", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/view/HotelsGalleryFullPagerPhotoItemView;", "LWZ/l;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/presentation/HotelsGalleryFullVI$Photo;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsGalleryFullPagerPhotoViewHolder extends HotelsGalleryFullPagerItemViewHolder {
    private HotelsGalleryFullVI.Photo item;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final HotelsGalleryFullPagerPhotoItemView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelsGalleryFullPagerPhotoViewHolder(@NotNull HotelsGalleryFullPagerPhotoItemView view, @NotNull l tokenizedAnalytics) {
        super(view, null);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.view = view;
        this.tokenizedAnalytics = tokenizedAnalytics;
    }

    public final void bind(@NotNull HotelsGalleryFullVI.Photo item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.item = item;
        this.view.bind(item);
    }

    @Override // jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        super.onViewInVisibleBounds();
        l lVar = this.tokenizedAnalytics;
        HotelsGalleryFullVI.Photo photo = this.item;
        TokenizedAnalyticsExtKt.processViewEvents(lVar, photo != null ? photo.getTrackingInfo() : null);
    }
}
