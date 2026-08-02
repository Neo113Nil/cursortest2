package defpackage;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.LinearLayout;
import androidx.mediarouter.app.d;
import com.sofascore.results.calendar.CalendarView;
import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class vg2 implements Animation.AnimationListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vg2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                animation.getClass();
                TranslateAnimation translateAnimation = new TranslateAnimation(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1, -1.0f, 1, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                translateAnimation.setDuration(300L);
                translateAnimation.setInterpolator(new DecelerateInterpolator());
                CalendarView calendarView = (CalendarView) obj;
                nr1 nr1Var = calendarView.a;
                if (nr1Var == null) {
                    Intrinsics.i("binding");
                    throw null;
                }
                ((LinearLayout) nr1Var.f).setVisibility(0);
                nr1 nr1Var2 = calendarView.a;
                if (nr1Var2 != null) {
                    ((LinearLayout) nr1Var2.f).startAnimation(translateAnimation);
                    return;
                } else {
                    Intrinsics.i("binding");
                    throw null;
                }
            case 1:
                animation.getClass();
                ((View) obj).clearAnimation();
                return;
            case 2:
                ((d) obj).k(true);
                return;
            default:
                bbc bbcVar = ((zac) obj).j;
                bbcVar.z = false;
                bbcVar.n();
                return;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        switch (this.a) {
            case 0:
                animation.getClass();
                break;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        switch (this.a) {
            case 0:
                animation.getClass();
                break;
            case 1:
            case 2:
                break;
            default:
                ((zac) this.b).j.z = true;
                break;
        }
    }

    private final void a(Animation animation) {
    }

    private final void b(Animation animation) {
    }

    private final void c(Animation animation) {
    }

    private final void d(Animation animation) {
    }

    private final void e(Animation animation) {
    }
}
