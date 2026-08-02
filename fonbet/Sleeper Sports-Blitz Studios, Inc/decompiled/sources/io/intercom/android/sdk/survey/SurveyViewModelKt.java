package io.intercom.android.sdk.survey;

import androidx.compose.ui.graphics.ColorKt;
import io.intercom.android.sdk.survey.model.SurveyCustomization;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import io.intercom.android.sdk.utilities.ColorUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SurveyViewModel.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toSurveyUiColors", "Lio/intercom/android/sdk/survey/SurveyUiColors;", "Lio/intercom/android/sdk/survey/model/SurveyCustomization;", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class SurveyViewModelKt {
    public static final SurveyUiColors toSurveyUiColors(SurveyCustomization surveyCustomization) {
        Intrinsics.checkNotNullParameter(surveyCustomization, "<this>");
        long Color = ColorKt.Color(ColorUtils.parseColor(surveyCustomization.getBackgroundColor()));
        long Color2 = ColorKt.Color(ColorUtils.parseColor(surveyCustomization.getButtonColor()));
        return new SurveyUiColors(Color, ColorExtensionsKt.m13180generateTextColor8_81llA(Color), Color2, ColorExtensionsKt.m13180generateTextColor8_81llA(Color2), null, 16, null);
    }
}
