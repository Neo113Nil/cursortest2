package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class nvd implements vff {
    public static final i3c c = new i3c(28);
    public static final kc3 d = new kc3(9);
    public yu4 a;
    public volatile vff b;

    public nvd(i3c i3cVar, vff vffVar) {
        this.a = i3cVar;
        this.b = vffVar;
    }

    public final void a(yu4 yu4Var) {
        vff vffVar;
        vff vffVar2;
        vff vffVar3 = this.b;
        kc3 kc3Var = d;
        if (vffVar3 != kc3Var) {
            yu4Var.b(vffVar3);
            return;
        }
        synchronized (this) {
            vffVar = this.b;
            if (vffVar != kc3Var) {
                vffVar2 = vffVar;
            } else {
                this.a = new ow9(5, this.a, yu4Var);
                vffVar2 = null;
            }
        }
        if (vffVar2 != null) {
            yu4Var.b(vffVar);
        }
    }

    @Override // defpackage.vff
    public final Object get() {
        return this.b.get();
    }
}
