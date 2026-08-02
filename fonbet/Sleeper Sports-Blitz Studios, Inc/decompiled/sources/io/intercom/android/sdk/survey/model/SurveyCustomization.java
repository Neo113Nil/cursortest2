package io.intercom.android.sdk.survey.model;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SurveyData.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0010\u001a\u00020\u0011H×\u0001J\t\u0010\u0012\u001a\u00020\u0003H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lio/intercom/android/sdk/survey/model/SurveyCustomization;", "", "backgroundColor", "", "buttonColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getBackgroundColor", "()Ljava/lang/String;", "getButtonColor", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class SurveyCustomization {
    public static final int $stable = 0;

    @SerializedName("background_color")
    private final String backgroundColor;

    @SerializedName("button_color")
    private final String buttonColor;

    /* JADX WARN: Multi-variable type inference failed */
    public SurveyCustomization() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ SurveyCustomization copy$default(SurveyCustomization surveyCustomization, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = surveyCustomization.backgroundColor;
        }
        if ((i & 2) != 0) {
            str2 = surveyCustomization.buttonColor;
        }
        return surveyCustomization.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component2, reason: from getter */
    public final String getButtonColor() {
        return this.buttonColor;
    }

    public final SurveyCustomization copy(String backgroundColor, String buttonColor) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(buttonColor, "buttonColor");
        return new SurveyCustomization(backgroundColor, buttonColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SurveyCustomization)) {
            return false;
        }
        SurveyCustomization surveyCustomization = (SurveyCustomization) other;
        return Intrinsics.areEqual(this.backgroundColor, surveyCustomization.backgroundColor) && Intrinsics.areEqual(this.buttonColor, surveyCustomization.buttonColor);
    }

    public int hashCode() {
        return (this.backgroundColor.hashCode() * 31) + this.buttonColor.hashCode();
    }

    public String toString() {
        return "SurveyCustomization(backgroundColor=" + this.backgroundColor + ", buttonColor=" + this.buttonColor + ')';
    }

    public SurveyCustomization(String backgroundColor, String buttonColor) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(buttonColor, "buttonColor");
        this.backgroundColor = backgroundColor;
        this.buttonColor = buttonColor;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public /* synthetic */ SurveyCustomization(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "#FFFFFF" : str, (i & 2) != 0 ? "#000000" : str2);
    }

    public final String getButtonColor() {
        return this.buttonColor;
    }
}
