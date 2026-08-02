package defpackage;

import com.sofascore.model.crowdsourcing.CrowdsourcingSuggestRequest;
import com.sofascore.model.crowdsourcing.EventSuggestRequest;
import com.sofascore.model.crowdsourcing.SuggestStatus;
import com.sofascore.model.mvvm.model.Event;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class qr3 extends hoi implements Function2 {
    public svb r;
    public EventSuggestRequest s;
    public boolean t;
    public int u;
    public final /* synthetic */ tr3 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qr3(tr3 tr3Var, rq3 rq3Var) {
        super(2, rq3Var);
        this.v = tr3Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new qr3(this.v, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((qr3) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x012c, code lost:
    
        if (r15.emit(r2, r14) == r0) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d6  */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean booleanValue;
        svb svbVar;
        EventSuggestRequest eventSuggestRequest;
        x2g x2gVar;
        lu3 lu3Var = lu3.a;
        int i = this.u;
        tr3 tr3Var = this.v;
        if (i == 0) {
            y6a.M(obj);
            svb svbVar2 = (svb) tr3Var.o.getValue();
            if (svbVar2 == null) {
                return Unit.a;
            }
            Boolean bool = svbVar2.a;
            if (bool == null) {
                return Unit.a;
            }
            booleanValue = bool.booleanValue();
            aeh aehVar = tr3Var.k;
            this.r = svbVar2;
            this.t = booleanValue;
            this.u = 1;
            Object y = rd0.y(aehVar, this);
            if (y != lu3Var) {
                svbVar = svbVar2;
                obj = y;
            }
            return lu3Var;
        }
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    y6a.M(obj);
                    return Unit.a;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            booleanValue = this.t;
            eventSuggestRequest = this.s;
            y6a.M(obj);
            x2gVar = (x2g) obj;
            if (!(x2gVar instanceof t2g)) {
                if (!(x2gVar instanceof v2g)) {
                    zzl.b();
                    return null;
                }
                if (eventSuggestRequest instanceof EventSuggestRequest.FinalScoreSuggest) {
                    fdi fdiVar = tr3Var.n;
                    EventSuggestRequest.FinalScoreSuggest finalScoreSuggest = (EventSuggestRequest.FinalScoreSuggest) eventSuggestRequest;
                    g38 g38Var = new g38(finalScoreSuggest.getHomeScoreSuggest(), finalScoreSuggest.getAwayScoreSuggest(), SuggestStatus.SUBMITTED);
                    fdiVar.getClass();
                    fdiVar.m(null, g38Var);
                } else if (eventSuggestRequest instanceof EventSuggestRequest.StartDateSuggest) {
                    fdi fdiVar2 = tr3Var.m;
                    eci eciVar = new eci(((EventSuggestRequest.StartDateSuggest) eventSuggestRequest).getStartDateSuggest(), SuggestStatus.SUBMITTED);
                    fdiVar2.getClass();
                    fdiVar2.m(null, eciVar);
                }
                tr3Var.o.l(null);
                aeh aehVar2 = tr3Var.i;
                omh omhVar = omh.e;
                this.r = null;
                this.s = null;
                this.t = booleanValue;
                this.u = 3;
            }
            return Unit.a;
        }
        booleanValue = this.t;
        svbVar = this.r;
        y6a.M(obj);
        Event event = (Event) obj;
        EventSuggestRequest finalScoreSuggest2 = booleanValue ? new EventSuggestRequest.FinalScoreSuggest(yid.m(StringsKt.toIntOrNull(svbVar.b.c().c.toString())), yid.m(StringsKt.toIntOrNull(svbVar.c.c().c.toString()))) : new EventSuggestRequest.StartDateSuggest(svbVar.e);
        nv.v(tr3Var.i(), event.getId(), event.getStatus().getType());
        e64 e64Var = tr3Var.e;
        int id = event.getId();
        CrowdsourcingSuggestRequest crowdsourcingSuggestRequest = new CrowdsourcingSuggestRequest(a.c(finalScoreSuggest2));
        this.r = null;
        this.s = finalScoreSuggest2;
        this.t = booleanValue;
        this.u = 2;
        e64Var.getClass();
        obj = yaa.P(new c64(e64Var, id, crowdsourcingSuggestRequest, (rq3) null, 6), this);
        if (obj != lu3Var) {
            eventSuggestRequest = finalScoreSuggest2;
            x2gVar = (x2g) obj;
            if (!(x2gVar instanceof t2g)) {
            }
            return Unit.a;
        }
        return lu3Var;
    }
}
