package defpackage;

import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class dx6 implements Function2 {
    public final /* synthetic */ am3 a;
    public final /* synthetic */ qug b;
    public final /* synthetic */ ll3 c;
    public final /* synthetic */ xl3 d;
    public final /* synthetic */ View e;
    public final /* synthetic */ Function1 f;
    public final /* synthetic */ mei g;
    public final /* synthetic */ Function1 h;
    public final /* synthetic */ nei i;

    public dx6(am3 am3Var, qug qugVar, ll3 ll3Var, xl3 xl3Var, View view, Function1 function1, mei meiVar, Function1 function12, nei neiVar) {
        this.a = am3Var;
        this.b = qugVar;
        this.c = ll3Var;
        this.d = xl3Var;
        this.e = view;
        this.f = function1;
        this.g = meiVar;
        this.h = function12;
        this.i = neiVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Function0 function0;
        boolean z;
        of3 of3Var = (of3) obj;
        int intValue = ((Number) obj2).intValue();
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
            uxf uxfVar = ww9.c;
            lv1 lv1Var = uxf.m;
            av8Var.d0(-30061939);
            n9a n9aVar = n9a.b;
            utc utcVar = utc.a;
            xtc e0 = l98.e0(hkg.Z(fz8.Y(utcVar, n9aVar), this.b, true, 12), 4.0f, 8.0f, 8.0f, 4.0f);
            xl3 xl3Var = this.d;
            boolean g = av8Var.g(xl3Var);
            Object O = av8Var.O();
            Object obj3 = nf3.a;
            if (g || O == obj3) {
                O = new qw6(xl3Var, 4);
                av8Var.n0(O);
            }
            this.a.getClass();
            xtc b = am3.b(e0, this.c, (Function1) O);
            av8Var.s(false);
            l8g a = k8g.a(uxfVar, lv1Var, av8Var, 54);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, b);
            if3.k7.getClass();
            Function0 function02 = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(function02);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            List j = b.j(mei.m, mei.n, mei.o, mei.l, mei.p);
            av8Var.d0(1167669602);
            int i = 0;
            av8 av8Var2 = av8Var;
            for (Object obj4 : j) {
                int i2 = i + 1;
                if (i < 0) {
                    b.q();
                    throw null;
                }
                mei meiVar = (mei) obj4;
                if (this.g == meiVar) {
                    function0 = null;
                    z = true;
                } else {
                    function0 = null;
                    z = false;
                }
                Function1 function1 = this.h;
                if (((function1 == 0 || !meiVar.f) ? function0 : function1) == null) {
                    av8Var2.d0(842692671);
                } else {
                    av8Var2.d0(842692672);
                    boolean g2 = av8Var2.g(function1) | av8Var2.e(meiVar.ordinal());
                    Object O2 = av8Var2.O();
                    if (g2 || O2 == obj3) {
                        O2 = new cx6(function1, meiVar, 0);
                        av8Var2.n0(O2);
                    }
                    function0 = (Function0) O2;
                }
                av8Var2.s(false);
                Function0 function03 = function0;
                float f = meiVar.e;
                nei neiVar = this.i;
                zm2.a(meiVar, z, null, function03, f, neiVar, av8Var2, 0);
                if (i != j.size() - 1) {
                    av8Var2.d0(842871418);
                    av8 av8Var3 = av8Var2;
                    td4.N(l98.e0(utcVar, 3.5f, 2.0f, 3.5f, neiVar == null ? 2.0f : 14.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0L, av8Var3, 0, 6);
                    av8Var2 = av8Var3;
                    av8Var2.s(false);
                } else {
                    av8Var2.d0(843251013);
                    av8Var2.s(false);
                }
                i = i2;
                av8Var2 = av8Var2;
            }
            av8Var2.s(false);
            av8Var2.s(true);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }
}
