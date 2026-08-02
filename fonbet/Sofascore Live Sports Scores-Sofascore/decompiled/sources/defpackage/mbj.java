package defpackage;

import androidx.compose.runtime.e;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class mbj {
    public static final y3g g = w1a.w(new t6j(7), new qaj(1));
    public final xnh a;
    public final xnh b = e.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    public final znh c = e.c(0);
    public oqf d = oqf.e;
    public long e = pej.b;
    public final e1d f;

    public mbj(ewd ewdVar, float f) {
        this.a = e.b(f);
        this.f = e.e(ewdVar, wib.i);
    }

    public final void a(ewd ewdVar, oqf oqfVar, int i, int i2) {
        float f = i2 - i;
        this.b.i(f);
        float f2 = oqfVar.a;
        float f3 = oqfVar.b;
        oqf oqfVar2 = this.d;
        float f4 = oqfVar2.a;
        xnh xnhVar = this.a;
        if (f2 != f4 || f3 != oqfVar2.b) {
            boolean z = ewdVar == ewd.a;
            if (z) {
                f2 = f3;
            }
            float f5 = z ? oqfVar.d : oqfVar.c;
            float h = xnhVar.h();
            float f6 = i;
            float f7 = h + f6;
            xnhVar.i(xnhVar.h() + ((f5 <= f7 && (f2 >= h || f5 - f2 <= f6)) ? (f2 >= h || f5 - f2 > f6) ? 0.0f : f2 - h : f5 - f7));
            this.d = oqfVar;
        }
        xnhVar.i(llf.b(xnhVar.h(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f));
        this.c.i(i);
    }
}
