package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class lec extends yzc {
    public uog l = new uog();

    @Override // defpackage.keb
    public void g() {
        Iterator it = this.l.iterator();
        while (true) {
            qog qogVar = (qog) it;
            if (!qogVar.hasNext()) {
                return;
            }
            kec kecVar = (kec) ((Map.Entry) qogVar.next()).getValue();
            kecVar.a.f(kecVar);
        }
    }

    @Override // defpackage.keb
    public void h() {
        Iterator it = this.l.iterator();
        while (true) {
            qog qogVar = (qog) it;
            if (!qogVar.hasNext()) {
                return;
            }
            kec kecVar = (kec) ((Map.Entry) qogVar.next()).getValue();
            kecVar.a.i(kecVar);
        }
    }

    public final void l(keb kebVar, skd skdVar) {
        kec kecVar = new kec(kebVar, skdVar);
        kec kecVar2 = (kec) this.l.a(kebVar, kecVar);
        if (kecVar2 != null && kecVar2.b != skdVar) {
            a70.p("This source was already added with the different observer");
        } else if (kecVar2 == null && this.c > 0) {
            kebVar.f(kecVar);
        }
    }
}
