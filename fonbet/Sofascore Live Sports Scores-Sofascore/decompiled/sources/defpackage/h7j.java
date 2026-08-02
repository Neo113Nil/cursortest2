package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class h7j implements qyf, lb3 {
    @Override // defpackage.qyf
    public final void a(hcd hcdVar, lcd lcdVar, pyf pyfVar) {
        Unit unit;
        hcdVar.getClass();
        d7j d7jVar = lcdVar.e;
        if (d7jVar == null) {
            d7jVar = null;
        }
        if (d7jVar == null) {
            d7jVar = new d7j(lcdVar);
        }
        qyf qyfVar = (qyf) qyf.a.get(hcdVar.type());
        if (qyfVar != null) {
            qyfVar.a(hcdVar, lcdVar, new ag(1, d7jVar, pyfVar));
            unit = Unit.a;
        } else {
            unit = null;
        }
        if (unit == null) {
            ((pcd) pyfVar).onError(new qcd(4, "TestDemandRender couldn't render ad of type " + hcdVar.type(), null));
        }
    }

    @Override // defpackage.lb3
    public final void b() {
        qyf.a.put("test_demand", this);
    }
}
