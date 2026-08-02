package defpackage;

import com.blaze.blazesdk.players.ui.n;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class grm implements Function2 {
    public final /* synthetic */ n a;

    public grm(n nVar) {
        this.a = nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        of3 of3Var = (of3) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            av8 av8Var = (av8) of3Var;
            if (av8Var.D()) {
                av8Var.W();
                return Unit.a;
            }
        }
        n nVar = this.a;
        List list = (List) rfo.x(((tkm) nVar.q.getValue()).f, of3Var, 0).getValue();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.d0(1822422127);
        boolean i = av8Var2.i(nVar);
        Object O = av8Var2.O();
        a99 a99Var = nf3.a;
        if (i || O == a99Var) {
            O = new ndk(nVar, 20);
            av8Var2.n0(O);
        }
        Function0 function0 = (Function0) O;
        av8Var2.s(false);
        av8Var2.d0(1822424095);
        boolean i2 = av8Var2.i(nVar);
        Object O2 = av8Var2.O();
        if (i2 || O2 == a99Var) {
            O2 = new iol(nVar, 12);
            av8Var2.n0(O2);
        }
        av8Var2.s(false);
        s7m.f(list, function0, (Function1) O2, av8Var2, 0);
        return Unit.a;
    }
}
