package defpackage;

import android.app.Application;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class n90 implements zff {
    public final x6k a;
    public final zff b;
    public final cc4 c;
    public final cc4 d;

    public n90(x6k x6kVar, zff zffVar, cc4 cc4Var, cc4 cc4Var2) {
        this.a = x6kVar;
        this.b = zffVar;
        this.c = cc4Var;
        this.d = cc4Var2;
    }

    @Override // defpackage.yff
    public final Object get() {
        Application application = (Application) this.c.get();
        dgf dgfVar = (dgf) this.d.get();
        x6k x6kVar = this.a;
        return new m90(this.b, (r38) x6kVar.b, application, (igf) x6kVar.d, dgfVar);
    }
}
