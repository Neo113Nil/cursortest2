package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class lfl implements Function0 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ rxb c;

    public /* synthetic */ lfl(rxb rxbVar, Function1 function1) {
        this.c = rxbVar;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        rxb rxbVar = this.c;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                r2f r2fVar = rxbVar.g;
                o2f o2fVar = r2fVar instanceof o2f ? (o2f) r2fVar : null;
                if (o2fVar != null) {
                    function1.invoke(new dhl(rxbVar.a, o2fVar.g, o2fVar.f, o2fVar.e));
                }
                break;
            default:
                function1.invoke(new chl(rxbVar.a.getId()));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ lfl(Function1 function1, rxb rxbVar) {
        this.b = function1;
        this.c = rxbVar;
    }
}
