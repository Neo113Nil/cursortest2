package defpackage;

import androidx.compose.runtime.e;
import androidx.core.app.NotificationCompat;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class v77 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ xtc b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ String g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ v77(bqh bqhVar, xtc xtcVar, Function0 function0, long j, xqh xqhVar, boolean z, boolean z2, String str, int i, int i2) {
        this.j = bqhVar;
        this.b = xtcVar;
        this.c = function0;
        this.d = j;
        this.k = xqhVar;
        this.e = z;
        this.f = z2;
        this.g = str;
        this.h = i;
        this.i = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        tc3 H;
        Function2 n;
        int i = this.a;
        Object obj3 = this.k;
        Object obj4 = this.j;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                z8e.i(this.g, (String) obj4, this.b, this.d, (dfj) obj3, this.c, this.e, this.f, (of3) obj, aba.K(this.h | 1), this.i);
                break;
            default:
                bqh bqhVar = (bqh) obj4;
                xqh xqhVar = (xqh) obj3;
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(1 & intValue, (intValue & 3) != 2)) {
                    boolean z = this.e;
                    if (bqhVar == null) {
                        av8Var.d0(-2072071005);
                        av8Var.s(false);
                        H = null;
                    } else {
                        av8Var.d0(-2072071004);
                        H = yqo.H(2109186939, av8Var, new t60(xqhVar, z, bqhVar, 21));
                        av8Var.s(false);
                    }
                    xtc g = bkh.g(this.b, 24.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                    tc3 tc3Var = H;
                    boolean z2 = this.f;
                    Function0 function0 = !z2 ? this.c : null;
                    a99 a99Var = nf3.a;
                    if (function0 == null) {
                        av8Var.d0(-2071549708);
                        Object O = av8Var.O();
                        if (O == a99Var) {
                            O = new b7h(20);
                            av8Var.n0(O);
                        }
                        function0 = (Function0) O;
                    } else {
                        av8Var.d0(-2006487795);
                    }
                    av8Var.s(false);
                    Object O2 = av8Var.O();
                    if (O2 == a99Var) {
                        O2 = e.d(0L);
                        av8Var.n0(O2);
                    }
                    fqh fqhVar = new fqh(this.d, function0, (boh) O2);
                    v72 b = q72.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 30);
                    n7g a = o7g.a(xqhVar.f());
                    if (z) {
                        av8Var.d0(-2006475687);
                        n = xqhVar.getBorderColor();
                    } else {
                        av8Var.d0(-2006474879);
                        n = xqhVar.n();
                    }
                    long j = ((r13) n.invoke(av8Var, 0)).a;
                    av8Var.s(false);
                    iz8.e(fqhVar, g, z, a, q72.a(((r13) xqhVar.l().invoke(av8Var, 0)).a, ((r13) xqhVar.m().invoke(av8Var, 0)).a, ((r13) xqhVar.k().invoke(av8Var, 0)).a, ((r13) xqhVar.j().invoke(av8Var, 0)).a, av8Var, 0), b, fcp.H(j, 1.5f), new t3e(Intrinsics.c(bqhVar != null ? bqhVar.b : null, uxf.o) ? xqhVar.e() : xqhVar.b(), xqhVar.h(), Intrinsics.c(bqhVar != null ? bqhVar.b : null, uxf.q) ? xqhVar.e() : xqhVar.b(), xqhVar.h()), null, yqo.H(-1540273316, av8Var, new qn7(z2, this.g, xqhVar, bqhVar, tc3Var, this.h, this.i)), av8Var, 805306368, NotificationCompat.FLAG_LOCAL_ONLY);
                } else {
                    av8Var.W();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ v77(String str, String str2, xtc xtcVar, long j, dfj dfjVar, Function0 function0, boolean z, boolean z2, int i, int i2) {
        this.g = str;
        this.j = str2;
        this.b = xtcVar;
        this.d = j;
        this.k = dfjVar;
        this.c = function0;
        this.e = z;
        this.f = z2;
        this.h = i;
        this.i = i2;
    }
}
