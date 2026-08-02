package io.intercom.android.sdk.survey.model;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.google.gson.annotations.SerializedName;
import io.sentry.protocol.Response;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SubmitSurveyRequest.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0012\u001a\u00020\u0013H×\u0001J\t\u0010\u0014\u001a\u00020\u0003H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lio/intercom/android/sdk/survey/model/SubmitSurveyRequestItem;", "", "questionId", "", Response.TYPE, "", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getQuestionId", "()Ljava/lang/String;", "getResponse", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class SubmitSurveyRequestItem {
    public static final int $stable = 8;

    @SerializedName("question_id")
    private final String questionId;

    @SerializedName(Response.TYPE)
    private final List<String> response;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SubmitSurveyRequestItem copy$default(SubmitSurveyRequestItem submitSurveyRequestItem, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = submitSurveyRequestItem.questionId;
        }
        if ((i & 2) != 0) {
            list = submitSurveyRequestItem.response;
        }
        return submitSurveyRequestItem.copy(str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getQuestionId() {
        return this.questionId;
    }

    public final List<String> component2() {
        return this.response;
    }

    public final SubmitSurveyRequestItem copy(String questionId, List<String> response) {
        Intrinsics.checkNotNullParameter(questionId, "questionId");
        Intrinsics.checkNotNullParameter(response, "response");
        return new SubmitSurveyRequestItem(questionId, response);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubmitSurveyRequestItem)) {
            return false;
        }
        SubmitSurveyRequestItem submitSurveyRequestItem = (SubmitSurveyRequestItem) other;
        return Intrinsics.areEqual(this.questionId, submitSurveyRequestItem.questionId) && Intrinsics.areEqual(this.response, submitSurveyRequestItem.response);
    }

    public int hashCode() {
        return (this.questionId.hashCode() * 31) + this.response.hashCode();
    }

    public String toString() {
        return "SubmitSurveyRequestItem(questionId=" + this.questionId + ", response=" + this.response + ')';
    }

    public SubmitSurveyRequestItem(String questionId, List<String> response) {
        Intrinsics.checkNotNullParameter(questionId, "questionId");
        Intrinsics.checkNotNullParameter(response, "response");
        this.questionId = questionId;
        this.response = response;
    }

    public final String getQuestionId() {
        return this.questionId;
    }

    public final List<String> getResponse() {
        return this.response;
    }
}
