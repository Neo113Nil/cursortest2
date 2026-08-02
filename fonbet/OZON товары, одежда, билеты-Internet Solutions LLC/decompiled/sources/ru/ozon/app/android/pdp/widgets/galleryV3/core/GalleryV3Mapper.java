package ru.ozon.app.android.pdp.widgets.galleryV3.core;

import Sc.o;
import T00.a;
import T00.e;
import WZ.t;
import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.I;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v3.GalleryButtonsVO;
import ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v3.GalleryV3VO;
import ru.ozon.app.android.pdp.widgets.galleryV3.data.GalleryV3DTO;
import ru.ozon.app.android.pdp.widgets.galleryV3.presentation.buttons.GalleryButtonType;
import ru.ozon.app.android.pdpvideomolecule.data.VideoMolecule;
import ru.ozon.app.android.pikazon.preload.ImagePrefetcher;
import ru.ozon.app.android.video.TokenizedVideoEvents;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.v3.mappers.BadgeMapperKt;
import ru.ozon.uni.atoms.v3.mappers.TextMapperKt;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u001f\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\t¢\u0006\u0004\b\u000b\u0010\fJ?\u0010\u0017\u001a\u00020\u0016*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00140\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001b\u001a\u00020\u001a*\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u001e*\u00020\u001dH\u0002¢\u0006\u0004\b\u0017\u0010\u001fJ\u0015\u0010!\u001a\u0004\u0018\u00010 *\u00020\u0002H\u0002¢\u0006\u0004\b!\u0010\"J\u001d\u0010\u0017\u001a\u00020$*\u0004\u0018\u00010#2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0017\u0010%J%\u0010\u0017\u001a\u0004\u0018\u00010'*\n\u0012\u0004\u0012\u00020&\u0018\u00010\u00042\u0006\u0010\u0015\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0017\u0010(J&\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010)\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b+\u0010,R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010-R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010.¨\u0006/"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV3/core/GalleryV3Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/pdp/widgets/galleryV3/data/GalleryV3DTO;", "Ll20/d;", "", "Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "Lru/ozon/app/android/pikazon/preload/ImagePrefetcher;", "imagePrefetcher", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/pikazon/preload/ImagePrefetcher;)V", "Lru/ozon/app/android/pdp/widgets/galleryV3/data/GalleryV3DTO$GalleryItem;", "", "widgetId", "", "hasParandja", "isApparel", "Lkotlin/Function1;", "", "hasVideo", "Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3VO$Item;", "toVo", "(Lru/ozon/app/android/pdp/widgets/galleryV3/data/GalleryV3DTO$GalleryItem;JZZLkotlin/jvm/functions/Function1;)Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3VO$Item;", "Lru/ozon/app/android/pdp/widgets/galleryV3/data/GalleryV3DTO$GalleryItem$VideoTrackingInfo;", "Lru/ozon/app/android/video/TokenizedVideoEvents;", "toVideoTokenizedEvents", "(Lru/ozon/app/android/pdp/widgets/galleryV3/data/GalleryV3DTO$GalleryItem$VideoTrackingInfo;J)Lru/ozon/app/android/video/TokenizedVideoEvents;", "Lru/ozon/app/android/pdp/widgets/galleryV3/data/GalleryV3DTO$Ratio;", "", "(Lru/ozon/app/android/pdp/widgets/galleryV3/data/GalleryV3DTO$Ratio;)Ljava/lang/Float;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3VO$ClassifiedDetails;", "extractClassifiedDetails", "(Lru/ozon/app/android/pdp/widgets/galleryV3/data/GalleryV3DTO;)Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3VO$ClassifiedDetails;", "Lru/ozon/app/android/pdp/widgets/galleryV3/data/GalleryV3DTO$TrackingInfoWrapper;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3VO$Analytics;", "(Lru/ozon/app/android/pdp/widgets/galleryV3/data/GalleryV3DTO$TrackingInfoWrapper;J)Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3VO$Analytics;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeIconButton;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3VO$Buttons;", "(Ljava/util/List;Z)Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3VO$Buttons;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/pdp/widgets/galleryV3/data/GalleryV3DTO;Ll20/d;)Ljava/util/List;", "Landroid/content/Context;", "Lru/ozon/app/android/pikazon/preload/ImagePrefetcher;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GalleryV3Mapper implements Function2<GalleryV3DTO, d, List<? extends GalleryV3VO>> {

    @NotNull
    private final Context context;

    @NotNull
    private final ImagePrefetcher<GalleryV3VO> imagePrefetcher;

    public GalleryV3Mapper(@NotNull Context context, @NotNull ImagePrefetcher<GalleryV3VO> imagePrefetcher) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imagePrefetcher, "imagePrefetcher");
        this.context = context;
        this.imagePrefetcher = imagePrefetcher;
    }

    private final GalleryV3VO.ClassifiedDetails extractClassifiedDetails(GalleryV3DTO galleryV3DTO) {
        Float backgroundAlpha;
        TextAtom classifiedText;
        if (galleryV3DTO.isClassified() == null && galleryV3DTO.getClassifiedInfo() == null) {
            return null;
        }
        Boolean isClassified = galleryV3DTO.isClassified();
        boolean booleanValue = isClassified != null ? isClassified.booleanValue() : false;
        GalleryV3DTO.ClassifiedInfo classifiedInfo = galleryV3DTO.getClassifiedInfo();
        TextDTO dsTextAtom$default = (classifiedInfo == null || (classifiedText = classifiedInfo.getClassifiedText()) == null) ? null : TextMapperKt.dsTextAtom$default(classifiedText, null, null, null, null, CommonCellSettings.LayoutPadding.PADDING_250, null, null, null, null, null, null, false, 4079, null);
        GalleryV3DTO.ClassifiedInfo classifiedInfo2 = galleryV3DTO.getClassifiedInfo();
        String backgroundColor = classifiedInfo2 != null ? classifiedInfo2.getBackgroundColor() : null;
        GalleryV3DTO.ClassifiedInfo classifiedInfo3 = galleryV3DTO.getClassifiedInfo();
        return new GalleryV3VO.ClassifiedDetails(booleanValue, dsTextAtom$default, backgroundColor, (classifiedInfo3 == null || (backgroundAlpha = classifiedInfo3.getBackgroundAlpha()) == null) ? 0.9f : backgroundAlpha.floatValue());
    }

    private final TokenizedVideoEvents toVideoTokenizedEvents(GalleryV3DTO.GalleryItem.VideoTrackingInfo videoTrackingInfo, long j11) {
        Map<String, TokenizedTrackingInfo> openVideo = videoTrackingInfo.getOpenVideo();
        t tokenizedEvent$default = openVideo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(openVideo, Long.valueOf(j11), null, 2, null) : null;
        Map<String, TokenizedTrackingInfo> startVideo = videoTrackingInfo.getStartVideo();
        t tokenizedEvent$default2 = startVideo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(startVideo, Long.valueOf(j11), null, 2, null) : null;
        Map<String, TokenizedTrackingInfo> endVideo = videoTrackingInfo.getEndVideo();
        return new TokenizedVideoEvents(tokenizedEvent$default, tokenizedEvent$default2, endVideo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(endVideo, Long.valueOf(j11), null, 2, null) : null);
    }

    private final GalleryV3VO.Item toVo(GalleryV3DTO.GalleryItem galleryItem, long j11, boolean z11, boolean z12, Function1<? super Boolean, Unit> function1) {
        if (galleryItem instanceof GalleryV3DTO.GalleryItem.Image) {
            GalleryV3DTO.GalleryItem.Image image = (GalleryV3DTO.GalleryItem.Image) galleryItem;
            String url = image.getUrl();
            Boolean isBorderless = image.isBorderless();
            boolean booleanValue = isBorderless != null ? isBorderless.booleanValue() : false;
            Float alpha = image.getAlpha();
            float floatValue = alpha != null ? alpha.floatValue() : 1.0f;
            Map<String, TokenizedTrackingInfo> trackingInfo = image.getTrackingInfo();
            return new GalleryV3VO.Item.Photo(url, booleanValue, floatValue, z11, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null, z12);
        }
        if (galleryItem instanceof GalleryV3DTO.GalleryItem.Photo360) {
            GalleryV3DTO.GalleryItem.Photo360 photo360 = (GalleryV3DTO.GalleryItem.Photo360) galleryItem;
            String coverImage = photo360.getCoverImage();
            String description = photo360.getDescription();
            ButtonV3Atom.SmallButton button = photo360.getButton();
            Map<String, TokenizedTrackingInfo> trackingInfo2 = photo360.getTrackingInfo();
            return new GalleryV3VO.Item.Photo360(coverImage, description, button, trackingInfo2 != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo2, Long.valueOf(j11), null, 2, null) : null, z12);
        }
        if (!(galleryItem instanceof GalleryV3DTO.GalleryItem.OzonVideo)) {
            throw new o();
        }
        function1.invoke(Boolean.TRUE);
        GalleryV3DTO.GalleryItem.OzonVideo ozonVideo = (GalleryV3DTO.GalleryItem.OzonVideo) galleryItem;
        VideoMolecule video = ozonVideo.getVideo();
        Boolean isAutoplay = ozonVideo.isAutoplay();
        boolean booleanValue2 = isAutoplay != null ? isAutoplay.booleanValue() : false;
        String previewUrl = ozonVideo.getPreviewUrl();
        Map<String, TokenizedTrackingInfo> trackingInfo3 = ozonVideo.getTrackingInfo();
        t tokenizedEvent$default = trackingInfo3 != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo3, Long.valueOf(j11), null, 2, null) : null;
        GalleryV3DTO.GalleryItem.VideoTrackingInfo videoTrackingInfo = ozonVideo.getVideoTrackingInfo();
        return new GalleryV3VO.Item.OzonVideo(video, previewUrl, booleanValue2, videoTrackingInfo != null ? toVideoTokenizedEvents(videoTrackingInfo, j11) : null, tokenizedEvent$default, z12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6, types: [kotlin.collections.K] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<GalleryV3VO> invoke(@NotNull GalleryV3DTO state, @NotNull d widgetInfo) {
        ?? r22;
        e h11;
        String j11;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        Boolean isParandjaEnabled = state.isParandjaEnabled();
        boolean z11 = false;
        boolean booleanValue = isParandjaEnabled != null ? isParandjaEnabled.booleanValue() : false;
        I i11 = new I();
        a b11 = widgetInfo.b();
        if (b11 != null && (h11 = b11.h()) != null && (j11 = h11.j()) != null) {
            z11 = GalleryV3MapperKt.getCanShowApparelTheme(j11);
        }
        boolean z12 = z11;
        List<GalleryV3DTO.GalleryItem> items = state.getItems();
        ArrayList arrayList = new ArrayList(C7714v.z(items, 10));
        Iterator it = items.iterator();
        while (it.hasNext()) {
            long j12 = hashCode;
            arrayList.add(toVo((GalleryV3DTO.GalleryItem) it.next(), j12, booleanValue, z12, new GalleryV3Mapper$invoke$items$1$1(i11)));
            hashCode = j12;
        }
        long j13 = hashCode;
        List<Badge> badges = state.getBadges();
        if (badges != null) {
            List<Badge> list = badges;
            r22 = new ArrayList(C7714v.z(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                r22.add(BadgeMapperKt.mapToDsBadge((Badge) it2.next()));
            }
        } else {
            r22 = 0;
        }
        if (r22 == 0) {
            r22 = K.f71697a;
        }
        List list2 = r22;
        GalleryV3VO.Buttons vo = toVo(state.getButtons(), i11.f71783a);
        GalleryV3DTO.Ratio ratio = state.getRatio();
        List<GalleryV3VO> a02 = C7714v.a0(new GalleryV3VO(j13, arrayList, list2, vo, ratio != null ? toVo(ratio) : null, extractClassifiedDetails(state), toVo(state.getTrackingInfo(), j13)));
        this.imagePrefetcher.prefetch(this.context, a02);
        return a02;
    }

    private final Float toVo(GalleryV3DTO.Ratio ratio) {
        Float width = ratio.getWidth();
        float floatValue = width != null ? width.floatValue() : 0.0f;
        Float height = ratio.getHeight();
        float floatValue2 = height != null ? height.floatValue() : 0.0f;
        if (floatValue == 0.0f || floatValue2 == 0.0f) {
            return null;
        }
        return Float.valueOf(floatValue2 / floatValue);
    }

    private final GalleryV3VO.Analytics toVo(GalleryV3DTO.TrackingInfoWrapper trackingInfoWrapper, long j11) {
        Map<String, TokenizedTrackingInfo> popupClose;
        Map<String, TokenizedTrackingInfo> popup;
        Map<String, TokenizedTrackingInfo> gallery;
        t tVar = null;
        t tokenizedEvent$default = (trackingInfoWrapper == null || (gallery = trackingInfoWrapper.getGallery()) == null) ? null : TrackingInfoMapperKt.toTokenizedEvent$default(gallery, Long.valueOf(j11), null, 2, null);
        t tokenizedEvent$default2 = (trackingInfoWrapper == null || (popup = trackingInfoWrapper.getPopup()) == null) ? null : TrackingInfoMapperKt.toTokenizedEvent$default(popup, Long.valueOf(j11), null, 2, null);
        if (trackingInfoWrapper != null && (popupClose = trackingInfoWrapper.getPopupClose()) != null) {
            tVar = TrackingInfoMapperKt.toTokenizedEvent$default(popupClose, Long.valueOf(j11), null, 2, null);
        }
        return new GalleryV3VO.Analytics(tokenizedEvent$default, tokenizedEvent$default2, tVar);
    }

    private final GalleryV3VO.Buttons toVo(List<ButtonV3Atom.LargeIconButton> list, boolean z11) {
        ArrayList arrayList;
        ArrayList arrayList2;
        if (z11) {
            arrayList = C7714v.m0(new GalleryButtonsVO.GalleryFullViewButtonVO(GalleryButtonType.FULL_VIEW.ordinal()));
            arrayList.add(0, new GalleryButtonsVO.GallerySoundButtonVO(GalleryButtonType.SOUND.ordinal()));
        } else {
            arrayList = null;
        }
        if (list != null) {
            List<ButtonV3Atom.LargeIconButton> list2 = list;
            arrayList2 = new ArrayList(C7714v.z(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList2.add(new GalleryButtonsVO.GalleryButtonVO(GalleryButtonType.BUTTON.ordinal(), (ButtonV3Atom.LargeIconButton) it.next()));
            }
        } else {
            arrayList2 = null;
        }
        if (arrayList == null && arrayList2 == null) {
            return null;
        }
        return new GalleryV3VO.Buttons(new GalleryV3VO.VideoButtons(0, arrayList), arrayList2);
    }
}
