package defpackage;

import com.sofascore.model.newNetwork.SeasonStatisticsResponse;
import com.sofascore.model.newNetwork.statistics.season.team.TeamSeasonStatisticsResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class x0j extends hoi implements Function2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ String B;
    public final /* synthetic */ int C;
    public final /* synthetic */ String D;
    public av4 r;
    public TeamSeasonStatisticsResponse s;
    public yzc t;
    public boolean u;
    public int v;
    public /* synthetic */ Object w;
    public final /* synthetic */ String x;
    public final /* synthetic */ y0j y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0j(String str, y0j y0jVar, int i, int i2, String str2, int i3, String str3, rq3 rq3Var) {
        super(2, rq3Var);
        this.x = str;
        this.y = y0jVar;
        this.z = i;
        this.A = i2;
        this.B = str2;
        this.C = i3;
        this.D = str3;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        x0j x0jVar = new x0j(this.x, this.y, this.z, this.A, this.B, this.C, this.D, rq3Var);
        x0jVar.w = obj;
        return x0jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((x0j) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0094, code lost:
    
        if (r0 == r2) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0096, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0077, code lost:
    
        if (r1 == r2) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00b1  */
    /* JADX WARN: Type inference failed for: r8v0, types: [rq3] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean t;
        av4 p;
        Object w;
        TeamSeasonStatisticsResponse teamSeasonStatisticsResponse;
        yzc yzcVar;
        Object T;
        List<String> types;
        ku3 ku3Var = (ku3) this.w;
        lu3 lu3Var = lu3.a;
        int i = this.v;
        y0j y0jVar = this.y;
        boolean z = true;
        Integer num = 0;
        num = 0;
        num = 0;
        if (i == 0) {
            y6a.M(obj);
            t = ug5.t(this.x);
            p = yaa.p(ku3Var, t, new du1(y0jVar, this.z, this.A, num, 8));
            av4 t2 = xw3.t(ku3Var, null, new w0j(this.B, this.y, this.C, this.z, this.A, this.D, null), 3);
            this.w = null;
            this.r = p;
            this.u = t;
            this.v = 1;
            w = t2.w(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                yzc yzcVar2 = this.t;
                TeamSeasonStatisticsResponse teamSeasonStatisticsResponse2 = this.s;
                y6a.M(obj);
                yzcVar = yzcVar2;
                teamSeasonStatisticsResponse = teamSeasonStatisticsResponse2;
                T = obj;
                SeasonStatisticsResponse seasonStatisticsResponse = (SeasonStatisticsResponse) T;
                if (seasonStatisticsResponse != null && (types = seasonStatisticsResponse.getTypes()) != null) {
                    num = new Integer(types.size());
                }
                if (yid.m(num) <= 1) {
                    z = false;
                }
                yzcVar.j(new z0j(teamSeasonStatisticsResponse, z));
                return Unit.a;
            }
            boolean z2 = this.u;
            av4 av4Var = this.r;
            y6a.M(obj);
            p = av4Var;
            t = z2;
            w = obj;
        }
        teamSeasonStatisticsResponse = (TeamSeasonStatisticsResponse) w;
        if (teamSeasonStatisticsResponse != null) {
            yzcVar = y0jVar.i;
            if (t) {
                if (p != null) {
                    this.w = null;
                    this.r = null;
                    this.s = teamSeasonStatisticsResponse;
                    this.t = yzcVar;
                    this.u = t;
                    this.v = 2;
                    T = p.T(this);
                }
                if (yid.m(num) <= 1) {
                }
            }
            yzcVar.j(new z0j(teamSeasonStatisticsResponse, z));
        }
        return Unit.a;
    }
}
