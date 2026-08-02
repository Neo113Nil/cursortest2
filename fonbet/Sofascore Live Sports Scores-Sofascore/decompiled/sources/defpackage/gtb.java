package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class gtb implements zgc {
    public zgc[] a;

    @Override // defpackage.zgc
    public final lnf a(Class cls) {
        for (zgc zgcVar : this.a) {
            if (zgcVar.b(cls)) {
                return zgcVar.a(cls);
            }
        }
        a70.m("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // defpackage.zgc
    public final boolean b(Class cls) {
        for (zgc zgcVar : this.a) {
            if (zgcVar.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
