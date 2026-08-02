package ru.ozon.app.android.storefront.widgets.financeWidget.core.prefetch;

import android.content.Context;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.image.ImageSize;
import ru.ozon.app.android.pikazon.preload.ImagePrefetchInfoProvider;
import ru.ozon.app.android.storefront.widgets.financeWidget.presentation.carousel.CarouselCardVO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0016J\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\r"}, d2 = {"Lru/ozon/app/android/storefront/widgets/financeWidget/core/prefetch/FinanceWidgetCaruselPrefetchInfoProvider;", "Lru/ozon/app/android/pikazon/preload/ImagePrefetchInfoProvider;", "Lru/ozon/app/android/storefront/widgets/financeWidget/presentation/carousel/CarouselCardVO$Banner;", "<init>", "()V", "getSize", "Lru/ozon/app/android/pikazon/image/ImageSize;", "item", "context", "Landroid/content/Context;", "getUrl", "", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FinanceWidgetCaruselPrefetchInfoProvider implements ImagePrefetchInfoProvider<CarouselCardVO.Banner> {
    private static final int blockHeightLarge = ResourceExtKt.toPx(UserVerificationMethods.USER_VERIFY_PATTERN);
    private static final int blockHeightCompact = ResourceExtKt.toPx(108);
    private static final int blockWidth = ResourceExtKt.toPx(185);

    @Override // ru.ozon.app.android.pikazon.preload.ImagePrefetchInfoProvider
    @NotNull
    public ImageSize getSize(@NotNull CarouselCardVO.Banner item, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(context, "context");
        return new ImageSize(blockWidth, item.getIsCompactSize() ? blockHeightCompact : blockHeightLarge);
    }

    @Override // ru.ozon.app.android.pikazon.preload.ImagePrefetchInfoProvider
    public String getUrl(@NotNull CarouselCardVO.Banner item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return item.getBackgroundImage();
    }
}
