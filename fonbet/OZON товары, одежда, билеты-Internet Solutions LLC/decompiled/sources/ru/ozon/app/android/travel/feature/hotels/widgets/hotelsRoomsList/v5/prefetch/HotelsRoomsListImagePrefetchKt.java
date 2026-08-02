package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.prefetch;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.preload.ImagePrefetcher;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.presentation.rooms.HotelsRoomsListV5RoomVO;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.presentation.rooms.ImageVO;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a,\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0000¨\u0006\n"}, d2 = {"prefetchFirstRoomImages", "", "context", "Landroid/content/Context;", "prefetcher", "Lru/ozon/app/android/pikazon/preload/ImagePrefetcher;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/rooms/ImageVO;", "rooms", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/rooms/HotelsRoomsListV5RoomVO;", "hotels_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsRoomsListImagePrefetchKt {
    public static final void prefetchFirstRoomImages(@NotNull Context context, @NotNull ImagePrefetcher<ImageVO> prefetcher, @NotNull List<HotelsRoomsListV5RoomVO> rooms) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(prefetcher, "prefetcher");
        Intrinsics.checkNotNullParameter(rooms, "rooms");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = rooms.iterator();
        while (it.hasNext()) {
            ImageVO imageVO = (ImageVO) C7714v.M(((HotelsRoomsListV5RoomVO) it.next()).getImages());
            if (imageVO != null) {
                arrayList.add(imageVO);
            }
        }
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList != null) {
            prefetcher.prefetch(context, arrayList);
        }
    }
}
