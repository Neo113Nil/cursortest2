package ru.ozon.app.android.fresh.common.widgets.molecules.freshTile;

import WZ.t;
import WZ.x;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshFavoriteButton.FreshFavoriteMoleculeDTO;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshFavoriteButton.FreshFavoriteMoleculeDTOKt;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshFavoriteButton.FreshFavoriteMoleculeVO;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.data.FreshTileDTO;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.presentation.FreshTileModel;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.presentation.FreshTileVO;
import ru.ozon.app.android.fresh.common.widgets.molecules.productActionBar.ProductActionBarMapperKt;
import ru.ozon.app.android.fresh.common.widgets.molecules.productActionBar.ProductActionBarMapperV2Kt;
import ru.ozon.app.android.fresh.common.widgets.molecules.productActionBar.data.ProductActionBarDTO;
import ru.ozon.app.android.fresh.common.widgets.molecules.productActionBar.presentation.ProductActionBarVO;
import ru.ozon.app.android.fresh.common.widgets.molecules.productActionBar.presentation.ProductActionBarVOV2;
import ru.ozon.app.android.fresh.common.widgets.molecules.productMedia.presentation.ProductMediaMapperKt;
import ru.ozon.app.android.fresh.common.widgets.molecules.productMedia.presentation.ProductMediaVO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u001a\n\u0010\u0000\u001a\u00020\t*\u00020\n¨\u0006\u000b"}, d2 = {"toVO", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/FreshTileVO;", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/data/FreshTileDTO;", "widgetId", "", "type", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/FreshTileType;", "scrollWidgetKey", "", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/FreshTileModel$PaddingsVO;", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/data/FreshTileDTO$PaddingsDTO;", "widgets_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FreshTileMapperKt {
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0071, code lost:
    
        if ((r15 != null ? r15.getAdultActionIcon() : null) != null) goto L23;
     */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final FreshTileVO toVO(@NotNull FreshTileDTO freshTileDTO, long j11, @NotNull FreshTileType type, int i11) {
        FreshFavoriteMoleculeVO freshFavoriteMoleculeVO;
        Intrinsics.checkNotNullParameter(freshTileDTO, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        boolean z11 = false;
        ProductMediaVO vO$default = ProductMediaMapperKt.toVO$default(freshTileDTO.getProductMedia(), type, false, 2, null);
        ProductActionBarDTO actionBar = freshTileDTO.getActionBar();
        ProductActionBarVO vo = actionBar != null ? ProductActionBarMapperKt.toVO(actionBar, j11) : null;
        List<AtomDTO> innerAtoms = freshTileDTO.getInnerAtoms();
        List<BadgeDTO> badges = freshTileDTO.getBadges();
        FreshTileModel.PaddingsVO vo2 = toVO(freshTileDTO.getPaddings());
        AtomActionDTO clickAction = freshTileDTO.getClickAction();
        AtomAction atomAction = clickAction != null ? AtomActionMapperKt.toAtomAction(clickAction, null) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = freshTileDTO.getTrackingInfo();
        t b11 = trackingInfo != null ? x.b(trackingInfo, Long.valueOf(j11), null) : null;
        FreshFavoriteMoleculeDTO favoriteIcon = freshTileDTO.getFavoriteIcon();
        if (favoriteIcon != null) {
            if (!freshTileDTO.getProductMedia().getHasBlurAndNoise()) {
                ProductActionBarDTO actionBar2 = freshTileDTO.getActionBar();
            }
            z11 = true;
            freshFavoriteMoleculeVO = FreshFavoriteMoleculeDTOKt.toModel(favoriteIcon, j11, z11);
        } else {
            freshFavoriteMoleculeVO = null;
        }
        ProductActionBarDTO actionBar3 = freshTileDTO.getActionBar();
        ProductActionBarVOV2 vov2 = actionBar3 != null ? ProductActionBarMapperV2Kt.toVOV2(actionBar3, j11) : null;
        TestInfo testInfo = freshTileDTO.getTestInfo();
        return new FreshTileVO(j11, type, i11, vO$default, vo, innerAtoms, badges, vo2, atomAction, b11, 0L, freshFavoriteMoleculeVO, vov2, testInfo != null ? testInfo.getAutomatizationId() : null, UserVerificationMethods.USER_VERIFY_ALL, null);
    }

    @NotNull
    public static final FreshTileModel.PaddingsVO toVO(@NotNull FreshTileDTO.PaddingsDTO paddingsDTO) {
        Intrinsics.checkNotNullParameter(paddingsDTO, "<this>");
        return new FreshTileModel.PaddingsVO(ResourceExtKt.toPx(paddingsDTO.getTop().getPx()), ResourceExtKt.toPx(paddingsDTO.getBottom().getPx()), ResourceExtKt.toPx(paddingsDTO.getLeft().getPx()), ResourceExtKt.toPx(paddingsDTO.getRight().getPx()));
    }
}
