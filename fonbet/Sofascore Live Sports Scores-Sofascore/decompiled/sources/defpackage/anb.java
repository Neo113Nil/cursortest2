package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class anb extends dy9 {
    public sn5 d;

    @Override // defpackage.dy9
    public final int d(Object obj) {
        e1g e1gVar = (e1g) obj;
        if (e1gVar == null) {
            return 1;
        }
        return e1gVar.a();
    }

    @Override // defpackage.dy9
    public final void e(Object obj, Object obj2) {
        e1g e1gVar = (e1g) obj2;
        sn5 sn5Var = this.d;
        if (sn5Var == null || e1gVar == null) {
            return;
        }
        sn5Var.e.r(e1gVar, true);
    }
}
