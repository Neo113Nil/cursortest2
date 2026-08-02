package defpackage;

import kotlin.reflect.KProperty;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class gwk extends wtc implements oma, p3h {
    public final a4h o = new a4h("Visible");

    @Override // defpackage.p3h
    public final void i(b4h b4hVar) {
        Boolean bool = Boolean.FALSE;
        b4hVar.a(this.o, bool);
        KProperty[] kPropertyArr = y3h.a;
        a4h a4hVar = w3h.l;
        KProperty kProperty = y3h.a[4];
        b4hVar.a(a4hVar, bool);
    }

    @Override // defpackage.oma
    public final l1c k(m1c m1cVar, g1c g1cVar, long j) {
        qhe J = g1cVar.J(j);
        return m1c.G0(m1cVar, J.a, J.b, new wik(this, J));
    }
}
