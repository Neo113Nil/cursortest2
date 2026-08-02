package ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.core;

import Hj.C3143a;
import WZ.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewProductTile.ReviewProductTileDTO;
import ru.ozon.app.android.pdpvideomolecule.data.VideoMolecule;
import ru.ozon.app.android.storefront.core.socialAtoms.iconButton.SocialIconButtonDTO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.ReviewGalleryVO;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000f\u001a\u00020\u000e*\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u000f\u001a\u00020\u0015*\u00020\u0014H\u0002¢\u0006\u0004\b\u000f\u0010\u0016J*\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0017\u001a\u00020\u00022\n\u0010\u0019\u001a\u00060\u0003j\u0002`\u0018H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u000f\u001a\u00020\u0005*\u00020\u001c2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000f\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/core/ReviewGalleryMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO;", "Ll20/d;", "", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Lru/ozon/app/android/utils/AppType;", "appType", "<init>", "(Lru/ozon/app/android/utils/AppType;)V", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$OnBackConfigDTO;", "", "id", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryVO$OnBackConfigVO;", "toVO", "(Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$OnBackConfigDTO;J)Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryVO$OnBackConfigVO;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$CommentFooterDTO;", "withResolvedCornerRadius", "(Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$CommentFooterDTO;)Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$CommentFooterDTO;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$SideButtonsDTO;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryVO$SideButtonsVO;", "(Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$SideButtonsDTO;)Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryVO$SideButtonsVO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO;Ll20/d;)Ljava/util/List;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item;", "onBackConfig", "(Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item;JLru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$OnBackConfigDTO;)Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryVO;", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "defaultCommentFooterCornerRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewGalleryMapper implements Function2<ReviewGalleryV2DTO, d, List<? extends ReviewGalleryVO>> {

    @NotNull
    private final CornerRadius defaultCommentFooterCornerRadius;

    public ReviewGalleryMapper(@NotNull AppType appType) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        this.defaultCommentFooterCornerRadius = appType == AppType.SELECT ? CornerRadius.RADIUS_525 : CornerRadius.RADIUS_350;
    }

    private final ReviewGalleryV2DTO.ReviewGalleryV2Item.CommentFooterDTO withResolvedCornerRadius(ReviewGalleryV2DTO.ReviewGalleryV2Item.CommentFooterDTO commentFooterDTO) {
        return commentFooterDTO.getCornerRadius() != null ? commentFooterDTO : ReviewGalleryV2DTO.ReviewGalleryV2Item.CommentFooterDTO.copy$default(commentFooterDTO, null, null, null, null, null, this.defaultCommentFooterCornerRadius, 31, null);
    }

    @NotNull
    public final ReviewGalleryVO toVO(@NotNull ReviewGalleryV2DTO.ReviewGalleryV2Item reviewGalleryV2Item, long j11, ReviewGalleryV2DTO.OnBackConfigDTO onBackConfigDTO) {
        ReviewGalleryV2DTO.ReviewGalleryV2Item.ReviewsRightPanelDTO reviewsRightPanelDTO;
        Intrinsics.checkNotNullParameter(reviewGalleryV2Item, "<this>");
        Object socialUser = reviewGalleryV2Item.getSocialUser();
        Object rating = reviewGalleryV2Item.getRating();
        Object product = reviewGalleryV2Item.getProduct();
        Object badge = reviewGalleryV2Item.getBadge();
        ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO topMediaItems = reviewGalleryV2Item.getTopMediaItems();
        List<Object> items = topMediaItems != null ? topMediaItems.getItems() : null;
        if (items == null) {
            items = K.f71697a;
        }
        List<Object> list = items;
        ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO bottomMediaItems = reviewGalleryV2Item.getBottomMediaItems();
        List<Object> items2 = bottomMediaItems != null ? bottomMediaItems.getItems() : null;
        if (items2 == null) {
            items2 = K.f71697a;
        }
        ArrayList p02 = C7714v.p0(items2, list);
        ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO bottomItems = reviewGalleryV2Item.getBottomItems();
        List<Object> items3 = bottomItems != null ? bottomItems.getItems() : null;
        if (items3 == null) {
            items3 = K.f71697a;
        }
        Iterator it = C7714v.p0(items3, p02).iterator();
        Object obj = null;
        Object obj2 = null;
        ReviewGalleryVO.SideButtonsVO sideButtonsVO = null;
        boolean z11 = false;
        Object obj3 = null;
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof ReviewGalleryV2DTO.ReviewGalleryV2Item.SocialUser) {
                socialUser = next;
            } else if (next instanceof ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductRatingDTO) {
                rating = next;
            } else if (next instanceof ReviewProductTileDTO) {
                product = next;
            } else if (next instanceof BadgeDTO) {
                badge = next;
            } else if (next instanceof ReviewGalleryV2DTO.ReviewGalleryV2Item.CommentFooterDTO) {
                obj = next;
            } else if (next instanceof ReviewGalleryV2DTO.ReviewGalleryV2Item.CommentButtonFooterDTO) {
                obj2 = next;
            } else if (next instanceof ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductItemsContainerDTO) {
                obj3 = next;
            } else if (next instanceof ReviewGalleryV2DTO.SideButtonsDTO) {
                sideButtonsVO = toVO((ReviewGalleryV2DTO.SideButtonsDTO) next);
            }
            z11 = true;
        }
        String reviewUuid = reviewGalleryV2Item.getReviewUuid();
        ReviewGalleryV2DTO.ReviewGalleryV2Item.ContentWrapper content = reviewGalleryV2Item.getContent();
        VideoMolecule video = reviewGalleryV2Item.getContent().getVideo();
        ReviewGalleryV2DTO.ReviewGalleryV2Item.ContentWrapper copy$default = ReviewGalleryV2DTO.ReviewGalleryV2Item.ContentWrapper.copy$default(content, null, video != null ? VideoMolecule.copy$default(video, null, null, reviewGalleryV2Item.isFillMode(), null, 11, null) : null, null, 5, null);
        SocialIconButtonDTO closeButton = reviewGalleryV2Item.getCloseButton();
        ReviewGalleryV2DTO.ReviewGalleryV2Item.ReviewsRightPanelDTO rightPanel = reviewGalleryV2Item.getRightPanel();
        if (rightPanel != null) {
            Integer bottomPadding = reviewGalleryV2Item.getRightPanel().getBottomPadding();
            reviewsRightPanelDTO = ReviewGalleryV2DTO.ReviewGalleryV2Item.ReviewsRightPanelDTO.copy$default(rightPanel, null, null, bottomPadding != null ? Integer.valueOf(UiExtKt.toPx(bottomPadding.intValue())) : null, 3, null);
        } else {
            reviewsRightPanelDTO = null;
        }
        ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductRatingDTO productRatingDTO = (ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductRatingDTO) rating;
        ReviewGalleryV2DTO.ReviewGalleryV2Item.CommentFooterDTO commentFooterDTO = (ReviewGalleryV2DTO.ReviewGalleryV2Item.CommentFooterDTO) obj;
        ReviewGalleryV2DTO.ReviewGalleryV2Item.CommentButtonFooterDTO commentButtonFooterDTO = (ReviewGalleryV2DTO.ReviewGalleryV2Item.CommentButtonFooterDTO) obj2;
        return new ReviewGalleryVO(j11, reviewUuid, copy$default, sideButtonsVO, closeButton, reviewsRightPanelDTO, false, socialUser == null ? reviewGalleryV2Item.getUser() : null, (ReviewGalleryV2DTO.ReviewGalleryV2Item.SocialUser) socialUser, productRatingDTO != null ? ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductRatingDTO.copy$default(productRatingDTO, null, C3143a.g("\n+", productRatingDTO.getText(), " "), null, null, null, null, UiExtKt.toPx(productRatingDTO.getIconSize()), UiExtKt.toPx(productRatingDTO.getContentSpacing()), 0, 317, null) : null, (BadgeDTO) badge, (ReviewProductTileDTO) product, (ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductItemsContainerDTO) obj3, commentFooterDTO != null ? withResolvedCornerRadius(commentFooterDTO) : null, commentButtonFooterDTO != null ? ReviewGalleryV2DTO.ReviewGalleryV2Item.CommentButtonFooterDTO.copy$default(commentButtonFooterDTO, withResolvedCornerRadius(commentButtonFooterDTO.getFooter()), null, 2, null) : null, reviewGalleryV2Item.getTopMediaItems(), reviewGalleryV2Item.getBottomMediaItems(), reviewGalleryV2Item.getBottomItems(), z11, reviewGalleryV2Item.isFillMode(), reviewGalleryV2Item.isVideo(), reviewGalleryV2Item.isCompactControls(), reviewGalleryV2Item.getContentViewAction(), onBackConfigDTO != null ? toVO(onBackConfigDTO, j11) : null, reviewGalleryV2Item.getTrackingInfo(), reviewGalleryV2Item.getPrevTrackingInfo(), reviewGalleryV2Item.getNextTrackingInfo());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<ReviewGalleryVO> invoke(@NotNull ReviewGalleryV2DTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        List<ReviewGalleryV2DTO.ReviewGalleryV2Item> items = state.getItems();
        ArrayList arrayList = new ArrayList(C7714v.z(items, 10));
        int i11 = 0;
        for (Object obj : items) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            ReviewGalleryV2DTO.ReviewGalleryV2Item reviewGalleryV2Item = (ReviewGalleryV2DTO.ReviewGalleryV2Item) obj;
            String reviewUuid = reviewGalleryV2Item.getReviewUuid();
            arrayList.add(toVO(reviewGalleryV2Item, (reviewUuid + i11).hashCode(), state.getOnBackConfig()));
            i11 = i12;
        }
        return arrayList;
    }

    private final ReviewGalleryVO.OnBackConfigVO toVO(ReviewGalleryV2DTO.OnBackConfigDTO onBackConfigDTO, long j11) {
        AtomAction atomAction = AtomActionMapperKt.toAtomAction(onBackConfigDTO.getAction(), onBackConfigDTO.getTracking());
        Map<String, TokenizedTrackingInfo> tracking = onBackConfigDTO.getTracking();
        return new ReviewGalleryVO.OnBackConfigVO(atomAction, tracking != null ? x.b(tracking, Long.valueOf(j11), null) : null);
    }

    private final ReviewGalleryVO.SideButtonsVO toVO(ReviewGalleryV2DTO.SideButtonsDTO sideButtonsDTO) {
        IconButtonV3DTO leftButton = sideButtonsDTO.getLeftButton();
        IconButtonV3DTO rightButton = sideButtonsDTO.getRightButton();
        Paddings leftMargin = sideButtonsDTO.getLeftMargin();
        if (leftMargin == null) {
            leftMargin = Paddings.PADDING_250;
        }
        int px = UiExtKt.toPx(leftMargin.getPx());
        Paddings rightMargin = sideButtonsDTO.getRightMargin();
        if (rightMargin == null) {
            rightMargin = Paddings.PADDING_250;
        }
        return new ReviewGalleryVO.SideButtonsVO(leftButton, rightButton, px, UiExtKt.toPx(rightMargin.getPx()));
    }
}
