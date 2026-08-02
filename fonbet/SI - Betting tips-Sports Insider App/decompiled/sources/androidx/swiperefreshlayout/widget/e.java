package androidx.swiperefreshlayout.widget;

import android.view.animation.Animation;
import kotlin.KotlinVersion;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2671a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SwipeRefreshLayout f2672b;

    public /* synthetic */ e(SwipeRefreshLayout swipeRefreshLayout, int i5) {
        this.f2671a = i5;
        this.f2672b = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        i iVar;
        switch (this.f2671a) {
            case 0:
                SwipeRefreshLayout swipeRefreshLayout = this.f2672b;
                if (!swipeRefreshLayout.f2616c) {
                    swipeRefreshLayout.f();
                    break;
                } else {
                    swipeRefreshLayout.f2637z.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
                    swipeRefreshLayout.f2637z.start();
                    if (swipeRefreshLayout.E && (iVar = swipeRefreshLayout.f2615b) != null) {
                        iVar.p();
                    }
                    swipeRefreshLayout.f2626n = swipeRefreshLayout.f2631t.getTop();
                    break;
                }
                break;
            default:
                SwipeRefreshLayout swipeRefreshLayout2 = this.f2672b;
                f fVar = new f(swipeRefreshLayout2, 1);
                swipeRefreshLayout2.B = fVar;
                fVar.setDuration(150L);
                a aVar = swipeRefreshLayout2.f2631t;
                aVar.f2639a = null;
                aVar.clearAnimation();
                swipeRefreshLayout2.f2631t.startAnimation(swipeRefreshLayout2.B);
                break;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        int i5 = this.f2671a;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        int i5 = this.f2671a;
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
