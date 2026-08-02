package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ftb implements ygc {
    public ygc[] a;

    @Override // defpackage.ygc
    public final wgc a(Class cls) {
        for (ygc ygcVar : this.a) {
            if (ygcVar.b(cls)) {
                return ygcVar.a(cls);
            }
        }
        a70.m("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // defpackage.ygc
    public final boolean b(Class cls) {
        for (ygc ygcVar : this.a) {
            if (ygcVar.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
