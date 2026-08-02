package ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.imageprefetch;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.image.ImageSize;
import ru.ozon.app.android.storefront.domain.image_prefetch.DecoratedImagePrefetchInfoProvider;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.model.ObjectItemVO;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.model.ObjectItemsVO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0016J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\f\u0010\u0010\u001a\u00020\u0006*\u00020\rH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/imageprefetch/UniversalObjectGridOneSingleItemBannerImageSizeProvider;", "Lru/ozon/app/android/storefront/domain/image_prefetch/DecoratedImagePrefetchInfoProvider;", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/ObjectItemsVO;", "<init>", "()V", "displayWidth", "", "canPrefetch", "", "item", "getWidgetImageSize", "Lru/ozon/app/android/pikazon/image/ImageSize;", "context", "Landroid/content/Context;", "getWidgetImageUrl", "", "getDisplayWidth", "Companion", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UniversalObjectGridOneSingleItemBannerImageSizeProvider extends DecoratedImagePrefetchInfoProvider<ObjectItemsVO> {
    private static final int bannerOffsets = UiExtKt.toPx(16) * 2;
    private int displayWidth = LinearLayoutManager.INVALID_OFFSET;

    private final int getDisplayWidth(Context context) {
        if (this.displayWidth == Integer.MIN_VALUE) {
            this.displayWidth = ResourceExtKt.getDisplaySizePx(context).e().intValue();
        }
        return this.displayWidth;
    }

    @Override // ru.ozon.app.android.storefront.domain.image_prefetch.DecoratedImagePrefetchInfoProvider
    public boolean canPrefetch(@NotNull ObjectItemsVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItems().size() != 1) {
            return false;
        }
        ObjectItemVO objectItemVO = (ObjectItemVO) C7714v.M(item.getItems());
        return (objectItemVO != null ? objectItemVO.getDesignType() : null) != null && objectItemVO.getDesignType() == ObjectItemVO.DesignTypeVO.Type.GRID_1 && Intrinsics.d(item.getStyle(), "banner");
    }

    @Override // ru.ozon.app.android.storefront.domain.image_prefetch.DecoratedImagePrefetchInfoProvider
    public ImageSize getWidgetImageSize(@NotNull ObjectItemsVO item, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.displayWidth == Integer.MIN_VALUE) {
            this.displayWidth = getDisplayWidth(context);
        }
        return new ImageSize(this.displayWidth - bannerOffsets, (int) (item.getRatio() * (r0 - r1)));
    }

    @Override // ru.ozon.app.android.storefront.domain.image_prefetch.DecoratedImagePrefetchInfoProvider
    public String getWidgetImageUrl(@NotNull ObjectItemsVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ObjectItemVO objectItemVO = (ObjectItemVO) C7714v.M(item.getItems());
        if (objectItemVO != null) {
            return objectItemVO.getImage();
        }
        return null;
    }
}
