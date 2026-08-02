package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.util.Size;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.s;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.sofascore.model.Sports;
import com.sofascore.model.fantasy.FantasyCompetitionType;
import com.sofascore.model.fantasy.FantasyPlayerPriceChanges;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.model.notifications.NotificationSetting;
import com.sofascore.results.R;
import com.sofascore.results.event.details.view.odds.FeaturedOddsView;
import com.sofascore.results.fantasy.teammanagement.substitutions.FantasySubstitutionsActivity;
import com.sofascore.results.fantasy.teammanagement.transfers.FantasyTransfersActivity;
import com.sofascore.results.fantasy.teammanagement.transfers.FantasyTransfersFragment;
import com.sofascore.results.fantasy.teammanagement.transfers.review.FantasyTransfersReviewFragment;
import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import com.sofascore.results.fantasy.userteam.FantasyUserSquadActivity;
import com.sofascore.results.feed.FeedFragment;
import com.sofascore.results.league.fragment.details.LeagueDetailsFragment;
import com.sofascore.results.main.favorites.FavoriteEntitiesFragment;
import com.sofascore.results.main.favorites.FavoriteEventsFragment;
import com.sofascore.results.main.leagues.StageCategoryEventsFragment;
import com.sofascore.results.main.matches.StageSeriesFragment;
import com.sofascore.results.main.matches.redesign.MainMatchesSwitcherFragment;
import com.sofascore.results.main.matches.redesign.MatchesRootFragment;
import com.sofascore.results.main.matches.redesign.trending.TrendingMatchesFragment;
import com.sofascore.results.main.matches.redesign.trendinggrid.TrendingGridFragment;
import com.sofascore.results.mma.mainScreen.MmaEventsFragment;
import com.sofascore.results.mvvm.base.AbstractActivity;
import com.sofascore.results.notifications.NotificationSettingsActivity;
import com.sofascore.results.onboarding.OnboardingViewModel;
import com.sofascore.results.onboarding.follow.model.OnboardingItemAdditionalIcon;
import com.sofascore.results.onboarding.follow.model.OnboardingItemUiModel;
import com.sofascore.results.onboarding.follow.model.d;
import com.sofascore.results.player.statistics.regular.PlayerSeasonStatisticsFragment;
import com.sofascore.results.view.typeheader.SegmentedButtonsView;
import com.sofascore.results.view.typeheader.TypeHeaderView;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class qa7 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qa7(e1d e1dVar, NotificationSettingsActivity notificationSettingsActivity, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 25;
        this.t = e1dVar;
        this.s = notificationSettingsActivity;
    }

    private final Object e(Object obj) {
        ku3 ku3Var = (ku3) this.s;
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        rq3 rq3Var = null;
        xw3.L(ku3Var, null, null, new u41(2, rq3Var, 8), 3);
        return xw3.L(ku3Var, null, null, new hgd(1, rq3Var, (Context) this.t), 3);
    }

    private final Object f(Object obj) {
        OnboardingViewModel onboardingViewModel = (OnboardingViewModel) this.t;
        Object obj2 = this.s;
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        if (obj2 instanceof Team) {
            return new lsd(d.c(onboardingViewModel.i(), (Team) obj2));
        }
        if (obj2 instanceof Player) {
            Player player = (Player) obj2;
            int id = player.getId();
            srd srdVar = srd.b;
            String t = tba.t(player);
            String sportSlug = player.getSportSlug();
            Team team = player.getTeam();
            return new lsd(new OnboardingItemUiModel(id, srdVar, t, sportSlug, team != null ? new OnboardingItemAdditionalIcon.TeamLogo(team.getId()) : null, 32));
        }
        if (obj2 instanceof UniqueTournament) {
            return new lsd(d.a(onboardingViewModel.i(), (UniqueTournament) obj2));
        }
        if (!(obj2 instanceof ksd)) {
            a70.r(mz1.m(obj2, "Unexpected item type: "));
            return null;
        }
        int ordinal = ((ksd) obj2).ordinal();
        if (ordinal == 0) {
            return nsd.a;
        }
        if (ordinal == 1) {
            return msd.a;
        }
        zzl.b();
        return null;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.t;
        switch (i) {
            case 0:
                return new qa7((wd8) this.s, (e1d) obj2, rq3Var, 0);
            case 1:
                qa7 qa7Var = new qa7((List) obj2, rq3Var, 1);
                qa7Var.s = obj;
                return qa7Var;
            case 2:
                qa7 qa7Var2 = new qa7((od7) obj2, rq3Var, 2);
                qa7Var2.s = obj;
                return qa7Var2;
            case 3:
                qa7 qa7Var3 = new qa7((if7) obj2, rq3Var, 3);
                qa7Var3.s = obj;
                return qa7Var3;
            case 4:
                return new qa7((FantasyCompetitionType) this.s, (gk7) obj2, rq3Var, 4);
            case 5:
                qa7 qa7Var4 = new qa7((FantasySubstitutionsActivity) obj2, rq3Var, 5);
                qa7Var4.s = obj;
                return qa7Var4;
            case 6:
                qa7 qa7Var5 = new qa7((FantasyTransfersActivity) obj2, rq3Var, 6);
                qa7Var5.s = obj;
                return qa7Var5;
            case 7:
                qa7 qa7Var6 = new qa7((FantasyTransfersFragment) obj2, rq3Var, 7);
                qa7Var6.s = obj;
                return qa7Var6;
            case 8:
                qa7 qa7Var7 = new qa7((FantasyTransfersReviewFragment) obj2, rq3Var, 8);
                qa7Var7.s = obj;
                return qa7Var7;
            case 9:
                return new qa7((Context) this.s, (ev6) obj2, rq3Var, 9);
            case 10:
                qa7 qa7Var8 = new qa7((FantasyUserSquadActivity) obj2, rq3Var, 10);
                qa7Var8.s = obj;
                return qa7Var8;
            case 11:
                qa7 qa7Var9 = new qa7((FavoriteEntitiesFragment) obj2, rq3Var, 11);
                qa7Var9.s = obj;
                return qa7Var9;
            case 12:
                qa7 qa7Var10 = new qa7((FavoriteEventsFragment) obj2, rq3Var, 12);
                qa7Var10.s = obj;
                return qa7Var10;
            case 13:
                qa7 qa7Var11 = new qa7((FeaturedOddsView) obj2, rq3Var, 13);
                qa7Var11.s = obj;
                return qa7Var11;
            case 14:
                qa7 qa7Var12 = new qa7((FeedFragment) obj2, rq3Var, 14);
                qa7Var12.s = obj;
                return qa7Var12;
            case 15:
                return new qa7((Size) this.s, (Bitmap) obj2, rq3Var, 15);
            case 16:
                return new qa7((ImageView) this.s, (Context) obj2, rq3Var, 16);
            case 17:
                qa7 qa7Var13 = new qa7((Function0) obj2, rq3Var, 17);
                qa7Var13.s = obj;
                return qa7Var13;
            case 18:
                qa7 qa7Var14 = new qa7((cma) obj2, rq3Var, 18);
                qa7Var14.s = obj;
                return qa7Var14;
            case 19:
                qa7 qa7Var15 = new qa7((LeagueDetailsFragment) obj2, rq3Var, 19);
                qa7Var15.s = obj;
                return qa7Var15;
            case 20:
                qa7 qa7Var16 = new qa7((k6b) obj2, rq3Var, 20);
                qa7Var16.s = obj;
                return qa7Var16;
            case 21:
                qa7 qa7Var17 = new qa7((MatchesRootFragment) obj2, rq3Var, 21);
                qa7Var17.s = obj;
                return qa7Var17;
            case 22:
                qa7 qa7Var18 = new qa7((s1c) obj2, rq3Var, 22);
                qa7Var18.s = obj;
                return qa7Var18;
            case 23:
                return new qa7((Context) this.s, (s5d) obj2, rq3Var, 23);
            case 24:
                return new qa7((ArrayList) this.s, (SnapshotStateList) obj2, rq3Var, 24);
            case 25:
                return new qa7((e1d) obj2, (NotificationSettingsActivity) this.s, rq3Var);
            case 26:
                qa7 qa7Var19 = new qa7((khd) obj2, rq3Var, 26);
                qa7Var19.s = obj;
                return qa7Var19;
            case 27:
                qa7 qa7Var20 = new qa7((Context) obj2, rq3Var, 27);
                qa7Var20.s = obj;
                return qa7Var20;
            case 28:
                qa7 qa7Var21 = new qa7((OnboardingViewModel) obj2, rq3Var, 28);
                qa7Var21.s = obj;
                return qa7Var21;
            default:
                qa7 qa7Var22 = new qa7((PlayerSeasonStatisticsFragment) obj2, rq3Var, 29);
                qa7Var22.s = obj;
                return qa7Var22;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                return ((qa7) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((qa7) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 2:
                return ((qa7) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 3:
                return ((qa7) create((gf7) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 4:
                return ((qa7) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 5:
                return ((qa7) create((ll7) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 6:
                return ((qa7) create((en7) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 7:
                return ((qa7) create((Integer) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 8:
                return ((qa7) create((en7) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 9:
                return ((qa7) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 10:
                return ((qa7) create((ro7) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 11:
                return ((qa7) create((List) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 12:
                return ((qa7) create((List) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 13:
                return ((qa7) create((fgf) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 14:
                return ((qa7) create((bv3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 15:
                return ((qa7) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 16:
                return ((qa7) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 17:
                return ((qa7) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 18:
                return ((qa7) create((qna) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 19:
                return ((qa7) create((sxa) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 20:
                return ((qa7) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 21:
                return ((qa7) create((String) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 22:
                ((qa7) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
                throw null;
            case 23:
                return ((qa7) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 24:
                return ((qa7) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 25:
                return ((qa7) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 26:
                return ((qa7) create((Pair) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 27:
                return ((qa7) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 28:
                return ((qa7) create(obj, (rq3) obj2)).invokeSuspend(Unit.a);
            default:
                return ((qa7) create((mle) obj, (rq3) obj2)).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02ac  */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        List H0;
        Object value;
        Object obj2;
        Object value2;
        nt9 a;
        Unsafe unsafe;
        long j;
        int intVolatile;
        int i2;
        boolean z;
        Collection j2;
        Fragment mainMatchesSwitcherFragment;
        hhd hhdVar;
        gv9 gv9Var;
        Object obj3;
        Object obj4;
        int i3;
        Integer valueOf;
        int i4;
        LinkedHashMap linkedHashMap;
        int i5;
        SharedPreferences d;
        Object obj5;
        Object obj6;
        int i6 = 5;
        int i7 = 4;
        int i8 = 3;
        int i9 = 2;
        switch (this.r) {
            case 0:
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                if (!((Boolean) ((e1d) this.t).getValue()).booleanValue()) {
                    wd8.a((wd8) this.s);
                }
                return Unit.a;
            case 1:
                ku3 ku3Var = (ku3) this.s;
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                List list = (List) this.t;
                xbb b = a.b();
                for (rz6 rz6Var : rz6.m) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj7 : list) {
                        if (((FantasyRoundPlayerUiModel) obj7).b == rz6Var) {
                            arrayList.add(obj7);
                        }
                    }
                    b.addAll(CollectionsKt.L0(CollectionsKt.H0(arrayList, new v66(20)), rz6Var.d));
                }
                while (true) {
                    for (FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel : CollectionsKt.H0(CollectionsKt.t0(list, b), new v66(19))) {
                        if (b.isEmpty()) {
                            i = 0;
                        } else {
                            ListIterator listIterator = b.listIterator(0);
                            i = 0;
                            while (true) {
                                hc9 hc9Var = (hc9) listIterator;
                                if (hc9Var.hasNext()) {
                                    if (((FantasyRoundPlayerUiModel) hc9Var.next()).b == fantasyRoundPlayerUiModel.b && (i = i + 1) < 0) {
                                        b.p();
                                        throw null;
                                    }
                                }
                            }
                        }
                        if (i < fantasyRoundPlayerUiModel.b.e && b.size() < 11) {
                            b.add(fantasyRoundPlayerUiModel);
                        }
                    }
                    if (b.size() >= 11) {
                        return a.a(b);
                    }
                    s9a.t(ku3Var);
                }
                break;
            case 2:
                ku3 ku3Var2 = (ku3) this.s;
                lu3 lu3Var3 = lu3.a;
                y6a.M(obj);
                od7 od7Var = (od7) this.t;
                rq3 rq3Var = null;
                xw3.L(ku3Var2, null, null, new jd7(od7Var, rq3Var, i8), 3);
                xw3.L(ku3Var2, null, null, new jd7(od7Var, rq3Var, i7), 3);
                xw3.L(ku3Var2, null, null, new jd7(od7Var, rq3Var, i6), 3);
                return Unit.a;
            case 3:
                if7 if7Var = (if7) this.t;
                gf7 gf7Var = (gf7) this.s;
                lu3 lu3Var4 = lu3.a;
                y6a.M(obj);
                ef7 ef7Var = gf7Var.b;
                int i10 = ef7Var != null ? hf7.a[ef7Var.ordinal()] : -1;
                if (i10 != 1) {
                    H0 = if7Var.e;
                    if (i10 == 2) {
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj8 : H0) {
                            if (((FantasyPlayerPriceChanges) obj8).getTotalPriceChange() < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                arrayList2.add(obj8);
                            }
                        }
                        H0 = CollectionsKt.H0(arrayList2, new se7(1));
                    }
                } else {
                    List list2 = if7Var.e;
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj9 : list2) {
                        if (((FantasyPlayerPriceChanges) obj9).getTotalPriceChange() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            arrayList3.add(obj9);
                        }
                    }
                    H0 = CollectionsKt.H0(arrayList3, new se7(i9));
                }
                List list3 = H0;
                fdi fdiVar = if7Var.f;
                do {
                    value = fdiVar.getValue();
                } while (!fdiVar.k(value, gf7.a((gf7) value, null, null, l6g.W(list3), null, 55)));
                return Unit.a;
            case 4:
                lu3 lu3Var5 = lu3.a;
                y6a.M(obj);
                if (((FantasyCompetitionType) this.s) == FantasyCompetitionType.WEEKLY) {
                    fdi fdiVar2 = ((gk7) this.t).r;
                    mei meiVar = mei.m;
                    fdiVar2.getClass();
                    fdiVar2.m(null, meiVar);
                }
                return Unit.a;
            case 5:
                ll7 ll7Var = (ll7) this.s;
                lu3 lu3Var6 = lu3.a;
                y6a.M(obj);
                MenuItem menuItem = ((FantasySubstitutionsActivity) this.t).L;
                if (menuItem != null) {
                    menuItem.setVisible(ll7Var.g);
                }
                return Unit.a;
            case 6:
                en7 en7Var = (en7) this.s;
                lu3 lu3Var7 = lu3.a;
                y6a.M(obj);
                if (en7Var instanceof cn7) {
                    int i11 = ze3.C;
                    FantasyTransfersActivity fantasyTransfersActivity = (FantasyTransfersActivity) this.t;
                    dd ddVar = fantasyTransfersActivity.K;
                    if (ddVar == null) {
                        Intrinsics.i("binding");
                        throw null;
                    }
                    CoordinatorLayout coordinatorLayout = (CoordinatorLayout) ddVar.b;
                    coordinatorLayout.getClass();
                    ze3 I = fkf.I(fantasyTransfersActivity, coordinatorLayout, ymh.e);
                    if (I != null) {
                        I.i();
                    }
                }
                return Unit.a;
            case 7:
                Integer num = (Integer) this.s;
                lu3 lu3Var8 = lu3.a;
                y6a.M(obj);
                FantasyTransfersFragment fantasyTransfersFragment = (FantasyTransfersFragment) this.t;
                if (fantasyTransfersFragment.t) {
                    fantasyTransfersFragment.t = false;
                    Iterator it = fantasyTransfersFragment.D().h.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            int i12 = ((FantasyRoundPlayerUiModel) next).a;
                            if (num != null && i12 == num.intValue()) {
                                obj2 = next;
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel2 = (FantasyRoundPlayerUiModel) obj2;
                    if (fantasyRoundPlayerUiModel2 != null) {
                        fantasyTransfersFragment.D().z(fantasyRoundPlayerUiModel2, true);
                        ln7 ln7Var = new ln7(fantasyTransfersFragment.D().f.a.a, fantasyTransfersFragment.D().f.a.j);
                        ln7Var.a.put(SearchResponseKt.PLAYER_ENTITY, FantasyRoundPlayerUiModel.b(fantasyRoundPlayerUiModel2, null, 0, false, false, false, null, null, 536870891));
                        v8a.D(fantasyTransfersFragment, ln7Var);
                    }
                }
                return Unit.a;
            case 8:
                FantasyTransfersReviewFragment fantasyTransfersReviewFragment = (FantasyTransfersReviewFragment) this.t;
                joa joaVar = fantasyTransfersReviewFragment.s;
                en7 en7Var2 = (en7) this.s;
                lu3 lu3Var9 = lu3.a;
                y6a.M(obj);
                if (Intrinsics.c(en7Var2, dn7.a)) {
                    ((ds8) joaVar.getValue()).show();
                } else if (Intrinsics.c(en7Var2, cn7.a)) {
                    ((ds8) joaVar.getValue()).dismiss();
                } else if (en7Var2 instanceof bn7) {
                    ((ds8) joaVar.getValue()).dismiss();
                    FragmentActivity requireActivity = fantasyTransfersReviewFragment.requireActivity();
                    requireActivity.getClass();
                    Intent intent = new Intent();
                    bn7 bn7Var = (bn7) en7Var2;
                    intent.putParcelableArrayListExtra("squad", new ArrayList<>(bn7Var.a));
                    intent.putParcelableArrayListExtra("transfers", new ArrayList<>(bn7Var.b));
                    intent.putExtra("balance", ((vn7) fantasyTransfersReviewFragment.D().o.a.getValue()).c);
                    intent.putExtra("freeTransfersUsed", ((vn7) fantasyTransfersReviewFragment.D().o.a.getValue()).a.c - ((vn7) fantasyTransfersReviewFragment.D().o.a.getValue()).d);
                    intent.putExtra("freeHit", fantasyTransfersReviewFragment.D().u);
                    intent.putExtra("wildcard", fantasyTransfersReviewFragment.D().v);
                    Unit unit = Unit.a;
                    z8e.C(requireActivity, -1, intent);
                }
                return Unit.a;
            case 9:
                lu3 lu3Var10 = lu3.a;
                y6a.M(obj);
                Context context = (Context) this.s;
                ht9 ht9Var = new ht9(context);
                ht9Var.c = vxd.j(((ev6) this.t).c, (Intrinsics.c(uaa.c, "api.sofascore.com/") ? "https://img.sofascore.com/" : dmi.q("https://", uaa.c)).concat("api/v1/"), "fantasy/competition/", "/officialPartnerLogo");
                ajh.a(context).a(ht9Var.a());
                return Unit.a;
            case 10:
                Object obj10 = (ro7) this.s;
                lu3 lu3Var11 = lu3.a;
                y6a.M(obj);
                FantasyUserSquadActivity fantasyUserSquadActivity = (FantasyUserSquadActivity) this.t;
                if (fantasyUserSquadActivity.M && (obj10 instanceof qo7)) {
                    fantasyUserSquadActivity.M = false;
                    qo7 qo7Var = (qo7) obj10;
                    AbstractActivity.M(fantasyUserSquadActivity, ((yd3) fantasyUserSquadActivity.K.getValue()).d, qo7Var.a().b, qo7Var.a().g, null, 56);
                    ((yd3) fantasyUserSquadActivity.K.getValue()).b.setBackground(new ty0(qo7Var.a().c.a));
                }
                return Unit.a;
            case 11:
                List list4 = (List) this.s;
                lu3 lu3Var12 = lu3.a;
                y6a.M(obj);
                krk krkVar = ((FavoriteEntitiesFragment) this.t).l;
                krkVar.getClass();
                TypeHeaderView.x(((ho8) krkVar).d, list4, null, 6);
                return Unit.a;
            case 12:
                List list5 = (List) this.s;
                lu3 lu3Var13 = lu3.a;
                y6a.M(obj);
                krk krkVar2 = ((FavoriteEventsFragment) this.t).l;
                krkVar2.getClass();
                TypeHeaderView.x(((go8) krkVar2).e, list5, Boolean.TRUE, 2);
                return Unit.a;
            case 13:
                fgf fgfVar = (fgf) this.s;
                lu3 lu3Var14 = lu3.a;
                y6a.M(obj);
                FeaturedOddsView featuredOddsView = (FeaturedOddsView) this.t;
                xmd oddsState = featuredOddsView.getOddsState();
                if (oddsState == null) {
                    return Unit.a;
                }
                gv9 gv9Var2 = oddsState.a;
                if (!gv9Var2.isEmpty()) {
                    ArrayList arrayList4 = new ArrayList(k13.r(gv9Var2, 10));
                    int i13 = 0;
                    for (Object obj11 : gv9Var2) {
                        int i14 = i13 + 1;
                        if (i13 < 0) {
                            b.q();
                            throw null;
                        }
                        and andVar = (and) obj11;
                        if (i13 == 0) {
                            old oldVar = andVar.a;
                            oldVar.getClass();
                            fgfVar.getClass();
                            andVar = new and(oldVar, fgfVar);
                        }
                        arrayList4.add(andVar);
                        i13 = i14;
                    }
                    featuredOddsView.setOddsState(xmd.a(oddsState, l6g.W(arrayList4), null, false, 30));
                }
                return Unit.a;
            case 14:
                FeedFragment feedFragment = (FeedFragment) this.t;
                bv3 bv3Var = (bv3) this.s;
                lu3 lu3Var15 = lu3.a;
                y6a.M(obj);
                bv3Var.getClass();
                String str = bv3Var.b;
                int i15 = l94.C;
                Context requireContext = feedFragment.requireContext();
                requireContext.getClass();
                krk krkVar3 = feedFragment.l;
                krkVar3.getClass();
                View view = ((ko8) krkVar3).c;
                Context requireContext2 = feedFragment.requireContext();
                requireContext2.getClass();
                String string = feedFragment.getString(R.string.feed_filter_country_changed, tv3.c(requireContext2, bv3Var.a));
                string.getClass();
                str.getClass();
                l94 x = wxf.x(requireContext, view, string, feedFragment.requireContext().getColor(R.color.surface_1), feedFragment.requireContext().getColor(R.color.surface_T), fc6.n((Intrinsics.c(uaa.c, "api.sofascore.com/") ? "https://img.sofascore.com/" : dmi.q("https://", uaa.c)).concat("api/v1/"), "country/", str, "/flag"), IronSourceError.ERROR_CAPPING_VALIDATION_FAILED, null, 1312);
                krk krkVar4 = feedFragment.l;
                krkVar4.getClass();
                x.h(((ko8) krkVar4).c);
                x.i();
                my7 C = feedFragment.C();
                str.getClass();
                C.d.a((k6c) C.l.getValue());
                u8c u8cVar = C.c;
                u8cVar.getClass();
                u8cVar.m = str;
                fdi fdiVar3 = C.m;
                do {
                    value2 = fdiVar3.getValue();
                } while (!fdiVar3.k(value2, dy7.a((dy7) value2, false, false, null, str, false, null, 895)));
                xw3.L(un0.z(C), null, null, new ky7(C, null, 1), 3);
                return Unit.a;
            case 15:
                lu3 lu3Var16 = lu3.a;
                y6a.M(obj);
                float width = ((Size) this.s).getWidth();
                Bitmap bitmap = (Bitmap) this.t;
                float min = Math.min(width / bitmap.getWidth(), r1.getHeight() / bitmap.getHeight());
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                createScaledBitmap.getClass();
                if (!createScaledBitmap.equals(bitmap)) {
                    bitmap.recycle();
                }
                return createScaledBitmap;
            case 16:
                lu3 lu3Var17 = lu3.a;
                y6a.M(obj);
                ImageView imageView = (ImageView) this.s;
                ia0 ia0Var = ia0.q;
                String imageUrl = ok3.p().e().getImageUrl();
                Context context2 = (Context) this.t;
                apf a2 = ajh.a(imageView.getContext());
                ht9 ht9Var2 = new ht9(imageView.getContext());
                ht9Var2.c = imageUrl;
                vt9.f(ht9Var2, imageView);
                wt9 I2 = rfo.I(imageView);
                z8e.Q(ht9Var2, context2, R.drawable.ic_profile_settings, (I2 == null || (a = I2.a()) == null) ? null : a.e, new Integer(R.color.on_color_primary));
                awj[] awjVarArr = {new urh()};
                sl6 sl6Var = st9.a;
                st9.b(ht9Var2, ph0.X(awjVarArr));
                a2.a(ht9Var2.a());
                return Unit.a;
            case 17:
                ku3 ku3Var3 = (ku3) this.s;
                lu3 lu3Var18 = lu3.a;
                y6a.M(obj);
                CoroutineContext coroutineContext = ku3Var3.getCoroutineContext();
                Function0 function0 = (Function0) this.t;
                try {
                    igj igjVar = new igj();
                    igjVar.f = bea.A(bea.x(coroutineContext), true, igjVar);
                    try {
                        do {
                            unsafe = rh0.a;
                            j = igj.g;
                            intVolatile = unsafe.getIntVolatile(igjVar, j);
                            if (intVolatile != 0) {
                                if (intVolatile != 2 && intVolatile != 3) {
                                    igj.o(intVolatile);
                                    throw null;
                                }
                            }
                            return function0.invoke();
                        } while (!unsafe.compareAndSwapInt(igjVar, j, intVolatile, 0));
                        return function0.invoke();
                    } finally {
                        igjVar.n();
                    }
                } catch (InterruptedException e) {
                    throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e);
                }
            case 18:
                lu3 lu3Var19 = lu3.a;
                y6a.M(obj);
                qna qnaVar = (qna) this.s;
                cw8 cw8Var = (cw8) qnaVar.b(5);
                if (!cw8Var.a.equals(qnaVar)) {
                    cw8Var.c();
                    cw8.d(cw8Var.b, qnaVar);
                }
                cma cmaVar = (cma) this.t;
                pna pnaVar = (pna) cw8Var;
                int o = ((qna) pnaVar.b).o();
                pnaVar.c();
                ((qna) pnaVar.b).q(o);
                pnaVar.c();
                ((qna) pnaVar.b).l();
                for (Map.Entry entry : cmaVar.b.entrySet()) {
                    una unaVar = (una) entry.getKey();
                    int intValue = ((Number) entry.getValue()).intValue();
                    if (cmaVar.e.contains(new Integer(intValue))) {
                        rna m = sna.m();
                        m.c();
                        ((sna) m.b).n(unaVar);
                        m.c();
                        ((sna) m.b).o(intValue);
                        pnaVar.c();
                        ((qna) pnaVar.b).k((sna) m.a());
                    }
                }
                return pnaVar.a();
            case 19:
                sxa sxaVar = (sxa) this.s;
                lu3 lu3Var20 = lu3.a;
                y6a.M(obj);
                LeagueDetailsFragment leagueDetailsFragment = (LeagueDetailsFragment) this.t;
                ((nb9) leagueDetailsFragment.Q.getValue()).l(sxaVar, new s26(1, leagueDetailsFragment.H(), kva.class, "onHistoricalSeasonChange", "onHistoricalSeasonChange(Lcom/sofascore/results/league/historical/compose/LeagueHistoricalDataModel$SeasonUiModel;)V", 0, 24));
                return Unit.a;
            case 20:
                lu3 lu3Var21 = lu3.a;
                y6a.M(obj);
                ku3 ku3Var4 = (ku3) this.s;
                k6b k6bVar = (k6b) this.t;
                g6b g6bVar = k6bVar.a;
                if (g6bVar.b().compareTo(e6b.b) >= 0) {
                    g6bVar.a(k6bVar);
                } else {
                    bea.p(ku3Var4.getCoroutineContext(), null);
                }
                return Unit.a;
            case 21:
                String str2 = (String) this.s;
                lu3 lu3Var22 = lu3.a;
                y6a.M(obj);
                if (str2 != null) {
                    MatchesRootFragment matchesRootFragment = (MatchesRootFragment) this.t;
                    r4a.M(matchesRootFragment.A().Q);
                    krk krkVar5 = matchesRootFragment.l;
                    krkVar5.getClass();
                    SegmentedButtonsView segmentedButtonsView = ((to8) krkVar5).f;
                    String str3 = (String) matchesRootFragment.A().u.d();
                    if (str3 == null) {
                        krk krkVar6 = matchesRootFragment.l;
                        krkVar6.getClass();
                        str3 = ((to8) krkVar6).f.getSelectedItem();
                    }
                    if (CollectionsKt.R(matchesRootFragment.t, (String) matchesRootFragment.A().o.d())) {
                        j2 = km5.a;
                        z = true;
                    } else {
                        mqi mqiVar = bii.a;
                        String string2 = matchesRootFragment.getString(bii.b((String) matchesRootFragment.A().o.d(), false));
                        string2.getClass();
                        s1h s1hVar = new s1h("matches", string2, true);
                        String str4 = (String) matchesRootFragment.A().o.d();
                        if (str4 != null) {
                            switch (str4.hashCode()) {
                                case -2005973498:
                                    if (str4.equals(Sports.BADMINTON)) {
                                        i2 = R.string.competitions;
                                        break;
                                    }
                                    break;
                                case -1452201948:
                                    if (str4.equals(Sports.E_SPORTS)) {
                                        i2 = R.string.categories;
                                        break;
                                    }
                                    break;
                                case -877324069:
                                    if (str4.equals(Sports.TENNIS)) {
                                        i2 = R.string.tournaments;
                                        break;
                                    }
                                    break;
                                case 394668909:
                                    str4.equals(Sports.FOOTBALL);
                                    break;
                            }
                            String string3 = matchesRootFragment.getString(i2);
                            string3.getClass();
                            z = true;
                            j2 = b.j(s1hVar, new s1h("competitions", string3, true));
                        }
                        i2 = R.string.drawer_leagues;
                        String string32 = matchesRootFragment.getString(i2);
                        string32.getClass();
                        z = true;
                        j2 = b.j(s1hVar, new s1h("competitions", string32, true));
                    }
                    SegmentedButtonsView.t(segmentedButtonsView, j2, str3, 4);
                    s childFragmentManager = matchesRootFragment.getChildFragmentManager();
                    childFragmentManager.getClass();
                    androidx.fragment.app.a aVar = new androidx.fragment.app.a(childFragmentManager);
                    aVar.r = z;
                    aVar.d = R.anim.in_with_fade;
                    aVar.e = R.anim.out_with_fade;
                    aVar.f = R.anim.in_with_fade;
                    aVar.g = R.anim.out_with_fade;
                    krk krkVar7 = matchesRootFragment.l;
                    krkVar7.getClass();
                    int id = ((to8) krkVar7).d.getId();
                    switch (str2.hashCode()) {
                        case 108225:
                            if (str2.equals(Sports.MMA)) {
                                mainMatchesSwitcherFragment = new MmaEventsFragment();
                                break;
                            }
                            mainMatchesSwitcherFragment = new MainMatchesSwitcherFragment();
                            break;
                        case 400486431:
                            if (str2.equals(Sports.MOTORSPORT)) {
                                mainMatchesSwitcherFragment = new StageSeriesFragment();
                                break;
                            }
                            mainMatchesSwitcherFragment = new MainMatchesSwitcherFragment();
                            break;
                        case 1227428899:
                            if (str2.equals(Sports.CYCLING)) {
                                mainMatchesSwitcherFragment = new StageCategoryEventsFragment();
                                break;
                            }
                            mainMatchesSwitcherFragment = new MainMatchesSwitcherFragment();
                            break;
                        case 1394955557:
                            if (str2.equals(Sports.TRENDING)) {
                                if (((Boolean) matchesRootFragment.x.getValue()).booleanValue()) {
                                    mainMatchesSwitcherFragment = new TrendingGridFragment();
                                    break;
                                } else {
                                    mainMatchesSwitcherFragment = new TrendingMatchesFragment();
                                    break;
                                }
                            }
                            mainMatchesSwitcherFragment = new MainMatchesSwitcherFragment();
                            break;
                        default:
                            mainMatchesSwitcherFragment = new MainMatchesSwitcherFragment();
                            break;
                    }
                    aVar.l(id, mainMatchesSwitcherFragment, null);
                    aVar.g(true, true);
                }
                return Unit.a;
            case 22:
                lu3 lu3Var23 = lu3.a;
                y6a.M(obj);
                throw null;
            case 23:
                s5d s5dVar = (s5d) this.t;
                lu3 lu3Var24 = lu3.a;
                y6a.M(obj);
                Context applicationContext = ((Context) this.s).getApplicationContext();
                applicationContext.getClass();
                if (((ia0) applicationContext).b) {
                    return Unit.a;
                }
                try {
                    p4d p4dVar = s5dVar.e;
                    if (p4dVar != null) {
                        p4dVar.close();
                    }
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Throwable unused) {
                }
                s5dVar.e = null;
                return Unit.a;
            case 24:
                lu3 lu3Var25 = lu3.a;
                y6a.M(obj);
                ArrayList arrayList5 = (ArrayList) this.s;
                SnapshotStateList snapshotStateList = (SnapshotStateList) this.t;
                if (arrayList5.size() <= 0) {
                    return Unit.a;
                }
                if (arrayList5.get(0) == null) {
                    new ArrayList(snapshotStateList.size());
                    if (snapshotStateList.size() <= 0) {
                        throw null;
                    }
                    snapshotStateList.get(0).getClass();
                    pvd.j();
                } else {
                    pvd.j();
                }
                return null;
            case 25:
                NotificationSettingsActivity notificationSettingsActivity = (NotificationSettingsActivity) this.s;
                lu3 lu3Var26 = lu3.a;
                y6a.M(obj);
                e1d e1dVar = (e1d) this.t;
                int i16 = NotificationSettingsActivity.O;
                hhd hhdVar2 = (hhd) ((vnb) e1dVar.getValue()).a();
                if (Intrinsics.c(hhdVar2 != null ? Boolean.valueOf(hhdVar2.a) : null, Boolean.TRUE) && (hhdVar = (hhd) ((vnb) e1dVar.getValue()).a()) != null && (gv9Var = hhdVar.c) != null) {
                    Iterator<E> it2 = gv9Var.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            Object next2 = it2.next();
                            if (Intrinsics.c(((fhd) next2).a, (String) notificationSettingsActivity.L.getValue())) {
                                obj3 = next2;
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                    fhd fhdVar = (fhd) obj3;
                    if (fhdVar != null) {
                        qea.C(notificationSettingsActivity, fhdVar.a, fhdVar.b.b(notificationSettingsActivity), (String) notificationSettingsActivity.M.getValue());
                    }
                }
                return Unit.a;
            case 26:
                Pair pair = (Pair) this.s;
                lu3 lu3Var27 = lu3.a;
                y6a.M(obj);
                List list6 = (List) pair.a;
                List list7 = (List) pair.b;
                LinkedHashMap i17 = wxf.i(((khd) this.t).i());
                Context i18 = ((khd) this.t).i();
                SharedPreferences sharedPreferences = uic.j;
                if (sharedPreferences == null) {
                    Context applicationContext2 = i18.getApplicationContext();
                    synchronized (uic.i) {
                        d = a5f.d(applicationContext2);
                        uic.j = d;
                    }
                    d.getClass();
                    sharedPreferences = d;
                }
                boolean z2 = !sharedPreferences.getBoolean("ADD_RINGTONE_PREFv2", true);
                list6.getClass();
                list7.getClass();
                nh0 X0 = CollectionsKt.X0(list7);
                int c = sub.c(k13.r(X0, 10));
                if (c < 16) {
                    c = 16;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(c);
                Iterator it3 = X0.iterator();
                while (true) {
                    sc5 sc5Var = (sc5) it3;
                    if (!sc5Var.b.hasNext()) {
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                        for (Object obj12 : list6) {
                            String groupInSettingsScreen = ((NotificationSetting) obj12).getGroupInSettingsScreen();
                            Object obj13 = linkedHashMap3.get(groupInSettingsScreen);
                            if (obj13 == null) {
                                obj13 = wv8.n(linkedHashMap3, groupInSettingsScreen);
                            }
                            ((List) obj13).add(obj12);
                        }
                        ArrayList arrayList6 = new ArrayList(linkedHashMap3.size());
                        Iterator it4 = linkedHashMap3.entrySet().iterator();
                        while (it4.hasNext()) {
                            Map.Entry entry2 = (Map.Entry) it4.next();
                            String str5 = (String) entry2.getKey();
                            List<NotificationSetting> list8 = (List) entry2.getValue();
                            if (Sports.INSTANCE.getEntries().contains(str5)) {
                                Integer d2 = wyh.d(str5);
                                if (d2 == null) {
                                    a70.p(dmi.q("Sport is not supported: ", str5));
                                    return null;
                                }
                                i3 = d2.intValue();
                            } else if (Intrinsics.c(str5, SearchResponseKt.PLAYER_ENTITY)) {
                                i3 = R.string.notifications_player_driver_group;
                            } else if (Intrinsics.c(str5, "user")) {
                                i3 = R.string.gaming;
                            } else if (Intrinsics.c(str5, "fantasy")) {
                                i3 = R.string.fantasy;
                            } else {
                                if (!Intrinsics.c(str5, "other")) {
                                    obj4 = null;
                                    a70.p(dmi.q("This notification group is not supported: ", str5));
                                    return obj4;
                                }
                                i3 = R.string.other;
                            }
                            obj4 = null;
                            q9k q9kVar = new q9k(i3);
                            int hashCode = str5.hashCode();
                            if (hashCode == -985752863) {
                                if (str5.equals(SearchResponseKt.PLAYER_ENTITY)) {
                                    valueOf = Integer.valueOf(R.string.performance_and_news);
                                    if (valueOf == null) {
                                    }
                                    if (list8 == null) {
                                    }
                                    i4 = 0;
                                    while (r8.hasNext()) {
                                    }
                                    Iterator it5 = it4;
                                    LinkedHashMap linkedHashMap4 = i17;
                                    m9k m9kVar = new m9k(fc6.g(i4, list8.size(), "/"));
                                    if (!Sports.INSTANCE.getEntries().contains(str5)) {
                                    }
                                    arrayList6.add(new fhd(str5, q9kVar, r19, m9kVar, i5));
                                    it4 = it5;
                                    i17 = linkedHashMap4;
                                }
                                valueOf = null;
                                if (valueOf == null) {
                                }
                                if (list8 == null) {
                                }
                                i4 = 0;
                                while (r8.hasNext()) {
                                }
                                Iterator it52 = it4;
                                LinkedHashMap linkedHashMap42 = i17;
                                m9k m9kVar2 = new m9k(fc6.g(i4, list8.size(), "/"));
                                if (!Sports.INSTANCE.getEntries().contains(str5)) {
                                }
                                arrayList6.add(new fhd(str5, q9kVar, r19, m9kVar2, i5));
                                it4 = it52;
                                i17 = linkedHashMap42;
                            } else if (hashCode != 3599307) {
                                if (hashCode == 106069776 && str5.equals("other")) {
                                    valueOf = Integer.valueOf(R.string.other_body);
                                    q9k q9kVar2 = valueOf == null ? new q9k(valueOf.intValue()) : null;
                                    if (list8 == null && list8.isEmpty()) {
                                        i4 = 0;
                                    } else {
                                        i4 = 0;
                                        for (NotificationSetting notificationSetting : list8) {
                                            Iterator it6 = it4;
                                            if (notificationSetting.getEnabled()) {
                                                linkedHashMap = i17;
                                                if (Intrinsics.c((Boolean) i17.get(notificationSetting.getChannelId()), Boolean.TRUE) && (i4 = i4 + 1) < 0) {
                                                    b.p();
                                                    throw null;
                                                }
                                            } else {
                                                linkedHashMap = i17;
                                            }
                                            it4 = it6;
                                            i17 = linkedHashMap;
                                        }
                                    }
                                    Iterator it522 = it4;
                                    LinkedHashMap linkedHashMap422 = i17;
                                    m9k m9kVar22 = new m9k(fc6.g(i4, list8.size(), "/"));
                                    if (!Sports.INSTANCE.getEntries().contains(str5)) {
                                        i5 = wyh.a(str5);
                                    } else if (str5.equals(SearchResponseKt.PLAYER_ENTITY)) {
                                        i5 = R.drawable.ic_players_notifications;
                                    } else if (str5.equals("user")) {
                                        i5 = R.drawable.ic_gaming_notifications;
                                    } else if (str5.equals("fantasy")) {
                                        i5 = R.drawable.ic_main_fantasy;
                                    } else {
                                        if (!str5.equals("other")) {
                                            a70.p("This notification group is not supported: ".concat(str5));
                                            return obj4;
                                        }
                                        i5 = R.drawable.ic_crowdsourcing;
                                    }
                                    arrayList6.add(new fhd(str5, q9kVar, q9kVar2, m9kVar22, i5));
                                    it4 = it522;
                                    i17 = linkedHashMap422;
                                }
                                valueOf = null;
                                if (valueOf == null) {
                                }
                                if (list8 == null) {
                                }
                                i4 = 0;
                                while (r8.hasNext()) {
                                }
                                Iterator it5222 = it4;
                                LinkedHashMap linkedHashMap4222 = i17;
                                m9k m9kVar222 = new m9k(fc6.g(i4, list8.size(), "/"));
                                if (!Sports.INSTANCE.getEntries().contains(str5)) {
                                }
                                arrayList6.add(new fhd(str5, q9kVar, q9kVar2, m9kVar222, i5));
                                it4 = it5222;
                                i17 = linkedHashMap4222;
                            } else {
                                if (str5.equals("user")) {
                                    valueOf = Integer.valueOf(R.string.gaming_body);
                                    if (valueOf == null) {
                                    }
                                    if (list8 == null) {
                                    }
                                    i4 = 0;
                                    while (r8.hasNext()) {
                                    }
                                    Iterator it52222 = it4;
                                    LinkedHashMap linkedHashMap42222 = i17;
                                    m9k m9kVar2222 = new m9k(fc6.g(i4, list8.size(), "/"));
                                    if (!Sports.INSTANCE.getEntries().contains(str5)) {
                                    }
                                    arrayList6.add(new fhd(str5, q9kVar, q9kVar2, m9kVar2222, i5));
                                    it4 = it52222;
                                    i17 = linkedHashMap42222;
                                }
                                valueOf = null;
                                if (valueOf == null) {
                                }
                                if (list8 == null) {
                                }
                                i4 = 0;
                                while (r8.hasNext()) {
                                }
                                Iterator it522222 = it4;
                                LinkedHashMap linkedHashMap422222 = i17;
                                m9k m9kVar22222 = new m9k(fc6.g(i4, list8.size(), "/"));
                                if (!Sports.INSTANCE.getEntries().contains(str5)) {
                                }
                                arrayList6.add(new fhd(str5, q9kVar, q9kVar2, m9kVar22222, i5));
                                it4 = it522222;
                                i17 = linkedHashMap422222;
                            }
                        }
                        ((khd) this.t).n(new hhd(null, 31), new gk(this.t, l6g.W(CollectionsKt.H0(arrayList6, new mr3(linkedHashMap2, 1))), z2, 9));
                        return Unit.a;
                    }
                    IndexedValue indexedValue = (IndexedValue) sc5Var.next();
                    linkedHashMap2.put(indexedValue.b, Integer.valueOf(indexedValue.a));
                }
                break;
            case 27:
                return e(obj);
            case 28:
                return f(obj);
            default:
                mle mleVar = (mle) this.s;
                lu3 lu3Var28 = lu3.a;
                y6a.M(obj);
                UniqueTournament uniqueTournament = mleVar.a;
                String str6 = mleVar.b;
                String str7 = mleVar.c;
                PlayerSeasonStatisticsFragment playerSeasonStatisticsFragment = (PlayerSeasonStatisticsFragment) this.t;
                e1d e1dVar2 = playerSeasonStatisticsFragment.L;
                playerSeasonStatisticsFragment.R = str7;
                Iterator it7 = ((List) ((eoh) playerSeasonStatisticsFragment.K).getValue()).iterator();
                while (true) {
                    if (it7.hasNext()) {
                        obj5 = it7.next();
                        if (((UniqueTournament) obj5).getId() == uniqueTournament.getId()) {
                        }
                    } else {
                        obj5 = null;
                    }
                }
                UniqueTournament uniqueTournament2 = (UniqueTournament) obj5;
                if (uniqueTournament2 != null) {
                    ((eoh) playerSeasonStatisticsFragment.M).setValue(uniqueTournament2);
                    Object obj14 = (List) playerSeasonStatisticsFragment.I.get(Integer.valueOf(uniqueTournament2.getId()));
                    if (obj14 == null) {
                        obj14 = km5.a;
                    }
                    ((eoh) e1dVar2).setValue(obj14);
                    Iterator it8 = ((List) ((eoh) e1dVar2).getValue()).iterator();
                    while (true) {
                        if (it8.hasNext()) {
                            Object next3 = it8.next();
                            if (Intrinsics.c(((Season) next3).getYear(), str6)) {
                                obj6 = next3;
                            }
                        } else {
                            obj6 = null;
                        }
                    }
                    ((eoh) playerSeasonStatisticsFragment.N).setValue((Season) obj6);
                    playerSeasonStatisticsFragment.K();
                }
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qa7(Object obj, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qa7(Object obj, Object obj2, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.s = obj;
        this.t = obj2;
    }
}
