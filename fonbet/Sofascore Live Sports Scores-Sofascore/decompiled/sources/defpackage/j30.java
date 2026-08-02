package defpackage;

import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class j30 implements ct8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ j30(int i, Function0 function0, boolean z) {
        this.a = i;
        this.b = function0;
        this.c = z;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                xtc xtcVar = (xtc) obj;
                ((Integer) obj3).getClass();
                av8 av8Var = (av8) ((of3) obj2);
                av8Var.d0(-196777734);
                final long j = ((wej) av8Var.k(xej.a)).a;
                boolean f = av8Var.f(j);
                final Function0 function0 = this.b;
                boolean g = f | av8Var.g(function0);
                final boolean z = this.c;
                boolean h = g | av8Var.h(z);
                Object O = av8Var.O();
                if (h || O == nf3.a) {
                    O = new Function1() { // from class: k30
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            te2 te2Var = (te2) obj4;
                            return te2Var.b(new c30(function0, z, fcp.e0(te2Var, Float.intBitsToFloat((int) (te2Var.a.n() >> 32)) / 2.0f), new ay1(j, 5), 0));
                        }
                    };
                    av8Var.n0(O);
                }
                xtc Y = td4.Y(xtcVar, (Function1) O);
                av8Var.s(false);
                return Y;
            default:
                mnb mnbVar = (mnb) obj;
                of3 of3Var = (of3) obj2;
                int intValue = ((Integer) obj3).intValue();
                mnbVar.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((av8) of3Var).g(mnbVar) ? 4 : 2;
                }
                av8 av8Var2 = (av8) of3Var;
                if (av8Var2.T(intValue & 1, (intValue & 19) != 18)) {
                    t62.h(l98.d0(hkg.u0(hkg.J(), hkg.o0(av8Var2), false, 14), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), mnbVar.a.a(av8Var2), mnbVar.b.a(av8Var2), s6a.N(R.drawable.check_back_later, 6, av8Var2), this.b, this.c, 0L, av8Var2, 0, 64);
                } else {
                    av8Var2.W();
                }
                return Unit.a;
        }
    }
}
