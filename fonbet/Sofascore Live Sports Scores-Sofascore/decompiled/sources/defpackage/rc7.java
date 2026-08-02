package defpackage;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class rc7 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ rc7(y97 y97Var, ct8 ct8Var, Function2 function2, Function1 function1, xtc xtcVar, qug qugVar, boolean z, int i) {
        this.a = 3;
        this.c = y97Var;
        this.d = ct8Var;
        this.f = function2;
        this.e = function1;
        this.g = xtcVar;
        this.h = qugVar;
        this.b = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.d;
        Object obj4 = this.h;
        Object obj5 = this.g;
        Object obj6 = this.f;
        Object obj7 = this.e;
        Object obj8 = this.c;
        switch (i) {
            case 0:
                ksa ksaVar = (ksa) obj8;
                zo6 zo6Var = (zo6) obj3;
                Function1 function1 = (Function1) obj7;
                e1d e1dVar = (e1d) obj6;
                cdi cdiVar = (cdi) obj5;
                cdi cdiVar2 = (cdi) obj4;
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    g28 g28Var = bkh.c;
                    p75 p75Var = (p75) e1dVar.getValue();
                    t3e C = l98.C(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 48.0f + (p75Var != null ? p75Var.a : 0.0f), 7);
                    boolean g = av8Var.g(zo6Var) | av8Var.g(function1);
                    boolean z = this.b;
                    boolean h = av8Var.h(z) | g;
                    Object O = av8Var.O();
                    if (h || O == nf3.a) {
                        b05 b05Var = new b05(zo6Var, function1, z, cdiVar, cdiVar2);
                        av8Var.n0(b05Var);
                        O = b05Var;
                    }
                    v8a.a(g28Var, ksaVar, C, null, null, null, false, null, (Function1) O, av8Var, 6, PglCryptUtils.BASE64_FAILED);
                } else {
                    av8Var.W();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                un0.b((Function0) obj8, (xtc) obj3, this.b, (uah) obj7, (ek2) obj6, (gk2) obj5, (tc3) obj4, (of3) obj, aba.K(100663297));
                break;
            case 2:
                ((Integer) obj2).getClass();
                ktm.l((gv9) obj8, (gv9) obj3, (Function0) obj6, (Function0) obj5, (Function1) obj7, this.b, (xtc) obj4, (of3) obj, aba.K(1572865));
                break;
            case 3:
                ((Integer) obj2).getClass();
                wnn.i((y97) obj8, (ct8) obj3, (Function2) obj6, (Function1) obj7, (xtc) obj5, (qug) obj4, this.b, (of3) obj, aba.K(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                l6g.p((gv9) obj8, this.d, (Function1) obj7, (xtc) obj6, (uah) obj5, this.b, (tc3) obj4, (of3) obj, aba.K(905972737));
                break;
            case 5:
                ((Integer) obj2).getClass();
                j72.m((ysd) obj8, (osa) obj3, this.b, (Function1) obj7, (Function1) obj6, (Function0) obj5, (xtc) obj4, (of3) obj, aba.K(65));
                break;
            case 6:
                ((Integer) obj2).getClass();
                u0a.p((String) obj8, (gv9) obj3, this.b, (Function0) obj7, (Function2) obj6, (Function0) obj5, (Function0) obj4, (of3) obj, aba.K(1));
                break;
            default:
                jfj jfjVar = (jfj) obj8;
                jfj jfjVar2 = (jfj) obj3;
                jfj jfjVar3 = (jfj) obj7;
                jfj jfjVar4 = (jfj) obj6;
                jfj jfjVar5 = (jfj) obj5;
                jfj jfjVar6 = (jfj) obj4;
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Integer) obj2).intValue();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    waa.m(this.b, jfjVar, jfjVar2, jfjVar3, jfjVar4, jfjVar5, jfjVar6, null, av8Var2, 0);
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ rc7(gv9 gv9Var, gv9 gv9Var2, Function0 function0, Function0 function02, Function1 function1, boolean z, xtc xtcVar, int i) {
        this.a = 2;
        this.c = gv9Var;
        this.d = gv9Var2;
        this.f = function0;
        this.g = function02;
        this.e = function1;
        this.b = z;
        this.h = xtcVar;
    }

    public /* synthetic */ rc7(gv9 gv9Var, Object obj, Function1 function1, xtc xtcVar, uah uahVar, boolean z, tc3 tc3Var, int i) {
        this.a = 4;
        this.c = gv9Var;
        this.d = obj;
        this.e = function1;
        this.f = xtcVar;
        this.g = uahVar;
        this.b = z;
        this.h = tc3Var;
    }

    public /* synthetic */ rc7(ksa ksaVar, zo6 zo6Var, Function1 function1, boolean z, e1d e1dVar, cdi cdiVar, cdi cdiVar2) {
        this.a = 0;
        this.c = ksaVar;
        this.d = zo6Var;
        this.e = function1;
        this.b = z;
        this.f = e1dVar;
        this.g = cdiVar;
        this.h = cdiVar2;
    }

    public /* synthetic */ rc7(Object obj, Object obj2, boolean z, Object obj3, Object obj4, Object obj5, Object obj6, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.b = z;
        this.e = obj3;
        this.f = obj4;
        this.g = obj5;
        this.h = obj6;
    }

    public /* synthetic */ rc7(boolean z, jfj jfjVar, jfj jfjVar2, jfj jfjVar3, jfj jfjVar4, jfj jfjVar5, jfj jfjVar6) {
        this.a = 7;
        this.b = z;
        this.c = jfjVar;
        this.d = jfjVar2;
        this.e = jfjVar3;
        this.f = jfjVar4;
        this.g = jfjVar5;
        this.h = jfjVar6;
    }
}
