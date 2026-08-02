package defpackage;

import com.sofascore.results.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class sfd implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Function0 d;

    public /* synthetic */ sfd(Function0 function0, boolean z, boolean z2) {
        this.b = z;
        this.d = function0;
        this.c = z2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Function0 function0 = this.d;
        switch (i) {
            case 0:
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(1 & intValue, (intValue & 3) != 2)) {
                    bt2 b = bt2.b(fkf.z(av8Var), lz.D(R.color.surface_1, av8Var), lz.D(R.color.primary_default, av8Var), lz.D(R.color.n_lv_4, av8Var), lz.D(R.color.primary_default, av8Var), lz.D(R.color.primary_default, av8Var), lz.D(R.color.n_lv_4, av8Var), lz.D(R.color.n_lv_4, av8Var), 2154);
                    boolean g = av8Var.g(function0);
                    Object O = av8Var.O();
                    if (g || O == nf3.a) {
                        O = new ma0(13, function0);
                        av8Var.n0(O);
                    }
                    l6g.d(this.b, (Function1) O, null, this.c, b, av8Var, 0, 36);
                } else {
                    av8Var.W();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                ehd.a(this.b, this.c, function0, (of3) obj, aba.K(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ sfd(boolean z, boolean z2, Function0 function0, int i) {
        this.b = z;
        this.c = z2;
        this.d = function0;
    }
}
