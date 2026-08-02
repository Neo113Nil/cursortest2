package defpackage;

import com.ironsource.V2;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class lfm implements ct8 {
    public final /* synthetic */ String a;
    public final /* synthetic */ Function2 b;

    public lfm(String str, Function2 function2) {
        this.a = str;
        this.b = function2;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        of3 of3Var = (of3) obj2;
        ((Number) obj3).intValue();
        ((r70) obj).getClass();
        utc utcVar = utc.a;
        xtc d0 = l98.d0(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1);
        u23 a = t23.a(ww9.d, uxf.o, of3Var, 0);
        int G = z8e.G(of3Var);
        av8 av8Var = (av8) of3Var;
        aee m = av8Var.m();
        xtc C = fqj.C(of3Var, d0);
        if3.k7.getClass();
        zg3 zg3Var = hf3.b;
        av8Var.h0();
        if (av8Var.S) {
            av8Var.l(zg3Var);
        } else {
            av8Var.q0();
        }
        waa.K(of3Var, a, hf3.g);
        waa.K(of3Var, m, hf3.f);
        f50 f50Var = hf3.j;
        if (av8Var.S || !Intrinsics.c(av8Var.O(), Integer.valueOf(G))) {
            mz1.t(G, av8Var, G, f50Var);
        }
        waa.K(of3Var, C, hf3.d);
        long j = l3m.b;
        long v = v8a.v(16);
        dfj dfjVar = new dfj(0L, 0L, new wg8(600), null, 0L, 0, 0, 0L, 16777211);
        udj.b(this.a, l98.c0(utcVar, 16.0f, 8.0f), j, v, 0L, 0L, 0, false, 0, 0, dfjVar, of3Var, V2.b.f, 1572864, 65520);
        this.b.invoke(of3Var, 0);
        av8Var.s(true);
        return Unit.a;
    }
}
