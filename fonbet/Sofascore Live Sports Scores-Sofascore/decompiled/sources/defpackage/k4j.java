package defpackage;

import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.newNetwork.TeamAchievementsResponse;
import com.sofascore.model.newNetwork.TeamDetailsResponse;
import com.sofascore.model.newNetwork.UniqueTournamentAchievements;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class k4j extends hoi implements Function2 {
    public int r;
    public final /* synthetic */ l4j s;
    public final /* synthetic */ int t;
    public final /* synthetic */ boolean u;
    public final /* synthetic */ boolean v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4j(l4j l4jVar, int i, boolean z, boolean z2, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = l4jVar;
        this.t = i;
        this.u = z;
        this.v = z2;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new k4j(this.s, this.t, this.u, this.v, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k4j) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0037, code lost:
    
        if (r12 == r1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0039, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x002a, code lost:
    
        if (r12 == r1) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x005b  */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        TeamAchievementsResponse teamAchievementsResponse;
        boolean z;
        boolean z2;
        Boolean bool;
        boolean z3;
        l4j l4jVar = this.s;
        j0j j0jVar = l4jVar.l;
        lu3 lu3Var = lu3.a;
        int i = this.r;
        int i2 = this.t;
        boolean z4 = true;
        if (i == 0) {
            y6a.M(obj);
            this.r = 1;
            obj = j0jVar.j(i2, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                TeamDetailsResponse teamDetailsResponse = (TeamDetailsResponse) yaa.x((x2g) obj);
                teamAchievementsResponse = new TeamAchievementsResponse(null, null, teamDetailsResponse != null ? teamDetailsResponse.getTeam() : null);
                z = this.u;
                if (z) {
                    l4jVar.n = l4jVar.v(teamAchievementsResponse);
                } else {
                    l4jVar.m = l4jVar.v(teamAchievementsResponse);
                }
                if (this.v) {
                    i4j i4jVar = (i4j) ((vnb) l4jVar.f.a.getValue()).a();
                    if (i4jVar != null) {
                        z4 = i4jVar.d;
                    }
                } else {
                    List<UniqueTournamentAchievements> achievements = teamAchievementsResponse.getAchievements();
                    if (!Intrinsics.c(achievements != null ? Boolean.valueOf(achievements.isEmpty()) : null, Boolean.TRUE)) {
                        List<UniqueTournamentAchievements> achievements2 = teamAchievementsResponse.getAchievements();
                        if (achievements2 != null) {
                            if (!achievements2.isEmpty()) {
                                Iterator<T> it = achievements2.iterator();
                                while (it.hasNext()) {
                                    UniqueTournament uniqueTournament = ((UniqueTournamentAchievements) it.next()).getUniqueTournament();
                                    if (Intrinsics.c(uniqueTournament != null ? uniqueTournament.getMajorTrophy() : null, Boolean.TRUE)) {
                                        z3 = true;
                                        break;
                                    }
                                }
                            }
                            z3 = false;
                            bool = Boolean.valueOf(z3);
                        } else {
                            bool = null;
                        }
                        if (!Intrinsics.c(bool, Boolean.TRUE)) {
                            z2 = false;
                            l4jVar.n(new i4j(null, null, null, true, null), new c30(z ? l4jVar.m : null, z ? null : l4jVar.n, z2, l4jVar, 6));
                            return Unit.a;
                        }
                    }
                }
                z2 = z4;
                l4jVar.n(new i4j(null, null, null, true, null), new c30(z ? l4jVar.m : null, z ? null : l4jVar.n, z2, l4jVar, 6));
                return Unit.a;
            }
            y6a.M(obj);
        }
        teamAchievementsResponse = (TeamAchievementsResponse) obj;
        if (teamAchievementsResponse == null) {
            this.r = 2;
            obj = j0jVar.k(i2, this);
        }
        z = this.u;
        if (z) {
        }
        if (this.v) {
        }
        z2 = z4;
        l4jVar.n(new i4j(null, null, null, true, null), new c30(z ? l4jVar.m : null, z ? null : l4jVar.n, z2, l4jVar, 6));
        return Unit.a;
    }
}
