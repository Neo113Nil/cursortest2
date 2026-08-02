package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.di;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.N;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.pikazon.preload.ImagePrefetchInfoProviderStorage;
import ru.ozon.app.android.pikazon.preload.ImagePrefetcher;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.data.HotelsGalleryMapper;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.prefetch.HotelsGalleryImagePrefetchInfoProvider;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.presentation.HotelsGalleryVO;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/data/HotelsGalleryMapper;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class HotelsGalleryComponent$Companion$create$1$1$mapper$2 extends AbstractC7737t implements Function0<HotelsGalleryMapper> {
    final /* synthetic */ HotelsGalleryComponent$Companion$create$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsGalleryComponent$Companion$create$1$1$mapper$2(HotelsGalleryComponent$Companion$create$1$1 hotelsGalleryComponent$Companion$create$1$1) {
        super(0);
        this.this$0 = hotelsGalleryComponent$Companion$create$1$1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final HotelsGalleryMapper invoke() {
        ContextComponentDependencies contextComponentDependencies;
        contextComponentDependencies = this.this$0.contextComponentDependencies;
        Context context = contextComponentDependencies.getContext();
        HotelsGalleryImagePrefetchInfoProvider hotelsGalleryImagePrefetchInfoProvider = new HotelsGalleryImagePrefetchInfoProvider();
        ImagePrefetchInfoProviderStorage imagePrefetchInfoProviderStorage = new ImagePrefetchInfoProviderStorage();
        imagePrefetchInfoProviderStorage.addProvider(N.b(HotelsGalleryVO.class), hotelsGalleryImagePrefetchInfoProvider);
        return new HotelsGalleryMapper(context, new ImagePrefetcher(1, imagePrefetchInfoProviderStorage));
    }
}
