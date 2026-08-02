package defpackage;

import com.sofascore.model.newNetwork.EventListResponse;
import com.sofascore.network.api.NetworkCoroutineAPI;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class h3b extends hoi implements Function1 {
    public int r;
    public final /* synthetic */ String s;
    public final /* synthetic */ String t;
    public final /* synthetic */ w3b u;
    public final /* synthetic */ int v;
    public final /* synthetic */ int w;
    public final /* synthetic */ int x;
    public final /* synthetic */ String y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3b(String str, String str2, w3b w3bVar, int i, int i2, int i3, String str3, int i4, rq3 rq3Var) {
        super(1, rq3Var);
        this.s = str;
        this.t = str2;
        this.u = w3bVar;
        this.v = i;
        this.w = i2;
        this.x = i3;
        this.y = str3;
        this.z = i4;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new h3b(this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((h3b) create((rq3) obj)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        if (r0 == r9) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006e, code lost:
    
        if (r0 == r9) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0089, code lost:
    
        if (r0 == r9) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a0, code lost:
    
        if (r0 == r9) goto L38;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object uniqueTournamentRoundEvents;
        Object uniqueTournamentRoundEventsPrefix;
        Object uniqueTournamentRoundEvents2;
        Object uniqueTournamentRoundEvents3;
        lu3 lu3Var = lu3.a;
        int i = this.r;
        if (i != 0) {
            if (i == 1) {
                y6a.M(obj);
                uniqueTournamentRoundEvents3 = obj;
                return (EventListResponse) uniqueTournamentRoundEvents3;
            }
            if (i == 2) {
                y6a.M(obj);
                uniqueTournamentRoundEvents2 = obj;
                return (EventListResponse) uniqueTournamentRoundEvents2;
            }
            if (i == 3) {
                y6a.M(obj);
                uniqueTournamentRoundEventsPrefix = obj;
                return (EventListResponse) uniqueTournamentRoundEventsPrefix;
            }
            if (i != 4) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
            uniqueTournamentRoundEvents = obj;
            return (EventListResponse) uniqueTournamentRoundEvents;
        }
        y6a.M(obj);
        String str = this.t;
        w3b w3bVar = this.u;
        String str2 = this.s;
        if (str2 != null && str != null) {
            NetworkCoroutineAPI networkCoroutineAPI = w3bVar.b;
            this.r = 1;
            uniqueTournamentRoundEvents3 = networkCoroutineAPI.uniqueTournamentRoundEvents(this.v, this.w, this.x, str2, str, this.y, this.z, this);
        } else if (str2 != null) {
            NetworkCoroutineAPI networkCoroutineAPI2 = w3bVar.b;
            this.r = 2;
            uniqueTournamentRoundEvents2 = networkCoroutineAPI2.uniqueTournamentRoundEvents(this.v, this.w, this.x, str2, this.y, this.z, this);
        } else {
            NetworkCoroutineAPI networkCoroutineAPI3 = w3bVar.b;
            if (str != null) {
                this.r = 3;
                uniqueTournamentRoundEventsPrefix = networkCoroutineAPI3.uniqueTournamentRoundEventsPrefix(this.v, this.w, this.x, str, this.y, this.z, this);
            } else {
                this.r = 4;
                uniqueTournamentRoundEvents = networkCoroutineAPI3.uniqueTournamentRoundEvents(this.v, this.w, this.x, this.y, this.z, this);
            }
        }
        return lu3Var;
    }
}
