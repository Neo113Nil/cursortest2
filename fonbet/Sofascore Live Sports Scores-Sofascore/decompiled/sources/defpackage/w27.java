package defpackage;

import com.sofascore.model.newNetwork.Highlight;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class w27 implements Function0 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ gv9 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ w27(gv9 gv9Var, Function1 function1) {
        this.b = gv9Var;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Function1 function1 = this.c;
        gv9 gv9Var = this.b;
        switch (i) {
            case 0:
                function1.invoke(gv9Var);
                break;
            default:
                r5c r5cVar = (r5c) CollectionsKt.firstOrNull(gv9Var);
                if (r5cVar != null) {
                    Highlight highlight = r5cVar.a;
                    function1.invoke(new xhl(highlight.getId(), highlight.getTitle(), highlight.getUrl()));
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ w27(Function1 function1, gv9 gv9Var) {
        this.c = function1;
        this.b = gv9Var;
    }
}
