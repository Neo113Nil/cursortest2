package ru.ozon.app.android.universalwidgets.messenger.tilescroll.presentation;

import Pc.a;
import Sc.o;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.header.data.HeaderDTO;
import ru.ozon.android.composerCommonViewKit.header.presentation.HeaderVO;
import ru.ozon.android.messenger.framework.presentation.models.c;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMoleculeV2;
import ru.ozon.app.android.product.addToCart.presentation.AddToCartButtonView;
import ru.ozon.app.android.product.common.TileThemeConfigVO;
import ru.ozon.app.android.product.molecules.blur.presentation.BlurMoleculeVO;
import ru.ozon.app.android.product.molecules.blur.presentation.BlurMoleculeVOKt;
import ru.ozon.app.android.product.tileContentItems.vo.TileContentItem;
import ru.ozon.app.android.product.tileContentItems.vo.TileContentItemKt;
import ru.ozon.app.android.product.tiles.common.FavoriteProductMoleculeV2Mapper;
import ru.ozon.app.android.storefront.data.tiles.addtocart.AddToCartButtonDTO;
import ru.ozon.app.android.storefront.data.tiles.blur.BlurMoleculeDTO;
import ru.ozon.app.android.storefront.data.tiles.common.ContentModeKt;
import ru.ozon.app.android.storefrontcommonwidgets.utils.Dimens;
import ru.ozon.app.android.universalwidgets.messenger.tilescroll.data.TileScrollBlockDTO;
import ru.ozon.app.android.universalwidgets.messenger.tilescroll.presentation.model.TileScrollBlockVO;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.SmallTileAsyncStateMeasurer;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilescroll.data.TileWidthConfig;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilescroll.ui.mapper.TileScrollItemMeasureWidthHelper;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.TestInfo;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B%\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJY\u0010\u001e\u001a\u00020\u001d*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00122\b\u0010\u001a\u001a\u0004\u0018\u00010\u00122\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ&\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010 \u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b!\u0010\"R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010#R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010$R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/TileScrollBlockMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/universalwidgets/messenger/tilescroll/data/TileScrollBlockDTO;", "Lru/ozon/android/messenger/framework/presentation/models/c;", "", "Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/model/TileScrollBlockVO;", "Lru/ozon/android/messenger/framework/core/viewmapper/BlockMapper;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/SmallTileAsyncStateMeasurer;", "smallTileHeightMeasurer", "LPc/a;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/ui/mapper/TileScrollItemMeasureWidthHelper;", "tileScrollItemMeasureWidthHelper", "Lru/ozon/app/android/product/tiles/common/FavoriteProductMoleculeV2Mapper;", "favoriteProductMoleculeV2Mapper", "<init>", "(Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/SmallTileAsyncStateMeasurer;LPc/a;Lru/ozon/app/android/product/tiles/common/FavoriteProductMoleculeV2Mapper;)V", "Lru/ozon/app/android/universalwidgets/messenger/tilescroll/data/TileScrollBlockDTO$Tile;", "blockId", "", "index", "Lru/ozon/app/android/universalwidgets/messenger/tilescroll/data/TileScrollBlockDTO$Options$TileOptions;", "options", "Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/model/TileScrollBlockVO$TileVO$ImageComponent$SmallTileAdultImageModel$SmallTileModelImage$Ratio;", "ratio", "widthImage", "heightImage", "stateHeight", "Lru/ozon/app/android/universalwidgets/messenger/tilescroll/data/TileScrollBlockDTO$SharedData;", "sharedData", "Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/model/TileScrollBlockVO$TileVO;", "toVO", "(Lru/ozon/app/android/universalwidgets/messenger/tilescroll/data/TileScrollBlockDTO$Tile;Lru/ozon/android/messenger/framework/presentation/models/c;ILru/ozon/app/android/universalwidgets/messenger/tilescroll/data/TileScrollBlockDTO$Options$TileOptions;Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/model/TileScrollBlockVO$TileVO$ImageComponent$SmallTileAdultImageModel$SmallTileModelImage$Ratio;IILjava/lang/Integer;Lru/ozon/app/android/universalwidgets/messenger/tilescroll/data/TileScrollBlockDTO$SharedData;)Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/model/TileScrollBlockVO$TileVO;", "dto", "invoke", "(Lru/ozon/app/android/universalwidgets/messenger/tilescroll/data/TileScrollBlockDTO;Lru/ozon/android/messenger/framework/presentation/models/c;)Ljava/util/List;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/SmallTileAsyncStateMeasurer;", "LPc/a;", "Lru/ozon/app/android/product/tiles/common/FavoriteProductMoleculeV2Mapper;", "Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/HeaderMapper;", "headerMapper", "Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/HeaderMapper;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TileScrollBlockMapper implements Function2<TileScrollBlockDTO, c, List<? extends TileScrollBlockVO>> {

    @NotNull
    private final FavoriteProductMoleculeV2Mapper favoriteProductMoleculeV2Mapper;

    @NotNull
    private final HeaderMapper headerMapper;

    @NotNull
    private final SmallTileAsyncStateMeasurer smallTileHeightMeasurer;

    @NotNull
    private final a<TileScrollItemMeasureWidthHelper> tileScrollItemMeasureWidthHelper;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[TileScrollBlockDTO.Options.VisibleCellsCount.values().length];
            try {
                iArr[TileScrollBlockDTO.Options.VisibleCellsCount.COUNT_3_5.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TileScrollBlockDTO.Options.VisibleCellsCount.COUNT_2_4.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[TileScrollBlockDTO.Options.TileOptions.ImageRatio.values().length];
            try {
                iArr2[TileScrollBlockDTO.Options.TileOptions.ImageRatio.IMAGE_RATIO_1_1.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[TileScrollBlockDTO.Options.TileOptions.ImageRatio.IMAGE_RATIO_3_4.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public TileScrollBlockMapper(@NotNull SmallTileAsyncStateMeasurer smallTileHeightMeasurer, @NotNull a<TileScrollItemMeasureWidthHelper> tileScrollItemMeasureWidthHelper, @NotNull FavoriteProductMoleculeV2Mapper favoriteProductMoleculeV2Mapper) {
        Intrinsics.checkNotNullParameter(smallTileHeightMeasurer, "smallTileHeightMeasurer");
        Intrinsics.checkNotNullParameter(tileScrollItemMeasureWidthHelper, "tileScrollItemMeasureWidthHelper");
        Intrinsics.checkNotNullParameter(favoriteProductMoleculeV2Mapper, "favoriteProductMoleculeV2Mapper");
        this.smallTileHeightMeasurer = smallTileHeightMeasurer;
        this.tileScrollItemMeasureWidthHelper = tileScrollItemMeasureWidthHelper;
        this.favoriteProductMoleculeV2Mapper = favoriteProductMoleculeV2Mapper;
        this.headerMapper = new HeaderMapper();
    }

    private final TileScrollBlockVO.TileVO toVO(TileScrollBlockDTO.Tile tile, c cVar, int i11, TileScrollBlockDTO.Options.TileOptions tileOptions, TileScrollBlockVO.TileVO.ImageComponent.SmallTileAdultImageModel.SmallTileModelImage.Ratio ratio, int i12, int i13, Integer num, TileScrollBlockDTO.SharedData sharedData) {
        BlurMoleculeVO blurMoleculeVO;
        TileScrollBlockDTO.Options.TileOptions.ImageRatio imageRatio;
        Boolean enableParanja;
        Boolean isCompactFavoriteIcon;
        Boolean isCompactFavoriteIcon2;
        Boolean isCompactFavoriteIcon3;
        Boolean enableParanja2;
        long hashCode = (tile.getMainState() + " + " + tile.getImageComponent().getImageItem().getImageUrl() + " + " + i11).hashCode();
        AtomActionDTO action = tile.getAction();
        AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, tile.getTrackingInfo()) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = tile.getTrackingInfo();
        TileScrollBlockVO.TileVO.ImageComponent.SmallTileAdultImageModel.SmallTileModelImage smallTileModelImage = new TileScrollBlockVO.TileVO.ImageComponent.SmallTileAdultImageModel.SmallTileModelImage(tile.getImageComponent().getImageItem().getImageUrl(), ratio, i12, i13, (tileOptions == null || (enableParanja2 = tileOptions.getEnableParanja()) == null) ? false : enableParanja2.booleanValue(), (tileOptions == null || (isCompactFavoriteIcon3 = tileOptions.isCompactFavoriteIcon()) == null) ? false : isCompactFavoriteIcon3.booleanValue(), ContentModeKt.mapScaleType(tile.getImageComponent().getImageItem().getContentMode()));
        BlurMoleculeDTO blurItem = tile.getImageComponent().getBlurItem();
        if (blurItem != null) {
            blurMoleculeVO = BlurMoleculeVOKt.toVO(blurItem, sharedData != null ? sharedData.getBlurItemInfo() : null, Float.valueOf(UiExtKt.toPxF(12.0f)));
        } else {
            blurMoleculeVO = null;
        }
        TileScrollBlockVO.TileVO.ImageComponent.SmallTileAdultImageModel smallTileAdultImageModel = new TileScrollBlockVO.TileVO.ImageComponent.SmallTileAdultImageModel(smallTileModelImage, blurMoleculeVO);
        FavoriteProductMoleculeV2 favoriteProductMoleculeV2 = tile.getImageComponent().getFavoriteProductMoleculeV2();
        TileScrollBlockVO.TileVO.ImageComponent imageComponent = new TileScrollBlockVO.TileVO.ImageComponent(smallTileAdultImageModel, favoriteProductMoleculeV2 != null ? FavoriteProductMoleculeV2Mapper.map$default(this.favoriteProductMoleculeV2Mapper, favoriteProductMoleculeV2, false, false, 4, null) : null, tile.getImageComponent().getBadge(), (tileOptions == null || (isCompactFavoriteIcon2 = tileOptions.isCompactFavoriteIcon()) == null) ? false : isCompactFavoriteIcon2.booleanValue());
        List<Object> mainState = tile.getMainState();
        List<Object> mainState2 = tile.getMainState();
        List<TileContentItem> mapContentElements = mainState2 != null ? TileContentItemKt.mapContentElements(mainState2, tile.isTextTagSupported()) : null;
        AddToCartButtonDTO addToCartButton = tile.getAddToCartButton();
        Boolean isTextTagSupported = tile.isTextTagSupported();
        boolean booleanValue = (tileOptions == null || (isCompactFavoriteIcon = tileOptions.isCompactFavoriteIcon()) == null) ? false : isCompactFavoriteIcon.booleanValue();
        boolean booleanValue2 = (tileOptions == null || (enableParanja = tileOptions.getEnableParanja()) == null) ? false : enableParanja.booleanValue();
        if (tileOptions == null || (imageRatio = tileOptions.getImageRatio()) == null) {
            imageRatio = TileScrollBlockDTO.Options.TileOptions.ImageRatio.IMAGE_RATIO_1_1;
        }
        TileScrollBlockDTO.Options.TileOptions.ImageRatio imageRatio2 = imageRatio;
        Dimens dimens = Dimens.INSTANCE;
        return new TileScrollBlockVO.TileVO(cVar, hashCode, atomAction, trackingInfo, imageComponent, mainState, mapContentElements, num, addToCartButton, isTextTagSupported, booleanValue, booleanValue2, imageRatio2, new TileThemeConfigVO(dimens.getDPF_12(), dimens.getDP_8(), false, AddToCartButtonView.INSTANCE.getConfigDefault()));
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<TileScrollBlockVO> invoke(@NotNull TileScrollBlockDTO dto, @NotNull c blockId) {
        TileScrollBlockDTO.Options.VisibleCellsCount visibleCellsCount;
        float f7;
        TileScrollBlockVO.TileVO.ImageComponent.SmallTileAdultImageModel.SmallTileModelImage.Ratio ratio;
        String str;
        TestInfo testInfo;
        TileScrollBlockDTO.Options.TileOptions smallTileOptions;
        TileScrollBlockMapper tileScrollBlockMapper = this;
        Intrinsics.checkNotNullParameter(dto, "dto");
        c blockId2 = blockId;
        Intrinsics.checkNotNullParameter(blockId2, "blockId");
        TileScrollItemMeasureWidthHelper tileScrollItemMeasureWidthHelper = tileScrollBlockMapper.tileScrollItemMeasureWidthHelper.get();
        TileScrollBlockDTO.Options options = dto.getOptions();
        if (options == null || (visibleCellsCount = options.getVisibleCellsCount()) == null) {
            visibleCellsCount = TileScrollBlockDTO.Options.VisibleCellsCount.COUNT_3_5;
        }
        TileScrollBlockDTO.Options.VisibleCellsCount visibleCellsCount2 = visibleCellsCount;
        int i11 = WhenMappings.$EnumSwitchMapping$0[visibleCellsCount2.ordinal()];
        if (i11 == 1) {
            f7 = 3.5f;
        } else {
            if (i11 != 2) {
                throw new o();
            }
            f7 = 2.4f;
        }
        int singleItemWidth = tileScrollItemMeasureWidthHelper.getSingleItemWidth(new TileWidthConfig.Default(f7));
        List<TileScrollBlockDTO.Tile> items = dto.getItems();
        ArrayList arrayList = new ArrayList(C7714v.z(items, 10));
        Iterator<T> it = items.iterator();
        while (true) {
            List list = null;
            if (!it.hasNext()) {
                break;
            }
            List<Object> mainState = ((TileScrollBlockDTO.Tile) it.next()).getMainState();
            if (mainState != null) {
                list = TileContentItemKt.mapContentElements$default(mainState, null, 1, null);
            }
            arrayList.add(list);
        }
        TileScrollBlockDTO.Options options2 = dto.getOptions();
        TileScrollBlockDTO.Options.TileOptions.ImageRatio imageRatio = (options2 == null || (smallTileOptions = options2.getSmallTileOptions()) == null) ? null : smallTileOptions.getImageRatio();
        int i12 = imageRatio == null ? -1 : WhenMappings.$EnumSwitchMapping$1[imageRatio.ordinal()];
        if (i12 == -1) {
            ratio = TileScrollBlockVO.TileVO.ImageComponent.SmallTileAdultImageModel.SmallTileModelImage.Ratio.RATIO_1_1;
        } else if (i12 == 1) {
            ratio = TileScrollBlockVO.TileVO.ImageComponent.SmallTileAdultImageModel.SmallTileModelImage.Ratio.RATIO_1_1;
        } else {
            if (i12 != 2) {
                throw new o();
            }
            ratio = TileScrollBlockVO.TileVO.ImageComponent.SmallTileAdultImageModel.SmallTileModelImage.Ratio.RATIO_3_4;
        }
        TileScrollBlockVO.TileVO.ImageComponent.SmallTileAdultImageModel.SmallTileModelImage.Ratio ratio2 = ratio;
        int value = (int) (ratio2.getValue() * singleItemWidth);
        int measure = tileScrollBlockMapper.smallTileHeightMeasurer.measure(arrayList, singleItemWidth);
        HeaderDTO header = dto.getHeader();
        HeaderVO map = header != null ? tileScrollBlockMapper.headerMapper.map(header) : null;
        List<TileScrollBlockDTO.Tile> items2 = dto.getItems();
        ArrayList arrayList2 = new ArrayList(C7714v.z(items2, 10));
        int i13 = 0;
        for (Object obj : items2) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                C7714v.O0();
                throw null;
            }
            TileScrollBlockDTO.Tile tile = (TileScrollBlockDTO.Tile) obj;
            TileScrollBlockDTO.Options options3 = dto.getOptions();
            TileScrollBlockDTO.Options.TileOptions smallTileOptions2 = options3 != null ? options3.getSmallTileOptions() : null;
            int i15 = value;
            arrayList2.add(tileScrollBlockMapper.toVO(tile, blockId2, i13, smallTileOptions2, ratio2, singleItemWidth, i15, Integer.valueOf(measure), dto.getSharedData()));
            tileScrollBlockMapper = this;
            blockId2 = blockId;
            value = i15;
            i13 = i14;
        }
        Map<String, TokenizedTrackingInfo> trackingInfo = dto.getTrackingInfo();
        TileScrollBlockDTO.Options options4 = dto.getOptions();
        String backgroundColor = options4 != null ? options4.getBackgroundColor() : null;
        TileScrollBlockDTO.Options options5 = dto.getOptions();
        if (options5 == null || (testInfo = options5.getTestInfo()) == null || (str = testInfo.getAutomatizationId()) == null) {
            str = "tileScrollBlockContainer";
        }
        return C7714v.a0(new TileScrollBlockVO(blockId, map, arrayList2, backgroundColor, visibleCellsCount2, str, trackingInfo, null, null, UserVerificationMethods.USER_VERIFY_PATTERN, null));
    }
}
