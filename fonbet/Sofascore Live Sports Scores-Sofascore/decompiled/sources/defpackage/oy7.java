package defpackage;

import com.sofascore.results.feedback.FeedbackActivity;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class oy7 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FeedbackActivity b;

    public /* synthetic */ oy7(FeedbackActivity feedbackActivity, int i) {
        this.a = i;
        this.b = feedbackActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        FeedbackActivity feedbackActivity = this.b;
        switch (i) {
            case 0:
                return feedbackActivity.getDefaultViewModelProviderFactory();
            case 1:
                return feedbackActivity.getViewModelStore();
            default:
                return feedbackActivity.getDefaultViewModelCreationExtras();
        }
    }
}
