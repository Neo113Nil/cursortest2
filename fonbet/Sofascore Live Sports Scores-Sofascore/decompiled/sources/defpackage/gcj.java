package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class gcj implements b98 {
    public final /* synthetic */ int a;
    public final /* synthetic */ lcj b;

    public /* synthetic */ gcj(lcj lcjVar, int i) {
        this.a = i;
        this.b = lcjVar;
    }

    @Override // defpackage.b98
    public final Object emit(Object obj, rq3 rq3Var) {
        g9i g9iVar;
        int i = this.a;
        lcj lcjVar = this.b;
        switch (i) {
            case 0:
                lcjVar.w(false);
                lcjVar.x(gfj.a);
                break;
            default:
                if (((oqf) obj) == null) {
                    u8j u8jVar = lcjVar.e.a;
                    if (u8jVar != null && (g9iVar = u8jVar.u) != null) {
                        g9iVar.e(null);
                        u8jVar.u = null;
                    }
                    break;
                } else {
                    lcjVar.e.a();
                    Unit unit = Unit.a;
                    lu3 lu3Var = lu3.a;
                    break;
                }
                break;
        }
        return Unit.a;
    }
}
