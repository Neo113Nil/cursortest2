package defpackage;

import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class fb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ActionBarOverlayLayout b;

    public /* synthetic */ fb(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.a = i;
        this.b = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ActionBarOverlayLayout actionBarOverlayLayout = this.b;
        switch (i) {
            case 0:
                actionBarOverlayLayout.e();
                actionBarOverlayLayout.w = actionBarOverlayLayout.d.animate().translationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setListener(actionBarOverlayLayout.x);
                break;
            default:
                actionBarOverlayLayout.e();
                actionBarOverlayLayout.w = actionBarOverlayLayout.d.animate().translationY(-actionBarOverlayLayout.d.getHeight()).setListener(actionBarOverlayLayout.x);
                break;
        }
    }
}
