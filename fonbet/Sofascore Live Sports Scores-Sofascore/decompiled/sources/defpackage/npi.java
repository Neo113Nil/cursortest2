package defpackage;

import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.network.response.EventResponse;
import com.sofascore.model.newNetwork.StageResponse;
import com.sofascore.model.newNetwork.UniqueTournamentResponse;
import com.sofascore.results.service.SyncWorker;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class npi extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ SyncWorker t;
    public final /* synthetic */ int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ npi(SyncWorker syncWorker, int i, rq3 rq3Var, int i2) {
        super(2, rq3Var);
        this.r = i2;
        this.t = syncWorker;
        this.u = i;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        int i2 = this.u;
        SyncWorker syncWorker = this.t;
        switch (i) {
            case 0:
                return new npi(syncWorker, i2, rq3Var, 0);
            case 1:
                return new npi(syncWorker, i2, rq3Var, 1);
            case 2:
                return new npi(syncWorker, i2, rq3Var, 2);
            case 3:
                return new npi(syncWorker, i2, rq3Var, 3);
            case 4:
                return new npi(syncWorker, i2, rq3Var, 4);
            case 5:
                return new npi(syncWorker, i2, rq3Var, 5);
            case 6:
                return new npi(syncWorker, i2, rq3Var, 6);
            default:
                return new npi(syncWorker, i2, rq3Var, 7);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((npi) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x00d6, code lost:
    
        if (r10 == r3) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00b4, code lost:
    
        if (r10 == r3) goto L62;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Stage stage;
        int i = this.r;
        int i2 = this.u;
        SyncWorker syncWorker = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i3 = this.s;
                if (i3 != 0) {
                    if (i3 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                wi7 wi7Var = syncWorker.k;
                this.s = 1;
                Object d0 = wi7Var.d0(i2, this);
                return d0 == lu3Var ? lu3Var : d0;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    s96 s96Var = syncWorker.f;
                    this.s = 1;
                    obj = s96Var.d(i2, this);
                    if (obj == lu3Var2) {
                        return lu3Var2;
                    }
                } else {
                    if (i4 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                EventResponse eventResponse = (EventResponse) yaa.x((x2g) obj);
                Event event = eventResponse != null ? eventResponse.getEvent() : null;
                if (event == null) {
                    return event;
                }
                event.setMute(new Integer(0));
                return event;
            case 2:
                lu3 lu3Var3 = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    s96 s96Var2 = syncWorker.f;
                    this.s = 1;
                    obj = s96Var2.d(i2, this);
                    if (obj == lu3Var3) {
                        return lu3Var3;
                    }
                } else {
                    if (i5 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                EventResponse eventResponse2 = (EventResponse) yaa.x((x2g) obj);
                if (eventResponse2 != null) {
                    return eventResponse2.getEvent();
                }
                return null;
            case 3:
                s96 s96Var3 = syncWorker.f;
                lu3 lu3Var4 = lu3.a;
                int i6 = this.s;
                if (i6 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    obj = s96Var3.y(i2, this);
                    break;
                } else {
                    if (i6 != 1) {
                        if (i6 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        Stage stage2 = (Stage) obj;
                        if (stage2 == null) {
                            return null;
                        }
                        joa joaVar = l5i.a;
                        l5i.l(stage2);
                        stage2.setMuted(true);
                        return stage2;
                    }
                    y6a.M(obj);
                }
                StageResponse stageResponse = (StageResponse) obj;
                if (stageResponse != null && (stage = stageResponse.getStage()) != null && CollectionsKt.R(l5i.a(), stage.getType())) {
                    this.s = 2;
                    obj = s96Var3.a(stage, false, this);
                    break;
                } else {
                    return null;
                }
            case 4:
                lu3 lu3Var5 = lu3.a;
                int i7 = this.s;
                if (i7 == 0) {
                    y6a.M(obj);
                    w3b w3bVar = syncWorker.d;
                    this.s = 1;
                    obj = w3bVar.q0(i2, this);
                    if (obj == lu3Var5) {
                        return lu3Var5;
                    }
                } else {
                    if (i7 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                UniqueTournamentResponse uniqueTournamentResponse = (UniqueTournamentResponse) obj;
                if (uniqueTournamentResponse != null) {
                    return uniqueTournamentResponse.getUniqueTournament();
                }
                return null;
            case 5:
                lu3 lu3Var6 = lu3.a;
                int i8 = this.s;
                if (i8 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Serializable e = syncWorker.e(i2, this);
                    return e == lu3Var6 ? lu3Var6 : e;
                }
                if (i8 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 6:
                lu3 lu3Var7 = lu3.a;
                int i9 = this.s;
                if (i9 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Serializable e2 = syncWorker.e(i2, this);
                    return e2 == lu3Var7 ? lu3Var7 : e2;
                }
                if (i9 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                lu3 lu3Var8 = lu3.a;
                int i10 = this.s;
                if (i10 != 0) {
                    if (i10 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                wi7 wi7Var2 = syncWorker.k;
                this.s = 1;
                Object c = wi7Var2.c(i2, this);
                return c == lu3Var8 ? lu3Var8 : c;
        }
    }
}
