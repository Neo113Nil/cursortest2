package io.intercom.android.sdk.survey.model;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StatsCtaRequestModel.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0010\u001a\u00020\u0011H×\u0001J\t\u0010\u0012\u001a\u00020\u0003H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lio/intercom/android/sdk/survey/model/StatsCtaRequestModel;", "", "surveyProgressId", "", "stepId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getSurveyProgressId", "()Ljava/lang/String;", "getStepId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class StatsCtaRequestModel {
    public static final int $stable = 0;

    @SerializedName("step_id")
    private final String stepId;

    @SerializedName("survey_progress_id")
    private final String surveyProgressId;

    public static /* synthetic */ StatsCtaRequestModel copy$default(StatsCtaRequestModel statsCtaRequestModel, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = statsCtaRequestModel.surveyProgressId;
        }
        if ((i & 2) != 0) {
            str2 = statsCtaRequestModel.stepId;
        }
        return statsCtaRequestModel.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSurveyProgressId() {
        return this.surveyProgressId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getStepId() {
        return this.stepId;
    }

    public final StatsCtaRequestModel copy(String surveyProgressId, String stepId) {
        Intrinsics.checkNotNullParameter(surveyProgressId, "surveyProgressId");
        Intrinsics.checkNotNullParameter(stepId, "stepId");
        return new StatsCtaRequestModel(surveyProgressId, stepId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StatsCtaRequestModel)) {
            return false;
        }
        StatsCtaRequestModel statsCtaRequestModel = (StatsCtaRequestModel) other;
        return Intrinsics.areEqual(this.surveyProgressId, statsCtaRequestModel.surveyProgressId) && Intrinsics.areEqual(this.stepId, statsCtaRequestModel.stepId);
    }

    public int hashCode() {
        return (this.surveyProgressId.hashCode() * 31) + this.stepId.hashCode();
    }

    public String toString() {
        return "StatsCtaRequestModel(surveyProgressId=" + this.surveyProgressId + ", stepId=" + this.stepId + ')';
    }

    public StatsCtaRequestModel(String surveyProgressId, String stepId) {
        Intrinsics.checkNotNullParameter(surveyProgressId, "surveyProgressId");
        Intrinsics.checkNotNullParameter(stepId, "stepId");
        this.surveyProgressId = surveyProgressId;
        this.stepId = stepId;
    }

    public final String getSurveyProgressId() {
        return this.surveyProgressId;
    }

    public final String getStepId() {
        return this.stepId;
    }
}
