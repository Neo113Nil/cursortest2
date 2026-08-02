package ru.ozon.app.android.storefront.widgets.cms.richPromoScroll.core;

import java.util.ArrayList;
import java.util.Iterator;
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
import ru.ozon.app.android.storefront.widgets.cms.richPromoScroll.data.RichPromoScrollDTO;
import ru.ozon.app.android.storefront.widgets.cms.richPromoScroll.presentation.RichPromoScrollVO;
import ru.ozon.app.android.storefront.widgets.cms.richPromoScroll.presentation.catalogTile.view.CatalogTile;
import ru.ozon.app.android.storefront.widgets.cms.richPromoScroll.presentation.catalogTile.view.CatalogTileScrollVO;
import ru.ozon.app.android.storefront.widgets.cms.richPromoScroll.presentation.catalogTile.view.SpacersVO;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\r\u001a\u00020\f*\u00020\t2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\r\u001a\u00020\u0010*\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u0011J&\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/storefront/widgets/cms/richPromoScroll/core/RichPromoScrollMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/storefront/widgets/cms/richPromoScroll/data/RichPromoScrollDTO;", "Ll20/d;", "", "Lru/ozon/app/android/storefront/widgets/cms/richPromoScroll/presentation/RichPromoScrollVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/storefront/widgets/cms/richPromoScroll/data/RichPromoScrollDTO$CatalogTileScrollDTO;", "", "widgetId", "Lru/ozon/app/android/storefront/widgets/cms/richPromoScroll/presentation/catalogTile/view/CatalogTileScrollVO;", "toVO", "(Lru/ozon/app/android/storefront/widgets/cms/richPromoScroll/data/RichPromoScrollDTO$CatalogTileScrollDTO;J)Lru/ozon/app/android/storefront/widgets/cms/richPromoScroll/presentation/catalogTile/view/CatalogTileScrollVO;", "Lru/ozon/app/android/storefront/widgets/cms/richPromoScroll/data/RichPromoScrollDTO$TileItem;", "Lru/ozon/app/android/storefront/widgets/cms/richPromoScroll/presentation/catalogTile/view/CatalogTile$TileItemVO;", "(Lru/ozon/app/android/storefront/widgets/cms/richPromoScroll/data/RichPromoScrollDTO$TileItem;J)Lru/ozon/app/android/storefront/widgets/cms/richPromoScroll/presentation/catalogTile/view/CatalogTile$TileItemVO;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/storefront/widgets/cms/richPromoScroll/data/RichPromoScrollDTO;Ll20/d;)Ljava/util/List;", "cms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RichPromoScrollMapper implements Function2<RichPromoScrollDTO, d, List<? extends RichPromoScrollVO>> {
    private final CatalogTileScrollVO toVO(RichPromoScrollDTO.CatalogTileScrollDTO catalogTileScrollDTO, long j11) {
        Paddings paddings;
        Paddings paddings2;
        Paddings paddings3;
        Paddings paddings4;
        Paddings paddings5;
        List<RichPromoScrollDTO.TileItem> tiles = catalogTileScrollDTO.getTiles();
        ArrayList arrayList = new ArrayList(C7714v.z(tiles, 10));
        Iterator<T> it = tiles.iterator();
        while (it.hasNext()) {
            arrayList.add(toVO((RichPromoScrollDTO.TileItem) it.next(), j11));
        }
        boolean hasFirstItemSeparator = catalogTileScrollDTO.getHasFirstItemSeparator();
        RichPromoScrollDTO.SpacersDTO spacers = catalogTileScrollDTO.getSpacers();
        if (spacers == null || (paddings = spacers.getLeft()) == null) {
            paddings = Paddings.PADDING_500;
        }
        int px = UiExtKt.toPx(paddings.getPx());
        RichPromoScrollDTO.SpacersDTO spacers2 = catalogTileScrollDTO.getSpacers();
        if (spacers2 == null || (paddings2 = spacers2.getRight()) == null) {
            paddings2 = Paddings.PADDING_500;
        }
        int px2 = UiExtKt.toPx(paddings2.getPx());
        RichPromoScrollDTO.SpacersDTO spacers3 = catalogTileScrollDTO.getSpacers();
        if (spacers3 == null || (paddings3 = spacers3.getTop()) == null) {
            paddings3 = Paddings.PADDING_100;
        }
        int px3 = UiExtKt.toPx(paddings3.getPx());
        RichPromoScrollDTO.SpacersDTO spacers4 = catalogTileScrollDTO.getSpacers();
        if (spacers4 == null || (paddings4 = spacers4.getBottom()) == null) {
            paddings4 = Paddings.PADDING_100;
        }
        int px4 = UiExtKt.toPx(paddings4.getPx());
        RichPromoScrollDTO.SpacersDTO spacers5 = catalogTileScrollDTO.getSpacers();
        if (spacers5 == null || (paddings5 = spacers5.getBetween()) == null) {
            paddings5 = Paddings.PADDING_250;
        }
        SpacersVO spacersVO = new SpacersVO(px, px2, px3, px4, UiExtKt.toPx(paddings5.getPx()));
        String backgroundColor = catalogTileScrollDTO.getBackgroundColor();
        Map<String, TokenizedTrackingInfo> trackingInfo = catalogTileScrollDTO.getTrackingInfo();
        return new CatalogTileScrollVO(j11, arrayList, hasFirstItemSeparator, spacersVO, backgroundColor, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null, null, 64, null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<RichPromoScrollVO> invoke(@NotNull RichPromoScrollDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        ImageDTO image = state.getImage();
        String backgroundImage = state.getBackgroundImage();
        RichPromoScrollDTO.CatalogTileScrollDTO catalogTileScroll = state.getCatalogTileScroll();
        return C7714v.a0(new RichPromoScrollVO(hashCode, image, backgroundImage, catalogTileScroll != null ? toVO(catalogTileScroll, hashCode) : null));
    }

    private final CatalogTile.TileItemVO toVO(RichPromoScrollDTO.TileItem tileItem, long j11) {
        String image = tileItem.getImage();
        TextDTO title = tileItem.getTitle();
        AtomAction atomAction = AtomActionMapperKt.toAtomAction(tileItem.getAction(), tileItem.getTrackingInfo());
        String backgroundColor = tileItem.getBackgroundColor();
        Map<String, TokenizedTrackingInfo> trackingInfo = tileItem.getTrackingInfo();
        return new CatalogTile.TileItemVO(j11, image, title, atomAction, backgroundColor, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null);
    }
}
