package defpackage;

import android.content.Context;
import com.sofascore.model.Sports;
import com.sofascore.model.TeamSelection;
import com.sofascore.results.event.boxscore.EventBoxScoreFragment;
import java.util.Calendar;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class mt5 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ EventBoxScoreFragment b;

    public /* synthetic */ mt5(EventBoxScoreFragment eventBoxScoreFragment, int i) {
        this.a = i;
        this.b = eventBoxScoreFragment;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        EventBoxScoreFragment eventBoxScoreFragment = this.b;
        switch (i) {
            case 0:
                m22 m22Var = (m22) obj;
                x12 x12Var = (x12) obj2;
                m22Var.getClass();
                x12Var.getClass();
                if (Intrinsics.c(ok3.s(eventBoxScoreFragment.E()), Sports.BASEBALL)) {
                    Calendar calendar = ke0.a;
                    Context requireContext = eventBoxScoreFragment.requireContext();
                    requireContext.getClass();
                    r9k a = x12Var.a();
                    Context requireContext2 = eventBoxScoreFragment.requireContext();
                    requireContext2.getClass();
                    ke0.g(requireContext, a.b(requireContext2), 0);
                } else {
                    kv5 G = eventBoxScoreFragment.G();
                    G.q.put(m22Var.a, x12Var);
                    G.u();
                }
                return Unit.a;
            default:
                String str = (String) obj;
                ((Integer) obj2).getClass();
                str.getClass();
                TeamSelection valueOf = TeamSelection.valueOf(str);
                TeamSelection teamSelection = eventBoxScoreFragment.G().l;
                rq3 rq3Var = null;
                if (teamSelection == null) {
                    Intrinsics.i("selectedTeam");
                    throw null;
                }
                if (valueOf != teamSelection) {
                    eventBoxScoreFragment.z = true;
                    kv5 G2 = eventBoxScoreFragment.G();
                    valueOf.getClass();
                    G2.l = valueOf;
                    xw3.L(un0.z(G2), null, null, new iv5(G2, rq3Var, 1), 3);
                }
                return Unit.a;
        }
    }
}
