package ru.ozon.app.android.fresh.main.widgets.catalogTileScroll.presentation;

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
import ru.ozon.app.android.fresh.main.utils.ExtentionsKt;
import ru.ozon.app.android.fresh.main.widgets.catalogTileScroll.data.AnimationType;
import ru.ozon.app.android.fresh.main.widgets.catalogTileScroll.data.CatalogTileScrollDTO;
import ru.ozon.app.android.fresh.main.widgets.catalogTileScroll.data.FavoriteBadge;
import ru.ozon.app.android.fresh.main.widgets.catalogTileScroll.data.SpacersDTO;
import ru.ozon.app.android.fresh.main.widgets.catalogTileScroll.data.TileItem;
import ru.ozon.app.android.fresh.main.widgets.catalogTileScroll.domain.CatalogTile;
import ru.ozon.app.android.fresh.main.widgets.catalogTileScroll.domain.CatalogTileScrollVO;
import ru.ozon.app.android.fresh.main.widgets.catalogTileScroll.domain.FavoriteBadgeVO;
import ru.ozon.app.android.fresh.main.widgets.catalogTileScroll.domain.SpacersVO;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000b\u001a\u00020\u000e*\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\u000fJ\u001b\u0010\u000b\u001a\u00020\u0011*\u00020\u00102\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\u0012J&\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/presentation/CatalogTileScrollMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/data/CatalogTileScrollDTO;", "Ll20/d;", "", "Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/domain/CatalogTileScrollVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "widgetId", "toVO", "(Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/data/CatalogTileScrollDTO;J)Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/domain/CatalogTileScrollVO;", "Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/data/TileItem;", "Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/domain/CatalogTile$TileItemVO;", "(Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/data/TileItem;J)Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/domain/CatalogTile$TileItemVO;", "Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/data/FavoriteBadge;", "Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/domain/FavoriteBadgeVO;", "(Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/data/FavoriteBadge;J)Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/domain/FavoriteBadgeVO;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/data/CatalogTileScrollDTO;Ll20/d;)Ljava/util/List;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CatalogTileScrollMapper implements Function2<CatalogTileScrollDTO, d, List<? extends CatalogTileScrollVO>> {
    private final CatalogTileScrollVO toVO(CatalogTileScrollDTO catalogTileScrollDTO, long j11) {
        Paddings paddings;
        Paddings paddings2;
        Paddings paddings3;
        Paddings paddings4;
        Paddings paddings5;
        List<TileItem> tiles = catalogTileScrollDTO.getTiles();
        ArrayList arrayList = new ArrayList(C7714v.z(tiles, 10));
        Iterator<T> it = tiles.iterator();
        while (it.hasNext()) {
            arrayList.add(toVO((TileItem) it.next(), j11));
        }
        boolean hasFirstItemSeparator = catalogTileScrollDTO.getHasFirstItemSeparator();
        SpacersDTO spacers = catalogTileScrollDTO.getSpacers();
        if (spacers == null || (paddings = spacers.getLeft()) == null) {
            paddings = Paddings.PADDING_500;
        }
        int px = UiExtKt.toPx(paddings.getPx());
        SpacersDTO spacers2 = catalogTileScrollDTO.getSpacers();
        if (spacers2 == null || (paddings2 = spacers2.getRight()) == null) {
            paddings2 = Paddings.PADDING_500;
        }
        int px2 = UiExtKt.toPx(paddings2.getPx());
        SpacersDTO spacers3 = catalogTileScrollDTO.getSpacers();
        if (spacers3 == null || (paddings3 = spacers3.getTop()) == null) {
            paddings3 = Paddings.PADDING_100;
        }
        int px3 = UiExtKt.toPx(paddings3.getPx());
        SpacersDTO spacers4 = catalogTileScrollDTO.getSpacers();
        if (spacers4 == null || (paddings4 = spacers4.getBottom()) == null) {
            paddings4 = Paddings.PADDING_100;
        }
        int px4 = UiExtKt.toPx(paddings4.getPx());
        SpacersDTO spacers5 = catalogTileScrollDTO.getSpacers();
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
    public List<CatalogTileScrollVO> invoke(@NotNull CatalogTileScrollDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVO(state, ExtentionsKt.getId(widgetInfo)));
    }

    private final CatalogTile.TileItemVO toVO(TileItem tileItem, long j11) {
        String image = tileItem.getImage();
        TextDTO title = tileItem.getTitle();
        AtomAction atomAction = AtomActionMapperKt.toAtomAction(tileItem.getAction(), tileItem.getTrackingInfo());
        FavoriteBadge badge = tileItem.getBadge();
        FavoriteBadgeVO vo = badge != null ? toVO(badge, j11) : null;
        String backgroundColor = tileItem.getBackgroundColor();
        AnimationType animationType = tileItem.getAnimationType();
        if (animationType == null) {
            animationType = AnimationType.NONE;
        }
        AnimationType animationType2 = animationType;
        Map<String, TokenizedTrackingInfo> trackingInfo = tileItem.getTrackingInfo();
        return new CatalogTile.TileItemVO(j11, image, title, atomAction, vo, backgroundColor, animationType2, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null);
    }

    private final FavoriteBadgeVO toVO(FavoriteBadge favoriteBadge, long j11) {
        IconDTO icon = favoriteBadge.getIcon();
        TextDTO text = favoriteBadge.getText();
        FavoriteBadge.Gradient gradient = favoriteBadge.getGradient();
        String borderColor = favoriteBadge.getBorderColor();
        AtomActionDTO action = favoriteBadge.getAction();
        AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, null) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = favoriteBadge.getTrackingInfo();
        return new FavoriteBadgeVO(j11, icon, text, gradient, borderColor, atomAction, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null);
    }
}
