package defpackage;

import com.sofascore.network.api.FantasyAPI;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class hg7 extends hoi implements Function1 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ wi7 t;
    public final /* synthetic */ int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hg7(wi7 wi7Var, int i, rq3 rq3Var, int i2) {
        super(1, rq3Var);
        this.r = i2;
        this.t = wi7Var;
        this.u = i;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        int i = this.r;
        int i2 = this.u;
        wi7 wi7Var = this.t;
        switch (i) {
            case 0:
                return new hg7(wi7Var, i2, rq3Var, 0);
            case 1:
                return new hg7(wi7Var, i2, rq3Var, 1);
            case 2:
                return new hg7(wi7Var, i2, rq3Var, 2);
            case 3:
                return new hg7(wi7Var, i2, rq3Var, 3);
            case 4:
                return new hg7(wi7Var, i2, rq3Var, 4);
            case 5:
                return new hg7(wi7Var, i2, rq3Var, 5);
            case 6:
                return new hg7(wi7Var, i2, rq3Var, 6);
            case 7:
                return new hg7(wi7Var, i2, rq3Var, 7);
            case 8:
                return new hg7(wi7Var, i2, rq3Var, 8);
            case 9:
                return new hg7(wi7Var, i2, rq3Var, 9);
            case 10:
                return new hg7(wi7Var, i2, rq3Var, 10);
            case 11:
                return new hg7(wi7Var, i2, rq3Var, 11);
            case 12:
                return new hg7(wi7Var, i2, rq3Var, 12);
            case 13:
                return new hg7(wi7Var, i2, rq3Var, 13);
            case 14:
                return new hg7(wi7Var, i2, rq3Var, 14);
            case 15:
                return new hg7(wi7Var, i2, rq3Var, 15);
            case 16:
                return new hg7(wi7Var, i2, rq3Var, 16);
            case 17:
                return new hg7(wi7Var, i2, rq3Var, 17);
            case 18:
                return new hg7(wi7Var, i2, rq3Var, 18);
            case 19:
                return new hg7(wi7Var, i2, rq3Var, 19);
            case 20:
                return new hg7(wi7Var, i2, rq3Var, 20);
            case 21:
                return new hg7(wi7Var, i2, rq3Var, 21);
            case 22:
                return new hg7(wi7Var, i2, rq3Var, 22);
            case 23:
                return new hg7(wi7Var, i2, rq3Var, 23);
            case 24:
                return new hg7(wi7Var, i2, rq3Var, 24);
            case 25:
                return new hg7(wi7Var, i2, rq3Var, 25);
            case 26:
                return new hg7(wi7Var, i2, rq3Var, 26);
            case 27:
                return new hg7(wi7Var, i2, rq3Var, 27);
            default:
                return new hg7(wi7Var, i2, rq3Var, 28);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rq3 rq3Var = (rq3) obj;
        switch (this.r) {
        }
        return ((hg7) create(rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        int i2 = this.u;
        wi7 wi7Var = this.t;
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
                FantasyAPI fantasyAPI = wi7Var.a;
                this.s = 1;
                Object deleteLeague = fantasyAPI.deleteLeague(i2, this);
                return deleteLeague == lu3Var ? lu3Var : deleteLeague;
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
                FantasyAPI fantasyAPI2 = wi7Var.a;
                this.s = 1;
                Object deleteTeam = fantasyAPI2.deleteTeam(i2, this);
                return deleteTeam == lu3Var2 ? lu3Var2 : deleteTeam;
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
                FantasyAPI fantasyAPI3 = wi7Var.a;
                this.s = 1;
                Object competition = fantasyAPI3.getCompetition(i2, this);
                return competition == lu3Var3 ? lu3Var3 : competition;
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
                FantasyAPI fantasyAPI4 = wi7Var.a;
                this.s = 1;
                Object competitionPriceChanges = fantasyAPI4.getCompetitionPriceChanges(i2, this);
                return competitionPriceChanges == lu3Var4 ? lu3Var4 : competitionPriceChanges;
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
                FantasyAPI fantasyAPI5 = wi7Var.a;
                this.s = 1;
                Object competitionRound = fantasyAPI5.getCompetitionRound(i2, this);
                return competitionRound == lu3Var5 ? lu3Var5 : competitionRound;
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
                FantasyAPI fantasyAPI6 = wi7Var.a;
                this.s = 1;
                Object competitionRoundFilterOptions = fantasyAPI6.getCompetitionRoundFilterOptions(i2, this);
                return competitionRoundFilterOptions == lu3Var6 ? lu3Var6 : competitionRoundFilterOptions;
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
                FantasyAPI fantasyAPI7 = wi7Var.a;
                this.s = 1;
                Object competitionRounds = fantasyAPI7.getCompetitionRounds(i2, this);
                return competitionRounds == lu3Var7 ? lu3Var7 : competitionRounds;
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
                FantasyAPI fantasyAPI8 = wi7Var.a;
                this.s = 1;
                Object competitionTopPlayers = fantasyAPI8.getCompetitionTopPlayers(i2, this);
                return competitionTopPlayers == lu3Var8 ? lu3Var8 : competitionTopPlayers;
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
                FantasyAPI fantasyAPI9 = wi7Var.a;
                this.s = 1;
                Object fantasyPointsForEvent = fantasyAPI9.getFantasyPointsForEvent(i2, this);
                return fantasyPointsForEvent == lu3Var9 ? lu3Var9 : fantasyPointsForEvent;
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
                FantasyAPI fantasyAPI10 = wi7Var.a;
                this.s = 1;
                Object roundPlayerStatistics = fantasyAPI10.getRoundPlayerStatistics(i2, this);
                return roundPlayerStatistics == lu3Var10 ? lu3Var10 : roundPlayerStatistics;
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
                FantasyAPI fantasyAPI11 = wi7Var.a;
                this.s = 1;
                Object fixtures = fantasyAPI11.getFixtures(i2, this);
                return fixtures == lu3Var11 ? lu3Var11 : fixtures;
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
                FantasyAPI fantasyAPI12 = wi7Var.a;
                this.s = 1;
                Object league = fantasyAPI12.getLeague(i2, this);
                return league == lu3Var12 ? lu3Var12 : league;
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
                FantasyAPI fantasyAPI13 = wi7Var.a;
                this.s = 1;
                Object leagueChatLastMessageTimestamp = fantasyAPI13.getLeagueChatLastMessageTimestamp(i2, this);
                return leagueChatLastMessageTimestamp == lu3Var13 ? lu3Var13 : leagueChatLastMessageTimestamp;
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
                FantasyAPI fantasyAPI14 = wi7Var.a;
                this.s = 1;
                Object leagueConfig = fantasyAPI14.getLeagueConfig(i2, this);
                return leagueConfig == lu3Var14 ? lu3Var14 : leagueConfig;
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
                FantasyAPI fantasyAPI15 = wi7Var.a;
                this.s = 1;
                Object leagueJoinCode = fantasyAPI15.getLeagueJoinCode(i2, this);
                return leagueJoinCode == lu3Var15 ? lu3Var15 : leagueJoinCode;
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
                FantasyAPI fantasyAPI16 = wi7Var.a;
                this.s = 1;
                Object player = fantasyAPI16.getPlayer(i2, this);
                return player == lu3Var16 ? lu3Var16 : player;
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
                FantasyAPI fantasyAPI17 = wi7Var.a;
                this.s = 1;
                Object playerFantasyCompetitions = fantasyAPI17.getPlayerFantasyCompetitions(i2, this);
                return playerFantasyCompetitions == lu3Var17 ? lu3Var17 : playerFantasyCompetitions;
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
                FantasyAPI fantasyAPI18 = wi7Var.a;
                this.s = 1;
                Object playerCompleteFormAndFixtures = fantasyAPI18.getPlayerCompleteFormAndFixtures(i2, this);
                return playerCompleteFormAndFixtures == lu3Var18 ? lu3Var18 : playerCompleteFormAndFixtures;
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
                FantasyAPI fantasyAPI19 = wi7Var.a;
                this.s = 1;
                Object playerPriceHistory = fantasyAPI19.getPlayerPriceHistory(i2, this);
                return playerPriceHistory == lu3Var19 ? lu3Var19 : playerPriceHistory;
            case 19:
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
                FantasyAPI fantasyAPI20 = wi7Var.a;
                this.s = 1;
                Object playerRecentFormAndFixtures = fantasyAPI20.getPlayerRecentFormAndFixtures(i2, this);
                return playerRecentFormAndFixtures == lu3Var20 ? lu3Var20 : playerRecentFormAndFixtures;
            case 20:
                lu3 lu3Var21 = lu3.a;
                int i23 = this.s;
                if (i23 != 0) {
                    if (i23 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                FantasyAPI fantasyAPI21 = wi7Var.a;
                this.s = 1;
                Object teamOfTheRound = fantasyAPI21.getTeamOfTheRound(i2, this);
                return teamOfTheRound == lu3Var21 ? lu3Var21 : teamOfTheRound;
            case 21:
                lu3 lu3Var22 = lu3.a;
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
                FantasyAPI fantasyAPI22 = wi7Var.a;
                this.s = 1;
                Object topPlayersPerRound = fantasyAPI22.getTopPlayersPerRound(i2, this);
                return topPlayersPerRound == lu3Var22 ? lu3Var22 : topPlayersPerRound;
            case 22:
                lu3 lu3Var23 = lu3.a;
                int i25 = this.s;
                if (i25 != 0) {
                    if (i25 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                FantasyAPI fantasyAPI23 = wi7Var.a;
                this.s = 1;
                Object hasCompetitionFDR = fantasyAPI23.hasCompetitionFDR(i2, this);
                return hasCompetitionFDR == lu3Var23 ? lu3Var23 : hasCompetitionFDR;
            case 23:
                lu3 lu3Var24 = lu3.a;
                int i26 = this.s;
                if (i26 != 0) {
                    if (i26 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                FantasyAPI fantasyAPI24 = wi7Var.a;
                this.s = 1;
                Object hasPlayerFantasyCompetitions = fantasyAPI24.getHasPlayerFantasyCompetitions(i2, this);
                return hasPlayerFantasyCompetitions == lu3Var24 ? lu3Var24 : hasPlayerFantasyCompetitions;
            case 24:
                lu3 lu3Var25 = lu3.a;
                int i27 = this.s;
                if (i27 != 0) {
                    if (i27 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                FantasyAPI fantasyAPI25 = wi7Var.a;
                this.s = 1;
                Object hasTeamOfTheRound = fantasyAPI25.hasTeamOfTheRound(i2, this);
                return hasTeamOfTheRound == lu3Var25 ? lu3Var25 : hasTeamOfTheRound;
            case 25:
                lu3 lu3Var26 = lu3.a;
                int i28 = this.s;
                if (i28 != 0) {
                    if (i28 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                FantasyAPI fantasyAPI26 = wi7Var.a;
                this.s = 1;
                Object hasTopPlayersPerRound = fantasyAPI26.hasTopPlayersPerRound(i2, this);
                return hasTopPlayersPerRound == lu3Var26 ? lu3Var26 : hasTopPlayersPerRound;
            case 26:
                lu3 lu3Var27 = lu3.a;
                int i29 = this.s;
                if (i29 != 0) {
                    if (i29 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                FantasyAPI fantasyAPI27 = wi7Var.a;
                this.s = 1;
                Object joinRandomLeague = fantasyAPI27.joinRandomLeague(i2, this);
                return joinRandomLeague == lu3Var27 ? lu3Var27 : joinRandomLeague;
            case 27:
                lu3 lu3Var28 = lu3.a;
                int i30 = this.s;
                if (i30 != 0) {
                    if (i30 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                FantasyAPI fantasyAPI28 = wi7Var.a;
                this.s = 1;
                Object leaveLeague = fantasyAPI28.leaveLeague(i2, this);
                return leaveLeague == lu3Var28 ? lu3Var28 : leaveLeague;
            default:
                lu3 lu3Var29 = lu3.a;
                int i31 = this.s;
                if (i31 != 0) {
                    if (i31 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                FantasyAPI fantasyAPI29 = wi7Var.a;
                this.s = 1;
                Object regenerateLeagueJoinCode = fantasyAPI29.regenerateLeagueJoinCode(i2, this);
                return regenerateLeagueJoinCode == lu3Var29 ? lu3Var29 : regenerateLeagueJoinCode;
        }
    }
}
