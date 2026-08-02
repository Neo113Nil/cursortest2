package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilescroll.ui.mapper;

import Pc.a;
import Sc.o;
import WZ.t;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.product.common.TileThemeConfigVO;
import ru.ozon.app.android.product.common.TileThemeConfigVOKt;
import ru.ozon.app.android.product.tileContentItems.vo.TileContentItemKt;
import ru.ozon.app.android.storefront.data.tiles.addtocart.AddToCartButtonDTO;
import ru.ozon.app.android.storefront.data.tiles.common.ContentModeKt;
import ru.ozon.app.android.storefront.data.tiles.smalltile.SmallTileMoleculeDTO;
import ru.ozon.app.android.storefront.data.tiles.tilescroll.TileScrollDTO;
import ru.ozon.app.android.storefrontcommonwidgets.services.TeensModeService;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.SmallTileAsyncStateMeasurer;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.mapper.SmallTileMapperKt;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.mapper.SmallTileMoleculeMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.vo.SmallTileModelImage;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.vo.SmallTileMoleculeVO;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilescroll.data.TileScrollVO;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilescroll.data.TileWidthConfig;
import ru.ozon.app.android.universalwidgets.widgets.uw.utils.GradientUtilsKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.image.CornerRadius;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 F2\u00020\u0001:\u0001FB5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0013\u001a\u00020\u0012*\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0013\u001a\u00020\u0016*\u00020\u0015H\u0002¢\u0006\u0004\b\u0013\u0010\u0017Jg\u0010)\u001a\u00020(*\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001b2\u000e\u0010#\u001a\n\u0018\u00010!j\u0004\u0018\u0001`\"2\b\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b)\u0010*J\u0013\u0010-\u001a\u00020,*\u00020+H\u0002¢\u0006\u0004\b-\u0010.J\u0015\u00101\u001a\u000200*\u0004\u0018\u00010/H\u0002¢\u0006\u0004\b1\u00102J\u001f\u00106\u001a\u000205*\u0004\u0018\u0001032\b\u00104\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b6\u00107J'\u0010?\u001a\b\u0012\u0004\u0012\u00020>0=2\u0006\u00109\u001a\u0002082\n\u0010<\u001a\u00060:j\u0002`;¢\u0006\u0004\b?\u0010@R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010AR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010BR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010CR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010DR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010E¨\u0006G"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/ui/mapper/TileScrollMapper;", "", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/SmallTileAsyncStateMeasurer;", "smallTileHeightMeasurer", "LPc/a;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/ui/mapper/TileScrollItemMeasureWidthHelper;", "tileScrollItemMeasureWidthHelper", "Landroid/content/Context;", "context", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/mapper/SmallTileMoleculeMapper;", "smallTileMoleculeMapper", "Lru/ozon/app/android/storefrontcommonwidgets/services/TeensModeService;", "teensModeService", "<init>", "(Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/SmallTileAsyncStateMeasurer;LPc/a;Landroid/content/Context;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/mapper/SmallTileMoleculeMapper;Lru/ozon/app/android/storefrontcommonwidgets/services/TeensModeService;)V", "Lru/ozon/app/android/storefront/data/tiles/tilescroll/TileScrollDTO$Banner;", "", "widgetId", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/data/TileScrollVO$ItemVO$BannerVO;", "toVO", "(Lru/ozon/app/android/storefront/data/tiles/tilescroll/TileScrollDTO$Banner;JLandroid/content/Context;)Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/data/TileScrollVO$ItemVO$BannerVO;", "Lru/ozon/app/android/storefront/data/tiles/tilescroll/TileScrollDTO$AllProductsButton;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/data/TileScrollVO$ItemVO$TrailedActionVO;", "(Lru/ozon/app/android/storefront/data/tiles/tilescroll/TileScrollDTO$AllProductsButton;)Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/data/TileScrollVO$ItemVO$TrailedActionVO;", "Lru/ozon/app/android/storefront/data/tiles/smalltile/SmallTileMoleculeDTO;", "Lru/ozon/app/android/storefront/data/tiles/smalltile/SmallTileMoleculeDTO$SmallTileOptions;", "smallTileOptions", "", "stateHeight", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/vo/SmallTileModelImage$Ratio;", "ratio", "widthImage", "heightImage", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "Lru/ozon/app/android/storefront/data/tiles/tilescroll/TileScrollDTO$SharedData;", "sharedData", "Lru/ozon/app/android/product/common/TileThemeConfigVO;", "themeVO", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/data/TileScrollVO$ItemVO$TileVO;", "mapToTileVO", "(Lru/ozon/app/android/storefront/data/tiles/smalltile/SmallTileMoleculeDTO;JLru/ozon/app/android/storefront/data/tiles/smalltile/SmallTileMoleculeDTO$SmallTileOptions;ILru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/vo/SmallTileModelImage$Ratio;IILWZ/t;Lru/ozon/app/android/storefront/data/tiles/tilescroll/TileScrollDTO$SharedData;Lru/ozon/app/android/product/common/TileThemeConfigVO;)Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/data/TileScrollVO$ItemVO$TileVO;", "Lru/ozon/uni/atoms/data/AtomDTO;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/data/TileScrollVO$ItemVO$BannerVO$BottomBannerItem;", "mapBannerItemToVO", "(Lru/ozon/uni/atoms/data/AtomDTO;)Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/data/TileScrollVO$ItemVO$BannerVO$BottomBannerItem;", "Lru/ozon/app/android/storefront/data/tiles/tilescroll/TileScrollDTO$Banner$Gradient$GradientDirection;", "Landroid/graphics/drawable/GradientDrawable$Orientation;", "mapGradient", "(Lru/ozon/app/android/storefront/data/tiles/tilescroll/TileScrollDTO$Banner$Gradient$GradientDirection;)Landroid/graphics/drawable/GradientDrawable$Orientation;", "Lru/ozon/app/android/storefront/data/tiles/tilescroll/TileScrollDTO$Options$VisibleCellsCount;", "banner", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/data/TileWidthConfig;", "mapWidthConfig", "(Lru/ozon/app/android/storefront/data/tiles/tilescroll/TileScrollDTO$Options$VisibleCellsCount;Lru/ozon/app/android/storefront/data/tiles/tilescroll/TileScrollDTO$Banner;)Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/data/TileWidthConfig;", "Lru/ozon/app/android/storefront/data/tiles/tilescroll/TileScrollDTO;", "model", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/data/TileScrollVO;", "map", "(Lru/ozon/app/android/storefront/data/tiles/tilescroll/TileScrollDTO;Ll20/d;)Ljava/util/List;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/SmallTileAsyncStateMeasurer;", "LPc/a;", "Landroid/content/Context;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/mapper/SmallTileMoleculeMapper;", "Lru/ozon/app/android/storefrontcommonwidgets/services/TeensModeService;", "Companion", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TileScrollMapper {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final Context context;

    @NotNull
    private final SmallTileAsyncStateMeasurer smallTileHeightMeasurer;

    @NotNull
    private final SmallTileMoleculeMapper smallTileMoleculeMapper;

    @NotNull
    private final TeensModeService teensModeService;

    @NotNull
    private final a<TileScrollItemMeasureWidthHelper> tileScrollItemMeasureWidthHelper;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/ui/mapper/TileScrollMapper$Companion;", "", "<init>", "()V", "WIDTH_COUNT_3_5", "", "WIDTH_COUNT_2_4", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TileScrollDTO.Options.VisibleCellsCount.values().length];
            try {
                iArr[TileScrollDTO.Options.VisibleCellsCount.COUNT_3_5.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TileScrollDTO.Options.VisibleCellsCount.COUNT_2_4.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public TileScrollMapper(@NotNull SmallTileAsyncStateMeasurer smallTileHeightMeasurer, @NotNull a<TileScrollItemMeasureWidthHelper> tileScrollItemMeasureWidthHelper, @NotNull Context context, @NotNull SmallTileMoleculeMapper smallTileMoleculeMapper, @NotNull TeensModeService teensModeService) {
        Intrinsics.checkNotNullParameter(smallTileHeightMeasurer, "smallTileHeightMeasurer");
        Intrinsics.checkNotNullParameter(tileScrollItemMeasureWidthHelper, "tileScrollItemMeasureWidthHelper");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(smallTileMoleculeMapper, "smallTileMoleculeMapper");
        Intrinsics.checkNotNullParameter(teensModeService, "teensModeService");
        this.smallTileHeightMeasurer = smallTileHeightMeasurer;
        this.tileScrollItemMeasureWidthHelper = tileScrollItemMeasureWidthHelper;
        this.context = context;
        this.smallTileMoleculeMapper = smallTileMoleculeMapper;
        this.teensModeService = teensModeService;
    }

    private final TileScrollVO.ItemVO.BannerVO.BottomBannerItem mapBannerItemToVO(AtomDTO atomDTO) {
        if (atomDTO instanceof ButtonV3DTO) {
            return new TileScrollVO.ItemVO.BannerVO.BottomBannerItem.Button((ButtonV3DTO) atomDTO);
        }
        if (atomDTO instanceof ImageDTO) {
            return new TileScrollVO.ItemVO.BannerVO.BottomBannerItem.Image((ImageDTO) atomDTO);
        }
        throw new IllegalArgumentException("unsupported banner item type");
    }

    private final GradientDrawable.Orientation mapGradient(TileScrollDTO.Banner.Gradient.GradientDirection gradientDirection) {
        return gradientDirection == TileScrollDTO.Banner.Gradient.GradientDirection.BOTTOM_TOP ? GradientDrawable.Orientation.BOTTOM_TOP : GradientDrawable.Orientation.TOP_BOTTOM;
    }

    private final TileScrollVO.ItemVO.TileVO mapToTileVO(SmallTileMoleculeDTO smallTileMoleculeDTO, long j11, SmallTileMoleculeDTO.SmallTileOptions smallTileOptions, int i11, SmallTileModelImage.Ratio ratio, int i12, int i13, t tVar, TileScrollDTO.SharedData sharedData, TileThemeConfigVO tileThemeConfigVO) {
        SmallTileMoleculeVO.SmallTileImageOptions smallTileImageOptions = new SmallTileMoleculeVO.SmallTileImageOptions(smallTileOptions != null && smallTileOptions.isCompactFavoriteIcon(), smallTileOptions != null && smallTileOptions.getEnableParanja(), ContentModeKt.mapScaleType(smallTileMoleculeDTO.getImageComponent().getImageItem().getContentMode()));
        List<Object> mainState = smallTileMoleculeDTO.getMainState();
        int hashCode = mainState != null ? mainState.hashCode() : 0;
        AddToCartButtonDTO addToCartButton = smallTileMoleculeDTO.getAddToCartButton();
        long hashCode2 = Integer.hashCode((i12 + "+" + i13 + "+" + ratio).hashCode() + smallTileImageOptions.hashCode() + smallTileMoleculeDTO.getImageComponent().hashCode() + hashCode + (addToCartButton != null ? addToCartButton.hashCode() : 0));
        return new TileScrollVO.ItemVO.TileVO(hashCode2, this.smallTileMoleculeMapper.map(smallTileMoleculeDTO, hashCode2, j11, String.valueOf(j11), Integer.valueOf(i11), i12, i13, ratio, smallTileImageOptions, sharedData != null ? sharedData.getBlurItemInfo() : null, tileThemeConfigVO, this.teensModeService.isTeensModeOn()), tVar);
    }

    private final TileWidthConfig mapWidthConfig(TileScrollDTO.Options.VisibleCellsCount visibleCellsCount, TileScrollDTO.Banner banner) {
        float f7;
        if (banner != null) {
            return TileWidthConfig.Banner.INSTANCE;
        }
        if (visibleCellsCount == null) {
            visibleCellsCount = TileScrollDTO.Options.VisibleCellsCount.COUNT_3_5;
        }
        int i11 = WhenMappings.$EnumSwitchMapping$0[visibleCellsCount.ordinal()];
        if (i11 == 1) {
            f7 = 3.5f;
        } else {
            if (i11 != 2) {
                throw new o();
            }
            f7 = 2.4f;
        }
        return new TileWidthConfig.Default(f7);
    }

    private final TileScrollVO.ItemVO.BannerVO toVO(TileScrollDTO.Banner banner, long j11, Context context) {
        TileScrollDTO.Banner.Gradient gradient = banner.getGradient();
        GradientDrawable.Orientation mapGradient = mapGradient(gradient != null ? gradient.getDirection() : null);
        long hashCode = banner.hashCode();
        ImageDTO bannerImage = banner.getBannerImage();
        AtomAction atomAction = AtomActionMapperKt.toAtomAction(banner.getAction(), banner.getTrackingInfo());
        CornerRadius cornerRadius = banner.getBannerImage().getCornerRadius();
        Float valueOf = cornerRadius != null ? Float.valueOf(ResourceExtKt.toPxF(cornerRadius.getPx())) : null;
        TextDTO topTextAtom = banner.getTopTextAtom();
        TileScrollVO.ItemVO.BannerVO.BottomBannerItem mapBannerItemToVO = mapBannerItemToVO(banner.getBottomBannerItem());
        TileScrollDTO.Banner.Gradient gradient2 = banner.getGradient();
        TileScrollVO.ItemVO.BannerVO.GradientModelVO gradientModelVO = gradient2 != null ? new TileScrollVO.ItemVO.BannerVO.GradientModelVO(GradientUtilsKt.mapGradientToVO(gradient2.getGradientToken(), context), mapGradient) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = banner.getTrackingInfo();
        return new TileScrollVO.ItemVO.BannerVO(hashCode, bannerImage, atomAction, valueOf, topTextAtom, mapBannerItemToVO, gradientModelVO, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null);
    }

    @NotNull
    public final List<TileScrollVO> map(@NotNull TileScrollDTO model, @NotNull d info) {
        TileScrollDTO model2 = model;
        Intrinsics.checkNotNullParameter(model2, "model");
        Intrinsics.checkNotNullParameter(info, "info");
        String c11 = info.c().c();
        long hashCode = c11 != null ? c11.hashCode() : 0;
        TileScrollItemMeasureWidthHelper tileScrollItemMeasureWidthHelper = this.tileScrollItemMeasureWidthHelper.get();
        TileScrollDTO.Options options = model2.getOptions();
        int singleItemWidth = tileScrollItemMeasureWidthHelper.getSingleItemWidth(mapWidthConfig(options != null ? options.getVisibleCellsCount() : null, model2.getBanner()));
        int numberVisibleItems = tileScrollItemMeasureWidthHelper.getNumberVisibleItems(singleItemWidth);
        int size = model2.getItems().size();
        int i11 = numberVisibleItems > size ? size : numberVisibleItems;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        TileScrollDTO.Banner banner = model2.getBanner();
        if (banner != null) {
            arrayList2.add(toVO(banner, hashCode, this.context));
        }
        List<SmallTileMoleculeDTO> items = model2.getItems();
        ArrayList arrayList3 = new ArrayList(C7714v.z(items, 10));
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            List<Object> mainState = ((SmallTileMoleculeDTO) it.next()).getMainState();
            arrayList3.add(mainState != null ? TileContentItemKt.mapContentElements$default(mainState, null, 1, null) : null);
        }
        int measure = this.smallTileHeightMeasurer.measure(arrayList3, singleItemWidth);
        TileScrollDTO.Options options2 = model2.getOptions();
        SmallTileMoleculeDTO.SmallTileOptions smallTileOptions = options2 != null ? options2.getSmallTileOptions() : null;
        SmallTileModelImage.Ratio mapRatio = SmallTileMapperKt.mapRatio(smallTileOptions != null ? smallTileOptions.getImageRatio() : null);
        int value = (int) (mapRatio.getValue() * singleItemWidth);
        Map<String, TokenizedTrackingInfo> trackingInfo = model2.getTrackingInfo();
        t mapToTokenizedEvent$default = trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null;
        TileScrollDTO.Options options3 = model2.getOptions();
        TileThemeConfigVO tileScrollThemeVO = TileThemeConfigVOKt.toTileScrollThemeVO(options3 != null ? options3.getTheme() : null);
        List<SmallTileMoleculeDTO> items2 = model2.getItems();
        ArrayList arrayList4 = new ArrayList(C7714v.z(items2, 10));
        for (SmallTileMoleculeDTO smallTileMoleculeDTO : items2) {
            TileScrollDTO.SharedData sharedData = model2.getSharedData();
            int i12 = value;
            t tVar = mapToTokenizedEvent$default;
            SmallTileModelImage.Ratio ratio = mapRatio;
            ArrayList arrayList5 = arrayList2;
            TileScrollVO.ItemVO.TileVO mapToTileVO = mapToTileVO(smallTileMoleculeDTO, hashCode, smallTileOptions, measure, ratio, singleItemWidth, i12, tVar, sharedData, tileScrollThemeVO);
            if (arrayList.size() < i11) {
                arrayList.add(mapToTileVO.getModel().getImageComponent().getImageModel().getImage());
            }
            arrayList4.add(mapToTileVO);
            mapRatio = ratio;
            mapToTokenizedEvent$default = tVar;
            value = i12;
            arrayList2 = arrayList5;
            model2 = model;
        }
        ArrayList arrayList6 = arrayList2;
        arrayList6.addAll(arrayList4);
        TileScrollDTO.AllProductsButton allProductsButton = model.getAllProductsButton();
        if (allProductsButton != null) {
            arrayList6.add(toVO(allProductsButton));
        }
        TileScrollDTO.Options options4 = model.getOptions();
        String backgroundColor = options4 != null ? options4.getBackgroundColor() : null;
        TileScrollDTO.Options options5 = model.getOptions();
        return C7714v.a0(new TileScrollVO(hashCode, arrayList6, arrayList, backgroundColor, options5 != null ? options5.getTestInfo() : null, tileScrollThemeVO, null, false, UserVerificationMethods.USER_VERIFY_PATTERN, null));
    }

    private final TileScrollVO.ItemVO.TrailedActionVO toVO(TileScrollDTO.AllProductsButton allProductsButton) {
        AtomActionDTO action;
        long hashCode = allProductsButton.hashCode();
        IconButtonV3DTO iconButton = allProductsButton.getIconButton();
        CommonControlSettings common = allProductsButton.getIconButton().getCommon();
        return new TileScrollVO.ItemVO.TrailedActionVO(hashCode, iconButton, allProductsButton.getTextAtom(), (common == null || (action = common.getAction()) == null) ? null : AtomActionMapperKt.toAtomAction(action, allProductsButton.getIconButton().getTrackingInfo()));
    }
}
