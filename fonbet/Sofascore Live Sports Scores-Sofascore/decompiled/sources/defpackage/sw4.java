package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class sw4 implements b98 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kz3 b;

    public /* synthetic */ sw4(kz3 kz3Var, int i) {
        this.a = i;
        this.b = kz3Var;
    }

    @Override // defpackage.b98
    public final Object emit(Object obj, rq3 rq3Var) {
        int i = this.a;
        kz3 kz3Var = this.b;
        switch (i) {
            case 0:
                j52 j52Var = (j52) obj;
                if (j52Var == null) {
                    yhk.s("null cannot be cast to non-null type com.sofascore.common.broadcastUtil.BroadcastEvent.AccountDeleteSuccess");
                    break;
                } else {
                    kz3Var.invoke((f42) j52Var);
                    break;
                }
            default:
                j52 j52Var2 = (j52) obj;
                if (j52Var2 == null) {
                    yhk.s("null cannot be cast to non-null type com.sofascore.common.broadcastUtil.BroadcastEvent.AccountDeleteFail");
                    break;
                } else {
                    kz3Var.invoke((e42) j52Var2);
                    break;
                }
        }
        return null;
    }
}
