package defpackage;

import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.u;
import com.sofascore.model.Sports;
import com.sofascore.model.crowdsourcing.CrowdsourcingIncidentType;
import com.sofascore.model.crowdsourcing.TeamSide;
import com.sofascore.model.mvvm.IRecent;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.TeamSides;
import com.sofascore.model.newNetwork.BaseballAtBatData;
import com.sofascore.model.newNetwork.commentary.Comment;
import com.sofascore.model.newNetwork.commentary.FootballPassingNetworkSegment;
import com.sofascore.results.R;
import com.sofascore.results.event.aiInsights.EventAiInsightsFragment;
import com.sofascore.results.event.boxscore.EventBoxScoreFragment;
import com.sofascore.results.event.commentary.CommentaryGoalModal;
import com.sofascore.results.event.commentary.EventCommentaryFragment;
import com.sofascore.results.event.commentary.baseball.BaseballCommentaryModal;
import com.sofascore.results.player.statistics.compare.search.CompareSearchModal;
import com.sofascore.results.team.trophy.TeamTrophyCompareActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class k43 extends ot8 implements Function1 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k43(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.b = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Boolean] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        svb svbVar;
        Object value5;
        svb svbVar2;
        Object value6;
        r6 = false;
        boolean z = false;
        int i = 1;
        int i2 = 3;
        switch (this.b) {
            case 0:
                Context context = (Context) obj;
                context.getClass();
                return ((qa5) this.receiver).e(context);
            case 1:
                Context context2 = (Context) obj;
                context2.getClass();
                return ((qa5) this.receiver).h(context2);
            case 2:
                Context context3 = (Context) obj;
                context3.getClass();
                qa5 qa5Var = (qa5) this.receiver;
                qa5Var.getClass();
                return qa5.f(qa5Var, context3, R.drawable.ic_num_basketball_incident_1, Integer.valueOf(R.color.n_lv_1), 4);
            case 3:
                Context context4 = (Context) obj;
                context4.getClass();
                qa5 qa5Var2 = (qa5) this.receiver;
                qa5Var2.getClass();
                return qa5.f(qa5Var2, context4, R.drawable.ic_num_basketball_incident_2, Integer.valueOf(R.color.n_lv_1), 4);
            case 4:
                Context context5 = (Context) obj;
                context5.getClass();
                qa5 qa5Var3 = (qa5) this.receiver;
                qa5Var3.getClass();
                return qa5.f(qa5Var3, context5, R.drawable.ic_num_basketball_incident_3, Integer.valueOf(R.color.n_lv_1), 4);
            case 5:
                int intValue = ((Number) obj).intValue();
                p63 p63Var = (p63) ((CompareSearchModal) this.receiver).B.getValue();
                xw3.L(un0.z(p63Var), null, null, new qu1(p63Var, intValue, r9, i2), 3);
                return Unit.a;
            case 6:
                IRecent iRecent = (IRecent) obj;
                iRecent.getClass();
                CompareSearchModal compareSearchModal = (CompareSearchModal) this.receiver;
                p63 p63Var2 = (p63) compareSearchModal.B.getValue();
                xw3.L(un0.z(p63Var2), null, null, new hy1(p63Var2, iRecent, r9, 14), 3);
                FragmentActivity activity = compareSearchModal.getActivity();
                TeamTrophyCompareActivity teamTrophyCompareActivity = activity instanceof TeamTrophyCompareActivity ? (TeamTrophyCompareActivity) activity : null;
                if (teamTrophyCompareActivity != null) {
                    int id = iRecent.getId();
                    Bundle arguments = compareSearchModal.getArguments();
                    ((l4j) teamTrophyCompareActivity.K.getValue()).w(new u3j(Intrinsics.c(arguments != null ? Boolean.valueOf(arguments.getBoolean("IS_FIRST")) : null, Boolean.TRUE), id));
                }
                compareSearchModal.j();
                return Unit.a;
            case 7:
                u uVar = (u) obj;
                uVar.getClass();
                ((eca) this.receiver).p(uVar);
                return Unit.a;
            case 8:
                TeamSide teamSide = (TeamSide) obj;
                teamSide.getClass();
                q54 q54Var = (q54) this.receiver;
                q54Var.getClass();
                fdi fdiVar = q54Var.n;
                if (((TeamSide) fdiVar.getValue()) != teamSide) {
                    q54Var.p.l(null);
                    q54Var.q.l(null);
                }
                fdiVar.m(null, teamSide);
                return Unit.a;
            case 9:
                a64 a64Var = (a64) obj;
                a64Var.getClass();
                q54 q54Var2 = (q54) this.receiver;
                q54Var2.getClass();
                xw3.L(un0.z(q54Var2), null, null, new u1(q54Var2, a64Var, r9, 13), 3);
                return Unit.a;
            case 10:
                CrowdsourcingIncidentType crowdsourcingIncidentType = (CrowdsourcingIncidentType) obj;
                crowdsourcingIncidentType.getClass();
                q54 q54Var3 = (q54) this.receiver;
                fdi fdiVar2 = q54Var3.p;
                fdi fdiVar3 = q54Var3.o;
                fdiVar3.getClass();
                fdiVar3.m(null, crowdsourcingIncidentType);
                Iterable iterable = (Iterable) q54Var3.s.getValue();
                ArrayList arrayList = new ArrayList(k13.r(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(((Player) it.next()).getId()));
                }
                kxe kxeVar = (kxe) fdiVar2.getValue();
                if (!CollectionsKt.R(arrayList, kxeVar != null ? Integer.valueOf(kxeVar.a) : null)) {
                    fdiVar2.l(null);
                }
                if (crowdsourcingIncidentType != CrowdsourcingIncidentType.Goal.REGULAR) {
                    q54Var3.q.l(null);
                }
                return Unit.a;
            case 11:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                fdi fdiVar4 = ((q54) this.receiver).r;
                do {
                    value = fdiVar4.getValue();
                } while (!fdiVar4.k(value, c0a.a((c0a) value, booleanValue, 0, null, null, 14)));
                return Unit.a;
            case 12:
                String str = (String) obj;
                str.getClass();
                q54 q54Var4 = (q54) this.receiver;
                q54Var4.getClass();
                List q = i5h.q(i5h.n(new Regex("\\d+").c(str), s34.b));
                String str2 = (String) CollectionsKt.a0(0, q);
                int parseInt = str2 != null ? Integer.parseInt(str2) : 0;
                String str3 = (String) CollectionsKt.a0(1, q);
                Integer valueOf = str3 != null ? Integer.valueOf(Integer.parseInt(str3)) : null;
                fdi fdiVar5 = q54Var4.r;
                do {
                    value2 = fdiVar5.getValue();
                } while (!fdiVar5.k(value2, c0a.a((c0a) value2, false, parseInt, valueOf, null, 9)));
                return Unit.a;
            case 13:
                a64 a64Var2 = (a64) obj;
                a64Var2.getClass();
                q54 q54Var5 = (q54) this.receiver;
                fdi fdiVar6 = q54Var5.p;
                int ordinal = a64Var2.ordinal();
                if (ordinal == 0) {
                    fdiVar6.l(null);
                } else if (ordinal == 1) {
                    q54Var5.q.l(null);
                } else {
                    if (ordinal != 2) {
                        zzl.b();
                        return null;
                    }
                    fdiVar6.l(null);
                    xw3.L(un0.z(q54Var5), null, null, new f54(q54Var5, null), 3);
                }
                return Unit.a;
            case 14:
                return (pl4) ((gef) this.receiver).a(obj);
            case 15:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                EventAiInsightsFragment eventAiInsightsFragment = (EventAiInsightsFragment) this.receiver;
                su suVar = eventAiInsightsFragment.i;
                suVar.b = booleanValue2 ? "locked" : "unlocked";
                suVar.c = eventAiInsightsFragment.D().getStatusType();
                return Unit.a;
            case 16:
                String str4 = (String) obj;
                str4.getClass();
                EventBoxScoreFragment eventBoxScoreFragment = (EventBoxScoreFragment) this.receiver;
                Context requireContext = eventBoxScoreFragment.requireContext();
                requireContext.getClass();
                un0.J(requireContext, ok3.s(eventBoxScoreFragment.E()), str4, false);
                return Unit.a;
            case 17:
                String str5 = (String) obj;
                str5.getClass();
                EventBoxScoreFragment eventBoxScoreFragment2 = (EventBoxScoreFragment) this.receiver;
                Context requireContext2 = eventBoxScoreFragment2.requireContext();
                requireContext2.getClass();
                un0.J(requireContext2, ok3.s(eventBoxScoreFragment2.E()), str5, false);
                return Unit.a;
            case 18:
                lt5 lt5Var = (lt5) obj;
                lt5Var.getClass();
                ov5 ov5Var = (ov5) this.receiver;
                ov5Var.getClass();
                fv5 fv5Var = (fv5) ((vnb) ov5Var.f.a.getValue()).a();
                if (fv5Var != null) {
                    if (lt5Var instanceof jt5) {
                        ov5Var.n(null, new fa(24, lt5Var, ov5Var, fv5Var));
                    } else if (lt5Var instanceof it5) {
                        ov5Var.n(null, new r82(26, fv5Var, lt5Var));
                    } else {
                        if (!lt5Var.equals(kt5.a)) {
                            zzl.b();
                            return null;
                        }
                        ynb.m(ov5Var, new r3(ov5Var, r9, 8));
                    }
                }
                return Unit.a;
            case 19:
                y33 y33Var = (y33) obj;
                y33Var.getClass();
                EventCommentaryFragment eventCommentaryFragment = (EventCommentaryFragment) this.receiver;
                eventCommentaryFragment.getClass();
                if (y33Var instanceof w33) {
                    boolean c = Intrinsics.c(ok3.s(eventCommentaryFragment.E()), Sports.BASEBALL);
                    Comment comment = ((w33) y33Var).a;
                    if (c) {
                        Integer atBatId = comment.getAtBatId();
                        if (atBatId != null) {
                            int intValue2 = atBatId.intValue();
                            TeamSides teamSides = TeamSides.ORIGINAL;
                            boolean c2 = Intrinsics.c(comment.getIsHome(teamSides), Boolean.TRUE);
                            Team homeTeam = c2 ? eventCommentaryFragment.E().getHomeTeam(teamSides) : eventCommentaryFragment.E().getAwayTeam(teamSides);
                            String nameCode = homeTeam.getNameCode();
                            if (nameCode == null) {
                                Context requireContext3 = eventCommentaryFragment.requireContext();
                                requireContext3.getClass();
                                nameCode = tba.A(requireContext3, homeTeam);
                                if (nameCode == null) {
                                    Context requireContext4 = eventCommentaryFragment.requireContext();
                                    requireContext4.getClass();
                                    nameCode = tba.p(requireContext4, homeTeam);
                                }
                            }
                            LinkedHashMap linkedHashMap = eventCommentaryFragment.F().j;
                            BaseballAtBatData baseballAtBatData = linkedHashMap != null ? (BaseballAtBatData) linkedHashMap.get(Integer.valueOf(intValue2)) : null;
                            FragmentActivity activity2 = eventCommentaryFragment.getActivity();
                            if (activity2 != null) {
                                int id2 = eventCommentaryFragment.E().getId();
                                int id3 = homeTeam.getId();
                                Float probability = baseballAtBatData != null ? baseballAtBatData.getProbability(c2) : null;
                                Float probabilityChange = baseballAtBatData != null ? baseballAtBatData.getProbabilityChange(c2) : null;
                                nameCode.getClass();
                                BaseballCommentaryModal baseballCommentaryModal = new BaseballCommentaryModal();
                                Bundle bundle = new Bundle();
                                bundle.putSerializable("BASEBALL_COMMENTARY_MODAL_DATA", comment);
                                bundle.putInt("BASEBALL_COMMENTARY_AT_TEAM_ID", id3);
                                bundle.putString("BASEBALL_COMMENTARY_AT_TEAM_DISPLAY_NAME", nameCode);
                                bundle.putInt("BASEBALL_COMMENTARY_AT_BAT_ID", intValue2);
                                bundle.putInt("BASEBALL_COMMENTARY_AT_EVENT_ID", id2);
                                if (probability != null) {
                                    bundle.putFloat("BASEBALL_COMMENTARY_AT_BAT_PROBABILITY", probability.floatValue());
                                }
                                if (probabilityChange != null) {
                                    bundle.putFloat("BASEBALL_COMMENTARY_AT_BAT_PROBABILITY_DIFF", probabilityChange.floatValue());
                                }
                                baseballCommentaryModal.setArguments(bundle);
                                AppCompatActivity appCompatActivity = activity2 instanceof AppCompatActivity ? (AppCompatActivity) activity2 : null;
                                if (appCompatActivity != null) {
                                    wca.x(appCompatActivity.getLifecycle()).b(new r1(baseballCommentaryModal, appCompatActivity, r9, i2));
                                }
                            }
                        }
                    } else {
                        Player player = comment.getPlayer();
                        if (player != null) {
                            Set set = m43.a;
                            String type = comment.getType();
                            String goalType = comment.getGoalType();
                            type.getClass();
                            if (type.equals(j43.f.a) && Intrinsics.c(goalType, l43.d.a)) {
                                z = true;
                            }
                            eventCommentaryFragment.H(player, z);
                        }
                    }
                } else if (y33Var instanceof v33) {
                    Comment comment2 = ((v33) y33Var).a;
                    List<FootballPassingNetworkSegment> footballPassingNetworkAction = comment2.getFootballPassingNetworkAction();
                    if (footballPassingNetworkAction != null) {
                        FragmentActivity requireActivity = eventCommentaryFragment.requireActivity();
                        requireActivity.getClass();
                        CommentaryGoalModal y = dy0.y(footballPassingNetworkAction, Event.getHomeTeam$default(eventCommentaryFragment.E(), null, 1, null).getId(), Event.getAwayTeam$default(eventCommentaryFragment.E(), null, 1, null).getId(), Intrinsics.c(Comment.getIsHome$default(comment2, null, 1, null), Boolean.TRUE), "CommentaryGoalDetailsModal", ok3.r(eventCommentaryFragment.E()));
                        AppCompatActivity appCompatActivity2 = requireActivity instanceof AppCompatActivity ? (AppCompatActivity) requireActivity : null;
                        if (appCompatActivity2 != null) {
                            wca.x(appCompatActivity2.getLifecycle()).b(new r1(y, appCompatActivity2, r9, i2));
                        }
                    }
                } else {
                    if (!(y33Var instanceof x33)) {
                        zzl.b();
                        return null;
                    }
                    x33 x33Var = (x33) y33Var;
                    ((pse) eventCommentaryFragment.v.getValue()).e(x33Var.a, x33Var.b, x33Var.c, null, new tv5(eventCommentaryFragment, i));
                }
                return Unit.a;
            case 20:
                int intValue3 = ((Number) obj).intValue();
                LinkedHashMap linkedHashMap2 = ((hw5) this.receiver).j;
                if (linkedHashMap2 != null) {
                    return (BaseballAtBatData) linkedHashMap2.get(Integer.valueOf(intValue3));
                }
                return null;
            case 21:
                long longValue = ((Number) obj).longValue();
                fdi fdiVar7 = ((tr3) this.receiver).m;
                do {
                    value3 = fdiVar7.getValue();
                } while (!fdiVar7.k(value3, value3 instanceof dci ? dci.a((dci) value3, null, longValue, 27) : value3));
                return Unit.a;
            case 22:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                fdi fdiVar8 = ((tr3) this.receiver).o;
                do {
                    value4 = fdiVar8.getValue();
                    svbVar = (svb) value4;
                } while (!fdiVar8.k(value4, svbVar != null ? svb.a(svbVar, bool, 0L, 62) : null));
                return Unit.a;
            case 23:
                TeamSide teamSide2 = (TeamSide) obj;
                teamSide2.getClass();
                tr3 tr3Var = (tr3) this.receiver;
                tr3Var.getClass();
                svb svbVar3 = (svb) tr3Var.o.getValue();
                if (svbVar3 != null) {
                    int i3 = zq3.a[teamSide2.ordinal()];
                    if (i3 == 1) {
                        tr3.n(svbVar3.b);
                    } else {
                        if (i3 != 2) {
                            zzl.b();
                            return null;
                        }
                        tr3.n(svbVar3.c);
                    }
                }
                return Unit.a;
            case 24:
                TeamSide teamSide3 = (TeamSide) obj;
                teamSide3.getClass();
                tr3 tr3Var2 = (tr3) this.receiver;
                tr3Var2.getClass();
                svb svbVar4 = (svb) tr3Var2.o.getValue();
                if (svbVar4 != null) {
                    int i4 = zq3.a[teamSide3.ordinal()];
                    if (i4 == 1) {
                        tr3.l(svbVar4.b);
                    } else {
                        if (i4 != 2) {
                            zzl.b();
                            return null;
                        }
                        tr3.l(svbVar4.c);
                    }
                }
                return Unit.a;
            case 25:
                long longValue2 = ((Number) obj).longValue();
                fdi fdiVar9 = ((tr3) this.receiver).o;
                do {
                    value5 = fdiVar9.getValue();
                    svbVar2 = (svb) value5;
                } while (!fdiVar9.k(value5, svbVar2 != null ? svb.a(svbVar2, null, longValue2, 47) : null));
                return Unit.a;
            case 26:
                TeamSide teamSide4 = (TeamSide) obj;
                teamSide4.getClass();
                tr3 tr3Var3 = (tr3) this.receiver;
                tr3Var3.getClass();
                h38 h38Var = (h38) tr3Var3.n.getValue();
                if (h38Var instanceof f38) {
                    int i5 = zq3.a[teamSide4.ordinal()];
                    if (i5 == 1) {
                        tr3.n(((f38) h38Var).d);
                    } else {
                        if (i5 != 2) {
                            zzl.b();
                            return null;
                        }
                        tr3.n(((f38) h38Var).e);
                    }
                }
                return Unit.a;
            case 27:
                TeamSide teamSide5 = (TeamSide) obj;
                teamSide5.getClass();
                tr3 tr3Var4 = (tr3) this.receiver;
                tr3Var4.getClass();
                h38 h38Var2 = (h38) tr3Var4.n.getValue();
                if (h38Var2 instanceof f38) {
                    int i6 = zq3.a[teamSide5.ordinal()];
                    if (i6 == 1) {
                        tr3.l(((f38) h38Var2).d);
                    } else {
                        if (i6 != 2) {
                            zzl.b();
                            return null;
                        }
                        tr3.l(((f38) h38Var2).e);
                    }
                }
                return Unit.a;
            case 28:
                Boolean bool2 = (Boolean) obj;
                boolean booleanValue3 = bool2.booleanValue();
                tr3 tr3Var5 = (tr3) this.receiver;
                fdi fdiVar10 = tr3Var5.m;
                do {
                    value6 = fdiVar10.getValue();
                } while (!fdiVar10.k(value6, value6 instanceof dci ? dci.a((dci) value6, bool2, 0L, 30) : value6));
                if (booleanValue3) {
                    xw3.L(un0.z(tr3Var5), null, null, new sr3(tr3Var5, null), 3);
                }
                return Unit.a;
            default:
                sw5 sw5Var = (sw5) obj;
                sw5Var.getClass();
                zw5 zw5Var = (zw5) this.receiver;
                zw5Var.getClass();
                if (sw5Var instanceof qw5) {
                    zw5Var.w(((qw5) sw5Var).a, null, null);
                } else {
                    if (!(sw5Var instanceof rw5)) {
                        zzl.b();
                        return null;
                    }
                    zw5Var.n(null, new xw5(r6, sw5Var, zw5Var));
                }
                return Unit.a;
        }
    }
}
