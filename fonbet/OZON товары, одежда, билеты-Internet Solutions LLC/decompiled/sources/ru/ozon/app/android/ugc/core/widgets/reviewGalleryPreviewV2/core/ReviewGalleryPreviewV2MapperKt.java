package ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.core;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.pdp.ui.configurators.ugc.data.ReviewGalleryPreviewResponse;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation.ReviewGalleryPreviewV2VO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u001a\u001b\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"toVO", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/ReviewGalleryPreviewV2VO$ItemVO;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/data/ReviewGalleryPreviewResponse$ItemDTO;", "id", "", "(Lru/ozon/app/android/pdp/ui/configurators/ugc/data/ReviewGalleryPreviewResponse$ItemDTO;Ljava/lang/Long;)Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/ReviewGalleryPreviewV2VO$ItemVO;", "core_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewGalleryPreviewV2MapperKt {
    @NotNull
    public static final ReviewGalleryPreviewV2VO.ItemVO toVO(@NotNull ReviewGalleryPreviewResponse.ItemDTO itemDTO, Long l11) {
        Intrinsics.checkNotNullParameter(itemDTO, "<this>");
        ImageDTO image = itemDTO.getImage();
        AtomAction atomAction = AtomActionMapperKt.toAtomAction(itemDTO.getAction(), itemDTO.getImage().getTrackingInfo());
        IconButtonV3DTO icon = itemDTO.getIcon();
        TextDTO text = itemDTO.getText();
        Map<String, TokenizedTrackingInfo> trackingInfo = itemDTO.getImage().getTrackingInfo();
        return new ReviewGalleryPreviewV2VO.ItemVO(image, atomAction, icon, text, trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, l11, null, 2, null) : null, itemDTO.getVideoInfo());
    }
}
