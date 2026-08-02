package defpackage;

import com.sofascore.results.chat.ChatActivity;
import com.sofascore.results.tutorial.wizard.TutorialWizardView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class kq2 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivity b;

    public /* synthetic */ kq2(ChatActivity chatActivity, int i) {
        this.a = i;
        this.b = chatActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        ChatActivity chatActivity = this.b;
        switch (i) {
            case 0:
                int i2 = ChatActivity.Z;
                TutorialWizardView tutorialWizardView = chatActivity.R().k;
                TutorialWizardView.b(tutorialWizardView, null, false, false, null, 62);
                tutorialWizardView.setVisibility(8);
                return Unit.a;
            case 1:
                return chatActivity.getDefaultViewModelProviderFactory();
            case 2:
                return chatActivity.getViewModelStore();
            case 3:
                return chatActivity.getDefaultViewModelCreationExtras();
            case 4:
                return chatActivity.getDefaultViewModelProviderFactory();
            case 5:
                return chatActivity.getViewModelStore();
            default:
                return chatActivity.getDefaultViewModelCreationExtras();
        }
    }
}
