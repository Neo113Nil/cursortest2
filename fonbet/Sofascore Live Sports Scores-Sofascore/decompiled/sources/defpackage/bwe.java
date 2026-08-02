package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.n;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.newNetwork.PlayerPenaltyHistoryResponse;
import com.sofascore.model.newNetwork.statistics.season.player.AbstractPlayerSeasonStatistics;
import com.sofascore.model.newNetwork.statistics.season.player.FootballPlayerSeasonStatistics;
import com.sofascore.results.player.statistics.regular.PlayerSeasonStatisticsFragment;
import com.sofascore.results.player.statistics.regular.view.PlayerPenaltyShotView;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class bwe implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PlayerSeasonStatisticsFragment b;

    public /* synthetic */ bwe(PlayerSeasonStatisticsFragment playerSeasonStatisticsFragment, int i) {
        this.a = i;
        this.b = playerSeasonStatisticsFragment;
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x0331, code lost:
    
        if (defpackage.yid.m((r6 == null || (r0 = r6.a) == null) ? null : r0.getAppearances()) <= 0) goto L135;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0163  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        xre D;
        AbstractPlayerSeasonStatistics abstractPlayerSeasonStatistics;
        Integer appearances;
        View childAt;
        int i;
        View childAt2;
        int i2;
        xre D2;
        boolean z;
        AbstractPlayerSeasonStatistics abstractPlayerSeasonStatistics2;
        Integer appearances2;
        AbstractPlayerSeasonStatistics abstractPlayerSeasonStatistics3;
        AbstractPlayerSeasonStatistics abstractPlayerSeasonStatistics4;
        Integer appearances3;
        int i3 = this.a;
        boolean z2 = false;
        int i4 = 0;
        int i5 = 1;
        PlayerSeasonStatisticsFragment playerSeasonStatisticsFragment = this.b;
        switch (i3) {
            case 0:
                float floatValue = ((Float) obj).floatValue();
                krk krkVar = playerSeasonStatisticsFragment.l;
                krkVar.getClass();
                ((yq8) krkVar).b.setElevation(floatValue);
                break;
            case 1:
                if (((Boolean) obj).booleanValue()) {
                    ((gwe) playerSeasonStatisticsFragment.U.getValue()).setTargetPosition(playerSeasonStatisticsFragment.C().getItemCount() - 1);
                    krk krkVar2 = playerSeasonStatisticsFragment.l;
                    krkVar2.getClass();
                    playerSeasonStatisticsFragment.t(((yq8) krkVar2).c, new bwe(playerSeasonStatisticsFragment, 3));
                }
                break;
            case 2:
                fzg fzgVar = (fzg) obj;
                fzgVar.getClass();
                ((eoh) playerSeasonStatisticsFragment.O).setValue(fzgVar);
                owe oweVar = (owe) ((nwe) playerSeasonStatisticsFragment.r.getValue()).h.d();
                if (oweVar != null) {
                    wyg wygVar = oweVar.a;
                    if (wygVar != null) {
                        playerSeasonStatisticsFragment.C().G(wygVar, playerSeasonStatisticsFragment.G());
                    }
                    Map map = oweVar.g;
                    if (map != null && (D = playerSeasonStatisticsFragment.D()) != null) {
                        String H = playerSeasonStatisticsFragment.H();
                        if (playerSeasonStatisticsFragment.G() != fzg.f && (!Intrinsics.c(playerSeasonStatisticsFragment.H(), Sports.RUGBY) || playerSeasonStatisticsFragment.G() != fzg.d)) {
                            break;
                        }
                        z2 = true;
                        if (wygVar != null && (abstractPlayerSeasonStatistics = wygVar.a) != null && (appearances = abstractPlayerSeasonStatistics.getAppearances()) != null) {
                            Integer num = appearances.intValue() > 0 ? appearances : null;
                            if (num != null) {
                                i5 = num.intValue();
                            }
                        }
                        D.l(H, map, z2, i5);
                    }
                }
                break;
            case 3:
                ((View) obj).getClass();
                krk krkVar3 = playerSeasonStatisticsFragment.l;
                krkVar3.getClass();
                n layoutManager = ((yq8) krkVar3).c.getLayoutManager();
                layoutManager.getClass();
                ((LinearLayoutManager) layoutManager).startSmoothScroll((gwe) playerSeasonStatisticsFragment.U.getValue());
                break;
            case 4:
                e1d e1dVar = playerSeasonStatisticsFragment.L;
                UniqueTournament uniqueTournament = (UniqueTournament) obj;
                uniqueTournament.getClass();
                ((eoh) playerSeasonStatisticsFragment.M).setValue(uniqueTournament);
                Object obj2 = (List) playerSeasonStatisticsFragment.I.get(Integer.valueOf(uniqueTournament.getId()));
                if (obj2 == null) {
                    obj2 = km5.a;
                }
                ((eoh) e1dVar).setValue(obj2);
                ((eoh) playerSeasonStatisticsFragment.N).setValue((Season) CollectionsKt.firstOrNull((List) ((eoh) e1dVar).getValue()));
                playerSeasonStatisticsFragment.K();
                break;
            case 5:
                mqi mqiVar = playerSeasonStatisticsFragment.G;
                mqi mqiVar2 = playerSeasonStatisticsFragment.C;
                mqi mqiVar3 = playerSeasonStatisticsFragment.B;
                owe oweVar2 = (owe) obj;
                playerSeasonStatisticsFragment.n();
                oweVar2.getClass();
                Team team = oweVar2.e;
                wyg wygVar2 = oweVar2.a;
                ((eoh) playerSeasonStatisticsFragment.T).setValue(team != null ? Integer.valueOf(team.getId()) : null);
                ((eoh) playerSeasonStatisticsFragment.P).setValue(Boolean.valueOf(((wygVar2 == null || (abstractPlayerSeasonStatistics4 = wygVar2.a) == null || (appearances3 = abstractPlayerSeasonStatistics4.getAppearances()) == null) ? 0 : appearances3.intValue()) > 0));
                ((xve) mqiVar3.getValue()).setHeatMapData(oweVar2.b);
                ((hse) mqiVar2.getValue()).r(oweVar2.c, new cwe(playerSeasonStatisticsFragment, 8));
                dzg dzgVar = oweVar2.d;
                if (dzgVar != null) {
                    yve E = playerSeasonStatisticsFragment.E();
                    if (E != null) {
                        E.setShotMapData(dzgVar);
                    }
                    yve E2 = playerSeasonStatisticsFragment.E();
                    if (E2 != null) {
                        E2.setTopDividerVisibility(playerSeasonStatisticsFragment.I().getHeaderTypes().isEmpty());
                    }
                }
                PlayerPenaltyHistoryResponse playerPenaltyHistoryResponse = oweVar2.f;
                if (playerPenaltyHistoryResponse != null) {
                    ((tue) mqiVar.getValue()).setVisibility(0);
                    AbstractPlayerSeasonStatistics abstractPlayerSeasonStatistics5 = wygVar2 != null ? wygVar2.a : null;
                    abstractPlayerSeasonStatistics5.getClass();
                    FootballPlayerSeasonStatistics footballPlayerSeasonStatistics = (FootballPlayerSeasonStatistics) abstractPlayerSeasonStatistics5;
                    footballPlayerSeasonStatistics.setPenaltyGoals(null);
                    footballPlayerSeasonStatistics.setPenaltyConversion(null);
                    if (playerPenaltyHistoryResponse.getPenalties().isEmpty()) {
                        ((tue) mqiVar.getValue()).r();
                    } else {
                        tue tueVar = (tue) mqiVar.getValue();
                        tueVar.p(((Player) playerSeasonStatisticsFragment.v.getValue()).getId(), PlayerPenaltyHistoryResponse.copy$default(playerPenaltyHistoryResponse, null, CollectionsKt.B0(playerPenaltyHistoryResponse.getPenalties()), 0, 0, 13, null), ((PlayerPenaltyShotView) tueVar.j.m).getCurrentPerspective());
                    }
                }
                Map map2 = oweVar2.g;
                if (map2 != null && (D2 = playerSeasonStatisticsFragment.D()) != null) {
                    String H2 = playerSeasonStatisticsFragment.H();
                    if (playerSeasonStatisticsFragment.G() != fzg.f && (!Intrinsics.c(playerSeasonStatisticsFragment.H(), Sports.RUGBY) || playerSeasonStatisticsFragment.G() != fzg.d)) {
                        if (yid.m((wygVar2 == null || (abstractPlayerSeasonStatistics3 = wygVar2.a) == null) ? null : abstractPlayerSeasonStatistics3.getAppearances()) > 0) {
                            z = false;
                            if (wygVar2 != null && (abstractPlayerSeasonStatistics2 = wygVar2.a) != null && (appearances2 = abstractPlayerSeasonStatistics2.getAppearances()) != null) {
                                if (appearances2.intValue() <= 0) {
                                    appearances2 = null;
                                }
                                if (appearances2 != null) {
                                    i5 = appearances2.intValue();
                                }
                            }
                            D2.l(H2, map2, z, i5);
                        }
                    }
                    z = true;
                    if (wygVar2 != null) {
                        if (appearances2.intValue() <= 0) {
                        }
                        if (appearances2 != null) {
                        }
                    }
                    D2.l(H2, map2, z, i5);
                }
                playerSeasonStatisticsFragment.I().setFallbackToLabel(Boolean.valueOf(oweVar2.h));
                playerSeasonStatisticsFragment.C().G(wygVar2, playerSeasonStatisticsFragment.G());
                yve E3 = playerSeasonStatisticsFragment.E();
                if (E3 != null && (childAt2 = E3.getChildAt(0)) != null) {
                    ViewGroup.LayoutParams layoutParams = childAt2.getLayoutParams();
                    if (layoutParams == null) {
                        yhk.s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        break;
                    } else {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        if (playerSeasonStatisticsFragment.I().getVisibility() == 0) {
                            Context requireContext = playerSeasonStatisticsFragment.requireContext();
                            requireContext.getClass();
                            i2 = ao2.s(4, requireContext);
                        } else {
                            i2 = 0;
                        }
                        int marginStart = marginLayoutParams.getMarginStart();
                        int marginEnd = marginLayoutParams.getMarginEnd();
                        int i6 = marginLayoutParams.bottomMargin;
                        marginLayoutParams.setMarginStart(marginStart);
                        marginLayoutParams.topMargin = i2;
                        marginLayoutParams.setMarginEnd(marginEnd);
                        marginLayoutParams.bottomMargin = i6;
                        childAt2.setLayoutParams(marginLayoutParams);
                    }
                }
                xre D3 = playerSeasonStatisticsFragment.D();
                if (D3 != null && (childAt = D3.getChildAt(0)) != null) {
                    ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
                    if (layoutParams2 == null) {
                        yhk.s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        break;
                    } else {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                        if (playerSeasonStatisticsFragment.I().getVisibility() == 0) {
                            Context requireContext2 = playerSeasonStatisticsFragment.requireContext();
                            requireContext2.getClass();
                            i = ao2.s(4, requireContext2);
                        } else {
                            i = 0;
                        }
                        int marginStart2 = marginLayoutParams2.getMarginStart();
                        int marginEnd2 = marginLayoutParams2.getMarginEnd();
                        int i7 = marginLayoutParams2.bottomMargin;
                        marginLayoutParams2.setMarginStart(marginStart2);
                        marginLayoutParams2.topMargin = i;
                        marginLayoutParams2.setMarginEnd(marginEnd2);
                        marginLayoutParams2.bottomMargin = i7;
                        childAt.setLayoutParams(marginLayoutParams2);
                    }
                }
                View childAt3 = ((xve) mqiVar3.getValue()).getChildAt(0);
                if (childAt3 != null) {
                    ViewGroup.LayoutParams layoutParams3 = childAt3.getLayoutParams();
                    if (layoutParams3 == null) {
                        yhk.s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        break;
                    } else {
                        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                        if (((hse) mqiVar2.getValue()).getVisibility() == 0) {
                            Context requireContext3 = playerSeasonStatisticsFragment.requireContext();
                            requireContext3.getClass();
                            i4 = ao2.s(4, requireContext3);
                        }
                        int marginStart3 = marginLayoutParams3.getMarginStart();
                        int marginEnd3 = marginLayoutParams3.getMarginEnd();
                        int i8 = marginLayoutParams3.bottomMargin;
                        marginLayoutParams3.setMarginStart(marginStart3);
                        marginLayoutParams3.topMargin = i4;
                        marginLayoutParams3.setMarginEnd(marginEnd3);
                        marginLayoutParams3.bottomMargin = i8;
                        childAt3.setLayoutParams(marginLayoutParams3);
                    }
                }
                break;
            default:
                Season season = (Season) obj;
                season.getClass();
                ((eoh) playerSeasonStatisticsFragment.N).setValue(season);
                playerSeasonStatisticsFragment.K();
                break;
        }
        return Unit.a;
    }
}
