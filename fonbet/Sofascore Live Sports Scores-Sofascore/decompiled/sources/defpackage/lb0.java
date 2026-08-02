package defpackage;

import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class lb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ub0 b;

    public /* synthetic */ lb0(ub0 ub0Var, int i) {
        this.a = i;
        this.b = ub0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        int i = this.a;
        ub0 ub0Var = this.b;
        switch (i) {
            case 0:
                if ((ub0Var.Z & 1) != 0) {
                    ub0Var.z(0);
                }
                if ((ub0Var.Z & 4096) != 0) {
                    ub0Var.z(108);
                }
                ub0Var.Y = false;
                ub0Var.Z = 0;
                break;
            default:
                ub0Var.v.showAtLocation(ub0Var.u, 55, 0, 0);
                tuk tukVar = ub0Var.x;
                if (tukVar != null) {
                    tukVar.b();
                }
                if (!ub0Var.z || (viewGroup = ub0Var.A) == null || !viewGroup.isLaidOut()) {
                    ub0Var.u.setAlpha(1.0f);
                    ub0Var.u.setVisibility(0);
                    break;
                } else {
                    ub0Var.u.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    tuk b = bsk.b(ub0Var.u);
                    b.a(1.0f);
                    ub0Var.x = b;
                    b.d(new mb0(this, 0));
                    break;
                }
        }
    }
}
