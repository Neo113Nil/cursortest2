package ru.ozon.app.android.ugc.core.widgets.singlereview;

import Kk.c;
import Lh.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.islandSeparator.data.IslandSeparatorDTO;
import ru.ozon.android.composerCommonViewKit.plainText.data.PlainTextDTO;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.pdp.common.ugc.timer.TimerDTO;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewMedia.data.MediaDTO;
import ru.ozon.app.android.pdp.ui.configurators.ugc.singleReview.ButtonsVO;
import ru.ozon.app.android.pdp.ui.configurators.ugc.singleReview.SingleReviewDTO;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.timerMolecule.presentation.TimerVOKt;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.app.android.ugc.core.widgets.singlereview.actionsFooter.ActionsFooterDO;
import ru.ozon.app.android.ugc.core.widgets.singlereview.aspects.SingleReviewAspectsDO;
import ru.ozon.app.android.ugc.core.widgets.singlereview.commentFooter.CommentFooterDO;
import ru.ozon.app.android.ugc.core.widgets.singlereview.contextReviews.ContextReviewsDO;
import ru.ozon.app.android.ugc.core.widgets.singlereview.gallery.widgets.common.ext.SingleReviewGalleryModelUtilsKt;
import ru.ozon.app.android.ugc.core.widgets.singlereview.gallery.widgets.common.ext.SingleReviewGalleryType;
import ru.ozon.app.android.ugc.core.widgets.singlereview.gallery.widgets.mediaList.SingleReviewMediaListDO;
import ru.ozon.app.android.ugc.core.widgets.singlereview.gallery.widgets.mediaRow.SingleReviewGalleryRowDO;
import ru.ozon.app.android.ugc.core.widgets.singlereview.gallery.widgets.singleVideo.SingleReviewSingleVideoDO;
import ru.ozon.app.android.ugc.core.widgets.singlereview.header.badgeItemsList.SingleReviewBadgeItemsListVO;
import ru.ozon.app.android.ugc.core.widgets.singlereview.header.badgesList.SingleReviewBadgesListDO;
import ru.ozon.app.android.ugc.core.widgets.singlereview.header.rating.SingleReviewHeaderInfoDO;
import ru.ozon.app.android.ugc.core.widgets.singlereview.header.singleBadge.SingleReviewBadgeDO;
import ru.ozon.app.android.ugc.core.widgets.singlereview.header.socialHeader.SingleReviewSocialHeaderDO;
import ru.ozon.app.android.ugc.core.widgets.singlereview.header.userInfo.SingleReviewUserInfoDO;
import ru.ozon.app.android.ugc.core.widgets.singlereview.header.variant.SingleReviewVariantDO;
import ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentric.MediaCentricDO;
import ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentricHeader.MediaCentricHeaderDO;
import ru.ozon.app.android.ugc.core.widgets.singlereview.otherReviewButton.OtherReviewButtonDO;
import ru.ozon.app.android.ugc.core.widgets.singlereview.singleAspect.SingleReviewAspectDO;
import ru.ozon.app.android.ugc.core.widgets.singlereview.translateButton.TranslateButtonDO;
import ru.ozon.app.android.ugc.core.widgets.singlereview.userLikes.UserLikesDO;
import ru.ozon.app.android.widgets.buttonWidget.ButtonWidgetDTO;
import ru.ozon.app.android.widgets.separator.SeparatorDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.v3.mappers.TextMapperKt;

