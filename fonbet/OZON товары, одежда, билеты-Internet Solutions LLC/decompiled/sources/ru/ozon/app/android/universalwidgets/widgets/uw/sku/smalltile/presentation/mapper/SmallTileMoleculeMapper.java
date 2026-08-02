package ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.mapper;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMoleculeV2;
import ru.ozon.app.android.product.common.TileThemeConfigVO;
import ru.ozon.app.android.product.molecules.blur.presentation.BlurMoleculeVO;
import ru.ozon.app.android.product.molecules.blur.presentation.BlurMoleculeVOKt;
import ru.ozon.app.android.product.tileContentItems.vo.TileContentItem;
import ru.ozon.app.android.product.tileContentItems.vo.TileContentItemKt;
import ru.ozon.app.android.product.tiles.common.FavoriteProductMoleculeV2Mapper;
import ru.ozon.app.android.storefront.data.tiles.addtocart.AddToCartButtonDTO;
import ru.ozon.app.android.storefront.data.tiles.blur.BlurMoleculeContentDTO;
import ru.ozon.app.android.storefront.data.tiles.blur.BlurMoleculeDTO;
import ru.ozon.app.android.storefront.data.tiles.smalltile.SmallTileMoleculeDTO;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.vo.SmallTileAdultImageModel;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.vo.SmallTileButtonModel;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.vo.SmallTileModelImage;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.vo.SmallTileMoleculeVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J{\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d¢\u0006\u0002\u0010\u001eJB\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010#\u001a\u0004\u0018\u00010$H\u0002J8\u0010%\u001a\u00020&2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/mapper/SmallTileMoleculeMapper;", "", "favoriteProductMoleculeV2Mapper", "Lru/ozon/app/android/product/tiles/common/FavoriteProductMoleculeV2Mapper;", "<init>", "(Lru/ozon/app/android/product/tiles/common/FavoriteProductMoleculeV2Mapper;)V", "map", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/vo/SmallTileMoleculeVO;", "moleculeDto", "Lru/ozon/app/android/storefront/data/tiles/smalltile/SmallTileMoleculeDTO;", "id", "", "widgetId", "stateId", "", "stateHeight", "", "widthImage", "heightImage", "ratio", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/vo/SmallTileModelImage$Ratio;", "smallTileImageOptions", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/vo/SmallTileMoleculeVO$SmallTileImageOptions;", "blurItemInfo", "", "Lru/ozon/app/android/storefront/data/tiles/blur/BlurMoleculeContentDTO;", "themeConfig", "Lru/ozon/app/android/product/common/TileThemeConfigVO;", "isLikezone", "", "(Lru/ozon/app/android/storefront/data/tiles/smalltile/SmallTileMoleculeDTO;JJLjava/lang/String;Ljava/lang/Integer;IILru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/vo/SmallTileModelImage$Ratio;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/vo/SmallTileMoleculeVO$SmallTileImageOptions;Ljava/util/Map;Lru/ozon/app/android/product/common/TileThemeConfigVO;Z)Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/vo/SmallTileMoleculeVO;", "buildImageModel", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/vo/SmallTileAdultImageModel;", "parentVoId", "item", "blurMolecule", "Lru/ozon/app/android/product/molecules/blur/presentation/BlurMoleculeVO;", "createImage", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/vo/SmallTileModelImage;", "imageUrl", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SmallTileMoleculeMapper {

    @NotNull
    private final FavoriteProductMoleculeV2Mapper favoriteProductMoleculeV2Mapper;

    public SmallTileMoleculeMapper(@NotNull FavoriteProductMoleculeV2Mapper favoriteProductMoleculeV2Mapper) {
        Intrinsics.checkNotNullParameter(favoriteProductMoleculeV2Mapper, "favoriteProductMoleculeV2Mapper");
        this.favoriteProductMoleculeV2Mapper = favoriteProductMoleculeV2Mapper;
    }

    private final SmallTileAdultImageModel buildImageModel(long parentVoId, SmallTileMoleculeDTO item, SmallTileModelImage.Ratio ratio, int widthImage, int heightImage, SmallTileMoleculeVO.SmallTileImageOptions smallTileImageOptions, BlurMoleculeVO blurMolecule) {
        return new SmallTileAdultImageModel(createImage(parentVoId, item.getImageComponent().getImageItem().getImageUrl(), ratio, widthImage, heightImage, smallTileImageOptions), blurMolecule);
    }

    private final SmallTileModelImage createImage(long id2, String imageUrl, SmallTileModelImage.Ratio ratio, int widthImage, int heightImage, SmallTileMoleculeVO.SmallTileImageOptions smallTileImageOptions) {
        return new SmallTileModelImage(id2, imageUrl, ratio, widthImage, heightImage, smallTileImageOptions.getEnableParanja(), smallTileImageOptions.getIsCompactFavoriteIcon(), smallTileImageOptions.getScaleType());
    }

    @NotNull
    public final SmallTileMoleculeVO map(@NotNull SmallTileMoleculeDTO moleculeDto, long id2, long widgetId, @NotNull String stateId, Integer stateHeight, int widthImage, int heightImage, @NotNull SmallTileModelImage.Ratio ratio, @NotNull SmallTileMoleculeVO.SmallTileImageOptions smallTileImageOptions, Map<String, BlurMoleculeContentDTO> blurItemInfo, @NotNull TileThemeConfigVO themeConfig, boolean isLikezone) {
        Intrinsics.checkNotNullParameter(moleculeDto, "moleculeDto");
        Intrinsics.checkNotNullParameter(stateId, "stateId");
        Intrinsics.checkNotNullParameter(ratio, "ratio");
        Intrinsics.checkNotNullParameter(smallTileImageOptions, "smallTileImageOptions");
        Intrinsics.checkNotNullParameter(themeConfig, "themeConfig");
        BlurMoleculeDTO blurItem = moleculeDto.getImageComponent().getBlurItem();
        SmallTileAdultImageModel buildImageModel = buildImageModel(id2, moleculeDto, ratio, widthImage, heightImage, smallTileImageOptions, blurItem != null ? BlurMoleculeVOKt.toVO(blurItem, blurItemInfo, Float.valueOf(themeConfig.getContainerCornerRadius())) : null);
        AddToCartButtonDTO addToCartButton = moleculeDto.getAddToCartButton();
        SmallTileButtonModel smallTileButtonModel = addToCartButton != null ? new SmallTileButtonModel(widgetId, addToCartButton) : null;
        AtomActionDTO action = moleculeDto.getAction();
        AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, moleculeDto.getTrackingInfo()) : null;
        FavoriteProductMoleculeV2 favoriteProductMoleculeV2 = moleculeDto.getImageComponent().getFavoriteProductMoleculeV2();
        SmallTileMoleculeVO.ImageComponent imageComponent = new SmallTileMoleculeVO.ImageComponent(buildImageModel, favoriteProductMoleculeV2 != null ? this.favoriteProductMoleculeV2Mapper.map(favoriteProductMoleculeV2, themeConfig.getIsCompactFavIcon(), isLikezone) : null, moleculeDto.getImageComponent().getBadge(), false, 8, null);
        List<Object> mainState = moleculeDto.getMainState();
        List<TileContentItem> mapContentElements = mainState != null ? TileContentItemKt.mapContentElements(mainState, moleculeDto.isTextTagSupported()) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = moleculeDto.getTrackingInfo();
        return new SmallTileMoleculeVO(id2, stateId, atomAction, imageComponent, mapContentElements, stateHeight, smallTileButtonModel, trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(widgetId), null, 2, null) : null, themeConfig, moleculeDto.getIslandBackgroundColor());
    }
}
