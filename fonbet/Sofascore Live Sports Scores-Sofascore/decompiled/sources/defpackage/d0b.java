package defpackage;

import com.sofascore.network.api.NetworkCoroutineAPI;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class d0b extends hoi implements Function1 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ w3b t;
    public final /* synthetic */ int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0b(int i, int i2, rq3 rq3Var, w3b w3bVar) {
        super(1, rq3Var);
        this.r = i2;
        this.t = w3bVar;
        this.u = i;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        int i = this.r;
        int i2 = this.u;
        w3b w3bVar = this.t;
        switch (i) {
            case 0:
                return new d0b(i2, 0, rq3Var, w3bVar);
            case 1:
                return new d0b(i2, 1, rq3Var, w3bVar);
            case 2:
                return new d0b(i2, 2, rq3Var, w3bVar);
            case 3:
                return new d0b(i2, 3, rq3Var, w3bVar);
            case 4:
                return new d0b(i2, 4, rq3Var, w3bVar);
            case 5:
                return new d0b(i2, 5, rq3Var, w3bVar);
            case 6:
                return new d0b(i2, 6, rq3Var, w3bVar);
            case 7:
                return new d0b(i2, 7, rq3Var, w3bVar);
            case 8:
                return new d0b(i2, 8, rq3Var, w3bVar);
            case 9:
                return new d0b(i2, 9, rq3Var, w3bVar);
            case 10:
                return new d0b(i2, 10, rq3Var, w3bVar);
            case 11:
                return new d0b(i2, 11, rq3Var, w3bVar);
            case 12:
                return new d0b(i2, 12, rq3Var, w3bVar);
            case 13:
                return new d0b(i2, 13, rq3Var, w3bVar);
            case 14:
                return new d0b(i2, 14, rq3Var, w3bVar);
            case 15:
                return new d0b(i2, 15, rq3Var, w3bVar);
            case 16:
                return new d0b(i2, 16, rq3Var, w3bVar);
            case 17:
                return new d0b(i2, 17, rq3Var, w3bVar);
            case 18:
                return new d0b(i2, 18, rq3Var, w3bVar);
            default:
                return new d0b(i2, 19, rq3Var, w3bVar);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rq3 rq3Var = (rq3) obj;
        switch (this.r) {
        }
        return ((d0b) create(rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        int i2 = this.u;
        w3b w3bVar = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i3 = this.s;
                if (i3 != 0) {
                    if (i3 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI = w3bVar.b;
                this.s = 1;
                Object historicalSeasonComparison = networkCoroutineAPI.historicalSeasonComparison(i2, this);
                return historicalSeasonComparison == lu3Var ? lu3Var : historicalSeasonComparison;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i4 = this.s;
                if (i4 != 0) {
                    if (i4 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI2 = w3bVar.b;
                this.s = 1;
                Object uniqueTournamentPlayerUpdates = networkCoroutineAPI2.uniqueTournamentPlayerUpdates(i2, this);
                return uniqueTournamentPlayerUpdates == lu3Var2 ? lu3Var2 : uniqueTournamentPlayerUpdates;
            case 2:
                lu3 lu3Var3 = lu3.a;
                int i5 = this.s;
                if (i5 != 0) {
                    if (i5 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI3 = w3bVar.b;
                this.s = 1;
                Object uniqueTournamentPreviousWinners = networkCoroutineAPI3.uniqueTournamentPreviousWinners(i2, this);
                return uniqueTournamentPreviousWinners == lu3Var3 ? lu3Var3 : uniqueTournamentPreviousWinners;
            case 3:
                lu3 lu3Var4 = lu3.a;
                int i6 = this.s;
                if (i6 != 0) {
                    if (i6 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI4 = w3bVar.b;
                this.s = 1;
                Object teamOfThePeriod = networkCoroutineAPI4.teamOfThePeriod(i2, this);
                return teamOfThePeriod == lu3Var4 ? lu3Var4 : teamOfThePeriod;
            case 4:
                lu3 lu3Var5 = lu3.a;
                int i7 = this.s;
                if (i7 != 0) {
                    if (i7 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI5 = w3bVar.b;
                this.s = 1;
                Object uniqueTournamentKeyPlayers = networkCoroutineAPI5.uniqueTournamentKeyPlayers(i2, this);
                return uniqueTournamentKeyPlayers == lu3Var5 ? lu3Var5 : uniqueTournamentKeyPlayers;
            case 5:
                lu3 lu3Var6 = lu3.a;
                int i8 = this.s;
                if (i8 != 0) {
                    if (i8 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI6 = w3bVar.b;
                this.s = 1;
                Object hasLeagueTransactions = networkCoroutineAPI6.hasLeagueTransactions(i2, this);
                return hasLeagueTransactions == lu3Var6 ? lu3Var6 : hasLeagueTransactions;
            case 6:
                lu3 lu3Var7 = lu3.a;
                int i9 = this.s;
                if (i9 != 0) {
                    if (i9 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI7 = w3bVar.b;
                this.s = 1;
                Object hasMmaOrganisationRanking = networkCoroutineAPI7.hasMmaOrganisationRanking(i2, this);
                return hasMmaOrganisationRanking == lu3Var7 ? lu3Var7 : hasMmaOrganisationRanking;
            case 7:
                lu3 lu3Var8 = lu3.a;
                int i10 = this.s;
                if (i10 != 0) {
                    if (i10 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI8 = w3bVar.b;
                this.s = 1;
                Object hasUniqueTournamentEvents = networkCoroutineAPI8.hasUniqueTournamentEvents(i2, "last", 0, this);
                return hasUniqueTournamentEvents == lu3Var8 ? lu3Var8 : hasUniqueTournamentEvents;
            case 8:
                lu3 lu3Var9 = lu3.a;
                int i11 = this.s;
                if (i11 != 0) {
                    if (i11 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI9 = w3bVar.b;
                this.s = 1;
                Object hasUniqueTournamentEvents2 = networkCoroutineAPI9.hasUniqueTournamentEvents(i2, "next", 0, this);
                return hasUniqueTournamentEvents2 == lu3Var9 ? lu3Var9 : hasUniqueTournamentEvents2;
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
                NetworkCoroutineAPI networkCoroutineAPI10 = w3bVar.b;
                this.s = 1;
                Object leagueGoatPlayerVotes = networkCoroutineAPI10.leagueGoatPlayerVotes(i2, this);
                return leagueGoatPlayerVotes == lu3Var10 ? lu3Var10 : leagueGoatPlayerVotes;
            case 10:
                lu3 lu3Var11 = lu3.a;
                int i13 = this.s;
                if (i13 != 0) {
                    if (i13 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI11 = w3bVar.b;
                this.s = 1;
                Object mmaOrganisationRanking = networkCoroutineAPI11.mmaOrganisationRanking(i2, this);
                return mmaOrganisationRanking == lu3Var11 ? lu3Var11 : mmaOrganisationRanking;
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
                NetworkCoroutineAPI networkCoroutineAPI12 = w3bVar.c;
                this.s = 1;
                Object myLeagueEventIds = networkCoroutineAPI12.myLeagueEventIds(i2, this);
                return myLeagueEventIds == lu3Var12 ? lu3Var12 : myLeagueEventIds;
            case 12:
                lu3 lu3Var13 = lu3.a;
                int i15 = this.s;
                if (i15 != 0) {
                    if (i15 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI13 = w3bVar.b;
                this.s = 1;
                Object obj2 = networkCoroutineAPI13.tournament(i2, this);
                return obj2 == lu3Var13 ? lu3Var13 : obj2;
            case 13:
                lu3 lu3Var14 = lu3.a;
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
                NetworkCoroutineAPI networkCoroutineAPI14 = w3bVar.b;
                this.s = 1;
                Object obj3 = networkCoroutineAPI14.tournamentSeasons(i2, this);
                return obj3 == lu3Var14 ? lu3Var14 : obj3;
            case 14:
                lu3 lu3Var15 = lu3.a;
                int i17 = this.s;
                if (i17 != 0) {
                    if (i17 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI15 = w3bVar.b;
                this.s = 1;
                Object uniqueTournament = networkCoroutineAPI15.uniqueTournament(i2, this);
                return uniqueTournament == lu3Var15 ? lu3Var15 : uniqueTournament;
            case 15:
                lu3 lu3Var16 = lu3.a;
                int i18 = this.s;
                if (i18 != 0) {
                    if (i18 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI16 = w3bVar.b;
                this.s = 1;
                Object uniqueTournamentDetails = networkCoroutineAPI16.uniqueTournamentDetails(i2, this);
                return uniqueTournamentDetails == lu3Var16 ? lu3Var16 : uniqueTournamentDetails;
            case 16:
                lu3 lu3Var17 = lu3.a;
                int i19 = this.s;
                if (i19 != 0) {
                    if (i19 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI17 = w3bVar.b;
                this.s = 1;
                Object uniqueTournamentFeaturedEvents = networkCoroutineAPI17.uniqueTournamentFeaturedEvents(i2, this);
                return uniqueTournamentFeaturedEvents == lu3Var17 ? lu3Var17 : uniqueTournamentFeaturedEvents;
            case 17:
                lu3 lu3Var18 = lu3.a;
                int i20 = this.s;
                if (i20 != 0) {
                    if (i20 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI18 = w3bVar.b;
                this.s = 1;
                Object uniqueTournamentMedia = networkCoroutineAPI18.uniqueTournamentMedia(i2, this);
                return uniqueTournamentMedia == lu3Var18 ? lu3Var18 : uniqueTournamentMedia;
            case 18:
                lu3 lu3Var19 = lu3.a;
                int i21 = this.s;
                if (i21 != 0) {
                    if (i21 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI19 = w3bVar.b;
                this.s = 1;
                Object uniqueTournamentSeasons = networkCoroutineAPI19.uniqueTournamentSeasons(i2, this);
                return uniqueTournamentSeasons == lu3Var19 ? lu3Var19 : uniqueTournamentSeasons;
            default:
                lu3 lu3Var20 = lu3.a;
                int i22 = this.s;
                if (i22 != 0) {
                    if (i22 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI20 = w3bVar.b;
                this.s = 1;
                Object uniqueTournamentVideos = networkCoroutineAPI20.uniqueTournamentVideos(i2, this);
                return uniqueTournamentVideos == lu3Var20 ? lu3Var20 : uniqueTournamentVideos;
        }
    }
}
