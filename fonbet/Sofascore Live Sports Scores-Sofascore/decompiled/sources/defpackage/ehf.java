package defpackage;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ehf implements e9d {
    public final chf a;
    public final sc3 b;

    public ehf(chf chfVar, sc3 sc3Var) {
        this.a = chfVar;
        this.b = sc3Var;
    }

    @Override // defpackage.e9d
    public final long P(int i, long j) {
        if (i != 1) {
            return 0L;
        }
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i2) >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return 0L;
        }
        float floatValue = ((Number) this.a.invoke(Float.valueOf(Float.intBitsToFloat(i2)))).floatValue();
        return (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32) | (Float.floatToRawIntBits(floatValue) & 4294967295L);
    }

    @Override // defpackage.e9d
    public final long b0(int i, long j, long j2) {
        if (i != 1) {
            return 0L;
        }
        int i2 = (int) (j2 & 4294967295L);
        if (Float.intBitsToFloat(i2) <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return 0L;
        }
        float floatValue = ((Number) this.a.invoke(Float.valueOf(Float.intBitsToFloat(i2)))).floatValue();
        return (Float.floatToRawIntBits(floatValue) & 4294967295L) | (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.e9d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object x0(long j, rq3 rq3Var) {
        dhf dhfVar;
        int i;
        if (rq3Var instanceof dhf) {
            dhfVar = (dhf) rq3Var;
            int i2 = dhfVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dhfVar.t = i2 - Integer.MIN_VALUE;
                Object obj = dhfVar.r;
                lu3 lu3Var = lu3.a;
                i = dhfVar.t;
                if (i != 0) {
                    y6a.M(obj);
                    Float f = new Float(vmk.c(j));
                    dhfVar.t = 1;
                    obj = this.b.invoke(f, dhfVar);
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
                return new vmk(t6a.i(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ((Number) obj).floatValue()));
            }
        }
        dhfVar = new dhf(this, (sq3) rq3Var);
        Object obj2 = dhfVar.r;
        lu3 lu3Var2 = lu3.a;
        i = dhfVar.t;
        if (i != 0) {
        }
        return new vmk(t6a.i(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ((Number) obj2).floatValue()));
    }
}
