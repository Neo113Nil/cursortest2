package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.prefetch;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.image.ImageSize;
import ru.ozon.app.android.pikazon.preload.ImagePrefetchInfoProvider;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.presentation.rooms.ImageVO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0016J\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/prefetch/HotelsRoomsListImagePrefetchInfoProvider;", "Lru/ozon/app/android/pikazon/preload/ImagePrefetchInfoProvider;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/rooms/ImageVO;", "<init>", "()V", "getSize", "Lru/ozon/app/android/pikazon/image/ImageSize;", "item", "context", "Landroid/content/Context;", "getUrl", "", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsRoomsListImagePrefetchInfoProvider implements ImagePrefetchInfoProvider<ImageVO> {
    @Override // ru.ozon.app.android.pikazon.preload.ImagePrefetchInfoProvider
    public ImageSize getSize(@NotNull ImageVO item, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(context, "context");
        return new ImageSize(context.getResources().getDisplayMetrics().widthPixels, ResourceExtKt.toPx(206, context));
    }

    @Override // ru.ozon.app.android.pikazon.preload.ImagePrefetchInfoProvider
    public String getUrl(@NotNull ImageVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return item.getUrl();
    }
}
