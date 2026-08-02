package ru.ozon.app.android.pdp.widgets.galleryFullView.core;

import Sc.o;
import WZ.t;
import android.content.Context;
import android.util.Size;
import hd.C6915b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.pdp.utils.AtomActionExtKt;
import ru.ozon.app.android.pdp.widgets.galleryFullView.data.GalleryFullViewDTO;
import ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.GalleryFullViewVO;
import ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.fullView.GalleryFullViewItemDecorator;
import ru.ozon.app.android.pdp.widgets.galleryV4.presentation.GalleryV4VO;
import ru.ozon.app.android.pdp.widgets.galleryV4.utils.GalleryV4Utils;
import ru.ozon.app.android.pdpvideomolecule.data.VideoMolecule;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.v3.mappers.TextMapperKt;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u001d2*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u00062\u00020\u0007:\u0001\u001dB\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0016\u001a\u00020\u0015*\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u001a\u001a\u00020\u0019*\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001c¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryFullView/core/GalleryFullViewMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/pdp/widgets/galleryFullView/data/GalleryFullViewDTO;", "Ll20/d;", "", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Lru/ozon/app/android/pdp/widgets/galleryV4/utils/GalleryV4Utils;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/pdp/widgets/galleryFullView/data/GalleryFullViewDTO;Ll20/d;)Ljava/util/List;", "Lru/ozon/app/android/pdp/widgets/galleryFullView/data/GalleryFullViewDTO$GalleryItemDTO;", "", "widgetId", "", "galleryId", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewVO$GalleryItemVO;", "toVo", "(Lru/ozon/app/android/pdp/widgets/galleryFullView/data/GalleryFullViewDTO$GalleryItemDTO;JLjava/lang/String;)Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewVO$GalleryItemVO;", "Lru/ozon/app/android/pdp/widgets/galleryFullView/data/GalleryFullViewDTO$VideoTrackingInfo;", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewVO$VideoTrackingInfo;", "toVideoTokenizedEvents", "(Lru/ozon/app/android/pdp/widgets/galleryFullView/data/GalleryFullViewDTO$VideoTrackingInfo;J)Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewVO$VideoTrackingInfo;", "Landroid/content/Context;", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GalleryFullViewMapper implements Function2<GalleryFullViewDTO, d, List<? extends GalleryFullViewVO>>, GalleryV4Utils {

    @NotNull
    private final Context context;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryFullView/core/GalleryFullViewMapper$Companion;", "", "<init>", "()V", "DEFAULT_GALLERY_RATIO", "", "DEFAULT_GALLERY_360_RATIO", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public GalleryFullViewMapper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final GalleryFullViewVO.VideoTrackingInfo toVideoTokenizedEvents(GalleryFullViewDTO.VideoTrackingInfo videoTrackingInfo, long j11) {
        Map<String, TokenizedTrackingInfo> startVideo = videoTrackingInfo.getStartVideo();
        t tokenizedEvent$default = startVideo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(startVideo, Long.valueOf(j11), null, 2, null) : null;
        Map<String, TokenizedTrackingInfo> endVideo = videoTrackingInfo.getEndVideo();
        return new GalleryFullViewVO.VideoTrackingInfo(tokenizedEvent$default, endVideo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(endVideo, Long.valueOf(j11), null, 2, null) : null);
    }

    private final GalleryFullViewVO.GalleryItemVO toVo(GalleryFullViewDTO.GalleryItemDTO galleryItemDTO, long j11, String str) {
        GalleryFullViewDTO.GalleryItem content = galleryItemDTO.getContent();
        if (content instanceof GalleryFullViewDTO.GalleryItem.Image) {
            Double containerRatio = galleryItemDTO.getContainerRatio();
            double doubleValue = containerRatio != null ? containerRatio.doubleValue() : 0.75d;
            String url = ((GalleryFullViewDTO.GalleryItem.Image) galleryItemDTO.getContent()).getUrl();
            int b11 = C6915b.b((this.context.getResources().getDisplayMetrics().widthPixels - GalleryFullViewItemDecorator.INSTANCE.getGalleryOffset()) / doubleValue);
            Map<String, TokenizedTrackingInfo> trackingInfo = galleryItemDTO.getTrackingInfo();
            return new GalleryFullViewVO.GalleryItemVO.Image(url, str, b11, doubleValue, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null);
        }
        if (content instanceof GalleryFullViewDTO.GalleryItem.Photo360) {
            String previewUrl = ((GalleryFullViewDTO.GalleryItem.Photo360) galleryItemDTO.getContent()).getPreviewUrl();
            ButtonV3Atom.SmallButton button = ((GalleryFullViewDTO.GalleryItem.Photo360) galleryItemDTO.getContent()).getButton();
            AtomActionDTO action = ((GalleryFullViewDTO.GalleryItem.Photo360) galleryItemDTO.getContent()).getButton().getAction();
            ButtonV3Atom.SmallButton copy$default = ButtonV3Atom.SmallButton.copy$default(button, null, null, null, action != null ? AtomActionExtKt.withUrlEncodedParameter$default(action, ((GalleryFullViewDTO.GalleryItem.Photo360) galleryItemDTO.getContent()).getTemplateLink(), ((GalleryFullViewDTO.GalleryItem.Photo360) galleryItemDTO.getContent()).getPlaceholderValue(), null, 4, null) : null, null, null, null, 119, null);
            String backgroundColor = ((GalleryFullViewDTO.GalleryItem.Photo360) galleryItemDTO.getContent()).getBackgroundColor();
            Icon miniIcon = ((GalleryFullViewDTO.GalleryItem.Photo360) galleryItemDTO.getContent()).getMiniIcon();
            Double containerRatio2 = galleryItemDTO.getContainerRatio();
            Double valueOf = Double.valueOf(containerRatio2 != null ? containerRatio2.doubleValue() : 1.0d);
            Map<String, TokenizedTrackingInfo> trackingInfo2 = galleryItemDTO.getTrackingInfo();
            return new GalleryFullViewVO.GalleryItemVO.Photo360(previewUrl, copy$default, backgroundColor, miniIcon, valueOf, trackingInfo2 != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo2, Long.valueOf(j11), null, 2, null) : null);
        }
        if (content instanceof GalleryFullViewDTO.GalleryItem.Video) {
            VideoMolecule video = ((GalleryFullViewDTO.GalleryItem.Video) galleryItemDTO.getContent()).getVideo();
            String previewUrl2 = ((GalleryFullViewDTO.GalleryItem.Video) galleryItemDTO.getContent()).getPreviewUrl();
            GalleryFullViewDTO.VideoTrackingInfo videoTrackingInfo = ((GalleryFullViewDTO.GalleryItem.Video) galleryItemDTO.getContent()).getVideoTrackingInfo();
            GalleryFullViewVO.VideoTrackingInfo videoTokenizedEvents = videoTrackingInfo != null ? toVideoTokenizedEvents(videoTrackingInfo, j11) : null;
            Double containerRatio3 = galleryItemDTO.getContainerRatio();
            Map<String, TokenizedTrackingInfo> trackingInfo3 = galleryItemDTO.getTrackingInfo();
            return new GalleryFullViewVO.GalleryItemVO.Video(str, video, previewUrl2, videoTokenizedEvents, containerRatio3, trackingInfo3 != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo3, Long.valueOf(j11), null, 2, null) : null);
        }
        if (!(content instanceof GalleryFullViewDTO.GalleryItem.Ugc)) {
            throw new o();
        }
        String previewUrl3 = ((GalleryFullViewDTO.GalleryItem.Ugc) galleryItemDTO.getContent()).getPreviewUrl();
        Icon previewIcon = ((GalleryFullViewDTO.GalleryItem.Ugc) galleryItemDTO.getContent()).getPreviewIcon();
        GalleryV4VO.GalleryIcon icon = previewIcon != null ? toIcon(previewIcon, this.context) : null;
        TextDTO dsTextAtom = TextMapperKt.getDsTextAtom(((GalleryFullViewDTO.GalleryItem.Ugc) galleryItemDTO.getContent()).getTitle());
        GalleryV4VO.GalleryIcon icon2 = toIcon(((GalleryFullViewDTO.GalleryItem.Ugc) galleryItemDTO.getContent()).getTitleIcon(), this.context);
        TextDTO dsTextAtom2 = TextMapperKt.getDsTextAtom(((GalleryFullViewDTO.GalleryItem.Ugc) galleryItemDTO.getContent()).getSubtitle());
        String backgroundColor2 = ((GalleryFullViewDTO.GalleryItem.Ugc) galleryItemDTO.getContent()).getBackgroundColor();
        AtomActionDTO action2 = ((GalleryFullViewDTO.GalleryItem.Ugc) galleryItemDTO.getContent()).getAction();
        AtomAction atomAction = action2 != null ? AtomActionMapperKt.toAtomAction(action2, galleryItemDTO.getTrackingInfo()) : null;
        Icon miniIcon2 = ((GalleryFullViewDTO.GalleryItem.Ugc) galleryItemDTO.getContent()).getMiniIcon();
        TextAtom miniText = ((GalleryFullViewDTO.GalleryItem.Ugc) galleryItemDTO.getContent()).getMiniText();
        TextDTO dsTextAtom3 = miniText != null ? TextMapperKt.getDsTextAtom(miniText) : null;
        Double containerRatio4 = galleryItemDTO.getContainerRatio();
        Map<String, TokenizedTrackingInfo> trackingInfo4 = galleryItemDTO.getTrackingInfo();
        t tokenizedEvent$default = trackingInfo4 != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo4, Long.valueOf(j11), null, 2, null) : null;
        Double containerRatio5 = galleryItemDTO.getContainerRatio();
        return new GalleryFullViewVO.GalleryItemVO.Ugc(previewUrl3, icon, dsTextAtom, icon2, dsTextAtom2, atomAction, containerRatio4, tokenizedEvent$default, hasVerticalState(containerRatio5 != null ? containerRatio5.doubleValue() : getDefaultGalleryRatio()), new Size(-1, -1), backgroundColor2, dsTextAtom3, miniIcon2);
    }

    @Override // ru.ozon.app.android.pdp.widgets.galleryV4.utils.GalleryV4Utils
    public int calculateHeight(double d11, @NotNull Context context) {
        return GalleryV4Utils.DefaultImpls.calculateHeight(this, d11, context);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v4.GalleryV4Const
    public double getDefaultGalleryRatio() {
        return GalleryV4Utils.DefaultImpls.getDefaultGalleryRatio(this);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v4.GalleryV4Const
    public int getGalleryPadding() {
        return GalleryV4Utils.DefaultImpls.getGalleryPadding(this);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v4.GalleryV4Const
    public double getMaxRatio() {
        return GalleryV4Utils.DefaultImpls.getMaxRatio(this);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v4.GalleryV4Const
    public double getMaxVerticalStateRatio() {
        return GalleryV4Utils.DefaultImpls.getMaxVerticalStateRatio(this);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v4.GalleryV4Const
    public double getMinContainerRatio() {
        return GalleryV4Utils.DefaultImpls.getMinContainerRatio(this);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v4.GalleryV4Const
    public double getMinGalleryRatio() {
        return GalleryV4Utils.DefaultImpls.getMinGalleryRatio(this);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v4.GalleryV4Const
    public float getWavesAmount() {
        return GalleryV4Utils.DefaultImpls.getWavesAmount(this);
    }

    public boolean hasVerticalState(double d11) {
        return GalleryV4Utils.DefaultImpls.hasVerticalState(this, d11);
    }

    @NotNull
    public GalleryV4VO.GalleryIcon toIcon(@NotNull Icon icon, @NotNull Context context) {
        return GalleryV4Utils.DefaultImpls.toIcon(this, icon, context);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<GalleryFullViewVO> invoke(@NotNull GalleryFullViewDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        List<GalleryFullViewDTO.GalleryItemDTO> items = state.getItems();
        ArrayList arrayList = new ArrayList(C7714v.z(items, 10));
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(toVo((GalleryFullViewDTO.GalleryItemDTO) it.next(), hashCode, state.getGalleryId()));
        }
        String galleryId = state.getGalleryId();
        Double miniItemsRatio = state.getMiniItemsRatio();
        String backgroundColor = state.getBackgroundColor();
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        t tokenizedEvent$default = trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null;
        Map<String, TokenizedTrackingInfo> closeButtonTrackingInfo = state.getCloseButtonTrackingInfo();
        t tokenizedEvent$default2 = closeButtonTrackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(closeButtonTrackingInfo, Long.valueOf(hashCode), null, 2, null) : null;
        Map<String, TokenizedTrackingInfo> swipeDownCloseTrackingInfo = state.getSwipeDownCloseTrackingInfo();
        return C7714v.a0(new GalleryFullViewVO(hashCode, arrayList, galleryId, miniItemsRatio, backgroundColor, tokenizedEvent$default, tokenizedEvent$default2, swipeDownCloseTrackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(swipeDownCloseTrackingInfo, Long.valueOf(hashCode), null, 2, null) : null));
    }
}
