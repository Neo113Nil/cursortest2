package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class bp1 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hej b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ bp1(hej hejVar, Function1 function1, int i) {
        this.a = i;
        this.b = hejVar;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Function1 function1 = this.c;
        hej hejVar = this.b;
        switch (i) {
            case 0:
                aej aejVar = (aej) obj;
                if (hejVar != null) {
                    ((eoh) hejVar.a).setValue(aejVar);
                }
                if (function1 != null) {
                    function1.invoke(aejVar);
                }
                return Unit.a;
            default:
                hejVar.c.add(function1);
                return new vx0(15, hejVar, function1);
        }
    }
}
