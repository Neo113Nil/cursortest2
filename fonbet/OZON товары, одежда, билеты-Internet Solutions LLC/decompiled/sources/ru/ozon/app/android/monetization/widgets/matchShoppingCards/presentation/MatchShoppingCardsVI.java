package ru.ozon.app.android.monetization.widgets.matchShoppingCards.presentation;

import G.g;
import GR.b;
import Ih.a;
import Kk.C3532b;
import Pk0.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
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

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0081\b\u0018\u00002\u00020\u0001:\u0005/0123BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\\\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b*\u0010)R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010+\u001a\u0004\b.\u0010-¨\u00064"}, d2 = {"Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsVI;", "Ll20/c;", "", "id", "Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsVI$Header;", CommentV3DTO.HEADER_FIELD_NAME, "", "Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsVI$Card;", "cards", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "requestCardsAction", "refreshAction", "Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsVI$ReactionButton;", "likeButton", "dislikeButton", "<init>", "(JLru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsVI$Header;Ljava/util/List;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsVI$ReactionButton;Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsVI$ReactionButton;)V", "copy", "(JLru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsVI$Header;Ljava/util/List;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsVI$ReactionButton;Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsVI$ReactionButton;)Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsVI;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsVI$Header;", "getHeader", "()Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsVI$Header;", "Ljava/util/List;", "getCards", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getRequestCardsAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getRefreshAction", "Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsVI$ReactionButton;", "getLikeButton", "()Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsVI$ReactionButton;", "getDislikeButton", "Header", "Card", "ProductInfo", "ReactionButton", "Gradient", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class MatchShoppingCardsVI implements c {

    @NotNull
    private final List<Card> cards;

    @NotNull
    private final ReactionButton dislikeButton;

    @NotNull
    private final Header header;
    private final long id;

    @NotNull
    private final ReactionButton likeButton;

    @NotNull
    private final AtomActionDTO refreshAction;

    @NotNull
    private final AtomActionDTO requestCardsAction;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001:\u0001&B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsVI$Card;", "", "Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsVI$ProductInfo;", ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductItemContentDTO.PRODUCT_INFO_FIELD_NAME, "Lru/ozon/uni/atoms/data/AtomActionDTO;", "likeAction", "dislikeAction", "shareAction", "Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsVI$Card$TrackingInfo;", "trackingInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "testInfo", "<init>", "(Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsVI$ProductInfo;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsVI$Card$TrackingInfo;Lru/ozon/uni/atoms/data/TestInfo;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsVI$ProductInfo;", "getProductInfo", "()Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsVI$ProductInfo;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getLikeAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getDislikeAction", "getShareAction", "Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsVI$Card$TrackingInfo;", "getTrackingInfo", "()Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsVI$Card$TrackingInfo;", "Lru/ozon/uni/atoms/data/TestInfo;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "TrackingInfo", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Card {
        private final AtomActionDTO dislikeAction;

        @NotNull
        private final AtomActionDTO likeAction;

        @NotNull
        private final ProductInfo productInfo;

        @NotNull
        private final AtomActionDTO shareAction;
        private final TestInfo testInfo;
        private final TrackingInfo trackingInfo;

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u001e\u0010\u0018¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsVI$Card$TrackingInfo;", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "click", "view", "like", "dislike", "swipeLeft", "swipeRight", "share", "<init>", "(Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "getClick", "()Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "getView", "getLike", "getDislike", "getSwipeLeft", "getSwipeRight", "getShare", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class TrackingInfo {
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

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0019B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsVI$Gradient;", "", "Lru/ozon/uni/core/models/GradientDirection;", "direction", "", "Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsVI$Gradient$Stop;", "stops", "<init>", "(Lru/ozon/uni/core/models/GradientDirection;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/core/models/GradientDirection;", "getDirection", "()Lru/ozon/uni/core/models/GradientDirection;", "Ljava/util/List;", "getStops", "()Ljava/util/List;", "Stop", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Gradient {

        @NotNull
        private final GradientDirection direction;

        @NotNull
        private final List<Stop> stops;

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsVI$Gradient$Stop;", "", "", "color", "", "position", "<init>", "(Ljava/lang/String;F)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getColor", "F", "getPosition", "()F", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Stop {

            @NotNull
            private final String color;
            private final float position;

            public Stop(@NotNull String color, float f7) {
                Intrinsics.checkNotNullParameter(color, "color");
                this.color = color;
                this.position = f7;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Stop)) {
                    return false;
                }
                Stop stop = (Stop) other;
                return Intrinsics.d(this.color, stop.color) && Float.compare(this.position, stop.position) == 0;
            }

            @NotNull
            public final String getColor() {
                return this.color;
            }

            public final float getPosition() {
                return this.position;
            }

            public int hashCode() {
                return Float.hashCode(this.position) + (this.color.hashCode() * 31);
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

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJF\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b!\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsVI$Header;", "", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "", "deferredBadge", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "leftIcon", "rightIcon", "Lru/ozon/uni/atoms/data/TestInfo;", "testInfo", "<init>", "(Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;ZLru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/TestInfo;)V", "copy", "(Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;ZLru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/TestInfo;)Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsVI$Header;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Z", "getDeferredBadge", "()Z", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getLeftIcon", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getRightIcon", "Lru/ozon/uni/atoms/data/TestInfo;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Header {

        @NotNull
        private final BadgeDTO badge;
        private final boolean deferredBadge;
        private final IconButtonV3DTO leftIcon;

        @NotNull
        private final IconButtonV3DTO rightIcon;
        private final TestInfo testInfo;

        public Header(@NotNull BadgeDTO badge, boolean z11, IconButtonV3DTO iconButtonV3DTO, @NotNull IconButtonV3DTO rightIcon, TestInfo testInfo) {
            Intrinsics.checkNotNullParameter(badge, "badge");
            Intrinsics.checkNotNullParameter(rightIcon, "rightIcon");
            this.badge = badge;
            this.deferredBadge = z11;
            this.leftIcon = iconButtonV3DTO;
            this.rightIcon = rightIcon;
            this.testInfo = testInfo;
        }

        public static /* synthetic */ Header copy$default(Header header, BadgeDTO badgeDTO, boolean z11, IconButtonV3DTO iconButtonV3DTO, IconButtonV3DTO iconButtonV3DTO2, TestInfo testInfo, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                badgeDTO = header.badge;
            }
            if ((i11 & 2) != 0) {
                z11 = header.deferredBadge;
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
            return header.copy(badgeDTO, z11, iconButtonV3DTO3, iconButtonV3DTO2, testInfo2);
        }

        @NotNull
        public final Header copy(@NotNull BadgeDTO badge, boolean deferredBadge, IconButtonV3DTO leftIcon, @NotNull IconButtonV3DTO rightIcon, TestInfo testInfo) {
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
            return Intrinsics.d(this.badge, header.badge) && this.deferredBadge == header.deferredBadge && Intrinsics.d(this.leftIcon, header.leftIcon) && Intrinsics.d(this.rightIcon, header.rightIcon) && Intrinsics.d(this.testInfo, header.testInfo);
        }

        @NotNull
        public final BadgeDTO getBadge() {
            return this.badge;
        }

        public final boolean getDeferredBadge() {
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
            int a11 = C3532b.a(this.badge.hashCode() * 31, 31, this.deferredBadge);
            IconButtonV3DTO iconButtonV3DTO = this.leftIcon;
            int c11 = b.c(this.rightIcon, (a11 + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31, 31);
            TestInfo testInfo = this.testInfo;
            return c11 + (testInfo != null ? testInfo.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            BadgeDTO badgeDTO = this.badge;
            boolean z11 = this.deferredBadge;
            IconButtonV3DTO iconButtonV3DTO = this.leftIcon;
            IconButtonV3DTO iconButtonV3DTO2 = this.rightIcon;
            TestInfo testInfo = this.testInfo;
            StringBuilder sb2 = new StringBuilder("Header(badge=");
            sb2.append(badgeDTO);
            sb2.append(", deferredBadge=");
            sb2.append(z11);
            sb2.append(", leftIcon=");
            sb2.append(iconButtonV3DTO);
            sb2.append(", rightIcon=");
            sb2.append(iconButtonV3DTO2);
            sb2.append(", testInfo=");
            return h.c(sb2, testInfo, ")");
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsVI$ProductInfo;", "", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "image", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "titleCell", "<init>", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getTitleCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProductInfo {

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

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u001d\u0010\u000eR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsVI$ReactionButton;", "", "", "iconUrl", "Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsVI$Gradient;", "background", "defaultStroke", "pressedStroke", "lightColor", "Lru/ozon/uni/atoms/data/TestInfo;", "testInfo", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsVI$Gradient;Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsVI$Gradient;Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsVI$Gradient;Ljava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIconUrl", "Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsVI$Gradient;", "getBackground", "()Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsVI$Gradient;", "getDefaultStroke", "getPressedStroke", "getLightColor", "Lru/ozon/uni/atoms/data/TestInfo;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ReactionButton {
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

    public MatchShoppingCardsVI(long j11, @NotNull Header header, @NotNull List<Card> cards, @NotNull AtomActionDTO requestCardsAction, @NotNull AtomActionDTO refreshAction, @NotNull ReactionButton likeButton, @NotNull ReactionButton dislikeButton) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(cards, "cards");
        Intrinsics.checkNotNullParameter(requestCardsAction, "requestCardsAction");
        Intrinsics.checkNotNullParameter(refreshAction, "refreshAction");
        Intrinsics.checkNotNullParameter(likeButton, "likeButton");
        Intrinsics.checkNotNullParameter(dislikeButton, "dislikeButton");
        this.id = j11;
        this.header = header;
        this.cards = cards;
        this.requestCardsAction = requestCardsAction;
        this.refreshAction = refreshAction;
        this.likeButton = likeButton;
        this.dislikeButton = dislikeButton;
    }

    public static /* synthetic */ MatchShoppingCardsVI copy$default(MatchShoppingCardsVI matchShoppingCardsVI, long j11, Header header, List list, AtomActionDTO atomActionDTO, AtomActionDTO atomActionDTO2, ReactionButton reactionButton, ReactionButton reactionButton2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = matchShoppingCardsVI.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            header = matchShoppingCardsVI.header;
        }
        Header header2 = header;
        if ((i11 & 4) != 0) {
            list = matchShoppingCardsVI.cards;
        }
        List list2 = list;
        if ((i11 & 8) != 0) {
            atomActionDTO = matchShoppingCardsVI.requestCardsAction;
        }
        AtomActionDTO atomActionDTO3 = atomActionDTO;
        if ((i11 & 16) != 0) {
            atomActionDTO2 = matchShoppingCardsVI.refreshAction;
        }
        return matchShoppingCardsVI.copy(j12, header2, list2, atomActionDTO3, atomActionDTO2, (i11 & 32) != 0 ? matchShoppingCardsVI.likeButton : reactionButton, (i11 & 64) != 0 ? matchShoppingCardsVI.dislikeButton : reactionButton2);
    }

    @NotNull
    public final MatchShoppingCardsVI copy(long id2, @NotNull Header header, @NotNull List<Card> cards, @NotNull AtomActionDTO requestCardsAction, @NotNull AtomActionDTO refreshAction, @NotNull ReactionButton likeButton, @NotNull ReactionButton dislikeButton) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(cards, "cards");
        Intrinsics.checkNotNullParameter(requestCardsAction, "requestCardsAction");
        Intrinsics.checkNotNullParameter(refreshAction, "refreshAction");
        Intrinsics.checkNotNullParameter(likeButton, "likeButton");
        Intrinsics.checkNotNullParameter(dislikeButton, "dislikeButton");
        return new MatchShoppingCardsVI(id2, header, cards, requestCardsAction, refreshAction, likeButton, dislikeButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MatchShoppingCardsVI)) {
            return false;
        }
        MatchShoppingCardsVI matchShoppingCardsVI = (MatchShoppingCardsVI) other;
        return this.id == matchShoppingCardsVI.id && Intrinsics.d(this.header, matchShoppingCardsVI.header) && Intrinsics.d(this.cards, matchShoppingCardsVI.cards) && Intrinsics.d(this.requestCardsAction, matchShoppingCardsVI.requestCardsAction) && Intrinsics.d(this.refreshAction, matchShoppingCardsVI.refreshAction) && Intrinsics.d(this.likeButton, matchShoppingCardsVI.likeButton) && Intrinsics.d(this.dislikeButton, matchShoppingCardsVI.dislikeButton);
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

    @Override // l20.c
    public long getId() {
        return this.id;
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

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return this.dislikeButton.hashCode() + ((this.likeButton.hashCode() + a.b(this.refreshAction, a.b(this.requestCardsAction, g.b((this.header.hashCode() + (Long.hashCode(this.id) * 31)) * 31, 31, this.cards), 31), 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "MatchShoppingCardsVI(id=" + this.id + ", header=" + this.header + ", cards=" + this.cards + ", requestCardsAction=" + this.requestCardsAction + ", refreshAction=" + this.refreshAction + ", likeButton=" + this.likeButton + ", dislikeButton=" + this.dislikeButton + ")";
    }
}
