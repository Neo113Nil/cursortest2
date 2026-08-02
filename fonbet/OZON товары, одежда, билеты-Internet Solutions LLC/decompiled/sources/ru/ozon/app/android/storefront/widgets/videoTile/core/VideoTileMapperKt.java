package ru.ozon.app.android.storefront.widgets.videoTile.core;

import java.util.Map;
import kotlin.Metadata;
import l20.d;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.storefront.widgets.videoTile.data.DesignType;
import ru.ozon.app.android.storefront.widgets.videoTile.data.VideoTileDTO;
import ru.ozon.app.android.storefront.widgets.videoTile.presentation.VideoTileVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/storefront/widgets/videoTile/data/VideoTileDTO;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "Lru/ozon/app/android/storefront/widgets/videoTile/presentation/VideoTileVO;", "toVO", "(Lru/ozon/app/android/storefront/widgets/videoTile/data/VideoTileDTO;Ll20/d;)Lru/ozon/app/android/storefront/widgets/videoTile/presentation/VideoTileVO;", "storefront_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VideoTileMapperKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final VideoTileVO toVO(VideoTileDTO videoTileDTO, d dVar) {
        long hashCode = dVar.d().hashCode();
        String image = videoTileDTO.getImage();
        float imageHeightRatio = videoTileDTO.getImageHeightRatio();
        Badge timeBadge = videoTileDTO.getTimeBadge();
        TextAtom title = videoTileDTO.getTitle();
        DesignType designType = videoTileDTO.getDesignType();
        TextAtom subtitle = videoTileDTO.getSubtitle();
        AtomActionDTO action = videoTileDTO.getAction();
        AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, videoTileDTO.getTrackingInfo()) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = videoTileDTO.getTrackingInfo();
        return new VideoTileVO(hashCode, image, imageHeightRatio, timeBadge, title, designType, subtitle, atomAction, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null, videoTileDTO.getAdBadge());
    }
}
