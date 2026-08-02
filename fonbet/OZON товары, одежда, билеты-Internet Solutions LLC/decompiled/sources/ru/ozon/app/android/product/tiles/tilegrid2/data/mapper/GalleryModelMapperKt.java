package ru.ozon.app.android.product.tiles.tilegrid2.data.mapper;

import Sc.o;
import WZ.t;
import android.widget.ImageView;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.views.galleryswipeview.data.TileGrid2GalleryModel;
import ru.ozon.app.android.storefront.data.tiles.common.ContentModeKt;
import ru.ozon.app.android.storefront.data.tiles.tilegrid2.TileImageDTO;
import ru.ozon.app.android.storefront.data.tiles.tilegrid2.TileImageItemDTO;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a9\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001aU\u0010\u0016\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0010\b\u0002\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileImageDTO;", "", "widgetId", "", "ratio", "", "enableParanja", "shouldBlur", "", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/views/galleryswipeview/data/TileGrid2GalleryModel$GalleryItem;", "mapGalleryItems", "(Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileImageDTO;JFZZ)Ljava/util/List;", "", "imageUrl", "Landroid/widget/ImageView$ScaleType;", "scaleType", "topBgColor", "bottomBgColor", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/views/galleryswipeview/data/TileGrid2GalleryModel$Image;", "createImage", "(Ljava/lang/String;FLandroid/widget/ImageView$ScaleType;Ljava/lang/String;Ljava/lang/String;ZLWZ/t;)Lru/ozon/app/android/product/tiles/tilegrid2/presentation/views/galleryswipeview/data/TileGrid2GalleryModel$Image;", "product_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GalleryModelMapperKt {
    private static final TileGrid2GalleryModel.Image createImage(String str, float f7, ImageView.ScaleType scaleType, String str2, String str3, boolean z11, t tVar) {
        return new TileGrid2GalleryModel.Image(str, f7, 1.0f, z11, scaleType, str2, str3, false, tVar, UserVerificationMethods.USER_VERIFY_PATTERN, null);
    }

    @NotNull
    public static final List<TileGrid2GalleryModel.GalleryItem> mapGalleryItems(@NotNull TileImageDTO tileImageDTO, long j11, float f7, boolean z11, boolean z12) {
        Pair pair;
        Pair pair2;
        Object videoItem;
        Map<String, TokenizedTrackingInfo> interruptedTrackingInfo;
        Map<String, TokenizedTrackingInfo> finishedTrackingInfo;
        Map<String, TokenizedTrackingInfo> startedTrackingInfo;
        Map<String, TokenizedTrackingInfo> trackingInfo;
        Intrinsics.checkNotNullParameter(tileImageDTO, "<this>");
        List<TileImageItemDTO> items = tileImageDTO.getItems();
        ArrayList arrayList = new ArrayList(C7714v.z(items, 10));
        for (TileImageItemDTO tileImageItemDTO : items) {
            boolean z13 = tileImageItemDTO instanceof TileImageItemDTO.ImageDTO;
            if (z13) {
                TileImageItemDTO.ImageDTO imageDTO = (TileImageItemDTO.ImageDTO) tileImageItemDTO;
                pair = new Pair(imageDTO.getLink(), ContentModeKt.mapScaleType(imageDTO.getContentMode()));
            } else {
                if (!(tileImageItemDTO instanceof TileImageItemDTO.VideoDTO)) {
                    throw new o();
                }
                TileImageItemDTO.VideoDTO videoDTO = (TileImageItemDTO.VideoDTO) tileImageItemDTO;
                pair = new Pair(videoDTO.getPreview(), ContentModeKt.mapScaleType(videoDTO.getPreviewContentMode()));
            }
            String str = (String) pair.a();
            ImageView.ScaleType scaleType = (ImageView.ScaleType) pair.b();
            t tVar = null;
            if (z13) {
                TileImageItemDTO.ImageDTO imageDTO2 = (TileImageItemDTO.ImageDTO) tileImageItemDTO;
                pair2 = new Pair(imageDTO2.getTopBgColor(), imageDTO2.getBottomBgColor());
            } else {
                if (!(tileImageItemDTO instanceof TileImageItemDTO.VideoDTO)) {
                    throw new o();
                }
                pair2 = new Pair(null, null);
            }
            String str2 = (String) pair2.a();
            String str3 = (String) pair2.b();
            TileImageItemDTO.ImageDTO imageDTO3 = z13 ? (TileImageItemDTO.ImageDTO) tileImageItemDTO : null;
            TileGrid2GalleryModel.Image createImage = createImage(str, f7, scaleType, str2, str3, z11, (imageDTO3 == null || (trackingInfo = imageDTO3.getTrackingInfo()) == null) ? null : TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null));
            if (z13) {
                videoItem = new TileGrid2GalleryModel.GalleryItem.ImageItem(createImage);
            } else {
                if (!(tileImageItemDTO instanceof TileImageItemDTO.VideoDTO)) {
                    throw new o();
                }
                TileImageItemDTO.VideoDTO videoDTO2 = (TileImageItemDTO.VideoDTO) tileImageItemDTO;
                String link = videoDTO2.getLink();
                TileImageItemDTO.VideoDTO.VideoTracking tracking = videoDTO2.getTracking();
                t tokenizedEvent$default = (tracking == null || (startedTrackingInfo = tracking.getStartedTrackingInfo()) == null) ? null : TrackingInfoMapperKt.toTokenizedEvent$default(startedTrackingInfo, Long.valueOf(j11), null, 2, null);
                TileImageItemDTO.VideoDTO.VideoTracking tracking2 = videoDTO2.getTracking();
                t tokenizedEvent$default2 = (tracking2 == null || (finishedTrackingInfo = tracking2.getFinishedTrackingInfo()) == null) ? null : TrackingInfoMapperKt.toTokenizedEvent$default(finishedTrackingInfo, Long.valueOf(j11), null, 2, null);
                TileImageItemDTO.VideoDTO.VideoTracking tracking3 = videoDTO2.getTracking();
                if (tracking3 != null && (interruptedTrackingInfo = tracking3.getInterruptedTrackingInfo()) != null) {
                    tVar = TrackingInfoMapperKt.toTokenizedEvent$default(interruptedTrackingInfo, Long.valueOf(j11), null, 2, null);
                }
                videoItem = new TileGrid2GalleryModel.GalleryItem.VideoItem(createImage, link, tokenizedEvent$default, tokenizedEvent$default2, tVar, z12);
            }
            arrayList.add(videoItem);
        }
        return arrayList;
    }
}
