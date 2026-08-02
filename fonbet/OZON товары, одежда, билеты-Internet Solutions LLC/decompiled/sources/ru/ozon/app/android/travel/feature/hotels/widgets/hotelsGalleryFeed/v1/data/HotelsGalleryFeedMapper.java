package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFeed.v1.data;

import WZ.t;
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
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFeed.v1.data.HotelsGalleryFeedDTO;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFeed.v1.presentation.HotelsGalleryFeedVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFeed/v1/data/HotelsGalleryFeedMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFeed/v1/data/HotelsGalleryFeedDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFeed/v1/presentation/HotelsGalleryFeedVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFeed/v1/data/HotelsGalleryFeedDTO;Ll20/d;)Ljava/util/List;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsGalleryFeedMapper implements Function2<HotelsGalleryFeedDTO, d, List<? extends HotelsGalleryFeedVO>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<HotelsGalleryFeedVO> invoke(@NotNull HotelsGalleryFeedDTO state, @NotNull d widgetInfo) {
        Map<String, TokenizedTrackingInfo> trackingInfo;
        AtomActionDTO action;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        List<HotelsGalleryFeedDTO.GalleryItem> items = state.getItems();
        ArrayList arrayList = new ArrayList(C7714v.z(items, 10));
        int i11 = 0;
        for (Object obj : items) {
            int i12 = i11 + 1;
            t tVar = null;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            HotelsGalleryFeedDTO.GalleryItem galleryItem = (HotelsGalleryFeedDTO.GalleryItem) obj;
            long hashCode = (widgetInfo.d() + i11).hashCode();
            ImageDTO image = galleryItem.getImage();
            IconDTO videoControlIcon = galleryItem.getVideoControlIcon();
            CommonControlSettings common = galleryItem.getCommon();
            AtomAction atomAction = (common == null || (action = common.getAction()) == null) ? null : AtomActionMapperKt.toAtomAction(action, galleryItem.getCommon().getTrackingInfo());
            CommonControlSettings common2 = galleryItem.getCommon();
            if (common2 != null && (trackingInfo = common2.getTrackingInfo()) != null) {
                tVar = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null);
            }
            arrayList.add(new HotelsGalleryFeedVO(hashCode, i11, image, videoControlIcon, atomAction, tVar));
            i11 = i12;
        }
        return arrayList;
    }
}
