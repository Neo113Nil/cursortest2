package ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.imageprefetch;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.image.ImageSize;
import ru.ozon.app.android.storefront.domain.image_prefetch.DecoratedImagePrefetchInfoProvider;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.grid.grid3.presentation.Grid3VO$Grid3ItemVO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.image.ImageDTO;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0016J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\f\u0010\u0010\u001a\u00020\u0006*\u00020\rH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/imageprefetch/UniversalGrid3ImagePrefetchInfoProvider;", "Lru/ozon/app/android/storefront/domain/image_prefetch/DecoratedImagePrefetchInfoProvider;", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/grid/grid3/presentation/Grid3VO$Grid3ItemVO;", "<init>", "()V", "displayWidth", "", "canPrefetch", "", "item", "getWidgetImageSize", "Lru/ozon/app/android/pikazon/image/ImageSize;", "context", "Landroid/content/Context;", "getWidgetImageUrl", "", "getDisplayWidth", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UniversalGrid3ImagePrefetchInfoProvider extends DecoratedImagePrefetchInfoProvider<Grid3VO$Grid3ItemVO> {
    private int displayWidth = LinearLayoutManager.INVALID_OFFSET;

    private final int getDisplayWidth(Context context) {
        if (this.displayWidth == Integer.MIN_VALUE) {
            this.displayWidth = ResourceExtKt.getDisplaySizePx(context).e().intValue();
        }
        return this.displayWidth;
    }

    @Override // ru.ozon.app.android.storefront.domain.image_prefetch.DecoratedImagePrefetchInfoProvider
    public boolean canPrefetch(@NotNull Grid3VO$Grid3ItemVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return true;
    }

    @Override // ru.ozon.app.android.storefront.domain.image_prefetch.DecoratedImagePrefetchInfoProvider
    public ImageSize getWidgetImageSize(@NotNull Grid3VO$Grid3ItemVO item, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(context, "context");
        return UniversalGrid3ImageSizeProvider.INSTANCE.getSize(item, getDisplayWidth(context));
    }

    @Override // ru.ozon.app.android.storefront.domain.image_prefetch.DecoratedImagePrefetchInfoProvider
    public String getWidgetImageUrl(@NotNull Grid3VO$Grid3ItemVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ImageDTO image = item.getImage();
        if (image != null) {
            return image.getImage();
        }
        return null;
    }
}
