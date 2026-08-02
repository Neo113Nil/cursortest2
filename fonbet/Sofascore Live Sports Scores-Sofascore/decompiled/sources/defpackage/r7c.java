package defpackage;

import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.newNetwork.EventGraphResponse;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class r7c extends hoi implements Function2 {
    public final /* synthetic */ int r = 0;
    public int s;
    public final /* synthetic */ u8c t;
    public final /* synthetic */ Event u;
    public final /* synthetic */ String v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7c(u8c u8cVar, Event event, String str, rq3 rq3Var) {
        super(2, rq3Var);
        this.t = u8cVar;
        this.u = event;
        this.v = str;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        String str = this.v;
        Event event = this.u;
        u8c u8cVar = this.t;
        switch (i) {
            case 0:
                return new r7c(str, u8cVar, event, rq3Var);
            default:
                return new r7c(u8cVar, event, str, rq3Var);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((r7c) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0065, code lost:
    
        if (r10 == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007a, code lost:
    
        if (r10 == r0) goto L28;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        String str = this.v;
        Event event = this.u;
        u8c u8cVar = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 != 0) {
                    if (i2 == 1) {
                        y6a.M(obj);
                        return (EventGraphResponse) obj;
                    }
                    if (i2 == 2) {
                        y6a.M(obj);
                        return (EventGraphResponse) obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                boolean equals = str.equals(Sports.AMERICAN_FOOTBALL);
                s96 s96Var = u8cVar.c;
                if (!equals) {
                    int id = event.getId();
                    boolean shouldReverseTeams = event.shouldReverseTeams();
                    this.s = 2;
                    obj = s96Var.k(id, str, shouldReverseTeams, this);
                    break;
                } else {
                    int id2 = event.getId();
                    boolean shouldReverseTeams2 = event.shouldReverseTeams();
                    this.s = 1;
                    obj = s96Var.D(id2, shouldReverseTeams2, this);
                    break;
                }
                return lu3Var;
            default:
                lu3 lu3Var2 = lu3.a;
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
                s96 s96Var2 = u8cVar.c;
                int id3 = event.getId();
                this.s = 1;
                Serializable m = s96Var2.m(id3, str, this);
                return m == lu3Var2 ? lu3Var2 : m;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7c(String str, u8c u8cVar, Event event, rq3 rq3Var) {
        super(2, rq3Var);
        this.v = str;
        this.t = u8cVar;
        this.u = event;
    }
}
