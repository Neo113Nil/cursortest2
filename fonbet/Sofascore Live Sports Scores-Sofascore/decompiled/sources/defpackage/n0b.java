package defpackage;

import com.sofascore.model.newNetwork.EventListResponse;
import com.sofascore.model.newNetwork.UniqueTournamentPlayerTransactionsResponse;
import com.sofascore.network.api.NetworkCoroutineAPI;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class n0b extends hoi implements Function1 {
    public final /* synthetic */ int r = 1;
    public int s;
    public final /* synthetic */ Integer t;
    public final /* synthetic */ w3b u;
    public final /* synthetic */ int v;
    public final /* synthetic */ String w;
    public final /* synthetic */ int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0b(Integer num, w3b w3bVar, String str, int i, int i2, rq3 rq3Var) {
        super(1, rq3Var);
        this.t = num;
        this.u = w3bVar;
        this.w = str;
        this.v = i;
        this.x = i2;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new n0b(this.t, this.u, this.w, this.v, this.x, rq3Var);
            default:
                return new n0b(this.t, this.u, this.v, this.w, this.x, rq3Var);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rq3 rq3Var = (rq3) obj;
        switch (this.r) {
        }
        return ((n0b) create(rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
    
        if (r0 == r11) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (r0 == r11) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0090, code lost:
    
        if (r0 != r4) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:?, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0082, code lost:
    
        if (r6 == r4) goto L38;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object uniqueTournamentTeamTransaction;
        Object uniqueTournamentPlayersTransaction;
        Object uniqueTournamentEvents;
        Object uniqueTournamentSeasonEvents;
        int i = this.r;
        int i2 = this.x;
        String str = this.w;
        int i3 = this.v;
        w3b w3bVar = this.u;
        Integer num = this.t;
        switch (i) {
            case 0:
                NetworkCoroutineAPI networkCoroutineAPI = w3bVar.b;
                lu3 lu3Var = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    if (num != null) {
                        int intValue = num.intValue();
                        this.s = 1;
                        uniqueTournamentTeamTransaction = networkCoroutineAPI.uniqueTournamentTeamTransaction(intValue, str, i3, this);
                        break;
                    }
                    this.s = 2;
                    uniqueTournamentPlayersTransaction = networkCoroutineAPI.uniqueTournamentPlayersTransaction(i2, str, i3, this);
                    break;
                } else {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        uniqueTournamentPlayersTransaction = obj;
                        return (UniqueTournamentPlayerTransactionsResponse) uniqueTournamentPlayersTransaction;
                    }
                    y6a.M(obj);
                    uniqueTournamentTeamTransaction = obj;
                }
                UniqueTournamentPlayerTransactionsResponse uniqueTournamentPlayerTransactionsResponse = (UniqueTournamentPlayerTransactionsResponse) uniqueTournamentTeamTransaction;
                if (uniqueTournamentPlayerTransactionsResponse != null) {
                    return uniqueTournamentPlayerTransactionsResponse;
                }
                this.s = 2;
                uniqueTournamentPlayersTransaction = networkCoroutineAPI.uniqueTournamentPlayersTransaction(i2, str, i3, this);
            default:
                lu3 lu3Var2 = lu3.a;
                int i5 = this.s;
                if (i5 != 0) {
                    if (i5 == 1) {
                        y6a.M(obj);
                        uniqueTournamentSeasonEvents = obj;
                        return (EventListResponse) uniqueTournamentSeasonEvents;
                    }
                    if (i5 != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    uniqueTournamentEvents = obj;
                    return (EventListResponse) uniqueTournamentEvents;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI2 = w3bVar.b;
                if (num == null) {
                    this.s = 2;
                    uniqueTournamentEvents = networkCoroutineAPI2.uniqueTournamentEvents(i3, str, i2, this);
                    break;
                } else {
                    int intValue2 = num.intValue();
                    this.s = 1;
                    uniqueTournamentSeasonEvents = networkCoroutineAPI2.uniqueTournamentSeasonEvents(this.v, intValue2, this.w, this.x, this);
                    break;
                }
                return lu3Var2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0b(Integer num, w3b w3bVar, int i, String str, int i2, rq3 rq3Var) {
        super(1, rq3Var);
        this.t = num;
        this.u = w3bVar;
        this.v = i;
        this.w = str;
        this.x = i2;
    }
}
