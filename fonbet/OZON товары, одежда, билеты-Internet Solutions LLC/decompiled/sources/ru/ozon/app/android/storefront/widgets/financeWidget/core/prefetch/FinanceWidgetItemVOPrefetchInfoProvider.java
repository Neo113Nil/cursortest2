package ru.ozon.app.android.storefront.widgets.financeWidget.core.prefetch;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.image.ImageSize;
import ru.ozon.app.android.pikazon.preload.ImagePrefetchInfoProvider;
import ru.ozon.app.android.storefront.widgets.financeWidget.data.FinanceWidgetDTO;
import ru.ozon.app.android.storefront.widgets.financeWidget.presentation.couple.ItemVO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.image.ImageDTO;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0016J\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\r"}, d2 = {"Lru/ozon/app/android/storefront/widgets/financeWidget/core/prefetch/FinanceWidgetItemVOPrefetchInfoProvider;", "Lru/ozon/app/android/pikazon/preload/ImagePrefetchInfoProvider;", "Lru/ozon/app/android/storefront/widgets/financeWidget/presentation/couple/ItemVO;", "<init>", "()V", "getSize", "Lru/ozon/app/android/pikazon/image/ImageSize;", "item", "context", "Landroid/content/Context;", "getUrl", "", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FinanceWidgetItemVOPrefetchInfoProvider implements ImagePrefetchInfoProvider<ItemVO> {
    private static final int sizeCompact = ResourceExtKt.toPx(50);
    private static final int sizeLarge = ResourceExtKt.toPx(60);

    @Override // ru.ozon.app.android.pikazon.preload.ImagePrefetchInfoProvider
    @NotNull
    public ImageSize getSize(@NotNull ItemVO item, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(context, "context");
        int i11 = item.getIsCompactSize() ? sizeCompact : sizeLarge;
        return new ImageSize(i11, i11);
    }

    @Override // ru.ozon.app.android.pikazon.preload.ImagePrefetchInfoProvider
    public String getUrl(@NotNull ItemVO item) {
        ImageDTO image;
        Intrinsics.checkNotNullParameter(item, "item");
        FinanceWidgetDTO.ItemDTO.PromoState promoState = item.getPromoState();
        if (promoState == null || (image = promoState.getImage()) == null) {
            return null;
        }
        return image.getImage();
    }
}
