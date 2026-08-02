package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class qo1 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ lcj b;

    public /* synthetic */ qo1(lcj lcjVar, int i) {
        this.a = i;
        this.b = lcjVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        lcj lcjVar = this.b;
        switch (i) {
            case 0:
                break;
            case 1:
                gfj gfjVar = (gfj) ((eoh) lcjVar.s).getValue();
                gfj gfjVar2 = gfj.b;
                if (gfjVar == gfjVar2) {
                    gfjVar2 = gfj.a;
                }
                lcjVar.x(gfjVar2);
                break;
            default:
                lcjVar.b();
                break;
        }
        return Unit.a;
    }
}
