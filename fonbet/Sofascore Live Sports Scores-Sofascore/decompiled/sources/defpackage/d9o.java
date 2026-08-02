package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class d9o implements mao {
    public final mao[] a;

    public d9o(mao... maoVarArr) {
        this.a = maoVarArr;
    }

    @Override // defpackage.mao
    public final bdo a(Class cls) {
        for (int i = 0; i < 2; i++) {
            mao maoVar = this.a[i];
            if (maoVar.b(cls)) {
                return maoVar.a(cls);
            }
        }
        a70.m("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // defpackage.mao
    public final boolean b(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (this.a[i].b(cls)) {
                return true;
            }
        }
        return false;
    }
}
