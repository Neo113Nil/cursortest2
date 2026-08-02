package defpackage;

import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.newNetwork.SeasonStatisticsResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class foj extends hoi implements Function2 {
    public int r;
    public final /* synthetic */ boj s;
    public final /* synthetic */ koj t;
    public final /* synthetic */ int u;
    public final /* synthetic */ int v;
    public final /* synthetic */ String w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public foj(boj bojVar, koj kojVar, int i, int i2, String str, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = bojVar;
        this.t = kojVar;
        this.u = i;
        this.v = i2;
        this.w = str;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new foj(this.s, this.t, this.u, this.v, this.w, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((foj) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0038, code lost:
    
        if (r8 == r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0048, code lost:
    
        if (r8 == r1) goto L22;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        SeasonStatisticsResponse seasonStatisticsResponse;
        List<String> types;
        w3b w3bVar = this.t.l;
        lu3 lu3Var = lu3.a;
        int i = this.r;
        if (i == 0) {
            y6a.M(obj);
            int ordinal = this.s.ordinal();
            int i2 = this.v;
            int i3 = this.u;
            if (ordinal == 0 || ordinal == 1) {
                this.r = 1;
                obj = w3bVar.l0(i3, i2, this);
            } else {
                if (ordinal != 2) {
                    zzl.b();
                    return null;
                }
                this.r = 2;
                obj = w3bVar.o0(i3, i2, this);
            }
            return lu3Var;
        }
        if (i == 1) {
            y6a.M(obj);
            seasonStatisticsResponse = (SeasonStatisticsResponse) obj;
        } else {
            if (i != 2) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
            seasonStatisticsResponse = (SeasonStatisticsResponse) obj;
        }
        if (Intrinsics.c(this.w, Sports.TENNIS)) {
            if (seasonStatisticsResponse != null && (types = seasonStatisticsResponse.getTypes()) != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : types) {
                    if (Intrinsics.c((String) obj2, Season.SubSeasonType.MAIN_DRAW.getLabel())) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
            }
        } else if (seasonStatisticsResponse != null) {
            return seasonStatisticsResponse.getTypes();
        }
        return null;
    }
}
