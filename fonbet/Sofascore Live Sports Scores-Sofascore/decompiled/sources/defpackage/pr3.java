package defpackage;

import com.sofascore.model.crowdsourcing.CrowdsourcingSuggestRequest;
import com.sofascore.model.crowdsourcing.EventSuggestRequest;
import com.sofascore.model.crowdsourcing.SuggestStatus;
import com.sofascore.model.mvvm.model.Event;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class pr3 extends hoi implements Function2 {
    public h38 r;
    public EventSuggestRequest.FinalScoreSuggest s;
    public int t;
    public int u;
    public final /* synthetic */ tr3 v;
    public final /* synthetic */ boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pr3(tr3 tr3Var, boolean z, rq3 rq3Var) {
        super(2, rq3Var);
        this.v = tr3Var;
        this.w = z;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new pr3(this.v, this.w, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((pr3) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x014b, code lost:
    
        if (r1.emit(r2, r17) == r3) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x007c, code lost:
    
        if (r1.emit(defpackage.b34.a, r17) == r3) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x008d, code lost:
    
        if (r8 != r3) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0064, code lost:
    
        if (r10 == r3) goto L56;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x011c  */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v7, types: [int] */
    /* JADX WARN: Type inference failed for: r9v8 */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        h38 h38Var;
        Object o;
        Object y;
        Object P;
        EventSuggestRequest.FinalScoreSuggest finalScoreSuggest;
        ?? r9;
        x2g x2gVar;
        tr3 tr3Var = this.v;
        fdi fdiVar = tr3Var.n;
        lu3 lu3Var = lu3.a;
        int i = this.u;
        rq3 rq3Var = null;
        if (i == 0) {
            y6a.M(obj);
            h38Var = (h38) fdiVar.getValue();
            if (!(h38Var instanceof f38)) {
                return Unit.a;
            }
            if (this.w) {
                this.r = h38Var;
                this.u = 1;
                o = tr3Var.o(this);
            }
            aeh aehVar = tr3Var.k;
            this.r = h38Var;
            this.u = 3;
            y = rd0.y(aehVar, this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    y6a.M(obj);
                    return Unit.a;
                }
                if (i == 3) {
                    h38Var = this.r;
                    y6a.M(obj);
                    y = obj;
                    Event event = (Event) y;
                    f38 f38Var = (f38) h38Var;
                    boolean c = f38Var.a ? false : Intrinsics.c(f38Var.f, Boolean.TRUE);
                    EventSuggestRequest.FinalScoreSuggest finalScoreSuggest2 = new EventSuggestRequest.FinalScoreSuggest(c ? f38Var.b : yid.m(StringsKt.toIntOrNull(f38Var.d.c().c.toString())), c ? f38Var.c : yid.m(StringsKt.toIntOrNull(f38Var.e.c().c.toString())));
                    nv.v(tr3Var.i(), event.getId(), event.getStatus().getType());
                    e64 e64Var = tr3Var.e;
                    int id = event.getId();
                    CrowdsourcingSuggestRequest crowdsourcingSuggestRequest = new CrowdsourcingSuggestRequest(a.c(finalScoreSuggest2));
                    this.r = null;
                    this.s = finalScoreSuggest2;
                    this.t = c ? 1 : 0;
                    this.u = 4;
                    e64Var.getClass();
                    P = yaa.P(new c64(e64Var, id, crowdsourcingSuggestRequest, rq3Var, 6), this);
                    if (P != lu3Var) {
                        finalScoreSuggest = finalScoreSuggest2;
                        r9 = c;
                        x2gVar = (x2g) P;
                        if (!(x2gVar instanceof t2g)) {
                        }
                        return Unit.a;
                    }
                    return lu3Var;
                }
                if (i != 4) {
                    if (i == 5) {
                        y6a.M(obj);
                        return Unit.a;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i2 = this.t;
                finalScoreSuggest = this.s;
                y6a.M(obj);
                r9 = i2;
                P = obj;
                x2gVar = (x2g) P;
                if (!(x2gVar instanceof t2g)) {
                    if (!(x2gVar instanceof v2g)) {
                        zzl.b();
                        return null;
                    }
                    g38 g38Var = new g38(finalScoreSuggest.getHomeScoreSuggest(), finalScoreSuggest.getAwayScoreSuggest(), SuggestStatus.SUBMITTED);
                    fdiVar.getClass();
                    fdiVar.m(null, g38Var);
                    aeh aehVar2 = tr3Var.i;
                    omh omhVar = omh.e;
                    this.r = null;
                    this.s = null;
                    this.t = r9;
                    this.u = 5;
                }
                return Unit.a;
            }
            h38Var = this.r;
            y6a.M(obj);
            o = obj;
        }
        if (((Boolean) o).booleanValue()) {
            aeh aehVar3 = tr3Var.g;
            this.r = null;
            this.u = 2;
        }
        aeh aehVar4 = tr3Var.k;
        this.r = h38Var;
        this.u = 3;
        y = rd0.y(aehVar4, this);
    }
}
