package defpackage;

import com.unity3d.services.UnityAdsConstants;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class or4 implements e9d {
    public final a6e a;
    public final ewd b;

    public or4(a6e a6eVar, ewd ewdVar) {
        this.a = a6eVar;
        this.b = ewdVar;
    }

    @Override // defpackage.e9d
    public final long P(int i, long j) {
        if (i != 1) {
            return 0L;
        }
        a6e a6eVar = this.a;
        if (Math.abs(a6eVar.l()) <= 1.0E-6d) {
            return 0L;
        }
        ewd ewdVar = ewd.b;
        ewd ewdVar2 = this.b;
        if (Math.abs(Float.intBitsToFloat((int) (ewdVar2 == ewdVar ? j >> 32 : j & 4294967295L))) <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return 0L;
        }
        r5e m = a6eVar.m();
        float l = a6eVar.l() * a6eVar.o();
        float f = ((m.b + m.c) * (-Math.signum(a6eVar.l()))) + l;
        if (a6eVar.l() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            l = f;
            f = l;
        }
        float f2 = -a6eVar.k.e(-llf.b(Float.intBitsToFloat((int) (ewdVar2 == ewdVar ? j >> 32 : j & 4294967295L)), l, f));
        float intBitsToFloat = ewdVar2 == ewdVar ? f2 : Float.intBitsToFloat((int) (j >> 32));
        if (ewdVar2 != ewd.a) {
            f2 = Float.intBitsToFloat((int) (j & 4294967295L));
        }
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    @Override // defpackage.e9d
    public final Object T0(long j, long j2, rq3 rq3Var) {
        return new vmk(this.b == ewd.a ? vmk.a(j2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2) : vmk.a(j2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1));
    }

    @Override // defpackage.e9d
    public final long b0(int i, long j, long j2) {
        if (i != 2) {
            return 0L;
        }
        if (Float.intBitsToFloat((int) (this.b == ewd.b ? j2 >> 32 : 4294967295L & j2)) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return 0L;
        }
        throw new CancellationException("Scroll cancelled");
    }
}
