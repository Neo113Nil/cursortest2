package defpackage;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class hah implements b98 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;
    public final /* synthetic */ qfg c;

    public /* synthetic */ hah(Fragment fragment, qfg qfgVar, int i) {
        this.a = i;
        this.b = fragment;
        this.c = qfgVar;
    }

    @Override // defpackage.b98
    public final Object emit(Object obj, rq3 rq3Var) {
        o42 o42Var;
        n42 n42Var;
        int i = this.a;
        Fragment fragment = this.b;
        qfg qfgVar = this.c;
        switch (i) {
            case 0:
                j52 j52Var = (j52) obj;
                if (!(j52Var instanceof i42)) {
                    if (j52Var == null) {
                        yhk.s("null cannot be cast to non-null type com.sofascore.common.broadcastUtil.BroadcastEvent.LogoutSuccess");
                        break;
                    } else {
                        o42Var = (o42) j52Var;
                    }
                } else {
                    if (Intrinsics.c(fragment.toString(), ((i42) j52Var).a)) {
                        o42Var = (o42) j52Var;
                    }
                    break;
                }
                qfgVar.invoke(o42Var);
            default:
                j52 j52Var2 = (j52) obj;
                if (!(j52Var2 instanceof i42)) {
                    if (j52Var2 == null) {
                        yhk.s("null cannot be cast to non-null type com.sofascore.common.broadcastUtil.BroadcastEvent.LogoutFail");
                        break;
                    } else {
                        n42Var = (n42) j52Var2;
                    }
                } else {
                    if (Intrinsics.c(fragment.toString(), ((i42) j52Var2).a)) {
                        n42Var = (n42) j52Var2;
                    }
                    break;
                }
                qfgVar.invoke(n42Var);
        }
        return null;
    }
}
