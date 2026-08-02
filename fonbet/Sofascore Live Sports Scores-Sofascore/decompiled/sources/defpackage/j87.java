package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.sofascore.model.Sports;
import com.sofascore.model.cuptree.CupTree;
import com.sofascore.model.cuptree.CupTreeRound;
import com.sofascore.model.cuptree.CupTreesResponse;
import com.sofascore.results.R;
import com.sofascore.results.featuredtournament.FeaturedTournamentFragment;
import com.sofascore.results.view.CupTreeView;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class j87 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j87(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CupTreeRound cupTreeRound;
        List<CupTree> cupTrees;
        long j;
        switch (this.a) {
            case 0:
                return ((e87) this.c).invoke(((gv9) this.b).get(((Number) obj).intValue()));
            case 1:
                ((e87) this.c).invoke(((gv9) this.b).get(((Number) obj).intValue()));
                return "article";
            case 2:
                return ((x16) this.c).invoke(((gv9) this.b).get(((Number) obj).intValue()));
            case 3:
                ((e87) this.c).invoke(((gv9) this.b).get(((Number) obj).intValue()));
                return "competition_tile";
            case 4:
                return ((ee7) this.c).invoke(((ArrayList) this.b).get(((Number) obj).intValue()));
            case 5:
                return ((e87) this.c).invoke(((ArrayList) this.b).get(((Number) obj).intValue()));
            case 6:
                return ((ee7) this.c).invoke(((ArrayList) this.b).get(((Number) obj).intValue()));
            case 7:
                return ((e87) this.c).invoke(((ArrayList) this.b).get(((Number) obj).intValue()));
            case 8:
                return ((e87) this.c).invoke(((List) this.b).get(((Number) obj).intValue()));
            case 9:
                ((e87) this.c).invoke(((List) this.b).get(((Number) obj).intValue()));
                return "player_item";
            case 10:
                return ((e87) this.c).invoke(((List) this.b).get(((Number) obj).intValue()));
            case 11:
                ((e87) this.c).invoke(((List) this.b).get(((Number) obj).intValue()));
                return "player_item";
            case 12:
                ((Number) obj).intValue();
                ho7 ho7Var = (ho7) this.c;
                if (ho7Var != null) {
                    ((Function1) this.b).invoke(ho7Var);
                }
                return Unit.a;
            case 13:
                return ((e87) this.c).invoke(((List) this.b).get(((Number) obj).intValue()));
            case 14:
                ((e87) this.c).invoke(((List) this.b).get(((Number) obj).intValue()));
                return "rail_item";
            case 15:
                return ((gl7) this.c).invoke(((List) this.b).get(((Number) obj).intValue()));
            case 16:
                int intValue = ((Number) obj).intValue();
                return ((sc6) this.c).invoke(Integer.valueOf(intValue), ((List) this.b).get(intValue));
            case 17:
                int intValue2 = ((Number) obj).intValue();
                return ((sc6) this.c).invoke(Integer.valueOf(intValue2), ((List) this.b).get(intValue2));
            case 18:
                FeaturedTournamentFragment featuredTournamentFragment = (FeaturedTournamentFragment) this.b;
                ((View) obj).getClass();
                CupTreesResponse cupTreesResponse = (CupTreesResponse) this.c;
                CupTree cupTree = (cupTreesResponse == null || (cupTrees = cupTreesResponse.getCupTrees()) == null) ? null : (CupTree) CollectionsKt.firstOrNull(cupTrees);
                if (cupTree != null) {
                    featuredTournamentFragment.E().setVisibility(0);
                    CupTreeView E = featuredTournamentFragment.E();
                    featuredTournamentFragment.G().i.getClass();
                    q8g q8gVar = q8g.FLAT;
                    int i = CupTreeView.q;
                    E.getClass();
                    E.l = true;
                    E.m = 270;
                    E.n = 0;
                    E.o = false;
                    E.rowStyle = q8gVar;
                    E.p = false;
                    sea.v(E, true, true, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                    Regex regex = d7g.a;
                    Context requireContext = featuredTournamentFragment.requireContext();
                    requireContext.getClass();
                    List<CupTreeRound> rounds = cupTree.getRounds();
                    String c = d7g.c(requireContext, (rounds == null || (cupTreeRound = (CupTreeRound) CollectionsKt.a0(cupTree.getCurrentRound() - 1, rounds)) == null) ? null : cupTreeRound.getDescription(), Sports.FOOTBALL);
                    z82 z82Var = E.d;
                    TextView textView = (TextView) z82Var.g;
                    TextView textView2 = (TextView) z82Var.d;
                    textView.setVisibility(0);
                    textView.setBackground(null);
                    textView.setText(E.getContext().getString(R.string.competition_type_knockout));
                    textView2.setVisibility(0);
                    textView2.setText(c);
                    textView2.setTextColor(E.getContext().getColor(R.color.n_lv_3));
                    E.setCupTrees(a.c(cupTree));
                }
                return Unit.a;
            case 19:
                return ((gl7) this.c).invoke(((List) this.b).get(((Number) obj).intValue()));
            case 20:
                rnh rnhVar = (rnh) obj;
                synchronized (snh.c) {
                    j = snh.e;
                    snh.e = 1 + j;
                }
                return new c1d(j, rnhVar, (Function1) this.c, (Function1) this.b);
            case 21:
                en0 en0Var = (en0) this.c;
                Object obj2 = en0Var.c;
                lj2 lj2Var = (lj2) this.b;
                synchronized (obj2) {
                    ((ArrayList) en0Var.d).remove(lj2Var);
                }
                return Unit.a;
            case 22:
                return ((yo9) this.c).invoke(((List) this.b).get(((Number) obj).intValue()));
            case 23:
                int intValue3 = ((Number) obj).intValue();
                return ((mpa) this.c).invoke(Integer.valueOf(intValue3), ((List) this.b).get(intValue3));
            case 24:
                return ((isa) this.c).invoke(((List) this.b).get(((Number) obj).intValue()));
            case 25:
                int intValue4 = ((Number) obj).intValue();
                return ((mpa) this.c).invoke(Integer.valueOf(intValue4), ((List) this.b).get(intValue4));
            case 26:
                String str = (String) obj;
                str.getClass();
                ((Function2) this.c).invoke(((u28) this.b).a, str);
                return Unit.a;
            case 27:
                int intValue5 = ((Number) obj).intValue();
                return ((mpa) this.c).invoke(Integer.valueOf(intValue5), ((List) this.b).get(intValue5));
            case 28:
                int intValue6 = ((Number) obj).intValue();
                return ((mpa) this.c).invoke(Integer.valueOf(intValue6), ((List) this.b).get(intValue6));
            default:
                return ((a7d) this.c).invoke(((List) this.b).get(((Number) obj).intValue()));
        }
    }
}
