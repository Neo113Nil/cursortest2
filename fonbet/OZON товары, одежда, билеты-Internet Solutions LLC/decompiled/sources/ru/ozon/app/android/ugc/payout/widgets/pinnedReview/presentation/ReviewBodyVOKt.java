package ru.ozon.app.android.ugc.payout.widgets.pinnedReview.presentation;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.payout.widgets.pinnedReview.data.ReviewBodyDTO;
import ru.ozon.app.android.ugc.payout.widgets.pinnedReview.presentation.ReviewBodyVO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004H\u0000¨\u0006\u0007"}, d2 = {"toVO", "Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/presentation/ReviewBodyVO$MediaVO;", "Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/data/ReviewBodyDTO$MediaDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "payout_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewBodyVOKt {
    @NotNull
    public static final ReviewBodyVO.MediaVO toVO(@NotNull ReviewBodyDTO.MediaDTO mediaDTO, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(mediaDTO, "<this>");
        return new ReviewBodyVO.MediaVO(mediaDTO.getPreview(), AtomActionMapperKt.toAtomAction(mediaDTO.getAction(), map), mediaDTO.getVideoInfo());
    }
}
