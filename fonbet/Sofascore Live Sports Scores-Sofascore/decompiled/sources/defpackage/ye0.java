package defpackage;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.runtime.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ye0 extends xka implements Function2 {
    public final /* synthetic */ int i = 0;
    public final /* synthetic */ Context j;
    public final /* synthetic */ af0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ye0(af0 af0Var, Context context) {
        super(2);
        this.k = af0Var;
        this.j = context;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        af0 af0Var;
        switch (this.i) {
            case 0:
                of3 of3Var = (of3) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    av8 av8Var = (av8) of3Var;
                    if (av8Var.D()) {
                        av8Var.W();
                        break;
                    }
                }
                av8 av8Var2 = (av8) of3Var;
                av8Var2.e0(1881995740);
                Object O = av8Var2.O();
                a99 a99Var = nf3.a;
                Object obj3 = O;
                if (O == a99Var) {
                    e1d f = e.f(new s75(0L));
                    av8Var2.n0(f);
                    obj3 = f;
                }
                e1d e1dVar = (e1d) obj3;
                av8Var2.s(false);
                Boolean bool = Boolean.FALSE;
                av8Var2.e0(1881999935);
                af0 af0Var2 = this.k;
                boolean g = av8Var2.g(af0Var2);
                Context context = this.j;
                boolean g2 = av8Var2.g(context) | g | av8Var2.g(e1dVar);
                Object O2 = av8Var2.O();
                Unit unit = null;
                boolean z = false;
                if (g2 || O2 == a99Var) {
                    u1 u1Var = new u1((Object) af0Var2, (Object) context, (Object) e1dVar, (rq3) (z ? 1 : 0), 3);
                    af0Var = af0Var2;
                    av8Var2.n0(u1Var);
                    O2 = u1Var;
                } else {
                    af0Var = af0Var2;
                }
                av8Var2.s(false);
                if (((Boolean) qea.F(av8Var2, bool, (Function2) O2).getValue()).booleanValue()) {
                    av8Var2.e0(-1786326291);
                    av8Var2.e0(1882039614);
                    Object O3 = av8Var2.O();
                    Object obj4 = O3;
                    if (O3 == a99Var) {
                        sn2 r = yso.r(new df0(af0Var.d, context, af0Var.e, (rq3) null));
                        av8Var2.n0(r);
                        obj4 = r;
                    }
                    av8Var2.s(false);
                    Function2 function2 = (Function2) sea.k((z88) obj4, null, null, av8Var2, 48, 2).getValue();
                    av8Var2.e0(1882043230);
                    if (function2 != null) {
                        waa.a(0, ((s75) e1dVar.getValue()).a, av8Var2, af0Var.f, function2);
                        unit = Unit.a;
                    }
                    av8Var2.s(false);
                    if (unit == null) {
                        fqj.n(0, av8Var2);
                    }
                    av8Var2.s(false);
                } else {
                    av8Var2.e0(-1786102688);
                    fqj.n(0, av8Var2);
                    av8Var2.s(false);
                }
                av8Var2.e0(1882053955);
                boolean g3 = av8Var2.g(af0Var);
                Object O4 = av8Var2.O();
                Object obj5 = O4;
                if (g3 || O4 == a99Var) {
                    w1 w1Var = new w1(af0Var, 6);
                    av8Var2.n0(w1Var);
                    obj5 = w1Var;
                }
                av8Var2.s(false);
                hz8.t((Function0) obj5, av8Var2);
            default:
                of3 of3Var2 = (of3) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    av8 av8Var3 = (av8) of3Var2;
                    if (av8Var3.D()) {
                        av8Var3.W();
                        break;
                    }
                }
                ff5 ff5Var = bh3.b;
                Context context2 = this.j;
                gb0 a = ff5Var.a(context2);
                ff5 ff5Var2 = bh3.d;
                af0 af0Var3 = this.k;
                gb0 a2 = ff5Var2.a(af0Var3.e);
                ff5 ff5Var3 = ch3.a;
                Bundle bundle = (Bundle) ((eoh) af0Var3.h).getValue();
                if (bundle == null) {
                    bundle = Bundle.EMPTY;
                }
                tol.c(new gb0[]{a, a2, ff5Var3.a(bundle), bh3.c.a(((eoh) af0Var3.g).getValue())}, yqo.y(1688971311, of3Var2, new ye0(af0Var3, context2)), of3Var2, 48);
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ye0(Context context, af0 af0Var) {
        super(2);
        this.j = context;
        this.k = af0Var;
    }
}
