package ru.ozon.app.android.pdp.widgets.galleryV3.presentation;

import GZ.g;
import LZ.b;
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
import ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v3.GalleryV3VO;
import ru.ozon.app.android.video.VideoPosition;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJA\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/GalleryRouter;", "", "LGZ/g;", "router", "<init>", "(LGZ/g;)V", "Landroid/content/Context;", "context", "Lru/ozon/app/android/gallery/GalleryRequest;", "request", "", "proceedWithRequest", "(Landroid/content/Context;Lru/ozon/app/android/gallery/GalleryRequest;)V", "Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3VO;", "vo", "", "selectedIndex", "", "fullScreen", "Lru/ozon/app/android/video/VideoPosition;", "videoPosition", "", "widgetName", "navigateToDetailedGallery", "(Landroid/content/Context;Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3VO;IZLru/ozon/app/android/video/VideoPosition;Ljava/lang/String;)V", "LGZ/g;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GalleryRouter {

    @NotNull
    private final g router;

    public GalleryRouter(@NotNull g router) {
        Intrinsics.checkNotNullParameter(router, "router");
        this.router = router;
    }

    private final void proceedWithRequest(Context context, GalleryRequest request) {
        this.router.c(new b(new C8880a(GalleryActivity.INSTANCE.newIntent(context, request), null, null)), 2023);
    }

    public final void navigateToDetailedGallery(@NotNull Context context, @NotNull GalleryV3VO vo, int selectedIndex, boolean fullScreen, VideoPosition videoPosition, String widgetName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(vo, "vo");
        List<GalleryV3VO.Item> items = vo.getItems();
        ArrayList arrayList = new ArrayList(C7714v.z(items, 10));
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(GalleryRequestMappersKt.toGalleryRequestItem((GalleryV3VO.Item) it.next()));
        }
        ArrayList W02 = C7714v.W0(arrayList);
        if (fullScreen) {
            Object obj = W02.get(selectedIndex);
            Intrinsics.g(obj, "null cannot be cast to non-null type ru.ozon.app.android.gallery.GalleryRequest.GalleryItem.OzonVideo");
            W02.set(selectedIndex, GalleryRequest.GalleryItem.OzonVideo.copy$default((GalleryRequest.GalleryItem.OzonVideo) obj, null, null, true, null, null, false, 59, null));
        }
        proceedWithRequest(context, new GalleryRequest(W02, selectedIndex, videoPosition, widgetName, vo.getAnalytics().getPopUp(), vo.getAnalytics().getPopupClose()));
    }
}
