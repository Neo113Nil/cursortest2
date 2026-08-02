package defpackage;

import com.unity3d.services.UnityAdsConstants;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class i5e implements a42 {
    public final a6e b;
    public final a42 c;
    public final ema d;

    public i5e(a6e a6eVar, a42 a42Var, ema emaVar) {
        this.b = a6eVar;
        this.c = a42Var;
        this.d = emaVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if ((r8 + r9) > r10) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x001b, code lost:
    
        if (r8 <= 1.0f) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        r3 = true;
     */
    @Override // defpackage.a42
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float a(float f, float f2, float f3) {
        int i;
        int p;
        int i2;
        float a = this.c.a(f, f2, f3);
        boolean z = false;
        if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            float f4 = f + f2;
            Map map = hwk.a;
        }
        float abs = Math.abs(a);
        ema emaVar = this.d;
        a6e a6eVar = this.b;
        if (abs != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && z) {
            if (emaVar == ema.b && a6eVar.m().e == ewd.b) {
                i2 = a6eVar.p() + (-a6eVar.f);
            } else {
                i2 = a6eVar.f;
            }
            float f5 = i2 * (-1.0f);
            while (a > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f5 < a) {
                f5 += a6eVar.p();
            }
            while (a < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f5 > a) {
                f5 -= a6eVar.p();
            }
            return f5;
        }
        int i3 = a6eVar.f;
        e1d e1dVar = a6eVar.D;
        if (Math.abs(i3) < 1.0E-6d) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        ema emaVar2 = ema.b;
        if (emaVar == emaVar2 && a6eVar.m().e == ewd.b) {
            i = a6eVar.p() + (-a6eVar.f);
        } else {
            i = a6eVar.f;
        }
        float f6 = i * (-1.0f);
        if (emaVar == emaVar2 && a6eVar.m().e == ewd.b) {
            if (!((Boolean) ((eoh) e1dVar).getValue()).booleanValue()) {
                p = a6eVar.p();
                f6 += p;
            }
            return llf.b(f6, -f3, f3);
        }
        if (((Boolean) ((eoh) e1dVar).getValue()).booleanValue()) {
            p = a6eVar.p();
            f6 += p;
        }
        return llf.b(f6, -f3, f3);
    }
}
