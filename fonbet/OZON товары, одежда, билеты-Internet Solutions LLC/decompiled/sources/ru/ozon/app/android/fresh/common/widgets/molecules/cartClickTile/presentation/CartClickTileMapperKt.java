package ru.ozon.app.android.fresh.common.widgets.molecules.cartClickTile.presentation;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.fresh.common.widgets.molecules.cartClickTile.data.CartClickTileDTO;
import ru.ozon.app.android.fresh.common.widgets.molecules.cartClickTile.presentation.CartClickTileVO;
import ru.ozon.app.android.fresh.common.widgets.molecules.imageSkuClick.presentation.ImageSkuClickMapperKt;
import ru.ozon.app.android.fresh.common.widgets.molecules.imageSkuClick.presentation.ImageSkuClickVO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\t\u001a\f\u0010\u0005\u001a\u00020\n*\u0004\u0018\u00010\u000b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"defaultHorizontalPadding", "", "defaultBetweenPadding", "defaultVerticalButtonPadding", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "toVO", "Lru/ozon/app/android/fresh/common/widgets/molecules/cartClickTile/presentation/CartClickTileVO;", "Lru/ozon/app/android/fresh/common/widgets/molecules/cartClickTile/data/CartClickTileDTO;", "widgetId", "", "Lru/ozon/app/android/fresh/common/widgets/molecules/cartClickTile/presentation/CartClickTileVO$SpacersVO;", "Lru/ozon/app/android/fresh/common/widgets/molecules/cartClickTile/data/CartClickTileDTO$Spacers;", "widgets_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CartClickTileMapperKt {
    private static final int defaultHorizontalPadding = ResourceExtKt.toPx(16);
    private static final int defaultBetweenPadding = ResourceExtKt.toPx(10);

    @NotNull
    private static final CommonCellSettings.LayoutPadding defaultVerticalButtonPadding = CommonCellSettings.LayoutPadding.PADDING_600;

    @NotNull
    public static final CartClickTileVO toVO(@NotNull CartClickTileDTO cartClickTileDTO, long j11) {
        CellDTO.Settings settings;
        CommonCellSettings.LayoutPadding topPadding;
        CommonCellSettings.LayoutPadding bottomPadding;
        Intrinsics.checkNotNullParameter(cartClickTileDTO, "<this>");
        ImageSkuClickVO vo = ImageSkuClickMapperKt.toVO(cartClickTileDTO.getSkuImage(), j11);
        CellDTO cell = cartClickTileDTO.getCell();
        CellDTO.Settings settings2 = cartClickTileDTO.getCell().getSettings();
        if (settings2 != null) {
            CellDTO.Settings settings3 = cartClickTileDTO.getCell().getSettings();
            CommonCellSettings.LayoutPadding topPadding2 = settings3 != null ? settings3.getTopPadding() : null;
            CommonCellSettings.LayoutPadding layoutPadding = CommonCellSettings.LayoutPadding.NONE;
            if (topPadding2 == layoutPadding) {
                topPadding = defaultVerticalButtonPadding;
            } else {
                CellDTO.Settings settings4 = cartClickTileDTO.getCell().getSettings();
                topPadding = settings4 != null ? settings4.getTopPadding() : null;
            }
            CellDTO.Settings settings5 = cartClickTileDTO.getCell().getSettings();
            if ((settings5 != null ? settings5.getBottomPadding() : null) == layoutPadding) {
                bottomPadding = defaultVerticalButtonPadding;
            } else {
                CellDTO.Settings settings6 = cartClickTileDTO.getCell().getSettings();
                bottomPadding = settings6 != null ? settings6.getBottomPadding() : null;
            }
            settings = CellDTO.Settings.copy$default(settings2, topPadding, bottomPadding, null, null, null, null, null, null, null, Boolean.TRUE, null, 1532, null);
        } else {
            settings = null;
        }
        CellDTO copy$default = CellDTO.copy$default(cell, null, settings, null, null, null, 29, null);
        String backgroundColor = cartClickTileDTO.getBackgroundColor();
        CartClickTileVO.SpacersVO vo2 = toVO(cartClickTileDTO.getSpacers());
        ButtonV3DTO button = cartClickTileDTO.getButton();
        AtomAction atomAction = AtomActionMapperKt.toAtomAction(cartClickTileDTO.getAction(), null);
        Map<String, TokenizedTrackingInfo> trackingInfo = cartClickTileDTO.getTrackingInfo();
        return new CartClickTileVO(vo, copy$default, backgroundColor, vo2, button, atomAction, trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null);
    }

    @NotNull
    public static final CartClickTileVO.SpacersVO toVO(CartClickTileDTO.Spacers spacers) {
        Paddings between;
        Paddings horizontal;
        return new CartClickTileVO.SpacersVO((spacers == null || (horizontal = spacers.getHorizontal()) == null) ? defaultHorizontalPadding : ResourceExtKt.toPx(horizontal.getPx()), (spacers == null || (between = spacers.getBetween()) == null) ? defaultBetweenPadding : ResourceExtKt.toPx(between.getPx()));
    }
}
