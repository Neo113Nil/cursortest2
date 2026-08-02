package ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.data.mappers;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.labelList.LabelListAtom;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMoleculeV2;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMoleculeV2ExtKt;
import ru.ozon.app.android.fresh.main.ui.molecules.addToCartButton.data.AddToCartButtonDTO;
import ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.data.WiseOldTileDTO;
import ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.vo.WiseOldTileVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.productMedia.ProductMediaDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"toVO", "Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/vo/WiseOldTileVO;", "Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/data/WiseOldTileDTO;", "widgetId", "", "widgets-main_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class WiseOldTileMapperKt {
    @NotNull
    public static final WiseOldTileVO toVO(@NotNull WiseOldTileDTO wiseOldTileDTO, long j11) {
        Intrinsics.checkNotNullParameter(wiseOldTileDTO, "<this>");
        ProductMediaDTO image = wiseOldTileDTO.getImage();
        FavoriteProductMoleculeV2 favoriteButton = wiseOldTileDTO.getFavoriteButton();
        FavoriteProductMolecule mapToV1$default = favoriteButton != null ? FavoriteProductMoleculeV2ExtKt.mapToV1$default(favoriteButton, false, 1, null) : null;
        PriceDTO price = wiseOldTileDTO.getPrice();
        PriceDTO priceWithDiscount = wiseOldTileDTO.getPriceWithDiscount();
        TextDTO title = wiseOldTileDTO.getTitle();
        LabelListAtom labels = wiseOldTileDTO.getLabels();
        AddToCartButtonDTO addToCartButton = wiseOldTileDTO.getAddToCartButton();
        AtomAction atomAction = AtomActionMapperKt.toAtomAction(wiseOldTileDTO.getAction(), null);
        Map<String, TokenizedTrackingInfo> trackingInfo = wiseOldTileDTO.getTrackingInfo();
        return new WiseOldTileVO(j11, image, mapToV1$default, price, priceWithDiscount, title, labels, addToCartButton, atomAction, trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null);
    }
}
