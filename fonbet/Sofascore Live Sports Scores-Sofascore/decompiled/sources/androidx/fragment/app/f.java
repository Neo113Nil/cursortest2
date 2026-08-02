package androidx.fragment.app;

import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import defpackage.a70;
import defpackage.ljg;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class f {
    public final y a;

    public f(y yVar) {
        yVar.getClass();
        this.a = yVar;
    }

    public final boolean a() {
        int i;
        y yVar = this.a;
        View view = yVar.c.mView;
        if (view != null) {
            i = 4;
            if (view.getAlpha() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || view.getVisibility() != 0) {
                int visibility = view.getVisibility();
                if (visibility == 0) {
                    i = 2;
                } else if (visibility != 4) {
                    if (visibility != 8) {
                        a70.p(ljg.j(visibility, "Unknown visibility "));
                        return false;
                    }
                    i = 3;
                }
            }
        } else {
            i = 0;
        }
        int i2 = yVar.a;
        if (i != i2) {
            return (i == 2 || i2 == 2) ? false : true;
        }
        return true;
    }
}
