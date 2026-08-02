package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.di;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.N;
import ru.ozon.app.android.pikazon.preload.ImagePrefetchInfoProviderStorage;
import ru.ozon.app.android.pikazon.preload.ImagePrefetcher;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.data.TileGrid2VO;
import ru.ozon.app.android.universalwidgets.flags.TileGrid2PrefetchTimeInterval;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.prefetch.TileGrid2GalleryImagePrefetchHelper;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import ru.ozon.app.android.utils.dispatcherprovider.di.CoroutineDispatchersComponentApi;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/prefetch/TileGrid2GalleryImagePrefetchHelper;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class TileGrid2WidgetV2Component$Companion$create$1$1$galleryImagePrefetchHelperLazy$1 extends AbstractC7737t implements Function0<TileGrid2GalleryImagePrefetchHelper> {
    final /* synthetic */ TileGrid2WidgetV2Component$Companion$create$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TileGrid2WidgetV2Component$Companion$create$1$1$galleryImagePrefetchHelperLazy$1(TileGrid2WidgetV2Component$Companion$create$1$1 tileGrid2WidgetV2Component$Companion$create$1$1) {
        super(0);
        this.this$0 = tileGrid2WidgetV2Component$Companion$create$1$1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final TileGrid2GalleryImagePrefetchHelper invoke() {
        CoroutineDispatchersComponentApi coroutineDispatchersComponentApi;
        float floatKey = this.this$0.getFeatureService().getFloatKey(TileGrid2PrefetchTimeInterval.INSTANCE);
        coroutineDispatchersComponentApi = this.this$0.coroutineDispatchersComponentApi;
        CoroutineDispatcherProvider dispatcherProvider = coroutineDispatchersComponentApi.getDispatcherProvider();
        ImagePrefetchInfoProviderStorage imagePrefetchInfoProviderStorage = new ImagePrefetchInfoProviderStorage();
        imagePrefetchInfoProviderStorage.addProvider(N.b(TileGrid2VO.class), this.this$0.getPrefetchInfoProvider());
        Unit unit = Unit.f71690a;
        return new TileGrid2GalleryImagePrefetchHelper(floatKey, dispatcherProvider, new ImagePrefetcher(6, imagePrefetchInfoProviderStorage));
    }
}
