package ru.ozon.app.android.pdp.widgets.galleryV3.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.N;
import ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v3.GalleryV3VO;
import ru.ozon.app.android.pdp.widgets.galleryV3.presentation.imagePrefetch.GalleryV3ImagePrefetchInfoProvider;
import ru.ozon.app.android.pikazon.preload.ImagePrefetchInfoProviderStorage;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lru/ozon/app/android/pikazon/preload/ImagePrefetchInfoProviderStorage;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3VO;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class GalleryWidgetComponent$Companion$create$1$1$providersStorage$2 extends AbstractC7737t implements Function0<ImagePrefetchInfoProviderStorage<GalleryV3VO>> {
    public static final GalleryWidgetComponent$Companion$create$1$1$providersStorage$2 INSTANCE = new GalleryWidgetComponent$Companion$create$1$1$providersStorage$2();

    GalleryWidgetComponent$Companion$create$1$1$providersStorage$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final ImagePrefetchInfoProviderStorage<GalleryV3VO> invoke() {
        ImagePrefetchInfoProviderStorage<GalleryV3VO> imagePrefetchInfoProviderStorage = new ImagePrefetchInfoProviderStorage<>();
        imagePrefetchInfoProviderStorage.addProvider(N.b(GalleryV3VO.class), new GalleryV3ImagePrefetchInfoProvider());
        return imagePrefetchInfoProviderStorage;
    }
}
