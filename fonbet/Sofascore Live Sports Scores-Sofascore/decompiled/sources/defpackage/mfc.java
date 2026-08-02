package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class mfc implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public mfc(Function2 function2, cfc cfcVar, boolean z, tc3 tc3Var) {
        this.c = function2;
        this.d = cfcVar;
        this.b = z;
        this.e = tc3Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        int i2 = 2;
        switch (i) {
            case 0:
                of3 of3Var = (of3) obj;
                int intValue = ((Number) obj2).intValue();
                cfc cfcVar = (cfc) obj4;
                Function2 function2 = (Function2) obj5;
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(1 & intValue, (intValue & 3) != 2)) {
                    boolean z = this.b;
                    if (function2 != null) {
                        av8Var.d0(-864613220);
                        tol.b(lo3.a.a(new r13(z ? cfcVar.b : cfcVar.e)), yqo.H(1241781204, av8Var, new vi4(i2, function2)), av8Var, 56);
                        av8Var.s(false);
                    } else {
                        av8Var.d0(-864293207);
                        av8Var.s(false);
                    }
                    tol.b(lo3.a.a(new r13(z ? cfcVar.a : cfcVar.d)), yqo.H(-893579015, av8Var, new kp1(9, function2, (tc3) obj3)), av8Var, 56);
                    av8Var.d0(-863072055);
                    av8Var.s(false);
                } else {
                    av8Var.W();
                }
                break;
            default:
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Number) obj2).intValue();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(1 & intValue2, (intValue2 & 3) != 2)) {
                    a99.f.q(this.b, false, (wzc) obj5, null, (n9j) obj4, (uah) obj3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var2, 100663296, 200);
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }

    public mfc(boolean z, wzc wzcVar, n9j n9jVar, uah uahVar) {
        this.b = z;
        this.c = wzcVar;
        this.d = n9jVar;
        this.e = uahVar;
    }
}
