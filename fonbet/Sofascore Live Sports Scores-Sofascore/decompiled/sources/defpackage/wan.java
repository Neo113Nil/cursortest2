package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class wan implements lbn {
    public final lbn[] a;

    public wan(lbn... lbnVarArr) {
        this.a = lbnVarArr;
    }

    @Override // defpackage.lbn
    public final fcn a(Class cls) {
        for (int i = 0; i < 2; i++) {
            lbn lbnVar = this.a[i];
            if (lbnVar.b(cls)) {
                return lbnVar.a(cls);
            }
        }
        a70.m("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // defpackage.lbn
    public final boolean b(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (this.a[i].b(cls)) {
                return true;
            }
        }
        return false;
    }
}
