package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class enb extends hoi implements Function1 {
    public int r;
    public int s;
    public final /* synthetic */ obm t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public enb(obm obmVar, rq3 rq3Var) {
        super(1, rq3Var);
        this.t = obmVar;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new enb(this.t, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new enb(this.t, (rq3) obj).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0043, code lost:
    
        if (r6.D(r1, r5) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0036, code lost:
    
        if (r6.A(r1, r5) == r0) goto L19;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int currentItem;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        obm obmVar = this.t;
        if (i == 0) {
            y6a.M(obj);
            currentItem = obmVar.q.e.getCurrentItem();
            urm urmVar = obmVar.r;
            if (urmVar != null) {
                this.r = currentItem;
                this.s = 1;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    y6a.M(obj);
                    return Unit.a;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            currentItem = this.r;
            y6a.M(obj);
        }
        urm urmVar2 = obmVar.r;
        if (urmVar2 != null) {
            this.s = 2;
        }
        return Unit.a;
    }
}
