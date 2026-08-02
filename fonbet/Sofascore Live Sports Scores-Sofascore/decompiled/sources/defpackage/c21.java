package defpackage;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.sofascore.results.chat.ChatActivity;
import com.sofascore.results.tutorial.wizard.TutorialWizardView;
import com.sofascore.results.view.header.widget.RollingTextView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class c21 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ KeyEvent.Callback d;

    public c21(lsk lskVar, e21 e21Var, lsk lskVar2) {
        this.b = lskVar;
        this.d = e21Var;
        this.c = lskVar2;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = this.a;
        Object obj = this.c;
        KeyEvent.Callback callback = this.d;
        Object obj2 = this.b;
        view.getClass();
        switch (i9) {
            case 0:
                view.removeOnLayoutChangeListener(this);
                lsk lskVar = (lsk) obj2;
                RollingTextView rollingTextView = lskVar.h;
                int measuredWidth = rollingTextView.getMeasuredWidth();
                RollingTextView rollingTextView2 = lskVar.i;
                float max = Math.max(measuredWidth, rollingTextView2.getMeasuredWidth());
                TextView textView = lskVar.j;
                float measuredWidth2 = (view.getMeasuredWidth() / 2.0f) / ((textView.getMeasuredWidth() / 2.0f) + max);
                if (measuredWidth2 < 1.0f) {
                    float textSize = textView.getTextSize() * measuredWidth2;
                    rollingTextView.setTextSize(textSize);
                    textView.setTextSize(0, textSize);
                    rollingTextView2.setTextSize(textSize);
                }
                TextView textView2 = ((e21) callback).q;
                if (textView2 != null) {
                    int measuredHeight = textView2.getMeasuredHeight();
                    TextView textView3 = ((lsk) obj).b;
                    ViewGroup.LayoutParams layoutParams = textView3.getLayoutParams();
                    if (layoutParams == null) {
                        yhk.s("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                        break;
                    } else {
                        tl3 tl3Var = (tl3) layoutParams;
                        ((ViewGroup.MarginLayoutParams) tl3Var).topMargin = -measuredHeight;
                        textView3.setLayoutParams(tl3Var);
                        break;
                    }
                }
                break;
            default:
                view.removeOnLayoutChangeListener(this);
                TutorialWizardView tutorialWizardView = (TutorialWizardView) obj2;
                tutorialWizardView.setSkipCallback(new kq2((ChatActivity) callback, 0));
                b0a.k = x2k.a;
                View view2 = (View) obj;
                view2.post(new vlo(3, tutorialWizardView, view2));
                break;
        }
    }

    public c21(TutorialWizardView tutorialWizardView, View view, ChatActivity chatActivity) {
        this.b = tutorialWizardView;
        this.c = view;
        this.d = chatActivity;
    }
}
