package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.di;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.N;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.pikazon.preload.ImagePrefetchInfoProviderStorage;
import ru.ozon.app.android.pikazon.preload.ImagePrefetcher;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.data.HotelsRoomsListV5RoomsMapper;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.prefetch.HotelsRoomsListImagePrefetchInfoProvider;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.presentation.rooms.ImageVO;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/data/HotelsRoomsListV5RoomsMapper;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class HotelsRoomsListV5Component$Companion$create$1$1$roomsMapper$2 extends AbstractC7737t implements Function0<HotelsRoomsListV5RoomsMapper> {
    final /* synthetic */ HotelsRoomsListV5Component$Companion$create$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsRoomsListV5Component$Companion$create$1$1$roomsMapper$2(HotelsRoomsListV5Component$Companion$create$1$1 hotelsRoomsListV5Component$Companion$create$1$1) {
        super(0);
        this.this$0 = hotelsRoomsListV5Component$Companion$create$1$1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final HotelsRoomsListV5RoomsMapper invoke() {
        ContextComponentDependencies contextComponentDependencies;
        contextComponentDependencies = this.this$0.contextComponentApi;
        Context context = contextComponentDependencies.getContext();
        HotelsRoomsListImagePrefetchInfoProvider hotelsRoomsListImagePrefetchInfoProvider = new HotelsRoomsListImagePrefetchInfoProvider();
        ImagePrefetchInfoProviderStorage imagePrefetchInfoProviderStorage = new ImagePrefetchInfoProviderStorage();
        imagePrefetchInfoProviderStorage.addProvider(N.b(ImageVO.class), hotelsRoomsListImagePrefetchInfoProvider);
        return new HotelsRoomsListV5RoomsMapper(context, new ImagePrefetcher(2, imagePrefetchInfoProviderStorage));
    }
}
