package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ca0 implements b98 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ia0 b;

    public /* synthetic */ ca0(ia0 ia0Var, int i) {
        this.a = i;
        this.b = ia0Var;
    }

    @Override // defpackage.b98
    public final Object emit(Object obj, rq3 rq3Var) {
        int i = this.a;
        ia0 ia0Var = this.b;
        switch (i) {
            case 0:
                j52 j52Var = (j52) obj;
                if (j52Var == null) {
                    yhk.s("null cannot be cast to non-null type com.sofascore.common.broadcastUtil.BroadcastEvent.SyncSuccess");
                    break;
                } else {
                    ia0Var.j(jca.G(ia0Var.e()));
                    break;
                }
            default:
                j52 j52Var2 = (j52) obj;
                if (j52Var2 == null) {
                    yhk.s("null cannot be cast to non-null type com.sofascore.common.broadcastUtil.BroadcastEvent.LogoutSuccess");
                    break;
                } else {
                    ia0Var.j(jca.G(ia0Var.e()));
                    break;
                }
        }
        return null;
    }
}
