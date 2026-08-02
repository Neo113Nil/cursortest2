package ru.ozon.app.android.product.tiles.tilegrid2.data.mapper;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.product.molecules.blur.presentation.BlurMoleculeVO;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.views.galleryswipeview.data.AdultImagesModel;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.views.galleryswipeview.data.TileGrid2GalleryModel;
import ru.ozon.app.android.storefront.data.tiles.tilegrid2.ImageRatio;
import ru.ozon.app.android.storefront.data.tiles.tilegrid2.ImageRatioKt;
import ru.ozon.app.android.storefront.data.tiles.tilegrid2.TileGrid2ItemDTO;
import ru.ozon.app.android.storefront.data.tiles.tilegrid2.TileImageDTO;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/product/tiles/tilegrid2/data/mapper/TileGrid2GalleryModelMapper;", "", "<init>", "()V", "buildGalleryModel", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/views/galleryswipeview/data/TileGrid2GalleryModel;", "widgetId", "", "item", "Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2ItemDTO;", "enableParanja", "", "blurMoleculeVO", "Lru/ozon/app/android/product/molecules/blur/presentation/BlurMoleculeVO;", "calculateRatio", "", "ratio", "Lru/ozon/app/android/storefront/data/tiles/tilegrid2/ImageRatio;", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TileGrid2GalleryModelMapper {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ImageRatio.values().length];
            try {
                iArr[ImageRatio.IMAGE_RATIO_1_1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImageRatio.IMAGE_RATIO_3_4.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final float calculateRatio(ImageRatio ratio) {
        int i11 = ratio == null ? -1 : WhenMappings.$EnumSwitchMapping$0[ratio.ordinal()];
        Pair pair = i11 != 1 ? i11 != 2 ? new Pair(Float.valueOf(1.0f), Float.valueOf(1.0f)) : new Pair(Float.valueOf(3.0f), Float.valueOf(4.0f)) : new Pair(Float.valueOf(1.0f), Float.valueOf(1.0f));
        return ((Number) pair.b()).floatValue() / ((Number) pair.a()).floatValue();
    }

    @NotNull
    public final TileGrid2GalleryModel buildGalleryModel(long widgetId, @NotNull TileGrid2ItemDTO item, boolean enableParanja, BlurMoleculeVO blurMoleculeVO) {
        boolean z11;
        boolean z12;
        long j11;
        Intrinsics.checkNotNullParameter(item, "item");
        float calculateRatio = calculateRatio(item.getTileImage().getImageRatio());
        TileImageDTO tileImage = item.getTileImage();
        if (blurMoleculeVO != null) {
            z11 = true;
            j11 = widgetId;
            z12 = enableParanja;
        } else {
            z11 = false;
            z12 = enableParanja;
            j11 = widgetId;
        }
        return new TileGrid2GalleryModel(new AdultImagesModel(GalleryModelMapperKt.mapGalleryItems(tileImage, j11, calculateRatio, z12, z11), item.isPagerIndicatorHidden(), blurMoleculeVO), ImageRatioKt.toConstraintLayoutRatio$default(item.getTileImage().getImageRatio(), null, 1, null), calculateRatio);
    }
}
