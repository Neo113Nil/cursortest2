package ru.ozon.app.android.pdpoldwidgets.widgets.videoConsultationBanner.core;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import ru.ozon.app.android.pdpoldwidgets.widgets.videoConsultationBanner.data.VideoConsultationBannerDTO;
import ru.ozon.app.android.pdpoldwidgets.widgets.videoConsultationBanner.presentation.VideoConsultationBannerVO;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/videoConsultationBanner/data/VideoConsultationBannerDTO;", "dto", "Ll20/d;", "info", "", "Lru/ozon/app/android/pdpoldwidgets/widgets/videoConsultationBanner/presentation/VideoConsultationBannerVO;", "invoke", "(Lru/ozon/app/android/pdpoldwidgets/widgets/videoConsultationBanner/data/VideoConsultationBannerDTO;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class VideoConsultationBannerViewMapper$mapper$1 extends AbstractC7737t implements Function2<VideoConsultationBannerDTO, d, List<? extends VideoConsultationBannerVO>> {
    final /* synthetic */ VideoConsultationBannerViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VideoConsultationBannerViewMapper$mapper$1(VideoConsultationBannerViewMapper videoConsultationBannerViewMapper) {
        super(2);
        this.this$0 = videoConsultationBannerViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final List<VideoConsultationBannerVO> invoke(VideoConsultationBannerDTO dto, d info) {
        VideoConsultationBannerVO mapToVO;
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(info, "info");
        mapToVO = this.this$0.mapToVO(dto, info.d().hashCode());
        return C7714v.a0(mapToVO);
    }
}
