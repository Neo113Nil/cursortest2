package ru.ozon.app.android.product.tiles.tilegrid2.data.mapper;

import WZ.t;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ads.common.pixel.data.PixelDTO;
import ru.ozon.app.android.ads.data.pixel.presentation.PixelKt;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.product.common.TileThemeConfigVO;
import ru.ozon.app.android.product.common.TileThemeConfigVOKt;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.TileGrid2Constants;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.data.TileGrid2BannerVO;
import ru.ozon.app.android.product.tiles.utils.AccessibilityUtilsKt;
import ru.ozon.app.android.product.tiles.utils.CollectionExtKt;
import ru.ozon.app.android.storefront.data.tiles.common.ContentModeKt;
import ru.ozon.app.android.storefront.data.tiles.tilegrid2.ImageRatioKt;
import ru.ozon.app.android.storefront.data.tiles.tilegrid2.TileGrid2DTO;
import ru.ozon.app.android.storefront.data.tiles.tilegrid2.TileItemDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u001e\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/product/tiles/tilegrid2/data/mapper/TileGrid2BannerMapper;", "", "<init>", "()V", "map", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/data/TileGrid2BannerVO;", "item", "Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileItemDTO$TileGrid2BannerDTO;", "index", "", "state", "Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2DTO;", "mapBadge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "data", "Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileItemDTO$TileGrid2BannerDTO$BadgeData;", "Companion", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TileGrid2BannerMapper {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/product/tiles/tilegrid2/data/mapper/TileGrid2BannerMapper$Companion;", "", "<init>", "()V", "DEFAULT_IMAGE_CONSTRAINT_SCALE_RATIO", "", "getBannerWidgetId", "", "item", "Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileItemDTO$TileGrid2BannerDTO;", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long getBannerWidgetId(@NotNull TileItemDTO.TileGrid2BannerDTO item) {
            Intrinsics.checkNotNullParameter(item, "item");
            return String.valueOf(item).hashCode();
        }

        private Companion() {
        }
    }

    private final BadgeDTO mapBadge(BadgeDTO badge, TileItemDTO.TileGrid2BannerDTO.BadgeData data) {
        CommonControlSettings copy$default;
        if (data == null || badge == null) {
            return null;
        }
        String text = data.getText();
        CommonControlSettings common = badge.getCommon();
        return BadgeDTO.copy$default(badge, text, null, null, null, null, (common == null || (copy$default = CommonControlSettings.copy$default(common, null, null, null, 7, null)) == null) ? new CommonControlSettings(data.getAction(), null, data.getTestInfo(), 2, null) : copy$default, null, null, null, null, null, null, 4062, null);
    }

    @NotNull
    public final TileGrid2BannerVO map(@NotNull TileItemDTO.TileGrid2BannerDTO item, int index, @NotNull TileGrid2DTO state) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(state, "state");
        long bannerWidgetId = INSTANCE.getBannerWidgetId(item);
        boolean z11 = (index == 0 || index == 1) && state.getHeader() != null;
        TileGrid2DTO.Options options = state.getOptions();
        TileThemeConfigVO tileGrid2ThemeVO = TileThemeConfigVOKt.toTileGrid2ThemeVO(options != null ? options.getTheme() : null, z11);
        String link = item.getImage().getLink();
        String constraintLayoutRatio = ImageRatioKt.toConstraintLayoutRatio(item.getImage().getImageRatio(), "H,3:4");
        ImageView.ScaleType mapScaleType = ContentModeKt.mapScaleType(item.getImage().getContentMode());
        TextDTO title = item.getTitle();
        TextDTO text = item.getText();
        TileGrid2DTO.SharedData sharedData = state.getSharedData();
        BadgeDTO bannerBadge = sharedData != null ? sharedData.getBannerBadge() : null;
        List<TileItemDTO.TileGrid2BannerDTO.BadgeData> badges = item.getBadges();
        BadgeDTO mapBadge = mapBadge(bannerBadge, badges != null ? (TileItemDTO.TileGrid2BannerDTO.BadgeData) C7714v.M(badges) : null);
        TileGrid2DTO.SharedData sharedData2 = state.getSharedData();
        BadgeDTO bannerBadge2 = sharedData2 != null ? sharedData2.getBannerBadge() : null;
        List<TileItemDTO.TileGrid2BannerDTO.BadgeData> badges2 = item.getBadges();
        BadgeDTO mapBadge2 = mapBadge(bannerBadge2, badges2 != null ? (TileItemDTO.TileGrid2BannerDTO.BadgeData) CollectionExtKt.secondOrNull(badges2) : null);
        TileGrid2DTO.Options options2 = state.getOptions();
        String backgroundColor = options2 != null ? options2.getBackgroundColor() : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = item.getTrackingInfo();
        t mapToTokenizedEvent$default = trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(bannerWidgetId), null, 2, null) : null;
        Map<String, TokenizedTrackingInfo> impressionTrackingInfo = item.getImpressionTrackingInfo();
        t mapToTokenizedEvent$default2 = impressionTrackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(impressionTrackingInfo, Long.valueOf(bannerWidgetId), null, 2, null) : null;
        List<PixelDTO> pixel = item.getPixel();
        if (pixel != null) {
            List<PixelDTO> list = pixel;
            arrayList = new ArrayList(C7714v.z(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(PixelKt.toVO((PixelDTO) it.next()));
            }
        } else {
            arrayList = null;
        }
        AtomActionDTO action = item.getAction();
        return new TileGrid2BannerVO(bannerWidgetId, index, AccessibilityUtilsKt.toAccesibilityTileID(bannerWidgetId), link, constraintLayoutRatio, mapScaleType, title, text, mapBadge, mapBadge2, action != null ? AtomActionMapperKt.toAtomAction(action, item.getTrackingInfo()) : null, mapToTokenizedEvent$default, mapToTokenizedEvent$default2, arrayList, backgroundColor, item.getIslandBackgroundColor(), TileGrid2Constants.INSTANCE.getBannerButtonTopMargin() + TileGrid2MapperKt.getSeparatedButtonOffset(item.getButton()), tileGrid2ThemeVO.getTopOffset());
    }
}
