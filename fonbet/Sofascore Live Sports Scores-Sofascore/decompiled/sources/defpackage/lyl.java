package defpackage;

import defpackage.c1m;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class lyl implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c1m b;

    public /* synthetic */ lyl(c1m c1mVar, int i) {
        this.a = i;
        this.b = c1mVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        c1m c1mVar = this.b;
        switch (i) {
            case 0:
                fdm fdmVar = c1mVar.o;
                Pair pair = new Pair(Long.valueOf(c1mVar.E()), Long.valueOf(c1mVar.E()));
                if (fdmVar.a.b(pair)) {
                    fdmVar.b = pair;
                }
                c1mVar.K.l(ywl.h);
                break;
            case 1:
                wom womVar = c1mVar.g0;
                if (womVar == null || (r5 = womVar.d()) == null) {
                    break;
                }
                break;
            case 2:
                c1mVar.P();
                break;
            case 3:
                c1mVar.O();
                break;
            default:
                if (!c1mVar.e0) {
                    c1mVar.N();
                    c1mVar.e0 = true;
                }
                c1mVar.m.b(new c1m.a(true, false));
                break;
        }
        return Unit.a;
    }
}
