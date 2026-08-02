package defpackage;

import androidx.compose.ui.graphics.vector.ImageVector;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class vka implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ vka(js8 js8Var, long j, dfj dfjVar, xtc xtcVar, gv9 gv9Var, String str, int i) {
        this.f = js8Var;
        this.c = j;
        this.e = dfjVar;
        this.d = xtcVar;
        this.g = gv9Var;
        this.b = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.g;
        Object obj6 = this.d;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                r4a.c(this.b, (xtc) obj6, (dfj) obj4, this.c, (bqh) obj3, (Function0) obj5, (of3) obj, aba.K(49));
                break;
            case 1:
                ((Integer) obj2).getClass();
                nld.c(this.b, (fgf) obj4, this.c, (Function1) obj3, (xtc) obj6, (old) obj5, (of3) obj, aba.K(27649));
                break;
            case 2:
                ((Integer) obj2).getClass();
                sea.i((js8) obj3, this.c, (dfj) obj4, (xtc) obj6, (gv9) obj5, this.b, (of3) obj, aba.K(1));
                break;
            default:
                w8l w8lVar = (w8l) obj6;
                Function0 function0 = (Function0) obj5;
                ImageVector imageVector = (ImageVector) obj4;
                ct8 ct8Var = (ct8) obj3;
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    lv1 lv1Var = uxf.m;
                    utc utcVar = utc.a;
                    xtc c0 = l98.c0(bkh.g(wnn.B(td4.A0(utcVar, w8lVar)), 48.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), 16.0f, 12.0f);
                    l8g a = k8g.a(ww9.b, lv1Var, av8Var, 48);
                    int hashCode = Long.hashCode(av8Var.T);
                    aee m = av8Var.m();
                    xtc C = fqj.C(av8Var, c0);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var.h0();
                    if (av8Var.S) {
                        av8Var.l(zg3Var);
                    } else {
                        av8Var.q0();
                    }
                    waa.K(av8Var, a, hf3.g);
                    waa.K(av8Var, m, hf3.f);
                    waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                    waa.J(av8Var, hf3.k);
                    waa.K(av8Var, C, hf3.d);
                    xtc l = bkh.l(utcVar, 24.0f);
                    boolean g = av8Var.g(function0);
                    Object O = av8Var.O();
                    if (g || O == nf3.a) {
                        O = new rsd(18, function0);
                        av8Var.n0(O);
                    }
                    xtc y = tol.y(l, false, false, false, 0L, null, (Function0) O, av8Var, 29);
                    long j = this.c;
                    kq9.b(imageVector, null, y, j, av8Var, 48, 0);
                    nq8.h(av8Var, bkh.p(utcVar, 24.0f));
                    p8g p8gVar = p8g.a;
                    xtc a2 = p8gVar.a(1.0f, utcVar, true);
                    yf8 yf8Var = xth.a;
                    udj.c(this.b, a2, j, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, (dfj) xth.s.getValue(), av8Var, 0, 24960, 110584);
                    if (ct8Var == null) {
                        av8Var.d0(-266645823);
                        av8Var.s(false);
                    } else {
                        ljg.r(12.0f, -266645822, av8Var, av8Var, utcVar);
                        ct8Var.invoke(p8gVar, av8Var, 6);
                        av8Var.s(false);
                    }
                    av8Var.s(true);
                } else {
                    av8Var.W();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ vka(w8l w8lVar, Function0 function0, ImageVector imageVector, long j, String str, ct8 ct8Var) {
        this.d = w8lVar;
        this.g = function0;
        this.e = imageVector;
        this.c = j;
        this.b = str;
        this.f = ct8Var;
    }

    public /* synthetic */ vka(String str, xtc xtcVar, dfj dfjVar, long j, bqh bqhVar, Function0 function0, int i) {
        this.b = str;
        this.d = xtcVar;
        this.e = dfjVar;
        this.c = j;
        this.f = bqhVar;
        this.g = function0;
    }

    public /* synthetic */ vka(String str, fgf fgfVar, long j, Function1 function1, xtc xtcVar, old oldVar, int i) {
        this.b = str;
        this.e = fgfVar;
        this.c = j;
        this.f = function1;
        this.d = xtcVar;
        this.g = oldVar;
    }
}
