package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class jze extends rf9 {
    @Override // defpackage.rf9
    public final void l1(kze kzeVar) {
        lze lzeVar = (lze) tgj.x(this, dh3.v);
        if (lzeVar != null) {
            ty tyVar = (ty) lzeVar;
            if (kzeVar == null) {
                kze.a.getClass();
                kzeVar = n9e.e;
            }
            jz.a.a(tyVar.b, kzeVar);
        }
    }

    @Override // defpackage.rf9
    public final boolean n1(int i) {
        return (i == 3 || i == 4) ? false : true;
    }

    @Override // defpackage.jyj
    public final Object s() {
        return "androidx.compose.ui.input.pointer.PointerHoverIcon";
    }
}
