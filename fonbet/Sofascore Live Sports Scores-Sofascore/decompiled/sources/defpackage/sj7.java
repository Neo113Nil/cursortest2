package defpackage;

import com.sofascore.model.fantasy.FantasyLeagueConfig;
import com.sofascore.model.fantasy.FantasyRoundPlayerStatistics;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class sj7 extends hoi implements Function2 {
    public final /* synthetic */ boolean A;
    public av4 r;
    public Object s;
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ List w;
    public final /* synthetic */ tj7 x;
    public final /* synthetic */ int y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sj7(boolean z, List list, tj7 tj7Var, int i, int i2, boolean z2, rq3 rq3Var) {
        super(2, rq3Var);
        this.v = z;
        this.w = list;
        this.x = tj7Var;
        this.y = i;
        this.z = i2;
        this.A = z2;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        sj7 sj7Var = new sj7(this.v, this.w, this.x, this.y, this.z, this.A, rq3Var);
        sj7Var.u = obj;
        return sj7Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((sj7) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x005b, code lost:
    
        if (r13 == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ce A[RETURN] */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        av4 t;
        LinkedHashMap linkedHashMap;
        Map map;
        Map map2;
        ku3 ku3Var = (ku3) this.u;
        lu3 lu3Var = lu3.a;
        int i = this.t;
        tj7 tj7Var = this.x;
        if (i == 0) {
            y6a.M(obj);
            if (!this.v) {
                return this.w;
            }
            av4 t2 = xw3.t(ku3Var, null, new oj7(this.y, 4, null, tj7Var), 3);
            t = xw3.t(ku3Var, null, new oj7(this.z, 3, null, tj7Var), 3);
            this.u = null;
            this.r = t;
            this.t = 1;
            obj = t2.w(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Map map3 = (Map) this.s;
                y6a.M(obj);
                map2 = map3;
                FantasyLeagueConfig fantasyLeagueConfig = (FantasyLeagueConfig) obj;
                hs4 hs4Var = z45.a;
                rj7 rj7Var = new rj7(this.w, this.A, tj7Var, map2, fantasyLeagueConfig, null);
                this.u = null;
                this.r = null;
                this.s = null;
                this.t = 3;
                Object R = xw3.R(hs4Var, rj7Var, this);
                return R != lu3Var ? lu3Var : R;
            }
            t = this.r;
            y6a.M(obj);
        }
        List list = (List) obj;
        if (list != null) {
            int c = sub.c(k13.r(list, 10));
            if (c < 16) {
                c = 16;
            }
            linkedHashMap = new LinkedHashMap(c);
            for (Object obj2 : list) {
                linkedHashMap.put(new Integer(((FantasyRoundPlayerStatistics) obj2).getFantasyPlayerId()), obj2);
            }
        } else {
            linkedHashMap = null;
        }
        if (linkedHashMap == null) {
            map = lm5.a;
            map.getClass();
        } else {
            map = linkedHashMap;
        }
        this.u = null;
        this.r = null;
        this.s = map;
        this.t = 2;
        Object T = t.T(this);
        if (T != lu3Var) {
            map2 = map;
            obj = T;
            FantasyLeagueConfig fantasyLeagueConfig2 = (FantasyLeagueConfig) obj;
            hs4 hs4Var2 = z45.a;
            rj7 rj7Var2 = new rj7(this.w, this.A, tj7Var, map2, fantasyLeagueConfig2, null);
            this.u = null;
            this.r = null;
            this.s = null;
            this.t = 3;
            Object R2 = xw3.R(hs4Var2, rj7Var2, this);
            if (R2 != lu3Var) {
            }
        }
    }
}
