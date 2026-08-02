package defpackage;

import com.sofascore.model.database.DbFantasyCompetition;
import com.sofascore.model.fantasy.FantasyBasicCompetitionsResponse;
import com.sofascore.model.fantasy.FantasyChatMessageTimestampResponse;
import com.sofascore.model.fantasy.FantasyCompetition;
import com.sofascore.model.fantasy.FantasyCompetitionPlayersResponse;
import com.sofascore.model.fantasy.FantasyCompetitionResponse;
import com.sofascore.model.fantasy.FantasyCompetitionsResponse;
import com.sofascore.model.fantasy.FantasyEventsResponse;
import com.sofascore.model.fantasy.FantasyLeagueConfigResponse;
import com.sofascore.model.fantasy.FantasyLeagueGameType;
import com.sofascore.model.fantasy.FantasyLeagueJoinCodeResponse;
import com.sofascore.model.fantasy.FantasyLeagueLeaderboardResponse;
import com.sofascore.model.fantasy.FantasyLeagueMatchupEntry;
import com.sofascore.model.fantasy.FantasyLeagueMatchupSquad;
import com.sofascore.model.fantasy.FantasyLeagueMatchupsResponse;
import com.sofascore.model.fantasy.FantasyLeagueParticipant;
import com.sofascore.model.fantasy.FantasyLeagueParticipantsResponse;
import com.sofascore.model.fantasy.FantasyLeagueResponse;
import com.sofascore.model.fantasy.FantasyLeagueRoundSquadsResponse;
import com.sofascore.model.fantasy.FantasyNewsArticle;
import com.sofascore.model.fantasy.FantasyNewsArticlesResponse;
import com.sofascore.model.fantasy.FantasyPlayerCompetitionsResponse;
import com.sofascore.model.fantasy.FantasyPlayerPointsBreakdownResponse;
import com.sofascore.model.fantasy.FantasyPlayerPriceHistoryResponse;
import com.sofascore.model.fantasy.FantasyPlayerResponse;
import com.sofascore.model.fantasy.FantasyRound;
import com.sofascore.model.fantasy.FantasyRoundEvent;
import com.sofascore.model.fantasy.FantasyRoundPlayer;
import com.sofascore.model.fantasy.FantasyRoundPlayerStatisticsResponse;
import com.sofascore.model.fantasy.FantasyRoundResponse;
import com.sofascore.model.fantasy.FantasyRoundsResponse;
import com.sofascore.model.fantasy.FantasyTopPlayersPerRoundResponse;
import com.sofascore.model.fantasy.FantasyTransfersResponse;
import com.sofascore.model.fantasy.FantasyUniqueTournamentCompetitionMapping;
import com.sofascore.model.fantasy.FantasyUserCompetition;
import com.sofascore.model.fantasy.FantasyUserCompetitionsResponse;
import com.sofascore.model.fantasy.FantasyUserLeague;
import com.sofascore.model.fantasy.FantasyUserLeaguesResponse;
import com.sofascore.model.fantasy.FantasyUserRound;
import com.sofascore.model.fantasy.FantasyUserRoundRankingsResponse;
import com.sofascore.model.fantasy.FantasyUserRoundResponse;
import com.sofascore.model.fantasy.FantasyUserRoundsResponse;
import com.sofascore.network.api.FantasyAPI;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class wi7 {
    public final FantasyAPI a;
    public final rp6 b;

    public wi7(FantasyAPI fantasyAPI, rp6 rp6Var) {
        fantasyAPI.getClass();
        this.a = fantasyAPI;
        this.b = rp6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable A(sq3 sq3Var) {
        mh7 mh7Var;
        int i;
        if (sq3Var instanceof mh7) {
            mh7Var = (mh7) sq3Var;
            int i2 = mh7Var.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mh7Var.t = i2 - Integer.MIN_VALUE;
                Object obj = mh7Var.r;
                lu3 lu3Var = lu3.a;
                i = mh7Var.t;
                if (i != 0) {
                    y6a.M(obj);
                    mh7Var.t = 1;
                    obj = gz8.U(mh7Var, this.b.a, true, false, new yn6(25));
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return CollectionsKt.Q0((Iterable) obj);
            }
        }
        mh7Var = new mh7(this, sq3Var);
        Object obj2 = mh7Var.r;
        lu3 lu3Var2 = lu3.a;
        i = mh7Var.t;
        if (i != 0) {
        }
        return CollectionsKt.Q0((Iterable) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object B(int i, sq3 sq3Var) {
        nh7 nh7Var;
        int i2;
        FantasyPlayerResponse fantasyPlayerResponse;
        if (sq3Var instanceof nh7) {
            nh7Var = (nh7) sq3Var;
            int i3 = nh7Var.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                nh7Var.t = i3 - Integer.MIN_VALUE;
                Object obj = nh7Var.r;
                lu3 lu3Var = lu3.a;
                i2 = nh7Var.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    hg7 hg7Var = new hg7(this, i, rq3Var, 15);
                    nh7Var.t = 1;
                    obj = yaa.P(hg7Var, nh7Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                fantasyPlayerResponse = (FantasyPlayerResponse) yaa.x((x2g) obj);
                if (fantasyPlayerResponse == null) {
                    return fantasyPlayerResponse.getPlayer();
                }
                return null;
            }
        }
        nh7Var = new nh7(this, sq3Var);
        Object obj2 = nh7Var.r;
        lu3 lu3Var2 = lu3.a;
        i2 = nh7Var.t;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        fantasyPlayerResponse = (FantasyPlayerResponse) yaa.x((x2g) obj2);
        if (fantasyPlayerResponse == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object C(int i, int i2, int i3, sq3 sq3Var) {
        oh7 oh7Var;
        int i4;
        FantasyPlayerPointsBreakdownResponse fantasyPlayerPointsBreakdownResponse;
        if (sq3Var instanceof oh7) {
            oh7Var = (oh7) sq3Var;
            int i5 = oh7Var.t;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                oh7Var.t = i5 - Integer.MIN_VALUE;
                Object obj = oh7Var.r;
                lu3 lu3Var = lu3.a;
                i4 = oh7Var.t;
                if (i4 != 0) {
                    y6a.M(obj);
                    hh7 hh7Var = new hh7(this, i, i2, i3, null, 1);
                    oh7Var.t = 1;
                    obj = yaa.P(hh7Var, oh7Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i4 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                fantasyPlayerPointsBreakdownResponse = (FantasyPlayerPointsBreakdownResponse) yaa.x((x2g) obj);
                if (fantasyPlayerPointsBreakdownResponse == null) {
                    return fantasyPlayerPointsBreakdownResponse.getPoints();
                }
                return null;
            }
        }
        oh7Var = new oh7(this, sq3Var);
        Object obj2 = oh7Var.r;
        lu3 lu3Var2 = lu3.a;
        i4 = oh7Var.t;
        if (i4 != 0) {
        }
        fantasyPlayerPointsBreakdownResponse = (FantasyPlayerPointsBreakdownResponse) yaa.x((x2g) obj2);
        if (fantasyPlayerPointsBreakdownResponse == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object D(int i, sq3 sq3Var) {
        ph7 ph7Var;
        int i2;
        FantasyPlayerCompetitionsResponse fantasyPlayerCompetitionsResponse;
        if (sq3Var instanceof ph7) {
            ph7Var = (ph7) sq3Var;
            int i3 = ph7Var.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ph7Var.t = i3 - Integer.MIN_VALUE;
                Object obj = ph7Var.r;
                lu3 lu3Var = lu3.a;
                i2 = ph7Var.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    hg7 hg7Var = new hg7(this, i, rq3Var, 16);
                    ph7Var.t = 1;
                    obj = yaa.P(hg7Var, ph7Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                fantasyPlayerCompetitionsResponse = (FantasyPlayerCompetitionsResponse) yaa.x((x2g) obj);
                if (fantasyPlayerCompetitionsResponse == null) {
                    return fantasyPlayerCompetitionsResponse.getCompetitions();
                }
                return null;
            }
        }
        ph7Var = new ph7(this, sq3Var);
        Object obj2 = ph7Var.r;
        lu3 lu3Var2 = lu3.a;
        i2 = ph7Var.t;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        fantasyPlayerCompetitionsResponse = (FantasyPlayerCompetitionsResponse) yaa.x((x2g) obj2);
        if (fantasyPlayerCompetitionsResponse == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object E(int i, sq3 sq3Var) {
        qh7 qh7Var;
        int i2;
        if (sq3Var instanceof qh7) {
            qh7Var = (qh7) sq3Var;
            int i3 = qh7Var.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                qh7Var.t = i3 - Integer.MIN_VALUE;
                Object obj = qh7Var.r;
                lu3 lu3Var = lu3.a;
                i2 = qh7Var.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    hg7 hg7Var = new hg7(this, i, rq3Var, 17);
                    qh7Var.t = 1;
                    obj = yaa.P(hg7Var, qh7Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return yaa.x((x2g) obj);
            }
        }
        qh7Var = new qh7(this, sq3Var);
        Object obj2 = qh7Var.r;
        lu3 lu3Var2 = lu3.a;
        i2 = qh7Var.t;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object F(int i, sq3 sq3Var) {
        rh7 rh7Var;
        int i2;
        FantasyPlayerPriceHistoryResponse fantasyPlayerPriceHistoryResponse;
        if (sq3Var instanceof rh7) {
            rh7Var = (rh7) sq3Var;
            int i3 = rh7Var.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                rh7Var.t = i3 - Integer.MIN_VALUE;
                Object obj = rh7Var.r;
                lu3 lu3Var = lu3.a;
                i2 = rh7Var.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    hg7 hg7Var = new hg7(this, i, rq3Var, 18);
                    rh7Var.t = 1;
                    obj = yaa.P(hg7Var, rh7Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                fantasyPlayerPriceHistoryResponse = (FantasyPlayerPriceHistoryResponse) yaa.x((x2g) obj);
                if (fantasyPlayerPriceHistoryResponse == null) {
                    return fantasyPlayerPriceHistoryResponse.getPrices();
                }
                return null;
            }
        }
        rh7Var = new rh7(this, sq3Var);
        Object obj2 = rh7Var.r;
        lu3 lu3Var2 = lu3.a;
        i2 = rh7Var.t;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        fantasyPlayerPriceHistoryResponse = (FantasyPlayerPriceHistoryResponse) yaa.x((x2g) obj2);
        if (fantasyPlayerPriceHistoryResponse == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object G(int i, sq3 sq3Var) {
        sh7 sh7Var;
        int i2;
        if (sq3Var instanceof sh7) {
            sh7Var = (sh7) sq3Var;
            int i3 = sh7Var.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                sh7Var.t = i3 - Integer.MIN_VALUE;
                Object obj = sh7Var.r;
                lu3 lu3Var = lu3.a;
                i2 = sh7Var.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    hg7 hg7Var = new hg7(this, i, rq3Var, 19);
                    sh7Var.t = 1;
                    obj = yaa.P(hg7Var, sh7Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return yaa.x((x2g) obj);
            }
        }
        sh7Var = new sh7(this, sq3Var);
        Object obj2 = sh7Var.r;
        lu3 lu3Var2 = lu3.a;
        i2 = sh7Var.t;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object H(int i, int i2, sq3 sq3Var) {
        th7 th7Var;
        int i3;
        if (sq3Var instanceof th7) {
            th7Var = (th7) sq3Var;
            int i4 = th7Var.t;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                th7Var.t = i4 - Integer.MIN_VALUE;
                Object obj = th7Var.r;
                lu3 lu3Var = lu3.a;
                i3 = th7Var.t;
                if (i3 != 0) {
                    y6a.M(obj);
                    yg7 yg7Var = new yg7(this, i, i2, null, 4);
                    th7Var.t = 1;
                    obj = yaa.P(yg7Var, th7Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i3 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return yaa.x((x2g) obj);
            }
        }
        th7Var = new th7(this, sq3Var);
        Object obj2 = th7Var.r;
        lu3 lu3Var2 = lu3.a;
        i3 = th7Var.t;
        if (i3 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object I(int i, int i2, String str, Integer num, Float f, String str2, String str3, String str4, sq3 sq3Var) {
        uh7 uh7Var;
        int i3;
        List<FantasyRoundPlayer> players;
        if (sq3Var instanceof uh7) {
            uh7Var = (uh7) sq3Var;
            int i4 = uh7Var.t;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                uh7Var.t = i4 - Integer.MIN_VALUE;
                Object obj = uh7Var.r;
                lu3 lu3Var = lu3.a;
                i3 = uh7Var.t;
                if (i3 != 0) {
                    y6a.M(obj);
                    vh7 vh7Var = new vh7(this, i, i2, str, str2, num, f, str3, str4, null);
                    uh7Var.t = 1;
                    obj = yaa.P(vh7Var, uh7Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i3 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                FantasyCompetitionPlayersResponse fantasyCompetitionPlayersResponse = (FantasyCompetitionPlayersResponse) yaa.x((x2g) obj);
                return (fantasyCompetitionPlayersResponse != null || (players = fantasyCompetitionPlayersResponse.getPlayers()) == null) ? km5.a : players;
            }
        }
        uh7Var = new uh7(this, sq3Var);
        Object obj2 = uh7Var.r;
        lu3 lu3Var2 = lu3.a;
        i3 = uh7Var.t;
        if (i3 != 0) {
        }
        FantasyCompetitionPlayersResponse fantasyCompetitionPlayersResponse2 = (FantasyCompetitionPlayersResponse) yaa.x((x2g) obj2);
        if (fantasyCompetitionPlayersResponse2 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object J(int i, sq3 sq3Var) {
        wh7 wh7Var;
        int i2;
        if (sq3Var instanceof wh7) {
            wh7Var = (wh7) sq3Var;
            int i3 = wh7Var.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                wh7Var.t = i3 - Integer.MIN_VALUE;
                Object obj = wh7Var.r;
                lu3 lu3Var = lu3.a;
                i2 = wh7Var.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    hg7 hg7Var = new hg7(this, i, rq3Var, 20);
                    wh7Var.t = 1;
                    obj = yaa.P(hg7Var, wh7Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return yaa.x((x2g) obj);
            }
        }
        wh7Var = new wh7(this, sq3Var);
        Object obj2 = wh7Var.r;
        lu3 lu3Var2 = lu3.a;
        i2 = wh7Var.t;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object K(int i, sq3 sq3Var) {
        xh7 xh7Var;
        int i2;
        FantasyTopPlayersPerRoundResponse fantasyTopPlayersPerRoundResponse;
        if (sq3Var instanceof xh7) {
            xh7Var = (xh7) sq3Var;
            int i3 = xh7Var.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                xh7Var.t = i3 - Integer.MIN_VALUE;
                Object obj = xh7Var.r;
                lu3 lu3Var = lu3.a;
                i2 = xh7Var.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    hg7 hg7Var = new hg7(this, i, rq3Var, 21);
                    xh7Var.t = 1;
                    obj = yaa.P(hg7Var, xh7Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                fantasyTopPlayersPerRoundResponse = (FantasyTopPlayersPerRoundResponse) yaa.x((x2g) obj);
                if (fantasyTopPlayersPerRoundResponse == null) {
                    return fantasyTopPlayersPerRoundResponse.getTopPlayers();
                }
                return null;
            }
        }
        xh7Var = new xh7(this, sq3Var);
        Object obj2 = xh7Var.r;
        lu3 lu3Var2 = lu3.a;
        i2 = xh7Var.t;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        fantasyTopPlayersPerRoundResponse = (FantasyTopPlayersPerRoundResponse) yaa.x((x2g) obj2);
        if (fantasyTopPlayersPerRoundResponse == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object L(String str, sq3 sq3Var) {
        yh7 yh7Var;
        int i;
        FantasyUniqueTournamentCompetitionMapping fantasyUniqueTournamentCompetitionMapping;
        if (sq3Var instanceof yh7) {
            yh7Var = (yh7) sq3Var;
            int i2 = yh7Var.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yh7Var.t = i2 - Integer.MIN_VALUE;
                Object obj = yh7Var.r;
                lu3 lu3Var = lu3.a;
                i = yh7Var.t;
                rq3 rq3Var = null;
                if (i != 0) {
                    y6a.M(obj);
                    ug7 ug7Var = new ug7(this, str, rq3Var, 2);
                    yh7Var.t = 1;
                    obj = yaa.P(ug7Var, yh7Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                fantasyUniqueTournamentCompetitionMapping = (FantasyUniqueTournamentCompetitionMapping) yaa.x((x2g) obj);
                if (fantasyUniqueTournamentCompetitionMapping == null) {
                    return fantasyUniqueTournamentCompetitionMapping.getFantasyCompetitionMap();
                }
                return null;
            }
        }
        yh7Var = new yh7(this, sq3Var);
        Object obj2 = yh7Var.r;
        lu3 lu3Var2 = lu3.a;
        i = yh7Var.t;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
        fantasyUniqueTournamentCompetitionMapping = (FantasyUniqueTournamentCompetitionMapping) yaa.x((x2g) obj2);
        if (fantasyUniqueTournamentCompetitionMapping == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object M(sq3 sq3Var) {
        zh7 zh7Var;
        int i;
        FantasyBasicCompetitionsResponse fantasyBasicCompetitionsResponse;
        if (sq3Var instanceof zh7) {
            zh7Var = (zh7) sq3Var;
            int i2 = zh7Var.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zh7Var.t = i2 - Integer.MIN_VALUE;
                Object obj = zh7Var.r;
                lu3 lu3Var = lu3.a;
                i = zh7Var.t;
                rq3 rq3Var = null;
                int i3 = 1;
                if (i != 0) {
                    y6a.M(obj);
                    sg7 sg7Var = new sg7(this, rq3Var, i3);
                    zh7Var.t = 1;
                    obj = yaa.P(sg7Var, zh7Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                fantasyBasicCompetitionsResponse = (FantasyBasicCompetitionsResponse) yaa.x((x2g) obj);
                if (fantasyBasicCompetitionsResponse == null) {
                    return fantasyBasicCompetitionsResponse.getCompetitions();
                }
                return null;
            }
        }
        zh7Var = new zh7(this, sq3Var);
        Object obj2 = zh7Var.r;
        lu3 lu3Var2 = lu3.a;
        i = zh7Var.t;
        rq3 rq3Var2 = null;
        int i32 = 1;
        if (i != 0) {
        }
        fantasyBasicCompetitionsResponse = (FantasyBasicCompetitionsResponse) yaa.x((x2g) obj2);
        if (fantasyBasicCompetitionsResponse == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object N(int i, String str, sq3 sq3Var) {
        ai7 ai7Var;
        int i2;
        if (sq3Var instanceof ai7) {
            ai7Var = (ai7) sq3Var;
            int i3 = ai7Var.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ai7Var.t = i3 - Integer.MIN_VALUE;
                Object obj = ai7Var.r;
                lu3 lu3Var = lu3.a;
                i2 = ai7Var.t;
                if (i2 != 0) {
                    y6a.M(obj);
                    kg7 kg7Var = new kg7(this, str, i, (rq3) null, 2);
                    ai7Var.t = 1;
                    obj = yaa.P(kg7Var, ai7Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return yaa.x((x2g) obj);
            }
        }
        ai7Var = new ai7(this, sq3Var);
        Object obj2 = ai7Var.r;
        lu3 lu3Var2 = lu3.a;
        i2 = ai7Var.t;
        if (i2 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object O(int i, String str, sq3 sq3Var) {
        bi7 bi7Var;
        int i2;
        FantasyUserRoundsResponse fantasyUserRoundsResponse;
        List<FantasyUserRound> userRounds;
        if (sq3Var instanceof bi7) {
            bi7Var = (bi7) sq3Var;
            int i3 = bi7Var.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                bi7Var.t = i3 - Integer.MIN_VALUE;
                Object obj = bi7Var.r;
                lu3 lu3Var = lu3.a;
                i2 = bi7Var.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    kg7 kg7Var = new kg7(this, str, i, rq3Var, 3);
                    bi7Var.t = 1;
                    obj = yaa.P(kg7Var, bi7Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                fantasyUserRoundsResponse = (FantasyUserRoundsResponse) yaa.x((x2g) obj);
                if (fantasyUserRoundsResponse != null || (userRounds = fantasyUserRoundsResponse.getUserRounds()) == null || userRounds.isEmpty()) {
                    return null;
                }
                return userRounds;
            }
        }
        bi7Var = new bi7(this, sq3Var);
        Object obj2 = bi7Var.r;
        lu3 lu3Var2 = lu3.a;
        i2 = bi7Var.t;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        fantasyUserRoundsResponse = (FantasyUserRoundsResponse) yaa.x((x2g) obj2);
        if (fantasyUserRoundsResponse != null) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object P(int i, String str, sq3 sq3Var) {
        ci7 ci7Var;
        int i2;
        FantasyTransfersResponse fantasyTransfersResponse;
        if (sq3Var instanceof ci7) {
            ci7Var = (ci7) sq3Var;
            int i3 = ci7Var.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ci7Var.t = i3 - Integer.MIN_VALUE;
                Object obj = ci7Var.r;
                lu3 lu3Var = lu3.a;
                i2 = ci7Var.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    kg7 kg7Var = new kg7(this, str, i, rq3Var, 4);
                    ci7Var.t = 1;
                    obj = yaa.P(kg7Var, ci7Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                fantasyTransfersResponse = (FantasyTransfersResponse) yaa.x((x2g) obj);
                if (fantasyTransfersResponse == null) {
                    return fantasyTransfersResponse.getTransfers();
                }
                return null;
            }
        }
        ci7Var = new ci7(this, sq3Var);
        Object obj2 = ci7Var.r;
        lu3 lu3Var2 = lu3.a;
        i2 = ci7Var.t;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        fantasyTransfersResponse = (FantasyTransfersResponse) yaa.x((x2g) obj2);
        if (fantasyTransfersResponse == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Q(String str, sq3 sq3Var) {
        di7 di7Var;
        int i;
        List<FantasyUserCompetition> competitions;
        if (sq3Var instanceof di7) {
            di7Var = (di7) sq3Var;
            int i2 = di7Var.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                di7Var.t = i2 - Integer.MIN_VALUE;
                Object obj = di7Var.r;
                lu3 lu3Var = lu3.a;
                i = di7Var.t;
                rq3 rq3Var = null;
                if (i != 0) {
                    y6a.M(obj);
                    ug7 ug7Var = new ug7(this, str, rq3Var, 3);
                    di7Var.t = 1;
                    obj = yaa.P(ug7Var, di7Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                FantasyUserCompetitionsResponse fantasyUserCompetitionsResponse = (FantasyUserCompetitionsResponse) yaa.x((x2g) obj);
                return (fantasyUserCompetitionsResponse != null || (competitions = fantasyUserCompetitionsResponse.getCompetitions()) == null) ? km5.a : competitions;
            }
        }
        di7Var = new di7(this, sq3Var);
        Object obj2 = di7Var.r;
        lu3 lu3Var2 = lu3.a;
        i = di7Var.t;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
        FantasyUserCompetitionsResponse fantasyUserCompetitionsResponse2 = (FantasyUserCompetitionsResponse) yaa.x((x2g) obj2);
        if (fantasyUserCompetitionsResponse2 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object R(String str, sq3 sq3Var) {
        ei7 ei7Var;
        int i;
        List<FantasyUserCompetition> competitions;
        if (sq3Var instanceof ei7) {
            ei7Var = (ei7) sq3Var;
            int i2 = ei7Var.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ei7Var.t = i2 - Integer.MIN_VALUE;
                Object obj = ei7Var.r;
                lu3 lu3Var = lu3.a;
                i = ei7Var.t;
                rq3 rq3Var = null;
                if (i != 0) {
                    y6a.M(obj);
                    ug7 ug7Var = new ug7(this, str, rq3Var, 5);
                    ei7Var.t = 1;
                    obj = yaa.P(ug7Var, ei7Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                FantasyUserCompetitionsResponse fantasyUserCompetitionsResponse = (FantasyUserCompetitionsResponse) yaa.x((x2g) obj);
                return (fantasyUserCompetitionsResponse != null || (competitions = fantasyUserCompetitionsResponse.getCompetitions()) == null) ? km5.a : competitions;
            }
        }
        ei7Var = new ei7(this, sq3Var);
        Object obj2 = ei7Var.r;
        lu3 lu3Var2 = lu3.a;
        i = ei7Var.t;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
        FantasyUserCompetitionsResponse fantasyUserCompetitionsResponse2 = (FantasyUserCompetitionsResponse) yaa.x((x2g) obj2);
        if (fantasyUserCompetitionsResponse2 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object S(int i, String str, sq3 sq3Var) {
        fi7 fi7Var;
        int i2;
        FantasyUserLeaguesResponse fantasyUserLeaguesResponse;
        if (sq3Var instanceof fi7) {
            fi7Var = (fi7) sq3Var;
            int i3 = fi7Var.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                fi7Var.t = i3 - Integer.MIN_VALUE;
                Object obj = fi7Var.r;
                lu3 lu3Var = lu3.a;
                i2 = fi7Var.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    kg7 kg7Var = new kg7(this, str, i, rq3Var, 5);
                    fi7Var.t = 1;
                    obj = yaa.P(kg7Var, fi7Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                fantasyUserLeaguesResponse = (FantasyUserLeaguesResponse) yaa.x((x2g) obj);
                if (fantasyUserLeaguesResponse == null) {
                    return fantasyUserLeaguesResponse.getLeagues();
                }
                return null;
            }
        }
        fi7Var = new fi7(this, sq3Var);
        Object obj2 = fi7Var.r;
        lu3 lu3Var2 = lu3.a;
        i2 = fi7Var.t;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        fantasyUserLeaguesResponse = (FantasyUserLeaguesResponse) yaa.x((x2g) obj2);
        if (fantasyUserLeaguesResponse == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object T(int i, String str, sq3 sq3Var) {
        gi7 gi7Var;
        int i2;
        List<FantasyUserLeague> leagues;
        if (sq3Var instanceof gi7) {
            gi7Var = (gi7) sq3Var;
            int i3 = gi7Var.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                gi7Var.t = i3 - Integer.MIN_VALUE;
                Object obj = gi7Var.r;
                lu3 lu3Var = lu3.a;
                i2 = gi7Var.t;
                if (i2 != 0) {
                    y6a.M(obj);
                    kg7 kg7Var = new kg7(this, str, i, (rq3) null, 6);
                    gi7Var.t = 1;
                    obj = yaa.P(kg7Var, gi7Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                FantasyUserLeaguesResponse fantasyUserLeaguesResponse = (FantasyUserLeaguesResponse) yaa.x((x2g) obj);
                return (fantasyUserLeaguesResponse != null || (leagues = fantasyUserLeaguesResponse.getLeagues()) == null) ? km5.a : leagues;
            }
        }
        gi7Var = new gi7(this, sq3Var);
        Object obj2 = gi7Var.r;
        lu3 lu3Var2 = lu3.a;
        i2 = gi7Var.t;
        if (i2 != 0) {
        }
        FantasyUserLeaguesResponse fantasyUserLeaguesResponse2 = (FantasyUserLeaguesResponse) yaa.x((x2g) obj2);
        if (fantasyUserLeaguesResponse2 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object U(int i, String str, sq3 sq3Var) {
        hi7 hi7Var;
        int i2;
        FantasyUserRoundResponse fantasyUserRoundResponse;
        if (sq3Var instanceof hi7) {
            hi7Var = (hi7) sq3Var;
            int i3 = hi7Var.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                hi7Var.t = i3 - Integer.MIN_VALUE;
                Object obj = hi7Var.r;
                lu3 lu3Var = lu3.a;
                i2 = hi7Var.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    kg7 kg7Var = new kg7(this, str, i, rq3Var, 7);
                    hi7Var.t = 1;
                    obj = yaa.P(kg7Var, hi7Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                fantasyUserRoundResponse = (FantasyUserRoundResponse) yaa.x((x2g) obj);
                if (fantasyUserRoundResponse == null) {
                    return fantasyUserRoundResponse.getRound();
                }
                return null;
            }
        }
        hi7Var = new hi7(this, sq3Var);
        Object obj2 = hi7Var.r;
        lu3 lu3Var2 = lu3.a;
        i2 = hi7Var.t;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        fantasyUserRoundResponse = (FantasyUserRoundResponse) yaa.x((x2g) obj2);
        if (fantasyUserRoundResponse == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0054 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object V(int i, String str, sq3 sq3Var) {
        ii7 ii7Var;
        int i2;
        FantasyUserRoundRankingsResponse fantasyUserRoundRankingsResponse;
        if (sq3Var instanceof ii7) {
            ii7Var = (ii7) sq3Var;
            int i3 = ii7Var.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ii7Var.t = i3 - Integer.MIN_VALUE;
                Object obj = ii7Var.r;
                lu3 lu3Var = lu3.a;
                i2 = ii7Var.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    kg7 kg7Var = new kg7(this, str, i, rq3Var, 8);
                    ii7Var.t = 1;
                    obj = yaa.P(kg7Var, ii7Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                fantasyUserRoundRankingsResponse = (FantasyUserRoundRankingsResponse) yaa.x((x2g) obj);
                if (fantasyUserRoundRankingsResponse == null) {
                    return fantasyUserRoundRankingsResponse.getOverview();
                }
                return null;
            }
        }
        ii7Var = new ii7(this, sq3Var);
        Object obj2 = ii7Var.r;
        lu3 lu3Var2 = lu3.a;
        i2 = ii7Var.t;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        fantasyUserRoundRankingsResponse = (FantasyUserRoundRankingsResponse) yaa.x((x2g) obj2);
        if (fantasyUserRoundRankingsResponse == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object W(int i, String str, sq3 sq3Var) {
        ji7 ji7Var;
        int i2;
        if (sq3Var instanceof ji7) {
            ji7Var = (ji7) sq3Var;
            int i3 = ji7Var.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ji7Var.t = i3 - Integer.MIN_VALUE;
                Object obj = ji7Var.r;
                lu3 lu3Var = lu3.a;
                i2 = ji7Var.t;
                if (i2 != 0) {
                    y6a.M(obj);
                    kg7 kg7Var = new kg7(this, str, i, (rq3) null, 9);
                    ji7Var.t = 1;
                    obj = yaa.P(kg7Var, ji7Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return yaa.x((x2g) obj);
            }
        }
        ji7Var = new ji7(this, sq3Var);
        Object obj2 = ji7Var.r;
        lu3 lu3Var2 = lu3.a;
        i2 = ji7Var.t;
        if (i2 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object X(int i, sq3 sq3Var) {
        ki7 ki7Var;
        int i2;
        if (sq3Var instanceof ki7) {
            ki7Var = (ki7) sq3Var;
            int i3 = ki7Var.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ki7Var.t = i3 - Integer.MIN_VALUE;
                Object obj = ki7Var.r;
                lu3 lu3Var = lu3.a;
                i2 = ki7Var.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    hg7 hg7Var = new hg7(this, i, rq3Var, 22);
                    ki7Var.t = 1;
                    obj = yaa.P(hg7Var, ki7Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                x2g x2gVar = (x2g) obj;
                x2gVar.getClass();
                return Boolean.valueOf(x2gVar instanceof v2g);
            }
        }
        ki7Var = new ki7(this, sq3Var);
        Object obj2 = ki7Var.r;
        lu3 lu3Var2 = lu3.a;
        i2 = ki7Var.t;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        x2g x2gVar2 = (x2g) obj2;
        x2gVar2.getClass();
        return Boolean.valueOf(x2gVar2 instanceof v2g);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Y(int i, sq3 sq3Var) {
        li7 li7Var;
        int i2;
        if (sq3Var instanceof li7) {
            li7Var = (li7) sq3Var;
            int i3 = li7Var.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                li7Var.t = i3 - Integer.MIN_VALUE;
                Object obj = li7Var.r;
                lu3 lu3Var = lu3.a;
                i2 = li7Var.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    hg7 hg7Var = new hg7(this, i, rq3Var, 23);
                    li7Var.t = 1;
                    obj = yaa.P(hg7Var, li7Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                x2g x2gVar = (x2g) obj;
                x2gVar.getClass();
                return Boolean.valueOf(x2gVar instanceof v2g);
            }
        }
        li7Var = new li7(this, sq3Var);
        Object obj2 = li7Var.r;
        lu3 lu3Var2 = lu3.a;
        i2 = li7Var.t;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        x2g x2gVar2 = (x2g) obj2;
        x2gVar2.getClass();
        return Boolean.valueOf(x2gVar2 instanceof v2g);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Z(int i, sq3 sq3Var) {
        mi7 mi7Var;
        int i2;
        if (sq3Var instanceof mi7) {
            mi7Var = (mi7) sq3Var;
            int i3 = mi7Var.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                mi7Var.t = i3 - Integer.MIN_VALUE;
                Object obj = mi7Var.r;
                lu3 lu3Var = lu3.a;
                i2 = mi7Var.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    hg7 hg7Var = new hg7(this, i, rq3Var, 24);
                    mi7Var.t = 1;
                    obj = yaa.P(hg7Var, mi7Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                x2g x2gVar = (x2g) obj;
                x2gVar.getClass();
                return Boolean.valueOf(x2gVar instanceof v2g);
            }
        }
        mi7Var = new mi7(this, sq3Var);
        Object obj2 = mi7Var.r;
        lu3 lu3Var2 = lu3.a;
        i2 = mi7Var.t;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        x2g x2gVar2 = (x2g) obj2;
        x2gVar2.getClass();
        return Boolean.valueOf(x2gVar2 instanceof v2g);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(int i, String str, String str2, FantasyLeagueGameType fantasyLeagueGameType, sq3 sq3Var) {
        eg7 eg7Var;
        int i2;
        if (sq3Var instanceof eg7) {
            eg7Var = (eg7) sq3Var;
            int i3 = eg7Var.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                eg7Var.t = i3 - Integer.MIN_VALUE;
                Object obj = eg7Var.r;
                lu3 lu3Var = lu3.a;
                i2 = eg7Var.t;
                if (i2 != 0) {
                    y6a.M(obj);
                    fg7 fg7Var = new fg7(this, i, str, str2, fantasyLeagueGameType, (rq3) null, 0);
                    eg7Var.t = 1;
                    obj = yaa.P(fg7Var, eg7Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return yaa.x((x2g) obj);
            }
        }
        eg7Var = new eg7(this, sq3Var);
        Object obj2 = eg7Var.r;
        lu3 lu3Var2 = lu3.a;
        i2 = eg7Var.t;
        if (i2 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a0(int i, sq3 sq3Var) {
        ni7 ni7Var;
        int i2;
        if (sq3Var instanceof ni7) {
            ni7Var = (ni7) sq3Var;
            int i3 = ni7Var.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ni7Var.t = i3 - Integer.MIN_VALUE;
                Object obj = ni7Var.r;
                lu3 lu3Var = lu3.a;
                i2 = ni7Var.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    hg7 hg7Var = new hg7(this, i, rq3Var, 25);
                    ni7Var.t = 1;
                    obj = yaa.P(hg7Var, ni7Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                x2g x2gVar = (x2g) obj;
                x2gVar.getClass();
                return Boolean.valueOf(x2gVar instanceof v2g);
            }
        }
        ni7Var = new ni7(this, sq3Var);
        Object obj2 = ni7Var.r;
        lu3 lu3Var2 = lu3.a;
        i2 = ni7Var.t;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        x2g x2gVar2 = (x2g) obj2;
        x2gVar2.getClass();
        return Boolean.valueOf(x2gVar2 instanceof v2g);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(int i, sq3 sq3Var) {
        gg7 gg7Var;
        int i2;
        if (sq3Var instanceof gg7) {
            gg7Var = (gg7) sq3Var;
            int i3 = gg7Var.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                gg7Var.t = i3 - Integer.MIN_VALUE;
                Object obj = gg7Var.r;
                lu3 lu3Var = lu3.a;
                i2 = gg7Var.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    hg7 hg7Var = new hg7(this, i, rq3Var, 0);
                    gg7Var.t = 1;
                    obj = yaa.P(hg7Var, gg7Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                x2g x2gVar = (x2g) obj;
                x2gVar.getClass();
                return Boolean.valueOf(x2gVar instanceof v2g);
            }
        }
        gg7Var = new gg7(this, sq3Var);
        Object obj2 = gg7Var.r;
        lu3 lu3Var2 = lu3.a;
        i2 = gg7Var.t;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        x2g x2gVar2 = (x2g) obj2;
        x2gVar2.getClass();
        return Boolean.valueOf(x2gVar2 instanceof v2g);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b0(int i, String str, sq3 sq3Var) {
        oi7 oi7Var;
        int i2;
        if (sq3Var instanceof oi7) {
            oi7Var = (oi7) sq3Var;
            int i3 = oi7Var.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                oi7Var.t = i3 - Integer.MIN_VALUE;
                Object obj = oi7Var.r;
                lu3 lu3Var = lu3.a;
                i2 = oi7Var.t;
                if (i2 != 0) {
                    y6a.M(obj);
                    kg7 kg7Var = new kg7(this, str, i, (rq3) null, 10);
                    oi7Var.t = 1;
                    obj = yaa.P(kg7Var, oi7Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                x2g x2gVar = (x2g) obj;
                x2gVar.getClass();
                return Boolean.valueOf(x2gVar instanceof v2g);
            }
        }
        oi7Var = new oi7(this, sq3Var);
        Object obj2 = oi7Var.r;
        lu3 lu3Var2 = lu3.a;
        i2 = oi7Var.t;
        if (i2 != 0) {
        }
        x2g x2gVar2 = (x2g) obj2;
        x2gVar2.getClass();
        return Boolean.valueOf(x2gVar2 instanceof v2g);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(int i, sq3 sq3Var) {
        ig7 ig7Var;
        int i2;
        if (sq3Var instanceof ig7) {
            ig7Var = (ig7) sq3Var;
            int i3 = ig7Var.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ig7Var.t = i3 - Integer.MIN_VALUE;
                Object obj = ig7Var.r;
                lu3 lu3Var = lu3.a;
                i2 = ig7Var.t;
                if (i2 != 0) {
                    y6a.M(obj);
                    ig7Var.t = 1;
                    obj = gz8.U(ig7Var, this.b.a, false, true, new q13(i, 15));
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Boolean.valueOf(((Number) obj).intValue() > 0);
            }
        }
        ig7Var = new ig7(this, sq3Var);
        Object obj2 = ig7Var.r;
        lu3 lu3Var2 = lu3.a;
        i2 = ig7Var.t;
        if (i2 != 0) {
        }
        return Boolean.valueOf(((Number) obj2).intValue() > 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c0(int i, String str, sq3 sq3Var) {
        pi7 pi7Var;
        int i2;
        if (sq3Var instanceof pi7) {
            pi7Var = (pi7) sq3Var;
            int i3 = pi7Var.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                pi7Var.t = i3 - Integer.MIN_VALUE;
                Object obj = pi7Var.r;
                lu3 lu3Var = lu3.a;
                i2 = pi7Var.t;
                if (i2 != 0) {
                    y6a.M(obj);
                    kg7 kg7Var = new kg7(this, str, i, (rq3) null, 11);
                    pi7Var.t = 1;
                    obj = yaa.P(kg7Var, pi7Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                x2g x2gVar = (x2g) obj;
                x2gVar.getClass();
                return Boolean.valueOf(x2gVar instanceof v2g);
            }
        }
        pi7Var = new pi7(this, sq3Var);
        Object obj2 = pi7Var.r;
        lu3 lu3Var2 = lu3.a;
        i2 = pi7Var.t;
        if (i2 != 0) {
        }
        x2g x2gVar2 = (x2g) obj2;
        x2gVar2.getClass();
        return Boolean.valueOf(x2gVar2 instanceof v2g);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(int i, String str, String str2, sq3 sq3Var) {
        jg7 jg7Var;
        int i2;
        if (sq3Var instanceof jg7) {
            jg7Var = (jg7) sq3Var;
            int i3 = jg7Var.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                jg7Var.t = i3 - Integer.MIN_VALUE;
                Object obj = jg7Var.r;
                lu3 lu3Var = lu3.a;
                i2 = jg7Var.t;
                if (i2 != 0) {
                    y6a.M(obj);
                    bs2 bs2Var = new bs2(this, i, str, str2, null, 3);
                    jg7Var.t = 1;
                    obj = yaa.P(bs2Var, jg7Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return yaa.x((x2g) obj);
            }
        }
        jg7Var = new jg7(this, sq3Var);
        Object obj2 = jg7Var.r;
        lu3 lu3Var2 = lu3.a;
        i2 = jg7Var.t;
        if (i2 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d0(int i, sq3 sq3Var) {
        qi7 qi7Var;
        int i2;
        if (sq3Var instanceof qi7) {
            qi7Var = (qi7) sq3Var;
            int i3 = qi7Var.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                qi7Var.t = i3 - Integer.MIN_VALUE;
                Object obj = qi7Var.r;
                lu3 lu3Var = lu3.a;
                i2 = qi7Var.t;
                if (i2 != 0) {
                    y6a.M(obj);
                    DbFantasyCompetition dbFantasyCompetition = new DbFantasyCompetition(i);
                    qi7Var.t = 1;
                    rp6 rp6Var = this.b;
                    obj = gz8.U(qi7Var, rp6Var.a, false, true, new xw5(23, rp6Var, dbFantasyCompetition));
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Boolean.valueOf(((Number) obj).longValue() != -1);
            }
        }
        qi7Var = new qi7(this, sq3Var);
        Object obj2 = qi7Var.r;
        lu3 lu3Var2 = lu3.a;
        i2 = qi7Var.t;
        if (i2 != 0) {
        }
        return Boolean.valueOf(((Number) obj2).longValue() != -1);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(int i, sq3 sq3Var) {
        lg7 lg7Var;
        int i2;
        FantasyCompetitionResponse fantasyCompetitionResponse;
        if (sq3Var instanceof lg7) {
            lg7Var = (lg7) sq3Var;
            int i3 = lg7Var.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                lg7Var.t = i3 - Integer.MIN_VALUE;
                Object obj = lg7Var.r;
                lu3 lu3Var = lu3.a;
                i2 = lg7Var.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    hg7 hg7Var = new hg7(this, i, rq3Var, 2);
                    lg7Var.t = 1;
                    obj = yaa.P(hg7Var, lg7Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                fantasyCompetitionResponse = (FantasyCompetitionResponse) yaa.x((x2g) obj);
                if (fantasyCompetitionResponse == null) {
                    return fantasyCompetitionResponse.getCompetition();
                }
                return null;
            }
        }
        lg7Var = new lg7(this, sq3Var);
        Object obj2 = lg7Var.r;
        lu3 lu3Var2 = lu3.a;
        i2 = lg7Var.t;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        fantasyCompetitionResponse = (FantasyCompetitionResponse) yaa.x((x2g) obj2);
        if (fantasyCompetitionResponse == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e0(int i, sq3 sq3Var) {
        ri7 ri7Var;
        int i2;
        if (sq3Var instanceof ri7) {
            ri7Var = (ri7) sq3Var;
            int i3 = ri7Var.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ri7Var.t = i3 - Integer.MIN_VALUE;
                Object obj = ri7Var.r;
                lu3 lu3Var = lu3.a;
                i2 = ri7Var.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    hg7 hg7Var = new hg7(this, i, rq3Var, 26);
                    ri7Var.t = 1;
                    obj = yaa.P(hg7Var, ri7Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return yaa.x((x2g) obj);
            }
        }
        ri7Var = new ri7(this, sq3Var);
        Object obj2 = ri7Var.r;
        lu3 lu3Var2 = lu3.a;
        i2 = ri7Var.t;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(int i, sq3 sq3Var) {
        mg7 mg7Var;
        int i2;
        if (sq3Var instanceof mg7) {
            mg7Var = (mg7) sq3Var;
            int i3 = mg7Var.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                mg7Var.t = i3 - Integer.MIN_VALUE;
                Object obj = mg7Var.r;
                lu3 lu3Var = lu3.a;
                i2 = mg7Var.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    hg7 hg7Var = new hg7(this, i, rq3Var, 3);
                    mg7Var.t = 1;
                    obj = yaa.P(hg7Var, mg7Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return yaa.x((x2g) obj);
            }
        }
        mg7Var = new mg7(this, sq3Var);
        Object obj2 = mg7Var.r;
        lu3 lu3Var2 = lu3.a;
        i2 = mg7Var.t;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f0(int i, String str, sq3 sq3Var) {
        si7 si7Var;
        int i2;
        if (sq3Var instanceof si7) {
            si7Var = (si7) sq3Var;
            int i3 = si7Var.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                si7Var.t = i3 - Integer.MIN_VALUE;
                Object obj = si7Var.r;
                lu3 lu3Var = lu3.a;
                i2 = si7Var.t;
                if (i2 != 0) {
                    y6a.M(obj);
                    kg7 kg7Var = new kg7(this, i, str, (rq3) null, 12);
                    si7Var.t = 1;
                    obj = yaa.P(kg7Var, si7Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                x2g x2gVar = (x2g) obj;
                x2gVar.getClass();
                return Boolean.valueOf(x2gVar instanceof v2g);
            }
        }
        si7Var = new si7(this, sq3Var);
        Object obj2 = si7Var.r;
        lu3 lu3Var2 = lu3.a;
        i2 = si7Var.t;
        if (i2 != 0) {
        }
        x2g x2gVar2 = (x2g) obj2;
        x2gVar2.getClass();
        return Boolean.valueOf(x2gVar2 instanceof v2g);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(int i, sq3 sq3Var) {
        ng7 ng7Var;
        int i2;
        FantasyRoundResponse fantasyRoundResponse;
        if (sq3Var instanceof ng7) {
            ng7Var = (ng7) sq3Var;
            int i3 = ng7Var.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ng7Var.t = i3 - Integer.MIN_VALUE;
                Object obj = ng7Var.r;
                lu3 lu3Var = lu3.a;
                i2 = ng7Var.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    hg7 hg7Var = new hg7(this, i, rq3Var, 4);
                    ng7Var.t = 1;
                    obj = yaa.P(hg7Var, ng7Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                fantasyRoundResponse = (FantasyRoundResponse) yaa.x((x2g) obj);
                if (fantasyRoundResponse == null) {
                    return fantasyRoundResponse.getRound();
                }
                return null;
            }
        }
        ng7Var = new ng7(this, sq3Var);
        Object obj2 = ng7Var.r;
        lu3 lu3Var2 = lu3.a;
        i2 = ng7Var.t;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        fantasyRoundResponse = (FantasyRoundResponse) yaa.x((x2g) obj2);
        if (fantasyRoundResponse == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g0(int i, sq3 sq3Var) {
        ti7 ti7Var;
        int i2;
        if (sq3Var instanceof ti7) {
            ti7Var = (ti7) sq3Var;
            int i3 = ti7Var.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ti7Var.t = i3 - Integer.MIN_VALUE;
                Object obj = ti7Var.r;
                lu3 lu3Var = lu3.a;
                i2 = ti7Var.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    hg7 hg7Var = new hg7(this, i, rq3Var, 27);
                    ti7Var.t = 1;
                    obj = yaa.P(hg7Var, ti7Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                x2g x2gVar = (x2g) obj;
                x2gVar.getClass();
                return Boolean.valueOf(x2gVar instanceof v2g);
            }
        }
        ti7Var = new ti7(this, sq3Var);
        Object obj2 = ti7Var.r;
        lu3 lu3Var2 = lu3.a;
        i2 = ti7Var.t;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        x2g x2gVar2 = (x2g) obj2;
        x2gVar2.getClass();
        return Boolean.valueOf(x2gVar2 instanceof v2g);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(int i, sq3 sq3Var) {
        og7 og7Var;
        int i2;
        if (sq3Var instanceof og7) {
            og7Var = (og7) sq3Var;
            int i3 = og7Var.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                og7Var.t = i3 - Integer.MIN_VALUE;
                Object obj = og7Var.r;
                lu3 lu3Var = lu3.a;
                i2 = og7Var.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    hg7 hg7Var = new hg7(this, i, rq3Var, 5);
                    og7Var.t = 1;
                    obj = yaa.P(hg7Var, og7Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return yaa.x((x2g) obj);
            }
        }
        og7Var = new og7(this, sq3Var);
        Object obj2 = og7Var.r;
        lu3 lu3Var2 = lu3.a;
        i2 = og7Var.t;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h0(int i, sq3 sq3Var) {
        ui7 ui7Var;
        int i2;
        FantasyLeagueJoinCodeResponse fantasyLeagueJoinCodeResponse;
        if (sq3Var instanceof ui7) {
            ui7Var = (ui7) sq3Var;
            int i3 = ui7Var.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ui7Var.t = i3 - Integer.MIN_VALUE;
                Object obj = ui7Var.r;
                lu3 lu3Var = lu3.a;
                i2 = ui7Var.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    hg7 hg7Var = new hg7(this, i, rq3Var, 28);
                    ui7Var.t = 1;
                    obj = yaa.P(hg7Var, ui7Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                fantasyLeagueJoinCodeResponse = (FantasyLeagueJoinCodeResponse) yaa.x((x2g) obj);
                if (fantasyLeagueJoinCodeResponse == null) {
                    return fantasyLeagueJoinCodeResponse.getJoinCode();
                }
                return null;
            }
        }
        ui7Var = new ui7(this, sq3Var);
        Object obj2 = ui7Var.r;
        lu3 lu3Var2 = lu3.a;
        i2 = ui7Var.t;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        fantasyLeagueJoinCodeResponse = (FantasyLeagueJoinCodeResponse) yaa.x((x2g) obj2);
        if (fantasyLeagueJoinCodeResponse == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(int i, sq3 sq3Var) {
        pg7 pg7Var;
        int i2;
        List<FantasyRound> rounds;
        if (sq3Var instanceof pg7) {
            pg7Var = (pg7) sq3Var;
            int i3 = pg7Var.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                pg7Var.t = i3 - Integer.MIN_VALUE;
                Object obj = pg7Var.r;
                lu3 lu3Var = lu3.a;
                i2 = pg7Var.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    hg7 hg7Var = new hg7(this, i, rq3Var, 6);
                    pg7Var.t = 1;
                    obj = yaa.P(hg7Var, pg7Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                FantasyRoundsResponse fantasyRoundsResponse = (FantasyRoundsResponse) yaa.x((x2g) obj);
                return (fantasyRoundsResponse != null || (rounds = fantasyRoundsResponse.getRounds()) == null) ? km5.a : rounds;
            }
        }
        pg7Var = new pg7(this, sq3Var);
        Object obj2 = pg7Var.r;
        lu3 lu3Var2 = lu3.a;
        i2 = pg7Var.t;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        FantasyRoundsResponse fantasyRoundsResponse2 = (FantasyRoundsResponse) yaa.x((x2g) obj2);
        if (fantasyRoundsResponse2 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i0(int i, String str, sq3 sq3Var) {
        vi7 vi7Var;
        int i2;
        if (sq3Var instanceof vi7) {
            vi7Var = (vi7) sq3Var;
            int i3 = vi7Var.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                vi7Var.t = i3 - Integer.MIN_VALUE;
                Object obj = vi7Var.r;
                lu3 lu3Var = lu3.a;
                i2 = vi7Var.t;
                if (i2 != 0) {
                    y6a.M(obj);
                    kg7 kg7Var = new kg7(this, str, i, (rq3) null, 13);
                    vi7Var.t = 1;
                    obj = yaa.P(kg7Var, vi7Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                x2g x2gVar = (x2g) obj;
                x2gVar.getClass();
                return Boolean.valueOf(x2gVar instanceof v2g);
            }
        }
        vi7Var = new vi7(this, sq3Var);
        Object obj2 = vi7Var.r;
        lu3 lu3Var2 = lu3.a;
        i2 = vi7Var.t;
        if (i2 != 0) {
        }
        x2g x2gVar2 = (x2g) obj2;
        x2gVar2.getClass();
        return Boolean.valueOf(x2gVar2 instanceof v2g);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(int i, sq3 sq3Var) {
        qg7 qg7Var;
        int i2;
        if (sq3Var instanceof qg7) {
            qg7Var = (qg7) sq3Var;
            int i3 = qg7Var.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                qg7Var.t = i3 - Integer.MIN_VALUE;
                Object obj = qg7Var.r;
                lu3 lu3Var = lu3.a;
                i2 = qg7Var.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    hg7 hg7Var = new hg7(this, i, rq3Var, 7);
                    qg7Var.t = 1;
                    obj = yaa.P(hg7Var, qg7Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return yaa.x((x2g) obj);
            }
        }
        qg7Var = new qg7(this, sq3Var);
        Object obj2 = qg7Var.r;
        lu3 lu3Var2 = lu3.a;
        i2 = qg7Var.t;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable k(sq3 sq3Var) {
        rg7 rg7Var;
        int i;
        FantasyCompetitionsResponse fantasyCompetitionsResponse;
        List<FantasyCompetition> competitions;
        if (sq3Var instanceof rg7) {
            rg7Var = (rg7) sq3Var;
            int i2 = rg7Var.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rg7Var.t = i2 - Integer.MIN_VALUE;
                Object obj = rg7Var.r;
                lu3 lu3Var = lu3.a;
                i = rg7Var.t;
                rq3 rq3Var = null;
                if (i != 0) {
                    y6a.M(obj);
                    sg7 sg7Var = new sg7(this, rq3Var, 0);
                    rg7Var.t = 1;
                    obj = yaa.P(sg7Var, rg7Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                fantasyCompetitionsResponse = (FantasyCompetitionsResponse) yaa.x((x2g) obj);
                if (fantasyCompetitionsResponse != null || (competitions = fantasyCompetitionsResponse.getCompetitions()) == null) {
                    return km5.a;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : competitions) {
                    if (((FantasyCompetition) obj2).getCurrentRound() != null) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
            }
        }
        rg7Var = new rg7(this, sq3Var);
        Object obj3 = rg7Var.r;
        lu3 lu3Var2 = lu3.a;
        i = rg7Var.t;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
        fantasyCompetitionsResponse = (FantasyCompetitionsResponse) yaa.x((x2g) obj3);
        if (fantasyCompetitionsResponse != null) {
        }
        return km5.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(int i, String str, sq3 sq3Var) {
        tg7 tg7Var;
        int i2;
        FantasyNewsArticlesResponse fantasyNewsArticlesResponse;
        Map<Integer, List<FantasyNewsArticle>> news;
        if (sq3Var instanceof tg7) {
            tg7Var = (tg7) sq3Var;
            int i3 = tg7Var.u;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                tg7Var.u = i3 - Integer.MIN_VALUE;
                Object obj = tg7Var.s;
                lu3 lu3Var = lu3.a;
                i2 = tg7Var.u;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    ug7 ug7Var = new ug7(this, str, rq3Var, 0);
                    tg7Var.r = i;
                    tg7Var.u = 1;
                    obj = yaa.P(ug7Var, tg7Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i = tg7Var.r;
                    y6a.M(obj);
                }
                fantasyNewsArticlesResponse = (FantasyNewsArticlesResponse) yaa.x((x2g) obj);
                if (fantasyNewsArticlesResponse != null || (news = fantasyNewsArticlesResponse.getNews()) == null) {
                    return null;
                }
                return (List) me4.f(i, news);
            }
        }
        tg7Var = new tg7(this, sq3Var);
        Object obj2 = tg7Var.s;
        lu3 lu3Var2 = lu3.a;
        i2 = tg7Var.u;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        fantasyNewsArticlesResponse = (FantasyNewsArticlesResponse) yaa.x((x2g) obj2);
        if (fantasyNewsArticlesResponse != null) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(int i, sq3 sq3Var) {
        vg7 vg7Var;
        int i2;
        if (sq3Var instanceof vg7) {
            vg7Var = (vg7) sq3Var;
            int i3 = vg7Var.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                vg7Var.t = i3 - Integer.MIN_VALUE;
                Object obj = vg7Var.r;
                lu3 lu3Var = lu3.a;
                i2 = vg7Var.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    hg7 hg7Var = new hg7(this, i, rq3Var, 8);
                    vg7Var.t = 1;
                    obj = yaa.P(hg7Var, vg7Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return yaa.x((x2g) obj);
            }
        }
        vg7Var = new vg7(this, sq3Var);
        Object obj2 = vg7Var.r;
        lu3 lu3Var2 = lu3.a;
        i2 = vg7Var.t;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(int i, sq3 sq3Var) {
        wg7 wg7Var;
        int i2;
        FantasyRoundPlayerStatisticsResponse fantasyRoundPlayerStatisticsResponse;
        if (sq3Var instanceof wg7) {
            wg7Var = (wg7) sq3Var;
            int i3 = wg7Var.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                wg7Var.t = i3 - Integer.MIN_VALUE;
                Object obj = wg7Var.r;
                lu3 lu3Var = lu3.a;
                i2 = wg7Var.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    hg7 hg7Var = new hg7(this, i, rq3Var, 9);
                    wg7Var.t = 1;
                    obj = yaa.P(hg7Var, wg7Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                fantasyRoundPlayerStatisticsResponse = (FantasyRoundPlayerStatisticsResponse) yaa.x((x2g) obj);
                if (fantasyRoundPlayerStatisticsResponse == null) {
                    return fantasyRoundPlayerStatisticsResponse.getPlayers();
                }
                return null;
            }
        }
        wg7Var = new wg7(this, sq3Var);
        Object obj2 = wg7Var.r;
        lu3 lu3Var2 = lu3.a;
        i2 = wg7Var.t;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        fantasyRoundPlayerStatisticsResponse = (FantasyRoundPlayerStatisticsResponse) yaa.x((x2g) obj2);
        if (fantasyRoundPlayerStatisticsResponse == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(int i, int i2, sq3 sq3Var) {
        xg7 xg7Var;
        int i3;
        if (sq3Var instanceof xg7) {
            xg7Var = (xg7) sq3Var;
            int i4 = xg7Var.t;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                xg7Var.t = i4 - Integer.MIN_VALUE;
                Object obj = xg7Var.r;
                lu3 lu3Var = lu3.a;
                i3 = xg7Var.t;
                if (i3 != 0) {
                    y6a.M(obj);
                    yg7 yg7Var = new yg7(this, i, i2, null, 0);
                    xg7Var.t = 1;
                    obj = yaa.P(yg7Var, xg7Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i3 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return yaa.x((x2g) obj);
            }
        }
        xg7Var = new xg7(this, sq3Var);
        Object obj2 = xg7Var.r;
        lu3 lu3Var2 = lu3.a;
        i3 = xg7Var.t;
        if (i3 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object p(int i, sq3 sq3Var) {
        zg7 zg7Var;
        int i2;
        List<FantasyRoundEvent> events;
        if (sq3Var instanceof zg7) {
            zg7Var = (zg7) sq3Var;
            int i3 = zg7Var.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                zg7Var.t = i3 - Integer.MIN_VALUE;
                Object obj = zg7Var.r;
                lu3 lu3Var = lu3.a;
                i2 = zg7Var.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    hg7 hg7Var = new hg7(this, i, rq3Var, 10);
                    zg7Var.t = 1;
                    obj = yaa.P(hg7Var, zg7Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                FantasyEventsResponse fantasyEventsResponse = (FantasyEventsResponse) yaa.x((x2g) obj);
                return (fantasyEventsResponse != null || (events = fantasyEventsResponse.getEvents()) == null) ? km5.a : events;
            }
        }
        zg7Var = new zg7(this, sq3Var);
        Object obj2 = zg7Var.r;
        lu3 lu3Var2 = lu3.a;
        i2 = zg7Var.t;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        FantasyEventsResponse fantasyEventsResponse2 = (FantasyEventsResponse) yaa.x((x2g) obj2);
        if (fantasyEventsResponse2 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(String str, sq3 sq3Var) {
        ah7 ah7Var;
        int i;
        if (sq3Var instanceof ah7) {
            ah7Var = (ah7) sq3Var;
            int i2 = ah7Var.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ah7Var.t = i2 - Integer.MIN_VALUE;
                Object obj = ah7Var.r;
                lu3 lu3Var = lu3.a;
                i = ah7Var.t;
                rq3 rq3Var = null;
                int i3 = 1;
                if (i != 0) {
                    y6a.M(obj);
                    ug7 ug7Var = new ug7(this, str, rq3Var, i3);
                    ah7Var.t = 1;
                    obj = yaa.P(ug7Var, ah7Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                x2g x2gVar = (x2g) obj;
                x2gVar.getClass();
                return Boolean.valueOf(x2gVar instanceof v2g);
            }
        }
        ah7Var = new ah7(this, sq3Var);
        Object obj2 = ah7Var.r;
        lu3 lu3Var2 = lu3.a;
        i = ah7Var.t;
        rq3 rq3Var2 = null;
        int i32 = 1;
        if (i != 0) {
        }
        x2g x2gVar2 = (x2g) obj2;
        x2gVar2.getClass();
        return Boolean.valueOf(x2gVar2 instanceof v2g);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object r(int i, sq3 sq3Var) {
        bh7 bh7Var;
        int i2;
        FantasyLeagueResponse fantasyLeagueResponse;
        if (sq3Var instanceof bh7) {
            bh7Var = (bh7) sq3Var;
            int i3 = bh7Var.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                bh7Var.t = i3 - Integer.MIN_VALUE;
                Object obj = bh7Var.r;
                lu3 lu3Var = lu3.a;
                i2 = bh7Var.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    hg7 hg7Var = new hg7(this, i, rq3Var, 11);
                    bh7Var.t = 1;
                    obj = yaa.P(hg7Var, bh7Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                fantasyLeagueResponse = (FantasyLeagueResponse) yaa.x((x2g) obj);
                if (fantasyLeagueResponse == null) {
                    return fantasyLeagueResponse.getLeague();
                }
                return null;
            }
        }
        bh7Var = new bh7(this, sq3Var);
        Object obj2 = bh7Var.r;
        lu3 lu3Var2 = lu3.a;
        i2 = bh7Var.t;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        fantasyLeagueResponse = (FantasyLeagueResponse) yaa.x((x2g) obj2);
        if (fantasyLeagueResponse == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0055 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(int i, sq3 sq3Var) {
        ch7 ch7Var;
        int i2;
        FantasyChatMessageTimestampResponse fantasyChatMessageTimestampResponse;
        if (sq3Var instanceof ch7) {
            ch7Var = (ch7) sq3Var;
            int i3 = ch7Var.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ch7Var.t = i3 - Integer.MIN_VALUE;
                Object obj = ch7Var.r;
                lu3 lu3Var = lu3.a;
                i2 = ch7Var.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    hg7 hg7Var = new hg7(this, i, rq3Var, 12);
                    ch7Var.t = 1;
                    obj = yaa.P(hg7Var, ch7Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                fantasyChatMessageTimestampResponse = (FantasyChatMessageTimestampResponse) yaa.x((x2g) obj);
                if (fantasyChatMessageTimestampResponse == null) {
                    return new Long(fantasyChatMessageTimestampResponse.getTimestamp());
                }
                return null;
            }
        }
        ch7Var = new ch7(this, sq3Var);
        Object obj2 = ch7Var.r;
        lu3 lu3Var2 = lu3.a;
        i2 = ch7Var.t;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        fantasyChatMessageTimestampResponse = (FantasyChatMessageTimestampResponse) yaa.x((x2g) obj2);
        if (fantasyChatMessageTimestampResponse == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object t(int i, sq3 sq3Var) {
        dh7 dh7Var;
        int i2;
        FantasyLeagueConfigResponse fantasyLeagueConfigResponse;
        if (sq3Var instanceof dh7) {
            dh7Var = (dh7) sq3Var;
            int i3 = dh7Var.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                dh7Var.t = i3 - Integer.MIN_VALUE;
                Object obj = dh7Var.r;
                lu3 lu3Var = lu3.a;
                i2 = dh7Var.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    hg7 hg7Var = new hg7(this, i, rq3Var, 13);
                    dh7Var.t = 1;
                    obj = yaa.P(hg7Var, dh7Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                fantasyLeagueConfigResponse = (FantasyLeagueConfigResponse) yaa.x((x2g) obj);
                if (fantasyLeagueConfigResponse == null) {
                    return fantasyLeagueConfigResponse.getConfig();
                }
                return null;
            }
        }
        dh7Var = new dh7(this, sq3Var);
        Object obj2 = dh7Var.r;
        lu3 lu3Var2 = lu3.a;
        i2 = dh7Var.t;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        fantasyLeagueConfigResponse = (FantasyLeagueConfigResponse) yaa.x((x2g) obj2);
        if (fantasyLeagueConfigResponse == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object u(int i, sq3 sq3Var) {
        eh7 eh7Var;
        int i2;
        FantasyLeagueJoinCodeResponse fantasyLeagueJoinCodeResponse;
        if (sq3Var instanceof eh7) {
            eh7Var = (eh7) sq3Var;
            int i3 = eh7Var.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                eh7Var.t = i3 - Integer.MIN_VALUE;
                Object obj = eh7Var.r;
                lu3 lu3Var = lu3.a;
                i2 = eh7Var.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    hg7 hg7Var = new hg7(this, i, rq3Var, 14);
                    eh7Var.t = 1;
                    obj = yaa.P(hg7Var, eh7Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                fantasyLeagueJoinCodeResponse = (FantasyLeagueJoinCodeResponse) yaa.x((x2g) obj);
                if (fantasyLeagueJoinCodeResponse == null) {
                    return fantasyLeagueJoinCodeResponse.getJoinCode();
                }
                return null;
            }
        }
        eh7Var = new eh7(this, sq3Var);
        Object obj2 = eh7Var.r;
        lu3 lu3Var2 = lu3.a;
        i2 = eh7Var.t;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        fantasyLeagueJoinCodeResponse = (FantasyLeagueJoinCodeResponse) yaa.x((x2g) obj2);
        if (fantasyLeagueJoinCodeResponse == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(int i, int i2, sq3 sq3Var) {
        fh7 fh7Var;
        int i3;
        List<FantasyUserLeague> users;
        if (sq3Var instanceof fh7) {
            fh7Var = (fh7) sq3Var;
            int i4 = fh7Var.t;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                fh7Var.t = i4 - Integer.MIN_VALUE;
                Object obj = fh7Var.r;
                lu3 lu3Var = lu3.a;
                i3 = fh7Var.t;
                if (i3 != 0) {
                    y6a.M(obj);
                    yg7 yg7Var = new yg7(this, i, i2, null, 1);
                    fh7Var.t = 1;
                    obj = yaa.P(yg7Var, fh7Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i3 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                FantasyLeagueLeaderboardResponse fantasyLeagueLeaderboardResponse = (FantasyLeagueLeaderboardResponse) yaa.x((x2g) obj);
                return (fantasyLeagueLeaderboardResponse != null || (users = fantasyLeagueLeaderboardResponse.getUsers()) == null) ? km5.a : users;
            }
        }
        fh7Var = new fh7(this, sq3Var);
        Object obj2 = fh7Var.r;
        lu3 lu3Var2 = lu3.a;
        i3 = fh7Var.t;
        if (i3 != 0) {
        }
        FantasyLeagueLeaderboardResponse fantasyLeagueLeaderboardResponse2 = (FantasyLeagueLeaderboardResponse) yaa.x((x2g) obj2);
        if (fantasyLeagueLeaderboardResponse2 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object w(int i, int i2, int i3, sq3 sq3Var) {
        gh7 gh7Var;
        int i4;
        List<FantasyUserLeague> users;
        if (sq3Var instanceof gh7) {
            gh7Var = (gh7) sq3Var;
            int i5 = gh7Var.t;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                gh7Var.t = i5 - Integer.MIN_VALUE;
                Object obj = gh7Var.r;
                lu3 lu3Var = lu3.a;
                i4 = gh7Var.t;
                if (i4 != 0) {
                    y6a.M(obj);
                    hh7 hh7Var = new hh7(this, i, i2, i3, null, 0);
                    gh7Var.t = 1;
                    obj = yaa.P(hh7Var, gh7Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i4 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                FantasyLeagueLeaderboardResponse fantasyLeagueLeaderboardResponse = (FantasyLeagueLeaderboardResponse) yaa.x((x2g) obj);
                return (fantasyLeagueLeaderboardResponse != null || (users = fantasyLeagueLeaderboardResponse.getUsers()) == null) ? km5.a : users;
            }
        }
        gh7Var = new gh7(this, sq3Var);
        Object obj2 = gh7Var.r;
        lu3 lu3Var2 = lu3.a;
        i4 = gh7Var.t;
        if (i4 != 0) {
        }
        FantasyLeagueLeaderboardResponse fantasyLeagueLeaderboardResponse2 = (FantasyLeagueLeaderboardResponse) yaa.x((x2g) obj2);
        if (fantasyLeagueLeaderboardResponse2 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object x(int i, int i2, sq3 sq3Var) {
        ih7 ih7Var;
        int i3;
        List<FantasyLeagueMatchupEntry> matchups;
        if (sq3Var instanceof ih7) {
            ih7Var = (ih7) sq3Var;
            int i4 = ih7Var.t;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                ih7Var.t = i4 - Integer.MIN_VALUE;
                Object obj = ih7Var.r;
                lu3 lu3Var = lu3.a;
                i3 = ih7Var.t;
                if (i3 != 0) {
                    y6a.M(obj);
                    yg7 yg7Var = new yg7(this, i, i2, null, 2);
                    ih7Var.t = 1;
                    obj = yaa.P(yg7Var, ih7Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i3 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                FantasyLeagueMatchupsResponse fantasyLeagueMatchupsResponse = (FantasyLeagueMatchupsResponse) yaa.x((x2g) obj);
                return (fantasyLeagueMatchupsResponse != null || (matchups = fantasyLeagueMatchupsResponse.getMatchups()) == null) ? km5.a : matchups;
            }
        }
        ih7Var = new ih7(this, sq3Var);
        Object obj2 = ih7Var.r;
        lu3 lu3Var2 = lu3.a;
        i3 = ih7Var.t;
        if (i3 != 0) {
        }
        FantasyLeagueMatchupsResponse fantasyLeagueMatchupsResponse2 = (FantasyLeagueMatchupsResponse) yaa.x((x2g) obj2);
        if (fantasyLeagueMatchupsResponse2 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object y(int i, int i2, sq3 sq3Var) {
        jh7 jh7Var;
        int i3;
        FantasyLeagueRoundSquadsResponse fantasyLeagueRoundSquadsResponse;
        Map<Integer, FantasyLeagueMatchupSquad> squads;
        if (sq3Var instanceof jh7) {
            jh7Var = (jh7) sq3Var;
            int i4 = jh7Var.t;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                jh7Var.t = i4 - Integer.MIN_VALUE;
                Object obj = jh7Var.r;
                lu3 lu3Var = lu3.a;
                i3 = jh7Var.t;
                if (i3 != 0) {
                    y6a.M(obj);
                    yg7 yg7Var = new yg7(this, i, i2, null, 3);
                    jh7Var.t = 1;
                    obj = yaa.P(yg7Var, jh7Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i3 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                fantasyLeagueRoundSquadsResponse = (FantasyLeagueRoundSquadsResponse) yaa.x((x2g) obj);
                if (fantasyLeagueRoundSquadsResponse == null && (squads = fantasyLeagueRoundSquadsResponse.getSquads()) != null) {
                    return squads;
                }
                lm5 lm5Var = lm5.a;
                lm5Var.getClass();
                return lm5Var;
            }
        }
        jh7Var = new jh7(this, sq3Var);
        Object obj2 = jh7Var.r;
        lu3 lu3Var2 = lu3.a;
        i3 = jh7Var.t;
        if (i3 != 0) {
        }
        fantasyLeagueRoundSquadsResponse = (FantasyLeagueRoundSquadsResponse) yaa.x((x2g) obj2);
        if (fantasyLeagueRoundSquadsResponse == null) {
        }
        lm5 lm5Var2 = lm5.a;
        lm5Var2.getClass();
        return lm5Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object z(int i, int i2, sq3 sq3Var, String str) {
        kh7 kh7Var;
        int i3;
        List<FantasyLeagueParticipant> participants;
        if (sq3Var instanceof kh7) {
            kh7Var = (kh7) sq3Var;
            int i4 = kh7Var.t;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                kh7Var.t = i4 - Integer.MIN_VALUE;
                Object obj = kh7Var.r;
                lu3 lu3Var = lu3.a;
                i3 = kh7Var.t;
                if (i3 != 0) {
                    y6a.M(obj);
                    lh7 lh7Var = new lh7(this, i, i2, str, (rq3) null, 0);
                    kh7Var.t = 1;
                    obj = yaa.P(lh7Var, kh7Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i3 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                FantasyLeagueParticipantsResponse fantasyLeagueParticipantsResponse = (FantasyLeagueParticipantsResponse) yaa.x((x2g) obj);
                return (fantasyLeagueParticipantsResponse != null || (participants = fantasyLeagueParticipantsResponse.getParticipants()) == null) ? km5.a : participants;
            }
        }
        kh7Var = new kh7(this, sq3Var);
        Object obj2 = kh7Var.r;
        lu3 lu3Var2 = lu3.a;
        i3 = kh7Var.t;
        if (i3 != 0) {
        }
        FantasyLeagueParticipantsResponse fantasyLeagueParticipantsResponse2 = (FantasyLeagueParticipantsResponse) yaa.x((x2g) obj2);
        if (fantasyLeagueParticipantsResponse2 != null) {
        }
    }
}
