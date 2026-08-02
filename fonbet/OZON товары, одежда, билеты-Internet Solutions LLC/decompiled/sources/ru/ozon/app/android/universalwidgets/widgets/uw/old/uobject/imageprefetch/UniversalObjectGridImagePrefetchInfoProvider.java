package ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.imageprefetch;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.image.ImageSize;
import ru.ozon.app.android.storefront.domain.image_prefetch.DecoratedImagePrefetchInfoProvider;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.model.ObjectItemVO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\f\u0010\u0016\u001a\u00020\n*\u00020\u0011H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/imageprefetch/UniversalObjectGridImagePrefetchInfoProvider;", "Lru/ozon/app/android/storefront/domain/image_prefetch/DecoratedImagePrefetchInfoProvider;", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/ObjectItemVO;", "<init>", "()V", "grid2SizeImageProvider", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/imageprefetch/Grid2ImageSizeProvider;", "grid3SizeImageProvider", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/imageprefetch/Grid3ImageSizeProvider;", "displayWidth", "", "canPrefetch", "", "item", "getWidgetImageSize", "Lru/ozon/app/android/pikazon/image/ImageSize;", "context", "Landroid/content/Context;", "getWidgetImageUrl", "", "getSizeForGrid3", "getSizeForGrid2", "getDisplayWidth", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UniversalObjectGridImagePrefetchInfoProvider extends DecoratedImagePrefetchInfoProvider<ObjectItemVO> {

    @NotNull
    private final Grid2ImageSizeProvider grid2SizeImageProvider = new Grid2ImageSizeProvider();

    @NotNull
    private final Grid3ImageSizeProvider grid3SizeImageProvider = new Grid3ImageSizeProvider();
    private int displayWidth = LinearLayoutManager.INVALID_OFFSET;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ObjectItemVO.DesignTypeVO.Type.values().length];
            try {
                iArr[ObjectItemVO.DesignTypeVO.Type.GRID_2.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ObjectItemVO.DesignTypeVO.Type.GRID_3.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final int getDisplayWidth(Context context) {
        if (this.displayWidth == Integer.MIN_VALUE) {
            this.displayWidth = ResourceExtKt.getDisplaySizePx(context).e().intValue();
        }
        return this.displayWidth;
    }

    private final ImageSize getSizeForGrid2(Context context) {
        return this.grid2SizeImageProvider.getSize(getDisplayWidth(context));
    }

    private final ImageSize getSizeForGrid3(Context context) {
        return this.grid3SizeImageProvider.getSize(getDisplayWidth(context));
    }

    @Override // ru.ozon.app.android.storefront.domain.image_prefetch.DecoratedImagePrefetchInfoProvider
    public boolean canPrefetch(@NotNull ObjectItemVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return item.getDesignType() == ObjectItemVO.DesignTypeVO.Type.GRID_2 || item.getDesignType() == ObjectItemVO.DesignTypeVO.Type.GRID_3;
    }

    @Override // ru.ozon.app.android.storefront.domain.image_prefetch.DecoratedImagePrefetchInfoProvider
    public ImageSize getWidgetImageSize(@NotNull ObjectItemVO item, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(context, "context");
        int i11 = WhenMappings.$EnumSwitchMapping$0[item.getDesignType().ordinal()];
        if (i11 == 1) {
            return getSizeForGrid2(context);
        }
        if (i11 != 2) {
            return null;
        }
        return getSizeForGrid3(context);
    }

    @Override // ru.ozon.app.android.storefront.domain.image_prefetch.DecoratedImagePrefetchInfoProvider
    public String getWidgetImageUrl(@NotNull ObjectItemVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return item.getImage();
    }
}
