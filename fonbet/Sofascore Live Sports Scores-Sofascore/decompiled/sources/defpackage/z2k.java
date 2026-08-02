package defpackage;

import com.sofascore.results.tutorial.wizard.TutorialWizardView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class z2k implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TutorialWizardView b;

    public /* synthetic */ z2k(TutorialWizardView tutorialWizardView, int i) {
        this.a = i;
        this.b = tutorialWizardView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                TutorialWizardView tutorialWizardView = this.b;
                TutorialWizardView.b(tutorialWizardView, tutorialWizardView.k, tutorialWizardView.m, tutorialWizardView.n, tutorialWizardView.o, 32);
                break;
            default:
                TutorialWizardView tutorialWizardView2 = this.b;
                TutorialWizardView.b(tutorialWizardView2, tutorialWizardView2.k, tutorialWizardView2.m, tutorialWizardView2.n, tutorialWizardView2.o, 32);
                break;
        }
    }
}
