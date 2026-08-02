package defpackage;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class e6e implements p78 {
    public final gnh a;
    public final a6e b;

    public e6e(gnh gnhVar, a6e a6eVar) {
        this.a = gnhVar;
        this.b = a6eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.p78
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(oug ougVar, float f, rq3 rq3Var) {
        d6e d6eVar;
        int i;
        a6e a6eVar;
        if (rq3Var instanceof d6e) {
            d6eVar = (d6e) rq3Var;
            int i2 = d6eVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                d6eVar.t = i2 - Integer.MIN_VALUE;
                Object obj = d6eVar.r;
                lu3 lu3Var = lu3.a;
                i = d6eVar.t;
                rq3 rq3Var2 = null;
                if (i != 0) {
                    y6a.M(obj);
                    mnc mncVar = new mnc(24, this, ougVar);
                    d6eVar.t = 1;
                    obj = this.a.c(ougVar, f, mncVar, d6eVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                float floatValue = ((Number) obj).floatValue();
                a6eVar = this.b;
                if (a6eVar.l() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && Math.abs(a6eVar.l()) < 0.001d) {
                    int k = a6eVar.k();
                    if (a6eVar.k.b()) {
                        xw3.L(((r5e) ((eoh) a6eVar.m).getValue()).s, null, null, new n5e(a6eVar, rq3Var2, 2), 3);
                    }
                    a6eVar.u(k, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false);
                } else {
                    new Float(a6eVar.l());
                }
                return new Float(floatValue);
            }
        }
        d6eVar = new d6e(this, (sq3) rq3Var);
        Object obj2 = d6eVar.r;
        lu3 lu3Var2 = lu3.a;
        i = d6eVar.t;
        rq3 rq3Var22 = null;
        if (i != 0) {
        }
        float floatValue2 = ((Number) obj2).floatValue();
        a6eVar = this.b;
        if (a6eVar.l() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            int k2 = a6eVar.k();
            if (a6eVar.k.b()) {
            }
            a6eVar.u(k2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false);
            return new Float(floatValue2);
        }
        new Float(a6eVar.l());
        return new Float(floatValue2);
    }
}
