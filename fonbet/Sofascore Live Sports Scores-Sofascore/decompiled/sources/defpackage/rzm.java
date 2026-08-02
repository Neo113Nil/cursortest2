package defpackage;

import com.blaze.blazesdk.shared.results.BlazeResult;
import com.blaze.blazesdk.shared.results.g0;
import com.sofascore.model.TeamSelection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final /* synthetic */ class rzm implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ rzm(int i, Function1 function1) {
        this.a = i;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object error;
        int i = this.a;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                gfm gfmVar = (gfm) obj;
                n0n n0nVar = n0n.a;
                gfmVar.getClass();
                if (gfmVar instanceof ihm) {
                    error = new BlazeResult.Success(Unit.a);
                } else {
                    if (!(gfmVar instanceof g0)) {
                        zzl.b();
                        return null;
                    }
                    g0 g0Var = (g0) gfmVar;
                    error = new BlazeResult.Error(null, g0Var.b, g0Var.c, g0Var.d, null, null, 17, null);
                }
                function1.invoke(error);
                return Unit.a;
            default:
                TeamSelection teamSelection = (TeamSelection) obj;
                teamSelection.getClass();
                function1.invoke(new g46(teamSelection));
                return Unit.a;
        }
    }
}
