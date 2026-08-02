package ru.ozon.app.android.fresh.main.widgets.catalogTile.presentation;

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
import ru.ozon.app.android.fresh.main.widgets.catalogTile.data.CatalogTileDTO;
import ru.ozon.app.android.fresh.main.widgets.catalogTile.data.TilePreset;
import ru.ozon.app.android.fresh.main.widgets.catalogTile.presentation.CatalogTileVO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\n\u0010\n\u001a\u00060\u0003j\u0002`\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000b\u001a\u00020\u000e*\u00020\r2\n\u0010\n\u001a\u00060\u0003j\u0002`\tH\u0002¢\u0006\u0004\b\u000b\u0010\u000fJ\u001f\u0010\u000b\u001a\u00020\u0011*\u00020\u00102\n\u0010\n\u001a\u00060\u0003j\u0002`\tH\u0002¢\u0006\u0004\b\u000b\u0010\u0012J\u0013\u0010\u000b\u001a\u00020\u0014*\u00020\u0013H\u0002¢\u0006\u0004\b\u000b\u0010\u0015J*\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0016\u001a\u00020\u00022\n\u0010\n\u001a\u00060\u0003j\u0002`\tH\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogTile/presentation/CatalogTileMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/fresh/main/widgets/catalogTile/data/CatalogTileDTO;", "Ll20/d;", "", "Lru/ozon/app/android/fresh/main/widgets/catalogTile/presentation/CatalogTileVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "toVO", "(Lru/ozon/app/android/fresh/main/widgets/catalogTile/data/CatalogTileDTO;Ll20/d;)Lru/ozon/app/android/fresh/main/widgets/catalogTile/presentation/CatalogTileVO;", "Lru/ozon/app/android/fresh/main/widgets/catalogTile/data/CatalogTileDTO$TileDTO;", "Lru/ozon/app/android/fresh/main/widgets/catalogTile/presentation/CatalogTileVO$TileVO;", "(Lru/ozon/app/android/fresh/main/widgets/catalogTile/data/CatalogTileDTO$TileDTO;Ll20/d;)Lru/ozon/app/android/fresh/main/widgets/catalogTile/presentation/CatalogTileVO$TileVO;", "Lru/ozon/app/android/fresh/main/widgets/catalogTile/data/CatalogTileDTO$FavoriteBadge;", "Lru/ozon/app/android/fresh/main/widgets/catalogTile/presentation/CatalogTileVO$FavoriteBadge;", "(Lru/ozon/app/android/fresh/main/widgets/catalogTile/data/CatalogTileDTO$FavoriteBadge;Ll20/d;)Lru/ozon/app/android/fresh/main/widgets/catalogTile/presentation/CatalogTileVO$FavoriteBadge;", "Lru/ozon/app/android/fresh/main/widgets/catalogTile/data/CatalogTileDTO$PaddingsDTO;", "Lru/ozon/app/android/fresh/main/widgets/catalogTile/presentation/CatalogTileVO$PaddingsVO;", "(Lru/ozon/app/android/fresh/main/widgets/catalogTile/data/CatalogTileDTO$PaddingsDTO;)Lru/ozon/app/android/fresh/main/widgets/catalogTile/presentation/CatalogTileVO$PaddingsVO;", "state", "invoke", "(Lru/ozon/app/android/fresh/main/widgets/catalogTile/data/CatalogTileDTO;Ll20/d;)Ljava/util/List;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CatalogTileMapper implements Function2<CatalogTileDTO, d, List<? extends CatalogTileVO>> {
    private final CatalogTileVO toVO(CatalogTileDTO catalogTileDTO, d dVar) {
        long id2 = ExtentionsKt.getId(dVar);
        TilePreset preset = catalogTileDTO.getPreset();
        List<CatalogTileDTO.TileDTO> tiles = catalogTileDTO.getTiles();
        ArrayList arrayList = new ArrayList(C7714v.z(tiles, 10));
        Iterator<T> it = tiles.iterator();
        while (it.hasNext()) {
            arrayList.add(toVO((CatalogTileDTO.TileDTO) it.next(), dVar));
        }
        CatalogTileVO.PaddingsVO vo = toVO(catalogTileDTO.getSpacers());
        String backgroundColor = catalogTileDTO.getBackgroundColor();
        Map<String, TokenizedTrackingInfo> trackingInfo = catalogTileDTO.getTrackingInfo();
        return new CatalogTileVO(id2, preset, arrayList, vo, backgroundColor, trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent(trackingInfo, Long.valueOf(ExtentionsKt.getId(dVar)), null) : null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<CatalogTileVO> invoke(@NotNull CatalogTileDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVO(state, widgetInfo));
    }

    private final CatalogTileVO.TileVO toVO(CatalogTileDTO.TileDTO tileDTO, d dVar) {
        String image = tileDTO.getImage();
        TextDTO title = tileDTO.getTitle();
        AtomActionDTO action = tileDTO.getAction();
        AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, null) : null;
        CatalogTileDTO.FavoriteBadge badge = tileDTO.getBadge();
        CatalogTileVO.FavoriteBadge vo = badge != null ? toVO(badge, dVar) : null;
        String backgroundColor = tileDTO.getBackgroundColor();
        Map<String, TokenizedTrackingInfo> trackingInfo = tileDTO.getTrackingInfo();
        return new CatalogTileVO.TileVO(image, title, atomAction, vo, backgroundColor, trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent(trackingInfo, Long.valueOf(ExtentionsKt.getId(dVar)), null) : null);
    }

    private final CatalogTileVO.FavoriteBadge toVO(CatalogTileDTO.FavoriteBadge favoriteBadge, d dVar) {
        IconDTO icon = favoriteBadge.getIcon();
        TextDTO text = favoriteBadge.getText();
        CatalogTileDTO.Gradient gradient = favoriteBadge.getGradient();
        String borderColor = favoriteBadge.getBorderColor();
        AtomActionDTO action = favoriteBadge.getAction();
        AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, null) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = favoriteBadge.getTrackingInfo();
        return new CatalogTileVO.FavoriteBadge(icon, text, gradient, borderColor, atomAction, trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent(trackingInfo, Long.valueOf(ExtentionsKt.getId(dVar)), null) : null);
    }

    private final CatalogTileVO.PaddingsVO toVO(CatalogTileDTO.PaddingsDTO paddingsDTO) {
        return new CatalogTileVO.PaddingsVO(ResourceExtKt.toPx(paddingsDTO.getLeft().getPx()), ResourceExtKt.toPx(paddingsDTO.getTop().getPx()), ResourceExtKt.toPx(paddingsDTO.getRight().getPx()), ResourceExtKt.toPx(paddingsDTO.getBottom().getPx()), ResourceExtKt.toPx(paddingsDTO.getBetween().getPx()));
    }
}
