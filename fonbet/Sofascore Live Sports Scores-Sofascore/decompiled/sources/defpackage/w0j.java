package defpackage;

import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.newNetwork.statistics.season.team.TeamSeasonStatisticsResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class w0j extends hoi implements Function2 {
    public int r;
    public final /* synthetic */ String s;
    public final /* synthetic */ y0j t;
    public final /* synthetic */ int u;
    public final /* synthetic */ int v;
    public final /* synthetic */ int w;
    public final /* synthetic */ String x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0j(String str, y0j y0jVar, int i, int i2, int i3, String str2, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = str;
        this.t = y0jVar;
        this.u = i;
        this.v = i2;
        this.w = i3;
        this.x = str2;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new w0j(this.s, this.t, this.u, this.v, this.w, this.x, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((w0j) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        if (r11 == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
    
        if (r11 == r0) goto L19;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.r;
        if (i != 0) {
            if (i == 1) {
                y6a.M(obj);
                return (TeamSeasonStatisticsResponse) obj;
            }
            if (i == 2) {
                y6a.M(obj);
                return (TeamSeasonStatisticsResponse) obj;
            }
            a70.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        y6a.M(obj);
        boolean c = Intrinsics.c(this.s, Sports.BASKETBALL);
        y0j y0jVar = this.t;
        if (c) {
            j0j j0jVar = y0jVar.e;
            this.r = 1;
            obj = j0jVar.i(this.u, this.v, this.w, this, this.x);
        } else {
            j0j j0jVar2 = y0jVar.e;
            String label = Season.SubSeasonType.OVERALL.getLabel();
            this.r = 2;
            obj = j0jVar2.q(this.u, this.v, this.w, label, this.s, this);
        }
        return lu3Var;
    }
}
