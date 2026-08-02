package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class dn8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ en8 b;

    public /* synthetic */ dn8(en8 en8Var, int i) {
        this.a = i;
        this.b = en8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        en8 en8Var = this.b;
        switch (i) {
            case 0:
                ViewParent parent = en8Var.d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            default:
                en8Var.a();
                View view = en8Var.d;
                if (view.isEnabled() && !view.isLongClickable() && en8Var.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    en8Var.g = true;
                    break;
                }
                break;
        }
    }
}
