package ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.di;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.N;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.pikazon.preload.ImagePrefetchInfoProviderStorage;
import ru.ozon.app.android.pikazon.preload.ImagePrefetcher;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.data.HotelsSearchResultsV5CardsMapper;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.prefetch.HotelsSearchResultV5ImagePrefetchInfoProvider;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/data/HotelsSearchResultsV5CardsMapper;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class HotelsSearchResultsV5Component$Companion$create$1$1$hotelsSearchResultsV5CardsMapper$2 extends AbstractC7737t implements Function0<HotelsSearchResultsV5CardsMapper> {
    final /* synthetic */ HotelsSearchResultsV5Component$Companion$create$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsSearchResultsV5Component$Companion$create$1$1$hotelsSearchResultsV5CardsMapper$2(HotelsSearchResultsV5Component$Companion$create$1$1 hotelsSearchResultsV5Component$Companion$create$1$1) {
        super(0);
        this.this$0 = hotelsSearchResultsV5Component$Companion$create$1$1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final HotelsSearchResultsV5CardsMapper invoke() {
        ContextComponentDependencies contextComponentDependencies;
        contextComponentDependencies = this.this$0.contextComponentDependencies;
        Context context = contextComponentDependencies.getContext();
        HotelsSearchResultV5ImagePrefetchInfoProvider hotelsSearchResultV5ImagePrefetchInfoProvider = new HotelsSearchResultV5ImagePrefetchInfoProvider();
        ImagePrefetchInfoProviderStorage imagePrefetchInfoProviderStorage = new ImagePrefetchInfoProviderStorage();
        imagePrefetchInfoProviderStorage.addProvider(N.b(String.class), hotelsSearchResultV5ImagePrefetchInfoProvider);
        return new HotelsSearchResultsV5CardsMapper(context, new ImagePrefetcher(3, imagePrefetchInfoProviderStorage));
    }
}
