package ru.ozon.app.android.pdpoldwidgets.widgets.galleryV2.core;

import O7.h;
import WZ.t;
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
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.pdpoldwidgets.widgets.galleryV2.data.GalleryV2DTO;
import ru.ozon.app.android.pdpoldwidgets.widgets.galleryV2.presentation.GalleryV2VO;
import ru.ozon.app.android.pdpoldwidgets.widgets.galleryV2.presentation.GalleryV2Wrapper;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.v3.mappers.TextMapperKt;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/galleryV2/core/GalleryV2Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/pdpoldwidgets/widgets/galleryV2/data/GalleryV2DTO;", "Ll20/d;", "", "Lru/ozon/app/android/pdpoldwidgets/widgets/galleryV2/presentation/GalleryV2Wrapper;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/pdpoldwidgets/widgets/galleryV2/data/GalleryV2DTO$ClassifiedInfo;", "Lru/ozon/app/android/pdpoldwidgets/widgets/galleryV2/presentation/GalleryV2VO$ClassifiedInfoVO;", "toClassifiedInfoVO", "(Lru/ozon/app/android/pdpoldwidgets/widgets/galleryV2/data/GalleryV2DTO$ClassifiedInfo;)Lru/ozon/app/android/pdpoldwidgets/widgets/galleryV2/presentation/GalleryV2VO$ClassifiedInfoVO;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/pdpoldwidgets/widgets/galleryV2/data/GalleryV2DTO;Ll20/d;)Ljava/util/List;", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GalleryV2Mapper implements Function2<GalleryV2DTO, d, List<? extends GalleryV2Wrapper>> {
    private final GalleryV2VO.ClassifiedInfoVO toClassifiedInfoVO(GalleryV2DTO.ClassifiedInfo classifiedInfo) {
        TextAtom classifiedText = classifiedInfo.getClassifiedText();
        return new GalleryV2VO.ClassifiedInfoVO(classifiedText != null ? TextMapperKt.dsTextAtom$default(classifiedText, null, null, null, null, CommonCellSettings.LayoutPadding.PADDING_250, null, null, null, null, null, null, false, 4079, null) : null, classifiedInfo.getBackgroundColor(), classifiedInfo.getBackgroundAlpha());
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f7  */
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List<GalleryV2Wrapper> invoke(@NotNull GalleryV2DTO state, @NotNull d widgetInfo) {
        t tVar;
        Float f7;
        Map<String, Map<String, TokenizedTrackingInfo>> trackingInfo;
        Map<String, TokenizedTrackingInfo> map;
        Map<String, TokenizedTrackingInfo> map2;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = state.getImages().iterator();
        while (true) {
            tVar = null;
            if (!it.hasNext()) {
                break;
            }
            GalleryV2DTO.ImageDTO imageDTO = (GalleryV2DTO.ImageDTO) it.next();
            String url = imageDTO.getUrl();
            Float imageAlpha = state.getImageAlpha();
            float floatValue = imageAlpha != null ? imageAlpha.floatValue() : 1.0f;
            Boolean isBorderless = state.isBorderless();
            boolean booleanValue = isBorderless != null ? isBorderless.booleanValue() : false;
            Boolean isParandjaEnabled = state.isParandjaEnabled();
            boolean booleanValue2 = isParandjaEnabled != null ? isParandjaEnabled.booleanValue() : false;
            Map<String, TokenizedTrackingInfo> trackingInfo2 = imageDTO.getTrackingInfo();
            if (trackingInfo2 != null) {
                tVar = TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo2, Long.valueOf(hashCode), null, 2, null);
            }
            arrayList.add(new GalleryV2VO.ImageGalleryItem(url, null, booleanValue, booleanValue2, floatValue, tVar, 2, null));
        }
        GalleryV2DTO.Photo360 photo360 = state.getPhoto360();
        if (photo360 != null) {
            String coverImage = photo360.getCoverImage();
            String description = photo360.getDescription();
            ButtonV3Atom.SmallButton button = photo360.getButton();
            Map<String, TokenizedTrackingInfo> trackingInfo3 = photo360.getButton().getTrackingInfo();
            arrayList.add(new GalleryV2VO.Photo360Item(coverImage, null, description, button, trackingInfo3 != null ? h.k(trackingInfo3, Long.valueOf(hashCode)) : null, 2, null));
        }
        GalleryV2DTO.Ratio ratio = state.getRatio();
        if (ratio != null) {
            if (ratio.getHeight() == null || ratio.getWidth() == null) {
                ratio = null;
            }
            if (ratio != null) {
                Float height = ratio.getHeight();
                Intrinsics.f(height);
                float floatValue2 = height.floatValue();
                Float width = ratio.getWidth();
                Intrinsics.f(width);
                f7 = Float.valueOf(floatValue2 / width.floatValue());
                List<Badge> badges = state.getBadges();
                List<ButtonV3Atom.LargeIconButton> buttons = state.getButtons();
                Boolean isClassified = state.isClassified();
                boolean booleanValue3 = isClassified == null ? isClassified.booleanValue() : false;
                GalleryV2DTO.ClassifiedInfo classifiedInfo = state.getClassifiedInfo();
                GalleryV2VO.ClassifiedInfoVO classifiedInfoVO = classifiedInfo == null ? toClassifiedInfoVO(classifiedInfo) : null;
                Boolean isBorderless2 = state.isBorderless();
                boolean booleanValue4 = isBorderless2 != null ? isBorderless2.booleanValue() : false;
                Map<String, Map<String, TokenizedTrackingInfo>> trackingInfo4 = state.getTrackingInfo();
                t tokenizedEvent$default = (trackingInfo4 != null || (map2 = trackingInfo4.get("gallery")) == null) ? null : TrackingInfoMapperKt.toTokenizedEvent$default(map2, Long.valueOf(hashCode), null, 2, null);
                trackingInfo = state.getTrackingInfo();
                if (trackingInfo != null && (map = trackingInfo.get("popup")) != null) {
                    tVar = TrackingInfoMapperKt.toTokenizedEvent$default(map, Long.valueOf(hashCode), null, 2, null);
                }
                GalleryV2VO galleryV2VO = new GalleryV2VO(hashCode, arrayList, badges, buttons, f7, booleanValue4, tokenizedEvent$default, tVar, state.isEmptyGallery(), booleanValue3, classifiedInfoVO, state.getBackgroundColor());
                return C7714v.a0(new GalleryV2Wrapper(galleryV2VO.getId(), galleryV2VO));
            }
        }
        f7 = null;
        List<Badge> badges2 = state.getBadges();
        List<ButtonV3Atom.LargeIconButton> buttons2 = state.getButtons();
        Boolean isClassified2 = state.isClassified();
        if (isClassified2 == null) {
        }
        GalleryV2DTO.ClassifiedInfo classifiedInfo2 = state.getClassifiedInfo();
        if (classifiedInfo2 == null) {
        }
        Boolean isBorderless22 = state.isBorderless();
        if (isBorderless22 != null) {
        }
        Map<String, Map<String, TokenizedTrackingInfo>> trackingInfo42 = state.getTrackingInfo();
        if (trackingInfo42 != null) {
        }
        trackingInfo = state.getTrackingInfo();
        if (trackingInfo != null) {
            tVar = TrackingInfoMapperKt.toTokenizedEvent$default(map, Long.valueOf(hashCode), null, 2, null);
        }
        GalleryV2VO galleryV2VO2 = new GalleryV2VO(hashCode, arrayList, badges2, buttons2, f7, booleanValue4, tokenizedEvent$default, tVar, state.isEmptyGallery(), booleanValue3, classifiedInfoVO, state.getBackgroundColor());
        return C7714v.a0(new GalleryV2Wrapper(galleryV2VO2.getId(), galleryV2VO2));
    }
}
