package defpackage;

import android.content.Context;
import android.widget.TextView;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.results.R;
import com.sofascore.results.event.details.view.odds.GambleRegulationFooterView;
import com.sofascore.results.event.matches.EventMatchesFragment;
import com.sofascore.results.event.matches.view.WinningOddsView;
import com.sofascore.results.view.typeheader.SegmentedButtonsView;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class n26 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ EventMatchesFragment b;

    public /* synthetic */ n26(EventMatchesFragment eventMatchesFragment, int i) {
        this.a = i;
        this.b = eventMatchesFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        EventMatchesFragment eventMatchesFragment = this.b;
        switch (i) {
            case 0:
                eventMatchesFragment.n();
                return Unit.a;
            case 1:
                Context requireContext = eventMatchesFragment.requireContext();
                requireContext.getClass();
                WinningOddsView winningOddsView = new WinningOddsView(requireContext, null, 6);
                o8.d(winningOddsView, 0, 7);
                return winningOddsView;
            case 2:
                EventMatchesFragment eventMatchesFragment2 = this.b;
                Context requireContext2 = eventMatchesFragment2.requireContext();
                requireContext2.getClass();
                t79 t79Var = new t79(requireContext2);
                Event F = eventMatchesFragment2.F();
                s26 s26Var = new s26(1, eventMatchesFragment2, EventMatchesFragment.class, "onTeamSelected", "onTeamSelected(Ljava/lang/String;)V", 0, 0);
                z3f z3fVar = t79Var.d;
                TextView textView = (TextView) z3fVar.d;
                Context context = t79Var.getContext();
                mqi mqiVar = bii.a;
                textView.setText(context.getString(CollectionsKt.R(wyh.x, F.getSportSlug()) ? R.string.past_tennis_matches : R.string.past_matches));
                SegmentedButtonsView segmentedButtonsView = (SegmentedButtonsView) z3fVar.c;
                Boolean bool = Boolean.FALSE;
                Pair pair = new Pair(bool, bool);
                hl7 hl7Var = new hl7(s26Var, 21);
                r1h r1hVar = new r1h("First", new tc3(-1213291523, new v21(2, F), true));
                String string = t79Var.getContext().getString(R.string.head_to_head_short);
                string.getClass();
                t1h[] t1hVarArr = {r1hVar, new s1h("H2H", string, true), new r1h("Second", new tc3(-2081218885, new v21(3, F), true))};
                rlh rlhVar = rlh.b;
                rlhVar.getClass();
                hfe d = rlhVar.d();
                o13.w(d, t1hVarArr);
                b7 d2 = d.d();
                segmentedButtonsView.k = hl7Var;
                segmentedButtonsView.g = false;
                segmentedButtonsView.h = pair;
                segmentedButtonsView.j = v1h.f;
                segmentedButtonsView.i = new z1h(0);
                segmentedButtonsView.setSelectedItem("H2H");
                if (d2 == null) {
                    d2 = rlh.b;
                }
                if (!d2.isEmpty()) {
                    SegmentedButtonsView.t(segmentedButtonsView, d2, null, 6);
                }
                return t79Var;
            case 3:
                Context requireContext3 = eventMatchesFragment.requireContext();
                requireContext3.getClass();
                GambleRegulationFooterView gambleRegulationFooterView = new GambleRegulationFooterView(requireContext3, null, 6);
                gambleRegulationFooterView.setVisibility(8);
                return gambleRegulationFooterView;
            case 4:
                Context requireContext4 = eventMatchesFragment.requireContext();
                requireContext4.getClass();
                return new ys2(requireContext4);
            case 5:
                Context requireContext5 = eventMatchesFragment.requireContext();
                requireContext5.getClass();
                return Boolean.valueOf(rld.s(requireContext5, vmd.EVENT_MATCHES, eventMatchesFragment.F(), true));
            case 6:
                Event F2 = eventMatchesFragment.F();
                Context requireContext6 = eventMatchesFragment.requireContext();
                requireContext6.getClass();
                return new hgi(requireContext6, F2);
            case 7:
                Event F3 = eventMatchesFragment.F();
                Context requireContext7 = eventMatchesFragment.requireContext();
                requireContext7.getClass();
                return new hgi(requireContext7, F3);
            case 8:
                Event F4 = eventMatchesFragment.F();
                Context requireContext8 = eventMatchesFragment.requireContext();
                requireContext8.getClass();
                return new q09(requireContext8, F4);
            case 9:
                Context requireContext9 = eventMatchesFragment.requireContext();
                requireContext9.getClass();
                return new rd5(requireContext9);
            default:
                Boolean bool2 = (Boolean) eventMatchesFragment.v.getValue();
                bool2.booleanValue();
                return bool2;
        }
    }
}
