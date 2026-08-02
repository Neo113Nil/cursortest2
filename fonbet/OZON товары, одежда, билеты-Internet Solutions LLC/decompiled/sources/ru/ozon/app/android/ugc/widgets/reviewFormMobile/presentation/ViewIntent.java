package ru.ozon.app.android.ugc.widgets.reviewFormMobile.presentation;

import B0.A0;
import B0.C2454a;
import C.o0;
import G.g;
import Kk.C3532b;
import N3.C3660k;
import Pk0.a;
import RZ.b;
import V.e;
import Ve.C4636t5;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormHeader.ReviewFormHeaderVO;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormPointsProgress.ReviewFormPointsProgressDTO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\t\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/ViewIntent;", "", "FormOpened", "PointsProgressInitialized", "OnBackPressed", "ReviewHeaderInitialized", "AnonymousUpdated", "CommentUpdated", "VariantUpdated", "RatingUpdated", "QuestionsUpdated", "ContentUpdateEvent", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/ViewIntent$AnonymousUpdated;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/ViewIntent$CommentUpdated;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/ViewIntent$FormOpened;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/ViewIntent$OnBackPressed;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/ViewIntent$PointsProgressInitialized;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/ViewIntent$QuestionsUpdated;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/ViewIntent$RatingUpdated;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/ViewIntent$ReviewHeaderInitialized;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/ViewIntent$VariantUpdated;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface ViewIntent {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0007\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/ViewIntent$AnonymousUpdated;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/ViewIntent;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/ViewIntent$ContentUpdateEvent;", "", "id", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "isUserEvent", "<init>", "(Ljava/lang/String;ZZ)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Z", "getValue", "()Z", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AnonymousUpdated implements ViewIntent, ContentUpdateEvent {

        @NotNull
        private final String id;
        private final boolean isUserEvent;
        private final boolean value;

        public AnonymousUpdated(@NotNull String id2, boolean z11, boolean z12) {
            Intrinsics.checkNotNullParameter(id2, "id");
            this.id = id2;
            this.value = z11;
            this.isUserEvent = z12;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AnonymousUpdated)) {
                return false;
            }
            AnonymousUpdated anonymousUpdated = (AnonymousUpdated) other;
            return Intrinsics.d(this.id, anonymousUpdated.id) && this.value == anonymousUpdated.value && this.isUserEvent == anonymousUpdated.isUserEvent;
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        public final boolean getValue() {
            return this.value;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isUserEvent) + C3532b.a(this.id.hashCode() * 31, 31, this.value);
        }

        /* renamed from: isUserEvent, reason: from getter */
        public final boolean getIsUserEvent() {
            return this.isUserEvent;
        }

        @NotNull
        public String toString() {
            String str = this.id;
            boolean z11 = this.value;
            return a.a(")", C4636t5.b("AnonymousUpdated(id=", str, ", value=", ", isUserEvent=", z11), this.isUserEvent);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0015\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0016\u0010\n¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/ViewIntent$CommentUpdated;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/ViewIntent;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/ViewIntent$ContentUpdateEvent;", "", "uploadKey", "comment", "hintStatus", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUploadKey", "getComment", "getHintStatus", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CommentUpdated implements ViewIntent, ContentUpdateEvent {

        @NotNull
        private final String comment;
        private final String hintStatus;

        @NotNull
        private final String uploadKey;

        public CommentUpdated(@NotNull String uploadKey, @NotNull String comment, String str) {
            Intrinsics.checkNotNullParameter(uploadKey, "uploadKey");
            Intrinsics.checkNotNullParameter(comment, "comment");
            this.uploadKey = uploadKey;
            this.comment = comment;
            this.hintStatus = str;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CommentUpdated)) {
                return false;
            }
            CommentUpdated commentUpdated = (CommentUpdated) other;
            return Intrinsics.d(this.uploadKey, commentUpdated.uploadKey) && Intrinsics.d(this.comment, commentUpdated.comment) && Intrinsics.d(this.hintStatus, commentUpdated.hintStatus);
        }

        @NotNull
        public final String getComment() {
            return this.comment;
        }

        public final String getHintStatus() {
            return this.hintStatus;
        }

        @NotNull
        public final String getUploadKey() {
            return this.uploadKey;
        }

        public int hashCode() {
            int a11 = g.a(this.uploadKey.hashCode() * 31, 31, this.comment);
            String str = this.hintStatus;
            return a11 + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            String str = this.uploadKey;
            String str2 = this.comment;
            return o0.c(C3660k.d("CommentUpdated(uploadKey=", str, ", comment=", str2, ", hintStatus="), this.hintStatus, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/ViewIntent$ContentUpdateEvent;", "", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface ContentUpdateEvent {
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/ViewIntent$FormOpened;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/ViewIntent;", "", "productId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getProductId", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FormOpened implements ViewIntent {

        @NotNull
        private final String productId;

        public FormOpened(@NotNull String productId) {
            Intrinsics.checkNotNullParameter(productId, "productId");
            this.productId = productId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FormOpened) && Intrinsics.d(this.productId, ((FormOpened) other).productId);
        }

        @NotNull
        public final String getProductId() {
            return this.productId;
        }

        public int hashCode() {
            return this.productId.hashCode();
        }

        @NotNull
        public String toString() {
            return A0.b("FormOpened(productId=", this.productId, ")");
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/ViewIntent$OnBackPressed;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/ViewIntent;", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "", "minRating", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormHeader/ReviewFormHeaderVO$SubmitOnBackConfigVO;", "submitOnBackConfig", "<init>", "(Lru/ozon/uni/atoms/af/AtomAction;Ljava/lang/Integer;Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormHeader/ReviewFormHeaderVO$SubmitOnBackConfigVO;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Ljava/lang/Integer;", "getMinRating", "()Ljava/lang/Integer;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormHeader/ReviewFormHeaderVO$SubmitOnBackConfigVO;", "getSubmitOnBackConfig", "()Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormHeader/ReviewFormHeaderVO$SubmitOnBackConfigVO;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnBackPressed implements ViewIntent {
        private final AtomAction action;
        private final Integer minRating;
        private final ReviewFormHeaderVO.SubmitOnBackConfigVO submitOnBackConfig;

        public OnBackPressed() {
            this(null, null, null, 7, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnBackPressed)) {
                return false;
            }
            OnBackPressed onBackPressed = (OnBackPressed) other;
            return Intrinsics.d(this.action, onBackPressed.action) && Intrinsics.d(this.minRating, onBackPressed.minRating) && Intrinsics.d(this.submitOnBackConfig, onBackPressed.submitOnBackConfig);
        }

        public final AtomAction getAction() {
            return this.action;
        }

        public final Integer getMinRating() {
            return this.minRating;
        }

        public final ReviewFormHeaderVO.SubmitOnBackConfigVO getSubmitOnBackConfig() {
            return this.submitOnBackConfig;
        }

        public int hashCode() {
            AtomAction atomAction = this.action;
            int hashCode = (atomAction == null ? 0 : atomAction.hashCode()) * 31;
            Integer num = this.minRating;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            ReviewFormHeaderVO.SubmitOnBackConfigVO submitOnBackConfigVO = this.submitOnBackConfig;
            return hashCode2 + (submitOnBackConfigVO != null ? submitOnBackConfigVO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "OnBackPressed(action=" + this.action + ", minRating=" + this.minRating + ", submitOnBackConfig=" + this.submitOnBackConfig + ")";
        }

        public OnBackPressed(AtomAction atomAction, Integer num, ReviewFormHeaderVO.SubmitOnBackConfigVO submitOnBackConfigVO) {
            this.action = atomAction;
            this.minRating = num;
            this.submitOnBackConfig = submitOnBackConfigVO;
        }

        public /* synthetic */ OnBackPressed(AtomAction atomAction, Integer num, ReviewFormHeaderVO.SubmitOnBackConfigVO submitOnBackConfigVO, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : atomAction, (i11 & 2) != 0 ? null : num, (i11 & 4) != 0 ? null : submitOnBackConfigVO);
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/ViewIntent$PointsProgressInitialized;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/ViewIntent;", "", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormPointsProgress/ReviewFormPointsProgressDTO$FieldType;", "", "pointsMap", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/HigherPointsTerms;", "higherPointsTerms", "<init>", "(Ljava/util/Map;Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/HigherPointsTerms;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getPointsMap", "()Ljava/util/Map;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/HigherPointsTerms;", "getHigherPointsTerms", "()Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/HigherPointsTerms;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PointsProgressInitialized implements ViewIntent {
        private final HigherPointsTerms higherPointsTerms;

        @NotNull
        private final Map<ReviewFormPointsProgressDTO.FieldType, Integer> pointsMap;

        public PointsProgressInitialized(@NotNull Map<ReviewFormPointsProgressDTO.FieldType, Integer> pointsMap, HigherPointsTerms higherPointsTerms) {
            Intrinsics.checkNotNullParameter(pointsMap, "pointsMap");
            this.pointsMap = pointsMap;
            this.higherPointsTerms = higherPointsTerms;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PointsProgressInitialized)) {
                return false;
            }
            PointsProgressInitialized pointsProgressInitialized = (PointsProgressInitialized) other;
            return Intrinsics.d(this.pointsMap, pointsProgressInitialized.pointsMap) && Intrinsics.d(this.higherPointsTerms, pointsProgressInitialized.higherPointsTerms);
        }

        public final HigherPointsTerms getHigherPointsTerms() {
            return this.higherPointsTerms;
        }

        @NotNull
        public final Map<ReviewFormPointsProgressDTO.FieldType, Integer> getPointsMap() {
            return this.pointsMap;
        }

        public int hashCode() {
            int hashCode = this.pointsMap.hashCode() * 31;
            HigherPointsTerms higherPointsTerms = this.higherPointsTerms;
            return hashCode + (higherPointsTerms == null ? 0 : higherPointsTerms.hashCode());
        }

        @NotNull
        public String toString() {
            return "PointsProgressInitialized(pointsMap=" + this.pointsMap + ", higherPointsTerms=" + this.higherPointsTerms + ")";
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\nR#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/ViewIntent$QuestionsUpdated;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/ViewIntent;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/ViewIntent$ContentUpdateEvent;", "", "uploadKey", "", "questions", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUploadKey", "Ljava/util/Map;", "getQuestions", "()Ljava/util/Map;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class QuestionsUpdated implements ViewIntent, ContentUpdateEvent {

        @NotNull
        private final Map<String, String> questions;

        @NotNull
        private final String uploadKey;

        public QuestionsUpdated(@NotNull String uploadKey, @NotNull Map<String, String> questions) {
            Intrinsics.checkNotNullParameter(uploadKey, "uploadKey");
            Intrinsics.checkNotNullParameter(questions, "questions");
            this.uploadKey = uploadKey;
            this.questions = questions;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof QuestionsUpdated)) {
                return false;
            }
            QuestionsUpdated questionsUpdated = (QuestionsUpdated) other;
            return Intrinsics.d(this.uploadKey, questionsUpdated.uploadKey) && Intrinsics.d(this.questions, questionsUpdated.questions);
        }

        @NotNull
        public final Map<String, String> getQuestions() {
            return this.questions;
        }

        @NotNull
        public final String getUploadKey() {
            return this.uploadKey;
        }

        public int hashCode() {
            return this.questions.hashCode() + (this.uploadKey.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return Nh.a.d("QuestionsUpdated(uploadKey=", this.uploadKey, ", questions=", ")", this.questions);
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u0014R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010\u0012R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b%\u0010&R%\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/ViewIntent$ReviewHeaderInitialized;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/ViewIntent;", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "", "minRating", "", "widgetId", "", "widgetToken", "LRZ/b;", "pageAnalyticsInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "submitActionTrackingInfo", "<init>", "(Lru/ozon/uni/atoms/af/AtomAction;ILjava/lang/Long;Ljava/lang/String;LRZ/b;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "I", "getMinRating", "Ljava/lang/Long;", "getWidgetId", "()Ljava/lang/Long;", "Ljava/lang/String;", "getWidgetToken", "LRZ/b;", "getPageAnalyticsInfo", "()LRZ/b;", "Ljava/util/Map;", "getSubmitActionTrackingInfo", "()Ljava/util/Map;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ReviewHeaderInitialized implements ViewIntent {

        @NotNull
        private final AtomAction action;
        private final int minRating;
        private final b pageAnalyticsInfo;
        private final Map<String, TokenizedTrackingInfo> submitActionTrackingInfo;
        private final Long widgetId;
        private final String widgetToken;

        public ReviewHeaderInitialized(@NotNull AtomAction action, int i11, Long l11, String str, b bVar, Map<String, TokenizedTrackingInfo> map) {
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
            if (!(other instanceof ReviewHeaderInitialized)) {
                return false;
            }
            ReviewHeaderInitialized reviewHeaderInitialized = (ReviewHeaderInitialized) other;
            return Intrinsics.d(this.action, reviewHeaderInitialized.action) && this.minRating == reviewHeaderInitialized.minRating && Intrinsics.d(this.widgetId, reviewHeaderInitialized.widgetId) && Intrinsics.d(this.widgetToken, reviewHeaderInitialized.widgetToken) && Intrinsics.d(this.pageAnalyticsInfo, reviewHeaderInitialized.pageAnalyticsInfo) && Intrinsics.d(this.submitActionTrackingInfo, reviewHeaderInitialized.submitActionTrackingInfo);
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
            return "ReviewHeaderInitialized(action=" + this.action + ", minRating=" + this.minRating + ", widgetId=" + this.widgetId + ", widgetToken=" + this.widgetToken + ", pageAnalyticsInfo=" + this.pageAnalyticsInfo + ", submitActionTrackingInfo=" + this.submitActionTrackingInfo + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0014\u0010\t¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/ViewIntent$VariantUpdated;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/ViewIntent;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/ViewIntent$ContentUpdateEvent;", "", "uploadKey", "variantId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUploadKey", "getVariantId", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class VariantUpdated implements ViewIntent, ContentUpdateEvent {

        @NotNull
        private final String uploadKey;

        @NotNull
        private final String variantId;

        public VariantUpdated(@NotNull String uploadKey, @NotNull String variantId) {
            Intrinsics.checkNotNullParameter(uploadKey, "uploadKey");
            Intrinsics.checkNotNullParameter(variantId, "variantId");
            this.uploadKey = uploadKey;
            this.variantId = variantId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VariantUpdated)) {
                return false;
            }
            VariantUpdated variantUpdated = (VariantUpdated) other;
            return Intrinsics.d(this.uploadKey, variantUpdated.uploadKey) && Intrinsics.d(this.variantId, variantUpdated.variantId);
        }

        @NotNull
        public final String getUploadKey() {
            return this.uploadKey;
        }

        @NotNull
        public final String getVariantId() {
            return this.variantId;
        }

        public int hashCode() {
            return this.variantId.hashCode() + (this.uploadKey.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return e.a("VariantUpdated(uploadKey=", this.uploadKey, ", variantId=", this.variantId, ")");
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0007\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/ViewIntent$RatingUpdated;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/ViewIntent;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/ViewIntent$ContentUpdateEvent;", "", "uploadKey", "score", "", "isInitial", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUploadKey", "getScore", "Z", "()Z", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RatingUpdated implements ViewIntent, ContentUpdateEvent {
        private final boolean isInitial;

        @NotNull
        private final String score;

        @NotNull
        private final String uploadKey;

        public RatingUpdated(@NotNull String uploadKey, @NotNull String score, boolean z11) {
            Intrinsics.checkNotNullParameter(uploadKey, "uploadKey");
            Intrinsics.checkNotNullParameter(score, "score");
            this.uploadKey = uploadKey;
            this.score = score;
            this.isInitial = z11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RatingUpdated)) {
                return false;
            }
            RatingUpdated ratingUpdated = (RatingUpdated) other;
            return Intrinsics.d(this.uploadKey, ratingUpdated.uploadKey) && Intrinsics.d(this.score, ratingUpdated.score) && this.isInitial == ratingUpdated.isInitial;
        }

        @NotNull
        public final String getScore() {
            return this.score;
        }

        @NotNull
        public final String getUploadKey() {
            return this.uploadKey;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isInitial) + g.a(this.uploadKey.hashCode() * 31, 31, this.score);
        }

        /* renamed from: isInitial, reason: from getter */
        public final boolean getIsInitial() {
            return this.isInitial;
        }

        @NotNull
        public String toString() {
            String str = this.uploadKey;
            String str2 = this.score;
            return a.a(")", C3660k.d("RatingUpdated(uploadKey=", str, ", score=", str2, ", isInitial="), this.isInitial);
        }

        public /* synthetic */ RatingUpdated(String str, String str2, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i11 & 4) != 0 ? false : z11);
        }
    }
}
