package defpackage;

import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class wt8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ long c;

    public /* synthetic */ wt8(View view, long j, int i) {
        this.a = i;
        this.b = view;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.animate().setDuration(this.c).scaleX(1.0f).scaleY(1.0f).setInterpolator(new AccelerateDecelerateInterpolator()).start();
                break;
            default:
                this.b.animate().setDuration(this.c).translationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setInterpolator(new AccelerateDecelerateInterpolator()).start();
                break;
        }
    }
}
