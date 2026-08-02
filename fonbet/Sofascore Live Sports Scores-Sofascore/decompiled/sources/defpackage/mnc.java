package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.blaze.blazesdk.features.moments.players.ui.MomentsPlayerActivity;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.mvvm.model.PlayerTeamInfo;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.TeamRankings;
import com.sofascore.model.mvvm.model.Tournament;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.model.odds.OddsCountryProvider;
import com.sofascore.results.R;
import com.sofascore.results.mma.fighter.MmaFighterActivity;
import com.sofascore.results.mma.fighter.details.MmaFighterDetailsFragment;
import com.sofascore.results.mma.fighter.details.MmaFighterRankingsModal;
import com.sofascore.results.mma.fighter.statistics.MmaFighterStatisticsFragment;
import com.sofascore.results.mma.organisation.MmaOrganisationActivity;
import com.sofascore.results.mvvm.base.AbstractActivity;
import com.sofascore.results.notifications.ui.MuteNotificationsBottomSheet;
import com.sofascore.results.pots.highestRated.POTSHighestRatedPlayersFragment;
import com.sofascore.results.pots.highestRated.bottomSheet.POTSHighestRatedPlayersFilterBottomSheet;
import com.sofascore.results.pots.topLeagues.POTSTopLeaguesFragment;
import com.sofascore.results.pots.topLeagues.bottomSheet.POTSLeagueTopPlayersBottomSheet;
import com.sofascore.results.redesign.dividers.SofaDivider;
import com.unity3d.services.UnityAdsConstants;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class mnc implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mnc(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:245:0x058b, code lost:
    
        r3.remove(r10);
        r10.setStatisticData(r8);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0270 A[LOOP:1: B:112:0x026a->B:114:0x0270, LOOP_END] */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v64, types: [android.content.SharedPreferences$Editor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [rq3] */
    /* JADX WARN: Type inference failed for: r7v36, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v37, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v39 */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Object obj2;
        String nickname;
        UniqueTournament uniqueTournament;
        String weightClass;
        Gender gender;
        Object obj3;
        int i;
        r6 r6Var;
        boolean z;
        Iterator it;
        int i2 = this.a;
        int i3 = 16;
        int i4 = 3;
        ?? r7 = 0;
        r7 = 0;
        Object obj4 = this.b;
        switch (i2) {
            case 0:
                MmaFighterActivity mmaFighterActivity = (MmaFighterActivity) obj4;
                aoc aocVar = (aoc) obj;
                int i5 = MmaFighterActivity.U;
                aocVar.getClass();
                Team team = aocVar.a;
                mqi mqiVar = mmaFighterActivity.O;
                voc vocVar = (voc) mqiVar.getValue();
                vocVar.getClass();
                team.getClass();
                vocVar.r = team;
                mmaFighterActivity.x.a = Integer.valueOf(team.getId());
                mmaFighterActivity.Q().l.setRefreshing(false);
                int id = team.getId();
                Intent intent = mmaFighterActivity.getIntent();
                intent.getClass();
                nv.h0(mmaFighterActivity, id, intent);
                if (mmaFighterActivity.T) {
                    obj2 = null;
                } else {
                    mmaFighterActivity.T = true;
                    new nnc(mmaFighterActivity, i4);
                    mmaFighterActivity.Q().l.setEnabled(false);
                    AbstractActivity.P(mmaFighterActivity.Q().h, 0, 4);
                    PlayerTeamInfo playerTeamInfo = team.getPlayerTeamInfo();
                    mmaFighterActivity.S(team, team.getName(), null, (playerTeamInfo == null || (nickname = playerTeamInfo.getNickname()) == null) ? null : lnb.o("\"", nickname, "\""), false);
                    as9.d(mmaFighterActivity.R(), ((Number) mmaFighterActivity.M.getValue()).intValue(), team.getGender(), false);
                    obj2 = null;
                    mmaFighterActivity.W(null, team.getCountry(), false);
                    mmaFighterActivity.I(mmaFighterActivity.Q().b, sub.d(new Pair(SearchResponseKt.SPORT_ENTITY, Sports.MMA)));
                    mmaFighterActivity.Z(team);
                    mmaFighterActivity.Q().d.a(new xq5(mmaFighterActivity, i4));
                }
                kp5 kp5Var = uoc.e;
                ArrayList arrayList = new ArrayList();
                for (Object obj5 : kp5Var) {
                    if (((Boolean) ((uoc) obj5).b.invoke(aocVar)).booleanValue()) {
                        arrayList.add(obj5);
                    }
                }
                ((voc) mqiVar.getValue()).x(arrayList);
                Object invoke = uoc.c.b.invoke(aocVar);
                if (((Boolean) (((Boolean) invoke).booleanValue() ? invoke : obj2)) != null) {
                    mmaFighterActivity.Q().k.c(1, false);
                }
                return Unit.a;
            case 1:
                MmaFighterDetailsFragment mmaFighterDetailsFragment = (MmaFighterDetailsFragment) obj4;
                if (((Boolean) obj).booleanValue()) {
                    PlayerTeamInfo playerTeamInfo2 = mmaFighterDetailsFragment.C().getPlayerTeamInfo();
                    Tournament tournament = mmaFighterDetailsFragment.C().getTournament();
                    if (tournament != null && (uniqueTournament = tournament.getUniqueTournament()) != null && playerTeamInfo2 != null && (weightClass = playerTeamInfo2.getWeightClass()) != null && (gender = mmaFighterDetailsFragment.C().getGender()) != null) {
                        Context requireContext = mmaFighterDetailsFragment.requireContext();
                        requireContext.getClass();
                        String q = tnf.q(requireContext, weightClass);
                        Context requireContext2 = mmaFighterDetailsFragment.requireContext();
                        requireContext2.getClass();
                        String q2 = tnf.q(requireContext2, weightClass);
                        Drawable drawable = mmaFighterDetailsFragment.requireContext().getDrawable(R.drawable.ic_external_link_16);
                        mmaFighterDetailsFragment.D().b.removeAllViews();
                        LinearLayout linearLayout = mmaFighterDetailsFragment.D().b;
                        Context requireContext3 = mmaFighterDetailsFragment.requireContext();
                        requireContext3.getClass();
                        vm6 vm6Var = new vm6(requireContext3);
                        String string = vm6Var.getResources().getString(R.string.current_division);
                        string.getClass();
                        vm6Var.j(string, null, true);
                        vm6Var.l(new wm6(q, drawable, null, null, new l31(mmaFighterDetailsFragment, uniqueTournament, weightClass, gender, q2, 7), 26));
                        linearLayout.addView(vm6Var);
                        List<TeamRankings> teamRankings = mmaFighterDetailsFragment.C().getTeamRankings();
                        if (teamRankings != null) {
                            Iterator it2 = teamRankings.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    obj3 = it2.next();
                                    TeamRankings teamRankings2 = (TeamRankings) obj3;
                                    if (teamRankings2.getGender() == gender && Intrinsics.c(teamRankings2.getWeightClass(), weightClass)) {
                                        Integer uniqueTournamentId = teamRankings2.getUniqueTournamentId();
                                        int id2 = uniqueTournament.getId();
                                        if (uniqueTournamentId != null && uniqueTournamentId.intValue() == id2) {
                                        }
                                    }
                                } else {
                                    obj3 = null;
                                }
                            }
                            TeamRankings teamRankings3 = (TeamRankings) obj3;
                            if (teamRankings3 != null) {
                                int position = teamRankings3.getPosition();
                                LinearLayout linearLayout2 = mmaFighterDetailsFragment.D().b;
                                Context requireContext4 = mmaFighterDetailsFragment.requireContext();
                                requireContext4.getClass();
                                vm6 vm6Var2 = new vm6(requireContext4);
                                String string2 = vm6Var2.getResources().getString(R.string.current_ranking);
                                string2.getClass();
                                vm6Var2.j(string2, null, true);
                                if (position == 0) {
                                    String string3 = vm6Var2.getResources().getString(R.string.champion);
                                    string3.getClass();
                                    vm6Var2.l(new wm6(string3, mmaFighterDetailsFragment.requireContext().getDrawable(R.drawable.ic_champion), null, Integer.valueOf(mmaFighterDetailsFragment.requireContext().getColor(R.color.value)), null, 42));
                                } else {
                                    vm6Var2.setLabelValue("#" + position);
                                }
                                linearLayout2.addView(vm6Var2);
                            }
                        }
                    }
                }
                return Unit.a;
            case 2:
                MmaFighterRankingsModal mmaFighterRankingsModal = (MmaFighterRankingsModal) obj4;
                List list = (List) obj;
                mqi mqiVar2 = mmaFighterRankingsModal.D;
                if (((hoc) mqiVar2.getValue()).getItemCount() == 0) {
                    hoc hocVar = (hoc) mqiVar2.getValue();
                    View inflate = mmaFighterRankingsModal.getLayoutInflater().inflate(R.layout.mma_rankings_header_subtitle, (ViewGroup) mmaFighterRankingsModal.G().d, false);
                    int i6 = R.id.list_title;
                    if (((TextView) nq8.B(R.id.list_title, inflate)) != null) {
                        i6 = R.id.value_label;
                        if (((TextView) nq8.B(R.id.value_label, inflate)) != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                            constraintLayout.getClass();
                            hocVar.p(hocVar.g.size(), constraintLayout);
                        }
                    }
                    yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i6)));
                    return null;
                }
                hoc hocVar2 = (hoc) mqiVar2.getValue();
                list.getClass();
                hocVar2.F(list);
                ((RecyclerView) mmaFighterRankingsModal.G().d).setVisibility(0);
                ((ProgressBar) mmaFighterRankingsModal.G().c).setVisibility(8);
                return Unit.a;
            case 3:
                MmaFighterStatisticsFragment mmaFighterStatisticsFragment = (MmaFighterStatisticsFragment) obj4;
                poc pocVar = (poc) obj;
                mmaFighterStatisticsFragment.n();
                pocVar.getClass();
                Map map = pocVar.a;
                if (!map.isEmpty()) {
                    moc mocVar = (moc) mmaFighterStatisticsFragment.t.getValue();
                    mocVar.getClass();
                    Context context = mocVar.a;
                    mocVar.f = map;
                    ViewGroup viewGroup = mocVar.c;
                    if (viewGroup.getChildCount() == 0) {
                        List<fsc> list2 = (List) mocVar.f.get(zqc.CAREER);
                        if (list2 != null) {
                            for (fsc fscVar : list2) {
                                String str = fscVar.a;
                                ArrayList arrayList2 = fscVar.b;
                                lrc lrcVar = new lrc(context, str, dsc.b);
                                Iterator it3 = arrayList2.iterator();
                                ?? r12 = r5;
                                while (it3.hasNext()) {
                                    Object next = it3.next();
                                    int i7 = r12 + 1;
                                    if (r12 < 0) {
                                        b.q();
                                        throw null;
                                    }
                                    vrc vrcVar = (vrc) next;
                                    String str2 = vrcVar.a;
                                    View inflate2 = mocVar.d.inflate(R.layout.subtitle_micro_center, lrcVar, r5);
                                    inflate2.getClass();
                                    TextView textView = (TextView) inflate2;
                                    textView.setText(context.getString(tnf.p(str2)));
                                    dd ddVar = lrcVar.e;
                                    ((LinearLayout) ddVar.c).addView(textView);
                                    Iterator it4 = vrcVar.b.iterator();
                                    while (it4.hasNext()) {
                                        xqc xqcVar = (xqc) it4.next();
                                        switch (xqcVar.b.ordinal()) {
                                            case 0:
                                                r6Var = new qrc(context);
                                                break;
                                            case 1:
                                                r6Var = new csc(context);
                                                break;
                                            case 2:
                                                r6Var = new isc(context);
                                                break;
                                            case 3:
                                                r6Var = new hsc(context);
                                                break;
                                            case 4:
                                            default:
                                                r6Var = new csc(context);
                                                break;
                                            case 5:
                                                r6Var = new wrc(context, true);
                                                break;
                                            case 6:
                                                r6Var = new jsc(context);
                                                break;
                                            case 7:
                                                r6Var = new zrc(context);
                                                break;
                                            case 8:
                                                r6Var = new wrc(context, r5);
                                                break;
                                            case 9:
                                                r6Var = new nrc(context);
                                                break;
                                            case 10:
                                                r6Var = new yrc(context);
                                                break;
                                        }
                                        Gender gender2 = mocVar.b.getGender();
                                        if (gender2 == null) {
                                            gender2 = Gender.Male;
                                        }
                                        r6Var.setBodyGraphGender(gender2);
                                        String str3 = vrcVar.a;
                                        Iterator it5 = it4;
                                        String str4 = xqcVar.a;
                                        r6Var.e = str3;
                                        r6Var.setTag(str4);
                                        String string4 = r6Var.getContext().getString(tnf.p(str4));
                                        string4.getClass();
                                        TextView primaryLabel = r6Var.getPrimaryLabel();
                                        if (primaryLabel != null) {
                                            primaryLabel.setText(string4);
                                        }
                                        r6Var.setDisplayMode(mocVar.e);
                                        r6Var.setStatisticData(xqcVar);
                                        ((LinearLayout) ddVar.c).addView(r6Var);
                                        it4 = it5;
                                        r5 = false;
                                    }
                                    if (r12 != arrayList2.size() - 1) {
                                        SofaDivider sofaDivider = new SofaDivider(context, null, 6);
                                        Context context2 = sofaDivider.getContext();
                                        context2.getClass();
                                        i = 16;
                                        sofaDivider.setHorizontalMarginPx(ao2.s(16, context2));
                                        sofaDivider.setDividerVisibility(true);
                                        ((LinearLayout) ddVar.c).addView(sofaDivider);
                                    } else {
                                        i = 16;
                                    }
                                    i3 = i;
                                    r12 = i7;
                                    r5 = false;
                                }
                                int i8 = i3;
                                ym6 ym6Var = mocVar.g;
                                ym6Var.c = 150L;
                                hxj.a(viewGroup, ym6Var);
                                viewGroup.addView(lrcVar);
                                i3 = i8;
                                r5 = false;
                            }
                        }
                    } else {
                        List list3 = (List) mocVar.f.get(zqc.CAREER);
                        if (list3 != null) {
                            int i9 = 0;
                            for (Object obj6 : list3) {
                                int i10 = i9 + 1;
                                if (i9 < 0) {
                                    b.q();
                                    throw null;
                                }
                                fsc fscVar2 = (fsc) obj6;
                                ArrayList a = mocVar.a();
                                if (i9 >= 0 && i9 < a.size()) {
                                    ArrayList U0 = CollectionsKt.U0(((lrc) a.get(i9)).getFighterStatisticsViews());
                                    Iterator it6 = fscVar2.b.iterator();
                                    while (it6.hasNext()) {
                                        vrc vrcVar2 = (vrc) it6.next();
                                        Iterator it7 = vrcVar2.b.iterator();
                                        while (it7.hasNext()) {
                                            xqc xqcVar2 = (xqc) it7.next();
                                            Iterator it8 = U0.iterator();
                                            while (it8.hasNext()) {
                                                r6 r6Var2 = (r6) it8.next();
                                                if (!Intrinsics.c(r6Var2.getGroupTag(), vrcVar2.a) || !Intrinsics.c(r6Var2.getTag(), xqcVar2.a)) {
                                                }
                                            }
                                            ogj.m("Collection contains no element matching the predicate.");
                                            return null;
                                            break;
                                        }
                                    }
                                    i9 = i10;
                                }
                            }
                        }
                    }
                    ((ComposeView) mmaFighterStatisticsFragment.v.getValue()).setVisibility(0);
                }
                return Unit.a;
            case 4:
                int i11 = MmaOrganisationActivity.T;
                ((MmaOrganisationActivity) obj4).Y((UniqueTournament) obj);
                return Unit.a;
            case 5:
                ((frc) ((qrc) obj4).t.c).f.setProgress(((Integer) obj).intValue());
                return Unit.a;
            case 6:
                ((LinearProgressIndicator) ((csc) obj4).t.c).setProgress(((Integer) obj).intValue());
                return Unit.a;
            case 7:
                rsc rscVar = (rsc) obj4;
                rscVar.show();
                return new le(rscVar, 15);
            case 8:
                ((Boolean) obj).getClass();
                syl sylVar = ((MomentsPlayerActivity) obj4).m;
                if (sylVar != null) {
                    sylVar.v();
                }
                return Unit.a;
            case 9:
                File file = (File) obj;
                file.getClass();
                return new oyc(((ad2) obj4).b, file);
            case 10:
                MuteNotificationsBottomSheet muteNotificationsBottomSheet = (MuteNotificationsBottomSheet) obj4;
                y1d y1dVar = (y1d) obj;
                y1dVar.getClass();
                int ordinal = y1dVar.ordinal();
                if (ordinal == 0) {
                    Context requireContext5 = muteNotificationsBottomSheet.requireContext();
                    requireContext5.getClass();
                    wxf.y(2L, requireContext5);
                } else if (ordinal == 1) {
                    Context requireContext6 = muteNotificationsBottomSheet.requireContext();
                    requireContext6.getClass();
                    wxf.y(4L, requireContext6);
                } else {
                    if (ordinal != 2) {
                        zzl.b();
                        return null;
                    }
                    Context requireContext7 = muteNotificationsBottomSheet.requireContext();
                    requireContext7.getClass();
                    wxf.z(requireContext7, true, false);
                }
                Context requireContext8 = muteNotificationsBottomSheet.requireContext();
                requireContext8.getClass();
                nv.z0(requireContext8, kv.CLICK, y1dVar.c, "settings");
                ((khd) muteNotificationsBottomSheet.C.getValue()).t(ngd.a);
                muteNotificationsBottomSheet.j();
                return Unit.a;
            case 11:
                ((j2d) obj4).f(null);
                return Unit.a;
            case 12:
                ((o55) obj).getClass();
                return new le((h4d) obj4, i3);
            case 13:
                ((eoh) ((o8d) obj4).a).setValue((r8d) obj);
                return Unit.a;
            case 14:
                return Boolean.valueOf(((b9d) obj).b == ((twc) obj4));
            case 15:
                yfd yfdVar = (yfd) obj4;
                vfd vfdVar = (vfd) obj;
                vfdVar.getClass();
                gv9 gv9Var = vfdVar.a;
                if (gv9Var == null || !gv9Var.isEmpty()) {
                    Iterator it9 = gv9Var.iterator();
                    while (it9.hasNext()) {
                        if (!((ghd) it9.next()).e) {
                            z = false;
                            ArrayList arrayList3 = new ArrayList(k13.r(gv9Var, 10));
                            it = gv9Var.iterator();
                            while (it.hasNext()) {
                                arrayList3.add(ghd.a((ghd) it.next(), !z, false, 47));
                            }
                            gv9 W = l6g.W(arrayList3);
                            return vfd.a(vfdVar, W, yfd.u(yfdVar.n, W), false, false, 0L, 28);
                        }
                    }
                }
                z = true;
                ArrayList arrayList32 = new ArrayList(k13.r(gv9Var, 10));
                it = gv9Var.iterator();
                while (it.hasNext()) {
                }
                gv9 W2 = l6g.W(arrayList32);
                return vfd.a(vfdVar, W2, yfd.u(yfdVar.n, W2), false, false, 0L, 28);
            case 16:
                vv2 vv2Var = (vv2) obj;
                vv2Var.getClass();
                List list4 = (List) ((qq3) obj4).c;
                list4.getClass();
                vv2Var.b = list4;
                return Unit.a;
            case 17:
                OddsCountryProvider oddsCountryProvider = (OddsCountryProvider) obj4;
                ?? r1 = (SharedPreferences.Editor) obj;
                r1.getClass();
                r1.putBoolean("ODDS_VISIBLE", oddsCountryProvider != null);
                boolean z2 = oddsCountryProvider != null;
                r5 = (oddsCountryProvider != null ? oddsCountryProvider.getGroup() : null) != null;
                if (z2 && !r5) {
                    bga bgaVar = xld.a;
                    bgaVar.getClass();
                    r7 = bgaVar.c(OddsCountryProvider.INSTANCE.serializer(), oddsCountryProvider);
                }
                r1.putString("ODDS_CHOSEN_PROVIDER", r7);
                return Unit.a;
            case 18:
                rgh rghVar = (rgh) obj4;
                mjb mjbVar = (mjb) obj;
                mjbVar.getClass();
                int ordinal2 = mjbVar.ordinal();
                if (ordinal2 == 0) {
                    rgh.c(rghVar, null, 3);
                } else {
                    if (ordinal2 != 1) {
                        zzl.b();
                        return null;
                    }
                    rghVar.b();
                }
                return Unit.a;
            case 19:
                ysd ysdVar = (ysd) obj;
                ysdVar.getClass();
                return ysd.a(ysdVar, 0, null, null, ((drd) ((hrd) obj4)).a, 15);
            case 20:
                Iterator it10 = ((mvd) obj4).c.iterator();
                while (it10.hasNext()) {
                    lvd lvdVar = (lvd) it10.next();
                    lvdVar.a.i(obj, lvdVar.b);
                }
                return Unit.a;
            case 21:
                return hyd.a((hyd) obj4, (List) obj);
            case 22:
                POTSHighestRatedPlayersFragment pOTSHighestRatedPlayersFragment = (POTSHighestRatedPlayersFragment) obj4;
                w0e w0eVar = (w0e) obj;
                w0eVar.getClass();
                if (w0eVar.equals(u0e.a)) {
                    Context requireContext9 = pOTSHighestRatedPlayersFragment.requireContext();
                    requireContext9.getClass();
                    POTSHighestRatedPlayersFilterBottomSheet pOTSHighestRatedPlayersFilterBottomSheet = new POTSHighestRatedPlayersFilterBottomSheet();
                    if (requireContext9 instanceof csk) {
                        requireContext9 = ((csk) requireContext9).getBaseContext();
                    }
                    AppCompatActivity appCompatActivity = requireContext9 instanceof AppCompatActivity ? (AppCompatActivity) requireContext9 : null;
                    if (appCompatActivity != null) {
                        wca.x(appCompatActivity.getLifecycle()).b(new r1(pOTSHighestRatedPlayersFilterBottomSheet, appCompatActivity, r7, i4));
                    }
                } else {
                    pOTSHighestRatedPlayersFragment.D().t(w0eVar);
                }
                return Unit.a;
            case 23:
                POTSTopLeaguesFragment pOTSTopLeaguesFragment = (POTSTopLeaguesFragment) obj4;
                w2e w2eVar = (w2e) obj;
                w2eVar.getClass();
                if (w2eVar instanceof v2e) {
                    Context requireContext10 = pOTSTopLeaguesFragment.requireContext();
                    requireContext10.getClass();
                    v2e v2eVar = (v2e) w2eVar;
                    int i12 = v2eVar.a;
                    String str5 = v2eVar.b;
                    POTSLeagueTopPlayersBottomSheet pOTSLeagueTopPlayersBottomSheet = new POTSLeagueTopPlayersBottomSheet();
                    pOTSLeagueTopPlayersBottomSheet.setArguments(fz8.C(fz8.D(i12, "UNIQUE_TOURNAMENT_ID"), fz8.H("UNIQUE_TOURNAMENT_NAME", str5)));
                    if (requireContext10 instanceof csk) {
                        requireContext10 = ((csk) requireContext10).getBaseContext();
                    }
                    AppCompatActivity appCompatActivity2 = requireContext10 instanceof AppCompatActivity ? (AppCompatActivity) requireContext10 : null;
                    if (appCompatActivity2 != null) {
                        wca.x(appCompatActivity2.getLifecycle()).b(new r1(pOTSLeagueTopPlayersBottomSheet, appCompatActivity2, r7, i4));
                    }
                } else {
                    e3e e3eVar = (e3e) pOTSTopLeaguesFragment.r.getValue();
                    if (w2eVar.equals(u2e.a)) {
                        ynb.m(e3eVar, new r3(e3eVar, r7, 18));
                    }
                }
                return Unit.a;
            case 24:
                float floatValue = ((Float) obj).floatValue();
                a6e a6eVar = ((e6e) obj4).b;
                a6eVar.q.i(a6eVar.j(a6eVar.k() + wzb.b(a6eVar.p() != 0 ? floatValue / a6eVar.p() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)));
                return Unit.a;
            case 25:
                nh3 nh3Var = (nh3) obj4;
                p33 p33Var = (p33) obj;
                p33Var.getClass();
                qfb qfbVar = p33Var.c;
                qfbVar.getClass();
                if (!Intrinsics.c((qfb) nh3Var.b, qfbVar)) {
                    qfb qfbVar2 = (qfb) nh3Var.b;
                    qfbVar2.getClass();
                    boolean z3 = qfbVar2 instanceof ofb;
                    boolean z4 = qfbVar instanceof ofb;
                    if (z3 && !z4) {
                        nh3Var.notifyItemRemoved(0);
                    } else if (z4 && !z3) {
                        nh3Var.notifyItemInserted(0);
                    } else if (z3 && z4) {
                        nh3Var.notifyItemChanged(0);
                    }
                    nh3Var.b = qfbVar;
                }
                return Unit.a;
            case 26:
                Context context3 = (Context) obj;
                context3.getClass();
                return new uy1(context3, (j6c) obj4);
            case 27:
                ((lae) obj4).d = (Bitmap) obj;
                return Unit.a;
            case 28:
                return Boolean.valueOf(((xce) obj4) != null);
            default:
                zje zjeVar = (zje) obj4;
                ((ale) obj).getClass();
                ale aleVar = zjeVar.a;
                ((eoh) zjeVar.b).setValue(Boolean.valueOf(nik.d0(aleVar)));
                ((eoh) zjeVar.c).setValue(Boolean.valueOf(nik.e0(aleVar, true)));
                return Unit.a;
        }
    }

    public /* synthetic */ mnc(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
