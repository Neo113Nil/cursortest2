package defpackage;

import com.sofascore.results.main.SurveyActivity;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class wni implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SurveyActivity b;

    public /* synthetic */ wni(SurveyActivity surveyActivity, int i) {
        this.a = i;
        this.b = surveyActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        SurveyActivity surveyActivity = this.b;
        switch (i) {
            case 0:
                return surveyActivity.getDefaultViewModelProviderFactory();
            case 1:
                return surveyActivity.getViewModelStore();
            default:
                return surveyActivity.getDefaultViewModelCreationExtras();
        }
    }
}
