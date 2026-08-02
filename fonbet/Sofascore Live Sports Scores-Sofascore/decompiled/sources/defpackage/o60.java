package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class o60 extends xka implements Function1 {
    public final /* synthetic */ int i;
    public final /* synthetic */ p60 j;
    public final /* synthetic */ long k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o60(p60 p60Var, long j, int i) {
        super(1);
        this.i = i;
        this.j = p60Var;
        this.k = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        j38 j38Var;
        int i = this.i;
        long j = this.k;
        p60 p60Var = this.j;
        switch (i) {
            case 0:
                twj twjVar = (twj) obj;
                if (!Intrinsics.c(twjVar.b(), p60Var.r.b())) {
                    cdi cdiVar = (cdi) p60Var.r.e.g(twjVar.b());
                    j = cdiVar != null ? ((c7a) cdiVar.getValue()).a : 0L;
                } else if (!c7a.a(p60Var.s, -9223372034707292160L)) {
                    j = p60Var.s;
                }
                cdi cdiVar2 = (cdi) p60Var.r.e.g(twjVar.a());
                r1 = cdiVar2 != null ? ((c7a) cdiVar2.getValue()).a : 0L;
                kkh kkhVar = (kkh) p60Var.q.getValue();
                return (kkhVar == null || (j38Var = (j38) kkhVar.b.invoke(new c7a(j), new c7a(r1))) == null) ? s02.e0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 400.0f, null, 5) : j38Var;
            default:
                if (Intrinsics.c(obj, p60Var.r.b())) {
                    r1 = c7a.a(p60Var.s, -9223372034707292160L) ? j : p60Var.s;
                } else {
                    cdi cdiVar3 = (cdi) p60Var.r.e.g(obj);
                    if (cdiVar3 != null) {
                        r1 = ((c7a) cdiVar3.getValue()).a;
                    }
                }
                return new c7a(r1);
        }
    }
}
