package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class bfl implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gv9 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Function1 d;

    public /* synthetic */ bfl(gv9 gv9Var, boolean z, Function1 function1, int i) {
        this.a = i;
        this.b = gv9Var;
        this.c = z;
        this.d = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Function1 function1 = this.d;
        boolean z = this.c;
        gv9 gv9Var = this.b;
        esa esaVar = (esa) obj;
        switch (i) {
            case 0:
                esaVar.getClass();
                esaVar.a(gv9Var.size(), new wsd(20, new pcl(6), gv9Var), new dyg(gv9Var, 8), new tc3(802480018, new dfl(gv9Var, z, function1, 0), true));
                break;
            default:
                esaVar.getClass();
                esaVar.a(gv9Var.size(), new wsd(23, new pcl(15), gv9Var), new dyg(gv9Var, 10), new tc3(802480018, new dfl(gv9Var, z, function1, 1), true));
                break;
        }
        return Unit.a;
    }
}
