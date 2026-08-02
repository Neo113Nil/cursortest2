package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v2.data;

import Sc.o;
import WZ.t;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.h;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.pdpvideomolecule.data.VideoMolecule;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v2.data.HotelsGalleryFullV2DTO;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v2.presentation.HotelsGalleryFullV2VI;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000f\u001a\u00020\u000e*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u000f\u001a\u00020\u0012*\u0004\u0018\u00010\u00112\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0013J&\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v2/data/HotelsGalleryFullV2Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v2/data/HotelsGalleryFullV2DTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v2/presentation/HotelsGalleryFullV2VI;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v2/data/HotelsGalleryFullV2DTO$GalleryItem;", "", "widgetId", "", "isSelected", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v2/presentation/HotelsGalleryFullV2VI$GalleryItem;", "toVI", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v2/data/HotelsGalleryFullV2DTO$GalleryItem;JZ)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v2/presentation/HotelsGalleryFullV2VI$GalleryItem;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v2/data/HotelsGalleryFullV2DTO$VideoTrackingInfo;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v2/presentation/HotelsGalleryFullV2VI$VideoTokenizedEvent;", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v2/data/HotelsGalleryFullV2DTO$VideoTrackingInfo;J)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v2/presentation/HotelsGalleryFullV2VI$VideoTokenizedEvent;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v2/data/HotelsGalleryFullV2DTO;Ll20/d;)Ljava/util/List;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsGalleryFullV2Mapper implements Function2<HotelsGalleryFullV2DTO, d, List<? extends HotelsGalleryFullV2VI>> {
    private final HotelsGalleryFullV2VI.GalleryItem toVI(HotelsGalleryFullV2DTO.GalleryItem galleryItem, long j11, boolean z11) {
        HotelsGalleryFullV2DTO.Item item = galleryItem.getItem();
        if (item instanceof HotelsGalleryFullV2DTO.Item.Image) {
            ImageDTO m1392unboximpl = ((HotelsGalleryFullV2DTO.Item.Image) galleryItem.getItem()).m1392unboximpl();
            int hashCode = (m1392unboximpl.getImage() + galleryItem.getTitleText() + galleryItem.getCounterText()).hashCode();
            Map<String, TokenizedTrackingInfo> trackingInfo = galleryItem.getTrackingInfo();
            return new HotelsGalleryFullV2VI.Photo(hashCode, galleryItem.getTitleText(), galleryItem.getCounterText(), trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null, z11, m1392unboximpl);
        }
        if (!(item instanceof HotelsGalleryFullV2DTO.Item.Video)) {
            throw new o();
        }
        HotelsGalleryFullV2DTO.Item.Video video = (HotelsGalleryFullV2DTO.Item.Video) galleryItem.getItem();
        int hashCode2 = (video.getPreviewImage().getImage() + galleryItem.getTitleText() + galleryItem.getCounterText()).hashCode();
        TextDTO titleText = galleryItem.getTitleText();
        TextDTO counterText = galleryItem.getCounterText();
        VideoMolecule video2 = video.getVideo();
        boolean isAutoplay = video.isAutoplay();
        ImageDTO previewImage = video.getPreviewImage();
        IconDTO videoControlIcon = video.getVideoControlIcon();
        Map<String, TokenizedTrackingInfo> trackingInfo2 = galleryItem.getTrackingInfo();
        return new HotelsGalleryFullV2VI.Video(hashCode2, titleText, counterText, trackingInfo2 != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo2, Long.valueOf(j11), null, 2, null) : null, z11, video2, isAutoplay, previewImage, videoControlIcon, toVI(video.getVideoTrackingInfo(), j11), 0L, UserVerificationMethods.USER_VERIFY_ALL, null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<HotelsGalleryFullV2VI> invoke(@NotNull HotelsGalleryFullV2DTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        Integer initialItemIndex = state.getInitialItemIndex();
        int f7 = initialItemIndex != null ? h.f(initialItemIndex.intValue(), C7714v.O(state.getItems())) : 0;
        List<HotelsGalleryFullV2DTO.GalleryItem> items = state.getItems();
        ArrayList arrayList = new ArrayList(C7714v.z(items, 10));
        int i11 = 0;
        for (Object obj : items) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            arrayList.add(toVI((HotelsGalleryFullV2DTO.GalleryItem) obj, hashCode, f7 == i11));
            i11 = i12;
        }
        return C7714v.a0(new HotelsGalleryFullV2VI(hashCode, arrayList, f7, state.getBackButton()));
    }

    private final HotelsGalleryFullV2VI.VideoTokenizedEvent toVI(HotelsGalleryFullV2DTO.VideoTrackingInfo videoTrackingInfo, long j11) {
        Map<String, TokenizedTrackingInfo> endVideo;
        Map<String, TokenizedTrackingInfo> startVideo;
        t tVar = null;
        t mapToTokenizedEvent$default = (videoTrackingInfo == null || (startVideo = videoTrackingInfo.getStartVideo()) == null) ? null : TrackingInfoMapperKt.mapToTokenizedEvent$default(startVideo, Long.valueOf(j11), null, 2, null);
        if (videoTrackingInfo != null && (endVideo = videoTrackingInfo.getEndVideo()) != null) {
            tVar = TrackingInfoMapperKt.mapToTokenizedEvent$default(endVideo, Long.valueOf(j11), null, 2, null);
        }
        return new HotelsGalleryFullV2VI.VideoTokenizedEvent(mapToTokenizedEvent$default, tVar);
    }
}
