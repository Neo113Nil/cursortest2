package defpackage;

import androidx.compose.ui.platform.ComposeView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class z2 extends xka implements Function2 {
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z2(Object obj, int i) {
        super(2);
        this.i = i;
        this.j = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.i;
        utc utcVar = utc.a;
        boolean z = false;
        Object obj3 = this.j;
        switch (i) {
            case 0:
                of3 of3Var = (of3) obj;
                int intValue = ((Number) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    ((a3) obj3).a(0, av8Var);
                } else {
                    av8Var.W();
                }
                break;
            case 1:
                ((tz) obj3).o(((Number) obj).intValue(), (s3h) obj2);
                break;
            case 2:
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Number) obj2).intValue();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Object O = av8Var2.O();
                    if (O == nf3.a) {
                        O = ry.n;
                        av8Var2.n0(O);
                    }
                    oyn.c(o3h.a(utcVar, false, (Function1) O), (Function2) ((e1d) obj3).getValue(), av8Var2, 0);
                } else {
                    av8Var2.W();
                }
                break;
            case 3:
                po5 po5Var = (po5) obj;
                po5 po5Var2 = (po5) obj2;
                po5 po5Var3 = po5.c;
                if (po5Var == po5Var3 && po5Var2 == po5Var3 && !((of6) obj3).a.e) {
                    z = true;
                }
                break;
            case 4:
                ((Number) obj2).intValue();
                ((ComposeView) obj3).a(aba.K(1), (of3) obj);
                break;
            case 5:
                xtc xtcVar = (xtc) obj;
                xtc xtcVar2 = (vtc) obj2;
                of3 of3Var3 = (of3) obj3;
                if (xtcVar2 instanceof mf3) {
                    ct8 ct8Var = ((mf3) xtcVar2).i;
                    i5k.e(3, ct8Var);
                    xtcVar2 = fqj.B(of3Var3, (xtc) ct8Var.invoke(utcVar, of3Var3, 0));
                }
                break;
            case 6:
                ((Number) obj2).intValue();
                ((w15) obj3).a(aba.K(1), (of3) obj);
                break;
            case 7:
                of3 of3Var4 = (of3) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    av8 av8Var3 = (av8) of3Var4;
                    if (av8Var3.D()) {
                        av8Var3.W();
                        break;
                    }
                }
                ((ct8) obj3).invoke(new xra(), of3Var4, 0);
            case 8:
                ((Number) obj2).intValue();
                ((b2f) obj3).a(aba.K(1), (of3) obj);
                break;
            default:
                ((Number) obj2).intValue();
                aba.i((vy8) obj3, (of3) obj, 1);
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z2(Object obj, int i, int i2) {
        super(2);
        this.i = i2;
        this.j = obj;
    }
}
