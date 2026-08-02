package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.presentation;

import GZ.g;
import LZ.b;
import Sc.o;
import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.C8880a;
import ru.ozon.app.android.gallery.GalleryActivity;
import ru.ozon.app.android.gallery.GalleryRequest;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.presentation.HotelsGalleryVO;
import ru.ozon.app.android.video.VideoPosition;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0011\u001a\u00020\u0010*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012JA\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/GalleryRouter;", "", "LGZ/g;", "router", "<init>", "(LGZ/g;)V", "Landroid/content/Context;", "context", "Lru/ozon/app/android/gallery/GalleryRequest;", "request", "", "proceedWithRequest", "(Landroid/content/Context;Lru/ozon/app/android/gallery/GalleryRequest;)V", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/HotelsGalleryVO$GalleryItem;", "", "isFullScreen", "Lru/ozon/app/android/gallery/GalleryRequest$GalleryItem;", "toGalleryRequestItem", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/HotelsGalleryVO$GalleryItem;Z)Lru/ozon/app/android/gallery/GalleryRequest$GalleryItem;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/HotelsGalleryVO;", "vo", "", "selectedIndex", "Lru/ozon/app/android/video/VideoPosition;", "videoPosition", "", "widgetName", "navigateToDetailedGallery", "(Landroid/content/Context;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/HotelsGalleryVO;IZLru/ozon/app/android/video/VideoPosition;Ljava/lang/String;)V", "LGZ/g;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GalleryRouter {

    @NotNull
    private final g router;

    public GalleryRouter(@NotNull g router) {
        Intrinsics.checkNotNullParameter(router, "router");
        this.router = router;
    }

    private final void proceedWithRequest(Context context, GalleryRequest request) {
        this.router.c(new b(new C8880a(GalleryActivity.INSTANCE.newIntent(context, request), null, null)), 2024);
    }

    private final GalleryRequest.GalleryItem toGalleryRequestItem(HotelsGalleryVO.GalleryItem galleryItem, boolean z11) {
        if (galleryItem instanceof HotelsGalleryVO.Photo) {
            return new GalleryRequest.GalleryItem.Image(((HotelsGalleryVO.Photo) galleryItem).getUrl(), null, false, 6, null);
        }
        if (!(galleryItem instanceof HotelsGalleryVO.Video)) {
            throw new o();
        }
        HotelsGalleryVO.Video video = (HotelsGalleryVO.Video) galleryItem;
        return new GalleryRequest.GalleryItem.OzonVideo(video.getPreviewImageUrl(), video.getVideo().getLink(), z11, video.getTrackingInfo(), null, false, 32, null);
    }

    public final void navigateToDetailedGallery(@NotNull Context context, @NotNull HotelsGalleryVO vo, int selectedIndex, boolean isFullScreen, VideoPosition videoPosition, String widgetName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(vo, "vo");
        List<HotelsGalleryVO.GalleryItem> items = vo.getItems();
        ArrayList arrayList = new ArrayList(C7714v.z(items, 10));
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(toGalleryRequestItem((HotelsGalleryVO.GalleryItem) it.next(), isFullScreen));
        }
        proceedWithRequest(context, new GalleryRequest(arrayList, selectedIndex, videoPosition, widgetName, null, null));
    }
}
