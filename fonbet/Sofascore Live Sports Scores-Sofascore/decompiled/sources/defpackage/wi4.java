package defpackage;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class wi4 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ wi4(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = obj4;
        this.f = obj5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ?? r2;
        int i = this.a;
        a99 a99Var = nf3.a;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.b;
        Object obj6 = this.c;
        Object obj7 = this.d;
        switch (i) {
            case 0:
                of3 of3Var = (of3) obj;
                int intValue = ((Number) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    utc utcVar = utc.a;
                    xtc d = bkh.d(utcVar, 1.0f);
                    Function2 function2 = (Function2) obj6;
                    Function2 function22 = (Function2) obj7;
                    Function2 function23 = (Function2) obj4;
                    ci4 ci4Var = (ci4) obj5;
                    dfj dfjVar = (dfj) obj3;
                    u23 a = t23.a(ww9.d, uxf.o, av8Var, 0);
                    int G = z8e.G(av8Var);
                    aee m = av8Var.m();
                    xtc C = fqj.C(av8Var, d);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var.h0();
                    if (av8Var.S) {
                        av8Var.l(zg3Var);
                    } else {
                        av8Var.q0();
                    }
                    f50 f50Var = hf3.g;
                    waa.K(av8Var, a, f50Var);
                    ff3 ff3Var = hf3.f;
                    waa.K(av8Var, m, ff3Var);
                    f50 f50Var2 = hf3.j;
                    if (av8Var.S || !Intrinsics.c(av8Var.O(), Integer.valueOf(G))) {
                        mz1.t(G, av8Var, G, f50Var2);
                    }
                    f50 f50Var3 = hf3.d;
                    waa.K(av8Var, C, f50Var3);
                    lg0 lg0Var = (function2 == null || function22 == null) ? function2 != null ? ww9.b : ww9.c : ww9.h;
                    xtc d2 = bkh.d(utcVar, 1.0f);
                    l8g a2 = k8g.a(lg0Var, uxf.m, av8Var, 48);
                    int G2 = z8e.G(av8Var);
                    aee m2 = av8Var.m();
                    xtc C2 = fqj.C(av8Var, d2);
                    av8Var.h0();
                    if (av8Var.S) {
                        av8Var.l(zg3Var);
                    } else {
                        av8Var.q0();
                    }
                    waa.K(av8Var, a2, f50Var);
                    waa.K(av8Var, m2, ff3Var);
                    if (av8Var.S || !Intrinsics.c(av8Var.O(), Integer.valueOf(G2))) {
                        mz1.t(G2, av8Var, G2, f50Var2);
                    }
                    waa.K(av8Var, C2, f50Var3);
                    if (function2 != null) {
                        av8Var.d0(-516028300);
                        r2 = 0;
                        udj.a(dfjVar, yqo.H(-738208900, av8Var, new vi4(0 == true ? 1 : 0, function2)), av8Var, 48);
                        av8Var.s(false);
                    } else {
                        r2 = 0;
                        av8Var.d0(-515838022);
                        av8Var.s(false);
                    }
                    if (function22 == null) {
                        av8Var.d0(-515799087);
                    } else {
                        av8Var.d0(260455984);
                        function22.invoke(av8Var, Integer.valueOf((int) r2));
                    }
                    av8Var.s(r2);
                    av8Var.s(true);
                    if (function23 == null && function2 == null && function22 == null) {
                        av8Var.d0(-250277930);
                        av8Var.s(r2);
                    } else {
                        av8Var.d0(-250360576);
                        td4.w(null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ci4Var.x, av8Var, 0, 3);
                        av8Var.s(false);
                    }
                    av8Var.s(true);
                } else {
                    av8Var.W();
                }
                break;
            case 1:
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Number) obj2).intValue();
                qj4 qj4Var = (qj4) obj6;
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Long a3 = qj4Var.a();
                    long j = ((lg2) ((eoh) qj4Var.e).getValue()).e;
                    int i2 = ((f55) ((eoh) qj4Var.g).getValue()).a;
                    boolean g = av8Var2.g(qj4Var);
                    Object O = av8Var2.O();
                    if (g || O == a99Var) {
                        O = new xi4(qj4Var, 1);
                        av8Var2.n0(O);
                    }
                    Function1 function1 = (Function1) O;
                    boolean g2 = av8Var2.g(qj4Var);
                    Object O2 = av8Var2.O();
                    if (g2 || O2 == a99Var) {
                        O2 = new xi4(qj4Var, 2);
                        av8Var2.n0(O2);
                    }
                    oj4.k(a3, j, i2, function1, (Function1) O2, (kg2) obj7, qj4Var.a, (gi4) obj4, (di4) ((eoh) qj4Var.d).getValue(), (ci4) obj5, (ce8) obj3, av8Var2, 0);
                } else {
                    av8Var2.W();
                }
                break;
            default:
                of3 of3Var3 = (of3) obj;
                y15 y15Var = (y15) obj7;
                d6d d6dVar = (d6d) obj6;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    av8 av8Var3 = (av8) of3Var3;
                    if (av8Var3.D()) {
                        av8Var3.W();
                        break;
                    }
                }
                av8 av8Var4 = (av8) of3Var3;
                boolean i3 = av8Var4.i(d6dVar) | av8Var4.i(y15Var);
                SnapshotStateList snapshotStateList = (SnapshotStateList) obj5;
                Object O3 = av8Var4.O();
                if (i3 || O3 == a99Var) {
                    O3 = new fa(18, snapshotStateList, d6dVar, y15Var);
                    av8Var4.n0(O3);
                }
                hz8.d(d6dVar, (Function1) O3, av8Var4);
                x2a.g(d6dVar, (mpg) obj4, yqo.H(-497631156, av8Var4, new kp1(6, (x15) obj3, d6dVar)), av8Var4, 384);
        }
        return Unit.a;
    }
}
