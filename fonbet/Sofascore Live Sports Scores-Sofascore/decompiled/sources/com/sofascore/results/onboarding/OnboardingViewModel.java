package com.sofascore.results.onboarding;

import android.app.Application;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.sofascore.model.FirebaseBundle;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.newNetwork.PlayerDetailsResponse;
import com.sofascore.model.newNetwork.TeamDetailsResponse;
import com.sofascore.model.newNetwork.UniqueTournamentResponse;
import com.sofascore.model.wc26.WorldCupCountry;
import com.sofascore.results.league.service.LeagueWorker;
import com.sofascore.results.onboarding.OnboardingViewModel;
import com.sofascore.results.onboarding.follow.model.OnboardingItemUiModel;
import com.sofascore.results.onboarding.follow.model.d;
import com.sofascore.results.player.PlayerWorker;
import com.sofascore.results.service.OrderedSportsWorker;
import com.sofascore.results.service.PinnedLeagueWorker;
import com.sofascore.results.team.TeamWorker;
import defpackage.a70;
import defpackage.ard;
import defpackage.asd;
import defpackage.brd;
import defpackage.crd;
import defpackage.dmi;
import defpackage.drd;
import defpackage.dv3;
import defpackage.erd;
import defpackage.etd;
import defpackage.f5d;
import defpackage.fdi;
import defpackage.fg0;
import defpackage.fqg;
import defpackage.frd;
import defpackage.gdi;
import defpackage.grd;
import defpackage.gtd;
import defpackage.gv9;
import defpackage.hkg;
import defpackage.hof;
import defpackage.hpo;
import defpackage.hq4;
import defpackage.hrd;
import defpackage.ia0;
import defpackage.j0j;
import defpackage.k13;
import defpackage.l6g;
import defpackage.la8;
import defpackage.ltd;
import defpackage.lu3;
import defpackage.md4;
import defpackage.me4;
import defpackage.mha;
import defpackage.mnc;
import defpackage.mz1;
import defpackage.n9e;
import defpackage.nf6;
import defpackage.nv;
import defpackage.o46;
import defpackage.o63;
import defpackage.pco;
import defpackage.rq3;
import defpackage.sq3;
import defpackage.srd;
import defpackage.tj;
import defpackage.tl;
import defpackage.tnb;
import defpackage.uf0;
import defpackage.un0;
import defpackage.unb;
import defpackage.uwg;
import defpackage.vel;
import defpackage.vf0;
import defpackage.vnb;
import defpackage.vxd;
import defpackage.w3b;
import defpackage.wf0;
import defpackage.wu;
import defpackage.wve;
import defpackage.x2g;
import defpackage.xf0;
import defpackage.xsd;
import defpackage.xw3;
import defpackage.y6a;
import defpackage.yaa;
import defpackage.ynb;
import defpackage.ysd;
import defpackage.zic;
import defpackage.zsd;
import defpackage.zzl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/sofascore/results/onboarding/OnboardingViewModel;", "Lynb;", "Lysd;", "Lhrd;", "Lmrd;", "OnboardingSavedState", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OnboardingViewModel extends ynb {
    public final fqg l;
    public final uwg m;
    public final j0j n;
    public final w3b o;
    public final wve p;
    public final String q;
    public final boolean r;
    public int s;
    public boolean t;
    public boolean u;
    public xf0 v;
    public final fdi w;
    public final hof x;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sofascore/results/onboarding/OnboardingViewModel$OnboardingSavedState;", "Landroid/os/Parcelable;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnboardingSavedState implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<OnboardingSavedState> CREATOR = new a();
        public final int a;
        public final boolean b;
        public final List c;

        public OnboardingSavedState(int i, boolean z, List list) {
            list.getClass();
            this.a = i;
            this.b = z;
            this.c = list;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnboardingSavedState)) {
                return false;
            }
            OnboardingSavedState onboardingSavedState = (OnboardingSavedState) obj;
            return this.a == onboardingSavedState.a && this.b == onboardingSavedState.b && Intrinsics.c(this.c, onboardingSavedState.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + dmi.e(Integer.hashCode(this.a) * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnboardingSavedState(currentStep=");
            sb.append(this.a);
            sb.append(", showSteps=");
            sb.append(this.b);
            sb.append(", selectedItems=");
            return mz1.p(sb, this.c, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(this.a);
            parcel.writeInt(this.b ? 1 : 0);
            List list = this.c;
            parcel.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((OnboardingItemUiModel) it.next()).writeToParcel(parcel, i);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingViewModel(Application application, fqg fqgVar, uwg uwgVar, j0j j0jVar, w3b w3bVar, wve wveVar) {
        super(application, tnb.a);
        Object value;
        fqgVar.getClass();
        uwgVar.getClass();
        j0jVar.getClass();
        w3bVar.getClass();
        wveVar.getClass();
        this.l = fqgVar;
        this.m = uwgVar;
        this.n = j0jVar;
        this.o = w3bVar;
        this.p = wveVar;
        this.q = dv3.c();
        vel velVar = vel.a;
        this.r = vel.d();
        fdi a = gdi.a("");
        this.w = a;
        this.x = pco.w(new o63(11, la8.a(hkg.H(hkg.E(a, 300L)), new tl((rq3) null, this, 17)), this), un0.z(this));
        OnboardingSavedState onboardingSavedState = (OnboardingSavedState) fqgVar.a("onboarding_state");
        ysd ysdVar = onboardingSavedState != null ? new ysd(onboardingSavedState.a, onboardingSavedState.b, l6g.W(onboardingSavedState.c), 20) : new ysd(0, false, null, 31);
        fdi fdiVar = this.e;
        do {
            value = fdiVar.getValue();
            ((vnb) value).getClass();
        } while (!fdiVar.k(value, new unb(ysdVar)));
        xw3.L(un0.z(this), hq4.c, null, new o46(this, null), 2);
    }

    @Override // defpackage.ltk
    public final void e() {
        fg0.a.l(null);
    }

    public final String t() {
        gv9 gv9Var;
        OnboardingItemUiModel onboardingItemUiModel;
        String str;
        ysd ysdVar = (ysd) l().a();
        if (ysdVar == null || (gv9Var = ysdVar.d) == null || (onboardingItemUiModel = (OnboardingItemUiModel) CollectionsKt.firstOrNull(gv9Var)) == null || (str = onboardingItemUiModel.d) == null) {
            return null;
        }
        if (gv9Var.isEmpty()) {
            return str;
        }
        Iterator<E> it = gv9Var.iterator();
        while (it.hasNext()) {
            if (!Intrinsics.c(((OnboardingItemUiModel) it.next()).d, str)) {
                return null;
            }
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object u(xf0 xf0Var, sq3 sq3Var) {
        gtd gtdVar;
        int i;
        ArrayList arrayList;
        PlayerDetailsResponse playerDetailsResponse;
        Player player;
        Team team;
        TeamDetailsResponse teamDetailsResponse;
        Team team2;
        UniqueTournamentResponse uniqueTournamentResponse;
        UniqueTournament uniqueTournament;
        if (sq3Var instanceof gtd) {
            gtdVar = (gtd) sq3Var;
            int i2 = gtdVar.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gtdVar.u = i2 - Integer.MIN_VALUE;
                Object obj = gtdVar.s;
                lu3 lu3Var = lu3.a;
                i = gtdVar.u;
                if (i != 0) {
                    y6a.M(obj);
                    this.v = xf0Var;
                    ArrayList arrayList2 = new ArrayList();
                    if (xf0Var instanceof vf0) {
                        int i3 = ((vf0) xf0Var).a;
                        gtdVar.r = arrayList2;
                        gtdVar.u = 1;
                        Object i4 = this.p.i(i3, gtdVar);
                        if (i4 != lu3Var) {
                            obj = i4;
                            arrayList = arrayList2;
                            playerDetailsResponse = (PlayerDetailsResponse) yaa.x((x2g) obj);
                            if (playerDetailsResponse != null) {
                                arrayList.add(d.b(player));
                                team = player.getTeam();
                                if (team != null) {
                                }
                            }
                        }
                    } else if (xf0Var instanceof wf0) {
                        int i5 = ((wf0) xf0Var).a;
                        gtdVar.r = arrayList2;
                        gtdVar.u = 2;
                        Object k = this.n.k(i5, gtdVar);
                        if (k != lu3Var) {
                            obj = k;
                            arrayList = arrayList2;
                            teamDetailsResponse = (TeamDetailsResponse) yaa.x((x2g) obj);
                            if (teamDetailsResponse != null) {
                                arrayList.add(d.c(i(), team2));
                            }
                        }
                    } else {
                        if (!(xf0Var instanceof uf0)) {
                            zzl.b();
                            return null;
                        }
                        int i6 = ((uf0) xf0Var).a;
                        gtdVar.r = arrayList2;
                        gtdVar.u = 3;
                        Object q0 = this.o.q0(i6, gtdVar);
                        if (q0 != lu3Var) {
                            obj = q0;
                            arrayList = arrayList2;
                            uniqueTournamentResponse = (UniqueTournamentResponse) obj;
                            if (uniqueTournamentResponse != null) {
                                arrayList.add(d.a(i(), uniqueTournament));
                            }
                        }
                    }
                    return lu3Var;
                }
                if (i == 1) {
                    arrayList = gtdVar.r;
                    y6a.M(obj);
                    playerDetailsResponse = (PlayerDetailsResponse) yaa.x((x2g) obj);
                    if (playerDetailsResponse != null && (player = playerDetailsResponse.getPlayer()) != null) {
                        arrayList.add(d.b(player));
                        team = player.getTeam();
                        if (team != null) {
                            arrayList.add(d.c(i(), team));
                        }
                    }
                } else if (i == 2) {
                    arrayList = gtdVar.r;
                    y6a.M(obj);
                    teamDetailsResponse = (TeamDetailsResponse) yaa.x((x2g) obj);
                    if (teamDetailsResponse != null && (team2 = teamDetailsResponse.getTeam()) != null) {
                        arrayList.add(d.c(i(), team2));
                    }
                } else {
                    if (i != 3) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    arrayList = gtdVar.r;
                    y6a.M(obj);
                    uniqueTournamentResponse = (UniqueTournamentResponse) obj;
                    if (uniqueTournamentResponse != null && (uniqueTournament = uniqueTournamentResponse.getUniqueTournament()) != null) {
                        arrayList.add(d.a(i(), uniqueTournament));
                    }
                }
                if (!arrayList.isEmpty()) {
                    return Unit.a;
                }
                n(null, new tj(this.s, arrayList, 7));
                Unit unit = Unit.a;
                y();
                return Unit.a;
            }
        }
        gtdVar = new gtd(this, sq3Var);
        Object obj2 = gtdVar.s;
        lu3 lu3Var2 = lu3.a;
        i = gtdVar.u;
        if (i != 0) {
        }
        if (!arrayList.isEmpty()) {
        }
    }

    public final boolean v() {
        ysd ysdVar;
        gv9<OnboardingItemUiModel> gv9Var;
        xf0 xf0Var = this.v;
        uf0 uf0Var = xf0Var instanceof uf0 ? (uf0) xf0Var : null;
        if (uf0Var == null || (ysdVar = (ysd) l().a()) == null || (gv9Var = ysdVar.d) == null || gv9Var.isEmpty()) {
            return false;
        }
        for (OnboardingItemUiModel onboardingItemUiModel : gv9Var) {
            if (onboardingItemUiModel.b == srd.c && onboardingItemUiModel.a == uf0Var.a) {
                return true;
            }
        }
        return false;
    }

    public final boolean w() {
        gv9 gv9Var;
        ysd ysdVar = (ysd) l().a();
        if (ysdVar == null || (gv9Var = ysdVar.d) == null) {
            return false;
        }
        vel velVar = vel.a;
        List list = (List) vel.g.getValue();
        ArrayList arrayList = new ArrayList(k13.r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((WorldCupCountry) it.next()).getTeamId()));
        }
        Set W0 = CollectionsKt.W0(arrayList);
        ArrayList arrayList2 = new ArrayList(k13.r(gv9Var, 10));
        Iterator<E> it2 = gv9Var.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Integer.valueOf(((OnboardingItemUiModel) it2.next()).a));
        }
        if (arrayList2.isEmpty()) {
            return false;
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            int intValue = ((Number) it3.next()).intValue();
            if (intValue == 16 || W0.contains(Integer.valueOf(intValue))) {
                return true;
            }
        }
        return false;
    }

    public final void x(final hrd hrdVar) {
        final int i = 0;
        if (hrdVar instanceof brd) {
            n(null, new Function1(this) { // from class: dtd
                public final /* synthetic */ OnboardingViewModel b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i2 = i;
                    hrd hrdVar2 = hrdVar;
                    OnboardingViewModel onboardingViewModel = this.b;
                    switch (i2) {
                        case 0:
                            ysd ysdVar = (ysd) obj;
                            ysdVar.getClass();
                            Context i3 = onboardingViewModel.i();
                            zic zicVar = xsd.c;
                            int i4 = ysdVar.a;
                            zicVar.getClass();
                            nv.d0(i3, zic.H(i4).b, ((brd) hrdVar2).a.a, i4);
                            return ysd.a(ysdVar, 1 + i4, null, null, null, 30);
                        default:
                            ysd ysdVar2 = (ysd) obj;
                            ysdVar2.getClass();
                            gv9 gv9Var = ysdVar2.d;
                            if (!onboardingViewModel.t && !gv9Var.contains(((erd) hrdVar2).a)) {
                                onboardingViewModel.t = true;
                                onboardingViewModel.k(mrd.a);
                            }
                            OnboardingItemUiModel onboardingItemUiModel = ((erd) hrdVar2).a;
                            return ysd.a(ysdVar2, 0, null, l6g.W(gv9Var.contains(onboardingItemUiModel) ? CollectionsKt.s0(gv9Var, onboardingItemUiModel) : CollectionsKt.w0(gv9Var, a.c(onboardingItemUiModel))), null, 23);
                    }
                }
            });
            Unit unit = Unit.a;
            y();
            return;
        }
        if (hrdVar.equals(crd.a)) {
            n(null, new asd(this, 3));
            Unit unit2 = Unit.a;
            y();
            return;
        }
        final int i2 = 1;
        if (hrdVar.equals(ard.a)) {
            this.u = true;
            Context i3 = i();
            FirebaseBundle firebaseBundle = new FirebaseBundle();
            ia0 ia0Var = ia0.q;
            FirebaseAnalytics d = me4.d((f5d) me4.e(), "onboarding_finish", firebaseBundle, i3);
            d.a.e(n9e.K(firebaseBundle), null, "onboarding_finish", false);
            z();
            return;
        }
        if (hrdVar.equals(grd.a)) {
            this.u = true;
            ysd ysdVar = (ysd) l().a();
            if (ysdVar != null) {
                int i4 = ysdVar.a;
                Context i5 = i();
                xsd.c.getClass();
                String str = zic.H(i4).b;
                zsd zsdVar = zsd.Continue;
                nv.d0(i5, str, "skip", i4);
            }
            z();
            return;
        }
        if (hrdVar.equals(frd.a)) {
            n(null, new etd(i));
            return;
        }
        if (hrdVar instanceof erd) {
            n(null, new Function1(this) { // from class: dtd
                public final /* synthetic */ OnboardingViewModel b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i22 = i2;
                    hrd hrdVar2 = hrdVar;
                    OnboardingViewModel onboardingViewModel = this.b;
                    switch (i22) {
                        case 0:
                            ysd ysdVar2 = (ysd) obj;
                            ysdVar2.getClass();
                            Context i32 = onboardingViewModel.i();
                            zic zicVar = xsd.c;
                            int i42 = ysdVar2.a;
                            zicVar.getClass();
                            nv.d0(i32, zic.H(i42).b, ((brd) hrdVar2).a.a, i42);
                            return ysd.a(ysdVar2, 1 + i42, null, null, null, 30);
                        default:
                            ysd ysdVar22 = (ysd) obj;
                            ysdVar22.getClass();
                            gv9 gv9Var = ysdVar22.d;
                            if (!onboardingViewModel.t && !gv9Var.contains(((erd) hrdVar2).a)) {
                                onboardingViewModel.t = true;
                                onboardingViewModel.k(mrd.a);
                            }
                            OnboardingItemUiModel onboardingItemUiModel = ((erd) hrdVar2).a;
                            return ysd.a(ysdVar22, 0, null, l6g.W(gv9Var.contains(onboardingItemUiModel) ? CollectionsKt.s0(gv9Var, onboardingItemUiModel) : CollectionsKt.w0(gv9Var, a.c(onboardingItemUiModel))), null, 23);
                    }
                }
            });
            Unit unit3 = Unit.a;
            y();
        } else {
            if (!(hrdVar instanceof drd)) {
                zzl.b();
                return;
            }
            String str2 = ((drd) hrdVar).a;
            fdi fdiVar = this.w;
            fdiVar.getClass();
            fdiVar.m(null, str2);
            n(null, new mnc(hrdVar, 19));
        }
    }

    public final void y() {
        ysd ysdVar = (ysd) l().a();
        if (ysdVar != null) {
            this.l.b(new OnboardingSavedState(ysdVar.a, ysdVar.b, ysdVar.d), "onboarding_state");
        }
    }

    public final void z() {
        String str;
        ysd ysdVar = (ysd) l().a();
        if (ysdVar != null) {
            gv9 gv9Var = ysdVar.d;
            ArrayList arrayList = new ArrayList();
            for (Object obj : gv9Var) {
                if (((OnboardingItemUiModel) obj).b == srd.a) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(Long.valueOf(((OnboardingItemUiModel) it.next()).a));
            }
            if (arrayList2.isEmpty()) {
                arrayList2 = null;
            }
            if (arrayList2 != null) {
                Context i = i();
                wu wuVar = wu.MAIN_MATCHES;
                Pair[] pairArr = {new Pair("ACTION", "ADD_TEAMS"), new Pair("TEAM_IDS", CollectionsKt.T0(arrayList2)), new Pair("ANALYTICS_ACTION", "ONBOARDING")};
                hpo hpoVar = new hpo(18);
                for (int i2 = 0; i2 < 3; i2++) {
                    Pair pair = pairArr[i2];
                    hpoVar.B(pair.b, (String) pair.a);
                }
                md4 l = hpoVar.l();
                vxd.h(i).b("TeamWorker-".concat(mha.o(l)), nf6.a, (ltd) vxd.g(TeamWorker.class, l).a());
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : gv9Var) {
                if (((OnboardingItemUiModel) obj2).b == srd.b) {
                    arrayList3.add(obj2);
                }
            }
            ArrayList arrayList4 = new ArrayList(k13.r(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList4.add(Long.valueOf(((OnboardingItemUiModel) it2.next()).a));
            }
            if (arrayList4.isEmpty()) {
                arrayList4 = null;
            }
            if (arrayList4 != null) {
                Context i3 = i();
                wu wuVar2 = wu.MAIN_MATCHES;
                Pair[] pairArr2 = {new Pair("ACTION", "ADD_PLAYER_LIST"), new Pair("PLAYER_IDS", CollectionsKt.T0(arrayList4)), new Pair("ANALYTICS_ACTION", "ONBOARDING")};
                hpo hpoVar2 = new hpo(18);
                for (int i4 = 0; i4 < 3; i4++) {
                    Pair pair2 = pairArr2[i4];
                    hpoVar2.B(pair2.b, (String) pair2.a);
                }
                md4 l2 = hpoVar2.l();
                vxd.h(i3).b("PlayerWorker-".concat(mha.o(l2)), nf6.a, (ltd) vxd.g(PlayerWorker.class, l2).a());
            }
            ArrayList arrayList5 = new ArrayList();
            for (Object obj3 : gv9Var) {
                if (((OnboardingItemUiModel) obj3).b == srd.c) {
                    arrayList5.add(obj3);
                }
            }
            ArrayList arrayList6 = new ArrayList(k13.r(arrayList5, 10));
            Iterator it3 = arrayList5.iterator();
            while (it3.hasNext()) {
                arrayList6.add(Long.valueOf(((OnboardingItemUiModel) it3.next()).a));
            }
            if (arrayList6.isEmpty()) {
                arrayList6 = null;
            }
            if (arrayList6 != null) {
                Context i5 = i();
                wu wuVar3 = wu.MAIN_MATCHES;
                Pair[] pairArr3 = {new Pair("ACTION", "ADD_LEAGUE_LIST"), new Pair("LEAGUE_IDS", CollectionsKt.T0(arrayList6)), new Pair("ANALYTICS_ACTION", "ONBOARDING")};
                hpo hpoVar3 = new hpo(18);
                for (int i6 = 0; i6 < 3; i6++) {
                    Pair pair3 = pairArr3[i6];
                    hpoVar3.B(pair3.b, (String) pair3.a);
                }
                md4 l3 = hpoVar3.l();
                vxd.h(i5).b("LeagueWorker-".concat(mha.o(l3)), nf6.a, (ltd) vxd.g(LeagueWorker.class, l3).a());
            }
            OnboardingItemUiModel onboardingItemUiModel = (OnboardingItemUiModel) CollectionsKt.firstOrNull(gv9Var);
            if (onboardingItemUiModel != null && (str = onboardingItemUiModel.d) != null) {
                if (!gv9Var.isEmpty()) {
                    Iterator<E> it4 = gv9Var.iterator();
                    while (it4.hasNext()) {
                        if (!Intrinsics.c(((OnboardingItemUiModel) it4.next()).d, str)) {
                            break;
                        }
                    }
                }
                Context i7 = i();
                Pair[] pairArr4 = {new Pair("PREFERRED_FIRST_SPORT", str)};
                hpo hpoVar4 = new hpo(18);
                Pair pair4 = pairArr4[0];
                hpoVar4.B(pair4.b, (String) pair4.a);
                md4 l4 = hpoVar4.l();
                vxd.h(i7).b("OrderedSportsWorker-".concat(mha.o(l4)), nf6.a, (ltd) vxd.g(OrderedSportsWorker.class, l4).a());
            }
            xf0 xf0Var = this.v;
            uf0 uf0Var = xf0Var instanceof uf0 ? (uf0) xf0Var : null;
            if (uf0Var != null && v()) {
                Context i8 = i();
                Pair[] pairArr5 = {new Pair("ACTION", "ADD_PINNED_LEAGUE_AT_POSITION"), new Pair("LEAGUE_ID", Integer.valueOf(uf0Var.a)), new Pair("ORDER_INDEX", 0)};
                hpo hpoVar5 = new hpo(18);
                for (int i9 = 0; i9 < 3; i9++) {
                    Pair pair5 = pairArr5[i9];
                    hpoVar5.B(pair5.b, (String) pair5.a);
                }
                md4 l5 = hpoVar5.l();
                vxd.h(i8).b("PinnedLeagueWorker-".concat(mha.o(l5)), nf6.a, (ltd) vxd.g(PinnedLeagueWorker.class, l5).a());
            }
        }
    }
}
