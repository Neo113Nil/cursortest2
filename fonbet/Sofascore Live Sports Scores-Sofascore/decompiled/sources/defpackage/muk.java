package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class muk implements irf {
    @Override // defpackage.irf
    public final void d(View view) {
        hrf hrfVar = (hrf) view.getLayoutParams();
        if (((ViewGroup.MarginLayoutParams) hrfVar).width == -1 && ((ViewGroup.MarginLayoutParams) hrfVar).height == -1) {
            return;
        }
        a70.r("Pages must fill the whole ViewPager2 (use match_parent)");
    }

    @Override // defpackage.irf
    public final void b(View view) {
    }
}
