package defpackage;

import android.view.ViewGroup;
import com.sofascore.model.firebase.AdType;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class m11 implements b98 {
    public final /* synthetic */ int a;
    public final /* synthetic */ u11 b;

    public /* synthetic */ m11(u11 u11Var, int i) {
        this.a = i;
        this.b = u11Var;
    }

    @Override // defpackage.b98
    public final Object emit(Object obj, rq3 rq3Var) {
        int i = this.a;
        u11 u11Var = this.b;
        switch (i) {
            case 0:
                j52 j52Var = (j52) obj;
                if (j52Var == null) {
                    yhk.s("null cannot be cast to non-null type com.sofascore.common.broadcastUtil.BroadcastEvent.ModalShown");
                    break;
                } else {
                    u11Var.h();
                    break;
                }
            case 1:
                j52 j52Var2 = (j52) obj;
                if (j52Var2 == null) {
                    yhk.s("null cannot be cast to non-null type com.sofascore.common.broadcastUtil.BroadcastEvent.ModalDismissed");
                    break;
                } else {
                    ViewGroup f = u11Var.f();
                    if (f != null) {
                        u11Var.r(f);
                    }
                    break;
                }
            default:
                j52 j52Var3 = (j52) obj;
                if (j52Var3 == null) {
                    yhk.s("null cannot be cast to non-null type com.sofascore.common.broadcastUtil.BroadcastEvent.RefreshAds");
                    break;
                } else {
                    AdType.Banner banner = u11Var.t;
                    if (banner != null) {
                        u11Var.j(banner);
                    }
                    break;
                }
        }
        return null;
    }
}
