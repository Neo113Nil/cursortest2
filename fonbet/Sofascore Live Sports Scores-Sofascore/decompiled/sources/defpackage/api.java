package defpackage;

import android.view.animation.Animation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class api implements Animation.AnimationListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ SwipeRefreshLayout b;

    public /* synthetic */ api(SwipeRefreshLayout swipeRefreshLayout, int i) {
        this.a = i;
        this.b = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        dpi dpiVar;
        int i = this.a;
        SwipeRefreshLayout swipeRefreshLayout = this.b;
        switch (i) {
            case 0:
                if (!swipeRefreshLayout.c) {
                    swipeRefreshLayout.l();
                    break;
                } else {
                    swipeRefreshLayout.z.setAlpha(255);
                    swipeRefreshLayout.z.start();
                    if (swipeRefreshLayout.E && (dpiVar = swipeRefreshLayout.b) != null) {
                        dpiVar.g();
                    }
                    swipeRefreshLayout.n = swipeRefreshLayout.t.getTop();
                    break;
                }
                break;
            default:
                bpi bpiVar = new bpi(swipeRefreshLayout, 1);
                swipeRefreshLayout.B = bpiVar;
                bpiVar.setDuration(150L);
                xu2 xu2Var = swipeRefreshLayout.t;
                xu2Var.a = null;
                xu2Var.clearAnimation();
                swipeRefreshLayout.t.startAnimation(swipeRefreshLayout.B);
                break;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        int i = this.a;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        int i = this.a;
    }

    private final void a(Animation animation) {
    }

    private final void b(Animation animation) {
    }

    private final void c(Animation animation) {
    }

    private final void d(Animation animation) {
    }
}
