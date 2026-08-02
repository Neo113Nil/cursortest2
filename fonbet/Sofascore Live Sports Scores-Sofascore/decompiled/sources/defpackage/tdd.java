package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class tdd extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ wdd j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tdd(wdd wddVar, int i) {
        super(0);
        this.i = i;
        this.j = wddVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        wdd wddVar = this.j;
        switch (i) {
            case 0:
                uj2 uj2Var = wddVar.H;
                uj2Var.getClass();
                wddVar.Y0(uj2Var, wddVar.G);
                break;
            default:
                wdd wddVar2 = wddVar.q;
                if (wddVar2 != null) {
                    wddVar2.l1();
                }
                break;
        }
        return Unit.a;
    }
}
