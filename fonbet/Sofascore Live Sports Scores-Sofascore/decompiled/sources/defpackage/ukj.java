package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ukj implements Function2 {
    public final /* synthetic */ float a;
    public final /* synthetic */ long b;
    public final /* synthetic */ tc3 c;

    public ukj(float f, long j, tc3 tc3Var) {
        this.a = f;
        this.b = j;
        this.c = tc3Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        of3 of3Var = (of3) obj;
        int intValue = ((Number) obj2).intValue();
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
            t3e t3eVar = vkj.a;
            xtc a0 = l98.a0(bkh.o(utc.a, 40.0f, 24.0f, this.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8), vkj.a);
            k1c c = e12.c(uxf.c, false);
            int G = z8e.G(av8Var);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, a0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c, hf3.g);
            waa.K(av8Var, m, hf3.f);
            f50 f50Var = hf3.j;
            if (av8Var.S || !Intrinsics.c(av8Var.O(), Integer.valueOf(G))) {
                mz1.t(G, av8Var, G, f50Var);
            }
            waa.K(av8Var, C, hf3.d);
            tol.c(new gb0[]{lo3.a.a(new r13(this.b)), udj.a.a(d7k.a(aie.d, av8Var))}, this.c, av8Var, 8);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }
}
