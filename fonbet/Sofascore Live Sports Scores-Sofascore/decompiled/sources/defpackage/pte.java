package defpackage;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.ironsource.C4227o2;
import com.ironsource.U3;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Manager;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Referee;
import com.sofascore.model.mvvm.model.Sport;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.Transfer;
import com.sofascore.model.mvvm.model.UniqueStage;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.network.response.PickemConfig;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.model.newNetwork.Highlight;
import com.sofascore.model.newNetwork.RiskyTopic;
import com.sofascore.model.newNetwork.TeamUniqueTournament;
import com.sofascore.model.profile.PlayerSubscription;
import com.sofascore.model.profile.TeamSubscription;
import com.sofascore.model.profile.UniqueTournamentSubscription;
import com.sofascore.model.util.ChatInterface;
import com.sofascore.results.R;
import com.sofascore.results.bettingtips.BettingTipsActivity;
import com.sofascore.results.chat.ChatActivity;
import com.sofascore.results.chat.fragment.RiskyChatsDialog;
import com.sofascore.results.dialog.PlayerPositionsModal;
import com.sofascore.results.dialog.PreviousTournamentsModal;
import com.sofascore.results.event.EventActivity;
import com.sofascore.results.league.LeagueActivity;
import com.sofascore.results.league.fragment.details.PopularPlayersModal;
import com.sofascore.results.main.MainActivity;
import com.sofascore.results.main.leagues.StageCategoryEventsFragment;
import com.sofascore.results.main.search.SearchActivity;
import com.sofascore.results.manager.ManagerActivity;
import com.sofascore.results.mma.fighter.MmaFighterActivity;
import com.sofascore.results.mma.organisation.MmaOrganisationActivity;
import com.sofascore.results.notifications.NotificationSettingsActivity;
import com.sofascore.results.player.PlayerActivity;
import com.sofascore.results.pots.POTSActivity;
import com.sofascore.results.profile.ProfileActivity;
import com.sofascore.results.ranking.RankingFragment;
import com.sofascore.results.ranking.RankingsActivity;
import com.sofascore.results.referee.RefereeActivity;
import com.sofascore.results.referee.events.RefereeEventsFragment;
import com.sofascore.results.settings.SettingsActivity;
import com.sofascore.results.settings.developer.DeveloperOptionsFullScreenDialog;
import com.sofascore.results.stagesport.StageCategoryActivity;
import com.sofascore.results.stagesport.StageConstructorActivity;
import com.sofascore.results.stagesport.StageDetailsActivity;
import com.sofascore.results.stagesport.StageDriverActivity;
import com.sofascore.results.stagesport.fragments.category.StageCategoryRacesFragment;
import com.sofascore.results.stagesport.fragments.details.StageDetailsRankingFragment;
import com.sofascore.results.stagesport.fragments.media.StageMediaFragment;
import com.sofascore.results.stagesport.fragments.raceFlow.RaceFlowModels$RaceTeam;
import com.sofascore.results.stagesport.fragments.team.driver.StageDriverEventsFragment;
import com.sofascore.results.team.TeamActivity;
import com.sofascore.results.transfers.PlayerTransfersActivity;
import com.sofascore.results.tv.TVScheduleActivity;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.io.Serializable;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class pte implements ct8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pte(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        euh euhVar = (euh) this.b;
        fy7 fy7Var = euhVar.k;
        m12 m12Var = (m12) obj;
        of3 of3Var = (of3) obj2;
        int intValue = ((Integer) obj3).intValue();
        mv1 mv1Var = uxf.d;
        m12Var.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((av8) of3Var).g(m12Var) ? 4 : 2;
        }
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(intValue & 1, (intValue & 19) != 18)) {
            utc utcVar = utc.a;
            if (fy7Var != null) {
                av8Var.d0(-154103266);
                td4.G(fy7Var.a, u6h.C(bkh.l(l98.f0(m12Var.a(utcVar, mv1Var), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), 128.0f), 0.1f), false, 0L, av8Var, 0, 12);
                av8Var.s(false);
            } else {
                av8Var.d0(-153772217);
                kq9.b(s6a.N(R.drawable.ic_leagues, 6, av8Var), null, u6h.C(bkh.l(l98.f0(m12Var.a(utcVar, mv1Var), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), 128.0f), 0.05f), lz.D(R.color.n_lv_1, av8Var), av8Var, 48, 0);
                av8Var.s(false);
            }
            xtc f0 = l98.f0(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 42.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            u23 a = t23.a(ww9.d, uxf.p, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, f0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var, a, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            String str = euhVar.i;
            if (str == null) {
                str = "";
            }
            yf8 yf8Var = xth.a;
            udj.c(str, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 2, 0, null, xth.e(), av8Var, 0, 24960, 109562);
            nq8.h(av8Var, bkh.e(utcVar, 16.0f));
            String str2 = euhVar.h;
            udj.c(str2 != null ? str2 : "", null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 2, 0, null, xth.h(), av8Var, 0, 24960, 109562);
            nq8.h(av8Var, new goa(1.0f, true));
            xtc c0 = l98.c0(n9e.q(bkh.d(utcVar, 1.0f), lz.D(R.color.surface_1, av8Var), o7g.a(8.0f)), 16.0f, 12.0f);
            l8g a2 = k8g.a(ww9.f, uxf.m, av8Var, 54);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, c0);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, f50Var);
            waa.K(av8Var, m2, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            kq9.a(haa.t(R.drawable.ic_tv_channel_checkmark_16, 0, av8Var), null, bkh.l(utcVar, 16.0f), lz.D(R.color.success, av8Var), av8Var, 440, 0);
            udj.c(euhVar.l, l98.d0(utcVar, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var, 48, 0, 131064);
            av8Var.s(true);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }

    private final Object b(Object obj, Object obj2, Object obj3) {
        StageCategoryRacesFragment stageCategoryRacesFragment = (StageCategoryRacesFragment) this.b;
        wt3.y((Integer) obj2, (View) obj, obj3);
        if (obj3 instanceof Stage) {
            fff fffVar = StageDetailsActivity.T;
            FragmentActivity requireActivity = stageCategoryRacesFragment.requireActivity();
            requireActivity.getClass();
            fffVar.g(requireActivity, (Stage) obj3, null);
        }
        return Unit.a;
    }

    private final Object c(Object obj, Object obj2, Object obj3) {
        StageDetailsRankingFragment stageDetailsRankingFragment = (StageDetailsRankingFragment) this.b;
        ((Integer) obj2).getClass();
        z7i z7iVar = (z7i) obj3;
        ((View) obj).getClass();
        z7iVar.getClass();
        if (z7iVar instanceof y7i) {
            j5i j5iVar = stageDetailsRankingFragment.v;
            if ((j5iVar == null ? -1 : i3i.a[j5iVar.ordinal()]) == 1) {
                int i = StageConstructorActivity.R;
                Context requireContext = stageDetailsRankingFragment.requireContext();
                requireContext.getClass();
                dff.g(((y7i) z7iVar).a.a.getTeam().getId(), requireContext);
            } else {
                int i2 = StageDriverActivity.R;
                Context requireContext2 = stageDetailsRankingFragment.requireContext();
                requireContext2.getClass();
                pff.g(((y7i) z7iVar).a.a.getTeam().getId(), requireContext2);
            }
        }
        return Unit.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        StageDriverEventsFragment stageDriverEventsFragment = (StageDriverEventsFragment) this.b;
        wt3.y((Integer) obj2, (View) obj, obj3);
        if (obj3 instanceof Stage) {
            fff fffVar = StageDetailsActivity.T;
            FragmentActivity requireActivity = stageDriverEventsFragment.requireActivity();
            requireActivity.getClass();
            fffVar.g(requireActivity, (Stage) obj3, null);
        } else if (obj3 instanceof r7i) {
            fff fffVar2 = StageDetailsActivity.T;
            FragmentActivity requireActivity2 = stageDriverEventsFragment.requireActivity();
            requireActivity2.getClass();
            fffVar2.g(requireActivity2, ((r7i) obj3).a, null);
        } else if (obj3 instanceof q7i) {
            fff fffVar3 = StageDetailsActivity.T;
            FragmentActivity requireActivity3 = stageDriverEventsFragment.requireActivity();
            requireActivity3.getClass();
            fffVar3.g(requireActivity3, ((q7i) obj3).a, null);
        }
        return Unit.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3) {
        utc utcVar;
        f50 f50Var;
        ry ryVar;
        f50 f50Var2;
        boolean z;
        float f;
        ff3 ff3Var;
        boolean z2;
        e5i e5iVar = (e5i) this.b;
        of3 of3Var = (of3) obj2;
        ((Integer) obj3).getClass();
        lv1 lv1Var = uxf.l;
        ((r70) obj).getClass();
        if (e5iVar == null) {
            av8 av8Var = (av8) of3Var;
            av8Var.d0(-1044303765);
            av8Var.s(false);
        } else {
            w5i w5iVar = e5iVar.b;
            av8 av8Var2 = (av8) of3Var;
            av8Var2.d0(-1044303764);
            p4h p4hVar = ww9.d;
            kv1 kv1Var = uxf.o;
            u23 a = t23.a(p4hVar, kv1Var, av8Var2, 0);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m = av8Var2.m();
            utc utcVar2 = utc.a;
            xtc C = fqj.C(av8Var2, utcVar2);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            f50 f50Var3 = hf3.g;
            waa.K(av8Var2, a, f50Var3);
            ff3 ff3Var2 = hf3.f;
            waa.K(av8Var2, m, ff3Var2);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var4 = hf3.j;
            waa.K(av8Var2, valueOf, f50Var4);
            ry ryVar2 = hf3.k;
            waa.J(av8Var2, ryVar2);
            f50 f50Var5 = hf3.d;
            waa.K(av8Var2, C, f50Var5);
            xtc e0 = l98.e0(n9e.q(l98.d0(utcVar2, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), lz.D(R.color.surface_2, av8Var2), o7g.a(16.0f)), 16.0f, 12.0f, 16.0f, 16.0f);
            u23 a2 = t23.a(new ng0(8.0f, true, new a70(6)), kv1Var, av8Var2, 6);
            int hashCode2 = Long.hashCode(av8Var2.T);
            aee m2 = av8Var2.m();
            xtc C2 = fqj.C(av8Var2, e0);
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a2, f50Var3);
            waa.K(av8Var2, m2, ff3Var2);
            bf3.s(hashCode2, av8Var2, f50Var4, av8Var2, ryVar2);
            waa.K(av8Var2, C2, f50Var5);
            x5i x5iVar = e5iVar.a;
            Object O = av8Var2.O();
            if (O == nf3.a) {
                O = new l2i(29);
                av8Var2.n0(O);
            }
            int i = 6;
            l98.b(x5iVar, null, (Function1) O, null, null, null, yqo.H(-1948502988, av8Var2, new jw5(e5iVar, 11)), av8Var2, 1573248, 58);
            if (w5iVar == w5i.f) {
                av8Var2.d0(110297257);
                l8g a3 = k8g.a(new ng0(8.0f, true, new a70(i)), lv1Var, av8Var2, 6);
                int hashCode3 = Long.hashCode(av8Var2.T);
                aee m3 = av8Var2.m();
                xtc C3 = fqj.C(av8Var2, utcVar2);
                av8Var2.h0();
                if (av8Var2.S) {
                    av8Var2.l(zg3Var);
                } else {
                    av8Var2.q0();
                }
                waa.K(av8Var2, a3, f50Var3);
                waa.K(av8Var2, m3, ff3Var2);
                bf3.s(hashCode3, av8Var2, f50Var4, av8Var2, ryVar2);
                waa.K(av8Var2, C3, f50Var5);
                f = 8.0f;
                utcVar = utcVar2;
                f50Var = f50Var4;
                ryVar = ryVar2;
                f50Var2 = f50Var5;
                ff3Var = ff3Var2;
                wkn.k(haa.t(R.drawable.igaming_eng, 0, av8Var2), null, bkh.e(bkh.p(utcVar2, 74.0f), 21.0f), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var2, 440, 120);
                wkn.k(haa.t(R.drawable.igaming_fra, 0, av8Var2), null, bkh.e(bkh.p(utcVar, 92.0f), 21.0f), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var2, 440, 120);
                z = true;
                av8Var2.s(true);
                av8Var2.s(false);
            } else {
                utcVar = utcVar2;
                f50Var = f50Var4;
                ryVar = ryVar2;
                f50Var2 = f50Var5;
                z = true;
                f = 8.0f;
                ff3Var = ff3Var2;
                av8Var2.d0(111166962);
                av8Var2.s(false);
            }
            av8Var2.s(z);
            if (w5iVar == w5i.d) {
                av8Var2.d0(-78308605);
                xtc b0 = l98.b0(utcVar, 12.0f);
                l8g a4 = k8g.a(new ng0(12.0f, z, new a70(6)), lv1Var, av8Var2, 6);
                int hashCode4 = Long.hashCode(av8Var2.T);
                aee m4 = av8Var2.m();
                xtc C4 = fqj.C(av8Var2, b0);
                av8Var2.h0();
                if (av8Var2.S) {
                    av8Var2.l(zg3Var);
                } else {
                    av8Var2.q0();
                }
                waa.K(av8Var2, a4, f50Var3);
                waa.K(av8Var2, m4, ff3Var);
                bf3.s(hashCode4, av8Var2, f50Var, av8Var2, ryVar);
                waa.K(av8Var2, C4, f50Var2);
                wkn.l(s6a.N(R.drawable.eeep_logo, 6, av8Var2), bkh.l(utcVar, 24.0f), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new ay1(lz.D(R.color.n_lv_3, av8Var2), 5), av8Var2, 432, 56);
                yf8 yf8Var = xth.a;
                udj.c(oea.v(R.string.greek_betting_regulations_text, av8Var2), null, lz.D(R.color.n_lv_3, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.c(), av8Var2, 0, 0, 131066);
                av8Var2 = av8Var2;
                av8Var2.s(true);
                z2 = false;
                av8Var2.s(false);
            } else if (w5iVar == w5i.e) {
                av8Var2.d0(-77382573);
                xtc d = bkh.d(l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), 1.0f);
                String v = oea.v(R.string.germany_betting_regulations_text, av8Var2);
                yf8 yf8Var2 = xth.a;
                udj.c(v, d, lz.D(R.color.n_lv_3, av8Var2), null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 2, 0, null, xth.c(), av8Var2, 48, 24960, 109560);
                av8Var2 = av8Var2;
                z2 = false;
                av8Var2.s(false);
            } else {
                z2 = false;
                av8Var2.d0(-76925540);
                av8Var2.s(false);
            }
            av8Var2.s(true);
            av8Var2.s(z2);
        }
        return Unit.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3) {
        String a;
        r9k r9kVar = (r9k) this.b;
        of3 of3Var = (of3) obj2;
        ((Integer) obj3).getClass();
        ((r70) obj).getClass();
        xtc f0 = l98.f0(utc.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 7);
        yf8 yf8Var = xth.a;
        dfj k = xth.k();
        if (r9kVar == null) {
            av8 av8Var = (av8) of3Var;
            av8Var.d0(1998908812);
            av8Var.s(false);
            a = null;
        } else {
            av8 av8Var2 = (av8) of3Var;
            av8Var2.d0(-351161067);
            a = r9kVar.a(av8Var2);
            av8Var2.s(false);
        }
        if (a == null) {
            a = "";
        }
        udj.c(a, f0, lz.D(R.color.n_lv_1, of3Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, k, of3Var, 48, 0, 131064);
        return Unit.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3) {
        StageMediaFragment stageMediaFragment = (StageMediaFragment) this.b;
        ((Integer) obj2).getClass();
        r5c r5cVar = (r5c) obj3;
        ((View) obj).getClass();
        r5cVar.getClass();
        Highlight highlight = r5cVar.a;
        Context requireContext = stageMediaFragment.requireContext();
        requireContext.getClass();
        yu yuVar = yu.HIGHLIGHTS;
        Stage stage = stageMediaFragment.t;
        if (stage == null) {
            Intrinsics.i("event");
            throw null;
        }
        nv.g0(requireContext, yuVar, Integer.valueOf(stage.getId()), "stage", U3.i.I0, rfo.s(highlight));
        FragmentActivity requireActivity = stageMediaFragment.requireActivity();
        requireActivity.getClass();
        rfo.G(highlight, requireActivity, new deh(11, stageMediaFragment, r5cVar), "Event - media fragment");
        return Unit.a;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        av8 av8Var;
        float f;
        int i = this.a;
        int i2 = 2;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                nte nteVar = (nte) obj4;
                of3 of3Var = (of3) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((m12) obj).getClass();
                av8 av8Var2 = (av8) of3Var;
                if (av8Var2.T(intValue & 1, (intValue & 17) != 16)) {
                    k1c c = e12.c(uxf.g, false);
                    int hashCode = Long.hashCode(av8Var2.T);
                    aee m = av8Var2.m();
                    utc utcVar = utc.a;
                    xtc C = fqj.C(av8Var2, utcVar);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var2.h0();
                    if (av8Var2.S) {
                        av8Var2.l(zg3Var);
                    } else {
                        av8Var2.q0();
                    }
                    f50 f50Var = hf3.g;
                    waa.K(av8Var2, c, f50Var);
                    ff3 ff3Var = hf3.f;
                    waa.K(av8Var2, m, ff3Var);
                    Integer valueOf = Integer.valueOf(hashCode);
                    f50 f50Var2 = hf3.j;
                    waa.K(av8Var2, valueOf, f50Var2);
                    ry ryVar = hf3.k;
                    waa.J(av8Var2, ryVar);
                    f50 f50Var3 = hf3.d;
                    waa.K(av8Var2, C, f50Var3);
                    kq9.b(s6a.N(R.drawable.ic_sofascore_logomark, 6, av8Var2), null, bkh.l(utcVar, 165.0f), lz.D(R.color.primary_default_10, av8Var2), av8Var2, 432, 0);
                    u23 a = t23.a(new ng0(8.0f, true, new a70(6)), uxf.p, av8Var2, 54);
                    int hashCode2 = Long.hashCode(av8Var2.T);
                    aee m2 = av8Var2.m();
                    xtc C2 = fqj.C(av8Var2, utcVar);
                    av8Var2.h0();
                    if (av8Var2.S) {
                        av8Var2.l(zg3Var);
                    } else {
                        av8Var2.q0();
                    }
                    waa.K(av8Var2, a, f50Var);
                    waa.K(av8Var2, m2, ff3Var);
                    bf3.s(hashCode2, av8Var2, f50Var2, av8Var2, ryVar);
                    waa.K(av8Var2, C2, f50Var3);
                    ux7 ux7Var = nteVar.l;
                    gv9 gv9Var = nteVar.n;
                    int i3 = ux7Var.a;
                    int i4 = nteVar.k.a;
                    String str = ux7Var.b;
                    Double d = nteVar.m;
                    yf8 yf8Var = xth.a;
                    rz8.n(null, i3, i4, str, xth.i(), d, av8Var2, 0, 1);
                    Pair pair = (Pair) CollectionsKt.a0(0, gv9Var);
                    Pair pair2 = (Pair) CollectionsKt.a0(1, gv9Var);
                    l8g a2 = k8g.a(new ng0(8.0f, true, new a70(6)), uxf.m, av8Var2, 54);
                    int hashCode3 = Long.hashCode(av8Var2.T);
                    aee m3 = av8Var2.m();
                    xtc C3 = fqj.C(av8Var2, utcVar);
                    av8Var2.h0();
                    if (av8Var2.S) {
                        av8Var2.l(zg3Var);
                    } else {
                        av8Var2.q0();
                    }
                    waa.K(av8Var2, a2, f50Var);
                    waa.K(av8Var2, m3, ff3Var);
                    bf3.s(hashCode3, av8Var2, f50Var2, av8Var2, ryVar);
                    waa.K(av8Var2, C3, f50Var3);
                    if (pair != null) {
                        av8Var2.d0(-856641465);
                        String str2 = (String) pair.b;
                        f = 8.0f;
                        udj.c(str2 == null ? "" : str2, null, lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.j(), av8Var2, 0, 0, 131066);
                        av8Var = av8Var2;
                        kq9.b(s6a.N(R.drawable.ic_goal_incidents, 6, av8Var), null, l98.b0(bkh.l(l98.b0(n9e.q(utcVar, r13.d, o7g.a), 1.0f), 16.0f), 1.0f), lz.D(R.color.graphics_dark, av8Var), av8Var, 48, 0);
                        av8Var.s(false);
                    } else {
                        av8Var = av8Var2;
                        f = 8.0f;
                        av8Var.d0(-855828459);
                        av8Var.s(false);
                    }
                    if (pair2 != null) {
                        av8Var.d0(-855754679);
                        xtc f0 = l98.f0(utcVar, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
                        String str3 = (String) pair2.b;
                        udj.c(str3 == null ? "" : str3, f0, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.j(), av8Var, 48, 0, 131064);
                        kq9.b(s6a.N(R.drawable.ic_football_assist_16, 6, av8Var), null, bkh.l(l98.b0(n9e.q(utcVar, r13.d, o7g.a), 1.0f), 16.0f), lz.D(R.color.graphics_dark, av8Var), av8Var, 48, 0);
                        av8Var.s(false);
                    } else {
                        av8Var.d0(-854912843);
                        av8Var.s(false);
                    }
                    ljg.t(av8Var, true, true, true);
                } else {
                    av8Var2.W();
                }
                return Unit.a;
            case 1:
                PlayerPositionsModal playerPositionsModal = (PlayerPositionsModal) obj4;
                wt3.y((Integer) obj2, (View) obj, obj3);
                if (obj3 instanceof y21) {
                    wxf wxfVar = EventActivity.h0;
                    Context requireContext = playerPositionsModal.requireContext();
                    requireContext.getClass();
                    wxf.B(requireContext, ((y21) obj3).d().getId(), null, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                    playerPositionsModal.j();
                }
                return Unit.a;
            case 2:
                PlayerTransfersActivity playerTransfersActivity = (PlayerTransfersActivity) obj4;
                ((Integer) obj2).getClass();
                lvj lvjVar = (lvj) obj3;
                int i5 = PlayerTransfersActivity.R;
                ((View) obj).getClass();
                lvjVar.getClass();
                Player player = ((Transfer) lvjVar.a.get(0)).getPlayer();
                if (player != null) {
                    int i6 = PlayerActivity.Z;
                    jle.q(playerTransfersActivity, player.getId(), 0, null, null, false, null, null, PglCryptUtils.BASE64_FAILED);
                }
                return Unit.a;
            case 3:
                PopularPlayersModal popularPlayersModal = (PopularPlayersModal) obj4;
                ((Integer) obj2).getClass();
                nta ntaVar = (nta) obj3;
                ((View) obj).getClass();
                ntaVar.getClass();
                int i7 = ntaVar.a;
                int i8 = PlayerActivity.Z;
                Context requireContext2 = popularPlayersModal.requireContext();
                requireContext2.getClass();
                UniqueTournament uniqueTournament = ((yta) popularPlayersModal.B.getValue()).o().getUniqueTournament();
                jle.q(requireContext2, i7, uniqueTournament != null ? uniqueTournament.getId() : 0, null, null, false, null, null, PglCryptUtils.BASE64_FAILED);
                return Unit.a;
            case 4:
                ((Integer) obj2).getClass();
                w5f w5fVar = (w5f) obj3;
                ((View) obj).getClass();
                w5fVar.getClass();
                wxf wxfVar2 = EventActivity.h0;
                Context context = ((RecyclerView) obj4).getContext();
                context.getClass();
                wxf.B(context, w5fVar.a, null, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                return Unit.a;
            case 5:
                PreviousTournamentsModal previousTournamentsModal = (PreviousTournamentsModal) obj4;
                ((Integer) obj2).getClass();
                TeamUniqueTournament teamUniqueTournament = (TeamUniqueTournament) obj3;
                ((View) obj).getClass();
                teamUniqueTournament.getClass();
                a99 a99Var = LeagueActivity.h0;
                Context requireContext3 = previousTournamentsModal.requireContext();
                requireContext3.getClass();
                a99.A(a99Var, requireContext3, Integer.valueOf(teamUniqueTournament.getId()), 0, null, null, null, null, 4088);
                previousTournamentsModal.j();
                return Unit.a;
            case 6:
                r9f r9fVar = (r9f) obj4;
                Context context2 = r9fVar.b;
                ((Integer) obj2).getClass();
                int i9 = ProfileActivity.Q;
                ((View) obj).getClass();
                obj3.getClass();
                if (obj3 instanceof UniqueTournamentSubscription) {
                    a99.A(LeagueActivity.h0, r9fVar.b, Integer.valueOf(((UniqueTournamentSubscription) obj3).getId()), 0, null, null, null, null, 4088);
                } else if (obj3 instanceof PlayerSubscription) {
                    int i10 = PlayerActivity.Z;
                    jle.q(r9fVar.b, ((PlayerSubscription) obj3).getId(), 0, null, null, false, null, null, 472);
                } else if (obj3 instanceof TeamSubscription) {
                    Set set = wyh.a;
                    TeamSubscription teamSubscription = (TeamSubscription) obj3;
                    Sport sport = teamSubscription.getSport();
                    if (wyh.m(sport != null ? sport.getSlug() : null)) {
                        joa joaVar = l5i.a;
                        l5i.k(context2, teamSubscription.getType(), teamSubscription.getId());
                    } else {
                        Sport sport2 = teamSubscription.getSport();
                        if (Intrinsics.c(sport2 != null ? sport2.getSlug() : null, Sports.MMA)) {
                            int i11 = MmaFighterActivity.U;
                            f7a.x(teamSubscription.getId(), context2);
                        } else {
                            int i12 = TeamActivity.Z;
                            jle.r(r9fVar.b, teamSubscription.getId(), null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                        }
                    }
                }
                return Unit.a;
            case 7:
                pi5 pi5Var = (pi5) obj4;
                of3 of3Var2 = (of3) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((xpa) obj).getClass();
                av8 av8Var3 = (av8) of3Var2;
                if (av8Var3.T(intValue2 & 1, (intValue2 & 17) != 16)) {
                    qi5 qi5Var = pi5Var.c;
                    waa.f(l6g.K(new l9f(new q9k(R.string.profile_added_matches), qi5Var != null ? qi5Var.a : null), new l9f(new q9k(R.string.profile_match_openings), qi5Var != null ? qi5Var.b : null), new l9f(new q9k(R.string.profile_leaderboard_position), qi5Var != null ? qi5Var.c : null), new l9f(new q9k(R.string.profile_leaderboard_points), qi5Var != null ? qi5Var.d : null)), null, av8Var3, 0);
                } else {
                    av8Var3.W();
                }
                return Unit.a;
            case 8:
                gta gtaVar = (gta) obj4;
                of3 of3Var3 = (of3) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((xpa) obj).getClass();
                av8 av8Var4 = (av8) of3Var3;
                if (av8Var4.T(intValue3 & 1, (intValue3 & 17) != 16)) {
                    wca.e(gtaVar, null, av8Var4, 0);
                } else {
                    av8Var4.W();
                }
                return Unit.a;
            case 9:
                MainActivity mainActivity = (MainActivity) obj4;
                ((Integer) obj2).getClass();
                ejf ejfVar = (ejf) obj3;
                ((View) obj).getClass();
                ejfVar.getClass();
                bjf bjfVar = ejfVar.a;
                bjfVar.getClass();
                switch (bjfVar.ordinal()) {
                    case 0:
                        FragmentActivity K = hkg.K(mainActivity);
                        AppCompatActivity appCompatActivity = K instanceof AppCompatActivity ? (AppCompatActivity) K : null;
                        if (appCompatActivity != null) {
                            new DeveloperOptionsFullScreenDialog().p(appCompatActivity.k(), "developerOptions");
                            break;
                        }
                        break;
                    case 1:
                        nv.m0(mainActivity, C4227o2.x, "quick_links");
                        int i13 = NotificationSettingsActivity.O;
                        mx9.y(mainActivity);
                        break;
                    case 2:
                        nv.m0(mainActivity, "preferences", "quick_links");
                        int i14 = SettingsActivity.L;
                        Intent intent = new Intent(mainActivity, (Class<?>) SettingsActivity.class);
                        intent.putExtra("open", "openPreferences");
                        mainActivity.startActivity(intent);
                        break;
                    case 3:
                        nv.m0(mainActivity, "pickem", "quick_links");
                        ia0 ia0Var = ia0.q;
                        PickemConfig pickemConfig = ok3.p().h().n;
                        if (pickemConfig != null) {
                            bea.G(mainActivity, pickemConfig.getUrl());
                            break;
                        }
                        break;
                    case 4:
                        nv.m0(mainActivity, "transfers", "quick_links");
                        int i15 = PlayerTransfersActivity.R;
                        mainActivity.startActivity(new Intent(mainActivity, (Class<?>) PlayerTransfersActivity.class));
                        break;
                    case 5:
                        nv.m0(mainActivity, "tv_schedule", "quick_links");
                        int i16 = TVScheduleActivity.O;
                        mainActivity.startActivity(new Intent(mainActivity, (Class<?>) TVScheduleActivity.class));
                        break;
                    case 6:
                        nv.m0(mainActivity, "dropping_odds", "quick_links");
                        int i17 = BettingTipsActivity.Q;
                        mainActivity.startActivity(tol.w(mainActivity, null, null));
                        break;
                    case 7:
                        nv.m0(mainActivity, "player_of_the_season", "quick_links");
                        int i18 = POTSActivity.O;
                        Intent intent2 = new Intent(mainActivity, (Class<?>) POTSActivity.class);
                        intent2.putExtra("InitialTab", (Serializable) null);
                        mainActivity.startActivity(intent2);
                        break;
                    case 8:
                        nv.m0(mainActivity, "FIFA_rankings", "quick_links");
                        int i19 = RankingsActivity.O;
                        jaa.N(mainActivity, jmf.f, null);
                        break;
                    case 9:
                        nv.m0(mainActivity, "UEFA_rankings", "quick_links");
                        int i20 = RankingsActivity.O;
                        jaa.N(mainActivity, jmf.d, null);
                        break;
                    case 10:
                        nv.m0(mainActivity, "ATP_rankings", "quick_links");
                        int i21 = RankingsActivity.O;
                        jaa.N(mainActivity, jmf.b, null);
                        break;
                    case 11:
                        nv.m0(mainActivity, "WTA_rankings", "quick_links");
                        int i22 = RankingsActivity.O;
                        jaa.N(mainActivity, jmf.c, null);
                        break;
                    case 12:
                        nv.m0(mainActivity, "UTR_men_rankings", "quick_links");
                        int i23 = RankingsActivity.O;
                        jaa.N(mainActivity, jmf.g, null);
                        break;
                    case 13:
                        nv.m0(mainActivity, "UTR_women_rankings", "quick_links");
                        int i24 = RankingsActivity.O;
                        jaa.N(mainActivity, jmf.h, null);
                        break;
                    case 14:
                        nv.m0(mainActivity, "Rugby_Union_rankings", "quick_links");
                        int i25 = RankingsActivity.O;
                        jaa.N(mainActivity, jmf.e, null);
                        break;
                    default:
                        zzl.b();
                        return null;
                }
                return Unit.a;
            case 10:
                RaceFlowModels$RaceTeam raceFlowModels$RaceTeam = (RaceFlowModels$RaceTeam) obj4;
                of3 of3Var4 = (of3) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((xtc) obj).getClass();
                av8 av8Var5 = (av8) of3Var4;
                if (!av8Var5.T(intValue4 & 1, (intValue4 & 17) != 16)) {
                    av8Var5.W();
                } else if (raceFlowModels$RaceTeam != null) {
                    av8Var5.d0(-2089734169);
                    e12.a(0, av8Var5, n9e.q(bkh.p(bkh.e(utc.a, 4.0f), 20.0f), hkg.b(raceFlowModels$RaceTeam.c), oyn.e));
                    av8Var5.s(false);
                } else {
                    av8Var5.d0(-2089434337);
                    av8Var5.s(false);
                }
                return Unit.a;
            case 11:
                RankingFragment rankingFragment = (RankingFragment) obj4;
                ((Integer) obj2).getClass();
                wlf wlfVar = (wlf) obj3;
                ((View) obj).getClass();
                wlfVar.getClass();
                if (wlfVar instanceof xlf) {
                    if (olf.a[((amf) rankingFragment.u.getValue()).ordinal()] == 1) {
                        UniqueTournament uniqueTournament2 = ((xlf) wlfVar).a.getUniqueTournament();
                        if (uniqueTournament2 != null) {
                            int id = uniqueTournament2.getId();
                            a99 a99Var2 = LeagueActivity.h0;
                            Context requireContext4 = rankingFragment.requireContext();
                            requireContext4.getClass();
                            a99.A(a99Var2, requireContext4, Integer.valueOf(id), 0, null, null, null, null, 4088);
                        }
                    } else {
                        Team team = ((xlf) wlfVar).a.getTeam();
                        if (team != null) {
                            int i26 = TeamActivity.Z;
                            Context requireContext5 = rankingFragment.requireContext();
                            requireContext5.getClass();
                            jle.r(requireContext5, team.getId(), null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                        }
                    }
                } else {
                    Unit unit = Unit.a;
                }
                return Unit.a;
            case 12:
                RefereeEventsFragment refereeEventsFragment = (RefereeEventsFragment) obj4;
                int intValue5 = ((Integer) obj).intValue();
                t6e t6eVar = (t6e) obj2;
                s6e s6eVar = (s6e) obj3;
                t6eVar.getClass();
                s6eVar.getClass();
                zsf zsfVar = (zsf) refereeEventsFragment.s.getValue();
                xw3.L(un0.z(zsfVar), null, null, new ly7(zsfVar, ((Referee) refereeEventsFragment.r.getValue()).getId(), t6eVar, intValue5, new aaf(7, refereeEventsFragment, s6eVar), null, 5), 3);
                return Unit.a;
            case 13:
                RiskyChatsDialog riskyChatsDialog = (RiskyChatsDialog) obj4;
                ((Integer) obj2).getClass();
                RiskyTopic riskyTopic = (RiskyTopic) obj3;
                ((View) obj).getClass();
                riskyTopic.getClass();
                ChatInterface chatInterfaceModel = riskyTopic.getChatInterfaceModel();
                if (chatInterfaceModel != null) {
                    int i27 = ChatActivity.Z;
                    Context requireContext6 = riskyChatsDialog.requireContext();
                    requireContext6.getClass();
                    uic.w(requireContext6, chatInterfaceModel, null, 44);
                }
                riskyChatsDialog.j();
                return Unit.a;
            case 14:
                ujg ujgVar = (ujg) obj4;
                int intValue6 = ((Integer) obj).intValue();
                String str4 = (String) obj2;
                b8d b8dVar = (b8d) obj3;
                str4.getClass();
                b8dVar.getClass();
                int ordinal = (((b8dVar instanceof i13) || ((KSerializer) ujgVar.b).getDescriptor().i(intValue6)) ? w7g.b : w7g.a).ordinal();
                if (ordinal == 0) {
                    ujgVar.d = ((String) ujgVar.d) + '/' + dmi.j('}', "{", str4);
                } else {
                    if (ordinal != 1) {
                        zzl.b();
                        return null;
                    }
                    ujgVar.C(str4, "{" + str4 + '}');
                }
                return Unit.a;
            case 15:
                mpg mpgVar = (mpg) obj4;
                e7d e7dVar = (e7d) obj;
                of3 of3Var5 = (of3) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                if ((intValue7 & 6) == 0) {
                    intValue7 |= ((av8) of3Var5).g(e7dVar) ? 4 : 2;
                }
                av8 av8Var6 = (av8) of3Var5;
                if (av8Var6.T(intValue7 & 1, (intValue7 & 19) != 18)) {
                    mpgVar.b(e7dVar.b, yqo.H(121262920, av8Var6, new yx0(e7dVar, 1 == true ? 1 : 0)), av8Var6, 48);
                } else {
                    av8Var6.W();
                }
                return Unit.a;
            case 16:
                koh kohVar = (koh) obj4;
                e7d e7dVar2 = (e7d) obj;
                of3 of3Var6 = (of3) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                if ((intValue8 & 6) == 0) {
                    intValue8 |= ((av8) of3Var6).g(e7dVar2) ? 4 : 2;
                }
                av8 av8Var7 = (av8) of3Var6;
                if (av8Var7.T(intValue8 & 1, (intValue8 & 19) != 18)) {
                    Object obj5 = e7dVar2.b;
                    if (((Set) av8Var7.k(zrg.a)).contains(obj5)) {
                        av8Var7.d0(1576267665);
                        av8Var7.s(false);
                    } else {
                        av8Var7.d0(1574916499);
                        av8Var7.a0(1159182959, obj5);
                        Object O = av8Var7.O();
                        if (O == nf3.a) {
                            Object obj6 = kohVar.get(obj5);
                            if (obj6 == null) {
                                obj6 = new tc3(1032736913, new bba(new rwc(), 17), true);
                                kohVar.put(obj5, obj6);
                            }
                            O = (ct8) obj6;
                            av8Var7.n0(O);
                        }
                        ((ct8) O).invoke(yqo.H(-804085656, av8Var7, new yx0(e7dVar2, i2)), av8Var7, 54);
                        av8Var7.s(false);
                        av8Var7.s(false);
                    }
                } else {
                    av8Var7.W();
                }
                return Unit.a;
            case 17:
                SearchActivity searchActivity = (SearchActivity) obj4;
                ((Integer) obj2).getClass();
                int i28 = SearchActivity.Q;
                ((View) obj).getClass();
                obj3.getClass();
                if (obj3 instanceof Player) {
                    Player player2 = (Player) obj3;
                    searchActivity.S().l(player2.getId(), obj3, SearchResponseKt.PLAYER_ENTITY);
                    nv.w0(searchActivity, player2.getId(), vv.PLAYER);
                    int i29 = PlayerActivity.Z;
                    jle.q(searchActivity, player2.getId(), 0, 0, null, false, null, null, 496);
                } else if (obj3 instanceof Team) {
                    Team team2 = (Team) obj3;
                    searchActivity.S().l(team2.getId(), obj3, "team");
                    Set set2 = wyh.a;
                    Sport sport3 = team2.getSport();
                    if (wyh.m(sport3 != null ? sport3.getSlug() : null)) {
                        nv.w0(searchActivity, team2.getId(), team2.getType() == 1 ? vv.TEAM : vv.CONSTRUCTOR);
                        joa joaVar2 = l5i.a;
                        l5i.k(searchActivity, team2.getType(), team2.getId());
                    } else {
                        Sport sport4 = team2.getSport();
                        if (Intrinsics.c(sport4 != null ? sport4.getSlug() : null, Sports.MMA)) {
                            nv.w0(searchActivity, team2.getId(), vv.TEAM);
                            int i30 = MmaFighterActivity.U;
                            f7a.x(team2.getId(), searchActivity);
                        } else {
                            nv.w0(searchActivity, team2.getId(), vv.TEAM);
                            int i31 = TeamActivity.Z;
                            jle.r(searchActivity, team2.getId(), null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                        }
                    }
                } else if (obj3 instanceof UniqueTournament) {
                    UniqueTournament uniqueTournament3 = (UniqueTournament) obj3;
                    searchActivity.S().l(uniqueTournament3.getId(), obj3, SearchResponseKt.LEAGUE_ENTITY);
                    nv.w0(searchActivity, uniqueTournament3.getId(), vv.UNIQUE_TOURNAMENT);
                    Set set3 = wyh.a;
                    if (Intrinsics.c(uniqueTournament3.getCategory().getSport().getSlug(), Sports.MMA)) {
                        int i32 = MmaOrganisationActivity.T;
                        inb.F(uniqueTournament3.getId(), searchActivity);
                    } else {
                        a99.A(LeagueActivity.h0, searchActivity, Integer.valueOf(uniqueTournament3.getId()), 0, null, null, null, null, 4088);
                    }
                } else if (obj3 instanceof Manager) {
                    Manager manager = (Manager) obj3;
                    searchActivity.S().l(manager.getId(), obj3, SearchResponseKt.MANAGER_ENTITY);
                    nv.w0(searchActivity, manager.getId(), vv.MANAGER);
                    int id2 = manager.getId();
                    Intent intent3 = new Intent(searchActivity, (Class<?>) ManagerActivity.class);
                    intent3.putExtra("MANAGER_ID", id2);
                    searchActivity.startActivity(intent3);
                } else if (obj3 instanceof Referee) {
                    Referee referee = (Referee) obj3;
                    searchActivity.S().l(referee.getId(), obj3, SearchResponseKt.REFEREE_ENTITY);
                    nv.w0(searchActivity, referee.getId(), vv.REFEREE);
                    int id3 = referee.getId();
                    String u = tba.u(referee);
                    u.getClass();
                    Intent intent4 = new Intent(searchActivity, (Class<?>) RefereeActivity.class);
                    intent4.putExtra("REFEREE_ID", id3);
                    intent4.putExtra("REFEREE_NAME", u);
                    searchActivity.startActivity(intent4);
                } else if (obj3 instanceof Event) {
                    Event event = (Event) obj3;
                    searchActivity.S().l(event.getId(), obj3, "event");
                    nv.w0(searchActivity, event.getId(), vv.EVENT);
                    wxf wxfVar3 = EventActivity.h0;
                    wxf.B(searchActivity, event.getId(), null, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                } else if (obj3 instanceof UniqueStage) {
                    UniqueStage uniqueStage = (UniqueStage) obj3;
                    searchActivity.S().l(uniqueStage.getId(), obj3, SearchResponseKt.UNIQUE_STAGE_ENTITY);
                    nv.w0(searchActivity, uniqueStage.getId(), vv.UNIQUE_STAGE);
                    int i33 = StageCategoryActivity.R;
                    yfa.J(searchActivity, uniqueStage);
                } else if (obj3 instanceof Stage) {
                    Stage stage = (Stage) obj3;
                    searchActivity.S().l(stage.getId(), obj3, "stage");
                    nv.w0(searchActivity, stage.getId(), vv.STAGE);
                    fff.i(StageDetailsActivity.T, searchActivity, stage.getId());
                } else if (obj3 instanceof Sport) {
                    Sport sport5 = (Sport) obj3;
                    searchActivity.S().l(sport5.getId(), obj3, SearchResponseKt.SPORT_ENTITY);
                    searchActivity.setResult(-1, new Intent().putExtra("EXTRA_SELECTED_SPORT_SLUG", sport5.getSlug()));
                    searchActivity.finish();
                }
                return Unit.a;
            case 18:
                ((f4h) obj4).c();
                return Unit.a;
            case 19:
                fm8 fm8Var = (fm8) obj4;
                e9i e9iVar = (e9i) obj;
                of3 of3Var7 = (of3) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                e9iVar.getClass();
                if ((intValue9 & 6) == 0) {
                    intValue9 |= ((av8) of3Var7).g(e9iVar) ? 4 : 2;
                }
                av8 av8Var8 = (av8) of3Var7;
                if (!av8Var8.T(intValue9 & 1, (intValue9 & 19) != 18)) {
                    av8Var8.W();
                } else if (fm8Var instanceof jjj) {
                    av8Var8.d0(1656068138);
                    tol.k(e9iVar, (jjj) fm8Var, av8Var8, intValue9 & 14);
                    av8Var8.s(false);
                } else if (fm8Var instanceof caa) {
                    av8Var8.d0(-201415726);
                    String a3 = ((caa) fm8Var).a.a(av8Var8);
                    yf8 yf8Var2 = xth.a;
                    udj.c(a3, null, lz.D(R.color.on_color_primary, av8Var8), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.h(), av8Var8, 0, 0, 130042);
                    av8Var8.s(false);
                } else if (fm8Var instanceof fvc) {
                    av8Var8.d0(1656080214);
                    yqo.l(e9iVar, (fvc) fm8Var, av8Var8, intValue9 & 14);
                    av8Var8.s(false);
                } else if (fm8Var instanceof nmj) {
                    av8Var8.d0(1656082827);
                    pco.s(e9iVar, (nmj) fm8Var, av8Var8, intValue9 & 14);
                    av8Var8.s(false);
                } else if (fm8Var instanceof omj) {
                    av8Var8.d0(1656085364);
                    k53.P(e9iVar, (omj) fm8Var, av8Var8, intValue9 & 14);
                    av8Var8.s(false);
                } else if (fm8Var instanceof dlj) {
                    av8Var8.d0(1656087757);
                    wnn.t(e9iVar, (dlj) fm8Var, av8Var8, intValue9 & 14);
                    av8Var8.s(false);
                } else if (fm8Var instanceof elj) {
                    av8Var8.d0(1656089971);
                    fcp.W(e9iVar, (elj) fm8Var, av8Var8, intValue9 & 14);
                    av8Var8.s(false);
                } else if (fm8Var instanceof ooj) {
                    av8Var8.d0(1656092333);
                    rfo.o(e9iVar, (ooj) fm8Var, av8Var8, intValue9 & 14);
                    av8Var8.s(false);
                } else if (fm8Var instanceof ylj) {
                    av8Var8.d0(1656094542);
                    n4o.q(e9iVar, (ylj) fm8Var, av8Var8, intValue9 & 14);
                    av8Var8.s(false);
                } else if (fm8Var instanceof gmj) {
                    av8Var8.d0(1656096815);
                    c6o.t(e9iVar, (gmj) fm8Var, av8Var8, intValue9 & 14);
                    av8Var8.s(false);
                } else if (fm8Var instanceof v8b) {
                    av8Var8.d0(1656099180);
                    u6h.q(e9iVar, (v8b) fm8Var, av8Var8, intValue9 & 14);
                    av8Var8.s(false);
                } else if (fm8Var instanceof nqj) {
                    av8Var8.d0(1656101451);
                    yqo.p(e9iVar, (nqj) fm8Var, av8Var8, intValue9 & 14);
                    av8Var8.s(false);
                } else if (fm8Var instanceof i4f) {
                    av8Var8.d0(1656103950);
                    fkf.n(e9iVar, (i4f) fm8Var, av8Var8, intValue9 & 14);
                    av8Var8.s(false);
                } else if (fm8Var instanceof nkh) {
                    av8Var8.d0(1656106157);
                    o02.w(e9iVar, (nkh) fm8Var, av8Var8, intValue9 & 14);
                    av8Var8.s(false);
                } else if (fm8Var instanceof tkh) {
                    av8Var8.d0(1656108625);
                    s02.z(e9iVar, (tkh) fm8Var, av8Var8, intValue9 & 14);
                    av8Var8.s(false);
                } else if (fm8Var instanceof mmi) {
                    av8Var8.d0(1656111024);
                    ww9.s(e9iVar, (mmi) fm8Var, av8Var8, intValue9 & 14);
                    av8Var8.s(false);
                } else {
                    if (!(fm8Var instanceof pmi)) {
                        throw dmi.h(av8Var8, 1656068022, false);
                    }
                    av8Var8.d0(1656113450);
                    lz.l(e9iVar, (pmi) fm8Var, av8Var8, intValue9 & 14);
                    av8Var8.s(false);
                }
                return Unit.a;
            case 20:
                return a(obj, obj2, obj3);
            case 21:
                View view = (View) obj;
                wt3.y((Integer) obj2, view, obj3);
                ((qzh) obj4).O(view, obj3);
                return Unit.a;
            case 22:
                StageCategoryEventsFragment stageCategoryEventsFragment = (StageCategoryEventsFragment) obj4;
                wt3.y((Integer) obj2, (View) obj, obj3);
                if (obj3 instanceof Stage) {
                    fff fffVar = StageDetailsActivity.T;
                    FragmentActivity requireActivity = stageCategoryEventsFragment.requireActivity();
                    requireActivity.getClass();
                    fffVar.g(requireActivity, (Stage) obj3, null);
                }
                return Unit.a;
            case 23:
                return b(obj, obj2, obj3);
            case 24:
                return c(obj, obj2, obj3);
            case 25:
                return d(obj, obj2, obj3);
            case 26:
                return e(obj, obj2, obj3);
            case 27:
                return f(obj, obj2, obj3);
            case 28:
                return g(obj, obj2, obj3);
            default:
                Context context3 = ((x6i) obj4).b;
                wt3.y((Integer) obj2, (View) obj, obj3);
                if (obj3 instanceof c7i) {
                    fff fffVar2 = StageDetailsActivity.T;
                    Stage stage2 = ((c7i) obj3).a;
                    Stage substage = stage2.getSubstage();
                    fffVar2.g(context3, stage2, substage != null ? Integer.valueOf(substage.getId()) : null);
                } else if (obj3 instanceof d7i) {
                    int i34 = StageCategoryActivity.R;
                    yfa.J(context3, ((d7i) obj3).a);
                }
                return Unit.a;
        }
    }
}
