package ru.ozon.app.android.pdp.widgets.galleryV3.presentation;

import WZ.l;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v3.GalleryV3VO;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/GalleryAnalytics;", "", "<init>", "()V", "Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3VO;", "vo", "LWZ/l;", "tokenizedAnalytics", "", "trackGalleryViewEvent", "(Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3VO;LWZ/l;)V", "Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3VO$Item;", "item", "trackGalleryItemViewEvent", "(Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3VO$Item;LWZ/l;)V", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GalleryAnalytics {
    public final void trackGalleryItemViewEvent(GalleryV3VO.Item item, @NotNull l tokenizedAnalytics) {
        t tokenizedEvent;
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        if (item == null || (tokenizedEvent = item.getTokenizedEvent()) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processViewEvents$default(tokenizedAnalytics, tokenizedEvent, null, 2, null);
    }

    public final void trackGalleryViewEvent(@NotNull GalleryV3VO vo, @NotNull l tokenizedAnalytics) {
        Intrinsics.checkNotNullParameter(vo, "vo");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        t gallery = vo.getAnalytics().getGallery();
        if (gallery != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(tokenizedAnalytics, gallery, null, 2, null);
        }
    }
}
