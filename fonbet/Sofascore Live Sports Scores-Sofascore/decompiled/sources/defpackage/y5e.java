package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class y5e extends hoi implements Function2 {
    public int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ a6e t;
    public final /* synthetic */ int u;
    public final /* synthetic */ float v;
    public final /* synthetic */ c80 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y5e(a6e a6eVar, int i, float f, c80 c80Var, rq3 rq3Var) {
        super(2, rq3Var);
        this.t = a6eVar;
        this.u = i;
        this.v = f;
        this.w = c80Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        y5e y5eVar = new y5e(this.t, this.u, this.v, this.w, rq3Var);
        y5eVar.s = obj;
        return y5eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((y5e) create((oug) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i;
        Object obj2 = lu3.a;
        int i2 = this.r;
        int i3 = 1;
        if (i2 == 0) {
            y6a.M(obj);
            oug ougVar = (oug) this.s;
            a6e a6eVar = this.t;
            fsa fsaVar = new fsa(ougVar, a6eVar, i3);
            this.r = 1;
            b6e b6eVar = c6e.a;
            int i4 = this.u;
            a6eVar.q.i(a6eVar.j(new Integer(i4).intValue()));
            Unit unit = Unit.a;
            boolean z = i4 > a6eVar.e;
            int e = (fsaVar.e() - a6eVar.e) + 1;
            if (((z && i4 > fsaVar.e()) || (!z && i4 < a6eVar.e)) && Math.abs(i4 - a6eVar.e) >= 3) {
                if (z) {
                    i = i4 - e;
                    int i5 = a6eVar.e;
                    if (i < i5) {
                        i = i5;
                    }
                } else {
                    int i6 = e + i4;
                    i = a6eVar.e;
                    if (i6 <= i) {
                        i = i6;
                    }
                }
                fsaVar.f(i, 0);
            }
            Object m = d2a.m(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, fsaVar.b(i4) + this.v, this.w, new op9(27, new csf(), fsaVar), this, 4);
            if (m != obj2) {
                m = Unit.a;
            }
            if (m == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        return Unit.a;
    }
}
