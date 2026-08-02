package defpackage;

import com.sofascore.model.profile.ProfileData;
import com.sofascore.results.service.SyncWorker;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class fqi extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ SyncWorker t;
    public final /* synthetic */ ProfileData u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fqi(SyncWorker syncWorker, ProfileData profileData, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = syncWorker;
        this.u = profileData;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        ProfileData profileData = this.u;
        SyncWorker syncWorker = this.t;
        switch (i) {
            case 0:
                return new fqi(syncWorker, profileData, rq3Var, 0);
            case 1:
                return new fqi(syncWorker, profileData, rq3Var, 1);
            case 2:
                return new fqi(syncWorker, profileData, rq3Var, 2);
            case 3:
                return new fqi(syncWorker, profileData, rq3Var, 3);
            case 4:
                return new fqi(syncWorker, profileData, rq3Var, 4);
            case 5:
                return new fqi(syncWorker, profileData, rq3Var, 5);
            case 6:
                return new fqi(syncWorker, profileData, rq3Var, 6);
            case 7:
                return new fqi(syncWorker, profileData, rq3Var, 7);
            case 8:
                return new fqi(syncWorker, profileData, rq3Var, 8);
            default:
                return new fqi(syncWorker, profileData, rq3Var, 9);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((fqi) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        SyncWorker syncWorker = this.t;
        ProfileData profileData = this.u;
        switch (i) {
            case 0:
                Object obj2 = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    List<Integer> fantasyCompetitions = profileData.getFantasyCompetitions();
                    if (fantasyCompetitions == null) {
                        fantasyCompetitions = km5.a;
                    }
                    this.s = 1;
                    Object r = s9a.r(new opi(syncWorker, fantasyCompetitions, null, 0), this);
                    if (r != obj2) {
                        r = Unit.a;
                    }
                    if (r == obj2) {
                        break;
                    }
                } else if (i2 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 1:
                Object obj3 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    List<Integer> events = profileData.getEvents();
                    if (events == null) {
                        events = km5.a;
                    }
                    this.s = 1;
                    Object r2 = s9a.r(new opi(syncWorker, events, null, 1), this);
                    if (r2 != obj3) {
                        r2 = Unit.a;
                    }
                    if (r2 == obj3) {
                        break;
                    }
                } else if (i3 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 2:
                Object obj4 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    List<Integer> favoriteLeagues = profileData.getFavoriteLeagues();
                    if (favoriteLeagues == null) {
                        favoriteLeagues = km5.a;
                    }
                    List<Integer> list = favoriteLeagues;
                    List<Integer> leagues = profileData.getLeagues();
                    if (leagues == null) {
                        leagues = km5.a;
                    }
                    this.s = 1;
                    Object r3 = s9a.r(new ppi(list, leagues, this.t, null, 0), this);
                    if (r3 != obj4) {
                        r3 = Unit.a;
                    }
                    if (r3 == obj4) {
                        break;
                    }
                } else if (i4 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 3:
                Object obj5 = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    List<Integer> mutedEvents = profileData.getMutedEvents();
                    if (mutedEvents == null) {
                        mutedEvents = km5.a;
                    }
                    this.s = 1;
                    Object r4 = s9a.r(new opi(syncWorker, mutedEvents, null, 2), this);
                    if (r4 != obj5) {
                        r4 = Unit.a;
                    }
                    if (r4 == obj5) {
                        break;
                    }
                } else if (i5 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 4:
                Object obj6 = lu3.a;
                int i6 = this.s;
                if (i6 == 0) {
                    y6a.M(obj);
                    List<Integer> mutedStages = profileData.getMutedStages();
                    if (mutedStages == null) {
                        mutedStages = km5.a;
                    }
                    this.s = 1;
                    Object r5 = s9a.r(new opi(syncWorker, mutedStages, null, 3), this);
                    if (r5 != obj6) {
                        r5 = Unit.a;
                    }
                    if (r5 == obj6) {
                        break;
                    }
                } else if (i6 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 5:
                Object obj7 = lu3.a;
                int i7 = this.s;
                if (i7 == 0) {
                    y6a.M(obj);
                    List<Integer> pinnedLeagues = profileData.getPinnedLeagues();
                    if (pinnedLeagues == null) {
                        pinnedLeagues = km5.a;
                    }
                    this.s = 1;
                    Object r6 = s9a.r(new qpi(syncWorker, pinnedLeagues, null, 0), this);
                    if (r6 != obj7) {
                        r6 = Unit.a;
                    }
                    if (r6 == obj7) {
                        break;
                    }
                } else if (i7 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 6:
                Object obj8 = lu3.a;
                int i8 = this.s;
                if (i8 == 0) {
                    y6a.M(obj);
                    List<Integer> favoritePlayers = profileData.getFavoritePlayers();
                    if (favoritePlayers == null) {
                        favoritePlayers = km5.a;
                    }
                    List<Integer> list2 = favoritePlayers;
                    List<Integer> players = profileData.getPlayers();
                    if (players == null) {
                        players = km5.a;
                    }
                    this.s = 1;
                    Object r7 = s9a.r(new ppi(list2, players, this.t, null, 1), this);
                    if (r7 != obj8) {
                        r7 = Unit.a;
                    }
                    if (r7 == obj8) {
                        break;
                    }
                } else if (i8 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 7:
                Object obj9 = lu3.a;
                int i9 = this.s;
                if (i9 == 0) {
                    y6a.M(obj);
                    List<Integer> stages = profileData.getStages();
                    if (stages == null) {
                        stages = km5.a;
                    }
                    this.s = 1;
                    Object r8 = s9a.r(new opi(syncWorker, stages, null, 4), this);
                    if (r8 != obj9) {
                        r8 = Unit.a;
                    }
                    if (r8 == obj9) {
                        break;
                    }
                } else if (i9 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 8:
                Object obj10 = lu3.a;
                int i10 = this.s;
                if (i10 == 0) {
                    y6a.M(obj);
                    List<Integer> favoriteTeams = profileData.getFavoriteTeams();
                    if (favoriteTeams == null) {
                        favoriteTeams = km5.a;
                    }
                    List<Integer> teams = profileData.getTeams();
                    if (teams == null) {
                        teams = km5.a;
                    }
                    this.s = 1;
                    Object r9 = s9a.r(new n1f(favoriteTeams, teams, syncWorker, null), this);
                    if (r9 != obj10) {
                        r9 = Unit.a;
                    }
                    if (r9 == obj10) {
                        break;
                    }
                } else if (i10 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            default:
                Object obj11 = lu3.a;
                int i11 = this.s;
                if (i11 == 0) {
                    y6a.M(obj);
                    List<Integer> uniqueStages = profileData.getUniqueStages();
                    if (uniqueStages == null) {
                        uniqueStages = km5.a;
                    }
                    this.s = 1;
                    Object r10 = s9a.r(new rpi(syncWorker, uniqueStages, null), this);
                    if (r10 != obj11) {
                        r10 = Unit.a;
                    }
                    if (r10 == obj11) {
                        break;
                    }
                } else if (i11 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
        }
        return Unit.a;
    }
}
