package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class afh implements e9d {
    public final /* synthetic */ dfh a;
    public final /* synthetic */ Function1 b;

    public afh(dfh dfhVar, Function1 function1) {
        ewd ewdVar = ewd.a;
        this.a = dfhVar;
        this.b = function1;
    }

    @Override // defpackage.e9d
    public final long P(int i, long j) {
        ewd ewdVar = ewd.a;
        float intBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (intBitsToFloat >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || i != 1) {
            return 0L;
        }
        dx dxVar = this.a.d;
        float j2 = dxVar.j(intBitsToFloat);
        xnh xnhVar = (xnh) dxVar.f;
        if (!Float.isNaN(xnhVar.h())) {
            f = xnhVar.h();
        }
        xnhVar.i(j2);
        return a(j2 - f);
    }

    @Override // defpackage.e9d
    public final Object T0(long j, long j2, rq3 rq3Var) {
        ewd ewdVar = ewd.a;
        this.b.invoke(new Float(vmk.c(j2)));
        return new vmk(j2);
    }

    public final long a(float f) {
        ewd ewdVar = ewd.a;
        ewd ewdVar2 = ewd.a;
        return (Float.floatToRawIntBits(f) & 4294967295L) | (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32);
    }

    @Override // defpackage.e9d
    public final long b0(int i, long j, long j2) {
        if (i != 1) {
            return 0L;
        }
        dx dxVar = this.a.d;
        ewd ewdVar = ewd.a;
        float j3 = dxVar.j(Float.intBitsToFloat((int) (4294967295L & j2)));
        xnh xnhVar = (xnh) dxVar.f;
        float h = Float.isNaN(xnhVar.h()) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : xnhVar.h();
        xnhVar.i(j3);
        return a(j3 - h);
    }

    @Override // defpackage.e9d
    public final Object x0(long j, rq3 rq3Var) {
        ewd ewdVar = ewd.a;
        float c = vmk.c(j);
        dfh dfhVar = this.a;
        float k = dfhVar.d.k();
        float c2 = dfhVar.d.g().c();
        if (c >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || k <= c2) {
            j = 0;
        } else {
            this.b.invoke(new Float(c));
        }
        return new vmk(j);
    }
}
