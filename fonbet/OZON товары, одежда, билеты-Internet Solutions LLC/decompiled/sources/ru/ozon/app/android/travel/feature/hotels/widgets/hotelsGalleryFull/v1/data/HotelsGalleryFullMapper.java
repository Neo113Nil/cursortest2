package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v1.data;

import Sc.o;
import WZ.t;
import WZ.x;
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
import ru.ozon.app.android.pdpvideomolecule.data.VideoMolecule;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v1.data.HotelsGalleryFullDTO;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v1.presentation.HotelsGalleryFullVI;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u0010\u001a\u00020\u000f*\u00020\f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0010\u001a\u00020\u0013*\u0004\u0018\u00010\u00122\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0014J&\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/data/HotelsGalleryFullMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/data/HotelsGalleryFullDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/presentation/HotelsGalleryFullVI;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/presentation/HotelsGalleryFullVI$NavigationButton;", "mapNavButton", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/data/HotelsGalleryFullDTO;)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/presentation/HotelsGalleryFullVI$NavigationButton;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/data/HotelsGalleryFullDTO$GalleryItem;", "", "widgetId", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/presentation/HotelsGalleryFullVI$GalleryItem;", "toVI", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/data/HotelsGalleryFullDTO$GalleryItem;J)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/presentation/HotelsGalleryFullVI$GalleryItem;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/data/HotelsGalleryFullDTO$VideoTrackingInfo;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/presentation/HotelsGalleryFullVI$VideoTokenizedEvent;", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/data/HotelsGalleryFullDTO$VideoTrackingInfo;J)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/presentation/HotelsGalleryFullVI$VideoTokenizedEvent;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/data/HotelsGalleryFullDTO;Ll20/d;)Ljava/util/List;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsGalleryFullMapper implements Function2<HotelsGalleryFullDTO, d, List<? extends HotelsGalleryFullVI>> {
    private final HotelsGalleryFullVI.NavigationButton mapNavButton(HotelsGalleryFullDTO hotelsGalleryFullDTO) {
        if (hotelsGalleryFullDTO.getBackButton() != null) {
            return new HotelsGalleryFullVI.NavigationButton(hotelsGalleryFullDTO.getBackButton(), HotelsGalleryFullVI.ButtonPosition.LEFT);
        }
        if (hotelsGalleryFullDTO.getCloseButton() != null) {
            return new HotelsGalleryFullVI.NavigationButton(hotelsGalleryFullDTO.getCloseButton(), HotelsGalleryFullVI.ButtonPosition.RIGHT);
        }
        return null;
    }

    private final HotelsGalleryFullVI.GalleryItem toVI(HotelsGalleryFullDTO.GalleryItem galleryItem, long j11) {
        HotelsGalleryFullDTO.Item item = galleryItem.getItem();
        if (item instanceof HotelsGalleryFullDTO.Item.Image) {
            ImageDTO m1376unboximpl = ((HotelsGalleryFullDTO.Item.Image) galleryItem.getItem()).m1376unboximpl();
            String image = m1376unboximpl.getImage();
            int hashCode = image != null ? image.hashCode() : 0;
            Map<String, TokenizedTrackingInfo> trackingInfo = galleryItem.getTrackingInfo();
            return new HotelsGalleryFullVI.Photo(hashCode, trackingInfo != null ? x.b(trackingInfo, Long.valueOf(j11), null) : null, false, m1376unboximpl);
        }
        if (!(item instanceof HotelsGalleryFullDTO.Item.Video)) {
            throw new o();
        }
        HotelsGalleryFullDTO.Item.Video video = (HotelsGalleryFullDTO.Item.Video) galleryItem.getItem();
        String image2 = video.getPreviewImage().getImage();
        int hashCode2 = image2 != null ? image2.hashCode() : 0;
        VideoMolecule video2 = video.getVideo();
        boolean isAutoplay = video.isAutoplay();
        ImageDTO previewImage = video.getPreviewImage();
        IconDTO videoControlIcon = video.getVideoControlIcon();
        Map<String, TokenizedTrackingInfo> trackingInfo2 = galleryItem.getTrackingInfo();
        return new HotelsGalleryFullVI.Video(hashCode2, trackingInfo2 != null ? x.b(trackingInfo2, Long.valueOf(j11), null) : null, false, video2, isAutoplay, previewImage, videoControlIcon, toVI(video.getVideoTrackingInfo(), j11));
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<HotelsGalleryFullVI> invoke(@NotNull HotelsGalleryFullDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        List<HotelsGalleryFullDTO.GalleryItem> items = state.getItems();
        ArrayList arrayList = new ArrayList(C7714v.z(items, 10));
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(toVI((HotelsGalleryFullDTO.GalleryItem) it.next(), hashCode));
        }
        TextDTO text = state.getText();
        HotelsGalleryFullVI.NavigationButton mapNavButton = mapNavButton(state);
        Integer initialItemIndex = state.getInitialItemIndex();
        return C7714v.a0(new HotelsGalleryFullVI(hashCode, arrayList, text, mapNavButton, initialItemIndex != null ? initialItemIndex.intValue() : 0));
    }

    private final HotelsGalleryFullVI.VideoTokenizedEvent toVI(HotelsGalleryFullDTO.VideoTrackingInfo videoTrackingInfo, long j11) {
        Map<String, TokenizedTrackingInfo> endVideo;
        Map<String, TokenizedTrackingInfo> startVideo;
        t tVar = null;
        t b11 = (videoTrackingInfo == null || (startVideo = videoTrackingInfo.getStartVideo()) == null) ? null : x.b(startVideo, Long.valueOf(j11), null);
        if (videoTrackingInfo != null && (endVideo = videoTrackingInfo.getEndVideo()) != null) {
            tVar = x.b(endVideo, Long.valueOf(j11), null);
        }
        return new HotelsGalleryFullVI.VideoTokenizedEvent(b11, tVar);
    }
}
