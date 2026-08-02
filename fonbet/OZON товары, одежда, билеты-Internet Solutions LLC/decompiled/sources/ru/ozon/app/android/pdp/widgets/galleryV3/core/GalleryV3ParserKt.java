package ru.ozon.app.android.pdp.widgets.galleryV3.core;

import Sc.o;
import java.util.Map;
import kotlin.Metadata;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.pdp.widgets.galleryV3.data.GalleryV3DTO;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a)\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV3/data/GalleryV3DTO$GalleryItem;", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "copy", "(Lru/ozon/app/android/pdp/widgets/galleryV3/data/GalleryV3DTO$GalleryItem;Ljava/util/Map;)Lru/ozon/app/android/pdp/widgets/galleryV3/data/GalleryV3DTO$GalleryItem;", "pdp_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GalleryV3ParserKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final GalleryV3DTO.GalleryItem copy(GalleryV3DTO.GalleryItem galleryItem, Map<String, TokenizedTrackingInfo> map) {
        if (galleryItem instanceof GalleryV3DTO.GalleryItem.Image) {
            return GalleryV3DTO.GalleryItem.Image.copy$default((GalleryV3DTO.GalleryItem.Image) galleryItem, null, null, null, map, 7, null);
        }
        if (galleryItem instanceof GalleryV3DTO.GalleryItem.OzonVideo) {
            return GalleryV3DTO.GalleryItem.OzonVideo.copy$default((GalleryV3DTO.GalleryItem.OzonVideo) galleryItem, null, null, null, null, map, 15, null);
        }
        if (galleryItem instanceof GalleryV3DTO.GalleryItem.Photo360) {
            return GalleryV3DTO.GalleryItem.Photo360.copy$default((GalleryV3DTO.GalleryItem.Photo360) galleryItem, null, null, null, map, 7, null);
        }
        throw new o();
    }
}
