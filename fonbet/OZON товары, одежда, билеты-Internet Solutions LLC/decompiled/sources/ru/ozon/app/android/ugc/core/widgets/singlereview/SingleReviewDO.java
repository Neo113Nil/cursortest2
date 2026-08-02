package ru.ozon.app.android.ugc.core.widgets.singlereview;

import Cm.e;
import De.C2860c;
import G.g;
import Kk.C3532b;
import Pk0.c;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewMedia.data.MediaDTO;
import ru.ozon.app.android.pdp.ui.configurators.ugc.singleReview.SingleReviewDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.core.widgets.singlereview.gallery.widgets.common.ext.SingleReviewGalleryType;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bF\b\u0081\b\u0018\u00002\u00020\u0001B¿\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\n\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\n\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\n\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\n\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010#\u001a\u0004\u0018\u00010\"\u0012\b\u0010%\u001a\u0004\u0018\u00010$\u0012\b\u0010'\u001a\u0004\u0018\u00010&\u0012\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018\u0012\u0014\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010-\u001a\u00020,\u0012\b\u0010/\u001a\u0004\u0018\u00010.\u0012\b\u00101\u001a\u0004\u0018\u000100¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b6\u00107J\u001a\u00109\u001a\u00020,2\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b9\u0010:R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010;\u001a\u0004\b<\u00107R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010=\u001a\u0004\b>\u00105R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010?\u001a\u0004\b@\u0010AR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010B\u001a\u0004\bC\u0010DR\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u0010E\u001a\u0004\bF\u0010GR\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\r\u0010E\u001a\u0004\bH\u0010GR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010I\u001a\u0004\bJ\u0010KR\u001f\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u0011\u0010E\u001a\u0004\bL\u0010GR\u001f\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u0013\u0010E\u001a\u0004\bM\u0010GR\u001f\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u0015\u0010E\u001a\u0004\bN\u0010GR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010O\u001a\u0004\bP\u0010QR%\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u001a\u0010R\u001a\u0004\bS\u0010TR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010U\u001a\u0004\bV\u0010WR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010X\u001a\u0004\bY\u0010ZR\u001f\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b \u0010E\u001a\u0004\b[\u0010GR\u0019\u0010!\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\\\u001a\u0004\b]\u0010^R\u0019\u0010#\u001a\u0004\u0018\u00010\"8\u0006¢\u0006\f\n\u0004\b#\u0010_\u001a\u0004\b`\u0010aR\u0019\u0010%\u001a\u0004\u0018\u00010$8\u0006¢\u0006\f\n\u0004\b%\u0010b\u001a\u0004\bc\u0010dR\u0019\u0010'\u001a\u0004\u0018\u00010&8\u0006¢\u0006\f\n\u0004\b'\u0010e\u001a\u0004\bf\u0010gR%\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b(\u0010R\u001a\u0004\bh\u0010TR%\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b)\u0010R\u001a\u0004\bi\u0010TR\u0017\u0010+\u001a\u00020*8\u0006¢\u0006\f\n\u0004\b+\u0010j\u001a\u0004\bk\u0010lR\u0017\u0010-\u001a\u00020,8\u0006¢\u0006\f\n\u0004\b-\u0010m\u001a\u0004\bn\u0010oR\u0019\u0010/\u001a\u0004\u0018\u00010.8\u0006¢\u0006\f\n\u0004\b/\u0010p\u001a\u0004\bq\u0010rR\u0019\u00101\u001a\u0004\u0018\u0001008\u0006¢\u0006\f\n\u0004\b1\u0010s\u001a\u0004\bt\u0010u¨\u0006v"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/SingleReviewDO;", "", "", "indent", "", "uuid", "", "productId", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$HeaderDTO;", CommentV3DTO.HEADER_FIELD_NAME, "", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/data/MediaDTO;", "photos", "videos", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "showReviewGalleryButton", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "contextQuestions", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$ButtonBlockDTO;", "buttonBlocks", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$BodySectionDTO;", "bodySections", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "showOtherReviewsButton", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$UserLikesDTO;", "userLikes", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$ActionsFooterDTO;", "actionsFooter", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "aspects", "reviewCollapseThreshold", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$MediaCentricHeaderDTO;", "mediaCentricHeader", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$MediaCentricDTO;", "mediaCentric", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$ContextReviewsDTO;", "contextReviews", "tileReviewTracking", "reviewExpandTrackingInfo", "Lru/ozon/app/android/ugc/core/widgets/singlereview/gallery/widgets/common/ext/SingleReviewGalleryType;", "galleryType", "", "hasItems", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "mediaPreviewCornerRadius", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$BadgeTextDTO;", "badgeText", "<init>", "(ILjava/lang/String;JLru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$HeaderDTO;Ljava/util/List;Ljava/util/List;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Ljava/util/Map;Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$UserLikesDTO;Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$ActionsFooterDTO;Ljava/util/List;Ljava/lang/Integer;Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$MediaCentricHeaderDTO;Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$MediaCentricDTO;Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$ContextReviewsDTO;Ljava/util/Map;Ljava/util/Map;Lru/ozon/app/android/ugc/core/widgets/singlereview/gallery/widgets/common/ext/SingleReviewGalleryType;ZLru/ozon/uni/atoms/data/common/CornerRadius;Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$BadgeTextDTO;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getIndent", "Ljava/lang/String;", "getUuid", "J", "getProductId", "()J", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$HeaderDTO;", "getHeader", "()Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$HeaderDTO;", "Ljava/util/List;", "getPhotos", "()Ljava/util/List;", "getVideos", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "getShowReviewGalleryButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "getContextQuestions", "getButtonBlocks", "getBodySections", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getShowOtherReviewsButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$UserLikesDTO;", "getUserLikes", "()Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$UserLikesDTO;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$ActionsFooterDTO;", "getActionsFooter", "()Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$ActionsFooterDTO;", "getAspects", "Ljava/lang/Integer;", "getReviewCollapseThreshold", "()Ljava/lang/Integer;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$MediaCentricHeaderDTO;", "getMediaCentricHeader", "()Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$MediaCentricHeaderDTO;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$MediaCentricDTO;", "getMediaCentric", "()Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$MediaCentricDTO;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$ContextReviewsDTO;", "getContextReviews", "()Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$ContextReviewsDTO;", "getTileReviewTracking", "getReviewExpandTrackingInfo", "Lru/ozon/app/android/ugc/core/widgets/singlereview/gallery/widgets/common/ext/SingleReviewGalleryType;", "getGalleryType", "()Lru/ozon/app/android/ugc/core/widgets/singlereview/gallery/widgets/common/ext/SingleReviewGalleryType;", "Z", "getHasItems", "()Z", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "getMediaPreviewCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$BadgeTextDTO;", "getBadgeText", "()Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$BadgeTextDTO;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SingleReviewDO {
    private final SingleReviewDTO.ActionsFooterDTO actionsFooter;
    private final List<BadgeDTO> aspects;
    private final SingleReviewDTO.BadgeTextDTO badgeText;
    private final List<SingleReviewDTO.BodySectionDTO> bodySections;
    private final List<SingleReviewDTO.ButtonBlockDTO> buttonBlocks;
    private final List<TextAtom> contextQuestions;
    private final SingleReviewDTO.ContextReviewsDTO contextReviews;

    @NotNull
    private final SingleReviewGalleryType galleryType;
    private final boolean hasItems;
    private final SingleReviewDTO.HeaderDTO header;
    private final int indent;
    private final SingleReviewDTO.MediaCentricDTO mediaCentric;
    private final SingleReviewDTO.MediaCentricHeaderDTO mediaCentricHeader;
    private final CornerRadius mediaPreviewCornerRadius;
    private final List<MediaDTO> photos;
    private final long productId;
    private final Integer reviewCollapseThreshold;
    private final Map<String, TokenizedTrackingInfo> reviewExpandTrackingInfo;
    private final ButtonV3Atom.LargeButton showOtherReviewsButton;
    private final ButtonV3Atom.LargeBorderlessButton showReviewGalleryButton;
    private final Map<String, TokenizedTrackingInfo> tileReviewTracking;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;
    private final SingleReviewDTO.UserLikesDTO userLikes;

    @NotNull
    private final String uuid;
    private final List<MediaDTO> videos;

    public SingleReviewDO(int i11, @NotNull String uuid, long j11, SingleReviewDTO.HeaderDTO headerDTO, List<MediaDTO> list, List<MediaDTO> list2, ButtonV3Atom.LargeBorderlessButton largeBorderlessButton, List<TextAtom> list3, List<SingleReviewDTO.ButtonBlockDTO> list4, List<SingleReviewDTO.BodySectionDTO> list5, ButtonV3Atom.LargeButton largeButton, Map<String, TokenizedTrackingInfo> map, SingleReviewDTO.UserLikesDTO userLikesDTO, SingleReviewDTO.ActionsFooterDTO actionsFooterDTO, List<BadgeDTO> list6, Integer num, SingleReviewDTO.MediaCentricHeaderDTO mediaCentricHeaderDTO, SingleReviewDTO.MediaCentricDTO mediaCentricDTO, SingleReviewDTO.ContextReviewsDTO contextReviewsDTO, Map<String, TokenizedTrackingInfo> map2, Map<String, TokenizedTrackingInfo> map3, @NotNull SingleReviewGalleryType galleryType, boolean z11, CornerRadius cornerRadius, SingleReviewDTO.BadgeTextDTO badgeTextDTO) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(galleryType, "galleryType");
        this.indent = i11;
        this.uuid = uuid;
        this.productId = j11;
        this.header = headerDTO;
        this.photos = list;
        this.videos = list2;
        this.showReviewGalleryButton = largeBorderlessButton;
        this.contextQuestions = list3;
        this.buttonBlocks = list4;
        this.bodySections = list5;
        this.showOtherReviewsButton = largeButton;
        this.trackingInfo = map;
        this.userLikes = userLikesDTO;
        this.actionsFooter = actionsFooterDTO;
        this.aspects = list6;
        this.reviewCollapseThreshold = num;
        this.mediaCentricHeader = mediaCentricHeaderDTO;
        this.mediaCentric = mediaCentricDTO;
        this.contextReviews = contextReviewsDTO;
        this.tileReviewTracking = map2;
        this.reviewExpandTrackingInfo = map3;
        this.galleryType = galleryType;
        this.hasItems = z11;
        this.mediaPreviewCornerRadius = cornerRadius;
        this.badgeText = badgeTextDTO;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SingleReviewDO)) {
            return false;
        }
        SingleReviewDO singleReviewDO = (SingleReviewDO) other;
        return this.indent == singleReviewDO.indent && Intrinsics.d(this.uuid, singleReviewDO.uuid) && this.productId == singleReviewDO.productId && Intrinsics.d(this.header, singleReviewDO.header) && Intrinsics.d(this.photos, singleReviewDO.photos) && Intrinsics.d(this.videos, singleReviewDO.videos) && Intrinsics.d(this.showReviewGalleryButton, singleReviewDO.showReviewGalleryButton) && Intrinsics.d(this.contextQuestions, singleReviewDO.contextQuestions) && Intrinsics.d(this.buttonBlocks, singleReviewDO.buttonBlocks) && Intrinsics.d(this.bodySections, singleReviewDO.bodySections) && Intrinsics.d(this.showOtherReviewsButton, singleReviewDO.showOtherReviewsButton) && Intrinsics.d(this.trackingInfo, singleReviewDO.trackingInfo) && Intrinsics.d(this.userLikes, singleReviewDO.userLikes) && Intrinsics.d(this.actionsFooter, singleReviewDO.actionsFooter) && Intrinsics.d(this.aspects, singleReviewDO.aspects) && Intrinsics.d(this.reviewCollapseThreshold, singleReviewDO.reviewCollapseThreshold) && Intrinsics.d(this.mediaCentricHeader, singleReviewDO.mediaCentricHeader) && Intrinsics.d(this.mediaCentric, singleReviewDO.mediaCentric) && Intrinsics.d(this.contextReviews, singleReviewDO.contextReviews) && Intrinsics.d(this.tileReviewTracking, singleReviewDO.tileReviewTracking) && Intrinsics.d(this.reviewExpandTrackingInfo, singleReviewDO.reviewExpandTrackingInfo) && this.galleryType == singleReviewDO.galleryType && this.hasItems == singleReviewDO.hasItems && this.mediaPreviewCornerRadius == singleReviewDO.mediaPreviewCornerRadius && Intrinsics.d(this.badgeText, singleReviewDO.badgeText);
    }

    public final SingleReviewDTO.ActionsFooterDTO getActionsFooter() {
        return this.actionsFooter;
    }

    public final List<BadgeDTO> getAspects() {
        return this.aspects;
    }

    public final List<SingleReviewDTO.BodySectionDTO> getBodySections() {
        return this.bodySections;
    }

    public final List<SingleReviewDTO.ButtonBlockDTO> getButtonBlocks() {
        return this.buttonBlocks;
    }

    public final List<TextAtom> getContextQuestions() {
        return this.contextQuestions;
    }

    public final SingleReviewDTO.ContextReviewsDTO getContextReviews() {
        return this.contextReviews;
    }

    @NotNull
    public final SingleReviewGalleryType getGalleryType() {
        return this.galleryType;
    }

    public final boolean getHasItems() {
        return this.hasItems;
    }

    public final SingleReviewDTO.HeaderDTO getHeader() {
        return this.header;
    }

    public final int getIndent() {
        return this.indent;
    }

    public final SingleReviewDTO.MediaCentricHeaderDTO getMediaCentricHeader() {
        return this.mediaCentricHeader;
    }

    public final CornerRadius getMediaPreviewCornerRadius() {
        return this.mediaPreviewCornerRadius;
    }

    public final List<MediaDTO> getPhotos() {
        return this.photos;
    }

    public final Integer getReviewCollapseThreshold() {
        return this.reviewCollapseThreshold;
    }

    public final Map<String, TokenizedTrackingInfo> getReviewExpandTrackingInfo() {
        return this.reviewExpandTrackingInfo;
    }

    public final ButtonV3Atom.LargeButton getShowOtherReviewsButton() {
        return this.showOtherReviewsButton;
    }

    public final ButtonV3Atom.LargeBorderlessButton getShowReviewGalleryButton() {
        return this.showReviewGalleryButton;
    }

    public final Map<String, TokenizedTrackingInfo> getTileReviewTracking() {
        return this.tileReviewTracking;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public final SingleReviewDTO.UserLikesDTO getUserLikes() {
        return this.userLikes;
    }

    @NotNull
    public final String getUuid() {
        return this.uuid;
    }

    public final List<MediaDTO> getVideos() {
        return this.videos;
    }

    public int hashCode() {
        int a11 = c.a(g.a(Integer.hashCode(this.indent) * 31, 31, this.uuid), 31, this.productId);
        SingleReviewDTO.HeaderDTO headerDTO = this.header;
        int hashCode = (a11 + (headerDTO == null ? 0 : headerDTO.hashCode())) * 31;
        List<MediaDTO> list = this.photos;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<MediaDTO> list2 = this.videos;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        ButtonV3Atom.LargeBorderlessButton largeBorderlessButton = this.showReviewGalleryButton;
        int hashCode4 = (hashCode3 + (largeBorderlessButton == null ? 0 : largeBorderlessButton.hashCode())) * 31;
        List<TextAtom> list3 = this.contextQuestions;
        int hashCode5 = (hashCode4 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<SingleReviewDTO.ButtonBlockDTO> list4 = this.buttonBlocks;
        int hashCode6 = (hashCode5 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<SingleReviewDTO.BodySectionDTO> list5 = this.bodySections;
        int hashCode7 = (hashCode6 + (list5 == null ? 0 : list5.hashCode())) * 31;
        ButtonV3Atom.LargeButton largeButton = this.showOtherReviewsButton;
        int hashCode8 = (hashCode7 + (largeButton == null ? 0 : largeButton.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode9 = (hashCode8 + (map == null ? 0 : map.hashCode())) * 31;
        SingleReviewDTO.UserLikesDTO userLikesDTO = this.userLikes;
        int hashCode10 = (hashCode9 + (userLikesDTO == null ? 0 : userLikesDTO.hashCode())) * 31;
        SingleReviewDTO.ActionsFooterDTO actionsFooterDTO = this.actionsFooter;
        int hashCode11 = (hashCode10 + (actionsFooterDTO == null ? 0 : actionsFooterDTO.hashCode())) * 31;
        List<BadgeDTO> list6 = this.aspects;
        int hashCode12 = (hashCode11 + (list6 == null ? 0 : list6.hashCode())) * 31;
        Integer num = this.reviewCollapseThreshold;
        int hashCode13 = (hashCode12 + (num == null ? 0 : num.hashCode())) * 31;
        SingleReviewDTO.MediaCentricHeaderDTO mediaCentricHeaderDTO = this.mediaCentricHeader;
        int hashCode14 = (hashCode13 + (mediaCentricHeaderDTO == null ? 0 : mediaCentricHeaderDTO.hashCode())) * 31;
        SingleReviewDTO.MediaCentricDTO mediaCentricDTO = this.mediaCentric;
        int hashCode15 = (hashCode14 + (mediaCentricDTO == null ? 0 : mediaCentricDTO.hashCode())) * 31;
        SingleReviewDTO.ContextReviewsDTO contextReviewsDTO = this.contextReviews;
        int hashCode16 = (hashCode15 + (contextReviewsDTO == null ? 0 : contextReviewsDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map2 = this.tileReviewTracking;
        int hashCode17 = (hashCode16 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map3 = this.reviewExpandTrackingInfo;
        int a12 = C3532b.a((this.galleryType.hashCode() + ((hashCode17 + (map3 == null ? 0 : map3.hashCode())) * 31)) * 31, 31, this.hasItems);
        CornerRadius cornerRadius = this.mediaPreviewCornerRadius;
        int hashCode18 = (a12 + (cornerRadius == null ? 0 : cornerRadius.hashCode())) * 31;
        SingleReviewDTO.BadgeTextDTO badgeTextDTO = this.badgeText;
        return hashCode18 + (badgeTextDTO != null ? badgeTextDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i11 = this.indent;
        String str = this.uuid;
        long j11 = this.productId;
        SingleReviewDTO.HeaderDTO headerDTO = this.header;
        List<MediaDTO> list = this.photos;
        List<MediaDTO> list2 = this.videos;
        ButtonV3Atom.LargeBorderlessButton largeBorderlessButton = this.showReviewGalleryButton;
        List<TextAtom> list3 = this.contextQuestions;
        List<SingleReviewDTO.ButtonBlockDTO> list4 = this.buttonBlocks;
        List<SingleReviewDTO.BodySectionDTO> list5 = this.bodySections;
        ButtonV3Atom.LargeButton largeButton = this.showOtherReviewsButton;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        SingleReviewDTO.UserLikesDTO userLikesDTO = this.userLikes;
        SingleReviewDTO.ActionsFooterDTO actionsFooterDTO = this.actionsFooter;
        List<BadgeDTO> list6 = this.aspects;
        Integer num = this.reviewCollapseThreshold;
        SingleReviewDTO.MediaCentricHeaderDTO mediaCentricHeaderDTO = this.mediaCentricHeader;
        SingleReviewDTO.MediaCentricDTO mediaCentricDTO = this.mediaCentric;
        SingleReviewDTO.ContextReviewsDTO contextReviewsDTO = this.contextReviews;
        Map<String, TokenizedTrackingInfo> map2 = this.tileReviewTracking;
        Map<String, TokenizedTrackingInfo> map3 = this.reviewExpandTrackingInfo;
        SingleReviewGalleryType singleReviewGalleryType = this.galleryType;
        boolean z11 = this.hasItems;
        CornerRadius cornerRadius = this.mediaPreviewCornerRadius;
        SingleReviewDTO.BadgeTextDTO badgeTextDTO = this.badgeText;
        StringBuilder g10 = e.g(i11, "SingleReviewDO(indent=", ", uuid=", str, ", productId=");
        g10.append(j11);
        g10.append(", header=");
        g10.append(headerDTO);
        C2860c.g(", photos=", ", videos=", g10, list, list2);
        g10.append(", showReviewGalleryButton=");
        g10.append(largeBorderlessButton);
        g10.append(", contextQuestions=");
        g10.append(list3);
        C2860c.g(", buttonBlocks=", ", bodySections=", g10, list4, list5);
        g10.append(", showOtherReviewsButton=");
        g10.append(largeButton);
        g10.append(", trackingInfo=");
        g10.append(map);
        g10.append(", userLikes=");
        g10.append(userLikesDTO);
        g10.append(", actionsFooter=");
        g10.append(actionsFooterDTO);
        g10.append(", aspects=");
        g10.append(list6);
        g10.append(", reviewCollapseThreshold=");
        g10.append(num);
        g10.append(", mediaCentricHeader=");
        g10.append(mediaCentricHeaderDTO);
        g10.append(", mediaCentric=");
        g10.append(mediaCentricDTO);
        g10.append(", contextReviews=");
        g10.append(contextReviewsDTO);
        g10.append(", tileReviewTracking=");
        g10.append(map2);
        g10.append(", reviewExpandTrackingInfo=");
        g10.append(map3);
        g10.append(", galleryType=");
        g10.append(singleReviewGalleryType);
        g10.append(", hasItems=");
        g10.append(z11);
        g10.append(", mediaPreviewCornerRadius=");
        g10.append(cornerRadius);
        g10.append(", badgeText=");
        g10.append(badgeTextDTO);
        g10.append(")");
        return g10.toString();
    }
}
