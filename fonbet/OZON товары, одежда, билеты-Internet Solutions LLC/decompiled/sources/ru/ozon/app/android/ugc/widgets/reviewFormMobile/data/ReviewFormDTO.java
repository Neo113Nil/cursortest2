package ru.ozon.app.android.ugc.widgets.reviewFormMobile.data;

import Am.C2438a;
import B0.C2454a;
import B4.V;
import C.o0;
import G.g;
import Ih.a;
import K00.b;
import Kk.C3532b;
import N3.C3660k;
import T7.P;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.islandSeparator.data.IslandSeparatorDTO;
import ru.ozon.android.composerCommonViewKit.plainText.data.PlainTextDTO;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.widgets.common.mediaPicker.data.MediaPickerDTO;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.data.ReviewFormFieldDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.widgets.separator.SeparatorDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.TooltipDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.disclaimer.DisclaimerDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.atoms.data.productMedia.ProductMediaDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\b\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001:\u0006@ABCDEB£\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u000e\b\u0001\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00010\fHÆ\u0003J\t\u00104\u001a\u00020\u000eHÆ\u0003J\t\u00105\u001a\u00020\u0010HÆ\u0003J\u0017\u00106\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012HÆ\u0003J\u0017\u00107\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012HÆ\u0003J\u0017\u00108\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0017HÆ\u0003J»\u0001\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u000e\b\u0003\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÆ\u0001J\u0013\u0010;\u001a\u00020\u00102\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010=\u001a\u00020>HÖ\u0001J\t\u0010?\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010'R\u001f\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u001f\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b*\u0010)R\u001f\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b+\u0010)R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-¨\u0006F"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO;", "", "productId", "", "reviewUuid", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$HeaderDTO;", "rating", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$RatingDTO;", "headerV2", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$HeaderV2DTO;", "items", "", CommentV3DTO.FOOTER_FIELD_NAME, "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$Footer;", "isRatingFullScreen", "", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "ratingFullScreenTrackingInfo", "closeReviewFormTrackingInfo", "detailedReviewConfig", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$DetailedReviewConfig;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$HeaderDTO;Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$RatingDTO;Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$HeaderV2DTO;Ljava/util/List;Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$Footer;ZLjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$DetailedReviewConfig;)V", "getProductId", "()Ljava/lang/String;", "getReviewUuid", "getHeader", "()Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$HeaderDTO;", "getRating", "()Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$RatingDTO;", "getHeaderV2", "()Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$HeaderV2DTO;", "getItems", "()Ljava/util/List;", "getFooter", "()Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$Footer;", "()Z", "getTrackingInfo", "()Ljava/util/Map;", "getRatingFullScreenTrackingInfo", "getCloseReviewFormTrackingInfo", "getDetailedReviewConfig", "()Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$DetailedReviewConfig;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "other", "hashCode", "", "toString", "HeaderV2DTO", "ClickableTextDTO", "HeaderDTO", "RatingDTO", "Footer", "DetailedReviewConfig", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ReviewFormDTO {
    public static final int $stable = 8;
    private final Map<String, TokenizedTrackingInfo> closeReviewFormTrackingInfo;
    private final DetailedReviewConfig detailedReviewConfig;

    @NotNull
    private final Footer footer;
    private final HeaderDTO header;
    private final HeaderV2DTO headerV2;
    private final boolean isRatingFullScreen;

    @NotNull
    private final List<Object> items;

    @NotNull
    private final String productId;
    private final RatingDTO rating;
    private final Map<String, TokenizedTrackingInfo> ratingFullScreenTrackingInfo;
    private final String reviewUuid;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$ClickableTextDTO;", "", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getTextAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ClickableTextDTO {
        public static final int $stable = 0;

        @NotNull
        private final TextDTO text;
        private final AtomActionDTO textAction;

        public ClickableTextDTO(@NotNull TextDTO text, AtomActionDTO atomActionDTO) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.textAction = atomActionDTO;
        }

        public static /* synthetic */ ClickableTextDTO copy$default(ClickableTextDTO clickableTextDTO, TextDTO textDTO, AtomActionDTO atomActionDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = clickableTextDTO.text;
            }
            if ((i11 & 2) != 0) {
                atomActionDTO = clickableTextDTO.textAction;
            }
            return clickableTextDTO.copy(textDTO, atomActionDTO);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final AtomActionDTO getTextAction() {
            return this.textAction;
        }

        @NotNull
        public final ClickableTextDTO copy(@NotNull TextDTO text, AtomActionDTO textAction) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new ClickableTextDTO(text, textAction);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ClickableTextDTO)) {
                return false;
            }
            ClickableTextDTO clickableTextDTO = (ClickableTextDTO) other;
            return Intrinsics.d(this.text, clickableTextDTO.text) && Intrinsics.d(this.textAction, clickableTextDTO.textAction);
        }

        @NotNull
        public final TextDTO getText() {
            return this.text;
        }

        public final AtomActionDTO getTextAction() {
            return this.textAction;
        }

        public int hashCode() {
            int hashCode = this.text.hashCode() * 31;
            AtomActionDTO atomActionDTO = this.textAction;
            return hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode());
        }

        @NotNull
        public String toString() {
            return "ClickableTextDTO(text=" + this.text + ", textAction=" + this.textAction + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$DetailedReviewConfig;", "", "commentTextCount", "", "mediaCount", "points", "<init>", "(III)V", "getCommentTextCount", "()I", "getMediaCount", "getPoints", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DetailedReviewConfig {
        public static final int $stable = 0;
        private final int commentTextCount;
        private final int mediaCount;
        private final int points;

        public DetailedReviewConfig(int i11, int i12, int i13) {
            this.commentTextCount = i11;
            this.mediaCount = i12;
            this.points = i13;
        }

        public static /* synthetic */ DetailedReviewConfig copy$default(DetailedReviewConfig detailedReviewConfig, int i11, int i12, int i13, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                i11 = detailedReviewConfig.commentTextCount;
            }
            if ((i14 & 2) != 0) {
                i12 = detailedReviewConfig.mediaCount;
            }
            if ((i14 & 4) != 0) {
                i13 = detailedReviewConfig.points;
            }
            return detailedReviewConfig.copy(i11, i12, i13);
        }

        /* renamed from: component1, reason: from getter */
        public final int getCommentTextCount() {
            return this.commentTextCount;
        }

        /* renamed from: component2, reason: from getter */
        public final int getMediaCount() {
            return this.mediaCount;
        }

        /* renamed from: component3, reason: from getter */
        public final int getPoints() {
            return this.points;
        }

        @NotNull
        public final DetailedReviewConfig copy(int commentTextCount, int mediaCount, int points) {
            return new DetailedReviewConfig(commentTextCount, mediaCount, points);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DetailedReviewConfig)) {
                return false;
            }
            DetailedReviewConfig detailedReviewConfig = (DetailedReviewConfig) other;
            return this.commentTextCount == detailedReviewConfig.commentTextCount && this.mediaCount == detailedReviewConfig.mediaCount && this.points == detailedReviewConfig.points;
        }

        public final int getCommentTextCount() {
            return this.commentTextCount;
        }

        public final int getMediaCount() {
            return this.mediaCount;
        }

        public final int getPoints() {
            return this.points;
        }

        public int hashCode() {
            return Integer.hashCode(this.points) + C2454a.a(this.mediaCount, Integer.hashCode(this.commentTextCount) * 31, 31);
        }

        @NotNull
        public String toString() {
            return b.e(this.points, ")", C2438a.a("DetailedReviewConfig(commentTextCount=", this.commentTextCount, ", mediaCount=", ", points=", this.mediaCount));
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002()BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0017\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tHÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u0010 \u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u0019J`\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020\r2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\f\u0010\u0019R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u000e\u0010\u0019¨\u0006*"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$Footer;", "", "submitButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "pointsProgress", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$Footer$PointsProgress;", "footerCell", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$Footer$FooterCellDTO;", "submitErrorTrackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "isBorderHidden", "", "isSticky", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$Footer$PointsProgress;Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$Footer$FooterCellDTO;Ljava/util/Map;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getSubmitButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getPointsProgress", "()Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$Footer$PointsProgress;", "getFooterCell", "()Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$Footer$FooterCellDTO;", "getSubmitErrorTrackingInfo", "()Ljava/util/Map;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$Footer$PointsProgress;Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$Footer$FooterCellDTO;Ljava/util/Map;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$Footer;", "equals", "other", "hashCode", "", "toString", "PointsProgress", "FooterCellDTO", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class Footer {
        public static final int $stable = 8;
        private final FooterCellDTO footerCell;
        private final Boolean isBorderHidden;
        private final Boolean isSticky;
        private final PointsProgress pointsProgress;

        @NotNull
        private final ButtonV3DTO submitButton;
        private final Map<String, TokenizedTrackingInfo> submitErrorTrackingInfo;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u0010$\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u000eHÆ\u0003J`\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u0010'J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\u000bHÖ\u0001J\t\u0010,\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006-"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$Footer$FooterCellDTO;", "", "cell", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "badge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "tooltip", "Lru/ozon/uni/atoms/data/common/TooltipDTO;", "tooltipKey", "", "tooltipShowDuration", "", "backgroundColor", "cornerRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "<init>", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/common/TooltipDTO;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lru/ozon/uni/atoms/data/common/CornerRadius;)V", "getCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getTooltip", "()Lru/ozon/uni/atoms/data/common/TooltipDTO;", "getTooltipKey", "()Ljava/lang/String;", "getTooltipShowDuration", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBackgroundColor", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/common/TooltipDTO;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lru/ozon/uni/atoms/data/common/CornerRadius;)Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$Footer$FooterCellDTO;", "equals", "", "other", "hashCode", "toString", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class FooterCellDTO {
            public static final int $stable = TooltipDTO.$stable | CellDTO.$stable;
            private final String backgroundColor;
            private final BadgeDTO badge;

            @NotNull
            private final CellDTO cell;
            private final CornerRadius cornerRadius;
            private final TooltipDTO tooltip;
            private final String tooltipKey;
            private final Integer tooltipShowDuration;

            public FooterCellDTO(@NotNull CellDTO cell, BadgeDTO badgeDTO, TooltipDTO tooltipDTO, String str, Integer num, String str2, CornerRadius cornerRadius) {
                Intrinsics.checkNotNullParameter(cell, "cell");
                this.cell = cell;
                this.badge = badgeDTO;
                this.tooltip = tooltipDTO;
                this.tooltipKey = str;
                this.tooltipShowDuration = num;
                this.backgroundColor = str2;
                this.cornerRadius = cornerRadius;
            }

            public static /* synthetic */ FooterCellDTO copy$default(FooterCellDTO footerCellDTO, CellDTO cellDTO, BadgeDTO badgeDTO, TooltipDTO tooltipDTO, String str, Integer num, String str2, CornerRadius cornerRadius, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    cellDTO = footerCellDTO.cell;
                }
                if ((i11 & 2) != 0) {
                    badgeDTO = footerCellDTO.badge;
                }
                if ((i11 & 4) != 0) {
                    tooltipDTO = footerCellDTO.tooltip;
                }
                if ((i11 & 8) != 0) {
                    str = footerCellDTO.tooltipKey;
                }
                if ((i11 & 16) != 0) {
                    num = footerCellDTO.tooltipShowDuration;
                }
                if ((i11 & 32) != 0) {
                    str2 = footerCellDTO.backgroundColor;
                }
                if ((i11 & 64) != 0) {
                    cornerRadius = footerCellDTO.cornerRadius;
                }
                String str3 = str2;
                CornerRadius cornerRadius2 = cornerRadius;
                Integer num2 = num;
                TooltipDTO tooltipDTO2 = tooltipDTO;
                return footerCellDTO.copy(cellDTO, badgeDTO, tooltipDTO2, str, num2, str3, cornerRadius2);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final CellDTO getCell() {
                return this.cell;
            }

            /* renamed from: component2, reason: from getter */
            public final BadgeDTO getBadge() {
                return this.badge;
            }

            /* renamed from: component3, reason: from getter */
            public final TooltipDTO getTooltip() {
                return this.tooltip;
            }

            /* renamed from: component4, reason: from getter */
            public final String getTooltipKey() {
                return this.tooltipKey;
            }

            /* renamed from: component5, reason: from getter */
            public final Integer getTooltipShowDuration() {
                return this.tooltipShowDuration;
            }

            /* renamed from: component6, reason: from getter */
            public final String getBackgroundColor() {
                return this.backgroundColor;
            }

            /* renamed from: component7, reason: from getter */
            public final CornerRadius getCornerRadius() {
                return this.cornerRadius;
            }

            @NotNull
            public final FooterCellDTO copy(@NotNull CellDTO cell, BadgeDTO badge, TooltipDTO tooltip, String tooltipKey, Integer tooltipShowDuration, String backgroundColor, CornerRadius cornerRadius) {
                Intrinsics.checkNotNullParameter(cell, "cell");
                return new FooterCellDTO(cell, badge, tooltip, tooltipKey, tooltipShowDuration, backgroundColor, cornerRadius);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof FooterCellDTO)) {
                    return false;
                }
                FooterCellDTO footerCellDTO = (FooterCellDTO) other;
                return Intrinsics.d(this.cell, footerCellDTO.cell) && Intrinsics.d(this.badge, footerCellDTO.badge) && Intrinsics.d(this.tooltip, footerCellDTO.tooltip) && Intrinsics.d(this.tooltipKey, footerCellDTO.tooltipKey) && Intrinsics.d(this.tooltipShowDuration, footerCellDTO.tooltipShowDuration) && Intrinsics.d(this.backgroundColor, footerCellDTO.backgroundColor) && this.cornerRadius == footerCellDTO.cornerRadius;
            }

            public final String getBackgroundColor() {
                return this.backgroundColor;
            }

            public final BadgeDTO getBadge() {
                return this.badge;
            }

            @NotNull
            public final CellDTO getCell() {
                return this.cell;
            }

            public final CornerRadius getCornerRadius() {
                return this.cornerRadius;
            }

            public final TooltipDTO getTooltip() {
                return this.tooltip;
            }

            public final String getTooltipKey() {
                return this.tooltipKey;
            }

            public final Integer getTooltipShowDuration() {
                return this.tooltipShowDuration;
            }

            public int hashCode() {
                int hashCode = this.cell.hashCode() * 31;
                BadgeDTO badgeDTO = this.badge;
                int hashCode2 = (hashCode + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
                TooltipDTO tooltipDTO = this.tooltip;
                int hashCode3 = (hashCode2 + (tooltipDTO == null ? 0 : tooltipDTO.hashCode())) * 31;
                String str = this.tooltipKey;
                int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
                Integer num = this.tooltipShowDuration;
                int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
                String str2 = this.backgroundColor;
                int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
                CornerRadius cornerRadius = this.cornerRadius;
                return hashCode6 + (cornerRadius != null ? cornerRadius.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                CellDTO cellDTO = this.cell;
                BadgeDTO badgeDTO = this.badge;
                TooltipDTO tooltipDTO = this.tooltip;
                String str = this.tooltipKey;
                Integer num = this.tooltipShowDuration;
                String str2 = this.backgroundColor;
                CornerRadius cornerRadius = this.cornerRadius;
                StringBuilder sb2 = new StringBuilder("FooterCellDTO(cell=");
                sb2.append(cellDTO);
                sb2.append(", badge=");
                sb2.append(badgeDTO);
                sb2.append(", tooltip=");
                sb2.append(tooltipDTO);
                sb2.append(", tooltipKey=");
                sb2.append(str);
                sb2.append(", tooltipShowDuration=");
                V.f(num, ", backgroundColor=", str2, ", cornerRadius=", sb2);
                sb2.append(cornerRadius);
                sb2.append(")");
                return sb2.toString();
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$Footer$PointsProgress;", "", "pointsCell", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "progressBarColor", "", "<init>", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;Ljava/lang/String;)V", "getPointsCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getProgressBarColor", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class PointsProgress {
            public static final int $stable = CellDTO.$stable;

            @NotNull
            private final CellDTO pointsCell;

            @NotNull
            private final String progressBarColor;

            public PointsProgress(@NotNull CellDTO pointsCell, @NotNull String progressBarColor) {
                Intrinsics.checkNotNullParameter(pointsCell, "pointsCell");
                Intrinsics.checkNotNullParameter(progressBarColor, "progressBarColor");
                this.pointsCell = pointsCell;
                this.progressBarColor = progressBarColor;
            }

            public static /* synthetic */ PointsProgress copy$default(PointsProgress pointsProgress, CellDTO cellDTO, String str, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    cellDTO = pointsProgress.pointsCell;
                }
                if ((i11 & 2) != 0) {
                    str = pointsProgress.progressBarColor;
                }
                return pointsProgress.copy(cellDTO, str);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final CellDTO getPointsCell() {
                return this.pointsCell;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final String getProgressBarColor() {
                return this.progressBarColor;
            }

            @NotNull
            public final PointsProgress copy(@NotNull CellDTO pointsCell, @NotNull String progressBarColor) {
                Intrinsics.checkNotNullParameter(pointsCell, "pointsCell");
                Intrinsics.checkNotNullParameter(progressBarColor, "progressBarColor");
                return new PointsProgress(pointsCell, progressBarColor);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PointsProgress)) {
                    return false;
                }
                PointsProgress pointsProgress = (PointsProgress) other;
                return Intrinsics.d(this.pointsCell, pointsProgress.pointsCell) && Intrinsics.d(this.progressBarColor, pointsProgress.progressBarColor);
            }

            @NotNull
            public final CellDTO getPointsCell() {
                return this.pointsCell;
            }

            @NotNull
            public final String getProgressBarColor() {
                return this.progressBarColor;
            }

            public int hashCode() {
                return this.progressBarColor.hashCode() + (this.pointsCell.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return "PointsProgress(pointsCell=" + this.pointsCell + ", progressBarColor=" + this.progressBarColor + ")";
            }
        }

        public Footer(@NotNull ButtonV3DTO submitButton, PointsProgress pointsProgress, FooterCellDTO footerCellDTO, Map<String, TokenizedTrackingInfo> map, Boolean bool, Boolean bool2) {
            Intrinsics.checkNotNullParameter(submitButton, "submitButton");
            this.submitButton = submitButton;
            this.pointsProgress = pointsProgress;
            this.footerCell = footerCellDTO;
            this.submitErrorTrackingInfo = map;
            this.isBorderHidden = bool;
            this.isSticky = bool2;
        }

        public static /* synthetic */ Footer copy$default(Footer footer, ButtonV3DTO buttonV3DTO, PointsProgress pointsProgress, FooterCellDTO footerCellDTO, Map map, Boolean bool, Boolean bool2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                buttonV3DTO = footer.submitButton;
            }
            if ((i11 & 2) != 0) {
                pointsProgress = footer.pointsProgress;
            }
            if ((i11 & 4) != 0) {
                footerCellDTO = footer.footerCell;
            }
            if ((i11 & 8) != 0) {
                map = footer.submitErrorTrackingInfo;
            }
            if ((i11 & 16) != 0) {
                bool = footer.isBorderHidden;
            }
            if ((i11 & 32) != 0) {
                bool2 = footer.isSticky;
            }
            Boolean bool3 = bool;
            Boolean bool4 = bool2;
            return footer.copy(buttonV3DTO, pointsProgress, footerCellDTO, map, bool3, bool4);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ButtonV3DTO getSubmitButton() {
            return this.submitButton;
        }

        /* renamed from: component2, reason: from getter */
        public final PointsProgress getPointsProgress() {
            return this.pointsProgress;
        }

        /* renamed from: component3, reason: from getter */
        public final FooterCellDTO getFooterCell() {
            return this.footerCell;
        }

        public final Map<String, TokenizedTrackingInfo> component4() {
            return this.submitErrorTrackingInfo;
        }

        /* renamed from: component5, reason: from getter */
        public final Boolean getIsBorderHidden() {
            return this.isBorderHidden;
        }

        /* renamed from: component6, reason: from getter */
        public final Boolean getIsSticky() {
            return this.isSticky;
        }

        @NotNull
        public final Footer copy(@NotNull ButtonV3DTO submitButton, PointsProgress pointsProgress, FooterCellDTO footerCell, Map<String, TokenizedTrackingInfo> submitErrorTrackingInfo, Boolean isBorderHidden, Boolean isSticky) {
            Intrinsics.checkNotNullParameter(submitButton, "submitButton");
            return new Footer(submitButton, pointsProgress, footerCell, submitErrorTrackingInfo, isBorderHidden, isSticky);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Footer)) {
                return false;
            }
            Footer footer = (Footer) other;
            return Intrinsics.d(this.submitButton, footer.submitButton) && Intrinsics.d(this.pointsProgress, footer.pointsProgress) && Intrinsics.d(this.footerCell, footer.footerCell) && Intrinsics.d(this.submitErrorTrackingInfo, footer.submitErrorTrackingInfo) && Intrinsics.d(this.isBorderHidden, footer.isBorderHidden) && Intrinsics.d(this.isSticky, footer.isSticky);
        }

        public final FooterCellDTO getFooterCell() {
            return this.footerCell;
        }

        public final PointsProgress getPointsProgress() {
            return this.pointsProgress;
        }

        @NotNull
        public final ButtonV3DTO getSubmitButton() {
            return this.submitButton;
        }

        public final Map<String, TokenizedTrackingInfo> getSubmitErrorTrackingInfo() {
            return this.submitErrorTrackingInfo;
        }

        public int hashCode() {
            int hashCode = this.submitButton.hashCode() * 31;
            PointsProgress pointsProgress = this.pointsProgress;
            int hashCode2 = (hashCode + (pointsProgress == null ? 0 : pointsProgress.hashCode())) * 31;
            FooterCellDTO footerCellDTO = this.footerCell;
            int hashCode3 = (hashCode2 + (footerCellDTO == null ? 0 : footerCellDTO.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.submitErrorTrackingInfo;
            int hashCode4 = (hashCode3 + (map == null ? 0 : map.hashCode())) * 31;
            Boolean bool = this.isBorderHidden;
            int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.isSticky;
            return hashCode5 + (bool2 != null ? bool2.hashCode() : 0);
        }

        public final Boolean isBorderHidden() {
            return this.isBorderHidden;
        }

        public final Boolean isSticky() {
            return this.isSticky;
        }

        @NotNull
        public String toString() {
            return "Footer(submitButton=" + this.submitButton + ", pointsProgress=" + this.pointsProgress + ", footerCell=" + this.footerCell + ", submitErrorTrackingInfo=" + this.submitErrorTrackingInfo + ", isBorderHidden=" + this.isBorderHidden + ", isSticky=" + this.isSticky + ")";
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002$%B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u000bHÆ\u0003JA\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006&"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$HeaderDTO;", "", "backButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "productCell", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "submitOnBackConfig", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$HeaderDTO$SubmitOnBackConfigDTO;", "placeholdersSheetConfig", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$HeaderDTO$PlaceholdersSheetConfig;", "backgroundColor", "", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$HeaderDTO$SubmitOnBackConfigDTO;Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$HeaderDTO$PlaceholdersSheetConfig;Ljava/lang/String;)V", "getBackButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getProductCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getSubmitOnBackConfig", "()Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$HeaderDTO$SubmitOnBackConfigDTO;", "getPlaceholdersSheetConfig", "()Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$HeaderDTO$PlaceholdersSheetConfig;", "getBackgroundColor", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "SubmitOnBackConfigDTO", "PlaceholdersSheetConfig", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class HeaderDTO {
        public static final int $stable = 8;

        @NotNull
        private final IconButtonV3DTO backButton;
        private final String backgroundColor;
        private final PlaceholdersSheetConfig placeholdersSheetConfig;

        @NotNull
        private final CellDTO productCell;
        private final SubmitOnBackConfigDTO submitOnBackConfig;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$HeaderDTO$PlaceholdersSheetConfig;", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "minRating", "", "<init>", "(Lru/ozon/uni/atoms/data/AtomActionDTO;I)V", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getMinRating", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class PlaceholdersSheetConfig {
            public static final int $stable = 0;

            @NotNull
            private final AtomActionDTO action;
            private final int minRating;

            public PlaceholdersSheetConfig(@NotNull AtomActionDTO action, int i11) {
                Intrinsics.checkNotNullParameter(action, "action");
                this.action = action;
                this.minRating = i11;
            }

            public static /* synthetic */ PlaceholdersSheetConfig copy$default(PlaceholdersSheetConfig placeholdersSheetConfig, AtomActionDTO atomActionDTO, int i11, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    atomActionDTO = placeholdersSheetConfig.action;
                }
                if ((i12 & 2) != 0) {
                    i11 = placeholdersSheetConfig.minRating;
                }
                return placeholdersSheetConfig.copy(atomActionDTO, i11);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final AtomActionDTO getAction() {
                return this.action;
            }

            /* renamed from: component2, reason: from getter */
            public final int getMinRating() {
                return this.minRating;
            }

            @NotNull
            public final PlaceholdersSheetConfig copy(@NotNull AtomActionDTO action, int minRating) {
                Intrinsics.checkNotNullParameter(action, "action");
                return new PlaceholdersSheetConfig(action, minRating);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PlaceholdersSheetConfig)) {
                    return false;
                }
                PlaceholdersSheetConfig placeholdersSheetConfig = (PlaceholdersSheetConfig) other;
                return Intrinsics.d(this.action, placeholdersSheetConfig.action) && this.minRating == placeholdersSheetConfig.minRating;
            }

            @NotNull
            public final AtomActionDTO getAction() {
                return this.action;
            }

            public final int getMinRating() {
                return this.minRating;
            }

            public int hashCode() {
                return Integer.hashCode(this.minRating) + (this.action.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return "PlaceholdersSheetConfig(action=" + this.action + ", minRating=" + this.minRating + ")";
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0017\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0003JK\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\t\u0010\"\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006#"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$HeaderDTO$SubmitOnBackConfigDTO;", "", "minRating", "", "submitAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "backAction", "submitNotification", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "submitActionTrackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(ILru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/notification/NotificationDTO;Ljava/util/Map;)V", "getMinRating", "()I", "getSubmitAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getBackAction", "getSubmitNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "getSubmitActionTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SubmitOnBackConfigDTO {
            public static final int $stable = 8;

            @NotNull
            private final AtomActionDTO backAction;
            private final int minRating;

            @NotNull
            private final AtomActionDTO submitAction;
            private final Map<String, TokenizedTrackingInfo> submitActionTrackingInfo;
            private final NotificationDTO submitNotification;

            public SubmitOnBackConfigDTO(int i11, @NotNull AtomActionDTO submitAction, @NotNull AtomActionDTO backAction, NotificationDTO notificationDTO, Map<String, TokenizedTrackingInfo> map) {
                Intrinsics.checkNotNullParameter(submitAction, "submitAction");
                Intrinsics.checkNotNullParameter(backAction, "backAction");
                this.minRating = i11;
                this.submitAction = submitAction;
                this.backAction = backAction;
                this.submitNotification = notificationDTO;
                this.submitActionTrackingInfo = map;
            }

            public static /* synthetic */ SubmitOnBackConfigDTO copy$default(SubmitOnBackConfigDTO submitOnBackConfigDTO, int i11, AtomActionDTO atomActionDTO, AtomActionDTO atomActionDTO2, NotificationDTO notificationDTO, Map map, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    i11 = submitOnBackConfigDTO.minRating;
                }
                if ((i12 & 2) != 0) {
                    atomActionDTO = submitOnBackConfigDTO.submitAction;
                }
                if ((i12 & 4) != 0) {
                    atomActionDTO2 = submitOnBackConfigDTO.backAction;
                }
                if ((i12 & 8) != 0) {
                    notificationDTO = submitOnBackConfigDTO.submitNotification;
                }
                if ((i12 & 16) != 0) {
                    map = submitOnBackConfigDTO.submitActionTrackingInfo;
                }
                Map map2 = map;
                AtomActionDTO atomActionDTO3 = atomActionDTO2;
                return submitOnBackConfigDTO.copy(i11, atomActionDTO, atomActionDTO3, notificationDTO, map2);
            }

            /* renamed from: component1, reason: from getter */
            public final int getMinRating() {
                return this.minRating;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final AtomActionDTO getSubmitAction() {
                return this.submitAction;
            }

            @NotNull
            /* renamed from: component3, reason: from getter */
            public final AtomActionDTO getBackAction() {
                return this.backAction;
            }

            /* renamed from: component4, reason: from getter */
            public final NotificationDTO getSubmitNotification() {
                return this.submitNotification;
            }

            public final Map<String, TokenizedTrackingInfo> component5() {
                return this.submitActionTrackingInfo;
            }

            @NotNull
            public final SubmitOnBackConfigDTO copy(int minRating, @NotNull AtomActionDTO submitAction, @NotNull AtomActionDTO backAction, NotificationDTO submitNotification, Map<String, TokenizedTrackingInfo> submitActionTrackingInfo) {
                Intrinsics.checkNotNullParameter(submitAction, "submitAction");
                Intrinsics.checkNotNullParameter(backAction, "backAction");
                return new SubmitOnBackConfigDTO(minRating, submitAction, backAction, submitNotification, submitActionTrackingInfo);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SubmitOnBackConfigDTO)) {
                    return false;
                }
                SubmitOnBackConfigDTO submitOnBackConfigDTO = (SubmitOnBackConfigDTO) other;
                return this.minRating == submitOnBackConfigDTO.minRating && Intrinsics.d(this.submitAction, submitOnBackConfigDTO.submitAction) && Intrinsics.d(this.backAction, submitOnBackConfigDTO.backAction) && Intrinsics.d(this.submitNotification, submitOnBackConfigDTO.submitNotification) && Intrinsics.d(this.submitActionTrackingInfo, submitOnBackConfigDTO.submitActionTrackingInfo);
            }

            @NotNull
            public final AtomActionDTO getBackAction() {
                return this.backAction;
            }

            public final int getMinRating() {
                return this.minRating;
            }

            @NotNull
            public final AtomActionDTO getSubmitAction() {
                return this.submitAction;
            }

            public final Map<String, TokenizedTrackingInfo> getSubmitActionTrackingInfo() {
                return this.submitActionTrackingInfo;
            }

            public final NotificationDTO getSubmitNotification() {
                return this.submitNotification;
            }

            public int hashCode() {
                int b11 = a.b(this.backAction, a.b(this.submitAction, Integer.hashCode(this.minRating) * 31, 31), 31);
                NotificationDTO notificationDTO = this.submitNotification;
                int hashCode = (b11 + (notificationDTO == null ? 0 : notificationDTO.hashCode())) * 31;
                Map<String, TokenizedTrackingInfo> map = this.submitActionTrackingInfo;
                return hashCode + (map != null ? map.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                int i11 = this.minRating;
                AtomActionDTO atomActionDTO = this.submitAction;
                AtomActionDTO atomActionDTO2 = this.backAction;
                NotificationDTO notificationDTO = this.submitNotification;
                Map<String, TokenizedTrackingInfo> map = this.submitActionTrackingInfo;
                StringBuilder sb2 = new StringBuilder("SubmitOnBackConfigDTO(minRating=");
                sb2.append(i11);
                sb2.append(", submitAction=");
                sb2.append(atomActionDTO);
                sb2.append(", backAction=");
                sb2.append(atomActionDTO2);
                sb2.append(", submitNotification=");
                sb2.append(notificationDTO);
                sb2.append(", submitActionTrackingInfo=");
                return P.f(sb2, map, ")");
            }
        }

        public HeaderDTO(@NotNull IconButtonV3DTO backButton, @NotNull CellDTO productCell, SubmitOnBackConfigDTO submitOnBackConfigDTO, PlaceholdersSheetConfig placeholdersSheetConfig, String str) {
            Intrinsics.checkNotNullParameter(backButton, "backButton");
            Intrinsics.checkNotNullParameter(productCell, "productCell");
            this.backButton = backButton;
            this.productCell = productCell;
            this.submitOnBackConfig = submitOnBackConfigDTO;
            this.placeholdersSheetConfig = placeholdersSheetConfig;
            this.backgroundColor = str;
        }

        public static /* synthetic */ HeaderDTO copy$default(HeaderDTO headerDTO, IconButtonV3DTO iconButtonV3DTO, CellDTO cellDTO, SubmitOnBackConfigDTO submitOnBackConfigDTO, PlaceholdersSheetConfig placeholdersSheetConfig, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                iconButtonV3DTO = headerDTO.backButton;
            }
            if ((i11 & 2) != 0) {
                cellDTO = headerDTO.productCell;
            }
            if ((i11 & 4) != 0) {
                submitOnBackConfigDTO = headerDTO.submitOnBackConfig;
            }
            if ((i11 & 8) != 0) {
                placeholdersSheetConfig = headerDTO.placeholdersSheetConfig;
            }
            if ((i11 & 16) != 0) {
                str = headerDTO.backgroundColor;
            }
            String str2 = str;
            SubmitOnBackConfigDTO submitOnBackConfigDTO2 = submitOnBackConfigDTO;
            return headerDTO.copy(iconButtonV3DTO, cellDTO, submitOnBackConfigDTO2, placeholdersSheetConfig, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final IconButtonV3DTO getBackButton() {
            return this.backButton;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final CellDTO getProductCell() {
            return this.productCell;
        }

        /* renamed from: component3, reason: from getter */
        public final SubmitOnBackConfigDTO getSubmitOnBackConfig() {
            return this.submitOnBackConfig;
        }

        /* renamed from: component4, reason: from getter */
        public final PlaceholdersSheetConfig getPlaceholdersSheetConfig() {
            return this.placeholdersSheetConfig;
        }

        /* renamed from: component5, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final HeaderDTO copy(@NotNull IconButtonV3DTO backButton, @NotNull CellDTO productCell, SubmitOnBackConfigDTO submitOnBackConfig, PlaceholdersSheetConfig placeholdersSheetConfig, String backgroundColor) {
            Intrinsics.checkNotNullParameter(backButton, "backButton");
            Intrinsics.checkNotNullParameter(productCell, "productCell");
            return new HeaderDTO(backButton, productCell, submitOnBackConfig, placeholdersSheetConfig, backgroundColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HeaderDTO)) {
                return false;
            }
            HeaderDTO headerDTO = (HeaderDTO) other;
            return Intrinsics.d(this.backButton, headerDTO.backButton) && Intrinsics.d(this.productCell, headerDTO.productCell) && Intrinsics.d(this.submitOnBackConfig, headerDTO.submitOnBackConfig) && Intrinsics.d(this.placeholdersSheetConfig, headerDTO.placeholdersSheetConfig) && Intrinsics.d(this.backgroundColor, headerDTO.backgroundColor);
        }

        @NotNull
        public final IconButtonV3DTO getBackButton() {
            return this.backButton;
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final PlaceholdersSheetConfig getPlaceholdersSheetConfig() {
            return this.placeholdersSheetConfig;
        }

        @NotNull
        public final CellDTO getProductCell() {
            return this.productCell;
        }

        public final SubmitOnBackConfigDTO getSubmitOnBackConfig() {
            return this.submitOnBackConfig;
        }

        public int hashCode() {
            int c11 = Bi.b.c(this.productCell, this.backButton.hashCode() * 31, 31);
            SubmitOnBackConfigDTO submitOnBackConfigDTO = this.submitOnBackConfig;
            int hashCode = (c11 + (submitOnBackConfigDTO == null ? 0 : submitOnBackConfigDTO.hashCode())) * 31;
            PlaceholdersSheetConfig placeholdersSheetConfig = this.placeholdersSheetConfig;
            int hashCode2 = (hashCode + (placeholdersSheetConfig == null ? 0 : placeholdersSheetConfig.hashCode())) * 31;
            String str = this.backgroundColor;
            return hashCode2 + (str != null ? str.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            IconButtonV3DTO iconButtonV3DTO = this.backButton;
            CellDTO cellDTO = this.productCell;
            SubmitOnBackConfigDTO submitOnBackConfigDTO = this.submitOnBackConfig;
            PlaceholdersSheetConfig placeholdersSheetConfig = this.placeholdersSheetConfig;
            String str = this.backgroundColor;
            StringBuilder sb2 = new StringBuilder("HeaderDTO(backButton=");
            sb2.append(iconButtonV3DTO);
            sb2.append(", productCell=");
            sb2.append(cellDTO);
            sb2.append(", submitOnBackConfig=");
            sb2.append(submitOnBackConfigDTO);
            sb2.append(", placeholdersSheetConfig=");
            sb2.append(placeholdersSheetConfig);
            sb2.append(", backgroundColor=");
            return o0.c(sb2, str, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\t\u0010\"\u001a\u00020\nHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000eHÆ\u0003JU\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020,HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006-"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$HeaderV2DTO;", "", "productImage", "Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$ClickableTextDTO;", "subtitle", "rating", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$RatingDTO;", "closeButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "submitOnBackConfig", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$HeaderDTO$SubmitOnBackConfigDTO;", "placeholdersSheetConfig", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$HeaderDTO$PlaceholdersSheetConfig;", "<init>", "(Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$ClickableTextDTO;Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$ClickableTextDTO;Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$RatingDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$HeaderDTO$SubmitOnBackConfigDTO;Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$HeaderDTO$PlaceholdersSheetConfig;)V", "getProductImage", "()Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;", "getTitle", "()Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$ClickableTextDTO;", "getSubtitle", "getRating", "()Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$RatingDTO;", "getCloseButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getSubmitOnBackConfig", "()Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$HeaderDTO$SubmitOnBackConfigDTO;", "getPlaceholdersSheetConfig", "()Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$HeaderDTO$PlaceholdersSheetConfig;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class HeaderV2DTO {
        public static final int $stable = 8;

        @NotNull
        private final IconButtonV3DTO closeButton;
        private final HeaderDTO.PlaceholdersSheetConfig placeholdersSheetConfig;

        @NotNull
        private final ProductMediaDTO productImage;

        @NotNull
        private final RatingDTO rating;
        private final HeaderDTO.SubmitOnBackConfigDTO submitOnBackConfig;
        private final ClickableTextDTO subtitle;

        @NotNull
        private final ClickableTextDTO title;

        public HeaderV2DTO(@NotNull ProductMediaDTO productImage, @NotNull ClickableTextDTO title, ClickableTextDTO clickableTextDTO, @NotNull RatingDTO rating, @NotNull IconButtonV3DTO closeButton, HeaderDTO.SubmitOnBackConfigDTO submitOnBackConfigDTO, HeaderDTO.PlaceholdersSheetConfig placeholdersSheetConfig) {
            Intrinsics.checkNotNullParameter(productImage, "productImage");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(rating, "rating");
            Intrinsics.checkNotNullParameter(closeButton, "closeButton");
            this.productImage = productImage;
            this.title = title;
            this.subtitle = clickableTextDTO;
            this.rating = rating;
            this.closeButton = closeButton;
            this.submitOnBackConfig = submitOnBackConfigDTO;
            this.placeholdersSheetConfig = placeholdersSheetConfig;
        }

        public static /* synthetic */ HeaderV2DTO copy$default(HeaderV2DTO headerV2DTO, ProductMediaDTO productMediaDTO, ClickableTextDTO clickableTextDTO, ClickableTextDTO clickableTextDTO2, RatingDTO ratingDTO, IconButtonV3DTO iconButtonV3DTO, HeaderDTO.SubmitOnBackConfigDTO submitOnBackConfigDTO, HeaderDTO.PlaceholdersSheetConfig placeholdersSheetConfig, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                productMediaDTO = headerV2DTO.productImage;
            }
            if ((i11 & 2) != 0) {
                clickableTextDTO = headerV2DTO.title;
            }
            if ((i11 & 4) != 0) {
                clickableTextDTO2 = headerV2DTO.subtitle;
            }
            if ((i11 & 8) != 0) {
                ratingDTO = headerV2DTO.rating;
            }
            if ((i11 & 16) != 0) {
                iconButtonV3DTO = headerV2DTO.closeButton;
            }
            if ((i11 & 32) != 0) {
                submitOnBackConfigDTO = headerV2DTO.submitOnBackConfig;
            }
            if ((i11 & 64) != 0) {
                placeholdersSheetConfig = headerV2DTO.placeholdersSheetConfig;
            }
            HeaderDTO.SubmitOnBackConfigDTO submitOnBackConfigDTO2 = submitOnBackConfigDTO;
            HeaderDTO.PlaceholdersSheetConfig placeholdersSheetConfig2 = placeholdersSheetConfig;
            IconButtonV3DTO iconButtonV3DTO2 = iconButtonV3DTO;
            ClickableTextDTO clickableTextDTO3 = clickableTextDTO2;
            return headerV2DTO.copy(productMediaDTO, clickableTextDTO, clickableTextDTO3, ratingDTO, iconButtonV3DTO2, submitOnBackConfigDTO2, placeholdersSheetConfig2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ProductMediaDTO getProductImage() {
            return this.productImage;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final ClickableTextDTO getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final ClickableTextDTO getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final RatingDTO getRating() {
            return this.rating;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final IconButtonV3DTO getCloseButton() {
            return this.closeButton;
        }

        /* renamed from: component6, reason: from getter */
        public final HeaderDTO.SubmitOnBackConfigDTO getSubmitOnBackConfig() {
            return this.submitOnBackConfig;
        }

        /* renamed from: component7, reason: from getter */
        public final HeaderDTO.PlaceholdersSheetConfig getPlaceholdersSheetConfig() {
            return this.placeholdersSheetConfig;
        }

        @NotNull
        public final HeaderV2DTO copy(@NotNull ProductMediaDTO productImage, @NotNull ClickableTextDTO title, ClickableTextDTO subtitle, @NotNull RatingDTO rating, @NotNull IconButtonV3DTO closeButton, HeaderDTO.SubmitOnBackConfigDTO submitOnBackConfig, HeaderDTO.PlaceholdersSheetConfig placeholdersSheetConfig) {
            Intrinsics.checkNotNullParameter(productImage, "productImage");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(rating, "rating");
            Intrinsics.checkNotNullParameter(closeButton, "closeButton");
            return new HeaderV2DTO(productImage, title, subtitle, rating, closeButton, submitOnBackConfig, placeholdersSheetConfig);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HeaderV2DTO)) {
                return false;
            }
            HeaderV2DTO headerV2DTO = (HeaderV2DTO) other;
            return Intrinsics.d(this.productImage, headerV2DTO.productImage) && Intrinsics.d(this.title, headerV2DTO.title) && Intrinsics.d(this.subtitle, headerV2DTO.subtitle) && Intrinsics.d(this.rating, headerV2DTO.rating) && Intrinsics.d(this.closeButton, headerV2DTO.closeButton) && Intrinsics.d(this.submitOnBackConfig, headerV2DTO.submitOnBackConfig) && Intrinsics.d(this.placeholdersSheetConfig, headerV2DTO.placeholdersSheetConfig);
        }

        @NotNull
        public final IconButtonV3DTO getCloseButton() {
            return this.closeButton;
        }

        public final HeaderDTO.PlaceholdersSheetConfig getPlaceholdersSheetConfig() {
            return this.placeholdersSheetConfig;
        }

        @NotNull
        public final ProductMediaDTO getProductImage() {
            return this.productImage;
        }

        @NotNull
        public final RatingDTO getRating() {
            return this.rating;
        }

        public final HeaderDTO.SubmitOnBackConfigDTO getSubmitOnBackConfig() {
            return this.submitOnBackConfig;
        }

        public final ClickableTextDTO getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final ClickableTextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = (this.title.hashCode() + (this.productImage.hashCode() * 31)) * 31;
            ClickableTextDTO clickableTextDTO = this.subtitle;
            int c11 = GR.b.c(this.closeButton, (this.rating.hashCode() + ((hashCode + (clickableTextDTO == null ? 0 : clickableTextDTO.hashCode())) * 31)) * 31, 31);
            HeaderDTO.SubmitOnBackConfigDTO submitOnBackConfigDTO = this.submitOnBackConfig;
            int hashCode2 = (c11 + (submitOnBackConfigDTO == null ? 0 : submitOnBackConfigDTO.hashCode())) * 31;
            HeaderDTO.PlaceholdersSheetConfig placeholdersSheetConfig = this.placeholdersSheetConfig;
            return hashCode2 + (placeholdersSheetConfig != null ? placeholdersSheetConfig.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "HeaderV2DTO(productImage=" + this.productImage + ", title=" + this.title + ", subtitle=" + this.subtitle + ", rating=" + this.rating + ", closeButton=" + this.closeButton + ", submitOnBackConfig=" + this.submitOnBackConfig + ", placeholdersSheetConfig=" + this.placeholdersSheetConfig + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003JF\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\tHÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006#"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$RatingDTO;", "", "uploadKey", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "rating", "Lru/ozon/uni/atoms/data/rating/RatingDTO;", "points", "", "backgroundColor", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/rating/RatingDTO;Ljava/lang/Integer;Ljava/lang/String;)V", "getUploadKey", "()Ljava/lang/String;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getRating", "()Lru/ozon/uni/atoms/data/rating/RatingDTO;", "getPoints", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBackgroundColor", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/rating/RatingDTO;Ljava/lang/Integer;Ljava/lang/String;)Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$RatingDTO;", "equals", "", "other", "hashCode", "toString", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RatingDTO {
        public static final int $stable = ru.ozon.uni.atoms.data.rating.RatingDTO.$stable;
        private final String backgroundColor;
        private final Integer points;

        @NotNull
        private final ru.ozon.uni.atoms.data.rating.RatingDTO rating;
        private final TextDTO title;

        @NotNull
        private final String uploadKey;

        public RatingDTO(@NotNull String uploadKey, TextDTO textDTO, @NotNull ru.ozon.uni.atoms.data.rating.RatingDTO rating, Integer num, String str) {
            Intrinsics.checkNotNullParameter(uploadKey, "uploadKey");
            Intrinsics.checkNotNullParameter(rating, "rating");
            this.uploadKey = uploadKey;
            this.title = textDTO;
            this.rating = rating;
            this.points = num;
            this.backgroundColor = str;
        }

        public static /* synthetic */ RatingDTO copy$default(RatingDTO ratingDTO, String str, TextDTO textDTO, ru.ozon.uni.atoms.data.rating.RatingDTO ratingDTO2, Integer num, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = ratingDTO.uploadKey;
            }
            if ((i11 & 2) != 0) {
                textDTO = ratingDTO.title;
            }
            if ((i11 & 4) != 0) {
                ratingDTO2 = ratingDTO.rating;
            }
            if ((i11 & 8) != 0) {
                num = ratingDTO.points;
            }
            if ((i11 & 16) != 0) {
                str2 = ratingDTO.backgroundColor;
            }
            String str3 = str2;
            ru.ozon.uni.atoms.data.rating.RatingDTO ratingDTO3 = ratingDTO2;
            return ratingDTO.copy(str, textDTO, ratingDTO3, num, str3);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getUploadKey() {
            return this.uploadKey;
        }

        /* renamed from: component2, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final ru.ozon.uni.atoms.data.rating.RatingDTO getRating() {
            return this.rating;
        }

        /* renamed from: component4, reason: from getter */
        public final Integer getPoints() {
            return this.points;
        }

        /* renamed from: component5, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final RatingDTO copy(@NotNull String uploadKey, TextDTO title, @NotNull ru.ozon.uni.atoms.data.rating.RatingDTO rating, Integer points, String backgroundColor) {
            Intrinsics.checkNotNullParameter(uploadKey, "uploadKey");
            Intrinsics.checkNotNullParameter(rating, "rating");
            return new RatingDTO(uploadKey, title, rating, points, backgroundColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RatingDTO)) {
                return false;
            }
            RatingDTO ratingDTO = (RatingDTO) other;
            return Intrinsics.d(this.uploadKey, ratingDTO.uploadKey) && Intrinsics.d(this.title, ratingDTO.title) && Intrinsics.d(this.rating, ratingDTO.rating) && Intrinsics.d(this.points, ratingDTO.points) && Intrinsics.d(this.backgroundColor, ratingDTO.backgroundColor);
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final Integer getPoints() {
            return this.points;
        }

        @NotNull
        public final ru.ozon.uni.atoms.data.rating.RatingDTO getRating() {
            return this.rating;
        }

        public final TextDTO getTitle() {
            return this.title;
        }

        @NotNull
        public final String getUploadKey() {
            return this.uploadKey;
        }

        public int hashCode() {
            int hashCode = this.uploadKey.hashCode() * 31;
            TextDTO textDTO = this.title;
            int hashCode2 = (this.rating.hashCode() + ((hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31)) * 31;
            Integer num = this.points;
            int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.backgroundColor;
            return hashCode3 + (str != null ? str.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.uploadKey;
            TextDTO textDTO = this.title;
            ru.ozon.uni.atoms.data.rating.RatingDTO ratingDTO = this.rating;
            Integer num = this.points;
            String str2 = this.backgroundColor;
            StringBuilder b11 = Co.a.b("RatingDTO(uploadKey=", textDTO, str, ", title=", ", rating=");
            b11.append(ratingDTO);
            b11.append(", points=");
            b11.append(num);
            b11.append(", backgroundColor=");
            return o0.c(b11, str2, ")");
        }
    }

    public ReviewFormDTO(@NotNull String productId, String str, HeaderDTO headerDTO, RatingDTO ratingDTO, HeaderV2DTO headerV2DTO, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "atomDisclaimer", type = DisclaimerDTO.class), @ProtoOneOfSignature(name = "variantPicker", type = ReviewFormFieldDTO.VariantPickerDTO.class), @ProtoOneOfSignature(name = "mediaPicker", type = MediaPickerDTO.class), @ProtoOneOfSignature(name = "comment", type = ReviewFormFieldDTO.CommentDTO.class), @ProtoOneOfSignature(name = "questions", type = ReviewFormFieldDTO.QuestionsDTO.class), @ProtoOneOfSignature(name = "anonymous", type = ReviewFormFieldDTO.AnonymousDTO.class), @ProtoOneOfSignature(name = "separator", type = SeparatorDTO.class), @ProtoOneOfSignature(name = "islandSeparator", type = IslandSeparatorDTO.class), @ProtoOneOfSignature(name = "plainText", type = PlainTextDTO.class), @ProtoOneOfSignature(name = "authorCell", type = ReviewFormFieldDTO.AuthorCellDTO.class), @ProtoOneOfSignature(name = "cell", type = CellDTO.class), @ProtoOneOfSignature(name = "cellItem", type = ReviewFormFieldDTO.CellItemDTO.class), @ProtoOneOfSignature(name = "disclaimerItem", type = ReviewFormFieldDTO.DisclaimerItemDTO.class), @ProtoOneOfSignature(name = "plainTextItem", type = ReviewFormFieldDTO.PlainTextItemDTO.class), @ProtoOneOfSignature(name = "separatorItem", type = ReviewFormFieldDTO.SeparatorItemDTO.class), @ProtoOneOfSignature(name = "islandSeparatorItem", type = ReviewFormFieldDTO.IslandSeparatorItemDTO.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends Object> items, @NotNull Footer footer, boolean z11, Map<String, TokenizedTrackingInfo> map, Map<String, TokenizedTrackingInfo> map2, Map<String, TokenizedTrackingInfo> map3, DetailedReviewConfig detailedReviewConfig) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(footer, "footer");
        this.productId = productId;
        this.reviewUuid = str;
        this.header = headerDTO;
        this.rating = ratingDTO;
        this.headerV2 = headerV2DTO;
        this.items = items;
        this.footer = footer;
        this.isRatingFullScreen = z11;
        this.trackingInfo = map;
        this.ratingFullScreenTrackingInfo = map2;
        this.closeReviewFormTrackingInfo = map3;
        this.detailedReviewConfig = detailedReviewConfig;
    }

    public static /* synthetic */ ReviewFormDTO copy$default(ReviewFormDTO reviewFormDTO, String str, String str2, HeaderDTO headerDTO, RatingDTO ratingDTO, HeaderV2DTO headerV2DTO, List list, Footer footer, boolean z11, Map map, Map map2, Map map3, DetailedReviewConfig detailedReviewConfig, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = reviewFormDTO.productId;
        }
        if ((i11 & 2) != 0) {
            str2 = reviewFormDTO.reviewUuid;
        }
        if ((i11 & 4) != 0) {
            headerDTO = reviewFormDTO.header;
        }
        if ((i11 & 8) != 0) {
            ratingDTO = reviewFormDTO.rating;
        }
        if ((i11 & 16) != 0) {
            headerV2DTO = reviewFormDTO.headerV2;
        }
        if ((i11 & 32) != 0) {
            list = reviewFormDTO.items;
        }
        if ((i11 & 64) != 0) {
            footer = reviewFormDTO.footer;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            z11 = reviewFormDTO.isRatingFullScreen;
        }
        if ((i11 & 256) != 0) {
            map = reviewFormDTO.trackingInfo;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            map2 = reviewFormDTO.ratingFullScreenTrackingInfo;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            map3 = reviewFormDTO.closeReviewFormTrackingInfo;
        }
        if ((i11 & 2048) != 0) {
            detailedReviewConfig = reviewFormDTO.detailedReviewConfig;
        }
        Map map4 = map3;
        DetailedReviewConfig detailedReviewConfig2 = detailedReviewConfig;
        Map map5 = map;
        Map map6 = map2;
        Footer footer2 = footer;
        boolean z12 = z11;
        HeaderV2DTO headerV2DTO2 = headerV2DTO;
        List list2 = list;
        return reviewFormDTO.copy(str, str2, headerDTO, ratingDTO, headerV2DTO2, list2, footer2, z12, map5, map6, map4, detailedReviewConfig2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    public final Map<String, TokenizedTrackingInfo> component10() {
        return this.ratingFullScreenTrackingInfo;
    }

    public final Map<String, TokenizedTrackingInfo> component11() {
        return this.closeReviewFormTrackingInfo;
    }

    /* renamed from: component12, reason: from getter */
    public final DetailedReviewConfig getDetailedReviewConfig() {
        return this.detailedReviewConfig;
    }

    /* renamed from: component2, reason: from getter */
    public final String getReviewUuid() {
        return this.reviewUuid;
    }

    /* renamed from: component3, reason: from getter */
    public final HeaderDTO getHeader() {
        return this.header;
    }

    /* renamed from: component4, reason: from getter */
    public final RatingDTO getRating() {
        return this.rating;
    }

    /* renamed from: component5, reason: from getter */
    public final HeaderV2DTO getHeaderV2() {
        return this.headerV2;
    }

    @NotNull
    public final List<Object> component6() {
        return this.items;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final Footer getFooter() {
        return this.footer;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsRatingFullScreen() {
        return this.isRatingFullScreen;
    }

    public final Map<String, TokenizedTrackingInfo> component9() {
        return this.trackingInfo;
    }

    @NotNull
    public final ReviewFormDTO copy(@NotNull String productId, String reviewUuid, HeaderDTO header, RatingDTO rating, HeaderV2DTO headerV2, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "atomDisclaimer", type = DisclaimerDTO.class), @ProtoOneOfSignature(name = "variantPicker", type = ReviewFormFieldDTO.VariantPickerDTO.class), @ProtoOneOfSignature(name = "mediaPicker", type = MediaPickerDTO.class), @ProtoOneOfSignature(name = "comment", type = ReviewFormFieldDTO.CommentDTO.class), @ProtoOneOfSignature(name = "questions", type = ReviewFormFieldDTO.QuestionsDTO.class), @ProtoOneOfSignature(name = "anonymous", type = ReviewFormFieldDTO.AnonymousDTO.class), @ProtoOneOfSignature(name = "separator", type = SeparatorDTO.class), @ProtoOneOfSignature(name = "islandSeparator", type = IslandSeparatorDTO.class), @ProtoOneOfSignature(name = "plainText", type = PlainTextDTO.class), @ProtoOneOfSignature(name = "authorCell", type = ReviewFormFieldDTO.AuthorCellDTO.class), @ProtoOneOfSignature(name = "cell", type = CellDTO.class), @ProtoOneOfSignature(name = "cellItem", type = ReviewFormFieldDTO.CellItemDTO.class), @ProtoOneOfSignature(name = "disclaimerItem", type = ReviewFormFieldDTO.DisclaimerItemDTO.class), @ProtoOneOfSignature(name = "plainTextItem", type = ReviewFormFieldDTO.PlainTextItemDTO.class), @ProtoOneOfSignature(name = "separatorItem", type = ReviewFormFieldDTO.SeparatorItemDTO.class), @ProtoOneOfSignature(name = "islandSeparatorItem", type = ReviewFormFieldDTO.IslandSeparatorItemDTO.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends Object> items, @NotNull Footer footer, boolean isRatingFullScreen, Map<String, TokenizedTrackingInfo> trackingInfo, Map<String, TokenizedTrackingInfo> ratingFullScreenTrackingInfo, Map<String, TokenizedTrackingInfo> closeReviewFormTrackingInfo, DetailedReviewConfig detailedReviewConfig) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(footer, "footer");
        return new ReviewFormDTO(productId, reviewUuid, header, rating, headerV2, items, footer, isRatingFullScreen, trackingInfo, ratingFullScreenTrackingInfo, closeReviewFormTrackingInfo, detailedReviewConfig);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewFormDTO)) {
            return false;
        }
        ReviewFormDTO reviewFormDTO = (ReviewFormDTO) other;
        return Intrinsics.d(this.productId, reviewFormDTO.productId) && Intrinsics.d(this.reviewUuid, reviewFormDTO.reviewUuid) && Intrinsics.d(this.header, reviewFormDTO.header) && Intrinsics.d(this.rating, reviewFormDTO.rating) && Intrinsics.d(this.headerV2, reviewFormDTO.headerV2) && Intrinsics.d(this.items, reviewFormDTO.items) && Intrinsics.d(this.footer, reviewFormDTO.footer) && this.isRatingFullScreen == reviewFormDTO.isRatingFullScreen && Intrinsics.d(this.trackingInfo, reviewFormDTO.trackingInfo) && Intrinsics.d(this.ratingFullScreenTrackingInfo, reviewFormDTO.ratingFullScreenTrackingInfo) && Intrinsics.d(this.closeReviewFormTrackingInfo, reviewFormDTO.closeReviewFormTrackingInfo) && Intrinsics.d(this.detailedReviewConfig, reviewFormDTO.detailedReviewConfig);
    }

    public final Map<String, TokenizedTrackingInfo> getCloseReviewFormTrackingInfo() {
        return this.closeReviewFormTrackingInfo;
    }

    public final DetailedReviewConfig getDetailedReviewConfig() {
        return this.detailedReviewConfig;
    }

    @NotNull
    public final Footer getFooter() {
        return this.footer;
    }

    public final HeaderDTO getHeader() {
        return this.header;
    }

    public final HeaderV2DTO getHeaderV2() {
        return this.headerV2;
    }

    @NotNull
    public final List<Object> getItems() {
        return this.items;
    }

    @NotNull
    public final String getProductId() {
        return this.productId;
    }

    public final RatingDTO getRating() {
        return this.rating;
    }

    public final Map<String, TokenizedTrackingInfo> getRatingFullScreenTrackingInfo() {
        return this.ratingFullScreenTrackingInfo;
    }

    public final String getReviewUuid() {
        return this.reviewUuid;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.productId.hashCode() * 31;
        String str = this.reviewUuid;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        HeaderDTO headerDTO = this.header;
        int hashCode3 = (hashCode2 + (headerDTO == null ? 0 : headerDTO.hashCode())) * 31;
        RatingDTO ratingDTO = this.rating;
        int hashCode4 = (hashCode3 + (ratingDTO == null ? 0 : ratingDTO.hashCode())) * 31;
        HeaderV2DTO headerV2DTO = this.headerV2;
        int a11 = C3532b.a((this.footer.hashCode() + g.b((hashCode4 + (headerV2DTO == null ? 0 : headerV2DTO.hashCode())) * 31, 31, this.items)) * 31, 31, this.isRatingFullScreen);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode5 = (a11 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map2 = this.ratingFullScreenTrackingInfo;
        int hashCode6 = (hashCode5 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map3 = this.closeReviewFormTrackingInfo;
        int hashCode7 = (hashCode6 + (map3 == null ? 0 : map3.hashCode())) * 31;
        DetailedReviewConfig detailedReviewConfig = this.detailedReviewConfig;
        return hashCode7 + (detailedReviewConfig != null ? detailedReviewConfig.hashCode() : 0);
    }

    public final boolean isRatingFullScreen() {
        return this.isRatingFullScreen;
    }

    @NotNull
    public String toString() {
        String str = this.productId;
        String str2 = this.reviewUuid;
        HeaderDTO headerDTO = this.header;
        RatingDTO ratingDTO = this.rating;
        HeaderV2DTO headerV2DTO = this.headerV2;
        List<Object> list = this.items;
        Footer footer = this.footer;
        boolean z11 = this.isRatingFullScreen;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        Map<String, TokenizedTrackingInfo> map2 = this.ratingFullScreenTrackingInfo;
        Map<String, TokenizedTrackingInfo> map3 = this.closeReviewFormTrackingInfo;
        DetailedReviewConfig detailedReviewConfig = this.detailedReviewConfig;
        StringBuilder d11 = C3660k.d("ReviewFormDTO(productId=", str, ", reviewUuid=", str2, ", header=");
        d11.append(headerDTO);
        d11.append(", rating=");
        d11.append(ratingDTO);
        d11.append(", headerV2=");
        d11.append(headerV2DTO);
        d11.append(", items=");
        d11.append(list);
        d11.append(", footer=");
        d11.append(footer);
        d11.append(", isRatingFullScreen=");
        d11.append(z11);
        d11.append(", trackingInfo=");
        Tl.b.g(d11, map, ", ratingFullScreenTrackingInfo=", map2, ", closeReviewFormTrackingInfo=");
        d11.append(map3);
        d11.append(", detailedReviewConfig=");
        d11.append(detailedReviewConfig);
        d11.append(")");
        return d11.toString();
    }
}
