package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class zbj implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ esf b;
    public final /* synthetic */ esf c;
    public final /* synthetic */ lcj d;

    public /* synthetic */ zbj(esf esfVar, esf esfVar2, lcj lcjVar, int i) {
        this.a = i;
        this.b = esfVar;
        this.c = esfVar2;
        this.d = lcjVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        esf esfVar = this.c;
        lcj lcjVar = this.d;
        esf esfVar2 = this.b;
        switch (i) {
            case 0:
                lcj.h(esfVar2, esfVar, lcjVar);
                break;
            case 1:
                lcj.f(esfVar2, esfVar, lcjVar);
                break;
            case 2:
                lcj.f(esfVar2, esfVar, lcjVar);
                break;
            default:
                lcj.h(esfVar2, esfVar, lcjVar);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ zbj(esf esfVar, lcj lcjVar, esf esfVar2, int i) {
        this.a = i;
        this.b = esfVar;
        this.d = lcjVar;
        this.c = esfVar2;
    }
}
