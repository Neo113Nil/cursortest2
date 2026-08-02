package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputEditText;
import com.sofascore.results.R;
import com.sofascore.results.main.SurveyActivity;
import com.sofascore.results.view.SofaTextInputLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class vni implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SurveyActivity b;

    public /* synthetic */ vni(SurveyActivity surveyActivity, int i) {
        this.a = i;
        this.b = surveyActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        SurveyActivity surveyActivity = this.b;
        switch (i) {
            case 0:
                int i2 = SurveyActivity.L;
                View inflate = surveyActivity.getLayoutInflater().inflate(R.layout.activity_survey, (ViewGroup) null, false);
                int i3 = R.id.button;
                Button button = (Button) nq8.B(R.id.button, inflate);
                if (button != null) {
                    i3 = R.id.check_box_group;
                    LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.check_box_group, inflate);
                    if (linearLayout != null) {
                        i3 = R.id.radio_group;
                        RadioGroup radioGroup = (RadioGroup) nq8.B(R.id.radio_group, inflate);
                        if (radioGroup != null) {
                            i3 = R.id.survey_edit;
                            TextInputEditText textInputEditText = (TextInputEditText) nq8.B(R.id.survey_edit, inflate);
                            if (textInputEditText != null) {
                                i3 = R.id.survey_edit_layout;
                                if (((SofaTextInputLayout) nq8.B(R.id.survey_edit_layout, inflate)) != null) {
                                    i3 = R.id.title;
                                    TextView textView = (TextView) nq8.B(R.id.title, inflate);
                                    if (textView != null) {
                                        i3 = R.id.toolbar;
                                        View B = nq8.B(R.id.toolbar, inflate);
                                        if (B != null) {
                                            if (((ImageView) nq8.B(R.id.toolbar_logo, B)) != null) {
                                                return new xe((LinearLayout) inflate, button, linearLayout, radioGroup, textInputEditText, textView);
                                            }
                                            yhk.s("Missing required view with ID: ".concat(B.getResources().getResourceName(R.id.toolbar_logo)));
                                            return null;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
                return null;
            default:
                surveyActivity.finish();
                return Unit.a;
        }
    }
}
