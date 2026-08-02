package ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.mapper;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.data.tiles.smalltile.SmallTileMoleculeDTO;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.vo.SmallTileModelImage;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002H\u0000¨\u0006\u0003"}, d2 = {"mapRatio", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/vo/SmallTileModelImage$Ratio;", "Lru/ozon/app/android/storefront/data/tiles/smalltile/SmallTileMoleculeDTO$SmallTileOptions$ImageRatio;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SmallTileMapperKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SmallTileMoleculeDTO.SmallTileOptions.ImageRatio.values().length];
            try {
                iArr[SmallTileMoleculeDTO.SmallTileOptions.ImageRatio.IMAGE_RATIO_1_1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SmallTileMoleculeDTO.SmallTileOptions.ImageRatio.IMAGE_RATIO_3_4.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final SmallTileModelImage.Ratio mapRatio(SmallTileMoleculeDTO.SmallTileOptions.ImageRatio imageRatio) {
        int i11 = imageRatio == null ? -1 : WhenMappings.$EnumSwitchMapping$0[imageRatio.ordinal()];
        if (i11 != 1 && i11 == 2) {
            return SmallTileModelImage.Ratio.RATIO_3_4;
        }
        return SmallTileModelImage.Ratio.RATIO_1_1;
    }
}
