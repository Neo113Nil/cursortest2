package defpackage;

import android.view.View;
import com.sofascore.results.tutorial.wizard.TutorialWizardView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class b3k implements View.OnLayoutChangeListener {
    public final /* synthetic */ TutorialWizardView a;
    public final /* synthetic */ View b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Float f;

    public b3k(TutorialWizardView tutorialWizardView, View view, boolean z, boolean z2, boolean z3, Float f) {
        this.a = tutorialWizardView;
        this.b = view;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = f;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.getClass();
        view.removeOnLayoutChangeListener(this);
        this.a.a(this.b, this.c, this.d, this.e, this.f);
    }
}
