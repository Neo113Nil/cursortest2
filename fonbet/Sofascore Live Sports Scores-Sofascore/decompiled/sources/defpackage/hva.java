package defpackage;

import android.content.Context;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.newNetwork.HistoricalSeasonComparisonResponse;
import com.sofascore.model.newNetwork.PlayerUpdatesItem;
import com.sofascore.model.newNetwork.SeasonHighlightedComparison;
import com.sofascore.model.newNetwork.UniqueTournamentIndividualAwardType;
import com.sofascore.model.newNetwork.UniqueTournamentPlayerUpdatesResponse;
import com.sofascore.results.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class hva extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ kva t;
    public final /* synthetic */ int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hva(int i, int i2, rq3 rq3Var, kva kvaVar) {
        super(2, rq3Var);
        this.r = i2;
        this.t = kvaVar;
        this.u = i;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        int i2 = this.u;
        kva kvaVar = this.t;
        switch (i) {
            case 0:
                return new hva(i2, 0, rq3Var, kvaVar);
            case 1:
                return new hva(i2, 1, rq3Var, kvaVar);
            case 2:
                return new hva(i2, 2, rq3Var, kvaVar);
            case 3:
                return new hva(i2, 3, rq3Var, kvaVar);
            case 4:
                return new hva(i2, 4, rq3Var, kvaVar);
            case 5:
                return new hva(i2, 5, rq3Var, kvaVar);
            default:
                return new hva(i2, 6, rq3Var, kvaVar);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((hva) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        Object e;
        List<SeasonHighlightedComparison> comparisons;
        SeasonHighlightedComparison seasonHighlightedComparison;
        Season season;
        Object P;
        lxe lxeVar;
        lxe lxeVar2;
        q9k r;
        q9k q9kVar;
        int i = this.r;
        int i2 = this.u;
        kva kvaVar = this.t;
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
                aya ayaVar = kvaVar.j;
                this.s = 1;
                Object b = ayaVar.b(i2, this);
                return b == lu3Var ? lu3Var : b;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    w3b w3bVar = kvaVar.e;
                    this.s = 1;
                    e = w3bVar.e(i2, this);
                    if (e == lu3Var2) {
                        return lu3Var2;
                    }
                } else {
                    if (i4 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    e = obj;
                }
                HistoricalSeasonComparisonResponse historicalSeasonComparisonResponse = (HistoricalSeasonComparisonResponse) e;
                if (historicalSeasonComparisonResponse == null || (comparisons = historicalSeasonComparisonResponse.getComparisons()) == null || (seasonHighlightedComparison = (SeasonHighlightedComparison) CollectionsKt.firstOrNull(comparisons)) == null || (season = seasonHighlightedComparison.getSeason()) == null) {
                    return null;
                }
                return season.getYear();
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
                w3b w3bVar2 = kvaVar.e;
                Context i6 = kvaVar.i();
                this.s = 1;
                Object Y = w3bVar2.Y(i6, i2, this);
                return Y == lu3Var3 ? lu3Var3 : Y;
            case 3:
                lu3 lu3Var4 = lu3.a;
                int i7 = this.s;
                if (i7 == 0) {
                    y6a.M(obj);
                    w3b w3bVar3 = kvaVar.e;
                    this.s = 1;
                    w3bVar3.getClass();
                    P = yaa.P(new d0b(i2, 1, null, w3bVar3), this);
                    if (P == lu3Var4) {
                        return lu3Var4;
                    }
                } else {
                    if (i7 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    P = obj;
                }
                UniqueTournamentPlayerUpdatesResponse uniqueTournamentPlayerUpdatesResponse = (UniqueTournamentPlayerUpdatesResponse) yaa.x((x2g) P);
                List<PlayerUpdatesItem> playerNews = uniqueTournamentPlayerUpdatesResponse != null ? uniqueTournamentPlayerUpdatesResponse.getPlayerNews() : null;
                Context i8 = kvaVar.i();
                if (playerNews == null) {
                    playerNews = rlh.b;
                }
                ArrayList k = me4.k(playerNews);
                for (PlayerUpdatesItem playerUpdatesItem : playerNews) {
                    if (playerUpdatesItem instanceof PlayerUpdatesItem.Transfer) {
                        PlayerUpdatesItem.Transfer transfer = (PlayerUpdatesItem.Transfer) playerUpdatesItem;
                        Integer type = transfer.getPayload().getType();
                        int intValue = type != null ? type.intValue() : -1;
                        Team transferFrom = transfer.getPayload().getTransferFrom();
                        String nameCode = transferFrom != null ? transferFrom.getNameCode() : null;
                        qvj qvjVar = qvj.a;
                        if (intValue == 1) {
                            q9kVar = new q9k(R.string.transfer_loan);
                        } else if (intValue == 3) {
                            q9kVar = new q9k(R.string.transfer_transfer);
                        } else if (intValue == 2) {
                            q9kVar = new q9k(R.string.transfer_end_of_loan);
                        } else if (intValue == 4) {
                            q9kVar = new q9k(R.string.end_of_career);
                        } else if (intValue == 5) {
                            q9kVar = new q9k(R.string.player_draft);
                        } else if (intValue == 6) {
                            q9kVar = new q9k(R.string.released_from_team);
                        } else if (intValue == 7) {
                            q9kVar = new q9k(R.string.signed);
                        } else if (intValue == 8) {
                            q9kVar = new q9k(R.string.player_waived);
                        } else if (intValue == 9) {
                            q9kVar = new q9k(R.string.player_claimed);
                        } else if (intValue == 10) {
                            q9kVar = new q9k(R.string.player_traded_from, l6g.K(nameCode != null ? nameCode : ""));
                        } else {
                            q9kVar = null;
                        }
                        if (q9kVar != null) {
                            if (CollectionsKt.R(b.j(8, 6, 4), transfer.getPayload().getType())) {
                                Team transferFrom2 = transfer.getPayload().getTransferFrom();
                                if (transferFrom2 != null) {
                                    r8 = transferFrom2.getId();
                                }
                            } else {
                                Team transferTo = transfer.getPayload().getTransferTo();
                                if (transferTo != null) {
                                    r8 = transferTo.getId();
                                }
                            }
                            int i9 = r8;
                            Integer valueOf = Integer.valueOf(transfer.getPayload().getPlayer().getId());
                            String t = tba.t(transfer.getPayload().getPlayer());
                            Gender gender = transfer.getPayload().getPlayer().getGender();
                            mxe mxeVar = new mxe(R.drawable.ic_swap, R.color.n_lv_1, q9kVar);
                            long timestamp = transfer.getTimestamp();
                            bi4 bi4Var = bi4.PATTERN_DM;
                            ConcurrentHashMap concurrentHashMap = hk4.a;
                            lxeVar2 = new lxe(i9, valueOf, t, gender, mxeVar, fc6.i(timestamp, hk4.a(bi4Var.d())));
                        }
                        lxeVar2 = null;
                    } else {
                        if (playerUpdatesItem instanceof PlayerUpdatesItem.Injury) {
                            PlayerUpdatesItem.Injury injury = (PlayerUpdatesItem.Injury) playerUpdatesItem;
                            Team team = injury.getPayload().getTeam();
                            int id = team != null ? team.getId() : -1;
                            Player player = injury.getPayload().getPlayer();
                            Integer valueOf2 = player != null ? Integer.valueOf(player.getId()) : null;
                            Player player2 = injury.getPayload().getPlayer();
                            String t2 = player2 != null ? tba.t(player2) : null;
                            String str = t2 == null ? "" : t2;
                            Player player3 = injury.getPayload().getPlayer();
                            Gender gender2 = player3 != null ? player3.getGender() : null;
                            int i10 = Intrinsics.c(injury.getPayload().getStatus(), "dayToDay") ? R.color.alert : R.color.error;
                            Integer p = f7a.p(injury.getPayload().getReason());
                            if (p != null) {
                                int intValue2 = p.intValue();
                                String b2 = f7a.r(injury.getPayload().getStatus(), false).b(i8);
                                String string = i8.getString(intValue2);
                                string.getClass();
                                r = new q9k(R.string.toolbar_subtitle_template, l6g.K(b2, string));
                            } else {
                                r = f7a.r(injury.getPayload().getStatus(), false);
                            }
                            mxe mxeVar2 = new mxe(R.drawable.ic_cross_16, i10, r);
                            long timestamp2 = injury.getTimestamp();
                            bi4 bi4Var2 = bi4.PATTERN_DM;
                            ConcurrentHashMap concurrentHashMap2 = hk4.a;
                            lxeVar = new lxe(id, valueOf2, str, gender2, mxeVar2, fc6.i(timestamp2, hk4.a(bi4Var2.d())));
                        } else {
                            if (playerUpdatesItem instanceof PlayerUpdatesItem.Award) {
                                PlayerUpdatesItem.Award award = (PlayerUpdatesItem.Award) playerUpdatesItem;
                                UniqueTournamentIndividualAwardType type2 = award.getPayload().getType();
                                if (type2 != null) {
                                    Team team2 = award.getPayload().getTeam();
                                    int id2 = team2 != null ? team2.getId() : -1;
                                    Player player4 = award.getPayload().getPlayer();
                                    Integer valueOf3 = player4 != null ? Integer.valueOf(player4.getId()) : null;
                                    Player player5 = award.getPayload().getPlayer();
                                    String t3 = player5 != null ? tba.t(player5) : null;
                                    String str2 = t3 == null ? "" : t3;
                                    Player player6 = award.getPayload().getPlayer();
                                    Gender gender3 = player6 != null ? player6.getGender() : null;
                                    mxe mxeVar3 = new mxe(R.drawable.ic_leagues, R.color.value, tgj.b0(type2));
                                    long timestamp3 = award.getTimestamp();
                                    bi4 bi4Var3 = bi4.PATTERN_DM;
                                    ConcurrentHashMap concurrentHashMap3 = hk4.a;
                                    lxeVar = new lxe(id2, valueOf3, str2, gender3, mxeVar3, fc6.i(timestamp3, hk4.a(bi4Var3.d())));
                                }
                            }
                            lxeVar2 = null;
                        }
                        lxeVar2 = lxeVar;
                    }
                    if (lxeVar2 != null) {
                        k.add(lxeVar2);
                    }
                }
                return l6g.W(k);
            case 4:
                lu3 lu3Var5 = lu3.a;
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
                w3b w3bVar4 = kvaVar.e;
                this.s = 1;
                Object o = w3bVar4.o(i2, this);
                return o == lu3Var5 ? lu3Var5 : o;
            case 5:
                lu3 lu3Var6 = lu3.a;
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
                w3b w3bVar5 = kvaVar.e;
                this.s = 1;
                Object t0 = w3bVar5.t0(i2, this);
                return t0 == lu3Var6 ? lu3Var6 : t0;
            default:
                lu3 lu3Var7 = lu3.a;
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
                w3b w3bVar6 = kvaVar.e;
                this.s = 1;
                Object z0 = w3bVar6.z0(i2, this);
                return z0 == lu3Var7 ? lu3Var7 : z0;
        }
    }
}
