package defpackage;

import android.content.Context;
import android.os.Build;
import com.sofascore.model.crowdsourcing.CrowdsourcingSuggestRequest;
import com.sofascore.model.crowdsourcing.EventSuggestRequest;
import com.sofascore.model.fantasy.FantasyUpdateTeamPostBody;
import com.sofascore.model.mvvm.model.OffersBannerResponse;
import com.sofascore.model.mvvm.model.Round;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.Venue;
import com.sofascore.model.newNetwork.ChangeEventVoteBody;
import com.sofascore.model.newNetwork.EventVoteBody;
import com.sofascore.model.newNetwork.HockeyEventShotmapItem;
import com.sofascore.model.newNetwork.HockeyEventShotmapResponse;
import com.sofascore.model.newNetwork.SurveyAnswersPost;
import com.sofascore.model.newNetwork.UniqueTournamentGroup;
import com.sofascore.model.newNetwork.post.FighterSuggestPostBody;
import com.sofascore.model.newNetwork.post.PlayerSuggestPostBody;
import com.sofascore.model.newNetwork.post.TeamSuggestPostBody;
import com.sofascore.model.newNetwork.post.TransferSuggestPostBody;
import com.sofascore.model.newNetwork.post.VenueSuggestPostBody;
import com.sofascore.network.api.FantasyAPI;
import com.sofascore.network.api.NetworkCoroutineAPI;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class c64 extends hoi implements Function1 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ int u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c64(Object obj, int i, Object obj2, rq3 rq3Var, int i2) {
        super(1, rq3Var);
        this.r = i2;
        this.t = obj;
        this.u = i;
        this.v = obj2;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        int i = this.r;
        Object obj = this.v;
        Object obj2 = this.t;
        switch (i) {
            case 0:
                return new c64((e64) obj2, this.u, (FighterSuggestPostBody) obj, rq3Var, 0);
            case 1:
                return new c64((e64) obj2, this.u, (PlayerSuggestPostBody) obj, rq3Var, 1);
            case 2:
                return new c64((e64) obj2, this.u, (TransferSuggestPostBody) obj, rq3Var, 2);
            case 3:
                return new c64((e64) obj2, this.u, (TeamSuggestPostBody) obj, rq3Var, 3);
            case 4:
                return new c64((e64) obj2, this.u, (VenueSuggestPostBody) obj, rq3Var, 4);
            case 5:
                return new c64((e64) obj2, this.u, (String) obj, rq3Var, 5);
            case 6:
                return new c64((e64) obj2, this.u, (CrowdsourcingSuggestRequest) obj, rq3Var, 6);
            case 7:
                return new c64((e64) obj2, this.u, (EventSuggestRequest) obj, rq3Var, 7);
            case 8:
                return new c64((wi7) obj2, this.u, (List) obj, rq3Var, 8);
            case 9:
                return new c64((wi7) obj2, this.u, (ArrayList) obj, rq3Var, 9);
            case 10:
                return new c64((g39) obj2, this.u, (Boolean) obj, rq3Var, 10);
            case 11:
                return new c64((z2a) obj2, (String) obj, this.u, rq3Var, 11);
            case 12:
                return new c64((zwa) obj2, (t6e) obj, this.u, rq3Var, 12);
            case 13:
                return new c64((Context) obj2, (w3b) obj, this.u, rq3Var, 13);
            case 14:
                return new c64((fqe) obj2, this.u, (String) obj, rq3Var, 14);
            case 15:
                return new c64((wve) obj2, this.u, (String) obj, rq3Var, 15);
            case 16:
                return new c64((Context) obj2, (wve) obj, this.u, rq3Var, 16);
            case 17:
                return new c64((uwg) obj2, (String) obj, this.u, rq3Var, 17);
            case 18:
                return new c64((yni) obj2, this.u, (SurveyAnswersPost) obj, rq3Var, 18);
            case 19:
                return new c64((Context) obj2, (j0j) obj, this.u, rq3Var, 19);
            case 20:
                return new c64((dhk) obj2, (String) obj, this.u, rq3Var, 20);
            case 21:
                return new c64((fyk) obj2, this.u, (EventVoteBody) obj, rq3Var, 21);
            default:
                return new c64((fyk) obj2, this.u, (ChangeEventVoteBody) obj, rq3Var, 22);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rq3 rq3Var = (rq3) obj;
        switch (this.r) {
        }
        return ((c64) create(rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        Object hockeyEventShotmap;
        Venue venue;
        Object offersBanner;
        Object offersBannerPlayer;
        Object offersBannerTeam;
        int i = this.r;
        int i2 = this.u;
        Object obj2 = this.v;
        Object obj3 = this.t;
        Integer num = null;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object editFighter = ((e64) obj3).b.editFighter(i2, (FighterSuggestPostBody) obj2, this);
                    return editFighter == lu3Var ? lu3Var : editFighter;
                }
                if (i3 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object editPlayer = ((e64) obj3).b.editPlayer(i2, (PlayerSuggestPostBody) obj2, this);
                    return editPlayer == lu3Var2 ? lu3Var2 : editPlayer;
                }
                if (i4 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                lu3 lu3Var3 = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object editPlayerTransfer = ((e64) obj3).b.editPlayerTransfer(i2, (TransferSuggestPostBody) obj2, this);
                    return editPlayerTransfer == lu3Var3 ? lu3Var3 : editPlayerTransfer;
                }
                if (i5 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                lu3 lu3Var4 = lu3.a;
                int i6 = this.s;
                if (i6 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object editTeam = ((e64) obj3).b.editTeam(i2, (TeamSuggestPostBody) obj2, this);
                    return editTeam == lu3Var4 ? lu3Var4 : editTeam;
                }
                if (i6 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 4:
                lu3 lu3Var5 = lu3.a;
                int i7 = this.s;
                if (i7 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object editVenue = ((e64) obj3).b.editVenue(i2, (VenueSuggestPostBody) obj2, this);
                    return editVenue == lu3Var5 ? lu3Var5 : editVenue;
                }
                if (i7 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 5:
                lu3 lu3Var6 = lu3.a;
                int i8 = this.s;
                if (i8 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object myContributions = ((e64) obj3).b.getMyContributions(i2, (String) obj2, this);
                    return myContributions == lu3Var6 ? lu3Var6 : myContributions;
                }
                if (i8 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 6:
                lu3 lu3Var7 = lu3.a;
                int i9 = this.s;
                if (i9 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object createSuggests = ((e64) obj3).b.createSuggests(i2, (CrowdsourcingSuggestRequest) obj2, this);
                    return createSuggests == lu3Var7 ? lu3Var7 : createSuggests;
                }
                if (i9 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 7:
                lu3 lu3Var8 = lu3.a;
                int i10 = this.s;
                if (i10 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object updateSuggest = ((e64) obj3).b.updateSuggest(i2, (EventSuggestRequest) obj2, this);
                    return updateSuggest == lu3Var8 ? lu3Var8 : updateSuggest;
                }
                if (i10 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 8:
                lu3 lu3Var9 = lu3.a;
                int i11 = this.s;
                if (i11 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object autoSelectSquad = ((wi7) obj3).a.autoSelectSquad(i2, (List) obj2, this);
                    return autoSelectSquad == lu3Var9 ? lu3Var9 : autoSelectSquad;
                }
                if (i11 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 9:
                lu3 lu3Var10 = lu3.a;
                int i12 = this.s;
                if (i12 != 0) {
                    if (i12 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                FantasyAPI fantasyAPI = ((wi7) obj3).a;
                FantasyUpdateTeamPostBody fantasyUpdateTeamPostBody = new FantasyUpdateTeamPostBody((ArrayList) obj2);
                this.s = 1;
                Object updateTeam = fantasyAPI.updateTeam(i2, fantasyUpdateTeamPostBody, this);
                return updateTeam == lu3Var10 ? lu3Var10 : updateTeam;
            case 10:
                lu3 lu3Var11 = lu3.a;
                int i13 = this.s;
                if (i13 == 0) {
                    y6a.M(obj);
                    NetworkCoroutineAPI networkCoroutineAPI = ((g39) obj3).a;
                    this.s = 1;
                    hockeyEventShotmap = networkCoroutineAPI.getHockeyEventShotmap(i2, this);
                    if (hockeyEventShotmap == lu3Var11) {
                        return lu3Var11;
                    }
                } else {
                    if (i13 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    hockeyEventShotmap = obj;
                }
                List<HockeyEventShotmapItem> shotmap = ((HockeyEventShotmapResponse) hockeyEventShotmap).getShotmap();
                if (!Intrinsics.c((Boolean) obj2, Boolean.TRUE)) {
                    return shotmap;
                }
                Iterator<T> it = shotmap.iterator();
                while (it.hasNext()) {
                    ((HockeyEventShotmapItem) it.next()).mirror();
                }
                return shotmap;
            case 11:
                lu3 lu3Var12 = lu3.a;
                int i14 = this.s;
                if (i14 != 0) {
                    if (i14 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                int i15 = Build.VERSION.SDK_INT;
                this.s = 1;
                Object info = ((z2a) obj3).a.info((String) obj2, this.u, "android", i15, this);
                return info == lu3Var12 ? lu3Var12 : info;
            case 12:
                zwa zwaVar = (zwa) obj3;
                lu3 lu3Var13 = lu3.a;
                int i16 = this.s;
                if (i16 != 0) {
                    if (i16 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                t6e t6eVar = (t6e) obj2;
                iya n = zwaVar.n();
                UniqueTournamentGroup uniqueTournamentGroup = n != null ? (UniqueTournamentGroup) n.a : null;
                jya o = zwaVar.o();
                Round round = o != null ? (Round) o.a : null;
                Team u = zwaVar.u();
                Integer num2 = u != null ? new Integer(u.getId()) : null;
                hya v = zwaVar.v();
                if (v != null && (venue = (Venue) v.a) != null) {
                    num = new Integer(venue.getId());
                }
                this.s = 1;
                Object k = zwaVar.k(t6eVar, this.u, uniqueTournamentGroup, round, num2, num, this);
                return k == lu3Var13 ? lu3Var13 : k;
            case 13:
                lu3 lu3Var14 = lu3.a;
                int i17 = this.s;
                if (i17 == 0) {
                    y6a.M(obj);
                    ArrayList arrayList = dv3.a;
                    String f = dv3.f((Context) obj3);
                    if (f == null) {
                        return null;
                    }
                    String a = dla.a();
                    NetworkCoroutineAPI networkCoroutineAPI2 = ((w3b) obj2).b;
                    this.s = 1;
                    offersBanner = networkCoroutineAPI2.offersBanner(i2, f, a, this);
                    if (offersBanner == lu3Var14) {
                        return lu3Var14;
                    }
                } else {
                    if (i17 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    offersBanner = obj;
                }
                return (OffersBannerResponse) offersBanner;
            case 14:
                lu3 lu3Var15 = lu3.a;
                int i18 = this.s;
                if (i18 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Serializable m = ((fqe) obj3).g.m(i2, (String) obj2, this);
                    return m == lu3Var15 ? lu3Var15 : m;
                }
                if (i18 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 15:
                lu3 lu3Var16 = lu3.a;
                int i19 = this.s;
                if (i19 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object playerCareerStatistics = ((wve) obj3).b.playerCareerStatistics(i2, (String) obj2, this);
                    return playerCareerStatistics == lu3Var16 ? lu3Var16 : playerCareerStatistics;
                }
                if (i19 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 16:
                lu3 lu3Var17 = lu3.a;
                int i20 = this.s;
                if (i20 == 0) {
                    y6a.M(obj);
                    ArrayList arrayList2 = dv3.a;
                    String f2 = dv3.f((Context) obj3);
                    if (f2 == null) {
                        return null;
                    }
                    String a2 = dla.a();
                    NetworkCoroutineAPI networkCoroutineAPI3 = ((wve) obj2).b;
                    this.s = 1;
                    offersBannerPlayer = networkCoroutineAPI3.offersBannerPlayer(i2, f2, a2, this);
                    if (offersBannerPlayer == lu3Var17) {
                        return lu3Var17;
                    }
                } else {
                    if (i20 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    offersBannerPlayer = obj;
                }
                return (OffersBannerResponse) offersBannerPlayer;
            case 17:
                lu3 lu3Var18 = lu3.a;
                int i21 = this.s;
                if (i21 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object search = ((uwg) obj3).a.search((String) obj2, null, i2, this);
                    return search == lu3Var18 ? lu3Var18 : search;
                }
                if (i21 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 18:
                lu3 lu3Var19 = lu3.a;
                int i22 = this.s;
                if (i22 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object postSurveyData = ((yni) obj3).a.postSurveyData(i2, (SurveyAnswersPost) obj2, this);
                    return postSurveyData == lu3Var19 ? lu3Var19 : postSurveyData;
                }
                if (i22 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 19:
                lu3 lu3Var20 = lu3.a;
                int i23 = this.s;
                if (i23 == 0) {
                    y6a.M(obj);
                    ArrayList arrayList3 = dv3.a;
                    String f3 = dv3.f((Context) obj3);
                    if (f3 == null) {
                        return null;
                    }
                    String a3 = dla.a();
                    NetworkCoroutineAPI networkCoroutineAPI4 = ((j0j) obj2).b;
                    this.s = 1;
                    offersBannerTeam = networkCoroutineAPI4.offersBannerTeam(i2, f3, a3, this);
                    if (offersBannerTeam == lu3Var20) {
                        return lu3Var20;
                    }
                } else {
                    if (i23 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    offersBannerTeam = obj;
                }
                return (OffersBannerResponse) offersBannerTeam;
            case 20:
                lu3 lu3Var21 = lu3.a;
                int i24 = this.s;
                if (i24 != 0) {
                    if (i24 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI5 = ((dhk) obj3).c;
                String H = iii.H(i2, (String) obj2);
                this.s = 1;
                Object userSegmentation = networkCoroutineAPI5.getUserSegmentation(H, this);
                return userSegmentation == lu3Var21 ? lu3Var21 : userSegmentation;
            case 21:
                lu3 lu3Var22 = lu3.a;
                int i25 = this.s;
                if (i25 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object eventVote = ((fyk) obj3).b.eventVote(i2, (EventVoteBody) obj2, this);
                    return eventVote == lu3Var22 ? lu3Var22 : eventVote;
                }
                if (i25 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                lu3 lu3Var23 = lu3.a;
                int i26 = this.s;
                if (i26 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object changeEventVote = ((fyk) obj3).b.changeEventVote(i2, (ChangeEventVoteBody) obj2, this);
                    return changeEventVote == lu3Var23 ? lu3Var23 : changeEventVote;
                }
                if (i26 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c64(Object obj, Object obj2, int i, rq3 rq3Var, int i2) {
        super(1, rq3Var);
        this.r = i2;
        this.t = obj;
        this.v = obj2;
        this.u = i;
    }
}
