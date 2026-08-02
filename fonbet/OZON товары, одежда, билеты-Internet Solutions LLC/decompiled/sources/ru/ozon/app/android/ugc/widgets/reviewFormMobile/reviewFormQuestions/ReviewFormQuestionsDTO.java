package ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormQuestions;

import B90.C2618u;
import Kk.C3532b;
import Ve.C4636t5;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.data.ReviewFormFieldDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\rR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormQuestions/ReviewFormQuestionsDTO;", "", "uploadKey", "", "isEditReview", "", "questions", "", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormFieldDTO$QuestionsDTO$QuestionDTO;", "<init>", "(Ljava/lang/String;ZLjava/util/List;)V", "getUploadKey", "()Ljava/lang/String;", "()Z", "getQuestions", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ReviewFormQuestionsDTO {
    public static final int $stable = 8;
    private final boolean isEditReview;

    @NotNull
    private final List<ReviewFormFieldDTO.QuestionsDTO.QuestionDTO> questions;

    @NotNull
    private final String uploadKey;

    public ReviewFormQuestionsDTO(@NotNull String uploadKey, boolean z11, @NotNull List<ReviewFormFieldDTO.QuestionsDTO.QuestionDTO> questions) {
        Intrinsics.checkNotNullParameter(uploadKey, "uploadKey");
        Intrinsics.checkNotNullParameter(questions, "questions");
        this.uploadKey = uploadKey;
        this.isEditReview = z11;
        this.questions = questions;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReviewFormQuestionsDTO copy$default(ReviewFormQuestionsDTO reviewFormQuestionsDTO, String str, boolean z11, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = reviewFormQuestionsDTO.uploadKey;
        }
        if ((i11 & 2) != 0) {
            z11 = reviewFormQuestionsDTO.isEditReview;
        }
        if ((i11 & 4) != 0) {
            list = reviewFormQuestionsDTO.questions;
        }
        return reviewFormQuestionsDTO.copy(str, z11, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getUploadKey() {
        return this.uploadKey;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsEditReview() {
        return this.isEditReview;
    }

    @NotNull
    public final List<ReviewFormFieldDTO.QuestionsDTO.QuestionDTO> component3() {
        return this.questions;
    }

    @NotNull
    public final ReviewFormQuestionsDTO copy(@NotNull String uploadKey, boolean isEditReview, @NotNull List<ReviewFormFieldDTO.QuestionsDTO.QuestionDTO> questions) {
        Intrinsics.checkNotNullParameter(uploadKey, "uploadKey");
        Intrinsics.checkNotNullParameter(questions, "questions");
        return new ReviewFormQuestionsDTO(uploadKey, isEditReview, questions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewFormQuestionsDTO)) {
            return false;
        }
        ReviewFormQuestionsDTO reviewFormQuestionsDTO = (ReviewFormQuestionsDTO) other;
        return Intrinsics.d(this.uploadKey, reviewFormQuestionsDTO.uploadKey) && this.isEditReview == reviewFormQuestionsDTO.isEditReview && Intrinsics.d(this.questions, reviewFormQuestionsDTO.questions);
    }

    @NotNull
    public final List<ReviewFormFieldDTO.QuestionsDTO.QuestionDTO> getQuestions() {
        return this.questions;
    }

    @NotNull
    public final String getUploadKey() {
        return this.uploadKey;
    }

    public int hashCode() {
        return this.questions.hashCode() + C3532b.a(this.uploadKey.hashCode() * 31, 31, this.isEditReview);
    }

    public final boolean isEditReview() {
        return this.isEditReview;
    }

    @NotNull
    public String toString() {
        String str = this.uploadKey;
        boolean z11 = this.isEditReview;
        return C2618u.h(C4636t5.b("ReviewFormQuestionsDTO(uploadKey=", str, ", isEditReview=", ", questions=", z11), this.questions, ")");
    }
}
