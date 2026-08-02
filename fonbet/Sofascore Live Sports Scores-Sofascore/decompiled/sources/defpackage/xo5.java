package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class xo5 extends xka implements Function1 {
    public final /* synthetic */ int i;
    public final /* synthetic */ yo5 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xo5(yo5 yo5Var, int i) {
        super(1);
        this.i = i;
        this.j = yo5Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.i;
        yo5 yo5Var = this.j;
        switch (i) {
            case 0:
                twj twjVar = (twj) obj;
                po5 po5Var = po5.a;
                po5 po5Var2 = po5.b;
                Object obj2 = null;
                if (twjVar.c(po5Var, po5Var2)) {
                    in2 in2Var = yo5Var.t.a.c;
                    if (in2Var != null) {
                        obj2 = in2Var.c;
                    }
                } else if (twjVar.c(po5Var2, po5.c)) {
                    in2 in2Var2 = yo5Var.u.a.c;
                    if (in2Var2 != null) {
                        obj2 = in2Var2.c;
                    }
                } else {
                    obj2 = uo5.d;
                }
                return obj2 == null ? uo5.d : obj2;
            default:
                twj twjVar2 = (twj) obj;
                po5 po5Var3 = po5.a;
                po5 po5Var4 = po5.b;
                if (twjVar2.c(po5Var3, po5Var4)) {
                    alh alhVar = yo5Var.t.a.b;
                    return alhVar != null ? alhVar.b : uo5.c;
                }
                if (!twjVar2.c(po5Var4, po5.c)) {
                    return uo5.c;
                }
                alh alhVar2 = yo5Var.u.a.b;
                return alhVar2 != null ? alhVar2.b : uo5.c;
        }
    }
}
