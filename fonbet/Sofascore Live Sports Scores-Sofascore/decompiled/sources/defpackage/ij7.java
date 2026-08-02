package defpackage;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class ij7 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gv9 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ ij7(gv9 gv9Var, Function1 function1, int i) {
        this.a = i;
        this.b = gv9Var;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object obj2;
        int i = this.a;
        Function1 function1 = this.c;
        gv9 gv9Var = this.b;
        switch (i) {
            case 0:
                fo1 fo1Var = (fo1) obj;
                fo1Var.getClass();
                Iterator<E> it = gv9Var.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (((mj7) obj2).a == fo1Var.a) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                mj7 mj7Var = (mj7) obj2;
                if (mj7Var != null) {
                    function1.invoke(mj7Var);
                }
                break;
            case 1:
                esa esaVar = (esa) obj;
                esaVar.getClass();
                esaVar.a(gv9Var.size(), new j87(22, new yo9(23), gv9Var), new xo(gv9Var, 14), new tc3(802480018, new vw5(gv9Var, function1, 3), true));
                break;
            case 2:
                esa esaVar2 = (esa) obj;
                esaVar2.getClass();
                esaVar2.a(gv9Var.size(), new j87(29, new a7d(25), gv9Var), new wsd(0, new a7d(29), gv9Var), new tc3(802480018, new vw5(gv9Var, function1, 4), true));
                break;
            default:
                esa esaVar3 = (esa) obj;
                esaVar3.getClass();
                esaVar3.a(gv9Var.size(), new wsd(24, new pcl(16), gv9Var), new dyg(gv9Var, 11), new tc3(802480018, new vw5(gv9Var, function1, 6), true));
                break;
        }
        return Unit.a;
    }
}
