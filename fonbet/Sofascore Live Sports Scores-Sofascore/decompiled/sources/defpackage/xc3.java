package defpackage;

import com.sofascore.results.R;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class xc3 implements et8 {
    public static final xc3 b = new xc3(0);
    public static final xc3 c = new xc3(1);
    public static final xc3 d = new xc3(2);
    public final /* synthetic */ int a;

    public /* synthetic */ xc3(int i) {
        this.a = i;
    }

    @Override // defpackage.et8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        switch (this.a) {
            case 0:
                ((Number) obj4).intValue();
                break;
            case 1:
                xtc xtcVar = (xtc) obj;
                long j = ((r13) obj2).a;
                of3 of3Var = (of3) obj3;
                int intValue = ((Number) obj4).intValue();
                xtcVar.getClass();
                if ((intValue & 6) == 0) {
                    i = (((av8) of3Var).g(xtcVar) ? 4 : 2) | intValue;
                } else {
                    i = intValue;
                }
                if ((intValue & 48) == 0) {
                    i |= ((av8) of3Var).f(j) ? 32 : 16;
                }
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(i & 1, (i & 147) != 146)) {
                    kq9.b(s6a.N(R.drawable.ic_matches, 6, av8Var), null, l98.b0(xtcVar, 1.0f), j, av8Var, ((i << 6) & 7168) | 48, 0);
                } else {
                    av8Var.W();
                }
                break;
            default:
                xtc xtcVar2 = (xtc) obj;
                long j2 = ((r13) obj2).a;
                of3 of3Var2 = (of3) obj3;
                int intValue2 = ((Number) obj4).intValue();
                xtcVar2.getClass();
                if ((intValue2 & 6) == 0) {
                    i2 = (((av8) of3Var2).g(xtcVar2) ? 4 : 2) | intValue2;
                } else {
                    i2 = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i2 |= ((av8) of3Var2).f(j2) ? 32 : 16;
                }
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(i2 & 1, (i2 & 147) != 146)) {
                    kq9.b(s6a.N(R.drawable.ic_list_view, 6, av8Var2), null, l98.b0(xtcVar2, 5.0f), j2, av8Var2, ((i2 << 6) & 7168) | 48, 0);
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }
}