@Metadata(d1 = {"\u0000Ì\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0012\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u0000\u001a\f\u0010\u0004\u001a\u00020\u0005*\u00020\u0003H\u0002\u001a\f\u0010\u0006\u001a\u00020\u0007*\u00020\u0003H\u0002\u001a\f\u0010\b\u001a\u00020\t*\u00020\u0003H\u0002\u001a\f\u0010\n\u001a\u00020\u000b*\u00020\u0003H\u0002\u001a\u000e\u0010\f\u001a\u0004\u0018\u00010\r*\u00020\u0003H\u0002\u001a\u0018\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0001*\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0002\u001a\u001a\u0010\u0010\u001a\u00020\u0011*\u00020\u00032\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0001H\u0002\u001a\f\u0010\u0014\u001a\u00020\u0015*\u00020\u0003H\u0002\u001a\u0014\u0010\u0016\u001a\u00020\u0017*\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0019H\u0002\u001a\u0014\u0010\u001a\u001a\u00020\u001b*\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0019H\u0002\u001a\u0014\u0010\u001c\u001a\u00020\u001d*\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0019H\u0002\u001a\u0014\u0010\u001e\u001a\u00020\u001f*\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0019H\u0002\u001a\u001a\u0010 \u001a\u00020!*\u00020\u00032\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0001H\u0002\u001a\f\u0010\"\u001a\u00020#*\u00020\u0003H\u0002\u001a(\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00032\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001f2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002\u001a \u0010*\u001a\u00020+2\u0006\u0010&\u001a\u00020\u00032\u0006\u0010,\u001a\u00020-2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002\u001a\f\u0010.\u001a\u00020/*\u00020\u0003H\u0002\u001a\u0014\u00100\u001a\u000201*\u00020\u00032\u0006\u00102\u001a\u000203H\u0002\u001a\f\u00104\u001a\u000205*\u00020\u0003H\u0002\u001a\f\u00106\u001a\u000207*\u00020\u0003H\u0002\u001a\f\u00108\u001a\u000209*\u00020\u0003H\u0002\u001a\u0014\u0010:\u001a\u00020;*\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0019H\u0002\u001a\u001e\u0010<\u001a\u0004\u0018\u00010\u0002*\u00020\u00032\u0006\u0010)\u001a\u00020\u001f2\u0006\u0010=\u001a\u00020\u0002H\u0002\u001a\u0014\u0010>\u001a\u00020?*\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0019H\u0002\u001a \u0010@\u001a\u00020A2\u0006\u0010&\u001a\u00020\u00032\u0006\u0010B\u001a\u00020C2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002\u001a\f\u0010D\u001a\u00020\u001f*\u00020\u0003H\u0002\u001a\f\u0010E\u001a\u00020\u001f*\u00020\u0003H\u0002\u001a\f\u0010F\u001a\u00020\u001f*\u00020\u0003H\u0002¨\u0006G"}, d2 = {"toSubDTOList", "", "", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO;", "getHeaderInfo", "Lru/ozon/app/android/ugc/core/widgets/singlereview/header/rating/SingleReviewHeaderInfoDO;", "getSocialHeader", "Lru/ozon/app/android/ugc/core/widgets/singlereview/header/socialHeader/SingleReviewSocialHeaderDO;", "getUserInfo", "Lru/ozon/app/android/ugc/core/widgets/singlereview/header/userInfo/SingleReviewUserInfoDO;", "getBadgesList", "Lru/ozon/app/android/ugc/core/widgets/singlereview/header/badgesList/SingleReviewBadgesListDO;", "getBadgeItemsList", "Lru/ozon/app/android/ugc/core/widgets/singlereview/header/badgeItemsList/SingleReviewBadgeItemsListVO;", "toBadgeItems", "Lru/ozon/app/android/ugc/core/widgets/singlereview/header/badgeItemsList/SingleReviewBadgeItemsListVO$BadgeItem;", "getBadge", "Lru/ozon/app/android/ugc/core/widgets/singlereview/header/singleBadge/SingleReviewBadgeDO;", "badgeDTOS", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getVariant", "Lru/ozon/app/android/ugc/core/widgets/singlereview/header/variant/SingleReviewVariantDO;", "getSingleVideo", "Lru/ozon/app/android/ugc/core/widgets/singlereview/gallery/widgets/singleVideo/SingleReviewSingleVideoDO;", "hasItems", "", "getGalleryRow", "Lru/ozon/app/android/ugc/core/widgets/singlereview/gallery/widgets/mediaRow/SingleReviewGalleryRowDO;", "getMediaList", "Lru/ozon/app/android/ugc/core/widgets/singlereview/gallery/widgets/mediaList/SingleReviewMediaListDO;", "getMediaBottomMargin", "", "getAspect", "Lru/ozon/app/android/ugc/core/widgets/singlereview/singleAspect/SingleReviewAspectDO;", "getUserLikes", "Lru/ozon/app/android/ugc/core/widgets/singlereview/userLikes/UserLikesDO;", "getButtons", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/ButtonsVO;", "dto", "buttonBlock", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$ButtonBlockDTO;", "index", "getActionsFooter", "Lru/ozon/app/android/ugc/core/widgets/singlereview/actionsFooter/ActionsFooterDO;", "actionsFooter", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$ActionsFooterDTO;", "getAspects", "Lru/ozon/app/android/ugc/core/widgets/singlereview/aspects/SingleReviewAspectsDO;", "getContextReviews", "Lru/ozon/app/android/ugc/core/widgets/singlereview/contextReviews/ContextReviewsDO;", "contextReviews", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$ContextReviewsDTO;", "getMediaCentricHeader", "Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentricHeader/MediaCentricHeaderDO;", "getMediaCentric", "Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/MediaCentricDO;", "getTranslateButton", "Lru/ozon/app/android/ugc/core/widgets/singlereview/translateButton/TranslateButtonDO;", "getSingleReview", "Lru/ozon/app/android/ugc/core/widgets/singlereview/SingleReviewDO;", "getItemsDOList", "item", "getOtherReviewButton", "Lru/ozon/app/android/ugc/core/widgets/singlereview/otherReviewButton/OtherReviewButtonDO;", "getCommentFooter", "Lru/ozon/app/android/ugc/core/widgets/singlereview/commentFooter/CommentFooterDO;", ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.COMMENT_FOOTER_FIELD_NAME, "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$CommentFooterDTO;", "getAspectsBottomPadding", "getTopContextReviewsPadding", "getBottomContextReviewsPadding", "core_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SingleReviewDTOMappersKt {
    private static final ActionsFooterDO getActionsFooter(SingleReviewDTO singleReviewDTO, SingleReviewDTO.ActionsFooterDTO actionsFooterDTO, boolean z11) {
        return new ActionsFooterDO(singleReviewDTO.getUuid(), actionsFooterDTO, z11);
    }

    private static final SingleReviewAspectDO getAspect(SingleReviewDTO singleReviewDTO, List<BadgeDTO> list) {
        return new SingleReviewAspectDO(singleReviewDTO.getUuid(), (BadgeDTO) C7714v.K(list), list.size(), getAspectsBottomPadding(singleReviewDTO));
    }

    private static final SingleReviewAspectsDO getAspects(SingleReviewDTO singleReviewDTO) {
        return new SingleReviewAspectsDO(singleReviewDTO.getUuid(), singleReviewDTO.getAspects(), getAspectsBottomPadding(singleReviewDTO));
    }

    private static final int getAspectsBottomPadding(SingleReviewDTO singleReviewDTO) {
        if (singleReviewDTO.getContextReviews() != null || singleReviewDTO.getUserLikes() == null) {
            return (singleReviewDTO.getContextReviews() == null && singleReviewDTO.getUserLikes() == null) ? Dimens.INSTANCE.getDP_16() : Dimens.INSTANCE.getDP_10();
        }
        return 0;
    }

    private static final SingleReviewBadgeDO getBadge(SingleReviewDTO singleReviewDTO, List<BadgeDTO> list) {
        return new SingleReviewBadgeDO(singleReviewDTO.getUuid(), (BadgeDTO) C7714v.K(list), list.size());
    }

    private static final SingleReviewBadgeItemsListVO getBadgeItemsList(SingleReviewDTO singleReviewDTO) {
        List<Object> badgeItems;
        SingleReviewDTO.HeaderDTO header = singleReviewDTO.getHeader();
        List<SingleReviewBadgeItemsListVO.BadgeItem> badgeItems2 = (header == null || (badgeItems = header.getBadgeItems()) == null) ? null : toBadgeItems(badgeItems);
        if (badgeItems2 == null) {
            badgeItems2 = K.f71697a;
        }
        if (badgeItems2.isEmpty()) {
            return null;
        }
        return new SingleReviewBadgeItemsListVO(c.a(singleReviewDTO.getUuid(), "_badgeItemsList"), badgeItems2);
    }

    private static final SingleReviewBadgesListDO getBadgesList(SingleReviewDTO singleReviewDTO) {
        String uuid = singleReviewDTO.getUuid();
        SingleReviewDTO.HeaderDTO header = singleReviewDTO.getHeader();
        return new SingleReviewBadgesListDO(uuid, header != null ? header.getBadges() : null);
    }

    private static final int getBottomContextReviewsPadding(SingleReviewDTO singleReviewDTO) {
        if (singleReviewDTO.getUserLikes() != null) {
            return 0;
        }
        return Dimens.INSTANCE.getDP_16();
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x015d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final ButtonsVO getButtons(SingleReviewDTO singleReviewDTO, SingleReviewDTO.ButtonBlockDTO buttonBlockDTO, int i11, boolean z11) {
        int size;
        boolean z12;
        boolean z13;
        int dp_12;
        int i12;
        List<SingleReviewDTO.BodySectionDTO> bodySections;
        List<SingleReviewDTO.BodySectionDTO> bodySections2;
        SingleReviewDTO.BodySectionDTO bodySectionDTO;
        TextAtom titleAtom;
        OzonSpannableString text;
        if (z11) {
            List<Object> items = singleReviewDTO.getItems();
            if (items != null) {
                List<Object> list = items;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    size = 0;
                    while (it.hasNext()) {
                        if ((it.next() instanceof SingleReviewDTO.ButtonBlockDTO) && (size = size + 1) < 0) {
                            C7714v.N0();
                            throw null;
                        }
                    }
                }
            }
            size = 0;
        } else {
            List<SingleReviewDTO.ButtonBlockDTO> buttonBlocks = singleReviewDTO.getButtonBlocks();
            if (buttonBlocks != null) {
                size = buttonBlocks.size();
            }
            size = 0;
        }
        boolean z14 = size > 1 && i11 == 0;
        List<Object> items2 = singleReviewDTO.getItems();
        if (items2 != null) {
            List<Object> list2 = items2;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    if (it2.next() instanceof SingleReviewDTO.CommentFooterDTO) {
                        z12 = true;
                        break;
                    }
                }
            }
        }
        z12 = false;
        if (z11) {
            List<Object> items3 = singleReviewDTO.getItems();
            if ((items3 != null ? C7714v.X(items3) : null) instanceof SeparatorDTO) {
                z13 = true;
                boolean z15 = (singleReviewDTO.getBodySections() == null && ((bodySections = singleReviewDTO.getBodySections()) == null || bodySections.size() != 1 || (bodySections2 = singleReviewDTO.getBodySections()) == null || (bodySectionDTO = (SingleReviewDTO.BodySectionDTO) C7714v.Q(0, bodySections2)) == null || (titleAtom = bodySectionDTO.getTitleAtom()) == null || (text = titleAtom.getText()) == null || !h.K(text))) ? false : true;
                long a11 = b.a(i11, singleReviewDTO.getUuid(), "_");
                String uuid = singleReviewDTO.getUuid();
                long productId = singleReviewDTO.getProductId();
                List<AtomDTO> leftButtons = buttonBlockDTO.getLeftButtons();
                ArrayList W02 = leftButtons == null ? C7714v.W0(leftButtons) : null;
                List<AtomDTO> rightButtons = buttonBlockDTO.getRightButtons();
                ArrayList W03 = rightButtons == null ? C7714v.W0(rightButtons) : null;
                TextAtom title = buttonBlockDTO.getTitle();
                TextDTO dsTextAtom = title == null ? TextMapperKt.getDsTextAtom(title) : null;
                Boolean separator = buttonBlockDTO.getSeparator();
                boolean booleanValue = separator == null ? separator.booleanValue() : false;
                int dp_44 = singleReviewDTO.getIndent() != 0 ? 0 : Dimens.INSTANCE.getDP_44();
                AtomActionDTO rateUsefulnessAction = singleReviewDTO.getRateUsefulnessAction();
                AtomAction atomAction = rateUsefulnessAction != null ? AtomActionMapperKt.toAtomAction(rateUsefulnessAction, null) : null;
                if (!z14 || singleReviewDTO.getCommentFooter() != null) {
                    dp_12 = Dimens.INSTANCE.getDP_12();
                } else {
                    if (z12) {
                        i12 = 0;
                        return new ButtonsVO(a11, uuid, productId, dsTextAtom, W02, W03, booleanValue, dp_44, atomAction, i12, (singleReviewDTO.getPhotos() == null || singleReviewDTO.getVideos() != null) && SingleReviewGalleryModelUtilsKt.getBottomMargin(singleReviewDTO) != 0, z15);
                    }
                    dp_12 = z13 ? Dimens.INSTANCE.getDP_4() : Dimens.INSTANCE.getDP_16();
                }
                i12 = dp_12;
                return new ButtonsVO(a11, uuid, productId, dsTextAtom, W02, W03, booleanValue, dp_44, atomAction, i12, (singleReviewDTO.getPhotos() == null || singleReviewDTO.getVideos() != null) && SingleReviewGalleryModelUtilsKt.getBottomMargin(singleReviewDTO) != 0, z15);
            }
        }
        z13 = false;
        if (singleReviewDTO.getBodySections() == null) {
        }
        long a112 = b.a(i11, singleReviewDTO.getUuid(), "_");
        String uuid2 = singleReviewDTO.getUuid();
        long productId2 = singleReviewDTO.getProductId();
        List<AtomDTO> leftButtons2 = buttonBlockDTO.getLeftButtons();
        if (leftButtons2 == null) {
        }
        List<AtomDTO> rightButtons2 = buttonBlockDTO.getRightButtons();
        if (rightButtons2 == null) {
        }
        TextAtom title2 = buttonBlockDTO.getTitle();
        if (title2 == null) {
        }
        Boolean separator2 = buttonBlockDTO.getSeparator();
        if (separator2 == null) {
        }
        if (singleReviewDTO.getIndent() != 0) {
        }
        AtomActionDTO rateUsefulnessAction2 = singleReviewDTO.getRateUsefulnessAction();
        AtomAction atomAction2 = rateUsefulnessAction2 != null ? AtomActionMapperKt.toAtomAction(rateUsefulnessAction2, null) : null;
        if (!z14) {
        }
        dp_12 = Dimens.INSTANCE.getDP_12();
        i12 = dp_12;
        return new ButtonsVO(a112, uuid2, productId2, dsTextAtom, W02, W03, booleanValue, dp_44, atomAction2, i12, (singleReviewDTO.getPhotos() == null || singleReviewDTO.getVideos() != null) && SingleReviewGalleryModelUtilsKt.getBottomMargin(singleReviewDTO) != 0, z15);
    }

    private static final CommentFooterDO getCommentFooter(SingleReviewDTO singleReviewDTO, SingleReviewDTO.CommentFooterDTO commentFooterDTO, boolean z11) {
        return new CommentFooterDO(singleReviewDTO.getUuid(), commentFooterDTO.getAvatarIcon(), commentFooterDTO.getTitle(), commentFooterDTO.getBackgroundColor(), commentFooterDTO.getCommentsButton(), commentFooterDTO.getClickAction(), z11, commentFooterDTO.getTrackingInfo(), commentFooterDTO.getCornerRadius());
    }

    private static final ContextReviewsDO getContextReviews(SingleReviewDTO singleReviewDTO, SingleReviewDTO.ContextReviewsDTO contextReviewsDTO) {
        return new ContextReviewsDO(singleReviewDTO.getUuid(), contextReviewsDTO.getContextReviews(), contextReviewsDTO.getBackgroundColor(), getTopContextReviewsPadding(singleReviewDTO), getBottomContextReviewsPadding(singleReviewDTO));
    }

    private static final SingleReviewGalleryRowDO getGalleryRow(SingleReviewDTO singleReviewDTO, boolean z11) {
        return new SingleReviewGalleryRowDO(singleReviewDTO.getUuid(), singleReviewDTO.getPhotos(), singleReviewDTO.getVideos(), singleReviewDTO.getShowReviewGalleryButton(), SingleReviewGalleryModelUtilsKt.getGalleryType(singleReviewDTO), getMediaBottomMargin(singleReviewDTO, z11), singleReviewDTO.getMediaPreviewCornerRadius());
    }

    private static final SingleReviewHeaderInfoDO getHeaderInfo(SingleReviewDTO singleReviewDTO) {
        return new SingleReviewHeaderInfoDO(singleReviewDTO.getUuid(), singleReviewDTO.getHeader(), singleReviewDTO.getTrackingInfo());
    }

    private static final Object getItemsDOList(SingleReviewDTO singleReviewDTO, int i11, Object obj) {
        if (obj instanceof SingleReviewDTO.ButtonBlockDTO) {
            return getButtons(singleReviewDTO, (SingleReviewDTO.ButtonBlockDTO) obj, i11, true);
        }
        if (obj instanceof SingleReviewDTO.ActionsFooterDTO) {
            return getActionsFooter(singleReviewDTO, (SingleReviewDTO.ActionsFooterDTO) obj, true);
        }
        if (obj instanceof SingleReviewDTO.CommentFooterDTO) {
            return getCommentFooter(singleReviewDTO, (SingleReviewDTO.CommentFooterDTO) obj, true);
        }
        if ((obj instanceof PlainTextDTO) || (obj instanceof ButtonWidgetDTO) || (obj instanceof IslandSeparatorDTO) || (obj instanceof SeparatorDTO)) {
            return obj;
        }
        return null;
    }

    private static final int getMediaBottomMargin(SingleReviewDTO singleReviewDTO, boolean z11) {
        SingleReviewDTO.ActionsFooterDTO actionsFooter;
        List<Object> items = singleReviewDTO.getItems();
        if (items != null) {
            List<Object> list = items;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (it.next() instanceof PlainTextDTO) {
                        return 0;
                    }
                }
            }
        }
        List<Object> items2 = singleReviewDTO.getItems();
        if (items2 != null) {
            List<Object> list2 = items2;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    if (it2.next() instanceof SingleReviewDTO.ActionsFooterDTO) {
                        return 0;
                    }
                }
            }
        }
        if (singleReviewDTO.getShowOtherReviewsButton() == null || (((actionsFooter = singleReviewDTO.getActionsFooter()) == null || actionsFooter.getHasSeparator()) && !z11)) {
            return SingleReviewGalleryModelUtilsKt.getBottomMargin(singleReviewDTO);
        }
        return 0;
    }

    private static final MediaCentricDO getMediaCentric(SingleReviewDTO singleReviewDTO) {
        return new MediaCentricDO(singleReviewDTO.getUuid(), singleReviewDTO.getMediaCentric(), singleReviewDTO.getTrackingInfo());
    }

    private static final MediaCentricHeaderDO getMediaCentricHeader(SingleReviewDTO singleReviewDTO) {
        return new MediaCentricHeaderDO(singleReviewDTO.getUuid(), singleReviewDTO.getMediaCentricHeader());
    }

    private static final SingleReviewMediaListDO getMediaList(SingleReviewDTO singleReviewDTO, boolean z11) {
        return new SingleReviewMediaListDO(singleReviewDTO.getUuid(), singleReviewDTO.getPhotos(), singleReviewDTO.getVideos(), SingleReviewGalleryModelUtilsKt.getGalleryType(singleReviewDTO), getMediaBottomMargin(singleReviewDTO, z11), singleReviewDTO.getMediaPreviewCornerRadius(), singleReviewDTO.getMediaImageSticker());
    }

    private static final OtherReviewButtonDO getOtherReviewButton(SingleReviewDTO singleReviewDTO, boolean z11) {
        return new OtherReviewButtonDO(singleReviewDTO.getUuid(), singleReviewDTO.getShowOtherReviewsButton(), z11);
    }

    private static final SingleReviewDO getSingleReview(SingleReviewDTO singleReviewDTO, boolean z11) {
        int indent = singleReviewDTO.getIndent();
        String uuid = singleReviewDTO.getUuid();
        long productId = singleReviewDTO.getProductId();
        SingleReviewDTO.HeaderDTO header = singleReviewDTO.getHeader();
        List<MediaDTO> photos = singleReviewDTO.getPhotos();
        List<MediaDTO> videos = singleReviewDTO.getVideos();
        ButtonV3Atom.LargeBorderlessButton showReviewGalleryButton = singleReviewDTO.getShowReviewGalleryButton();
        List<TextAtom> contextQuestions = singleReviewDTO.getContextQuestions();
        List<SingleReviewDTO.ButtonBlockDTO> buttonBlocks = singleReviewDTO.getButtonBlocks();
        List<SingleReviewDTO.BodySectionDTO> bodySections = singleReviewDTO.getBodySections();
        ButtonV3Atom.LargeButton showOtherReviewsButton = singleReviewDTO.getShowOtherReviewsButton();
        Map<String, TokenizedTrackingInfo> trackingInfo = singleReviewDTO.getTrackingInfo();
        SingleReviewDTO.UserLikesDTO userLikes = singleReviewDTO.getUserLikes();
        SingleReviewDTO.ActionsFooterDTO actionsFooter = singleReviewDTO.getActionsFooter();
        List<BadgeDTO> aspects = singleReviewDTO.getAspects();
        Integer reviewCollapseThreshold = singleReviewDTO.getReviewCollapseThreshold();
        SingleReviewDTO.MediaCentricHeaderDTO mediaCentricHeader = singleReviewDTO.getMediaCentricHeader();
        SingleReviewDTO.MediaCentricDTO mediaCentric = singleReviewDTO.getMediaCentric();
        SingleReviewDTO.ContextReviewsDTO contextReviews = singleReviewDTO.getContextReviews();
        Map<String, TokenizedTrackingInfo> tileReviewTracking = singleReviewDTO.getTileReviewTracking();
        Map<String, TokenizedTrackingInfo> reviewExpandTrackingInfo = singleReviewDTO.getReviewExpandTrackingInfo();
        SingleReviewGalleryType galleryType = SingleReviewGalleryModelUtilsKt.getGalleryType(singleReviewDTO);
        CornerRadius mediaPreviewCornerRadius = singleReviewDTO.getMediaPreviewCornerRadius();
        if (mediaPreviewCornerRadius == null) {
            mediaPreviewCornerRadius = CornerRadius.RADIUS_300;
        }
        return new SingleReviewDO(indent, uuid, productId, header, photos, videos, showReviewGalleryButton, contextQuestions, buttonBlocks, bodySections, showOtherReviewsButton, trackingInfo, userLikes, actionsFooter, aspects, reviewCollapseThreshold, mediaCentricHeader, mediaCentric, contextReviews, tileReviewTracking, reviewExpandTrackingInfo, galleryType, z11, mediaPreviewCornerRadius, singleReviewDTO.getBadgeText());
    }

    private static final SingleReviewSingleVideoDO getSingleVideo(SingleReviewDTO singleReviewDTO, boolean z11) {
        return new SingleReviewSingleVideoDO(singleReviewDTO.getUuid(), singleReviewDTO.getVideos(), getMediaBottomMargin(singleReviewDTO, z11), SingleReviewGalleryModelUtilsKt.getGalleryType(singleReviewDTO), singleReviewDTO.getMediaPreviewCornerRadius(), singleReviewDTO.getMediaImageSticker());
    }

    private static final SingleReviewSocialHeaderDO getSocialHeader(SingleReviewDTO singleReviewDTO) {
        String uuid = singleReviewDTO.getUuid();
        SingleReviewDTO.HeaderDTO header = singleReviewDTO.getHeader();
        return new SingleReviewSocialHeaderDO(uuid, header != null ? header.getSocialHeader() : null, singleReviewDTO.getMediaCentric() != null, singleReviewDTO.getTrackingInfo(), singleReviewDTO.getTileReviewTracking());
    }

    private static final int getTopContextReviewsPadding(SingleReviewDTO singleReviewDTO) {
        if (singleReviewDTO.getAspects() != null) {
            return 0;
        }
        return Dimens.INSTANCE.getDP_10();
    }

    private static final TranslateButtonDO getTranslateButton(SingleReviewDTO singleReviewDTO) {
        return new TranslateButtonDO(singleReviewDTO.getUuid(), singleReviewDTO.getTranslateButton(), singleReviewDTO.getBodySections());
    }

    private static final SingleReviewUserInfoDO getUserInfo(SingleReviewDTO singleReviewDTO) {
        return new SingleReviewUserInfoDO(singleReviewDTO.getUuid(), singleReviewDTO.getHeader(), singleReviewDTO.getTrackingInfo(), singleReviewDTO.getTileReviewTracking());
    }

    private static final UserLikesDO getUserLikes(SingleReviewDTO singleReviewDTO) {
        return new UserLikesDO(singleReviewDTO.getUserLikes());
    }

    private static final SingleReviewVariantDO getVariant(SingleReviewDTO singleReviewDTO) {
        String uuid = singleReviewDTO.getUuid();
        SingleReviewDTO.HeaderDTO header = singleReviewDTO.getHeader();
        return new SingleReviewVariantDO(uuid, header != null ? header.getVariantText() : null);
    }

    private static final List<SingleReviewBadgeItemsListVO.BadgeItem> toBadgeItems(List<? extends Object> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            SingleReviewBadgeItemsListVO.BadgeItem badgeContent = obj instanceof BadgeDTO ? new SingleReviewBadgeItemsListVO.BadgeItem.BadgeContent((BadgeDTO) obj) : obj instanceof TimerDTO ? new SingleReviewBadgeItemsListVO.BadgeItem.TimerContent(TimerVOKt.toVo((TimerDTO) obj)) : null;
            if (badgeContent != null) {
                arrayList.add(badgeContent);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if ((!r1.isEmpty()) == true) goto L8;
     */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final List<Object> toSubDTOList(@NotNull SingleReviewDTO singleReviewDTO) {
        List<BadgeDTO> badges;
        Intrinsics.checkNotNullParameter(singleReviewDTO, "<this>");
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        boolean z11 = singleReviewDTO.getItems() != null;
        SingleReviewDTO.BadgeTextDTO badgeText = singleReviewDTO.getBadgeText();
        if (badgeText != null) {
            arrayList.add(badgeText);
        }
        arrayList.add(getHeaderInfo(singleReviewDTO));
        arrayList.add(getSocialHeader(singleReviewDTO));
        arrayList.add(getUserInfo(singleReviewDTO));
        arrayList.add(getBadgesList(singleReviewDTO));
        SingleReviewDTO.HeaderDTO header = singleReviewDTO.getHeader();
        if (header != null && (badges = header.getBadges()) != null) {
            arrayList.add(getBadge(singleReviewDTO, badges));
        }
        SingleReviewBadgeItemsListVO badgeItemsList = getBadgeItemsList(singleReviewDTO);
        if (badgeItemsList != null) {
            arrayList.add(badgeItemsList);
        }
        arrayList.add(getVariant(singleReviewDTO));
        arrayList.add(getMediaCentric(singleReviewDTO));
        arrayList.add(getMediaCentricHeader(singleReviewDTO));
        arrayList.add(getTranslateButton(singleReviewDTO));
        arrayList.add(getSingleReview(singleReviewDTO, z11));
        arrayList.add(getSingleVideo(singleReviewDTO, z11));
        arrayList.add(getMediaList(singleReviewDTO, z11));
        arrayList.add(getGalleryRow(singleReviewDTO, z11));
        List<BadgeDTO> aspects = singleReviewDTO.getAspects();
        if (aspects != null) {
            arrayList.add(getAspect(singleReviewDTO, aspects));
        }
        arrayList.add(getAspects(singleReviewDTO));
        SingleReviewDTO.ContextReviewsDTO contextReviews = singleReviewDTO.getContextReviews();
        if (contextReviews != null) {
            arrayList.add(getContextReviews(singleReviewDTO, contextReviews));
        }
        arrayList.add(getUserLikes(singleReviewDTO));
        List<SingleReviewDTO.ButtonBlockDTO> buttonBlocks = singleReviewDTO.getButtonBlocks();
        if (buttonBlocks != null) {
            List<SingleReviewDTO.ButtonBlockDTO> list = buttonBlocks;
            ArrayList arrayList2 = new ArrayList(C7714v.z(list, 10));
            int i12 = 0;
            for (Object obj : list) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    C7714v.O0();
                    throw null;
                }
                arrayList2.add(getButtons(singleReviewDTO, (SingleReviewDTO.ButtonBlockDTO) obj, i12, z11));
                i12 = i13;
            }
            arrayList.addAll(arrayList2);
        }
        SingleReviewDTO.ActionsFooterDTO actionsFooter = singleReviewDTO.getActionsFooter();
        if (actionsFooter != null) {
            arrayList.add(getActionsFooter(singleReviewDTO, actionsFooter, z11));
        }
        SingleReviewDTO.CommentFooterDTO commentFooter = singleReviewDTO.getCommentFooter();
        if (commentFooter != null) {
            arrayList.add(getCommentFooter(singleReviewDTO, commentFooter, z11));
        }
        List<Object> items = singleReviewDTO.getItems();
        if (items != null) {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : items) {
                int i14 = i11 + 1;
                if (i11 < 0) {
                    C7714v.O0();
                    throw null;
                }
                Object itemsDOList = getItemsDOList(singleReviewDTO, i11, obj2);
                if (itemsDOList != null) {
                    arrayList3.add(itemsDOList);
                }
                i11 = i14;
            }
            arrayList.addAll(arrayList3);
        }
        arrayList.add(getOtherReviewButton(singleReviewDTO, z11));
        return arrayList;
    }
}
