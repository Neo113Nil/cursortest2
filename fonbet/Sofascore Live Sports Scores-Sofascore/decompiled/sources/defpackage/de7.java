package defpackage;

import com.sofascore.model.profile.InvitedUser;
import com.sofascore.results.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class de7 implements ct8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ de7(int i, int i2, Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = i2;
        this.c = obj;
        this.b = i;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        Object obj4 = this.f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        Object obj7 = this.c;
        switch (i) {
            case 0:
                wn1 wn1Var = (wn1) obj7;
                gv9 gv9Var = (gv9) obj6;
                ad7 ad7Var = (ad7) obj5;
                cz6 cz6Var = (cz6) obj4;
                xpa xpaVar = (xpa) obj;
                of3 of3Var = (of3) obj2;
                int intValue = ((Integer) obj3).intValue();
                xpaVar.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((av8) of3Var).g(xpaVar) ? 4 : 2;
                }
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 19) != 18)) {
                    rz8.l(wn1Var, this.b, !(gv9Var == null || gv9Var.isEmpty()), ad7Var, cz6Var.g.A, xpa.a(xpaVar, l98.c0(n9e.q(utc.a, lz.D(R.color.surface_P, av8Var), oyn.e), 16.0f, 8.0f), 7), 0L, 0L, 0L, 0L, false, av8Var, 0, 0, 1984);
                } else {
                    av8Var.W();
                }
                break;
            default:
                InvitedUser invitedUser = (InvitedUser) obj7;
                ku3 ku3Var = (ku3) obj6;
                dfh dfhVar = (dfh) obj5;
                Function0 function0 = (Function0) obj4;
                of3 of3Var2 = (of3) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((v23) obj).getClass();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(1 & intValue2, (intValue2 & 17) != 16)) {
                    boolean i2 = av8Var2.i(ku3Var) | av8Var2.g(dfhVar) | av8Var2.g(function0);
                    Object O = av8Var2.O();
                    if (i2 || O == nf3.a) {
                        O = new t87(ku3Var, dfhVar, function0, 3);
                        av8Var2.n0(O);
                    }
                    waa.d(invitedUser, this.b, (Function0) O, av8Var2, 0);
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }
}
