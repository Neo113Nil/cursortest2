package ru.ozon.app.android.product.tiles.tilegrid2.data.mapper.multibutton;

import WZ.t;
import WZ.x;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.multibutton.data.TileRelatedProductsCurtainVO;
import ru.ozon.app.android.storefront.data.tiles.tilegrid2.RelatedProductsCurtain;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u001a\u0016\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"toVo", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/multibutton/data/TileRelatedProductsCurtainVO;", "Lru/ozon/app/android/storefront/data/tiles/tilegrid2/RelatedProductsCurtain;", "widgetId", "", "product_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CartButtonMapperKt {
    public static final TileRelatedProductsCurtainVO toVo(@NotNull RelatedProductsCurtain relatedProductsCurtain, long j11) {
        Intrinsics.checkNotNullParameter(relatedProductsCurtain, "<this>");
        if (h.K(relatedProductsCurtain.getCurtainDeeplink())) {
            return null;
        }
        String curtainDeeplink = relatedProductsCurtain.getCurtainDeeplink();
        Map<String, TokenizedTrackingInfo> openTracking = relatedProductsCurtain.getOpenTracking();
        t b11 = openTracking != null ? x.b(openTracking, Long.valueOf(j11), null) : null;
        Map<String, TokenizedTrackingInfo> miniCloseSwipeTracking = relatedProductsCurtain.getMiniCloseSwipeTracking();
        t b12 = miniCloseSwipeTracking != null ? x.b(miniCloseSwipeTracking, Long.valueOf(j11), null) : null;
        Map<String, TokenizedTrackingInfo> miniCloseTapTracking = relatedProductsCurtain.getMiniCloseTapTracking();
        t b13 = miniCloseTapTracking != null ? x.b(miniCloseTapTracking, Long.valueOf(j11), null) : null;
        Map<String, TokenizedTrackingInfo> openFullTracking = relatedProductsCurtain.getOpenFullTracking();
        t b14 = openFullTracking != null ? x.b(openFullTracking, Long.valueOf(j11), null) : null;
        Map<String, TokenizedTrackingInfo> closeFullTracking = relatedProductsCurtain.getCloseFullTracking();
        return new TileRelatedProductsCurtainVO(curtainDeeplink, b11, b12, b13, b14, closeFullTracking != null ? x.b(closeFullTracking, Long.valueOf(j11), null) : null);
    }
}
