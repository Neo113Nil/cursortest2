package defpackage;

import com.sofascore.model.newNetwork.EventListResponse;
import com.sofascore.network.api.NetworkCoroutineAPI;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class jzi extends hoi implements Function1 {
    public int r;
    public final /* synthetic */ yyi s;
    public final /* synthetic */ j0j t;
    public final /* synthetic */ int u;
    public final /* synthetic */ String v;
    public final /* synthetic */ int w;
    public final /* synthetic */ Integer x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jzi(yyi yyiVar, j0j j0jVar, int i, String str, int i2, Integer num, rq3 rq3Var) {
        super(1, rq3Var);
        this.s = yyiVar;
        this.t = j0jVar;
        this.u = i;
        this.v = str;
        this.w = i2;
        this.x = num;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new jzi(this.s, this.t, this.u, this.v, this.w, this.x, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((jzi) create((rq3) obj)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004a, code lost:
    
        if (r14 == r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0068, code lost:
    
        if (r14 == r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007a, code lost:
    
        if (r14 == r0) goto L33;
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
                return (EventListResponse) obj;
            }
            if (i == 2) {
                y6a.M(obj);
                return (EventListResponse) obj;
            }
            if (i == 3) {
                y6a.M(obj);
                return (EventListResponse) obj;
            }
            a70.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        y6a.M(obj);
        yyi yyiVar = this.s;
        int ordinal = yyiVar.ordinal();
        j0j j0jVar = this.t;
        if (ordinal == 0) {
            NetworkCoroutineAPI networkCoroutineAPI = j0jVar.b;
            Integer num = this.x;
            if (num != null) {
                int intValue = num.intValue();
                this.r = 2;
                obj = networkCoroutineAPI.getTeamEventListForTournament(this.u, intValue, this.v, this.w, this);
            } else {
                this.r = 3;
                obj = networkCoroutineAPI.getTeamEventList(this.u, this.v, this.w, this);
            }
        } else {
            if (ordinal != 1 && ordinal != 2) {
                zzl.b();
                return null;
            }
            NetworkCoroutineAPI networkCoroutineAPI2 = j0jVar.b;
            String str = yyiVar.a;
            this.r = 1;
            obj = networkCoroutineAPI2.getTeamEventList(this.u, str, this.v, this.w, this);
        }
        return lu3Var;
    }
}
