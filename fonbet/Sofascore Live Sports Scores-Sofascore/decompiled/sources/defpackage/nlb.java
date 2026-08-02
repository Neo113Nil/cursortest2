package defpackage;

import com.airbnb.lottie.LottieAnimationView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class nlb implements mmb {
    public final /* synthetic */ int a;
    public final WeakReference b;

    public nlb(LottieAnimationView lottieAnimationView, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new WeakReference(lottieAnimationView);
                break;
            default:
                this.b = new WeakReference(lottieAnimationView);
                break;
        }
    }

    @Override // defpackage.mmb
    public final void onResult(Object obj) {
        int i = this.a;
        WeakReference weakReference = this.b;
        switch (i) {
            case 0:
                Throwable th = (Throwable) obj;
                LottieAnimationView lottieAnimationView = (LottieAnimationView) weakReference.get();
                if (lottieAnimationView != null) {
                    int i2 = lottieAnimationView.d;
                    if (i2 != 0) {
                        lottieAnimationView.setImageResource(i2);
                    }
                    mmb mmbVar = lottieAnimationView.c;
                    if (mmbVar == null) {
                        mmbVar = LottieAnimationView.n;
                    }
                    mmbVar.onResult(th);
                    break;
                }
                break;
            default:
                plb plbVar = (plb) obj;
                LottieAnimationView lottieAnimationView2 = (LottieAnimationView) weakReference.get();
                if (lottieAnimationView2 != null) {
                    lottieAnimationView2.setComposition(plbVar);
                    break;
                }
                break;
        }
    }
}
