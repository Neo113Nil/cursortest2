package defpackage;

import android.content.Context;
import com.sofascore.results.fantasy.competition.leagues.bottomsheet.reorder.FantasyReorderLeaguesBottomSheet;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class wf7 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FantasyReorderLeaguesBottomSheet b;

    public /* synthetic */ wf7(FantasyReorderLeaguesBottomSheet fantasyReorderLeaguesBottomSheet, int i) {
        this.a = i;
        this.b = fantasyReorderLeaguesBottomSheet;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        FantasyReorderLeaguesBottomSheet fantasyReorderLeaguesBottomSheet = this.b;
        switch (i) {
            case 0:
                Context requireContext = fantasyReorderLeaguesBottomSheet.requireContext();
                requireContext.getClass();
                uf7 uf7Var = new uf7(requireContext);
                uf7Var.F(((is6) fantasyReorderLeaguesBottomSheet.B.getValue()).l().c);
                return uf7Var;
            default:
                fantasyReorderLeaguesBottomSheet.j();
                is6 is6Var = (is6) fantasyReorderLeaguesBottomSheet.B.getValue();
                ArrayList arrayList = ((uf7) fantasyReorderLeaguesBottomSheet.D.getValue()).i;
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    j67 j67Var = ((fo7) it.next()).a;
                    Integer valueOf = j67Var != null ? Integer.valueOf(j67Var.a) : null;
                    if (valueOf != null) {
                        arrayList2.add(valueOf);
                    }
                }
                n9e.u(is6Var.i(), new s80(arrayList2, 1));
                ((eoh) is6Var.g).setValue(gs6.a(is6Var.l(), l6g.W(rz8.S(is6Var.l().c, is6Var.i(), new yn6(28))), null, 0, 0, 59));
                return Unit.a;
        }
    }
}
