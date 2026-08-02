package ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm;

import android.content.SharedPreferences;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.network.serialize.JsonSerializer;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.ReviewFormData;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 .2\u00020\u0001:\u0001.B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\n\u0010\u0017\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0018\u001a\u00020\u0016H\u0016J\u0010\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\fH\u0016J\u0010\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\fH\u0016J\u0016\u0010\u001d\u001a\u00020\u00162\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0016J\u0010\u0010!\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\fH\u0016J\u001c\u0010#\u001a\u00020\u00162\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0%H\u0016J\u0010\u0010&\u001a\u00020\u00162\u0006\u0010'\u001a\u00020\u000eH\u0016J\u0012\u0010(\u001a\u00020\u00162\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\n\u0010+\u001a\u0004\u0018\u00010*H\u0016J\b\u0010,\u001a\u00020\u0016H\u0016J\b\u0010-\u001a\u00020\u0016H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u00060\u0007j\u0002`\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0011@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b\u0013\u0010\u0014¨\u0006/"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/ReviewFormRepositoryImpl;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/ReviewFormRepository;", "preferences", "Landroid/content/SharedPreferences;", "jsonSerializer", "Lru/ozon/app/android/network/serialize/JsonSerializer;", "jsonDeserializer", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "<init>", "(Landroid/content/SharedPreferences;Lru/ozon/app/android/network/serialize/JsonSerializer;Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)V", "productId", "", "isEditReview", "", "key", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/ReviewFormData;", "reviewFormData", "setReviewFormData", "(Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/ReviewFormData;)V", "setupReviewFormRepository", "", "getFormData", "removeFormData", "saveRating", "rating", "saveVariant", "variantId", "saveMedias", "medias", "", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/ReviewFormData$CachedMedia;", "saveComment", "comment", "saveContextQuestions", "questions", "", "saveAnonymous", "isAnonymous", "updateSubmitAction", "submitActionData", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/SubmitActionPendingData;", "getSubmitAction", "clear", "cacheData", "Companion", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ReviewFormRepositoryImpl implements ReviewFormRepository {
    private boolean isEditReview;

    @NotNull
    private final JsonParser jsonDeserializer;

    @NotNull
    private final JsonSerializer jsonSerializer;
    private String key;

    @NotNull
    private final SharedPreferences preferences;
    private String productId;

    @NotNull
    private ReviewFormData reviewFormData;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/ReviewFormRepositoryImpl$Companion;", "", "<init>", "()V", "REVIEW_FORM_REPOSITORY_KEY_PREFIX", "", "SUBMIT_ACTION_PENDING_DATA_KEY", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public ReviewFormRepositoryImpl(@NotNull SharedPreferences preferences, @NotNull JsonSerializer jsonSerializer, @NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(jsonSerializer, "jsonSerializer");
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        this.preferences = preferences;
        this.jsonSerializer = jsonSerializer;
        this.jsonDeserializer = jsonDeserializer;
        this.reviewFormData = ReviewFormData.INSTANCE.getEMPTY();
    }

    private final void cacheData() {
        if (this.isEditReview || this.key == null) {
            return;
        }
        SharedPreferences.Editor edit = this.preferences.edit();
        edit.putString(this.key, this.jsonSerializer.toJson((JsonSerializer) this.reviewFormData, (Class<JsonSerializer>) ReviewFormData.class));
        edit.apply();
    }

    private final void setReviewFormData(ReviewFormData reviewFormData) {
        this.reviewFormData = reviewFormData;
        cacheData();
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.ReviewFormRepository
    public void clear() {
        this.productId = null;
        this.key = null;
        setReviewFormData(ReviewFormData.INSTANCE.getEMPTY());
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.ReviewFormRepository
    public ReviewFormData getFormData() {
        ReviewFormData reviewFormData = this.reviewFormData;
        if (this.productId == null || Intrinsics.d(reviewFormData, ReviewFormData.INSTANCE.getEMPTY())) {
            return null;
        }
        return reviewFormData;
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.ReviewFormRepository
    public SubmitActionPendingData getSubmitAction() {
        String string = this.preferences.getString("submit_action_pending_data_key", null);
        if (string != null) {
            return (SubmitActionPendingData) this.jsonDeserializer.fromJson(string, SubmitActionPendingData.class);
        }
        return null;
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.ReviewFormRepository
    public void removeFormData() {
        SharedPreferences.Editor edit = this.preferences.edit();
        edit.remove("submit_action_pending_data_key");
        edit.remove(this.key);
        edit.apply();
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.ReviewFormRepository
    public void saveAnonymous(boolean isAnonymous) {
        setReviewFormData(ReviewFormData.copy$default(this.reviewFormData, null, null, null, Boolean.valueOf(isAnonymous), null, null, 55, null));
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.ReviewFormRepository
    public void saveComment(@NotNull String comment) {
        Intrinsics.checkNotNullParameter(comment, "comment");
        setReviewFormData(ReviewFormData.copy$default(this.reviewFormData, null, null, comment, null, null, null, 59, null));
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.ReviewFormRepository
    public void saveContextQuestions(@NotNull Map<String, String> questions) {
        Intrinsics.checkNotNullParameter(questions, "questions");
        setReviewFormData(ReviewFormData.copy$default(this.reviewFormData, null, null, null, null, questions, null, 47, null));
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.ReviewFormRepository
    public void saveMedias(@NotNull List<ReviewFormData.CachedMedia> medias) {
        Intrinsics.checkNotNullParameter(medias, "medias");
        setReviewFormData(ReviewFormData.copy$default(this.reviewFormData, null, medias, null, null, null, null, 61, null));
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.ReviewFormRepository
    public void saveRating(@NotNull String rating) {
        Intrinsics.checkNotNullParameter(rating, "rating");
        setReviewFormData(ReviewFormData.copy$default(this.reviewFormData, rating, null, null, null, null, null, 62, null));
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.ReviewFormRepository
    public void saveVariant(@NotNull String variantId) {
        Intrinsics.checkNotNullParameter(variantId, "variantId");
        setReviewFormData(ReviewFormData.copy$default(this.reviewFormData, null, null, null, null, null, variantId, 31, null));
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.ReviewFormRepository
    public void setupReviewFormRepository(@NotNull String productId, boolean isEditReview) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        this.productId = productId;
        this.isEditReview = isEditReview;
        String b11 = Nk.a.b("review_form_repository", productId);
        this.key = b11;
        if (isEditReview) {
            removeFormData();
            return;
        }
        String string = this.preferences.getString(b11, null);
        if (string != null) {
            setReviewFormData((ReviewFormData) this.jsonDeserializer.fromJson(string, ReviewFormData.class));
        }
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.ReviewFormRepository
    public void updateSubmitAction(SubmitActionPendingData submitActionData) {
        SharedPreferences.Editor edit = this.preferences.edit();
        if (submitActionData == null) {
            edit.remove("submit_action_pending_data_key");
        } else {
            edit.putString("submit_action_pending_data_key", this.jsonSerializer.toJson((JsonSerializer) submitActionData, (Class<JsonSerializer>) SubmitActionPendingData.class));
        }
        edit.apply();
    }
}
