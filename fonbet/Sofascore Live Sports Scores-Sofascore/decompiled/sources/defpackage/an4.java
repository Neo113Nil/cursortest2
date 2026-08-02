package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final /* synthetic */ class an4 implements pdb {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ yqk b;

    public /* synthetic */ an4(pv pvVar, yqk yqkVar) {
        this.b = yqkVar;
    }

    @Override // defpackage.pdb
    public final void invoke(Object obj) {
        int i = this.a;
        yqk yqkVar = this.b;
        switch (i) {
            case 0:
                r6c r6cVar = (r6c) ((rv) obj);
                wj9 wj9Var = r6cVar.o;
                if (wj9Var != null) {
                    sm8 sm8Var = (sm8) wj9Var.c;
                    if (sm8Var.r == -1) {
                        pm8 a = sm8Var.a();
                        a.p = yqkVar.a;
                        a.q = yqkVar.b;
                        r6cVar.o = new wj9(new sm8(a), (String) wj9Var.b, false, 19);
                    }
                }
                int i2 = yqkVar.a;
                break;
            default:
                ((vke) obj).f(yqkVar);
                break;
        }
    }

    public /* synthetic */ an4(yqk yqkVar) {
        this.b = yqkVar;
    }
}
