package defpackage;

import androidx.compose.runtime.e;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ghf {
    public final ku3 a;
    public final e1d b;
    public final xnh g;
    public final xnh h;
    public final ay4 c = goh.b(new zgf(this, 2));
    public final e1d d = e.f(Boolean.FALSE);
    public final xnh e = e.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    public final xnh f = e.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    public final q1d i = new q1d();

    public ghf(ku3 ku3Var, e1d e1dVar, float f, float f2) {
        this.a = ku3Var;
        this.b = e1dVar;
        this.g = e.b(f2);
        this.h = e.b(f);
    }

    public final float a() {
        return ((Number) this.c.getValue()).floatValue();
    }

    public final boolean b() {
        return ((Boolean) ((eoh) this.d).getValue()).booleanValue();
    }
}
