package defpackage;

import com.sofascore.model.profile.InvitedUser;
import com.sofascore.results.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class xaa implements et8 {
    public final /* synthetic */ List a;
    public final /* synthetic */ int b;
    public final /* synthetic */ e1d c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ Function1 e;

    public xaa(List list, int i, e1d e1dVar, Function0 function0, Function1 function1) {
        this.a = list;
        this.b = i;
        this.c = e1dVar;
        this.d = function0;
        this.e = function1;
    }

    @Override // defpackage.et8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        xpa xpaVar = (xpa) obj;
        int intValue = ((Number) obj2).intValue();
        of3 of3Var = (of3) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            i = (((av8) of3Var).g(xpaVar) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= ((av8) of3Var).e(intValue) ? 32 : 16;
        }
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(i & 1, (i & 147) != 146)) {
            InvitedUser invitedUser = (InvitedUser) this.a.get(intValue);
            av8Var.d0(1636030021);
            av8Var.d0(191325222);
            int i2 = this.b;
            a99 a99Var = nf3.a;
            xtc xtcVar = utc.a;
            if (intValue == i2) {
                Object O = av8Var.O();
                if (O == a99Var) {
                    O = new mv3(2, this.c);
                    av8Var.n0(O);
                }
                xtcVar = un0.A(xtcVar, (Function1) O);
            }
            av8Var.s(false);
            long D = lz.D(R.color.n_lv_4, av8Var);
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = mz1.e(av8Var);
            }
            wzc wzcVar = (wzc) O2;
            Object[] objArr = new Object[0];
            Object O3 = av8Var.O();
            if (O3 == a99Var) {
                O3 = o67.v;
                av8Var.n0(O3);
            }
            yaa.b(invitedUser, tol.y(xtcVar, true, false, true, D, wzcVar, new e32((boh) o3a.N(objArr, (Function0) O3, av8Var, 48), this.d, this.e, invitedUser, 3), av8Var, 0), av8Var, 0);
            av8Var.s(false);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }
}
