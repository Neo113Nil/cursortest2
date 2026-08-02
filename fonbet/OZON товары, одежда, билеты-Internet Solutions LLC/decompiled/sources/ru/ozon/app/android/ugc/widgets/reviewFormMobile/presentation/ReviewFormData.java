package ru.ozon.app.android.ugc.widgets.reviewFormMobile.presentation;

import B0.C2454a;
import RZ.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.pdp.ui.configurators.ugc.data.Content;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormPointsProgress.ReviewFormPointsProgressDTO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b \b\u0081\b\u0018\u00002\u00020\u0001:\u00014B\u0083\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\u001c\b\u0002\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\u0004\u0012\u001c\b\u0002\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\t\u0018\u00010\u0004\u0012\"\b\u0002\u0010\u000f\u001a\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000e\u0018\u00010\u0004\u0012\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u008c\u0002\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\u001c\b\u0002\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\u00042\u001c\b\u0002\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\t\u0018\u00010\u00042\"\b\u0002\u0010\u000f\u001a\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000e\u0018\u00010\u00042\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000e2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u00052\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u001cR%\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b%\u0010&R%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b'\u0010&R%\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b(\u0010&R+\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b)\u0010&R+\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\t\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010$\u001a\u0004\b*\u0010&R1\u0010\u000f\u001a\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000e\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010$\u001a\u0004\b+\u0010&R%\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010$\u001a\u0004\b,\u0010&R%\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0013\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\"\u001a\u0004\b0\u0010\u001cR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u00101\u001a\u0004\b2\u00103¨\u00065"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/ReviewFormData;", "", "", "status", "Lkotlin/Pair;", "", "anonymous", "comment", "rating", "", "Lru/ozon/app/android/pdp/ui/configurators/ugc/data/Content$Photo;", "photos", "Lru/ozon/app/android/pdp/ui/configurators/ugc/data/Content$Video;", "videos", "", "questions", "variantId", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormPointsProgress/ReviewFormPointsProgressDTO$FieldType;", "", "pointsMap", "hintStatus", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/ReviewFormData$SubmitCachedReviewData;", "submitCachedReviewData", "<init>", "(Ljava/lang/String;Lkotlin/Pair;Lkotlin/Pair;Lkotlin/Pair;Lkotlin/Pair;Lkotlin/Pair;Lkotlin/Pair;Lkotlin/Pair;Ljava/util/Map;Ljava/lang/String;Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/ReviewFormData$SubmitCachedReviewData;)V", "copy", "(Ljava/lang/String;Lkotlin/Pair;Lkotlin/Pair;Lkotlin/Pair;Lkotlin/Pair;Lkotlin/Pair;Lkotlin/Pair;Lkotlin/Pair;Ljava/util/Map;Ljava/lang/String;Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/ReviewFormData$SubmitCachedReviewData;)Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/ReviewFormData;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getStatus", "Lkotlin/Pair;", "getAnonymous", "()Lkotlin/Pair;", "getComment", "getRating", "getPhotos", "getVideos", "getQuestions", "getVariantId", "Ljava/util/Map;", "getPointsMap", "()Ljava/util/Map;", "getHintStatus", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/ReviewFormData$SubmitCachedReviewData;", "getSubmitCachedReviewData", "()Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/ReviewFormData$SubmitCachedReviewData;", "SubmitCachedReviewData", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ReviewFormData {
    private final Pair<String, Boolean> anonymous;
    private final Pair<String, String> comment;
    private final String hintStatus;
    private final Pair<String, List<Content.Photo>> photos;
    private final Map<ReviewFormPointsProgressDTO.FieldType, Integer> pointsMap;
    private final Pair<String, Map<String, String>> questions;
    private final Pair<String, String> rating;
    private final String status;
    private final SubmitCachedReviewData submitCachedReviewData;
    private final Pair<String, String> variantId;
    private final Pair<String, List<Content.Video>> videos;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u0014R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010\u0012R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b$\u0010%R%\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/ReviewFormData$SubmitCachedReviewData;", "", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "", "minRating", "", "widgetId", "", "widgetToken", "LRZ/b;", "pageAnalyticsInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "submitActionTrackingInfo", "<init>", "(Lru/ozon/uni/atoms/af/AtomAction;ILjava/lang/Long;Ljava/lang/String;LRZ/b;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "I", "getMinRating", "Ljava/lang/Long;", "getWidgetId", "()Ljava/lang/Long;", "Ljava/lang/String;", "getWidgetToken", "LRZ/b;", "getPageAnalyticsInfo", "()LRZ/b;", "Ljava/util/Map;", "getSubmitActionTrackingInfo", "()Ljava/util/Map;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SubmitCachedReviewData {

        @NotNull
        private final AtomAction action;
        private final int minRating;
        private final b pageAnalyticsInfo;
        private final Map<String, TokenizedTrackingInfo> submitActionTrackingInfo;
        private final Long widgetId;
        private final String widgetToken;

        public SubmitCachedReviewData(@NotNull AtomAction action, int i11, Long l11, String str, b bVar, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(action, "action");
            this.action = action;
            this.minRating = i11;
            this.widgetId = l11;
            this.widgetToken = str;
            this.pageAnalyticsInfo = bVar;
            this.submitActionTrackingInfo = map;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SubmitCachedReviewData)) {
                return false;
            }
            SubmitCachedReviewData submitCachedReviewData = (SubmitCachedReviewData) other;
            return Intrinsics.d(this.action, submitCachedReviewData.action) && this.minRating == submitCachedReviewData.minRating && Intrinsics.d(this.widgetId, submitCachedReviewData.widgetId) && Intrinsics.d(this.widgetToken, submitCachedReviewData.widgetToken) && Intrinsics.d(this.pageAnalyticsInfo, submitCachedReviewData.pageAnalyticsInfo) && Intrinsics.d(this.submitActionTrackingInfo, submitCachedReviewData.submitActionTrackingInfo);
        }

        @NotNull
        public final AtomAction getAction() {
            return this.action;
        }

        public final int getMinRating() {
            return this.minRating;
        }

        public final b getPageAnalyticsInfo() {
            return this.pageAnalyticsInfo;
        }

        public final Map<String, TokenizedTrackingInfo> getSubmitActionTrackingInfo() {
            return this.submitActionTrackingInfo;
        }

        public final Long getWidgetId() {
            return this.widgetId;
        }

        public final String getWidgetToken() {
            return this.widgetToken;
        }

        public int hashCode() {
            int a11 = C2454a.a(this.minRating, this.action.hashCode() * 31, 31);
            Long l11 = this.widgetId;
            int hashCode = (a11 + (l11 == null ? 0 : l11.hashCode())) * 31;
            String str = this.widgetToken;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            b bVar = this.pageAnalyticsInfo;
            int hashCode3 = (hashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.submitActionTrackingInfo;
            return hashCode3 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "SubmitCachedReviewData(action=" + this.action + ", minRating=" + this.minRating + ", widgetId=" + this.widgetId + ", widgetToken=" + this.widgetToken + ", pageAnalyticsInfo=" + this.pageAnalyticsInfo + ", submitActionTrackingInfo=" + this.submitActionTrackingInfo + ")";
        }
    }

    public ReviewFormData() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    public static /* synthetic */ ReviewFormData copy$default(ReviewFormData reviewFormData, String str, Pair pair, Pair pair2, Pair pair3, Pair pair4, Pair pair5, Pair pair6, Pair pair7, Map map, String str2, SubmitCachedReviewData submitCachedReviewData, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = reviewFormData.status;
        }
        if ((i11 & 2) != 0) {
            pair = reviewFormData.anonymous;
        }
        if ((i11 & 4) != 0) {
            pair2 = reviewFormData.comment;
        }
        if ((i11 & 8) != 0) {
            pair3 = reviewFormData.rating;
        }
        if ((i11 & 16) != 0) {
            pair4 = reviewFormData.photos;
        }
        if ((i11 & 32) != 0) {
            pair5 = reviewFormData.videos;
        }
        if ((i11 & 64) != 0) {
            pair6 = reviewFormData.questions;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            pair7 = reviewFormData.variantId;
        }
        if ((i11 & 256) != 0) {
            map = reviewFormData.pointsMap;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            str2 = reviewFormData.hintStatus;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            submitCachedReviewData = reviewFormData.submitCachedReviewData;
        }
        String str3 = str2;
        SubmitCachedReviewData submitCachedReviewData2 = submitCachedReviewData;
        Pair pair8 = pair7;
        Map map2 = map;
        Pair pair9 = pair5;
        Pair pair10 = pair6;
        Pair pair11 = pair4;
        Pair pair12 = pair2;
        return reviewFormData.copy(str, pair, pair12, pair3, pair11, pair9, pair10, pair8, map2, str3, submitCachedReviewData2);
    }

    @NotNull
    public final ReviewFormData copy(String status, Pair<String, Boolean> anonymous, Pair<String, String> comment, Pair<String, String> rating, Pair<String, ? extends List<Content.Photo>> photos, Pair<String, ? extends List<Content.Video>> videos, Pair<String, ? extends Map<String, String>> questions, Pair<String, String> variantId, Map<ReviewFormPointsProgressDTO.FieldType, Integer> pointsMap, String hintStatus, SubmitCachedReviewData submitCachedReviewData) {
        return new ReviewFormData(status, anonymous, comment, rating, photos, videos, questions, variantId, pointsMap, hintStatus, submitCachedReviewData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewFormData)) {
            return false;
        }
        ReviewFormData reviewFormData = (ReviewFormData) other;
        return Intrinsics.d(this.status, reviewFormData.status) && Intrinsics.d(this.anonymous, reviewFormData.anonymous) && Intrinsics.d(this.comment, reviewFormData.comment) && Intrinsics.d(this.rating, reviewFormData.rating) && Intrinsics.d(this.photos, reviewFormData.photos) && Intrinsics.d(this.videos, reviewFormData.videos) && Intrinsics.d(this.questions, reviewFormData.questions) && Intrinsics.d(this.variantId, reviewFormData.variantId) && Intrinsics.d(this.pointsMap, reviewFormData.pointsMap) && Intrinsics.d(this.hintStatus, reviewFormData.hintStatus) && Intrinsics.d(this.submitCachedReviewData, reviewFormData.submitCachedReviewData);
    }

    public final Pair<String, Boolean> getAnonymous() {
        return this.anonymous;
    }

    public final Pair<String, String> getComment() {
        return this.comment;
    }

    public final String getHintStatus() {
        return this.hintStatus;
    }

    public final Pair<String, List<Content.Photo>> getPhotos() {
        return this.photos;
    }

    public final Map<ReviewFormPointsProgressDTO.FieldType, Integer> getPointsMap() {
        return this.pointsMap;
    }

    public final Pair<String, Map<String, String>> getQuestions() {
        return this.questions;
    }

    public final Pair<String, String> getRating() {
        return this.rating;
    }

    public final String getStatus() {
        return this.status;
    }

    public final SubmitCachedReviewData getSubmitCachedReviewData() {
        return this.submitCachedReviewData;
    }

    public final Pair<String, String> getVariantId() {
        return this.variantId;
    }

    public final Pair<String, List<Content.Video>> getVideos() {
        return this.videos;
    }

    public int hashCode() {
        String str = this.status;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Pair<String, Boolean> pair = this.anonymous;
        int hashCode2 = (hashCode + (pair == null ? 0 : pair.hashCode())) * 31;
        Pair<String, String> pair2 = this.comment;
        int hashCode3 = (hashCode2 + (pair2 == null ? 0 : pair2.hashCode())) * 31;
        Pair<String, String> pair3 = this.rating;
        int hashCode4 = (hashCode3 + (pair3 == null ? 0 : pair3.hashCode())) * 31;
        Pair<String, List<Content.Photo>> pair4 = this.photos;
        int hashCode5 = (hashCode4 + (pair4 == null ? 0 : pair4.hashCode())) * 31;
        Pair<String, List<Content.Video>> pair5 = this.videos;
        int hashCode6 = (hashCode5 + (pair5 == null ? 0 : pair5.hashCode())) * 31;
        Pair<String, Map<String, String>> pair6 = this.questions;
        int hashCode7 = (hashCode6 + (pair6 == null ? 0 : pair6.hashCode())) * 31;
        Pair<String, String> pair7 = this.variantId;
        int hashCode8 = (hashCode7 + (pair7 == null ? 0 : pair7.hashCode())) * 31;
        Map<ReviewFormPointsProgressDTO.FieldType, Integer> map = this.pointsMap;
        int hashCode9 = (hashCode8 + (map == null ? 0 : map.hashCode())) * 31;
        String str2 = this.hintStatus;
        int hashCode10 = (hashCode9 + (str2 == null ? 0 : str2.hashCode())) * 31;
        SubmitCachedReviewData submitCachedReviewData = this.submitCachedReviewData;
        return hashCode10 + (submitCachedReviewData != null ? submitCachedReviewData.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ReviewFormData(status=" + this.status + ", anonymous=" + this.anonymous + ", comment=" + this.comment + ", rating=" + this.rating + ", photos=" + this.photos + ", videos=" + this.videos + ", questions=" + this.questions + ", variantId=" + this.variantId + ", pointsMap=" + this.pointsMap + ", hintStatus=" + this.hintStatus + ", submitCachedReviewData=" + this.submitCachedReviewData + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ReviewFormData(String str, Pair<String, Boolean> pair, Pair<String, String> pair2, Pair<String, String> pair3, Pair<String, ? extends List<Content.Photo>> pair4, Pair<String, ? extends List<Content.Video>> pair5, Pair<String, ? extends Map<String, String>> pair6, Pair<String, String> pair7, Map<ReviewFormPointsProgressDTO.FieldType, Integer> map, String str2, SubmitCachedReviewData submitCachedReviewData) {
        this.status = str;
        this.anonymous = pair;
        this.comment = pair2;
        this.rating = pair3;
        this.photos = pair4;
        this.videos = pair5;
        this.questions = pair6;
        this.variantId = pair7;
        this.pointsMap = map;
        this.hintStatus = str2;
        this.submitCachedReviewData = submitCachedReviewData;
    }

    public /* synthetic */ ReviewFormData(String str, Pair pair, Pair pair2, Pair pair3, Pair pair4, Pair pair5, Pair pair6, Pair pair7, Map map, String str2, SubmitCachedReviewData submitCachedReviewData, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : pair, (i11 & 4) != 0 ? null : pair2, (i11 & 8) != 0 ? null : pair3, (i11 & 16) != 0 ? null : pair4, (i11 & 32) != 0 ? null : pair5, (i11 & 64) != 0 ? null : pair6, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : pair7, (i11 & 256) != 0 ? null : map, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : str2, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : submitCachedReviewData);
    }
}
