package ru.ozon.app.android.product.common;

import Sc.o;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.product.addToCart.presentation.AddToCartButtonView;
import ru.ozon.app.android.product.common.TileThemeConfigVO;
import ru.ozon.app.android.storefront.data.tiles.common.TileTheme;
import ru.ozon.app.android.storefrontcommonwidgets.utils.Dimens;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\f\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002\u001a\u0014\u0010\u0003\u001a\u00020\u0001*\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0014\u0010\u0006\u001a\u00020\u0001*\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0005¨\u0006\b"}, d2 = {"toTileScrollThemeVO", "Lru/ozon/app/android/product/common/TileThemeConfigVO;", "Lru/ozon/app/android/storefront/data/tiles/common/TileTheme;", "toTileGrid3ThemeVO", "hasHeader", "", "toTileGrid2ThemeVO", "belowHeader", "product_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TileThemeConfigVOKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TileTheme.values().length];
            try {
                iArr[TileTheme.SELECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TileTheme.DEFAULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final TileThemeConfigVO toTileGrid2ThemeVO(TileTheme tileTheme, boolean z11) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[(tileTheme == null ? TileTheme.DEFAULT : tileTheme).ordinal()];
        if (i11 == 1) {
            Dimens dimens = Dimens.INSTANCE;
            return new TileThemeConfigVO(dimens.getDPF_20(), z11 ? dimens.getDP_8() : 0, true, TileThemeConfigVO.AddToCartButtonConfigVO.copy$default(AddToCartButtonView.INSTANCE.getConfigDefault(), dimens.getDPF_32(), 0, 0, 0, 0, 0, 0, 0, 0, false, false, 2046, null));
        }
        if (i11 != 2) {
            throw new o();
        }
        Dimens dimens2 = Dimens.INSTANCE;
        return new TileThemeConfigVO(dimens2.getDPF_16(), z11 ? dimens2.getDP_12() : dimens2.getDP_4(), false, AddToCartButtonView.INSTANCE.getConfigDefault());
    }

    @NotNull
    public static final TileThemeConfigVO toTileGrid3ThemeVO(TileTheme tileTheme, boolean z11) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[(tileTheme == null ? TileTheme.DEFAULT : tileTheme).ordinal()];
        if (i11 == 1) {
            Dimens dimens = Dimens.INSTANCE;
            return new TileThemeConfigVO(dimens.getDPF_16(), z11 ? dimens.getDP_4() : dimens.getDP_2(), true, TileThemeConfigVO.AddToCartButtonConfigVO.copy$default(AddToCartButtonView.INSTANCE.getConfigDefault(), dimens.getDPF_32(), 0, 0, 0, 0, 0, 0, 0, 0, false, false, 2046, null));
        }
        if (i11 != 2) {
            throw new o();
        }
        Dimens dimens2 = Dimens.INSTANCE;
        return new TileThemeConfigVO(dimens2.getDPF_12(), dimens2.getDP_6(), false, AddToCartButtonView.INSTANCE.getConfigDefault());
    }

    @NotNull
    public static final TileThemeConfigVO toTileScrollThemeVO(TileTheme tileTheme) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[(tileTheme == null ? TileTheme.DEFAULT : tileTheme).ordinal()];
        if (i11 == 1) {
            Dimens dimens = Dimens.INSTANCE;
            return new TileThemeConfigVO(dimens.getDPF_16(), dimens.getDP_6(), true, TileThemeConfigVO.AddToCartButtonConfigVO.copy$default(AddToCartButtonView.INSTANCE.getConfigDefault(), dimens.getDPF_32(), 0, 0, 0, 0, 0, 0, 0, 0, false, false, 2046, null));
        }
        if (i11 != 2) {
            throw new o();
        }
        Dimens dimens2 = Dimens.INSTANCE;
        return new TileThemeConfigVO(dimens2.getDPF_12(), dimens2.getDP_8(), false, AddToCartButtonView.INSTANCE.getConfigDefault());
    }
}
