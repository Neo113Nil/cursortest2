package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class etb implements xgc {
    public xgc[] a;

    @Override // defpackage.xgc
    public final jnf a(Class cls) {
        for (xgc xgcVar : this.a) {
            if (xgcVar.b(cls)) {
                return xgcVar.a(cls);
            }
        }
        a70.m("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // defpackage.xgc
    public final boolean b(Class cls) {
        for (xgc xgcVar : this.a) {
            if (xgcVar.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
