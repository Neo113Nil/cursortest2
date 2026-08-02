package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class x47 implements Function1 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ z47 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ x47(z47 z47Var, Function1 function1) {
        this.b = z47Var;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Function1 function1 = this.c;
        z47 z47Var = this.b;
        switch (i) {
            case 0:
                s77 s77Var = (s77) obj;
                s77Var.getClass();
                String str = s77Var.b;
                if (str == null) {
                    str = "";
                }
                function1.invoke(new s47(str, z47Var.b.a));
                break;
            default:
                esa esaVar = (esa) obj;
                esaVar.getClass();
                int i2 = 1;
                esaVar.f("round_status", "round_status", new tc3(-1552847693, new s16(z47Var, 12), true));
                t77 t77Var = z47Var.c;
                gv9 gv9Var = z47Var.d;
                if (t77Var == null && gv9Var.isEmpty()) {
                    esaVar.f("empty_state", "empty_state", hz8.b);
                }
                if (t77Var != null) {
                    esaVar.f("your_matchup_header", "section_header", hz8.c);
                    esaVar.f(ljg.j(t77Var.a, "your_matchup_"), "matchup_row", new tc3(-677471994, new d67(22, (Object) t77Var, (Object) z47Var, (Object) function1), true));
                }
                if (!gv9Var.isEmpty()) {
                    esaVar.f("league_matchups_header", "section_header", hz8.d);
                    esaVar.a(gv9Var.size(), new zi(28, new sc6(15), gv9Var), new xo(gv9Var, 8), new tc3(2039820996, new l46(gv9Var, z47Var, function1, i2), true));
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ x47(Function1 function1, z47 z47Var) {
        this.c = function1;
        this.b = z47Var;
    }
}
