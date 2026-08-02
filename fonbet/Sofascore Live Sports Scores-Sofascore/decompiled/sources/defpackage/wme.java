package defpackage;

import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.network.response.PlayerSeasonShotActionsResponse;
import com.sofascore.model.newNetwork.SeasonShotAction;
import com.sofascore.model.newNetwork.statistics.season.player.AbstractPlayerSeasonStatistics;
import com.sofascore.results.player.statistics.compare.model.ComparisonSeasonInfo;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class wme extends hoi implements Function2 {
    public /* synthetic */ Object A;
    public final /* synthetic */ qo2 B;
    public final /* synthetic */ ComparisonSeasonInfo C;
    public final /* synthetic */ xme D;
    public final /* synthetic */ int E;
    public ComparisonSeasonInfo.UniqueTournamentSeasonInfo r;
    public zu4 s;
    public av4 t;
    public Pair u;
    public dzg v;
    public Integer w;
    public String x;
    public wyg y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wme(qo2 qo2Var, ComparisonSeasonInfo comparisonSeasonInfo, xme xmeVar, int i, rq3 rq3Var) {
        super(2, rq3Var);
        this.B = qo2Var;
        this.C = comparisonSeasonInfo;
        this.D = xmeVar;
        this.E = i;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        wme wmeVar = new wme(this.B, this.C, this.D, this.E, rq3Var);
        wmeVar.A = obj;
        return wmeVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((wme) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x012c  */
    /* JADX WARN: Type inference failed for: r3v14, types: [zu4] */
    /* JADX WARN: Type inference failed for: r3v16, types: [zu4] */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        av4 t;
        av4 p;
        Object w;
        ComparisonSeasonInfo.UniqueTournamentSeasonInfo uniqueTournamentSeasonInfo;
        Pair pair;
        Object T;
        ComparisonSeasonInfo.UniqueTournamentSeasonInfo uniqueTournamentSeasonInfo2;
        dzg dzgVar;
        Object T2;
        String str;
        wyg wygVar;
        dzg dzgVar2;
        Integer num;
        x2g x2gVar;
        PlayerSeasonShotActionsResponse playerSeasonShotActionsResponse;
        wyg wygVar2;
        AbstractPlayerSeasonStatistics abstractPlayerSeasonStatistics;
        Integer appearances;
        ku3 ku3Var = (ku3) this.A;
        lu3 lu3Var = lu3.a;
        int i = this.z;
        if (i == 0) {
            y6a.M(obj);
            qo2 qo2Var = this.B;
            a73 a73Var = qo2Var instanceof a73 ? (a73) qo2Var : null;
            if (a73Var != null) {
                ComparisonSeasonInfo comparisonSeasonInfo = this.C;
                ComparisonSeasonInfo.UniqueTournamentSeasonInfo uniqueTournamentSeasonInfo3 = comparisonSeasonInfo instanceof ComparisonSeasonInfo.UniqueTournamentSeasonInfo ? (ComparisonSeasonInfo.UniqueTournamentSeasonInfo) comparisonSeasonInfo : null;
                if (uniqueTournamentSeasonInfo3 != null) {
                    int i2 = this.E;
                    xme xmeVar = this.D;
                    av4 t2 = xw3.t(ku3Var, null, new vme(xmeVar, i2, uniqueTournamentSeasonInfo3, a73Var, null), 3);
                    int i3 = this.E;
                    t = xw3.t(ku3Var, null, new tme(xmeVar, i3, uniqueTournamentSeasonInfo3, null), 3);
                    p = yaa.p(ku3Var, xmeVar.c.equals(Sports.BASKETBALL), new ume(xmeVar, i3, uniqueTournamentSeasonInfo3, null));
                    this.A = null;
                    this.r = uniqueTournamentSeasonInfo3;
                    this.s = t;
                    this.t = p;
                    this.z = 1;
                    w = t2.w(this);
                    if (w != lu3Var) {
                        uniqueTournamentSeasonInfo = uniqueTournamentSeasonInfo3;
                    }
                    return lu3Var;
                }
            }
            return null;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                wyg wygVar3 = this.y;
                String str2 = this.x;
                Integer num2 = this.w;
                dzg dzgVar3 = this.v;
                Pair pair2 = this.u;
                y6a.M(obj);
                wygVar = wygVar3;
                str = str2;
                num = num2;
                dzgVar2 = dzgVar3;
                pair = pair2;
                T2 = obj;
                return new h93(new d73(num, str, wygVar, (ryg) T2, dzgVar2, pair != null ? (Team) pair.b : null, null, 64));
            }
            Pair pair3 = this.u;
            ?? r3 = this.s;
            uniqueTournamentSeasonInfo2 = this.r;
            y6a.M(obj);
            t = r3;
            pair = pair3;
            T = obj;
            x2gVar = (x2g) T;
            if (x2gVar != null || (playerSeasonShotActionsResponse = (PlayerSeasonShotActionsResponse) yaa.x(x2gVar)) == null) {
                uniqueTournamentSeasonInfo = uniqueTournamentSeasonInfo2;
                uniqueTournamentSeasonInfo2 = uniqueTournamentSeasonInfo;
                dzgVar = null;
                Integer num3 = new Integer(uniqueTournamentSeasonInfo2.a);
                String str3 = uniqueTournamentSeasonInfo2.c;
                wyg wygVar4 = pair == null ? (wyg) pair.a : null;
                this.A = null;
                this.r = null;
                this.s = null;
                this.t = null;
                this.u = pair;
                this.v = dzgVar;
                this.w = num3;
                this.x = str3;
                this.y = wygVar4;
                this.z = 3;
                T2 = t.T(this);
                if (T2 != lu3Var) {
                    str = str3;
                    wygVar = wygVar4;
                    dzgVar2 = dzgVar;
                    num = num3;
                    return new h93(new d73(num, str, wygVar, (ryg) T2, dzgVar2, pair != null ? (Team) pair.b : null, null, 64));
                }
                return lu3Var;
            }
            if (pair != null && (wygVar2 = (wyg) pair.a) != null && (abstractPlayerSeasonStatistics = wygVar2.a) != null && (appearances = abstractPlayerSeasonStatistics.getAppearances()) != null) {
                int intValue = appearances.intValue();
                List<SeasonShotAction> shotActions = playerSeasonShotActionsResponse.getShotActions();
                if (shotActions == null) {
                    shotActions = km5.a;
                }
                dzgVar = new dzg(intValue, shotActions, km5.a);
                Integer num32 = new Integer(uniqueTournamentSeasonInfo2.a);
                String str32 = uniqueTournamentSeasonInfo2.c;
                if (pair == null) {
                }
                this.A = null;
                this.r = null;
                this.s = null;
                this.t = null;
                this.u = pair;
                this.v = dzgVar;
                this.w = num32;
                this.x = str32;
                this.y = wygVar4;
                this.z = 3;
                T2 = t.T(this);
                if (T2 != lu3Var) {
                }
                return lu3Var;
            }
            dzgVar = null;
            Integer num322 = new Integer(uniqueTournamentSeasonInfo2.a);
            String str322 = uniqueTournamentSeasonInfo2.c;
            if (pair == null) {
            }
            this.A = null;
            this.r = null;
            this.s = null;
            this.t = null;
            this.u = pair;
            this.v = dzgVar;
            this.w = num322;
            this.x = str322;
            this.y = wygVar4;
            this.z = 3;
            T2 = t.T(this);
            if (T2 != lu3Var) {
            }
            return lu3Var;
        }
        p = this.t;
        ?? r32 = this.s;
        uniqueTournamentSeasonInfo = this.r;
        y6a.M(obj);
        t = r32;
        w = obj;
        pair = (Pair) w;
        if (p != null) {
            this.A = null;
            this.r = uniqueTournamentSeasonInfo;
            this.s = t;
            this.t = null;
            this.u = pair;
            this.z = 2;
            T = p.T(this);
            if (T != lu3Var) {
                uniqueTournamentSeasonInfo2 = uniqueTournamentSeasonInfo;
                x2gVar = (x2g) T;
                if (x2gVar != null) {
                }
                uniqueTournamentSeasonInfo = uniqueTournamentSeasonInfo2;
            }
            return lu3Var;
        }
        uniqueTournamentSeasonInfo2 = uniqueTournamentSeasonInfo;
        dzgVar = null;
        Integer num3222 = new Integer(uniqueTournamentSeasonInfo2.a);
        String str3222 = uniqueTournamentSeasonInfo2.c;
        if (pair == null) {
        }
        this.A = null;
        this.r = null;
        this.s = null;
        this.t = null;
        this.u = pair;
        this.v = dzgVar;
        this.w = num3222;
        this.x = str3222;
        this.y = wygVar4;
        this.z = 3;
        T2 = t.T(this);
        if (T2 != lu3Var) {
        }
        return lu3Var;
    }
}
