package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class wji extends xka implements Function2 {
    public final /* synthetic */ int i;
    public final /* synthetic */ xji j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wji(xji xjiVar, int i) {
        super(2);
        this.i = i;
        this.j = xjiVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.i;
        xji xjiVar = this.j;
        switch (i) {
            case 0:
                xjiVar.a().b = (mg3) obj2;
                break;
            case 1:
                kna a = xjiVar.a();
                ((wma) obj).d0(new gna(a, (Function2) obj2, a.p));
                break;
            default:
                wma wmaVar = (wma) obj;
                aki akiVar = xjiVar.a;
                kna knaVar = wmaVar.H;
                if (knaVar == null) {
                    knaVar = new kna(wmaVar, akiVar);
                    wmaVar.H = knaVar;
                }
                xjiVar.b = knaVar;
                xjiVar.a().i();
                kna a2 = xjiVar.a();
                if (a2.c != akiVar) {
                    a2.c = akiVar;
                    a2.j(false);
                    wma.V(a2.a, false, 7);
                }
                break;
        }
        return Unit.a;
    }
}
