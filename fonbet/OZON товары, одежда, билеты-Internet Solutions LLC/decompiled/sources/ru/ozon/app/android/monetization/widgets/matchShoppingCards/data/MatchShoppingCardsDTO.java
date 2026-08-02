package ru.ozon.app.android.monetization.widgets.matchShoppingCards.data;

import G.g;
import GR.b;
import Ih.a;
import Pk0.h;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.core.models.GradientDirection;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001:\u0005'()*+B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\t\u0010\u001d\u001a\u00020\u000bHÆ\u0003J\t\u0010\u001e\u001a\u00020\u000bHÆ\u0003JK\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017¨\u0006,"}, d2 = {"Lru/ozon/app/android/monetization/widgets/matchShoppingCards/data/MatchShoppingCardsDTO;", "", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/app/android/monetization/widgets/matchShoppingCards/data/MatchShoppingCardsDTO$Header;", "cards", "", "Lru/ozon/app/android/monetization/widgets/matchShoppingCards/data/MatchShoppingCardsDTO$Card;", "requestCardsAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "refreshAction", "likeButton", "Lru/ozon/app/android/monetization/widgets/matchShoppingCards/data/MatchShoppingCardsDTO$ReactionButton;", "dislikeButton", "<init>", "(Lru/ozon/app/android/monetization/widgets/matchShoppingCards/data/MatchShoppingCardsDTO$Header;Ljava/util/List;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/app/android/monetization/widgets/matchShoppingCards/data/MatchShoppingCardsDTO$ReactionButton;Lru/ozon/app/android/monetization/widgets/matchShoppingCards/data/MatchShoppingCardsDTO$ReactionButton;)V", "getHeader", "()Lru/ozon/app/android/monetization/widgets/matchShoppingCards/data/MatchShoppingCardsDTO$Header;", "getCards", "()Ljava/util/List;", "getRequestCardsAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getRefreshAction", "getLikeButton", "()Lru/ozon/app/android/monetization/widgets/matchShoppingCards/data/MatchShoppingCardsDTO$ReactionButton;", "getDislikeButton", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Header", "Card", "ProductInfo", "ReactionButton", "Gradient", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class MatchShoppingCardsDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<Card> cards;

    @NotNull
    private final ReactionButton dislikeButton;

    @NotNull
    private final Header header;

    @NotNull
    private final ReactionButton likeButton;

    @NotNull
    private final AtomActionDTO refreshAction;

    @NotNull
    private final AtomActionDTO requestCardsAction;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001&B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u000bHÆ\u0003JK\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006'"}, d2 = {"Lru/ozon/app/android/monetization/widgets/matchShoppingCards/data/MatchShoppingCardsDTO$Card;", "", ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductItemContentDTO.PRODUCT_INFO_FIELD_NAME, "Lru/ozon/app/android/monetization/widgets/matchShoppingCards/data/MatchShoppingCardsDTO$ProductInfo;", "likeAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "dislikeAction", "shareAction", "trackingInfo", "Lru/ozon/app/android/monetization/widgets/matchShoppingCards/data/MatchShoppingCardsDTO$Card$TrackingInfo;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "<init>", "(Lru/ozon/app/android/monetization/widgets/matchShoppingCards/data/MatchShoppingCardsDTO$ProductInfo;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/app/android/monetization/widgets/matchShoppingCards/data/MatchShoppingCardsDTO$Card$TrackingInfo;Lru/ozon/uni/atoms/data/TestInfo;)V", "getProductInfo", "()Lru/ozon/app/android/monetization/widgets/matchShoppingCards/data/MatchShoppingCardsDTO$ProductInfo;", "getLikeAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getDislikeAction", "getShareAction", "getTrackingInfo", "()Lru/ozon/app/android/monetization/widgets/matchShoppingCards/data/MatchShoppingCardsDTO$Card$TrackingInfo;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "TrackingInfo", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class Card {
        public static final int $stable = 8;
        private final AtomActionDTO dislikeAction;

        @NotNull
        private final AtomActionDTO likeAction;

        @NotNull
        private final ProductInfo productInfo;

        @NotNull
        private final AtomActionDTO shareAction;
        private final TestInfo testInfo;
        private final TrackingInfo trackingInfo;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J]\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006#"}, d2 = {"Lru/ozon/app/android/monetization/widgets/matchShoppingCards/data/MatchShoppingCardsDTO$Card$TrackingInfo;", "", "click", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "view", "like", "dislike", "swipeLeft", "swipeRight", "share", "<init>", "(Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;)V", "getClick", "()Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "getView", "getLike", "getDislike", "getSwipeLeft", "getSwipeRight", "getShare", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class TrackingInfo {
            public static final int $stable = 8;
            private final TokenizedTrackingInfo click;
            private final TokenizedTrackingInfo dislike;
            private final TokenizedTrackingInfo like;
            private final TokenizedTrackingInfo share;
            private final TokenizedTrackingInfo swipeLeft;
            private final TokenizedTrackingInfo swipeRight;
            private final TokenizedTrackingInfo view;

            public TrackingInfo(TokenizedTrackingInfo tokenizedTrackingInfo, TokenizedTrackingInfo tokenizedTrackingInfo2, TokenizedTrackingInfo tokenizedTrackingInfo3, TokenizedTrackingInfo tokenizedTrackingInfo4, TokenizedTrackingInfo tokenizedTrackingInfo5, TokenizedTrackingInfo tokenizedTrackingInfo6, TokenizedTrackingInfo tokenizedTrackingInfo7) {
                this.click = tokenizedTrackingInfo;
                this.view = tokenizedTrackingInfo2;
                this.like = tokenizedTrackingInfo3;
                this.dislike = tokenizedTrackingInfo4;
                this.swipeLeft = tokenizedTrackingInfo5;
                this.swipeRight = tokenizedTrackingInfo6;
                this.share = tokenizedTrackingInfo7;
            }

            public static /* synthetic */ TrackingInfo copy$default(TrackingInfo trackingInfo, TokenizedTrackingInfo tokenizedTrackingInfo, TokenizedTrackingInfo tokenizedTrackingInfo2, TokenizedTrackingInfo tokenizedTrackingInfo3, TokenizedTrackingInfo tokenizedTrackingInfo4, TokenizedTrackingInfo tokenizedTrackingInfo5, TokenizedTrackingInfo tokenizedTrackingInfo6, TokenizedTrackingInfo tokenizedTrackingInfo7, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    tokenizedTrackingInfo = trackingInfo.click;
                }
                if ((i11 & 2) != 0) {
                    tokenizedTrackingInfo2 = trackingInfo.view;
                }
                if ((i11 & 4) != 0) {
                    tokenizedTrackingInfo3 = trackingInfo.like;
                }
                if ((i11 & 8) != 0) {
                    tokenizedTrackingInfo4 = trackingInfo.dislike;
                }
                if ((i11 & 16) != 0) {
                    tokenizedTrackingInfo5 = trackingInfo.swipeLeft;
                }
                if ((i11 & 32) != 0) {
                    tokenizedTrackingInfo6 = trackingInfo.swipeRight;
                }
                if ((i11 & 64) != 0) {
                    tokenizedTrackingInfo7 = trackingInfo.share;
                }
                TokenizedTrackingInfo tokenizedTrackingInfo8 = tokenizedTrackingInfo6;
                TokenizedTrackingInfo tokenizedTrackingInfo9 = tokenizedTrackingInfo7;
                TokenizedTrackingInfo tokenizedTrackingInfo10 = tokenizedTrackingInfo5;
                TokenizedTrackingInfo tokenizedTrackingInfo11 = tokenizedTrackingInfo3;
                return trackingInfo.copy(tokenizedTrackingInfo, tokenizedTrackingInfo2, tokenizedTrackingInfo11, tokenizedTrackingInfo4, tokenizedTrackingInfo10, tokenizedTrackingInfo8, tokenizedTrackingInfo9);
            }

            /* renamed from: component1, reason: from getter */
            public final TokenizedTrackingInfo getClick() {
                return this.click;
            }

            /* renamed from: component2, reason: from getter */
            public final TokenizedTrackingInfo getView() {
                return this.view;
            }

            /* renamed from: component3, reason: from getter */
            public final TokenizedTrackingInfo getLike() {
                return this.like;
            }

            /* renamed from: component4, reason: from getter */
            public final TokenizedTrackingInfo getDislike() {
                return this.dislike;
            }

            /* renamed from: component5, reason: from getter */
            public final TokenizedTrackingInfo getSwipeLeft() {
                return this.swipeLeft;
            }

            /* renamed from: component6, reason: from getter */
            public final TokenizedTrackingInfo getSwipeRight() {
                return this.swipeRight;
            }

            /* renamed from: component7, reason: from getter */
            public final TokenizedTrackingInfo getShare() {
                return this.share;
            }

            @NotNull
            public final TrackingInfo copy(TokenizedTrackingInfo click, TokenizedTrackingInfo view, TokenizedTrackingInfo like, TokenizedTrackingInfo dislike, TokenizedTrackingInfo swipeLeft, TokenizedTrackingInfo swipeRight, TokenizedTrackingInfo share) {
                return new TrackingInfo(click, view, like, dislike, swipeLeft, swipeRight, share);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TrackingInfo)) {
                    return false;
                }
                TrackingInfo trackingInfo = (TrackingInfo) other;
                return Intrinsics.d(this.click, trackingInfo.click) && Intrinsics.d(this.view, trackingInfo.view) && Intrinsics.d(this.like, trackingInfo.like) && Intrinsics.d(this.dislike, trackingInfo.dislike) && Intrinsics.d(this.swipeLeft, trackingInfo.swipeLeft) && Intrinsics.d(this.swipeRight, trackingInfo.swipeRight) && Intrinsics.d(this.share, trackingInfo.share);
            }

            public final TokenizedTrackingInfo getClick() {
                return this.click;
            }

            public final TokenizedTrackingInfo getDislike() {
                return this.dislike;
            }

            public final TokenizedTrackingInfo getLike() {
                return this.like;
            }

            public final TokenizedTrackingInfo getShare() {
                return this.share;
            }

            public final TokenizedTrackingInfo getSwipeLeft() {
                return this.swipeLeft;
            }

            public final TokenizedTrackingInfo getSwipeRight() {
                return this.swipeRight;
            }

            public final TokenizedTrackingInfo getView() {
                return this.view;
            }

            public int hashCode() {
                TokenizedTrackingInfo tokenizedTrackingInfo = this.click;
                int hashCode = (tokenizedTrackingInfo == null ? 0 : tokenizedTrackingInfo.hashCode()) * 31;
                TokenizedTrackingInfo tokenizedTrackingInfo2 = this.view;
                int hashCode2 = (hashCode + (tokenizedTrackingInfo2 == null ? 0 : tokenizedTrackingInfo2.hashCode())) * 31;
                TokenizedTrackingInfo tokenizedTrackingInfo3 = this.like;
                int hashCode3 = (hashCode2 + (tokenizedTrackingInfo3 == null ? 0 : tokenizedTrackingInfo3.hashCode())) * 31;
                TokenizedTrackingInfo tokenizedTrackingInfo4 = this.dislike;
                int hashCode4 = (hashCode3 + (tokenizedTrackingInfo4 == null ? 0 : tokenizedTrackingInfo4.hashCode())) * 31;
                TokenizedTrackingInfo tokenizedTrackingInfo5 = this.swipeLeft;
                int hashCode5 = (hashCode4 + (tokenizedTrackingInfo5 == null ? 0 : tokenizedTrackingInfo5.hashCode())) * 31;
                TokenizedTrackingInfo tokenizedTrackingInfo6 = this.swipeRight;
                int hashCode6 = (hashCode5 + (tokenizedTrackingInfo6 == null ? 0 : tokenizedTrackingInfo6.hashCode())) * 31;
                TokenizedTrackingInfo tokenizedTrackingInfo7 = this.share;
                return hashCode6 + (tokenizedTrackingInfo7 != null ? tokenizedTrackingInfo7.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "TrackingInfo(click=" + this.click + ", view=" + this.view + ", like=" + this.like + ", dislike=" + this.dislike + ", swipeLeft=" + this.swipeLeft + ", swipeRight=" + this.swipeRight + ", share=" + this.share + ")";
            }
        }

        public Card(@NotNull ProductInfo productInfo, @NotNull AtomActionDTO likeAction, AtomActionDTO atomActionDTO, @NotNull AtomActionDTO shareAction, TrackingInfo trackingInfo, TestInfo testInfo) {
            Intrinsics.checkNotNullParameter(productInfo, "productInfo");
            Intrinsics.checkNotNullParameter(likeAction, "likeAction");
            Intrinsics.checkNotNullParameter(shareAction, "shareAction");
            this.productInfo = productInfo;
            this.likeAction = likeAction;
            this.dislikeAction = atomActionDTO;
            this.shareAction = shareAction;
            this.trackingInfo = trackingInfo;
            this.testInfo = testInfo;
        }

        public static /* synthetic */ Card copy$default(Card card, ProductInfo productInfo, AtomActionDTO atomActionDTO, AtomActionDTO atomActionDTO2, AtomActionDTO atomActionDTO3, TrackingInfo trackingInfo, TestInfo testInfo, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                productInfo = card.productInfo;
            }
            if ((i11 & 2) != 0) {
                atomActionDTO = card.likeAction;
            }
            if ((i11 & 4) != 0) {
                atomActionDTO2 = card.dislikeAction;
            }
            if ((i11 & 8) != 0) {
                atomActionDTO3 = card.shareAction;
            }
            if ((i11 & 16) != 0) {
                trackingInfo = card.trackingInfo;
            }
            if ((i11 & 32) != 0) {
                testInfo = card.testInfo;
            }
            TrackingInfo trackingInfo2 = trackingInfo;
            TestInfo testInfo2 = testInfo;
            return card.copy(productInfo, atomActionDTO, atomActionDTO2, atomActionDTO3, trackingInfo2, testInfo2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ProductInfo getProductInfo() {
            return this.productInfo;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final AtomActionDTO getLikeAction() {
            return this.likeAction;
        }

        /* renamed from: component3, reason: from getter */
        public final AtomActionDTO getDislikeAction() {
            return this.dislikeAction;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final AtomActionDTO getShareAction() {
            return this.shareAction;
        }

        /* renamed from: component5, reason: from getter */
        public final TrackingInfo getTrackingInfo() {
            return this.trackingInfo;
        }

        /* renamed from: component6, reason: from getter */
        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        @NotNull
        public final Card copy(@NotNull ProductInfo productInfo, @NotNull AtomActionDTO likeAction, AtomActionDTO dislikeAction, @NotNull AtomActionDTO shareAction, TrackingInfo trackingInfo, TestInfo testInfo) {
            Intrinsics.checkNotNullParameter(productInfo, "productInfo");
            Intrinsics.checkNotNullParameter(likeAction, "likeAction");
            Intrinsics.checkNotNullParameter(shareAction, "shareAction");
            return new Card(productInfo, likeAction, dislikeAction, shareAction, trackingInfo, testInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Card)) {
                return false;
            }
            Card card = (Card) other;
            return Intrinsics.d(this.productInfo, card.productInfo) && Intrinsics.d(this.likeAction, card.likeAction) && Intrinsics.d(this.dislikeAction, card.dislikeAction) && Intrinsics.d(this.shareAction, card.shareAction) && Intrinsics.d(this.trackingInfo, card.trackingInfo) && Intrinsics.d(this.testInfo, card.testInfo);
        }

        public final AtomActionDTO getDislikeAction() {
            return this.dislikeAction;
        }

        @NotNull
        public final AtomActionDTO getLikeAction() {
            return this.likeAction;
        }

        @NotNull
        public final ProductInfo getProductInfo() {
            return this.productInfo;
        }

        @NotNull
        public final AtomActionDTO getShareAction() {
            return this.shareAction;
        }

        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        public final TrackingInfo getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int b11 = a.b(this.likeAction, this.productInfo.hashCode() * 31, 31);
            AtomActionDTO atomActionDTO = this.dislikeAction;
            int b12 = a.b(this.shareAction, (b11 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31, 31);
            TrackingInfo trackingInfo = this.trackingInfo;
            int hashCode = (b12 + (trackingInfo == null ? 0 : trackingInfo.hashCode())) * 31;
            TestInfo testInfo = this.testInfo;
            return hashCode + (testInfo != null ? testInfo.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Card(productInfo=" + this.productInfo + ", likeAction=" + this.likeAction + ", dislikeAction=" + this.dislikeAction + ", shareAction=" + this.shareAction + ", trackingInfo=" + this.trackingInfo + ", testInfo=" + this.testInfo + ")";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/monetization/widgets/matchShoppingCards/data/MatchShoppingCardsDTO$Gradient;", "", "direction", "Lru/ozon/uni/core/models/GradientDirection;", "stops", "", "Lru/ozon/app/android/monetization/widgets/matchShoppingCards/data/MatchShoppingCardsDTO$Gradient$Stop;", "<init>", "(Lru/ozon/uni/core/models/GradientDirection;Ljava/util/List;)V", "getDirection", "()Lru/ozon/uni/core/models/GradientDirection;", "getStops", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Stop", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class Gradient {
        public static final int $stable = 8;

        @NotNull
        private final GradientDirection direction;

        @NotNull
        private final List<Stop> stops;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/monetization/widgets/matchShoppingCards/data/MatchShoppingCardsDTO$Gradient$Stop;", "", "color", "", "position", "", "<init>", "(Ljava/lang/String;Ljava/lang/Float;)V", "getColor", "()Ljava/lang/String;", "getPosition", "()Ljava/lang/Float;", "Ljava/lang/Float;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Float;)Lru/ozon/app/android/monetization/widgets/matchShoppingCards/data/MatchShoppingCardsDTO$Gradient$Stop;", "equals", "", "other", "hashCode", "", "toString", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Stop {
            public static final int $stable = 0;
            private final String color;
            private final Float position;

            public Stop(String str, Float f7) {
                this.color = str;
                this.position = f7;
            }

            public static /* synthetic */ Stop copy$default(Stop stop, String str, Float f7, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = stop.color;
                }
                if ((i11 & 2) != 0) {
                    f7 = stop.position;
                }
                return stop.copy(str, f7);
            }

            /* renamed from: component1, reason: from getter */
            public final String getColor() {
                return this.color;
            }

            /* renamed from: component2, reason: from getter */
            public final Float getPosition() {
                return this.position;
            }

            @NotNull
            public final Stop copy(String color, Float position) {
                return new Stop(color, position);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Stop)) {
                    return false;
                }
                Stop stop = (Stop) other;
                return Intrinsics.d(this.color, stop.color) && Intrinsics.d(this.position, stop.position);
            }

            public final String getColor() {
                return this.color;
            }

            public final Float getPosition() {
                return this.position;
            }

            public int hashCode() {
                String str = this.color;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                Float f7 = this.position;
                return hashCode + (f7 != null ? f7.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "Stop(color=" + this.color + ", position=" + this.position + ")";
            }
        }

        public Gradient(@NotNull GradientDirection direction, @NotNull List<Stop> stops) {
            Intrinsics.checkNotNullParameter(direction, "direction");
            Intrinsics.checkNotNullParameter(stops, "stops");
            this.direction = direction;
            this.stops = stops;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Gradient copy$default(Gradient gradient, GradientDirection gradientDirection, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                gradientDirection = gradient.direction;
            }
            if ((i11 & 2) != 0) {
                list = gradient.stops;
            }
            return gradient.copy(gradientDirection, list);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final GradientDirection getDirection() {
            return this.direction;
        }

        @NotNull
        public final List<Stop> component2() {
            return this.stops;
        }

        @NotNull
        public final Gradient copy(@NotNull GradientDirection direction, @NotNull List<Stop> stops) {
            Intrinsics.checkNotNullParameter(direction, "direction");
            Intrinsics.checkNotNullParameter(stops, "stops");
            return new Gradient(direction, stops);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Gradient)) {
                return false;
            }
            Gradient gradient = (Gradient) other;
            return this.direction == gradient.direction && Intrinsics.d(this.stops, gradient.stops);
        }

        @NotNull
        public final GradientDirection getDirection() {
            return this.direction;
        }

        @NotNull
        public final List<Stop> getStops() {
            return this.stops;
        }

        public int hashCode() {
            return this.stops.hashCode() + (this.direction.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "Gradient(direction=" + this.direction + ", stops=" + this.stops + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0003JF\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u00052\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, d2 = {"Lru/ozon/app/android/monetization/widgets/matchShoppingCards/data/MatchShoppingCardsDTO$Header;", "", "badge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "deferredBadge", "", "leftIcon", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "rightIcon", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "<init>", "(Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/TestInfo;)V", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getDeferredBadge", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLeftIcon", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getRightIcon", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "component1", "component2", "component3", "component4", "component5", "copy", "(Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/TestInfo;)Lru/ozon/app/android/monetization/widgets/matchShoppingCards/data/MatchShoppingCardsDTO$Header;", "equals", "other", "hashCode", "", "toString", "", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Header {
        public static final int $stable;

        @NotNull
        private final BadgeDTO badge;
        private final Boolean deferredBadge;
        private final IconButtonV3DTO leftIcon;

        @NotNull
        private final IconButtonV3DTO rightIcon;
        private final TestInfo testInfo;

        static {
            int i11 = TestInfo.$stable;
            int i12 = IconButtonV3DTO.$stable;
            $stable = i11 | i12 | i12;
        }

        public Header(@NotNull BadgeDTO badge, Boolean bool, IconButtonV3DTO iconButtonV3DTO, @NotNull IconButtonV3DTO rightIcon, TestInfo testInfo) {
            Intrinsics.checkNotNullParameter(badge, "badge");
            Intrinsics.checkNotNullParameter(rightIcon, "rightIcon");
            this.badge = badge;
            this.deferredBadge = bool;
            this.leftIcon = iconButtonV3DTO;
            this.rightIcon = rightIcon;
            this.testInfo = testInfo;
        }

        public static /* synthetic */ Header copy$default(Header header, BadgeDTO badgeDTO, Boolean bool, IconButtonV3DTO iconButtonV3DTO, IconButtonV3DTO iconButtonV3DTO2, TestInfo testInfo, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                badgeDTO = header.badge;
            }
            if ((i11 & 2) != 0) {
                bool = header.deferredBadge;
            }
            if ((i11 & 4) != 0) {
                iconButtonV3DTO = header.leftIcon;
            }
            if ((i11 & 8) != 0) {
                iconButtonV3DTO2 = header.rightIcon;
            }
            if ((i11 & 16) != 0) {
                testInfo = header.testInfo;
            }
            TestInfo testInfo2 = testInfo;
            IconButtonV3DTO iconButtonV3DTO3 = iconButtonV3DTO;
            return header.copy(badgeDTO, bool, iconButtonV3DTO3, iconButtonV3DTO2, testInfo2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final BadgeDTO getBadge() {
            return this.badge;
        }

        /* renamed from: component2, reason: from getter */
        public final Boolean getDeferredBadge() {
            return this.deferredBadge;
        }

        /* renamed from: component3, reason: from getter */
        public final IconButtonV3DTO getLeftIcon() {
            return this.leftIcon;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final IconButtonV3DTO getRightIcon() {
            return this.rightIcon;
        }

        /* renamed from: component5, reason: from getter */
        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        @NotNull
        public final Header copy(@NotNull BadgeDTO badge, Boolean deferredBadge, IconButtonV3DTO leftIcon, @NotNull IconButtonV3DTO rightIcon, TestInfo testInfo) {
            Intrinsics.checkNotNullParameter(badge, "badge");
            Intrinsics.checkNotNullParameter(rightIcon, "rightIcon");
            return new Header(badge, deferredBadge, leftIcon, rightIcon, testInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Header)) {
                return false;
            }
            Header header = (Header) other;
            return Intrinsics.d(this.badge, header.badge) && Intrinsics.d(this.deferredBadge, header.deferredBadge) && Intrinsics.d(this.leftIcon, header.leftIcon) && Intrinsics.d(this.rightIcon, header.rightIcon) && Intrinsics.d(this.testInfo, header.testInfo);
        }

        @NotNull
        public final BadgeDTO getBadge() {
            return this.badge;
        }

        public final Boolean getDeferredBadge() {
            return this.deferredBadge;
        }

        public final IconButtonV3DTO getLeftIcon() {
            return this.leftIcon;
        }

        @NotNull
        public final IconButtonV3DTO getRightIcon() {
            return this.rightIcon;
        }

        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        public int hashCode() {
            int hashCode = this.badge.hashCode() * 31;
            Boolean bool = this.deferredBadge;
            int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            IconButtonV3DTO iconButtonV3DTO = this.leftIcon;
            int c11 = b.c(this.rightIcon, (hashCode2 + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31, 31);
            TestInfo testInfo = this.testInfo;
            return c11 + (testInfo != null ? testInfo.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            BadgeDTO badgeDTO = this.badge;
            Boolean bool = this.deferredBadge;
            IconButtonV3DTO iconButtonV3DTO = this.leftIcon;
            IconButtonV3DTO iconButtonV3DTO2 = this.rightIcon;
            TestInfo testInfo = this.testInfo;
            StringBuilder sb2 = new StringBuilder("Header(badge=");
            sb2.append(badgeDTO);
            sb2.append(", deferredBadge=");
            sb2.append(bool);
            sb2.append(", leftIcon=");
            sb2.append(iconButtonV3DTO);
            sb2.append(", rightIcon=");
            sb2.append(iconButtonV3DTO2);
            sb2.append(", testInfo=");
            return h.c(sb2, testInfo, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/monetization/widgets/matchShoppingCards/data/MatchShoppingCardsDTO$ProductInfo;", "", "image", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "titleCell", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "<init>", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;)V", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getTitleCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProductInfo {
        public static final int $stable = CellDTO.$stable;

        @NotNull
        private final ImageDTO image;

        @NotNull
        private final CellDTO titleCell;

        public ProductInfo(@NotNull ImageDTO image, @NotNull CellDTO titleCell) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(titleCell, "titleCell");
            this.image = image;
            this.titleCell = titleCell;
        }

        public static /* synthetic */ ProductInfo copy$default(ProductInfo productInfo, ImageDTO imageDTO, CellDTO cellDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                imageDTO = productInfo.image;
            }
            if ((i11 & 2) != 0) {
                cellDTO = productInfo.titleCell;
            }
            return productInfo.copy(imageDTO, cellDTO);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ImageDTO getImage() {
            return this.image;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final CellDTO getTitleCell() {
            return this.titleCell;
        }

        @NotNull
        public final ProductInfo copy(@NotNull ImageDTO image, @NotNull CellDTO titleCell) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(titleCell, "titleCell");
            return new ProductInfo(image, titleCell);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProductInfo)) {
                return false;
            }
            ProductInfo productInfo = (ProductInfo) other;
            return Intrinsics.d(this.image, productInfo.image) && Intrinsics.d(this.titleCell, productInfo.titleCell);
        }

        @NotNull
        public final ImageDTO getImage() {
            return this.image;
        }

        @NotNull
        public final CellDTO getTitleCell() {
            return this.titleCell;
        }

        public int hashCode() {
            return this.titleCell.hashCode() + (this.image.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "ProductInfo(image=" + this.image + ", titleCell=" + this.titleCell + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0003JO\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006#"}, d2 = {"Lru/ozon/app/android/monetization/widgets/matchShoppingCards/data/MatchShoppingCardsDTO$ReactionButton;", "", "iconUrl", "", "background", "Lru/ozon/app/android/monetization/widgets/matchShoppingCards/data/MatchShoppingCardsDTO$Gradient;", "defaultStroke", "pressedStroke", "lightColor", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/monetization/widgets/matchShoppingCards/data/MatchShoppingCardsDTO$Gradient;Lru/ozon/app/android/monetization/widgets/matchShoppingCards/data/MatchShoppingCardsDTO$Gradient;Lru/ozon/app/android/monetization/widgets/matchShoppingCards/data/MatchShoppingCardsDTO$Gradient;Ljava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;)V", "getIconUrl", "()Ljava/lang/String;", "getBackground", "()Lru/ozon/app/android/monetization/widgets/matchShoppingCards/data/MatchShoppingCardsDTO$Gradient;", "getDefaultStroke", "getPressedStroke", "getLightColor", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ReactionButton {
        public static final int $stable = 8;
        private final Gradient background;
        private final Gradient defaultStroke;

        @NotNull
        private final String iconUrl;
        private final String lightColor;
        private final Gradient pressedStroke;
        private final TestInfo testInfo;

        public ReactionButton(@NotNull String iconUrl, Gradient gradient, Gradient gradient2, Gradient gradient3, String str, TestInfo testInfo) {
            Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
            this.iconUrl = iconUrl;
            this.background = gradient;
            this.defaultStroke = gradient2;
            this.pressedStroke = gradient3;
            this.lightColor = str;
            this.testInfo = testInfo;
        }

        public static /* synthetic */ ReactionButton copy$default(ReactionButton reactionButton, String str, Gradient gradient, Gradient gradient2, Gradient gradient3, String str2, TestInfo testInfo, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = reactionButton.iconUrl;
            }
            if ((i11 & 2) != 0) {
                gradient = reactionButton.background;
            }
            if ((i11 & 4) != 0) {
                gradient2 = reactionButton.defaultStroke;
            }
            if ((i11 & 8) != 0) {
                gradient3 = reactionButton.pressedStroke;
            }
            if ((i11 & 16) != 0) {
                str2 = reactionButton.lightColor;
            }
            if ((i11 & 32) != 0) {
                testInfo = reactionButton.testInfo;
            }
            String str3 = str2;
            TestInfo testInfo2 = testInfo;
            return reactionButton.copy(str, gradient, gradient2, gradient3, str3, testInfo2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getIconUrl() {
            return this.iconUrl;
        }

        /* renamed from: component2, reason: from getter */
        public final Gradient getBackground() {
            return this.background;
        }

        /* renamed from: component3, reason: from getter */
        public final Gradient getDefaultStroke() {
            return this.defaultStroke;
        }

        /* renamed from: component4, reason: from getter */
        public final Gradient getPressedStroke() {
            return this.pressedStroke;
        }

        /* renamed from: component5, reason: from getter */
        public final String getLightColor() {
            return this.lightColor;
        }

        /* renamed from: component6, reason: from getter */
        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        @NotNull
        public final ReactionButton copy(@NotNull String iconUrl, Gradient background, Gradient defaultStroke, Gradient pressedStroke, String lightColor, TestInfo testInfo) {
            Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
            return new ReactionButton(iconUrl, background, defaultStroke, pressedStroke, lightColor, testInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ReactionButton)) {
                return false;
            }
            ReactionButton reactionButton = (ReactionButton) other;
            return Intrinsics.d(this.iconUrl, reactionButton.iconUrl) && Intrinsics.d(this.background, reactionButton.background) && Intrinsics.d(this.defaultStroke, reactionButton.defaultStroke) && Intrinsics.d(this.pressedStroke, reactionButton.pressedStroke) && Intrinsics.d(this.lightColor, reactionButton.lightColor) && Intrinsics.d(this.testInfo, reactionButton.testInfo);
        }

        public final Gradient getBackground() {
            return this.background;
        }

        public final Gradient getDefaultStroke() {
            return this.defaultStroke;
        }

        @NotNull
        public final String getIconUrl() {
            return this.iconUrl;
        }

        public final String getLightColor() {
            return this.lightColor;
        }

        public final Gradient getPressedStroke() {
            return this.pressedStroke;
        }

        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        public int hashCode() {
            int hashCode = this.iconUrl.hashCode() * 31;
            Gradient gradient = this.background;
            int hashCode2 = (hashCode + (gradient == null ? 0 : gradient.hashCode())) * 31;
            Gradient gradient2 = this.defaultStroke;
            int hashCode3 = (hashCode2 + (gradient2 == null ? 0 : gradient2.hashCode())) * 31;
            Gradient gradient3 = this.pressedStroke;
            int hashCode4 = (hashCode3 + (gradient3 == null ? 0 : gradient3.hashCode())) * 31;
            String str = this.lightColor;
            int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
            TestInfo testInfo = this.testInfo;
            return hashCode5 + (testInfo != null ? testInfo.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "ReactionButton(iconUrl=" + this.iconUrl + ", background=" + this.background + ", defaultStroke=" + this.defaultStroke + ", pressedStroke=" + this.pressedStroke + ", lightColor=" + this.lightColor + ", testInfo=" + this.testInfo + ")";
        }
    }

    public MatchShoppingCardsDTO(@NotNull Header header, @NotNull List<Card> cards, @NotNull AtomActionDTO requestCardsAction, @NotNull AtomActionDTO refreshAction, @NotNull ReactionButton likeButton, @NotNull ReactionButton dislikeButton) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(cards, "cards");
        Intrinsics.checkNotNullParameter(requestCardsAction, "requestCardsAction");
        Intrinsics.checkNotNullParameter(refreshAction, "refreshAction");
        Intrinsics.checkNotNullParameter(likeButton, "likeButton");
        Intrinsics.checkNotNullParameter(dislikeButton, "dislikeButton");
        this.header = header;
        this.cards = cards;
        this.requestCardsAction = requestCardsAction;
        this.refreshAction = refreshAction;
        this.likeButton = likeButton;
        this.dislikeButton = dislikeButton;
    }

    public static /* synthetic */ MatchShoppingCardsDTO copy$default(MatchShoppingCardsDTO matchShoppingCardsDTO, Header header, List list, AtomActionDTO atomActionDTO, AtomActionDTO atomActionDTO2, ReactionButton reactionButton, ReactionButton reactionButton2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            header = matchShoppingCardsDTO.header;
        }
        if ((i11 & 2) != 0) {
            list = matchShoppingCardsDTO.cards;
        }
        if ((i11 & 4) != 0) {
            atomActionDTO = matchShoppingCardsDTO.requestCardsAction;
        }
        if ((i11 & 8) != 0) {
            atomActionDTO2 = matchShoppingCardsDTO.refreshAction;
        }
        if ((i11 & 16) != 0) {
            reactionButton = matchShoppingCardsDTO.likeButton;
        }
        if ((i11 & 32) != 0) {
            reactionButton2 = matchShoppingCardsDTO.dislikeButton;
        }
        ReactionButton reactionButton3 = reactionButton;
        ReactionButton reactionButton4 = reactionButton2;
        return matchShoppingCardsDTO.copy(header, list, atomActionDTO, atomActionDTO2, reactionButton3, reactionButton4);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Header getHeader() {
        return this.header;
    }

    @NotNull
    public final List<Card> component2() {
        return this.cards;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final AtomActionDTO getRequestCardsAction() {
        return this.requestCardsAction;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final AtomActionDTO getRefreshAction() {
        return this.refreshAction;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final ReactionButton getLikeButton() {
        return this.likeButton;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final ReactionButton getDislikeButton() {
        return this.dislikeButton;
    }

    @NotNull
    public final MatchShoppingCardsDTO copy(@NotNull Header header, @NotNull List<Card> cards, @NotNull AtomActionDTO requestCardsAction, @NotNull AtomActionDTO refreshAction, @NotNull ReactionButton likeButton, @NotNull ReactionButton dislikeButton) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(cards, "cards");
        Intrinsics.checkNotNullParameter(requestCardsAction, "requestCardsAction");
        Intrinsics.checkNotNullParameter(refreshAction, "refreshAction");
        Intrinsics.checkNotNullParameter(likeButton, "likeButton");
        Intrinsics.checkNotNullParameter(dislikeButton, "dislikeButton");
        return new MatchShoppingCardsDTO(header, cards, requestCardsAction, refreshAction, likeButton, dislikeButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MatchShoppingCardsDTO)) {
            return false;
        }
        MatchShoppingCardsDTO matchShoppingCardsDTO = (MatchShoppingCardsDTO) other;
        return Intrinsics.d(this.header, matchShoppingCardsDTO.header) && Intrinsics.d(this.cards, matchShoppingCardsDTO.cards) && Intrinsics.d(this.requestCardsAction, matchShoppingCardsDTO.requestCardsAction) && Intrinsics.d(this.refreshAction, matchShoppingCardsDTO.refreshAction) && Intrinsics.d(this.likeButton, matchShoppingCardsDTO.likeButton) && Intrinsics.d(this.dislikeButton, matchShoppingCardsDTO.dislikeButton);
    }

    @NotNull
    public final List<Card> getCards() {
        return this.cards;
    }

    @NotNull
    public final ReactionButton getDislikeButton() {
        return this.dislikeButton;
    }

    @NotNull
    public final Header getHeader() {
        return this.header;
    }

    @NotNull
    public final ReactionButton getLikeButton() {
        return this.likeButton;
    }

    @NotNull
    public final AtomActionDTO getRefreshAction() {
        return this.refreshAction;
    }

    @NotNull
    public final AtomActionDTO getRequestCardsAction() {
        return this.requestCardsAction;
    }

    public int hashCode() {
        return this.dislikeButton.hashCode() + ((this.likeButton.hashCode() + a.b(this.refreshAction, a.b(this.requestCardsAction, g.b(this.header.hashCode() * 31, 31, this.cards), 31), 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "MatchShoppingCardsDTO(header=" + this.header + ", cards=" + this.cards + ", requestCardsAction=" + this.requestCardsAction + ", refreshAction=" + this.refreshAction + ", likeButton=" + this.likeButton + ", dislikeButton=" + this.dislikeButton + ")";
    }
}
