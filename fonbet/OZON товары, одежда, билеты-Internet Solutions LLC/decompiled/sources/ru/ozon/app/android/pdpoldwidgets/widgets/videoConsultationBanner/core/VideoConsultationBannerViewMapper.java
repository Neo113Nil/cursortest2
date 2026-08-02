package ru.ozon.app.android.pdpoldwidgets.widgets.videoConsultationBanner.core;

import android.view.View;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.composer.widgets.base.WidgetViewMapper;
import ru.ozon.app.android.pdpoldwidgets.R$layout;
import ru.ozon.app.android.pdpoldwidgets.widgets.videoConsultationBanner.data.VideoConsultationBannerDTO;
import ru.ozon.app.android.pdpoldwidgets.widgets.videoConsultationBanner.presentation.VideoConsultationBannerVO;
import ru.ozon.app.android.pdpoldwidgets.widgets.videoConsultationBanner.presentation.VideoConsultationBannerWidgetViewHolder;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.v3.mappers.TextMapperKt;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001cB\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nR2\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\r0\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R,\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u000f\u001a\u0004\b\u001b\u0010\u0011¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/videoConsultationBanner/core/VideoConsultationBannerViewMapper;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewMapper;", "Lru/ozon/app/android/pdpoldwidgets/widgets/videoConsultationBanner/data/VideoConsultationBannerDTO;", "Lru/ozon/app/android/pdpoldwidgets/widgets/videoConsultationBanner/presentation/VideoConsultationBannerVO;", "<init>", "()V", "dto", "", "id", "mapToVO", "(Lru/ozon/app/android/pdpoldwidgets/widgets/videoConsultationBanner/data/VideoConsultationBannerDTO;J)Lru/ozon/app/android/pdpoldwidgets/widgets/videoConsultationBanner/presentation/VideoConsultationBannerVO;", "Lkotlin/Function2;", "Ll20/d;", "", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/pdpoldwidgets/widgets/videoConsultationBanner/presentation/VideoConsultationBannerWidgetViewHolder;", "holderProducer", "getHolderProducer", "Companion", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class VideoConsultationBannerViewMapper extends WidgetViewMapper<VideoConsultationBannerDTO, VideoConsultationBannerVO> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final Function2<VideoConsultationBannerDTO, d, List<VideoConsultationBannerVO>> mapper = new VideoConsultationBannerViewMapper$mapper$1(this);
    private final int layout = R$layout.widget_video_consultation_banner;

    @NotNull
    private final Function2<View, ComposerReferences, VideoConsultationBannerWidgetViewHolder> holderProducer = VideoConsultationBannerViewMapper$holderProducer$1.INSTANCE;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/videoConsultationBanner/core/VideoConsultationBannerViewMapper$Companion;", "", "<init>", "()V", "BODY_MAX_LINES", "", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final VideoConsultationBannerVO mapToVO(VideoConsultationBannerDTO dto, long id2) {
        TextDTO dsTextAtom = TextMapperKt.getDsTextAtom(dto.getHeader());
        TextDTO dsTextAtom$default = TextMapperKt.dsTextAtom$default(dto.getBody(), null, null, null, null, null, null, null, null, null, 3, null, false, 3583, null);
        String productImage = dto.getProductImage();
        ButtonV3Atom.SmallButton mainActionButton = dto.getMainActionButton();
        ButtonV3Atom.SmallBorderlessButton secondaryActionButton = dto.getSecondaryActionButton();
        TextAtom footer = dto.getFooter();
        TextDTO dsTextAtom2 = footer != null ? TextMapperKt.getDsTextAtom(footer) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = dto.getTrackingInfo();
        return new VideoConsultationBannerVO(id2, dsTextAtom, dsTextAtom$default, productImage, mainActionButton, secondaryActionButton, dsTextAtom2, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(id2), null, 2, null) : null);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<VideoConsultationBannerVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<VideoConsultationBannerDTO, d, List<VideoConsultationBannerVO>> getMapper() {
        return this.mapper;
    }
}
