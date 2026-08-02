package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class ayg implements Function1 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ e93 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ ayg(e93 e93Var, Function1 function1) {
        this.b = e93Var;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Function1 function1 = this.c;
        e93 e93Var = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                function1.invoke(new lxg(e93Var, str));
                return Unit.a;
            default:
                gyg gygVar = (gyg) obj;
                gygVar.getClass();
                tee teeVar = gygVar.d;
                i73 i73Var = (i73) teeVar.get(e93Var);
                return i73Var == null ? gygVar : gyg.a(gygVar, teeVar.put((Object) e93Var, function1.invoke(i73Var)), null, null, null, null, 247);
        }
    }

    public /* synthetic */ ayg(Function1 function1, e93 e93Var) {
        this.c = function1;
        this.b = e93Var;
    }
}
