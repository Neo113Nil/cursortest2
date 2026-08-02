package ru.ozon.app.android.storefront.widgets.playvideo.presentation.models;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.storefront.core.socialAtoms.productList.container.SocialProductListDTO;
import ru.ozon.app.android.storefront.core.socialAtoms.rightPanel.RightPanelDTO;
import ru.ozon.app.android.storefront.core.socialAtoms.rightPanel.RightPanelMapperKt;
import ru.ozon.app.android.storefront.core.socialAtoms.rightPanel.RightPanelVO;
import ru.ozon.app.android.storefront.widgets.playvideo.data.models.PlayVideoContent;
import ru.ozon.app.android.storefront.widgets.playvideo.data.models.PlayVideoDTO;
import ru.ozon.app.android.storefront.widgets.playvideo.data.models.PlayVideoTitle;
import ru.ozon.app.android.videomolecule.data.VideoMolecule;
import ru.ozon.app.android.videomolecule.presentation.rv.models.VideoMoleculeBottomContentModel;
import ru.ozon.app.android.videomolecule.presentation.rv.models.VideoMoleculeSocialListProduct;
import ru.ozon.app.android.videomolecule.presentation.rv.models.VideoMoleculeTitle;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002\u001a\u0014\u0010\t\u001a\u00020\n*\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\bH\u0002\u001a\u0014\u0010\f\u001a\u00020\r*\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\bH\u0002¨\u0006\u000f"}, d2 = {"toVO", "Lru/ozon/app/android/storefront/widgets/playvideo/presentation/models/PlayVideoVO;", "Lru/ozon/app/android/storefront/widgets/playvideo/data/models/PlayVideoDTO;", "extractBottomContent", "", "Lru/ozon/app/android/videomolecule/presentation/rv/models/VideoMoleculeBottomContentModel;", "Lru/ozon/app/android/storefront/widgets/playvideo/data/models/PlayVideoContent;", "widgetId", "", "mapToVo", "Lru/ozon/app/android/videomolecule/presentation/rv/models/VideoMoleculeTitle;", "Lru/ozon/app/android/storefront/widgets/playvideo/data/models/PlayVideoTitle;", "mapToVO", "Lru/ozon/app/android/videomolecule/presentation/rv/models/VideoMoleculeSocialListProduct;", "Lru/ozon/app/android/storefront/core/socialAtoms/productList/container/SocialProductListDTO;", "storefront_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MapperKt {
    private static final List<VideoMoleculeBottomContentModel> extractBottomContent(PlayVideoContent playVideoContent, long j11) {
        PlayVideoTitle title = playVideoContent.getTitle();
        VideoMoleculeTitle mapToVo = title != null ? mapToVo(title, j11) : null;
        SocialProductListDTO productList = playVideoContent.getProductList();
        VideoMoleculeBottomContentModel[] elements = {mapToVo, productList != null ? mapToVO(productList, j11) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return C7705l.B(elements);
    }

    private static final VideoMoleculeSocialListProduct mapToVO(SocialProductListDTO socialProductListDTO, long j11) {
        return new VideoMoleculeSocialListProduct(socialProductListDTO, j11);
    }

    private static final VideoMoleculeTitle mapToVo(PlayVideoTitle playVideoTitle, long j11) {
        return new VideoMoleculeTitle(playVideoTitle.getText(), playVideoTitle.getAction(), playVideoTitle.getTrackingInfo(), j11);
    }

    @NotNull
    public static final PlayVideoVO toVO(@NotNull PlayVideoDTO playVideoDTO) {
        RightPanelVO rightPanelVO;
        Intrinsics.checkNotNullParameter(playVideoDTO, "<this>");
        long hashCode = playVideoDTO.hashCode();
        VideoMolecule video = playVideoDTO.getVideo();
        PlayVideoTopContent playVideoTopContent = new PlayVideoTopContent(playVideoDTO.getContent().getCloseButton());
        RightPanelDTO rightPanel = playVideoDTO.getContent().getRightPanel();
        if (rightPanel == null || (rightPanelVO = RightPanelMapperKt.mapToVo(rightPanel, hashCode)) == null) {
            rightPanelVO = new RightPanelVO(K.f71697a);
        }
        RightPanelVO rightPanelVO2 = rightPanelVO;
        List<VideoMoleculeBottomContentModel> extractBottomContent = extractBottomContent(playVideoDTO.getContent(), hashCode);
        K k11 = K.f71697a;
        Map<String, TokenizedTrackingInfo> closeTrackingInfo = playVideoDTO.getCloseTrackingInfo();
        return new PlayVideoVO(hashCode, video, playVideoTopContent, rightPanelVO2, extractBottomContent, k11, closeTrackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(closeTrackingInfo, Long.valueOf(hashCode), null, 2, null) : null);
    }
}
