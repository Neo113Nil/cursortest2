package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.data;

import WZ.t;
import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.composer.imageprefetch.PrefetchUtilsKt;
import ru.ozon.app.android.pdpvideomolecule.data.VideoMolecule;
import ru.ozon.app.android.pikazon.preload.ImagePrefetcher;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.data.HotelsGalleryDTO;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.presentation.HotelsGalleryVO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u001d\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\t¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u000f\u001a\u0004\u0018\u00010\u0014*\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u000f\u0010\u0015J\u001d\u0010\u000f\u001a\u00020\u0017*\u0004\u0018\u00010\u00162\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u000f\u0010\u0018J\u0017\u0010\u001a\u001a\u0004\u0018\u00010\u0019*\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ&\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010 R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/data/HotelsGalleryMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/data/HotelsGalleryDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/HotelsGalleryVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "Lru/ozon/app/android/pikazon/preload/ImagePrefetcher;", "imagePrefetcher", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/pikazon/preload/ImagePrefetcher;)V", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/data/HotelsGalleryDTO$VideoButton;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/HotelsGalleryVO$VideoButton;", "toVO", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/data/HotelsGalleryDTO$VideoButton;)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/HotelsGalleryVO$VideoButton;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/data/HotelsGalleryDTO$GalleryItem;", "", "widgetId", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/HotelsGalleryVO$GalleryItem;", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/data/HotelsGalleryDTO$GalleryItem;J)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/HotelsGalleryVO$GalleryItem;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/data/HotelsGalleryDTO$VideoTrackingInfo;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/HotelsGalleryVO$VideoTokenizedEvent;", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/data/HotelsGalleryDTO$VideoTrackingInfo;J)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/HotelsGalleryVO$VideoTokenizedEvent;", "", "validateAspectRatio", "(Ljava/lang/String;)Ljava/lang/String;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/data/HotelsGalleryDTO;Ll20/d;)Ljava/util/List;", "Landroid/content/Context;", "Lru/ozon/app/android/pikazon/preload/ImagePrefetcher;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsGalleryMapper implements Function2<HotelsGalleryDTO, d, List<? extends HotelsGalleryVO>> {

    @NotNull
    private final Context context;

    @NotNull
    private final ImagePrefetcher<HotelsGalleryVO> imagePrefetcher;

    public HotelsGalleryMapper(@NotNull Context context, @NotNull ImagePrefetcher<HotelsGalleryVO> imagePrefetcher) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imagePrefetcher, "imagePrefetcher");
        this.context = context;
        this.imagePrefetcher = imagePrefetcher;
    }

    private final HotelsGalleryVO.VideoButton toVO(HotelsGalleryDTO.VideoButton videoButton) {
        CommonControlSettings common = videoButton.getEnableButton().getCommon();
        return new HotelsGalleryVO.VideoButton((common != null ? common.getAction() : null) != null ? r1.hashCode() : 0, videoButton.getEnableButton(), videoButton.getDisableButton());
    }

    private final String validateAspectRatio(String str) {
        if (str == null) {
            return null;
        }
        List m11 = h.m(str, new String[]{ProductContainerDTO.RATIO_DELIMITER}, 0, 6);
        if (m11.size() != 2) {
            return null;
        }
        Float v02 = h.v0((String) m11.get(0));
        Float v03 = h.v0((String) m11.get(1));
        if (v02 == null || v03 == null || v02.floatValue() <= 0.0f || v03.floatValue() <= 0.0f) {
            return null;
        }
        return str;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<HotelsGalleryVO> invoke(@NotNull HotelsGalleryDTO state, @NotNull d widgetInfo) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        List<HotelsGalleryDTO.GalleryItem> items = state.getItems();
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            HotelsGalleryVO.GalleryItem vo = toVO((HotelsGalleryDTO.GalleryItem) it.next(), hashCode);
            if (vo != null) {
                arrayList2.add(vo);
            }
        }
        List<HotelsGalleryDTO.VideoButton> buttons = state.getButtons();
        if (buttons != null) {
            List<HotelsGalleryDTO.VideoButton> list = buttons;
            arrayList = new ArrayList(C7714v.z(list, 10));
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(toVO((HotelsGalleryDTO.VideoButton) it2.next()));
            }
        } else {
            arrayList = null;
        }
        HotelsGalleryDTO.MobileSettings mobileSettings = state.getMobileSettings();
        String backgroundColor = mobileSettings.getBackgroundColor();
        float pxF = ResourceExtKt.toPxF(mobileSettings.getIslandRadius().getPx(), this.context);
        int px = ResourceExtKt.toPx(mobileSettings.getIslandTopPadding().getPx(), this.context);
        String islandBackgroundColor = mobileSettings.getIslandBackgroundColor();
        String validateAspectRatio = validateAspectRatio(mobileSettings.getAspectRatio());
        HotelsGalleryDTO.MobileSettings.PageControl pageControl = mobileSettings.getPageControl();
        BadgeDTO badge = mobileSettings.getBadge();
        AtomActionDTO hotelsGalleryFeedAction = mobileSettings.getHotelsGalleryFeedAction();
        HotelsGalleryVO.Settings settings = new HotelsGalleryVO.Settings(backgroundColor, pxF, px, islandBackgroundColor, validateAspectRatio, pageControl, badge, hotelsGalleryFeedAction != null ? AtomActionMapperKt.toAtomAction(hotelsGalleryFeedAction, state.getTrackingInfo()) : null);
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        HotelsGalleryVO hotelsGalleryVO = new HotelsGalleryVO(hashCode, arrayList2, arrayList, settings, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null, null, null, 96, null);
        PrefetchUtilsKt.prefetchImage(this.context, hotelsGalleryVO, this.imagePrefetcher);
        return C7714v.a0(hotelsGalleryVO);
    }

    private final HotelsGalleryVO.GalleryItem toVO(HotelsGalleryDTO.GalleryItem galleryItem, long j11) {
        if (galleryItem.m1360getImagefX04VSE() != null) {
            long hashCode = galleryItem.m1360getImagefX04VSE().hashCode();
            String m1360getImagefX04VSE = galleryItem.m1360getImagefX04VSE();
            AtomActionDTO action = galleryItem.getAction();
            AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, galleryItem.getTrackingInfo()) : null;
            Map<String, TokenizedTrackingInfo> trackingInfo = galleryItem.getTrackingInfo();
            return new HotelsGalleryVO.Photo(hashCode, atomAction, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null, m1360getImagefX04VSE);
        }
        if (galleryItem.getVideo() == null) {
            return null;
        }
        long hashCode2 = galleryItem.getVideo().getPreviewUrl().hashCode();
        VideoMolecule video = galleryItem.getVideo().getVideo();
        String previewUrl = galleryItem.getVideo().getPreviewUrl();
        boolean isAutoplay = galleryItem.getVideo().isAutoplay();
        AtomActionDTO action2 = galleryItem.getAction();
        AtomAction atomAction2 = action2 != null ? AtomActionMapperKt.toAtomAction(action2, galleryItem.getTrackingInfo()) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo2 = galleryItem.getTrackingInfo();
        return new HotelsGalleryVO.Video(hashCode2, atomAction2, trackingInfo2 != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo2, Long.valueOf(j11), null, 2, null) : null, video, previewUrl, isAutoplay, toVO(galleryItem.getVideo().getVideoTrackingInfo(), j11));
    }

    private final HotelsGalleryVO.VideoTokenizedEvent toVO(HotelsGalleryDTO.VideoTrackingInfo videoTrackingInfo, long j11) {
        Map<String, TokenizedTrackingInfo> endVideo;
        Map<String, TokenizedTrackingInfo> startVideo;
        t tVar = null;
        t tokenizedEvent$default = (videoTrackingInfo == null || (startVideo = videoTrackingInfo.getStartVideo()) == null) ? null : TrackingInfoMapperKt.toTokenizedEvent$default(startVideo, Long.valueOf(j11), null, 2, null);
        if (videoTrackingInfo != null && (endVideo = videoTrackingInfo.getEndVideo()) != null) {
            tVar = TrackingInfoMapperKt.toTokenizedEvent$default(endVideo, Long.valueOf(j11), null, 2, null);
        }
        return new HotelsGalleryVO.VideoTokenizedEvent(tokenizedEvent$default, tVar);
    }
}
