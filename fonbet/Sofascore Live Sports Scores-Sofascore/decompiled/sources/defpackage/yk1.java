package defpackage;

import com.sofascore.results.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final /* synthetic */ class yk1 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ gv9 c;

    public /* synthetic */ yk1(int i, int i2, gv9 gv9Var) {
        this.b = i;
        this.c = gv9Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        gv9 gv9Var = this.c;
        int i2 = this.b;
        of3 of3Var = (of3) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.getClass();
                o02.C(i2, gv9Var, of3Var, aba.K(1));
                break;
            default:
                int intValue = num.intValue();
                av8 av8Var = (av8) of3Var;
                if (!av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    av8Var.W();
                } else if (i2 + 1 < 5 || gv9Var.size() <= 5) {
                    av8Var.d0(-1917926172);
                    av8Var.s(false);
                } else {
                    av8Var.d0(-1918232452);
                    kq9.b(s6a.N(R.drawable.ic_warning, 6, av8Var), null, bkh.l(utc.a, 16.0f), lz.D(R.color.value, av8Var), av8Var, 432, 0);
                    av8Var.s(false);
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ yk1(int i, gv9 gv9Var) {
        this.b = i;
        this.c = gv9Var;
    }
}
