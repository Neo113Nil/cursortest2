package defpackage;

import com.sofascore.model.crowdsourcing.CrowdsourcingSuggestRequest;
import com.sofascore.model.crowdsourcing.EventSuggestRequest;
import com.sofascore.model.crowdsourcing.SuggestStatus;
import com.sofascore.model.mvvm.model.Event;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class sr3 extends hoi implements Function2 {
    public dci r;
    public EventSuggestRequest.StartDateSuggest s;
    public int t;
    public final /* synthetic */ tr3 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sr3(tr3 tr3Var, rq3 rq3Var) {
        super(2, rq3Var);
        this.u = tr3Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new sr3(this.u, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((sr3) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00d1, code lost:
    
        if (r15.emit(r0, r14) == r2) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x004b, code lost:
    
        if (r15 == r2) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a8  */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        EventSuggestRequest.StartDateSuggest startDateSuggest;
        x2g x2gVar;
        tr3 tr3Var = this.u;
        fdi fdiVar = tr3Var.m;
        lu3 lu3Var = lu3.a;
        int i = this.t;
        rq3 rq3Var = null;
        if (i == 0) {
            y6a.M(obj);
            obj2 = (fci) fdiVar.getValue();
            if (!(obj2 instanceof dci)) {
                return Unit.a;
            }
            aeh aehVar = tr3Var.k;
            this.r = (dci) obj2;
            this.t = 1;
            obj = rd0.y(aehVar, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        y6a.M(obj);
                        return Unit.a;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                startDateSuggest = this.s;
                y6a.M(obj);
                x2gVar = (x2g) obj;
                if (!(x2gVar instanceof t2g)) {
                    if (!(x2gVar instanceof v2g)) {
                        zzl.b();
                        return null;
                    }
                    eci eciVar = new eci(startDateSuggest.getStartDateSuggest(), SuggestStatus.SUBMITTED);
                    fdiVar.getClass();
                    fdiVar.m(null, eciVar);
                    aeh aehVar2 = tr3Var.i;
                    omh omhVar = omh.e;
                    this.r = null;
                    this.s = null;
                    this.t = 3;
                }
                return Unit.a;
            }
            obj2 = this.r;
            y6a.M(obj);
        }
        Event event = (Event) obj;
        dci dciVar = (dci) obj2;
        EventSuggestRequest.StartDateSuggest startDateSuggest2 = new EventSuggestRequest.StartDateSuggest(Intrinsics.c(dciVar.a, Boolean.FALSE) ? dciVar.c : event.getStartTimestamp());
        nv.v(tr3Var.i(), event.getId(), event.getStatus().getType());
        e64 e64Var = tr3Var.e;
        int id = event.getId();
        CrowdsourcingSuggestRequest crowdsourcingSuggestRequest = new CrowdsourcingSuggestRequest(a.c(startDateSuggest2));
        this.r = null;
        this.s = startDateSuggest2;
        this.t = 2;
        e64Var.getClass();
        obj = yaa.P(new c64(e64Var, id, crowdsourcingSuggestRequest, rq3Var, 6), this);
        if (obj != lu3Var) {
            startDateSuggest = startDateSuggest2;
            x2gVar = (x2g) obj;
            if (!(x2gVar instanceof t2g)) {
            }
            return Unit.a;
        }
        return lu3Var;
    }
}
