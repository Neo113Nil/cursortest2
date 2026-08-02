package ru.ozon.app.android.product.tiles.tilegrid2.data.mapper;

import Ih.a;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.favorites.common.SelectedProductsManager;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMoleculeV2;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.pdp.common.ugc.data.ugcratingmolecule.UgcRatingMolecule;
import ru.ozon.app.android.product.common.TileThemeConfigVO;
import ru.ozon.app.android.product.common.TileThemeConfigVOKt;
import ru.ozon.app.android.product.molecules.blur.presentation.BlurMoleculeVO;
import ru.ozon.app.android.product.molecules.blur.presentation.BlurMoleculeVOKt;
import ru.ozon.app.android.product.molecules.countbutton.presentation.CountButtonVO;
import ru.ozon.app.android.product.molecules.countbutton.presentation.CountButtonVOKt;
import ru.ozon.app.android.product.tileContentItems.vo.TileContentItem;
import ru.ozon.app.android.product.tileContentItems.vo.TileContentItemKt;
import ru.ozon.app.android.product.tiles.common.FavoriteProductMoleculeV2Mapper;
import ru.ozon.app.android.product.tiles.tilegrid2.domain.wishlist.WishlistTileKey;
import ru.ozon.app.android.product.tiles.tilegrid2.flags.TileGrid2ThinEnabled;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.data.TileGrid2CheckBoxVO;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.data.TileGrid2VO;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.data.TileGrid2VOKt;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.selections.subscriber.SelectionProductsTileKey;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.views.galleryswipeview.data.TileGrid2GalleryModel;
import ru.ozon.app.android.product.tiles.utils.AccessibilityUtilsKt;
import ru.ozon.app.android.storefront.data.tiles.blur.BlurMoleculeContentDTO;
import ru.ozon.app.android.storefront.data.tiles.blur.BlurMoleculeDTO;
import ru.ozon.app.android.storefront.data.tiles.countbutton.CountButtonDTO;
import ru.ozon.app.android.storefront.data.tiles.onboarding.OnboardingModel;
import ru.ozon.app.android.storefront.data.tiles.tilegrid2.MultiButtonDTO;
import ru.ozon.app.android.storefront.data.tiles.tilegrid2.TileGrid2DTO;
import ru.ozon.app.android.storefront.data.tiles.tilegrid2.TileGrid2ItemDTO;
import ru.ozon.app.android.storefront.data.tiles.tilegrid2.toprightbuttons.TopRightButtonCheckBox;
import ru.ozon.app.android.storefront.domain.onboarding.OnboardingFeature;
import ru.ozon.app.android.storefrontcommonwidgets.services.TeensModeService;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 )2\u00020\u0001:\u0001)B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u0004\u0018\u00010\u0017*\u00020\u0011H\u0002J\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u0019*\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0002J\u000e\u0010\u001d\u001a\u00020\u001e*\u0004\u0018\u00010\u001fH\u0002J2\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00010!*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020&H\u0002J\u0014\u0010\u000e\u001a\u00020'*\u00020(2\u0006\u0010%\u001a\u00020&H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lru/ozon/app/android/product/tiles/tilegrid2/data/mapper/TileGrid2ProductMapper;", "", "selectedProductsManager", "Lru/ozon/app/android/favorites/common/SelectedProductsManager;", "galleryModelMapper", "Lru/ozon/app/android/product/tiles/tilegrid2/data/mapper/TileGrid2GalleryModelMapper;", "featureChecker", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "productMoleculeV2Mapper", "Lru/ozon/app/android/product/tiles/common/FavoriteProductMoleculeV2Mapper;", "teensModeService", "Lru/ozon/app/android/storefrontcommonwidgets/services/TeensModeService;", "<init>", "(Lru/ozon/app/android/favorites/common/SelectedProductsManager;Lru/ozon/app/android/product/tiles/tilegrid2/data/mapper/TileGrid2GalleryModelMapper;Lru/ozon/app/android/network/abtool/FeatureChecker;Lru/ozon/app/android/product/tiles/common/FavoriteProductMoleculeV2Mapper;Lru/ozon/app/android/storefrontcommonwidgets/services/TeensModeService;)V", "toVo", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/data/TileGrid2VO;", "item", "Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2ItemDTO;", "index", "", "state", "Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2DTO;", "getBadgeOnboarding", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/data/TileGrid2VO$BadgeOnboardingVO;", "mapKebab", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/data/TileGrid2VO$Kebab;", "Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2ItemDTO$KebabDTO;", "sharedData", "Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2DTO$SharedData;", "defineBadgeRadiusByTheme", "", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO$BadgeSize;", "mapTopRightButtons", "", "isSelected", "", "compactFavoriteIcon", "tileId", "", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/data/TileGrid2CheckBoxVO;", "Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO;", "Companion", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TileGrid2ProductMapper {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final float onboardingBackgroundCornerRadius = UiExtKt.toPxF(8);
    private static final int onboardingBackgroundPadding = ResourceExtKt.toPx(6);

    @NotNull
    private final FeatureChecker featureChecker;

    @NotNull
    private final TileGrid2GalleryModelMapper galleryModelMapper;

    @NotNull
    private final FavoriteProductMoleculeV2Mapper productMoleculeV2Mapper;

    @NotNull
    private final SelectedProductsManager selectedProductsManager;

    @NotNull
    private final TeensModeService teensModeService;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/ozon/app/android/product/tiles/tilegrid2/data/mapper/TileGrid2ProductMapper$Companion;", "", "<init>", "()V", "onboardingBackgroundCornerRadius", "", "onboardingBackgroundPadding", "", "getProductWidgetId", "", "item", "Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2ItemDTO;", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long getProductWidgetId(@NotNull TileGrid2ItemDTO item) {
            Intrinsics.checkNotNullParameter(item, "item");
            return a.a("TileGrid2_", TileGrid2VOKt.getTileId(item));
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BadgeDTO.BadgeSize.values().length];
            try {
                iArr[BadgeDTO.BadgeSize.SIZE_300.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BadgeDTO.BadgeSize.SIZE_400.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BadgeDTO.BadgeSize.SIZE_500.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public TileGrid2ProductMapper(@NotNull SelectedProductsManager selectedProductsManager, @NotNull TileGrid2GalleryModelMapper galleryModelMapper, @NotNull FeatureChecker featureChecker, @NotNull FavoriteProductMoleculeV2Mapper productMoleculeV2Mapper, @NotNull TeensModeService teensModeService) {
        Intrinsics.checkNotNullParameter(selectedProductsManager, "selectedProductsManager");
        Intrinsics.checkNotNullParameter(galleryModelMapper, "galleryModelMapper");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(productMoleculeV2Mapper, "productMoleculeV2Mapper");
        Intrinsics.checkNotNullParameter(teensModeService, "teensModeService");
        this.selectedProductsManager = selectedProductsManager;
        this.galleryModelMapper = galleryModelMapper;
        this.featureChecker = featureChecker;
        this.productMoleculeV2Mapper = productMoleculeV2Mapper;
        this.teensModeService = teensModeService;
    }

    private final float defineBadgeRadiusByTheme(BadgeDTO.BadgeSize badgeSize) {
        int i11 = badgeSize == null ? -1 : WhenMappings.$EnumSwitchMapping$0[badgeSize.ordinal()];
        if (i11 != 2) {
            return i11 != 3 ? 5.0f : 8.0f;
        }
        return 6.0f;
    }

    private final TileGrid2VO.BadgeOnboardingVO getBadgeOnboarding(TileGrid2ItemDTO tileGrid2ItemDTO) {
        TileGrid2ItemDTO.Onboarding onboarding = tileGrid2ItemDTO.getOnboarding();
        if (onboarding == null) {
            return null;
        }
        OnboardingModel badgeOnboarding = onboarding.getBadgeOnboarding();
        String key = OnboardingFeature.TILE_GRID_2_BADGE_ONBOARDING.key(onboarding.getBadgeOnboardingKey());
        BadgeDTO leftBottomBadgeV2 = tileGrid2ItemDTO.getTileImage().getLeftBottomBadgeV2();
        return new TileGrid2VO.BadgeOnboardingVO(badgeOnboarding, key, UiExtKt.toPxF(defineBadgeRadiusByTheme(leftBottomBadgeV2 != null ? leftBottomBadgeV2.getSize() : null)), onboardingBackgroundCornerRadius, onboardingBackgroundPadding);
    }

    private final TileGrid2VO.Kebab mapKebab(TileGrid2ItemDTO.KebabDTO kebabDTO, TileGrid2DTO.SharedData sharedData) {
        CommonAtomIconDTO kebabIcon;
        if (sharedData == null || (kebabIcon = sharedData.getKebabIcon()) == null) {
            return null;
        }
        return new TileGrid2VO.Kebab(kebabIcon, AtomActionMapperKt.toAtomAction(kebabDTO.getAction(), kebabDTO.getTrackingInfo()));
    }

    private final List<Object> mapTopRightButtons(List<? extends Object> list, boolean z11, boolean z12, String str) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof FavoriteProductMoleculeV2) {
                obj = this.productMoleculeV2Mapper.map((FavoriteProductMoleculeV2) obj, z12, this.teensModeService.isTeensModeOn());
            } else if (obj instanceof TopRightButtonCheckBox) {
                obj = TopRightButtonCheckBox.copy$default((TopRightButtonCheckBox) obj, z11, null, 2, null);
            } else if (obj instanceof CheckBoxDTO) {
                obj = toVo((CheckBoxDTO) obj, str);
            }
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00df A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x022e  */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final TileGrid2VO toVo(@NotNull TileGrid2ItemDTO item, int index, @NotNull TileGrid2DTO state) {
        BlurMoleculeVO blurMoleculeVO;
        TileGrid2VO.ButtonMode buttonMode;
        MultiButtonDTO multiButton;
        MultiButtonDTO multiButton2;
        AtomActionDTO atomActionDTO;
        AtomActionDTO expressButtonRecShelfAction;
        List<TileContentItem> mapContentElements;
        List<Object> list;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        TileGrid2GalleryModelMapper tileGrid2GalleryModelMapper;
        Map<String, BlurMoleculeContentDTO> map;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(state, "state");
        TileGrid2DTO.Options options = state.getOptions();
        TileGrid2DTO.SharedData sharedData = state.getSharedData();
        BadgeDTO leftBottomBadgeV2 = item.getTileImage().getLeftBottomBadgeV2();
        BadgeDTO secondLeftBottomBadgeV2 = item.getTileImage().getSecondLeftBottomBadgeV2();
        String tileId = TileGrid2VOKt.getTileId(item);
        long productWidgetId = INSTANCE.getProductWidgetId(item);
        Long y02 = h.y0(tileId);
        boolean isProductAdded = y02 != null ? this.selectedProductsManager.isProductAdded(y02.longValue()) : false;
        TileGrid2GalleryModelMapper tileGrid2GalleryModelMapper2 = this.galleryModelMapper;
        boolean d11 = options != null ? Intrinsics.d(options.getEnableParanja(), Boolean.TRUE) : false;
        BlurMoleculeDTO blurItem = item.getTileImage().getBlurItem();
        if (blurItem != null) {
            if (sharedData != null) {
                tileGrid2GalleryModelMapper = tileGrid2GalleryModelMapper2;
                map = sharedData.getBlurItemInfo();
            } else {
                tileGrid2GalleryModelMapper = tileGrid2GalleryModelMapper2;
                map = null;
            }
            blurMoleculeVO = BlurMoleculeVOKt.toVO$default(blurItem, map, null, 2, null);
            tileGrid2GalleryModelMapper2 = tileGrid2GalleryModelMapper;
            productWidgetId = productWidgetId;
        } else {
            blurMoleculeVO = null;
        }
        TileGrid2GalleryModel buildGalleryModel = tileGrid2GalleryModelMapper2.buildGalleryModel(productWidgetId, item, d11, blurMoleculeVO);
        AtomActionDTO action = item.getAction();
        String link = action != null ? action.getLink() : null;
        if (link == null) {
            link = "";
        }
        Uri parse = Uri.parse(link);
        MultiButtonDTO multiButton3 = item.getMultiButton();
        if ((multiButton3 != null ? multiButton3.getExpressButton() : null) != null) {
            MultiButtonDTO multiButton4 = item.getMultiButton();
            if ((multiButton4 != null ? multiButton4.getOzonButton() : null) != null) {
                buttonMode = TileGrid2VO.ButtonMode.DOUBLE;
                TileGrid2VO.ButtonMode buttonMode2 = buttonMode;
                boolean z15 = (index != 0 || index == 1) && state.getHeader() != null;
                TileGrid2DTO.Options options2 = state.getOptions();
                TileThemeConfigVO tileGrid2ThemeVO = TileThemeConfigVOKt.toTileGrid2ThemeVO(options2 != null ? options2.getTheme() : null, z15);
                multiButton = item.getMultiButton();
                if (multiButton != null || (expressButtonRecShelfAction = multiButton.getOzonButtonRecShelfAction()) == null) {
                    multiButton2 = item.getMultiButton();
                    if (multiButton2 == null) {
                        atomActionDTO = null;
                        List<Object> topRightButtons = item.getTopRightButtons();
                        List<Object> mapTopRightButtons = topRightButtons == null ? mapTopRightButtons(topRightButtons, isProductAdded, tileGrid2ThemeVO.getIsCompactFavIcon(), TileGrid2VOKt.getTileId(item)) : null;
                        List<Object> mainState = item.getMainState();
                        mapContentElements = mainState == null ? TileContentItemKt.mapContentElements(mainState, item.isTextTagSupported()) : null;
                        if (mapContentElements == null) {
                            mapContentElements = K.f71697a;
                        }
                        AtomActionDTO action2 = item.getAction();
                        Map<String, TokenizedTrackingInfo> trackingInfo = item.getTrackingInfo();
                        List<TileContentItem> list2 = mapContentElements;
                        TileGrid2VO.BadgeOnboardingVO badgeOnboarding = getBadgeOnboarding(item);
                        TileGrid2ItemDTO.BrandLogo brandLogo = item.getBrandLogo();
                        String logo = brandLogo == null ? brandLogo.getLogo() : null;
                        TestInfo testInfo = state.getTestInfo();
                        if (options == null) {
                            list = mapTopRightButtons;
                            z11 = Intrinsics.d(options.getBadgesInCorner(), Boolean.TRUE);
                        } else {
                            list = mapTopRightButtons;
                            z11 = false;
                        }
                        String backgroundColor = options == null ? options.getBackgroundColor() : null;
                        String islandBackgroundColor = item.getIslandBackgroundColor();
                        boolean z16 = z11;
                        if (!this.featureChecker.isEnabled(TileGrid2ThinEnabled.INSTANCE) && list != null) {
                            if (list.size() == 1 && (C7714v.M(list) instanceof FavoriteProductMolecule)) {
                                z12 = true;
                                String str = logo;
                                int topOffset = tileGrid2ThemeVO.getTopOffset();
                                long widgetId = TileGrid2MapperKt.getWidgetId(item);
                                TileGrid2ItemDTO.KebabDTO kebab = item.getKebab();
                                TileGrid2VO.Kebab mapKebab = kebab != null ? mapKebab(kebab, sharedData) : null;
                                TileGrid2DTO.OverlayItem overlayItem = sharedData != null ? sharedData.getOverlayItem() : null;
                                WishlistTileKey mapToWishlistKey = TileGrid2MapperKt.mapToWishlistKey(item);
                                SelectionProductsTileKey mapToSelectionKey = TileGrid2MapperKt.mapToSelectionKey(item);
                                UgcRatingMolecule rating = item.getRating();
                                CountButtonDTO countButton = item.getCountButton();
                                CountButtonVO vo = countButton != null ? CountButtonVOKt.toVo(countButton, TileGrid2VOKt.getTileId(item), productWidgetId) : null;
                                String str2 = backgroundColor;
                                String accesibilityTileID = AccessibilityUtilsKt.toAccesibilityTileID(productWidgetId);
                                if (list != null) {
                                    List<Object> list3 = list;
                                    if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                                        Iterator<T> it = list3.iterator();
                                        while (it.hasNext()) {
                                            if (it.next() instanceof TileGrid2CheckBoxVO) {
                                                z14 = true;
                                                break;
                                            }
                                        }
                                    }
                                    z14 = false;
                                    z13 = z14;
                                } else {
                                    z13 = false;
                                }
                                Boolean topRightButtonsAnimationEnabled = item.getTopRightButtonsAnimationEnabled();
                                TileGrid2VO tileGrid2VO = new TileGrid2VO(productWidgetId, accesibilityTileID, tileId, buildGalleryModel, leftBottomBadgeV2, secondLeftBottomBadgeV2, list, list2, action2, trackingInfo, badgeOnboarding, str, testInfo, str2, islandBackgroundColor, z16, z12, buttonMode2, index, topOffset, atomActionDTO, mapToWishlistKey, mapToSelectionKey, widgetId, mapKebab, overlayItem, rating, vo, tileGrid2ThemeVO, z13, topRightButtonsAnimationEnabled != null ? topRightButtonsAnimationEnabled.booleanValue() : false);
                                tileGrid2VO.setScrollWidgetKey(("TileGrid2" + parse.getAuthority() + parse.getPath()).hashCode());
                                return tileGrid2VO;
                            }
                        }
                        z12 = false;
                        String str3 = logo;
                        int topOffset2 = tileGrid2ThemeVO.getTopOffset();
                        long widgetId2 = TileGrid2MapperKt.getWidgetId(item);
                        TileGrid2ItemDTO.KebabDTO kebab2 = item.getKebab();
                        if (kebab2 != null) {
                        }
                        if (sharedData != null) {
                        }
                        WishlistTileKey mapToWishlistKey2 = TileGrid2MapperKt.mapToWishlistKey(item);
                        SelectionProductsTileKey mapToSelectionKey2 = TileGrid2MapperKt.mapToSelectionKey(item);
                        UgcRatingMolecule rating2 = item.getRating();
                        CountButtonDTO countButton2 = item.getCountButton();
                        if (countButton2 != null) {
                        }
                        String str22 = backgroundColor;
                        String accesibilityTileID2 = AccessibilityUtilsKt.toAccesibilityTileID(productWidgetId);
                        if (list != null) {
                        }
                        Boolean topRightButtonsAnimationEnabled2 = item.getTopRightButtonsAnimationEnabled();
                        TileGrid2VO tileGrid2VO2 = new TileGrid2VO(productWidgetId, accesibilityTileID2, tileId, buildGalleryModel, leftBottomBadgeV2, secondLeftBottomBadgeV2, list, list2, action2, trackingInfo, badgeOnboarding, str3, testInfo, str22, islandBackgroundColor, z16, z12, buttonMode2, index, topOffset2, atomActionDTO, mapToWishlistKey2, mapToSelectionKey2, widgetId2, mapKebab, overlayItem, rating2, vo, tileGrid2ThemeVO, z13, topRightButtonsAnimationEnabled2 != null ? topRightButtonsAnimationEnabled2.booleanValue() : false);
                        tileGrid2VO2.setScrollWidgetKey(("TileGrid2" + parse.getAuthority() + parse.getPath()).hashCode());
                        return tileGrid2VO2;
                    }
                    expressButtonRecShelfAction = multiButton2.getExpressButtonRecShelfAction();
                }
                atomActionDTO = expressButtonRecShelfAction;
                List<Object> topRightButtons2 = item.getTopRightButtons();
                if (topRightButtons2 == null) {
                }
                List<Object> mainState2 = item.getMainState();
                if (mainState2 == null) {
                }
                if (mapContentElements == null) {
                }
                AtomActionDTO action22 = item.getAction();
                Map<String, TokenizedTrackingInfo> trackingInfo2 = item.getTrackingInfo();
                List<TileContentItem> list22 = mapContentElements;
                TileGrid2VO.BadgeOnboardingVO badgeOnboarding2 = getBadgeOnboarding(item);
                TileGrid2ItemDTO.BrandLogo brandLogo2 = item.getBrandLogo();
                if (brandLogo2 == null) {
                }
                TestInfo testInfo2 = state.getTestInfo();
                if (options == null) {
                }
                if (options == null) {
                }
                String islandBackgroundColor2 = item.getIslandBackgroundColor();
                boolean z162 = z11;
                if (!this.featureChecker.isEnabled(TileGrid2ThinEnabled.INSTANCE)) {
                }
                z12 = false;
                String str32 = logo;
                int topOffset22 = tileGrid2ThemeVO.getTopOffset();
                long widgetId22 = TileGrid2MapperKt.getWidgetId(item);
                TileGrid2ItemDTO.KebabDTO kebab22 = item.getKebab();
                if (kebab22 != null) {
                }
                if (sharedData != null) {
                }
                WishlistTileKey mapToWishlistKey22 = TileGrid2MapperKt.mapToWishlistKey(item);
                SelectionProductsTileKey mapToSelectionKey22 = TileGrid2MapperKt.mapToSelectionKey(item);
                UgcRatingMolecule rating22 = item.getRating();
                CountButtonDTO countButton22 = item.getCountButton();
                if (countButton22 != null) {
                }
                String str222 = backgroundColor;
                String accesibilityTileID22 = AccessibilityUtilsKt.toAccesibilityTileID(productWidgetId);
                if (list != null) {
                }
                Boolean topRightButtonsAnimationEnabled22 = item.getTopRightButtonsAnimationEnabled();
                TileGrid2VO tileGrid2VO22 = new TileGrid2VO(productWidgetId, accesibilityTileID22, tileId, buildGalleryModel, leftBottomBadgeV2, secondLeftBottomBadgeV2, list, list22, action22, trackingInfo2, badgeOnboarding2, str32, testInfo2, str222, islandBackgroundColor2, z162, z12, buttonMode2, index, topOffset22, atomActionDTO, mapToWishlistKey22, mapToSelectionKey22, widgetId22, mapKebab, overlayItem, rating22, vo, tileGrid2ThemeVO, z13, topRightButtonsAnimationEnabled22 != null ? topRightButtonsAnimationEnabled22.booleanValue() : false);
                tileGrid2VO22.setScrollWidgetKey(("TileGrid2" + parse.getAuthority() + parse.getPath()).hashCode());
                return tileGrid2VO22;
            }
        }
        MultiButtonDTO multiButton5 = item.getMultiButton();
        if ((multiButton5 != null ? multiButton5.getExpressButton() : null) == null) {
            MultiButtonDTO multiButton6 = item.getMultiButton();
            if ((multiButton6 != null ? multiButton6.getOzonButton() : null) == null) {
                buttonMode = TileGrid2VO.ButtonMode.NONE;
                TileGrid2VO.ButtonMode buttonMode22 = buttonMode;
                if (index != 0) {
                }
                TileGrid2DTO.Options options22 = state.getOptions();
                TileThemeConfigVO tileGrid2ThemeVO2 = TileThemeConfigVOKt.toTileGrid2ThemeVO(options22 != null ? options22.getTheme() : null, z15);
                multiButton = item.getMultiButton();
                if (multiButton != null) {
                }
                multiButton2 = item.getMultiButton();
                if (multiButton2 == null) {
                }
            }
        }
        buttonMode = TileGrid2VO.ButtonMode.SINGLE;
        TileGrid2VO.ButtonMode buttonMode222 = buttonMode;
        if (index != 0) {
        }
        TileGrid2DTO.Options options222 = state.getOptions();
        TileThemeConfigVO tileGrid2ThemeVO22 = TileThemeConfigVOKt.toTileGrid2ThemeVO(options222 != null ? options222.getTheme() : null, z15);
        multiButton = item.getMultiButton();
        if (multiButton != null) {
        }
        multiButton2 = item.getMultiButton();
        if (multiButton2 == null) {
        }
    }

    private final TileGrid2CheckBoxVO toVo(CheckBoxDTO checkBoxDTO, String str) {
        return new TileGrid2CheckBoxVO(checkBoxDTO, str);
    }
}
