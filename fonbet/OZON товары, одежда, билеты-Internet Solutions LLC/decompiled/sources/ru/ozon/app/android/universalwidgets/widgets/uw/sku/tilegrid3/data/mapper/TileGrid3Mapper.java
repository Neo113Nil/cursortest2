package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilegrid3.data.mapper;

import android.content.Context;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.product.common.TileThemeConfigVOKt;
import ru.ozon.app.android.storefront.data.tiles.common.ContentModeKt;
import ru.ozon.app.android.storefront.data.tiles.smalltile.SmallTileMoleculeDTO;
import ru.ozon.app.android.storefrontcommonwidgets.di.component.StorefrontCommonComponentApi;
import ru.ozon.app.android.storefrontcommonwidgets.services.TeensModeService;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.mapper.SmallTileMapperKt;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.mapper.SmallTileMoleculeMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.vo.SmallTileModelImage;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.vo.SmallTileMoleculeVO;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilegrid3.data.dto.TileGrid3DTO;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilegrid3.presentation.data.TileGrid3VO;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilegrid3.presentation.decorator.TileGrid3Decorator;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.TestInfo;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002`\u0005B\u0019\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJW\u0010\u001d\u001a\u00020\u001c*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ*\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00022\n\u0010!\u001a\u00060\u0003j\u0002` H\u0096\u0002¢\u0006\u0004\b\"\u0010#J%\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u00042\u0006\u0010%\u001a\u00020$2\b\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b)\u0010*R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010/\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00061"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilegrid3/data/mapper/TileGrid3Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilegrid3/presentation/data/TileGrid3VO;", "Ll20/d;", "", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/mapper/SmallTileMoleculeMapper;", "smallTileMoleculeMapper", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/mapper/SmallTileMoleculeMapper;)V", "Lru/ozon/app/android/storefront/data/tiles/smalltile/SmallTileMoleculeDTO;", "", "widgetId", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/vo/SmallTileMoleculeVO$SmallTileImageOptions;", "smallTileImageOptions", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/vo/SmallTileModelImage$Ratio;", "ratio", "", "widthImage", "heightImage", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilegrid3/data/dto/TileGrid3DTO$SharedData;", "sharedData", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilegrid3/data/dto/TileGrid3DTO$Options;", "options", "", "hasHeader", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/vo/SmallTileMoleculeVO;", "mapTile", "(Lru/ozon/app/android/storefront/data/tiles/smalltile/SmallTileMoleculeDTO;JLru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/vo/SmallTileMoleculeVO$SmallTileImageOptions;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/vo/SmallTileModelImage$Ratio;IILru/ozon/app/android/universalwidgets/widgets/uw/sku/tilegrid3/data/dto/TileGrid3DTO$SharedData;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilegrid3/data/dto/TileGrid3DTO$Options;Z)Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/vo/SmallTileMoleculeVO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilegrid3/presentation/data/TileGrid3VO;Ll20/d;)Ljava/util/List;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilegrid3/data/dto/TileGrid3DTO;", "model", "", "stateId", "", "map", "(Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilegrid3/data/dto/TileGrid3DTO;Ljava/lang/String;)Ljava/util/List;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/mapper/SmallTileMoleculeMapper;", "Lru/ozon/app/android/storefrontcommonwidgets/services/TeensModeService;", "teensModeService", "Lru/ozon/app/android/storefrontcommonwidgets/services/TeensModeService;", "width", "I", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TileGrid3Mapper implements Function2<TileGrid3VO, d, List<? extends TileGrid3VO>> {

    @NotNull
    private final SmallTileMoleculeMapper smallTileMoleculeMapper;

    @NotNull
    private final TeensModeService teensModeService;
    private final int width;

    public TileGrid3Mapper(@NotNull Context context, @NotNull SmallTileMoleculeMapper smallTileMoleculeMapper) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(smallTileMoleculeMapper, "smallTileMoleculeMapper");
        this.smallTileMoleculeMapper = smallTileMoleculeMapper;
        if (StorefrontCommonComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component StorefrontCommonComponentApi is not DiComponent");
        }
        C6740b dependencyStorage = C6739a.a(context, StorefrontCommonComponentApi.class).getDependencyStorage();
        if (StorefrontCommonComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component StorefrontCommonComponentApi is not DiComponent");
        }
        this.teensModeService = ((StorefrontCommonComponentApi) dependencyStorage.b(StorefrontCommonComponentApi.class)).getTeensModeService();
        this.width = context.getResources().getDisplayMetrics().widthPixels;
    }

    private final SmallTileMoleculeVO mapTile(SmallTileMoleculeDTO smallTileMoleculeDTO, long j11, SmallTileMoleculeVO.SmallTileImageOptions smallTileImageOptions, SmallTileModelImage.Ratio ratio, int i11, int i12, TileGrid3DTO.SharedData sharedData, TileGrid3DTO.Options options, boolean z11) {
        long hashCode = smallTileMoleculeDTO.hashCode();
        return this.smallTileMoleculeMapper.map(smallTileMoleculeDTO, hashCode, hashCode, String.valueOf(j11), null, i11, i12, ratio, smallTileImageOptions, sharedData != null ? sharedData.getBlurItemInfo() : null, TileThemeConfigVOKt.toTileGrid3ThemeVO(options != null ? options.getTheme() : null, z11), this.teensModeService.isTeensModeOn());
    }

    @NotNull
    public final List<Object> map(@NotNull TileGrid3DTO model, String stateId) {
        Intrinsics.checkNotNullParameter(model, "model");
        long hashCode = stateId != null ? stateId.hashCode() : 0;
        TileGrid3Mapper tileGrid3Mapper = this;
        int itemOffset = (tileGrid3Mapper.width - (TileGrid3Decorator.INSTANCE.getItemOffset() * 2)) / 3;
        TileGrid3DTO.Options options = model.getOptions();
        SmallTileMoleculeDTO.SmallTileOptions smallTileOptions = options != null ? options.getSmallTileOptions() : null;
        SmallTileModelImage.Ratio mapRatio = SmallTileMapperKt.mapRatio(smallTileOptions != null ? smallTileOptions.getImageRatio() : null);
        int value = (int) (mapRatio.getValue() * itemOffset);
        List<SmallTileMoleculeDTO> items = model.getItems();
        ArrayList arrayList = new ArrayList(C7714v.z(items, 10));
        for (SmallTileMoleculeDTO smallTileMoleculeDTO : items) {
            ArrayList arrayList2 = arrayList;
            SmallTileMoleculeVO.SmallTileImageOptions smallTileImageOptions = new SmallTileMoleculeVO.SmallTileImageOptions(smallTileOptions != null && smallTileOptions.isCompactFavoriteIcon(), smallTileOptions != null && smallTileOptions.getEnableParanja(), ContentModeKt.mapScaleType(smallTileMoleculeDTO.getImageComponent().getImageItem().getContentMode()));
            TileGrid3DTO.Options options2 = model.getOptions();
            String backgroundColor = options2 != null ? options2.getBackgroundColor() : null;
            SmallTileMoleculeVO mapTile = tileGrid3Mapper.mapTile(smallTileMoleculeDTO, hashCode, smallTileImageOptions, mapRatio, itemOffset, value, model.getSharedData(), model.getOptions(), model.getHeader() != null);
            long id2 = mapTile.getId();
            AtomAction action = mapTile.getAction();
            TileGrid3DTO.Options options3 = model.getOptions();
            TestInfo testInfo = options3 != null ? options3.getTestInfo() : null;
            Map<String, TokenizedTrackingInfo> trackingInfo = model.getTrackingInfo();
            arrayList2.add(new TileGrid3VO(id2, action, mapTile, trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null, backgroundColor, testInfo));
            tileGrid3Mapper = this;
            arrayList = arrayList2;
        }
        return arrayList;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<TileGrid3VO> invoke(@NotNull TileGrid3VO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(state);
    }
}
