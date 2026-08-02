package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ccf implements zff {
    public final /* synthetic */ int a;
    public final d4a b;

    public /* synthetic */ ccf(d4a d4aVar, int i) {
        this.a = i;
        this.b = d4aVar;
    }

    @Override // defpackage.yff
    public final Object get() {
        int i = this.a;
        d4a d4aVar = this.b;
        switch (i) {
            case 0:
                kr9 kr9Var = new kr9(d4aVar, 25);
                int i2 = ob8.a;
                lnb.u(3, "mode is null");
                cd8 c = new zb8(kr9Var, 0).c();
                c.f();
                return c;
            default:
                return (bcf) d4aVar.b;
        }
    }
}
