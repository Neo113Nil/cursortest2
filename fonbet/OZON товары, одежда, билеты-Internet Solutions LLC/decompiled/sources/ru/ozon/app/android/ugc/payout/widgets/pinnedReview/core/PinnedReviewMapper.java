package ru.ozon.app.android.ugc.payout.widgets.pinnedReview.core;

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
import ru.ozon.app.android.ugc.payout.widgets.pinnedReview.data.FooterControlDTO;
import ru.ozon.app.android.ugc.payout.widgets.pinnedReview.data.PinnedReviewDTO;
import ru.ozon.app.android.ugc.payout.widgets.pinnedReview.data.PinnedReviewDTOKt;
import ru.ozon.app.android.ugc.payout.widgets.pinnedReview.data.ReviewBodyDTO;
import ru.ozon.app.android.ugc.payout.widgets.pinnedReview.presentation.PinnedReviewFooter;
import ru.ozon.app.android.ugc.payout.widgets.pinnedReview.presentation.PinnedReviewVO;
import ru.ozon.app.android.ugc.payout.widgets.pinnedReview.presentation.ReviewBodyVO;
import ru.ozon.app.android.ugc.payout.widgets.pinnedReview.presentation.ReviewBodyVOKt;
import ru.ozon.app.android.ugc.payout.widgets.pinnedReview.presentation.ReviewHeaderVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.cell.IconTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.rating.RatingDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/core/PinnedReviewMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/data/PinnedReviewDTO;", "Ll20/d;", "", "Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/presentation/PinnedReviewVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/data/PinnedReviewDTO;Ll20/d;)Ljava/util/List;", "payout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PinnedReviewMapper implements Function2<PinnedReviewDTO, d, List<? extends PinnedReviewVO>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<PinnedReviewVO> invoke(@NotNull PinnedReviewDTO state, @NotNull d widgetInfo) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        RatingDTO rating = state.getReviewHeader().getRating();
        IconDTO image = state.getReviewHeader().getImage();
        TextDTO title = state.getReviewHeader().getTitle();
        TextDTO date = state.getReviewHeader().getDate();
        AtomActionDTO action = state.getReviewHeader().getAction();
        ReviewHeaderVO reviewHeaderVO = new ReviewHeaderVO(rating, image, title, date, null, null, action != null ? AtomActionMapperKt.toAtomAction(action, state.getTrackingInfo()) : null, 32, null);
        List<IconTitleSubtitleCellDTO> content = state.getReviewBody().getContent();
        List<ReviewBodyDTO.MediaDTO> mediaPreviews = state.getReviewBody().getMediaPreviews();
        if (mediaPreviews != null) {
            List<ReviewBodyDTO.MediaDTO> list = mediaPreviews;
            arrayList = new ArrayList(C7714v.z(list, 10));
            for (ReviewBodyDTO.MediaDTO mediaDTO : list) {
                arrayList.add(ReviewBodyVOKt.toVO(mediaDTO, mediaDTO.getTrackingInfo()));
            }
        } else {
            arrayList = null;
        }
        List<TextDTO> contextReviews = state.getReviewBody().getContextReviews();
        if (contextReviews != null) {
            List<TextDTO> list2 = contextReviews;
            arrayList2 = new ArrayList(C7714v.z(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList2.add(TextDTO.copy$default((TextDTO) it.next(), null, null, null, null, null, null, null, null, null, null, null, null, null, true, null, null, null, null, null, 516095, null));
            }
        } else {
            arrayList2 = null;
        }
        ReviewBodyVO reviewBodyVO = new ReviewBodyVO(content, arrayList, arrayList2, state.getReviewBody().getBadges());
        FooterControlDTO like = state.getReviewFooter().getLike();
        FooterControlDTO disableIfHasNotAction = like != null ? PinnedReviewDTOKt.disableIfHasNotAction(like) : null;
        FooterControlDTO dislike = state.getReviewFooter().getDislike();
        PinnedReviewFooter pinnedReviewFooter = new PinnedReviewFooter(disableIfHasNotAction, dislike != null ? PinnedReviewDTOKt.disableIfHasNotAction(dislike) : null, state.getReviewFooter().getAdditionalAction());
        boolean isCollapsed = state.isCollapsed();
        AtomActionDTO action2 = state.getAction();
        AtomAction atomAction = action2 != null ? AtomActionMapperKt.toAtomAction(action2, state.getTrackingInfo()) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        t tokenizedEvent$default = trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null;
        CornerRadius cornerRadius = state.getCornerRadius();
        if (cornerRadius == null) {
            cornerRadius = CornerRadius.RADIUS_500;
        }
        return C7714v.a0(new PinnedReviewVO(hashCode, reviewHeaderVO, reviewBodyVO, pinnedReviewFooter, isCollapsed, atomAction, tokenizedEvent$default, cornerRadius));
    }
}
