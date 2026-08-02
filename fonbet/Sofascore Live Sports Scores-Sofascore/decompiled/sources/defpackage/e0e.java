package defpackage;

import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class e0e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rfe b;

    public /* synthetic */ e0e(rfe rfeVar, int i) {
        this.a = i;
        this.b = rfeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        rfe rfeVar = this.b;
        switch (i) {
            case 0:
                ViewPropertyAnimator animate = ((TextView) rfeVar.e).animate();
                animate.alpha(1.0f);
                animate.setDuration(200L);
                animate.withEndAction(new e0e(rfeVar, 1));
                animate.start();
                break;
            default:
                LottieAnimationView lottieAnimationView = (LottieAnimationView) rfeVar.c;
                lottieAnimationView.k.add(mlb.f);
                lottieAnimationView.e.k();
                break;
        }
    }
}
