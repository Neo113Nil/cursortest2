package ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.ReviewFormData;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H&J\n\u0010\b\u001a\u0004\u0018\u00010\tH&J\b\u0010\n\u001a\u00020\u0003H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0005H&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0005H&J\u0016\u0010\u000f\u001a\u00020\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H&J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0005H&J\u001c\u0010\u0015\u001a\u00020\u00032\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0017H&J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0007H&J\u0012\u0010\u001a\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH&J\n\u0010\u001d\u001a\u0004\u0018\u00010\u001cH&J\b\u0010\u001e\u001a\u00020\u0003H&¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/ReviewFormRepository;", "", "setupReviewFormRepository", "", "productId", "", "isEditReview", "", "getFormData", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/ReviewFormData;", "removeFormData", "saveRating", "rating", "saveVariant", "variantId", "saveMedias", "medias", "", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/ReviewFormData$CachedMedia;", "saveComment", "comment", "saveContextQuestions", "questions", "", "saveAnonymous", "isAnonymous", "updateSubmitAction", "submitActionData", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/SubmitActionPendingData;", "getSubmitAction", "clear", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ReviewFormRepository {
    void clear();

    ReviewFormData getFormData();

    SubmitActionPendingData getSubmitAction();

    void removeFormData();

    void saveAnonymous(boolean isAnonymous);

    void saveComment(@NotNull String comment);

    void saveContextQuestions(@NotNull Map<String, String> questions);

    void saveMedias(@NotNull List<ReviewFormData.CachedMedia> medias);

    void saveRating(@NotNull String rating);

    void saveVariant(@NotNull String variantId);

    void setupReviewFormRepository(@NotNull String productId, boolean isEditReview);

    void updateSubmitAction(SubmitActionPendingData submitActionData);
}
