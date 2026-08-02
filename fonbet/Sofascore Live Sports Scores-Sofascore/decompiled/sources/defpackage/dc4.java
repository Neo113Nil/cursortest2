package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class dc4 implements zff {
    public final /* synthetic */ int a;

    public /* synthetic */ dc4() {
        this.a = 3;
    }

    @Override // defpackage.yff
    public final Object get() {
        switch (this.a) {
            case 0:
                return new wu0();
            case 1:
                return new igf(3);
            case 2:
                return "firebaseinappmessaging.googleapis.com";
            case 3:
                return new dff(0);
            case 4:
                gsg gsgVar = rsg.a;
                i2a.v(gsgVar);
                return gsgVar;
            case 5:
                gsg gsgVar2 = rsg.b;
                i2a.v(gsgVar2);
                return gsgVar2;
            case 6:
                v69 v69Var = a30.a;
                if (v69Var != null) {
                    return v69Var;
                }
                yhk.s("scheduler == null");
                return null;
            default:
                return new igf(3);
        }
    }

    public /* synthetic */ dc4(Object obj, int i) {
        this.a = i;
    }
}
