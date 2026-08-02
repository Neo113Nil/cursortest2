package ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.data.mappers;

import WZ.t;
import WZ.x;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshFavoriteButton.FreshFavoriteMoleculeDTO;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshFavoriteButton.FreshFavoriteMoleculeDTOKt;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshFavoriteButton.FreshFavoriteMoleculeVO;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.FreshTileMapperKt;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.FreshTileType;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.data.FreshTileDTO;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.presentation.FreshTileModel;
import ru.ozon.app.android.fresh.common.widgets.molecules.productActionBar.ProductActionBarMapperKt;
import ru.ozon.app.android.fresh.common.widgets.molecules.productActionBar.ProductActionBarMapperV2Kt;
import ru.ozon.app.android.fresh.common.widgets.molecules.productActionBar.data.ProductActionBarDTO;
import ru.ozon.app.android.fresh.common.widgets.molecules.productActionBar.presentation.ProductActionBarVO;
import ru.ozon.app.android.fresh.common.widgets.molecules.productActionBar.presentation.ProductActionBarVOV2;
import ru.ozon.app.android.fresh.common.widgets.molecules.productMedia.presentation.ProductMediaMapperKt;
import ru.ozon.app.android.fresh.common.widgets.molecules.productMedia.presentation.ProductMediaVO;
import ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.vo.WiseFreshTileVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\"\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\b"}, d2 = {"toVO", "Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/vo/WiseFreshTileVO;", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/data/FreshTileDTO;", "widgetId", "", "isCombo", "", "hasBanner", "widgets-main_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class WiseFreshTileMapperKt {
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006b, code lost:
    
        if ((r13 != null ? r13.getAdultActionIcon() : null) != null) goto L23;
     */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final WiseFreshTileVO toVO(@NotNull FreshTileDTO freshTileDTO, long j11, boolean z11, boolean z12) {
        FreshFavoriteMoleculeVO freshFavoriteMoleculeVO;
        Intrinsics.checkNotNullParameter(freshTileDTO, "<this>");
        FreshTileType freshTileType = FreshTileType.MINI;
        boolean z13 = false;
        ProductMediaVO vO$default = ProductMediaMapperKt.toVO$default(freshTileDTO.getProductMedia(), freshTileType, false, 2, null);
        ProductActionBarDTO actionBar = freshTileDTO.getActionBar();
        ProductActionBarVO vo = actionBar != null ? ProductActionBarMapperKt.toVO(actionBar, j11) : null;
        List<AtomDTO> innerAtoms = freshTileDTO.getInnerAtoms();
        List<BadgeDTO> badges = freshTileDTO.getBadges();
        FreshTileModel.PaddingsVO vo2 = FreshTileMapperKt.toVO(freshTileDTO.getPaddings());
        AtomActionDTO clickAction = freshTileDTO.getClickAction();
        AtomAction atomAction = clickAction != null ? AtomActionMapperKt.toAtomAction(clickAction, null) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = freshTileDTO.getTrackingInfo();
        t b11 = trackingInfo != null ? x.b(trackingInfo, Long.valueOf(j11), null) : null;
        FreshFavoriteMoleculeDTO favoriteIcon = freshTileDTO.getFavoriteIcon();
        if (favoriteIcon != null) {
            if (!freshTileDTO.getProductMedia().getHasBlurAndNoise()) {
                ProductActionBarDTO actionBar2 = freshTileDTO.getActionBar();
            }
            z13 = true;
            freshFavoriteMoleculeVO = FreshFavoriteMoleculeDTOKt.toModel(favoriteIcon, j11, z13);
        } else {
            freshFavoriteMoleculeVO = null;
        }
        ProductActionBarDTO actionBar3 = freshTileDTO.getActionBar();
        ProductActionBarVOV2 vov2 = actionBar3 != null ? ProductActionBarMapperV2Kt.toVOV2(actionBar3, j11) : null;
        TestInfo testInfo = freshTileDTO.getTestInfo();
        return new WiseFreshTileVO(j11, freshTileType, vO$default, vo, innerAtoms, badges, vo2, atomAction, b11, freshFavoriteMoleculeVO, vov2, testInfo != null ? testInfo.getAutomatizationId() : null, z11, z12);
    }
}
